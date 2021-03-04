<%@ include file="/contact/init.jsp"%>
<%@page import="vn.gov.hoabinh.model.VContact"%>
<%@page import="vn.gov.hoabinh.model.VcmsArticle"%>
<%@page import="vn.gov.hoabinh.model.Attachment"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry" %>
<%@page import="com.liferay.document.library.kernel.util.DLUtil" %>

<%@page import="vn.gov.hoabinh.service.AttachmentLocalServiceUtil" %>
<%
	String tabs1 = ParamUtil.getString(request, "tabs1","0");
	String id = ParamUtil.getString(request, "Id");
	VContact vContact = null;
	int status = 0;
	if (!"0".equals(id)) {
		vContact = VContactLocalServiceUtil.getContact(Long.parseLong(id));
		status = vContact.getStatus();
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/contact/view.jsp"/>
	<portlet:param name="tabs1" value="<%=tabs1 %>" />
</portlet:renderURL>

<portlet:actionURL var="saveItemURL" name="addOrUpdateContact"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(id)) ? "add" : "update"  %>' />

<aui:form action="<%= saveItemURL %>" method="post" name="fm">
<aui:input name="itemId" type="hidden" value='<%= id %>' />
<aui:row>
	<aui:col width="50">
		<aui:input  name="name" label="portlet.contact.guestname" value="<%=!"0".equals(id)?vContact.getGuestName():"" %>">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="description" label="portlet.contact.email" value="<%=!"0".equals(id)?vContact.getEmail():"" %>">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="url" label="portlet.contact.title" value="<%=!"0".equals(id)?vContact.getTitle():"" %>">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="url" label="portlet.contact.address" value="<%=!"0".equals(id)?vContact.getAddress():"" %>">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="url" label="portlet.contact.phone" value="<%=!"0".equals(id)?vContact.getPhone():"" %>">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="url" label="portlet.contact.fax" value="<%=!"0".equals(id)?vContact.getFax():"" %>">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<%-- <aui:row>
	<aui:col width="50">
		<aui:input type="textarea" id="textarea-id" rows="4" cols="50" name="content" value="<%=!"0".equals(id)?vContact.getContent():"" %>" label="content" />
	</aui:col>
</aui:row> --%>

<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="portlet.faq.question.content" >
			<liferay-ui:input-editor name="content" initMethod="initEditor" toolbarSet="email" width="100" height="600" resizable="true" >
			</liferay-ui:input-editor>
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<%
List<Attachment> listAttachment = AttachmentLocalServiceUtil.getAttachmentByE_E_I(vContact.getId(), VContact.class, 0);
if (Validator.isNotNull(listAttachment) && listAttachment.size()>0){
%>
<aui:row>
	<aui:col width="50">
	<ul>
		<%
			for(Attachment attachment:listAttachment) {
				long fileEntryId = attachment.getFileEntryId();
				FileEntry fileEntry = DLAppServiceUtil.getFileEntry(fileEntryId);
				String url = DLUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, "");
		%>
		<li>
			<img alt="<%=attachment.getFileName() %>" src="<%=PortalConstant.SRC_IMAGE+"/file_system/small/"+attachment.getExtension()+".png"%>" />
			<a href="<%=url%>"><%=attachment.getFileName() %></a>
		</li>
		<% } %>
	</ul>
	</aui:col>
</aui:row>
<% } %>

<aui:row>
	<aui:col width="50">
		<aui:select name="typeId" label="portlet.contact.status" >
			<aui:option value="0" selected="<%=(0==vContact.getStatus())%>"><liferay-ui:message key="common.status.un-approve"/></aui:option>
		    <aui:option value="1>" selected="<%=(1==vContact.getStatus())%>"><liferay-ui:message key="common.status.approved" /></aui:option>
		    <aui:option value="2>" selected="<%=(2==vContact.getStatus())%>"><liferay-ui:message key="common.status.reject" /></aui:option>
		</aui:select>
	</aui:col>
</aui:row>

<aui:button-row >
	<aui:button name="save" type="submit"value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>" />
</aui:button-row>
</aui:form>

<aui:script>
	function <portlet:namespace/>initEditor() {
		var contentValue = "<%=(!"0".equals(id)?UnicodeFormatter.toString(vContact.getContent()):"")%>";
		return contentValue;
	}
</aui:script>