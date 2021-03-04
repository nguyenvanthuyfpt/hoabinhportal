<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page import="vn.gov.hoabinh.configuration.AdvViewConfig"%>
<%@page import="vn.gov.hoabinh.util.*"%>
<%@page import="vn.gov.hoabinh.model.*"%>
<%@page import="vn.gov.hoabinh.service.*"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>

<%@page import="java.util.*"%>
<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletRequest" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletPreferences" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />
<%
	AdvViewConfig configuration = (AdvViewConfig)renderRequest.getAttribute(AdvViewConfig.class.getName());
	String documentUrl = StringPool.BLANK;
	String link = StringPool.BLANK;
	String width = "";
 	String height = "";
 	String categorySel = "-1";
 	String itemSel = "0";
 	String textMouse = "";
 	String styleSel = "1";

	if (Validator.isNotNull(configuration)) {
		documentUrl = portletPreferences.getValue( "documentUrl", configuration.documentUrl());
		link = portletPreferences.getValue( "link", configuration.link());
		width = portletPreferences.getValue("width", configuration.width());
		height = portletPreferences.getValue("height", configuration.height());
		categorySel = portletPreferences.getValue("categorySel", configuration.categorySel());
		styleSel = portletPreferences.getValue("styleSel", configuration.styleSel());
		itemSel = portletPreferences.getValue("itemSel", configuration.itemSel());
	} else {
		documentUrl = portletPreferences.getValue("documentUrl", "");
		link =	portletPreferences.getValue("link", "");
		width =	portletPreferences.getValue("width", "");
		height = portletPreferences.getValue("height", "");
		categorySel = portletPreferences.getValue("categorySel", "-1");
		styleSel = portletPreferences.getValue("styleSel", "1");
		itemSel = portletPreferences.getValue("itemSel", "0");
	}
	
	themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	long groupId = themeDisplay.getLayout().getGroupId();
%>