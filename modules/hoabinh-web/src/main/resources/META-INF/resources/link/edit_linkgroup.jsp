<%@page import="vn.gov.hoabinh.service.LinkGroupLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.LinkGroup"%>
<%@page import="vn.gov.hoabinh.service.AdvTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.AdvType"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/link/init.jsp" %>

<%
	String linkgroupId = ParamUtil.getString(request, "linkgroupId", "0");
	LinkGroup linkGroup = null;
	if (!"0".equals(linkgroupId)) {
		linkGroup = LinkGroupLocalServiceUtil.getLinkGroup(Long.parseLong(linkgroupId));
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/link/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.link.group" />
</portlet:renderURL>

<portlet:actionURL var="saveLinkGroupURL" name="addOrUpdateLinkGroup"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>" title='<%= ("0".equals(linkgroupId)) ? "add" : "update"  %>' />
	
<aui:form action="<%= saveLinkGroupURL %>" method="post" name="fm">
<aui:input name="linkgroupId" type="hidden" value='<%= linkgroupId %>' />

<aui:row>
	<aui:col width="50">
		<aui:input  name="name" label="name" value="<%=!"0".equals(linkgroupId)?linkGroup.getName():"" %>">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="description" label="description" value="<%=!"0".equals(linkgroupId)?linkGroup.getDescription():"" %>">
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

