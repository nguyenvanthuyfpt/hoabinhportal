<%@page import="vn.gov.hoabinh.model.Clip"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" 	pageEncoding="UTF-8"%>
<%@ include file="/adv/init.jsp"%>

<%
	String tabs1 = ParamUtil.getString(request, "tabs1","0");
	ResultRow row = (ResultRow) request.getAttribute("SEARCH_CONTAINER_RESULT_ROW");
	Clip clip = (Clip) row.getObject();
%>


<portlet:renderURL var="editURL">
	<portlet:param name="jspPage" 	value="/clip/edit_clip.jsp" />
	<portlet:param name="clipId" value="<%=clip.getId()%>" />
	</portlet:renderURL>

<portlet:actionURL var="deleteURL" name="deleteClip">
	<portlet:param name="jspPage" value="/clip/view.jsp" />
	<portlet:param name="clipId" value="<%=clip.getId()%>" />
	<portlet:param name="tabs1" value="portlet.clip.item" />
</portlet:actionURL>


<liferay-ui:icon-menu
    direction="left-side"
    icon="<%= StringPool.BLANK %>"
    markupView="lexicon"
    message="<%= StringPool.BLANK %>"
    showWhenSingleIcon="<%= true %>"
>
	<liferay-ui:icon image="edit" url="<%=editURL%>" />
	<liferay-ui:icon image="delete" url="<%=deleteURL%>"/>
</liferay-ui:icon-menu>

<%-- url="javascript:deleteItem('delete','<%=deleteURL%>');" --%>
	
<script type="text/javascript">
function deleteItem(cmd,url) {
    var verify = confirm("Do you want to "+ cmd +" this Bug?");
    if(verify) {
        location.href= url;
    }
}
</script>