<%@page import="vn.gov.hoabinh.model.FAQCategory"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/faq/init.jsp"%>

<%
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	FAQCategory category = (FAQCategory) row.getObject();
%>
<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/faq/edit_category.jsp" />
	<portlet:param name="categoryId" value="<%=String.valueOf(category.getId())%>" />
	</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="deleteFAQ">
	<portlet:param name="jspPage" value="/faq/view.jsp" />
	<portlet:param name="obj" value="CATEGORY" />
	<portlet:param name="tabs1" value="portlet.faq.category" />
	<portlet:param name="categoryId" value="<%=String.valueOf(category.getId())%>" />
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

	