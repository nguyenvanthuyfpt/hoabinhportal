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
 * Provides a wrapper for {@link FAQCommentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FAQCommentLocalService
 * @generated
 */
@ProviderType
public class FAQCommentLocalServiceWrapper implements FAQCommentLocalService,
	ServiceWrapper<FAQCommentLocalService> {
	public FAQCommentLocalServiceWrapper(
		FAQCommentLocalService faqCommentLocalService) {
		_faqCommentLocalService = faqCommentLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _faqCommentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _faqCommentLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _faqCommentLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqCommentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqCommentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of f a q comments.
	*
	* @return the number of f a q comments
	*/
	@Override
	public int getFAQCommentsCount() {
		return _faqCommentLocalService.getFAQCommentsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _faqCommentLocalService.getOSGiServiceIdentifier();
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
		return _faqCommentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _faqCommentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _faqCommentLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQComment> getAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCommentLocalService.getAll();
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQComment> getByAnswer(
		long answerid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCommentLocalService.getByAnswer(answerid);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQComment> getByApproved(
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCommentLocalService.getByApproved(approved);
	}

	/**
	* Returns a range of all the f a q comments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQCommentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q comments
	* @param end the upper bound of the range of f a q comments (not inclusive)
	* @return the range of f a q comments
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQComment> getFAQComments(
		int start, int end) {
		return _faqCommentLocalService.getFAQComments(start, end);
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
		return _faqCommentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _faqCommentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.FAQComment addComment(long answerId,
		java.lang.String content, java.lang.String commName,
		java.lang.String commEmail, boolean approved,
		java.lang.String approveByUser, java.util.Date approvedDate,
		java.util.Date commDate, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCommentLocalService.addComment(answerId, content, commName,
			commEmail, approved, approveByUser, approvedDate, commDate, userId);
	}

	/**
	* Adds the f a q comment to the database. Also notifies the appropriate model listeners.
	*
	* @param faqComment the f a q comment
	* @return the f a q comment that was added
	*/
	@Override
	public vn.gov.hoabinh.model.FAQComment addFAQComment(
		vn.gov.hoabinh.model.FAQComment faqComment) {
		return _faqCommentLocalService.addFAQComment(faqComment);
	}

	/**
	* Creates a new f a q comment with the primary key. Does not add the f a q comment to the database.
	*
	* @param id the primary key for the new f a q comment
	* @return the new f a q comment
	*/
	@Override
	public vn.gov.hoabinh.model.FAQComment createFAQComment(long id) {
		return _faqCommentLocalService.createFAQComment(id);
	}

	/**
	* Deletes the f a q comment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q comment
	* @return the f a q comment that was removed
	* @throws PortalException if a f a q comment with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.FAQComment deleteFAQComment(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqCommentLocalService.deleteFAQComment(id);
	}

	/**
	* Deletes the f a q comment from the database. Also notifies the appropriate model listeners.
	*
	* @param faqComment the f a q comment
	* @return the f a q comment that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.FAQComment deleteFAQComment(
		vn.gov.hoabinh.model.FAQComment faqComment) {
		return _faqCommentLocalService.deleteFAQComment(faqComment);
	}

	@Override
	public vn.gov.hoabinh.model.FAQComment fetchFAQComment(long id) {
		return _faqCommentLocalService.fetchFAQComment(id);
	}

	@Override
	public vn.gov.hoabinh.model.FAQComment getComment(long commentid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCommentLocalService.getComment(commentid);
	}

	/**
	* Returns the f a q comment with the primary key.
	*
	* @param id the primary key of the f a q comment
	* @return the f a q comment
	* @throws PortalException if a f a q comment with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.FAQComment getFAQComment(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqCommentLocalService.getFAQComment(id);
	}

	@Override
	public vn.gov.hoabinh.model.FAQComment unapproved(long commentid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCommentLocalService.unapproved(commentid);
	}

	@Override
	public vn.gov.hoabinh.model.FAQComment updateComment(long commentId,
		java.lang.String content, boolean approved,
		java.lang.String approveByUser, java.util.Date approvedDate, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCommentLocalService.updateComment(commentId, content,
			approved, approveByUser, approvedDate, userId);
	}

	/**
	* Updates the f a q comment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param faqComment the f a q comment
	* @return the f a q comment that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.FAQComment updateFAQComment(
		vn.gov.hoabinh.model.FAQComment faqComment) {
		return _faqCommentLocalService.updateFAQComment(faqComment);
	}

	@Override
	public void deleteComment(long commentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_faqCommentLocalService.deleteComment(commentId);
	}

	@Override
	public FAQCommentLocalService getWrappedService() {
		return _faqCommentLocalService;
	}

	@Override
	public void setWrappedService(FAQCommentLocalService faqCommentLocalService) {
		_faqCommentLocalService = faqCommentLocalService;
	}

	private FAQCommentLocalService _faqCommentLocalService;
}