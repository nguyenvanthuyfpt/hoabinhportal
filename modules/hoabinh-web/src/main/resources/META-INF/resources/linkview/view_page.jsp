<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ include file="/linkview/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.model.Links" %>
<%@page import="vn.gov.hoabinh.model.LinkGroup" %>
<%@page import="vn.gov.hoabinh.service.LinkGroupLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.LinksLocalServiceUtil"%>

<%
	LinkGroup linkGroup = null;
	String[] linkGroupIds = null;
	if (Validator.isNotNull(linkGroupSel) && !"-1".equals(linkGroupSel)) {
		linkGroupIds = StringUtil.split(linkGroupSel, ",");
	}
%>
<div class="box_border">
	<%-- <table cellspacing="5" cellpadding="5" border="0" width="100%">
	<tr>
	<%	
				
		if (Validator.isNotNull(linkGroupIds) && linkGroupIds.length>0){
		for(int i=0;i<linkGroupIds.length;i++){
			linkGroup = LinkGroupLocalServiceUtil.getLinkGroup(Long.parseLong(linkGroupIds[i]));
	%>
		<td class="textlink_02 weblink" valign="top">
			<div style="background: rgb(255, 244, 225) none repeat scroll 0% 0%; -moz-background-clip: -moz-initial; -moz-background-origin: -moz-initial; -moz-background-inline-policy: -moz-initial;">
				<b><font style="color: rgb(193, 93, 12);"><%=linkGroup.getName()%></font></b></div>
			
			<%	int count = 0;
				List<Links> listLinks = LinksLocalServiceUtil.getByLinkG_GL(groupId, linkGroup.getLinkgroupId());
				for(int j=0;j<listLinks.size();j++){
					count = count+1;
					Links link = (Links)listLinks.get(j);
			%>
				<div <%=count%2==0?"style='background: rgb(255, 244, 225) none repeat scroll 0% 0%; -moz-background-clip: -moz-initial; -moz-background-origin: -moz-initial; -moz-background-inline-policy: -moz-initial;'":""%> >
					<a href="<%=link.getUrl()%>" target="_blank"><%=link.getName()%></a></div>	
			<%}%>
																		
		</td>														
	<%	}} %>	
	</tr>
	</table> --%>
	
	<div>
		<% if (Validator.isNotNull(linkGroupIds) && linkGroupIds.length>0){
			int inc = 0;
			
					
		%>
			  <ul class="nav nav-tabs">
			  <%
				  for(int i=0;i<linkGroupIds.length;i++){
						linkGroup = LinkGroupLocalServiceUtil.getLinkGroup(Long.parseLong(linkGroupIds[i]));
			  %>
				<% 	String classTab = (inc==0)?"class='active'":""; %>
				<li <%=classTab%>>			    
					<a data-toggle="tab" href="#<%=linkGroup.getLinkgroupId()%>"><%=linkGroup.getName() %></a>
				</li>
				<%inc++; %>
				<% } %>
			  </ul>
			  
			  <div class="tab-content">
		  		<%	 
		  			inc = 0;
					  for(int i=0;i<linkGroupIds.length;i++){
							linkGroup = LinkGroupLocalServiceUtil.getLinkGroup(Long.parseLong(linkGroupIds[i]));
				  %>
				  <% 	String active = (inc==0)?"class='active'":""; %>
			    <div id="<%=linkGroup.getLinkgroupId() %>" class="tab-pane fade in <%=active%>">
			      	<%	int count = 0;
						List<Links> listLinks = LinksLocalServiceUtil.getByLinkG_GL(groupId, linkGroup.getLinkgroupId());
						for(int j=0;j<listLinks.size();j++){
							count++;
							Links link = (Links)listLinks.get(j);
					%>
						<div <%=count%2==0?"style='background: rgb(255, 244, 225) none repeat scroll 0% 0%; -moz-background-clip: -moz-initial; -moz-background-origin: -moz-initial; -moz-background-inline-policy: -moz-initial;'":""%> >
							<a href="<%=link.getUrl()%>" target="_blank"><%=link.getName()%></a></div>	
					<%}%>
			    </div>
			    <% inc++; %>
			    <% } %>
			  </div>
		<% } %>
	  </div>
</div>