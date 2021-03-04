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
 * Provides a wrapper for {@link vdocFieldLevelRelLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see vdocFieldLevelRelLocalService
 * @generated
 */
@ProviderType
public class vdocFieldLevelRelLocalServiceWrapper
	implements vdocFieldLevelRelLocalService,
		ServiceWrapper<vdocFieldLevelRelLocalService> {
	public vdocFieldLevelRelLocalServiceWrapper(
		vdocFieldLevelRelLocalService vdocFieldLevelRelLocalService) {
		_vdocFieldLevelRelLocalService = vdocFieldLevelRelLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vdocFieldLevelRelLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocFieldLevelRelLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocFieldLevelRelLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countRelationByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLevelRelLocalService.countRelationByField(fieldId);
	}

	@Override
	public int countRelationByLevel(java.lang.String levelId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLevelRelLocalService.countRelationByLevel(levelId);
	}

	/**
	* Returns the number of vdoc field level rels.
	*
	* @return the number of vdoc field level rels
	*/
	@Override
	public int getvdocFieldLevelRelsCount() {
		return _vdocFieldLevelRelLocalService.getvdocFieldLevelRelsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vdocFieldLevelRelLocalService.getOSGiServiceIdentifier();
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
		return _vdocFieldLevelRelLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vdocFieldLevelRelLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vdocFieldLevelRelLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List getRelationByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLevelRelLocalService.getRelationByField(fieldId);
	}

	@Override
	public java.util.List getRelationByLevel(java.lang.String levelId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLevelRelLocalService.getRelationByLevel(levelId);
	}

	/**
	* Returns a range of all the vdoc field level rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc field level rels
	* @param end the upper bound of the range of vdoc field level rels (not inclusive)
	* @return the range of vdoc field level rels
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocFieldLevelRel> getvdocFieldLevelRels(
		int start, int end) {
		return _vdocFieldLevelRelLocalService.getvdocFieldLevelRels(start, end);
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
		return _vdocFieldLevelRelLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vdocFieldLevelRelLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.vdocFieldLevelRel addRelation(
		java.lang.String fieldId, java.lang.String levelId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLevelRelLocalService.addRelation(fieldId, levelId);
	}

	/**
	* Adds the vdoc field level rel to the database. Also notifies the appropriate model listeners.
	*
	* @param vdocFieldLevelRel the vdoc field level rel
	* @return the vdoc field level rel that was added
	*/
	@Override
	public vn.gov.hoabinh.model.vdocFieldLevelRel addvdocFieldLevelRel(
		vn.gov.hoabinh.model.vdocFieldLevelRel vdocFieldLevelRel) {
		return _vdocFieldLevelRelLocalService.addvdocFieldLevelRel(vdocFieldLevelRel);
	}

	/**
	* Creates a new vdoc field level rel with the primary key. Does not add the vdoc field level rel to the database.
	*
	* @param vdocFieldLevelRelPK the primary key for the new vdoc field level rel
	* @return the new vdoc field level rel
	*/
	@Override
	public vn.gov.hoabinh.model.vdocFieldLevelRel createvdocFieldLevelRel(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK) {
		return _vdocFieldLevelRelLocalService.createvdocFieldLevelRel(vdocFieldLevelRelPK);
	}

	/**
	* Deletes the vdoc field level rel from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocFieldLevelRel the vdoc field level rel
	* @return the vdoc field level rel that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.vdocFieldLevelRel deletevdocFieldLevelRel(
		vn.gov.hoabinh.model.vdocFieldLevelRel vdocFieldLevelRel) {
		return _vdocFieldLevelRelLocalService.deletevdocFieldLevelRel(vdocFieldLevelRel);
	}

	/**
	* Deletes the vdoc field level rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocFieldLevelRelPK the primary key of the vdoc field level rel
	* @return the vdoc field level rel that was removed
	* @throws PortalException if a vdoc field level rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.vdocFieldLevelRel deletevdocFieldLevelRel(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocFieldLevelRelLocalService.deletevdocFieldLevelRel(vdocFieldLevelRelPK);
	}

	@Override
	public vn.gov.hoabinh.model.vdocFieldLevelRel fetchvdocFieldLevelRel(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK) {
		return _vdocFieldLevelRelLocalService.fetchvdocFieldLevelRel(vdocFieldLevelRelPK);
	}

	/**
	* Returns the vdoc field level rel with the primary key.
	*
	* @param vdocFieldLevelRelPK the primary key of the vdoc field level rel
	* @return the vdoc field level rel
	* @throws PortalException if a vdoc field level rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.vdocFieldLevelRel getvdocFieldLevelRel(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocFieldLevelRelLocalService.getvdocFieldLevelRel(vdocFieldLevelRelPK);
	}

	/**
	* Updates the vdoc field level rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vdocFieldLevelRel the vdoc field level rel
	* @return the vdoc field level rel that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.vdocFieldLevelRel updatevdocFieldLevelRel(
		vn.gov.hoabinh.model.vdocFieldLevelRel vdocFieldLevelRel) {
		return _vdocFieldLevelRelLocalService.updatevdocFieldLevelRel(vdocFieldLevelRel);
	}

	@Override
	public void deleteRelationByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vdocFieldLevelRelLocalService.deleteRelationByField(fieldId);
	}

	@Override
	public vdocFieldLevelRelLocalService getWrappedService() {
		return _vdocFieldLevelRelLocalService;
	}

	@Override
	public void setWrappedService(
		vdocFieldLevelRelLocalService vdocFieldLevelRelLocalService) {
		_vdocFieldLevelRelLocalService = vdocFieldLevelRelLocalService;
	}

	private vdocFieldLevelRelLocalService _vdocFieldLevelRelLocalService;
}