<%@page import="vn.gov.hoabinh.util.DateUtil"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="com.liferay.portal.kernel.util.CalendarUtil"%>
<%@page import="com.liferay.portal.kernel.util.CalendarFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.Time"%>
<%@page import="vn.gov.hoabinh.util.ActionUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@ include file="/cms/init.jsp" %>
<%
	String articleId = ParamUtil.getString(request, "articleId", "0");
	String tabs2 = ParamUtil.getString(request, "tabs2");
	
	VcmsArticle article = null;
	String publishedDate = "";
	int hours = 0, minute = 0;
	Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
	if (!"0".equals(articleId)) {
		article = VcmsArticleLocalServiceUtil.getArticle(articleId);
		publishedDate = Validator.isNotNull(article.getPublishedDate()) ? DateUtil.convertDateToString(article.getPublishedDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;

		calendar.setTime(article.getPublishedDate()); 
		hours = calendar.get(Calendar.HOUR_OF_DAY);
		minute = calendar.get(Calendar.MINUTE);
		
	} else {
		publishedDate = DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y);
		calendar.setTime(new Date()); 
		hours = calendar.get(Calendar.HOUR_OF_DAY);
		minute = calendar.get(Calendar.MINUTE);
	}
	
	// System.out.println("##hour## " +hours+" ##minute## "+minute);
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/cms/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.cms.article"/>
	<portlet:param name="tabs2" value="<%=tabs2 %>"/>
</portlet:renderURL>

<portlet:actionURL var="selectPublishDate" name="crud_article">
	<portlet:param name="cmd" value="<%= PortalConstant.ACTION_SELECT_PUBLISH_DATE%>"/>
</portlet:actionURL>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>" title="action.article.select-publish-date" />
<aui:form action="<%= selectPublishDate %>" method="post" name="fm">
<aui:input name="articleId" type="hidden" value='<%= articleId %>' />
<aui:input name="tabs2" type="hidden" value='<%= tabs2 %>' />

<aui:row>
	<aui:col width="40">
		<aui:input name="publishedDate" label="portlet.cms.article.publisheddate" value="<%=publishedDate %>"/>
	</aui:col>
	<aui:col width="30">
		<aui:select name="hours" label="hours">
			<% for(int i=0;i<=24;i++){ %>
			<aui:option value="<%=i %>" selected="<%= (i==hours) %>"><%=i %></aui:option>
			<% } %>
		</aui:select>
	</aui:col>
	<aui:col width="30">
		<aui:select name="minutes" label="minutes">
			<% for(int i=0;i<=60;i++){ %>
			<aui:option value="<%=i %>" selected="<%= (i==minute) %>"><%=i %></aui:option>
			<% } %>
		</aui:select>
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