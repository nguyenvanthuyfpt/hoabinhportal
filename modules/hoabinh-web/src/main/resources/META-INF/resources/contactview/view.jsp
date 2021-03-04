<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ include file="/contactview/init.jsp" %>

<liferay-portlet:actionURL name="add_contact" var="addContact">
    <portlet:param name="mvcActionCommand" value="add_contact" /> 
</liferay-portlet:actionURL>

<portlet:resourceURL var="captchaURL"/>
<portlet:actionURL  var="validateURL" name="validateCaptcha"/>

<!-- <liferay-ui:success key="portlet.common.action.successfully" message="Yêu cầu của bạn đã được xử lý thành công!"/> -->
<liferay-ui:error key="portlet.common.captcha.invalid" message="Vui lòng nhập chính xác mã captcha."/>

<div class="box_border">
<aui:form action="<%= addContact %>" cssClass="container-fluid-1280" enctype="multipart/form-data" method="post" name="fm">

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.contactview.guest-name" name="guestName" placeholder="portlet.contactview.input.guest-name" >
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.contactview.title" name="title" placeholder="portlet.contactview.input.title" >
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.contactview.email" name="email" placeholder="portlet.contactview.input.email" >
			 <aui:validator name="required"/>
			 <aui:validator name="email"/>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.contactview.address" name="address" placeholder="portlet.contactview.input.address" >
			<aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.contactview.phone" name="phone" placeholder="portlet.contactview.input.phone" >
			<aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.contactview.fax" name="fax" placeholder="portlet.contactview.input.fax" >
			<aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<!-- <aui:input type="textarea" rows="5" cols="50" name="content" label="content" /> -->
		<aui:field-wrapper label="portlet.contactview.content" >
			<liferay-ui:input-editor name="content" initMethod="initEditorContent" toolbarSet="email" 
				width="100" height="300" resizable="true" >
			</liferay-ui:input-editor>
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="attachment-file" name="attachment" type="file" >
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<liferay-ui:captcha url="<%=captchaURL%>" />
	</aui:col>
</aui:row>

<aui:button-row>
	<aui:button type="submit" icon="icon-envelope" value="send-contact" />
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
