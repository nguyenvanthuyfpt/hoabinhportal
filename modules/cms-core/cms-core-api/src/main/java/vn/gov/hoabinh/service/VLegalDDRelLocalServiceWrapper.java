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
 * Provides a wrapper for {@link VLegalDDRelLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDDRelLocalService
 * @generated
 */
@ProviderType
public class VLegalDDRelLocalServiceWrapper implements VLegalDDRelLocalService,
	ServiceWrapper<VLegalDDRelLocalService> {
	public VLegalDDRelLocalServiceWrapper(
		VLegalDDRelLocalService vLegalDDRelLocalService) {
		_vLegalDDRelLocalService = vLegalDDRelLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vLegalDDRelLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vLegalDDRelLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vLegalDDRelLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDDRelLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDDRelLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of v legal d d rels.
	*
	* @return the number of v legal d d rels
	*/
	@Override
	public int getVLegalDDRelsCount() {
		return _vLegalDDRelLocalService.getVLegalDDRelsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vLegalDDRelLocalService.getOSGiServiceIdentifier();
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
		return _vLegalDDRelLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalDDRelLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalDDRelLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List getRelByDepartment(long departmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDDRelLocalService.getRelByDepartment(departmentId);
	}

	@Override
	public java.util.List getRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDDRelLocalService.getRelByDoc(docId);
	}

	/**
	* Returns a range of all the v legal d d rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d d rels
	* @param end the upper bound of the range of v legal d d rels (not inclusive)
	* @return the range of v legal d d rels
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDDRel> getVLegalDDRels(
		int start, int end) {
		return _vLegalDDRelLocalService.getVLegalDDRels(start, end);
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
		return _vLegalDDRelLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vLegalDDRelLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDDRel addRelation(long departmentId,
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDDRelLocalService.addRelation(departmentId, docId);
	}

	/**
	* Adds the v legal d d rel to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDDRel the v legal d d rel
	* @return the v legal d d rel that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDDRel addVLegalDDRel(
		vn.gov.hoabinh.model.VLegalDDRel vLegalDDRel) {
		return _vLegalDDRelLocalService.addVLegalDDRel(vLegalDDRel);
	}

	/**
	* Creates a new v legal d d rel with the primary key. Does not add the v legal d d rel to the database.
	*
	* @param vLegalDDRelPK the primary key for the new v legal d d rel
	* @return the new v legal d d rel
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDDRel createVLegalDDRel(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK) {
		return _vLegalDDRelLocalService.createVLegalDDRel(vLegalDDRelPK);
	}

	/**
	* Deletes the v legal d d rel from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDDRel the v legal d d rel
	* @return the v legal d d rel that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDDRel deleteVLegalDDRel(
		vn.gov.hoabinh.model.VLegalDDRel vLegalDDRel) {
		return _vLegalDDRelLocalService.deleteVLegalDDRel(vLegalDDRel);
	}

	/**
	* Deletes the v legal d d rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel
	* @return the v legal d d rel that was removed
	* @throws PortalException if a v legal d d rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDDRel deleteVLegalDDRel(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDDRelLocalService.deleteVLegalDDRel(vLegalDDRelPK);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDDRel fetchVLegalDDRel(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK) {
		return _vLegalDDRelLocalService.fetchVLegalDDRel(vLegalDDRelPK);
	}

	/**
	* Returns the v legal d d rel with the primary key.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel
	* @return the v legal d d rel
	* @throws PortalException if a v legal d d rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDDRel getVLegalDDRel(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDDRelLocalService.getVLegalDDRel(vLegalDDRelPK);
	}

	/**
	* Updates the v legal d d rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalDDRel the v legal d d rel
	* @return the v legal d d rel that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDDRel updateVLegalDDRel(
		vn.gov.hoabinh.model.VLegalDDRel vLegalDDRel) {
		return _vLegalDDRelLocalService.updateVLegalDDRel(vLegalDDRel);
	}

	@Override
	public void deleteRelByDepartment(long departmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDDRelLocalService.deleteRelByDepartment(departmentId);
	}

	@Override
	public void deleteRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDDRelLocalService.deleteRelByDoc(docId);
	}

	@Override
	public void deleteRelation(long departmentId, java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDDRelLocalService.deleteRelation(departmentId, docId);
	}

	@Override
	public VLegalDDRelLocalService getWrappedService() {
		return _vLegalDDRelLocalService;
	}

	@Override
	public void setWrappedService(
		VLegalDDRelLocalService vLegalDDRelLocalService) {
		_vLegalDDRelLocalService = vLegalDDRelLocalService;
	}

	private VLegalDDRelLocalService _vLegalDDRelLocalService;
}