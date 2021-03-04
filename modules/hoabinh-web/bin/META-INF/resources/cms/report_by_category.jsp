<%@page import="vn.gov.hoabinh.service.VcmsArticleLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VcmsPortion"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VcmsPortionLocalServiceUtil"%>
<% 
	List<User> listUsers = UserLocalServiceUtil.getUsers(0, UserLocalServiceUtil.getUsersCount());
	
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	int begin = delta * (cur-1);
	int end  = delta * cur;
	
	int totalCategory = 0;
	List<VcmsCategory> resultCategory = new ArrayList<VcmsCategory>();
	if ("0".equals(portionId)) {
		resultCategory = VcmsCategoryLocalServiceUtil.getCategoriesByParent(groupId, "vi_VN", parentId, begin, end);
		totalCategory = VcmsCategoryLocalServiceUtil.countCategoriesByParent(groupId, "vi_VN", parentId);
	} else {
		resultCategory = VcmsCategoryLocalServiceUtil.getCategoriesByP_P(groupId, "vi_VN", parentId, portionId, begin, end);
		totalCategory = VcmsCategoryLocalServiceUtil.countCategoriesByP_P(groupId, "vi_VN", parentId, portionId);
	}
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1", "portlet.cms.statistics");
	renderURL.setParameter("tabs2", "portlet.statistics.by.category");
%>

<portlet:resourceURL var="exportReportURL">
	<portlet:param name="<%= Constants.CMD %>" value="exportCSV"/>
	<portlet:param name="reportType" value="<%=PortalConstant.ACTION_REPORT_CATEGORY %>"/>
	<portlet:param name="portionId" value="<%=portionId %>"/>
	<portlet:param name="parentId" value="<%=parentId %>"/>
</portlet:resourceURL>

<portlet:actionURL var="changePortionURL" name="crud_category"/>

<aui:form action="<%=changePortionURL.toString()%>" method="post" name="fmReport" id="fmReport">  
<aui:input name="cmd" type="hidden" value='<%= "report_category" %>' />

<aui:row>
	<aui:col width="100">
		<aui:select name="userId" label="user">
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(User u:listUsers){ 
				if (!u.getDefaultUser()){
			%>
		    <aui:option value="<%=u.getUserId()%>"><%=u.getFirstName() +" "+u.getLastName() %></aui:option>
		    <%}} %>
		</aui:select>
	</aui:col>
</aui:row>

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
	<aui:button type="submit" icon="icon-search" value="search"/>
	<aui:button type="button" icon="icon-bar-chart" href="<%=exportReportURL %>" value="action.report"/>
</aui:button-row>

<liferay-ui:search-container 
	total="<%=totalCategory%>" 
	var="searchContainer" delta="<%=delta %>" 
	deltaConfigurable="true" 
	iteratorURL="<%=renderURL %>"
  	emptyResultsMessage="<%=msgEmpty %>">
  
	<liferay-ui:search-container-results results="<%=resultCategory%>" />
		<liferay-ui:search-container-row className="vn.gov.hoabinh.model.VcmsCategory" modelVar="category" keyProperty="categoryid" >
		  	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() +stt++) %>"/>
		  	<liferay-ui:search-container-column-text name="name" property="name"/>
		  	<%	for (VcmsStatus status:listStatus) { %>
		  	<liferay-ui:search-container-column-text name="<%=status.getName() %>" value="<%=String.valueOf(VcmsArticleLocalServiceUtil.countReportCategory(groupId, PortalConstant.DEFAULT_LANGUAGE, status.getStatusId(), category.getCategoryId())) %>"/>		  	
		  	<% } %>
		</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>

</aui:form>