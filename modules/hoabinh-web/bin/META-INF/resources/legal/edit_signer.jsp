<%@page import="vn.gov.hoabinh.service.VLegalSignerLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalSigner"%>
<%@page import="vn.gov.hoabinh.service.VLegalOrgLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/legal/init.jsp" %>

<%
	String signerId = ParamUtil.getString(request, "signerId", "0");
	VLegalSigner signer = null;
	boolean statusSigner = false;
	boolean rssable = false;
	if (!"0".equals(signerId)) {
		signer = VLegalSignerLocalServiceUtil.getSigner(signerId);
		statusSigner = signer.getStatusSigner();
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/legal/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.legal.general-manage"/>
	<portlet:param name="tabs2" value="portlet.legal.signer"/>
</portlet:renderURL>

<portlet:actionURL var="saveSigner" name="crud_signer"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(signerId)) ? "add" : "update"  %>' />
	
	
<aui:form action="<%= saveSigner %>" method="post" name="fm">
<aui:input name="cmd" type="hidden" value='<%= "0".equals(signerId)?"add":"update" %>' />

<aui:row>
	<aui:col width="50">
		<aui:input label="firstname" name="firstName" value="<%=!"0".equals(signerId)?signer.getFirstName():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="lastname" name="lastName" value="<%=!"0".equals(signerId)?signer.getLastName():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input name="statusSigner" label="portlet.common.status" type="checkbox" checked="<%= statusSigner%>"/>	
	</aui:col>
</aui:row>

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>
