package vn.gov.hoabinh.portlet.legalmenu;

import java.io.IOException;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

import aQute.bnd.annotation.metatype.Configurable;
import vn.gov.hoabinh.configuration.LegalMenuConfig;

@Component(configurationPid = "vn.gov.hoabinh.configuration.LegalMenuConfig", 
	immediate = true, property = {
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Legal Menu Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/legalmenu/view.jsp",
		"javax.portlet.init-param.config-template=/legalmenu/configuration.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" 
	}, service = Portlet.class)
public class LegalMenuPortlet extends MVCPortlet {

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
		super.doView(renderRequest, renderResponse);
	}

	public void sendParam(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException {
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			String pageName = "/cms";
			String portletName = "vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE_6zrP06CbqTVK";
			
			long plid = 0L;
			plid = LayoutLocalServiceUtil.getFriendlyURLLayout(themeDisplay.getScopeGroupId(), false, pageName).getPlid();
			PortletURL redirectURL = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(actionRequest),
					portletName, plid, PortletRequest.RENDER_PHASE);

			redirectURL.setParameter("param", "123");
			actionResponse.sendRedirect(redirectURL.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_configuration = Configurable.createConfigurable(LegalMenuConfig.class, properties);
	}

	private static final Log _log = LogFactoryUtil.getLog(LegalMenuPortlet.class);

	private volatile LegalMenuConfig _configuration;
}