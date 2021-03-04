<%@page import="vn.gov.hoabinh.service.FAQCategoryLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.FAQCategory"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="vn.gov.hoabinh.util.DateUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/faq/init.jsp"%>

<%
	String categoryId = ParamUtil.getString(request, "categoryId", "0");
	FAQCategory category = null;
	if (!"0".equals(categoryId)) {
		category = FAQCategoryLocalServiceUtil.getCategory(Long.parseLong(categoryId));
	} 
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/faq/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.faq.category" />
</portlet:renderURL>

<portlet:actionURL var="saveItemURL" name="addOrUpdateCategory"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(categoryId)) ? "add" : "update"  %>' />

<aui:form action="<%= saveItemURL %>" method="post" name="fm">
<aui:input name="categoryId" type="hidden" value='<%= categoryId %>' />
<aui:row>
	<aui:col width="50">
		<aui:input  name="name" label="portlet.faq.category.name" value="<%=!"0".equals(categoryId)?category.getName():"" %>">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="description" label="portlet.faq.category.description" value="<%=!"0".equals(categoryId)?category.getDescription():"" %>">
		</aui:input>
	</aui:col>
</aui:row>

<aui:button-row >
	<aui:button name="save" type="submit" cssClass="btn-lg" value="save" />
	<aui:button type="cancel" cssClass="btn-lg" value="cancel" href="<%=viewURL %>" />
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