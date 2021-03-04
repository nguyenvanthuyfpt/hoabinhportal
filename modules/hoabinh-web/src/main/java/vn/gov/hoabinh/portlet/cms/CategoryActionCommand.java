package vn.gov.hoabinh.portlet.cms;

import java.sql.Timestamp;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.gov.hoabinh.model.AdvItem;
import vn.gov.hoabinh.model.Attachment;
import vn.gov.hoabinh.model.VcmsArticle;
import vn.gov.hoabinh.model.VcmsCategory;
import vn.gov.hoabinh.service.AttachmentLocalServiceUtil;
import vn.gov.hoabinh.service.VcmsArticleLocalServiceUtil;
import vn.gov.hoabinh.service.VcmsCategoryLocalService;
import vn.gov.hoabinh.util.PortalConstant;
import vn.gov.hoabinh.util.UploadFileUtils;
import vn.gov.hoabinh.util.UploadFileUtilsBak;

@Component(
		property = { 
				"javax.portlet.name=vn_gov_hoabinh_cms",
				"mvc.command.name=crud_category" }, 
		service = MVCActionCommand.class
)
public class CategoryActionCommand extends BaseMVCActionCommand {
	Log log = LogFactoryUtil.getLog(this.getClass());
	VcmsCategoryLocalService categoryService;

	@Reference(unbind = "-")
	public void setCategoryService(VcmsCategoryLocalService categoryService) {
		this.categoryService = categoryService;
	}

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(VcmsCategory.class.getName(), actionRequest);
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		long userId = serviceContext.getUserId();
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		long plid = serviceContext.getPlid();
		
 		String cmd = ParamUtil.getString(actionRequest, "cmd");
		String categoryId = ParamUtil.getString(actionRequest, "categoryId", "0");
		String portionId = ParamUtil.getString(actionRequest, "portionId", "0");
		String parentId = ParamUtil.getString(actionRequest, "parentId", "0");
		
		if (!"0".equals(parentId) && parentId.indexOf("|")>-1) {
			String[] arrCatParent = StringUtil.split(parentId, "|");
			if(Validator.isNotNull(arrCatParent) && arrCatParent.length>1){
				parentId = arrCatParent[1];
			}
		}
		
		String name = ParamUtil.getString(actionRequest, "name");
		String description = ParamUtil.getString(actionRequest, "description");
		boolean anchored = ParamUtil.getBoolean(actionRequest, "anchored", false);
		String href = ParamUtil.getString(actionRequest, "href");
		String language = PortalConstant.DEFAULT_LANGUAGE;
		boolean hasImage = ParamUtil.getBoolean(actionRequest, "hasImage", false);
		String image = ParamUtil.getString(actionRequest, "image");
		boolean rssable = ParamUtil.getBoolean(actionRequest, "rssable", false);
		int position = ParamUtil.getInteger(actionRequest, "position", 1);
		int userHit = 1;
		VcmsCategory category = null;
		try {
			if (PortalConstant.ACTION_ADD.equals(cmd)) {
				category = categoryService.addCategory(groupId, companyId, plid, portionId, parentId, name, description, anchored,
						href, language, hasImage, image, rssable);
				categoryId = category.getCategoryId();
			} else if (PortalConstant.ACTION_UPDATE.equals(cmd)) {
				category = categoryService.getCategory(categoryId);
				category = categoryService.updateCategory(groupId, companyId, categoryId, portionId, parentId, name, description,
						anchored, href, language, hasImage, category.getImage(), position, userHit, rssable);
			} else if (PortalConstant.ACTION_DELETE.equals(cmd)) {
				category = categoryService.getCategory(categoryId);
				if (category.getHasImage()) {
					long entryId = Long.parseLong(categoryId);
					AttachmentLocalServiceUtil.deleteAttachments(VcmsCategory.class, entryId);
				}
				categoryService.deleteCategory(categoryId);
			} else if (PortalConstant.ACTION_SEARCH.equals(cmd)) {
				String keyword = ParamUtil.getString(actionRequest, "keyword", StringPool.BLANK);
				int hasHrefCat = ParamUtil.getInteger(actionRequest, "hasHref");
				int hasImageCat = ParamUtil.getInteger(actionRequest, "hasImage");
				int isRssCat = ParamUtil.getInteger(actionRequest, "isRss");
				
				/*String strParentId = ParamUtil.getString(actionRequest, "parentId");
				if (strParentId.indexOf("|")>-1){
					String[] arrParam = StringUtil.split(strParentId, "|");
					portionId = Validator.isNotNull(arrParam) ? arrParam[0]:"0";
					parentId = Validator.isNotNull(arrParam) ? arrParam[1]:"0";
				}*/
				
				actionResponse.setRenderParameter("portionId", portionId);
				actionResponse.setRenderParameter("parentId", parentId);
				actionResponse.setRenderParameter("tabs1", "portlet.cms.general-manage");
				actionResponse.setRenderParameter("tabs2", "portlet.cms.category");
				actionResponse.setRenderParameter("jspPage", "/cms/view.jsp");
				
				actionResponse.setRenderParameter("search", "true");
				actionResponse.setRenderParameter("keyword", keyword);
				actionResponse.setRenderParameter("hasHref", String.valueOf(hasHrefCat));
				actionResponse.setRenderParameter("hasImage", String.valueOf(hasImageCat));
				actionResponse.setRenderParameter("isRss", String.valueOf(isRssCat));
				
				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
				sendRedirect(actionRequest, actionResponse);
			} else if (PortalConstant.ACTION_REPORT_USER.equals(cmd)) {
				actionResponse.setRenderParameter("portionId", portionId);
				actionResponse.setRenderParameter("tabs1", "portlet.cms.statistics");
				actionResponse.setRenderParameter("tabs2", "portlet.statistics.by.user");
				actionResponse.setRenderParameter("jspPage", "/cms/view.jsp");
				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
				sendRedirect(actionRequest, actionResponse);
			} else if (PortalConstant.ACTION_REPORT_CATEGORY.equals(cmd)) {
				actionResponse.setRenderParameter("portionId", portionId);
				actionResponse.setRenderParameter("tabs1", "portlet.cms.statistics");
				actionResponse.setRenderParameter("tabs2", "portlet.statistics.by.category");
				actionResponse.setRenderParameter("jspPage", "/cms/view.jsp");
				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
				sendRedirect(actionRequest, actionResponse);
			} else if (PortalConstant.ACTION_CHANGE_PORTION.equals(cmd)) {
				actionResponse.setRenderParameter("portionId", portionId);
				actionResponse.setRenderParameter("jspPage", "/cms/edit_category.jsp");
				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
				sendRedirect(actionRequest, actionResponse);
			} else if (PortalConstant.ACTION_DELETE_IMAGE.equals(cmd)) {
				Attachment attachment = AttachmentLocalServiceUtil.getAttachment(VcmsCategory.class, Long.parseLong(categoryId));
				try {
					AttachmentLocalServiceUtil.deleteAttachments(VcmsCategory.class, Long.parseLong(categoryId));
					category = categoryService.getCategory(categoryId);
					category.setHasImage(false);
					category.setImage(null);
					categoryService.updateCategory(category);
					actionResponse.setRenderParameter("portionId", category.getPortionId());
					actionResponse.setRenderParameter("parentId", category.getParentId());
					actionResponse.setRenderParameter("categoryId", categoryId);
					actionResponse.setRenderParameter("jspPage", "/cms/edit_article.jsp");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
			// Process attachment
			if (PortalConstant.ACTION_ADD.equals(cmd) || PortalConstant.ACTION_UPDATE.equals(cmd)) {
				String imageSrc = "";
				if (!hasImage) {
					List<FileEntry> listImages = UploadFileUtils.upload(uploadRequest, actionRequest, 0, userId, "image");
					if (Validator.isNotNull(listImages) && listImages.size() > 0) {
						for (FileEntry fileEntry : listImages) {
							imageSrc = "/documents/"+fileEntry.getGroupId()+"/"+fileEntry.getFolderId()+"/"+fileEntry.getFileName()+"/"+fileEntry.getUuid()+"?version="+fileEntry.getVersion();
							AttachmentLocalServiceUtil.addAttachment(fileEntry, companyId, groupId, Long.parseLong(categoryId), 
									VcmsCategory.class, fileEntry.getFolderId(), fileEntry.getFileName(), true);
							category.setHasImage(true);
							category.setImage(imageSrc);
							categoryService.updateCategory(category);
						}
					}
				}
				sendRedirect(actionRequest, actionResponse);
				actionResponse.setRenderParameter("tabs1", "portlet.cms.general-manage");
				actionResponse.setRenderParameter("tabs2", "portlet.cms.category");
				actionResponse.setRenderParameter("jspPage", "/cms/view.jsp");
			}
			
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("mvcPath","/cms/view.jsp");
		}
	}
	
	public static void main(String[] args) {

		// method 1
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);
		String test = "14401#14402";
		
		System.out.println(test.indexOf("#")>-1);
	}
}
