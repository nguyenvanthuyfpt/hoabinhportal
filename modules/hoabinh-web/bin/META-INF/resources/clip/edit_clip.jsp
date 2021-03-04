<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.model.ClipType"%>
<%@page import="vn.gov.hoabinh.service.ClipTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.ClipLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.Clip"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="vn.gov.hoabinh.util.DateUtil"%>
<%@page import="vn.gov.hoabinh.service.AdvItemLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.AdvItem"%>
<%@page import="vn.gov.hoabinh.model.AdvType"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.AdvTypeLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/clip/init.jsp"%>

<%
	String clipId = ParamUtil.getString(request, "clipId", "0");
	List<ClipType> listType = ClipTypeLocalServiceUtil.getClipTypeByG_L_A(groupId, PortalConstant.DEFAULT_LANGUAGE, true);
	Clip clip = null;
	String typeId = "0";
	boolean isTargetBlank = false;
	boolean status = false;
	boolean hasVideo = false;
	boolean hasImage = false;
	if (!"0".equals(clipId)) {
		clip = ClipLocalServiceUtil.getClip(clipId);
		typeId = clip.getClipTypeId();
		hasVideo = Validator.isNotNull(clip.getUrl());
		hasImage = Validator.isNotNull(clip.getImage());
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/clip/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.clip.item" />
</portlet:renderURL>

<portlet:actionURL var="saveClipURL" name="addOrUpdateClip"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>" title='<%= ("0".equals(clipId)) ? "add" : "update"  %>' />

<aui:form action="<%= saveClipURL %>" method="post" name="fm">
<aui:input name="clipId" type="hidden" value='<%= clipId %>' />
<aui:row>
	<aui:col width="50">
		<aui:select name="typeId" label="portlet.clip.typeid" >
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(ClipType type:listType){ %>
		    <aui:option value="<%=type.getId() %>" selected="<%=(typeId.equals(type.getId()))%>"><%=type.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="name" label="portlet.clip.name" value="<%=!"0".equals(clipId)?clip.getName():"" %>">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="title" label="portlet.clip.title" value="<%=!"0".equals(clipId)?clip.getTitle():"" %>">
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>


<aui:row>
	<aui:col width="50">
		<aui:input  name="description" label="portlet.clip.description" type="textarea" row="3" value="<%=!"0".equals(clipId)?clip.getDescription():"" %>">
			 <aui:validator name="maxLength">200</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<portlet:actionURL var="deleteFileURL" name="deleteAttachment">
	<portlet:param name="jspPage" value="/clip/edit_clip.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_DELETE_FILE%>" />
	<portlet:param name="clipId" value="<%=clipId%>" />
</portlet:actionURL>

<% if (hasVideo) { %>
<aui:row>
	<aui:col width="50">
		<aui:input  name="url" label="portlet.clip.url" value="<%=!"0".equals(clipId)?clip.getUrl():"" %>" disabled="true">
			 <aui:validator name="required"/>
		</aui:input>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="50">
		<ul>
			<% List<Attachment> listAttachment = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(clipId), Clip.class, 0);
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
		<aui:input label="portlet.clip.url" type="file" name="clip" >
			<aui:validator name="required"/>
			<aui:validator name="acceptFiles">'mp4'</aui:validator>			
		</aui:input>
		<aui:input name="clipName" type="hidden" value="" />
	</aui:col>
</aui:row>
<% } %>

<portlet:actionURL var="deleteImageURL" name="deleteAttachment">
	<portlet:param name="jspPage" value="/clip/edit_clip.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_DELETE_IMAGE%>" />
	<portlet:param name="clipId" value="<%=clipId%>" />
</portlet:actionURL>

<% if (hasImage) { %>
<aui:row>
	<aui:col width="50">
		<div>
			<img src="<%=clip.getImage()+"&imageThumbnail=1"%>" />
			<liferay-ui:icon image="delete" url="<%=deleteImageURL%>" />
		</div>
	</aui:col>
</aui:row>
<% } else { %>
<aui:row>
	<aui:col width="50">
		<aui:input label="image" type="file" name="image" id="image" onChange="showImageName()" >
			<aui:validator name="required"/>
			<aui:validator name="acceptFiles">'jpg,png,tif,gif'</aui:validator>
		</aui:input>
		<ul id="imageNameUL"></ul>
	</aui:col>
</aui:row>
<% } %>


<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>" />
</aui:button-row>
</aui:form>

<aui:script>
		
AUI().use('aui-datepicker', function(A) {
	new A.DatePicker({
		trigger : '#<portlet:namespace/>expriedDate',
		popover : {
		zIndex : 1
	},
	 mask: '%d/%m/%Y'
	});
});	

</aui:script>