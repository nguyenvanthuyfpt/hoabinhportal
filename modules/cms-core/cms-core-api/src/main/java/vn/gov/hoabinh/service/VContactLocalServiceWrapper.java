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
 * Provides a wrapper for {@link VContactLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VContactLocalService
 * @generated
 */
@ProviderType
public class VContactLocalServiceWrapper implements VContactLocalService,
	ServiceWrapper<VContactLocalService> {
	public VContactLocalServiceWrapper(
		VContactLocalService vContactLocalService) {
		_vContactLocalService = vContactLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vContactLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildSearch(
		long groupId, java.lang.String guestName, java.lang.String email,
		java.lang.String title, java.lang.String address,
		java.lang.String phone, int status, boolean isCount) {
		return _vContactLocalService.buildSearch(groupId, guestName, email,
			title, address, phone, status, isCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vContactLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vContactLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vContactLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vContactLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countByG_S(long groupId, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vContactLocalService.countByG_S(groupId, status);
	}

	@Override
	public int countContact(long groupId, java.lang.String guestName,
		java.lang.String email, java.lang.String title,
		java.lang.String address, java.lang.String phone, int status) {
		return _vContactLocalService.countContact(groupId, guestName, email,
			title, address, phone, status);
	}

	@Override
	public int countContactByG(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vContactLocalService.countContactByG(groupId);
	}

	/**
	* Returns the number of v contacts.
	*
	* @return the number of v contacts
	*/
	@Override
	public int getVContactsCount() {
		return _vContactLocalService.getVContactsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vContactLocalService.getOSGiServiceIdentifier();
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
		return _vContactLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vContactLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vContactLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VContact> getAll()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vContactLocalService.getAll();
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VContact> getByG_S(
		long groupId, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vContactLocalService.getByG_S(groupId, status);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VContact> getByG_S(
		long groupId, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vContactLocalService.getByG_S(groupId, status, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VContact> getByStatus(int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vContactLocalService.getByStatus(status);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VContact> getContactByG(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vContactLocalService.getContactByG(groupId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VContact> getContactByG(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vContactLocalService.getContactByG(groupId, start, end);
	}

	/**
	* Returns a range of all the v contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v contacts
	* @param end the upper bound of the range of v contacts (not inclusive)
	* @return the range of v contacts
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VContact> getVContacts(
		int start, int end) {
		return _vContactLocalService.getVContacts(start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VContact> searchContact(
		long groupId, java.lang.String guestName, java.lang.String email,
		java.lang.String title, java.lang.String address,
		java.lang.String phone, int status, int start, int end) {
		return _vContactLocalService.searchContact(groupId, guestName, email,
			title, address, phone, status, start, end);
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
		return _vContactLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vContactLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.gov.hoabinh.model.VContact addContact(long groupId,
		long companyId, long plid, java.lang.String guestName,
		java.lang.String email, java.lang.String title,
		java.lang.String address, java.lang.String phone, java.lang.String fax,
		java.lang.String content, boolean hasAttach, int status, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vContactLocalService.addContact(groupId, companyId, plid,
			guestName, email, title, address, phone, fax, content, hasAttach,
			status, userId);
	}

	/**
	* Adds the v contact to the database. Also notifies the appropriate model listeners.
	*
	* @param vContact the v contact
	* @return the v contact that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VContact addVContact(
		vn.gov.hoabinh.model.VContact vContact) {
		return _vContactLocalService.addVContact(vContact);
	}

	/**
	* Creates a new v contact with the primary key. Does not add the v contact to the database.
	*
	* @param id the primary key for the new v contact
	* @return the new v contact
	*/
	@Override
	public vn.gov.hoabinh.model.VContact createVContact(long id) {
		return _vContactLocalService.createVContact(id);
	}

	/**
	* Deletes the v contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the v contact
	* @return the v contact that was removed
	* @throws PortalException if a v contact with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VContact deleteVContact(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vContactLocalService.deleteVContact(id);
	}

	/**
	* Deletes the v contact from the database. Also notifies the appropriate model listeners.
	*
	* @param vContact the v contact
	* @return the v contact that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VContact deleteVContact(
		vn.gov.hoabinh.model.VContact vContact) {
		return _vContactLocalService.deleteVContact(vContact);
	}

	@Override
	public vn.gov.hoabinh.model.VContact fetchVContact(long id) {
		return _vContactLocalService.fetchVContact(id);
	}

	@Override
	public vn.gov.hoabinh.model.VContact getContact(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vContactLocalService.getContact(Id);
	}

	/**
	* Returns the v contact with the primary key.
	*
	* @param id the primary key of the v contact
	* @return the v contact
	* @throws PortalException if a v contact with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VContact getVContact(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vContactLocalService.getVContact(id);
	}

	@Override
	public vn.gov.hoabinh.model.VContact updateContact(long Id, long groupId,
		long companyId, java.lang.String guestName, java.lang.String email,
		java.lang.String title, java.lang.String address,
		java.lang.String phone, java.lang.String fax, java.lang.String content,
		boolean hasAttach, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vContactLocalService.updateContact(Id, groupId, companyId,
			guestName, email, title, address, phone, fax, content, hasAttach,
			status);
	}

	@Override
	public vn.gov.hoabinh.model.VContact updateContact(
		vn.gov.hoabinh.model.VContact contact)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vContactLocalService.updateContact(contact);
	}

	/**
	* Updates the v contact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vContact the v contact
	* @return the v contact that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VContact updateVContact(
		vn.gov.hoabinh.model.VContact vContact) {
		return _vContactLocalService.updateVContact(vContact);
	}

	@Override
	public void deleteContact(long Id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vContactLocalService.deleteContact(Id);
	}

	@Override
	public VContactLocalService getWrappedService() {
		return _vContactLocalService;
	}

	@Override
	public void setWrappedService(VContactLocalService vContactLocalService) {
		_vContactLocalService = vContactLocalService;
	}

	private VContactLocalService _vContactLocalService;
}