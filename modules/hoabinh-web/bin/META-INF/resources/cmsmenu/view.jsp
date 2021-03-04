<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VcmsPortionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VcmsCategory"%>
<%@page import="vn.gov.hoabinh.model.VcmsPortion"%>
<%@ include file="/cmsmenu/init.jsp" %>
<% 
	String[] arrCategory = null;
	List<VcmsCategory> categories = null;
	VcmsPortion portion = null;
	VcmsCategory category = null;
	String parentId = "0";
	if (!"".equals(categorySelected)) {
		arrCategory = StringUtil.split(categorySelected);
		if (Validator.isNotNull(arrCategory)) {
			categories = VcmsCategoryLocalServiceUtil.getCategoryMenu(arrCategory);			
		}
	}
%>

<% if ("0".equals(styleSel)) { %>
<div>
	<div class="menu-cms">
		<% if (Validator.isNotNull(categories) && categories.size()>0) { %>
		<ul>
			<% for(VcmsCategory cat:categories) {
				categoryURL.setParameter("categoryId", cat.getCategoryId());%>
			<li><a href="<%=cat.getAnchored()?cat.getHref():categoryURL.toString()%>"><%=cat.getName() %></a></li>
			<% } %> 
		</ul>
		<%} %>	
	</div>
</div>
<%	} else if ("1".equals(styleSel)){ %>
<div>
	<% if (Validator.isNotNull(categories) && categories.size()>0) { 
			category = (VcmsCategory)categories.get(0);
			portionId = category.getPortionId();
			parentId = category.getParentId();
			if (!"0".equals(parentId)) {
				category = VcmsCategoryLocalServiceUtil.getCategory(parentId);
			} else {
				portion = VcmsPortionLocalServiceUtil.getPortion(portionId);	
			}
			
	%>	
	<div class="header-legal"><%=!"0".equals(parentId)?category.getName():portion.getName() %></div>	
	<div class="menu-legal">
	<% if (Validator.isNotNull(categories) && categories.size()>0) { %>
	<ul>
		<% for(VcmsCategory cat:categories) {
			categoryURL.setParameter("categoryId", cat.getCategoryId());%>
		<li><a href="<%=cat.getAnchored()?cat.getHref():categoryURL.toString()%>"><%=cat.getName() %></a></li>
		<% } %> 
	</ul>	
	</div>
	<%}} %>
</div>
<% } else if ("2".equals(styleSel)) { %>
<div>
	<h3 class="title-list-news"><span class="title-t1"><a href="#"><liferay-ui:message key="portlet.common.category" /></a></span></h3>
	<div class="home">
		<% if (Validator.isNotNull(categories) && categories.size()>0) { %>
		<ul class="list_video" style="list-style: none;">
			<% for(VcmsCategory cat:categories) {
				categoryURL.setParameter("categoryId", cat.getCategoryId());
				if(cat.getHasImage()) {
			%>
			<li style="width:140px;border-bottom: none;">
				<a href="<%=cat.getAnchored()?cat.getHref():categoryURL.toString()%>">
					<img class="img-responsive" style="width:120px; height:80px;" alt="<%=cat.getName()%>" src="<%=cat.getImage()%>" />
				</a>
			</li>
			<% }} %>
		</ul>
		<%} %>
	</div>	
</div>	
<% } else { %>
<div class="box_menu">
	<% if (Validator.isNotNull(categories) && categories.size()>0) { 
			category = (VcmsCategory)categories.get(0);
			portionId = category.getPortionId();
			parentId = category.getParentId();
			if (!"0".equals(parentId)) {
				category = VcmsCategoryLocalServiceUtil.getCategory(parentId);
			} else {
				portion = VcmsPortionLocalServiceUtil.getPortion(portionId);	
			}
			
	%>	
	<div class="header-legal"><%=!"0".equals(parentId)?category.getName():portion.getName() %></div>	
	<div class="menu-sub">
	<% if (Validator.isNotNull(categories) && categories.size()>0) { %>
	<ul>
		<%  int inc = 0;
			for(VcmsCategory cat:categories) {
				categoryURL.setParameter("categoryId", cat.getCategoryId());
				inc++;
		%>
		<li><a href="<%=cat.getAnchored()?cat.getHref():categoryURL.toString()%>"><%=cat.getName() %></a></li>
		<% } %> 
	</ul>	
	</div>
	<%}} %>
</div>
<% } %>
