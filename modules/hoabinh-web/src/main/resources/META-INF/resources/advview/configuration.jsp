<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/advview/init.jsp" %>

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
	List<AdvType> listType = AdvTypeLocalServiceUtil.getTypeByG(groupId);
	List<AdvItem> listItem = new ArrayList<AdvItem>();
	long typeId = 0;
	if (!"-1".equals(categorySel) && Validator.isNotNull(categorySel)) {
		typeId = Long.parseLong(categorySel);
		listItem = AdvItemLocalServiceUtil.getItemByG_T_S(groupId, typeId, true);
	}
%>
<aui:form action="<%=configurationActionURL%>" method="post" name="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden" value="<%=Constants.UPDATE%>" />
	<aui:input name="redirect" type="hidden" value="<%=configurationRenderURL%>" />

	<aui:fieldset>
		<aui:row>
			<aui:col width="50">
				<aui:select name="categorySel" label="portlet.common.display.category" onChange = '<%=renderResponse.getNamespace() + "changeConfiguration(this.value)"%>'>
					<aui:option value="-1" selected="<%= "-11".equals(categorySel) %>"><liferay-ui:message key="portlet.common.select.all"/></aui:option>
					<% for(AdvType type:listType){ %>
				    <aui:option value="<%=type.getTypeId() %>" selected="<%= String.valueOf(type.getTypeId()).equals(categorySel) %>"><%=type.getName() %></aui:option>
				    <%} %>
				</aui:select>
				<aui:select name="styleSel" label="portlet.common.display.style" >
					<aui:option value="1" selected="<%="1".equals(styleSel)%>"><liferay-ui:message key="portlet.common.display.adv"/></aui:option>
					<aui:option value="2" selected="<%="2".equals(styleSel)%>"><liferay-ui:message key="portlet.common.display.iframe"/></aui:option>
				</aui:select>
				<aui:input name="documentUrl" label="portlet.common.link-image" type="text" value="<%=documentUrl %>" />
				<aui:input name="link" label="link" type="text" value="<%=link %>" />
				<aui:input name="width" type="text" value="<%=width %>">
					<aui:validator name="number" />
					<aui:validator name="range">[0,300]</aui:validator>
				</aui:input>
				<aui:input name="height" type="text" value="<%=height %>">
					<aui:validator name="number" />
					<aui:validator name="range">[0,300]</aui:validator>
				</aui:input>
			</aui:col>
			
			<% if (Validator.isNotNull(listItem) && listItem.size()>0) { %>
			<aui:col width="50">
			<div style="overflow: auto; height: 500px; border:1px solid">
				<% for(AdvItem item:listItem){ %>
				<div>						
					<aui:input name="itemSel" label="<%=item.getDescription() %>" type="radio" value="<%=item.getItemId() %>" 
						checked="<%= String.valueOf(item.getItemId()).equals(itemSel) %>"/>
					<% if(Validator.isNotNull(item.getName())) { %>
					<img title="<%=item.getDescription() %>" src="<%=item.getName()%>" />
					<% } %>
				</div>
				<% } %>
			</div>
			</aui:col>
			<% } %>
		</aui:row>
		
	</aui:fieldset>
	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>