<%@page import="vn.gov.hoabinh.service.VLegalTypeLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/legal/init.jsp" %>

<%
	String typeId = ParamUtil.getString(request, "typeId", "0");
	VLegalType type = null;
	boolean statusType = false;
	boolean rssable = false;
	if (!"0".equals(typeId)) {
		type = VLegalTypeLocalServiceUtil.getType(typeId);
		statusType = type.getStatusType();
		rssable = type.getRssable();
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/legal/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.legal.general-manage"/>
	<portlet:param name="tabs2" value="portlet.legal.type"/>
</portlet:renderURL>

<portlet:actionURL var="saveType" name="crud_type"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(typeId)) ? "add" : "update"  %>' />
	
	
<aui:form action="<%= saveType %>" method="post" name="fm">
<aui:input name="cmd" type="hidden" value='<%= "0".equals(typeId)?"add":"update" %>' />

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.legal.type.name" name="name" value="<%=!"0".equals(typeId)?type.getName():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="description" name="description" value="<%=!"0".equals(typeId)?type.getDescription():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input name="statusType" label="portlet.common.status" type="checkbox" checked="<%= statusType%>"/>	
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
