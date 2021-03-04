package vn.gov.hoabinh.portlet.legal;

import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.gov.hoabinh.format.FormatData;
import vn.gov.hoabinh.model.Attachment;
import vn.gov.hoabinh.model.VLegalDocument;
import vn.gov.hoabinh.model.VLegalDraftDocument;
import vn.gov.hoabinh.service.AttachmentLocalServiceUtil;
import vn.gov.hoabinh.service.VLegalDraftDocumentLocalService;
import vn.gov.hoabinh.util.PortalConstant;
import vn.gov.hoabinh.util.UploadFileUtilsBak;

@Component(property = { 
		"javax.portlet.name=vn_gov_hoabinh_legal",
		"mvc.command.name=crud_draft" }, 
	service = MVCActionCommand.class)
public class DraftActionCommand extends BaseMVCActionCommand {

	Log log = LogFactoryUtil.getLog(this.getClass());

	VLegalDraftDocumentLocalService draftService;

	@Reference(unbind = "-")
	public void setDraftService(VLegalDraftDocumentLocalService draftService) {
		this.draftService = draftService;
	}

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(VLegalDraftDocument.class.getName(),
				actionRequest);
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		VLegalDraftDocument draft = null;
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		long userId = serviceContext.getUserId();
		String language = serviceContext.getLanguageId();
		String cmd = ParamUtil.getString(actionRequest, "cmd");

		try {
			String draftId = ParamUtil.getString(actionRequest, "draftId", "0");
			String title = ParamUtil.getString(actionRequest, "title");
			String content = ParamUtil.getString(actionRequest, "content");
			Date promulDate = ParamUtil.getDate(actionRequest, "promulDate", FormatData.df);
			Date effectivedDate = ParamUtil.getDate(actionRequest, "effectivedDate", FormatData.df);
			Date expiredDate = ParamUtil.getDate(actionRequest, "expiredDate", FormatData.df);
			String typeId = ParamUtil.getString(actionRequest, "typeId", "0");
			String fieldId = ParamUtil.getString(actionRequest, "fieldId", "0");
			boolean hasAttachment = false;
			int highlevel = ParamUtil.getInteger(actionRequest, "highlevel", 1);
			String docCode = ParamUtil.getString(actionRequest, "docCode");
			ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();
			
			int status = ParamUtil.getInteger(actionRequest, "status");
			if (PortalConstant.ACTION_ADD.equals(cmd)) {
				draft = draftService.addDraft(companyId, groupId, userId, title, content, language, typeId, fieldId,
						highlevel, docCode, expiredDate, hasAttachment, themeDisplay);
				draftId = draft.getDraftId();
			} else if (PortalConstant.ACTION_UPDATE.equals(cmd)) {
				draft = draftService.getDraft(draftId);
				draftService.updateDraft(draftId, groupId, userId, title, content, language, typeId, fieldId,
						expiredDate, status, hasAttachment);
			} else if (PortalConstant.ACTION_DELETE.equals(cmd)) {
				draftService.deleteDraft(draftId);
				AttachmentLocalServiceUtil.deleteAttachments(VLegalDraftDocument.class, Long.parseLong(draftId));
			} else if (PortalConstant.ACTION_APPROVE.equals(cmd) || PortalConstant.ACTION_PUBLISH.equals(cmd)) {
				draft = draftService.getDraft(draftId);
				if (PortalConstant.ACTION_APPROVE.equals(cmd)) {
					draft.setStatusDraft(1);
					draft.setApprovedByUser(userId);
					draft.setApprovedDate(new Date());	
				} else {
					draft.setStatusDraft(2);
					draft.setPublishedByUser(userId);
					draft.setPublishedDate(new Date());
				}
				draftService.updateDraft(draft);				
			} else if (PortalConstant.ACTION_CANCEL_APPROVE.equals(cmd)
					|| PortalConstant.ACTION_CANCEL_PUBLISH.equals(cmd)) {
				draft = draftService.getDraft(draftId);
				if (PortalConstant.ACTION_CANCEL_APPROVE.equals(cmd)) {
					draft.setStatusDraft(0);
					draft.setApprovedByUser(0);
					draft.setApprovedDate(null);	
				} else {
					draft.setStatusDraft(0);
					draft.setPublishedByUser(0);
					draft.setPublishedDate(null);
				}
				draftService.updateDraft(draft);
			}

			if (PortalConstant.ACTION_ADD.equals(cmd) || PortalConstant.ACTION_UPDATE.equals(cmd)) {
				draft = draftService.getDraft(draftId);
				List<FileEntry> listFileEntry = UploadFileUtilsBak.upload(uploadRequest, actionRequest, "attachment", "inputFileName", 0);
				if (Validator.isNotNull(listFileEntry) && listFileEntry.size() > 0) {
					for (FileEntry fileEntry : listFileEntry) {
						AttachmentLocalServiceUtil.addAttachment(fileEntry, companyId, groupId, Long.parseLong(draftId),
								VLegalDraftDocument.class, fileEntry.getFolderId(), fileEntry.getFileName(), false);
					}
					hasAttachment = true;
					draft.setHasAttachment(hasAttachment);
					draftService.updateDraft(draft);
				}
			}
			
			if (PortalConstant.ACTION_DELETE_FILE.equals(cmd)) {
				long fileEntryId = ParamUtil.getLong(actionRequest, "fileEntryId");				
				try {
					AttachmentLocalServiceUtil.deleteAttachment(VLegalDraftDocument.class, Long.parseLong(draftId), fileEntryId, false, false);
					List<Attachment> listAttach = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(draftId), VLegalDraftDocument.class);
					if (listAttach.size()==0 || Validator.isNull(listAttach)) {
						draft = draftService.getDraft(draftId);
						draft.setHasAttachment(false);
						draftService.updateDraft(draft);
					}
					
					actionResponse.setRenderParameter("draftId", draftId);
					actionResponse.setRenderParameter("jspPage", "/legal/edit_draft_document.jsp");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			if (!PortalConstant.ACTION_DELETE_FILE.equals(cmd)) {
				actionResponse.setRenderParameter("fieldId", "0");
				actionResponse.setRenderParameter("typeId", "0");
				actionResponse.setRenderParameter("tabs1", "portlet.legal.draft");
				actionResponse.setRenderParameter("tabs2", "portlet.legal.draft.document");
				actionResponse.setRenderParameter("jspPage", "/legal/view.jsp");	
			}
			
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("mvcPath", "/legal/view.jsp");
		}
	}
}

