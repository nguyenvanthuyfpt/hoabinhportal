<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.gov.hoabinh.model.FAQCategory"%>
<%@page import="vn.gov.hoabinh.service.FAQCategoryLocalServiceUtil"%>
<%@ include file="/faqmenu/init.jsp" %>

<% 
	String[] arrCategory = null;
	List<FAQCategory> categories = null;
	if (!"0".equals(categorySel)) {
		arrCategory = StringUtil.split(categorySel);
		if (Validator.isNotNull(arrCategory)) {
			categories = FAQCategoryLocalServiceUtil.getCategoryMenu(arrCategory);			
		}
	} else {
		categories = FAQCategoryLocalServiceUtil.getByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
	}
%>
<div class="menu-cms">
<% if (Validator.isNotNull(categories) && categories.size()>0) { %>
<ul>
		<% for(FAQCategory cat:categories) {
			String strCat = String.valueOf(cat.getId());
			categoryURL.setParameter("search", "true");
			categoryURL.setParameter("categoryId", strCat);
		%>
		<li><a href="<%=categoryURL.toString()%>"><%=cat.getName() %></a></li>
		<% } %> 
</ul>
<%} %>
</div>