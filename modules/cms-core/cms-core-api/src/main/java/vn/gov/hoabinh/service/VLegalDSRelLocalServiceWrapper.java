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
 * Provides a wrapper for {@link VLegalDSRelLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDSRelLocalService
 * @generated
 */
@ProviderType
public class VLegalDSRelLocalServiceWrapper implements VLegalDSRelLocalService,
	ServiceWrapper<VLegalDSRelLocalService> {
	public VLegalDSRelLocalServiceWrapper(
		VLegalDSRelLocalService vLegalDSRelLocalService) {
		_vLegalDSRelLocalService = vLegalDSRelLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vLegalDSRelLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDSRelLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDSRelLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of v legal d s rels.
	*
	* @return the number of v legal d s rels
	*/
	@Override
	public int getVLegalDSRelsCount() {
		return _vLegalDSRelLocalService.getVLegalDSRelsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vLegalDSRelLocalService.getOSGiServiceIdentifier();
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
		return _vLegalDSRelLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalDSRelLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalDSRelLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List getRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDSRelLocalService.getRelByDoc(docId);
	}

	@Override
	public java.util.List getRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDSRelLocalService.getRelByField(fieldId);
	}

	/**
	* Returns a range of all the v legal d s rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @return the range of v legal d s rels
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDSRel> getVLegalDSRels(
		int start, int end) {
		return _vLegalDSRelLocalService.getVLegalDSRels(start, end);
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
		return _vLegalDSRelLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vLegalDSRelLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDSRel addRelation(
		java.lang.String docId, java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDSRelLocalService.addRelation(docId, sigId);
	}

	/**
	* Adds the v legal d s rel to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRel the v legal d s rel
	* @return the v legal d s rel that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDSRel addVLegalDSRel(
		vn.gov.hoabinh.model.VLegalDSRel vLegalDSRel) {
		return _vLegalDSRelLocalService.addVLegalDSRel(vLegalDSRel);
	}

	/**
	* Creates a new v legal d s rel with the primary key. Does not add the v legal d s rel to the database.
	*
	* @param vLegalDSRelPK the primary key for the new v legal d s rel
	* @return the new v legal d s rel
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDSRel createVLegalDSRel(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK) {
		return _vLegalDSRelLocalService.createVLegalDSRel(vLegalDSRelPK);
	}

	/**
	* Deletes the v legal d s rel from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRel the v legal d s rel
	* @return the v legal d s rel that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDSRel deleteVLegalDSRel(
		vn.gov.hoabinh.model.VLegalDSRel vLegalDSRel) {
		return _vLegalDSRelLocalService.deleteVLegalDSRel(vLegalDSRel);
	}

	/**
	* Deletes the v legal d s rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel
	* @return the v legal d s rel that was removed
	* @throws PortalException if a v legal d s rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDSRel deleteVLegalDSRel(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDSRelLocalService.deleteVLegalDSRel(vLegalDSRelPK);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDSRel fetchVLegalDSRel(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK) {
		return _vLegalDSRelLocalService.fetchVLegalDSRel(vLegalDSRelPK);
	}

	/**
	* Returns the v legal d s rel with the primary key.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel
	* @return the v legal d s rel
	* @throws PortalException if a v legal d s rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDSRel getVLegalDSRel(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDSRelLocalService.getVLegalDSRel(vLegalDSRelPK);
	}

	/**
	* Updates the v legal d s rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRel the v legal d s rel
	* @return the v legal d s rel that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDSRel updateVLegalDSRel(
		vn.gov.hoabinh.model.VLegalDSRel vLegalDSRel) {
		return _vLegalDSRelLocalService.updateVLegalDSRel(vLegalDSRel);
	}

	@Override
	public void deleteRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDSRelLocalService.deleteRelByDoc(docId);
	}

	@Override
	public void deleteRelBySigner(java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDSRelLocalService.deleteRelBySigner(sigId);
	}

	@Override
	public void deleteRelation(java.lang.String docId, java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDSRelLocalService.deleteRelation(docId, sigId);
	}

	@Override
	public VLegalDSRelLocalService getWrappedService() {
		return _vLegalDSRelLocalService;
	}

	@Override
	public void setWrappedService(
		VLegalDSRelLocalService vLegalDSRelLocalService) {
		_vLegalDSRelLocalService = vLegalDSRelLocalService;
	}

	private VLegalDSRelLocalService _vLegalDSRelLocalService;
}