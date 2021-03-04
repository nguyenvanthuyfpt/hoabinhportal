<%@page import="vn.gov.hoabinh.model.FAQCategory"%>
<%@page import="com.liferay.portal.kernel.util.Portal"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.service.FAQQuestionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.FAQCategoryLocalServiceUtil"%>
<% 
	String categoryId = ParamUtil.getString(request, "categoryId", "0");
	String title = ParamUtil.getString(request, "title", StringPool.BLANK);
	String senderemail = ParamUtil.getString(request, "senderemail", StringPool.BLANK);
	String sentbyuser = ParamUtil.getString(request, "sentbyuser", StringPool.BLANK);
	String hasSearch = ParamUtil.getString(request, "hasSearch", StringPool.BLANK);
	
	boolean isFromTo = false;
	Date fromDate = new Date();
	Date toDate = new Date();
	
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	String tabs2 = ParamUtil.getString(request, "tabs2","0");
	String tabsName2 = "common.status.un-approve,common.status.approved";
	String tabsValue2 = "0,1";
	boolean approved = false;
	if (!"0".equals(tabs2)) {
		approved = true;
	}
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1","portlet.faq.question");
	renderURL.setParameter("tabs2",tabs2);
	
	int start = delta * (cur-1);
	int end  = delta * cur;
	int totalQuestion = 0;
	List<FAQQuestion> listQuestion = new ArrayList<FAQQuestion>();
	if (Validator.isNotNull(hasSearch)) {
		totalQuestion = FAQQuestionLocalServiceUtil.countQuestion(groupId, PortalConstant.DEFAULT_LANGUAGE, approved, isFromTo, Long.parseLong(categoryId), title, 
				sentbyuser, senderemail, fromDate, toDate, true);
		
		listQuestion = FAQQuestionLocalServiceUtil.searchQuestion(groupId, PortalConstant.DEFAULT_LANGUAGE, approved, isFromTo, Long.parseLong(categoryId), title, 
				sentbyuser, senderemail, fromDate, toDate, true, start, end);
	} else {
		totalQuestion = FAQQuestionLocalServiceUtil.countQuestionByG_L_A(groupId, PortalConstant.DEFAULT_LANGUAGE, approved);
		listQuestion = FAQQuestionLocalServiceUtil.getQuestionByG_L_A(groupId, PortalConstant.DEFAULT_LANGUAGE,approved, start, end);
	}
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/faq/edit_question.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<portlet:renderURL var="tabURL">
	<portlet:param name="jspPage" value="/faq/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.faq.question" />
	<portlet:param name="tabs2" value="<%=tabs2 %>" />
</portlet:renderURL>

<portlet:actionURL var="searchQuestionURL" name="searchQuestion"/>

<liferay-ui:tabs
    names='<%=tabsName2%>'
    tabsValues='<%=tabsValue2%>'
    param="tabs2"
    url="<%=tabURL.toString()%>"
> 

</liferay-ui:tabs>


<aui:form action="<%=searchQuestionURL.toString()%>" method="post" name="fm" id="fm"> 
<aui:input name="hasSearch" type="hidden" value='<%= "search" %>' />
<aui:input name="tabs2" type="hidden" value='<%= tabs2 %>' />
<div>
	<aui:row>
		<aui:col width="50">
			<aui:select name="categoryId" label="portlet.faq.category" >
				<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<% for(FAQCategory cat:categories){ %>
			    <aui:option value="<%=cat.getId() %>" selected="<%= cat.getId()==Long.parseLong(categoryId) %>"><%=cat.getName() %></aui:option>
			    <%} %>
			</aui:select>
		</aui:col>
		<aui:col width="50">
			<aui:input  name="title" label="portlet.faq.question.title" placeholder="portlet.faq.input.title" value="<%=title %>"/>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="50">
			<aui:input  name="sentbyuser" label="portlet.faq.question.sender" placeholder="portlet.faq.input.sender" value="<%=sentbyuser %>"/>
		</aui:col>
		<aui:col width="50">
			<aui:input  name="senderemail" label="portlet.faq.question.email" placeholder="portlet.faq.input.email" value="<%=senderemail %>"/>
		</aui:col>	
	</aui:row>
</div>

<aui:button-row>
	<%if(!approved){ %>	
	<aui:button type="button" icon="icon-plus" href="<%=addURL %>" value="add-question"/>
	<%} %>
	<aui:button type="submit" icon="icon-search" value="search"/>
</aui:button-row>

<liferay-ui:search-container total="<%=totalQuestion%>" 
	var="searchContainer" delta="<%=delta %>" 
	iteratorURL="<%=renderURL %>"
	deltaConfigurable="true" 
  	emptyResultsMessage="<%=msgEmpty %>">
  
 <liferay-ui:search-container-results 
 		results="<%=listQuestion%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.FAQQuestion" modelVar="question" keyProperty="id_" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++) %>"/>
   	
   	<portlet:renderURL var="editURL">
		<portlet:param name="jspPage" 	value="/faq/edit_question.jsp" />
		<portlet:param name="questionId" value="<%=String.valueOf(question.getId())%>" />
	</portlet:renderURL>
	<%
		StringBuffer sb = new StringBuffer();
		FAQCategory faqCat = null;
		try {
			faqCat = FAQCategoryLocalServiceUtil.getCategory(question.getCategoryId());
		} catch (Exception ex) {}
		
		sb.append("<div>");
		sb.append("<b>"+question.getTitle()+"</b><br/>");
		if (Validator.isNotNull(faqCat)) {
			sb.append("<i>"+faqCat.getName()+"</i><br/>");	
		}   		
		sb.append("</div>");
	 %>
   	<liferay-ui:search-container-column-text name="title" href="<%=editURL %>" value="<%=sb.toString() %>"/>
   	<% if(!approved) { %>
   	<liferay-ui:search-container-column-text name="sent-date" value="<%=Validator.isNotNull(question.getSentDate())?sdf_dmy.format(question.getSentDate()):"" %>"/>
   	<liferay-ui:search-container-column-text name="portlet.faq.question.sent-by" property="sentByUser"/>
   	<% } else { %>
   	<liferay-ui:search-container-column-text name="approve-date" value="<%=Validator.isNotNull(question.getModifiedDate()) ? sdf_dmy.format(question.getModifiedDate()):"" %>"/>
   	<liferay-ui:search-container-column-text name="portlet.faq.question.approve-by" property="modifiedByUser"/>
   	<% } %>
   	
   	<!-- <liferay-ui:search-container-column-jsp name="portlet.common.action" path="/faq/action_question.jsp" /> -->
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />
</liferay-ui:search-container>
</aui:form>