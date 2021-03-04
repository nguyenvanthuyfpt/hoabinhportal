<%@page import="vn.gov.hoabinh.model.FAQAnswer"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/faq/init.jsp"%>

<%
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	FAQAnswer answer = (FAQAnswer) row.getObject();
	String tabs2 = ParamUtil.getString(request, "tabs2","0");
	boolean approved = answer.getApproved();
%>

<portlet:actionURL var="approveURL" name="addOrUpdateAnswer">
	<portlet:param name="jspPage" value="/faq/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_APPROVE %>" />
	<portlet:param name="tabs1" value="portlet.faq.answer" />
	<portlet:param name="tabs2" value="0" />
	<portlet:param name="answerId" value="<%=String.valueOf(answer.getId())%>" />
</portlet:actionURL>

<portlet:actionURL var="cancelApproveURL" name="addOrUpdateAnswer">
	<portlet:param name="jspPage" value="/faq/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_CANCEL_APPROVE %>" />
	<portlet:param name="tabs1" value="portlet.faq.answer" />
	<portlet:param name="tabs2" value="1" />
	<portlet:param name="answerId" value="<%=String.valueOf(answer.getId())%>" />
</portlet:actionURL>

<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/faq/edit_answer.jsp" />
	<portlet:param name="answerId" value="<%=String.valueOf(answer.getId())%>" />
	</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="deleteFAQ">
	<portlet:param name="jspPage" value="/faq/view.jsp" />
	<portlet:param name="obj" value="ANSWER" />
	<portlet:param name="tabs1" value="portlet.faq.answer" />
	<portlet:param name="answerId" value="<%=String.valueOf(answer.getId())%>" />
</portlet:actionURL>


<liferay-ui:icon-menu
    direction="left-side"
    icon="<%= StringPool.BLANK %>"
    markupView="lexicon"
    message="<%= StringPool.BLANK %>"
    showWhenSingleIcon="<%= true %>"
>
	<%if(!approved){ %>
	<liferay-ui:icon image="post" message="approve" url="<%=approveURL%>" />
	<liferay-ui:icon image="edit" url="<%=editURL%>" />
	<liferay-ui:icon image="delete" url="<%=deleteURL%>" />
	<%} else { %>
	<liferay-ui:icon image="unsubscribe" message="action.cancel-publish" url="<%=cancelApproveURL%>" />
	<liferay-ui:icon image="edit" url="<%=editURL%>" />
	<liferay-ui:icon image="delete" url="<%=deleteURL%>" />
	<%} %>
</liferay-ui:icon-menu>

	