<%@page import="vn.gov.hoabinh.util.FormatData"%>
<%@page import="vn.gov.hoabinh.util.StringUtils"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry" %>
<%@page import="com.liferay.document.library.kernel.util.DLUtil" %>

<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="vn.gov.hoabinh.util.DateUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="vn.gov.hoabinh.util.PortalConstant"%>
<%@page import="vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VcmsPortionLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.service.VcmsArticleLocalServiceUtil"%>
<%@page import="vn.gov.hoabinh.model.VcmsArticle"%>
<%@page import="vn.gov.hoabinh.model.VcmsCategory"%>
<%@page import="vn.gov.hoabinh.model.VcmsPortion"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/cms/init.jsp" %>

<%
	categoryId = ParamUtil.getString(request, "categoryId", "0");
	parentId = ParamUtil.getString(request, "parentId", "0");
	VcmsArticle article = null;
	VcmsCategory category = null;
    
    String[] strPortion = null;
	String[] strCategory = null;
	String[] categoryIds = null;
	String[] arrCategoryIds = null;
    
	boolean rssable = false;
	boolean anchored = false;
	boolean hasImage = false;
	if (!"0".equals(categoryId)) {
		category = VcmsCategoryLocalServiceUtil.getCategory(categoryId);
		anchored = category.getAnchored();
		rssable = category.getRssable();
		hasImage = category.getHasImage() ? true:false;
	} else {
		
	}
	
	listCategory = VcmsCategoryLocalServiceUtil.getCategoriesByP_P(14, "vi_VN", parentId, portionId);
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/cms/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.cms.general-manage" />
	<portlet:param name="tabs2" value="portlet.cms.category" />
</portlet:renderURL>

<portlet:actionURL var="saveCategory" name="crud_category"/>

<portlet:actionURL var="changePortion" name="crud_category"> 
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_CHANGE_PORTION %>"/>
</portlet:actionURL>

<script>
	function <portlet:namespace/>changePortion(plid){
		var form = document.getElementById("<portlet:namespace />fm");
		form.action = '<%= changePortion  %>';
		form.submit();
	}
</script>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>" title='<%= ("0".equals(categoryId)) ? "action.category.add" : "action.category.update"  %>' />
<aui:form action="<%= saveCategory %>" method="post" name="fm" >
<aui:input name="cmd" type="hidden" value='<%= "0".equals(categoryId)?"add":"update" %>' />
<aui:input name="hasImage" type="hidden" value='<%= hasImage %>' />
<aui:input name="categoryId" type="hidden" value='<%= categoryId %>' />

<aui:row>
	<aui:col width="60">
		<aui:select name="portionId" label="portlet.cms.category.portion" onChange = '<%=renderResponse.getNamespace() + "changePortion()"%>'>
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(VcmsPortion portion:listPortion){ %>
		    <aui:option value="<%=portion.getPortionId()%>" selected="<%=portionId.equals(portion.getPortionId())%>"><%=portion.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="60">
		<aui:select name="parentId" label="portlet.cms.article.category.root" >
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<%
				out.println(ActionUtil.getCategoryTree(groupId, "vi_VN", portionId, parentId, categoryId));
			%>
		</aui:select>
	</aui:col>
</aui:row>

<aui:row>	
	<aui:col width="60">
		<aui:input label="portlet.cms.category.name" name="name" value="<%=(!"0".equals(categoryId)?category.getName():"")%>">
		 	<aui:validator name="required"/>
		 	<aui:validator name="maxLength">200</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="60">
		<aui:input label="portlet.cms.category.description" name="description" type="textarea" value="<%=(!"0".equals(categoryId)?category.getDescription():"") %>" rows="5" />
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="60">
		<aui:input label="portlet.cms.category.anchored" name="anchored" type="checkbox" checked="<%= anchored %>" />
	</aui:col>
</aui:row>

<aui:row>	
	<aui:col width="60">
		<aui:input label="portlet.cms.category.href" name="href" value="<%=(!"0".equals(categoryId)?category.getHref():"")%>">
		 	<aui:validator name="maxLength">200</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="60">
		<aui:input label="portlet.cms.category.rss" name="rssable" type="checkbox" checked="<%= rssable %>" />
	</aui:col>
</aui:row>

<portlet:actionURL var="deleteImageURL" name="crud_category">
	<portlet:param name="jspPage" value="/cms/edit_category.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_DELETE_IMAGE %>" />
	<portlet:param name="categoryId" value="<%=categoryId%>" />
</portlet:actionURL>

<aui:row>
	<% if(!hasImage){ %>
	<aui:col width="60">
		<aui:input label="image" name="image" type="file" >
			<aui:validator name="acceptFiles">'bmp,gif,jpg,png'</aui:validator>			
		</aui:input>
	</aui:col>
	<%} %>
	
	<% if (hasImage){ %>
	<aui:col width="60">
		<div>
			<img alt="<%=category.getHref() %>" src="<%=category.getImage()+"&imageThumbnail=1"%>" />
			<liferay-ui:icon image="delete" url="<%=deleteImageURL%>" />
		</div>
	</aui:col>
	<% } %>	
</aui:row>

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>

