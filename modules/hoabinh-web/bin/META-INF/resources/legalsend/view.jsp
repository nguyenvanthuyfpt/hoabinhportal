<%@ include file="/legalsend/init.jsp"%>
<%@page import="vn.gov.hoabinh.util.DateUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalType"%>
<%@page import="vn.gov.hoabinh.service.VLegalFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalField"%>
<%@page import="vn.gov.hoabinh.service.VLegalDraftDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalDraftDocument"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="java.util.*"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="vn.gov.hoabinh.util.PortletKeys" %>
<%
	List<VLegalField> fields = VLegalFieldLocalServiceUtil.getFieldByGroupId(groupId);
	List<VLegalType> types = VLegalTypeLocalServiceUtil.getTypeByGroupId(groupId);

	String fieldId = ParamUtil.getString(request, "fieldId", "0");
	String typeId = ParamUtil.getString(request, "typeId", "0");
	String keywords = ParamUtil.getString(request, "keywords");
	int status = ParamUtil.getInteger(request, "status", -1);
	
	String hasSearch = ParamUtil.getString(request, "hasSearch", StringPool.BLANK);
	
	int index = 1;
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = Integer.parseInt(numSel);
	String msgEmpty = "khong-co-du-lieu";
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	
	Date fromDate = new Date();
	Date toDate = new Date();
	boolean isFromTo = false;
	boolean approved = true;	
	SearchContainer<VLegalDraftDocument> searchContainer = new SearchContainer<VLegalDraftDocument>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, renderURL, null, msgEmpty);
	
	int total = "".equals(hasSearch) ? VLegalDraftDocumentLocalServiceUtil.countDraftPublished(groupId, PortalConstant.DEFAULT_LANGUAGE, 2) : 
			VLegalDraftDocumentLocalServiceUtil.countDraft(groupId, PortalConstant.DEFAULT_LANGUAGE, keywords, fieldId, typeId, null, null, status);	
	List<VLegalDraftDocument> drafts = new ArrayList<VLegalDraftDocument>();	
	
	if(total > 0){
		searchContainer.setTotal(total);
		int start = searchContainer.getStart();
		int end = searchContainer.getEnd();
		
		drafts = "".equals(hasSearch) ? VLegalDraftDocumentLocalServiceUtil.getDraftPublished(groupId, PortalConstant.DEFAULT_LANGUAGE, 2, start, end):
			VLegalDraftDocumentLocalServiceUtil.searchDraft(groupId, PortalConstant.DEFAULT_LANGUAGE, keywords, fieldId, typeId, null, null, status, start, end);

	}
%>

<portlet:actionURL var="searchLegalDraft" name="searchDraft">
</portlet:actionURL>

<form action="<%=searchLegalDraft.toString()%>" method="post">
<div class="box_border">
	
	<aui:row>
		<aui:col width="50">
			<aui:select name="fieldId" label="portlet.legal.field" >
				<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<% for(VLegalField field:fields){ %>
			    <aui:option value="<%=field.getFieldId() %>" selected="<%= fieldId.equals(field.getFieldId()) %>"><%=field.getName() %></aui:option>
			    <%} %>
			</aui:select>
		</aui:col>
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
			<aui:input  name="keywords" label="keywords" placeholder="portlet.common.input.keyword" value="<%=keywords %>" />
		</aui:col>
		<aui:col width="50">
			<aui:select name="status" label="status">
				<aui:option value="-1"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<aui:option value="3"><liferay-ui:message key="portlet.legal.draft.status.expired"/></aui:option>
				<aui:option value="2"><liferay-ui:message key="portlet.legal.draft.status.suggest"/></aui:option>
			</aui:select>
		</aui:col>
	</aui:row>
	
	<aui:button-row>
		<aui:button type="submit" icon="icon-search" value="search"/>
		<aui:button type="button" icon="icon-remove" value="cancel" />
	</aui:button-row> 

	<div class="table-responsive">
		<table class="table table-bordered table-hover">
		<tr>
			<th width="5%"><liferay-ui:message key="portlet.common.stt"/></th>
			<th width="65%"><liferay-ui:message key="portlet.legal.draft.title"/></th>
			<th width="25%"><liferay-ui:message key="status"/></th>
			<th width="5%">&nbsp;</th>
		</tr>
		<%  int i=1;
			if (Validator.isNotNull(drafts) && drafts.size()>0){
			for (VLegalDraftDocument draft : drafts) {
			
			 %>
			 <portlet:renderURL var="viewDraft" > 
				 <portlet:param name="draftId" value="<%=draft.getDraftId() %>" />
				 <portlet:param name="cmd" value="view_draft" /> 
				 <portlet:param name="mvcRenderCommandName" value="view_detail"/>
			 </portlet:renderURL>
			 
			 <portlet:renderURL var="sendSuggest" > 
				 <portlet:param name="draftId" value="<%=draft.getDraftId() %>" />
				 <portlet:param name="cmd" value="send_sugguest" /> 
				 <portlet:param name="mvcRenderCommandName" value="view_detail"/>
			 </portlet:renderURL>
		<tr>
			<td><label class="oep-label"><%=searchContainer.getStart() + index++ %></label></td>
			<td>
				<div><a href="<%=viewDraft%>"><%=draft.getTitle() %></a></div>
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
			</td>
			<td>
				<% if (draft.isExpired()) { %>
					<liferay-ui:message key="portlet.legal.draft.status.expired"/>
				<% } else { %>
					<liferay-ui:message key="portlet.legal.draft.status.suggest"/>
				<% } %>
			</td>
			<td>
				<% if (!draft.isExpired()) { %>
				<a href="<%=sendSuggest %>" ><liferay-ui:icon image="add_article" message="portlet.legal.draft.send"/></a>
				<% } %>
			</td>
		</tr>
		<% 	
			}} else {
		%>
		<tr>
			<td colspan="4">
				<div class="alert alert-info" style="float:left;width:100%;">
				    <liferay-ui:message key="portlet.legal.no-draft"/>
				</div>
			</td>
		</tr>
		<% } %>
		</table>		
	</div>
	
	<div id = "pagination">
		<liferay-ui:search-paginator  searchContainer="<%= searchContainer %>"  type="approximate"/>
	</div>
</div>
</form>