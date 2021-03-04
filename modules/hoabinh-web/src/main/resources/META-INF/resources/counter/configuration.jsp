<%@ include file="/counter/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="<%=true%>"	var="configurationActionURL" />
<liferay-portlet:renderURL portletConfiguration="<%=true%>"	var="configurationRenderURL" />

<aui:form action="<%=configurationActionURL%>" method="post" name="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden" value="<%=Constants.UPDATE%>" />
	<aui:input name="redirect" type="hidden" value="<%=configurationRenderURL%>" />

	<aui:fieldset>
		<aui:row>
			<aui:col width="50">
				<aui:input name="displayTotalMonth" label="portlet.counter.display.total.month" type="checkbox" checked="<%= "true".equals(displayTotalMonth)?true:false %>"/>
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col width="50">
				<aui:input name="displayTotalDay" label="portlet.counter.display.total.day" type="checkbox" checked="<%= "true".equals(displayTotalDay)?true:false %>"/>
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col width="50">
				<aui:input name="displayTotalOnline" label="portlet.counter.display.total.online" type="checkbox" checked="<%= "true".equals(displayTotalOnline)?true:false %>"/>
			</aui:col>
		</aui:row>	
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>