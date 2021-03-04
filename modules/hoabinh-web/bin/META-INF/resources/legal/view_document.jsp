<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.lang.reflect.Array"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.gov.hoabinh.model.*"%>
<%@page import="vn.gov.hoabinh.service.VLegalDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalOrgLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalSignerLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	String keyword = ParamUtil.getString(request, "keyword", StringPool.BLANK);
	String orgId = ParamUtil.getString(request, "orgId", "0");
	String fieldId = ParamUtil.getString(request, "fieldId", "0");
	String typeId = ParamUtil.getString(request, "typeId", "0");
	String signerId = ParamUtil.getString(request, "signerId", "0");
	String hasSearch = ParamUtil.getString(request, "search", StringPool.BLANK);
	
	boolean isNumber = ParamUtil.getBoolean(request, "isNumber", false);
	boolean isSymbol = ParamUtil.getBoolean(request, "isSymbol", false); 
	boolean isSummary = ParamUtil.getBoolean(request, "isSummary", true); 
	boolean isContent = ParamUtil.getBoolean(request, "isNumber", false);
	boolean isDatePromul = ParamUtil.getBoolean(request, "isDatePromul", false);
	boolean isDateEffective = ParamUtil.getBoolean(request, "isDateEffective", false);
	boolean isDateExpire = ParamUtil.getBoolean(request, "isDateExpire", false);
	
	String fromDate = DateUtil.convertDateToString(DateUtil.getBeginOfMonth(new Date()), DateUtil.DATE_FORMAT_D_M_Y);
	String toDate = DateUtil.convertDateToString(DateUtil.getEndOfMonth(new Date()), DateUtil.DATE_FORMAT_D_M_Y);
	
	Date promulDateFrom = new Date();
	Date promulDateTo = new Date();
	Date effectivedDateFrom = new Date();
	Date effectivedDateTo = new Date();
	
	List<VLegalField> fields = VLegalFieldLocalServiceUtil.getFieldByGroupId(groupId);
	List<VLegalType> types = VLegalTypeLocalServiceUtil.getTypeByGroupId(groupId);
	List<VLegalOrg> orgs = VLegalOrgLocalServiceUtil.getOrgByGroupId(groupId);
	List<VLegalSigner> signers = VLegalSignerLocalServiceUtil.getSignerByGroupId(groupId);
	
	int docStatus = 0;
	if ("portlet.legal.document.publish-pending".equals(tabs2)) {
		docStatus = 1;
	} else if ("portlet.legal.document.published".equals(tabs2)) {
		docStatus = 2;
	}
	
	String tabsName2 = "";
	tabsName2 += "portlet.legal.document.approval-pending,portlet.legal.document.publish-pending,portlet.legal.document.published";
		
	int start = delta * (cur-1);
	int end  = delta * cur;
	int totalDoc = 0;
	List<VLegalDocument> listDoc = new ArrayList<VLegalDocument>();
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1","portlet.legal.document");
	renderURL.setParameter("tabs2",tabs2);
	
	if (Validator.isNotNull(hasSearch)) {
		totalDoc = VLegalDocumentLocalServiceUtil.countDocument(groupId, PortalConstant.DEFAULT_LANGUAGE, "", "", fieldId, orgId, typeId, 
				promulDateFrom, promulDateTo, effectivedDateFrom, effectivedDateTo, null, null, keyword, docStatus, true);
		listDoc = VLegalDocumentLocalServiceUtil.searchDocument(groupId, PortalConstant.DEFAULT_LANGUAGE, "", "", fieldId, orgId, typeId, 
				promulDateFrom, promulDateTo, effectivedDateFrom, effectivedDateTo, null, null, keyword, docStatus, true, start, end);
	} else {
		totalDoc = VLegalDocumentLocalServiceUtil.countDocumentByP_L_S(groupId, PortalConstant.DEFAULT_LANGUAGE, docStatus);
		listDoc = VLegalDocumentLocalServiceUtil.getDocumentByP_L_S(groupId, PortalConstant.DEFAULT_LANGUAGE, docStatus, start, end);
	}
		
%>
<portlet:renderURL var="tabURL" >
	<portlet:param name="tabs1" value="portlet.legal.document"/>
</portlet:renderURL>

<portlet:actionURL var="searchDocumentURL" name="crud_document"/>

<liferay-ui:tabs
    names='<%=tabsName2%>'
    param="tabs2"
    url="<%=tabURL.toString()%>"
>    
</liferay-ui:tabs>

<aui:form action="<%=searchDocumentURL.toString()%>" method="post" name="fmDoc" id="fmDoc">
<aui:input name="hasSearch" type="hidden" value="search" />
<aui:input name="docIds" type="hidden" value="" />
<aui:input name="cmd" type="hidden" value="" />
<aui:input name="tabs1" type="hidden" value="portlet.legal.document" />
<aui:input name="tabs2" type="hidden" value='<%= tabs2 %>' />

<div>
	<aui:row>
		<aui:col width="30">
			<aui:input name="keyword" label="portlet.common.keyword" placeholder="portlet.common.input.keyword"  value="<%=keyword %>"/>
		</aui:col>
		<aui:col width="20">
			<aui:select name="orgId" label="portlet.legal.org">
				<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<% for(VLegalOrg org:orgs){ %>
			    <aui:option value="<%=org.getOrgId() %>" selected="<%=orgId.equals(org.getOrgId()) %>"><%=org.getName() %></aui:option>
			    <%} %>
			</aui:select>
		</aui:col>
		<aui:col width="20">
			<aui:select name="typeId" label="portlet.legal.type">
				<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<% for(VLegalType type:types){ %>
			    <aui:option value="<%=type.getTypeId() %>" selected="<%= typeId.equals(type.getTypeId()) %>"><%=type.getName() %></aui:option>
			    <%} %>
			</aui:select>
		</aui:col>
		<aui:col width="20">
			<aui:select name="fieldId" label="portlet.legal.field" >
				<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<% for(VLegalField field:fields){ %>
			    <aui:option value="<%=field.getFieldId() %>" selected="<%= fieldId.equals(field.getFieldId()) %>"><%=field.getName() %></aui:option>
			    <%} %>
			</aui:select>
		</aui:col>
		<aui:col width="20">
			<aui:select name="signerId" label="portlet.legal.signer" >
				<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<% for(VLegalSigner signer:signers){ %>
			    <aui:option value="<%=signer.getSigId() %>" selected="<%= signerId.equals(signer.getSigId()) %>"><%=signer.getFirstName()+" "+ signer.getLastName() %></aui:option>
			    <%} %>
			</aui:select>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="20">
			<aui:input name="isNumber" label="portlet.legal.document.number" type="checkbox" checked="<%= isNumber %>"/>
		</aui:col>
		<aui:col width="20">
			<aui:input name="isSymbol" label="portlet.legal.document.symbol" type="checkbox" checked="<%= isSymbol %>"/>
		</aui:col>
		<aui:col width="20">
			<aui:input name="isSummary" label="portlet.legal.document.summary" type="checkbox" checked="<%= isSummary %>"/>
		</aui:col>
		<aui:col width="20">
			<aui:input name="isContent" label="portlet.legal.document.content" type="checkbox" checked="<%= isContent %>"/>
		</aui:col>
		<aui:col width="20">
			<aui:select name="searchBy" label="" >
				<aui:option value="0"><liferay-ui:message key="portlet.common.search.or"/></aui:option>
			    <aui:option value="1"><liferay-ui:message key="portlet.common.search.and"/></aui:option>
			</aui:select>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="20">
			<aui:input name="isDatePromul" label="portlet.legal.document.promul" type="checkbox" checked="<%= isDatePromul %>"/>
		</aui:col>
		<aui:col colspan="2" width="20">
			<aui:input name="fromDatePromul" label="portlet.common.search.from" value="<%=fromDate%>"/>
		</aui:col>
		<aui:col colspan="2" width="20">
			<aui:input name="toDatePromul" label="portlet.common.search.from" value="<%=toDate%>"/>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="20">
			<aui:input name="isDateEffective" label="portlet.legal.document.effectivedate" type="checkbox" checked="<%= isDateEffective %>"/>
		</aui:col>
		<aui:col colspan="2" width="20">
			<aui:input name="fromDateEffective" label="portlet.common.search.from" value="<%=fromDate%>"/>
		</aui:col>
		<aui:col colspan="2" width="20">
			<aui:input name="toDateEffective" label="portlet.common.search.from" value="<%=toDate%>"/>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="20">
			<aui:input name="isDateExpire" label="portlet.legal.document.expiredate" type="checkbox" checked="<%= isDateExpire %>"/>
		</aui:col>
		<aui:col colspan="2" width="20">
			<aui:input name="fromDateExpire" label="portlet.common.search.from" value="<%=fromDate%>"/>
		</aui:col>
		<aui:col colspan="2" width="20">
			<aui:input name="toDateExpire" label="portlet.common.search.from" value="<%=toDate%>"/>
		</aui:col>
	</aui:row>
	
	<aui:button-row>
		<c:if test="<%= (docStatus==0)%>">
			<portlet:renderURL var="addURL">
				<portlet:param name="jspPage" value="/legal/edit_document.jsp"/>
				<portlet:param name="redirect" value="<%=currentURL %>"/>
			</portlet:renderURL>
			<aui:button type="button" icon="icon-plus" href="<%=addURL %>" value="add-document"/>
		</c:if>
		<aui:button type="submit" icon="icon-search" value="search"/>
		
		<c:if test="<%= !tabs2.equals("portlet.legal.document.published") %>">
			<aui:button  type="button" icon="icon-envelope"  value="action.document.approve" onClick='<%= renderResponse.getNamespace() + "sendDocuments();" %>' />
		</c:if>
	</aui:button-row> 
</div>

<liferay-ui:search-container total="<%=totalDoc%>" 
	var="searchContainer" 
	delta="<%=delta %>" 
	deltaConfigurable="true" 
	rowChecker="<%=new RowChecker(renderResponse)%>"
	iteratorURL="<%=renderURL %>"
  	emptyResultsMessage="<%=msgEmpty %>">

<liferay-ui:search-container-results 
 		results="<%=listDoc%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.VLegalDocument" modelVar="document" keyProperty="docId" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() + stt++)%>"/>
   	<liferay-ui:search-container-column-text name="portlet.legal.document.number" property="num"/>
   	<liferay-ui:search-container-column-text name="portlet.legal.document.symbol" property="symbol"/>
   	<%
   		String img = PortalConstant.SRC_IMAGE+"/common/clip.png";
   		StringBuffer sb = new StringBuffer();
   		sb.append("<div>");
   		sb.append("<b>"+document.getSummary()+"</b>");
   		sb.append(document.getHasAttachment()?"<div><img src='"+img+"' /><div>":"&nbsp;");
   		sb.append("</div>");
   	%>
   	<liferay-ui:search-container-column-text name="portlet.legal.document.summary" value="<%=sb.toString() %>"/>
   	<c:if test="<%=docStatus==0 %>">
   		<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(document.getCreatedDate()) %>"/>
   	</c:if>
   	<c:if test="<%=docStatus==1 %>">
   		<liferay-ui:search-container-column-text name="portlet.legal.document.approvaldate" value="<%=sdf_dmy.format(document.getApprovedDate()) %>"/>
   	</c:if>
   	<c:if test="<%=docStatus==2 %>">
   		<liferay-ui:search-container-column-text name="portlet.legal.document.publisheddate" value="<%=sdf_dmy.format(document.getPublishedDate()) %>"/>   	
   	</c:if>
   	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/legal/action_document.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />

</liferay-ui:search-container>
</aui:form>

<aui:script>
AUI().use('aui-datepicker', function(A) {
	var fromDatePromul =new A.DatePicker({
		trigger : '#<portlet:namespace/>fromDatePromul',
		popover : {
		zIndex : 1
	},
	 mask: '%d/%m/%Y'
	});
	
	var toDatePromul =new A.DatePicker({
		trigger : '#<portlet:namespace/>toDatePromul',
		popover : {
		zIndex : 1
	},
	 mask: '%d/%m/%Y'
	});
	
	var fromDateEffective =new A.DatePicker({
		trigger : '#<portlet:namespace/>fromDateEffective',
		popover : {
		zIndex : 1
	},
	 mask: '%d/%m/%Y'
	});
	
	var toDateEffective =new A.DatePicker({
		trigger : '#<portlet:namespace/>toDateEffective',
		popover : {
		zIndex : 1
	},
	 mask: '%d/%m/%Y'
	});
	
	var fromDateExpire =new A.DatePicker({
		trigger : '#<portlet:namespace/>fromDateExpire',
		popover : {
		zIndex : 1
	},
	 mask: '%d/%m/%Y'
	});
	
	var toDateExpire =new A.DatePicker({
		trigger : '#<portlet:namespace/>toDateExpire',
		popover : {
		zIndex : 1
	},
	 mask: '%d/%m/%Y'
	});
});	
</aui:script>

<aui:script>
Liferay.provide(
        window,
        '<portlet:namespace />sendDocuments',
        function() {
                    var checkBoxValue = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fmDoc, "<portlet:namespace />allRowIds");
                    if(checkBoxValue==""||checkBoxValue==null||checkBoxValue=="on"){                               
                            alert("Bạn vui lòng chọn văn bản trước khi thực hiện thao tác!");
                            return false;
                    }
                    
                    if (confirm('Bạn thực sự muốn thực hiện hành động với những văn bản đã lựa chọn?')) {
                        $('#<portlet:namespace/>docIds').val(checkBoxValue);
                        $('#<portlet:namespace/>cmd').val("<%=PortalConstant.ACTION_APPROVES%>");
                        document.<portlet:namespace/>fmDoc.action = "<%=searchDocumentURL%>";
                		document.<portlet:namespace/>fmDoc.submit();
                    }
        },
        ['liferay-util-list-fields']
    );
</aui:script>