<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.model.VLegalDraftDocument"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalDraftDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	String keyword = ParamUtil.getString(request, "keyword", StringPool.BLANK);
	String orgId = ParamUtil.getString(request, "orgId", StringPool.BLANK);
	String fieldId = ParamUtil.getString(request, "fieldId", StringPool.BLANK);
	String typeId = ParamUtil.getString(request, "typeId", StringPool.BLANK);
	String signerId = ParamUtil.getString(request, "signerId", StringPool.BLANK);
	String hasSearch = ParamUtil.getString(request, "search", StringPool.BLANK);
	int statusDraft = ParamUtil.getInteger(request, "statusDraft", -1);
	
	//System.out.println("## fieldId ## "+fieldId);
	//System.out.println("## typeId ## "+typeId);
	
	Date dateFrom = new Date();
	Date dateTo = new Date();
	
	List<VLegalField> fields = VLegalFieldLocalServiceUtil.getFieldByGroupId(groupId);
	List<VLegalType> types = VLegalTypeLocalServiceUtil.getTypeByGroupId(groupId);
	int start = delta * (cur-1);
	int end  = delta * cur;
	int totalDraft = 0;
	List<VLegalDraftDocument> listDraft = new ArrayList<VLegalDraftDocument>();
	
	totalDraft = VLegalDraftDocumentLocalServiceUtil.countDraft(groupId, PortalConstant.DEFAULT_LANGUAGE, 
			keyword, fieldId, typeId, dateFrom, dateTo, statusDraft);
			
	listDraft = VLegalDraftDocumentLocalServiceUtil.searchDraft(groupId, PortalConstant.DEFAULT_LANGUAGE, 
			keyword, fieldId, typeId, dateFrom, dateTo, statusDraft, start, end);
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1", "portlet.legal.draft");
	renderURL.setParameter("tabs2", "portlet.legal.draft.document");
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/legal/edit_draft_document.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<portlet:actionURL var="searchDraftURL" name="searchDraft"/>

<aui:form action="<%=searchDraftURL.toString()%>" method="post" name="fm" id="fm"> 
<aui:input name="hasSearch" type="hidden" value="search" />
<aui:input name="tabs1" type="hidden" value="portlet.legal.draft" />
<aui:input name="tabs2" type="hidden" value="portlet.legal.draft.document" />

<div>
	<aui:row>
		<aui:col width="25">
			<aui:input name="keyword" label="portlet.common.keyword" value="<%=keyword %>"/>
		</aui:col>
		<aui:col width="25">
			<aui:select name="typeId" label="portlet.legal.type">
				<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<% for(VLegalType type:types){ %>
			    <aui:option value="<%=type.getTypeId() %>" selected="<%= typeId.equals(type.getTypeId()) %>"><%=type.getName() %></aui:option>
			    <%} %>
			</aui:select>
		</aui:col>
		<aui:col width="25">
			<aui:select name="fieldId" label="portlet.legal.field" >
				<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<% for(VLegalField field:fields){ %>
			    <aui:option value="<%=field.getFieldId() %>" selected="<%= fieldId.equals(field.getFieldId()) %>"><%=field.getName() %></aui:option>
			    <%} %>
			</aui:select>
		</aui:col>
		<aui:col width="25">
			<aui:select name="statusDraft" label="portlet.legal.draft.status" >
				<aui:option value="-1"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<aui:option value="0"><liferay-ui:message key="portlet.legal.draft.approve-pendding"/></aui:option>
				<aui:option value="1"><liferay-ui:message key="portlet.legal.draft.approved"/></aui:option>
				<aui:option value="2"><liferay-ui:message key="portlet.legal.draft.published"/></aui:option>
				<aui:option value="3"><liferay-ui:message key="portlet.legal.draft.expired"/></aui:option>
			</aui:select>
		</aui:col>
	</aui:row>
</div>

<aui:button-row>
	<aui:button type="submit" icon="icon-search" value="search"/>
	<aui:button type="button" icon="icon-plus" href="<%=addURL %>" value="add-legal-draft"/>
</aui:button-row>

<liferay-ui:search-container total="<%=totalDraft%>" 
	var="searchContainer" delta="<%=delta %>"
	iteratorURL="<%=renderURL %>"
	deltaConfigurable="true" 
  	emptyResultsMessage="<%=msgEmpty %>">
  
 <liferay-ui:search-container-results 
 		results="<%=listDraft%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.VLegalDraftDocument" modelVar="draft" keyProperty="draftid" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++)%>"/>
   	<liferay-ui:search-container-column-text name="title" property="title"/>
   	<%
   		String titleStatus = "Chờ duyệt";
   		String titleExpire = "";
  		if (draft.isExpired()) {
  			titleExpire = "Đã hết hạn";
  			VLegalDraftDocument legalDraft = VLegalDraftDocumentLocalServiceUtil.getDraft(draft.getDraftId());
  			legalDraft.setStatusDraft(3);
  			VLegalDraftDocumentLocalServiceUtil.updateDraft(legalDraft);
  		} else {
  			if (draft.getStatusDraft()==0) {
  	  		
  			} else if (draft.getStatusDraft()==1) {
  	  			titleStatus = "Chờ xuất bản";
  	  		} else if (draft.getStatusDraft()==2) {
  	  			titleStatus = "Đã xuất bản";
  	  		}
  		}
  	%>
   	<liferay-ui:search-container-column-text name="status" value="<%=titleStatus%>"/>
   	<liferay-ui:search-container-column-text name="portlet.legal.document.state" value="<%=titleExpire%>"/>
   	<%
  		String imgFile = PortalConstant.SRC_IMAGE+"/common/clip.png";
  		StringBuffer link = new StringBuffer();
  		link.append(draft.getHasAttachment()?"<div><img src='"+imgFile+"' /><div>":"&nbsp;");
  	%>
  	<liferay-ui:search-container-column-text name="attachment-file" value="<%=link.toString() %>" />
   	<liferay-ui:search-container-column-text name="portlet.legal.document.expiredate" value="<%=Validator.isNotNull(draft.getExpiredDate())?ddMMyyyy.format(draft.getExpiredDate()):""%>"/>
   	<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(draft.getCreatedDate()) %>"/>
   	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/legal/action_draft.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>

</aui:form>