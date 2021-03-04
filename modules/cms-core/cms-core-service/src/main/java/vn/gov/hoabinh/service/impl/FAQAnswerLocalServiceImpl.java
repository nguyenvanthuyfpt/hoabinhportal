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
import com.liferay.portal.kernel.model.User;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.FAQAnswer;
import vn.gov.hoabinh.service.base.FAQAnswerLocalServiceBaseImpl;

/**
 * The implementation of the f a q answer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.FAQAnswerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQAnswerLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.FAQAnswerLocalServiceUtil
 */
@ProviderType
public class FAQAnswerLocalServiceImpl extends FAQAnswerLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.FAQAnswerLocalServiceUtil} to access the f a q
	 * answer local service.
	 */

	public FAQAnswer addAnswer(String language, long questionId, String content, int answerOrder, String answeredByUser,
			boolean isApproved, String approvedByUser, long userId, String attachName, long folderId)
			throws PortalException, SystemException {

		long id = counterLocalService.increment();
		FAQAnswer answer = faqAnswerPersistence.create(id);
		answer.setQuestionid(questionId);
		answer.setContent(content);
		answer.setAnswerOrder(answerOrder);
		answer.setAnsweredByUser(answeredByUser);
		answer.setAnsweredDate(new Date());
		answer.setLanguage(language);

		if (isApproved) {
			answer.setApprovedByUser(approvedByUser);
			answer.setApprovedDate(new Date());
		}

		answer.setApproved(isApproved);
		answer.setUserId(userId);
		answer.setAttachName(attachName);
		answer.setFolderId(folderId);
		faqAnswerPersistence.update(answer);

		return answer;
	}

	public FAQAnswer updateAnswer(long answerId, String content, int answerOrder, String language, boolean isApproved,
			String answerByUser, String approvedByUser, long userId, String attachName, long folderId)
			throws PortalException, SystemException {

		FAQAnswer answer = faqAnswerPersistence.findByPrimaryKey(answerId);
		User user = userLocalService.getUser(userId);

		answer.setModifiedByUser(user.getFullName());
		answer.setModifiedDate(new Date());
		answer.setLanguage(language);

		answer.setContent(content);
		answer.setAnswerOrder(answerOrder);

		if (isApproved) {
			answer.setApprovedByUser(approvedByUser);
			answer.setApprovedDate(new Date());
		}

		answer.setAnsweredByUser(answerByUser);
		answer.setApproved(isApproved);
		answer.setUserId(userId);
		answer.setAttachName(attachName);
		answer.setFolderId(folderId);

		faqAnswerPersistence.update(answer);

		return answer;
	}

	public void deleteAnswer(long answerid) throws PortalException, SystemException {

		FAQAnswer answer = faqAnswerPersistence.findByPrimaryKey(answerid);

		faqAnswerPersistence.remove(answer);
	}

	// Approve Answer
	public FAQAnswer approveAnswer(long answerId, String approvedByUser) throws PortalException, SystemException {
		FAQAnswer answer = faqAnswerPersistence.findByPrimaryKey(answerId);

		answer.setApproved(true);
		answer.setApprovedByUser(approvedByUser);
		answer.setAnsweredDate(new Date());
		faqAnswerPersistence.update(answer);

		return answer;
	}

	// Un Approve Answer
	public FAQAnswer unapproveAnswer(long answerId, String approvedByUser) throws PortalException, SystemException {

		FAQAnswer answer = faqAnswerPersistence.findByPrimaryKey(answerId);

		answer.setApproved(false);
		answer.setApprovedByUser(null);
		answer.setAnsweredDate(null);

		faqAnswerPersistence.update(answer);

		return answer;
	}

	public List<FAQAnswer> getByQuestion(long questionId) throws PortalException, SystemException {
		return faqAnswerPersistence.findByQuestionId(questionId);
	}

	public List<FAQAnswer> getByQuestion(long questionId, int begin, int end) throws PortalException, SystemException {
		return faqAnswerPersistence.findByQuestionId(questionId, begin, end);
	}

	public int countByQuestion(long questionId) throws SystemException {
		return faqAnswerPersistence.countByQuestionId(questionId);
	}

	public List<FAQAnswer> getByApprove(boolean approved) throws PortalException, SystemException {
		return faqAnswerPersistence.findByApproved(approved);
	}

	public List<FAQAnswer> getByApprove(boolean approved, int begin, int end) throws PortalException, SystemException {
		return faqAnswerPersistence.findByApproved(approved, begin, end);
	}

	public int countByApprove(boolean approved) throws SystemException {
		return faqAnswerPersistence.countByApproved(approved);
	}

	public List<FAQAnswer> getByQ_A(long questionId, boolean approved) throws PortalException, SystemException {
		return faqAnswerPersistence.findByQ_A(questionId, approved);
	}

	public List<FAQAnswer> getByQ_A(long questionId, boolean approved, int begin, int end)
			throws PortalException, SystemException {
		return faqAnswerPersistence.findByQ_A(questionId, approved, begin, end);
	}

	public int countByQ_A(long questionId, boolean approved) throws PortalException, SystemException {

		return faqAnswerPersistence.countByQ_A(questionId, approved);
	}

	public FAQAnswer getAnswer(long answerId) throws PortalException, SystemException {
		return faqAnswerPersistence.findByPrimaryKey(answerId);
	}

	public int countAnswerByG_L(String language) throws PortalException, SystemException {
		return faqAnswerPersistence.countByG_L(language);
	}

	public List<FAQAnswer> getAnswerByG_L(String language) throws PortalException, SystemException {
		return faqAnswerPersistence.findByG_L(language);
	}

	public List<FAQAnswer> getAnswerByG_L(String language, int start, int end) throws PortalException, SystemException {
		return faqAnswerPersistence.findByG_L(language, start, end);
	}

	public List<FAQAnswer> getAnswerByParam(long groupId, String language, boolean isStatus, boolean approved,
			long questionId, boolean isCount, int start, int end) {
		DynamicQuery dynamicQuery = buildAnswerDQ(groupId, language, isStatus, approved, questionId, isCount);
		return faqAnswerPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	public int countAnswerByParam(long groupId, String language, boolean isStatus, boolean approved, long questionId) {
		DynamicQuery dynamicQuery = buildAnswerDQ(groupId, language, isStatus, approved, questionId, true);
		return (int) faqAnswerPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public DynamicQuery buildAnswerDQ(long groupId, String language, boolean isStatus, boolean approved,
			long questionId, boolean isCount) {

		Junction junction = RestrictionsFactoryUtil.conjunction();

		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));
		if (isStatus) {
			junction.add(PropertyFactoryUtil.forName("approved").eq(approved));
		}
		junction.add(PropertyFactoryUtil.forName("questionId").eq(questionId));
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(FAQAnswer.class, getClassLoader());
		if (!isCount) {
			dynamicQuery.addOrder(OrderFactoryUtil.desc("answeredDate"));
		}
		return dynamicQuery.add(junction);
	}

}