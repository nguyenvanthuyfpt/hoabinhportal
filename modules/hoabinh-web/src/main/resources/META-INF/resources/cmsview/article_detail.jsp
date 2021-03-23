<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil"%>
<%@page import="com.liferay.asset.kernel.model.AssetEntry"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="com.liferay.portal.kernel.util.Html"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VcmsCategory"%>
<%@page import="vn.gov.hoabinh.format.FormatData"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.service.VcmsArticleLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VcmsArticle"%>
<%@page import="vn.gov.hoabinh.util.PortletKeys"%>
<%@page import="javax.portlet.PortletSession"%>
<%@ include file="/cmsview/init.jsp" %>

<% 
	VcmsArticle article = null;
	String soundLink = null;
	long entryId = 0;
	
	String publishDate = DateUtil.convertDateToString(DateUtil.getEndOfMonth(new Date()), DateUtil.DATE_FORMAT_D_M_Y);
	Date searchDate = DateUtil.parseStringToDate(publishDate, DateUtil.DATE_FORMAT_D_M_Y);
	
	if (!"0".equals(articleId)) {
		article = VcmsArticleLocalServiceUtil.getArticle(articleId);
		String strCategory = article.getCategoryId();
		VcmsCategory category = null;
		if (strCategory.indexOf("#")>-1) {
			String[] arrCat = strCategory.split("#");
			for (int i=0; i<arrCat.length; i++) {
				if (Validator.isNotNull(arrCat[i])) {
					category = VcmsCategoryLocalServiceUtil.getCategory(arrCat[i]);
					break;
				}
			}
		} else {
			category = VcmsCategoryLocalServiceUtil.getCategory(article.getCategoryId());
		}
		
		categoryURL.setParameter("categoryId", category.getCategoryId());
		if (Validator.isNotNull(article.getSoundLink())) {
			soundLink = article.getSoundLink();
		}
		
		List<VcmsArticle> listArticleLastest = VcmsArticleLocalServiceUtil.getOtherArticle(groupId, PortalConstant.DEFAULT_LANGUAGE, statusId, category.getCategoryId(), articleId, true, 10);
		List<VcmsArticle> listArticleOlder = VcmsArticleLocalServiceUtil.getOtherArticle(groupId, PortalConstant.DEFAULT_LANGUAGE, statusId, category.getCategoryId(), articleId, false, 10);
		
%>
<script>
	// var audio = document.getElementById("audio");
	
	function readArticle() {
		var url =   "https://texttospeech.responsivevoice.org/v1/text:synthesize?lang=vi&engine=g3&name=&pitch=0.5&rate=0.5&volume=1&key=HnIuW5da&gender=male&text=";
		var title = $("#titleDetail").text();
		var lead = $("#leadDetail").text();
		var content = $("#contentDetail").text();
		var txt = title + "." + lead + "." + content;
		var s = txt.replace('  ',' ').replace(';','.').replace(',','.').split('.');
		
		var a = [];
		for(var i=0;i<s.length;i++){
			if(s[i].trim().length>1){
				a.push(url + s[i].trim());
			}
		}
		
		audio = new Audio(a[0]);
		audio.preload = 'auto';
		audio.play();
		
		index=0;
		audio.onended = function() {
			if(index+1 < a.length){
				audio.src = a[index+1];
				audio.preload = 'auto';
				audio.play();
				index++;
			}
		};
	}
	
	function stopAudio(){
		$.each($('audio'), function () {
		    this.pause();
		    this.currentTime = 0;
		});
	}
</script>

<div class="box_border">
	<h3 class="title-list-news"><span class="title-t1"><a href="<%=categoryURL.toString()%>"><%=category.getName() %></a></span></h3>
	<div class="clear"></div>
	<div class="content_detail_news" id="content_detail_news">
		
		<% if (Validator.isNotNull(soundLink) && !"-1".equals(soundLink)){ %>
		<div id="<portlet:namespace/>myAudio" class="player"></div>
		<%} %>
		
		<!-- <div id='audio9'>
	        <audio id='audio' class="audioDemo" preload="auto" controls="controls"></audio>
	    </div> -->
	    
		<h1 class="title" id="titleDetail"><%= article.getTitle() %></h1>
		<%-- <div class="date_time"><%=FormatData.parseDateToTringType3(article.getPublishedDate()) %></div> --%>
		<div class="tool">
			<span class="date_time">
				<%=FormatData.parseDateToTringType3(article.getPublishedDate()) %>
				<%-- <liferay-ui:icon
				    iconCssClass="icon-calendar"
				    label="<%= true %>"
				    message="<%=FormatData.parseDateToTringType3(article.getPublishedDate()) %>"
				    url=""
				/> --%>
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
			<img class="img-responsive" src="<%=article.getImage()%>">			
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
	
	<%-- <% if(article.getDiscussible()){ %>
	<div>
		<jsp:include page="/cmsview/add_discussion.jsp" />
	</div>
	<% } %> --%>
	
	<%-- <% if(article.getHasPoll()) { %>
	<div>
		<jsp:include page="/cmsview/add_vote.jsp" />
	</div>
	<% } %> --%>
	
	<div class="attachment">
		<%if(article.getHasAttachment()){ 			
		%>
		<ul>
			<% List<Attachment> listAttachment = AttachmentLocalServiceUtil.getAttachments(Long.parseLong(article.getArticleId()), VcmsArticle.class);
				for(Attachment attachment:listAttachment) {
					long fileEntryId = attachment.getFileEntryId();
					FileEntry fileEntry = DLAppServiceUtil.getFileEntry(fileEntryId);
					String url = DLUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, "");
			%>
				<li><a href="<%=url%>">
					<img alt="<%=attachment.getFileName() %>" src="<%=PortalConstant.SRC_IMAGE+"/file_system/small/"+fileEntry.getExtension()+".png"%>" />
					<%=attachment.getFileName() %></a>
				</li>
			<% } %>
		</ul>
		<%} %>
	</div>
	
	<div class="text-center">
		<a href="#" onclick="window.history.go(-1); return false;"><liferay-ui:icon image="back" message="back"/></a>
         <a href="#" onclick="window.print();"><liferay-ui:icon image="print" message="print"/></a>
	</div>
	
	<div class="tool">
		<div class="share-social" style="clear: both;width=50%;float:left;">
			<ul class = "list_share_button">
				<li><a class = "facebook_button" href="" onclick="shareFacebook()" title="Share this on Facebook">
					<img alt="facebook_button" src="<%=PortalConstant.SRC_IMAGE %>/hoabinh/facebook-2-48.png" ></a></li>
				<li><a class = "twitter_button" href=""  onclick="shareTwitter()" title="Share this on Twitter">
					<img alt="twitter_button" src="<%=PortalConstant.SRC_IMAGE %>/hoabinh/twitter-2-48.png" ></a></li>
				<li><a class = "linkedin_button" href="" onclick="shareLinkedIn()" title="Share this on LinkedIn">
					<img alt="linkedin_button" src="<%=PortalConstant.SRC_IMAGE %>/hoabinh/linkedin-2-48.png" ></a></li>
				<li><a class ="googlePlus_button" href=""  onclick="shareGooglePlus()" title="Share this on Google Plus">
					<img alt="googlePlus_button" src="<%=PortalConstant.SRC_IMAGE %>/hoabinh/google-plus-2-48.png" ></a></li>
				<!-- <li><a class="addthis_button" href="http://www.addthis.com/bookmark.php?v=250" target="_blank">
					<img src="https://cache.addthiscdn.com/icons/v2/thumbs/32x32/addthis.png" border="0" alt="Addthis" width="30px;"/></a></li> -->					
			</ul>
		</div>
		
		<div>
			<a id="tangtuongphan" onclick="javascript:;" title='<liferay-ui:message key="portlet.cms.article.+_contrast"/>'>
				<img alt="Tang tuong phan" src="<%=PortalConstant.SRC_IMAGE %>/hoabinh/tangtuongphan.png" ></a>
			<a id="giamtuongphan" onclick="javascript:;" title='<liferay-ui:message key="portlet.cms.article.-_contrast"/>'>
				<img alt="Giam tuong phan" src="<%=PortalConstant.SRC_IMAGE %>/hoabinh/giamtuongphan.png" ></a>
		</div>
		<div id="myRating">
		  <input type="radio" value="1" id="vote1" title="" />
		  <input type="radio" value="2" id="vote2" title="" />
		  <input type="radio" value="3" id="vote3" title="" />
		  <input type="radio" value="4" id="vote4" title="" />
		  <input type="radio" value="5" id="vote5" title="" />
		</div>
		<p id="titleBox"></p>
	</div>
	
	<div id="footerOfNewDetail">
		<div class="clear"></div>
		<div class="clear"></div>
		<% if (Validator.isNotNull(listArticleLastest) && listArticleLastest.size()>0){ %>
		<div class="list_detail">
			<span class="title"><liferay-ui:message key="portlet.cms.article.lastest"/></span>
			<ul class="ul_list_detail">
				<% for(VcmsArticle articleOther: listArticleLastest) {
					articleURL.setParameter("articleId", articleOther.getArticleId());
				%>
				<li><a href="<%=articleURL.toString()%>"><%=articleOther.getTitle() %>
				<span class="time">(<%=FormatData.parseDateToTringType3(articleOther.getPublishedDate()) %>) </span></a></li>
				<% } %>
			</ul>
		</div>
		<%} %>
		
		<% if (Validator.isNotNull(listArticleOlder) && listArticleOlder.size()>0){ %>
		<div class="list_detail">
			<span class="title"><liferay-ui:message key="portlet.cms.article.older"/></span>
			<ul class="ul_list_detail">
				<% for(VcmsArticle articleOther: listArticleOlder) {
					articleURL.setParameter("articleId", articleOther.getArticleId());
				%>
				<li><a href="<%=articleURL.toString()%>"><%=articleOther.getTitle() %>
				<span class="time">(<%=FormatData.parseDateToTringType3(articleOther.getPublishedDate()) %>) </span></a></li>
				<% } %>
			</ul>
		</div>
		<%} %>
	</div>
</div>
<% } %>

<portlet:resourceURL var="ratingsURL" id="ratingArticle" >
</portlet:resourceURL>

<script>
	YUI().use(
	  'aui-rating',
	  'node',
	  function(Y) {
	    var titleBox = Y.one('#titleBox');
	    var instance, title, stars;

	    var rating = new Y.StarRating(
	      {
	        boundingBox: '#myRating',
	        disabled: false,
	        label: "Đánh giá bài viết:"
	      }
	    ).render();

	    rating.on(
	      'click',
	      function(event) {
	        instance = event.target;
	        title = instance.get('title');
	        stars = instance.get('value');

	        $.ajax({	    		
	    		type:'POST',
	    		data:{
	    			<portlet:namespace/>cmd: 'vote',
	    			<portlet:namespace/>stars: stars, 
	    			<portlet:namespace/>articleId: '<%=articleId%>'
	    		},	    		
	    		url:'<%= ratingsURL %>',
	    		beforeSend: function (xhr) {
	    	    },
	    		success:function(result){
	    			var jsonobj = JSON.parse(result);
	    			stars = jsonobj.stars;
	    			
	    			var info = jsonobj.ratingInfo;
	    			titleBox.html('' + info + ' lượt đánh giá)');
	    		},
	    		error: function (request, status, error) {
	    			alert('không thể kết nối với server. Vui lòng liên hệ với quản trị viên');
	    	    }
	    	});
	      }
	    );
	  }
	);
	
	$(document).ready(function(){
		stopAudio();
		var titleBox = $("#titleBox");		
	    var instance, title, stars;
		$.ajax({	    		
    		type:'POST',
    		data:{
    			<portlet:namespace/>articleId: '<%= articleId %>',
    			<portlet:namespace/>cmd: 'check'
    		},	    		
    		url:'<%= ratingsURL %>',
    		beforeSend: function (xhr) {
    	    },
    		success:function(result){
    			var jsonobj = JSON.parse(result);
    			var info = jsonobj.ratingInfo;
    			titleBox.html('' + info + ' lượt đánh giá)');
    		},
    		error: function (request, status, error) {
    			alert('không thể kết nối với server. Vui lòng liên hệ với quản trị viên');
    	    }
    	});
	});
</script>

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