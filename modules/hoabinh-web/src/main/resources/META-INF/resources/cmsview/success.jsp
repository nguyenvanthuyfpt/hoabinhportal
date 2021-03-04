<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ include file="/cmsview/init.jsp" %>
<%
	String sender = ParamUtil.getString(request, "contact", "");
	String actionReq = ParamUtil.getString(request, "actionReq");
%>

<portlet:renderURL var="backURL">
	<portlet:param name="jspPage" value="/cmsview/article_detail.jsp"/>
</portlet:renderURL>

<%	if("add_comment".equals(actionReq)){ %>
<div class="box_border">
	<div class="alert alert-success">
	    <strong class="lead"><liferay-ui:message key="portlet.common.info" /></strong>
	    <liferay-ui:message key="portlet.common.success.cms.x" arguments="<%= sender %>"/>
	    <br/>
	    <a href="<%=backURL %>" class="alert-link"><liferay-ui:message key="portlet.common.back.cms" /></a>.
	</div>
</div>
<% } else { %>
<div class="box_border">
	<div class="alert alert-success">
	    <strong class="lead"><liferay-ui:message key="portlet.common.info" /></strong>
	    <liferay-ui:message key="portlet.common.success.cms.add-vote"/>
	    <br/>
	    <a href="<%=backURL %>" class="alert-link"><liferay-ui:message key="portlet.common.back.cms" /></a>.
	</div>
</div>
<% } %>
