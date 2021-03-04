<%@page import="vn.gov.hoabinh.service.AdvTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.AdvType"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/adv/init.jsp" %>

<%
	String typeId = ParamUtil.getString(request, "typeId", "0");
	AdvType type = null;
	if (!"0".equals(typeId)) {
		type = AdvTypeLocalServiceUtil.getAdvType(Long.parseLong(typeId));
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/adv/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.adv.type" />
</portlet:renderURL>

<portlet:actionURL var="saveTypeURL" name="addOrUpdateAdvType"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>" title='<%= ("0".equals(typeId)) ? "add" : "update"  %>' />
	
<aui:form action="<%= saveTypeURL %>" method="post" name="fm">
<aui:input name="typeId" type="hidden" value='<%= typeId %>' />

<aui:row>
	<aui:col width="50">
		<aui:input  name="name" label="portlet.adv.type.name" value="<%=!"0".equals(typeId)?type.getName():"" %>">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="description" label="portlet.adv.type.description" value="<%=!"0".equals(typeId)?type.getDescription():"" %>">
		</aui:input>
	</aui:col>
</aui:row>

<%-- 
<liferay-ui:input-editor name="content" initMethod="initEditor" width="100" height="400" 
  resizable="true" ></liferay-ui:input-editor>

<aui:fieldset>
    <label class="control-label" for="<portlet:namespace />startDate">
        Start date
    </label>
    <input name="<portlet:namespace />startDate" 
        id="<portlet:namespace />startDate" 
        class="form-control date" 
        type="text" placeholder="dd-mm-yyyy" 
        value="<%=formatter.format(startDate)%>">

    <span id="endDateShown">
        <label class="control-label" for="<portlet:namespace />endDate">
            End date
        </label>
        <input name="<portlet:namespace />endDate" 
            id="<portlet:namespace />endDate" 
            class="form-control date" 
            type="text" 
            placeholder="dd-mm-yyyy" 
            value="<%=formatter.format(endDate)%>">
    </span>
    <label class="control-label" for="<portlet:namespace/>toggleEndDate">
        <input type="checkbox" id="endDateToggle" onclick="toggleEndDate()"/>
        Single day event
    </label>
</aui:fieldset>
 --%>
 
<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>" />
</aui:button-row>
</aui:form>

