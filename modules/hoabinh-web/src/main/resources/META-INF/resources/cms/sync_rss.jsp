<%@page import="vn.gov.hoabinh.util.ActionUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@ include file="/cms/init.jsp" %>
<%
	categoryId = ParamUtil.getString(request, "categoryId", "0");
	String rssURL = "https://vnexpress.net/rss/thoi-su.rss";
	String tabs2 = ParamUtil.getString(request, "tabs2");
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/cms/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.cms.general-manage"/>
	<portlet:param name="tabs2" value="portlet.cms.category"/>
</portlet:renderURL>

<portlet:actionURL var="syncRssArticle" name="crud_article">
	<portlet:param name="cmd" value="<%= PortalConstant.ACTION_SYNC_RSS%>"/>
</portlet:actionURL>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>" title="action.article.sync-rss" />
<aui:form action="<%= syncRssArticle %>" method="post" name="fm">
<aui:input name="categoryId" type="hidden" value='<%= categoryId %>' />
<aui:input name="tabs1" type="hidden" value="portlet.cms.general-manage" />
<aui:input name="tabs2" type="hidden" value="portlet.cms.category" />

<aui:row>
	<aui:col width="100">
		<aui:input name="rssURL" label="portlet.cms.article.rss-sync" value="<%=rssURL %>">
			<aui:validator name="required"/>
		 	<aui:validator name="maxLength">200</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:button-row >
	<aui:button type="submit" value="save" icon="icon-ok-sign" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>

<aui:script>
	AUI().use('aui-datepicker', function(A) {
		var publishedDate =new A.DatePicker({
			trigger : '#<portlet:namespace/>publishedDate',
			popover : {
			zIndex : 1
		},
		 mask: '%d/%m/%Y'
		});
	});	
</aui:script>
