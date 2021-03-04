<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.model.VcmsCategory"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/cms/init.jsp"%>
<%
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	VcmsCategory category = (VcmsCategory) row.getObject();
%>
<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/cms/edit_category.jsp" />
	<portlet:param name="categoryId" value="<%=category.getCategoryId()%>" />
	<portlet:param name="portionId" value="<%=category.getPortionId()%>" />
	<portlet:param name="parentId" value="<%=category.getParentId()%>" />
</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="crud_category">
	<portlet:param name="jspPage" value="/cms/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_DELETE %>" />
	<portlet:param name="tabs1" value="portlet.cms.general-manage" />
	<portlet:param name="tabs2" value="portlet.cms.category" />
	<portlet:param name="categoryId" value="<%=category.getCategoryId()%>" />	
</portlet:actionURL>

<portlet:renderURL var="syncRssURL">
	<portlet:param name="jspPage" 	value="/cms/sync_rss.jsp" />
	<portlet:param name="tabs1" value="portlet.cms.general-manage" />
	<portlet:param name="tabs2" value="portlet.cms.category" />
	<portlet:param name="categoryId" value="<%=category.getCategoryId()%>" />
</portlet:renderURL>


<liferay-ui:icon-menu
    direction="left-side"
    icon="<%= StringPool.BLANK %>"
    markupView="lexicon"
    message="<%= StringPool.BLANK %>"
    showWhenSingleIcon="<%= true %>"
>

	<liferay-ui:icon image="rss" url="<%=syncRssURL%>" />
	<liferay-ui:icon image="edit" url="<%=editURL%>" />
	<liferay-ui:icon image="delete" url="<%=deleteURL%>" />
</liferay-ui:icon-menu>