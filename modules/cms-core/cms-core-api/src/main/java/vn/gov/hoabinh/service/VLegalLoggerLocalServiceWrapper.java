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
 * Provides a wrapper for {@link VLegalLoggerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalLoggerLocalService
 * @generated
 */
@ProviderType
public class VLegalLoggerLocalServiceWrapper implements VLegalLoggerLocalService,
	ServiceWrapper<VLegalLoggerLocalService> {
	public VLegalLoggerLocalServiceWrapper(
		VLegalLoggerLocalService vLegalLoggerLocalService) {
		_vLegalLoggerLocalService = vLegalLoggerLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vLegalLoggerLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalLoggerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalLoggerLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countLogs()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalLoggerLocalService.countLogs();
	}

	/**
	* Returns the number of v legal loggers.
	*
	* @return the number of v legal loggers
	*/
	@Override
	public int getVLegalLoggersCount() {
		return _vLegalLoggerLocalService.getVLegalLoggersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vLegalLoggerLocalService.getOSGiServiceIdentifier();
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
		return _vLegalLoggerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalLoggerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalLoggerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List findLogs()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalLoggerLocalService.findLogs();
	}

	@Override
	public java.util.List findLogs(int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalLoggerLocalService.findLogs(begin, end);
	}

	/**
	* Returns a range of all the v legal loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal loggers
	* @param end the upper bound of the range of v legal loggers (not inclusive)
	* @return the range of v legal loggers
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalLogger> getVLegalLoggers(
		int start, int end) {
		return _vLegalLoggerLocalService.getVLegalLoggers(start, end);
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
		return _vLegalLoggerLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vLegalLoggerLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the v legal logger to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalLogger the v legal logger
	* @return the v legal logger that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalLogger addVLegalLogger(
		vn.gov.hoabinh.model.VLegalLogger vLegalLogger) {
		return _vLegalLoggerLocalService.addVLegalLogger(vLegalLogger);
	}

	/**
	* Creates a new v legal logger with the primary key. Does not add the v legal logger to the database.
	*
	* @param loggerId the primary key for the new v legal logger
	* @return the new v legal logger
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalLogger createVLegalLogger(
		java.lang.String loggerId) {
		return _vLegalLoggerLocalService.createVLegalLogger(loggerId);
	}

	/**
	* Deletes the v legal logger with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loggerId the primary key of the v legal logger
	* @return the v legal logger that was removed
	* @throws PortalException if a v legal logger with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalLogger deleteVLegalLogger(
		java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalLoggerLocalService.deleteVLegalLogger(loggerId);
	}

	/**
	* Deletes the v legal logger from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalLogger the v legal logger
	* @return the v legal logger that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalLogger deleteVLegalLogger(
		vn.gov.hoabinh.model.VLegalLogger vLegalLogger) {
		return _vLegalLoggerLocalService.deleteVLegalLogger(vLegalLogger);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalLogger fetchVLegalLogger(
		java.lang.String loggerId) {
		return _vLegalLoggerLocalService.fetchVLegalLogger(loggerId);
	}

	/**
	* Returns the v legal logger with the primary key.
	*
	* @param loggerId the primary key of the v legal logger
	* @return the v legal logger
	* @throws PortalException if a v legal logger with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalLogger getVLegalLogger(
		java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalLoggerLocalService.getVLegalLogger(loggerId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalLogger log(long groupId,
		java.lang.String content)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalLoggerLocalService.log(groupId, content);
	}

	/**
	* Updates the v legal logger in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalLogger the v legal logger
	* @return the v legal logger that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalLogger updateVLegalLogger(
		vn.gov.hoabinh.model.VLegalLogger vLegalLogger) {
		return _vLegalLoggerLocalService.updateVLegalLogger(vLegalLogger);
	}

	@Override
	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalLoggerLocalService.addEntryResources(entryId,
			addCommunityPermissions, addGuestPermissions);
	}

	@Override
	public void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalLoggerLocalService.addEntryResources(entryId,
			communityPermissions, guestPermissions);
	}

	@Override
	public void addEntryResources(vn.gov.hoabinh.model.VLegalLogger entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalLoggerLocalService.addEntryResources(entry,
			addCommunityPermissions, addGuestPermissions);
	}

	@Override
	public void addEntryResources(vn.gov.hoabinh.model.VLegalLogger entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalLoggerLocalService.addEntryResources(entry,
			communityPermissions, guestPermissions);
	}

	@Override
	public void removeLogs(java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalLoggerLocalService.removeLogs(loggerId);
	}

	@Override
	public VLegalLoggerLocalService getWrappedService() {
		return _vLegalLoggerLocalService;
	}

	@Override
	public void setWrappedService(
		VLegalLoggerLocalService vLegalLoggerLocalService) {
		_vLegalLoggerLocalService = vLegalLoggerLocalService;
	}

	private VLegalLoggerLocalService _vLegalLoggerLocalService;
}