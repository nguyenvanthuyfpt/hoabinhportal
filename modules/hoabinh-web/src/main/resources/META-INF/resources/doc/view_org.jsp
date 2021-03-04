<%@page import="vn.gov.hoabinh.service.vdocOrgLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1", "portlet.doc.general-manage");
	renderURL.setParameter("tabs2", "portlet.doc.org");
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/doc/edit_org.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<aui:button-row>
	<aui:button type="submit" icon="icon-plus" href="<%=addURL %>" value="add-doc-org"/>
</aui:button-row>

<liferay-ui:search-container total="<%=vdocOrgLocalServiceUtil.countOrgByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE)%>" 
	var="searchContainer" delta="<%=delta %>" 
	iteratorURL="<%=renderURL %>"
	deltaConfigurable="true" 
  	emptyResultsMessage="<%=msgEmpty %>">
  
 <liferay-ui:search-container-results 
 		results="<%=vdocOrgLocalServiceUtil.getOrgByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE, searchContainer.getStart(),searchContainer.getEnd())%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.vdocOrg" modelVar="org" keyProperty="orgid" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++)%>"/>
   	<liferay-ui:search-container-column-text name="code" property="code"/>
   	<liferay-ui:search-container-column-text name="name" property="name"/>
   	<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(org.getCreatedDate()) %>"/>
   	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/doc/action_org.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>