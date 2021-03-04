<%@page import="vn.gov.hoabinh.model.VcmsPortion"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/cms/init.jsp"%>

<%
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	VcmsPortion portion = (VcmsPortion) row.getObject();
%>
<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/cms/edit_portion.jsp" />
	<portlet:param name="portionId" value="<%=portion.getPortionId()%>" />
	</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="crud_portion">
	<portlet:param name="jspPage" value="/cms/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_DELETE%>" />
	<portlet:param name="portionId" value="<%=portion.getPortionId()%>" />
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

	