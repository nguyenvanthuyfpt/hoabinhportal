<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="vn.gov.hoabinh.util.DateUtil"%>
<%@page import="vn.gov.hoabinh.service.AdvItemLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.AdvItem"%>
<%@page import="vn.gov.hoabinh.model.AdvType"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.AdvTypeLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/adv/init.jsp"%>

<%
	String itemId = ParamUtil.getString(request, "itemId", "0");
	List<AdvType> listType = AdvTypeLocalServiceUtil.getTypeByG(groupId);
	List<Attachment> listAttachment = null;
	AdvItem item = null;
	long typeId = 0;
	boolean isTargetBlank = false;
	boolean status = false;
	String expriedDate = "";
	String name = "";
	if (!"0".equals(itemId)) {
		item = AdvItemLocalServiceUtil.getItem(Long.parseLong(itemId));
		typeId = item.getTypeId();
		name = item.getName();
		isTargetBlank = item.getIsTargetBlank();
		status = item.getStatus();
		expriedDate = item.getExpriedDate() != null ? DateUtil.convertDateToString(item.getExpriedDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;
		listAttachment = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(itemId), AdvItem.class);
	}  else {
		expriedDate = DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y);
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/adv/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.adv.item" />
</portlet:renderURL>

<portlet:actionURL var="saveItemURL" name="addOrUpdateAdvItem"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(itemId)) ? "add" : "update"  %>' />

<aui:form action="<%= saveItemURL %>" method="post" name="fm">
<aui:input name="itemId" type="hidden" value='<%= itemId %>' />
<aui:input name="nameImage" type="hidden" value='<%=name %>' />

<aui:row>
	<aui:col width="50">
		<aui:select name="typeId" label="portlet.adv.item.typeid" >
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(AdvType type:listType){ %>
		    <aui:option value="<%=type.getTypeId() %>" selected="<%=(typeId==type.getTypeId())%>"><%=type.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="50">
		<aui:input  name="name" label="portlet.adv.item.name" value="<%=!"0".equals(itemId)?item.getName():"" %>" disabled="true">
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="description" label="portlet.adv.item.description" value="<%=!"0".equals(itemId)?item.getDescription():"" %>">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">500</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="url" label="portlet.adv.item.url" value="<%=!"0".equals(itemId)?item.getUrl():"" %>">
			 <aui:validator name="maxLength">1000</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input name="isTargetBlank" label="portlet.adv.item.istargetblank" type="checkbox" checked="<%= isTargetBlank %>"/>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="txtMouseOver" label="portlet.adv.item.txtmouseover" value="<%=!"0".equals(itemId)?item.getTxtMouseOver():"" %>">
			<aui:validator name="maxLength">1000</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input name="status" label="portlet.adv.item.status" type="checkbox" checked="<%= status %>"/>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		 <aui:input label="portlet.adv.item.exprieddate" name="expriedDate" type="text" value="<%=expriedDate %>"/>
	</aui:col>
</aui:row>

<portlet:actionURL var="deleteImageURL" name="deleteImage">
	<portlet:param name="jspPage" value="/adv/edit_item.jsp" />
	<portlet:param name="itemId" value="<%=itemId%>" />
</portlet:actionURL>

<% if ("".equals(name) || Validator.isNull(name)) { %>
<aui:row>
	<aui:col width="50">
		<aui:input label="file" name="attachment" type="file" >
			<aui:validator name="acceptFiles">'bmp,gif,jpg,png,swf'</aui:validator>			
		</aui:input>
	</aui:col>
</aui:row>
<% } else { %>
<aui:row>
	<aui:col width="40">
		<div>
			<img src="<%=name+"&imageThumbnail=1"%>" />
			<liferay-ui:icon image="delete" url="<%=deleteImageURL%>" />
		</div>
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