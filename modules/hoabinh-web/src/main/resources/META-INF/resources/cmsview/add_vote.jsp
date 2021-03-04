<%@page import="java.util.Locale"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.polls.service.PollsChoiceLocalServiceUtil"%>
<%@page import="com.liferay.polls.service.PollsQuestionLocalServiceUtil"%>
<%@page import="com.liferay.polls.model.PollsQuestion"%>
<%@page import="com.liferay.polls.model.PollsChoice"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ include file="/cmsview/init.jsp" %>

<portlet:actionURL var="addVote" name="add_vote"/>

<%
	VcmsArticle article = null;
	if (!"0".equals(articleId)) {
		article = VcmsArticleLocalServiceUtil.getArticle(articleId);
		pollId = Long.parseLong(article.getPollId());
	}
%>

<div class="box_border">
<aui:form action="<%= addVote %>" cssClass="container-fluid-1280" method="post" name="fm">
<aui:input name="questionId" type="hidden" value='<%= pollId %>' />
<aui:input name="redirect" type="hidden" value='<%= currentURL %>' />
<aui:row>
	<% 	
		if(pollId!=0) { %>
	<%
		PollsQuestion question = PollsQuestionLocalServiceUtil.getPollsQuestion(pollId);
		List<PollsChoice> listPollChoice = PollsChoiceLocalServiceUtil.getChoices(question.getQuestionId());
		if (listPollChoice.size()>0) {
	%>
		<%=question.getTitle("vi_VN") %>
		<ul>
			<% for(PollsChoice choice:listPollChoice){ %>
				<li><aui:input type="radio" name="choiceId" label="<%=choice.getDescription("vi_VN") %>" value="<% String.valueOf(choice.getChoiceId()) %>" /></li>				
			<% } %>
		</ul>
	<% } %>
	<% } else { %>
	<div class="alert alert-warning">
	    <strong class="lead"><liferay-ui:message key="portlet.common.warn" /></strong>
	    <liferay-ui:message key="portlet.cms.no-polls"/>
	</div>
	<% } %>
</aui:row>
<aui:button-row>
	<aui:button type="submit" icon="icon-direction" value="send-vote" />
	<aui:button type="reset" icon="icon-charts" value="view-result" />
</aui:button-row>  
</aui:form>
</div>