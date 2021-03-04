<%@page import="vn.gov.hoabinh.service.VLegalDraftDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalDraftDocument"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/legalsend/init.jsp"%>
<%@ page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%
	String draftId = ParamUtil.getString(request, "draftId", "0");
	VLegalDraftDocument draft = null;
	if (Validator.isNotNull(draftId) && !"0".equals(draftId)){
		draft = VLegalDraftDocumentLocalServiceUtil.getDraft(draftId);
	}
%>
<liferay-portlet:actionURL name="add_sugguest" var="addSuggest">
    <portlet:param name="mvcActionCommand" value="add_sugguest" /> 
</liferay-portlet:actionURL>

<portlet:resourceURL var="captchaURL"/>
<portlet:actionURL  var="validateURL" name="validateCaptcha"/>

<liferay-ui:error key="portlet.common.captcha.invalid" />

<div class="box_border">
<aui:form action="<%= addSuggest %>" cssClass="container-fluid-1280" enctype="multipart/form-data" method="post" name="fm">
<aui:input name="draftId" type="hidden" value='<%= draftId %>' />

<% if(!"0".equals(draftId)){ %>
<aui:row>
	<div class="alert alert-success">
	    <strong class="lead"><liferay-ui:message key="portlet.legal.draft" /></strong>
	    <%=draft.getTitle() %>
	</div>
</aui:row>
<% } %>

<aui:row>
	<aui:col width="50">
		<aui:input  name="title" label="portlet.legal.draft.suggest.title" value="" placeholder="portlet.legal.draft.input.title">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="visitorName" label="portlet.legal.draft.suggest.sender" value="" placeholder="portlet.legal.draft.input.sender">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="visitorEmail" label="portlet.legal.draft.suggest.email" value="" placeholder="portlet.legal.draft.input.email">
			  <aui:validator name="required"/>
			 <aui:validator name="email"/>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="visitorTel" label="portlet.legal.draft.suggest.phone" value="" placeholder="portlet.legal.draft.input.phone">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="visitorAddress" label="portlet.legal.draft.suggest.address" value="" placeholder="portlet.legal.draft.input.address">
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<liferay-ui:input-editor name="content" initMethod="initEditor" width="100" height="400" resizable="true" toolbarSet="email">
		</liferay-ui:input-editor>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="attachment-file" name="attachment" type="file" >
			<!-- <aui:validator name="acceptFiles">'xls,xlsx,doc,docx,pdf'</aui:validator> -->
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
			<liferay-ui:captcha url="<%=captchaURL%>" />
	</aui:col>
</aui:row>

<aui:button-row>
	<aui:button type="submit" icon="icon-envelope" value="send-sugguest" />
	<aui:button type="reset" icon="icon-remove" value="cancel" />
	<aui:button type="button" onclick="window.history.go(-1); return false;" icon="icon-undo" value="back" />	
</aui:button-row> 
</aui:form>
</div>

<aui:script>
	function <portlet:namespace/>initEditorContent() {
		var returnVal = "";
		return returnVal;
	}
</aui:script>