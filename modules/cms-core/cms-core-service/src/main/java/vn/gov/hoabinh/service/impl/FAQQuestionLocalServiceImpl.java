/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.gov.hoabinh.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.FAQAnswer;
import vn.gov.hoabinh.model.FAQQuestion;
import vn.gov.hoabinh.service.FAQAnswerLocalServiceUtil;
import vn.gov.hoabinh.service.FAQCategoryQuestionLocalServiceUtil;
import vn.gov.hoabinh.service.FAQQuestionLocalServiceUtil;
import vn.gov.hoabinh.service.base.FAQQuestionLocalServiceBaseImpl;

/**
 * The implementation of the f a q question local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.FAQQuestionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQQuestionLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.FAQQuestionLocalServiceUtil
 */
@ProviderType
public class FAQQuestionLocalServiceImpl extends FAQQuestionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.FAQQuestionLocalServiceUtil} to access the f a q
	 * question local service.
	 */

	public FAQQuestion addQuestion(long groupId, String language, String title, String content, String sentByUser,
			String senderEmail, String questionType, long categoryId, int questionOrder, int hitCount, boolean isApproved, long userId)
			throws PortalException, SystemException {

		// Question
		long questionId = counterLocalService.increment();
		FAQQuestion question = faqQuestionPersistence.create(questionId);

		question.setGroupId(groupId);
		question.setLanguage(language);

		question.setTitle(title);
		question.setContent(content);

		question.setQuestionOrder(questionOrder);
		question.setSentDate(new Date());
		question.setSentByUser(sentByUser);
		question.setSenderEmail(senderEmail);
		question.setQuestionType(questionType);
		question.setHitCount(hitCount);
		question.setApproved(isApproved);
		question.setUserId(userId);
		question.setCategoryId(categoryId);

		faqQuestionPersistence.update(question);

		return question;
	}

	public FAQQuestion updateQuestion(long groupId, String language, long questionId, String title, String content,
			String sentByUser, String senderEmail, String questionType, long categoryId, int questionOrder, int hitCount,
			boolean isApproved, long userId) throws PortalException, SystemException {

		FAQQuestion question = faqQuestionPersistence.findByPrimaryKey(questionId);

		question.setGroupId(groupId);
		question.setLanguage(language);

		question.setTitle(title);
		question.setContent(content);
		question.setSenderEmail(senderEmail);
		question.setSentByUser(sentByUser);

		question.setQuestionOrder(questionOrder);
		question.setModifiedDate(new Date());
		question.setModifiedByUser(String.valueOf(userId));

		question.setQuestionType(questionType);
		question.setHitCount(hitCount);
		question.setApproved(isApproved);
		question.setUserId(userId);
		question.setCategoryId(categoryId);
		faqQuestionPersistence.update(question);

		return question;
	}

	public FAQQuestion updateQuestion(long questionId, int hitCount) throws PortalException, SystemException {

		FAQQuestion question = faqQuestionPersistence.findByPrimaryKey(questionId);

		question.setHitCount(hitCount);

		return faqQuestionPersistence.update(question);

	}

	public void deleteQuestion(long questionId) throws PortalException, SystemException {

		FAQQuestion question = FAQQuestionLocalServiceUtil.getFAQQuestion(questionId);

		try {

			List<FAQAnswer> listAnswer = FAQAnswerLocalServiceUtil.getByQuestion(question.getId());
			faqQuestionPersistence.remove(question);
			FAQCategoryQuestionLocalServiceUtil.deleteByCategoryId(question.getId());

		} catch (Exception e) {
			// TODO: handle exception
			// throw new DeleteFAQQuestionException();
		}

	}

	public FAQQuestion increaseHitCount(long questionId) throws PortalException, SystemException {

		FAQQuestion question = faqQuestionPersistence.findByPrimaryKey(questionId);
		int hitCount = question.getHitCount();
		++hitCount;
		question.setHitCount(hitCount);

		faqQuestionPersistence.update(question);

		return question;
	}

	// Un Approve Question
	public FAQQuestion unapproveQuestion(long questionId, String userId) throws PortalException, SystemException {

		FAQQuestion question = faqQuestionPersistence.findByPrimaryKey(questionId);

		question.setApproved(false);
		question.setModifiedDate(new Date());
		question.setModifiedByUser(userId);

		return faqQuestionPersistence.update(question);
	}

	// Approve Question
	public FAQQuestion approveQuestion(long questionId, String userId) throws PortalException, SystemException {

		FAQQuestion question = faqQuestionPersistence.findByPrimaryKey(questionId);

		question.setApproved(true);
		question.setModifiedByUser(userId);
		question.setModifiedDate(new Date());

		return faqQuestionPersistence.update(question);
	}

	public List<FAQQuestion> getApprovedQuestions(long groupId) throws PortalException, SystemException {
		return faqQuestionPersistence.findByG_A(groupId, true);
	}

	public List<FAQQuestion> getApprovedQuestions(long groupId, int start, int end)
			throws PortalException, SystemException {
		return faqQuestionPersistence.findByG_A(groupId, true, start, end);
	}

	public int countApprovedQuestions(long groupId) throws PortalException, SystemException {
		return faqQuestionPersistence.countByG_A(groupId, true);
	}

	public List<FAQQuestion> getUnapprovedQuestions(long groupId) throws PortalException, SystemException {
		return faqQuestionPersistence.findByG_A(groupId, false);
	}

	public FAQQuestion getQuestion(long questionId) throws PortalException, SystemException {
		return faqQuestionPersistence.findByPrimaryKey(questionId);
	}

	public List<FAQQuestion> getOtherQuestion(long groupId, String language, boolean approved, int begin, int end)
			throws PortalException, SystemException {
		return faqQuestionPersistence.findByG_L_A(groupId, language, approved, begin, end);
	}

	public List<FAQQuestion> getListQuestionByG_L_C_A(long groupId, String language, long categoryId,
			boolean approved) {
		return faqQuestionPersistence.findByG_L_C_A(groupId, language, categoryId, approved);
	}

	public List<FAQQuestion> getListQuestionByG_L_C_A(long groupId, String language, long categoryId, boolean approved,
			int start, int end) {
		return faqQuestionPersistence.findByG_L_C_A(groupId, language, categoryId, approved, start, end);
	}

	public int countQuestionByG_L_C_A(long groupId, String language, long categoryId, boolean approved) {
		return faqQuestionPersistence.countByG_L_C_A(groupId, language, categoryId, approved);
	}
	
	public int countQuestionByG_L(long groupId, String language) {
		return faqQuestionPersistence.countByG_L(groupId, language);
	}
	
	public List<FAQQuestion> getQuestionByG_L(long groupId, String language) {
		return faqQuestionPersistence.findByG_L(groupId, language);
	}
	
	public int countQuestionByG_L_A(long groupId, String language, boolean approved) {
		return faqQuestionPersistence.countByG_L_A(groupId, language, approved);
	}
	
	public List<FAQQuestion> getQuestionByG_L_A(long groupId, String language, boolean approved) {
		return faqQuestionPersistence.findByG_L_A(groupId, language, approved);
	}
	
	public List<FAQQuestion> getQuestionByG_L_A(long groupId, String language, boolean approved, int begin, int end) {
		return faqQuestionPersistence.findByG_L_A(groupId, language, approved, begin, end);
	}
	
	public List<FAQQuestion> getQuestionByG_L(long groupId, String language, int start, int end) {
		return faqQuestionPersistence.findByG_L(groupId, language, start, end);
	}
	
	public List<FAQQuestion> getQuestionByG_L_C_A_Q (long groupId, String language, long categoryId, long questionId, int quantity) {
		return faqQuestionPersistence.findByG_L_C_A_Q(groupId, language, categoryId, true, questionId, 0, quantity);
	}
	
	public List<FAQQuestion> searchQuestion(long groupId, String language, boolean approved, boolean isFromTo, long categoryId, String title, String sentbyuser,
			String senderemail, Date fromDate, Date toDate, boolean andSearch, int start, int end) {
		DynamicQuery dynamicQuery = buildQuestionDQ(groupId, language, approved, isFromTo, categoryId, title, sentbyuser, senderemail,fromDate, toDate, andSearch, false);
		return faqQuestionPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}
	
	public int countQuestion(long groupId, String language, boolean approved, boolean isFromTo, long categoryId, String title, String sentbyuser,
			String senderemail, Date fromDate, Date toDate, boolean andSearch) {
		DynamicQuery dynamicQuery = buildQuestionDQ(groupId, language, approved, isFromTo, categoryId, title, sentbyuser, senderemail,fromDate, toDate, andSearch, true);
		return (int) faqQuestionPersistence.countWithDynamicQuery(dynamicQuery);
	}
	
	public DynamicQuery buildQuestionDQ(long groupId, String language, boolean approved, boolean isFromTo, long categoryId, 
			String title, String sentbyuser, String senderemail, Date fromDate, Date toDate, boolean andSearch, boolean isCount) {
		
		Junction junction = null;
		if (andSearch) {
			junction = RestrictionsFactoryUtil.conjunction();
		} else {
			junction = RestrictionsFactoryUtil.disjunction();
		}
		
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));
		junction.add(PropertyFactoryUtil.forName("approved").eq(approved));
		if (categoryId>-1) {
			junction.add(PropertyFactoryUtil.forName("categoryId").eq(categoryId));
		}
		
		if (Validator.isNotNull(title)) {
			junction.add(PropertyFactoryUtil.forName("title").like("%"+title+"%"));
		}
		
		if (Validator.isNotNull(sentbyuser)) {
			junction.add(PropertyFactoryUtil.forName("sentByUser").like("%"+sentbyuser+"%"));
		}
		
		if (Validator.isNotNull(senderemail)) {
			junction.add(PropertyFactoryUtil.forName("senderEmail").like("%"+senderemail+"%"));
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(FAQQuestion.class, getClassLoader());
		
		if (isFromTo) {
			dynamicQuery.add(RestrictionsFactoryUtil.between("sentDate", fromDate, toDate));
		}
		
		if (!isCount) {
			dynamicQuery.addOrder(OrderFactoryUtil.desc("sentDate"));
		}
		return dynamicQuery.add(junction);
	}
}