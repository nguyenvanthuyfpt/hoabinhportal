<%@page import="vn.gov.hoabinh.model.VLegalDraftDocument"%>
<%@page import="vn.gov.hoabinh.model.VLegalField"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/legal/init.jsp"%>

<%
	tabs2 = ParamUtil.getString(request, "tabs2","portlet.legal.draft.document");
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	VLegalDraftDocument draft = (VLegalDraftDocument) row.getObject();
%>
<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/legal/edit_draft_document.jsp" />
	<portlet:param name="draftId" value="<%=draft.getDraftId()%>" />
	</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="crud_draft">
	<portlet:param name="jspPage" value="/legal/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_DELETE %>" />
	<portlet:param name="tabs1" value="portlet.legal.draft" />
	<portlet:param name="tabs2" value="portlet.legal.draft.document" />	
	<portlet:param name="draftId" value="<%=draft.getDraftId()%>" />
</portlet:actionURL>

<portlet:actionURL var="approveURL" name="crud_draft">
	<portlet:param name="jspPage" value="/legal/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_APPROVE %>" />
	<portlet:param name="tabs1" value="portlet.legal.draft" />
	<portlet:param name="tabs2" value="portlet.legal.draft.document" />	
	<portlet:param name="draftId" value="<%=draft.getDraftId()%>" />
</portlet:actionURL>

<portlet:actionURL var="publishURL" name="crud_draft">
	<portlet:param name="jspPage" value="/legal/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_PUBLISH %>" />
	<portlet:param name="tabs1" value="portlet.legal.draft" />
	<portlet:param name="tabs2" value="portlet.legal.draft.document" />	
	<portlet:param name="draftId" value="<%=draft.getDraftId()%>" />
</portlet:actionURL>

<portlet:actionURL var="cancelPublishURL" name="crud_draft">
	<portlet:param name="jspPage" value="/legal/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_CANCEL_PUBLISH %>" />
	<portlet:param name="tabs1" value="portlet.legal.draft" />
	<portlet:param name="tabs2" value="portlet.legal.draft.document" />	
	<portlet:param name="draftId" value="<%=draft.getDraftId()%>" />
</portlet:actionURL>

<liferay-ui:icon-menu
    direction="left-side"
    icon="<%= StringPool.BLANK %>"
    markupView="lexicon"
    message="<%= StringPool.BLANK %>"
    showWhenSingleIcon="<%= true %>"
>
	
	<% if (draft.getStatusDraft()==0) { %>
		<liferay-ui:icon image="subscribe" message="action.document.approve" url="<%=approveURL%>" />
	<% } %>
	
	<% if (draft.getStatusDraft()==1) { %>
		<liferay-ui:icon image="global" message="action.document.publish" url="<%=publishURL%>" />
	<% } %>
	
	<% if (draft.getStatusDraft()==2) { %>
		<liferay-ui:icon image="unsubscribe" message="action.document.cancel-publish" url="<%=cancelPublishURL%>" />
	<% } %>
		<liferay-ui:icon image="edit" url="<%=editURL%>" />
		<liferay-ui:icon image="delete" url="<%=deleteURL%>" />
</liferay-ui:icon-menu>

	