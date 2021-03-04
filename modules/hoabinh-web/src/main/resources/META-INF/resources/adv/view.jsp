<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="vn.gov.hoabinh.service.VcmsArticleLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortletKeys"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.AdvItemLocalServiceUtil"%>

<%@ include file="/adv/init.jsp" %>


<liferay-ui:success key="portlet.common.action.successfully" message="Yêu cầu của bạn đã được xử lý thành công!"/>

<liferay-ui:tabs
    names='<%= "portlet.adv.type,portlet.adv.item" %>'
    param="tabs1"
    refresh="<%= false %>"
>
    <liferay-ui:section>
        <%@ include file="/adv/view_type.jsp" %>
    </liferay-ui:section>

    <liferay-ui:section>
        <%@ include file="/adv/view_item.jsp" %>
    </liferay-ui:section>
</liferay-ui:tabs>