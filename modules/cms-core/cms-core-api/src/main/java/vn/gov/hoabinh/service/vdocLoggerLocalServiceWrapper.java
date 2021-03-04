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
 * Provides a wrapper for {@link vdocLoggerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see vdocLoggerLocalService
 * @generated
 */
@ProviderType
public class vdocLoggerLocalServiceWrapper implements vdocLoggerLocalService,
	ServiceWrapper<vdocLoggerLocalService> {
	public vdocLoggerLocalServiceWrapper(
		vdocLoggerLocalService vdocLoggerLocalService) {
		_vdocLoggerLocalService = vdocLoggerLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vdocLoggerLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocLoggerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocLoggerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vdoc loggers.
	*
	* @return the number of vdoc loggers
	*/
	@Override
	public int getvdocLoggersCount() {
		return _vdocLoggerLocalService.getvdocLoggersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vdocLoggerLocalService.getOSGiServiceIdentifier();
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
		return _vdocLoggerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vdocLoggerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vdocLoggerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the vdoc loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc loggers
	* @param end the upper bound of the range of vdoc loggers (not inclusive)
	* @return the range of vdoc loggers
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocLogger> getvdocLoggers(
		int start, int end) {
		return _vdocLoggerLocalService.getvdocLoggers(start, end);
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
		return _vdocLoggerLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vdocLoggerLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the vdoc logger to the database. Also notifies the appropriate model listeners.
	*
	* @param vdocLogger the vdoc logger
	* @return the vdoc logger that was added
	*/
	@Override
	public vn.gov.hoabinh.model.vdocLogger addvdocLogger(
		vn.gov.hoabinh.model.vdocLogger vdocLogger) {
		return _vdocLoggerLocalService.addvdocLogger(vdocLogger);
	}

	/**
	* Creates a new vdoc logger with the primary key. Does not add the vdoc logger to the database.
	*
	* @param loggerId the primary key for the new vdoc logger
	* @return the new vdoc logger
	*/
	@Override
	public vn.gov.hoabinh.model.vdocLogger createvdocLogger(
		java.lang.String loggerId) {
		return _vdocLoggerLocalService.createvdocLogger(loggerId);
	}

	/**
	* Deletes the vdoc logger with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loggerId the primary key of the vdoc logger
	* @return the vdoc logger that was removed
	* @throws PortalException if a vdoc logger with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.vdocLogger deletevdocLogger(
		java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocLoggerLocalService.deletevdocLogger(loggerId);
	}

	/**
	* Deletes the vdoc logger from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocLogger the vdoc logger
	* @return the vdoc logger that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.vdocLogger deletevdocLogger(
		vn.gov.hoabinh.model.vdocLogger vdocLogger) {
		return _vdocLoggerLocalService.deletevdocLogger(vdocLogger);
	}

	@Override
	public vn.gov.hoabinh.model.vdocLogger fetchvdocLogger(
		java.lang.String loggerId) {
		return _vdocLoggerLocalService.fetchvdocLogger(loggerId);
	}

	/**
	* Returns the vdoc logger with the primary key.
	*
	* @param loggerId the primary key of the vdoc logger
	* @return the vdoc logger
	* @throws PortalException if a vdoc logger with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.vdocLogger getvdocLogger(
		java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocLoggerLocalService.getvdocLogger(loggerId);
	}

	/**
	* Updates the vdoc logger in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vdocLogger the vdoc logger
	* @return the vdoc logger that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.vdocLogger updatevdocLogger(
		vn.gov.hoabinh.model.vdocLogger vdocLogger) {
		return _vdocLoggerLocalService.updatevdocLogger(vdocLogger);
	}

	@Override
	public vdocLoggerLocalService getWrappedService() {
		return _vdocLoggerLocalService;
	}

	@Override
	public void setWrappedService(vdocLoggerLocalService vdocLoggerLocalService) {
		_vdocLoggerLocalService = vdocLoggerLocalService;
	}

	private vdocLoggerLocalService _vdocLoggerLocalService;
}