<%
	tabs2 = ParamUtil.getString(request, "tabs2","portlet.doc.level");
	String tabsName2 = "portlet.doc.level,portlet.doc.org,portlet.doc.field";
%>

<portlet:renderURL var="tabURL">
	<portlet:param name="jspPage" value="/doc/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.doc.general-manage" />
</portlet:renderURL>

<liferay-ui:tabs
    names='<%=tabsName2%>'
    param="tabs2"
    url="<%=tabURL.toString()%>"
>    
	<c:choose>
		<c:when test='<%= tabs2.equals("portlet.doc.level") %>'>
			<%@ include file="/doc/view_level.jsp" %>
		</c:when>	
		<c:when test='<%= tabs2.equals("portlet.doc.org") %>'>
			<%@ include file="/doc/view_org.jsp" %>
		</c:when>	
		<c:otherwise>
			<%@ include file="/doc/view_field.jsp" %>
		</c:otherwise>
	</c:choose>
</liferay-ui:tabs>