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
 * Provides a wrapper for {@link FAQAnswerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FAQAnswerLocalService
 * @generated
 */
@ProviderType
public class FAQAnswerLocalServiceWrapper implements FAQAnswerLocalService,
	ServiceWrapper<FAQAnswerLocalService> {
	public FAQAnswerLocalServiceWrapper(
		FAQAnswerLocalService faqAnswerLocalService) {
		_faqAnswerLocalService = faqAnswerLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _faqAnswerLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildAnswerDQ(
		long groupId, java.lang.String language, boolean isStatus,
		boolean approved, long questionId, boolean isCount) {
		return _faqAnswerLocalService.buildAnswerDQ(groupId, language,
			isStatus, approved, questionId, isCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _faqAnswerLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _faqAnswerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqAnswerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqAnswerLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countAnswerByG_L(java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.countAnswerByG_L(language);
	}

	@Override
	public int countAnswerByParam(long groupId, java.lang.String language,
		boolean isStatus, boolean approved, long questionId) {
		return _faqAnswerLocalService.countAnswerByParam(groupId, language,
			isStatus, approved, questionId);
	}

	@Override
	public int countByApprove(boolean approved)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.countByApprove(approved);
	}

	@Override
	public int countByQ_A(long questionId, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.countByQ_A(questionId, approved);
	}

	@Override
	public int countByQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.countByQuestion(questionId);
	}

	/**
	* Returns the number of f a q answers.
	*
	* @return the number of f a q answers
	*/
	@Override
	public int getFAQAnswersCount() {
		return _faqAnswerLocalService.getFAQAnswersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _faqAnswerLocalService.getOSGiServiceIdentifier();
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
		return _faqAnswerLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _faqAnswerLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _faqAnswerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQAnswer> getAnswerByG_L(
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getAnswerByG_L(language);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQAnswer> getAnswerByG_L(
		java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getAnswerByG_L(language, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQAnswer> getAnswerByParam(
		long groupId, java.lang.String language, boolean isStatus,
		boolean approved, long questionId, boolean isCount, int start, int end) {
		return _faqAnswerLocalService.getAnswerByParam(groupId, language,
			isStatus, approved, questionId, isCount, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQAnswer> getByApprove(
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getByApprove(approved);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQAnswer> getByApprove(
		boolean approved, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getByApprove(approved, begin, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQAnswer> getByQ_A(
		long questionId, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getByQ_A(questionId, approved);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQAnswer> getByQ_A(
		long questionId, boolean approved, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getByQ_A(questionId, approved, begin, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQAnswer> getByQuestion(
		long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getByQuestion(questionId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQAnswer> getByQuestion(
		long questionId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getByQuestion(questionId, begin, end);
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
	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQAnswer> getFAQAnswers(
		int start, int end) {
		return _faqAnswerLocalService.getFAQAnswers(start, end);
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
		return _faqAnswerLocalService.dynamicQueryCount(dynamicQuery);
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
		return _faqAnswerLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.gov.hoabinh.model.FAQAnswer addAnswer(java.lang.String language,
		long questionId, java.lang.String content, int answerOrder,
		java.lang.String answeredByUser, boolean isApproved,
		java.lang.String approvedByUser, long userId,
		java.lang.String attachName, long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.addAnswer(language, questionId, content,
			answerOrder, answeredByUser, isApproved, approvedByUser, userId,
			attachName, folderId);
	}

	/**
	* Adds the f a q answer to the database. Also notifies the appropriate model listeners.
	*
	* @param faqAnswer the f a q answer
	* @return the f a q answer that was added
	*/
	@Override
	public vn.gov.hoabinh.model.FAQAnswer addFAQAnswer(
		vn.gov.hoabinh.model.FAQAnswer faqAnswer) {
		return _faqAnswerLocalService.addFAQAnswer(faqAnswer);
	}

	@Override
	public vn.gov.hoabinh.model.FAQAnswer approveAnswer(long answerId,
		java.lang.String approvedByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.approveAnswer(answerId, approvedByUser);
	}

	/**
	* Creates a new f a q answer with the primary key. Does not add the f a q answer to the database.
	*
	* @param id the primary key for the new f a q answer
	* @return the new f a q answer
	*/
	@Override
	public vn.gov.hoabinh.model.FAQAnswer createFAQAnswer(long id) {
		return _faqAnswerLocalService.createFAQAnswer(id);
	}

	/**
	* Deletes the f a q answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q answer
	* @return the f a q answer that was removed
	* @throws PortalException if a f a q answer with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.FAQAnswer deleteFAQAnswer(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqAnswerLocalService.deleteFAQAnswer(id);
	}

	/**
	* Deletes the f a q answer from the database. Also notifies the appropriate model listeners.
	*
	* @param faqAnswer the f a q answer
	* @return the f a q answer that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.FAQAnswer deleteFAQAnswer(
		vn.gov.hoabinh.model.FAQAnswer faqAnswer) {
		return _faqAnswerLocalService.deleteFAQAnswer(faqAnswer);
	}

	@Override
	public vn.gov.hoabinh.model.FAQAnswer fetchFAQAnswer(long id) {
		return _faqAnswerLocalService.fetchFAQAnswer(id);
	}

	@Override
	public vn.gov.hoabinh.model.FAQAnswer getAnswer(long answerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.getAnswer(answerId);
	}

	/**
	* Returns the f a q answer with the primary key.
	*
	* @param id the primary key of the f a q answer
	* @return the f a q answer
	* @throws PortalException if a f a q answer with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.FAQAnswer getFAQAnswer(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqAnswerLocalService.getFAQAnswer(id);
	}

	@Override
	public vn.gov.hoabinh.model.FAQAnswer unapproveAnswer(long answerId,
		java.lang.String approvedByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.unapproveAnswer(answerId, approvedByUser);
	}

	@Override
	public vn.gov.hoabinh.model.FAQAnswer updateAnswer(long answerId,
		java.lang.String content, int answerOrder, java.lang.String language,
		boolean isApproved, java.lang.String answerByUser,
		java.lang.String approvedByUser, long userId,
		java.lang.String attachName, long folderId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqAnswerLocalService.updateAnswer(answerId, content,
			answerOrder, language, isApproved, answerByUser, approvedByUser,
			userId, attachName, folderId);
	}

	/**
	* Updates the f a q answer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param faqAnswer the f a q answer
	* @return the f a q answer that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.FAQAnswer updateFAQAnswer(
		vn.gov.hoabinh.model.FAQAnswer faqAnswer) {
		return _faqAnswerLocalService.updateFAQAnswer(faqAnswer);
	}

	@Override
	public void deleteAnswer(long answerid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqAnswerLocalService.deleteAnswer(answerid);
	}

	@Override
	public FAQAnswerLocalService getWrappedService() {
		return _faqAnswerLocalService;
	}

	@Override
	public void setWrappedService(FAQAnswerLocalService faqAnswerLocalService) {
		_faqAnswerLocalService = faqAnswerLocalService;
	}

	private FAQAnswerLocalService _faqAnswerLocalService;
}