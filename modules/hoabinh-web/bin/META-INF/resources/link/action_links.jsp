<%@page import="vn.gov.hoabinh.model.Links"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/link/init.jsp"%>

<%
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	Links link = (Links) row.getObject();
%>
<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/link/edit_links.jsp" />
	<portlet:param name="linkId" value="<%=String.valueOf(link.getLinkId())%>" />
	</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="deleteLink">
	<portlet:param name="jspPage" value="/link/view.jsp" />
	<portlet:param name="tabs1" value="portlet.link.linkitem" />
	<portlet:param name="linkId" value="<%=String.valueOf(link.getLinkId())%>" />
</portlet:actionURL>


<liferay-ui:icon-menu
    direction="left-side"
    icon="<%= StringPool.BLANK %>"
    markupView="lexicon"
    message="<%= StringPool.BLANK %>"
    showWhenSingleIcon="<%= true %>"
>
	<liferay-ui:icon image="edit" url="<%=editURL%>" />
	<liferay-ui:icon image="delete" url="<%=deleteURL%>" />
</liferay-ui:icon-menu>

	