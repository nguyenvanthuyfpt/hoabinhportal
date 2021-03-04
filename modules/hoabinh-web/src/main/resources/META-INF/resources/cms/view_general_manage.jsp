<%
	String tabs2 = ParamUtil.getString(request, "tabs2","portlet.cms.portion");
	String tabsName2 = "portlet.cms.portion,portlet.cms.category,portlet.cms.article.status,portlet.cms.article.type";
%>

<portlet:renderURL var="tabURL">
	<portlet:param name="jspPage" value="/cms/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.cms.general-manage" />
</portlet:renderURL>

<liferay-ui:tabs
    names='<%=tabsName2%>'
    param="tabs2"
    url="<%=tabURL.toString()%>"
>    
	<c:choose>
		<c:when test='<%= tabs2.equals("portlet.cms.article.type") %>'>
			<%@ include file="/cms/view_type.jsp" %>
		</c:when>	
		<c:when test='<%= tabs2.equals("portlet.cms.category") %>'>
			<%@ include file="/cms/view_category.jsp" %>
		</c:when>	
		<c:when test='<%= tabs2.equals("portlet.cms.article.status") %>'>
			<%@ include file="/cms/view_status.jsp" %>
		</c:when>		
		<c:otherwise>
			<%@ include file="/cms/view_portion.jsp" %>
		</c:otherwise>
	</c:choose>
</liferay-ui:tabs>