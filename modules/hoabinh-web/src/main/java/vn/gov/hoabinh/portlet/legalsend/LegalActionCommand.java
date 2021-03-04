package vn.gov.hoabinh.portlet.legalsend;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.captcha.CaptchaException;
import com.liferay.portal.kernel.captcha.CaptchaUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.gov.hoabinh.model.FAQQuestion;
import vn.gov.hoabinh.model.VLegalSuggestDocument;
import vn.gov.hoabinh.service.AttachmentLocalServiceUtil;
import vn.gov.hoabinh.service.VLegalSuggestDocumentLocalService;
import vn.gov.hoabinh.util.PortalConstant;
import vn.gov.hoabinh.util.UploadFileUtils;

@Component(
	property = { 
		"javax.portlet.name=vn_gov_hoabinh_portlet_legalsend_LegalSendPortlet",
		"mvc.command.name=add_sugguest" }, 
	service = MVCActionCommand.class)
public class LegalActionCommand extends BaseMVCActionCommand {

	private VLegalSuggestDocumentLocalService legalSuggestDocumentLocalService;

	@Reference(unbind = "-")
	public void setLegalSuggestDocumentLocalService(VLegalSuggestDocumentLocalService legalSuggestDocumentLocalService) {
		this.legalSuggestDocumentLocalService = legalSuggestDocumentLocalService;
	}
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(FAQQuestion.class.getName(), actionRequest);
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		long groupId = serviceContext.getScopeGroupId();
		String language = PortalConstant.DEFAULT_LANGUAGE;
		long companyId = serviceContext.getCompanyId();
		
		String title = ParamUtil.getString(actionRequest, "title");
		String visitorName = ParamUtil.getString(actionRequest, "visitorName");
		String visitorEmail = ParamUtil.getString(actionRequest, "visitorEmail");
		String visitorTel = ParamUtil.getString(actionRequest, "visitorTel");
		String visitorAddress = ParamUtil.getString(actionRequest, "visitorAddress");
		String content = ParamUtil.getString(actionRequest, "content");
		String draftId = ParamUtil.getString(actionRequest, "draftId");
		boolean hasAttachment = false;
		long userId = serviceContext.getUserId();
		
		try {
			boolean checkCaptcha = validateCaptcha(actionRequest, actionResponse);
			if (checkCaptcha) {
				VLegalSuggestDocument suggestDocument = legalSuggestDocumentLocalService.addSuggestion(title, content, language, 
						visitorName, visitorEmail, visitorTel, visitorAddress, groupId, draftId, hasAttachment, companyId, userId);
				
				String sugguestId = suggestDocument.getSugId();
				
				// Process attachment
				List<FileEntry> listFiles = UploadFileUtils.upload(uploadRequest, actionRequest, 0, userId, "attachment");
				if (Validator.isNotNull(listFiles) && listFiles.size() > 0) {
					for (FileEntry fileEntry : listFiles) {
						AttachmentLocalServiceUtil.addAttachment(fileEntry, companyId, groupId, Long.parseLong(suggestDocument.getSugId()),
								VLegalSuggestDocument.class, fileEntry.getFolderId(), fileEntry.getFileName(), false);
					}
					
					if (listFiles.size()>0 && Validator.isNotNull(listFiles)) {
						suggestDocument = legalSuggestDocumentLocalService.getSuggestion(sugguestId);
						suggestDocument.setHasAttachment(true);
						legalSuggestDocumentLocalService.updateSuggestion(suggestDocument);
					}
				}
				sendRedirect(actionRequest, actionResponse);
				actionResponse.setRenderParameter("contact", visitorName);
				actionResponse.setRenderParameter("jspPage", "/legalsend/success.jsp");
				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			}
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, e.getClass().getName());
			actionResponse.setRenderParameter("mvcPath", "/legalsend/view.jsp");
		}
	}

	@ProcessAction(name = "validateCaptcha")
    public boolean validateCaptcha(ActionRequest actionRequest,
            ActionResponse actionResponse) throws IOException, PortletException {
		boolean retval = true;
        try {
            CaptchaUtil.check(actionRequest);
        } catch (CaptchaException e) {
        	retval = false;
            SessionErrors.add(actionRequest, "portlet.common.captcha.invalid");
            actionResponse.setRenderParameter("jspPage","/legalsend/view.jsp");
        }
        return retval;
    }
}
