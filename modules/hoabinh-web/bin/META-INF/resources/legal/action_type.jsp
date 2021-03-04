<%@page import="vn.gov.hoabinh.model.VLegalType"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/legal/init.jsp"%>

<%
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	VLegalType type = (VLegalType) row.getObject();
%>
<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/legal/edit_type.jsp" />
	<portlet:param name="typeId" value="<%=type.getTypeId()%>" />
	</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="deleteAnswer">
	<portlet:param name="jspPage" value="/legal/view.jsp" />
	<portlet:param name="typeId" value="<%=type.getTypeId()%>" />
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

	