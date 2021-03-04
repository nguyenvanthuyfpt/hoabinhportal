<%@ include file="/legalview/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
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

<%  if ("1".equals(styleSel) && "0".equals(documentId)) {%>
<jsp:include page="/legalview/view_home.jsp" />
<% } else if ("2".equals(styleSel) && "0".equals(documentId)){ %>
<jsp:include page="/legalview/view_search.jsp" />
<% } else { %>
<jsp:include page="/legalview/view_detail.jsp" />
<% } %>