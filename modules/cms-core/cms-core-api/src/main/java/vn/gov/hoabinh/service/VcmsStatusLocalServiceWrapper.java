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
 * Provides a wrapper for {@link VcmsStatusLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsStatusLocalService
 * @generated
 */
@ProviderType
public class VcmsStatusLocalServiceWrapper implements VcmsStatusLocalService,
	ServiceWrapper<VcmsStatusLocalService> {
	public VcmsStatusLocalServiceWrapper(
		VcmsStatusLocalService vcmsStatusLocalService) {
		_vcmsStatusLocalService = vcmsStatusLocalService;
	}

	@Override
	public boolean isStatusPublisher(long statusId) {
		return _vcmsStatusLocalService.isStatusPublisher(statusId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vcmsStatusLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vcmsStatusLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vcmsStatusLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsStatusLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsStatusLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsStatusLocalService.countByGroupId(groupId);
	}

	/**
	* Returns the number of vcms statuses.
	*
	* @return the number of vcms statuses
	*/
	@Override
	public int getVcmsStatusesCount() {
		return _vcmsStatusLocalService.getVcmsStatusesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vcmsStatusLocalService.getOSGiServiceIdentifier();
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
		return _vcmsStatusLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsStatusLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsStatusLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsStatus> getByG_P(
		long groupId, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsStatusLocalService.getByG_P(groupId, position);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsStatus> getByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsStatusLocalService.getByGroupId(groupId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsStatus> getByGroupId(
		long groupId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsStatusLocalService.getByGroupId(groupId, begin, end);
	}

	/**
	* Returns a range of all the vcms statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @return the range of vcms statuses
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsStatus> getVcmsStatuses(
		int start, int end) {
		return _vcmsStatusLocalService.getVcmsStatuses(start, end);
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
		return _vcmsStatusLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vcmsStatusLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the vcms status to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsStatus the vcms status
	* @return the vcms status that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsStatus addVcmsStatus(
		vn.gov.hoabinh.model.VcmsStatus vcmsStatus) {
		return _vcmsStatusLocalService.addVcmsStatus(vcmsStatus);
	}

	/**
	* Creates a new vcms status with the primary key. Does not add the vcms status to the database.
	*
	* @param statusId the primary key for the new vcms status
	* @return the new vcms status
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsStatus createVcmsStatus(long statusId) {
		return _vcmsStatusLocalService.createVcmsStatus(statusId);
	}

	/**
	* Deletes the vcms status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statusId the primary key of the vcms status
	* @return the vcms status that was removed
	* @throws PortalException if a vcms status with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsStatus deleteVcmsStatus(long statusId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsStatusLocalService.deleteVcmsStatus(statusId);
	}

	/**
	* Deletes the vcms status from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsStatus the vcms status
	* @return the vcms status that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsStatus deleteVcmsStatus(
		vn.gov.hoabinh.model.VcmsStatus vcmsStatus) {
		return _vcmsStatusLocalService.deleteVcmsStatus(vcmsStatus);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsStatus fetchVcmsStatus(long statusId) {
		return _vcmsStatusLocalService.fetchVcmsStatus(statusId);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsStatus getByA(boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsStatusLocalService.getByA(active);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsStatus getByC_G_A(long companyId,
		long groupId, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsStatusLocalService.getByC_G_A(companyId, groupId, active);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsStatus getByC_G_P_A(long companyId,
		long groupId, boolean isPrimary, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsStatusLocalService.getByC_G_P_A(companyId, groupId,
			isPrimary, active);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsStatus getByG_Pos(long groupId, int position)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return _vcmsStatusLocalService.getByG_Pos(groupId, position);
	}

	/**
	* Returns the vcms status with the primary key.
	*
	* @param statusId the primary key of the vcms status
	* @return the vcms status
	* @throws PortalException if a vcms status with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsStatus getVcmsStatus(long statusId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsStatusLocalService.getVcmsStatus(statusId);
	}

	/**
	* Updates the vcms status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsStatus the vcms status
	* @return the vcms status that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsStatus updateVcmsStatus(
		vn.gov.hoabinh.model.VcmsStatus vcmsStatus) {
		return _vcmsStatusLocalService.updateVcmsStatus(vcmsStatus);
	}

	@Override
	public VcmsStatusLocalService getWrappedService() {
		return _vcmsStatusLocalService;
	}

	@Override
	public void setWrappedService(VcmsStatusLocalService vcmsStatusLocalService) {
		_vcmsStatusLocalService = vcmsStatusLocalService;
	}

	private VcmsStatusLocalService _vcmsStatusLocalService;
}