package vn.gov.hoabinh.portlet.clipview;

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
import vn.gov.hoabinh.configuration.ClipViewConfig;
import vn.gov.hoabinh.util.DataConvertUtil;

@Component(configurationPid = "vn.gov.hoabinh.configuration.ClipViewConfig", 
	configurationPolicy = ConfigurationPolicy.OPTIONAL, 
	immediate = true, 
	property = {
		"javax.portlet.name=vn_gov_hoabinh_portlet_clipview_ClipViewPortlet"
	}, 
	service = ConfigurationAction.class)
public class ClipViewConfiguation extends DefaultConfigurationAction {

	@Override
	public void include(PortletConfig portletConfig, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		request.setAttribute(ClipViewConfig.class.getName(), _configuration);
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
		
		// Clip
		String[] category = actionRequest.getParameterValues("categorySel");
		String plid = ParamUtil.getString(actionRequest, "plidSelected");
		String portletSelected = ParamUtil.getString(actionRequest, "portletSelected");
		String portletSel = ParamUtil.getString(actionRequest, "portletSel");
		
		String categorySel = DataConvertUtil.convertStringArrayToString(category, ",");
		String numSel = ParamUtil.getString(actionRequest, "numSel");
		String styleSel = ParamUtil.getString(actionRequest, "styleSel");
		
		String width = ParamUtil.getString(actionRequest, "width");
		String height = ParamUtil.getString(actionRequest, "height");
		String url = ParamUtil.getString(actionRequest, "url");
		
		// Image
		String[] imgFolder = actionRequest.getParameterValues("folderSel");
		String imgPlid = ParamUtil.getString(actionRequest, "imgPlidSelected");
		String imgPortletSelected = ParamUtil.getString(actionRequest, "imgPortletSelected");
		String imgPortletSel = ParamUtil.getString(actionRequest, "imgPortletSel");
		
		String folderSel = DataConvertUtil.convertStringArrayToString(imgFolder, ",");
		String imgNumSel = ParamUtil.getString(actionRequest, "imgNumSel");
		String imgStyleSel = ParamUtil.getString(actionRequest, "imgStyleSel");
		
		String imgWidth = ParamUtil.getString(actionRequest, "imgWidth");
		String imgHeight = ParamUtil.getString(actionRequest, "imgHeight");
		
		setPreference(actionRequest, "plidSelected", plid);
		setPreference(actionRequest, "portletSelected", portletSelected);
		setPreference(actionRequest, "portletSel", portletSel);
		setPreference(actionRequest, "categorySel", categorySel);
		setPreference(actionRequest, "numSel", numSel);
		setPreference(actionRequest, "styleSel", styleSel);
		setPreference(actionRequest, "width", width);
		setPreference(actionRequest, "height", height);
		setPreference(actionRequest, "url", url);
		
		setPreference(actionRequest, "imgPlidSelected", imgPlid);
		setPreference(actionRequest, "imgPortletSelected", imgPortletSelected);
		setPreference(actionRequest, "imgPortletSel", imgPortletSel);
		setPreference(actionRequest, "folderSel", folderSel);
		
		super.processAction(portletConfig, actionRequest, actionResponse);
	}

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_log.info("#####Calling ClipViewConfiguation activate() method######");
		_configuration = Configurable.createConfigurable(ClipViewConfig.class, properties);
	}

	private static final Log _log = LogFactoryUtil.getLog(ClipViewConfiguation.class);

	private volatile ClipViewConfig _configuration;

}
