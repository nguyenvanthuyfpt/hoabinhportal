<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.service.LinkGroupLocalServiceUtil"%>
<%@ include file="/linkview/init.jsp" %>

<liferay-portlet:actionURL portletConfiguration="<%=true%>"	var="configurationActionURL" />
<liferay-portlet:renderURL portletConfiguration="<%=true%>"	var="configurationRenderURL" />
<%
	List<LinkGroup> listLinkGroup = LinkGroupLocalServiceUtil.getByGroupId(groupId);
	if (Validator.isNull(linkGroupSel)) {
		linkGroupSel = "-1";
	}
%>
<aui:form action="<%=configurationActionURL%>" method="post" name="fm">
	<aui:input name="<%=Constants.CMD%>" type="hidden" value="<%=Constants.UPDATE%>" />
	<aui:input name="redirect" type="hidden" value="<%=configurationRenderURL%>" />

	<aui:fieldset>
		<aui:row>
			<aui:col width="50">
				<aui:select name="styleSel" label="portlet.common.display.style" >
					<aui:option value="01" selected="<%="01".equals(styleSel)%>"><liferay-ui:message key="portlet.common.display.home"/></aui:option>
					<aui:option value="02" selected="<%="02".equals(styleSel)%>"><liferay-ui:message key="portlet.common.display.page"/></aui:option>
				</aui:select>
			</aui:col>
		</aui:row>
		<aui:row>
			<aui:col width="50">
				<aui:select name="linkGroupSel" label="portlet.common.display.category" multiple="true" height="300">
					<aui:option value="-1"><liferay-ui:message key="portlet.common.select.all"/></aui:option>
					<% 	if(Validator.isNotNull(listLinkGroup)){
						for(LinkGroup linkGroup:listLinkGroup){ 
							String lgId = String.valueOf(linkGroup.getLinkgroupId());
					%>
				    <aui:option value="<%=linkGroup.getLinkgroupId() %>" selected="<%=linkGroupSel.indexOf(lgId)>-1%>" ><%=linkGroup.getName() %></aui:option>
				    <%}} %>
				</aui:select>
			</aui:col>
		</aui:row>
	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>