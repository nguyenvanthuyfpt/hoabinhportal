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
 * Provides the local service utility for VcmsArticleStatus. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.VcmsArticleStatusLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleStatusLocalService
 * @see vn.gov.hoabinh.service.base.VcmsArticleStatusLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VcmsArticleStatusLocalServiceImpl
 * @generated
 */
@ProviderType
public class VcmsArticleStatusLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VcmsArticleStatusLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of vcms article statuses.
	*
	* @return the number of vcms article statuses
	*/
	public static int getVcmsArticleStatusesCount() {
		return getService().getVcmsArticleStatusesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the vcms article statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @return the range of vcms article statuses
	*/
	public static java.util.List<vn.gov.hoabinh.model.VcmsArticleStatus> getVcmsArticleStatuses(
		int start, int end) {
		return getService().getVcmsArticleStatuses(start, end);
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

	/**
	* Adds the vcms article status to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleStatus the vcms article status
	* @return the vcms article status that was added
	*/
	public static vn.gov.hoabinh.model.VcmsArticleStatus addVcmsArticleStatus(
		vn.gov.hoabinh.model.VcmsArticleStatus vcmsArticleStatus) {
		return getService().addVcmsArticleStatus(vcmsArticleStatus);
	}

	/**
	* Creates a new vcms article status with the primary key. Does not add the vcms article status to the database.
	*
	* @param vcmsArticleStatusPK the primary key for the new vcms article status
	* @return the new vcms article status
	*/
	public static vn.gov.hoabinh.model.VcmsArticleStatus createVcmsArticleStatus(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK) {
		return getService().createVcmsArticleStatus(vcmsArticleStatusPK);
	}

	/**
	* Deletes the vcms article status from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleStatus the vcms article status
	* @return the vcms article status that was removed
	*/
	public static vn.gov.hoabinh.model.VcmsArticleStatus deleteVcmsArticleStatus(
		vn.gov.hoabinh.model.VcmsArticleStatus vcmsArticleStatus) {
		return getService().deleteVcmsArticleStatus(vcmsArticleStatus);
	}

	/**
	* Deletes the vcms article status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleStatusPK the primary key of the vcms article status
	* @return the vcms article status that was removed
	* @throws PortalException if a vcms article status with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VcmsArticleStatus deleteVcmsArticleStatus(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVcmsArticleStatus(vcmsArticleStatusPK);
	}

	public static vn.gov.hoabinh.model.VcmsArticleStatus fetchVcmsArticleStatus(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK) {
		return getService().fetchVcmsArticleStatus(vcmsArticleStatusPK);
	}

	/**
	* Returns the vcms article status with the primary key.
	*
	* @param vcmsArticleStatusPK the primary key of the vcms article status
	* @return the vcms article status
	* @throws PortalException if a vcms article status with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VcmsArticleStatus getVcmsArticleStatus(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVcmsArticleStatus(vcmsArticleStatusPK);
	}

	/**
	* Updates the vcms article status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleStatus the vcms article status
	* @return the vcms article status that was updated
	*/
	public static vn.gov.hoabinh.model.VcmsArticleStatus updateVcmsArticleStatus(
		vn.gov.hoabinh.model.VcmsArticleStatus vcmsArticleStatus) {
		return getService().updateVcmsArticleStatus(vcmsArticleStatus);
	}

	public static VcmsArticleStatusLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsArticleStatusLocalService, VcmsArticleStatusLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VcmsArticleStatusLocalService.class);
}