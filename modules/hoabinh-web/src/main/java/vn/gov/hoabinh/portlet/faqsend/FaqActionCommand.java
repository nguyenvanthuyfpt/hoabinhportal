package vn.gov.hoabinh.portlet.faqsend;

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
import vn.gov.hoabinh.service.AttachmentLocalServiceUtil;
import vn.gov.hoabinh.service.FAQQuestionLocalService;
import vn.gov.hoabinh.util.UploadFileUtils;

@Component(
	property = { 
		"javax.portlet.name=vn_gov_hoabinh_portlet_faqsend_FaqSendPortlet",
		"mvc.command.name=add_question" }, 
	service = MVCActionCommand.class)
public class FaqActionCommand extends BaseMVCActionCommand {

	private FAQQuestionLocalService faqQuestionService;

	@Reference(unbind = "-")
	public void setFaqQuestionService(FAQQuestionLocalService faqQuestionService) {
		this.faqQuestionService = faqQuestionService;
	}

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(FAQQuestion.class.getName(), actionRequest);
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		String questionType = ParamUtil.getString(actionRequest, "questionType");
		long categoryId = ParamUtil.getLong(actionRequest, "categoryId", 0);
		String title = ParamUtil.getString(actionRequest, "title");
		String content = ParamUtil.getString(actionRequest, "content");
		String sentByUser = ParamUtil.getString(actionRequest, "sentByUser");
		String senderEmail = ParamUtil.getString(actionRequest, "email");
		long userId = serviceContext.getUserId();
		
		try {
			boolean checkCaptcha = validateCaptcha(actionRequest, actionResponse);
			if (checkCaptcha) {
				FAQQuestion question = faqQuestionService.addQuestion(groupId, serviceContext.getLanguageId(), title, content, sentByUser,
						senderEmail, questionType, categoryId, 0, 0, false, userId);
				
				// Process attachment				
				List<FileEntry> listFiles = UploadFileUtils.upload(uploadRequest, actionRequest, 0, userId, "attachment");
				if (Validator.isNotNull(listFiles) && listFiles.size() > 0) {
					for (FileEntry fileEntry : listFiles) {
						AttachmentLocalServiceUtil.addAttachment(fileEntry, companyId, groupId, question.getId(), 
								FAQQuestion.class, fileEntry.getFolderId(), fileEntry.getFileName(), false);
					}
				}
				
				sendRedirect(actionRequest, actionResponse);
				actionResponse.setRenderParameter("contact", sentByUser);
				actionResponse.setRenderParameter("jspPage", "/faqsend/success.jsp");
				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, e.getClass().getName());
			actionResponse.setRenderParameter("mvcPath", "/faqsend/view.jsp");
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
            actionResponse.setRenderParameter("jspPage","/faqsend/view.jsp");
        }
        return retval;
    }
}
