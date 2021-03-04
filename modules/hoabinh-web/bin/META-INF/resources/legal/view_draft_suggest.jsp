<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalSuggestDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	int approved = ParamUtil.getInteger(request, "status", -1);
	String draftId = ParamUtil.getString(request, "draftId", "0");
	String keyword = ParamUtil.getString(request, "keyword", StringPool.BLANK);
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1", "portlet.legal.draft");
	renderURL.setParameter("tabs2", "portlet.legal.draft.suggest");
	
	int start = delta * (cur-1);
	int end  = delta * cur;
	int totalSugguest = 0;
	List<VLegalSuggestDocument> listSugguest = new ArrayList<VLegalSuggestDocument>();

	totalSugguest = VLegalSuggestDocumentLocalServiceUtil.countSugguest(groupId, PortalConstant.DEFAULT_LANGUAGE, keyword, null, null, approved);
	if (totalSugguest>0) {
		listSugguest = VLegalSuggestDocumentLocalServiceUtil.searchSugguest(groupId, PortalConstant.DEFAULT_LANGUAGE, keyword, null, null, approved, start, end);
	}
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/legal/edit_suggest.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<portlet:actionURL var="searchSugguestURL" name="searchSugguest"/>

<aui:form action="<%=searchSugguestURL.toString()%>" method="post" name="fm" id="fm"> 
<aui:input name="hasSearch" type="hidden" value="search" />
<aui:input name="tabs1" type="hidden" value="portlet.legal.draft" />
<aui:input name="tabs2" type="hidden" value="portlet.legal.draft.suggest" />

<div>
	<aui:row>
		<aui:col width="60">
			<aui:input name="keyword" label="portlet.common.keyword" value="<%=keyword %>"/>
		</aui:col>
		<aui:col width="40">
			<aui:select name="status" label="portlet.legal.suggest.status" >
				<aui:option value="-1"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<aui:option value="0"><liferay-ui:message key="portlet.legal.suggest.approve-pendding"/></aui:option>
				<aui:option value="1"><liferay-ui:message key="portlet.legal.suggest.approved"/></aui:option>
			</aui:select>
		</aui:col>
	</aui:row>
</div>

<aui:button-row>
	<aui:button type="submit" icon="icon-search" value="search"/>
	<aui:button type="button" icon="icon-plus" href="<%=addURL %>" value="add-draft-suggest"/>
</aui:button-row>

<liferay-ui:search-container total="<%=totalSugguest %>" 
	var="searchContainer" delta="<%=delta %>"
	iteratorURL="<%=renderURL %>"
	deltaConfigurable="true" 
  	emptyResultsMessage="<%=msgEmpty %>">
  
 <liferay-ui:search-container-results 
 		results="<%=listSugguest%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.VLegalSuggestDocument" modelVar="suggest" keyProperty="sugid" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++)%>"/>
   	<liferay-ui:search-container-column-text name="title" property="title"/>
   	<%
   		String titleStatus = "Chờ duyệt";
  		if (suggest.getApproved()) {
  			titleStatus = "Đã duyệt";
  		}
  	%>
   	<liferay-ui:search-container-column-text name="status" value="<%=titleStatus %>"/>
   	<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(suggest.getCreatedDate()) %>"/>
   	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/legal/action_suggest.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>
</aui:form>