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
 * Provides a wrapper for {@link VcmsTypeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsTypeLocalService
 * @generated
 */
@ProviderType
public class VcmsTypeLocalServiceWrapper implements VcmsTypeLocalService,
	ServiceWrapper<VcmsTypeLocalService> {
	public VcmsTypeLocalServiceWrapper(
		VcmsTypeLocalService vcmsTypeLocalService) {
		_vcmsTypeLocalService = vcmsTypeLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vcmsTypeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vcmsTypeLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vcmsTypeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsTypeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countTypesByS_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsTypeLocalService.countTypesByS_L(groupId, language);
	}

	/**
	* Returns the number of vcms types.
	*
	* @return the number of vcms types
	*/
	@Override
	public int getVcmsTypesCount() {
		return _vcmsTypeLocalService.getVcmsTypesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vcmsTypeLocalService.getOSGiServiceIdentifier();
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
		return _vcmsTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsTypeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsTypeLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsType> getTypesByS_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsTypeLocalService.getTypesByS_L(groupId, language);
	}

	@Override
	public java.util.List getTypesByS_L(long groupId,
		java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsTypeLocalService.getTypesByS_L(groupId, language, start, end);
	}

	/**
	* Returns a range of all the vcms types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms types
	* @param end the upper bound of the range of vcms types (not inclusive)
	* @return the range of vcms types
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsType> getVcmsTypes(
		int start, int end) {
		return _vcmsTypeLocalService.getVcmsTypes(start, end);
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
		return _vcmsTypeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vcmsTypeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsType addType(long groupId, long companyId,
		long plid, java.lang.String code, java.lang.String name,
		java.lang.String description, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vcmsTypeLocalService.addType(groupId, companyId, plid, code,
			name, description, language);
	}

	/**
	* Adds the vcms type to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsType the vcms type
	* @return the vcms type that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsType addVcmsType(
		vn.gov.hoabinh.model.VcmsType vcmsType) {
		return _vcmsTypeLocalService.addVcmsType(vcmsType);
	}

	/**
	* Creates a new vcms type with the primary key. Does not add the vcms type to the database.
	*
	* @param typeId the primary key for the new vcms type
	* @return the new vcms type
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsType createVcmsType(long typeId) {
		return _vcmsTypeLocalService.createVcmsType(typeId);
	}

	/**
	* Deletes the vcms type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the vcms type
	* @return the vcms type that was removed
	* @throws PortalException if a vcms type with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsType deleteVcmsType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsTypeLocalService.deleteVcmsType(typeId);
	}

	/**
	* Deletes the vcms type from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsType the vcms type
	* @return the vcms type that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsType deleteVcmsType(
		vn.gov.hoabinh.model.VcmsType vcmsType) {
		return _vcmsTypeLocalService.deleteVcmsType(vcmsType);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsType fetchVcmsType(long typeId) {
		return _vcmsTypeLocalService.fetchVcmsType(typeId);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsType getType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsTypeLocalService.getType(typeId);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsType getTypeByS_C(long groupId,
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsTypeLocalService.getTypeByS_C(groupId, code);
	}

	/**
	* Returns the vcms type with the primary key.
	*
	* @param typeId the primary key of the vcms type
	* @return the vcms type
	* @throws PortalException if a vcms type with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsType getVcmsType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsTypeLocalService.getVcmsType(typeId);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsType updateType(long typeId, long groupId,
		long companyId, java.lang.String code, java.lang.String name,
		java.lang.String description, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsTypeLocalService.updateType(typeId, groupId, companyId,
			code, name, description, language);
	}

	/**
	* Updates the vcms type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsType the vcms type
	* @return the vcms type that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsType updateVcmsType(
		vn.gov.hoabinh.model.VcmsType vcmsType) {
		return _vcmsTypeLocalService.updateVcmsType(vcmsType);
	}

	@Override
	public void deleteType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsTypeLocalService.deleteType(typeId);
	}

	@Override
	public VcmsTypeLocalService getWrappedService() {
		return _vcmsTypeLocalService;
	}

	@Override
	public void setWrappedService(VcmsTypeLocalService vcmsTypeLocalService) {
		_vcmsTypeLocalService = vcmsTypeLocalService;
	}

	private VcmsTypeLocalService _vcmsTypeLocalService;
}