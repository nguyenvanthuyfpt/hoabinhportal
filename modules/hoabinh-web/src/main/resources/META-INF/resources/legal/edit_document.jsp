<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	String docId = ParamUtil.getString(request, "docId", "0");
	List<VLegalField> fields = VLegalFieldLocalServiceUtil.getFieldByGroupId(groupId);
	List<VLegalType> types = VLegalTypeLocalServiceUtil.getTypeByGroupId(groupId);
	List<VLegalOrg> orgs = VLegalOrgLocalServiceUtil.getOrgByGroupId(groupId);
	List<VLegalSigner> signers = VLegalSignerLocalServiceUtil.getSignerByGroupId(groupId);
	VLegalDocument document = null;
	boolean statusField = false;
	boolean hasAttachment = false;
	String promulDate = "";
    String effectivedDate = "";
    String expiredDate = "";
    String fieldId = "0", typeId = "0", orgId = "0";
    int status = 0;
	if (!"0".equals(docId)) {
		document = VLegalDocumentLocalServiceUtil.getDocument(docId);
		promulDate = Validator.isNotNull(document.getPromulDate()) ? DateUtil.convertDateToString(document.getPromulDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;
		effectivedDate = Validator.isNotNull(document.getEffectivedDate()) ? DateUtil.convertDateToString(document.getEffectivedDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;
		expiredDate = Validator.isNotNull(document.getExpiredDate()) ? DateUtil.convertDateToString(document.getExpiredDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;
		fieldId = document.getFieldId();
		typeId = document.getTypeDocId();
		orgId = document.getOrgId();
		hasAttachment = document.getHasAttachment();
		status = document.getStatusDoc();
	} else {
		promulDate = DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y);
		effectivedDate = DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y);
		expiredDate = DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y);
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/legal/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.legal.document"/>
</portlet:renderURL>

<portlet:actionURL var="saveDocument" name="crud_document"/>
<liferay-ui:success key="portlet.common.action.successfully" message="Yêu cầu của bạn đã được xử lý thành công!"/>
<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(docId)) ? "add" : "update"  %>' />
	
	
<aui:form action="<%= saveDocument %>" method="post" name="fm">
<aui:input name="cmd" type="hidden" value='<%= "0".equals(docId)?"add":"update" %>' />
<aui:input name="docId" type="hidden" value='<%= docId %>' />
<aui:input name="tabs2" type="hidden" value='<%= tabs2 %>' />
<aui:input name="status" type="hidden" value='<%= String.valueOf(status) %>' />
<aui:row>
	<aui:col width="60">
		<aui:input label="portlet.legal.document.number" name="num" value="<%=!"0".equals(docId)?document.getNum():""%>" >
			<aui:validator name="required"/>
		 	<aui:validator name="maxLength">50</aui:validator>
		</aui:input>		
	</aui:col>
	<aui:col width="40">
		<aui:select name="fieldId" label="portlet.legal.field" >
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(VLegalField field:fields){ %>
		    <aui:option value="<%=field.getFieldId() %>" selected="<%= fieldId.equals(field.getFieldId()) %>"><%=field.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="60">
		<aui:input label="portlet.legal.document.symbol" name="symbol" value="<%=!"0".equals(docId)?document.getSymbol():""%>">
			<aui:validator name="required"/>
		 	<aui:validator name="maxLength">50</aui:validator>
		</aui:input>
	</aui:col>
	<aui:col width="40">
		<aui:select name="typeId" label="portlet.legal.type">
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(VLegalType type:types){ %>
		    <aui:option value="<%=type.getTypeId() %>" selected="<%= typeId.equals(type.getTypeId()) %>"><%=type.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>		
</aui:row>

<aui:row>
	<aui:col width="60">
		<aui:input label="portlet.legal.document.summary" name="summary" type="textarea" value="<%=(!"0".equals(docId)?document.getSummary():"") %>" rows="3" >
			<aui:validator name="required"/>
		 	<aui:validator name="maxLength">500</aui:validator>
		</aui:input>
	</aui:col>
	<aui:col width="40">
		<aui:select name="orgId" label="portlet.legal.org">
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(VLegalOrg org:orgs){ %>
		    <aui:option value="<%=org.getOrgId() %>" selected="<%=orgId.equals(org.getOrgId()) %>"><%=org.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="60">
		<aui:field-wrapper label="portlet.legal.document.content" >
			<liferay-ui:input-editor name="content" initMethod="initEditor" toolbarSet="liferay-article" width="100" height="500" resizable="true" >
			</liferay-ui:input-editor>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="40">
		<aui:select name="signerIds" label="portlet.legal.signer" size="5" multiple="true">
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(VLegalSigner signer:signers){ %>
		    <aui:option value="<%=signer.getSigId() %>"><%=signer.getFirstName()+" "+signer.getLastName()%></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="60">
		&nbsp;
	</aui:col>
	<aui:col width="40">
		<aui:input name="promulDate" label="portlet.legal.document.promul" value="<%=promulDate %>"/>
		<aui:input name="effectivedDate" label="portlet.legal.document.effectivedate" value="<%=effectivedDate %>"/>
		<aui:input name="expiredDate" label="portlet.legal.document.expiredate" value="<%=expiredDate %>"/>
	</aui:col>
</aui:row>

<% if (!hasAttachment) { %>
<aui:row>
	<aui:col colspan="2">
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
					<input type="file" id="attachment0" name="attachment" multiple="multiple" onchange="showFileName(0)" 
						accept="application/msword, application/vnd.ms-excel, application/vnd.ms-powerpoint,application/vnd.openxmlformats-officedocument.wordprocessingml.document, application/pdf"
					/>
				</td>
				<td><ul id="fileNamesUL0"></ul></td>
				<td>&nbsp;</td>
			</tr>
			</table>
		</div>		
	</aui:col>
</aui:row>
<%} %>

<% if (hasAttachment && document.getStatusDoc()==2) { %>
<aui:row>
	<aui:col colspan="2">
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
	<aui:col colspan="2">
		<ul>
			<% List<Attachment> listAttachment = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(docId), VLegalDocument.class);
				for(Attachment attachment:listAttachment) {
					long fileEntryId = attachment.getFileEntryId();
					FileEntry fileEntry = DLAppServiceUtil.getFileEntry(fileEntryId);
					String url = DLUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, "");
			%>
				<portlet:actionURL var="deleteFileURL" name="crud_document">
					<portlet:param name="jspPage" value="/legal/edit_document.jsp" />
					<portlet:param name="cmd" value="<%=PortalConstant.ACTION_DELETE_FILE %>" />
					<portlet:param name="fileEntryId" value="<%=String.valueOf(fileEntry.getFileEntryId())%>" />
					<portlet:param name="docId" value="<%=docId%>" />
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
		var contentValue = "<%=(!"0".equals(docId)?UnicodeFormatter.toString(document.getContent()):"")%>";
		return contentValue;
	}
	
	AUI().use('aui-datepicker', function(A) {
		var publishedDate =new A.DatePicker({
			trigger : '#<portlet:namespace/>promulDate',
			popover : {
			zIndex : 1
		},
		 mask: '%d/%m/%Y'
		});
		
		var effectiveDate =new A.DatePicker({
			trigger : '#<portlet:namespace/>effectivedDate',
			popover : {
			zIndex : 1
		},
		 mask: '%d/%m/%Y'
		});
		
		var expireDate =new A.DatePicker({
			trigger : '#<portlet:namespace/>expiredDate',
			popover : {
			zIndex : 1
		},
		 mask: '%d/%m/%Y'
		});
	});	
</aui:script>
