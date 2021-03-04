<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/faq/init.jsp" %>
<%
	String tabs1 = ParamUtil.getString(request, "tabs1", "portlet.faq.information");
%>
<liferay-ui:success key="portlet.common.action.successfully" message="Yêu cầu của bạn đã được xử lý thành công!"/>
<liferay-ui:tabs
    names='<%= "portlet.faq.information,portlet.faq.question,portlet.faq.answer,portlet.faq.category" %>'
    param="tabs1"
    refresh="<%= false %>"
>
    <liferay-ui:section>
        <%@ include file="/faq/view_information.jsp" %>
    </liferay-ui:section>

   <liferay-ui:section>
        <%@ include file="/faq/view_question.jsp" %>
    </liferay-ui:section>
    
    <liferay-ui:section>
        <%@ include file="/faq/view_answer.jsp" %>
    </liferay-ui:section>
    
    <liferay-ui:section>
        <%@ include file="/faq/view_category.jsp" %>
    </liferay-ui:section>
</liferay-ui:tabs>
