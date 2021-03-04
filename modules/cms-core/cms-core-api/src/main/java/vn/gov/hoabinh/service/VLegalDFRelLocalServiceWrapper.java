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
 * Provides a wrapper for {@link VLegalDFRelLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDFRelLocalService
 * @generated
 */
@ProviderType
public class VLegalDFRelLocalServiceWrapper implements VLegalDFRelLocalService,
	ServiceWrapper<VLegalDFRelLocalService> {
	public VLegalDFRelLocalServiceWrapper(
		VLegalDFRelLocalService vLegalDFRelLocalService) {
		_vLegalDFRelLocalService = vLegalDFRelLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vLegalDFRelLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDFRelLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDFRelLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of v legal d f rels.
	*
	* @return the number of v legal d f rels
	*/
	@Override
	public int getVLegalDFRelsCount() {
		return _vLegalDFRelLocalService.getVLegalDFRelsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vLegalDFRelLocalService.getOSGiServiceIdentifier();
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
		return _vLegalDFRelLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalDFRelLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalDFRelLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List getRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDFRelLocalService.getRelByDoc(docId);
	}

	@Override
	public java.util.List getRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDFRelLocalService.getRelByField(fieldId);
	}

	/**
	* Returns a range of all the v legal d f rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d f rels
	* @param end the upper bound of the range of v legal d f rels (not inclusive)
	* @return the range of v legal d f rels
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDFRel> getVLegalDFRels(
		int start, int end) {
		return _vLegalDFRelLocalService.getVLegalDFRels(start, end);
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
		return _vLegalDFRelLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vLegalDFRelLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDFRel addRelation(
		java.lang.String docId, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDFRelLocalService.addRelation(docId, fieldId);
	}

	/**
	* Adds the v legal d f rel to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDFRel the v legal d f rel
	* @return the v legal d f rel that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDFRel addVLegalDFRel(
		vn.gov.hoabinh.model.VLegalDFRel vLegalDFRel) {
		return _vLegalDFRelLocalService.addVLegalDFRel(vLegalDFRel);
	}

	/**
	* Creates a new v legal d f rel with the primary key. Does not add the v legal d f rel to the database.
	*
	* @param vLegalDFRelPK the primary key for the new v legal d f rel
	* @return the new v legal d f rel
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDFRel createVLegalDFRel(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK) {
		return _vLegalDFRelLocalService.createVLegalDFRel(vLegalDFRelPK);
	}

	/**
	* Deletes the v legal d f rel from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDFRel the v legal d f rel
	* @return the v legal d f rel that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDFRel deleteVLegalDFRel(
		vn.gov.hoabinh.model.VLegalDFRel vLegalDFRel) {
		return _vLegalDFRelLocalService.deleteVLegalDFRel(vLegalDFRel);
	}

	/**
	* Deletes the v legal d f rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDFRelPK the primary key of the v legal d f rel
	* @return the v legal d f rel that was removed
	* @throws PortalException if a v legal d f rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDFRel deleteVLegalDFRel(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDFRelLocalService.deleteVLegalDFRel(vLegalDFRelPK);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDFRel fetchVLegalDFRel(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK) {
		return _vLegalDFRelLocalService.fetchVLegalDFRel(vLegalDFRelPK);
	}

	/**
	* Returns the v legal d f rel with the primary key.
	*
	* @param vLegalDFRelPK the primary key of the v legal d f rel
	* @return the v legal d f rel
	* @throws PortalException if a v legal d f rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDFRel getVLegalDFRel(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDFRelLocalService.getVLegalDFRel(vLegalDFRelPK);
	}

	/**
	* Updates the v legal d f rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalDFRel the v legal d f rel
	* @return the v legal d f rel that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDFRel updateVLegalDFRel(
		vn.gov.hoabinh.model.VLegalDFRel vLegalDFRel) {
		return _vLegalDFRelLocalService.updateVLegalDFRel(vLegalDFRel);
	}

	@Override
	public void deleteRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDFRelLocalService.deleteRelByDoc(docId);
	}

	@Override
	public void deleteRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDFRelLocalService.deleteRelByField(fieldId);
	}

	@Override
	public void deleteRelation(java.lang.String docId, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDFRelLocalService.deleteRelation(docId, fieldId);
	}

	@Override
	public VLegalDFRelLocalService getWrappedService() {
		return _vLegalDFRelLocalService;
	}

	@Override
	public void setWrappedService(
		VLegalDFRelLocalService vLegalDFRelLocalService) {
		_vLegalDFRelLocalService = vLegalDFRelLocalService;
	}

	private VLegalDFRelLocalService _vLegalDFRelLocalService;
}