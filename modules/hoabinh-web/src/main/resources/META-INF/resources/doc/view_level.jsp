<%@page import="vn.gov.hoabinh.service.vdocLevelLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1","portlet.doc.general-manage");
	renderURL.setParameter("tabs2","portlet.doc.level");
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/doc/edit_level.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<aui:button-row>
		<aui:button type="submit" icon="icon-plus" href="<%=addURL %>" value="add-doc-level"/>
	</aui:button-row>

<liferay-ui:search-container total="<%=vdocLevelLocalServiceUtil.countLevelByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE)%>" 
	var="searchContainer" delta="<%=delta %>" deltaConfigurable="true" 
  	emptyResultsMessage="<%=msgEmpty %>">
  
 <liferay-ui:search-container-results 
 		results="<%=vdocLevelLocalServiceUtil.getLevelByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE, searchContainer.getStart(),searchContainer.getEnd())%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.vdocLevel" modelVar="level" keyProperty="levelid" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++)%>"/>
   	<liferay-ui:search-container-column-text name="name" property="name"/>
   	<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(level.getCreatedDate()) %>"/>
   	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/doc/action_level.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>