<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@ include file="/cms/init.jsp" %>
<%
	String articleId = ParamUtil.getString(request, "articleId", "0");
	String tabs2 = ParamUtil.getString(request, "tabs2");
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/cms/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.cms.article"/>
	<portlet:param name="tabs2" value="<%=tabs2 %>"/>
</portlet:renderURL>

<portlet:actionURL var="cancelPublish" name="crud_article">
	<portlet:param name="cmd" value="<%= PortalConstant.ACTION_CANCEL_PUBLISH %>"/>
</portlet:actionURL>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>" title='action.cancel-publish' />

<aui:form action="<%= cancelPublish %>" method="post" name="fm">
<aui:input name="articleId" type="hidden" value='<%= articleId %>' />
<aui:input label="portlet.cms.article.cancel" name="message" type="textarea" rows="5" placeholder="portlet.cms.article.input.attached-message"/>

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>