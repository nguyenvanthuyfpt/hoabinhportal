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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for DataConvert. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.DataConvertLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see DataConvertLocalService
 * @see vn.gov.hoabinh.service.base.DataConvertLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.DataConvertLocalServiceImpl
 * @generated
 */
@ProviderType
public class DataConvertLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.DataConvertLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of data converts.
	*
	* @return the number of data converts
	*/
	public static int getDataConvertsCount() {
		return getService().getDataConvertsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.DataConvertModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.DataConvertModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the data converts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.DataConvertModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of data converts
	* @param end the upper bound of the range of data converts (not inclusive)
	* @return the range of data converts
	*/
	public static java.util.List<vn.gov.hoabinh.model.DataConvert> getDataConverts(
		int start, int end) {
		return getService().getDataConverts(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static vn.gov.hoabinh.model.DataConvert addData(
		java.lang.String dataId, long folderId, long groupId, long fileEntryId,
		java.lang.String fileName, java.lang.String url) {
		return getService()
				   .addData(dataId, folderId, groupId, fileEntryId, fileName,
			url);
	}

	/**
	* Adds the data convert to the database. Also notifies the appropriate model listeners.
	*
	* @param dataConvert the data convert
	* @return the data convert that was added
	*/
	public static vn.gov.hoabinh.model.DataConvert addDataConvert(
		vn.gov.hoabinh.model.DataConvert dataConvert) {
		return getService().addDataConvert(dataConvert);
	}

	/**
	* Creates a new data convert with the primary key. Does not add the data convert to the database.
	*
	* @param id the primary key for the new data convert
	* @return the new data convert
	*/
	public static vn.gov.hoabinh.model.DataConvert createDataConvert(long id) {
		return getService().createDataConvert(id);
	}

	/**
	* Deletes the data convert with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the data convert
	* @return the data convert that was removed
	* @throws PortalException if a data convert with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.DataConvert deleteDataConvert(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDataConvert(id);
	}

	/**
	* Deletes the data convert from the database. Also notifies the appropriate model listeners.
	*
	* @param dataConvert the data convert
	* @return the data convert that was removed
	*/
	public static vn.gov.hoabinh.model.DataConvert deleteDataConvert(
		vn.gov.hoabinh.model.DataConvert dataConvert) {
		return getService().deleteDataConvert(dataConvert);
	}

	public static vn.gov.hoabinh.model.DataConvert fetchDataConvert(long id) {
		return getService().fetchDataConvert(id);
	}

	/**
	* Returns the data convert with the primary key.
	*
	* @param id the primary key of the data convert
	* @return the data convert
	* @throws PortalException if a data convert with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.DataConvert getDataConvert(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDataConvert(id);
	}

	/**
	* Updates the data convert in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dataConvert the data convert
	* @return the data convert that was updated
	*/
	public static vn.gov.hoabinh.model.DataConvert updateDataConvert(
		vn.gov.hoabinh.model.DataConvert dataConvert) {
		return getService().updateDataConvert(dataConvert);
	}

	public static DataConvertLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DataConvertLocalService, DataConvertLocalService> _serviceTracker =
		ServiceTrackerFactory.open(DataConvertLocalService.class);
}