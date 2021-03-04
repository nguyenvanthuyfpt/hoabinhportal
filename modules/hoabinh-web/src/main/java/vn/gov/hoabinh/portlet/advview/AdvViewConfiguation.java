package vn.gov.hoabinh.portlet.advview;

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
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.metatype.Configurable;
import vn.gov.hoabinh.configuration.AdvViewConfig;
import vn.gov.hoabinh.model.AdvItem;
import vn.gov.hoabinh.service.AdvItemLocalServiceUtil;

@Component(configurationPid = "vn.gov.hoabinh.configuration.AdvViewConfig", 
	configurationPolicy = ConfigurationPolicy.OPTIONAL, 
	immediate = true, 
	property = {
		"javax.portlet.name=vn_gov_hoabinh_portlet_advview_AdvViewPortlet"
	}, 
	service = ConfigurationAction.class)
public class AdvViewConfiguation extends DefaultConfigurationAction {

	@Override
	public void include(PortletConfig portletConfig, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		request.setAttribute(AdvViewConfig.class.getName(), _configuration);
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

		String documentUrl = ParamUtil.getString(actionRequest, "documentUrl");
		String link = ParamUtil.getString(actionRequest, "link");
		String width = ParamUtil.getString(actionRequest, "width");
		String height = ParamUtil.getString(actionRequest, "height");
		String categorySel = ParamUtil.getString(actionRequest, "categorySel");
		String styleSel = ParamUtil.getString(actionRequest, "styleSel");
		String itemSel = ParamUtil.getString(actionRequest, "itemSel");
		
		if (!"0".equals(itemSel) && Validator.isNotNull(itemSel)) {
			long itemId = Long.parseLong(itemSel);
			AdvItem item = AdvItemLocalServiceUtil.getItem(itemId);
			documentUrl = item.getName();
			link = item.getUrl();
		}
		
		setPreference(actionRequest, "documentUrl", documentUrl);
		setPreference(actionRequest, "link", link);
		setPreference(actionRequest, "width", width);
		setPreference(actionRequest, "height", height);
		setPreference(actionRequest, "categorySel", categorySel);
		setPreference(actionRequest, "styleSel", styleSel);
		setPreference(actionRequest, "itemSel", itemSel);
		SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
		sendRedirect(actionRequest, actionResponse);
		super.processAction(portletConfig, actionRequest, actionResponse);
	}

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_log.info("#####Calling activate() method######");
		_configuration = Configurable.createConfigurable(AdvViewConfig.class, properties);
	}

	private static final Log _log = LogFactoryUtil.getLog(AdvViewConfiguation.class);

	private volatile AdvViewConfig _configuration;

}
