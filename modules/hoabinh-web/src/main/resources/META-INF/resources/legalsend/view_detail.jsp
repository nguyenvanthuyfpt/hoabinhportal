<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.util.DateUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalType"%>
<%@page import="vn.gov.hoabinh.service.VLegalFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="vn.gov.hoabinh.service.VLegalDraftDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalDraftDocument"%>
<%@ include file="/legalsend/init.jsp" %>
<% 
	String draftId = ParamUtil.getString(request, "draftId", "0");
	VLegalDraftDocument draft = null;
	List<VLegalDraftDocument> listOtherDraftField = null;
	List<VLegalDraftDocument> listOtherDraftType = null;
	VLegalField field = null;
	VLegalType type = null;
	String expireDate = "";
	if (Validator.isNotNull(draftId) && !"0".equals(draftId)){
		draft = VLegalDraftDocumentLocalServiceUtil.getDraft(draftId);
		field = VLegalFieldLocalServiceUtil.getVField(draft.getFieldId());
		type = VLegalTypeLocalServiceUtil.getVLegalType(draft.getTypeId());
		expireDate = FormatData.parseDateToTringDDMMYYY(draft.getExpiredDate());
		listOtherDraftField = VLegalDraftDocumentLocalServiceUtil.getDraftsByG_L_F_S_D(groupId, PortalConstant.DEFAULT_LANGUAGE, draft.getFieldId(), 2, draft.getDraftId(), 10);
		listOtherDraftType = VLegalDraftDocumentLocalServiceUtil.getDraftsByG_L_T_S_D(groupId, PortalConstant.DEFAULT_LANGUAGE, draft.getTypeId(), 2, draft.getDraftId(), 10);
	}
%>

<div class="box_border">
	<div class="table-responsive">
		<table class="table table-bordered table-hover">
		<tr>
			<td width="20%"><liferay-ui:message key="portlet.legal.draft.title"/></td>
			<td width="80%"><%=draft.getTitle() %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.legal.document.field"/></td>
			<td><%=Validator.isNotNull(field)?field.getName():"" %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.legal.document.type"/></td>
			<td><%=Validator.isNotNull(type)?type.getName():"" %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.legal.document.expiredate"/></td>
			<td><%=expireDate %></td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.legal.draft.status"/></td>
			<td>
				<% if(draft.isExpired()){%>
					<liferay-ui:message key="portlet.legal.document.expire"/>
				<%}else{ %>
					<liferay-ui:message key="portlet.legal.document.effective"/>
				<%} %>
			</td>
		</tr>
		<tr>
			<td><liferay-ui:message key="portlet.legal.draft.content"/></td>
			<td><%=draft.getContent() %></td>
		</tr>
		</table>
	</div>
	<div>
		<%if(draft.getHasAttachment()){ 			
		%>
		<ul>
			<% List<Attachment> listAttachment = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(draft.getDraftId()), VLegalDraftDocument.class);
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
	
	<portlet:renderURL var="backURL" > 
		 <portlet:param name="jspPage" value="/legalsend/view.jsp"/>
	 </portlet:renderURL>
	
	<aui:button-row>
		<aui:button type="button" onclick="window.history.go(-1); return false;" icon="icon-undo" value="back" />	
	</aui:button-row> 
	
	<div id="footerOfNewDetail">
		<div class="clear"></div>
		<div class="clear"></div>
		<% if (Validator.isNotNull(listOtherDraftField) && listOtherDraftField.size()>0){ %>
		<div class="list_detail">
			<span class="title"><liferay-ui:message key="portlet.legal.draft.other.field"/></span>
			<ul class="ul_list_detail">
				<% for(VLegalDraftDocument draftOther: listOtherDraftField) {
				%>
				<portlet:renderURL var="viewDraft" > 
					 <portlet:param name="draftId" value="<%=draftOther.getDraftId() %>" /> 
					 <portlet:param name="cmd" value="view_draft" /> 
					 <portlet:param name="mvcRenderCommandName" value="view_detail"/>
				 </portlet:renderURL>
				<li><a href="<%=viewDraft%>"><%=draftOther.getTitle() %>
				<span class="time">(<%=FormatData.parseDateToTringType3(draftOther.getPublishedDate()) %>) </span></a></li>
				<% } %>
			</ul>
		</div>
		<%} %>
		
		<% if (Validator.isNotNull(listOtherDraftType) && listOtherDraftType.size()>0){ %>
		<div class="list_detail">
			<span class="title"><liferay-ui:message key="portlet.legal.draft.other.type"/></span>
			<ul class="ul_list_detail">
				<% for(VLegalDraftDocument draftOther: listOtherDraftType) {
				%>
				<portlet:renderURL var="viewDetailURL" > 
					 <portlet:param name="draftId" value="<%=draftOther.getDraftId() %>" /> 
					 <portlet:param name="cmd" value="view_draft" /> 
					 <portlet:param name="mvcRenderCommandName" value="view_detail"/>
				 </portlet:renderURL>
				<li><a href="<%=viewDetailURL%>"><%=draftOther.getTitle() %>
				<span class="time">(<%=FormatData.parseDateToTringType3(draftOther.getPublishedDate()) %>) </span></a></li>
				<% } %>
			</ul>
		</div>
		<%} %>
	</div>
</div>
