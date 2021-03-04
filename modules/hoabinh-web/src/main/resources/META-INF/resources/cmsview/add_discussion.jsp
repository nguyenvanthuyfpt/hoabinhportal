<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ include file="/cmsview/init.jsp" %>
<portlet:actionURL var="addComment" name="add_comment"/>

<!-- <portlet:resourceURL var="captchaURL"/>
<portlet:actionURL  var="validateURL" name="validateCaptcha"/> -->

<liferay-ui:success key="portlet.common.action.successfully" />
<liferay-ui:error key="portlet.common.captcha.invalid" />

<div class="box_border">
<aui:form action="<%= addComment %>" cssClass="container-fluid-1280" enctype="multipart/form-data" method="post" name="fm">
<aui:row>
	<aui:col width="50">
		<aui:input  name="title" label="portlet.cms.discussion.title" >
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="visitorName" label="portlet.cms.discussion.visitorname" >
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="visitorEmail" label="portlet.cms.discussion.visitoremail" >
		 	<aui:validator name="required"/>
			<aui:validator name="email"/>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="visitorPhone" label="portlet.cms.discussion.visitorphone" >
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input type="textarea" id="textarea-id" rows="4" cols="50" name="content" value="" label="content" />		
	</aui:col>
</aui:row>

<!-- <aui:row>
	<aui:col width="50">
		<aui:input label="attachment-file" name="attachment" type="file" >
			<aui:validator name="acceptFiles">'xls,xlsx,doc,docx,pdf'</aui:validator>
		</aui:input>
	</aui:col>
</aui:row> -->

<aui:row>
	<aui:col width="50">
		<liferay-ui:captcha url="<%=captchaURL%>" />
	</aui:col>
</aui:row>

<aui:button-row>
	<aui:button type="submit" icon="icon-envelope" value="send-question" />
	<aui:button type="reset" icon="icon-remove" value="cancel" />
</aui:button-row>  
</aui:form>
</div>