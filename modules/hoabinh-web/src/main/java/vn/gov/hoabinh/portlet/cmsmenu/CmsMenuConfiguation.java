package vn.gov.hoabinh.portlet.cmsmenu;

import java.io.IOException;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import aQute.bnd.annotation.metatype.Configurable;
import vn.gov.hoabinh.configuration.CmsMenuConfig;
import vn.gov.hoabinh.util.DataConvertUtil;

@Component(configurationPid = "vn.gov.hoabinh.configuration.CmsMenuConfig", 
	configurationPolicy = ConfigurationPolicy.OPTIONAL, 
	immediate = true, 
	property = {
		"javax.portlet.name=vn_gov_hoabinh_portlet_cmsmenu_CmsMenuPortlet"
	}, 
	service = ConfigurationAction.class)
public class CmsMenuConfiguation extends DefaultConfigurationAction {
	
	Log log = LogFactoryUtil.getLog(this.getClass());
	
	@Override
	public void include(PortletConfig portletConfig, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		request.setAttribute(CmsMenuConfig.class.getName(), _configuration);
		super.include(portletConfig, request, response);
	}

	@Override
	protected void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		// TODO Auto-generated method stub
		super.doView(request, response);
	}
	
	@Override
	public void render(RenderRequest request, RenderResponse response) throws PortletException, IOException {
		// TODO Auto-generated method stub
		super.render(request, response);
	}

	@Override
	public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {
		
		String[] category = actionRequest.getParameterValues("category");
		String plid = ParamUtil.getString(actionRequest, "plidSelected");
		String portletSelected = ParamUtil.getString(actionRequest, "portletSelected");
		String pageSelected = ParamUtil.getString(actionRequest, "pageSelected");
		String categorySelected = DataConvertUtil.convertStringArrayToString(category, ",");
		String portionId = ParamUtil.getString(actionRequest, "portionId");
		String styleSel = ParamUtil.getString(actionRequest, "styleSel");
		
		setPreference(actionRequest, "plidSelected", plid);
		setPreference(actionRequest, "portletSelected", portletSelected);
		setPreference(actionRequest, "pageSelected", pageSelected);
		setPreference(actionRequest, "categorySelected", categorySelected);	
		setPreference(actionRequest, "portionId", portionId);
		setPreference(actionRequest, "styleSel", styleSel);
		super.processAction(portletConfig, actionRequest, actionResponse);
	}

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_log.info("#####Calling CmsMenuConfiguation activate() method######");
		_configuration = Configurable.createConfigurable(CmsMenuConfig.class, properties);
	}

	private static final Log _log = LogFactoryUtil.getLog(CmsMenuConfiguation.class);

	private volatile CmsMenuConfig _configuration;

}
