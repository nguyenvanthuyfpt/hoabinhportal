<%
	String tabs2 = ParamUtil.getString(request, "tabs2","portlet.statistics.by.user");
	String tabsName2 = "portlet.statistics.by.user,portlet.statistics.by.category";
	
	String fromDate = DateUtil.convertDateToString(DateUtil.getBeginOfMonth(new Date()), DateUtil.DATE_FORMAT_D_M_Y);
	String toDate = DateUtil.convertDateToString(DateUtil.getEndOfMonth(new Date()), DateUtil.DATE_FORMAT_D_M_Y);
%>

<portlet:renderURL var="tabURL">
	<portlet:param name="jspPage" value="/cms/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.cms.statistics" />
</portlet:renderURL>

<liferay-ui:tabs
    names='<%=tabsName2%>'
    param="tabs2"
    url="<%=tabURL.toString()%>"
>    
	<c:choose>
		<c:when test='<%= tabs2.equals("portlet.statistics.by.category") %>'>
			<%@ include file="/cms/report_by_category.jsp" %>
		</c:when>	
		<c:otherwise>
			<%@ include file="/cms/report_by_user.jsp" %>
		</c:otherwise>
	</c:choose>
</liferay-ui:tabs>