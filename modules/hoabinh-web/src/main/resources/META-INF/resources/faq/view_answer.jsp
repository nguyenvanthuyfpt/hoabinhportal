<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.gov.hoabinh.service.FAQQuestionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.FAQQuestion"%>
<%@page import="vn.gov.hoabinh.model.FAQCategory"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.service.FAQAnswerLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.FAQCategoryLocalServiceUtil"%>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	String tabs2 = ParamUtil.getString(request, "tabs2","0");
	String tabsName2 = "common.status.un-approve,common.status.approved";
	String tabsValue2 = "0,1";
	String keyword = ParamUtil.getString(request, "keyword");
	String categoryId = ParamUtil.getString(request, "categoryId", "0");
	boolean approved = false;
	if (!"0".equals(tabs2)) {
		approved = true;
	}
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1","portlet.faq.answer");
	renderURL.setParameter("tabs2",tabs2);
	
	int start = delta * (cur-1);
	int end  = delta * cur;
	int totalAnswer = 0;
	List<FAQAnswer> listAnswer = new ArrayList<FAQAnswer>();
	
	/* if (Validator.isNotNull(hasSearch)) {
		totalQuestion = FAQQuestionLocalServiceUtil.countQuestion(groupId, PortalConstant.DEFAULT_LANGUAGE, approved, isFromTo, Long.parseLong(categoryId), title, 
				sentbyuser, senderemail, fromDate, toDate, true);
		
		listQuestion = FAQQuestionLocalServiceUtil.searchQuestion(groupId, PortalConstant.DEFAULT_LANGUAGE, approved, isFromTo, Long.parseLong(categoryId), title, 
				sentbyuser, senderemail, fromDate, toDate, true, start, end);
	} else { */
		totalAnswer = FAQAnswerLocalServiceUtil.countByApprove(approved);
		listAnswer = FAQAnswerLocalServiceUtil.getByApprove(approved, start, end);
	//}
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/faq/edit_answer.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<portlet:renderURL var="tabURL">
	<portlet:param name="jspPage" value="/faq/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.faq.answer" />
	<portlet:param name="tabs2" value="<%=tabs2 %>" />
</portlet:renderURL>

<portlet:actionURL var="searchAnswerURL" name="searchAnswer"/>

<liferay-ui:tabs
    names='<%=tabsName2%>'
    tabsValues='<%=tabsValue2%>'
    param="tabs2"
    url="<%=tabURL.toString()%>"
> 
</liferay-ui:tabs>

<aui:form action="<%=searchAnswerURL.toString()%>" method="post" name="fm" id="fm"> 
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
			<aui:input  name="keyword" label="portlet.common.keyword" placeholder="portlet.common.input.keyword" value="<%=keyword %>"/>
		</aui:col>
	</aui:row>
</div>

<aui:button-row>
	<aui:button type="submit" icon="icon-search" value="search"/>
</aui:button-row>

<liferay-ui:search-container total="<%=totalAnswer%>" 
	var="searchContainer" delta="<%=delta %>" 
	iteratorURL="<%=renderURL %>"
	deltaConfigurable="true" 
  	emptyResultsMessage="<%=msgEmpty %>">
  
 <liferay-ui:search-container-results 
 		results="<%=listAnswer%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.FAQAnswer" modelVar="answer" keyProperty="id_" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++)%>"/>
    <%
    	StringBuffer sb = new StringBuffer();
    	FAQQuestion question = null;
		FAQCategory faqCat = null;
		try {			
			question = FAQQuestionLocalServiceUtil.getQuestion(answer.getQuestionid());
			if (Validator.isNotNull(question)) {
				faqCat = FAQCategoryLocalServiceUtil.getCategory(question.getCategoryId());	
			}
			
			sb.append("<div>");
			sb.append("<b>"+question.getTitle()+"</b><br/>");
			if (Validator.isNotNull(faqCat)) {
				sb.append("<i>"+faqCat.getName()+"</i><br/>");	
			}   		
			sb.append("</div>");
		} catch (Exception ex) {}
		
		 		
   	%>
   	<liferay-ui:search-container-column-text name="question" value="<%=Validator.isNotNull(question)?sb.toString():"" %>"/>
   	<%
  		String imgFile = themeDisplay.getPathThemeImages()+"/common/clip.png";
  		StringBuffer sbFile = new StringBuffer();
  		sbFile.append(Validator.isNotNull(answer.getAttachName())?"<div><img src='"+imgFile+"' /><div>":"&nbsp;");
  	%>
  	<liferay-ui:search-container-column-text name="attachment" value="<%=sbFile.toString() %>" />   	
   	<% if(approved){ %>
   	<liferay-ui:search-container-column-text name="approve-date" value="<%=Validator.isNotNull(answer.getApprovedDate())? sdf_dmy.format(answer.getApprovedDate()):"" %>"/>
   	<liferay-ui:search-container-column-text name="approve-by" property="approvedByUser"/>
   	<% } else { %>
   	<liferay-ui:search-container-column-text name="answer-date" value="<%=Validator.isNotNull(answer.getAnsweredDate()) ?sdf_dmy.format(answer.getAnsweredDate()):"" %>"/>
   	<liferay-ui:search-container-column-text name="answer-by" property="answeredByUser"/>
   	<% } %>
   	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/faq/action_answer.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>
</aui:form>