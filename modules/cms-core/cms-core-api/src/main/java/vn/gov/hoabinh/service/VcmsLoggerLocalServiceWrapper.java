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
 * Provides a wrapper for {@link VcmsLoggerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsLoggerLocalService
 * @generated
 */
@ProviderType
public class VcmsLoggerLocalServiceWrapper implements VcmsLoggerLocalService,
	ServiceWrapper<VcmsLoggerLocalService> {
	public VcmsLoggerLocalServiceWrapper(
		VcmsLoggerLocalService vcmsLoggerLocalService) {
		_vcmsLoggerLocalService = vcmsLoggerLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vcmsLoggerLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsLoggerLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsLoggerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vcms loggers.
	*
	* @return the number of vcms loggers
	*/
	@Override
	public int getVcmsLoggersCount() {
		return _vcmsLoggerLocalService.getVcmsLoggersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vcmsLoggerLocalService.getOSGiServiceIdentifier();
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
		return _vcmsLoggerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsLoggerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsLoggerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the vcms loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms loggers
	* @param end the upper bound of the range of vcms loggers (not inclusive)
	* @return the range of vcms loggers
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsLogger> getVcmsLoggers(
		int start, int end) {
		return _vcmsLoggerLocalService.getVcmsLoggers(start, end);
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
		return _vcmsLoggerLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vcmsLoggerLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the vcms logger to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsLogger the vcms logger
	* @return the vcms logger that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsLogger addVcmsLogger(
		vn.gov.hoabinh.model.VcmsLogger vcmsLogger) {
		return _vcmsLoggerLocalService.addVcmsLogger(vcmsLogger);
	}

	/**
	* Creates a new vcms logger with the primary key. Does not add the vcms logger to the database.
	*
	* @param loggerId the primary key for the new vcms logger
	* @return the new vcms logger
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsLogger createVcmsLogger(
		java.lang.String loggerId) {
		return _vcmsLoggerLocalService.createVcmsLogger(loggerId);
	}

	/**
	* Deletes the vcms logger with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loggerId the primary key of the vcms logger
	* @return the vcms logger that was removed
	* @throws PortalException if a vcms logger with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsLogger deleteVcmsLogger(
		java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsLoggerLocalService.deleteVcmsLogger(loggerId);
	}

	/**
	* Deletes the vcms logger from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsLogger the vcms logger
	* @return the vcms logger that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsLogger deleteVcmsLogger(
		vn.gov.hoabinh.model.VcmsLogger vcmsLogger) {
		return _vcmsLoggerLocalService.deleteVcmsLogger(vcmsLogger);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsLogger fetchVcmsLogger(
		java.lang.String loggerId) {
		return _vcmsLoggerLocalService.fetchVcmsLogger(loggerId);
	}

	/**
	* Returns the vcms logger with the primary key.
	*
	* @param loggerId the primary key of the vcms logger
	* @return the vcms logger
	* @throws PortalException if a vcms logger with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsLogger getVcmsLogger(
		java.lang.String loggerId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsLoggerLocalService.getVcmsLogger(loggerId);
	}

	/**
	* Updates the vcms logger in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsLogger the vcms logger
	* @return the vcms logger that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsLogger updateVcmsLogger(
		vn.gov.hoabinh.model.VcmsLogger vcmsLogger) {
		return _vcmsLoggerLocalService.updateVcmsLogger(vcmsLogger);
	}

	@Override
	public VcmsLoggerLocalService getWrappedService() {
		return _vcmsLoggerLocalService;
	}

	@Override
	public void setWrappedService(VcmsLoggerLocalService vcmsLoggerLocalService) {
		_vcmsLoggerLocalService = vcmsLoggerLocalService;
	}

	private VcmsLoggerLocalService _vcmsLoggerLocalService;
}