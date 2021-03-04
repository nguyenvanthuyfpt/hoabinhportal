<%@ include file="/legalmenu/init.jsp" %>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>

<%@page import="vn.gov.hoabinh.model.VLegalField"%>
<%@page import="vn.gov.hoabinh.model.VLegalType"%>
<%@page import="vn.gov.hoabinh.model.VLegalOrg"%>
<%@page import="vn.gov.hoabinh.service.VLegalOrgLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalFieldLocalServiceUtil"%>

<%
	List<VLegalField> fields = VLegalFieldLocalServiceUtil.getFieldByGroupId(groupId);
	List<VLegalType> types = VLegalTypeLocalServiceUtil.getTypeByGroupId(groupId);
	List<VLegalOrg> orgs = VLegalOrgLocalServiceUtil.getOrgByGroupId(groupId);
%>

<div>
	<div class="header-legal"><liferay-ui:message key="portlet.legal.field"/></div>
	<div class="menu-legal">
	<ul>
		<% for (VLegalField field:fields) { 
			documentURL.setParameter("fieldId", field.getFieldId());
		%>
			<li><a href="<%=documentURL%>"><%= field.getName() %></a></li>
		<% } %>
	</ul>
	</div>
	<div class="header-legal"><liferay-ui:message key="portlet.legal.type"/></div>
	<div class="menu-legal">
	<ul>
		<% for (VLegalType type:types) { 
			documentURL.setParameter("typeId", type.getTypeId());
		%>
			<li><a href="<%=documentURL%>"><%= type.getName() %></a></li>
		<% } %>
	</ul>
	</div>
	<div class="header-legal"><liferay-ui:message key="portlet.legal.org"/></div>
	<div class="menu-legal">
	<ul>
		<% for (VLegalOrg org:orgs) { 
			documentURL.setParameter("orgId", org.getOrgId());
		%>
			<li><a href="<%=documentURL%>"><%= org.getName() %></a></li>
		<% } %>
	</ul>
	</div>
</div>