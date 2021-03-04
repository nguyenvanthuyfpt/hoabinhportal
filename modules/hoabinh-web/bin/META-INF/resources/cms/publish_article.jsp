<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="vn.gov.hoabinh.util.ActionUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@ include file="/cms/init.jsp" %>
<%
	String articleId = ParamUtil.getString(request, "articleId", "0");
	String tabs2 = ParamUtil.getString(request, "tabs2");
	String[] strPortion = null;
	String[] strCategory = null;
	String[] categoryIds = null;
	
	VcmsArticle article = null;
    boolean sticky = false;
    boolean stickyNeverExpired = false;
    boolean discussible = false;
    boolean hasPoll = false;
    boolean hasImage = false;
    boolean hasAttach = false;
    String stickyExpireDate = "";
    String publishedDate = "";
    String effectiveDate = "";
    String expireDate = "";
    String statusArticle = "0";
    String soundLink = "";
    
	if (!"0".equals(articleId)) {
		article = VcmsArticleLocalServiceUtil.getArticle(articleId);
		sticky = article.getSticky();
		stickyNeverExpired = article.getStickyNeverExpired();
		discussible = article.getDiscussible();
		hasPoll = article.getHasPoll();
		hasImage = article.getHasImage();
		hasAttach = article.getHasAttachment();
		soundLink = article.getSoundLink();
		stickyExpireDate =  Validator.isNotNull(article.getStickyExpireDate()) ? DateUtil.convertDateToString(article.getStickyExpireDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;
		publishedDate = Validator.isNotNull(article.getPublishedDate()) ? DateUtil.convertDateToString(article.getPublishedDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;
		effectiveDate = Validator.isNotNull(article.getEffectiveDate()) ? DateUtil.convertDateToString(article.getEffectiveDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;
		expireDate = Validator.isNotNull(article.getExpireDate()) ? DateUtil.convertDateToString(article.getExpireDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;
		statusArticle = String.valueOf(article.getStatus());
		strCategory = Validator.isNotNull(article.getCategoryId()) ? StringUtil.split(article.getCategoryId(),"#") : null;
	} else {
		stickyExpireDate = DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y);
		publishedDate = DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y);
		effectiveDate = DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y);
		expireDate = DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y);
	}
%>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/cms/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.cms.article"/>
	<portlet:param name="tabs2" value="<%=tabs2 %>"/>
</portlet:renderURL>

<portlet:actionURL var="publishArtile" name="crud_article">
	<portlet:param name="cmd" value="<%= PortalConstant.ACTION_PUBLISH %>"/>
</portlet:actionURL>

<liferay-ui:error key="portlet.cms.publish-must-select-category" message="Bạn vui lòng chọn chuyên mục trước khi thực hiện xuất bản bài viết!" />

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>" title="action.article.publish" />
<aui:form action="<%= publishArtile %>" method="post" name="fm">
<aui:input name="articleId" type="hidden" value='<%= articleId %>' />
<aui:input name="tabs2" type="hidden" value='<%= tabs2 %>' />
<aui:input name="linkWebService" type="hidden" value='<%= linkWebService %>' />

<aui:row>
	<aui:col width="50">
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset label="portlet.cms.publish.select-category">
			<div style="overflow: auto; height: 250px; border:1px solid">
				<table width="100%">
				<%= ActionUtil.getCategoryTree(groupId, "vi_VN", renderResponse.getNamespace(), "-1", strPortion, categoryIds) %>
				</table>
			</div>
			</aui:fieldset>
		</aui:fieldset-group>
	</aui:col>
	<aui:col width="50">
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset label="portlet.cms.publish.attach-message">
			<div>
				<aui:input label="portlet.cms.article.attached-message" name="message" type="textarea" rows="5" placeholder="portlet.cms.article.input.attached-message"/>
			</div>
			</aui:fieldset>
		</aui:fieldset-group>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col width="50">
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset label="portlet.cms.publish.select-type">
			<div style="overflow: auto; height: 250px; border:1px solid">
			<% for(VcmsType type: listType) { %>
			<aui:row>
				<aui:col><aui:input name="typeId" label="<%=type.getName() %>" type="checkbox" value="<%=type.getTypeId() %>"/></aui:col>			
			</aui:row>
			<% } %>
			</div>
			<div>
				<aui:input name="soundLink" label="portlet.cms.article.soundLink" value="<%= soundLink %>"/>
			</div>
			</aui:fieldset>
		</aui:fieldset-group>
	</aui:col>
	<aui:col width="50">
		<aui:fieldset-group markupView="lexicon">
			<aui:fieldset label="portlet.cms.publish.select-other">
				<aui:row>
					<aui:col>
						<aui:select name="voiceType" label="portlet.cms.article.voicetype" >
							<aui:option value="male-2"><liferay-ui:message key="portlet.cms.article.voice.male-2"/></aui:option>
						    <aui:option value="female-1"><liferay-ui:message key="portlet.cms.article.voice.female-1"/></aui:option>
						</aui:select>
						<aui:input name="sticky" label="portlet.cms.article.sticky" type="checkbox" checked="<%= sticky %>"/>
						<aui:input name="stickyNeverExpired" label="portlet.cms.article.stickyneverexpired" type="checkbox" checked="<%= stickyNeverExpired %>"/>
						<aui:input name="stickyExpireDate" label="portlet.cms.article.stickyexpiredate" value="<%=stickyExpireDate %>"/>
						<aui:input name="discussible" label="portlet.cms.article.discussible" type="checkbox" checked="<%= discussible %>"/>
						<aui:input name="hasPoll" label="portlet.cms.article.haspoll" type="checkbox" checked="<%= hasPoll %>"/>
						<aui:input name="publishedDate" label="portlet.cms.article.publisheddate" value="<%=publishedDate %>"/>
						<aui:input name="effectiveDate" label="portlet.cms.article.effectivedate" value="<%=effectiveDate %>"/>
						<aui:input name="expireDate" label="portlet.cms.article.expiredate" value="<%=expireDate %>"/>
					</aui:col>
				</aui:row>
			</aui:fieldset>
		</aui:fieldset-group>
	</aui:col>
</aui:row>


<aui:button-row >
	<aui:button type="submit" value="action.article.publish" icon="icon-ok-sign" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>

<aui:script>
	AUI().use('aui-datepicker', function(A) {
		var stickyExpireDate =new A.DatePicker({
			trigger : '#<portlet:namespace/>stickyExpireDate',
			popover : {
			zIndex : 1
		},
		 mask: '%d/%m/%Y'
		});
		
		var publishedDate =new A.DatePicker({
			trigger : '#<portlet:namespace/>publishedDate',
			popover : {
			zIndex : 1
		},
		 mask: '%d/%m/%Y'
		});
		
		var effectiveDate =new A.DatePicker({
			trigger : '#<portlet:namespace/>effectiveDate',
			popover : {
			zIndex : 1
		},
		 mask: '%d/%m/%Y'
		});
		
		var expireDate =new A.DatePicker({
			trigger : '#<portlet:namespace/>expireDate',
			popover : {
			zIndex : 1
		},
		 mask: '%d/%m/%Y'
		});
	});	
</aui:script>