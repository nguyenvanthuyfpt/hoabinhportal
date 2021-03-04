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
 * Provides a wrapper for {@link VLegalDURelLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDURelLocalService
 * @generated
 */
@ProviderType
public class VLegalDURelLocalServiceWrapper implements VLegalDURelLocalService,
	ServiceWrapper<VLegalDURelLocalService> {
	public VLegalDURelLocalServiceWrapper(
		VLegalDURelLocalService vLegalDURelLocalService) {
		_vLegalDURelLocalService = vLegalDURelLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vLegalDURelLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vLegalDURelLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vLegalDURelLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDURelLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDURelLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of v legal d u rels.
	*
	* @return the number of v legal d u rels
	*/
	@Override
	public int getVLegalDURelsCount() {
		return _vLegalDURelLocalService.getVLegalDURelsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vLegalDURelLocalService.getOSGiServiceIdentifier();
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
		return _vLegalDURelLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalDURelLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalDURelLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List getRelByDepartment(long departmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDURelLocalService.getRelByDepartment(departmentId);
	}

	@Override
	public java.util.List getRelByUser(long userid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDURelLocalService.getRelByUser(userid);
	}

	/**
	* Returns a range of all the v legal d u rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @return the range of v legal d u rels
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDURel> getVLegalDURels(
		int start, int end) {
		return _vLegalDURelLocalService.getVLegalDURels(start, end);
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
		return _vLegalDURelLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vLegalDURelLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDURel addRelation(long departmentId,
		long userid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDURelLocalService.addRelation(departmentId, userid);
	}

	/**
	* Adds the v legal d u rel to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDURel the v legal d u rel
	* @return the v legal d u rel that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDURel addVLegalDURel(
		vn.gov.hoabinh.model.VLegalDURel vLegalDURel) {
		return _vLegalDURelLocalService.addVLegalDURel(vLegalDURel);
	}

	/**
	* Creates a new v legal d u rel with the primary key. Does not add the v legal d u rel to the database.
	*
	* @param vLegalDURelPK the primary key for the new v legal d u rel
	* @return the new v legal d u rel
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDURel createVLegalDURel(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK) {
		return _vLegalDURelLocalService.createVLegalDURel(vLegalDURelPK);
	}

	/**
	* Deletes the v legal d u rel from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDURel the v legal d u rel
	* @return the v legal d u rel that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDURel deleteVLegalDURel(
		vn.gov.hoabinh.model.VLegalDURel vLegalDURel) {
		return _vLegalDURelLocalService.deleteVLegalDURel(vLegalDURel);
	}

	/**
	* Deletes the v legal d u rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDURelPK the primary key of the v legal d u rel
	* @return the v legal d u rel that was removed
	* @throws PortalException if a v legal d u rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDURel deleteVLegalDURel(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDURelLocalService.deleteVLegalDURel(vLegalDURelPK);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDURel fetchVLegalDURel(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK) {
		return _vLegalDURelLocalService.fetchVLegalDURel(vLegalDURelPK);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDURel getByUserId(long userid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDURelLocalService.getByUserId(userid);
	}

	/**
	* Returns the v legal d u rel with the primary key.
	*
	* @param vLegalDURelPK the primary key of the v legal d u rel
	* @return the v legal d u rel
	* @throws PortalException if a v legal d u rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDURel getVLegalDURel(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDURelLocalService.getVLegalDURel(vLegalDURelPK);
	}

	/**
	* Updates the v legal d u rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalDURel the v legal d u rel
	* @return the v legal d u rel that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDURel updateVLegalDURel(
		vn.gov.hoabinh.model.VLegalDURel vLegalDURel) {
		return _vLegalDURelLocalService.updateVLegalDURel(vLegalDURel);
	}

	@Override
	public void deleteRelByDepartment(long departmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDURelLocalService.deleteRelByDepartment(departmentId);
	}

	@Override
	public void deleteRelByUser(long userid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDURelLocalService.deleteRelByUser(userid);
	}

	@Override
	public void deleteRelation(long departmentId, long userid)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDURelLocalService.deleteRelation(departmentId, userid);
	}

	@Override
	public VLegalDURelLocalService getWrappedService() {
		return _vLegalDURelLocalService;
	}

	@Override
	public void setWrappedService(
		VLegalDURelLocalService vLegalDURelLocalService) {
		_vLegalDURelLocalService = vLegalDURelLocalService;
	}

	private VLegalDURelLocalService _vLegalDURelLocalService;
}