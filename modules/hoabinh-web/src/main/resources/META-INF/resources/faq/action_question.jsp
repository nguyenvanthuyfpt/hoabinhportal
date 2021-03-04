<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.model.FAQQuestion"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/faq/init.jsp"%>

<%
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	FAQQuestion question = (FAQQuestion) row.getObject();
	boolean approved = question.getApproved();
%>

<portlet:actionURL var="approveURL" name="addOrUpdateQuestion">
	<portlet:param name="jspPage" value="/faq/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_APPROVE %>" />
	<portlet:param name="tabs1" value="portlet.faq.question" />
	<portlet:param name="questionId " value="<%=String.valueOf(question.getId())%>" />
</portlet:actionURL>

<portlet:actionURL var="cancelApproveURL" name="addOrUpdateQuestion">
	<portlet:param name="jspPage" value="/faq/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_CANCEL_APPROVE %>" />
	<portlet:param name="tabs1" value="portlet.faq.question" />
	<portlet:param name="tabs2" value="1" />
	<portlet:param name="questionId " value="<%=String.valueOf(question.getId())%>" />
</portlet:actionURL>

<portlet:renderURL var="replyURL">
	<portlet:param name="jspPage" 	value="/faq/edit_answer.jsp" />
	<portlet:param name="answerId" value="0" />
	<portlet:param name="questionId" value="<%=String.valueOf(question.getId())%>" />
</portlet:renderURL>

<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/faq/edit_question.jsp" />
	<portlet:param name="questionId" value="<%=String.valueOf(question.getId())%>" />
</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="deleteFAQ">
	<portlet:param name="jspPage" value="/faq/view.jsp" />
	<portlet:param name="obj" value="QUESTION" />
	<portlet:param name="tabs1" value="portlet.faq.question" />
	<portlet:param name="questionId " value="<%=String.valueOf(question.getId())%>" />
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
	<%}else{ %>
	<liferay-ui:icon image="unsubscribe" message="action.cancel-publish" url="<%=cancelApproveURL%>" />
	<liferay-ui:icon image="reply" message="reply" url="<%=replyURL%>" />
	<liferay-ui:icon image="delete" url="<%=deleteURL%>" />
	<%} %>	
</liferay-ui:icon-menu>

	
	