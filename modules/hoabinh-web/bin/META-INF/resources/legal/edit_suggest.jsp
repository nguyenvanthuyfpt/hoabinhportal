<%@page import="vn.gov.hoabinh.service.VLegalSuggestDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalSuggestDocument"%>
<%@page import="vn.gov.hoabinh.service.VLegalFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalField"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>

<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>

<%@page import="com.liferay.document.library.kernel.util.DLUtil" %>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry" %>
<%@page import="vn.gov.hoabinh.service.AttachmentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.Attachment"%>

<%@ include file="/legal/init.jsp" %>

<%
	String suggestId = ParamUtil.getString(request, "suggestId", "0");
	VLegalSuggestDocument suggest = null;
	boolean approved = false;
	boolean hasAttachment = false;
	String draftId = "0";
	if (!"0".equals(suggestId)) {
		suggest = VLegalSuggestDocumentLocalServiceUtil.getSuggestion(suggestId);
		approved = suggest.getApproved();
		draftId = suggest.getDraftId();
		hasAttachment = suggest.getHasAttachment();
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/legal/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.legal.draft"/>
	<portlet:param name="tabs2" value="portlet.legal.draft.suggest"/>
</portlet:renderURL>

<portlet:actionURL var="saveSugguest" name="crud_sugguest"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(suggestId)) ? "add" : "update"  %>' />
	
	
<aui:form action="<%= saveSugguest %>" method="post" name="fm">
<aui:input name="cmd" type="hidden" value='<%= "0".equals(suggestId)?"add":"update" %>' />
<aui:input name="suggestId" type="hidden" value='<%=suggestId%>' />
<aui:input name="draftId" type="hidden" value='<%=draftId%>' />
<aui:input name="hasAttachment" type="hidden" value='<%=hasAttachment%>' />

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.legal.draft.suggest.title" name="title" value="<%=!"0".equals(suggestId)?suggest.getTitle():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<liferay-ui:input-editor name="content" initMethod="initEditor" toolbarSet="email"  width="100" height="500" resizable="true" >
		</liferay-ui:input-editor>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.legal.draft.suggest.sender" name="visitorname" value="<%=!"0".equals(suggestId)?suggest.getVisitorName():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.legal.draft.suggest.email" name="visitoremail" value="<%=!"0".equals(suggestId)?suggest.getVisitorEmail():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.legal.draft.suggest.phone" name="visitortel" value="<%=!"0".equals(suggestId)?suggest.getVisitorTel():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.legal.draft.suggest.address" name="visitoraddress" value="<%=!"0".equals(suggestId)?suggest.getVisitorAddress():""%>"/>	
	</aui:col>
</aui:row>

<% if (hasAttachment) { %>
<aui:row>
	<aui:col>
		<ul>
			<% List<Attachment> listAttachment = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(suggestId), VLegalSuggestDocument.class);
				for(Attachment attachment:listAttachment) {
					long fileEntryId = attachment.getFileEntryId();
					FileEntry fileEntry = DLAppServiceUtil.getFileEntry(fileEntryId);
					String url = DLUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, "");
			%>
				<li><a href="<%=url%>">
					<img alt="<%=attachment.getFileName() %>" src="<%=PortalConstant.SRC_IMAGE+"/file_system/small/"+fileEntry.getExtension()+".png"%>" />
					<%=attachment.getFileName() %></a>
				</li>
			<% } %>
		</ul>
	</aui:col>
</aui:row>
<% } %>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.legal.draft.suggest.approved" name="approved" type="checkbox" checked="<%= approved%>"/>	
	</aui:col>
</aui:row>

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>

<aui:script>
	function <portlet:namespace/>initEditor() {
		var contentValue = "<%=(!"0".equals(suggestId)?UnicodeFormatter.toString(suggest.getContent()):"")%>";
		return contentValue;
	}
</aui:script>
