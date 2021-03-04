<%@page import="vn.gov.hoabinh.service.vdocFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.vdocOrgLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/doc/init.jsp" %>

<%
	String fieldId = ParamUtil.getString(request, "fieldId", "0");
	vdocField field = null;
	boolean status = false;
	if (!"0".equals(fieldId)) {
		field = vdocFieldLocalServiceUtil.getField(fieldId);
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/doc/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.doc.general-manage"/>
	<portlet:param name="tabs2" value="portlet.doc.field"/>
</portlet:renderURL>

<portlet:actionURL var="saveField" name="crud_field"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(fieldId)) ? "add" : "update"  %>' />
	
	
<aui:form action="<%= saveField %>" method="post" name="fm">
<aui:input name="cmd" type="hidden" value='<%= "0".equals(fieldId)?"add":"update" %>' />

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.legal.org.name" name="name" value="<%=!"0".equals(fieldId)?field.getName():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="description" name="description" value="<%=!"0".equals(fieldId)?field.getDescription():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="status" name="statusfield" type="checkbox" checked="<%= status%>"/>	
	</aui:col>
</aui:row>

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>
