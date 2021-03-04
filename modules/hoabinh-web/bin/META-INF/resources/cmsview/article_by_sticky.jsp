<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
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
<% 
	List<VcmsArticle> listArticle = 
	VcmsArticleLocalServiceUtil.getArticleBy_G_L_S_C(groupId, PortalConstant.DEFAULT_LANGUAGE, statusId, "0", true, 0, num);
	if (Validator.isNotNull(listArticle) && listArticle.size()>0) { 
		VcmsArticle article = (VcmsArticle)listArticle.get(0);
		articleURL.setParameter("articleId", article.getArticleId());
%> 
<div class="main-news">
	<div class="news_sticky">
		<div class="contentnews">
			<div> <!-- class="contentRight"> -->
				<div class="jshowoff jshowoff-1 basicFeatures">
					<div style="position: relative;">
						<div class="feature">
							<div class="news-hot">
						 		<a href="<%=articleURL.toString()%>">
						 			<img class="img-responsive" src="<%=themeDisplay.getPortalURL()+article.getImage()%>" alt="<%=article.getImageTitle() %>" />
						 		</a>
						 		<h3 class="title">
						 			<a href="<%=articleURL.toString()%>"><%=article.getTitle() %>
									<img src="/o/hbportal/images/hoabinh/new_icon.gif" style="width:35px;height:20px;float:none;margin:0px"></a>
									<span class="time">(<%=FormatData.parseDateToTringType3(article.getPublishedDate()) %>) </span>	
						 		</h3>
						 		<div class="desc">
						 			<p><%=article.getLead() %></p>
						 		</div>
							 </div>
						</div>	
					</div>	
				</div>		
			</div>
			
			<%-- <div class="contentLeft">
				<div class="title_portlet">
					<ul class="title_portlet_ul">
						<li>
							<a href="#" style="font: 13px/27px Tahoma;font-weight: bold;color: #bc1515;"><liferay-ui:message key="portlet.cmsview.sticky"/></a>
						</li>
					</ul>
				</div>
				<ul class="articleTitle">
					<%  int i=0;
						for(VcmsArticle art:listArticle) {
							articleURL.setParameter("articleId", art.getArticleId());
							if(i>0){
					%>
					<li>
						<% if(art.getHasImage()) { %>				
						<a href="<%=articleURL.toString() %>" class="border-img">
							<img class="img-responsive" src="<%=themeDisplay.getPortalURL()+art.getImage() %>" width="80" height="55" alt="imageIcon" />
						</a>
						<% } %>
						<a href="<%=articleURL.toString()%>" class="detail"><%=art.getTitle() %></a>
					</li>
					<% 		
							}
							i++;
						} 
					%> 
				</ul>
			</div> --%>
			
			<div style="float:left;">
				<ul id="<portlet:namespace/>ortherArticle" class="list_news" style="list-style: none;">
					<%  int i=0;
						for(VcmsArticle art:listArticle) {
							articleURL.setParameter("articleId", art.getArticleId());
							if(i>0){
					%>
					<li title="<%=art.getTitle() %>">				
						<a href="<%=articleURL.toString()%>">							
							<div class="img">
								<img class="img-responsive img-thumbnail" style="width: 140px;min-height: 100px;" 
									src="<%=themeDisplay.getPortalURL()+art.getImage() %>" alt="<%=art.getImageTitle()%>" />
							</div>
							<p class="desc"><%=StringUtil.shorten(art.getTitle(),60)%></p>
						</a>
					</li>
					<% 		
							}
							i++;
						} 
					%>
				</ul>
			</div>
		</div>
		<div class="clear"></div>
	</div>
</div>
<%
	}
%>

<script>
	YUI().use('aui-tooltip', function(Y) {
		new Y.TooltipDelegate({
			trigger : '#<portlet:namespace/>ortherArticle li',
			position : 'right'
		});
	});
</script>

<!-- <script type="text/javascript">
        $(document).ready(function () {
            $(".slider-news-hot").owlCarousel({

                autoPlay: 3000, //Set AutoPlay to 3 seconds

                items: 5,
                itemsDesktop: [1199, 5],
                itemsDesktopSmall: [980, 4],
                itemsTablet: [768, 3],
                itemsMobile: [479, 2],
                responsive: true,
                responsiveRefreshRate: 200,
                responsiveBaseWidth: window,
                pagination: false,
                paginationNumbers: false,
                navigation: true,
                navigationText: ["prev", "next"],
            });
        })

        //$(".top-content-right").addClass("ver2");

    </script> -->