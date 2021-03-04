<%@page import="vn.gov.hoabinh.model.VContact"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.gov.hoabinh.service.VContactLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.ClipTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.ClipLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.AdvTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@include file="/contact/init.jsp" %>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	String tabs1 = ParamUtil.getString(request, "tabs1","0");
	String tabsName1 = "common.status.un-approve,common.status.approved,common.status.reject";
	String tabsValue1 = "0,1,2";
	int status = 0;
	if (!"0".equals(tabs1)) {
		status = Integer.parseInt(tabs1);
	}
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1", String.valueOf(status));
%>
<liferay-ui:success key="portlet.common.action.successfully" message="Your action has process successfully!"/>
<portlet:renderURL var="tabURL">
	<portlet:param name="jspPage" value="/contact/view.jsp"/>
	<portlet:param name="tabs1" value="<%=tabs1 %>" />
</portlet:renderURL>

<liferay-ui:tabs
    names='<%=tabsName1%>'
    tabsValues='<%=tabsValue1%>'
    param="tabs1"
    url="<%=tabURL.toString()%>"
> 

</liferay-ui:tabs>

<aui:button-row>
	<aui:button type="submit" icon="icon-search" value="search"/>
</aui:button-row>

<liferay-ui:search-container total="<%=VContactLocalServiceUtil.countByG_S(groupId, status) %>" 
	var="searchContainer" delta="<%=delta %>" 
	deltaConfigurable="true" 
	iteratorURL="<%=renderURL %>"
  	emptyResultsMessage="<%=msgEmpty %>"
 >
  	
 <liferay-ui:search-container-results 
 		results="<%=VContactLocalServiceUtil.getByG_S(groupId, status, searchContainer.getStart(),searchContainer.getEnd())%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.VContact" modelVar="vcontact" keyProperty="id_" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++) %>"/>
   	
   	<portlet:renderURL var="editURL">
		<portlet:param name="jspPage" 	value="/contact/edit.jsp" />
		<portlet:param name="Id" value="<%=String.valueOf(vcontact.getId())%>" />
	</portlet:renderURL>
   	
   	<liferay-ui:search-container-column-text name="portlet.contactview.guest-name" property="guestName"/>
   	<liferay-ui:search-container-column-text name="portlet.contactview.email" property="email"/>
   	<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(vcontact.getCreatedDate()) %>"/>
    <liferay-ui:search-container-column-jsp name="portlet.common.action" path="/contact/action.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>