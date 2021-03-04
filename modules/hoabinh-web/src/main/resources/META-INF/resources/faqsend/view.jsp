<%@ include file="/faqsend/init.jsp" %>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%
	List<FAQCategory> categories = FAQCategoryLocalServiceUtil.getByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
%>
<liferay-portlet:actionURL name="add_question" var="addQuestion">
    <portlet:param name="mvcActionCommand" value="add_question" /> 
</liferay-portlet:actionURL>

<portlet:resourceURL var="captchaURL"/>
<portlet:actionURL  var="validateURL" name="validateCaptcha"/>

<liferay-ui:success key="portlet.common.action.successfully" />
<liferay-ui:error key="portlet.common.captcha.invalid" />


<div class="box_border">
<aui:form action="<%= addQuestion %>" cssClass="container-fluid-1280" enctype="multipart/form-data" method="post" name="fm">
<aui:row>
	<aui:col width="50">
		<aui:input  name="title" label="portlet.faq.question.title" placeholder="portlet.faq.input.title">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="sentByUser" label="portlet.faq.question.sender" placeholder="portlet.faq.input.sender">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="email" label="portlet.faq.question.email" placeholder="portlet.faq.input.email">
		 	<aui:validator name="required"/>
			<aui:validator name="email"/>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:select name="categoryId" label="portlet.faq.category" required="true">
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(FAQCategory cat:categories){ %>
		    <aui:option value="<%=cat.getId() %>"><%=cat.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<aui:field-wrapper label="portlet.faq.question.content" >
			<liferay-ui:input-editor name="content" initMethod="initEditorContent" toolbarSet="email" 
				width="100" height="300" resizable="true" >
			</liferay-ui:input-editor>
		</aui:field-wrapper>
		
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="attachment-file" name="attachment" type="file" >
			<aui:validator name="acceptFiles">'xls,xlsx,doc,docx,pdf'</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<liferay-ui:captcha url="<%=captchaURL%>"/>
	</aui:col>
</aui:row>

<aui:button-row>
	<aui:button type="submit" icon="icon-envelope" value="send-question" />
	<aui:button type="reset" icon="icon-remove" value="cancel" />
</aui:button-row>  
</aui:form>
</div>

<aui:script>
	function <portlet:namespace/>initEditorContent() {
		var returnVal = "";
		return returnVal;
	}
</aui:script>