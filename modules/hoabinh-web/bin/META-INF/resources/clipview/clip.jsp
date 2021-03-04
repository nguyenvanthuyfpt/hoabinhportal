<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.model.Clip"%>
<%
	List<Clip> listClip = ClipLocalServiceUtil.getClipByG_L_T(groupId, PortalConstant.DEFAULT_LANGUAGE, categorySel);
	if (!"0".equals(clipId)) {
		Clip vClip = ClipLocalServiceUtil.getClip(clipId);
		urlClip = vClip.getUrl();
		urlImage = vClip.getImage();
	} else {
		if (Validator.isNotNull(listClip) && listClip.size()>0) {
			Clip clip = (Clip)listClip.get(0);
			urlClip = clip.getUrl();
			urlImage = clip.getImage();
			titleClip = clip.getTitle();
			clipURL.setParameter("clipId", clip.getId());
		}
	}
%>
<aui:row>
	<aui:col width="100">
		<div id="myVideo"></div>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="100">
		<a href="<%=clipURL%>"><liferay-ui:message key="portlet.common.next"/></a>
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