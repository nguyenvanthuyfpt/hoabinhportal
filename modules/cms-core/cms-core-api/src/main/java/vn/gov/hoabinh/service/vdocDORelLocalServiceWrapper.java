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
 * Provides a wrapper for {@link vdocDORelLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see vdocDORelLocalService
 * @generated
 */
@ProviderType
public class vdocDORelLocalServiceWrapper implements vdocDORelLocalService,
	ServiceWrapper<vdocDORelLocalService> {
	public vdocDORelLocalServiceWrapper(
		vdocDORelLocalService vdocDORelLocalService) {
		_vdocDORelLocalService = vdocDORelLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vdocDORelLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocDORelLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocDORelLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vdoc d o rels.
	*
	* @return the number of vdoc d o rels
	*/
	@Override
	public int getvdocDORelsCount() {
		return _vdocDORelLocalService.getvdocDORelsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vdocDORelLocalService.getOSGiServiceIdentifier();
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
		return _vdocDORelLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vdocDORelLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vdocDORelLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List getRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocDORelLocalService.getRelByDoc(docId);
	}

	@Override
	public java.util.List getRelByField(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocDORelLocalService.getRelByField(orgId);
	}

	/**
	* Returns a range of all the vdoc d o rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc d o rels
	* @param end the upper bound of the range of vdoc d o rels (not inclusive)
	* @return the range of vdoc d o rels
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocDORel> getvdocDORels(
		int start, int end) {
		return _vdocDORelLocalService.getvdocDORels(start, end);
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
		return _vdocDORelLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vdocDORelLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.gov.hoabinh.model.vdocDORel addRelation(java.lang.String docId,
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocDORelLocalService.addRelation(docId, orgId);
	}

	/**
	* Adds the vdoc d o rel to the database. Also notifies the appropriate model listeners.
	*
	* @param vdocDORel the vdoc d o rel
	* @return the vdoc d o rel that was added
	*/
	@Override
	public vn.gov.hoabinh.model.vdocDORel addvdocDORel(
		vn.gov.hoabinh.model.vdocDORel vdocDORel) {
		return _vdocDORelLocalService.addvdocDORel(vdocDORel);
	}

	/**
	* Creates a new vdoc d o rel with the primary key. Does not add the vdoc d o rel to the database.
	*
	* @param vdocDORelPK the primary key for the new vdoc d o rel
	* @return the new vdoc d o rel
	*/
	@Override
	public vn.gov.hoabinh.model.vdocDORel createvdocDORel(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK) {
		return _vdocDORelLocalService.createvdocDORel(vdocDORelPK);
	}

	/**
	* Deletes the vdoc d o rel from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocDORel the vdoc d o rel
	* @return the vdoc d o rel that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.vdocDORel deletevdocDORel(
		vn.gov.hoabinh.model.vdocDORel vdocDORel) {
		return _vdocDORelLocalService.deletevdocDORel(vdocDORel);
	}

	/**
	* Deletes the vdoc d o rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocDORelPK the primary key of the vdoc d o rel
	* @return the vdoc d o rel that was removed
	* @throws PortalException if a vdoc d o rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.vdocDORel deletevdocDORel(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocDORelLocalService.deletevdocDORel(vdocDORelPK);
	}

	@Override
	public vn.gov.hoabinh.model.vdocDORel fetchvdocDORel(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK) {
		return _vdocDORelLocalService.fetchvdocDORel(vdocDORelPK);
	}

	/**
	* Returns the vdoc d o rel with the primary key.
	*
	* @param vdocDORelPK the primary key of the vdoc d o rel
	* @return the vdoc d o rel
	* @throws PortalException if a vdoc d o rel with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.vdocDORel getvdocDORel(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocDORelLocalService.getvdocDORel(vdocDORelPK);
	}

	/**
	* Updates the vdoc d o rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vdocDORel the vdoc d o rel
	* @return the vdoc d o rel that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.vdocDORel updatevdocDORel(
		vn.gov.hoabinh.model.vdocDORel vdocDORel) {
		return _vdocDORelLocalService.updatevdocDORel(vdocDORel);
	}

	@Override
	public void deleteRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vdocDORelLocalService.deleteRelByDoc(docId);
	}

	@Override
	public void deleteRelByOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vdocDORelLocalService.deleteRelByOrg(orgId);
	}

	@Override
	public void deleteRelation(java.lang.String docId, java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vdocDORelLocalService.deleteRelation(docId, orgId);
	}

	@Override
	public vdocDORelLocalService getWrappedService() {
		return _vdocDORelLocalService;
	}

	@Override
	public void setWrappedService(vdocDORelLocalService vdocDORelLocalService) {
		_vdocDORelLocalService = vdocDORelLocalService;
	}

	private vdocDORelLocalService _vdocDORelLocalService;
}