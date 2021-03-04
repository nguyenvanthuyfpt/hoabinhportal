<%@page import="vn.gov.hoabinh.model.VLegalDocument"%>
<%@page import="vn.gov.hoabinh.util.ActionUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@ include file="/legal/init.jsp" %>
<%
	String docId = ParamUtil.getString(request, "docId", "0");
	VLegalDocument document = null;
	String promulDate = "";
	if (!"0".equals(docId)) {
		document = VLegalDocumentLocalServiceUtil.getDocument(docId);
		promulDate = Validator.isNotNull(document.getPromulDate()) ? DateUtil.convertDateToString(document.getPromulDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;
	} else {
		promulDate = Validator.isNotNull(document.getPromulDate()) ? DateUtil.convertDateToString(document.getPromulDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/legal/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.legal.document"/>
	<portlet:param name="tabs2" value="portlet.legal.document.published"/>
</portlet:renderURL>

<portlet:actionURL var="selectPromulDate" name="crud_document">
	<portlet:param name="cmd" value="<%= PortalConstant.ACTION_SELECT_DATE%>"/>
</portlet:actionURL>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>" title="action.document.select-promul-date" />
<aui:form action="<%= selectPromulDate %>" method="post" name="fm">
<aui:input name="docId" type="hidden" value='<%= docId %>' />
<aui:input name="tabs2" type="hidden" value='<%= tabs2 %>' />

<aui:row>
	<aui:col width="100">
		<aui:input name="promulDate" label="portlet.legal.document.promul" value="<%=promulDate %>"/>
	</aui:col>
</aui:row>

<aui:button-row >
	<aui:button type="submit" value="save" icon="icon-ok-sign" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>

<aui:script>
	AUI().use('aui-datepicker', function(A) {
		var publishedDate =new A.DatePicker({
			trigger : '#<portlet:namespace/>promulDate',
			popover : {
			zIndex : 1
		},
		 mask: '%d/%m/%Y'
		});
	});	
</aui:script>
