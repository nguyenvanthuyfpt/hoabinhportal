<%@page import="vn.gov.hoabinh.service.VLegalOrgLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/legal/init.jsp" %>

<%
	String orgId = ParamUtil.getString(request, "orgId", "0");
	VLegalOrg org = null;
	boolean statusOrg = false;
	boolean rssable = false;
	if (!"0".equals(orgId)) {
		org = VLegalOrgLocalServiceUtil.getOrg(orgId);
		statusOrg = org.getStatusOrg();
		rssable = org.getRssable();
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/legal/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.legal.general-manage"/>
	<portlet:param name="tabs2" value="portlet.legal.org"/>
</portlet:renderURL>

<portlet:actionURL var="saveOrg" name="crud_org"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(orgId)) ? "add" : "update"  %>' />
	
	
<aui:form action="<%= saveOrg %>" method="post" name="fm">
<aui:input name="cmd" type="hidden" value='<%= "0".equals(orgId)?"add":"update" %>' />

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
		<aui:input name="statusOrg" label="portlet.common.status" type="checkbox" checked="<%= statusOrg%>"/>	
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
