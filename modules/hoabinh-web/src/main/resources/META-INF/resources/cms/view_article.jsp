<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="vn.gov.hoabinh.service.VcmsStatusLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.util.DateUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="vn.gov.hoabinh.model.VcmsStatus"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.VcmsArticleLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VcmsPortionLocalServiceUtil"%>

<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode" %>
<% 
	int cur = ParamUtil.getInteger(request, PortletKeys.SearchContainer.CURRENT_PAGE, PortletKeys.PAGE);
	int delta = ParamUtil.getInteger(request, PortletKeys.SearchContainer.DELTA, PortletKeys.DELTA);
	int stt = 1;
	
	String typeId = ParamUtil.getString(request, "typeId", "0");
	String keyword = ParamUtil.getString(request, "keyword", StringPool.BLANK);
	String search = ParamUtil.getString(request, "search", "");
	String searchBy = ParamUtil.getString(request, "searchBy");
	boolean isTitle = ParamUtil.getBoolean(request, "isTitle", true);
	boolean isLead = ParamUtil.getBoolean(request, "isLead", false);
	boolean isContent = ParamUtil.getBoolean(request, "isContent", false);
	boolean isFromTo = ParamUtil.getBoolean(request, "isFromTo", false);
	
	//String fromDate = DateUtil.convertDateToString(DateUtil.getBeginOfMonth(new Date()), DateUtil.DATE_FORMAT_D_M_Y);
	//String toDate = DateUtil.convertDateToString(DateUtil.getEndOfMonth(new Date()), DateUtil.DATE_FORMAT_D_M_Y);
	
	// Date searchFrom = DateUtil.parseStringToDate(fromDate, DateUtil.DATE_FORMAT_D_M_Y);
	// Date searchTo = DateUtil.parseStringToDate(toDate, DateUtil.DATE_FORMAT_D_M_Y);
	
	String fromDate = ParamUtil.getString(request, "fromDate");	
	String toDate = ParamUtil.getString(request, "toDate");
	
	Date searchFrom = DateUtil.parseStringToDate(fromDate, DateUtil.DATE_FORMAT_D_M_Y);
	Date searchTo = DateUtil.parseStringToDate(toDate + " 23:59:59", DateUtil.DATE_FORMAT_D_M_Y_H_M_S);
	
	if (Validator.isNotNull(portionId)) {
		listCategory = VcmsCategoryLocalServiceUtil.getCategoriesByPortion(groupId, PortalConstant.DEFAULT_LANGUAGE, portionId);	
	}	
	
	String tabs2 = ParamUtil.getString(request, "tabs2","0");
	String tabsName2 = "portlet.cms.article.draft";
	String tabsValue2 = "0";
	String tabs = "DRAFT";
	
	for (VcmsStatus status:listStatus) {
		tabsName2 += "," + status.getName();
		tabsValue2 += "," + status.getStatusId();
	}
	
	long statusArticle = 0;
	if (Validator.isNumber(tabs2)) {
		statusArticle = Long.parseLong(tabs2);
	}
	
	int begin = delta * (cur-1);
	int end  = delta * cur;
	
	int totalArticle = 0;
	List<VcmsArticle> listArticle = new ArrayList<VcmsArticle>();
	if ("true".equals(search)) {
		totalArticle = VcmsArticleLocalServiceUtil.countArticleByParam(groupId, PortalConstant.DEFAULT_LANGUAGE, statusArticle,
				categoryId, typeId, keyword, isTitle, isLead, isContent, searchBy, isFromTo, searchFrom, searchTo, String.valueOf(statusArticle), true);
		
		listArticle = VcmsArticleLocalServiceUtil.findArticleByParam(groupId, PortalConstant.DEFAULT_LANGUAGE, statusArticle,
				categoryId, typeId, keyword, isTitle, isLead, isContent, searchBy, isFromTo, searchFrom, searchTo, String.valueOf(statusArticle), true, begin, end);
	} else {
		totalArticle = VcmsArticleLocalServiceUtil.countArticlesByL_S(groupId, PortalConstant.DEFAULT_LANGUAGE, statusArticle);
		
		listArticle = VcmsArticleLocalServiceUtil.getArticlesByL_S(groupId, PortalConstant.DEFAULT_LANGUAGE, statusArticle, 
				begin, end);
	}
	
	PortletURL renderURL= renderResponse.createRenderURL();
	renderURL.setParameter(PortletKeys.SearchContainer.CURRENT_PAGE, String.valueOf(cur));
	renderURL.setParameter(PortletKeys.SearchContainer.DELTA, String.valueOf(delta));
	renderURL.setParameter("tabs1", "portlet.cms.article");
	renderURL.setParameter("tabs2", tabs2);
	renderURL.setParameter("portionId", portionId);
	renderURL.setParameter("categoryId", categoryId);
	renderURL.setParameter("keyword", keyword);
	renderURL.setParameter("cmd", PortalConstant.ACTION_SEARCH);
	renderURL.setParameter("search", "true");
%>

<style type="text/css">
	.img {
		width:30%;
		float:left;
		min-width: 120px;
		max-width: 150px;
	}
</style>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/cms/edit_article.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<portlet:renderURL var="tabURL">
	<portlet:param name="jspPage" value="/cms/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.cms.article" />
</portlet:renderURL>

<portlet:actionURL var="syncURL" name="crud_article">
	<portlet:param name="jspPage" value="/cms/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_SYNC%>" />
	<portlet:param name="keyword" value="<%=keyword%>" />
	<portlet:param name="tabs1" value="portlet.cms.article" />
</portlet:actionURL>

<portlet:actionURL var="sendsURL" name="crud_article">
	<portlet:param name="jspPage" value="/cms/view.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_APPROVE %>" />
	<portlet:param name="tabs1" value="portlet.cms.article" />
	<portlet:param name="tabs2" value="<%=tabs2 %>" />
</portlet:actionURL>

<portlet:actionURL var="searchArticletURL" name="crud_article">
	<portlet:param name="articleId" value="0" />
</portlet:actionURL>

<aui:form action="<%=searchArticletURL.toString()%>" method="post" name="fmArticle" id="fmArticle"> 
<aui:input name="cmd" type="hidden" value='<%= "search" %>' />
<aui:input name="articleIds" type="hidden" value='' />
<aui:input name="tabs2" type="hidden" value='<%= tabs2 %>' />

<liferay-ui:tabs
    names='<%=tabsName2%>'
    tabsValues='<%=tabsValue2 %>'
    param="tabs2"
    url="<%=tabURL.toString()%>"
>   

<div>
	<aui:row>
		<aui:col colspan="2" width="50">
			<aui:select name="portionId" label="portlet.cms.article.portion" onChange = '<%=renderResponse.getNamespace() + "changePortion()"%>'>
				<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<% for(VcmsPortion portion:listPortion){ %>
			    <aui:option value="<%=portion.getPortionId()%>"><%=portion.getName() %></aui:option>
			    <%} %>
			</aui:select>
		</aui:col>
		<aui:col colspan="2" width="50">
			<aui:select name="parentId" label="portlet.cms.article.category" >
			    <aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
				<%
					out.println(ActionUtil.getCategoryTree(groupId, "vi_VN", portionId, parentId, categoryId));
				%>
			</aui:select>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col colspan="4">
			<aui:input name="keyword" label="portlet.common.keyword" placeholder="portlet.common.input.keyword" value="<%=keyword %>"/>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="25">
			<aui:input name="isTitle" label="portlet.cms.search.title" type="checkbox" checked="<%= isTitle %>"/>
		</aui:col>
		<aui:col width="25">
			<aui:input name="isLead" label="portlet.cms.search.lead" type="checkbox" checked="<%= isLead %>"/>
		</aui:col>
		<aui:col width="25">
			<aui:input name="isContent" label="portlet.cms.search.content" type="checkbox" checked="<%= isContent %>"/>
		</aui:col>
		<aui:col width="25">
			<aui:select name="searchBy" label="" >
				<aui:option value="0"><liferay-ui:message key="portlet.common.search.or"/></aui:option>
			    <aui:option value="1"><liferay-ui:message key="portlet.common.search.and"/></aui:option>
			</aui:select>
		</aui:col>
	</aui:row>
	<aui:row>
		<aui:col width="25">
			<aui:input name="isFromTo" label="portlet.common.search.date" type="checkbox" checked="<%= isFromTo %>"/>
		</aui:col>
		<aui:col width="25">
			<aui:input name="fromDate" label="portlet.common.search.from" placeholder="dd/MM/yyyy" value="<%=fromDate%>"/>
		</aui:col>
		<aui:col width="25">
			<aui:input name="toDate" label="portlet.common.search.to" placeholder="dd/MM/yyyy" value="<%=toDate%>"/>
		</aui:col>
		<aui:col width="25">
			&nbsp;
		</aui:col>
	</aui:row>
	<aui:button-row>
		<c:if test="<%=statusArticle==0 %>">
			<aui:button type="button" href="<%=addURL %>" icon="icon-plus" value="add-article"/>
		</c:if>
		
		<%-- <c:if test="<%=permissionChecker.isOmniadmin()%>">
			<aui:button type="button" href="<%=syncURL %>" icon="icon-refresh" value="sync-article"/>
		</c:if> --%>
		
		<c:if test="<%=!VcmsStatusLocalServiceUtil.isStatusPublisher(statusArticle) %>">
			<aui:button  type="button" icon="icon-envelope"  value="action.article.send" onClick='<%= renderResponse.getNamespace() + "sendArticles();" %>' />
		</c:if>
		
		<aui:button type="submit" icon="icon-search" value="search"/>
	</aui:button-row>
</div>

</liferay-ui:tabs>

<liferay-ui:search-container total="<%=totalArticle%>" 
	var="searchContainer" 
	delta="<%=delta %>" 
	rowChecker="<%=new RowChecker(renderResponse)%>"
	deltaConfigurable="true" 
	iteratorURL="<%=renderURL %>"
  	emptyResultsMessage="<%=msgEmpty %>"> 
 
<liferay-ui:search-container-results 
 		results="<%=listArticle%>" />
	<liferay-ui:search-container-row className="vn.gov.hoabinh.model.VcmsArticle" modelVar="article" keyProperty="articleId" >
   	<liferay-ui:search-container-column-text name="portlet.common.stt" value="<%=String.valueOf(searchContainer.getStart() +stt++) %>"/>
   	<%-- <liferay-ui:search-container-column-image name="image" src="<%=article.getImage() %>" /> --%>
   	
   	<%
   		String img1 = PortalConstant.SRC_IMAGE+"/hoabinh/sticky.png";
   		String img2 = PortalConstant.SRC_IMAGE+"/hoabinh/comment.png";
   		String img3 = PortalConstant.SRC_IMAGE+"/hoabinh/poll.gif";
   		String strDate = "";
   		if (statusArticle==0) { 
   			strDate = sdf_dmy.format(article.getCreatedDate());
		} else {
			if (VcmsStatusLocalServiceUtil.isStatusPublisher(statusArticle)) {
				strDate = Validator.isNotNull(article.getPublishedDate()) ? sdf_dmy.format(article.getPublishedDate()):"";
			} else {
				strDate = sdf_dmy.format(article.getModifiedDate());
			}
		}
   		
   		StringBuffer sb = new StringBuffer();
   		sb.append("<div>");
   		if (article.getHasImage()) {
	   		sb.append("<div class='img'>");
	   		sb.append("<img class='img-responsive img-thumbnail' src='"+article.getImage()+"' /></div>");
	   		sb.append("</div>");
   		}
   		
   		sb.append("<div>");
   		sb.append("<b>"+article.getTitle()+"</b><i> ("+strDate+")</i><br/>");
   		sb.append("<i>"+article.getLead()+"</i><br/>");
   		sb.append(article.getSticky()?"<img id='"+ article.getArticleId() +"' src='"+img1+"' />":"&nbsp;");   		
   		sb.append("</div>");
   		sb.append("</div>");
   	%>
   	
   	<portlet:renderURL var="editURL">
		<portlet:param name="jspPage" 	value="/cms/edit_article.jsp" />
		<portlet:param name="tabs1" value="portlet.cms.article" />
		<portlet:param name="tabs2" value="<%=String.valueOf(article.getStatus()) %>" />
		<portlet:param name="articleId" value="<%=article.getArticleId()%>" />
	</portlet:renderURL>
   	
   	<liferay-ui:search-container-column-text name="title" href="<%=editURL %>" value="<%=sb.toString() %>"/>   	
   	
   	<%-- <c:if test="<%=statusArticle==0 %>">
   		<liferay-ui:search-container-column-text name="create-date" value="<%=sdf_dmy.format(article.getCreatedDate()) %>"/>
   	</c:if>
   	
   	<c:if test="<%=statusArticle > 0 %>">
   		<c:if test="<%=VcmsStatusLocalServiceUtil.isStatusPublisher(statusArticle) %>">
   			<liferay-ui:search-container-column-text name="publish-date" value="<%= Validator.isNotNull(article.getPublishedDate()) ? sdf_dmy.format(article.getPublishedDate()): "" %>"/>
   		</c:if>
   		<c:if test="<%=!VcmsStatusLocalServiceUtil.isStatusPublisher(statusArticle)%>">
   			<liferay-ui:search-container-column-text name="modify-date" value="<%=sdf_dmy.format(article.getModifiedDate()) %>"/>
   		</c:if>
   	</c:if> --%>
   	<liferay-ui:search-container-column-jsp name="portlet.common.action" path="/cms/action_article.jsp" />
 	</liferay-ui:search-container-row>
 <liferay-ui:search-iterator />
</liferay-ui:search-container>

</aui:form>

<aui:script>
AUI().use('aui-datepicker', function(A) {
	var fromDate =new A.DatePicker({
		trigger : '#<portlet:namespace/>fromDate',
		popover : {
		zIndex : 1
	},
	on: {
		selectionChange : function(event) {
			console:log(event.newSelection)
		}		
	},
	 mask: '%d/%m/%Y'
	});
	
	var toDate =new A.DatePicker({
		trigger : '#<portlet:namespace/>toDate',
		popover : {
		zIndex : 1
	},
	 mask: '%d/%m/%Y'
	});
});	
</aui:script>

<aui:script>
Liferay.provide(
        window,
        '<portlet:namespace />sendArticles',
        function() {            	        
        			var checkBoxValue = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fmArticle, "<portlet:namespace />allRowIds");
        			if(checkBoxValue==""||checkBoxValue==null||checkBoxValue=="on"){                            
                            alert("Bạn vui lòng chọn bài viết trước khi thực hiện thao tác!");
                            return false;
                    }
                    
                    if (confirm('Bạn thực sự muốn thực hiện hành động với những bài viết đã lựa chọn?')) {
                        $('#<portlet:namespace/>articleIds').val(checkBoxValue);
                        $('#<portlet:namespace/>cmd').val("<%=PortalConstant.ACTION_APPROVES%>");
                    	document.<portlet:namespace/>fmArticle.action = "<%=searchArticletURL%>";
                		document.<portlet:namespace/>fmArticle.submit();
                    }
        },
        ['liferay-util-list-fields']
    );
</aui:script>