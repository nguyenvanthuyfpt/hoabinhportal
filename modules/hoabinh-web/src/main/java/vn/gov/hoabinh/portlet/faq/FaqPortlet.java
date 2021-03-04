package vn.gov.hoabinh.portlet.faq;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;

import vn.gov.hoabinh.model.Attachment;
import vn.gov.hoabinh.model.FAQAnswer;
import vn.gov.hoabinh.model.FAQCategory;
import vn.gov.hoabinh.model.FAQQuestion;
import vn.gov.hoabinh.service.AttachmentLocalServiceUtil;
import vn.gov.hoabinh.service.FAQAnswerLocalService;
import vn.gov.hoabinh.service.FAQCategoryLocalService;
import vn.gov.hoabinh.service.FAQQuestionLocalService;
import vn.gov.hoabinh.util.PortalConstant;
import vn.gov.hoabinh.util.UploadFileUtils;

@Component(immediate = true, property = { 
		"com.liferay.portlet.display-category=category.hoabinh",
		"com.liferay.portlet.instanceable=false", 
		"javax.portlet.display-name=FAQ Portlet",
		"javax.portlet.init-param.template-path=/", 
		"javax.portlet.init-param.view-template=/faq/view.jsp",
		"com.liferay.portlet.header-portlet-javascript=/js/legal.js",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class FaqPortlet extends MVCPortlet {
	
	Log log = LogFactoryUtil.getLog(this.getClass());
	
	FAQQuestionLocalService faqQuestionService;
	FAQAnswerLocalService faqAnswerService;
	FAQCategoryLocalService faqCategoryService;
	
	
	@Reference(unbind = "-")
	public void setFaqQuestionService(FAQQuestionLocalService faqQuestionService) {
		this.faqQuestionService = faqQuestionService;
	}
	
	@Reference(unbind = "-")
	public void setFaqAnswerService(FAQAnswerLocalService faqAnswerService) {
		this.faqAnswerService = faqAnswerService;
	}
	
	@Reference(unbind = "-")
	public void setFaqCategoryService(FAQCategoryLocalService faqCategoryService) {
		this.faqCategoryService = faqCategoryService;
	}

	@Override
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.processAction(actionRequest, actionResponse);
	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.render(renderRequest, renderResponse);
	}
	
	// FAQCategroy
	@ProcessAction (name ="addOrUpdateCategory")
	public void addOrUpdateCategory(ActionRequest actionRequest, ActionResponse actionResponse)  throws Exception {
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(FAQCategory.class.getName(), actionRequest);
			long groupId = serviceContext.getScopeGroupId();
			long companyId = serviceContext.getCompanyId();
			long plid = serviceContext.getPlid();
			String language = PortalConstant.DEFAULT_LANGUAGE;
			long userId = serviceContext.getUserId();
			
			long categoryId = ParamUtil.getLong(actionRequest, "categoryId", 0);
			String name = ParamUtil.getString(actionRequest, "name");
			String description = ParamUtil.getString(actionRequest, "description");
			long parentId = ParamUtil.getLong(actionRequest, "parentId", 0);
			int catOrder = ParamUtil.getInteger(actionRequest, "catOrder", 0);
			int catLevel = ParamUtil.getInteger(actionRequest, "catLevel", 0);
			String image = ParamUtil.getString(actionRequest, "image");
			
			if (categoryId == 0) {
				faqCategoryService.addCategory(groupId, language, name, description, parentId, catOrder, catLevel,
						image, userId);
			} else {
				faqCategoryService.updateCategory(groupId, language, categoryId, name, description, parentId, catOrder,
						catLevel, image, userId);
			}
			
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	// FAQQuestion
	@ProcessAction (name ="addOrUpdateQuestion")
	public void addOrUpdateQuestion(ActionRequest actionRequest, ActionResponse actionResponse)  throws Exception {
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(FAQQuestion.class.getName(), actionRequest);
			ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();
			long groupId = serviceContext.getScopeGroupId();
			long questionId = ParamUtil.getLong(actionRequest, "questionId", 0);
			String language = PortalConstant.DEFAULT_LANGUAGE;
			String cmd = ParamUtil.getString(actionRequest, "cmd");
			String content = ParamUtil.getString(actionRequest, "content");
			String title = ParamUtil.getString(actionRequest, "title");
			String sentByUser = ParamUtil.getString(actionRequest, "sentByUser");
			String senderEmail = ParamUtil.getString(actionRequest, "senderEmail");
			String questionType = ParamUtil.getString(actionRequest, "questionType");
			long categoryId = ParamUtil.getLong(actionRequest, "categoryId");
			int questionOrder = ParamUtil.getInteger(actionRequest, "questionOrder", 0);
			int hitCount = 0;
			boolean isApproved = false;
			long userId = serviceContext.getUserId();
			
			if (Validator.isNotNull(cmd)) {
				FAQQuestion faqQuestion = faqQuestionService.getFAQQuestion(questionId);
				faqQuestion.setApproved(true);
				faqQuestion.setModifiedByUser(PortalUtil.getUserName(themeDisplay.getUserId(), PortalConstant.DEFAULT_USER));
				faqQuestion.setModifiedDate(new Date());
				faqQuestionService.updateFAQQuestion(faqQuestion);
			} else {
				if (questionId == 0) {
					faqQuestionService.addQuestion(groupId, language, title, content, sentByUser, senderEmail, questionType, categoryId,
							questionOrder, hitCount, isApproved, userId);
				} else {
					faqQuestionService.updateQuestion(groupId, language, questionId, title, content, sentByUser,
							senderEmail, questionType, categoryId, questionOrder, hitCount, isApproved, userId);
				}
			}
			
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	// FAQAnswer
	@ProcessAction (name ="addOrUpdateAnswer")
	public void addOrUpdateAnswer(ActionRequest actionRequest, ActionResponse actionResponse)  throws Exception {
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(FAQAnswer.class.getName(), actionRequest);
			UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
			ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();
			long groupId = serviceContext.getScopeGroupId();
			long companyId = serviceContext.getCompanyId();
			long answerId = ParamUtil.getLong(actionRequest, "answerId", 0);
			String language = PortalConstant.DEFAULT_LANGUAGE;
			long questionId = ParamUtil.getLong(actionRequest, "questionId", 0);
			String cmd = ParamUtil.getString(actionRequest, "cmd");
			String content = ParamUtil.getString(actionRequest, "content");
			int answerOrder = ParamUtil.getInteger(actionRequest, "answerOrder", 1);
			String answeredByUser = ParamUtil.getString(actionRequest, "answeredByUser");
			String approvedByUser = ParamUtil.getString(actionRequest, "approvedByUser");
			boolean isApproved = ParamUtil.getBoolean(actionRequest, "status", false);
			long userId = serviceContext.getUserId();
			String attachName = "";
			long folderId = 0;
			String tabs2 = ParamUtil.getString(actionRequest, "tabs2");
			FAQAnswer answer = null;
			if (Validator.isNotNull(cmd)) {
				answer =  faqAnswerService.getAnswer(answerId);
				if (PortalConstant.ACTION_APPROVE.equals(cmd)) {
					answer.setApproved(true);
					answer.setApprovedByUser(PortalUtil.getUserName(themeDisplay.getUserId(), PortalConstant.DEFAULT_USER));
					answer.setApprovedDate(new Date());
				} else if (PortalConstant.ACTION_CANCEL_APPROVE.equals(cmd)) {
					answer.setApproved(false);
					answer.setApprovedByUser(null);
					answer.setApprovedDate(null);
				}
				
				faqAnswerService.updateFAQAnswer(answer);
			} else {
				if (answerId == 0) {
					answer = faqAnswerService.addAnswer(language, questionId, content, answerOrder, answeredByUser, isApproved,
							approvedByUser, userId, attachName, folderId);
					answerId = answer.getId();
					
					
					
				} else {
					answer = faqAnswerService.getAnswer(answerId);
					attachName = answer.getAttachName();
					answer = faqAnswerService.updateAnswer(answerId, content, answerOrder, language, isApproved, answeredByUser,
							approvedByUser, userId, attachName, folderId);
				}
				
				
				if (isApproved) {
					answer = faqAnswerService.getAnswer(answerId);
					answer.setApproved(true);
					answer.setApprovedByUser(PortalUtil.getUserName(themeDisplay.getUserId(), PortalConstant.DEFAULT_USER));
					answer.setApprovedDate(new Date());
					faqAnswerService.updateFAQAnswer(answer);
				}
			}
			// Process attachment
			if (Validator.isNull(cmd) && "".equals(attachName)) {
				List<FileEntry> listFiles = UploadFileUtils.upload(uploadRequest, actionRequest, 0, userId, "attachment");
				if (Validator.isNotNull(listFiles) && listFiles.size() > 0) {
					for (FileEntry fileEntry : listFiles) {
						AttachmentLocalServiceUtil.addAttachment(fileEntry, companyId, groupId, answer.getId(), 
								FAQAnswer.class, fileEntry.getFolderId(), fileEntry.getFileName(), false);
						
						answer.setAttachName(fileEntry.getFileName());
						answer.setFolderId(fileEntry.getFolderId());
						faqAnswerService.updateFAQAnswer(answer);
					}
				}
			}
			actionResponse.setRenderParameter("tabs1", "portlet.faq.answer");
			actionResponse.setRenderParameter("tabs2", tabs2);
			actionResponse.setRenderParameter("jspPage", "/faq/view.jsp");
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	@ProcessAction (name = "deleteFAQ")
	public void deleteFAQ(ActionRequest actionRequest, ActionResponse actionResponse)  throws Exception { 
		try {
			long categoryId = ParamUtil.getLong(actionRequest, "categoryId");
			long questionId = ParamUtil.getLong(actionRequest, "questionId");
			long answerId = ParamUtil.getLong(actionRequest, "answerId");
			String obj = ParamUtil.getString(actionRequest, "obj");
			if ("QUESTION".equals(obj)) {
				faqQuestionService.deleteQuestion(questionId);
			} else if ("CATEGORY".equals(obj)) {
				faqCategoryService.deleteFAQCategory(categoryId);
			} else {
				faqAnswerService.deleteFAQAnswer(answerId);
				AttachmentLocalServiceUtil.deleteAttachments(FAQAnswer.class, answerId);
			}
			SessionMessages.add(actionRequest, "portlet.common.action.successfully");
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	@ProcessAction (name = "deleteFile")
	public void deleteFile(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		long answerId = ParamUtil.getLong(actionRequest, "answerId", 0);
		Attachment attachment = AttachmentLocalServiceUtil.getAttachment(FAQAnswer.class, answerId);
		long fileEntryId = attachment.getFileEntryId();
		FAQAnswer answer = null;
		try {
			AttachmentLocalServiceUtil.deleteAttachments(FAQAnswer.class, answerId);
			answer = faqAnswerService.getAnswer(answerId);
			answer.setAttachName(null);
			answer.setFolderId(0);
			faqAnswerService.updateFAQAnswer(answer);
			actionResponse.setRenderParameter("answerId", String.valueOf(answerId));
			actionResponse.setRenderParameter("jspPage", "/faq/edit_answer.jsp");
		} catch (Exception e) {
			
		}
	}
	
	@ProcessAction (name = "searchQuestion")
	public void searchQuestion(ActionRequest actionRequest, ActionResponse actionResponse)  throws Exception { 
		try {
			String tabs2 = ParamUtil.getString(actionRequest, "tabs2");
			long categoryId = ParamUtil.getLong(actionRequest, "categoryId");
			String title = ParamUtil.getString(actionRequest, "title");
			String sendByUser = ParamUtil.getString(actionRequest, "sendByUser");
			String senderEmail = ParamUtil.getString(actionRequest, "senderEmail");
			String hasSearch = ParamUtil.getString(actionRequest, "hasSearch");
			
			actionResponse.setRenderParameter("tabs2", tabs2);
			actionResponse.setRenderParameter("categoryId", String.valueOf(categoryId));
			actionResponse.setRenderParameter("title", title);
			actionResponse.setRenderParameter("sendByUser",  sendByUser);
			actionResponse.setRenderParameter("senderEmail", senderEmail);
			actionResponse.setRenderParameter("hasSearch", hasSearch);
			
			actionResponse.setRenderParameter("tabs1", "portlet.faq.question");
			actionResponse.setRenderParameter("tabs2", tabs2);
			actionResponse.setRenderParameter("jspPage", "/faq/view.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
	
	@ProcessAction (name = "searchAnswer")
	public void searchAnswer(ActionRequest actionRequest, ActionResponse actionResponse)  throws Exception { 
		try {
			String tabs2 = ParamUtil.getString(actionRequest, "tabs2");
			long categoryId = ParamUtil.getLong(actionRequest, "categoryId");
			String keyword = ParamUtil.getString(actionRequest, "keyword");
			String hasSearch = ParamUtil.getString(actionRequest, "hasSearch");
			
			actionResponse.setRenderParameter("tabs2", tabs2);
			actionResponse.setRenderParameter("categoryId", String.valueOf(categoryId));
			actionResponse.setRenderParameter("keyword", keyword);
			actionResponse.setRenderParameter("hasSearch", hasSearch);
			
			actionResponse.setRenderParameter("tabs1", "portlet.faq.answer");
			actionResponse.setRenderParameter("tabs2", tabs2);
			actionResponse.setRenderParameter("jspPage", "/faq/view.jsp");
			SessionMessages.add(actionRequest, PortalUtil.getPortletId(actionRequest) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_SUCCESS_MESSAGE);
			sendRedirect(actionRequest, actionResponse);
		} catch (Exception e) {
			// TODO: handle exception
			log.error(e.toString());
			SessionErrors.add(actionRequest, "portlet.common.action.errors");
		}
	}
}