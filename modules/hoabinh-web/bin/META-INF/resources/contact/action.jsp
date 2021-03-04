<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.model.VContact"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/contact/init.jsp"%>

<%
	String tabs1 = ParamUtil.getString(request, "tabs1","0");
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	VContact item = (VContact) row.getObject();
%>

<portlet:actionURL var="approveURL" name="addOrUpdateContact">
	<portlet:param name="jspPage" 	value="/contact/view.jsp" />
	<portlet:param name="cmd" 	value="<%=PortalConstant.ACTION_APPROVE %>" />
	<portlet:param name="Id" value="<%=String.valueOf(item.getId())%>" />
</portlet:actionURL>

<portlet:actionURL var="rejectURL" name="addOrUpdateContact">
	<portlet:param name="jspPage" 	value="/contact/view.jsp" />
	<portlet:param name="cmd" 	value="<%=PortalConstant.ACTION_CANCEL_APPROVE %>" />
	<portlet:param name="Id" value="<%=String.valueOf(item.getId())%>" />
</portlet:actionURL>

<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/contact/edit.jsp" />
	<portlet:param name="Id" value="<%=String.valueOf(item.getId())%>" />
</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="deleteContact">
	<portlet:param name="jspPage" value="/contact/view.jsp" />
	<portlet:param name="tabs1" value="<%=tabs1%>" />
	<portlet:param name="Id" value="<%=String.valueOf(item.getId())%>" />
</portlet:actionURL>


<liferay-ui:icon-menu
    direction="left-side"
    icon="<%= StringPool.BLANK %>"
    markupView="lexicon"
    message="<%= StringPool.BLANK %>"
    showWhenSingleIcon="<%= true %>"
>
	<% if("0".equals(tabs1)){ %>
	<liferay-ui:icon image="post" message="approve" url="<%=approveURL%>" />
	<liferay-ui:icon image="unsubscribe" message="action.reject" url="<%=rejectURL%>" />
	<liferay-ui:icon image="edit" url="<%=editURL%>" />
	<liferay-ui:icon image="delete" url="<%=deleteURL%>" />
	<%} else if ("1".equals(tabs1)){  %>
	<liferay-ui:icon image="unsubscribe" message="action.reject" url="<%=rejectURL%>" />
	<liferay-ui:icon image="delete" url="<%=deleteURL%>" />
	<%} else { %>
	<liferay-ui:icon image="delete" url="<%=deleteURL%>" />
	<%} %>
</liferay-ui:icon-menu>

	