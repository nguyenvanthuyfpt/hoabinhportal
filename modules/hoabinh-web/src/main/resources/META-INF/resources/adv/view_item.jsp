<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.gov.hoabinh.model.AdvType"%>
<%@page import="vn.gov.hoabinh.service.AdvTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.AdvItemLocalServiceUtil"%>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	String search = ParamUtil.getString(request, "search", "");
	String desc = ParamUtil.getString(request, "desc", "");
	long typeId = ParamUtil.getLong(request, "typeId", 0);
	int statusItem = ParamUtil.getInteger(request, "status", -1);
	
	List<AdvType> listType = AdvTypeLocalServiceUtil.getTypeByG(groupId);
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1", "portlet.adv.item");
	renderURL.setParameter("search", "true");
	renderURL.setParameter("typeId", String.valueOf(typeId));
	renderURL.setParameter("status", String.valueOf(statusItem));
	renderURL.setParameter("desc", desc);
	
	int start = delta * (cur-1);
	int end  = delta * cur;
	
	int totalItem = 0;
	List<AdvItem> listItem = new ArrayList<AdvItem>();
	if ("true".equals(search)) {
		totalItem = AdvItemLocalServiceUtil.countItem(groupId, typeId, desc, statusItem);
		listItem = AdvItemLocalServiceUtil.searchItem(groupId, typeId, desc, statusItem, start, end);
	} else {
		totalItem = AdvItemLocalServiceUtil.countItemByG(groupId);
		listItem = AdvItemLocalServiceUtil.getItemByG(groupId, start, end);
	}
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/adv/edit_item.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<portlet:actionURL var="searchItemURL" name="searchItem"/>

<aui:form action="<%=searchItemURL.toString()%>" method="post" name="fm" id="fm"> 
<aui:input name="cmd" type="hidden" value='<%= "search" %>' />

<div>
	<aui:row>
		<aui:col width="30">
			<aui:select name="typeId" label="portlet.adv.type">
				<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<% for(AdvType type:listType){ %>
			    <aui:option value="<%=type.getTypeId()%>"><%=type.getName() %></aui:option>
			    <%} %>
			</aui:select>
		</aui:col>
		<aui:col width="30">
			<aui:select name="status" label="status">
				<aui:option value="-1"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<aui:option value="1"><liferay-ui:message key="portlet.common.status.valid"/></aui:option>
				<aui:option value="0"><liferay-ui:message key="portlet.common.status.expired"/></aui:option>
			</aui:select>
		</aui:col>
		<aui:col width="30">
			<aui:input name="desc" label="portlet.common.keyword" placeholder="portlet.common.input.keyword" value="<%=desc %>" />
		</aui:col>
	</aui:row>
</div>

<aui:button-row>	
	<aui:button type="button" icon="icon-plus" href="<%=addURL %>" value="add-advitem"/>
	<aui:button type="submit" icon="icon-search" value="search"/>
</aui:button-row>

<liferay-ui:search-container total="<%=totalItem%>" 
	var="searchContainer" delta="<%=delta %>" 
	deltaConfigurable="true"
	iteratorURL="<%=renderURL %>"
  	emptyResultsMessage="<%=msgEmpty %>">
 <liferay-ui:search-container-results 
 		results="<%=listItem%>" />
		<liferay-ui:search-container-row className="vn.gov.hoabinh.model.AdvItem" modelVar="item" keyProperty="itemid" >
	   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++) %>"/>
	   	<liferay-ui:search-container-column-image name="image" src="<%=item.getName()+"&imageThumbnail=1" %>" />
	   	<liferay-ui:search-container-column-text name="description" property="description"/>
	   	<%
	  		String imgAnchored = PortalConstant.SRC_IMAGE+"/hoabinh/links.png";
	  		StringBuffer link = new StringBuffer();
	  		link.append(Validator.isNotNull(item.getUrl())?"<div><img src='"+imgAnchored+"'  title='"+item.getUrl()+"'/><div>":"&nbsp;");
	  	%>
	  	<liferay-ui:search-container-column-text name="link" value="<%=link.toString() %>" />
	   	<liferay-ui:search-container-column-text name="status" value="<%=item.getStatus()?"active":"expire"%>"/>	   
	   	<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(item.getCreateDate()) %>"/>
	   	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/adv/action_item.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>
</aui:form>