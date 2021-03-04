<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page import="java.util.List" %>

<%@page import="vn.gov.hoabinh.configuration.LegalMenuConfig"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>

<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>

<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletRequest" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletPreferences" %>

<%@page import="vn.gov.hoabinh.util.PortalConstant" %>
<%@page import="vn.gov.hoabinh.service.*" %>
<%@page import="vn.gov.hoabinh.model.*" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />
<%
	LegalMenuConfig configuration = (LegalMenuConfig)renderRequest.getAttribute(LegalMenuConfig.class.getName());

	String pageSel = "/van-ban-chi-dao-dieu-hanh";
	String portletSel = "vn_gov_hoabinh_portlet_legalview_LegalViewPortlet";
	String categorySel = "0";
	String styleSel = "1";
	String numSel = "5";

	if (Validator.isNotNull(configuration)) {
		pageSel = portletPreferences.getValue( "pageSel", configuration.pageSel());
		portletSel = portletPreferences.getValue("portletSel", configuration.portletSel());
		categorySel = portletPreferences.getValue("categorySel", configuration.categorySel());
		styleSel = portletPreferences.getValue("styleSel", configuration.styleSel());
		numSel = portletPreferences.getValue("numSel", configuration.styleSel());
	}else{
		pageSel =	portletPreferences.getValue("pageSel", "/van-ban-chi-dao-dieu-hanh");
		portletSel = portletPreferences.getValue("portletSel", "vn_gov_hoabinh_portlet_legalview_LegalViewPortlet");
		categorySel   = portletPreferences.getValue("categorySel", "0");
		styleSel   = portletPreferences.getValue("styleSel", "");
		numSel = portletPreferences.getValue("numSel", "5");
	}
	
	// long plid = 0L;
	PortletURL documentURL = null;
	try {
		plid = LayoutLocalServiceUtil.getFriendlyURLLayout(themeDisplay.getScopeGroupId(), false, pageSel).getPlid();
		if (plid!=0) {
			documentURL = PortletURLFactoryUtil.create(request, portletSel, plid, PortletRequest.RENDER_PHASE);
		}		
	} catch (Exception ex) {
		System.out.println("Exception " + ex.toString());
	}
	
	themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	long groupId = themeDisplay.getLayout().getGroupId();
%>