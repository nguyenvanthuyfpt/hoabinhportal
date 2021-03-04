<%@page import="vn.gov.hoabinh.service.VLegalSignerLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1", "portlet.legal.general-manage");
	renderURL.setParameter("tabs2","portlet.legal.signer");
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/legal/edit_signer.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<aui:button-row>
	<aui:button type="submit" icon="icon-plus" href="<%=addURL %>" value="add-legal-signer"/>
</aui:button-row>

<liferay-ui:search-container total="<%=VLegalSignerLocalServiceUtil.countSignerByGroupId(groupId)%>" 
	var="searchContainer" delta="<%=delta %>" 
	deltaConfigurable="true"
	iteratorURL="<%=renderURL %>" 
  	emptyResultsMessage="<%=msgEmpty %>">
  
 <liferay-ui:search-container-results 
 		results="<%=VLegalSignerLocalServiceUtil.getSignerByGroupId(groupId, searchContainer.getStart(),searchContainer.getEnd())%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.VLegalSigner" modelVar="signer" keyProperty="sigid" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++)%>"/>
   	<liferay-ui:search-container-column-text name="first-name" property="firstName"/>
   	<liferay-ui:search-container-column-text name="last-name" property="lastName"/>
   	<%-- <%
	  		String imgStatus = themeDisplay.getPathThemeImages()+"/common/rss.png";
	  		StringBuffer status = new StringBuffer();
	  		status.append(signer.getStatus()?"<div><img src='"+imgStatus+"' /><div>":"&nbsp;");
	 %>
	<liferay-ui:search-container-column-text name="status" value="<%=status.toString() %>" />- --%>
   	<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(signer.getCreatedDate()) %>"/>
   	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/legal/action_signer.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>