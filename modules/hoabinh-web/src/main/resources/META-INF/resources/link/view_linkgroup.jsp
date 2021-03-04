<%@page import="vn.gov.hoabinh.service.LinkGroupLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.ClipTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.ClipLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.AdvTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/link/edit_linkgroup.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<aui:button-row>
	<aui:button type="submit" icon="icon-plus" href="<%=addURL %>" value="add-linkgroup"/>
</aui:button-row>

<liferay-ui:search-container total="<%=LinkGroupLocalServiceUtil.countByGroupId(groupId)%>" 
	var="searchContainer" delta="<%=delta %>" deltaConfigurable="true" 
  	emptyResultsMessage="<%=msgEmpty %>">
 <liferay-ui:search-container-results 
 		results="<%=LinkGroupLocalServiceUtil.getByGroupId(groupId, searchContainer.getStart(),searchContainer.getEnd())%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.LinkGroup" modelVar="linkgroup" keyProperty="linkgroupid" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++) %>"/>
   	<liferay-ui:search-container-column-text name="name" property="name"/>
   	<liferay-ui:search-container-column-text name="description" property="description"/>
   	<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(linkgroup.getCreatedDate()) %>"/>
   	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/link/action_linkgroup.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>