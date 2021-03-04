<%@page import="vn.gov.hoabinh.service.LinksLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.LinkGroupLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="vn.gov.hoabinh.util.DateUtil"%>
<%@page import="vn.gov.hoabinh.service.AdvItemLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.LinkGroup"%>
<%@page import="vn.gov.hoabinh.model.Links"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.AdvTypeLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/link/init.jsp"%>

<%
	String linkId = ParamUtil.getString(request, "linkId", "0");
	List<LinkGroup> listLinkGroup = LinkGroupLocalServiceUtil.getByGroupId(groupId);
	Links link = null;
	long linkGroupId = 0;
	boolean status = false;
	String expriedDate = "";
	if (!"0".equals(linkId)) {
		link = LinksLocalServiceUtil.getLinks(Long.parseLong(linkId));
		linkGroupId = link.getLinkgroupId();
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/link/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.link.linkitem" />
</portlet:renderURL>

<portlet:actionURL var="saveLinkURL" name="addOrUpdateLinks"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>" title='<%= ("0".equals(linkId)) ? "add" : "update"  %>' />

<aui:form action="<%= saveLinkURL %>" method="post" name="fm">
<aui:input name="linkId" type="hidden" value='<%= linkId %>' />
<aui:row>
	<aui:col width="50">
		<aui:select name="linkgroupId" label="portlet.link.group" >
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(LinkGroup linkGroup:listLinkGroup){ %>
		    <aui:option value="<%=linkGroup.getLinkgroupId() %>" selected="<%=(linkGroupId==linkGroup.getLinkgroupId())%>"><%=linkGroup.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="50">
		<aui:input  name="name" label="name" value="<%=!"0".equals(linkId)?link.getName():"" %>">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="description" label="description" value="<%=!"0".equals(linkId)?link.getDescription():"" %>">
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="url" label="url" value="<%=!"0".equals(linkId)?link.getUrl():"" %>">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" cssClass="btn-lg" href="<%=viewURL %>" />
</aui:button-row>
</aui:form>

<aui:script>
AUI().use('aui-datepicker', function(A) {
	new A.DatePicker({
		trigger : '#<portlet:namespace/>expriedDate',
		popover : {
		zIndex : 1
	},
	 mask: '%d/%m/%Y'
	});
});	

</aui:script>