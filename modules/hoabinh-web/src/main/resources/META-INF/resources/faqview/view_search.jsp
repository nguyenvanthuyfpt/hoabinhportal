<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/faqview/init.jsp" %>

<%@page import="java.util.*"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="vn.gov.hoabinh.model.FAQQuestion"%>
<%@page import="vn.gov.hoabinh.model.FAQCategory"%>
<%@page import="vn.gov.hoabinh.model.FAQAnswer"%>
<%@page import="vn.gov.hoabinh.service.FAQQuestionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.FAQCategoryLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortletKeys" %>
<% 
	String categoryId = ParamUtil.getString(request, "categoryId", "0");
	String title = ParamUtil.getString(request, "title", StringPool.BLANK);
	String senderemail = ParamUtil.getString(request, "senderemail", StringPool.BLANK);
	String sentbyuser = ParamUtil.getString(request, "sentbyuser", StringPool.BLANK);
	String hasSearch = ParamUtil.getString(request, "search", StringPool.BLANK);
	
	int index = 1;
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = Integer.parseInt(numSel);
	String msgEmpty = "khong-co-du-lieu";
	
	List<FAQCategory> categories = FAQCategoryLocalServiceUtil.getByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	
	Date fromDate = new Date();
	Date toDate = new Date();
	boolean isFromTo = false;
	boolean approved = true;
	
	SearchContainer<FAQQuestion> searchContainer = new SearchContainer<FAQQuestion>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, renderURL, null, msgEmpty);
	System.out.println("## hasSearch ##" + hasSearch);
	
	int total = ("".equals(hasSearch)) ? (int) FAQQuestionLocalServiceUtil.countApprovedQuestions(groupId) :
		(int) FAQQuestionLocalServiceUtil.countQuestion(groupId, PortalConstant.DEFAULT_LANGUAGE, approved, isFromTo, 
				Long.parseLong(categoryId), title, sentbyuser, senderemail, fromDate, toDate, true);
	
	List<FAQQuestion> questions = new ArrayList<FAQQuestion>();	
	if(total > 0){
		searchContainer.setTotal(total);
		int start = searchContainer.getStart();
		int end = searchContainer.getEnd();
		questions = ("".equals(hasSearch)) ? FAQQuestionLocalServiceUtil.getApprovedQuestions(groupId, start, end):
			FAQQuestionLocalServiceUtil.searchQuestion(groupId, PortalConstant.DEFAULT_LANGUAGE, approved, isFromTo, 
					Long.parseLong(categoryId), title, sentbyuser, senderemail, fromDate, toDate, true, start, end);
	}
%>

<portlet:renderURL var="searchURL">
	<portlet:param name="jspPage" value="/faqview/view.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
	<portlet:param name="categroyId" value="<%=categoryId %>"/>
</portlet:renderURL>

<portlet:actionURL var="traCuuCauHoi" name="searchQuestion">
</portlet:actionURL>

<form action="<%=traCuuCauHoi.toString()%>" method="post">
<div class="box_border">
	<div>
		<aui:row>
			<aui:col width="50">
				<aui:select name="categoryId" label="portlet.faq.category" >
					<aui:option value="-1"><liferay-ui:message key="portlet.common.select"/></aui:option>
					<% for(FAQCategory cat:categories){ %>
				    <aui:option value="<%=cat.getId() %>" selected="<%= cat.getId()==Long.parseLong(categoryId) %>"><%=cat.getName() %></aui:option>
				    <%} %>
				</aui:select>
			</aui:col>
			<aui:col width="50">
				<aui:input  name="title" label="portlet.faq.question.title" value="<%=title %>" placeholder="portlet.faq.input.title"/>
			</aui:col>
		</aui:row>
		
		<aui:row>
			<aui:col width="50">
				<aui:input  name="sentbyuser" label="portlet.faq.question.sender" value="<%=sentbyuser %>" placeholder="portlet.faq.input.sender"/>
			</aui:col>
			<aui:col width="50">
				<aui:input  name="senderemail" label="portlet.faq.question.email" value="<%=senderemail %>" placeholder="portlet.faq.input.email"/>
			</aui:col>	
		</aui:row>
		
		<aui:button-row>
			<aui:button type="submit" icon="icon-search" value="search"/>
			<aui:button type="button" icon="icon-remove" value="cancel" />
			<aui:button type="button" icon="icon-envelope" value="send-question" href="<%=sendURL.toString() %>"/>
		</aui:button-row> 
	</div>
	
	<div class="table-responsive">
		<table class="table table-bordered table-hover">
		<tr>
			<th width="5%"><liferay-ui:message key="portlet.common.stt"/></th>
			<th width="75%"><liferay-ui:message key="portlet.faq.question.title"/></th>
			<th width="20%"><liferay-ui:message key="portlet.faq.send-date"/></th>
		</tr>
		<%  int i=1;
			if (Validator.isNotNull(questions) && questions.size()>0){
			for (FAQQuestion question : questions) {
			 %>
			<portlet:renderURL var="viewQuestion" > 
				 <portlet:param name="questionId" value="<%=String.valueOf(question.getId()) %>" /> 
				 <portlet:param name="mvcRenderCommandName" value="view_detail"/>
			 </portlet:renderURL>
		<tr>
			<td><label class="oep-label"><%=searchContainer.getStart() + index++ %></label></td>
			<td>
				<div><a href="<%=viewQuestion%>"><%=question.getTitle() %></a></div>
				<div>
					<liferay-ui:icon
						    iconCssClass="icon-user"
						    label="<%= true %>"
						    message="<%=question.getSentByUser() %>"
						    url="<%= viewQuestion %>"
						/>
					<liferay-ui:icon
						    iconCssClass="icon-envelope"
						    label="<%= true %>"
						    message="<%=question.getSenderEmail() %>"
						    url="<%= viewQuestion %>"
						/>
				</div>
			</td>
			<td><%=FormatData.parseDateToTringType3(question.getSentDate()) %></td>
		</tr>
		<% 	
			}} else {
		%>
		<tr>
			<td colspan="3">
				<div class="alert alert-info" style="float:left;width:100%;">
				    <liferay-ui:message key="portlet.faq.no-question"/>
				</div>
			</td>
		</tr>
		<% } %>
		</table>		
	</div>
	
	<div id = "pagination">
		<liferay-ui:search-paginator  searchContainer="<%= searchContainer %>"  type="approximate"/>
	</div>
</div>
</form>