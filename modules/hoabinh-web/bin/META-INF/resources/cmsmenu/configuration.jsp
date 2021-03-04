<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.model.VcmsPortion"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.model.Layout"%>
<%@ include file="/cmsmenu/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="<%=true%>"	var="configurationActionURL" />
<liferay-portlet:renderURL portletConfiguration="<%=true%>"	var="configurationRenderURL" />
<script>
    var cObjects = document.getElementsByName("<portlet:namespace />category");
    
	function <portlet:namespace/>changeConfiguration(plid){
		var form = document.getElementById("<portlet:namespace />fm");
		form.action = '<%= configurationActionURL  %>';
		form.submit();
	}
</script>

<aui:form action="<%=configurationActionURL%>" method="post" name="fm" id="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden" value="<%=Constants.UPDATE%>" />
	<aui:input name="categories" type="hidden" value="" />
	<aui:input name="redirect" type="hidden" value="<%=configurationRenderURL%>" />
	<aui:input name="recategorySelecteddirect" type="hidden" value="<%=categorySelected%>" />
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
				<aui:select name="portletSelected" label="portlet.common.portlet-sel" onChange = '<%=renderResponse.getNamespace() + "changeConfiguration(this.value)"%>'>
					<%	if (Validator.isNotNull(listPortlet) && listPortlet.size()>0) {
						for(int i = 0; i<listPortlet.size();i++){
				    	String portletSel = (String)listPortlet.get(i);%>
						<aui:option value="<%=portletSel%>" selected="<%=portletSelected.equals(portletSel) %>"><%=portletSel%></aui:option>
					<%}}%>
				</aui:select>
				<aui:select name="styleSel" label="portlet.common.display.style" >
					<aui:option value="0" selected="<%="0".equals(styleSel)%>"><liferay-ui:message key="portlet.common.display.menu.home"/></aui:option>
					<aui:option value="1" selected="<%="1".equals(styleSel)%>"><liferay-ui:message key="portlet.common.display.menu.text"/></aui:option>
					<aui:option value="2" selected="<%="2".equals(styleSel)%>"><liferay-ui:message key="portlet.common.display.menu.image"/></aui:option>
					<aui:option value="3" selected="<%="3".equals(styleSel)%>"><liferay-ui:message key="portlet.common.display.menu.right"/></aui:option>
				</aui:select>
			</aui:col>
			<aui:col width="50">
				<aui:select name="portionId" label="portlet.cms.portion" onChange = '<%=renderResponse.getNamespace() + "changeConfiguration(this.value)"%>'>
					<%	if (Validator.isNotNull(listPortion) && listPortion.size()>0) {
						for(VcmsPortion portion:listPortion){
					%>
						<aui:option value="<%=portion.getPortionId()%>" selected="<%=portionId.equals(portion.getPortionId()) %>"><%=portion.getName()%></aui:option>
					<%}}%>
				</aui:select>	
			
			<%	if(!"0".equals(portionId)){
				List<VcmsCategory> listCategory = VcmsCategoryLocalServiceUtil.getCategoriesByP_P(groupId, PortalConstant.DEFAULT_LANGUAGE, "0", portionId);
			%>
				<div style="overflow: auto; height: 350px; border:1px solid">
					<table width="100%">
					<%= ActionUtil.getCategoryMenu(listCategory, renderResponse.getNamespace(), categorySelected) %>
					</table>
				</div>
			<%	}	%>	
			</aui:col>
		</aui:row>
	</aui:fieldset>
	<aui:button-row>
		<aui:button type="submit" value="save" />
	</aui:button-row>
</aui:form>