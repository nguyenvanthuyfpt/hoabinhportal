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
 * Provides a wrapper for {@link VLegalTypeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTypeLocalService
 * @generated
 */
@ProviderType
public class VLegalTypeLocalServiceWrapper implements VLegalTypeLocalService,
	ServiceWrapper<VLegalTypeLocalService> {
	public VLegalTypeLocalServiceWrapper(
		VLegalTypeLocalService vLegalTypeLocalService) {
		_vLegalTypeLocalService = vLegalTypeLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vLegalTypeLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalTypeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countTypeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalTypeLocalService.countTypeByGroupId(groupId);
	}

	/**
	* Returns the number of v legal types.
	*
	* @return the number of v legal types
	*/
	@Override
	public int getVLegalTypesCount() {
		return _vLegalTypeLocalService.getVLegalTypesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vLegalTypeLocalService.getOSGiServiceIdentifier();
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
		return _vLegalTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalTypeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalTypeLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalType> getAllTypes()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalTypeLocalService.getAllTypes();
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalType> getTypeByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalTypeLocalService.getTypeByGroupId(groupId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalType> getTypeByGroupId(
		long groupId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalTypeLocalService.getTypeByGroupId(groupId, begin, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalType> getTypesByL_RSS(
		long groupId, boolean status, boolean rss)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalTypeLocalService.getTypesByL_RSS(groupId, status, rss);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalType> getTypesByL_S(
		long groupId, java.lang.String language, boolean status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalTypeLocalService.getTypesByL_S(groupId, language, status);
	}

	/**
	* Returns a range of all the v legal types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @return the range of v legal types
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalType> getVLegalTypes(
		int start, int end) {
		return _vLegalTypeLocalService.getVLegalTypes(start, end);
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
		return _vLegalTypeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vLegalTypeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalType addType(long groupId,
		java.lang.String name, java.lang.String description,
		java.lang.String language, boolean status, boolean rssable,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalTypeLocalService.addType(groupId, name, description,
			language, status, rssable, themeDisplay);
	}

	/**
	* Adds the v legal type to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalType the v legal type
	* @return the v legal type that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalType addVLegalType(
		vn.gov.hoabinh.model.VLegalType vLegalType) {
		return _vLegalTypeLocalService.addVLegalType(vLegalType);
	}

	/**
	* Creates a new v legal type with the primary key. Does not add the v legal type to the database.
	*
	* @param typeId the primary key for the new v legal type
	* @return the new v legal type
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalType createVLegalType(
		java.lang.String typeId) {
		return _vLegalTypeLocalService.createVLegalType(typeId);
	}

	/**
	* Deletes the v legal type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the v legal type
	* @return the v legal type that was removed
	* @throws PortalException if a v legal type with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalType deleteVLegalType(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalTypeLocalService.deleteVLegalType(typeId);
	}

	/**
	* Deletes the v legal type from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalType the v legal type
	* @return the v legal type that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalType deleteVLegalType(
		vn.gov.hoabinh.model.VLegalType vLegalType) {
		return _vLegalTypeLocalService.deleteVLegalType(vLegalType);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalType fetchVLegalType(
		java.lang.String typeId) {
		return _vLegalTypeLocalService.fetchVLegalType(typeId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalType getType(java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalTypeLocalService.getType(typeId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalType getType(long groupId,
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalTypeLocalService.getType(groupId, typeId);
	}

	/**
	* Returns the v legal type with the primary key.
	*
	* @param typeId the primary key of the v legal type
	* @return the v legal type
	* @throws PortalException if a v legal type with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalType getVLegalType(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalTypeLocalService.getVLegalType(typeId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalType updateType(long groupId,
		java.lang.String typeId, java.lang.String language,
		java.lang.String name, java.lang.String description, int position,
		boolean status, boolean rssable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalTypeLocalService.updateType(groupId, typeId, language,
			name, description, position, status, rssable);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalType updateType(
		vn.gov.hoabinh.model.VLegalType lType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalTypeLocalService.updateType(lType);
	}

	/**
	* Updates the v legal type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalType the v legal type
	* @return the v legal type that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalType updateVLegalType(
		vn.gov.hoabinh.model.VLegalType vLegalType) {
		return _vLegalTypeLocalService.updateVLegalType(vLegalType);
	}

	@Override
	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalTypeLocalService.addEntryResources(entryId,
			addCommunityPermissions, addGuestPermissions);
	}

	@Override
	public void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalTypeLocalService.addEntryResources(entryId,
			communityPermissions, guestPermissions);
	}

	@Override
	public void addEntryResources(vn.gov.hoabinh.model.VLegalType entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalTypeLocalService.addEntryResources(entry,
			addCommunityPermissions, addGuestPermissions);
	}

	@Override
	public void addEntryResources(vn.gov.hoabinh.model.VLegalType entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalTypeLocalService.addEntryResources(entry, communityPermissions,
			guestPermissions);
	}

	@Override
	public void deleteType(java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalTypeLocalService.deleteType(typeId);
	}

	@Override
	public void deleteTypeAndDocs(java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalTypeLocalService.deleteTypeAndDocs(typeId);
	}

	@Override
	public VLegalTypeLocalService getWrappedService() {
		return _vLegalTypeLocalService;
	}

	@Override
	public void setWrappedService(VLegalTypeLocalService vLegalTypeLocalService) {
		_vLegalTypeLocalService = vLegalTypeLocalService;
	}

	private VLegalTypeLocalService _vLegalTypeLocalService;
}