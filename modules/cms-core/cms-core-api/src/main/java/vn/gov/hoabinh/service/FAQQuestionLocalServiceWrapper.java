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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FAQQuestionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FAQQuestionLocalService
 * @generated
 */
@ProviderType
public class FAQQuestionLocalServiceWrapper implements FAQQuestionLocalService,
	ServiceWrapper<FAQQuestionLocalService> {
	public FAQQuestionLocalServiceWrapper(
		FAQQuestionLocalService faqQuestionLocalService) {
		_faqQuestionLocalService = faqQuestionLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _faqQuestionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildQuestionDQ(
		long groupId, java.lang.String language, boolean approved,
		boolean isFromTo, long categoryId, java.lang.String title,
		java.lang.String sentbyuser, java.lang.String senderemail,
		java.util.Date fromDate, java.util.Date toDate, boolean andSearch,
		boolean isCount) {
		return _faqQuestionLocalService.buildQuestionDQ(groupId, language,
			approved, isFromTo, categoryId, title, sentbyuser, senderemail,
			fromDate, toDate, andSearch, isCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _faqQuestionLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _faqQuestionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqQuestionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqQuestionLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countApprovedQuestions(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionLocalService.countApprovedQuestions(groupId);
	}

	@Override
	public int countQuestion(long groupId, java.lang.String language,
		boolean approved, boolean isFromTo, long categoryId,
		java.lang.String title, java.lang.String sentbyuser,
		java.lang.String senderemail, java.util.Date fromDate,
		java.util.Date toDate, boolean andSearch) {
		return _faqQuestionLocalService.countQuestion(groupId, language,
			approved, isFromTo, categoryId, title, sentbyuser, senderemail,
			fromDate, toDate, andSearch);
	}

	@Override
	public int countQuestionByG_L(long groupId, java.lang.String language) {
		return _faqQuestionLocalService.countQuestionByG_L(groupId, language);
	}

	@Override
	public int countQuestionByG_L_A(long groupId, java.lang.String language,
		boolean approved) {
		return _faqQuestionLocalService.countQuestionByG_L_A(groupId, language,
			approved);
	}

	@Override
	public int countQuestionByG_L_C_A(long groupId, java.lang.String language,
		long categoryId, boolean approved) {
		return _faqQuestionLocalService.countQuestionByG_L_C_A(groupId,
			language, categoryId, approved);
	}

	/**
	* Returns the number of f a q questions.
	*
	* @return the number of f a q questions
	*/
	@Override
	public int getFAQQuestionsCount() {
		return _faqQuestionLocalService.getFAQQuestionsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _faqQuestionLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _faqQuestionLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _faqQuestionLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _faqQuestionLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQQuestion> getApprovedQuestions(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionLocalService.getApprovedQuestions(groupId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQQuestion> getApprovedQuestions(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionLocalService.getApprovedQuestions(groupId, start, end);
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
	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQQuestion> getFAQQuestions(
		int start, int end) {
		return _faqQuestionLocalService.getFAQQuestions(start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQQuestion> getListQuestionByG_L_C_A(
		long groupId, java.lang.String language, long categoryId,
		boolean approved) {
		return _faqQuestionLocalService.getListQuestionByG_L_C_A(groupId,
			language, categoryId, approved);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQQuestion> getListQuestionByG_L_C_A(
		long groupId, java.lang.String language, long categoryId,
		boolean approved, int start, int end) {
		return _faqQuestionLocalService.getListQuestionByG_L_C_A(groupId,
			language, categoryId, approved, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQQuestion> getOtherQuestion(
		long groupId, java.lang.String language, boolean approved, int begin,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionLocalService.getOtherQuestion(groupId, language,
			approved, begin, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQQuestion> getQuestionByG_L(
		long groupId, java.lang.String language) {
		return _faqQuestionLocalService.getQuestionByG_L(groupId, language);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQQuestion> getQuestionByG_L(
		long groupId, java.lang.String language, int start, int end) {
		return _faqQuestionLocalService.getQuestionByG_L(groupId, language,
			start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQQuestion> getQuestionByG_L_A(
		long groupId, java.lang.String language, boolean approved) {
		return _faqQuestionLocalService.getQuestionByG_L_A(groupId, language,
			approved);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQQuestion> getQuestionByG_L_A(
		long groupId, java.lang.String language, boolean approved, int begin,
		int end) {
		return _faqQuestionLocalService.getQuestionByG_L_A(groupId, language,
			approved, begin, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQQuestion> getQuestionByG_L_C_A_Q(
		long groupId, java.lang.String language, long categoryId,
		long questionId, int quantity) {
		return _faqQuestionLocalService.getQuestionByG_L_C_A_Q(groupId,
			language, categoryId, questionId, quantity);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQQuestion> getUnapprovedQuestions(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionLocalService.getUnapprovedQuestions(groupId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQQuestion> searchQuestion(
		long groupId, java.lang.String language, boolean approved,
		boolean isFromTo, long categoryId, java.lang.String title,
		java.lang.String sentbyuser, java.lang.String senderemail,
		java.util.Date fromDate, java.util.Date toDate, boolean andSearch,
		int start, int end) {
		return _faqQuestionLocalService.searchQuestion(groupId, language,
			approved, isFromTo, categoryId, title, sentbyuser, senderemail,
			fromDate, toDate, andSearch, start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _faqQuestionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _faqQuestionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the f a q question to the database. Also notifies the appropriate model listeners.
	*
	* @param faqQuestion the f a q question
	* @return the f a q question that was added
	*/
	@Override
	public vn.gov.hoabinh.model.FAQQuestion addFAQQuestion(
		vn.gov.hoabinh.model.FAQQuestion faqQuestion) {
		return _faqQuestionLocalService.addFAQQuestion(faqQuestion);
	}

	@Override
	public vn.gov.hoabinh.model.FAQQuestion addQuestion(long groupId,
		java.lang.String language, java.lang.String title,
		java.lang.String content, java.lang.String sentByUser,
		java.lang.String senderEmail, java.lang.String questionType,
		long categoryId, int questionOrder, int hitCount, boolean isApproved,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionLocalService.addQuestion(groupId, language, title,
			content, sentByUser, senderEmail, questionType, categoryId,
			questionOrder, hitCount, isApproved, userId);
	}

	@Override
	public vn.gov.hoabinh.model.FAQQuestion approveQuestion(long questionId,
		java.lang.String userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionLocalService.approveQuestion(questionId, userId);
	}

	/**
	* Creates a new f a q question with the primary key. Does not add the f a q question to the database.
	*
	* @param id the primary key for the new f a q question
	* @return the new f a q question
	*/
	@Override
	public vn.gov.hoabinh.model.FAQQuestion createFAQQuestion(long id) {
		return _faqQuestionLocalService.createFAQQuestion(id);
	}

	/**
	* Deletes the f a q question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q question
	* @return the f a q question that was removed
	* @throws PortalException if a f a q question with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.FAQQuestion deleteFAQQuestion(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqQuestionLocalService.deleteFAQQuestion(id);
	}

	/**
	* Deletes the f a q question from the database. Also notifies the appropriate model listeners.
	*
	* @param faqQuestion the f a q question
	* @return the f a q question that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.FAQQuestion deleteFAQQuestion(
		vn.gov.hoabinh.model.FAQQuestion faqQuestion) {
		return _faqQuestionLocalService.deleteFAQQuestion(faqQuestion);
	}

	@Override
	public vn.gov.hoabinh.model.FAQQuestion fetchFAQQuestion(long id) {
		return _faqQuestionLocalService.fetchFAQQuestion(id);
	}

	/**
	* Returns the f a q question with the primary key.
	*
	* @param id the primary key of the f a q question
	* @return the f a q question
	* @throws PortalException if a f a q question with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.FAQQuestion getFAQQuestion(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqQuestionLocalService.getFAQQuestion(id);
	}

	@Override
	public vn.gov.hoabinh.model.FAQQuestion getQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionLocalService.getQuestion(questionId);
	}

	@Override
	public vn.gov.hoabinh.model.FAQQuestion increaseHitCount(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionLocalService.increaseHitCount(questionId);
	}

	@Override
	public vn.gov.hoabinh.model.FAQQuestion unapproveQuestion(long questionId,
		java.lang.String userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionLocalService.unapproveQuestion(questionId, userId);
	}

	/**
	* Updates the f a q question in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param faqQuestion the f a q question
	* @return the f a q question that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.FAQQuestion updateFAQQuestion(
		vn.gov.hoabinh.model.FAQQuestion faqQuestion) {
		return _faqQuestionLocalService.updateFAQQuestion(faqQuestion);
	}

	@Override
	public vn.gov.hoabinh.model.FAQQuestion updateQuestion(long groupId,
		java.lang.String language, long questionId, java.lang.String title,
		java.lang.String content, java.lang.String sentByUser,
		java.lang.String senderEmail, java.lang.String questionType,
		long categoryId, int questionOrder, int hitCount, boolean isApproved,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionLocalService.updateQuestion(groupId, language,
			questionId, title, content, sentByUser, senderEmail, questionType,
			categoryId, questionOrder, hitCount, isApproved, userId);
	}

	@Override
	public vn.gov.hoabinh.model.FAQQuestion updateQuestion(long questionId,
		int hitCount)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqQuestionLocalService.updateQuestion(questionId, hitCount);
	}

	@Override
	public void deleteQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqQuestionLocalService.deleteQuestion(questionId);
	}

	@Override
	public FAQQuestionLocalService getWrappedService() {
		return _faqQuestionLocalService;
	}

	@Override
	public void setWrappedService(
		FAQQuestionLocalService faqQuestionLocalService) {
		_faqQuestionLocalService = faqQuestionLocalService;
	}

	private FAQQuestionLocalService _faqQuestionLocalService;
}