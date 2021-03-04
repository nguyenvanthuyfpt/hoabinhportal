<%@page import="vn.gov.hoabinh.model.ClipType"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/adv/init.jsp"%>

<%
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	ClipType type = (ClipType) row.getObject();
%>

<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/clip/edit_type.jsp" />
	<portlet:param name="clipTypeId" value="<%=type.getId()%>" />
	</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="deleteClipType">
	<portlet:param name="jspPage" value="/clip/view.jsp" />
	<portlet:param name="clipTypeId" value="<%=type.getId()%>" />	
	<portlet:param name="tabs1" value="portlet.clip.type" />
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

	