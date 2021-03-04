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
 * Provides a wrapper for {@link VcmsDiscussionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsDiscussionLocalService
 * @generated
 */
@ProviderType
public class VcmsDiscussionLocalServiceWrapper
	implements VcmsDiscussionLocalService,
		ServiceWrapper<VcmsDiscussionLocalService> {
	public VcmsDiscussionLocalServiceWrapper(
		VcmsDiscussionLocalService vcmsDiscussionLocalService) {
		_vcmsDiscussionLocalService = vcmsDiscussionLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vcmsDiscussionLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsDiscussionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsDiscussionLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countByApproval(long groupId, java.lang.String language,
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsDiscussionLocalService.countByApproval(groupId, language,
			approved);
	}

	/**
	* Returns the number of vcms discussions.
	*
	* @return the number of vcms discussions
	*/
	@Override
	public int getVcmsDiscussionsCount() {
		return _vcmsDiscussionLocalService.getVcmsDiscussionsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vcmsDiscussionLocalService.getOSGiServiceIdentifier();
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
		return _vcmsDiscussionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsDiscussionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsDiscussionLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsDiscussion> getDiscussions(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsDiscussionLocalService.getDiscussions(articleId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsDiscussion> getDiscussions(
		java.lang.String articleId, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsDiscussionLocalService.getDiscussions(articleId, approved);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsDiscussion> getDiscussionsByA_P_L_A(
		java.lang.String articleId, long groupId, java.lang.String language,
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsDiscussionLocalService.getDiscussionsByA_P_L_A(articleId,
			groupId, language, approved);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsDiscussion> getDiscussionsByP_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsDiscussionLocalService.getDiscussionsByP_L(groupId, language);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsDiscussion> getDiscussionsByP_L_A(
		long groupId, java.lang.String language, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsDiscussionLocalService.getDiscussionsByP_L_A(groupId,
			language, approved);
	}

	/**
	* Returns a range of all the vcms discussions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @return the range of vcms discussions
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsDiscussion> getVcmsDiscussions(
		int start, int end) {
		return _vcmsDiscussionLocalService.getVcmsDiscussions(start, end);
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
		return _vcmsDiscussionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vcmsDiscussionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsDiscussion addDiscussion(
		java.lang.String visitorName, java.lang.String visitorEmail,
		java.lang.String visitorPhone, long groupId, long companyId,
		java.lang.String articleId, java.lang.String title,
		java.lang.String content, boolean hasAttachment,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsDiscussionLocalService.addDiscussion(visitorName,
			visitorEmail, visitorPhone, groupId, companyId, articleId, title,
			content, hasAttachment, language);
	}

	/**
	* Adds the vcms discussion to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsDiscussion the vcms discussion
	* @return the vcms discussion that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsDiscussion addVcmsDiscussion(
		vn.gov.hoabinh.model.VcmsDiscussion vcmsDiscussion) {
		return _vcmsDiscussionLocalService.addVcmsDiscussion(vcmsDiscussion);
	}

	/**
	* Creates a new vcms discussion with the primary key. Does not add the vcms discussion to the database.
	*
	* @param discussionId the primary key for the new vcms discussion
	* @return the new vcms discussion
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsDiscussion createVcmsDiscussion(
		java.lang.String discussionId) {
		return _vcmsDiscussionLocalService.createVcmsDiscussion(discussionId);
	}

	/**
	* Deletes the vcms discussion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param discussionId the primary key of the vcms discussion
	* @return the vcms discussion that was removed
	* @throws PortalException if a vcms discussion with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsDiscussion deleteVcmsDiscussion(
		java.lang.String discussionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsDiscussionLocalService.deleteVcmsDiscussion(discussionId);
	}

	/**
	* Deletes the vcms discussion from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsDiscussion the vcms discussion
	* @return the vcms discussion that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsDiscussion deleteVcmsDiscussion(
		vn.gov.hoabinh.model.VcmsDiscussion vcmsDiscussion) {
		return _vcmsDiscussionLocalService.deleteVcmsDiscussion(vcmsDiscussion);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsDiscussion fetchVcmsDiscussion(
		java.lang.String discussionId) {
		return _vcmsDiscussionLocalService.fetchVcmsDiscussion(discussionId);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsDiscussion getDiscussion(
		java.lang.String discussionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsDiscussionLocalService.getDiscussion(discussionId);
	}

	/**
	* Returns the vcms discussion with the primary key.
	*
	* @param discussionId the primary key of the vcms discussion
	* @return the vcms discussion
	* @throws PortalException if a vcms discussion with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsDiscussion getVcmsDiscussion(
		java.lang.String discussionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsDiscussionLocalService.getVcmsDiscussion(discussionId);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsDiscussion updateDiscussion(
		java.lang.String discussionId, java.lang.String visitorName,
		java.lang.String visitorEmail, java.lang.String visitorPhone,
		long groupId, long companyId, java.lang.String articleId,
		java.lang.String title, java.lang.String content,
		boolean hasAttachment, boolean approved, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsDiscussionLocalService.updateDiscussion(discussionId,
			visitorName, visitorEmail, visitorPhone, groupId, companyId,
			articleId, title, content, hasAttachment, approved, language);
	}

	/**
	* Updates the vcms discussion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsDiscussion the vcms discussion
	* @return the vcms discussion that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsDiscussion updateVcmsDiscussion(
		vn.gov.hoabinh.model.VcmsDiscussion vcmsDiscussion) {
		return _vcmsDiscussionLocalService.updateVcmsDiscussion(vcmsDiscussion);
	}

	@Override
	public void deleteDiscussions(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsDiscussionLocalService.deleteDiscussions(articleId);
	}

	@Override
	public void deleteDiscussions(java.lang.String articleId, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsDiscussionLocalService.deleteDiscussions(articleId, approved);
	}

	@Override
	public VcmsDiscussionLocalService getWrappedService() {
		return _vcmsDiscussionLocalService;
	}

	@Override
	public void setWrappedService(
		VcmsDiscussionLocalService vcmsDiscussionLocalService) {
		_vcmsDiscussionLocalService = vcmsDiscussionLocalService;
	}

	private VcmsDiscussionLocalService _vcmsDiscussionLocalService;
}