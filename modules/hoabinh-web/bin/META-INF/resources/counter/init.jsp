<%@page import="vn.gov.hoabinh.configuration.CounterConfig"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="vn.gov.hoabinh.configuration.CmsViewConfig"%>
<%@page import="vn.gov.hoabinh.util.*"%>

<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>

<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletRequest" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletPreferences" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%	
	String displayTotalMonth = "0";
	String displayTotalDay = "0";
	String displayTotalOnline = "0";
	
	CounterConfig configuration = (CounterConfig)renderRequest.getAttribute(CounterConfig.class.getName());
	if (Validator.isNotNull(configuration)) {
		displayTotalMonth = portletPreferences.getValue("displayTotalMonth", configuration.displayTotalMonth());
		displayTotalDay = portletPreferences.getValue("displayTotalDay", configuration.displayTotalDay());
		displayTotalOnline = portletPreferences.getValue("displayTotalOnline", configuration.displayTotalOnline());
	} else {
		displayTotalMonth = portletPreferences.getValue("displayTotalMonth", "0");
		displayTotalDay = portletPreferences.getValue("displayTotalDay", "0");
		displayTotalOnline = portletPreferences.getValue("displayTotalOnline", "0");
	}
%>