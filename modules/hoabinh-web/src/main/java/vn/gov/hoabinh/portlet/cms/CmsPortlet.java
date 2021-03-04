package vn.gov.hoabinh.portlet.cms;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.backgroundtask.BackgroundTaskManager;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import vn.gov.hoabinh.model.VcmsCategory;
import vn.gov.hoabinh.service.VcmsArticleLocalService;
import vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil;
import vn.gov.hoabinh.util.PortalConstant;

@Component(immediate = true, property = { 
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=false", 
		"javax.portlet.display-name=CMS Portlet",
		"javax.portlet.name=vn_gov_hoabinh_cms", 
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/cms/view.jsp",
		"javax.portlet.init-param.config-template=/cms/configuration.jsp",
		"javax.portlet.init-param.add-process-action-success-action=true",
		"com.liferay.portlet.header-portlet-javascript=/js/legal.js", 
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class CmsPortlet extends MVCPortlet {

	Log log = LogFactoryUtil.getLog(this.getClass());
	VcmsArticleLocalService articleService;

	@Reference(unbind = "-")
	public void setArticleService(VcmsArticleLocalService articleService) {
		this.articleService = articleService;
	}

	BackgroundTaskManager backgroundTaskmanager;

	@Reference(unbind = "-")
	public void setBackgroundTaskmanager(BackgroundTaskManager backgroundTaskmanager) {
		this.backgroundTaskmanager = backgroundTaskmanager;
	}

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
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
		try {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.render(renderRequest, renderResponse);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		String cmd = ParamUtil.getString(resourceRequest, "cmd");
		String reportType = ParamUtil.getString(resourceRequest, "reportType");
		String portionId = ParamUtil.getString(resourceRequest, "portionId", "0");
		String parentId = ParamUtil.getString(resourceRequest, "parentId", "0");
		int begin = ParamUtil.getInteger(resourceRequest, "begin", 0);
		int end = ParamUtil.getInteger(resourceRequest, "end", 10);
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		String language = themeDisplay.getLanguageId();
		resourceRequest.setAttribute("groupId", groupId);
		resourceRequest.setAttribute("language", language);
		
		try {
			if (cmd.equals("exportCSV")) {
				
				if (PortalConstant.ACTION_REPORT_CATEGORY.equals(reportType)) {
					List<VcmsCategory> listCategory = VcmsCategoryLocalServiceUtil.getCategoriesByP_P(groupId, language, parentId, portionId, 0, 10);
					CmsExport.exportReportByCategory(listCategory, resourceRequest, resourceResponse);
				} else {
					int totalUser = UserLocalServiceUtil.getUsersCount();
					List<User> listUser = UserLocalServiceUtil.getUsers(-1, -1);
					CmsExport.exportReportByUser(listUser, resourceRequest, resourceResponse);
				}
	            super.serveResource(resourceRequest, resourceResponse);
			} else if (cmd.equals("exportHTMLCSV")) {
				CmsExport.exportHTMLCSVData(resourceRequest, resourceResponse);
			} 
		} catch (Exception e) {
			log.error(e, e);
		}
	}
}