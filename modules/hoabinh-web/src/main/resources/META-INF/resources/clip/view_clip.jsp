<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="vn.gov.hoabinh.service.ClipLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.ClipTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<% 
	String search = ParamUtil.getString(request, "search", "");
	String clipTypeId = ParamUtil.getString(request, "clipTypeId", "0");
	String name = ParamUtil.getString(request, "name", StringPool.BLANK);
	String description = ParamUtil.getString(request, "description", StringPool.BLANK);
	String title = ParamUtil.getString(request, "title", StringPool.BLANK);

	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	List<ClipType> listType = ClipTypeLocalServiceUtil.getClipTypeByG_L_A(groupId, PortalConstant.DEFAULT_LANGUAGE, true);
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1", "portlet.clip.item");
	renderURL.setParameter("clipTypeId", clipTypeId);
	renderURL.setParameter("name", name);
	renderURL.setParameter("search", "true");
	
	int start = delta * (cur-1);
	int end  = delta * cur;
	int totalClip = 0;
	List<Clip> listClip = new ArrayList<Clip>();
	
	if("true".equals(search)) {
		totalClip = ClipLocalServiceUtil.countClip(groupId, clipTypeId, name, title, true);
		listClip = ClipLocalServiceUtil.searchClip(groupId, clipTypeId, name, title, true, start, end);
	} else {
		totalClip = ClipLocalServiceUtil.countClipByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
		listClip = ClipLocalServiceUtil.getClipByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE, start, end);
	}
	
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/clip/edit_clip.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<portlet:actionURL var="searchClipURL" name="searchClip"/>

<aui:form action="<%=searchClipURL.toString()%>" method="post" name="fm" id="fm"> 
<aui:input name="cmd" type="hidden" value='<%= "search" %>' />

<div>
	<aui:row>
		<aui:col width="50">
			<aui:select name="clipTypeId" label="portlet.adv.type">
				<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<% for(ClipType type:listType){ %>
			    <aui:option value="<%=type.getId()%>"><%=type.getName() %></aui:option>
			    <%} %>
			</aui:select>
		</aui:col>
		<aui:col width="50">
			<aui:input name="desc" label="portlet.common.keyword" placeholder="portlet.common.input.keyword" value="<%=description %>" />
		</aui:col>
	</aui:row>
</div>

<aui:button-row>
	<aui:button type="button" icon="icon-plus" href="<%=addURL %>" value="add-clip"/>
	<aui:button type="submit" icon="icon-search" value="search"/>
</aui:button-row>

<liferay-ui:search-container total="<%=totalClip%>" 
	var="searchContainer" 
	delta="<%=delta %>" 
	deltaConfigurable="true" 
	iteratorURL="<%=renderURL %>"
  	emptyResultsMessage="<%=msgEmpty %>">
 <liferay-ui:search-container-results 
 		results="<%=listClip%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.Clip" modelVar="clip" keyProperty="id_" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++) %>"/>
   	<liferay-ui:search-container-column-image name="image" src="<%=clip.getImage()+"&imageThumbnail=1" %>" />
   	<liferay-ui:search-container-column-text name="name" property="name"/>
   	<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(clip.getCreatedDate()) %>"/>
   	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/clip/action_clip.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>
</aui:form>