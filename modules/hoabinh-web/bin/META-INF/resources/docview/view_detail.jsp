<%@page import="vn.gov.hoabinh.service.vdocDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.vdocDocument"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.model.VLegalType"%>
<%@page import="vn.gov.hoabinh.model.VLegalOrg"%>
<%@page import="vn.gov.hoabinh.model.VLegalField"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@ include file="/docview/init.jsp" %>
<% 
	String documentId = ParamUtil.getString(request, "documentId", "0");
	vdocDocument document = vdocDocumentLocalServiceUtil.getDocument(documentId);
	List<vdocField> fields = vdocFieldLocalServiceUtil.getFieldByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
	List<vdocOrg> orgs = vdocOrgLocalServiceUtil.getOrgByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
	// List<VLegalDocument> listOtherDocument = VLegalDocumentLocalServiceUtil.getDocumentByG_L_F_S_D(groupId, PortalConstant.DEFAULT_LANGUAGE, document.getFieldId(), documentId, 10);
%>

<div class="box_border">
	<div class="table-responsive">
		<table class="table table-bordered table-hover">
		<tr>
			<td width="30%"><liferay-ui:message key="portlet.doc.document.title"/></td>
			<td width="70%"><%=document.getTitle() %></td>
		</tr>
		<tr>
			<td width="30%"><liferay-ui:message key="portlet.legal.org"/></td>
			<td width="70%"><%=document.getProcess() %></td>
		</tr>
		<tr>
			<td width="30%"><liferay-ui:message key="portlet.legal.field"/></td>
			<td width="70%"><%=document.getProcess() %></td>
		</tr>
		<tr>
			<td width="30%"><liferay-ui:message key="portlet.doc.level"/></td>
			<td width="70%"><%=document.getProcess() %></td>
		</tr>
		<tr>
			<td width="30%"><liferay-ui:message key="portlet.doc.document.process"/></td>
			<td width="70%"><%=document.getProcess() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.legal.document.promul"/></td>
			<td><%=FormatData.parseDateToTringDDMMYYY(document.getPromulDate()) %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.doc.document.style"/></td>
			<td><%=document.getStyle() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.doc.document.content"/></td>
			<td><%=document.getContent() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.doc.document.time"/></td>
			<td><%=document.getTimeProcess() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.doc.document.org-execute"/></td>
			<td><%=document.getExecuteOrg() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.doc.document.object"/></td>
			<td><%=document.getObjects() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.doc.document.form-declaration"/></td>
			<td><%=document.getNote() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.doc.document.cost"/></td>
			<td><%=document.getCost() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.doc.document.request-or-condition"/></td>
			<td><%=document.getRequireDoc() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.doc.document.base"/></td>
			<td><%=document.getBase() %></td>
		</tr>
		</table>
	</div>
	
	<div>
		<%if(document.getHasAttachment()){ 			
		%>
		<ul>
			<% List<Attachment> listAttachment = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(document.getDocId()), vdocDocument.class);
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
		<%} %>
	</div>
	
	<div class="text-center">
		<a href="#" onclick="window.history.go(-1); return false;"><liferay-ui:icon image="back" message="back"/></a>
         <a href="#" onclick="window.print();"><liferay-ui:icon image="print" message="print"/></a>
	</div>
	
	<%-- <div class="clear"></div>
	<div id="footerOfNewDetail">
		<div class="clear"></div>
		<div class="clear"></div>
		<% if (Validator.isNotNull(listOtherDocument) && listOtherDocument.size()>0){ %>
		<div class="list_detail">
			<span class="title"><liferay-ui:message key="portlet.legal.document.other"/></span>
			<ul class="ul_list_detail">
				<% for(VLegalDocument docOther: listOtherDocument) {
				%>
				<portlet:renderURL var="viewDocument" > 
					 <portlet:param name="documentId" value="<%=docOther.getDocId() %>" /> 
					 <portlet:param name="mvcRenderCommandName" value="view_detail"/>
				 </portlet:renderURL>
				<li><a href="<%=viewDocument%>"><%=docOther.getSummary() %>
				<span class="time">(<%=FormatData.parseDateToTringType3(docOther.getPublishedDate()) %>) </span></a></li>
				<% } %>
			</ul>
		</div>
		<%} %>
	</div> --%>
</div>
