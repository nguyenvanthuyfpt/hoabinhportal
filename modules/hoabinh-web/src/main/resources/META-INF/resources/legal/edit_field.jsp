<%@page import="vn.gov.hoabinh.service.VLegalFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalField"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/legal/init.jsp" %>

<%
	String fieldId = ParamUtil.getString(request, "fieldId", "0");
	VLegalField field = null;
	boolean statusField = false;
	boolean rssable = false;
	if (!"0".equals(fieldId)) {
		field = VLegalFieldLocalServiceUtil.getVField(fieldId);
		statusField = field.getStatusField();
		rssable = field.getRssable();
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/legal/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.legal.general-manage"/>
	<portlet:param name="tabs2" value="portlet.legal.field"/>
</portlet:renderURL>

<portlet:actionURL var="saveField" name="crud_field"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(fieldId)) ? "add" : "update"  %>' />
	
	
<aui:form action="<%= saveField %>" method="post" name="fm">
<aui:input name="cmd" type="hidden" value='<%= "0".equals(fieldId)?"add":"update" %>' />

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.legal.field.name" name="name" value="<%=!"0".equals(fieldId)?field.getName():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="description" name="description" value="<%=!"0".equals(fieldId)?field.getDescription():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input name="statusField" label="portlet.common.status" type="checkbox" checked="<%= statusField%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input name="rssable" label="portlet.common.rssable" type="checkbox" checked="<%= rssable%>"/>	
	</aui:col>
</aui:row>

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>
