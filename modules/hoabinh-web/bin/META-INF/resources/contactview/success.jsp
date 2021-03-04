<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ include file="/contactview/init.jsp" %>
<%
	String sender = ParamUtil.getString(request, "contact");
%>

<portlet:renderURL var="backURL">
	<portlet:param name="jspPage" value="/contactview/view.jsp"/>
</portlet:renderURL>

<div class="box_border">
	<div class="alert alert-success">
	    <strong class="lead"><liferay-ui:message key="portlet.common.info" /></strong>
	    <liferay-ui:message key="portlet.common.success.contact.x" arguments="<%= sender %>"/>
	    <br/>
	    <a href="<%=backURL %>" class="alert-link"><liferay-ui:message key="portlet.common.back.contact" /></a>.
	</div>
</div>