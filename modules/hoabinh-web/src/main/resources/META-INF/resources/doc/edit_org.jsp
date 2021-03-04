<%@page import="vn.gov.hoabinh.service.vdocOrgLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalOrgLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/doc/init.jsp" %>

<%
	String orgId = ParamUtil.getString(request, "orgId", "0");
	vdocOrg org = null;
	boolean statusOrg = false;
	if (!"0".equals(orgId)) {
		org = vdocOrgLocalServiceUtil.getOrg(orgId);
		statusOrg = org.getStatusOrg();
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/doc/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.doc.general-manage"/>
	<portlet:param name="tabs2" value="portlet.doc.org"/>
</portlet:renderURL>

<portlet:actionURL var="saveOrg" name="crud_org"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(orgId)) ? "add" : "update"  %>' />
	
	
<aui:form action="<%= saveOrg %>" method="post" name="fm">
<aui:input name="cmd" type="hidden" value='<%= "0".equals(orgId)?"add":"update" %>' />

<aui:row>
	<aui:col width="50">
		<aui:input label="code" name="code" value="<%=!"0".equals(orgId)?org.getCode():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.legal.org.name" name="name" value="<%=!"0".equals(orgId)?org.getName():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="description" name="description" value="<%=!"0".equals(orgId)?org.getDescription():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="address" name="address" value="<%=!"0".equals(orgId)?org.getAddress():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="phone" name="phone" value="<%=!"0".equals(orgId)?org.getPhone():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="fax" name="fax" value="<%=!"0".equals(orgId)?org.getFax():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="status" name="statusorg" type="checkbox" checked="<%= statusOrg%>"/>	
	</aui:col>
</aui:row>

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>
