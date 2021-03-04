<%@page import="vn.gov.hoabinh.portlet.cms.CmsUtils"%>
<%@page import="com.liferay.portal.kernel.memory.DeleteFileFinalizeAction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.liferay.polls.model.PollsQuestion"%>
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
<%@page import="vn.gov.hoabinh.model.Attachment"%>
<%@page import="vn.gov.hoabinh.service.AttachmentLocalServiceUtil" %>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/cms/init.jsp" %>
<script src="https://cdn.ckeditor.com/4.14.1/standard-all/ckeditor.js"></script>

<%
	String articleId = ParamUtil.getString(request, "articleId", "0");
	String tabs2 = ParamUtil.getString(request, "tabs2","0");
	String selPortionId = ParamUtil.getString(request, "portionId");
	String curCategoryId = ParamUtil.getString(request, "curCategoryId");
	String curPortionName = ParamUtil.getString(request, "curPortion");
	String contentArticle = ParamUtil.getString(request, "contentArticle");
	VcmsArticle article = null;
	VcmsCategory category = null;
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
    String pollId = "0";
    
    String[] strPortion = null;
	String[] strCategory = null;
	String[] categoryIds = null;
	String[] arrCategoryIds = null;
    
	if (!"0".equals(articleId)) {
		article = VcmsArticleLocalServiceUtil.getArticle(articleId);
		sticky = article.getSticky();
		stickyNeverExpired = article.getStickyNeverExpired();
		discussible = article.getDiscussible();
		hasPoll = article.getHasPoll();
		pollId = article.getPollId();
		hasImage = article.getHasImage();
		hasAttach = article.getHasAttachment();
		stickyExpireDate =  Validator.isNotNull(article.getStickyExpireDate()) ? DateUtil.convertDateToString(article.getStickyExpireDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;
		publishedDate = Validator.isNotNull(article.getPublishedDate()) ? DateUtil.convertDateToString(article.getPublishedDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;
		effectiveDate = Validator.isNotNull(article.getEffectiveDate()) ? DateUtil.convertDateToString(article.getEffectiveDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;
		expireDate = Validator.isNotNull(article.getExpireDate()) ? DateUtil.convertDateToString(article.getExpireDate(), DateUtil.DATE_FORMAT_D_M_Y) : StringPool.BLANK;
		statusArticle = String.valueOf(article.getStatus());
		strCategory = Validator.isNotNull(article.getCategoryId()) ? StringUtil.split(article.getCategoryId(),"#") : null;
		if (Validator.isNotNull(strCategory)) {
			arrCategoryIds = StringUtils.removeInvalid(strCategory);
			for (int i=0; i<arrCategoryIds.length; i++) {
				category = VcmsCategoryLocalServiceUtil.getCategory(arrCategoryIds[i]);
				categoryId = category.getCategoryId();
				if (Validator.isNotNull(category)) {
					portionId = category.getPortionId();
					break;
				}
			}
		}
	} else {
		stickyExpireDate = DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y);
		publishedDate = DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y);
		effectiveDate = DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y);
		expireDate = DateUtil.parseDateToString(new Date(), DateUtil.DATE_FORMAT_D_M_Y);
	}
	
	if (Validator.isNotNull(contentArticle) && !"0".equals(articleId)) {
		article.setContent(contentArticle);
	} 
	
	// Get portion selected
	if ((Validator.isNull(curPortionName) || "".equals(curPortionName)) && !"0".equals(articleId)) {
		curCategoryId = article.getCategoryId();
		if (!"".equals(curCategoryId)) {
			String[] arrCatId = StringUtil.split(curCategoryId, "#");
			String curPortionId = "0";
			int inc = 0;
			for (int i = 0; i < arrCatId.length; i++) {
				String catId = arrCatId[i];
				if (!"".equals(catId)) {
					category = VcmsCategoryLocalServiceUtil.getCategory(catId);
					String portId = category.getPortionId();
					if (!"0".equals(portId)) {
						VcmsPortion portion = VcmsPortionLocalServiceUtil.getPortion(portId);
						if (inc == 0) {
							curPortionName = portion.getName();
						} else {
							curPortionName += (!curPortionId.equals(portion.getPortionId())) ? ", " + portion.getName() : "";
						}
						inc++;
						curPortionId = portion.getPortionId();
					}
				}
			}
		}
	}
	
	if (!"0".equals(categoryId)) {
		try {
			category = VcmsCategoryLocalServiceUtil.getCategory(categoryId);
			if (Validator.isNotNull(category)) {
				portionId = category.getPortionId();
			}
		} catch (Exception ex) {
			
		}
	}
	
	portionId = "".equals(selPortionId) ? portionId : selPortionId;
%>

<liferay-ui:success key="portlet.common.action.successfully" message="Yêu cầu của bạn đã được xử lý thành công!"/>
<liferay-ui:error key="portlet.cms.crud-article-must-input-title" message="Bạn vui lòng nhập tiêu đề bài viết!" />

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/cms/view.jsp"/>
	<portlet:param name="tabs1" value="portlet.cms.article" />
</portlet:renderURL>

<portlet:actionURL var="saveArticle" name="crud_article"/>

<portlet:actionURL var="changePortion" name="crud_article"> 
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_CHANGE_PORTION %>"/>
</portlet:actionURL>

<script>
	function <portlet:namespace/>changePortion(plid){
		var form = document.getElementById("<portlet:namespace />fm");
		form.action = '<%= changePortion  %>';
		form.submit();
	}
</script>

<liferay-ui:header backURL="<%=viewURL%>" escapeXml="<%=false%>" title='<%= ("0".equals(articleId)) ? "action.article.add" : "action.article.update"  %>' />
<aui:form action="<%= saveArticle %>" method="post" name="fm" >
<aui:input name="cmd" type="hidden" value='<%= "0".equals(articleId)?"add":"update" %>' />
<aui:input name="articleId" type="hidden" value='<%= articleId %>' />
<aui:input name="hasImage" type="hidden" value='<%= hasImage %>' />
<aui:input name="tabs2" type="hidden" value='<%= tabs2 %>' />
<aui:input name="statusArticle" type="hidden" value='<%= statusArticle %>' />
<aui:input name="curCategoryId" type="hidden" value='<%= curCategoryId %>' />
<aui:row>
	<aui:col width="60">
		<aui:input label="portlet.cms.article.title" name="title" type="textarea" value="<%=(!"0".equals(articleId)?article.getTitle():"")%>" rows="3">
		 	<aui:validator name="required"/>
		 	<aui:validator name="maxLength">500</aui:validator>
		</aui:input>
		<aui:input label="portlet.cms.article.lead" name="lead" type="textarea" value="<%=(!"0".equals(articleId)?article.getLead():"") %>" rows="5" >
		</aui:input>
	</aui:col>
	<aui:col width="40">
		<% if (Validator.isNotNull(curPortionName)) { %>
			<aui:input label="portlet.cms.article.portion.select" name="portionName" type="textarea" value="<%=curPortionName%>" rows="3" disabled="true" >
			</aui:input>
		<% } %>
		<aui:select name="portionId" label="portlet.cms.article.portion" onChange = '<%=renderResponse.getNamespace() + "changePortion()"%>'>
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(VcmsPortion portion:listPortion){ %>
		    <aui:option value="<%=portion.getPortionId()%>" selected="<%=portionId.equals(portion.getPortionId())%>"><%=portion.getName() %></aui:option>
		    <%} %>
		</aui:select>
		<aui:field-wrapper label="portlet.cms.action.select.category" >
			<div style="overflow: auto; height: 250px; border:1px solid">
				<table width="100%">
				<%= ActionUtil.getCategoryTree(groupId, "vi_VN", renderResponse.getNamespace(), portionId, null, arrCategoryIds) %>
				</table>
			</div>
		</aui:field-wrapper>
	</aui:col>
</aui:row>

<%-- <aui:row>
	<aui:col width="60">
	</aui:col>
	<aui:col width="40">
		<aui:select name="categoryId" label="portlet.cms.article.category" >
			<aui:option value="0"><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(VcmsCategory cat:listCategory){ %>
		    <aui:option value="<%=cat.getCategoryId()%>" selected="<%=(categoryId.equals(cat.getCategoryId()))%>"><%=cat.getName() %></aui:option>
		    <%} %>
		</aui:select>
	</aui:col>
</aui:row>
 --%>
<aui:row>
	<aui:col width="60">
		<aui:field-wrapper label="portlet.cms.article.content" >
			<div style="display:none;">
				<liferay-ui:input-editor name="content123" 
					initMethod="initEditor" 
					placeholder="Nhập nội dung bài viết"
					toolbarSet="liferay-article" 
					width="100" 
					height="600" 
					resizable="true" >
				</liferay-ui:input-editor>
			</div>
			<textarea cols="80" id="editor1" name="<portlet:namespace />content" rows="10" data-sample-short>
				<%=(!"0".equals(articleId)?article.getContent():contentArticle)%>
			</textarea>
		</aui:field-wrapper>
	</aui:col>
	<aui:col width="40">
		<aui:input name="sticky" label="portlet.cms.article.sticky" type="checkbox" checked="<%= sticky %>"/>
		<aui:input name="stickyNeverExpired" label="portlet.cms.article.stickyneverexpired" type="checkbox" checked="<%= stickyNeverExpired %>"/>
		<aui:input name="stickyExpireDate" label="portlet.cms.article.stickyexpiredate" value="<%=stickyExpireDate %>"/>
		<aui:input name="discussible" label="portlet.cms.article.discussible" type="checkbox" checked="<%= discussible %>"/>
		<%-- <aui:input name="hasPoll" label="portlet.cms.article.haspoll" type="checkbox" checked="<%= hasPoll %>"/>
		<aui:select name="pollId" label="portlet.cms.article.select-poll" >
			<aui:option value=""><liferay-ui:message key="portlet.common.select"/></aui:option>
			<% for(PollsQuestion question:listPoll) { %>
		    <aui:option value="<%=question.getQuestionId()%>" selected="<%=pollId.equals(String.valueOf(question.getQuestionId()))%>"><%=question.getTitle("vi_VN") %></aui:option>
		    <%} %>
		</aui:select> --%>
		<aui:input name="publishedDate" label="portlet.cms.article.publisheddate" value="<%=publishedDate %>"/>
		<aui:input name="effectiveDate" label="portlet.cms.article.effectivedate" value="<%=effectiveDate %>"/>
		<aui:input name="expireDate" label="portlet.cms.article.expiredate" value="<%=expireDate %>"/>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="60">
		<aui:input label="portlet.cms.article.author" name="author" value="<%=(!"0".equals(articleId)?article.getAuthor():"")%>">
			<aui:validator name="maxLength">500</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<aui:row>
	<aui:col width="60">
		<aui:input label="portlet.cms.article.source" name="source" value="<%=(!"0".equals(articleId)?article.getSource():"")%>">
			<aui:validator name="maxLength">500</aui:validator>
		</aui:input>
	</aui:col>
</aui:row>

<portlet:actionURL var="deleteImageURL" name="crud_article">
	<portlet:param name="jspPage" value="/cms/edit_article.jsp" />
	<portlet:param name="cmd" value="<%=PortalConstant.ACTION_DELETE_IMAGE %>" />
	<portlet:param name="articleId" value="<%=articleId%>" />
</portlet:actionURL>

<aui:row>
	<% if(!hasImage){ %>
	<aui:col width="60">
		<aui:input label="image" name="image" type="file" >
			<aui:validator name="acceptFiles">'bmp,gif,jpg,png'</aui:validator>			
		</aui:input>
		<aui:input label="portlet.cms.article.image.title" name="imageTitle" value="<%=(!"0".equals(articleId)?article.getImageTitle():"") %>">
			<aui:validator name="maxLength">500</aui:validator>			
		</aui:input>
	</aui:col>
	<%} %>
	
	<% if (hasImage){ %>
	<aui:col width="60">
		<div>
			<img alt="<%=article.getImageTitle() %>" style="width:300px;" src="<%=article.getImage()%>" />
			<liferay-ui:icon image="delete" url="<%=deleteImageURL%>" />
		</div>
		<aui:input label="portlet.cms.article.image.title" name="imageTitle" value="<%=(!"0".equals(articleId)?article.getImageTitle():"") %>">
			<aui:validator name="maxLength">500</aui:validator>			
		</aui:input>
	</aui:col>
	<% } %>	
</aui:row>

<% if (!hasAttach) { %>
<aui:row>
	<aui:col colspan="2">
		<div>
			<table id="tb-xacminh">
			<thead>
				<tr>
					<th class=""><liferay-ui:message key="portlet.common.stt" /></th>
					<th class=""><liferay-ui:message key="portlet.common.attach" /></th>
					<th class=""><liferay-ui:message key="portlet.common.filename" /></th>
					<th class=""><aui:button type="button" value="add" onclick="addNewRow('tb-xacminh');" /></th>
				</tr>
			</thead>
			<tr suffix=0>
				<td>1</td>
				<td>
					<input type="file" id="attachment0" name="attachment" multiple="multiple" onchange="showFileName(0)" />
				</td>
				<td><ul id="fileNamesUL0"></ul></td>
				<td>&nbsp;</td>
			</tr>
			</table>
		</div>		
	</aui:col>
</aui:row>
<% } %>

<% 	if (hasAttach) { %>
<aui:row>
	<aui:col colspan="2">
		<ul>
			<% List<Attachment> listAttachment = AttachmentLocalServiceUtil.getAttachmentByE_E_I(Long.parseLong(articleId), VcmsArticle.class, 0);
				for(Attachment attachment:listAttachment) {
					long fileEntryId = attachment.getFileEntryId();
					FileEntry fileEntry = DLAppServiceUtil.getFileEntry(fileEntryId);
					String url = DLUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, "");
			%>
				<portlet:actionURL var="deleteFileURL" name="crud_article">
					<portlet:param name="jspPage" value="/cms/edit_article.jsp" />
					<portlet:param name="cmd" value="<%=PortalConstant.ACTION_DELETE_FILE %>" />
					<portlet:param name="articleId" value="<%=articleId%>" />
					<portlet:param name="fileEntryId" value="<%=String.valueOf(attachment.getFileEntryId())%>" />
				</portlet:actionURL>
				<li>
					<img alt="<%=attachment.getFileName() %>" src="<%=PortalConstant.SRC_IMAGE+"/file_system/small/"+attachment.getExtension()+".png"%>" />
					<a href="<%=url%>"><%=attachment.getFileName() %></a>
					<liferay-ui:icon image="delete" url="<%=deleteFileURL%>" />
				</li>
			<% } %>
		</ul>
	</aui:col>
</aui:row>
<% } %>

<script>  
  CKEDITOR.replace('editor1', {
    toolbar: [
      {
        name: 'clipboard',
        items: ['Undo', 'Redo']
      },
      {
        name: 'styles',
        items: ['Format', 'Font', 'FontSize']
      },
      {
        name: 'colors',
        items: ['TextColor', 'BGColor']
      },
      {
        name: 'align',
        items: ['JustifyLeft', 'JustifyCenter', 'JustifyRight', 'JustifyBlock']
      },
      '/',
      {
        name: 'basicstyles',
        items: ['Bold', 'Italic', 'Underline', 'Strike', 'RemoveFormat', 'CopyFormatting']
      },
      {
        name: 'links',
        items: ['Link', 'Unlink']
      },
      {
        name: 'paragraph',
        items: ['NumberedList', 'BulletedList', '-', 'Outdent', 'Indent', '-', 'Blockquote']
      },
      {
        name: 'insert',
        items: ['Image', 'Table']
      },
      {
        name: 'tools',
        items: ['Maximize']
      },
      {
        name: 'editing',
        items: ['Scayt']
      }
    ],

    // Adding drag and drop image upload.
    extraPlugins: 'print,format,font,colorbutton,justify,uploadimage',
    uploadUrl: '/apps/ckfinder/3.4.5/core/connector/php/connector.php?command=QuickUpload&type=Files&responseType=json',

    // Configure your file manager integration. This example uses CKFinder 3 for PHP.
    filebrowserBrowseUrl: '/group/guest/~/control_panel/manage?p_p_id=com_liferay_item_selector_web_portlet_ItemSelectorPortlet&p_p_lifecycle=0&p_p_state=pop_up&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_com_liferay_item_selector_web_portlet_ItemSelectorPortlet_0_json=%7B"desiredItemSelectorReturnTypes"%3A"com.liferay.item.selector.criteria.URLItemSelectorReturnType"%7D&_com_liferay_item_selector_web_portlet_ItemSelectorPortlet_criteria=com.liferay.item.selector.criteria.image.criterion.ImageItemSelectorCriterion%2Ccom.liferay.item.selector.criteria.url.criterion.URLItemSelectorCriterion&_com_liferay_item_selector_web_portlet_ItemSelectorPortlet_itemSelectedEventName=_vn_gov_hoabinh_cms_contentselectItem&_com_liferay_item_selector_web_portlet_ItemSelectorPortlet_1_json=%7B"desiredItemSelectorReturnTypes"%3A"com.liferay.item.selector.criteria.URLItemSelectorReturnType"%7D',
    filebrowserImageBrowseUrl: '/group/guest/~/control_panel/manage?p_p_id=com_liferay_item_selector_web_portlet_ItemSelectorPortlet&p_p_lifecycle=0&p_p_state=pop_up&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_com_liferay_item_selector_web_portlet_ItemSelectorPortlet_0_json=%7B"desiredItemSelectorReturnTypes"%3A"com.liferay.item.selector.criteria.URLItemSelectorReturnType"%7D&_com_liferay_item_selector_web_portlet_ItemSelectorPortlet_criteria=com.liferay.item.selector.criteria.image.criterion.ImageItemSelectorCriterion%2Ccom.liferay.item.selector.criteria.url.criterion.URLItemSelectorCriterion&_com_liferay_item_selector_web_portlet_ItemSelectorPortlet_itemSelectedEventName=_vn_gov_hoabinh_cms_contentselectItem&_com_liferay_item_selector_web_portlet_ItemSelectorPortlet_1_json=%7B"desiredItemSelectorReturnTypes"%3A"com.liferay.item.selector.criteria.URLItemSelectorReturnType"%7D',
    filebrowserUploadUrl: '/apps/ckfinder/3.4.5/core/connector/php/connector.php?command=QuickUpload&type=Files',
    filebrowserImageUploadUrl: '/apps/ckfinder/3.4.5/core/connector/php/connector.php?command=QuickUpload&type=Images',

    height: 400,

    removeDialogTabs: 'image:advanced;link:advanced'
  });
</script>

<!-- <aui:script>
	function <portlet:namespace/>initEditor() {
		var contentValue = "<%=(!"0".equals(articleId)?UnicodeFormatter.toString(article.getContent()):"")%>";
		return contentValue;
	}
</aui:script> -->

<aui:button-row >
	<aui:button name="save" type="submit" value="save" />
	<aui:button type="cancel" value="cancel" href="<%=viewURL %>"/>
</aui:button-row>
</aui:form>

<aui:script>
	/* function <portlet:namespace/>initEditor() {
		var contentValue = "<%=(!"0".equals(articleId)?UnicodeFormatter.toString(article.getContent()):UnicodeFormatter.toString(contentArticle))%>";
		return contentValue;
	} */
	
	/* $(document).ready(function(){
		document.getElementById('<portlet:namespace/>portionId').disabled = "true";
		var title = $("#<portlet:namespace />title").val();
	    if (title!='') {
	    	document.getElementById('<portlet:namespace/>portionId').disabled = "false";
	    }
	}); */
	
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

<script type="text/javascript">
    function toggleEndDate() {
        if (document.getElementById('endDateToggle').checked) {
            document.getElementById('endDateShown').style.display = 'none';
            document.getElementById('<portlet:namespace/>endDate').disabled = 
                "true";
        } else {
            document.getElementById('endDateShown').style.display = 'block';
            document.getElementById('<portlet:namespace/>endDate').disabled = "";
        }
    }
</script>
<aui:script>
    AUI().use(
        'aui-datepicker', 
        'datatype-date', 
        'datatype-date-math', 
        'datatype-date-parse',
        function(A) {
            var toDatePicker;
            var fromDatePicker = new A.DatePicker({
                trigger: '#<portlet:namespace />startDate',
                mask: '%d-%m-%Y',
                popover: {
                    zIndex: 1000
                },
                on: {
                    selectionChange: function(event) {
                        if (event.newSelection[0]) {
                            var oldToValue = A.Date.parse("%d-%m-%Y", 
                                document.getElementById(
                                    "<portlet:namespace />endDate").value);
                            toDatePicker.getCalendar().set('minimumDate', 
                                event.newSelection[0]);
                            if (A.Date.isGreater(event.newSelection[0], 
                                    oldToValue)) {
                                document.getElementById(
                                    "<portlet:namespace />endDate").value = 
                                    A.Date.format(event.newSelection[0], 
                                        {format: "%d-%m-%Y"});
                            }
                        }
                    }
                },
                calendar: {
                    minimumDate: new Date()
                }
            });

            toDatePicker = new A.DatePicker({
                trigger: '#<portlet:namespace />endDate',
                mask: '%d-%m-%Y',
                popover: {
                    zIndex: 1000
                },
                calendar: {
                    minimumDate: new Date()
                }
            });
        }
    );
  </aui:script>