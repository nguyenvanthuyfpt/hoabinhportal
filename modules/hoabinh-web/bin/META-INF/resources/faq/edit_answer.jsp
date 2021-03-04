<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.service.FAQQuestionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="vn.gov.hoabinh.service.FAQAnswerLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="vn.gov.hoabinh.util.DateUtil"%>
<%@page import="vn.gov.hoabinh.service.AdvItemLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.FAQAnswer"%>
<%@page import="vn.gov.hoabinh.model.FAQQuestion"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.AdvTypeLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/faq/init.jsp"%>

<%
	String answerId = ParamUtil.getString(request, "answerId", "0");
	String questionId = ParamUtil.getString(request, "questionId", "0");
	FAQAnswer answer = null;
	FAQQuestion question = null;
	boolean approved = false;
	boolean hasAttachment = false;
	String titleQuestion = "";
	
	if (!"0".equals(answerId)) {
		answer = FAQAnswerLocalServiceUtil.getAnswer(Long.parseLong(answerId));
		approved = answer.getApproved();
		questionId = String.valueOf(answer.getQuestionid());
		hasAttachment = Validator.isNotNull(answer.getAttachName())?true:false;;
	} 
	
	if (!"0".equals(questionId)) {
		try {
			question = FAQQuestionLocalServiceUtil.getFAQQuestion(Long.parseLong(questionId));
			titleQuestion = question.getTitle();
		} catch (Exception ex) {
			
		}
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/faq/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.faq.answer" />
</portlet:renderURL>

<portlet:actionURL var="saveAnswerURL" name="addOrUpdateAnswer"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>" title='<%= ("0".equals(answerId)) ? "add" : "update"  %>' />

<aui:form action="<%= saveAnswerURL %>" method="post" name="fm">
<aui:input name="answerId" type="hidden" value='<%= answerId %>' />
<aui:input name="questionId" type="hidden" value='<%= questionId %>' />
<aui:input name="tabs2" type="hidden" value="0" />

<aui:row>
	<aui:col width="100">
		<aui:input label="portlet.faq.question.title" name="questionTitle" type="textarea" value="<%=titleQuestion %>" rows="3" disabled="true">
			<aui:validator name="required"/>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<aui:input  name="answeredByUser" label="portlet.faq.answer.answered-by" 
			value="<%=!"0".equals(answerId)?answer.getAnsweredByUser():PortalUtil.getUserName(themeDisplay.getUserId(), PortalConstant.DEFAULT_USER) %>">
			<aui:validator name="required"/>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<aui:input  name="answeredDate" label="portlet.faq.answer.answered-date" disabled="true"
			value="<%=!"0".equals(answerId)?FormatData.parseDateToTringType3(answer.getAnsweredDate()):FormatData.parseDateToTringType3(new Date()) %>">
			 <aui:validator name="required"/>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="portlet.faq.answer.content" >
			<liferay-ui:input-editor name="content" initMethod="initEditor" width="100" height="500" resizable="true" >
			</liferay-ui:input-editor>
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<aui:input name="status" label="portlet.faq.approve.answer" type="checkbox" checked="<%= approved %>"/>
	</aui:col>
</aui:row>

<%-- <aui:row>
	<aui:col width="50">
		 <aui:input label="portlet.faq.answer.answered-date" required="true"  name="answeredDate" type="text" value="<%=answeredDate %>"/>
	</aui:col>
</aui:row> --%>

<portlet:actionURL var="deleteFileURL" name="deleteFile">
	<portlet:param name="jspPage" value="/faq/edit_answer.jsp" />
	<portlet:param name="answerId" value="<%=answerId%>" />
</portlet:actionURL>

<% if(hasAttachment) { %>
<aui:row>
	<aui:col colspan="2">
		<ul>
			<% List<Attachment> listAttachment = AttachmentLocalServiceUtil.getAttachments(answer.getId(), FAQAnswer.class);
				for(Attachment attachment:listAttachment) {
					long fileEntryId = attachment.getFileEntryId();
					FileEntry fileEntry = DLAppServiceUtil.getFileEntry(fileEntryId);
					String url = DLUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, "");
			%>
				<li><a href="<%=url%>">
					<img alt="<%=attachment.getFileName() %>" src="<%=PortalConstant.SRC_IMAGE+"/file_system/small/"+fileEntry.getExtension()+".png"%>" />
					<%=attachment.getFileName() %></a>
					<liferay-ui:icon image="delete" url="<%=deleteFileURL%>" />
				</li>
			<% } %>
		</ul>
	</aui:col>
</aui:row>
<% } else { %>
<aui:row>
	<aui:col width="50">
		<aui:input label="file" name="attachment" type="file" >
			<aui:validator name="acceptFiles">'doc,docx,xls,xlsx,pdf'</aui:validator>			
		</aui:input>
	</aui:col>
</aui:row>
<% } %>

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>" />
</aui:button-row>
</aui:form>

<aui:script>
	function <portlet:namespace/>initEditor() {
		var contentValue = "<%=(!"0".equals(answerId)?UnicodeFormatter.toString(answer.getContent()):"")%>";
		return contentValue;
	}
</aui:script>