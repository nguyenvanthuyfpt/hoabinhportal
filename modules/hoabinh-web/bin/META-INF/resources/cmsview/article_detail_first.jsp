<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil"%>
<%@page import="com.liferay.asset.kernel.model.AssetEntry"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="com.liferay.portal.kernel.util.Html"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VcmsCategory"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.service.VcmsArticleLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VcmsArticle"%>
<%@page import="vn.gov.hoabinh.util.PortletKeys"%>
<%@ include file="/cmsview/init.jsp" %>

<% 
	VcmsArticle article = null;
	VcmsCategory category =  null;
	List<VcmsArticle> articles = new ArrayList<VcmsArticle>();
	articles = VcmsArticleLocalServiceUtil.getArticleBy_G_L_S_C(groupId, PortalConstant.DEFAULT_LANGUAGE, statusId, categoryId, false, 0, num);	
	
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
%>

<% if (Validator.isNull(articles) || articles.size()==0) { %>
<div class="box_bg">
	<h3 class="title-list-news"><span class="title-t1"><a href="#"><%=Validator.isNotNull(category)?category.getName():"category"%></a></span></h3>
	<div class="clear"></div>
</div>
<div class="alert alert-info" style="float:left;width:100%;">
    <liferay-ui:message key="portlet.cms.category.no-article"/>
</div>	
<% 
	} else { 
		if (Validator.isNotNull(articles) && articles.size()>0) {
			article = (VcmsArticle)articles.get(0);
%>

<script>
	function readArticle() {
		var b = $("#audio9 audio")[0];
		var title = $("#titleDetail").text;
		b.src = "https://support.lsdsoftware.com/read-aloud/speak/vi/Whisper?q=" + title; // + encodeURIComponent();//$("#content_audio_details .title").text());
		b.play();
		
		var lead = $("#leadDetail").text();
	    b.src = "https://support.lsdsoftware.com/read-aloud/speak/vi/Whisper?q=" + lead; // + encodeURIComponent();//$("#content_audio_details .title").text());
	    b.play();
	    
		var content = $("#contentDetail").text();
	    var d = unescape(content), //$("#content_audio_details .textdetail").text()),
	        a = 0;
	    var c = function() {
	        if (a < d.length) {
	            var f = d.indexOf(",", a + 50);
	            for (var e in {
	                    ".": 1,
	                    ":": 1,
	                    "(": 1,
	                    ")": 1,
	                    '"': 1,
	                    " ": 1
	                }) {
	                if ((f > a + 100) || (f == -1)) {
	                    f = d.indexOf(e, a + 50);
	                } else {
	                    break;
	                }
	            }
	            if (f == -1) {
	                f = Math.min(a + 100, d.length);
	            }
	            b.src = "https://support.lsdsoftware.com/read-aloud/speak/vi/Whisper?q=" + encodeURIComponent(d.substr(a, f - a));
	            a = f + 1;
	            b.play()
	        }
	    };
	    b.addEventListener("ended", c);
	    b.addEventListener("error", c)
	}
</script>

<div class="box_border">
	<h3 class="title-list-news"><span class="title-t1"><a href="<%=categoryURL.toString()%>"><%=category.getName() %></a></span></h3>
	<div class="clear"></div>
	<div class="content_detail_news" id="content_detail_news">
		
		<div id='audio9'>
	        <audio id='audio' autoplay></audio>
	    </div>
	    
		<h1 class="title" id="titleDetail"><%= article.getTitle() %></h1>
		<div class="tool">
			<span class="date_time">
				<%=FormatData.parseDateToTringType3(article.getPublishedDate()) %>
			</span>
			<span class="fr">
				<a class="icon_print" href="javascript:changeFontSize(1)" title='<liferay-ui:message key="portlet.cms.article.+_fontsize"/>'>
					<img style="width:20px" src="<%=PortalConstant.SRC_IMAGE %>/hoabinh/icon-a+.png" />
				</a>
				<a class="icon_print" href="javascript:changeFontSize(0)" title='<liferay-ui:message key="portlet.cms.article.-_fontsize"/>'>
					<img style="width:20px" src="<%=PortalConstant.SRC_IMAGE %>/hoabinh/icon-a-.png" />
				</a>
				<a class="icon_print" href="javascript:readArticle()" title='<liferay-ui:message key="portlet.cms.article.play-voice"/>'>
					<img style="width:20px" src="<%=PortalConstant.SRC_IMAGE %>/hoabinh/audio.png" />
				</a>
			</span>
		</div>
		
		<div class="summary" id="leadDetail">
			<%= article.getLead() %>
		</div>
		
		<% if(article.getHasImage() && Validator.isNotNull(article.getImage())){ %>
		<div style="text-align: center;" >
			<img class="img-responsive" src="<%=article.getImage()%>"><br/>			
		</div>
		<div class="img-title"><%=article.getImageTitle() %></div>
		<% } %>
		
		<div class="textdetail" id="contentDetail">
			<%=article.getContent()%>
		</div>
		
		<% if(Validator.isNotNull(article.getAuthor())){ %>
		<div class="author"><%=article.getAuthor() %></div>
		<% } %>
		
		<% if(Validator.isNotNull(article.getSource())){ %>
		<div class="source"><%=article.getSource() %></div>
		<% } %>
	</div>
	
	<div class="tool">
		<div class="share-social" style="clear: both;">
			<ul class = "list_share_button">
				<li><a class = "facebook_button" href="" onclick="shareFacebook()" title="Share this on Facebook">
					<img alt="facebook_button" src="<%=PortalConstant.SRC_IMAGE %>/hoabinh/facebook-2-48.png" ></a></li>
				<li><a class = "twitter_button" href=""  onclick="shareTwitter()" title="Share this on Twitter">
					<img alt="twitter_button" src="<%=PortalConstant.SRC_IMAGE %>/hoabinh/twitter-2-48.png" ></a></li>
				<li><a class = "linkedin_button" href="" onclick="shareLinkedIn()" title="Share this on LinkedIn">
					<img alt="linkedin_button" src="<%=PortalConstant.SRC_IMAGE %>/hoabinh/linkedin-2-48.png" ></a></li>
				<li><a class ="googlePlus_button" href=""  onclick="shareGooglePlus()" title="Share this on Google Plus">
					<img alt="googlePlus_button" src="<%=PortalConstant.SRC_IMAGE %>/hoabinh/google-plus-2-48.png" ></a></li>
			</ul>
		</div>
	</div>
</div>

<% 	
		}
	}
%>

<script>
	var font_size=12;
	function changeFontSize(t)
	{
		font_size=t==0?font_size-1:font_size+1;
		$("#titleDetail").attr("style","font-size:"+font_size+"px;line-height:normal");
		$("#leadDetail").attr("style","font-size:"+font_size+"px;line-height:normal");
		$("#contentDetail").attr("style","font-size:"+font_size+"px;line-height:normal");
	}
	
	function setTuongPhan(vltuongphan) {
        if (vltuongphan == 3) {
            $("#content_detail_news").css("background-color", "#FFF");
        } else {
            if (vltuongphan == 0) {
                $("#content_detail_news").css("background-color", "#DCDCDC");
                
            } else {
                if (vltuongphan == 1) {
                    $("#content_detail_news").css("background-color", "#F5F5F5");
                    
                } else {
                    $("#content_detail_news").css("background-color", "#F8F8FF");
                    
                }
            }
        }
    }
	
	$(document).ready(function () {
        var tuongphan = 3;
        setTuongPhan(tuongphan);
        $("#giamtuongphan").click(function () {
            if (tuongphan > 0) {
                tuongphan = tuongphan - 1;
                setTuongPhan(tuongphan);
            }
        });
        $("#tangtuongphan").click(function () {
            if (tuongphan < 3) {
                tuongphan = tuongphan + 1;
                setTuongPhan(tuongphan);
            }
        });
	})
</script>	