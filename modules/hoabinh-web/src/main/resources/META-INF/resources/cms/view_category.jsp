<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.model.VcmsPortion"%>
<%@page import="vn.gov.hoabinh.model.VcmsCategory"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VcmsPortionLocalServiceUtil"%>
<%
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	String search = ParamUtil.getString(request, "search", "");
	String keyword = ParamUtil.getString(request, "keyword", "");
	int hasHrefCat = ParamUtil.getInteger(request, "hasHref", -1);
	int hasImageCat = ParamUtil.getInteger(request, "hasImage", -1);
	int isRssCat = ParamUtil.getInteger(request, "isRss", -1);
	
	String strParentId = ParamUtil.getString(request, "parentId");
	if (strParentId.indexOf("|")>-1){
		String[] arrParam = StringUtil.split(strParentId, "|");
		portionId = Validator.isNotNull(arrParam) ? arrParam[0]:"0";
		parentId = Validator.isNotNull(arrParam) ? arrParam[1]:"0";
	}
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1", "portlet.cms.general-manage");
	renderURL.setParameter("tabs2", "portlet.cms.category");
	renderURL.setParameter("search", search);
	renderURL.setParameter("portionId", portionId);
	renderURL.setParameter("parentId", parentId);
	renderURL.setParameter("keyword", keyword);
	renderURL.setParameter("hasHref", String.valueOf(hasHrefCat));
	renderURL.setParameter("hasImage", String.valueOf(hasImageCat));
	renderURL.setParameter("isRss", String.valueOf(isRssCat));
	
	int begin = delta * (cur-1);
	int end  = delta * cur;
	
	int totalCategory = 0;
	List<VcmsCategory> resultCategory = new ArrayList<VcmsCategory>();
	
	String language = "vi_VN";
	List<VcmsCategory> listCats = VcmsCategoryLocalServiceUtil.getCategoriesByPortion(groupId, language, portionId);
	
	String listParent="";
	String listURL = "";
	String root = "";
	String arrParentId[] = null;
	boolean portionHasCategory = listCats.size() > 0 ? true:false;

	VcmsPortion portionRoot = null;
	try{	
		if(Validator.isNotNull(parentId) && !"0".equals(parentId)){
			portionRoot = VcmsPortionLocalServiceUtil.getPortion(portionId);		
			root = portionRoot.getName();
			listParent = ActionUtil.getListParentCategory(parentId);
			arrParentId = listParent.split(",");
		}
		
		if(Validator.isNotNull(listParent) && Validator.isNotNull(arrParentId) ){
			listURL = "<span class='nav_portion'><a href=\""+renderURL.toString()+"\">" + root + "</a></span>";
			for(int i=arrParentId.length-1;i>=0;i--){
				VcmsCategory vCategory = VcmsCategoryLocalServiceUtil.getCategory(arrParentId[i]);			
				renderURL.setParameter("parentId", vCategory.getCategoryId());
				renderURL.setParameter("portionId", portionId);
				listURL = listURL +" &raquo; " + "<a class='nav_category' href=\""+renderURL.toString()+"\">"+vCategory.getName()+"</a>";
			}
		}
	} catch(Exception ex) {
		
	}
	
	//out.println("## search ##" + search);
	if ("true".equals(search)) {
		resultCategory = VcmsCategoryLocalServiceUtil.getCategorySearch(groupId, "vi_VN", portionId, parentId, keyword, hasHrefCat, hasImageCat, isRssCat, begin, end);		
		totalCategory = VcmsCategoryLocalServiceUtil.countCategorySearch(groupId, "vi_VN", portionId, parentId, keyword, hasHrefCat, hasImageCat, isRssCat);
	} else {
		resultCategory = VcmsCategoryLocalServiceUtil.getCategoriesByP_P(groupId, "vi_VN", parentId, portionId, begin, end);
		totalCategory = VcmsCategoryLocalServiceUtil.countCategoriesByP_P(groupId, "vi_VN", parentId, portionId);
	}
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/cms/edit_category.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<portlet:actionURL var="changePortionURL" name="crud_category"/>

<aui:form action="<%=changePortionURL.toString()%>" method="post" name="fmCategory" id="fmCategory"> 
<aui:input name="cmd" type="hidden" value='<%= "search" %>' />

<aui:row>
	<aui:col width="50">
		<aui:select name="portionId" label="portlet.cms.article.portion" onChange = '<%=renderResponse.getNamespace() + "changePortionCategory(this.value)"%>'>
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(VcmsPortion portion:listPortion){ %>
		    <aui:option value="<%=portion.getPortionId()%>"><%=portion.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
	
	<aui:col width="50">
		<aui:select name="parentId" label="portlet.cms.article.category.root" >
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<%
				out.println(ActionUtil.getCategoryTree(groupId, "vi_VN", portionId, strParentId, categoryId));
			%>
		</aui:select>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:select name="hasHref" label="link">
			<aui:option value="-1" selected="<%=(hasHrefCat==-1)%>"><liferay-ui:message key="portlet.common.select"/></aui:option>
		    <aui:option value="0" selected="<%=(hasHrefCat==0)%>"><liferay-ui:message key="no"/></aui:option>
		    <aui:option value="1" selected="<%=(hasHrefCat==1)%>"><liferay-ui:message key="yes"/></aui:option>
		</aui:select>
	</aui:col>
	
	<aui:col width="50">
		<aui:select name="hasImage" label="image">
			<aui:option value="-1" selected="<%=(isRssCat==-1)%>"><liferay-ui:message key="portlet.common.select"/></aui:option>
		    <aui:option value="0" selected="<%=(isRssCat==0)%>"><liferay-ui:message key="no"/></aui:option>
		    <aui:option value="1" selected="<%=(isRssCat==1)%>"><liferay-ui:message key="yes"/></aui:option>
		</aui:select>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="50">
		<aui:input name="keyword" label="portlet.common.keyword" placeholder="portlet.common.input.keyword"  value="<%=keyword %>"/>
	</aui:col>
	<aui:col width="50">
		<aui:select name="isRss" label="RSS">
			<aui:option value="-1" selected="<%=(hasImageCat==-1)%>"><liferay-ui:message key="portlet.common.select"/></aui:option>
		    <aui:option value="0" selected="<%=(hasImageCat==0)%>"><liferay-ui:message key="no"/></aui:option>
		    <aui:option value="1" selected="<%=(hasImageCat==1)%>"><liferay-ui:message key="yes"/></aui:option>
		</aui:select>
	</aui:col>
</aui:row>

<% if (Validator.isNotNull(listURL)) { %>
<aui:row>
	<aui:col width="100">
		<%=listURL %>
	</aui:col>
</aui:row>
<% } %>

<aui:button-row>
	<aui:button type="submit" icon="icon-search" value="search"/>
	<aui:button type="button" icon="icon-plus" href="<%=addURL %>" value="add-category"/>
</aui:button-row> 

<liferay-ui:search-container 
	total="<%=totalCategory%>" 
	var="searchContainer" delta="<%=delta %>" 
	deltaConfigurable="true" 
	iteratorURL="<%=renderURL %>"
  	emptyResultsMessage="<%=msgEmpty %>">
  
	<liferay-ui:search-container-results results="<%=resultCategory%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.VcmsCategory" modelVar="category" keyProperty="categoryid" >
	  	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() +stt++) %>"/>
	  	<liferay-ui:search-container-column-text name="name" property="name"/>
	  	<%
	  		String imgRss = themeDisplay.getPathThemeImages()+"/common/rss.png";
	  		StringBuffer rss = new StringBuffer();
	  		rss.append(category.getRssable()?"<div><img src='"+imgRss+"' /><div>":"&nbsp;");
	  	%>
	  	<liferay-ui:search-container-column-text name="rss" value="<%=rss.toString() %>" />
	  	<%
	  		String imgAnchored = PortalConstant.SRC_IMAGE+"/hoabinh/links.png";
	  		StringBuffer link = new StringBuffer();
	  		link.append(category.getAnchored()?"<div><img src='"+imgAnchored+"'  title='"+category.getHref()+"'/><div>":"&nbsp;");
	  	%>
	  	<liferay-ui:search-container-column-text name="link" value="<%=link.toString() %>" />
	  	<%
	  		String hasImage = PortalConstant.SRC_IMAGE+"/hoabinh/image.png";
	  		StringBuffer img = new StringBuffer();
	  		img.append(Validator.isNotNull(category.getImage())?"<div><img src='"+hasImage+"' /><div>":"&nbsp;");
	  	%>
	  	<liferay-ui:search-container-column-text name="image" value="<%=img.toString() %>" />	  	
	  	<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(category.getCreatedDate()) %>"/>
	  	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/cms/action_category.jsp" />
		</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>
</aui:form>
