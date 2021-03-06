package vn.gov.hoabinh.portlet.clipview;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

@Component(
	immediate = true, property = { 
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=false", 
		"javax.portlet.display-name=Clip View Portlet",
		"javax.portlet.init-param.template-path=/", 
		"javax.portlet.init-param.view-template=/clipview/view.jsp",
		"javax.portlet.init-param.config-template=/clipview/configuration.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, 
	service = Portlet.class)
public class ClipViewPortlet extends MVCPortlet {
	
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
		// TODO Auto-generated method stub

		super.doView(renderRequest, renderResponse);
	}
	
	@ProcessAction (name ="changeLayout")
	public void changeLayout(ActionRequest actionRequest, ActionResponse actionResponse){
		try {
			String plid = ParamUtil.getString(actionRequest, "plid");
			actionResponse.setRenderParameter("plid", plid);
			actionResponse.setRenderParameter("jspPage", "/clipview/configuration.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(ClipViewPortlet.class);
}