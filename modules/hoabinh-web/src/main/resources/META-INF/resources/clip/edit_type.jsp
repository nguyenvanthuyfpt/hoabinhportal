<%@page import="vn.gov.hoabinh.model.ClipType"%>
<%@page import="vn.gov.hoabinh.service.ClipTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.AdvType"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/adv/init.jsp" %>

<%
	String clipTypeId = ParamUtil.getString(request, "clipTypeId", "0");
	ClipType type = null;
	if (!"0".equals(clipTypeId)) {
		type = ClipTypeLocalServiceUtil.getClipType(clipTypeId);
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/clip/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.clip.type" />
</portlet:renderURL>

<portlet:actionURL var="saveTypeURL" name="addOrUpdateClipType"/>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>"
	title='<%= ("0".equals(clipTypeId)) ? "add" : "update"  %>' />
	
	
<aui:form action="<%= saveTypeURL %>" method="post" name="fm">
<aui:input name="clipTypeId" type="hidden" value='<%= clipTypeId %>' />

<aui:row>
	<aui:col width="50">
		<aui:input  name="name" label="portlet.clip.type.name" value="<%=!"0".equals(clipTypeId)?type.getName():"" %>">
			 <aui:validator name="required"/>
			 <aui:validator name="maxLength">75</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input  name="description" label="portlet.clip.type.description" value="<%=!"0".equals(clipTypeId)?type.getDescription():"" %>">
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
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>

