package vn.gov.hoabinh.portlet.docmenu;

import java.io.IOException;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import aQute.bnd.annotation.metatype.Configurable;
import vn.gov.hoabinh.configuration.DocMenuConfig;

@Component(configurationPid = "vn.gov.hoabinh.configuration.DocMenuConfig", 
	immediate = true, property = {
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Doc Menu Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/docmenu/view.jsp",
		"javax.portlet.init-param.config-template=/docmenu/configuration.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" 
	}, service = Portlet.class)
public class DocMenuPortlet extends MVCPortlet {

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
		_configuration = Configurable.createConfigurable(DocMenuConfig.class, properties);
	}

	private static final Log _log = LogFactoryUtil.getLog(DocMenuPortlet.class);

	private volatile DocMenuConfig _configuration;
}