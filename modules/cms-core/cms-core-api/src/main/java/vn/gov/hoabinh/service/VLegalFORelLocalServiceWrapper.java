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
 * Provides a wrapper for {@link VLegalFORelLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFORelLocalService
 * @generated
 */
@ProviderType
public class VLegalFORelLocalServiceWrapper implements VLegalFORelLocalService,
	ServiceWrapper<VLegalFORelLocalService> {
	public VLegalFORelLocalServiceWrapper(
		VLegalFORelLocalService vLegalFORelLocalService) {
		_vLegalFORelLocalService = vLegalFORelLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vLegalFORelLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalFORelLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalFORelLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of v legal f o rels.
	*
	* @return the number of v legal f o rels
	*/
	@Override
	public int getVLegalFORelsCount() {
		return _vLegalFORelLocalService.getVLegalFORelsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vLegalFORelLocalService.getOSGiServiceIdentifier();
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
		return _vLegalFORelLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalFORelLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalFORelLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List getRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalFORelLocalService.getRelByField(fieldId);
	}

	@Override
	public java.util.List getRelByOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalFORelLocalService.getRelByOrg(orgId);
	}

	/**
	* Returns a range of all the v legal f o rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal f o rels
	* @param end the upper bound of the range of v legal f o rels (not inclusive)
	* @return the range of v legal f o rels
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalFORel> getVLegalFORels(
		int start, int end) {
		return _vLegalFORelLocalService.getVLegalFORels(start, end);
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
		return _vLegalFORelLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vLegalFORelLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalFORel addRelation(
		java.lang.String fieldId, java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalFORelLocalService.addRelation(fieldId, orgId);
	}

	/**
	* Adds the v legal f o rel to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFORel the v legal f o rel
	* @return the v legal f o rel that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalFORel addVLegalFORel(
		vn.gov.hoabinh.model.VLegalFORel vLegalFORel) {
		return _vLegalFORelLocalService.addVLegalFORel(vLegalFORel);
	}

	/**
	* Creates a new v legal f o rel with the primary key. Does not add the v legal f o rel to the database.
	*
	* @param vLegalFORelPK the primary key for the new v legal f o rel
	* @return the new v legal f o rel
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalFORel createVLegalFORel(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK) {
		return _vLegalFORelLocalService.createVLegalFORel(vLegalFORelPK);
	}

	/**
	* Deletes the v legal f o rel from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFORel the v legal f o rel
	* @return the v legal f o rel that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalFORel deleteVLegalFORel(
		vn.gov.hoabinh.model.VLegalFORel vLegalFORel) {
		return _vLegalFORelLocalService.deleteVLegalFORel(vLegalFORel);
	}

	/**
	* Deletes the v legal f o rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFORelPK the primary key of the v legal f o rel
	* @return the v legal f o rel that was removed
	* @throws PortalException if a v legal f o rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalFORel deleteVLegalFORel(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalFORelLocalService.deleteVLegalFORel(vLegalFORelPK);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalFORel fetchVLegalFORel(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK) {
		return _vLegalFORelLocalService.fetchVLegalFORel(vLegalFORelPK);
	}

	/**
	* Returns the v legal f o rel with the primary key.
	*
	* @param vLegalFORelPK the primary key of the v legal f o rel
	* @return the v legal f o rel
	* @throws PortalException if a v legal f o rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalFORel getVLegalFORel(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalFORelLocalService.getVLegalFORel(vLegalFORelPK);
	}

	/**
	* Updates the v legal f o rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalFORel the v legal f o rel
	* @return the v legal f o rel that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalFORel updateVLegalFORel(
		vn.gov.hoabinh.model.VLegalFORel vLegalFORel) {
		return _vLegalFORelLocalService.updateVLegalFORel(vLegalFORel);
	}

	@Override
	public void deleteRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalFORelLocalService.deleteRelByField(fieldId);
	}

	@Override
	public void deleteRelByOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalFORelLocalService.deleteRelByOrg(orgId);
	}

	@Override
	public void deleteRelation(java.lang.String fieldId, java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalFORelLocalService.deleteRelation(fieldId, orgId);
	}

	@Override
	public VLegalFORelLocalService getWrappedService() {
		return _vLegalFORelLocalService;
	}

	@Override
	public void setWrappedService(
		VLegalFORelLocalService vLegalFORelLocalService) {
		_vLegalFORelLocalService = vLegalFORelLocalService;
	}

	private VLegalFORelLocalService _vLegalFORelLocalService;
}