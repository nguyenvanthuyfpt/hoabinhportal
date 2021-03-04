<%@page import="vn.gov.hoabinh.service.VcmsPortionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VcmsPortion"%>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1", "portlet.cms.general-manage");
	renderURL.setParameter("tabs2", "portlet.cms.portion");
	
	int begin = delta * (cur-1);
	int end  = delta * cur;
	
	int totalPortion = VcmsPortionLocalServiceUtil.countPortionsByG_L(groupId, "vi_VN");
	List<VcmsPortion> resultPortion = VcmsPortionLocalServiceUtil.getPortionsByG_L(groupId, "vi_VN", begin, end);
%>

<portlet:actionURL var="changePortionURL" name="crud_portion"/>

<aui:form action="<%=changePortionURL.toString()%>" method="post" name="fm" id="fm"> 
<aui:input name="cmd" type="hidden" value='<%= "search" %>' />

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/cms/edit_portion.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<aui:button-row>
	<aui:button type="button" icon="icon-plus" href="<%=addURL %>" value="add-portion"/>
</aui:button-row>

<liferay-ui:search-container 
	total="<%=totalPortion%>" 
	var="searchContainer" delta="<%=delta %>" 
	deltaConfigurable="true" 
	iteratorURL="<%=renderURL %>"
  	emptyResultsMessage="<%=msgEmpty %>">
  
	<liferay-ui:search-container-results results="<%=resultPortion%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.VcmsPortion" modelVar="portion" keyProperty="portionId" >
	  	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() +stt++) %>"/>
	  	<liferay-ui:search-container-column-text name="name" property="name"/>
	  <%-- 	<%
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
	  	<liferay-ui:search-container-column-text name="image" value="<%=img.toString() %>" /> --%>	  	
	  	<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(portion.getCreatedDate()) %>"/>
	  	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/cms/action_portion.jsp" />
		</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>
</aui:form>

