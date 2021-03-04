<%
	tabs2 = ParamUtil.getString(request, "tabs2","portlet.legal.type");
	String tabsName2 = "portlet.legal.type,portlet.legal.field,portlet.legal.org,portlet.legal.signer";
%>

<portlet:renderURL var="tabURL">
	<portlet:param name="jspPage" value="/legal/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.legal.general-manage" />
</portlet:renderURL>

<liferay-ui:tabs
    names='<%=tabsName2%>'
    param="tabs2"
    url="<%=tabURL.toString()%>"
>    
	<c:choose>
		<c:when test='<%= tabs2.equals("portlet.legal.signer") %>'>
			<%@ include file="/legal/view_signer.jsp" %>
		</c:when>	
		<c:when test='<%= tabs2.equals("portlet.legal.field") %>'>
			<%@ include file="/legal/view_field.jsp" %>
		</c:when>	
		<c:when test='<%= tabs2.equals("portlet.legal.org") %>'>
			<%@ include file="/legal/view_org.jsp" %>
		</c:when>		
		<c:otherwise>
			<%@ include file="/legal/view_type.jsp" %>
		</c:otherwise>
	</c:choose>
</liferay-ui:tabs>