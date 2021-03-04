package vn.gov.hoabinh.portlet.legalsend;

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
import vn.gov.hoabinh.configuration.LegalSendConfig;
import vn.gov.hoabinh.configuration.LegalViewConfig;
import vn.gov.hoabinh.portlet.faqview.FaqViewConfiguation;

@Component(configurationPid = "vn.gov.hoabinh.configuration.LegalSendConfig", 
	configurationPolicy = ConfigurationPolicy.OPTIONAL, immediate = true, 
	property = {
		"javax.portlet.name=vn_gov_hoabinh_portlet_legalsend_LegalSendPortlet" }, 
	service = ConfigurationAction.class)
public class LegalSendConfiguation extends DefaultConfigurationAction {

	@Override
	public void include(PortletConfig portletConfig, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		request.setAttribute(LegalSendConfig.class.getName(), _configuration);
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
		String portletSel = ParamUtil.getString(actionRequest, "portletSel");
		String numSel = ParamUtil.getString(actionRequest, "numSel");
		
		setPreference(actionRequest, "plidSelected", plid);
		setPreference(actionRequest, "portletSelected", portletSelected);
		setPreference(actionRequest, "portletSel", portletSel);
		setPreference(actionRequest, "numSel", numSel);
		
		super.processAction(portletConfig, actionRequest, actionResponse);
	}

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_log.info("#####Calling LegalSendConfiguation activate() method######");
		_configuration = Configurable.createConfigurable(LegalSendConfig.class, properties);
	}

	private static final Log _log = LogFactoryUtil.getLog(FaqViewConfiguation.class);

	private volatile LegalSendConfig _configuration;
}
