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
 * Provides the local service utility for FAQQuestion. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.FAQQuestionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FAQQuestionLocalService
 * @see vn.gov.hoabinh.service.base.FAQQuestionLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.FAQQuestionLocalServiceImpl
 * @generated
 */
@ProviderType
public class FAQQuestionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.FAQQuestionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery buildQuestionDQ(
		long groupId, java.lang.String language, boolean approved,
		boolean isFromTo, long categoryId, java.lang.String title,
		java.lang.String sentbyuser, java.lang.String senderemail,
		java.util.Date fromDate, java.util.Date toDate, boolean andSearch,
		boolean isCount) {
		return getService()
				   .buildQuestionDQ(groupId, language, approved, isFromTo,
			categoryId, title, sentbyuser, senderemail, fromDate, toDate,
			andSearch, isCount);
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

	public static int countApprovedQuestions(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countApprovedQuestions(groupId);
	}

	public static int countQuestion(long groupId, java.lang.String language,
		boolean approved, boolean isFromTo, long categoryId,
		java.lang.String title, java.lang.String sentbyuser,
		java.lang.String senderemail, java.util.Date fromDate,
		java.util.Date toDate, boolean andSearch) {
		return getService()
				   .countQuestion(groupId, language, approved, isFromTo,
			categoryId, title, sentbyuser, senderemail, fromDate, toDate,
			andSearch);
	}

	public static int countQuestionByG_L(long groupId, java.lang.String language) {
		return getService().countQuestionByG_L(groupId, language);
	}

	public static int countQuestionByG_L_A(long groupId,
		java.lang.String language, boolean approved) {
		return getService().countQuestionByG_L_A(groupId, language, approved);
	}

	public static int countQuestionByG_L_C_A(long groupId,
		java.lang.String language, long categoryId, boolean approved) {
		return getService()
				   .countQuestionByG_L_C_A(groupId, language, categoryId,
			approved);
	}

	/**
	* Returns the number of f a q questions.
	*
	* @return the number of f a q questions
	*/
	public static int getFAQQuestionsCount() {
		return getService().getFAQQuestionsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<vn.gov.hoabinh.model.FAQQuestion> getApprovedQuestions(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getApprovedQuestions(groupId);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQQuestion> getApprovedQuestions(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getApprovedQuestions(groupId, start, end);
	}

	/**
	* Returns a range of all the f a q questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of f a q questions
	*/
	public static java.util.List<vn.gov.hoabinh.model.FAQQuestion> getFAQQuestions(
		int start, int end) {
		return getService().getFAQQuestions(start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQQuestion> getListQuestionByG_L_C_A(
		long groupId, java.lang.String language, long categoryId,
		boolean approved) {
		return getService()
				   .getListQuestionByG_L_C_A(groupId, language, categoryId,
			approved);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQQuestion> getListQuestionByG_L_C_A(
		long groupId, java.lang.String language, long categoryId,
		boolean approved, int start, int end) {
		return getService()
				   .getListQuestionByG_L_C_A(groupId, language, categoryId,
			approved, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQQuestion> getOtherQuestion(
		long groupId, java.lang.String language, boolean approved, int begin,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getOtherQuestion(groupId, language, approved, begin, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQQuestion> getQuestionByG_L(
		long groupId, java.lang.String language) {
		return getService().getQuestionByG_L(groupId, language);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQQuestion> getQuestionByG_L(
		long groupId, java.lang.String language, int start, int end) {
		return getService().getQuestionByG_L(groupId, language, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQQuestion> getQuestionByG_L_A(
		long groupId, java.lang.String language, boolean approved) {
		return getService().getQuestionByG_L_A(groupId, language, approved);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQQuestion> getQuestionByG_L_A(
		long groupId, java.lang.String language, boolean approved, int begin,
		int end) {
		return getService()
				   .getQuestionByG_L_A(groupId, language, approved, begin, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQQuestion> getQuestionByG_L_C_A_Q(
		long groupId, java.lang.String language, long categoryId,
		long questionId, int quantity) {
		return getService()
				   .getQuestionByG_L_C_A_Q(groupId, language, categoryId,
			questionId, quantity);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQQuestion> getUnapprovedQuestions(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getUnapprovedQuestions(groupId);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQQuestion> searchQuestion(
		long groupId, java.lang.String language, boolean approved,
		boolean isFromTo, long categoryId, java.lang.String title,
		java.lang.String sentbyuser, java.lang.String senderemail,
		java.util.Date fromDate, java.util.Date toDate, boolean andSearch,
		int start, int end) {
		return getService()
				   .searchQuestion(groupId, language, approved, isFromTo,
			categoryId, title, sentbyuser, senderemail, fromDate, toDate,
			andSearch, start, end);
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

	/**
	* Adds the f a q question to the database. Also notifies the appropriate model listeners.
	*
	* @param faqQuestion the f a q question
	* @return the f a q question that was added
	*/
	public static vn.gov.hoabinh.model.FAQQuestion addFAQQuestion(
		vn.gov.hoabinh.model.FAQQuestion faqQuestion) {
		return getService().addFAQQuestion(faqQuestion);
	}

	public static vn.gov.hoabinh.model.FAQQuestion addQuestion(long groupId,
		java.lang.String language, java.lang.String title,
		java.lang.String content, java.lang.String sentByUser,
		java.lang.String senderEmail, java.lang.String questionType,
		long categoryId, int questionOrder, int hitCount, boolean isApproved,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addQuestion(groupId, language, title, content, sentByUser,
			senderEmail, questionType, categoryId, questionOrder, hitCount,
			isApproved, userId);
	}

	public static vn.gov.hoabinh.model.FAQQuestion approveQuestion(
		long questionId, java.lang.String userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().approveQuestion(questionId, userId);
	}

	/**
	* Creates a new f a q question with the primary key. Does not add the f a q question to the database.
	*
	* @param id the primary key for the new f a q question
	* @return the new f a q question
	*/
	public static vn.gov.hoabinh.model.FAQQuestion createFAQQuestion(long id) {
		return getService().createFAQQuestion(id);
	}

	/**
	* Deletes the f a q question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q question
	* @return the f a q question that was removed
	* @throws PortalException if a f a q question with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.FAQQuestion deleteFAQQuestion(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteFAQQuestion(id);
	}

	/**
	* Deletes the f a q question from the database. Also notifies the appropriate model listeners.
	*
	* @param faqQuestion the f a q question
	* @return the f a q question that was removed
	*/
	public static vn.gov.hoabinh.model.FAQQuestion deleteFAQQuestion(
		vn.gov.hoabinh.model.FAQQuestion faqQuestion) {
		return getService().deleteFAQQuestion(faqQuestion);
	}

	public static vn.gov.hoabinh.model.FAQQuestion fetchFAQQuestion(long id) {
		return getService().fetchFAQQuestion(id);
	}

	/**
	* Returns the f a q question with the primary key.
	*
	* @param id the primary key of the f a q question
	* @return the f a q question
	* @throws PortalException if a f a q question with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.FAQQuestion getFAQQuestion(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getFAQQuestion(id);
	}

	public static vn.gov.hoabinh.model.FAQQuestion getQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getQuestion(questionId);
	}

	public static vn.gov.hoabinh.model.FAQQuestion increaseHitCount(
		long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().increaseHitCount(questionId);
	}

	public static vn.gov.hoabinh.model.FAQQuestion unapproveQuestion(
		long questionId, java.lang.String userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().unapproveQuestion(questionId, userId);
	}

	/**
	* Updates the f a q question in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param faqQuestion the f a q question
	* @return the f a q question that was updated
	*/
	public static vn.gov.hoabinh.model.FAQQuestion updateFAQQuestion(
		vn.gov.hoabinh.model.FAQQuestion faqQuestion) {
		return getService().updateFAQQuestion(faqQuestion);
	}

	public static vn.gov.hoabinh.model.FAQQuestion updateQuestion(
		long groupId, java.lang.String language, long questionId,
		java.lang.String title, java.lang.String content,
		java.lang.String sentByUser, java.lang.String senderEmail,
		java.lang.String questionType, long categoryId, int questionOrder,
		int hitCount, boolean isApproved, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateQuestion(groupId, language, questionId, title,
			content, sentByUser, senderEmail, questionType, categoryId,
			questionOrder, hitCount, isApproved, userId);
	}

	public static vn.gov.hoabinh.model.FAQQuestion updateQuestion(
		long questionId, int hitCount)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateQuestion(questionId, hitCount);
	}

	public static void deleteQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteQuestion(questionId);
	}

	public static FAQQuestionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FAQQuestionLocalService, FAQQuestionLocalService> _serviceTracker =
		ServiceTrackerFactory.open(FAQQuestionLocalService.class);
}