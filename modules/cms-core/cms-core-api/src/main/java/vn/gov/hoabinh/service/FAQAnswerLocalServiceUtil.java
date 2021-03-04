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

package vn.gov.hoabinh.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for FAQAnswer. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.FAQAnswerLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FAQAnswerLocalService
 * @see vn.gov.hoabinh.service.base.FAQAnswerLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.FAQAnswerLocalServiceImpl
 * @generated
 */
@ProviderType
public class FAQAnswerLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.FAQAnswerLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery buildAnswerDQ(
		long groupId, java.lang.String language, boolean isStatus,
		boolean approved, long questionId, boolean isCount) {
		return getService()
				   .buildAnswerDQ(groupId, language, isStatus, approved,
			questionId, isCount);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static int countAnswerByG_L(java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countAnswerByG_L(language);
	}

	public static int countAnswerByParam(long groupId,
		java.lang.String language, boolean isStatus, boolean approved,
		long questionId) {
		return getService()
				   .countAnswerByParam(groupId, language, isStatus, approved,
			questionId);
	}

	public static int countByApprove(boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByApprove(approved);
	}

	public static int countByQ_A(long questionId, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countByQ_A(questionId, approved);
	}

	public static int countByQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByQuestion(questionId);
	}

	/**
	* Returns the number of f a q answers.
	*
	* @return the number of f a q answers
	*/
	public static int getFAQAnswersCount() {
		return getService().getFAQAnswersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQAnswer> getAnswerByG_L(
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAnswerByG_L(language);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQAnswer> getAnswerByG_L(
		java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAnswerByG_L(language, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQAnswer> getAnswerByParam(
		long groupId, java.lang.String language, boolean isStatus,
		boolean approved, long questionId, boolean isCount, int start, int end) {
		return getService()
				   .getAnswerByParam(groupId, language, isStatus, approved,
			questionId, isCount, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQAnswer> getByApprove(
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByApprove(approved);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQAnswer> getByApprove(
		boolean approved, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByApprove(approved, begin, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQAnswer> getByQ_A(
		long questionId, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByQ_A(questionId, approved);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQAnswer> getByQ_A(
		long questionId, boolean approved, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByQ_A(questionId, approved, begin, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQAnswer> getByQuestion(
		long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByQuestion(questionId);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQAnswer> getByQuestion(
		long questionId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByQuestion(questionId, begin, end);
	}

	/**
	* Returns a range of all the f a q answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @return the range of f a q answers
	*/
	public static java.util.List<vn.gov.hoabinh.model.FAQAnswer> getFAQAnswers(
		int start, int end) {
		return getService().getFAQAnswers(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static vn.gov.hoabinh.model.FAQAnswer addAnswer(
		java.lang.String language, long questionId, java.lang.String content,
		int answerOrder, java.lang.String answeredByUser, boolean isApproved,
		java.lang.String approvedByUser, long userId,
		java.lang.String attachName, long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addAnswer(language, questionId, content, answerOrder,
			answeredByUser, isApproved, approvedByUser, userId, attachName,
			folderId);
	}

	/**
	* Adds the f a q answer to the database. Also notifies the appropriate model listeners.
	*
	* @param faqAnswer the f a q answer
	* @return the f a q answer that was added
	*/
	public static vn.gov.hoabinh.model.FAQAnswer addFAQAnswer(
		vn.gov.hoabinh.model.FAQAnswer faqAnswer) {
		return getService().addFAQAnswer(faqAnswer);
	}

	public static vn.gov.hoabinh.model.FAQAnswer approveAnswer(long answerId,
		java.lang.String approvedByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().approveAnswer(answerId, approvedByUser);
	}

	/**
	* Creates a new f a q answer with the primary key. Does not add the f a q answer to the database.
	*
	* @param id the primary key for the new f a q answer
	* @return the new f a q answer
	*/
	public static vn.gov.hoabinh.model.FAQAnswer createFAQAnswer(long id) {
		return getService().createFAQAnswer(id);
	}

	/**
	* Deletes the f a q answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q answer
	* @return the f a q answer that was removed
	* @throws PortalException if a f a q answer with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.FAQAnswer deleteFAQAnswer(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteFAQAnswer(id);
	}

	/**
	* Deletes the f a q answer from the database. Also notifies the appropriate model listeners.
	*
	* @param faqAnswer the f a q answer
	* @return the f a q answer that was removed
	*/
	public static vn.gov.hoabinh.model.FAQAnswer deleteFAQAnswer(
		vn.gov.hoabinh.model.FAQAnswer faqAnswer) {
		return getService().deleteFAQAnswer(faqAnswer);
	}

	public static vn.gov.hoabinh.model.FAQAnswer fetchFAQAnswer(long id) {
		return getService().fetchFAQAnswer(id);
	}

	public static vn.gov.hoabinh.model.FAQAnswer getAnswer(long answerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getAnswer(answerId);
	}

	/**
	* Returns the f a q answer with the primary key.
	*
	* @param id the primary key of the f a q answer
	* @return the f a q answer
	* @throws PortalException if a f a q answer with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.FAQAnswer getFAQAnswer(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getFAQAnswer(id);
	}

	public static vn.gov.hoabinh.model.FAQAnswer unapproveAnswer(
		long answerId, java.lang.String approvedByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().unapproveAnswer(answerId, approvedByUser);
	}

	public static vn.gov.hoabinh.model.FAQAnswer updateAnswer(long answerId,
		java.lang.String content, int answerOrder, java.lang.String language,
		boolean isApproved, java.lang.String answerByUser,
		java.lang.String approvedByUser, long userId,
		java.lang.String attachName, long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateAnswer(answerId, content, answerOrder, language,
			isApproved, answerByUser, approvedByUser, userId, attachName,
			folderId);
	}

	/**
	* Updates the f a q answer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param faqAnswer the f a q answer
	* @return the f a q answer that was updated
	*/
	public static vn.gov.hoabinh.model.FAQAnswer updateFAQAnswer(
		vn.gov.hoabinh.model.FAQAnswer faqAnswer) {
		return getService().updateFAQAnswer(faqAnswer);
	}

	public static void deleteAnswer(long answerid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteAnswer(answerid);
	}

	public static FAQAnswerLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FAQAnswerLocalService, FAQAnswerLocalService> _serviceTracker =
		ServiceTrackerFactory.open(FAQAnswerLocalService.class);
}