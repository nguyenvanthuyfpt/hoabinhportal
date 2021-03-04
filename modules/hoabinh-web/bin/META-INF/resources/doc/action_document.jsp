<%@page import="vn.gov.hoabinh.model.vdocDocument"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/doc/init.jsp"%>

<%
	tabs2 = ParamUtil.getString(request, "tabs2","portlet.legal.document.approval-pending");
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	vdocDocument document = (vdocDocument) row.getObject();
%>
<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/doc/edit_document.jsp" />
	<portlet:param name="tabs1" value="portlet.doc.document" />
	<portlet:param name="tabs2" value="<%=tabs2 %>" />
	<portlet:param name="docId" value="<%=document.getDocId()%>" />
	</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="crud_document">
	<portlet:param name="jspPage" value="/doc/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_DELETE %>" />
	<portlet:param name="tabs1" value="portlet.doc.document" />
	<portlet:param name="tabs2" value="<%=tabs2 %>" />	
	<portlet:param name="docId" value="<%=document.getDocId()%>" />
</portlet:actionURL>

<portlet:actionURL var="approveURL" name="crud_document">
	<portlet:param name="jspPage" value="/doc/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_APPROVE %>" />
	<portlet:param name="tabs1" value="portlet.doc.document" />
	<portlet:param name="tabs2" value="<%=tabs2 %>" />	
	<portlet:param name="docId" value="<%=document.getDocId()%>" />
</portlet:actionURL>

<portlet:renderURL var="cancelApproveURL">
	<portlet:param name="jspPage" 	value="/doc/cancel_document.jsp" />
	<portlet:param name="docId" value="<%=document.getDocId()%>" />
	<portlet:param name="tabs2" value="<%=tabs2 %>" />
</portlet:renderURL>

<portlet:actionURL var="publishURL" name="crud_document">
	<portlet:param name="jspPage" value="/doc/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_PUBLISH %>" />
	<portlet:param name="tabs1" value="portlet.doc.document" />
	<portlet:param name="tabs2" value="<%=tabs2 %>" />	
	<portlet:param name="docId" value="<%=document.getDocId()%>" />
</portlet:actionURL>

<liferay-ui:icon-menu
    direction="left-side"
    icon="<%= StringPool.BLANK %>"
    markupView="lexicon"
    message="<%= StringPool.BLANK %>"
    showWhenSingleIcon="<%= true %>"
>

<c:choose>
	<c:when test="<%= tabs2.equals("portlet.legal.document.approval-pending") %>">
		<liferay-ui:icon image="subscribe" message="action.document.approve" url="<%=approveURL%>" />
		<liferay-ui:icon image="edit" url="<%=editURL%>" />
		<liferay-ui:icon image="delete" url="<%=deleteURL%>" />
	</c:when>
	<c:when test="<%= tabs2.equals("portlet.legal.document.publish-pending") %>">
		<liferay-ui:icon image="global" message="action.document.publish" url="<%=publishURL%>" />
		<liferay-ui:icon image="unsubscribe" message="action.document.cancel-publish" url="<%=cancelApproveURL%>" />
	</c:when>
	
	<c:when test="<%= tabs2.equals("portlet.legal.document.published") %>">
		<liferay-ui:icon image="unsubscribe" message="action.document.cancel-publish" url="<%=cancelApproveURL%>" />
	</c:when>
</c:choose>
</liferay-ui:icon-menu>

	