<%@ include file="/clipview/init.jsp" %>
<div class="box_border">
	<% if ("1".equals(styleSel)) { 	%>
		<jsp:include page="/clipview/view_home.jsp" />
	<% } else if ("2".equals(styleSel)) { %>
		<jsp:include page="/clipview/view_page.jsp" />
	<% } else {%>
		<jsp:include page="/clipview/youtube.jsp" />
	<% } %>
</div>