<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="vn.gov.hoabinh.service.VLegalDraftDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalDraftDocument"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="vn.gov.hoabinh.service.AttachmentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalSignerLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalDocument"%>
<%@page import="vn.gov.hoabinh.model.Attachment"%>

<%@page import="vn.gov.hoabinh.model.VLegalField"%>
<%@page import="vn.gov.hoabinh.model.VLegalSigner"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.document.library.kernel.util.DLUtil" %>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry" %>
<%@ include file="/legal/init.jsp" %>
<%
	String draftId = ParamUtil.getString(request, "draftId", "0");
	List<VLegalField> fields = VLegalFieldLocalServiceUtil.getFieldByGroupId(groupId);
	List<VLegalType> types = VLegalTypeLocalServiceUtil.getTypeByGroupId(groupId);
	boolean hasAttachment = false;
	String expiredDate = "";
	VLegalDraftDocument draft = null;
    String fieldId = "0", typeId = "0";
	if (!"0".equals(draftId)) {
		draft = VLegalDraftDocumentLocalServiceUtil.getDraft(draftId);
		fieldId = draft.getFieldId();
		typeId = draft.getTypeId();
		hasAttachment = draft.getHasAttachment();
		expiredDate = Validator.isNotNull(draft.getExpiredDate()) ? DateUtil.convertDateToString(draft.getExpiredDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;
	} else {
		expiredDate = DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y);
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/legal/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.legal.draft"/>
	<portlet:param name="tabs2" value="portlet.legal.draft.document"/>
</portlet:renderURL>

<portlet:actionURL var="saveDraft" name="crud_draft"/>
<liferay-ui:success key="portlet.common.action.successfully" message="Yêu cầu của bạn đã được xử lý thành công!"/>
<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(draftId)) ? "add" : "update"  %>' />
	
	
<aui:form action="<%= saveDraft %>" method="post" name="fm">
<aui:input name="cmd" type="hidden" value='<%= "0".equals(draftId)?"add":"update" %>' />
<aui:input name="draftId" type="hidden" value='<%= draftId %>' />

<aui:row>
	<aui:col width="50">
		<aui:select name="fieldId" label="portlet.legal.field" >
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(VLegalField field:fields){ %>
		    <aui:option value="<%=field.getFieldId() %>" selected="<%= fieldId.equals(field.getFieldId()) %>"><%=field.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:select name="typeId" label="portlet.legal.type">
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(VLegalType type:types){ %>
		    <aui:option value="<%=type.getTypeId() %>" selected="<%= typeId.equals(type.getTypeId()) %>"><%=type.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>		
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.legal.draft.title" name="title" type="textarea"  value="<%=!"0".equals(draftId)?draft.getTitle():""%>" rows="5">
			<aui:validator name="required"/>
			<aui:validator name="maxLength">1000</aui:validator>
		</aui:input>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="portlet.legal.draft.content" >
			<liferay-ui:input-editor name="content" initMethod="initEditor" width="100" height="500" resizable="true" >
			</liferay-ui:input-editor>
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input name="expiredDate" label="portlet.legal.document.expiredate" value="<%=expiredDate %>" >
			<aui:validator name="required"/>
		</aui:input>
	</aui:col>
</aui:row>

<% if (!hasAttachment) { %>
<aui:row>
	<aui:col>
		<div>
			<table id="tb-xacminh">
			<thead>
				<tr>
					<th class=""><liferay-ui:message key="portlet.common.stt" /></th>
					<th class=""><liferay-ui:message key="portlet.common.attach" /></th>
					<th class=""><liferay-ui:message key="portlet.common.filename" /></th>
					<th class=""><aui:button type="button" value="add" onclick="addNewRow('tb-xacminh');" /></th>
				</tr>
			</thead>
			<tr suffix=0>
				<td>1</td>
				<td>
					<input type="file" id="attachment0" name="attachment" multiple="multiple" onchange="showFileName(0)" />
				</td>
				<td><ul id="fileNamesUL0"></ul></td>
				<td>&nbsp;</td>
			</tr>
			</table>
		</div>		
	</aui:col>
</aui:row>
<%} %>

<% if (hasAttachment) { %>
<aui:row>
	<aui:col>
		<ul>
			<% List<Attachment> listAttachment = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(draftId), VLegalDraftDocument.class);
				for(Attachment attachment:listAttachment) {
					long fileEntryId = attachment.getFileEntryId();
					FileEntry fileEntry = DLAppServiceUtil.getFileEntry(fileEntryId);
					String url = DLUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, "");
			%>
				<portlet:actionURL var="deleteFileURL" name="crud_draft">
					<portlet:param name="jspPage" value="/legal/edit_draft_document.jsp" />
					<portlet:param name="cmd" value="<%=PortalConstant.ACTION_DELETE_FILE %>" />
					<portlet:param name="fileEntryId" value="<%=String.valueOf(fileEntry.getFileEntryId())%>" />
					<portlet:param name="draftId" value="<%=draftId%>" />
				</portlet:actionURL>
				<li><a href="<%=url%>">
					<img alt="<%=attachment.getFileName() %>" src="<%=PortalConstant.SRC_IMAGE+"/file_system/small/"+fileEntry.getExtension()+".png"%>" />
					<%=attachment.getFileName() %></a>
					<liferay-ui:icon image="delete" url="<%=deleteFileURL%>" />
				</li>
			<% } %>
		</ul>
	</aui:col>
</aui:row>
<% } %>

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>

<aui:script>
	function <portlet:namespace/>initEditor() {
		var contentValue = "<%=(!"0".equals(draftId)?UnicodeFormatter.toString(draft.getContent()):"")%>";
		return contentValue;
	}
	
	AUI().use('aui-datepicker', function(A) {
		var expireDate =new A.DatePicker({
			trigger : '#<portlet:namespace/>expiredDate',
			popover : {
			zIndex : 1
		},
		 mask: '%d/%m/%Y'
		});
	});	
</aui:script>