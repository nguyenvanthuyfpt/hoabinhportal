<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/legalview/init.jsp" %>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="vn.gov.hoabinh.model.*"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.VLegalDocumentLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VLegalField"%>
<%@page import="vn.gov.hoabinh.service.VLegalOrgLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VLegalFieldLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortletKeys" %>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>

<% 
	int index = 1;
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = Integer.parseInt(numSel);
	String msgEmpty = "abc";
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("hasSearch", "search");
	
	SearchContainer<VLegalDocument> searchContainer = new SearchContainer<VLegalDocument>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, renderURL, null, msgEmpty);
	List<VLegalDocument> documents = new ArrayList<VLegalDocument>();
	
	int total =  VLegalDocumentLocalServiceUtil.countByStatus(groupId, PortalConstant.DEFAULT_LANGUAGE, 2);
	if (total>0) {
		documents = VLegalDocumentLocalServiceUtil.getDocumentByP_L_S(groupId, PortalConstant.DEFAULT_LANGUAGE, 2, 0, delta);
	}
%>

<div class="box_bg">
	<h3 class="title-list-news">
		<span class="title-t1">
			<a href="<%=documentURL%>">
				<liferay-ui:message key="portlet.common.document" />
			</a>
		</span>
	</h3>
	<div class="clear"></div>
	
	<div class="table-responsive">
		<table class="table table-bordered table-hover">
		<tr>
			<th width="20%"><liferay-ui:message key="portlet.legal.symbol-num"/></th>
			<th width="55%"><liferay-ui:message key="portlet.legal.summary"/></th>
			<th width="25%"><liferay-ui:message key="portlet.legal.date-promul"/></th>
		</tr>
		<%  int i=1;
			for (VLegalDocument doc : documents) {
				documentURL.setParameter("documentId", String.valueOf(doc.getDocId()));
			 %>
		<tr>
			<td><%=doc.getSymbol()+"/"+doc.getNum() %></td>
			<td><a href="<%=documentURL%>"><%=doc.getSummary() %></a></td>
			<td><%=FormatData.parseDateToTringDDMMYYY(doc.getPromulDate()) %></td>
		</tr>
		<% 	
			}
		%>
		</table>		
	</div>
</div>
