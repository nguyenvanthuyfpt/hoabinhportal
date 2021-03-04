<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/clip/init.jsp" %>
<liferay-ui:success key="portlet.common.action.successfully" message="Yêu cầu của bạn đã được xử lý thành công!"/>

<liferay-ui:tabs
    names='<%= "portlet.clip.type,portlet.clip.item" %>'
    param="tabs1"
    refresh="<%= false %>"
>    
	<liferay-ui:section>
        <%@ include file="/clip/view_type.jsp" %>
    </liferay-ui:section>

    <liferay-ui:section>
        <%@ include file="/clip/view_clip.jsp" %>
    </liferay-ui:section>
</liferay-ui:tabs>