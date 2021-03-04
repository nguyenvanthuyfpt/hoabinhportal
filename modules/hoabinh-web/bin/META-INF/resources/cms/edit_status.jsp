<%@page import="vn.gov.hoabinh.service.VcmsStatusLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VcmsStatus"%>
<%@page import="vn.gov.hoabinh.service.VcmsPortionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VcmsPortion"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/cms/init.jsp" %>

<%
	String statusId = ParamUtil.getString(request, "statusId", "0");
	VcmsStatus vcmsStatus = null;
	boolean isPrimary = false;
	boolean active = false;
	int position = 0;
	if (!"0".equals(statusId)) {
		vcmsStatus = VcmsStatusLocalServiceUtil.getVcmsStatus(Long.parseLong(statusId));
		isPrimary = vcmsStatus.getIsPrimary();
		active = vcmsStatus.getActive();
		position = vcmsStatus.getPosition();
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/cms/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.cms.general-manage" />
	<portlet:param name="tabs2" value="portlet.cms.article.status" />
</portlet:renderURL>

<portlet:actionURL var="saveStatus" name="crud_status"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(statusId)) ? "add" : "update"  %>' />
	
	
<aui:form action="<%= saveStatus %>" method="post" name="fm">
<aui:input name="cmd" type="hidden" value='<%= "0".equals(statusId)?"add":"update" %>' />
<aui:input name="statusId" type="hidden" value='<%= statusId %>' />


<aui:row>
	<aui:col width="50">
		<aui:input label="name" name="name" value="<%=!"0".equals(statusId)?vcmsStatus.getName():""%>">
			<aui:validator name="required"/>
		 	<aui:validator name="maxLength">200</aui:validator>
		</aui:input>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="description" name="description" value="<%=!"0".equals(statusId)?vcmsStatus.getDescription():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.cms.status.isprimary" name="isprimary"  type="checkbox" checked="<%= isPrimary%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.cms.status.active" name="active"  type="checkbox" checked="<%= active%>"/>	
	</aui:col>
</aui:row>

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>
