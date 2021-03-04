<%@ include file="/legalsend/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="<%=true%>"	var="configurationActionURL" />
<liferay-portlet:renderURL portletConfiguration="<%=true%>"	var="configurationRenderURL" />

<aui:form action="<%=configurationActionURL%>" method="post" name="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden" value="<%=Constants.UPDATE%>" />
	<aui:input name="redirect" type="hidden" value="<%=configurationRenderURL%>" />

	<aui:fieldset>
		<aui:row>
			<aui:col width="50">
				<aui:select name="numSel" label="portlet.common.display.number" >
					<% for(int i=1;i<=20;i++){ %>
					<aui:option value="<%=i %>" selected="<%=String.valueOf(i).equals(numSel)%>"><%=i %></aui:option>
					<% } %>
				</aui:select>
			</aui:col>
		</aui:row>	
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>