<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/legal/init.jsp" %>
<%
	String tabs1 = ParamUtil.getString(request, "tabs1", "portlet.legal.information");
%>
<liferay-ui:success key="portlet.common.action.successfully" message="Yêu cầu của bạn đã được xử lý thành công!"/>

<liferay-ui:tabs
    names='<%= "portlet.legal.information,portlet.legal.document,portlet.legal.draft,portlet.legal.general-manage" %>'
    param="tabs1"
    refresh="<%= false %>"
>    
	<liferay-ui:section>
        <%@ include file="/legal/view_information.jsp" %>
    </liferay-ui:section>

    <liferay-ui:section>
        <%@ include file="/legal/view_document.jsp" %>
    </liferay-ui:section>
    
    <liferay-ui:section>
        <%@ include file="/legal/view_draft.jsp" %>
    </liferay-ui:section>
    
    <liferay-ui:section>
        <%@ include file="/legal/view_general_manage.jsp" %>
    </liferay-ui:section>
</liferay-ui:tabs>