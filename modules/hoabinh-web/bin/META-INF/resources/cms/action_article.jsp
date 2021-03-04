<%@page import="vn.gov.hoabinh.model.VcmsStatus"%>
<%@page import="vn.gov.hoabinh.service.VcmsStatusLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.model.VcmsArticle"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/cms/init.jsp"%>

<%
	String tabs2 = ParamUtil.getString(request, "tabs2","0");
	long statusArticle = 0;
	int position = 0;
	VcmsStatus currentStatus = null;
	if (Validator.isNumber(tabs2)) {
		statusArticle = Long.parseLong(tabs2);
		if (statusArticle>0) {
			try {
				currentStatus = VcmsStatusLocalServiceUtil.getVcmsStatus(statusArticle);
				position = currentStatus.getPosition();
			} catch (Exception ex) {
				
			}
		}
	}
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	VcmsStatus vcmsStatus = VcmsStatusLocalServiceUtil.getByC_G_A(1, groupId, true);
	int posPublish = vcmsStatus.getPosition();
	VcmsArticle article = (VcmsArticle) row.getObject();
%>
<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/cms/edit_article.jsp" />
	<portlet:param name="tabs1" value="portlet.cms.article" />
	<portlet:param name="tabs2" value="<%=String.valueOf(article.getStatus()) %>" />
	<portlet:param name="articleId" value="<%=article.getArticleId()%>" />
</portlet:renderURL>

<portlet:renderURL var="publishURL">
	<portlet:param name="jspPage" 	value="/cms/publish_article.jsp" />
	<portlet:param name="tabs1" value="portlet.cms.article" />
	<portlet:param name="tabs2" value="<%=String.valueOf(article.getStatus()) %>" />
	<portlet:param name="articleId" value="<%=article.getArticleId()%>" />
</portlet:renderURL>

<portlet:renderURL var="cancelPublishURL">
	<portlet:param name="jspPage" 	value="/cms/cancel_publish.jsp" />
	<portlet:param name="tabs1" value="portlet.cms.article" />
	<portlet:param name="tabs2" value="<%=String.valueOf(article.getStatus()) %>" />
	<portlet:param name="articleId" value="<%=article.getArticleId()%>" />
</portlet:renderURL>

<portlet:renderURL var="selectPublishURL">
	<portlet:param name="jspPage" 	value="/cms/select_publish_date.jsp" />
	<portlet:param name="tabs1" value="portlet.cms.article" />
	<portlet:param name="tabs2" value="<%=String.valueOf(article.getStatus()) %>" />
	<portlet:param name="articleId" value="<%=article.getArticleId()%>" />
</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="crud_article">
	<portlet:param name="jspPage" value="/cms/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_DELETE %>" />
	<portlet:param name="tabs1" value="portlet.cms.article" />
	<portlet:param name="tabs2" value="<%=String.valueOf(article.getStatus()) %>" />
	<portlet:param name="articleId" value="<%=article.getArticleId()%>" />
</portlet:actionURL>

<portlet:actionURL var="sendURL" name="crud_article">
	<portlet:param name="jspPage" value="/cms/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_APPROVE %>" />
	<portlet:param name="tabs1" value="portlet.cms.article" />
	<portlet:param name="tabs2" value="<%=String.valueOf(article.getStatus()) %>" />
	<portlet:param name="articleId" value="<%=article.getArticleId()%>" />
</portlet:actionURL>

<%-- <portlet:actionURL var="soundURL" name="crud_article">
	<portlet:param name="jspPage" value="/cms/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_GET_SOUND %>" />
	<portlet:param name="tabs1" value="portlet.cms.article" />
	<portlet:param name="tabs2" value="<%=String.valueOf(article.getStatus()) %>" />
	<portlet:param name="articleId" value="<%=article.getArticleId()%>" />
	<portlet:param name="linkWebService" value="<%=linkWebService%>" />
</portlet:actionURL> --%>

<portlet:actionURL var="rejectURL" name="crud_article">
	<portlet:param name="jspPage" value="/cms/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_CANCEL_APPROVE %>" />
	<portlet:param name="tabs1" value="portlet.cms.article" />
	<portlet:param name="tabs2" value="<%=String.valueOf(article.getStatus()) %>" />
	<portlet:param name="articleId" value="<%=article.getArticleId()%>" />
</portlet:actionURL>

<liferay-ui:icon-menu
    direction="left-side"
    icon="<%= StringPool.BLANK %>"
    markupView="lexicon"
    message="<%= StringPool.BLANK %>"
    showWhenSingleIcon="<%= true %>"
>

<c:choose>
	<c:when test="<%= statusArticle==0 %>">
		<liferay-ui:icon image="post" message="action.article.send" url="<%=sendURL%>" />
		<liferay-ui:icon image="edit" url="<%=editURL%>" />
		<liferay-ui:icon image="delete" url="<%=deleteURL%>" />
	</c:when>
	
	<c:when test="<%= VcmsStatusLocalServiceUtil.isStatusPublisher(statusArticle) %>" >
		<liferay-ui:icon image="unsubscribe" message="action.cancel-publish" url="<%=cancelPublishURL%>" />
		<liferay-ui:icon image="edit" url="<%=editURL%>" />
		<liferay-ui:icon image="date" message="action.article.select-publish-date" url="<%=selectPublishURL%>" />
		
	</c:when>
	
	<c:when test="<%= (statusArticle>0 && !VcmsStatusLocalServiceUtil.isStatusPublisher(statusArticle)) %>" >
		<% if(position==posPublish-1){ %>
			<liferay-ui:icon image="global" message="action.publish" url="<%=publishURL%>" />
		<% } else { %>
			<liferay-ui:icon image="post" message="action.article.send" url="<%=sendURL%>" />
		<% } %>
		<liferay-ui:icon image="undo" message="action.article.reject" url="<%=rejectURL%>"/>
		<liferay-ui:icon image="edit" url="<%=editURL%>" />
		<liferay-ui:icon image="delete" url="<%=deleteURL%>" />
	</c:when>
</c:choose>
</liferay-ui:icon-menu>