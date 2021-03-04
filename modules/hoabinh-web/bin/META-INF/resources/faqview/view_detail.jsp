<%@page import="vn.gov.hoabinh.service.FAQCategoryLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.FAQCategory"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.service.FAQAnswerLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.FAQQuestionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.FAQQuestion"%>
<%@page import="vn.gov.hoabinh.model.FAQAnswer"%>
<%@ include file="/faqview/init.jsp" %>
<% 
	FAQQuestion question = FAQQuestionLocalServiceUtil.getFAQQuestion(Long.parseLong(questionId));
	List<FAQAnswer> listAnswer = FAQAnswerLocalServiceUtil.getByQ_A(Long.parseLong(questionId), true);
	FAQAnswer answer = null;
	FAQCategory category = null;
	boolean hasAttachment = false;
	long categoryId = 0;
	if (Validator.isNotNull(listAnswer) && listAnswer.size()>0) {
		answer = (FAQAnswer)listAnswer.get(0);
		hasAttachment = Validator.isNotNull(answer.getAttachName())?true:false;
		categoryId = question.getCategoryId();
		if (categoryId>0) {
			category = FAQCategoryLocalServiceUtil.getCategory(categoryId);
		}
	}
	List<FAQQuestion> listOtherQuestion = FAQQuestionLocalServiceUtil.getQuestionByG_L_C_A_Q(groupId, PortalConstant.DEFAULT_LANGUAGE, question.getCategoryId(), Long.parseLong(questionId), 10);
%>

<div class="box_border">
	<div class="table-responsive">
		<table class="table table-bordered table-hover">
		<tr>
			<td width="30%">
				<liferay-ui:icon
				    iconCssClass="icon-folder-open"
				    label="<%= true %>"
				    message="portlet.faq.category"
				/>
			</td>
			<td width="70%"><%=Validator.isNotNull(category)? category.getName():"" %></td>
		</tr>
		<tr>
			<td width="30%">
				<liferay-ui:icon
				    iconCssClass="icon-question-sign"
				    label="<%= true %>"
				    message="portlet.faq.question.title"
				/>
			</td>
			<td width="70%"><%=question.getTitle() %></td>
		</tr>
		<tr>
			<td width="30%">
				<liferay-ui:icon
				    iconCssClass="icon-user"
				    label="<%= true %>"
				    message="portlet.faq.question.sender"
				/>
			</td>
			<td width="70%"><%=question.getSentByUser() %></td>
		</tr>
		<tr>
			<td width="30%">
				<liferay-ui:icon
				    iconCssClass="icon-envelope"
				    label="<%= true %>"
				    message="portlet.faq.question.email"
				/></td>
			<td width="70%"><%=question.getSenderEmail() %></td>
		</tr>
		<tr>
			<td width="30%">
				<liferay-ui:icon
				    iconCssClass=" icon-calendar"
				    label="<%= true %>"
				    message="portlet.faq.question.sentdate"
				/>
			</td>
			<td width="70%"><%=FormatData.parseDateToTringType3(question.getSentDate()) %></td>
		</tr>
		<tr>
			<td width="30%">
				<liferay-ui:icon
				    iconCssClass=" icon-comment"
				    label="<%= true %>"
				    message="portlet.faq.question.content"
				/></td>
			<td width="70%"><%=HtmlUtil.extractText(question.getContent())%></td>
		</tr>
		<% if(Validator.isNotNull(answer)){ %>
		<tr>
			<td width="30%">
				<liferay-ui:icon
				    iconCssClass="icon-ok-sign"
				    label="<%= true %>"
				    message="portlet.faq.answer.content"
				/></td>
			<td width="70%"><%=HtmlUtil.extractText(answer.getContent())%></td>
		</tr>
		<tr>
			<td width="30%">
				<liferay-ui:icon
				    iconCssClass="icon-group"
				    label="<%= true %>"
				    message="portlet.faq.answer.answered-by"
				/></td>
			<td width="70%"><%=answer.getAnsweredByUser() %></td>
		</tr>
		<tr>
			<td width="30%">
				<liferay-ui:icon
				    iconCssClass="icon-calendar"
				    label="<%= true %>"
				    message="portlet.faq.answer.answered-date"
				/></td>
			<td width="70%"><%=FormatData.parseDateToTringType3(answer.getAnsweredDate()) %></td>
		</tr>
		
		<% if(hasAttachment) { %>
		<tr>
			<td width="30%">
				<liferay-ui:icon
				    iconCssClass="icon-file"
				    label="<%= true %>"
				    message="portlet.common.attachment"
				/></td>
			<td width="70%">
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
						</li>
					<% } %>
				</ul>
			</td>
		</tr>
		<% } %>
		
		<% } %>
		</table>
	</div>
	
	<%-- <% if(hasAttachment) { %>
		<div>
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
		</div>
	<% } %> --%>
		
	<div class="text-center">
		<a href="#" onclick="window.history.go(-1); return false;"><liferay-ui:icon image="back" message="back"/></a>
         <a href="#" onclick="window.print();"><liferay-ui:icon image="print" message="print"/></a>
	</div>	
		
	<div id="footerOfNewDetail">
		<div class="clear"></div>
		<div class="clear"></div>
		<% if (Validator.isNotNull(listOtherQuestion) && listOtherQuestion.size()>0){ %>
		<div class="list_detail">
			<span class="title"><liferay-ui:message key="portlet.faq.question.other"/></span>
			<ul class="ul_list_detail">
				<% for(FAQQuestion questionOther: listOtherQuestion) {
				%>
				<portlet:renderURL var="viewQuestion" > 
					 <portlet:param name="questionId" value="<%=String.valueOf(questionOther.getId()) %>" /> 
					 <portlet:param name="mvcRenderCommandName" value="view_detail"/>
				 </portlet:renderURL>
				<li><a href="<%=viewQuestion%>"><%=questionOther.getTitle() %>
				<span class="time">(<%=FormatData.parseDateToTringType3(questionOther.getSentDate()) %>) </span></a></li>
				<% } %>
			</ul>
		</div>
		<%} %>
	</div>
</div>