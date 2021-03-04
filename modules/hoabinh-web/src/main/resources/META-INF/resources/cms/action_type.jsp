<%@page import="vn.gov.hoabinh.model.VcmsType"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/cms/init.jsp"%>

<%
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	VcmsType type = (VcmsType) row.getObject();
%>
<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/cms/edit_type.jsp" />
	<portlet:param name="typeId" value="<%=String.valueOf(type.getTypeId())%>" />
	</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="deleteLink">
	<portlet:param name="jspPage" value="/cms/view.jsp" />
	<portlet:param name="tabs1" value="portlet.cms.general-manage" />
	<portlet:param name="tabs2" value="portlet.cms.article.type" />
	<portlet:param name="typeId" value="<%=String.valueOf(type.getTypeId())%>" />
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

	