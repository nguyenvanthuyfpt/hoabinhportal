<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="java.util.*"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>

<%@page import="vn.gov.hoabinh.model.Clip"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.service.ClipLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.util.PortletKeys" %>
<%@ include file="/clipview/init.jsp" %>
<% 
	int index = 1;
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = Integer.parseInt(numSel);
	String msgEmpty = "khong-co-du-lieu";
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("clipTypeId", clipTypeId);
	// System.out.println("clipTypeId " + clipTypeId + " delta " + delta);
	
	List<Clip> listClip = new ArrayList<Clip>();
	Clip clip = null;
	SearchContainer<Clip> searchContainer = new SearchContainer<Clip>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, cur, delta, renderURL, null, msgEmpty);
	int total = 0, start = 0, end = 0;
	if ((Validator.isNotNull(categorySel) && !"-1".equals(categorySel)) || (!"0".equals(clipTypeId))) {
		String[] clipTypeIds = StringUtil.split(categorySel, ",");
		if (!"0".equals(clipTypeId)) {
			clipTypeIds = new String[1];
			clipTypeIds[0] = clipTypeId;
		}
		total = ClipLocalServiceUtil.countClipDisplay(clipTypeIds);
		
		searchContainer.setTotal(total);
		start = searchContainer.getStart();
		end = searchContainer.getEnd();
		
		listClip = ClipLocalServiceUtil.getClipDisplay(clipTypeIds, start, end);
		
		
		if (!"0".equals(clipId)) {
			clip = ClipLocalServiceUtil.getClip(clipId);
			urlClip = clip.getUrl();
			urlImage = clip.getImage();
		} else {
			if (Validator.isNotNull(listClip) && listClip.size()>0) {
				clip = (Clip)listClip.get(0);
				urlClip = clip.getUrl();
				urlImage = clip.getImage();
				clipURL.setParameter("clipId", clip.getId());
			}
		}
	} else {
		total = ClipLocalServiceUtil.countClipByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE);
		searchContainer.setTotal(total);
		start = searchContainer.getStart();
		end = searchContainer.getEnd();
		listClip = ClipLocalServiceUtil.getClipByG_L(groupId, PortalConstant.DEFAULT_LANGUAGE, start, end);
		
		if (!"0".equals(clipId)) {
			clip = ClipLocalServiceUtil.getClip(clipId);
			urlClip = clip.getUrl();
			urlImage = clip.getImage();
		} else {
			if (Validator.isNotNull(listClip) && listClip.size()>0) {
				clip = (Clip)listClip.get(0);
				urlClip = clip.getUrl();
				urlImage = clip.getImage();
				clipURL.setParameter("clipId", clip.getId());
			}
		}
	}
%>
<aui:row>
	<aui:col width="50">
		<div id="myVideo"></div>
	</aui:col>
	<aui:col width="50">
		<div class="title_v">				    
			<a href="#"><h3><%=clip.getName() %></h3><span class="time">(<%=FormatData.parseDateToTringType3(clip.getCreatedDate()) %>) </span></a>
		</div>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<div id="playList">			
			<ul class="list_video" style="list-style: none;">
			<% for(Clip playlist:listClip) {
				clipURL.setParameter("clipId", playlist.getId());
			%>
			<li>
				<a href="<%=clipURL%>">
					<img class="img-responsive img-thumbnail" width="140" src="<%=playlist.getImage() %>" class="img-thumbnail img-responsive" />
				</a>
				<span><%=playlist.getName() %></span>
			</li>
			<% } %>
			</ul>
		</div>
		
		<!-- <ul id="playlist">
		    <li movieurl="http://html5videoformatconverter.com/data/images/happyfit2.mp4" moviesposter="http://html5videoformatconverter.com/data/images/screen.jpg">Happy Fit</li>
		    <li movieurl="http://grochtdreis.de/fuer-jsfiddle/video/sintel_trailer-480.mp4">Sintel</li>          
		    <li movieurl="http://html5example.net/static/video/html5_Video_VP8.webm">Resident Evil</li>      
		    <li movieurl="http://www.ioncannon.net/examples/vp8-webm/big_buck_bunny_480p.webm">Big Buck Bunny</li>
		</ul> -->
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<div id = "pagination">
			<liferay-ui:search-paginator  searchContainer="<%= searchContainer %>"  type="approximate"/>
		</div>
	</aui:col>
</aui:row>

<% if(Validator.isNotNull(urlImage) && Validator.isNotNull(urlClip)){ %>
<script>
YUI().use(
  'aui-video',
  function(Y) {
	  var video = new Y.Video(
      {
        boundingBox: '#myVideo',
        fixedAttributes: {
          allowfullscreen: 'true'
        },
        height: '<%=height%>',
        poster: '<%=urlImage%>',
        swfUrl: '/clipview/player.swf',
        url: '<%=urlClip%>',
		width : '<%=width%>'
		}).render();
	});
</script>
<%}%>

<!-- <script>
$(function() {
    $("#playlist li").on("click", function() {
        $("#myVideo").attr({
            "src": $(this).attr("movieurl"),
            "poster": "",
            "autoplay": "autoplay"
        })
    })
    $("#myVideo").attr({
        "src": $("#playlist li").eq(0).attr("movieurl"),
        "poster": $("#playlist li").eq(0).attr("moviesposter")
    })
})
</script> -->