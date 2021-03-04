<%@ include file="/link/init.jsp" %>
<%
	
%>
<liferay-ui:success key="portlet.common.action.successfully" message="Action successfully!"/>

<liferay-ui:tabs
    names='<%= "portlet.link.group,portlet.link.linkitem" %>'
    param="tabs1"
    refresh="<%= false %>"
>    
	
	<liferay-ui:section>
        <%@ include file="/link/view_linkgroup.jsp" %>
    </liferay-ui:section>

    <liferay-ui:section>
        <%@ include file="/link/view_links.jsp" %>
    </liferay-ui:section>
</liferay-ui:tabs>
