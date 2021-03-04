<%@ include file="/legalview/init.jsp" %>
<%@page import="vn.gov.hoabinh.service.vdocFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.vdocDocumentLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="vn.gov.hoabinh.model.*"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.util.PortletKeys" %>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>

<% 
	String fieldId = ParamUtil.getString(request, "fieldId", "0");
	String orgId = ParamUtil.getString(request, "orgId", "0");
	String typeId = ParamUtil.getString(request, "typeId", "0");
	String summary = ParamUtil.getString(request, "summary", "");
	// int statusDoc = ParamUtil.getInteger(request, "status", 0);
	int statusDoc = 0;
	String hasSearch = ParamUtil.getString(request, "search", StringPool.BLANK);
	
	String promulDateFrom = ParamUtil.getString(request, "promulDateFrom", StringPool.BLANK);
	String promulDateTo = ParamUtil.getString(request, "promulDateTo", StringPool.BLANK);
	String effectivedDateFrom = ParamUtil.getString(request, "effectivedDateFrom", StringPool.BLANK);
	String effectivedDateTo = ParamUtil.getString(request, "promulDateFrom", StringPool.BLANK);
	
	int index = 1;
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	String msgEmpty = "abc";
	
	List<vdocDocument> documents = new ArrayList<vdocDocument>();
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("hasSearch", "search");
	
	SearchContainer<vdocDocument> searchContainer = new SearchContainer<vdocDocument>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, renderURL, null, msgEmpty);

	List<vdocField> fields = vdocFieldLocalServiceUtil.getFieldByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
	List<vdocOrg> orgs = vdocOrgLocalServiceUtil.getOrgByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
	
	int total =  vdocDocumentLocalServiceUtil.countDocByG_L_S(groupId, PortalConstant.DEFAULT_LANGUAGE, 2);
	
	if (total>0) {
		searchContainer.setTotal(total);
		int start = searchContainer.getStart();
		int end = searchContainer.getEnd();
		documents = vdocDocumentLocalServiceUtil.getDocByG_L_S(groupId, PortalConstant.DEFAULT_LANGUAGE, 2, start, end);
	}
%>

<portlet:actionURL var="traCuuVanBan" name="searchDocument">
</portlet:actionURL>

<form action="<%=traCuuVanBan.toString()%>" method="post">
<div class="box_border">
	<aui:row>
		<aui:col width="50">
			<aui:select name="fieldId" label="portlet.legal.field" >
				<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<% for(vdocField field:fields){ %>
			    <aui:option value="<%=field.getFieldId() %>" selected="<%= fieldId.equals(field.getFieldId()) %>"><%=field.getName() %></aui:option>
			    <%} %>
			</aui:select>
		</aui:col>
		<aui:col width="50">
			<aui:select name="orgId" label="portlet.legal.org">
				<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<% for(vdocOrg org:orgs){ %>
			    <aui:option value="<%=org.getOrgId() %>" selected="<%=orgId.equals(org.getOrgId()) %>"><%=org.getName() %></aui:option>
			    <%} %>
			</aui:select>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col width="50">
			<aui:input  name="summary" label="portlet.legal.document.summary" value="<%=summary %>" />
		</aui:col>
		<aui:col width="50">
			&nbsp;
		</aui:col>
	</aui:row>

	<aui:button-row>
		<aui:button type="submit" icon="icon-search" value="search"/>
		<aui:button type="button" icon="icon-remove" value="cancel" />
	</aui:button-row> 
	
	<div class="table-responsive">
		<table class="table table-bordered table-hover">
		<tr>
			<th width="3%"><liferay-ui:message key="portlet.common.stt"/></th>			
			<th><liferay-ui:message key="portlet.doc.document.title"/></th>
		</tr>
		<%  int i=1;
			for (vdocDocument doc : documents) {
			 %>
		<portlet:renderURL var="viewDocument" > 
			 <portlet:param name="documentId" value="<%=doc.getDocId() %>" /> 
			 <portlet:param name="mvcRenderCommandName" value="view_detail"/>
		 </portlet:renderURL>
		<tr>
			<td><label class="oep-label"><%=searchContainer.getStart() + index++ %></label></td>
			<td><a href="<%=viewDocument%>"><%=doc.getTitle() %></a></td>
		</tr>
		<% 	
			}
		%>
		</table>		
	</div>
	
	<div id = "pagination">
		<liferay-ui:search-paginator  searchContainer="<%= searchContainer %>"  type="approximate"/>
	</div>
</div>
</form>