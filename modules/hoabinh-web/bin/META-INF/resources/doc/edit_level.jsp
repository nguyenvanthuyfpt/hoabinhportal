<%@page import="vn.gov.hoabinh.service.vdocLevelLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.vdocFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.vdocField"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/doc/init.jsp" %>

<%
	String levelId = ParamUtil.getString(request, "levelId", "0");
	vdocLevel level = null;
	if (!"0".equals(levelId)) {
		level = vdocLevelLocalServiceUtil.getLevel(levelId);
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/doc/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.doc.general-manage"/>
	<portlet:param name="tabs2" value="portlet.doc.level"/>
</portlet:renderURL>

<portlet:actionURL var="saveLevel" name="crud_level"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(levelId)) ? "add" : "update"  %>' />
	
	
<aui:form action="<%= saveLevel %>" method="post" name="fm">
<aui:input name="cmd" type="hidden" value='<%= "0".equals(levelId)?"add":"update" %>' />

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.legal.field.name" name="name" value="<%=!"0".equals(levelId)?level.getName():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="description" name="description" value="<%=!"0".equals(levelId)?level.getDescription():""%>"/>	
	</aui:col>
</aui:row>

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>
