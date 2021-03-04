package vn.gov.hoabinh.portlet.legal;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import vn.gov.hoabinh.model.VLegalSuggestDocument;
import vn.gov.hoabinh.service.AttachmentLocalServiceUtil;
import vn.gov.hoabinh.service.VLegalSuggestDocumentLocalService;
import vn.gov.hoabinh.util.PortalConstant;

@Component(property = { "javax.portlet.name=vn_gov_hoabinh_legal",
		"mvc.command.name=crud_sugguest" }, service = MVCActionCommand.class)
public class SugguestActionCommand extends BaseMVCActionCommand {

	VLegalSuggestDocumentLocalService sugguestService;

	@Reference(unbind = "-")
	public void setSugguestService(VLegalSuggestDocumentLocalService sugguestService) {
		this.sugguestService = sugguestService;
	}

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(VLegalSuggestDocument.class.getName(),
				actionRequest);

		String suggestId = ParamUtil.getString(actionRequest, "suggestId");
		String title = ParamUtil.getString(actionRequest, "title", "0");
		String content = ParamUtil.getString(actionRequest, "content", "0");
		String visitorName = ParamUtil.getString(actionRequest, "visitorName", "0");
		String visitorEmail = ParamUtil.getString(actionRequest, "visitorEmail", "0");
		String visitorTel = ParamUtil.getString(actionRequest, "visitorTel", "0");
		String visitorAddress = ParamUtil.getString(actionRequest, "visitorTel", "0");
		String draftId = ParamUtil.getString(actionRequest, "draftId", "0");
		boolean hasAttachment = ParamUtil.getBoolean(actionRequest, "hasAttachment");
		boolean approved = ParamUtil.getBoolean(actionRequest, "approved", false);
		long userId = serviceContext.getUserId();

		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		String language = serviceContext.getLanguageId();
		String cmd = ParamUtil.getString(actionRequest, "cmd");
		VLegalSuggestDocument suggest = null;
		try {

			if (PortalConstant.ACTION_ADD.equals(cmd)) {
				sugguestService.addSuggestion(title, content, language, visitorName, visitorEmail, visitorTel,
						visitorAddress, groupId, draftId, hasAttachment, companyId, userId);
			} else if (PortalConstant.ACTION_UPDATE.equals(cmd)) {
				suggest = sugguestService.getSuggestion(suggestId);
				sugguestService.updateSuggestion(suggestId, draftId, groupId, title, content, language, visitorName,
						visitorEmail, visitorTel, visitorAddress, approved, hasAttachment);
			} else if (PortalConstant.ACTION_DELETE.equals(cmd)) {
				sugguestService.deleteSuggestion(suggestId);
				AttachmentLocalServiceUtil.deleteAttachments(VLegalSuggestDocument.class, Long.parseLong(suggestId));
			} else if (PortalConstant.ACTION_APPROVE.equals(cmd)) {
				suggest = sugguestService.getSuggestion(suggestId);
				suggest.setApproved(true);
				sugguestService.updateSuggestion(suggest);
			} else if (PortalConstant.ACTION_CANCEL_APPROVE.equals(cmd)) {
				suggest = sugguestService.getSuggestion(suggestId);
				suggest.setApproved(false);
				sugguestService.updateSuggestion(suggest);
			}
			
			actionResponse.setRenderParameter("tabs1", "portlet.legal.draft");
			actionResponse.setRenderParameter("tabs2", "portlet.legal.draft.suggest");
			actionResponse.setRenderParameter("jspPage", "/legal/view.jsp");
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("mvcPath", "/legal/view.jsp");
		}
	}

}
