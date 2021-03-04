<%@page import="vn.gov.hoabinh.service.LinksLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.AdvItemLocalServiceUtil"%>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	String search = ParamUtil.getString(request, "search", "");
	long linkGroupId = ParamUtil.getLong(request, "linkGroupId", 0);
	String keyword = ParamUtil.getString(request, "keyword", StringPool.BLANK);
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1", "portlet.link.linkitem");
	renderURL.setParameter("search", "true");
	renderURL.setParameter("linkGroupId", String.valueOf(linkGroupId));
	renderURL.setParameter("keyword", keyword);
	
	int start = delta * (cur-1);
	int end  = delta * cur;
	int totalLinks = 0;
	List<Links> listLinks = new ArrayList<Links>();
	
	if("true".equals(search)) {
		totalLinks = LinksLocalServiceUtil.countLinkSearch(groupId, linkGroupId, keyword);
		listLinks = LinksLocalServiceUtil.searchItem(groupId, linkGroupId, keyword, start, end);
	} else {
		totalLinks = LinksLocalServiceUtil.countByGroupId(groupId);
		listLinks = LinksLocalServiceUtil.getByGroupId(groupId, start, end);
	}
	
	List<LinkGroup> listLinkGroup = LinkGroupLocalServiceUtil.getByGroupId(groupId);
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/link/edit_links.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<portlet:actionURL var="searchLinkURL" name="searchLink"/>

<aui:form action="<%=searchLinkURL.toString()%>" method="post" name="fm" id="fm"> 
<aui:input name="cmd" type="hidden" value='<%= "search" %>' />

<aui:row>
	<aui:col width="50">
		<aui:select name="linkGroupId" label="portlet.link.group" >
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(LinkGroup linkGroup:listLinkGroup){ %>
		    <aui:option value="<%=linkGroup.getLinkgroupId() %>" selected="<%=(linkGroupId==linkGroup.getLinkgroupId())%>"><%=linkGroup.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
	<aui:col width="40">
		<aui:input name="keyword" label="portlet.common.keyword" placeholder="portlet.common.input.keyword"  value="<%=keyword %>" />
	</aui:col>
</aui:row>

<aui:button-row>
	<aui:button type="button" icon="icon-plus" href="<%=addURL %>" value="add-link"/>
	<aui:button type="submit" icon="icon-search" value="search"/>
</aui:button-row>

<liferay-ui:search-container total="<%=totalLinks%>" 
	var="searchContainer" delta="<%=delta %>" 
	deltaConfigurable="true" 
	iteratorURL="<%=renderURL %>"
  	emptyResultsMessage="<%=msgEmpty %>">
 <liferay-ui:search-container-results 
 		results="<%=listLinks%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.Links" modelVar="link" keyProperty="linkid" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++) %>"/>
   	<liferay-ui:search-container-column-text name="name" property="name"/>
   	<liferay-ui:search-container-column-text name="description" property="description"/>
   	<liferay-ui:search-container-column-text name="url" property="url"/>
   	<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(link.getCreatedDate()) %>"/>
   	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/link/action_links.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>
</aui:form>