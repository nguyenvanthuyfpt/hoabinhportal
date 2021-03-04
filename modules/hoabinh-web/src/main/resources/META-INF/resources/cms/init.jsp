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
<%@page import="vn.gov.hoabinh.configuration.CmsConfig"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="vn.gov.hoabinh.util.*"%>
<%@page import="vn.gov.hoabinh.model.*"%>
<%@page import="vn.gov.hoabinh.service.*"%>

<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>

<%@page import="com.liferay.portal.kernel.portlet.PortletURLUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.service.LayoutLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil"%>

<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay" %>

<%@page import="com.liferay.polls.service.PollsChoiceLocalServiceUtil"%>
<%@page import="com.liferay.polls.service.PollsQuestionLocalServiceUtil"%>
<%@page import="com.liferay.polls.model.PollsQuestion"%>
<%@page import="com.liferay.polls.model.PollsChoice"%>

<%@page import="javax.portlet.PortletMode"%>
<%@page import="javax.portlet.WindowState"%>
<%@page import="javax.portlet.PortletRequest" %>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="javax.portlet.PortletPreferences" %>

<%@page import="com.liferay.polls.model.PollsQuestion" %>
<%@page import="com.liferay.polls.service.PollsQuestionLocalServiceUtil" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />
<%
	String srcHoaBinh = "/o/hbportal-theme/images";
%>
<portlet:actionURL var="searchArticle" name="crud_article"/>
<portlet:actionURL var="searchCategory" name="crud_category"/>

<script>
	function <portlet:namespace/>changePortion(plid){
		var form = document.getElementById("<portlet:namespace />fmArticle");
		form.action = '<%= searchArticle  %>';
		form.submit();
	}
	
	function <portlet:namespace/>changePortionCategory(plid){
		var form = document.getElementById("<portlet:namespace />fmCategory");
		form.action = '<%= searchCategory  %>';
		form.submit();
	}
	
	function <portlet:namespace/>changePortionReport(plid){
		var form = document.getElementById("<portlet:namespace />fmReport");
		form.action = '<%= searchCategory  %>';
		form.submit();
	}
</script>
<%
	CmsConfig configuration = (CmsConfig)renderRequest.getAttribute(CmsConfig.class.getName());
	themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	long groupId = themeDisplay.getLayout().getGroupId();
	PortletURL currentURLObj = PortletURLUtil.getCurrent(liferayPortletRequest, liferayPortletResponse);
	String currentURL = currentURLObj.toString();
	String redirect = ParamUtil.getString(request, "redirect");
	String backURL = ParamUtil.getString(request, "backURL");
	SimpleDateFormat sdf_dmy = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	String msgEmpty = LanguageUtil.get(request, "portlet.common.no-data");
	
	
	String linkWebService = "";
	if (Validator.isNotNull(configuration)) {
		linkWebService = portletPreferences.getValue("linkWebService", Validator.isNull(configuration.linkWebService())?"":configuration.linkWebService());
	} else {
		linkWebService = portletPreferences.getValue("linkWebService", "http://baonoi.hoabinh.gov.vn");
	}
	
	List<VcmsPortion> listPortion = VcmsPortionLocalServiceUtil.getPortionsByG_L_C(groupId, PortalConstant.DEFAULT_LANGUAGE, true);
	List<VcmsCategory> listCategory = new ArrayList();
	List<VcmsStatus> listStatus = VcmsStatusLocalServiceUtil.getByGroupId(groupId);
	List<VcmsType> listType = VcmsTypeLocalServiceUtil.getTypesByS_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
	
	String portionId = ParamUtil.getString(request, "portionId", "0");
	String parentId = ParamUtil.getString(request, "parentId");
	String categoryId = ParamUtil.getString(request, "categoryId");
	if (!"0".equals(parentId) && parentId.indexOf("|")>-1) {
		String[] arrParam = StringUtil.split(parentId, "|");
		if (Validator.isNotNull(arrParam) && arrParam.length>1) {
			categoryId = arrParam[1];
		}
	}
%>