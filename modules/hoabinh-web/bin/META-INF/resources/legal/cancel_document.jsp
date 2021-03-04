<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="vn.gov.hoabinh.service.AttachmentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalDocument"%>
<%@page import="vn.gov.hoabinh.model.Attachment"%>
<%@page import="vn.gov.hoabinh.service.VLegalFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalField"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.document.library.kernel.util.DLUtil" %>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry" %>
<%@ include file="/legal/init.jsp" %>
<%
	String docId = ParamUtil.getString(request, "docId", "0");
	tabs2 = ParamUtil.getString(request, "tabs2");
	String cmd = "portlet.legal.document.published".equals(tabs2) ? PortalConstant.ACTION_CANCEL_PUBLISH : PortalConstant.ACTION_CANCEL_APPROVE;
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/legal/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.legal.document"/>
	<portlet:param name="tabs2" value="<%=tabs2 %>"/>
</portlet:renderURL>

<portlet:actionURL var="cancelDocument" name="crud_document">
	<portlet:param name="cmd" value="<%= cmd %>"/>
</portlet:actionURL>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>" title='action.cancel-publish' />

<aui:form action="<%= cancelDocument %>" method="post" name="fm">
<aui:input name="docId" type="hidden" value='<%= docId %>' />
<aui:input label="portlet.legal.document.cancel" name="content" type="textarea" rows="3" />

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>