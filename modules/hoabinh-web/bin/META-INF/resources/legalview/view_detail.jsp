<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.VLegalTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalType"%>
<%@page import="vn.gov.hoabinh.service.VLegalOrgLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalOrg"%>
<%@page import="vn.gov.hoabinh.service.VLegalFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalField"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="vn.gov.hoabinh.service.VLegalDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalDocument"%>
<%@ include file="/legalview/init.jsp" %>
<% 
	VLegalDocument document = VLegalDocumentLocalServiceUtil.getDocument(documentId);
	VLegalField field = VLegalFieldLocalServiceUtil.getVField(document.getFieldId());
	VLegalOrg org = VLegalOrgLocalServiceUtil.getOrg(document.getOrgId());
	VLegalType type = VLegalTypeLocalServiceUtil.getType(document.getTypeDocId());
	List<VLegalDocument> listOtherDocument = VLegalDocumentLocalServiceUtil.getDocumentByG_L_F_S_D(groupId, PortalConstant.DEFAULT_LANGUAGE, document.getFieldId(), documentId, 10);
%>

<div class="box_border">
	<div class="table-responsive">
		<table class="table table-bordered table-hover">
		<tr>
			<td width="30%"><liferay-ui:message key="portlet.legal.document.number"/></td>
			<td width="70%"><%=document.getNum() %></td>
		</tr>
		<tr>
			<td width="30%"><liferay-ui:message key="portlet.legal.document.symbol"/></td>
			<td width="70%"><%=document.getSymbol() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.legal.document.promul"/></td>
			<td><%=FormatData.parseDateToTringDDMMYYY(document.getPromulDate()) %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.legal.document.signer"/></td>
			<td><%=document.getSignerRels() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.legal.document.summary"/></td>
			<td><%=document.getSummary() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.legal.document.org"/></td>
			<td><%=org.getName() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.legal.document.type"/></td>
			<td><%=type.getName() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.legal.document.field"/></td>
			<td><%=field.getName() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.legal.document.status"/></td>
			<td>
				<% if(document.getStatusDoc()==2){%>
					<liferay-ui:message key="portlet.legal.document.effective"/>
				<%}else{ %>
					<liferay-ui:message key="portlet.legal.document.expire"/>
				<%} %>
			</td>
		</tr>
		</table>
	</div>
	<div>
		<%if(document.getHasAttachment()){ 			
		%>
		<ul>
			<% List<Attachment> listAttachment = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(document.getDocId()), VLegalDocument.class);
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
	<div class="clear"></div>
	
	<div class="text-center">
		<a href="#" onclick="window.history.go(-1); return false;"><liferay-ui:icon image="back" message="back"/></a>
         <a href="#" onclick="window.print();"><liferay-ui:icon image="print" message="print"/></a>
	</div>
	
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
	</div>
</div>
