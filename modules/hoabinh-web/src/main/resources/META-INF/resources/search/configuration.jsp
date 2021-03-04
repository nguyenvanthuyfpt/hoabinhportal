<%@ include file="/search/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="<%=true%>"	var="configurationActionURL" />
<liferay-portlet:renderURL portletConfiguration="<%=true%>"	var="configurationRenderURL" />

<script>
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
		<aui:row>
			<aui:col width="50">
				<aui:select name="plidSelected" label="portlet.common.layout-sel" onChange = '<%=renderResponse.getNamespace() + "changeConfiguration(this.value)"%>'>
					<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
					<% if (Validator.isNotNull(selectLayouts) && selectLayouts.size()>0) { 
					 	for(Layout l:selectLayouts){ %>
				    <aui:option value="<%=l.getPlid() %>" selected="<%=l.getPlid()==Long.parseLong(plidSelected) %>"><%=l.getName() %></aui:option>
				    <%}} %>
				</aui:select>	
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col width="50">
				<aui:select name="portletSelected" label="portlet.common.portlet-sel" onChange = '<%=renderResponse.getNamespace() + "changeConfiguration(this.value)"%>'>
					<%	if (Validator.isNotNull(listPortlet) && listPortlet.size()>0) {
						for(int i = 0; i<listPortlet.size();i++){
				    	String portletSel = (String)listPortlet.get(i);%>
						<aui:option value="<%=portletSel%>" selected="<%=portletSelected.equals(portletSel) %>"><%=portletSel%></aui:option>
					<%}}%>
				</aui:select>	
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col width="50">
				<aui:select name="styleSel" label="portlet.common.display.style" >
					<aui:option value="1" selected="<%="1".equals(styleSel)%>"><liferay-ui:message key="portlet.common.display.home"/></aui:option>
					<aui:option value="2" selected="<%="2".equals(styleSel)%>"><liferay-ui:message key="portlet.common.display.page"/></aui:option>
				</aui:select>
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col width="50">
				<aui:select name="numSel" label="portlet.common.display.number" >
					<aui:option value="3" selected="<%="3".equals(numSel)%>">3</aui:option>
					<aui:option value="5" selected="<%="5".equals(numSel)%>">5</aui:option>
					<aui:option value="10" selected="<%="10".equals(numSel)%>">10</aui:option>
					<aui:option value="15" selected="<%="15".equals(numSel)%>">15</aui:option>
					<aui:option value="20" selected="<%="20".equals(numSel)%>">20</aui:option>
				</aui:select>
			</aui:col>
		</aui:row>	
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>
