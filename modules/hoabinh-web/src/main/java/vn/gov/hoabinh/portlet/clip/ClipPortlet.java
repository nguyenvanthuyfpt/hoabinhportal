package vn.gov.hoabinh.portlet.clip;

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
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import vn.gov.hoabinh.model.Clip;
import vn.gov.hoabinh.model.ClipType;
import vn.gov.hoabinh.service.AttachmentLocalServiceUtil;
import vn.gov.hoabinh.service.ClipLocalService;
import vn.gov.hoabinh.service.ClipTypeLocalService;
import vn.gov.hoabinh.util.PortalConstant;
import vn.gov.hoabinh.util.UploadFileUtilsBak;

@Component(
		immediate = true,
		property = {
			"com.liferay.portlet.display-category=category.hoabinh",
			"com.liferay.portlet.instanceable=false",
			"javax.portlet.display-name=Clip Portlet",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.view-template=/clip/view.jsp",
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user"
		},
		service = Portlet.class
	)
public class ClipPortlet extends MVCPortlet {

	Log log = LogFactoryUtil.getLog(this.getClass());
	
	ClipTypeLocalService clipTypeService;
	ClipLocalService clipService;
	
	@Reference(unbind = "-")
	public void setClipTypeService(ClipTypeLocalService clipTypeService) {
		this.clipTypeService = clipTypeService;
	}
	
	@Reference(unbind = "-")
	public void setClipService(ClipLocalService clipService) {
		this.clipService = clipService;
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
	
	@ProcessAction (name ="addOrUpdateClipType")
	public void addOrUpdateClipType(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		try {
			
			ServiceContext serviceContext = ServiceContextFactory.getInstance(ClipType.class.getName(), actionRequest);
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			long groupId = serviceContext.getScopeGroupId();
			long companyId = serviceContext.getCompanyId();
			long plid = serviceContext.getPlid();
			
			String clipTypeId = ParamUtil.getString(actionRequest, "clipTypeId", "0");
			String name = ParamUtil.getString(actionRequest, "name");
			String description = ParamUtil.getString(actionRequest, "description");
			String language = PortalConstant.DEFAULT_LANGUAGE;
			String title = ParamUtil.getString(actionRequest, "title");
			boolean active = true;
			long userId = serviceContext.getUserId();
			if ("0".equals(clipTypeId)) {
				clipTypeService.addClipType(groupId, language, companyId, plid, userId, title, name, description, active);
			} else {
				clipTypeService.updateClipType(clipTypeId, groupId, language, companyId, title, name, description, active);
			}
			actionResponse.setRenderParameter("tabs1", "portlet.clip.type");
			actionResponse.setRenderParameter("jspPage", "/clip/view.jsp");
			sendRedirect(actionRequest, actionResponse);
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	@ProcessAction (name ="addOrUpdateClip")
	public void addOrUpdateClip(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		try {
			UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
			ServiceContext serviceContext = ServiceContextFactory.getInstance(Clip.class.getName(), actionRequest);
			long groupId = serviceContext.getScopeGroupId();
			long companyId = serviceContext.getCompanyId();
			long plid = serviceContext.getPlid();
			
			String clipId = ParamUtil.getString(actionRequest, "clipId", "0");
			String clipTypeId = ParamUtil.getString(actionRequest, "typeId", "0");
			String name = ParamUtil.getString(actionRequest, "name");
			String title = ParamUtil.getString(actionRequest, "title");
			String description = ParamUtil.getString(actionRequest, "description");
			String language = PortalConstant.DEFAULT_LANGUAGE;
			boolean active = true;
			long userId = serviceContext.getUserId();
			String image  = null;
			String url = null;
			Clip clip = null;
			if ("0".equals(clipId)) {
				clip = clipService.addClip(groupId, language, plid, companyId, userId, clipTypeId, url, image, name, title,
						description, active);
			} else {
				clip = clipService.getClip(clipId);
				image = clip.getImage();
				url = clip.getUrl();
				clipService.updateClip(clipId, groupId, language, title, name, description, url, image, clipTypeId);
			}
			
			// Process image
			if (Validator.isNull(image)) {
				List<FileEntry> listImages = UploadFileUtilsBak.upload(uploadRequest, actionRequest, "image", "imageName", 0);
				if (Validator.isNotNull(listImages) && listImages.size() > 0) {
					for (FileEntry fileEntry : listImages) {
						image = "/documents/"+fileEntry.getGroupId()+"/"+fileEntry.getFolderId()+"/"+fileEntry.getFileName()+"/"+fileEntry.getUuid()+"?version="+fileEntry.getVersion();
						AttachmentLocalServiceUtil.addAttachment(fileEntry, companyId, groupId, Long.parseLong(clip.getId()), 
								Clip.class, fileEntry.getFolderId(), fileEntry.getFileName(), true);
						clip.setImage(image);;
						clipService.updateClip(clip);
					}
				}
			}
			
			// Process attachment
			if (Validator.isNull(url)) {
				List<FileEntry> listFiles = UploadFileUtilsBak.upload(uploadRequest, actionRequest, "clip", "clipName", 0);
				if (Validator.isNotNull(listFiles) && listFiles.size() > 0) {
					for (FileEntry fileEntry : listFiles) {
						url = "/documents/"+fileEntry.getGroupId()+"/"+fileEntry.getFolderId()+"/"+fileEntry.getFileName()+"/"+fileEntry.getUuid()+"?version="+fileEntry.getVersion();
						AttachmentLocalServiceUtil.addAttachment(fileEntry, companyId, groupId, Long.parseLong(clip.getId()), 
								Clip.class, fileEntry.getFolderId(), fileEntry.getFileName(), false);
					}
					clip.setUrl(url);
					clipService.updateClip(clip);
				}		
			}
			actionResponse.setRenderParameter("tabs1", "portlet.clip.item");
			actionResponse.setRenderParameter("jspPage", "/clip/view.jsp");
 			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
			sendRedirect(actionRequest, actionResponse);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	

	@ProcessAction(name = "searchClip") 
	public void searchItem(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		try {
			String clipTypeId = ParamUtil.getString(actionRequest, "clipTypeId", "0");
			String name = ParamUtil.getString(actionRequest, "name");
			String title = ParamUtil.getString(actionRequest, "title");
			String active = ParamUtil.getString(actionRequest, "active");
			
			actionResponse.setRenderParameter("clipTypeId", clipTypeId);
			actionResponse.setRenderParameter("name", name);
			actionResponse.setRenderParameter("title", title);
			actionResponse.setRenderParameter("active", String.valueOf(active));
			actionResponse.setRenderParameter("search", "true");
			
			actionResponse.setRenderParameter("tabs1", "portlet.clip.item");
			actionResponse.setRenderParameter("jspPage", "/clip/view.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	@ProcessAction(name = "deleteClip") 
	public void deleteClip(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		try {
			String clipId = ParamUtil.getString(actionRequest, "clipId");
			clipService.deleteClip(clipId);
			AttachmentLocalServiceUtil.deleteAttachments(Clip.class, Long.parseLong(clipId));
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	@ProcessAction(name = "deleteAttachment") 
	public void deleteAttachment(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		try {
			String clipId = ParamUtil.getString(actionRequest, "clipId");
			String cmd = ParamUtil.getString(actionRequest, "cmd");
			
			Clip clip = clipService.getClip(clipId);
			if (PortalConstant.ACTION_DELETE_IMAGE.equals(cmd)) {
				clip.setImage(null);
			} else {
				clip.setUrl(null);
			}
			clipService.updateClip(clip);
			/*AttachmentLocalServiceUtil.deleteAttachments(Clip.class, Long.parseLong(clipId),
					PortalConstant.ACTION_DELETE_IMAGE.equals(cmd) ? Long.parseLong(clipId) : 0);*/
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (Exception e) {
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}

	@ProcessAction(name = "deleteClipType") 
	public void deleteClipType(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		try {
			String clipTypeId = ParamUtil.getString(actionRequest, "clipTypeId");
			clipTypeService.deleteClipType(clipTypeId);
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
}
