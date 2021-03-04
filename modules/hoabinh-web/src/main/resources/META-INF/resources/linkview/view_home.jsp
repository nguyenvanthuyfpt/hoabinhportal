<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.model.Links" %>
<%@page import="vn.gov.hoabinh.model.LinkGroup" %>
<%@page import="vn.gov.hoabinh.service.LinkGroupLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.LinksLocalServiceUtil"%>
<%@ include file="/linkview/init.jsp" %>
<%
	long linkGroupId = 0;
	List<Links> links = new ArrayList<Links>();
	List<Links> listLink = new ArrayList<Links>();
	String[] arrLinkGroup = null;	
	if (Validator.isNotNull(linkGroupSel) && !"-1".equals(linkGroupSel)) {
		arrLinkGroup = StringUtil.split(linkGroupSel, ",");
	}
	
	if (Validator.isNotNull(arrLinkGroup) && arrLinkGroup.length>=1) {
		for(int i=0;i<arrLinkGroup.length;i++){
			if (!"-1".equals(arrLinkGroup[i])) {
				links = LinksLocalServiceUtil.getByLinkG_GL(groupId, Long.parseLong(arrLinkGroup[i]));
				listLink.addAll(links);
			}
		}
	}
%>
<script type="text/javascript">
	function openLink(url) {
		window.open(url.value);
	}
</script>
<div class="box_bg">
	<h3 class="title-list-news"><span class="title-t1"><liferay-ui:message key="portlet.linkview" /></span></h3>
	<div class="clear"></div>
	<div>
		<aui:select name="link" label="" value=""  onChange="javascript:openLink(this);">
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<%	if (listLink.size()>0) {
				for(Links link:listLink){ %>
			<aui:option value="<%=link.getUrl() %>"><%=link.getName() %></aui:option>
			<%}} %>
		</aui:select>
	</div>
</div>