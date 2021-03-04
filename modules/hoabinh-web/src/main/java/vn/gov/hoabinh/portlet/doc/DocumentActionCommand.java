package vn.gov.hoabinh.portlet.doc;

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
import vn.gov.hoabinh.model.vdocDocument;
import vn.gov.hoabinh.service.AttachmentLocalServiceUtil;
import vn.gov.hoabinh.service.vdocDocumentLocalService;
import vn.gov.hoabinh.util.DataConvertUtil;
import vn.gov.hoabinh.util.PortalConstant;
import vn.gov.hoabinh.util.UploadFileUtilsBak;

@Component(property = { "javax.portlet.name=vn_gov_hoabinh_doc",
		"mvc.command.name=crud_document" }, service = MVCActionCommand.class)
public class DocumentActionCommand extends BaseMVCActionCommand {

	Log log = LogFactoryUtil.getLog(this.getClass());

	vdocDocumentLocalService vdocumentLocalService;

	@Reference(unbind = "-")
	public void setDocumentLocalService(vdocDocumentLocalService documentLocalService) {
		this.vdocumentLocalService = documentLocalService;
	}

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(vdocDocument.class.getName(),
				actionRequest);
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		vdocDocument document = null;
		
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		long userId = serviceContext.getUserId();
		String language = serviceContext.getLanguageId();
		String cmd = ParamUtil.getString(actionRequest, "cmd");

		try {
			String tabs2 = ParamUtil.getString(actionRequest, "tabs2", "0");
			String docId = ParamUtil.getString(actionRequest, "docId", "0");
			String content = ParamUtil.getString(actionRequest, "content");
			Date promulDate = ParamUtil.getDate(actionRequest, "promulDate", FormatData.df);
			Date effectivedDate = ParamUtil.getDate(actionRequest, "effectivedDate", FormatData.df);
			Date expiredDate = ParamUtil.getDate(actionRequest, "expiredDate", FormatData.df);
			String fieldId = ParamUtil.getString(actionRequest, "fieldId", "0");
			String orgId = ParamUtil.getString(actionRequest, "orgId", "0");
			String orgRels = ParamUtil.getString(actionRequest, "orgRels");
			String fieldRels = ParamUtil.getString(actionRequest, "fieldRels");
			boolean hasAttachment = false;

			String title = ParamUtil.getString(actionRequest, "title", "");
			String process = ParamUtil.getString(actionRequest, "process", "");
			String base = ParamUtil.getString(actionRequest, "base", "");
			String timeProcess = ParamUtil.getString(actionRequest, "timeProcess", "");
			String cost = ParamUtil.getString(actionRequest, "cost", "0");
			String result = ParamUtil.getString(actionRequest, "result", "");
			String requireDoc = ParamUtil.getString(actionRequest, "requireDoc", "");
			String executeOrg = ParamUtil.getString(actionRequest, "executeOrg", "");
			String objects = ParamUtil.getString(actionRequest, "objects", "");
			String style = ParamUtil.getString(actionRequest, "style", "");
			String note = ParamUtil.getString(actionRequest, "note", "note");
			boolean hasService = false;
			int typeDoc = ParamUtil.getInteger(actionRequest, "typeDoc", 0);
			String levels = "";
			String[] arrLevel = actionRequest.getParameterValues("levels");
			if (Validator.isNotNull(arrLevel)) {
				levels = DataConvertUtil.convertStringArrayToString(arrLevel, ",");
			}
			int status = ParamUtil.getInteger(actionRequest, "status");

			ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();

			if (PortalConstant.ACTION_ADD.equals(cmd)) {
				document = vdocumentLocalService.addDocument(userId, companyId, groupId, language, title, content, process, base,
						timeProcess, cost, result, requireDoc, objects, style, note, promulDate, effectivedDate,
						expiredDate, fieldId, orgRels, fieldRels, hasAttachment, hasService, typeDoc, levels,
						executeOrg);
				docId = document.getDocId();
			} else if (PortalConstant.ACTION_UPDATE.equals(cmd)) {
				document = vdocumentLocalService.getDocument(docId);
				document = vdocumentLocalService.updateDoc(userId, companyId, docId, groupId, language, status, title, content, process, base,
						timeProcess, cost, result, requireDoc, objects, style, note, promulDate, effectivedDate,
						expiredDate, fieldId, orgRels, fieldRels, hasAttachment, hasService, typeDoc, levels,
						executeOrg, themeDisplay);

			} else if (PortalConstant.ACTION_DELETE.equals(cmd)) {
				vdocumentLocalService.deletevdocDocument(docId);
				AttachmentLocalServiceUtil.deleteAttachments(vdocDocument.class, Long.parseLong(docId));
			} else if (PortalConstant.ACTION_APPROVE.equals(cmd) || PortalConstant.ACTION_PUBLISH.equals(cmd)) {
				document = vdocumentLocalService.fetchvdocDocument(docId);
				if (PortalConstant.ACTION_APPROVE.equals(cmd)) {
					document.setApprovedByUser(userId);
					document.setApprovedDate(new Date());
					document.setStatusDoc(1);
				} else {
					document.setPublishedByUser(userId);
					document.setPublishedDate(new Date());
					document.setStatusDoc(2);
				}
				vdocumentLocalService.updateDocument(document, themeDisplay);
			} else if (PortalConstant.ACTION_CANCEL_APPROVE.equals(cmd)
					|| PortalConstant.ACTION_CANCEL_PUBLISH.equals(cmd)) {
				document = vdocumentLocalService.fetchvdocDocument(docId);
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
				vdocumentLocalService.updateDocument(document, themeDisplay);
				
				actionResponse.setRenderParameter("tabs1", "portlet.doc.document");
				actionResponse.setRenderParameter("tabs2", tabs2);
				actionResponse.setRenderParameter("jspPage", "/doc/view.jsp");
				sendRedirect(actionRequest, actionResponse);
				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			}

			if (PortalConstant.ACTION_ADD.equals(cmd) || PortalConstant.ACTION_UPDATE.equals(cmd)) {
				List<FileEntry> listFileEntry = UploadFileUtilsBak.upload(uploadRequest, actionRequest, "attachment",
						"inputFileName", 0);
				
				if (Validator.isNotNull(listFileEntry) && listFileEntry.size() > 0) {
					for (FileEntry fileEntry : listFileEntry) {
						AttachmentLocalServiceUtil.addAttachment(fileEntry, companyId, groupId, Long.parseLong(docId),
								vdocDocument.class, fileEntry.getFolderId(), fileEntry.getFileName(), false);
					}
					hasAttachment = true;
					document.setHasAttachment(hasAttachment);
					vdocumentLocalService.updateDocument(document, themeDisplay);
				}
				
				actionResponse.setRenderParameter("tabs1", "portlet.doc.document");
				actionResponse.setRenderParameter("tabs2", tabs2);
				actionResponse.setRenderParameter("jspPage", "/doc/view.jsp");
				sendRedirect(actionRequest, actionResponse);
				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			}
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("mvcPath", "/doc/view.jsp");
		}
	}
}
