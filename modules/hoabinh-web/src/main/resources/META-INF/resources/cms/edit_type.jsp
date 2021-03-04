<%@page import="vn.gov.hoabinh.service.VcmsTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VcmsType"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/cms/init.jsp" %>

<%
	String typeId = ParamUtil.getString(request, "typeId", "0");
	VcmsType vcmsType = null;
	int position = 0;
	if (!"0".equals(typeId)) {
		vcmsType = VcmsTypeLocalServiceUtil.getType(Long.parseLong(typeId));
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/cms/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.cms.general-manage" />
	<portlet:param name="tabs2" value="portlet.cms.article.type" />
</portlet:renderURL>

<portlet:actionURL var="saveType" name="crud_type"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(typeId)) ? "add" : "update"  %>' />
	
	
<aui:form action="<%= saveType %>" method="post" name="fm">
<aui:input name="cmd" type="hidden" value='<%= "0".equals(typeId)?"add":"update" %>' />
<aui:input name="typeId" type="hidden" value='<%= typeId %>' />

<aui:row>
	<aui:col width="50">
		<aui:input label="code" name="code" value="<%=!"0".equals(typeId)?vcmsType.getCode():""%>">
			<aui:validator name="required"/>
		 	<aui:validator name="maxLength">200</aui:validator>
		</aui:input>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="name" name="name" value="<%=!"0".equals(typeId)?vcmsType.getName():""%>">
			<aui:validator name="required"/>
		 	<aui:validator name="maxLength">200</aui:validator>
		</aui:input>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="description" name="description" value="<%=!"0".equals(typeId)?vcmsType.getDescription():""%>"/>	
	</aui:col>
</aui:row>

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>
