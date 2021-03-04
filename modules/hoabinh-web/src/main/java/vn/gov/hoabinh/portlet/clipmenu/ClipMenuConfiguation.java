package vn.gov.hoabinh.portlet.clipmenu;

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

import aQute.bnd.annotation.metatype.Configurable;
import vn.gov.hoabinh.configuration.ClipMenuConfig;
import vn.gov.hoabinh.configuration.CmsMenuConfig;
import vn.gov.hoabinh.util.DataConvertUtil;

@Component(configurationPid = "vn.gov.hoabinh.configuration.ClipMenuConfig", 
	configurationPolicy = ConfigurationPolicy.OPTIONAL, 
	immediate = true, 
	property = {
		"javax.portlet.name=vn_gov_hoabinh_portlet_clipmenu_ClipMenuPortlet"
	}, 
	service = ConfigurationAction.class)
public class ClipMenuConfiguation extends DefaultConfigurationAction {

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
	public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {

		String plid = ParamUtil.getString(actionRequest, "plidSelected");
		String portletSelected = ParamUtil.getString(actionRequest, "portletSelected");
		String pageSelected = ParamUtil.getString(actionRequest, "pageSelected");
		String[] arrCategory = actionRequest.getParameterValues("categorySel");		
		setPreference(actionRequest, "plidSelected", plid);
		setPreference(actionRequest, "portletSelected", portletSelected);
		setPreference(actionRequest, "pageSelected", pageSelected);
		
		String portletSel = ParamUtil.getString(actionRequest, "portletSel");
		String pageSel = ParamUtil.getString(actionRequest, "pageSel");
		String categorySel = DataConvertUtil.convertStringArrayToString(arrCategory, ",");
		String styleSel = ParamUtil.getString(actionRequest, "styleSel");
		String numSel = ParamUtil.getString(actionRequest, "numSel");
		
		setPreference(actionRequest, "portletSel", portletSel);
		setPreference(actionRequest, "pageSel", pageSel);
		setPreference(actionRequest, "categorySel", categorySel);
		setPreference(actionRequest, "styleSel", styleSel);
		setPreference(actionRequest, "numSel", numSel);
		super.processAction(portletConfig, actionRequest, actionResponse);
	}

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_log.info("#####Calling ClipMenuConfiguation activate() method######");
		_configuration = Configurable.createConfigurable(ClipMenuConfig.class, properties);
	}

	private static final Log _log = LogFactoryUtil.getLog(ClipMenuConfiguation.class);

	private volatile ClipMenuConfig _configuration;

}
