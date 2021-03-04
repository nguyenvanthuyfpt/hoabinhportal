package vn.gov.hoabinh.portlet.legalview;

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
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;

import aQute.bnd.annotation.metatype.Configurable;
import vn.gov.hoabinh.configuration.LegalViewConfig;

@Component(configurationPid = "vn.gov.hoabinh.configuration.LegalViewConfig", 
	immediate = true, property = {
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Legal View Portlet",
		"javax.portlet.name=vn_gov_hoabinh_portlet_legalview_LegalViewPortlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/legalview/view.jsp",
		"javax.portlet.init-param.config-template=/legalview/configuration.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" 
	}, service = Portlet.class)

public class LegalViewPortlet extends MVCPortlet {
	
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
		_configuration = Configurable.createConfigurable(LegalViewConfig.class, properties);
	}
	
	public void searchDocument(ActionRequest actionRequest, ActionResponse actionResponse){
		String fieldId = ParamUtil.getString(actionRequest, "fieldId", "0");
		String orgId = ParamUtil.getString(actionRequest, "orgId", "0");
		String typeId = ParamUtil.getString(actionRequest, "typeId", "0");
		int statusDoc = ParamUtil.getInteger(actionRequest, "statusDoc", 0);
		String number = ParamUtil.getString(actionRequest, "number", StringPool.BLANK);
		String symbol = ParamUtil.getString(actionRequest, "symbol", StringPool.BLANK);
		String summary = ParamUtil.getString(actionRequest, "summary", StringPool.BLANK);

		String fromPromul = ParamUtil.getString(actionRequest, "fromPromul");
		String toPromul = ParamUtil.getString(actionRequest, "toPromul");
		String fromEffect = ParamUtil.getString(actionRequest, "fromEffect");
		String toEffect = ParamUtil.getString(actionRequest, "toEffect");
		String fromExpire = ParamUtil.getString(actionRequest, "fromExpire");
		String toExpire = ParamUtil.getString(actionRequest, "toExpire");
		
		try {
			actionResponse.setRenderParameter("search", "true");
			actionResponse.setRenderParameter("fieldId", fieldId);
			actionResponse.setRenderParameter("orgId", orgId);
			actionResponse.setRenderParameter("typeId", typeId);
			actionResponse.setRenderParameter("statusDoc", String.valueOf(statusDoc));
			actionResponse.setRenderParameter("number", number);
			actionResponse.setRenderParameter("symbol", symbol);
			actionResponse.setRenderParameter("summary", summary);
			
			actionResponse.setRenderParameter("fromPromul", fromPromul);
			actionResponse.setRenderParameter("toPromul", toPromul);
			
			actionResponse.setRenderParameter("fromEffect", fromEffect);
			actionResponse.setRenderParameter("toEffect", toEffect);
			
			actionResponse.setRenderParameter("fromExpire", fromExpire);
			actionResponse.setRenderParameter("toExpire", toExpire);
			actionResponse.setRenderParameter("jspPage", "/legalview/view.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(LegalViewPortlet.class);

	private volatile LegalViewConfig _configuration;
}