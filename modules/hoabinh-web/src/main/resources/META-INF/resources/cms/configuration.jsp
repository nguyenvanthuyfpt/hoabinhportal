<%@ include file="/cms/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="<%=true%>"	var="configurationActionURL" />
<liferay-portlet:renderURL portletConfiguration="<%=true%>"	var="configurationRenderURL" />

<aui:form action="<%=configurationActionURL%>" method="post" name="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden" value="<%=Constants.UPDATE%>" />
	<aui:input name="redirect" type="hidden" value="<%=configurationRenderURL%>" />
	<aui:fieldset>
		<aui:row>
			<aui:col width="50">
				<aui:input name="linkWebService" label="portlet.cms.ws.soundlink" type="text" value="<%=linkWebService %>" />
			</aui:col>
		</aui:row>
	</aui:fieldset>
	<aui:button-row>
		<aui:button name="save" type="submit" value="save" />
		<aui:button name="cancel" type="cancel" value="cancel" />
	</aui:button-row>
</aui:form>