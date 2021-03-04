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
 * Provides the local service utility for VLegalTags. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.VLegalTagsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTagsLocalService
 * @see vn.gov.hoabinh.service.base.VLegalTagsLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalTagsLocalServiceImpl
 * @generated
 */
@ProviderType
public class VLegalTagsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalTagsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
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
	* Returns the number of v legal tagses.
	*
	* @return the number of v legal tagses
	*/
	public static int getVLegalTagsesCount() {
		return getService().getVLegalTagsesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the v legal tagses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal tagses
	* @param end the upper bound of the range of v legal tagses (not inclusive)
	* @return the range of v legal tagses
	*/
	public static java.util.List<vn.gov.hoabinh.model.VLegalTags> getVLegalTagses(
		int start, int end) {
		return getService().getVLegalTagses(start, end);
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
	* Adds the v legal tags to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalTags the v legal tags
	* @return the v legal tags that was added
	*/
	public static vn.gov.hoabinh.model.VLegalTags addVLegalTags(
		vn.gov.hoabinh.model.VLegalTags vLegalTags) {
		return getService().addVLegalTags(vLegalTags);
	}

	/**
	* Creates a new v legal tags with the primary key. Does not add the v legal tags to the database.
	*
	* @param tagId the primary key for the new v legal tags
	* @return the new v legal tags
	*/
	public static vn.gov.hoabinh.model.VLegalTags createVLegalTags(
		java.lang.String tagId) {
		return getService().createVLegalTags(tagId);
	}

	/**
	* Deletes the v legal tags with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tagId the primary key of the v legal tags
	* @return the v legal tags that was removed
	* @throws PortalException if a v legal tags with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalTags deleteVLegalTags(
		java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVLegalTags(tagId);
	}

	/**
	* Deletes the v legal tags from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalTags the v legal tags
	* @return the v legal tags that was removed
	*/
	public static vn.gov.hoabinh.model.VLegalTags deleteVLegalTags(
		vn.gov.hoabinh.model.VLegalTags vLegalTags) {
		return getService().deleteVLegalTags(vLegalTags);
	}

	public static vn.gov.hoabinh.model.VLegalTags fetchVLegalTags(
		java.lang.String tagId) {
		return getService().fetchVLegalTags(tagId);
	}

	/**
	* Returns the v legal tags with the primary key.
	*
	* @param tagId the primary key of the v legal tags
	* @return the v legal tags
	* @throws PortalException if a v legal tags with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalTags getVLegalTags(
		java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVLegalTags(tagId);
	}

	/**
	* Updates the v legal tags in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalTags the v legal tags
	* @return the v legal tags that was updated
	*/
	public static vn.gov.hoabinh.model.VLegalTags updateVLegalTags(
		vn.gov.hoabinh.model.VLegalTags vLegalTags) {
		return getService().updateVLegalTags(vLegalTags);
	}

	public static VLegalTagsLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalTagsLocalService, VLegalTagsLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VLegalTagsLocalService.class);
}