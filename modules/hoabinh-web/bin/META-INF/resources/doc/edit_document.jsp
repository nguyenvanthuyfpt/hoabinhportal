<%@page import="vn.gov.hoabinh.model.vdocLevel"%>
<%@page import="vn.gov.hoabinh.service.vdocLevelLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.vdocOrg"%>
<%@page import="vn.gov.hoabinh.service.vdocDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.vdocOrgLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.vdocFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="vn.gov.hoabinh.service.AttachmentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.Attachment"%>

<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.document.library.kernel.util.DLUtil" %>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry" %>
<%@ include file="/doc/init.jsp" %>

<%
	String docId = ParamUtil.getString(request, "docId", "0");
	List<vdocField> fields = vdocFieldLocalServiceUtil.getFieldByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
	List<vdocOrg> orgs = vdocOrgLocalServiceUtil.getOrgByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
	List<vdocLevel> levels = vdocLevelLocalServiceUtil.getLevelByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
	
	vdocDocument document = null;
	boolean statusField = false;
	boolean hasAttachment = false;
	String promulDate = "";
    String effectivedDate = "";
    String expiredDate = "";
    String fieldId = "0", orgId = "0", levelSelected = "";
	if (!"0".equals(docId)) {
		document = vdocDocumentLocalServiceUtil.getDocument(docId);
		fieldId = document.getFieldId();
		hasAttachment = document.getHasAttachment();
		levelSelected = document.getLevels();
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/doc/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.doc.document"/>
</portlet:renderURL>

<portlet:actionURL var="saveDocument" name="crud_document"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(docId)) ? "add" : "update"  %>' />
	
	
<aui:form action="<%= saveDocument %>" method="post" name="fm">
<aui:input name="cmd" type="hidden" value='<%= "0".equals(docId)?"add":"update" %>' />
<aui:input name="docId" type="hidden" value='<%= docId %>' />

<aui:row>
	<aui:col width="70">
		<aui:input label="portlet.doc.document.title" name="title" value="<%=!"0".equals(docId)?document.getTitle():""%>"/>		
	</aui:col>
	<aui:col width="30">
		<aui:select name="fieldId" label="portlet.legal.field" >
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(vdocField field:fields){ %>
		    <aui:option value="<%=field.getFieldId() %>" selected="<%= fieldId.equals(field.getFieldId()) %>"><%=field.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="70">
		<aui:field-wrapper label="portlet.doc.document.process" >
			<liferay-ui:input-editor name="process" initMethod="initEditorProcess" toolbarSet="liferay-article" width="100" height="300" resizable="true" >
			</liferay-ui:input-editor>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="30">
		<aui:select name="orgId" label="portlet.legal.org" multiple="true" height="300">
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(vdocOrg org:orgs){ %>
		    <aui:option value="<%=org.getOrgId() %>" selected="<%= orgId.equals(org.getOrgId()) %>"><%=org.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>		
</aui:row>

<aui:row>
	<aui:col width="70">
		<aui:field-wrapper label="portlet.doc.document.style" >
			<liferay-ui:input-editor name="style" initMethod="initEditorStyle" toolbarSet="liferay-article" width="100" height="300" resizable="true" >
			</liferay-ui:input-editor>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="30">
		<aui:select name="levels" label="portlet.doc.level"  multiple="true">
			<% for(vdocLevel level:levels){ %>
		    <aui:option value="<%=level.getLevelId() %>" selected="<%= levelSelected.indexOf(level.getLevelId())>-1 %>"><%=level.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="70">
		<aui:field-wrapper label="portlet.doc.document.content" >
			<liferay-ui:input-editor name="content" initMethod="initEditorContent" toolbarSet="liferay-article" width="100" height="300" resizable="true" >
			</liferay-ui:input-editor>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="30">&nbsp;</aui:col>
</aui:row>

<aui:row>
	<aui:col width="70">
		<aui:input label="portlet.doc.document.time" name="timeProcess" type="textarea" 
			value="<%=!"0".equals(docId)?document.getTimeProcess():""%>" rows="3"/>		
	</aui:col>
	<aui:col width="30">&nbsp;</aui:col>
</aui:row>

<aui:row>
	<aui:col width="70">
		<aui:input label="portlet.doc.document.org-execute" name="executeOrg" type="textarea" 
			value="<%=!"0".equals(docId)?document.getExecuteOrg():""%>" rows="3"/>		
	</aui:col>
	<aui:col width="30">&nbsp;</aui:col>
</aui:row>

<aui:row>
	<aui:col width="70">
		<aui:input label="portlet.doc.document.object" name="objects" type="textarea" 
			value="<%=!"0".equals(docId)?document.getObjects():""%>" rows="3"/>		
	</aui:col>
	<aui:col width="30">&nbsp;</aui:col>
</aui:row>

<aui:row>
	<aui:col width="70">
		<aui:field-wrapper label="portlet.doc.document.form-declaration" >
			<liferay-ui:input-editor name="note" initMethod="initEditorForm" toolbarSet="liferay-article" width="100" height="300" resizable="true" >
			</liferay-ui:input-editor>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="30">&nbsp;</aui:col>
</aui:row>
	
<aui:row>
	<aui:col width="70">
		<aui:input label="portlet.doc.document.cost" name="cost" type="textarea" 
			value="<%=!"0".equals(docId)?document.getCost():""%>" rows="3"/>		
	</aui:col>
	<aui:col width="30">&nbsp;</aui:col>
</aui:row>

<aui:row>
	<aui:col width="70">
		<aui:input label="portlet.doc.document.request-or-condition" name="objects" type="textarea" 
			value="<%=!"0".equals(docId)?document.getRequireDoc():""%>" rows="3"/>		
	</aui:col>
	<aui:col width="30">&nbsp;</aui:col>
</aui:row>

<aui:row>
	<aui:col width="70">
		<aui:field-wrapper label="portlet.doc.document.base" >
			<liferay-ui:input-editor name="base" initMethod="initEditorBase" toolbarSet="liferay-article" width="100" height="300" resizable="true" >
			</liferay-ui:input-editor>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="30">&nbsp;</aui:col>
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
<%=hasAttachment %>
<% if (hasAttachment) { %>
<aui:row>
	<aui:col colspan="2">
		<ul>
			<% List<Attachment> listAttachment = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(docId), vdocDocument.class);
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
 
<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>

<aui:script>
	function <portlet:namespace/>initEditorProcess() {
		var returnVal = "<%=(!"0".equals(docId)?UnicodeFormatter.toString(document.getProcess()):"")%>";
		return returnVal;
	}
	
	function <portlet:namespace/>initEditorStyle() {
		var returnVal = "<%=(!"0".equals(docId)?UnicodeFormatter.toString(document.getStyle()):"")%>";
		return returnVal;
	}
	
	function <portlet:namespace/>initEditorContent() {
		var returnVal = "<%=(!"0".equals(docId)?UnicodeFormatter.toString(document.getContent()):"")%>";
		return returnVal;
	}
	
	function <portlet:namespace/>initEditorForm() {
		var returnVal = "<%=(!"0".equals(docId)?UnicodeFormatter.toString(document.getNote()):"")%>";
		return returnVal;
	}
	
	function <portlet:namespace/>initEditorBase() {
		var returnVal = "<%=(!"0".equals(docId)?UnicodeFormatter.toString(document.getBase()):"")%>";
		return returnVal;
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
