<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page import="java.util.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="vn.gov.hoabinh.util.*"%>
<%@page import="vn.gov.hoabinh.model.*"%>
<%@page import="vn.gov.hoabinh.service.*"%>
<%@page import="vn.gov.hoabinh.configuration.ClipViewConfig"%>

<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.model.Layout"%>
<%@page import="com.liferay.portal.kernel.model.Portlet"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry" %>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil" %>

<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.document.library.kernel.util.DLUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>

<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@page import="vn.gov.hoabinh.util.LayoutPortletUtil" %>

<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletRequest" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletPreferences" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />
<%
	themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	ClipViewConfig configuration = (ClipViewConfig)renderRequest.getAttribute(ClipViewConfig.class.getName());
	String plidSelected = "0";
	String pageSelected = StringPool.BLANK;
	String portletSelected = "vn_gov_hoabinh_portlet_clipview_ClipViewPortlet";
	
	String categorySel = "0";
	String styleSel = "1";
	String numSel = "5";
	String width = "400";
 	String height = "280";
 	String url = "https://www.youtube.com/embed/lpBQFfVWO3k";
	
 	List<Layout> selectLayouts = new ArrayList();
	List listPortlet = new ArrayList();
	try {
		LayoutPortletUtil.getLayoutPortletIds(selectLayouts, renderRequest, "vn_gov_hoabinh_portlet_clipview_ClipViewPortlet");
	} catch (Exception ex) {
	}
 	
	if (Validator.isNotNull(configuration)) {
		plidSelected = portletPreferences.getValue("plidSelected", Validator.isNull(configuration.plidSelected())?"0":configuration.plidSelected());
		pageSelected = portletPreferences.getValue( "pageSelected", configuration.pageSelected());
		portletSelected = portletPreferences.getValue("portletSelected", configuration.portletSelected());
		
		categorySel = portletPreferences.getValue("categorySel", configuration.categorySel());
		styleSel = portletPreferences.getValue("styleSel", configuration.styleSel());
		numSel = portletPreferences.getValue("numSel", configuration.numSel());
		
		width = portletPreferences.getValue("width", configuration.width());
		height = portletPreferences.getValue("height", configuration.height());
		url = portletPreferences.getValue("url", configuration.url());
	} else {
		plidSelected = portletPreferences.getValue("plidSelected", "");
		pageSelected = portletPreferences.getValue( "pageSelected", "");
		portletSelected = portletPreferences.getValue("portletSelected", "");
		
		categorySel = portletPreferences.getValue("categorySel", "");
		styleSel = portletPreferences.getValue("styleSel", "");
		numSel = portletPreferences.getValue("numSel", "");
		
		width = portletPreferences.getValue("width", "");
		height = portletPreferences.getValue("height", "");
		url = portletPreferences.getValue("url", "");
	}
	
	PortletURL clipURL = null;
	try {
		if (!"0".equals(plidSelected) && Validator.isNotNull(plidSelected)) {
			plid = Long.parseLong(plidSelected);
			listPortlet = LayoutPortletUtil.getPortletIdsByLayout(plid, "vn_gov_hoabinh_portlet_clipview_ClipViewPortlet");
			clipURL = PortletURLFactoryUtil.create(request, portletSelected, plid, PortletRequest.RENDER_PHASE);
		} else {
			clipURL = PortletURLFactoryUtil.create(request, portletSelected, plid, PortletRequest.RENDER_PHASE);
		}
	} catch (Exception ex) {
		System.out.println("2." + ex.toString());
	}
	
	String clipId = ParamUtil.getString(request, "clipId", "0");
	String clipTypeId = ParamUtil.getString(request, "clipTypeId");
	String urlClip = "";
	String urlImage = "";
	String titleClip = "";
	
	themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	long groupId = themeDisplay.getLayout().getGroupId();
%>