<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/faqview/init.jsp" %>

<%@page import="java.util.*"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="vn.gov.hoabinh.model.FAQQuestion"%>
<%@page import="vn.gov.hoabinh.model.FAQCategory"%>
<%@page import="vn.gov.hoabinh.service.FAQQuestionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.FAQCategoryLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortletKeys" %>

<%
if ("1".equals(styleSel) && "0".equals(questionId)) { 
%>
<jsp:include page="/faqview/view_home.jsp" />
<% 
} else if ("2".equals(styleSel) && "0".equals(questionId)){ 
%>
<jsp:include page="/faqview/view_search.jsp" />
<% 
} else {
%>
<jsp:include page="/faqview/view_detail.jsp" />
<% } %>