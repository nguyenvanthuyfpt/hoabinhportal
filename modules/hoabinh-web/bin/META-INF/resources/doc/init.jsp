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

<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>

<%@page import="com.liferay.portal.kernel.portlet.PortletURLUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>

<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletRequest" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletPreferences" %>

<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay" %>
<%@page import="com.liferay.portal.kernel.util.WebKeys" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />

<%
	PortletURL currentURLObj = PortletURLUtil.getCurrent(liferayPortletRequest,liferayPortletResponse);
	String currentURL = currentURLObj.toString();
	String redirect = ParamUtil.getString(request, "redirect");
	String backURL = ParamUtil.getString(request, "backURL");
	SimpleDateFormat sdf_dmy = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	String msgEmpty = LanguageUtil.get(request, "portlet.common.no-data");
	
	themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	long groupId = themeDisplay.getLayout().getGroupId();
	
	int docPendingApprove = vdocDocumentLocalServiceUtil.countDocByG_L_S(groupId, PortalConstant.DEFAULT_LANGUAGE, 0);
	int docPendingPublish = vdocDocumentLocalServiceUtil.countDocByG_L_S(groupId, PortalConstant.DEFAULT_LANGUAGE, 1);
	int docPublished = vdocDocumentLocalServiceUtil.countDocByG_L_S(groupId, PortalConstant.DEFAULT_LANGUAGE, 2);
	
	int numDocField = VLegalFieldLocalServiceUtil.countFieldByGroupId(groupId);
	int numDocType = VLegalTypeLocalServiceUtil.countTypeByGroupId(groupId);
	int numDocOrg = VLegalOrgLocalServiceUtil.countOrgByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
	int numDocSig =VLegalSignerLocalServiceUtil.countSignerByGroupId(groupId);
	
	String tabs2 = ParamUtil.getString(request, "tabs2","portlet.legal.document.approval-pending");
	
	
%>