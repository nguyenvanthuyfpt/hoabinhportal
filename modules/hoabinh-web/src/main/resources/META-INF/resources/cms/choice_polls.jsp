<%@page import="com.liferay.polls.model.PollsQuestion"%>
<%@page import="com.liferay.polls.service.PollsQuestionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.ActionUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@ include file="/cms/init.jsp" %>
<%
	String articleId = ParamUtil.getString(request, "articleId", "0");
	String tabs2 = ParamUtil.getString(request, "tabs2");
	VcmsArticle article = null;
	if (!"0".equals(articleId)) {
		article = VcmsArticleLocalServiceUtil.getArticle(articleId);
	}
	
	long groupId = 0;
	List<PollsQuestion> listPolls = PollsQuestionLocalServiceUtil.getQuestions(groupId);
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/cms/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.cms.article"/>
	<portlet:param name="tabs2" value="<%=tabs2 %>"/>
</portlet:renderURL>

<portlet:actionURL var="choiceQuestion" name="crud_article">
	<portlet:param name="cmd" value="<%= PortalConstant.ACTION_SELECT_QUESTION%>"/>
</portlet:actionURL>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>" title="action.article.select-polls" />
<aui:form action="<%= publishArtile %>" method="post" name="fm">
<aui:input name="articleId" type="hidden" value='<%= articleId %>' />
<aui:input name="tabs2" type="hidden" value='<%= tabs2 %>' />

<aui:row>
	<aui:col width="100">
		<% if(Validator.isNotNull(listPolls) && listPolls.size()>0) { %>
		<ul>
		<% for(PollsQuestion question:listPolls) { %>
			<li><aui:input type="radio" name="questionId" label="<%=question.getTitle() %>" value="<%question.getPrimaryKey() %>" /></li>
		<% } %>
		</ul>
		<% } else { %>
			<div class="alert alert-warning">
			    <strong class="lead"><liferay-ui:message key="portlet.common.warn" /></strong>
			    <liferay-ui:message key="portlet.cms.no-polls"/>
			</div>
		<% } %>
	</aui:col>
</aui:row>

<aui:button-row >
	<aui:button type="submit" value="save" icon="icon-ok-sign" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>
