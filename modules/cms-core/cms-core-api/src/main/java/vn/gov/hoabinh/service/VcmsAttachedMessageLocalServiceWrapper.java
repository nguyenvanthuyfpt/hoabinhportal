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
 * Provides a wrapper for {@link VcmsAttachedMessageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsAttachedMessageLocalService
 * @generated
 */
@ProviderType
public class VcmsAttachedMessageLocalServiceWrapper
	implements VcmsAttachedMessageLocalService,
		ServiceWrapper<VcmsAttachedMessageLocalService> {
	public VcmsAttachedMessageLocalServiceWrapper(
		VcmsAttachedMessageLocalService vcmsAttachedMessageLocalService) {
		_vcmsAttachedMessageLocalService = vcmsAttachedMessageLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vcmsAttachedMessageLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsAttachedMessageLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsAttachedMessageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vcms attached messages.
	*
	* @return the number of vcms attached messages
	*/
	@Override
	public int getVcmsAttachedMessagesCount() {
		return _vcmsAttachedMessageLocalService.getVcmsAttachedMessagesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vcmsAttachedMessageLocalService.getOSGiServiceIdentifier();
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
		return _vcmsAttachedMessageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsAttachedMessageLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsAttachedMessageLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsAttachedMessage> getAttachedMessageByArticle(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsAttachedMessageLocalService.getAttachedMessageByArticle(articleId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsAttachedMessage> getAttachedMessageByG(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsAttachedMessageLocalService.getAttachedMessageByG(groupId);
	}

	/**
	* Returns a range of all the vcms attached messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @return the range of vcms attached messages
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsAttachedMessage> getVcmsAttachedMessages(
		int start, int end) {
		return _vcmsAttachedMessageLocalService.getVcmsAttachedMessages(start,
			end);
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
		return _vcmsAttachedMessageLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vcmsAttachedMessageLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsAttachedMessage addAttachedMessage(
		long groupId, java.lang.String createdByUser,
		java.lang.String articleId, java.lang.String message)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsAttachedMessageLocalService.addAttachedMessage(groupId,
			createdByUser, articleId, message);
	}

	/**
	* Adds the vcms attached message to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsAttachedMessage the vcms attached message
	* @return the vcms attached message that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsAttachedMessage addVcmsAttachedMessage(
		vn.gov.hoabinh.model.VcmsAttachedMessage vcmsAttachedMessage) {
		return _vcmsAttachedMessageLocalService.addVcmsAttachedMessage(vcmsAttachedMessage);
	}

	/**
	* Creates a new vcms attached message with the primary key. Does not add the vcms attached message to the database.
	*
	* @param messageId the primary key for the new vcms attached message
	* @return the new vcms attached message
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsAttachedMessage createVcmsAttachedMessage(
		java.lang.String messageId) {
		return _vcmsAttachedMessageLocalService.createVcmsAttachedMessage(messageId);
	}

	/**
	* Deletes the vcms attached message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the vcms attached message
	* @return the vcms attached message that was removed
	* @throws PortalException if a vcms attached message with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsAttachedMessage deleteVcmsAttachedMessage(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsAttachedMessageLocalService.deleteVcmsAttachedMessage(messageId);
	}

	/**
	* Deletes the vcms attached message from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsAttachedMessage the vcms attached message
	* @return the vcms attached message that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsAttachedMessage deleteVcmsAttachedMessage(
		vn.gov.hoabinh.model.VcmsAttachedMessage vcmsAttachedMessage) {
		return _vcmsAttachedMessageLocalService.deleteVcmsAttachedMessage(vcmsAttachedMessage);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsAttachedMessage fetchVcmsAttachedMessage(
		java.lang.String messageId) {
		return _vcmsAttachedMessageLocalService.fetchVcmsAttachedMessage(messageId);
	}

	/**
	* Returns the vcms attached message with the primary key.
	*
	* @param messageId the primary key of the vcms attached message
	* @return the vcms attached message
	* @throws PortalException if a vcms attached message with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsAttachedMessage getVcmsAttachedMessage(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsAttachedMessageLocalService.getVcmsAttachedMessage(messageId);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsAttachedMessage updateAttachedMessage(
		java.lang.String messageId, boolean read)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsAttachedMessageLocalService.updateAttachedMessage(messageId,
			read);
	}

	/**
	* Updates the vcms attached message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsAttachedMessage the vcms attached message
	* @return the vcms attached message that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsAttachedMessage updateVcmsAttachedMessage(
		vn.gov.hoabinh.model.VcmsAttachedMessage vcmsAttachedMessage) {
		return _vcmsAttachedMessageLocalService.updateVcmsAttachedMessage(vcmsAttachedMessage);
	}

	@Override
	public VcmsAttachedMessageLocalService getWrappedService() {
		return _vcmsAttachedMessageLocalService;
	}

	@Override
	public void setWrappedService(
		VcmsAttachedMessageLocalService vcmsAttachedMessageLocalService) {
		_vcmsAttachedMessageLocalService = vcmsAttachedMessageLocalService;
	}

	private VcmsAttachedMessageLocalService _vcmsAttachedMessageLocalService;
}