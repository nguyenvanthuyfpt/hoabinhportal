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
<%@page import="vn.gov.hoabinh.configuration.SearchConfig"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.OrderByComparator"%>

<%@page import="com.liferay.portal.kernel.model.Layout"%>
<%@page import="vn.gov.hoabinh.util.LayoutPortletUtil" %>

<%@page import="com.liferay.portal.kernel.portlet.PortletURLUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>

<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.document.library.kernel.util.DLUtil" %>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry" %>
<%@page import="vn.gov.hoabinh.service.AttachmentLocalServiceUtil"%>

<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletRequest" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletPreferences" %>

<%@page import="vn.gov.hoabinh.model.*" %>
<%@page import="vn.gov.hoabinh.service.*" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%
	PortletURL currentURLObj = PortletURLUtil.getCurrent(liferayPortletRequest,liferayPortletResponse);
	String currentURL = currentURLObj.toString();
	String redirect = ParamUtil.getString(request, "redirect");
	String backURL = ParamUtil.getString(request, "backURL");
	SimpleDateFormat sdf_dmy = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	long groupId = themeDisplay.getLayout().getGroupId();
	
	String plidSelected = "0";
	String pageSelected = StringPool.BLANK;
	String portletSelected = "vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE";
	String categorySelected = StringPool.BLANK;
	String portionId = StringPool.BLANK;
	String styleSel = "1";
	String numSel = "5";
	
	SearchConfig configuration = (SearchConfig)renderRequest.getAttribute(SearchConfig.class.getName());
	List<Layout> selectLayouts = new ArrayList();
	List listPortlet = new ArrayList();
	
	try {
		LayoutPortletUtil.getLayoutPortletIds(selectLayouts, renderRequest, "vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE");
	} catch (Exception ex) {

	}

	if (Validator.isNotNull(configuration)) {
		plidSelected = portletPreferences.getValue("plidSelected", Validator.isNull(configuration.plidSelected())?"0":configuration.plidSelected());
		pageSelected = portletPreferences.getValue( "pageSelected", configuration.pageSelected());
		portletSelected = portletPreferences.getValue("portletSelected", configuration.portletSelected());
		styleSel = portletPreferences.getValue("styleSel", configuration.styleSel());
		numSel = portletPreferences.getValue("numSel", configuration.numSel());
	} else {
		plidSelected = portletPreferences.getValue("plidSelected", "0");
		pageSelected =	portletPreferences.getValue("pageSelected", "hoi-dap");
		portletSelected = portletPreferences.getValue("portletSelected", "vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet");
		styleSel = portletPreferences.getValue("styleSel","1");
		numSel = portletPreferences.getValue("numSel", "20");
	}
	
	PortletURL articleURL = null;
	try {
		if (!"0".equals(plidSelected) && Validator.isNotNull(plidSelected)) {
			plid = Long.parseLong(plidSelected);
			listPortlet = LayoutPortletUtil.getPortletIdsByLayout(plid, "vn_gov_hoabinh_portlet_cmsview_CmsViewPortlet_INSTANCE");
			articleURL = PortletURLFactoryUtil.create(request, portletSelected, plid, PortletRequest.RENDER_PHASE);
		} else {
			articleURL = PortletURLFactoryUtil.create(request, portletSelected, plid, PortletRequest.RENDER_PHASE);
		}
	} catch (Exception ex) {
	}
	
	VcmsStatus status = VcmsStatusLocalServiceUtil.getByC_G_A(1, groupId, true);
	long statusId = 0;
	if (Validator.isNotNull(status)) {
		statusId = status.getStatusId();
	}
	String questionId = ParamUtil.getString(request, "questionId", "0");
%>
