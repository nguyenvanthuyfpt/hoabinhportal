package vn.gov.hoabinh.portlet.search;

import java.io.IOException;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.WindowState;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;

import aQute.bnd.annotation.metatype.Configurable;
import vn.gov.hoabinh.configuration.DocViewConfig;
import vn.gov.hoabinh.configuration.SearchConfig;

@Component(configurationPid = "vn.gov.hoabinh.configuration.SearchConfig", 
	immediate = true, property = {
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Search Portlet",
		"javax.portlet.name=vn_gov_hoabinh_portlet_search_SearchPortlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/search/view.jsp",
		"javax.portlet.init-param.config-template=/search/configuration.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" 
	}, service = Portlet.class)
public class SearchPortlet extends MVCPortlet {
	
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

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_configuration = Configurable.createConfigurable(SearchConfig.class, properties);
	}
	
	public void searchArticle(ActionRequest actionRequest, ActionResponse actionResponse){
		String keywork = ParamUtil.getString(actionRequest, "keyword", "0");
		
		log.info("searchArticle ");
		try {
			actionResponse.setRenderParameter("search", "true");
			actionResponse.setRenderParameter("keywork", keywork);
			actionResponse.setWindowState(WindowState.MAXIMIZED);
			actionResponse.setRenderParameter("jspPage", "/search/view.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(SearchConfig.class);

	private volatile SearchConfig _configuration;
}