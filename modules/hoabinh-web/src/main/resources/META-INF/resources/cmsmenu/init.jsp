
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

<%@page import="vn.gov.hoabinh.util.*"%>
<%@page import="vn.gov.hoabinh.service.*"%>
<%@page import="vn.gov.hoabinh.model.VcmsPortion"%>
<%@page import="vn.gov.hoabinh.model.VcmsCategory"%>

<%@page import="vn.gov.hoabinh.configuration.CmsMenuConfig"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.model.Layout"%>
<%@page import="com.liferay.portal.kernel.model.Portlet"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="vn.gov.hoabinh.util.LayoutPortletUtil" %>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>

<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletRequest" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletPreferences" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />
<%
	CmsMenuConfig configuration = (CmsMenuConfig)renderRequest.getAttribute(CmsMenuConfig.class.getName());

	String plidSelected = "0";
	String pageSelected = StringPool.BLANK;
	String portletSelected = StringPool.BLANK;
	String categorySelected = StringPool.BLANK;
	String portionId = StringPool.BLANK;
	String styleSel = "1";
	
	themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	long groupId = themeDisplay.getLayout().getGroupId();
	
	List<Layout> selectLayouts = new ArrayList();
	List listPortlet = new ArrayList();
	List<VcmsPortion> listPortion = VcmsPortionLocalServiceUtil.getPortionsByG_L_C(groupId, PortalConstant.DEFAULT_LANGUAGE, true);
	
	try {
		LayoutPortletUtil.getLayoutPortletIds(selectLayouts, renderRequest, "vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE");
	} catch (Exception ex) {
	}

	if (Validator.isNotNull(configuration)) {
		plidSelected = portletPreferences.getValue("plidSelected", Validator.isNull(configuration.plidSelected())?"0":configuration.plidSelected());
		pageSelected = portletPreferences.getValue( "pageSelected", configuration.pageSelected());
		portletSelected = portletPreferences.getValue("portletSelected", configuration.portletSelected());
		categorySelected = portletPreferences.getValue("categorySelected", configuration.categorySelected());
		portionId = portletPreferences.getValue("portionId", configuration.portionId());
		styleSel = portletPreferences.getValue("styleSel", configuration.styleSel());
	} else {
		plidSelected = portletPreferences.getValue("plidSelected", "0");
		pageSelected =	portletPreferences.getValue("pageSelected", "");
		portletSelected = portletPreferences.getValue("portletSelected", "");
		categorySelected = portletPreferences.getValue("categorySelected", "");
		portionId = portletPreferences.getValue("portionId", "0");
		styleSel = portletPreferences.getValue("styleSel", "1");
	}
	
	PortletURL categoryURL = null;
	try {
		if (!"0".equals(plidSelected) && Validator.isNotNull(plidSelected)) {
			plid = Long.parseLong(plidSelected);
			listPortlet = LayoutPortletUtil.getPortletIdsByLayout(plid, "vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE");
			categoryURL = PortletURLFactoryUtil.create(request, portletSelected, plid, PortletRequest.RENDER_PHASE);
		} else {
			categoryURL = PortletURLFactoryUtil.create(request, portletSelected, plid, PortletRequest.RENDER_PHASE);
		}
	} catch (Exception ex) {
	}
	
	String portionId2 = "";
	String parentId2 = "";
	if (Validator.isNotNull(portionId) && (portionId.indexOf("|") > 0)) {
		String[] ppIds = StringUtil.split(portionId, "|");
		portionId2 = ppIds[0];
		parentId2 = ppIds[1];
	}
%>