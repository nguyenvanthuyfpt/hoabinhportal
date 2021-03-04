<%@page import="vn.gov.hoabinh.service.VcmsPortionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VcmsPortion"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/cms/init.jsp" %>

<%
	portionId = ParamUtil.getString(request, "portionId", "0");
	VcmsPortion portion = null;
	boolean categoziable = false;
	if (!"0".equals(portionId)) {
		portion = VcmsPortionLocalServiceUtil.getPortion(portionId);
		categoziable = portion.getCategorizable();
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/cms/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.cms.general-manage" />
	<portlet:param name="tabs2" value="portlet.cms.portion" />
</portlet:renderURL>

<portlet:actionURL var="savePortion" name="crud_portion"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(portionId)) ? "add" : "update"  %>' />
	
	
<aui:form action="<%= savePortion %>" method="post" name="fm">
<aui:input name="cmd" type="hidden" value='<%= "0".equals(portionId)?"add":"update" %>' />
<aui:input name="portionId" type="hidden" value='<%= portionId %>' />

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.cms.portion.code" name="code" value="<%=!"0".equals(portionId)?portion.getCode():""%>">
			<aui:validator name="required"/>
		 	<aui:validator name="maxLength">200</aui:validator>
		</aui:input>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.cms.portion.name" name="name" value="<%=!"0".equals(portionId)?portion.getName():""%>">
			<aui:validator name="required"/>
		 	<aui:validator name="maxLength">200</aui:validator>
		</aui:input>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input label="portlet.cms.portion.description" name="description" value="<%=!"0".equals(portionId)?portion.getDescription():""%>"/>	
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input name="categoziable" label="portlet.cms.portion.categoziable" type="checkbox" checked="<%= categoziable%>"/>	
	</aui:col>
</aui:row>


<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>
