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
 * Provides a wrapper for {@link VLegalAttachedMessageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalAttachedMessageLocalService
 * @generated
 */
@ProviderType
public class VLegalAttachedMessageLocalServiceWrapper
	implements VLegalAttachedMessageLocalService,
		ServiceWrapper<VLegalAttachedMessageLocalService> {
	public VLegalAttachedMessageLocalServiceWrapper(
		VLegalAttachedMessageLocalService vLegalAttachedMessageLocalService) {
		_vLegalAttachedMessageLocalService = vLegalAttachedMessageLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vLegalAttachedMessageLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalAttachedMessageLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalAttachedMessageLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int count(java.lang.String articleId, boolean read)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalAttachedMessageLocalService.count(articleId, read);
	}

	/**
	* Returns the number of v legal attached messages.
	*
	* @return the number of v legal attached messages
	*/
	@Override
	public int getVLegalAttachedMessagesCount() {
		return _vLegalAttachedMessageLocalService.getVLegalAttachedMessagesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vLegalAttachedMessageLocalService.getOSGiServiceIdentifier();
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
		return _vLegalAttachedMessageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalAttachedMessageLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalAttachedMessageLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalAttachedMessage> getAllMessageByStatus(
		long groupId, boolean read)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalAttachedMessageLocalService.getAllMessageByStatus(groupId,
			read);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalAttachedMessage> getMessages(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalAttachedMessageLocalService.getMessages(articleId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalAttachedMessage> getMessages(
		java.lang.String articleId, boolean read)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalAttachedMessageLocalService.getMessages(articleId, read);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalAttachedMessage> getMessages(
		java.lang.String[] messageIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalAttachedMessageLocalService.getMessages(messageIds);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalAttachedMessage> getMessagesByGroup(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalAttachedMessageLocalService.getMessagesByGroup(groupId);
	}

	/**
	* Returns a range of all the v legal attached messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @return the range of v legal attached messages
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalAttachedMessage> getVLegalAttachedMessages(
		int start, int end) {
		return _vLegalAttachedMessageLocalService.getVLegalAttachedMessages(start,
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
		return _vLegalAttachedMessageLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vLegalAttachedMessageLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalAttachedMessage addMessage(long userId,
		long companyId, long groupId, java.lang.String articleId,
		java.lang.String content, boolean read)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalAttachedMessageLocalService.addMessage(userId, companyId,
			groupId, articleId, content, read);
	}

	/**
	* Adds the v legal attached message to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalAttachedMessage the v legal attached message
	* @return the v legal attached message that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalAttachedMessage addVLegalAttachedMessage(
		vn.gov.hoabinh.model.VLegalAttachedMessage vLegalAttachedMessage) {
		return _vLegalAttachedMessageLocalService.addVLegalAttachedMessage(vLegalAttachedMessage);
	}

	/**
	* Creates a new v legal attached message with the primary key. Does not add the v legal attached message to the database.
	*
	* @param messageId the primary key for the new v legal attached message
	* @return the new v legal attached message
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalAttachedMessage createVLegalAttachedMessage(
		java.lang.String messageId) {
		return _vLegalAttachedMessageLocalService.createVLegalAttachedMessage(messageId);
	}

	/**
	* Deletes the v legal attached message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the v legal attached message
	* @return the v legal attached message that was removed
	* @throws PortalException if a v legal attached message with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalAttachedMessage deleteVLegalAttachedMessage(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalAttachedMessageLocalService.deleteVLegalAttachedMessage(messageId);
	}

	/**
	* Deletes the v legal attached message from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalAttachedMessage the v legal attached message
	* @return the v legal attached message that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalAttachedMessage deleteVLegalAttachedMessage(
		vn.gov.hoabinh.model.VLegalAttachedMessage vLegalAttachedMessage) {
		return _vLegalAttachedMessageLocalService.deleteVLegalAttachedMessage(vLegalAttachedMessage);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalAttachedMessage fetchVLegalAttachedMessage(
		java.lang.String messageId) {
		return _vLegalAttachedMessageLocalService.fetchVLegalAttachedMessage(messageId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalAttachedMessage getMessage(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalAttachedMessageLocalService.getMessage(messageId);
	}

	/**
	* Returns the v legal attached message with the primary key.
	*
	* @param messageId the primary key of the v legal attached message
	* @return the v legal attached message
	* @throws PortalException if a v legal attached message with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalAttachedMessage getVLegalAttachedMessage(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalAttachedMessageLocalService.getVLegalAttachedMessage(messageId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalAttachedMessage updateMessage(
		java.lang.String messageId, boolean read)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalAttachedMessageLocalService.updateMessage(messageId, read);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalAttachedMessage updateMessage(
		vn.gov.hoabinh.model.VLegalAttachedMessage message)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalAttachedMessageLocalService.updateMessage(message);
	}

	/**
	* Updates the v legal attached message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalAttachedMessage the v legal attached message
	* @return the v legal attached message that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalAttachedMessage updateVLegalAttachedMessage(
		vn.gov.hoabinh.model.VLegalAttachedMessage vLegalAttachedMessage) {
		return _vLegalAttachedMessageLocalService.updateVLegalAttachedMessage(vLegalAttachedMessage);
	}

	@Override
	public void deleteMessage(java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalAttachedMessageLocalService.deleteMessage(messageId);
	}

	@Override
	public void deleteMessages(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalAttachedMessageLocalService.deleteMessages(articleId);
	}

	@Override
	public VLegalAttachedMessageLocalService getWrappedService() {
		return _vLegalAttachedMessageLocalService;
	}

	@Override
	public void setWrappedService(
		VLegalAttachedMessageLocalService vLegalAttachedMessageLocalService) {
		_vLegalAttachedMessageLocalService = vLegalAttachedMessageLocalService;
	}

	private VLegalAttachedMessageLocalService _vLegalAttachedMessageLocalService;
}