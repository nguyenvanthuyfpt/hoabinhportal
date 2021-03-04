package vn.gov.hoabinh.util;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.RenderRequest;

import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.LayoutConstants;
import com.liferay.portal.kernel.model.LayoutTypePortlet;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

public class LayoutPortletUtil {
	public static List getPortletIdsByLayout(long plid, String portletIdx) throws Exception {

		Layout layoutSelected = (Layout) LayoutLocalServiceUtil.getLayout(plid);
		LayoutTypePortlet layoutTypePortlet = (LayoutTypePortlet) layoutSelected.getLayoutType();

		List portletIds = layoutTypePortlet.getPortletIds();
		List tempPorletIds = new ArrayList();

		for (int i = 0; i < portletIds.size(); i++) {
			String portletId = (String) portletIds.get(i);

			if (portletId.indexOf(portletIdx) == 0) {
				tempPorletIds.add(portletId);
			}
		}

		return tempPorletIds;
	}

	public static void getLayoutPortletIds(List<Layout> selectLayouts, RenderRequest actionRequest, String currentPortletId)
			throws Exception {

		boolean privateLayout = false;
		boolean hasLayout = false;

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		long groupId = themeDisplay.getScopeGroupId();
		long currentPlId = themeDisplay.getPlid();

		// get current portlet layout
		Layout currentLayout = LayoutLocalServiceUtil.getLayout(currentPlId);
		privateLayout = currentLayout.getPrivateLayout();

		// find portlet in layout
		List layouts = LayoutLocalServiceUtil.getLayouts(groupId, privateLayout);

		for (int i = 0; i < layouts.size(); i++) {
			Layout layout = (Layout) layouts.get(i);

			hasLayout = false;
			if (!layout.getType().equals(LayoutConstants.TYPE_PORTLET)) {
				continue;
			}

			LayoutTypePortlet layoutTypePortlet = (LayoutTypePortlet) layout.getLayoutType();
			List portletIds = layoutTypePortlet.getPortletIds();
			if (portletIds != null && portletIds.size() > 0) {
				for (int count = 0; count < portletIds.size(); count++) {
					String portletIdLayout = String.valueOf(portletIds.get(count));
					if (portletIdLayout.indexOf(currentPortletId) >= 0) {
						hasLayout = true;
					}
				}
			}

			if (hasLayout) {
				selectLayouts.add(layout);
			}
		}
	}
}
