<%@page import="vn.gov.hoabinh.service.ClipTypeLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.gov.hoabinh.model.FAQCategory"%>
<%@page import="vn.gov.hoabinh.service.FAQCategoryLocalServiceUtil"%>
<%@ include file="/clipmenu/init.jsp" %>

<% 
	String[] arrCategory = null;
	List<ClipType> categories = null;
	if (!"0".equals(categorySel)) {
		arrCategory = StringUtil.split(categorySel);
		if (Validator.isNotNull(arrCategory)) {
			categories = ClipTypeLocalServiceUtil.getCategoryMenu(arrCategory);			
		}
	} else {
		categories = ClipTypeLocalServiceUtil.getClipTypeByG_L_A(groupId, "vi_VN", true);
	}
%>
<div class="menu-cms">
<% if (Validator.isNotNull(categories) && categories.size()>0) { %>
<ul>
		<% for(ClipType clipType:categories) {
			String strCat = clipType.getId();
			categoryURL.setParameter("search", "true");
			categoryURL.setParameter("clipTypeId", strCat);
		%>
		<li><a href="<%=categoryURL.toString()%>"><%=clipType.getName() %></a></li>
		<% } %> 
</ul>
<%} %>
</div>