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
 * Provides a wrapper for {@link AdvTypeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AdvTypeLocalService
 * @generated
 */
@ProviderType
public class AdvTypeLocalServiceWrapper implements AdvTypeLocalService,
	ServiceWrapper<AdvTypeLocalService> {
	public AdvTypeLocalServiceWrapper(AdvTypeLocalService advTypeLocalService) {
		_advTypeLocalService = advTypeLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _advTypeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _advTypeLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _advTypeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advTypeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countTypeByG(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advTypeLocalService.countTypeByG(groupId);
	}

	/**
	* Returns the number of adv types.
	*
	* @return the number of adv types
	*/
	@Override
	public int getAdvTypesCount() {
		return _advTypeLocalService.getAdvTypesCount();
	}

	@Override
	public int getItemCount(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advTypeLocalService.getItemCount(typeId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _advTypeLocalService.getOSGiServiceIdentifier();
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
		return _advTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.AdvTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _advTypeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.AdvTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _advTypeLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the adv types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.AdvTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv types
	* @param end the upper bound of the range of adv types (not inclusive)
	* @return the range of adv types
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.AdvType> getAdvTypes(int start,
		int end) {
		return _advTypeLocalService.getAdvTypes(start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.AdvType> getTypeByG(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advTypeLocalService.getTypeByG(groupId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.AdvType> getTypeByG(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advTypeLocalService.getTypeByG(groupId, start, end);
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
		return _advTypeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _advTypeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the adv type to the database. Also notifies the appropriate model listeners.
	*
	* @param advType the adv type
	* @return the adv type that was added
	*/
	@Override
	public vn.gov.hoabinh.model.AdvType addAdvType(
		vn.gov.hoabinh.model.AdvType advType) {
		return _advTypeLocalService.addAdvType(advType);
	}

	@Override
	public vn.gov.hoabinh.model.AdvType addType(long groupId, long companyId,
		long plid, java.lang.String name, java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advTypeLocalService.addType(groupId, companyId, plid, name,
			description);
	}

	/**
	* Creates a new adv type with the primary key. Does not add the adv type to the database.
	*
	* @param typeId the primary key for the new adv type
	* @return the new adv type
	*/
	@Override
	public vn.gov.hoabinh.model.AdvType createAdvType(long typeId) {
		return _advTypeLocalService.createAdvType(typeId);
	}

	/**
	* Deletes the adv type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the adv type
	* @return the adv type that was removed
	* @throws PortalException if a adv type with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.AdvType deleteAdvType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advTypeLocalService.deleteAdvType(typeId);
	}

	/**
	* Deletes the adv type from the database. Also notifies the appropriate model listeners.
	*
	* @param advType the adv type
	* @return the adv type that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.AdvType deleteAdvType(
		vn.gov.hoabinh.model.AdvType advType) {
		return _advTypeLocalService.deleteAdvType(advType);
	}

	@Override
	public vn.gov.hoabinh.model.AdvType fetchAdvType(long typeId) {
		return _advTypeLocalService.fetchAdvType(typeId);
	}

	/**
	* Returns the adv type with the primary key.
	*
	* @param typeId the primary key of the adv type
	* @return the adv type
	* @throws PortalException if a adv type with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.AdvType getAdvType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advTypeLocalService.getAdvType(typeId);
	}

	@Override
	public vn.gov.hoabinh.model.AdvType getType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advTypeLocalService.getType(typeId);
	}

	/**
	* Updates the adv type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param advType the adv type
	* @return the adv type that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.AdvType updateAdvType(
		vn.gov.hoabinh.model.AdvType advType) {
		return _advTypeLocalService.updateAdvType(advType);
	}

	@Override
	public vn.gov.hoabinh.model.AdvType updateType(long typeId, long groupId,
		long companyId, long plid, java.lang.String name,
		java.lang.String description)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advTypeLocalService.updateType(typeId, groupId, companyId,
			plid, name, description);
	}

	@Override
	public AdvTypeLocalService getWrappedService() {
		return _advTypeLocalService;
	}

	@Override
	public void setWrappedService(AdvTypeLocalService advTypeLocalService) {
		_advTypeLocalService = advTypeLocalService;
	}

	private AdvTypeLocalService _advTypeLocalService;
}