<%
	tabs2 = ParamUtil.getString(request, "tabs2","portlet.legal.draft.document");
	String tabsName2 = "portlet.legal.draft.document,portlet.legal.draft.suggest";
%>

<portlet:renderURL var="tabURL">
	<portlet:param name="jspPage" value="/legal/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.legal.draft" />
</portlet:renderURL>

<liferay-ui:tabs
    names='<%=tabsName2%>'
    param="tabs2"
    url="<%=tabURL.toString()%>"
>    
	<c:choose>
		<c:when test='<%= tabs2.equals("portlet.legal.draft.suggest") %>'>
			<%@ include file="/legal/view_draft_suggest.jsp" %>
		</c:when>	
		<c:otherwise>
			<%@ include file="/legal/view_draft_document.jsp" %>
		</c:otherwise>
	</c:choose>
</liferay-ui:tabs>