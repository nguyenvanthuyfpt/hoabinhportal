package vn.gov.hoabinh.portlet.linkview;

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
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.metatype.Configurable;
import vn.gov.hoabinh.configuration.LinkViewConfig;
import vn.gov.hoabinh.util.DataConvertUtil;

@Component(configurationPid = "vn.gov.hoabinh.configuration.LinkViewConfig", 
	configurationPolicy = ConfigurationPolicy.OPTIONAL, 
	immediate = true, 
	property = {
		"javax.portlet.name=vn_gov_hoabinh_portlet_linkview_LinkViewPortlet"
	}, 
	service = ConfigurationAction.class)
public class LinkViewConfiguation extends DefaultConfigurationAction {

	@Override
	public void include(PortletConfig portletConfig, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		request.setAttribute(LinkViewConfig.class.getName(), _configuration);
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
		
		String[] arrLinkGroup = actionRequest.getParameterValues("linkGroupSel");
		String styleSel = ParamUtil.getString(actionRequest, "styleSel");
		
		String linkGroupSel = ""; 
		if (Validator.isNotNull(arrLinkGroup)) {
			linkGroupSel = DataConvertUtil.convertStringArrayToString(arrLinkGroup, ",");	
		}
		
		setPreference(actionRequest, "styleSel", styleSel);
		setPreference(actionRequest, "linkGroupSel", Validator.isNull(linkGroupSel)?"-1":linkGroupSel);
		super.processAction(portletConfig, actionRequest, actionResponse);
	}

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_log.info("#####Calling LinkViewConfiguation activate() method######");
		_configuration = Configurable.createConfigurable(LinkViewConfig.class, properties);
	}

	private static final Log _log = LogFactoryUtil.getLog(LinkViewConfiguation.class);

	private volatile LinkViewConfig _configuration;

}
