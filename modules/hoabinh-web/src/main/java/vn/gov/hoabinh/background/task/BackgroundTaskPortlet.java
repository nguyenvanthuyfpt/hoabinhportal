package vn.gov.hoabinh.background.task;


import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.backgroundtask.BackgroundTaskManager;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

import vn.gov.hoabinh.background.executor.SampleBackgroundTaskExecutor;


@Component(
        immediate = true,
        property = {
                "com.liferay.portlet.requires-namespaced-parameters=false",
                "com.liferay.portlet.display-category=category.hoabinh",
                "com.liferay.portlet.instanceable=false",
                "javax.portlet.name=BackgroundTaskPortlet",
                "javax.portlet.resource-bundle=content.Language",
                "javax.portlet.display-name=BackgroundTaskPortlet",
                "javax.portlet.init-param.template-path=/",
                "javax.portlet.init-param.view-template=/ftl/view.ftl",
        },
        service = Portlet.class
)
public class BackgroundTaskPortlet extends MVCPortlet {
    static final private Log logger = LogFactoryUtil.getLog(BackgroundTaskPortlet.class);

    //@Reference
    BackgroundTaskManager backgroundTaskmanager;
    
    public void setBackgroundTaskmanager(BackgroundTaskManager backgroundTaskmanager) {
		this.backgroundTaskmanager = backgroundTaskmanager;
	}

	@Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
        Random random = new Random(12);

        HttpServletRequest request = PortalUtil
                .getHttpServletRequest(renderRequest);

        ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest
                .getAttribute(WebKeys.THEME_DISPLAY);

        ServiceContext serviceContext = null;
        try {
            serviceContext = ServiceContextFactory.getInstance(renderRequest);
        } catch (PortalException e) {
            logger.error("Eror in getting service context", e.getCause());
        }

        // This taskContextMap can be used as transporter to background job
        Map<String, Serializable> taskContextMap = new HashMap<>();
        taskContextMap.put("processName", "testing " + random.nextInt());
        taskContextMap.put("totalNodes", String.valueOf(random.nextInt()));
        //taskContextMap.put("serviceContext", serviceContext);
        try {
            // Adding the job to liferay background manager
            com.liferay.portal.kernel.backgroundtask.BackgroundTask backgroundTask = backgroundTaskmanager.addBackgroundTask(themeDisplay.getUserId(),
                    themeDisplay.getScopeGroupId(), SampleBackgroundTaskExecutor.class.getName(),SampleBackgroundTaskExecutor.class.getName(),taskContextMap, serviceContext);
            // With returned background object you can check status, id etc.
            renderRequest.setAttribute("backgroundTaskId",
                    backgroundTask.getBackgroundTaskId());

        } catch (PortalException e) {
            logger.error(e.getCause());
        } catch (SystemException e) {
            logger.error(e.getCause());
        }

        super.doView(renderRequest, renderResponse);
    }
}
