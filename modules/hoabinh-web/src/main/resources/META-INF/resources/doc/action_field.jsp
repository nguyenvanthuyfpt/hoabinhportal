<%@page import="vn.gov.hoabinh.model.vdocField"%>
<%@page import="vn.gov.hoabinh.model.vdocOrg"%>
<%@page import="vn.gov.hoabinh.model.VLegalOrg"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/doc/init.jsp"%>

<%
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	vdocField field = (vdocField) row.getObject();
%>
<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/doc/edit_field.jsp" />
	<portlet:param name="orgId" value="<%=field.getFieldId()%>" />
	</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="deleteOrg">
	<portlet:param name="jspPage" value="/doc/view.jsp" />
	<portlet:param name="orgId" value="<%=field.getFieldId()%>" />
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

	