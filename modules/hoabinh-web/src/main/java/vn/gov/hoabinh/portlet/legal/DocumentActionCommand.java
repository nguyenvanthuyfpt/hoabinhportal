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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.gov.hoabinh.format.FormatData;
import vn.gov.hoabinh.model.Attachment;
import vn.gov.hoabinh.model.VLegalDocument;
import vn.gov.hoabinh.service.AttachmentLocalServiceUtil;
import vn.gov.hoabinh.service.VLegalAttachedMessageLocalService;
import vn.gov.hoabinh.service.VLegalDocumentLocalService;
import vn.gov.hoabinh.service.VLegalDocumentLocalServiceUtil;
import vn.gov.hoabinh.util.PortalConstant;
import vn.gov.hoabinh.util.PortalUtil;
import vn.gov.hoabinh.util.UploadFileUtilsBak;

@Component(
		property = { 
			"javax.portlet.name=vn_gov_hoabinh_legal",
			"mvc.command.name=crud_document" 
		}, 
		service = MVCActionCommand.class
)
public class DocumentActionCommand extends BaseMVCActionCommand {
	
	Log log = LogFactoryUtil.getLog(this.getClass());
	
	VLegalDocumentLocalService documentService;
	
	VLegalAttachedMessageLocalService messageService;

	@Reference(unbind = "-")
	public void setDocumentService(VLegalDocumentLocalService documentService) {
		this.documentService = documentService;
	}
	
	@Reference(unbind = "-")
	public void setMessageService(VLegalAttachedMessageLocalService messageService) {
		this.messageService = messageService;
	}

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(VLegalDocument.class.getName(), actionRequest);
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		VLegalDocument document = null;
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		long userId = serviceContext.getUserId();
		String language = serviceContext.getLanguageId();
		String cmd = ParamUtil.getString(actionRequest, "cmd");
		
		try {
			String docId = ParamUtil.getString(actionRequest, "docId", "0");
			String docIds = ParamUtil.getString(actionRequest, "docIds", "0");
			String tabs2 = ParamUtil.getString(actionRequest, "tabs2");
			String symbol = ParamUtil.getString(actionRequest, "symbol");
			String num = ParamUtil.getString(actionRequest, "num");
			String replaceDoc = ParamUtil.getString(actionRequest, "replaceDoc");
			String summary = ParamUtil.getString(actionRequest, "summary");
			String content = ParamUtil.getString(actionRequest, "content");
			Date promulDate = ParamUtil.getDate(actionRequest, "promulDate", FormatData.df);
			Date effectivedDate = ParamUtil.getDate(actionRequest, "effectivedDate", FormatData.df); 
			Date expiredDate = ParamUtil.getDate(actionRequest, "expiredDate", FormatData.df);
			String typeId = ParamUtil.getString(actionRequest, "typeId", "0");
			String fieldId = ParamUtil.getString(actionRequest, "fieldId", "0");
			String orgId = ParamUtil.getString(actionRequest, "orgId", "0");
			String orgRels = ParamUtil.getString(actionRequest, "orgRels");
			String signerRels = ParamUtil.getString(actionRequest, "signerRels");
			String fieldRels = ParamUtil.getString(actionRequest, "fieldRels");
			String numRels = ParamUtil.getString(actionRequest, "numRels");
			String departmentRels = ParamUtil.getString(actionRequest, "departmentRels");
			boolean hasAttachment = false;
			String docCode = ParamUtil.getString(actionRequest, "docCode");
			ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();
			
			int status = ParamUtil.getInteger(actionRequest, "status");
			if (PortalConstant.ACTION_ADD.equals(cmd)) {
				document = documentService.addDocument(companyId, groupId, userId, symbol, num, replaceDoc, summary, content, language, promulDate,
						effectivedDate, expiredDate, typeId, fieldId, orgId, orgRels, signerRels, fieldRels, numRels,
						docCode, departmentRels, hasAttachment, themeDisplay);
				docId = document.getDocId();
			} else if (PortalConstant.ACTION_UPDATE.equals(cmd)) {
				document = documentService.getDocument(docId);
				documentService.updateDocument(docId, userId, groupId, symbol, num, replaceDoc, summary, content, language,
						status, promulDate, effectivedDate, expiredDate, typeId, fieldId, orgId, orgRels, signerRels,
						fieldRels, numRels, departmentRels, hasAttachment);
			} else if (PortalConstant.ACTION_DELETE.equals(cmd)) {
				documentService.deleteDocument(docId, companyId);
				AttachmentLocalServiceUtil.deleteAttachments(VLegalDocument.class, Long.parseLong(docId));
			} else if (PortalConstant.ACTION_APPROVES.equals(cmd)) {
				
				if(Validator.isNotNull(docIds)) {
					String[] ids = StringUtil.split(docIds, StringPool.COMMA);
					for (int i = 0; i < ids.length; i++) {
						docId = ids[i];
						if (Validator.isNumber(docId)) {
							document = documentService.fetchVLegalDocument(docId);
							if (tabs2.equals("portlet.legal.document.publish-pending")) {
								document.setPublishedByUser(userId);
								document.setPublishedDate(new Date());
								document.setStatusDoc(2);
							} else {
								document.setApprovedByUser(userId);
								document.setApprovedDate(new Date());
								document.setStatusDoc(1);	
							}							
							documentService.updateDocument(document);
						}
					}
				}
				actionResponse.setRenderParameter("tabs1", "portlet.legal.document");
				actionResponse.setRenderParameter("tabs2", tabs2);
				actionResponse.setRenderParameter("jspPage", "/legal/view.jsp");
			} else if (PortalConstant.ACTION_APPROVE.equals(cmd) || PortalConstant.ACTION_PUBLISH.equals(cmd)) {
				document = documentService.fetchVLegalDocument(docId);
				if (PortalConstant.ACTION_APPROVE.equals(cmd)) {
					document.setApprovedByUser(userId);
					document.setApprovedDate(new Date());
					document.setStatusDoc(1);	
				} else {
					document.setPublishedByUser(userId);
					document.setPublishedDate(new Date());
					document.setStatusDoc(2);
				}
				documentService.updateDocument(document);
			} else if (PortalConstant.ACTION_CANCEL_APPROVE.equals(cmd)||PortalConstant.ACTION_CANCEL_PUBLISH.equals(cmd)) {
				messageService.addMessage(userId, companyId, groupId, docId, content, false);				
				document = documentService.fetchVLegalDocument(docId);
				if (PortalConstant.ACTION_CANCEL_APPROVE.equals(cmd)) {
					document.setApprovedByUser(0);
					document.setApprovedDate(null);
					document.setStatusDoc(0);	
				} else {
					document.setApprovedByUser(0);
					document.setApprovedDate(null);
					document.setPublishedByUser(0);
					document.setPublishedDate(null);
					document.setStatusDoc(0);
				}
				documentService.updateDocument(document);
			} else if (PortalConstant.ACTION_SELECT_DATE.equals(cmd)) {
				document = documentService.fetchVLegalDocument(docId);
				document.setPromulDate(promulDate);
				documentService.updateDocument(document);
				
				actionResponse.setRenderParameter("tabs1", "portlet.legal.document");
				actionResponse.setRenderParameter("tabs2", "portlet.legal.document.published");
				actionResponse.setRenderParameter("jspPage", "/legal/view.jsp");
			}
			
			if (PortalConstant.ACTION_ADD.equals(cmd) || PortalConstant.ACTION_UPDATE.equals(cmd)) {
				List<FileEntry> listFileEntry = UploadFileUtilsBak.upload(uploadRequest, actionRequest, "attachment", "inputFileName", 0);
				if (Validator.isNotNull(listFileEntry) && listFileEntry.size() > 0) {
					for (FileEntry fileEntry : listFileEntry) {
						AttachmentLocalServiceUtil.addAttachment(fileEntry, companyId, groupId, Long.parseLong(docId), 
								VLegalDocument.class, fileEntry.getFolderId(), fileEntry.getFileName(), false);
					}
					hasAttachment = true;
					document.setHasAttachment(hasAttachment);
					VLegalDocumentLocalServiceUtil.updateVLegalDocument(document);
				}
				
				actionResponse.setRenderParameter("tabs1", "portlet.legal.document");
				actionResponse.setRenderParameter("tabs2", tabs2);
				actionResponse.setRenderParameter("jspPage", "/legal/view.jsp");
				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
				sendRedirect(actionRequest, actionResponse);
			}
			
			if (PortalConstant.ACTION_DELETE_FILE.equals(cmd)) {
				long fileEntryId = ParamUtil.getLong(actionRequest, "fileEntryId");				
				Attachment attachment = AttachmentLocalServiceUtil.getAttachment(VLegalDocument.class, Long.parseLong(docId));
				try {
					AttachmentLocalServiceUtil.deleteAttachments(VLegalDocument.class, Long.parseLong(docId));
					List<Attachment> listAttach = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(docId), VLegalDocument.class);
					if (listAttach.size()==0 || Validator.isNull(listAttach)) {
						document.setHasAttachment(false);
						documentService.updateDocument(document);
					}
					
					actionResponse.setRenderParameter("docId", docId);
					actionResponse.setRenderParameter("jspPage", "/legal/edit_article.jsp");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("mvcPath","/legal/view.jsp");
		}
	}
}
