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
 * Provides a wrapper for {@link VLegalFTRelLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFTRelLocalService
 * @generated
 */
@ProviderType
public class VLegalFTRelLocalServiceWrapper implements VLegalFTRelLocalService,
	ServiceWrapper<VLegalFTRelLocalService> {
	public VLegalFTRelLocalServiceWrapper(
		VLegalFTRelLocalService vLegalFTRelLocalService) {
		_vLegalFTRelLocalService = vLegalFTRelLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vLegalFTRelLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalFTRelLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalFTRelLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of v legal f t rels.
	*
	* @return the number of v legal f t rels
	*/
	@Override
	public int getVLegalFTRelsCount() {
		return _vLegalFTRelLocalService.getVLegalFTRelsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vLegalFTRelLocalService.getOSGiServiceIdentifier();
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
		return _vLegalFTRelLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalFTRelLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalFTRelLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List getRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalFTRelLocalService.getRelByField(fieldId);
	}

	@Override
	public java.util.List getRelByType(java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalFTRelLocalService.getRelByType(typeId);
	}

	/**
	* Returns a range of all the v legal f t rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @return the range of v legal f t rels
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalFTRel> getVLegalFTRels(
		int start, int end) {
		return _vLegalFTRelLocalService.getVLegalFTRels(start, end);
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
		return _vLegalFTRelLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vLegalFTRelLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalFTRel addRelation(
		java.lang.String fieldId, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalFTRelLocalService.addRelation(fieldId, typeId);
	}

	/**
	* Adds the v legal f t rel to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFTRel the v legal f t rel
	* @return the v legal f t rel that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalFTRel addVLegalFTRel(
		vn.gov.hoabinh.model.VLegalFTRel vLegalFTRel) {
		return _vLegalFTRelLocalService.addVLegalFTRel(vLegalFTRel);
	}

	/**
	* Creates a new v legal f t rel with the primary key. Does not add the v legal f t rel to the database.
	*
	* @param vLegalFTRelPK the primary key for the new v legal f t rel
	* @return the new v legal f t rel
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalFTRel createVLegalFTRel(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK) {
		return _vLegalFTRelLocalService.createVLegalFTRel(vLegalFTRelPK);
	}

	/**
	* Deletes the v legal f t rel from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFTRel the v legal f t rel
	* @return the v legal f t rel that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalFTRel deleteVLegalFTRel(
		vn.gov.hoabinh.model.VLegalFTRel vLegalFTRel) {
		return _vLegalFTRelLocalService.deleteVLegalFTRel(vLegalFTRel);
	}

	/**
	* Deletes the v legal f t rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFTRelPK the primary key of the v legal f t rel
	* @return the v legal f t rel that was removed
	* @throws PortalException if a v legal f t rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalFTRel deleteVLegalFTRel(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalFTRelLocalService.deleteVLegalFTRel(vLegalFTRelPK);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalFTRel fetchVLegalFTRel(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK) {
		return _vLegalFTRelLocalService.fetchVLegalFTRel(vLegalFTRelPK);
	}

	/**
	* Returns the v legal f t rel with the primary key.
	*
	* @param vLegalFTRelPK the primary key of the v legal f t rel
	* @return the v legal f t rel
	* @throws PortalException if a v legal f t rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalFTRel getVLegalFTRel(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalFTRelLocalService.getVLegalFTRel(vLegalFTRelPK);
	}

	/**
	* Updates the v legal f t rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalFTRel the v legal f t rel
	* @return the v legal f t rel that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalFTRel updateVLegalFTRel(
		vn.gov.hoabinh.model.VLegalFTRel vLegalFTRel) {
		return _vLegalFTRelLocalService.updateVLegalFTRel(vLegalFTRel);
	}

	@Override
	public void deleteRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalFTRelLocalService.deleteRelByField(fieldId);
	}

	@Override
	public void deleteRelByType(java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalFTRelLocalService.deleteRelByType(typeId);
	}

	@Override
	public void deleteRelation(java.lang.String fieldId, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalFTRelLocalService.deleteRelation(fieldId, typeId);
	}

	@Override
	public VLegalFTRelLocalService getWrappedService() {
		return _vLegalFTRelLocalService;
	}

	@Override
	public void setWrappedService(
		VLegalFTRelLocalService vLegalFTRelLocalService) {
		_vLegalFTRelLocalService = vLegalFTRelLocalService;
	}

	private VLegalFTRelLocalService _vLegalFTRelLocalService;
}