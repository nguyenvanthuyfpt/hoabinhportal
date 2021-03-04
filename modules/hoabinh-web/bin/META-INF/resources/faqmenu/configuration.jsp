<%@page import="vn.gov.hoabinh.model.FAQCategory"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@ include file="/faqmenu/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="<%=true%>"	var="configurationActionURL" />
<liferay-portlet:renderURL portletConfiguration="<%=true%>"	var="configurationRenderURL" />

<script>
	function <portlet:namespace/>changeConfiguration(plid){
		var form = document.getElementById("<portlet:namespace />fm");
		form.action = '<%= configurationActionURL  %>';
		form.submit();
	}
</script>
<%
	List<FAQCategory> categories = FAQCategoryLocalServiceUtil.getByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
%>
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
		<%=categorySel %>
		<aui:row>
			<aui:col width="50">
				<aui:select name="categorySel" label="portlet.common.display.category" multiple="true" height="300">
					<aui:option value="0" selected="<%= categorySel.indexOf("0")>-1 %>"><liferay-ui:message key="portlet.common.select.all"/></aui:option>
					<% for(FAQCategory category:categories){ %>
				    <aui:option value="<%=category.getId() %>" selected="<%= categorySel.indexOf(String.valueOf(category.getId()))>-1 %>"><%=category.getName() %></aui:option>
				    <%} %>
				</aui:select>
			</aui:col>
		</aui:row>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>