<%@page import="vn.gov.hoabinh.service.FAQQuestionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.FAQCategoryLocalServiceUtil"%>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/faq/edit_category.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<aui:button-row>
	<aui:button type="submit" icon="icon-plus" href="<%=addURL %>" value="add-faqcategory"/>
</aui:button-row>

<liferay-ui:search-container total="<%=FAQCategoryLocalServiceUtil.countByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE)%>" 
	var="searchContainer" delta="<%=delta %>" 
	deltaConfigurable="true" 
  	emptyResultsMessage="<%=msgEmpty %>">
  
 <liferay-ui:search-container-results 
 		results="<%=FAQCategoryLocalServiceUtil.getByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE, searchContainer.getStart(),searchContainer.getEnd())%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.FAQCategory" modelVar="category" keyProperty="id_" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++)%>"/>
   	<liferay-ui:search-container-column-text name="name" property="name"/>
   	<liferay-ui:search-container-column-text name="portlet.faq.number.question.un-approve" value="<%= String.valueOf(FAQQuestionLocalServiceUtil.countQuestionByG_L_C_A(groupId, PortalConstant.DEFAULT_LANGUAGE, category.getId(), false)) %>"/>
   	<liferay-ui:search-container-column-text name="portlet.faq.number.question.approve" value="<%= String.valueOf(FAQQuestionLocalServiceUtil.countQuestionByG_L_C_A(groupId, PortalConstant.DEFAULT_LANGUAGE, category.getId(), true)) %>"/>
   	<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(category.getCreatedDate()) %>"/>
   	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/faq/action_category.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>
