<%@page import="vn.gov.hoabinh.model.AdvType"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/adv/init.jsp"%>

<%
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	AdvType type = (AdvType) row.getObject();
%>
<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/adv/edit_type.jsp" />
	<portlet:param name="typeId" value="<%=String.valueOf(type.getTypeId())%>" />
	</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="deleteAdvType">
	<portlet:param name="jspPage" value="/adv/view.jsp" />
	<portlet:param name="typeId" value="<%=String.valueOf(type.getTypeId())%>" />
	<portlet:param name="tabs1" value="portlet.adv.type" />
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

	