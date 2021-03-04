<%@page import="vn.gov.hoabinh.service.vdocFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1", "portlet.doc.general-manage");
	renderURL.setParameter("tabs2", "portlet.doc.field");
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/doc/edit_field.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<aui:button-row>
	<aui:button type="submit" icon="icon-plus" href="<%=addURL %>" value="add-legal-field"/>
</aui:button-row>

<liferay-ui:search-container total="<%=vdocFieldLocalServiceUtil.countFieldByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE)%>" 
	var="searchContainer" delta="<%=delta %>"
	iteratorURL="<%=renderURL %>"
	deltaConfigurable="true" 
  	emptyResultsMessage="<%=msgEmpty %>">
  
 <liferay-ui:search-container-results 
 		results="<%=vdocFieldLocalServiceUtil.getFieldByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE, searchContainer.getStart(),searchContainer.getEnd())%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.vdocField" modelVar="field" keyProperty="fieldid" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++)%>"/>
   	<liferay-ui:search-container-column-text name="name" property="name"/>
   	<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(field.getCreatedDate()) %>"/>
   	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/doc/action_field.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>