<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@page import="java.util.List"%>
<%@page import="vn.gov.hoabinh.configuration.LinkViewConfig"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>

<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>

<%@page import="vn.gov.hoabinh.model.*" %>
<%@page import="vn.gov.hoabinh.service.*" %>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>

<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletRequest" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletPreferences" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%
	LinkViewConfig configuration = (LinkViewConfig)renderRequest.getAttribute(LinkViewConfig.class.getName());

	String styleSel = "01";
	String linkGroupSel = "-1";
	
	if (Validator.isNotNull(configuration)) {
		styleSel = portletPreferences.getValue( "styleSel", configuration.styleSel());
		linkGroupSel = portletPreferences.getValue("linkGroupSel", configuration.linkGroupSel());
	} else {
		styleSel = portletPreferences.getValue( "styleSel", styleSel);
		linkGroupSel = portletPreferences.getValue("linkGroupSel", linkGroupSel);
	}
	
	themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	long groupId = themeDisplay.getLayout().getGroupId();
%>