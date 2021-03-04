<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/advview/init.jsp" %>
<%
	String w = !"".equals(width) ? "width:"+width+"px" : "";
	String h = !"".equals(height) ? "height:"+height+"px" : "";
%>
<div>
	<% if ("1".equals(styleSel)) { 	%>
		<a href="<%=Validator.isNotNull(link)?link:'#'%>">
		<img class="img-responsive" alt="<%=textMouse %>" src="<%=documentUrl%>" style="<%=w%> <%=h%>" />
	</a>
	<% } else if ("2".equals(styleSel)) { %>
		<iframe id="ivbdt" scrolling="no" src="<%=documentUrl %>" style="width:100%;<%=h %>;border:0"></iframe>
	<% } %>
</div>

	