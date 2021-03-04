<%@ include file="/cmsview/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="<%=true%>"	var="configurationActionURL" />
<liferay-portlet:renderURL portletConfiguration="<%=true%>"	var="configurationRenderURL" />

<script>
    var cObjects = document.getElementsByName("<portlet:namespace />category");
    
	function <portlet:namespace/>changeConfiguration(plid){
		var form = document.getElementById("<portlet:namespace />fm");
		form.action = '<%= configurationActionURL  %>';
		form.submit();
	}
	
	function <portlet:namespace/>saveConfiguration(){
		var categories = '';
		for (i = 0; (cObjects != null) && (i < cObjects.length); i ++) {
			if (cObjects[i].checked) {
				categories += cObjects[i].value + ',';
			}
		}
		var form = document.getElementById("<portlet:namespace />fm");
		document.<portlet:namespace />fm.<portlet:namespace />categories.value = categories;
		form.action = '<%= configurationActionURL  %>';
		form.submit();
	}
</script>

<aui:form action="<%=configurationActionURL%>" method="post" name="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden" value="<%=Constants.UPDATE%>" />
	<aui:input name="redirect" type="hidden" value="<%=configurationRenderURL%>" />
	<aui:input name="categorySel" type="hidden" value="<%=categorySel %>" />
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
					<aui:option value="00" selected="<%="00".equals(styleSel)%>"><liferay-ui:message key="portlet.cmsview.00"/></aui:option>
					<aui:option value="01" selected="<%="01".equals(styleSel)%>"><liferay-ui:message key="portlet.cmsview.01"/></aui:option>
					<aui:option value="02" selected="<%="02".equals(styleSel)%>"><liferay-ui:message key="portlet.cmsview.02"/></aui:option>
					<aui:option value="03" selected="<%="03".equals(styleSel)%>"><liferay-ui:message key="portlet.cmsview.03"/></aui:option>
					<aui:option value="04" selected="<%="04".equals(styleSel)%>"><liferay-ui:message key="portlet.cmsview.04"/></aui:option>
					<aui:option value="05" selected="<%="05".equals(styleSel)%>"><liferay-ui:message key="portlet.cmsview.05"/></aui:option>
					<aui:option value="06" selected="<%="06".equals(styleSel)%>"><liferay-ui:message key="portlet.cmsview.06"/></aui:option>
				</aui:select>
				<aui:select name="numSel" label="portlet.common.display.number" >
					<% for(int i=1;i<=20;i++){ %>
					<aui:option value="<%=i %>" selected="<%=String.valueOf(i).equals(numSel)%>"><%=i %></aui:option>
					<% } %>
				</aui:select>
				<aui:select name="numArticleImg" label="portlet.common.display.number.article.img" >
					<% for(int i=1;i<=20;i++){ %>
					<aui:option value="<%=i %>" selected="<%=String.valueOf(i).equals(numArticleImg)%>"><%=i %></aui:option>
					<% } %>
				</aui:select>
				<aui:select name="numArticleNext" label="portlet.common.display.number.article.next" >
					<% for(int i=1;i<=20;i++){ %>
					<aui:option value="<%=i %>" selected="<%=String.valueOf(i).equals(numArticleNext)%>"><%=i %></aui:option>
					<% } %>
				</aui:select>
				<aui:select name="displayRss" label="portlet.common.display.rss" >
					<aui:option value="0" selected="<%="0".equals(displayRss)%>"><liferay-ui:message key="no"/></aui:option>
					<aui:option value="1" selected="<%="1".equals(displayRss)%>"><liferay-ui:message key="yes"/></aui:option>
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
						<%= ActionUtil.getCategoryMenu(listCategory, renderResponse.getNamespace(), categorySel) %>
						</table>
					</div>
				<%	}	%>	
			</aui:col>
		</aui:row>	
	</aui:fieldset>

	<aui:button-row>
		<aui:button name="save" type="submit" value="save" />
		<aui:button name="cancel" type="cancel" value="cancel" />
	</aui:button-row>
</aui:form>