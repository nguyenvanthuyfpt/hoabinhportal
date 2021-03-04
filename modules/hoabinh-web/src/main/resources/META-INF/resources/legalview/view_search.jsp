<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/legalview/init.jsp" %>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="vn.gov.hoabinh.util.DateUtil"%>
<%@page import="vn.gov.hoabinh.model.*"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.VLegalDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalField"%>
<%@page import="vn.gov.hoabinh.service.VLegalOrgLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortletKeys" %>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>

<% 
	String fieldId = ParamUtil.getString(request, "fieldId", "0");
	String orgId = ParamUtil.getString(request, "orgId", "0");
	String typeId = ParamUtil.getString(request, "typeId", "0");
	int statusDoc = 0;
	String number = ParamUtil.getString(request, "number", StringPool.BLANK);
	String symbol = ParamUtil.getString(request, "symbol", StringPool.BLANK);
	String summary = ParamUtil.getString(request, "summary", StringPool.BLANK);
	String hasSearch = ParamUtil.getString(request, "search", StringPool.BLANK);
	
	String fromPromul = ParamUtil.getString(request, "fromPromul");
	String toPromul = ParamUtil.getString(request, "toPromul");
	
	String fromEffect = ParamUtil.getString(request, "fromEffect");
	String toEffect = ParamUtil.getString(request, "toEffect");
	
	String fromExpire = ParamUtil.getString(request, "fromExpire");
	String toExpire = ParamUtil.getString(request, "toExpire");
	
	int index = 1;
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = Integer.parseInt(numSel);
	String msgEmpty = "abc";
	
	List<VLegalDocument> documents = new ArrayList<VLegalDocument>();
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("hasSearch", "search");
	
	SearchContainer<VLegalDocument> searchContainer = new SearchContainer<VLegalDocument>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, renderURL, null, msgEmpty);

	List<VLegalField> fields = VLegalFieldLocalServiceUtil.getFieldByGroupId(groupId);
	List<VLegalType> types = VLegalTypeLocalServiceUtil.getTypeByGroupId(groupId);
	List<VLegalOrg> orgs = VLegalOrgLocalServiceUtil.getOrgByGroupId(groupId);
	
	// Search by Date
	
	Date promulDateFrom = DateUtil.parseStringToDate(fromPromul, DateUtil.DATE_FORMAT_D_M_Y);
	Date promulDateTo = DateUtil.parseStringToDate(toPromul + " 23:59:59", DateUtil.DATE_FORMAT_D_M_Y_H_M_S); 
	
	Date effectivedDateFrom  = DateUtil.parseStringToDate(fromEffect, DateUtil.DATE_FORMAT_D_M_Y);
	Date effectivedDateTo = DateUtil.parseStringToDate(toEffect + " 23:59:59", DateUtil.DATE_FORMAT_D_M_Y_H_M_S);
	
	Date expiredDateFrom = DateUtil.parseStringToDate(fromExpire, DateUtil.DATE_FORMAT_D_M_Y);
	Date expiredDateTo = DateUtil.parseStringToDate(toExpire + " 23:59:59", DateUtil.DATE_FORMAT_D_M_Y_H_M_S);
	
	int total =  "".equals(hasSearch) ? (int) VLegalDocumentLocalServiceUtil.countByStatus(groupId, PortalConstant.DEFAULT_LANGUAGE, 2):
		(int) VLegalDocumentLocalServiceUtil.countDocument(groupId, PortalConstant.DEFAULT_LANGUAGE, number, symbol, fieldId, orgId, typeId, 
				promulDateFrom, promulDateTo, effectivedDateFrom, effectivedDateTo, expiredDateFrom, expiredDateTo, summary, 2, true);
	
	if (total>0) {
		searchContainer.setTotal(total);
		int start = searchContainer.getStart();
		int end = searchContainer.getEnd();
		documents = "".equals(hasSearch) ? VLegalDocumentLocalServiceUtil.getDocumentByP_L_S(groupId, PortalConstant.DEFAULT_LANGUAGE, 2, start, end)
			: VLegalDocumentLocalServiceUtil.searchDocument(groupId, PortalConstant.DEFAULT_LANGUAGE, number, symbol, fieldId, orgId, typeId, 
				promulDateFrom, promulDateTo, effectivedDateFrom, effectivedDateTo, expiredDateFrom, expiredDateTo, summary, 2, true, start, end);
		
	}
%>

<portlet:actionURL var="traCuuVanBan" name="searchDocument">
</portlet:actionURL>

<form action="<%=traCuuVanBan.toString()%>" method="post">
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
			<aui:select name="orgId" label="portlet.legal.org">
				<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<% for(VLegalOrg org:orgs){ %>
			    <aui:option value="<%=org.getOrgId() %>" selected="<%=orgId.equals(org.getOrgId()) %>"><%=org.getName() %></aui:option>
			    <%} %>
			</aui:select>
		</aui:col>
		<aui:col width="50">
			<aui:select name="orgId" label="portlet.legal.document.status">
				<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<aui:option value="1" selected="<%=(statusDoc==1)%>"><liferay-ui:message key="portlet.legal.document.effective"/></aui:option>
				<aui:option value="2" selected="<%=(statusDoc==2)%>"><liferay-ui:message key="portlet.legal.document.expire"/></aui:option>
			</aui:select>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="50">
			<aui:input  name="number" label="portlet.legal.document.number" placeholder="portlet.legal.input.number" value="<%=number %>"/>
		</aui:col>
		<aui:col width="50">
			<aui:input  name="symbol" label="portlet.legal.document.symbol" placeholder="portlet.legal.input.symbol" value="<%=symbol %>"/>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="50">
			<aui:input  name="summary" label="portlet.legal.document.summary" placeholder="portlet.legal.input.summary" value="<%=summary %>" />
		</aui:col>
		<aui:col width="50">
			&nbsp;
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="50">
			<aui:input name="fromPromul" label="portlet.legal.document.promul.from" placeholder="portlet.common.search.from" value="<%=fromPromul%>" />
		</aui:col>
		<aui:col width="50">
			<aui:input name="toPromul" label="portlet.common.search.to" placeholder="portlet.common.search.to" value="<%=toPromul%>" />
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="50">
			<aui:input name="fromEffect" label="portlet.legal.document.effectivedate.from" placeholder="portlet.common.search.from" value="<%=fromEffect%>" />
		</aui:col>
		<aui:col width="50">
			<aui:input name="toEffect" label="portlet.common.search.to" placeholder="portlet.common.search.to" value="<%=toEffect%>" />
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="50">
			<aui:input name="fromExpire" label="portlet.legal.document.expiredate.from" placeholder="portlet.common.search.from" value="<%=fromExpire%>" />
		</aui:col>
		<aui:col width="50">
			<aui:input name="toExpire" label="portlet.common.search.to" placeholder="portlet.common.search.to" value="<%=toExpire%>" />
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
			<th width="20%"><liferay-ui:message key="portlet.legal.symbol-num"/></th>
			<th width="65%"><liferay-ui:message key="portlet.legal.summary"/></th>
			<th width="10%"><liferay-ui:message key="portlet.legal.date-promul"/></th>
			<!-- <td><liferay-ui:message key="portlet.legal.document.status"/></td> -->
		</tr>
		<%  int i=1;
			if (documents.size()>0){
			for (VLegalDocument doc : documents) {
			 %>
		<portlet:renderURL var="viewDocument" > 
			 <portlet:param name="documentId" value="<%=doc.getDocId() %>" /> 
			 <portlet:param name="mvcRenderCommandName" value="view_detail"/>
		 </portlet:renderURL>
		<tr>
			<td><label class="oep-label"><%=searchContainer.getStart() + index++ %></label></td>
			<td><%=doc.getSymbol()+"/"+doc.getNum() %></td>
			<td>
				<a href="<%=viewDocument%>"><%=doc.getSummary() %></a>
				<div>
					<%if(doc.getHasAttachment()){ 			
					%>
					<ul>
						<% List<Attachment> listAttachment = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(doc.getDocId()), VLegalDocument.class);
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
			<td><%=FormatData.parseDateToTringDDMMYYY(doc.getPromulDate()) %></td>
		</tr>
		<% 	
			}} else {
		%>
		<tr>
			<td colspan="4">
				<div class="alert alert-info" style="float:left;width:100%;">
				    <liferay-ui:message key="portlet.legal.no-document"/>
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


<aui:script>
AUI().use('aui-datepicker', function(A) {
	var fromPromul =new A.DatePicker({
		trigger : '#<portlet:namespace/>fromPromul',
		popover : {
		zIndex : 1
	},
	 mask: '%d/%m/%Y'
	});
	
	var toPromul =new A.DatePicker({
		trigger : '#<portlet:namespace/>toPromul',
		popover : {
		zIndex : 1
	},
	 mask: '%d/%m/%Y'
	});
	
	var fromEffect =new A.DatePicker({
		trigger : '#<portlet:namespace/>fromEffect',
		popover : {
		zIndex : 1
	},
	 mask: '%d/%m/%Y'
	});
	
	var toEffect =new A.DatePicker({
		trigger : '#<portlet:namespace/>toEffect',
		popover : {
		zIndex : 1
	},
	 mask: '%d/%m/%Y'
	});
	
	var fromExpire =new A.DatePicker({
		trigger : '#<portlet:namespace/>fromExpire',
		popover : {
		zIndex : 1
	},
	 mask: '%d/%m/%Y'
	});
	
	var toExpire =new A.DatePicker({
		trigger : '#<portlet:namespace/>toExpire',
		popover : {
		zIndex : 1
	},
	 mask: '%d/%m/%Y'
	});
});	
</aui:script>