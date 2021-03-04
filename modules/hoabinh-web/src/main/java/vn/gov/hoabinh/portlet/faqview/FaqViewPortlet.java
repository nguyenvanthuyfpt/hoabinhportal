package vn.gov.hoabinh.portlet.faqview;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;

@Component(
	immediate = true, property = {
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=FAQ View Portlet",
		"javax.portlet.name=vn_gov_hoabinh_portlet_faqview_FaqViewPortlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/faqview/view.jsp",
		"javax.portlet.init-param.config-template=/faqview/configuration.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class FaqViewPortlet extends MVCPortlet {
	
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
	
	public void searchQuestion(ActionRequest actionRequest, ActionResponse actionResponse){
		String categoryId = ParamUtil.getString(actionRequest, "categoryId", "0");
		String title = ParamUtil.getString(actionRequest, "title", StringPool.BLANK);
		String sentbyuser = ParamUtil.getString(actionRequest, "sentbyuser", StringPool.BLANK);
		String senderemail = ParamUtil.getString(actionRequest, "senderemail", StringPool.BLANK);
		try {
			actionResponse.setRenderParameter("search", "true");
			actionResponse.setRenderParameter("categoryId", categoryId);
			actionResponse.setRenderParameter("title", title);
			actionResponse.setRenderParameter("sentbyuser", sentbyuser);
			actionResponse.setRenderParameter("senderemail", senderemail);
			actionResponse.setRenderParameter("jspPage", "/faqview/view_search.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(FaqViewPortlet.class);
}