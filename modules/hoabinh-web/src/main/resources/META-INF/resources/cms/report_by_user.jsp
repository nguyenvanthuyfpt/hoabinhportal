<%@page import="vn.gov.hoabinh.service.VcmsArticleLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%
	
	String portletResource = ParamUtil.getString(request, "portletResource");
	
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1", "portlet.cms.statistics");
	renderURL.setParameter("tabs2", "portlet.statistics.by.user");
	
	int begin = delta * (cur-1);
	int end  = delta * cur;
	
	int totalUser = UserLocalServiceUtil.getUsersCount();
	List<User> usersList = UserLocalServiceUtil.getUsers(begin, end);
%>
<portlet:resourceURL var="exportReportURL">
	<portlet:param name="<%= Constants.CMD %>" value="exportCSV"/>
	<portlet:param name="reportType" value="<%=PortalConstant.ACTION_REPORT_USER %>"/>
	<portlet:param name="portionId" value="<%=portionId %>"/>
	<portlet:param name="parentId" value="<%=parentId %>"/>
</portlet:resourceURL>

<portlet:actionURL var="changePortionURL" name="crud_category"/>

<style>
#exportlinks th {
	padding: 5px 20px 5px 20px;
}
</style>

<script>
	function <portlet:namespace/>onChangePortion(plid){
		var form = document.getElementById("<portlet:namespace />fm");
		form.action = '<%= changePortionURL  %>';
		form.submit();
	}
</script>

<aui:form action="<%=changePortionURL.toString()%>" method="post" name="fmReport" id="fmReport">  
<aui:input name="cmd" type="hidden" value='<%= "report_user" %>' />

<aui:row>
	<aui:col width="50">
		<aui:select name="portionId" label="portlet.cms.article.portion" onChange = '<%=renderResponse.getNamespace() + "changePortionReport(this.value)"%>'>
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(VcmsPortion portion:listPortion){ %>
		    <aui:option value="<%=portion.getPortionId()%>"><%=portion.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
	
	<aui:col width="50">
		<aui:select name="parentId" label="portlet.cms.article.category.root" >
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<%
				out.println(ActionUtil.getCategoryTree(groupId, "vi_VN", portionId, parentId, categoryId));
			%>
		</aui:select>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input name="fromDate" label="portlet.common.search.from" value="<%=fromDate%>"/>
	</aui:col>
	<aui:col width="50">
		<aui:input name="toDate" label="portlet.common.search.to" value="<%=toDate%>"/>
	</aui:col>
</aui:row>

<aui:button-row>
	<aui:col width="100">
		<aui:button type="submit" icon="icon-search" value="search"/>
		<aui:button type="button" icon="icon-bar-chart" href="<%=exportReportURL %>" value="action.report"/>
	</aui:col>
</aui:button-row>

<liferay-ui:search-container 
	total="<%=totalUser%>" 
	var="searchContainer" delta="<%=delta %>" 
	deltaConfigurable="true" 
	iteratorURL="<%=renderURL %>"
  	emptyResultsMessage="<%=msgEmpty %>">
  
	<liferay-ui:search-container-results results="<%=usersList%>" />
		<liferay-ui:search-container-row className="com.liferay.portal.kernel.model.User" modelVar="user" keyProperty="userId" >
			<% if(!user.getDefaultUser()) { %>
		  	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() +stt++) %>"/>
		  	<liferay-ui:search-container-column-text name="portlet.cms.username" property="screenName"/>
		  	<%
		  		String fullName = user.getFirstName() + " " + user.getLastName();
		  	%>
		  	<liferay-ui:search-container-column-text name="portlet.cms.fullname" value="<%=fullName %>"/>
		  	<liferay-ui:search-container-column-text name="portlet.cms.number.created-by" value="<%=String.valueOf(VcmsArticleLocalServiceUtil.countReportUser(groupId, PortalConstant.DEFAULT_LANGUAGE, String.valueOf(user.getUserId()), "create")) %>"/>
		  	<liferay-ui:search-container-column-text name="portlet.cms.number.modified-by" value="<%=String.valueOf(VcmsArticleLocalServiceUtil.countReportUser(groupId, PortalConstant.DEFAULT_LANGUAGE, String.valueOf(user.getUserId()), "modify")) %>"/>
		  	<liferay-ui:search-container-column-text name="portlet.cms.number.published-by" value="<%=String.valueOf(VcmsArticleLocalServiceUtil.countReportUser(groupId, PortalConstant.DEFAULT_LANGUAGE, String.valueOf(user.getUserId()), "published")) %>"/>
		  	<% } %>
		</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>
</aui:form>