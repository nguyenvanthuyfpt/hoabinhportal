package vn.gov.hoabinh.portlet.cms;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletPreferences;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.util.DLUtil;
import com.liferay.polls.model.PollsQuestion;
import com.liferay.polls.service.PollsQuestionLocalServiceUtil;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.FileItem;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnicodeFormatter;
import com.liferay.portal.kernel.util.Validator;

import vn.gov.hoabinh.business.RssServices;
import vn.gov.hoabinh.model.Attachment;
import vn.gov.hoabinh.model.VcmsArticle;
import vn.gov.hoabinh.model.VcmsCategory;
import vn.gov.hoabinh.model.VcmsPortion;
import vn.gov.hoabinh.model.VcmsStatus;
import vn.gov.hoabinh.rss.FeedMessage;
import vn.gov.hoabinh.service.AttachmentLocalServiceUtil;
import vn.gov.hoabinh.service.DataConvertLocalServiceUtil;
import vn.gov.hoabinh.service.VcmsArticleLocalService;
import vn.gov.hoabinh.service.VcmsArticleLocalServiceUtil;
import vn.gov.hoabinh.service.VcmsAttachedMessageLocalService;
import vn.gov.hoabinh.service.VcmsCategoryLocalService;
import vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil;
import vn.gov.hoabinh.service.VcmsPortionLocalServiceUtil;
import vn.gov.hoabinh.service.VcmsStatusLocalServiceUtil;
import vn.gov.hoabinh.util.ActionUtil;
import vn.gov.hoabinh.util.DataConvertUtil;
import vn.gov.hoabinh.util.DateUtil;
import vn.gov.hoabinh.util.ListUtils;
import vn.gov.hoabinh.util.PortalConstant;
import vn.gov.hoabinh.util.SoundUtil;
import vn.gov.hoabinh.util.StringUtils;
import vn.gov.hoabinh.util.UploadFileUtils;
import vn.gov.hoabinh.util.UploadFileUtilsBak;

@Component(
		property = { 
				"javax.portlet.name=vn_gov_hoabinh_cms",
				"mvc.command.name=crud_article" }, 
		service = MVCActionCommand.class
)
public class ArticleActionCommand extends BaseMVCActionCommand {	
	Log log = LogFactoryUtil.getLog(this.getClass());
	
	VcmsArticleLocalService articleService;
	VcmsCategoryLocalService categoryService;
	VcmsAttachedMessageLocalService attachedMessageService;

	@Reference(unbind = "-")
	public void setCategoryService(VcmsCategoryLocalService categoryService) {
		this.categoryService = categoryService;
	}
	
	@Reference(unbind = "-")
	public void setArticleService(VcmsArticleLocalService articleService) {
		this.articleService = articleService;
	}
	
	@Reference(unbind = "-")
	public void setAttachedMessageService(VcmsAttachedMessageLocalService attachedMessageService) {
		this.attachedMessageService = attachedMessageService;
	}

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		ServiceContext serviceContext = ServiceContextFactory.getInstance(VcmsArticle.class.getName(), actionRequest);
		ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();
		
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		
		long groupId = serviceContext.getScopeGroupId();
		long companyId = serviceContext.getCompanyId();
		long plid = serviceContext.getPlid();
		long userId = serviceContext.getUserId();
		VcmsArticle article = null;
		String cmd = ParamUtil.getString(actionRequest, "cmd");
		String language = PortalConstant.DEFAULT_LANGUAGE;
		String tabs2 = ParamUtil.getString(actionRequest, "tabs2", "0");
		String linkWebService = ParamUtil.getString(actionRequest, "linkWebService", PortalConstant.URL_SOUND_LIVE);
		
		String articleId = ParamUtil.getString(actionRequest, "articleId", "0");
		String articleIds = ParamUtil.getString(actionRequest, "articleIds");
		
		String portionId = ParamUtil.getString(actionRequest, "portionId");
		String categoryId = ParamUtil.getString(actionRequest, "categoryId", "0");
		String[] categoryIds = actionRequest.getParameterValues("category");
		String title = ParamUtil.getString(actionRequest, "title");
		String lead = ParamUtil.getString(actionRequest, "lead");
		String content = ParamUtil.getString(actionRequest, "content");
		
		boolean hasImage = ParamUtil.getBoolean(actionRequest, "hasImage", false);
		String imageTitle = ParamUtil.getString(actionRequest, "imageTitle");
		boolean hasAttachment = false;
		boolean hasPoll = ParamUtil.getBoolean(actionRequest, "hasPoll", false);
		String pollId = ParamUtil.getString(actionRequest, "pollId", "0");
		long statusArticle = ParamUtil.getLong(actionRequest, "statusArticle", 0);
		String author = ParamUtil.getString(actionRequest, "author");
		String source = ParamUtil.getString(actionRequest, "source");
		
		boolean discussible = ParamUtil.getBoolean(actionRequest, "discussible", false);
		boolean sticky = ParamUtil.getBoolean(actionRequest, "sticky", false);
		boolean stickyNeverExpired = ParamUtil.getBoolean(actionRequest, "stickyNeverExpired", false);
		Date createdDate = new Date();
		
		String currentUserId = String.valueOf(themeDisplay.getUserId());
		String stickyExpireDate = ParamUtil.getString(actionRequest, "stickyExpireDate");
		String publishedDate = ParamUtil.getString(actionRequest, "publishedDate");
		String effectiveDate = ParamUtil.getString(actionRequest, "effectiveDate");
		String expireDate = ParamUtil.getString(actionRequest, "expireDate");
		String voiceType = ParamUtil.getString(actionRequest, "voiceType");
		String soundLink = "";
		
		Date dateStickyExpire = DateUtil.parseStringToDate(stickyExpireDate, DateUtil.DATE_FORMAT_D_M_Y);
		Date datePublished = Validator.isNotNull(publishedDate) ? DateUtil.parseStringToDate(publishedDate, DateUtil.DATE_FORMAT_D_M_Y) : new Date();
		Date dateEffective = Validator.isNotNull(effectiveDate) ? DateUtil.parseStringToDate(effectiveDate, DateUtil.DATE_FORMAT_D_M_Y) : null;
		Date dateExpire = Validator.isNotNull(expireDate) ? DateUtil.parseStringToDate(expireDate, DateUtil.DATE_FORMAT_D_M_Y) : null;
		
		String curPortion = "";
		String curCategoryId = "";
		if (!"0".equals(articleId) && !PortalConstant.ACTION_APPROVES.equals(cmd)) {
			curPortion = getCurPortion(articleId);
			article = articleService.getArticle(articleId);
			curCategoryId = article.getCategoryId();
		}
		
		actionResponse.setRenderParameter("contentArticle", content);
		actionResponse.setRenderParameter("curPortion", curPortion);
		actionResponse.setRenderParameter("curCategoryId", curCategoryId);
		
		try {
			if (PortalConstant.ACTION_ADD.equals(cmd)) {
				if (Validator.isNull(title) || "".equals(title)) {
					SessionErrors.add(actionRequest, "portlet.cms.crud-article-must-input-title");
					actionResponse.setRenderParameter("jspPage", "/cms/edit_article.jsp");
				} else {
					article = articleService.addArticle(groupId, companyId, String.valueOf(userId), plid, title, lead, content, hasImage, null, null,
							language, hasAttachment, hasPoll, pollId, statusArticle, author, source, "#"+DataConvertUtil.convertStringArrayToString(categoryIds, "#")+"#");
					articleId = article.getArticleId();
					actionResponse.setRenderParameter("jspPage", "/cms/edit_article.jsp");
				}
			} else if (PortalConstant.ACTION_UPDATE.equals(cmd)) {
				article = articleService.getArticle(articleId);
				String selCategoryId = DataConvertUtil.convertStringArrayToString(categoryIds, "#");
				String saveCategoryId = "";
				List<String> listCurCategoryId = null;
				List<String> listSelCategoryId = null;
				if (Validator.isNotNull(curCategoryId) && !"".equals(curCategoryId)) {
					listCurCategoryId = new ArrayList<String>(Arrays.asList(curCategoryId.split("#")));
					listCurCategoryId = ListUtils.removeElementByValue(listCurCategoryId, "");
					if (!"".equals(selCategoryId)) {
						listSelCategoryId = new ArrayList<String>(Arrays.asList(selCategoryId.split("#")));
						listSelCategoryId = ListUtils.removeElementByValue(listSelCategoryId, "");
						if (Validator.isNotNull(listSelCategoryId) && listSelCategoryId.size()>0) {
							for (String catId : listSelCategoryId) {
								listCurCategoryId.add(catId);
							}
						}
						ListUtils.removeDuplicate(listCurCategoryId);
						saveCategoryId = String.join("#", listCurCategoryId);
					}
				}
				
				List<Attachment> listFile = AttachmentLocalServiceUtil.getAttachmentByE_E_I(Long.parseLong(articleId), VcmsArticle.class, 0);
				if (Validator.isNotNull(listFile) && listFile.size()>0) {
					hasAttachment = true;
				}
				
				article = articleService.updateArticle(groupId, companyId, String.valueOf(userId), articleId, statusArticle, title, lead, content, author,
						source, hasImage, null, null, language, discussible, hasAttachment, hasPoll, pollId,
						sticky, stickyNeverExpired, createdDate, dateStickyExpire, datePublished, dateEffective,
						dateExpire, saveCategoryId, soundLink);
				
				actionResponse.setRenderParameter("articleId", articleId);
				actionResponse.setRenderParameter("jspPage", "/cms/edit_article.jsp");	
			} else if (PortalConstant.ACTION_GET_SOUND.equals(cmd)) {
				article = articleService.getArticle(articleId);
				File file = SoundUtil.getFileSound(article);
				if (Validator.isNotNull(file)) {
					byte[] imageBytes = FileUtil.getBytes(file);
					InputStream is = new ByteArrayInputStream(imageBytes);
					FileEntry fileEntry = DLAppServiceUtil.addFileEntry(themeDisplay.getScopeGroupId(),
							167926, title, MimeTypesUtil.getContentType(file), title, title,
							StringPool.BLANK, is, file.length(), serviceContext);
				}
				
			} else if (PortalConstant.ACTION_SYNC_RSS.equals(cmd)) {
				String rssURL = ParamUtil.getString(actionRequest, "rssURL");
				List<FeedMessage> listMessage = RssServices.syncArticle(rssURL);
				categoryIds = new String[1];
				categoryIds[0] = categoryId;
				statusArticle = 0;
				if (Validator.isNotNull(listMessage) && listMessage.size()>0) {
					for(FeedMessage message:listMessage) {
						articleService.addArticle(groupId, companyId, String.valueOf(userId), plid, message.getTitle(), message.getTitle(), message.getTitle(), hasImage, null, null,
						language, hasAttachment, hasPoll, pollId, statusArticle, message.getAuthor(), message.getLink(), "#"+DataConvertUtil.convertStringArrayToString(categoryIds, "#")+"#");
					}
				}
			} else if (PortalConstant.ACTION_DELETE.equals(cmd)) {
				articleService.deleteArticle(articleId);
				AttachmentLocalServiceUtil.deleteAttachments(VcmsArticle.class, Long.parseLong(articleId));
			} else if (PortalConstant.ACTION_APPROVES.equals(cmd)) {
				long statusId = 0;
				int position = 0;
				if(Validator.isNotNull(articleIds)) {
					String[] ids = StringUtil.split(articleIds, StringPool.COMMA);
					for (int i = 0; i < ids.length; i++) {
						articleId = ids[i];
						if (Validator.isNumber(articleId)) {
							VcmsStatus status = null;
							if (Validator.isNumber(tabs2)) {
								if ("0".equals(tabs2)) {
									status = VcmsStatusLocalServiceUtil.getByC_G_P_A(1, groupId, true, false);
									statusId = status.getStatusId();
								} else {
									status = VcmsStatusLocalServiceUtil.getVcmsStatus(Long.parseLong(tabs2));
									position = status.getPosition();
									status = VcmsStatusLocalServiceUtil.getByG_Pos(groupId, position+1);
									statusId = status.getStatusId();
								}					
							}
							
							if (VcmsStatusLocalServiceUtil.isStatusPublisher(statusId)) {
								article = articleService.getArticle(articleId);
								article.setStatus(statusId);
								article.setModifiedDate(new Date());
								article.setModifiedByUser(currentUserId);
								article.setPublishedDate(new Date());
								article.setPublishedByUser(currentUserId);
							} else {
								article = articleService.getArticle(articleId);
								article.setStatus(statusId);
								article.setModifiedDate(new Date());
								article.setModifiedByUser(currentUserId);
								article.setApprovedDate(new Date());
								article.setApprovedByUser(currentUserId);
							}
							articleService.updateVcmsArticle(article);
						}
					}
				}
				
				actionResponse.setRenderParameter("tabs1", "portlet.cms.article");
				actionResponse.setRenderParameter("tabs2", tabs2);
				actionResponse.setRenderParameter("jspPage", "/cms/view.jsp");
			} else if (PortalConstant.ACTION_APPROVE.equals(cmd)) {
				long statusId = 0;
				int position = 0;
				VcmsStatus status = null;
				if (Validator.isNumber(tabs2)) {
					if ("0".equals(tabs2)) {
						status = VcmsStatusLocalServiceUtil.getByC_G_P_A(1, groupId, true, false);
						statusId = status.getStatusId();
					} else {
						status = VcmsStatusLocalServiceUtil.getVcmsStatus(Long.parseLong(tabs2));
						position = status.getPosition();
						status = VcmsStatusLocalServiceUtil.getByG_Pos(groupId, position+1);
						statusId = status.getStatusId();
					}					
				}
				article = articleService.getArticle(articleId);
				article.setStatus(statusId);
				article.setModifiedDate(new Date());
				article.setModifiedByUser(currentUserId);
				article.setApprovedDate(new Date());
				article.setApprovedByUser(currentUserId);
				articleService.updateVcmsArticle(article);
				SessionMessages.add(actionRequest, "portlet.common.action.successfully");
				actionResponse.setRenderParameter("tabs1", "portlet.cms.article");
				actionResponse.setRenderParameter("tabs2", tabs2);
				actionResponse.setRenderParameter("jspPage", "/cms/view.jsp");
				SessionMessages.add(actionRequest, "entryDeleted");
			} else if (PortalConstant.ACTION_CANCEL_APPROVE.equals(cmd)) {
				long statusId = 0;
				int position = 0;
				VcmsStatus status = null;
				if (Validator.isNumber(tabs2)) {
					status = VcmsStatusLocalServiceUtil.getVcmsStatus(Long.parseLong(tabs2));
					position = status.getPosition();
					if (position>1) {
						status = VcmsStatusLocalServiceUtil.getByG_Pos(groupId, position-1);
						statusId = status.getStatusId();
					} else {
						statusId = 0;
					}
				}
				cancelArticle(cmd, articleId, statusId, currentUserId);
			} else if (PortalConstant.ACTION_PUBLISH.equals(cmd)) {
				VcmsStatus status = VcmsStatusLocalServiceUtil.getByC_G_A(1, groupId, true);
				long statusId = status.getStatusId();
 				article = articleService.getArticle(articleId);
				article.setStatus(statusId);
				
				if (Validator.isNull(categoryIds) || "".equals(categoryIds)) {
					SessionErrors.add(actionRequest, "portlet.cms.publish-must-select-category");
					actionResponse.setRenderParameter("jspPage", "/cms/publish_article.jsp");
				} else {
				
					article.setCategoryId("#"+DataConvertUtil.convertStringArrayToString(categoryIds, "#")+"#");
					article.setPublishedByUser(currentUserId);
					
					article.setSoundLink(soundLink);
					article.setStickyExpireDate(dateStickyExpire);
					article.setPublishedDate(datePublished);
					article.setEffectiveDate(dateEffective);
					article.setExpireDate(dateExpire);
					
					article.setDiscussible(discussible);
					article.setSticky(sticky);
					article.setStickyNeverExpired(stickyNeverExpired);
					article.setHasPoll(hasPoll);
					article.setPollId(hasPoll?pollId:null);
					
					
					articleService.updateArticle(article);
					SessionMessages.add(actionRequest, "portlet.common.action.successfully");
					actionResponse.setRenderParameter("tabs1", "portlet.cms.article");
					actionResponse.setRenderParameter("tabs2", tabs2);
					actionResponse.setRenderParameter("jspPage", "/cms/view.jsp");
				}
			} else if (PortalConstant.ACTION_CANCEL_PUBLISH.equals(cmd)) {
				article = articleService.getArticle(articleId);
				String message = ParamUtil.getString(actionRequest, "message");
				attachedMessageService.addAttachedMessage(groupId, currentUserId, articleId, message);
				long statusId = 0;
				cancelArticle(cmd, articleId, statusId, currentUserId);
				SessionMessages.add(actionRequest, "portlet.common.action.successfully");
				actionResponse.setRenderParameter("tabs1", "portlet.cms.article");
				actionResponse.setRenderParameter("tabs2", tabs2);
				actionResponse.setRenderParameter("jspPage", "/cms/view.jsp");
			} else if (PortalConstant.ACTION_SEARCH.equals(cmd)) {
				String keyword = ParamUtil.getString(actionRequest, "keyword", StringPool.BLANK);
				String isTitle = ParamUtil.getString(actionRequest, "isTitle");
				String isLead = ParamUtil.getString(actionRequest, "isLead");
				String isContent = ParamUtil.getString(actionRequest, "isContent");
				String searchBy = ParamUtil.getString(actionRequest, "searchBy");
				String isFromTo = ParamUtil.getString(actionRequest, "isFromTo");
				
				String fromDate = ParamUtil.getString(actionRequest, "fromDate");
				String toDate = ParamUtil.getString(actionRequest, "toDate");
				
				actionResponse.setRenderParameter("portionId", portionId);
				actionResponse.setRenderParameter("categoryId", categoryId);
				actionResponse.setRenderParameter("keyword", keyword);
				
				actionResponse.setRenderParameter("isTitle", isTitle);
				actionResponse.setRenderParameter("isLead", isLead);
				actionResponse.setRenderParameter("isContent", isContent);
				actionResponse.setRenderParameter("searchBy", searchBy);
				actionResponse.setRenderParameter("search", "true");
				
				actionResponse.setRenderParameter("isFromTo", isFromTo);
				actionResponse.setRenderParameter("fromDate", fromDate);
				actionResponse.setRenderParameter("toDate", toDate);
				
				actionResponse.setRenderParameter("tabs1", "portlet.cms.article");
				actionResponse.setRenderParameter("tabs2", tabs2);
				actionResponse.setRenderParameter("jspPage", "/cms/view.jsp");
			} else if (PortalConstant.ACTION_CHANGE_PORTION.equals(cmd)) {
				actionResponse.setRenderParameter("portionId", portionId);
				actionResponse.setRenderParameter("jspPage", "/cms/edit_article.jsp");
				sendRedirect(actionRequest, actionResponse);
				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			} else if (PortalConstant.ACTION_SYNC.equals(cmd)) {
				log.info("BEGIN::ACTION_SYNC");
				long repositoryId = 20147;
				long folderId = 786225;
				groupId = 20147;
				
				//String keyword = ParamUtil.getString(actionRequest, "keyword");
				//log.info("keyword " + keyword);
				//folderId = "".equals(keyword) ? 0 : Long.parseLong(keyword);
				//log.info("folderId " + folderId);
				List<FileEntry> listFiles = DLAppServiceUtil.getFileEntries(repositoryId, folderId);
				if (Validator.isNotNull(listFiles) && listFiles.size()>0) {
					int inc = 0;
					for (FileEntry fileEntry: listFiles) {
						//if (fileEntry.getCreateDate().after(new Date())) {
							inc++;
							String fileName = fileEntry.getFileName();
							String urlAbsolute = DLUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, "", true, true);
							String dataId = fileName.substring(0, fileName.indexOf("_")); 
							DataConvertLocalServiceUtil.addData(dataId, folderId, groupId, fileEntry.getFileEntryId(), fileName, urlAbsolute.replace(themeDisplay.getPortalURL(), ""));
						//}
					}
					log.info("BEGIN::ACTION_SYNC" + inc);
				}
				
				log.info("END::ACTION_SYNC");
				SessionMessages.add(actionRequest, "portlet.common.action.successfully");
				actionResponse.setRenderParameter("tabs1", "portlet.cms.article");
				actionResponse.setRenderParameter("tabs2", tabs2);
				actionResponse.setRenderParameter("jspPage", "/cms/view.jsp");
			} else if (PortalConstant.ACTION_VIEW_DETAIL_MESSAGE.equals(cmd)) {
				String messageId = ParamUtil.getString(actionRequest, "messageId");
				attachedMessageService.updateAttachedMessage(messageId, true);
				actionResponse.setRenderParameter("articleId", articleId);
				actionResponse.setRenderParameter("messageId", messageId);
				actionResponse.setRenderParameter("jspPage", "/cms/view_message.jsp");
				sendRedirect(actionRequest, actionResponse);
			} else if (PortalConstant.ACTION_DELETE_IMAGE.equals(cmd) || PortalConstant.ACTION_DELETE_FILE.equals(cmd)) {
				long entryId = Long.parseLong(articleId);
				long imageId = PortalConstant.ACTION_DELETE_IMAGE.equals(cmd) ? entryId : 0;
				long fileEntryId = ParamUtil.getLong(actionRequest, "fileEntryId");
				List<Attachment> listAttach = null;
				if (imageId == 0) { // Delete file
					AttachmentLocalServiceUtil.deleteAttachment(VcmsArticle.class, entryId, fileEntryId, false, false);
					listAttach = AttachmentLocalServiceUtil.getAttachmentByE_E_I(entryId, VcmsArticle.class, imageId);
					if (Validator.isNull(listAttach) || listAttach.size() == 0) {
						article = articleService.getArticle(articleId);
						article.setHasAttachment(false);
						articleService.updateVcmsArticle(article);
					}
				} else { // Delete image
					AttachmentLocalServiceUtil.deleteAttachment(VcmsArticle.class, entryId, fileEntryId, true, false);
					article = articleService.getArticle(articleId);
					article.setImage("");
					article.setHasImage(false);
					articleService.updateVcmsArticle(article);
				}
				
				//System.out.println("deleteAttachment " + fileEntryId);				
				actionResponse.setRenderParameter("articleId", articleId);
				actionResponse.setRenderParameter("jspPage", "/cms/edit_article.jsp");
				SessionMessages.add(actionRequest, "portlet.common.action.successfully");
			} else if (PortalConstant.ACTION_SELECT_QUESTION.equals(cmd)) {
				long questionId = ParamUtil.getLong(actionRequest, "questionId");
				article = articleService.getArticle(articleId);
				PollsQuestion pollQuestion = PollsQuestionLocalServiceUtil.getQuestion(questionId);
				article.setPollId(String.valueOf(pollQuestion.getPrimaryKey()));
				article.setHasPoll(true);
				articleService.updateVcmsArticle(article);
				actionResponse.setRenderParameter("articleId", articleId);
				actionResponse.setRenderParameter("jspPage", "/cms/publish_article.jsp");
				sendRedirect(actionRequest, actionResponse);
				SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			} else if (PortalConstant.ACTION_SELECT_PUBLISH_DATE.equals(cmd)) {
				String hours = ParamUtil.getString(actionRequest, "hours");
				String minutes = ParamUtil.getString(actionRequest, "minutes");
				String dates = ParamUtil.getString(actionRequest, "publishedDate");
				
				Date publishDate = DateUtil.parseStringToDate(dates +" "+ hours + ":"+ minutes+":59", DateUtil.DATE_FORMAT_D_M_Y_H_M_S);
				article = articleService.getArticle(articleId);
				article.setPublishedDate(publishDate);
				articleService.updateVcmsArticle(article);
				SessionMessages.add(actionRequest, "portlet.common.action.successfully");
				actionResponse.setRenderParameter("tabs1", "portlet.cms.article");
				actionResponse.setRenderParameter("tabs2", tabs2);
				actionResponse.setRenderParameter("jspPage", "/cms/view.jsp");
			}
			
			Map<String, FileItem[]> files = uploadRequest.getMultipartParameterMap();
			Object[] arrKey = files.keySet().toArray();
			
			// Process attachment
			String imageSrc = "";
			if (PortalConstant.ACTION_ADD.equals(cmd) || PortalConstant.ACTION_UPDATE.equals(cmd)) {
				imageSrc = "";
				
				// Upload image
				if (!hasImage) {
					List<FileEntry> listImages = UploadFileUtils.upload(uploadRequest, actionRequest, 0, userId, "image");
					if (Validator.isNotNull(listImages) && listImages.size() > 0) {
						for (FileEntry fileEntry : listImages) {
							imageSrc = "/documents/"+fileEntry.getGroupId()+"/"+fileEntry.getFolderId()+"/"+fileEntry.getFileName()+"/"+fileEntry.getUuid()+"?version="+fileEntry.getVersion();
							AttachmentLocalServiceUtil.addAttachment(fileEntry, companyId, groupId, Long.parseLong(articleId), VcmsArticle.class, 
									fileEntry.getFolderId(), fileEntry.getFileName(), true);
						}      
						article = VcmsArticleLocalServiceUtil.getArticle(articleId);
					}
				} else {
					imageSrc = article.getImage();
				}
				VcmsArticleLocalServiceUtil.updateImage(articleId, imageSrc, imageTitle);
				
				
				// Upload attachment
				if (!hasAttachment) {
					List<FileEntry> listFiles = UploadFileUtils.upload(uploadRequest, actionRequest, 0, userId, "attachment");
					if (Validator.isNotNull(listFiles) && listFiles.size() > 0) {
						for (FileEntry fileEntry : listFiles) {
							String download = DLUtil.getDownloadURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, "");
							AttachmentLocalServiceUtil.addAttachment(fileEntry, companyId, groupId, Long.parseLong(articleId), 
									VcmsArticle.class, fileEntry.getFolderId(), fileEntry.getFileName(), false);
						}
						hasAttachment = true;
						VcmsArticleLocalServiceUtil.updateAttachment(articleId, hasAttachment);
					}
				}
				
				SessionMessages.add(actionRequest, "portlet.common.action.successfully");
				actionResponse.setRenderParameter("tabs1", "portlet.cms.article");
				actionResponse.setRenderParameter("tabs2", tabs2);
				actionResponse.setRenderParameter("jspPage", "/cms/view.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
			actionResponse.setRenderParameter("mvcPath","/cms/view.jsp");
		}
	}
	
	public void cancelArticle (String cmd, String articleId, long statusId, String currentUserId) throws Exception {
		VcmsArticle article = articleService.getArticle(articleId);
		if (PortalConstant.ACTION_CANCEL_APPROVE.equals(cmd)) {
			article.setStatus(statusId);
			article.setModifiedDate(new Date());
			article.setModifiedByUser(currentUserId);
			article.setApprovedDate(null);
			article.setApprovedByUser(null);
			article.setHasPoll(false);
			article.setDiscussible(false);
			article.setSticky(false);
			article.setStickyExpireDate(null);
			article.setEffectiveDate(null);
			article.setExpireDate(null);
			articleService.updateVcmsArticle(article);
		} else if (PortalConstant.ACTION_CANCEL_PUBLISH.equals(cmd)) {
			article.setStatus(statusId);
			article.setModifiedDate(new Date());
			article.setModifiedByUser(currentUserId);
			article.setPublishedByUser(null);
			article.setPublishedDate(null);
			article.setHasPoll(false);
			article.setDiscussible(false);
			article.setSticky(false);
			article.setStickyExpireDate(null);
			article.setEffectiveDate(null);
			article.setExpireDate(null);
			article.setCategoryId(null);
			article.setSoundLink(null);
			articleService.updateVcmsArticle(article);
		}
	}
	
	public String getCurPortion(String articleId) throws Exception {
		String curPortion = "";
		String curCategoryId = "";
		VcmsArticle article = articleService.getArticle(articleId);
		curCategoryId = article.getCategoryId();
		if (!"".equals(curCategoryId)) {
			String[] arrCatId = StringUtil.split(curCategoryId, "#");
			String curPortionId = "0";
			int inc = 0;
			for (int i = 0; i < arrCatId.length; i++) {
				String catId = arrCatId[i];
				if (!"".equals(catId)) {
					VcmsCategory category = VcmsCategoryLocalServiceUtil.getCategory(catId);
					String portionId = category.getPortionId();
					if (!"0".equals(portionId)) {
						VcmsPortion portion = VcmsPortionLocalServiceUtil.getPortion(portionId);
						if (inc == 0) {
							curPortion = portion.getName();
						} else {
							curPortion += (!curPortionId.equals(portion.getPortionId())) ? ", " + portion.getName() : "";
						}
						inc++;
						curPortionId = portion.getPortionId();
					}
				}
			}
		}
		return curPortion;
	}
}
