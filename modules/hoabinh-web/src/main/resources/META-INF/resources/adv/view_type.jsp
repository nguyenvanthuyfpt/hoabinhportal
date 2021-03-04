<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.AdvTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1", "portlet.adv.type");
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/adv/edit_type.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<%
	int stt = 1;
%>

<aui:button-row>
	<aui:button type="submit" icon="icon-plus" href="<%=addURL %>" value="add-advtype"/>
</aui:button-row>

<liferay-ui:search-container total="<%=AdvTypeLocalServiceUtil.countTypeByG(groupId)%>" 
	var="searchContainer" delta="<%=delta %>" 
	deltaConfigurable="true"
	iteratorURL="<%=renderURL %>" 
  	emptyResultsMessage="<%=msgEmpty %>">
 <liferay-ui:search-container-results 
 		results="<%=AdvTypeLocalServiceUtil.getTypeByG(groupId, searchContainer.getStart(),searchContainer.getEnd())%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.AdvType" modelVar="type" keyProperty="typeid" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++) %>"/>
   	<liferay-ui:search-container-column-text name="name" property="name"/>
   	<liferay-ui:search-container-column-text name="description" property="description"/>
   	<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(type.getCreateDate()) %>"/>
   	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/adv/action_type.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>