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
 * Provides a wrapper for {@link VcmsThreadLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsThreadLocalService
 * @generated
 */
@ProviderType
public class VcmsThreadLocalServiceWrapper implements VcmsThreadLocalService,
	ServiceWrapper<VcmsThreadLocalService> {
	public VcmsThreadLocalServiceWrapper(
		VcmsThreadLocalService vcmsThreadLocalService) {
		_vcmsThreadLocalService = vcmsThreadLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vcmsThreadLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsThreadLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsThreadLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vcms threads.
	*
	* @return the number of vcms threads
	*/
	@Override
	public int getVcmsThreadsCount() {
		return _vcmsThreadLocalService.getVcmsThreadsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vcmsThreadLocalService.getOSGiServiceIdentifier();
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
		return _vcmsThreadLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsThreadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsThreadLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsThreadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsThreadLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the vcms threads.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsThreadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms threads
	* @param end the upper bound of the range of vcms threads (not inclusive)
	* @return the range of vcms threads
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsThread> getVcmsThreads(
		int start, int end) {
		return _vcmsThreadLocalService.getVcmsThreads(start, end);
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
		return _vcmsThreadLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vcmsThreadLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the vcms thread to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsThread the vcms thread
	* @return the vcms thread that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsThread addVcmsThread(
		vn.gov.hoabinh.model.VcmsThread vcmsThread) {
		return _vcmsThreadLocalService.addVcmsThread(vcmsThread);
	}

	/**
	* Creates a new vcms thread with the primary key. Does not add the vcms thread to the database.
	*
	* @param threadId the primary key for the new vcms thread
	* @return the new vcms thread
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsThread createVcmsThread(
		java.lang.String threadId) {
		return _vcmsThreadLocalService.createVcmsThread(threadId);
	}

	/**
	* Deletes the vcms thread with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param threadId the primary key of the vcms thread
	* @return the vcms thread that was removed
	* @throws PortalException if a vcms thread with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsThread deleteVcmsThread(
		java.lang.String threadId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsThreadLocalService.deleteVcmsThread(threadId);
	}

	/**
	* Deletes the vcms thread from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsThread the vcms thread
	* @return the vcms thread that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsThread deleteVcmsThread(
		vn.gov.hoabinh.model.VcmsThread vcmsThread) {
		return _vcmsThreadLocalService.deleteVcmsThread(vcmsThread);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsThread fetchVcmsThread(
		java.lang.String threadId) {
		return _vcmsThreadLocalService.fetchVcmsThread(threadId);
	}

	/**
	* Returns the vcms thread with the primary key.
	*
	* @param threadId the primary key of the vcms thread
	* @return the vcms thread
	* @throws PortalException if a vcms thread with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsThread getVcmsThread(
		java.lang.String threadId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsThreadLocalService.getVcmsThread(threadId);
	}

	/**
	* Updates the vcms thread in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsThread the vcms thread
	* @return the vcms thread that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsThread updateVcmsThread(
		vn.gov.hoabinh.model.VcmsThread vcmsThread) {
		return _vcmsThreadLocalService.updateVcmsThread(vcmsThread);
	}

	@Override
	public VcmsThreadLocalService getWrappedService() {
		return _vcmsThreadLocalService;
	}

	@Override
	public void setWrappedService(VcmsThreadLocalService vcmsThreadLocalService) {
		_vcmsThreadLocalService = vcmsThreadLocalService;
	}

	private VcmsThreadLocalService _vcmsThreadLocalService;
}