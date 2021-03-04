<%@ include file="/cmsview/init.jsp" %>
<% 
if (!"02".equals(styleSel) && "0".equals(articleId) && !"0".equals(categoryId) && !"06".equals(styleSel)){
%>
	<jsp:include page="/cmsview/article_by_category.jsp" />
<% 
} else if ("02".equals(styleSel)) { 
%>
	<jsp:include page="/cmsview/article_by_sticky.jsp" />
<% 
} else if ("06".equals(styleSel)) { 
%>
	<jsp:include page="/cmsview/article_detail_first.jsp" />
<%
} else { 
%>
	<jsp:include page="/cmsview/article_detail.jsp" />
<% } %>