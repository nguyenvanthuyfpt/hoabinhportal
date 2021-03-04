<%@page import="vn.gov.hoabinh.model.VLegalSuggestDocument"%>
<%@page import="vn.gov.hoabinh.model.VLegalField"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/legal/init.jsp"%>

<%
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	VLegalSuggestDocument suggest = (VLegalSuggestDocument) row.getObject();
%>
<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/legal/edit_suggest.jsp" />
	<portlet:param name="suggestId" value="<%=suggest.getSugId()%>" />
	</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="crud_sugguest">
	<portlet:param name="jspPage" value="/legal/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_DELETE %>" />
	<portlet:param name="tabs1" value="portlet.legal.draft" />
	<portlet:param name="tabs2" value="portlet.legal.draft.suggest" />
	<portlet:param name="suggestId" value="<%=suggest.getSugId()%>" />
</portlet:actionURL>

<portlet:actionURL var="approveURL" name="crud_sugguest">
	<portlet:param name="jspPage" value="/legal/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_APPROVE %>" />
	<portlet:param name="tabs1" value="portlet.legal.draft" />
	<portlet:param name="tabs2" value="portlet.legal.draft.suggest" />	
	<portlet:param name="suggestId" value="<%=suggest.getSugId()%>" />
</portlet:actionURL>

<portlet:actionURL var="cancelApproveURL" name="crud_sugguest">
	<portlet:param name="jspPage" value="/legal/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_CANCEL_APPROVE %>" />
	<portlet:param name="tabs1" value="portlet.legal.draft" />
	<portlet:param name="tabs2" value="portlet.legal.draft.suggest" />	
	<portlet:param name="suggestId" value="<%=suggest.getSugId()%>" />
</portlet:actionURL>

<liferay-ui:icon-menu
    direction="left-side"
    icon="<%= StringPool.BLANK %>"
    markupView="lexicon"
    message="<%= StringPool.BLANK %>"
    showWhenSingleIcon="<%= true %>"
>
	<% if (suggest.getApproved()) { %>
		<liferay-ui:icon image="undo" message="action.sugguest.cancel-approve" url="<%=cancelApproveURL%>"/>
		<liferay-ui:icon image="delete" url="<%=deleteURL%>" />
	<% } else { %>
		<liferay-ui:icon image="subscribe" message="action.sugguest.approve" url="<%=approveURL%>" />	
		<liferay-ui:icon image="edit" url="<%=editURL%>" />
		<liferay-ui:icon image="delete" url="<%=deleteURL%>" />
	<% } %>
</liferay-ui:icon-menu>

	