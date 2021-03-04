<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VcmsCategory"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.service.VcmsArticleLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VcmsArticle"%>
<%@page import="vn.gov.hoabinh.util.PortletKeys"%>
<%@ include file="/cmsview/init.jsp" %>

<portlet:resourceURL var="rssURL" >
	<portlet:param name="categoryId" value="<%=categoryId %>"/>
</portlet:resourceURL>

<% 
	VcmsCategory category =  null;
	List<VcmsArticle> articles = new ArrayList<VcmsArticle>();
	
	int index = 1;
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ("01|03|04".indexOf(styleSel)>-1)?num:20;
	String msgEmpty = "";
	
	String publishDate = DateUtil.convertDateToString(DateUtil.getEndOfMonth(new Date()), DateUtil.DATE_FORMAT_D_M_Y);	
	Date searchDate = DateUtil.parseStringToDate(publishDate, DateUtil.DATE_FORMAT_D_M_Y);

	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("categoryId", categoryId);
	SearchContainer< VcmsArticle> searchContainer = new SearchContainer<VcmsArticle>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, renderURL, null, msgEmpty);
	
	boolean chk = String.valueOf(categoryId).indexOf(",") > -1 ? true:false;
	
	if (chk) {
		String[] arrCategoryId = StringUtil.split(categoryId, ",");
		if (arrCategoryId.length>0) {
			categoryId = arrCategoryId[0];	
		}
		category = VcmsCategoryLocalServiceUtil.getCategory(categoryId);
	} else {
		category = VcmsCategoryLocalServiceUtil.getCategory(categoryId);	
	}	
	
	categoryURL.setParameter("categoryId", category.getCategoryId());
	int total = 0;
	if (!"-1".equals(categoryId)) {
		total = VcmsArticleLocalServiceUtil.countArticleBy_G_L_S_C(groupId, PortalConstant.DEFAULT_LANGUAGE, statusId, categoryId, false);
		if (total>0) {
			searchContainer.setTotal(total);
			int start = searchContainer.getStart();
			int end = searchContainer.getEnd();
			if ("01".equals(styleSel)) {
				articles = VcmsArticleLocalServiceUtil.getArticleBy_G_L_S_C(groupId, PortalConstant.DEFAULT_LANGUAGE, statusId, categoryId, false, 0, num);	
			} else {
				articles = VcmsArticleLocalServiceUtil.getArticleBy_G_L_S_C(groupId, PortalConstant.DEFAULT_LANGUAGE, statusId, categoryId, false, start, end);				
			}
		}
	}
%>

<% if (Validator.isNull(articles) || articles.size()==0) { %>
<div class="box_bg">
	<h3 class="title-list-news"><span class="title-t1"><a href="#"><%=Validator.isNotNull(category)?category.getName():"category"%></a></span></h3>
	<div class="clear"></div>
</div>
<div class="alert alert-info" style="float:left;width:100%;">
    <liferay-ui:message key="portlet.cms.category.no-article"/>
</div>	
<% } else { %>

<!-- List article by category  -->
<% if ("00".equalsIgnoreCase(styleSel)) { %>
<div class="box_bg">
<h3 class="title-list-news"><span class="title-t1"><a href="<%=categoryURL.toString()%>"><%=Validator.isNotNull(category)?category.getName():"category"%></a></span></h3>
<div class="clear"></div>
	<div class="list_new">
		<div class="category_content">
			<% if (Validator.isNotNull(articles) && articles.size()>0) { 
				for(VcmsArticle article:articles) {
					articleURL.setParameter("articleId", article.getArticleId());
			%>	
	
			<div class="cat_record">
				<% if(article.getHasImage() && Validator.isNotNull(article.getImage())){ %>
				<div class="left_first_record">
					<a href="<%=articleURL%>">
						<img class="img-responsive img-thumbnail" src="<%=themeDisplay.getPortalURL()+article.getImage()%>"  style="width: 140px;min-height: 100px;" alt="imageIcon">
					</a>
				</div>
				<%} %>
				<div class="right_first_record">
					<div class="title_v">				    
						<a href="<%=articleURL%>"><h3><%=article.getTitle() %></h3><span class="time">(<%=FormatData.parseDateToTringType3(article.getPublishedDate()) %>) </span></a>
						<br/>
						<%=HtmlUtil.extractText(article.getLead())%>
					</div>
				</div>
				<div class="clear"></div>	
			</div>
			<div class="clear"></div>
			<%}} %>
		</div>				
		<div class="clear"></div>		
	</div>	
	<div class="link_more_right">
		<div id = "pagination">
			<liferay-ui:search-paginator  searchContainer="<%= searchContainer %>"  type="approximate"/>
		</div>
	</div>
	<div class="clear"></div>
</div>

<!-- Style 01 -->
<% } else if ("01".equalsIgnoreCase(styleSel)) { %>
<div class="box_bg">
<% if (Validator.isNotNull(articles) && articles.size()>0) { 
	VcmsArticle article = (VcmsArticle)articles.get(0);
	articleURL.setParameter("articleId", article.getArticleId());
%>
	<h3 class="title-list-news"><span class="title-t1"><a href="<%=categoryURL.toString()%>"><%=Validator.isNotNull(category)?category.getName():"category"%></a></span></h3>
	<div class="clear"></div>
	<div class="list_new">
		<div class="category_content">
			<div class="first_record">
				<% if(article.getHasImage() && Validator.isNotNull(article.getImage())){ %>
				<div class="left_first_record">
					<a href="<%=articleURL%>">
						<img class="img-responsive img-thumbnail" src="<%=themeDisplay.getPortalURL()+article.getImage()%>"  style="width: 140px;min-height: 100px;" alt="imageIcon">
					</a>
				</div>
				<% } %>
				<div class="right_first_record">
					<div class="title_v">				    
						<h3><a href="<%=articleURL%>"><%=article.getTitle() %>
							<img src="/o/hbportal/images/hoabinh/new_icon.gif" style="width:35px;height:20px;float:none;margin:0px">
						</a></h3>
					</div>
				</div>
				<div class="clear"></div>	
			</div>
			
			<div class="clear"></div>
			<div style="width: 90%">
				<ul id="<portlet:namespace/>ortherArticle" class="list_visitor" style="margin: 0 0 0 0!important;padding-inline-start:0;">
					<%  int i=0;
						for(VcmsArticle art:articles) {
							articleURL.setParameter("articleId", art.getArticleId());
							if(i>0){
					%>
					<li title="<%=art.getTitle() %>" style="color: #000;border-bottom: 1px solid #eae6e6;">				
						<div class="text">
							<div class="title_v">
								<a href="<%=articleURL.toString()%>"><%=StringUtil.shorten(art.getTitle(), 90)%>
									<span class="time"><%=FormatData.parseDateToTringType3(art.getPublishedDate()) %></span>
								</a>
							</div>
						</div>
					</li>
					<% 		
							}
							i++;
						} 
					%> 
				</ul>
			</div>
			<%} %>				
			<div class="clear"></div>
		</div>
	</div>
	<% if("1".equals(displayRss)){ %>
	<div class="link_more_right">
		<a href="<%=rssURL %>" target="_blank"><span class="icon-rss" /></a>
	</div>
	<% } %>
	<div class="clear"></div>
</div>

<!-- List article no image [Notification]  -->
<%  
} else if ("03".equalsIgnoreCase(styleSel)) { 
	if (Validator.isNotNull(articles) && articles.size()>0) { 
%>
<!-- Style 03 -->
<div class="notify-content">
	<h3 class="title-list-news"><span class="title-t1"><a href="<%=categoryURL.toString()%>"><%=Validator.isNotNull(category)?category.getName():"category"%></a></span></h3>
	<div class="content">
		<ul id="<portlet:namespace/>ortherArticle" class="list_visitor" style="margin: 0 0 0 0!important;padding-inline-start:0;">
			<%  
				for(VcmsArticle art:articles) {
					articleURL.setParameter("articleId", art.getArticleId());
			%>
			<li title="<%=art.getTitle() %>">				
				<div class="text">
					<div class="title_v">
						<a href="<%=articleURL.toString()%>"><%=StringUtil.shorten(art.getTitle(), 100)%></a>
					</div>
				</div>
			</li>
			<% 	
				} 
			%> 
		</ul>
	</div>
	<div class="clear"></div>	
</div>
<%	
	}
} else if ("04".equalsIgnoreCase(styleSel)) {
	if (Validator.isNotNull(articles) && articles.size()>0) {
%>
<!-- Style 04 -->
<div class="notify-content">
	<h3 class="title-list-news"><span class="title-t1"><a href="<%=categoryURL.toString()%>"><%=Validator.isNotNull(category)?category.getName():"category"%></a></span></h3>
	<div class="home">
		<ul class="list_visitor" style="margin: 0 0 0 0!important;padding-inline-start:0;">
			<%  
				for(VcmsArticle art:articles) {
					articleURL.setParameter("articleId", art.getArticleId());
			%>
			<li>				
				<div class="text">
					<div class="title_v">
						<a href="<%=articleURL.toString()%>"><%=StringUtil.shorten(art.getTitle(), 110)%></a><br/>
						<%=art.getLead() %>
					</div>
				</div>
			</li>
			<% 	
				} 
			%> 
		</ul>
	</div>
	<div class="clear"></div>	
</div>
<% }
} else { %>
<!-- Style 05 -->
<div class="box_bg">
<% 
	int inc = 0;
	if (Validator.isNotNull(articles) && articles.size()>0) {
%>
	<h3 class="title-list-news"><span class="title-t1"><a href="<%=categoryURL.toString()%>"><%=Validator.isNotNull(category)?category.getName():"category"%></a></span></h3>
	<div class="clear"></div>
	<div class="list_new">
		<div class="category_content">
			<%
				for(VcmsArticle article:articles) {
					articleURL.setParameter("articleId", article.getArticleId());
			%>
			<% 		if(inc<Integer.parseInt(numArticleImg)){ %>
			<div class="first_record">
				<% if(article.getHasImage() && Validator.isNotNull(article.getImage())){ %>
				<div class="left_first_record">
					<a href="<%=articleURL%>">
						<img class="img-responsive img-thumbnail" src="<%=themeDisplay.getPortalURL()+article.getImage()%>"  style="width: 140px;min-height: 100px;" alt="imageIcon">
					</a>
				</div>
				<% } %>
				<div class="right_first_record">
					<div class="title_v">				    
						<h3><a href="<%=articleURL%>"><%=article.getTitle() %>
							<img src="/o/hbportal/images/hoabinh/new_icon.gif" style="width:35px;height:20px;float:none;margin:0px">
						</a></h3>
					</div>
				</div>
				<div class="clear"></div>	
			</div>
			<% 		}
					inc++;
				} 
			%>
			
			<div class="clear"></div>
			<div style="width: 90%">
				<ul id="<portlet:namespace/>ortherArticle" class="list_visitor" style="margin: 0 0 0 0!important;padding-inline-start:0;">
					<%  int i=0;
						for(VcmsArticle art:articles) {
							articleURL.setParameter("articleId", art.getArticleId());
							if(i>=Integer.parseInt(numArticleImg) && i<num){
					%>
					<li title="<%=art.getTitle() %>" style="color: #000;border-bottom: 1px solid #eae6e6;">				
						<div class="text">
							<div class="title_v">
								<a href="<%=articleURL.toString()%>"><%=StringUtil.shorten(art.getTitle(), 110)%>
									<span class="time"><%=FormatData.parseDateToTringType3(art.getPublishedDate()) %></span>
								</a>
							</div>
						</div>
					</li>
					<% 		
							}
							i++;
						} 
					%> 
				</ul>
			</div>
			<%} %>				
			<div class="clear"></div>
		</div>
	</div>
	<% if("1".equals(displayRss)){ %>
	<div class="link_more_right">
		<a href="<%=rssURL %>" target="_blank"><span class="icon-rss" /></a>
	</div>
	<% } %>
	<div class="clear"></div>
</div>
<% } %>
<% } %>

<script>
YUI().use(
  'aui-tooltip',
  function(Y) {
    new Y.TooltipDelegate(
      {
        trigger: '#<portlet:namespace/>ortherArticle li',
        position: 'right'
      }
    );
  }
);
</script>