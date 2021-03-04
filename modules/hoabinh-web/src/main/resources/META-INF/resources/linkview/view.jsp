<%@ include file="/linkview/init.jsp" %>
<% if ("01".equals(styleSel)){ %>
	<jsp:include page="/linkview/view_home.jsp" />
<% } else { %>
	<jsp:include page="/linkview/view_page.jsp" />
<% } %>