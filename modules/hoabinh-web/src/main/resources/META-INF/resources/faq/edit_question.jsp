<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry" %>
<%@page import="com.liferay.document.library.kernel.util.DLUtil" %>

<%@page import="vn.gov.hoabinh.service.FAQQuestionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.FAQCategoryLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="vn.gov.hoabinh.util.DateUtil"%>
<%@page import="vn.gov.hoabinh.service.AdvItemLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.FAQQuestion"%>
<%@page import="vn.gov.hoabinh.model.FAQCategory"%>
<%@page import="vn.gov.hoabinh.model.Attachment"%>
<%@page import="vn.gov.hoabinh.service.AttachmentLocalServiceUtil" %>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.AdvTypeLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/faq/init.jsp"%>

<%
	String questionId = ParamUtil.getString(request, "questionId", "0");
	List<FAQCategory> listCategory = FAQCategoryLocalServiceUtil.getByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
	FAQQuestion question = null;
	long categoryId = 0;
	boolean isTargetBlank = false;
	boolean status = false;
	String expriedDate = "";
	if (!"0".equals(questionId)) {
		question = FAQQuestionLocalServiceUtil.getQuestion(Long.parseLong(questionId));
		categoryId = question.getCategoryId();
	}  
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/faq/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.faq.question" />
</portlet:renderURL>

<portlet:actionURL var="saveItemURL" name="addOrUpdateQuestion"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(questionId)) ? "add" : "update"  %>' />

<aui:form action="<%= saveItemURL %>" method="post" name="fm">
<aui:input name="questionId" type="hidden" value='<%= questionId %>' />
<aui:row>
	<aui:col width="50">
		<aui:select name="categoryId" label="portlet.question.category" >
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(FAQCategory category:listCategory){ %>
		    <aui:option value="<%=category.getId() %>" selected="<%=(categoryId==category.getId())%>"><%=category.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input name="title" label="portlet.faq.question.title" value="<%=!"0".equals(questionId)?question.getTitle():"" %>">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:field-wrapper label="portlet.faq.question.content" >
			<liferay-ui:input-editor name="content" initMethod="initEditor" toolbarSet="liferay-article" width="100" height="600" resizable="true" >
			</liferay-ui:input-editor>
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input name="sentByUser" label="portlet.faq.question.sender" value="<%=!"0".equals(questionId)?question.getSentByUser():"" %>" disabled="true" />
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input name="senderEmail" label="portlet.faq.question.email" value="<%=!"0".equals(questionId)?question.getSenderEmail():"" %>" disabled="true" />
	</aui:col>
</aui:row>

<% List<Attachment> listAttachment = AttachmentLocalServiceUtil.getAttachmentByE_E_I(Long.parseLong(questionId), FAQQuestion.class, 0);	
	if (Validator.isNotNull(listAttachment) && listAttachment.size()>0){
	for(Attachment attachment:listAttachment) {
		long fileEntryId = attachment.getFileEntryId();
		FileEntry fileEntry = DLAppServiceUtil.getFileEntry(fileEntryId);
		String url = DLUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, "");
%>
<aui:row>
	<aui:col width="50">
	<%-- <portlet:actionURL var="deleteFileURL" name="crud_article">
		<portlet:param name="jspPage" value="/cms/edit_article.jsp" />
		<portlet:param name="cmd" value="<%=PortalConstant.ACTION_DELETE_FILE %>" />
		<portlet:param name="articleId" value="<%=articleId%>" />
		<portlet:param name="fileEntryId" value="<%=String.valueOf(attachment.getFileEntryId())%>" />
	</portlet:actionURL> --%>
	<li>
		<img alt="<%=attachment.getFileName() %>" src="<%=PortalConstant.SRC_IMAGE+"/file_system/small/"+attachment.getExtension()+".png"%>" />
		<a href="<%=url%>"><%=attachment.getFileName() %></a>
		<%-- <liferay-ui:icon image="delete" url="<%=deleteFileURL%>" /> --%>
	</li>
	</aui:col>
</aui:row>
<% }} %>

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>" />
</aui:button-row>
</aui:form>

<aui:script>
	function <portlet:namespace/>initEditor() {
		var contentValue = "<%=(!"0".equals(questionId)?UnicodeFormatter.toString(question.getContent()):"")%>";
		return contentValue;
	}
</aui:script>