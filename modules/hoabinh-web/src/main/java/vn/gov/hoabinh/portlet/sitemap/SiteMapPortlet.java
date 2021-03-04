package vn.gov.hoabinh.portlet.sitemap;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

@Component(
	immediate = true, property = {
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Sitemap Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/sitemap/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class SiteMapPortlet extends MVCPortlet {
	
	Log log = LogFactoryUtil.getLog(this.getClass());
	
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

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		log.info("Sitemap Portlet");
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		List<Layout> layouts = LayoutLocalServiceUtil.getLayouts(groupId, false);
		log.info(layouts.size());
		
		Locale locale = themeDisplay.getLocale();
		JSONArray treeJsonArray=JSONFactoryUtil.createJSONArray();
		for (Layout layout:layouts) {
			//if (!layout.getHidden()) {
				JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
				jsonObject.put("label", layout.getHTMLTitle(locale));
				jsonObject.put("id", layout.getLayoutId());
				jsonObject.put("type", "node");
				jsonObject.put("expanded", false);
				jsonObject.put("leaf", layout.hasChildren()?true:false);
				treeJsonArray.put(jsonObject);
			//}
			
		}
		renderRequest.setAttribute("data", treeJsonArray);		
		super.doView(renderRequest, renderResponse);
	}
}