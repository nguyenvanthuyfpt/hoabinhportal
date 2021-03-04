package vn.gov.hoabinh.portlet.adv;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import vn.gov.hoabinh.model.AdvItem;
import vn.gov.hoabinh.model.AdvType;
import vn.gov.hoabinh.service.AdvItemLocalService;
import vn.gov.hoabinh.service.AdvTypeLocalService;
import vn.gov.hoabinh.service.AttachmentLocalServiceUtil;
import vn.gov.hoabinh.util.DateUtil;
import vn.gov.hoabinh.util.UploadFileUtilsBak;

@Component(immediate = true, property = { 
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=false", 
		"javax.portlet.display-name=Adv Portlet",
		"javax.portlet.init-param.template-path=/", 
		"javax.portlet.init-param.view-template=/adv/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class AdvPortlet extends MVCPortlet {

	Log log = LogFactoryUtil.getLog(this.getClass());

	AdvTypeLocalService advTypeService;
	AdvItemLocalService advItemService;

	@Reference(unbind = "-")
	public void setAdvTypeService(AdvTypeLocalService advTypeService) {
		this.advTypeService = advTypeService;
	}

	@Reference(unbind = "-")
	public void setAdvItemService(AdvItemLocalService advItemService) {
		this.advItemService = advItemService;
	}

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.doView(renderRequest, renderResponse);
	}

	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.processAction(actionRequest, actionResponse);
	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.render(renderRequest, renderResponse);
	}

	// AdvType
	@ProcessAction(name = "addOrUpdateAdvType")
	public void addOrUpdateAdvType(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		log.info("addOrUpdateAdvType");
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(AdvType.class.getName(), actionRequest);
			long groupId = serviceContext.getScopeGroupId();
			long companyId = serviceContext.getCompanyId();
			long plid = serviceContext.getPlid();

			long typeId = ParamUtil.getLong(actionRequest, "typeId", 0);
			String name = ParamUtil.getString(actionRequest, "name");
			String description = ParamUtil.getString(actionRequest, "description");
			if (typeId == 0) {
				advTypeService.addType(groupId, companyId, plid, name, description);
			} else {
				advTypeService.updateType(typeId, groupId, companyId, plid, name, description);
			}
			actionResponse.setRenderParameter("tabs1", "portlet.adv.type");
			actionResponse.setRenderParameter("jspPage", "/adv/view.jsp");
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	@ProcessAction(name = "searchItem") 
	public void searchItem(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		log.info("===searchItem===");
		try {
			String desc = ParamUtil.getString(actionRequest, "desc", StringPool.BLANK);
			String typeId = ParamUtil.getString(actionRequest, "typeId");
			String status = ParamUtil.getString(actionRequest, "status");
			
			actionResponse.setRenderParameter("desc", desc);
			actionResponse.setRenderParameter("typeId", typeId);
			actionResponse.setRenderParameter("status", status);
			actionResponse.setRenderParameter("search", "true");
			
			actionResponse.setRenderParameter("tabs1", "portlet.adv.item");
			actionResponse.setRenderParameter("jspPage", "/adv/view.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}

	@ProcessAction(name = "addOrUpdateAdvItem")
	public void addOrUpdateAdvItem(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		log.info("addOrUpdateAdvItem");
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(AdvItem.class.getName(), actionRequest);
			UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
			long groupId = serviceContext.getScopeGroupId();
			long companyId = 1;
			long plid = serviceContext.getPlid();

			long itemId = ParamUtil.getLong(actionRequest, "itemId", 0);
			String name = ParamUtil.getString(actionRequest, "nameImage");
			String description = ParamUtil.getString(actionRequest, "description");
			String url = ParamUtil.getString(actionRequest, "url");
			boolean isTargetBlank = ParamUtil.getBoolean(actionRequest, "isTargetBlank");
			String txtMouseOver = ParamUtil.getString(actionRequest, "txtMouseOver");
			boolean status = ParamUtil.getBoolean(actionRequest, "status");
			long typeId = ParamUtil.getLong(actionRequest, "typeId");
			long folderId = ParamUtil.getLong(actionRequest, "folderId", 0);
			String expriedDate = ParamUtil.getString(actionRequest, "expriedDate");
			AdvItem item = null;
			if (itemId == 0) {
				item = advItemService.addItem(groupId, companyId, plid, name, description, url, isTargetBlank, txtMouseOver,
						status, typeId, folderId, DateUtil.parseStringToDate(expriedDate, DateUtil.DATE_FORMAT_D_M_Y));
			} else {
				item = advItemService.getAdvItem(itemId);
				item = advItemService.updateItem(itemId, groupId, companyId, name, description, url, isTargetBlank,
						txtMouseOver, status, typeId, folderId,
						DateUtil.parseStringToDate(expriedDate, DateUtil.DATE_FORMAT_D_M_Y));
			}
			
			// Process attachment
			if (Validator.isNull(item.getName()) || "".equals(item.getName())) {
				List<FileEntry> listFiles = UploadFileUtilsBak.upload(uploadRequest, actionRequest, "attachment", "inputFileName", 0);
				String imageSrc = "";
				if (Validator.isNotNull(listFiles) && listFiles.size() > 0) {
					for (FileEntry fileEntry : listFiles) {
						imageSrc = "/documents/"+fileEntry.getGroupId()+"/"+fileEntry.getFolderId()+"/"+fileEntry.getFileName()+"/"+fileEntry.getUuid()+"?version="+fileEntry.getVersion();
						AttachmentLocalServiceUtil.addAttachment(fileEntry, companyId, groupId, item.getItemId(), 
								AdvItem.class, fileEntry.getFolderId(), fileEntry.getFileName(), true);
						
						item.setName(imageSrc);
						advItemService.updateAdvItem(item);
					}
				}
			}
			
			actionResponse.setRenderParameter("tabs1", "portlet.adv.item");
			actionResponse.setRenderParameter("jspPage", "/adv/view.jsp");
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	@ProcessAction(name = "deleteImage")
	public void deleteImage(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		log.info("deleteImage");
		try {
			long itemId = ParamUtil.getLong(actionRequest, "itemId", 0);
			AdvItem item = advItemService.getAdvItem(itemId);
			try {
				AttachmentLocalServiceUtil.deleteAttachments(AdvItem.class, itemId);
				item.setName("");
				advItemService.updateAdvItem(item);
				actionResponse.setRenderParameter("itemId", String.valueOf(itemId));
				actionResponse.setRenderParameter("jspPage", "/adv/edit_item.jsp");
				SessionMessages.add(actionRequest, "portlet.common.action.successfully");
			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}

	@ProcessAction(name = "deleteAdvItem")
	public void deleteItem(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		log.info("deleteAdvItem");
		try {
			long itemId = ParamUtil.getLong(actionRequest, "itemId", 0);
			advItemService.deleteAdvItem(itemId);
			AttachmentLocalServiceUtil.deleteAttachments(AdvItem.class, itemId);
			actionResponse.setRenderParameter("tabs1", "portlet.adv.item");
			actionResponse.setRenderParameter("jspPage", "/adv/view.jsp");
			sendRedirect(actionRequest, actionResponse);
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}

	@ProcessAction(name = "deleteAdvType")
	public void deleteAdvType(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		log.info("deleteAdvType");
		try {
			long typeId = ParamUtil.getLong(actionRequest, "typeId", 0);
			advTypeService.deleteAdvType(typeId);
			actionResponse.setRenderParameter("tabs1", "portlet.adv.type");
			actionResponse.setRenderParameter("jspPage", "/adv/view.jsp");
			sendRedirect(actionRequest, actionResponse);
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
}
