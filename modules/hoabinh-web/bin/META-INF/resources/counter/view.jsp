<%@page import="vn.gov.hoabinh.util.*"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ include file="/counter/init.jsp" %>
<%
	String totalVisited = (String)renderRequest.getAttribute("totalVisited");
	String totalMonth = (String)renderRequest.getAttribute("totalMonth");
	String totalDay = (String)renderRequest.getAttribute("totalDay");
	String totalOnline = (String)renderRequest.getAttribute("totalOnline");
%>

<div class="box_bg">
<h3 class="title-list-news"><span class="title-t1"><liferay-ui:message key="portlet.common.counter" /></span></h3>
<div class="clear"></div>
	<div>
		<aui:row>
			<aui:col width="100">
				<liferay-ui:icon
				    iconCssClass="icon-user"
				    label="<%= true %>"
				    message='<%= LanguageUtil.format(request, "portlet.counter.total.visitor", FormatData.parseNumberComma(Long.parseLong(totalVisited))) %>'
				    url=""
				/>
			</aui:col>
		</aui:row>
		<% if ("true".equals(displayTotalMonth)) { %>
		<aui:row>
			<aui:col width="100">
				<liferay-ui:icon
				    iconCssClass="icon-user"
				    label="<%= true %>"
				    message='<%= LanguageUtil.format(request, "portlet.counter.total.month", FormatData.parseNumberComma(Long.parseLong(totalMonth))) %>'
				    url=""
				/>
			</aui:col>
		</aui:row>
		<% } %>
		
		<% if ("true".equals(displayTotalDay)) { %>
		<aui:row>
			<aui:col width="100">
				<liferay-ui:icon
				    iconCssClass="icon-user"
				    label="<%= true %>"
				    message='<%= LanguageUtil.format(request, "portlet.counter.total.day", FormatData.parseNumberComma(Long.parseLong(totalDay))) %>'
				    url=""
				/>
			</aui:col>
		</aui:row>
		<% } %>
		
		<% if ("true".equals(displayTotalOnline)) { %>
		<aui:row>
			<aui:col width="100">
				<liferay-ui:icon
				    iconCssClass="icon-user"
				    label="<%= true %>"
				    message='<%= LanguageUtil.format(request, "portlet.counter.total.online", FormatData.parseNumberComma(Long.parseLong(totalOnline))) %>'
				    url=""
				/>
			</aui:col>
		</aui:row>
		<% } %>
	</div>
</div>