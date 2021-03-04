package vn.gov.hoabinh.portlet.counter;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.UserTracker;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import vn.gov.hoabinh.format.FormatData;
import vn.gov.hoabinh.service.VisitorTrackerLocalService;
import vn.gov.hoabinh.util.DateUtil;

@Component(configurationPid = "vn.gov.hoabinh.configuration.CounterConfig",
	immediate = true, property = { 
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=false", 
		"javax.portlet.display-name=Counter Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/counter/view.jsp", 
		"javax.portlet.init-param.config-template=/counter/configuration.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)

public class CounterPortlet extends MVCPortlet {

	Log log = LogFactoryUtil.getLog(this.getClass());
	
	VisitorTrackerLocalService visitorTrackerLocalService;
	
	@Reference(unbind = "-")
	public void setVisitorTrackerLocalService(VisitorTrackerLocalService visitorTrackerLocalService) {
		this.visitorTrackerLocalService = visitorTrackerLocalService;
	}
	
	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		super.processAction(actionRequest, actionResponse);
	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		getLiveUsers(renderRequest, renderResponse);
		super.render(renderRequest, renderResponse);
	}

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		try {
			
			super.doView(renderRequest, renderResponse);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getLiveUsers(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
			long companyId = themeDisplay.getCompanyId();
			long groupId = themeDisplay.getScopeGroupId();
			
			Class<?> liveUsers = PortalClassLoaderUtil.getClassLoader().loadClass("com.liferay.portal.liveusers.LiveUsers");
			Method getSessionUsers = liveUsers.getDeclaredMethod("getSessionUsers", long.class);
			Object map = getSessionUsers.invoke(null, themeDisplay.getCompanyId());
			Map<String, UserTracker> sessionUsers = null;
			sessionUsers = (ConcurrentHashMap<String, UserTracker>) map;
			int totalVisited = visitorTrackerLocalService.countVisitorByC_G(companyId, groupId);
			
			Date beginMonth = DateUtil.getBeginOfMonth(new Date());	
			Date endMonth = DateUtil.getEndOfMonth(new Date());
			
			String currentDate = DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y);
			int totalMonth = visitorTrackerLocalService.countVisitorByDate(companyId, groupId, beginMonth, endMonth);
			int totalDay = visitorTrackerLocalService.countVisitorByDate(companyId, groupId, 
					DateUtil.parseStringToDate(currentDate + " 00:00:00", DateUtil.DATE_FORMAT_D_M_Y_H_M_S), 
					DateUtil.parseStringToDate(currentDate + " 23:59:59", DateUtil.DATE_FORMAT_D_M_Y_H_M_S));
			
			int totalOnline = 0;
			if (Validator.isNotNull(sessionUsers)) {
				totalOnline = sessionUsers.size();
			}
			
			renderRequest.setAttribute("totalVisited", String.valueOf(totalVisited));
			renderRequest.setAttribute("totalMonth", String.valueOf(totalMonth));
			renderRequest.setAttribute("totalDay", String.valueOf(totalDay));
			renderRequest.setAttribute("totalOnline", String.valueOf(totalOnline));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(CounterPortlet.class);
}