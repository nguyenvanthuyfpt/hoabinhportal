<%@ include file="/doc/init.jsp" %>
<%
	String tabs1 = ParamUtil.getString(request, "tabs1", "portlet.doc.information");
%>
<liferay-ui:success key="portlet.common.action.successfully" message="Your action has process successfully!"/>

<liferay-ui:tabs
    names='<%= "portlet.doc.information,portlet.doc.document,portlet.doc.general-manage" %>'
    param="tabs1"
    refresh="<%= false %>"
>    
	<liferay-ui:section>
        <%@ include file="/doc/view_information.jsp" %>
    </liferay-ui:section>

    <liferay-ui:section>
        <%@ include file="/doc/view_document.jsp" %>
    </liferay-ui:section>
    
    <liferay-ui:section>
        <%@ include file="/doc/view_general_manage.jsp" %>
    </liferay-ui:section>
</liferay-ui:tabs>
