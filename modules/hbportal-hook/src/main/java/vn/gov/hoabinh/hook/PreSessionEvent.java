/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package vn.gov.hoabinh.hook;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

import vn.gov.hoabinh.service.VisitorTrackerLocalService;

@Component(immediate = true, property = { "key=servlet.service.events.pre" }, service = LifecycleAction.class)
public class PreSessionEvent extends Action {

	private static Log _log = LogFactoryUtil.getLog(PreSessionEvent.class.getName());

	/*
	 * @Override public void processLifecycleEvent(LifecycleEvent
	 * lifecycleEvent) throws ActionException { HttpServletRequest request =
	 * lifecycleEvent.getRequest(); try { User user =
	 * PortalUtil.getUser(request); System.out.println("login.event.pre=" +
	 * user.getFullName()); } catch (PortalException ex) { ex.printStackTrace();
	 * } }
	 */
	VisitorTrackerLocalService visitorTrackerLocalService;
	
	@Reference(unbind = "-")
	public void setVisitorTrackerLocalService(VisitorTrackerLocalService visitorTrackerLocalService) {
		this.visitorTrackerLocalService = visitorTrackerLocalService;
	}

	
	@Override
	public void run(HttpServletRequest request, HttpServletResponse response) throws ActionException {
		// _log.info("### Start Post Login Action ######################");
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		
		try {
			HttpSession session = request.getSession();
			if (session.isNew()) {
				visitorTrackerLocalService.addVisitor(companyId, groupId);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Enumeration<String> names = request.getAttributeNames(); names.hasMoreElements();) {
			String name = names.nextElement();
			Object value = request.getAttribute(name);
			// _log.info("A - " + name + " : " + value);
		}

		// _log.info("### End Post Login Action ######################");
	}

	
}