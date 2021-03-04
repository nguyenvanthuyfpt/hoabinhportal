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
<%@page import="vn.gov.hoabinh.configuration.CmsViewConfig"%>
<%@page import="vn.gov.hoabinh.util.*"%>
<%@page import="vn.gov.hoabinh.service.*"%>
<%@page import="vn.gov.hoabinh.model.*"%>
<%@page import="vn.gov.hoabinh.format.*"%>

<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>

<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="com.liferay.portal.kernel.model.Layout"%>
<%@page import="com.liferay.portal.kernel.model.Portlet"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>

<%@page import="com.liferay.asset.kernel.service.*"%>
<%@page import="com.liferay.asset.kernel.model.*"%>

<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletRequest" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletPreferences" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />
<%
	CmsViewConfig configuration = (CmsViewConfig)renderRequest.getAttribute(CmsViewConfig.class.getName());
	
	String plidSelected = "0";
	String pageSelected = StringPool.BLANK;
	String portletSelected = StringPool.BLANK;
	String categorySel = "0";
	String styleSel = "1";
	String numSel = "5";
	String numArticleImg = "5";
	String numArticleNext = "5";
	String categorySelected = StringPool.BLANK;
	String portionId = StringPool.BLANK;
	String displayRss = StringPool.BLANK;
	themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	long groupId = themeDisplay.getLayout().getGroupId();
	
	List<Layout> selectLayouts = new ArrayList();
	List listPortlet = new ArrayList();
	List<VcmsPortion> listPortion = VcmsPortionLocalServiceUtil.getPortionsByG_L_C(groupId, PortalConstant.DEFAULT_LANGUAGE, true);
	
	try {
		LayoutPortletUtil.getLayoutPortletIds(selectLayouts, renderRequest, "vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE");
	} catch (Exception ex) {
		System.out.println("Exception " + ex.toString());
	}
	
	if (Validator.isNotNull(configuration)) {
		plidSelected = portletPreferences.getValue("plidSelected", Validator.isNull(configuration.plidSelected())?"0":configuration.plidSelected());
		pageSelected = portletPreferences.getValue( "pageSelected", configuration.pageSelected());
		portletSelected = portletPreferences.getValue("portletSelected", configuration.portletSelected());
		categorySel = portletPreferences.getValue("categorySel", configuration.categorySel());
		styleSel = portletPreferences.getValue("styleSel", configuration.styleSel());
		numSel = portletPreferences.getValue("numSel", configuration.numSel());
		numArticleImg = portletPreferences.getValue("numArticleImg", configuration.numArticleImg());
		numArticleNext = portletPreferences.getValue("numArticleNext", configuration.numArticleNext());
		
		categorySelected = portletPreferences.getValue("categorySelected", configuration.categorySelected());
		portionId = portletPreferences.getValue("portionId", configuration.portionId());
		displayRss = portletPreferences.getValue("displayRss", configuration.displayRss());
	} else {
		plidSelected = portletPreferences.getValue("plidSelected", "0");
		pageSelected =	portletPreferences.getValue("pageSelected", "");
		portletSelected = portletPreferences.getValue("portletSelected", "");
		categorySel   = portletPreferences.getValue("categorySel", "0");
		styleSel   = portletPreferences.getValue("styleSel", "");
		numSel = portletPreferences.getValue("numSel", "5");
		numArticleImg = portletPreferences.getValue("numArticleImg", "5");
		numArticleNext = portletPreferences.getValue("numArticleNext", "5");
		
		categorySelected = portletPreferences.getValue("categorySelected", "");
		portionId = portletPreferences.getValue("portionId", "0");
		displayRss = portletPreferences.getValue("displayRss", "0");
	}
	
	PortletURL articleURL = null;
	PortletURL categoryURL = null;
	try {
		if (!"0".equals(plidSelected) && Validator.isNotNull(plidSelected)) {
			plid = Long.parseLong(plidSelected);
			listPortlet = LayoutPortletUtil.getPortletIdsByLayout(plid, "vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE");
			categoryURL = PortletURLFactoryUtil.create(request, portletSelected, plid, PortletRequest.RENDER_PHASE);
			articleURL = PortletURLFactoryUtil.create(request, portletSelected, plid, PortletRequest.RENDER_PHASE);
		}		
	} catch (Exception ex) {
		System.out.println(ex.toString());
	}
	
	PortletURL currentURLObj = PortletURLUtil.getCurrent(liferayPortletRequest, liferayPortletResponse);
	String currentURL = currentURLObj.toString();
	VcmsStatus status = VcmsStatusLocalServiceUtil.getByC_G_A(1, groupId, true);
	long statusId = 0;
	if (Validator.isNotNull(status)) {
		statusId = status.getStatusId();
	}
	String categoryId = ParamUtil.getString(request, "categoryId", categorySel);
	String articleId = ParamUtil.getString(request, "articleId", "0");
	long pollId = 0;
	long questionId = 0;
	int num = Validator.isNotNull(numSel)? Integer.parseInt(numSel) : 5;
%>