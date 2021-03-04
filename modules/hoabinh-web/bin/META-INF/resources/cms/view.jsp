<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/cms/init.jsp" %>
<%
	String tabs1 = ParamUtil.getString(request, "tabs1", "portlet.cms.information");
%>
<liferay-ui:success key="portlet.common.action.successfully" message="Yêu cầu của bạn đã được xử lý thành công!"/>

<liferay-ui:tabs
    names='<%= "portlet.cms.information,portlet.cms.article,portlet.cms.general-manage,portlet.cms.statistics" %>'
    param="tabs1"
    refresh="<%= false %>"
>    
	<liferay-ui:section>
        <%@ include file="/cms/view_information.jsp" %>
    </liferay-ui:section>
	
    <liferay-ui:section>
        <%@ include file="/cms/view_article.jsp" %>
    </liferay-ui:section>
    
    <liferay-ui:section>
        <%@ include file="/cms/view_general_manage.jsp" %>
    </liferay-ui:section>

    <liferay-ui:section>
        <%@ include file="/cms/view_statistics.jsp" %>
    </liferay-ui:section>
</liferay-ui:tabs>