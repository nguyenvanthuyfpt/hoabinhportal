<%@ include file="/search/init.jsp" %>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>

<%@page import="java.util.*"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="vn.gov.hoabinh.util.PortletKeys" %>
<%@page import="vn.gov.hoabinh.model.VcmsArticle"%>

<portlet:actionURL var="searchURL" name="searchArticle">	
</portlet:actionURL>
<% 
	String keyword = ParamUtil.getString(request, "keyword");
	String hasSearch = ParamUtil.getString(request, "search", StringPool.BLANK);
	
	int index = 1;
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = 20;
	String msgEmpty = "abc";
	
	int totalArticle = 0;
	List<VcmsArticle> listArticle = new ArrayList<VcmsArticle>();
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("keyword", keyword);
	renderURL.setParameter("search", "true");
	SearchContainer<VcmsArticle> searchContainer = new SearchContainer<VcmsArticle>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, renderURL, null, msgEmpty);
	
	if (!"".equals(hasSearch)) {
		totalArticle = VcmsArticleLocalServiceUtil.countArticleSearch(groupId, PortalConstant.DEFAULT_LANGUAGE, statusId, keyword);
		searchContainer.setTotal(totalArticle);
		int start = searchContainer.getStart();
		int end = searchContainer.getEnd();
		
		listArticle = VcmsArticleLocalServiceUtil.getArticleSearch(groupId, PortalConstant.DEFAULT_LANGUAGE, statusId, keyword, start, end);	
	}
	
	String[] queryTerms = null;
	if (!"".equals(keyword)) {
		keyword = keyword.replaceAll("  ", " ").replaceAll(" ", "#");
		queryTerms = StringUtil.split(keyword, "#");
	}
%>

<form action="<%=searchURL.toString()%>" method="post">
<div class="box_bg">
<h3 class="title-list-news"><span class="title-t1"><liferay-ui:message key="portlet.common.search" /></span></h3>
<div class="clear"></div>
	<div>
		<aui:row>
			<aui:col width="100">
				<aui:input name="keyword" placeholder="portlet.common.input.keyword" label="" value="<%=keyword%>"/>
			</aui:col>
			<!-- <aui:col width="100">
				<aui:button type="submit" icon="icon-search" value="search"/>
			</aui:col> -->
		</aui:row>
		
		<% if (totalArticle>0){ %>
		<aui:row>
			<aui:col width="100">
				<div id = "pagination">
					<liferay-ui:search-paginator  searchContainer="<%= searchContainer %>"  type="approximate"/>
				</div>
				<div class="category_content">
					<br/>
					<% if (Validator.isNotNull(listArticle) && listArticle.size()>0) { 
						for(VcmsArticle article:listArticle) {
							articleURL.setParameter("articleId", article.getArticleId());
							articleURL.setParameter("search", "");
					%>	
			
					<div class="cat_record">
						<% if(article.getHasImage() && Validator.isNotNull(article.getImage())){ %>
						<div class="left_first_record">
							<a href="<%=articleURL%>">
								<img class="img-responsive img-thumbnail" src="<%=themeDisplay.getPortalURL()+article.getImage()%>" width="140" alt="<%=article.getImageTitle()%>">
							</a>
						</div>
						<%} %>
						<div class="right_first_record">
							<div class="title_v">				    
								<a href="<%=articleURL%>"><h3><%= StringUtil.highlight(HtmlUtil.escape(article.getTitle()), queryTerms) %></h3><span class="time">(<%=FormatData.parseDateToTringType3(article.getPublishedDate()) %>) </span></a>
								<br/>
								<%= StringUtil.highlight(HtmlUtil.escape(article.getLead()), queryTerms) %>
							</div>
						</div>
						<div class="clear"></div>	
					</div>
					<%}} %>
				</div>
				<div id = "pagination">
					<liferay-ui:search-paginator  searchContainer="<%= searchContainer %>"  type="approximate"/>
				</div>
			</aui:col>
		</aui:row>
		<% } %>
	</div>
</div>
</form>
