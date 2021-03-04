package vn.gov.hoabinh.portlet.cmsmenu;

import java.io.IOException;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import aQute.bnd.annotation.metatype.Configurable;
import vn.gov.hoabinh.configuration.CmsMenuConfig;

@Component(configurationPid = "vn.gov.hoabinh.configuration.CmsMenuConfig", 
	immediate = true, property = {
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Cms Menu Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/cmsmenu/view.jsp",
		"javax.portlet.init-param.config-template=/cmsmenu/configuration.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" 
	}, service = Portlet.class)
public class CmsMenuPortlet extends MVCPortlet {

	Log log = LogFactoryUtil.getLog(this.getClass());
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		try {
			log.info("processAction");
			String cmd = ParamUtil.getString(actionRequest, "cmd");
			String plid = ParamUtil.getString(actionRequest, "plid");
			actionResponse.setRenderParameter("plid", plid);
			actionResponse.setRenderParameter("jspPage", "/cmsmenu/configuration.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	@ProcessAction (name ="changeLayout")
	public void changeLayout(ActionRequest actionRequest, ActionResponse actionResponse){
		try {
			String plid = ParamUtil.getString(actionRequest, "plid");
			actionResponse.setRenderParameter("plid", plid);
			actionResponse.setRenderParameter("jspPage", "/cmsmenu/configuration.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@ProcessAction (name ="changePortion")
	public void changePortion(ActionRequest actionRequest, ActionResponse actionResponse){
		try {
			String portionId = ParamUtil.getString(actionRequest, "portionId");
			actionResponse.setRenderParameter("portionId", portionId);
			actionResponse.setRenderParameter("jspPage", "/cmsmenu/configuration.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Activate
	@Modified
	protected void activate(Map<Object, Object> properties) {
		_configuration = Configurable.createConfigurable(CmsMenuConfig.class, properties);
	}

	private static final Log _log = LogFactoryUtil.getLog(CmsMenuPortlet.class);

	private volatile CmsMenuConfig _configuration;
}