<%@ include file="/legalmenu/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="<%=true%>"
	var="configurationActionURL" />

<liferay-portlet:renderURL portletConfiguration="<%=true%>"
	var="configurationRenderURL" />

<script>
    var cObjects = document.getElementsByName("<portlet:namespace />category");
    
	function <portlet:namespace/>changeConfiguration(plid){
		var form = document.getElementById("<portlet:namespace />fm");
		form.action = '<%= configurationActionURL  %>';
		form.submit();
	}
</script>

<aui:form action="<%=configurationActionURL%>" method="post" name="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden" value="<%=Constants.UPDATE%>" />
	<aui:input name="redirect" type="hidden" value="<%=configurationRenderURL%>" />

	<aui:fieldset>
		<aui:input name="pageSel" type="text" value="<%=pageSel %>" />
		<aui:input name="portletSel" type="text" value="<%=portletSel %>" />
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>