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
 * Provides the local service utility for VLegalDDRel. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.VLegalDDRelLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDDRelLocalService
 * @see vn.gov.hoabinh.service.base.VLegalDDRelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalDDRelLocalServiceImpl
 * @generated
 */
@ProviderType
public class VLegalDDRelLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalDDRelLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of v legal d d rels.
	*
	* @return the number of v legal d d rels
	*/
	public static int getVLegalDDRelsCount() {
		return getService().getVLegalDDRelsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List getRelByDepartment(long departmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getRelByDepartment(departmentId);
	}

	public static java.util.List getRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getRelByDoc(docId);
	}

	/**
	* Returns a range of all the v legal d d rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d d rels
	* @param end the upper bound of the range of v legal d d rels (not inclusive)
	* @return the range of v legal d d rels
	*/
	public static java.util.List<vn.gov.hoabinh.model.VLegalDDRel> getVLegalDDRels(
		int start, int end) {
		return getService().getVLegalDDRels(start, end);
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

	public static vn.gov.hoabinh.model.VLegalDDRel addRelation(
		long departmentId, java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().addRelation(departmentId, docId);
	}

	/**
	* Adds the v legal d d rel to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDDRel the v legal d d rel
	* @return the v legal d d rel that was added
	*/
	public static vn.gov.hoabinh.model.VLegalDDRel addVLegalDDRel(
		vn.gov.hoabinh.model.VLegalDDRel vLegalDDRel) {
		return getService().addVLegalDDRel(vLegalDDRel);
	}

	/**
	* Creates a new v legal d d rel with the primary key. Does not add the v legal d d rel to the database.
	*
	* @param vLegalDDRelPK the primary key for the new v legal d d rel
	* @return the new v legal d d rel
	*/
	public static vn.gov.hoabinh.model.VLegalDDRel createVLegalDDRel(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK) {
		return getService().createVLegalDDRel(vLegalDDRelPK);
	}

	/**
	* Deletes the v legal d d rel from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDDRel the v legal d d rel
	* @return the v legal d d rel that was removed
	*/
	public static vn.gov.hoabinh.model.VLegalDDRel deleteVLegalDDRel(
		vn.gov.hoabinh.model.VLegalDDRel vLegalDDRel) {
		return getService().deleteVLegalDDRel(vLegalDDRel);
	}

	/**
	* Deletes the v legal d d rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel
	* @return the v legal d d rel that was removed
	* @throws PortalException if a v legal d d rel with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalDDRel deleteVLegalDDRel(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVLegalDDRel(vLegalDDRelPK);
	}

	public static vn.gov.hoabinh.model.VLegalDDRel fetchVLegalDDRel(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK) {
		return getService().fetchVLegalDDRel(vLegalDDRelPK);
	}

	/**
	* Returns the v legal d d rel with the primary key.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel
	* @return the v legal d d rel
	* @throws PortalException if a v legal d d rel with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalDDRel getVLegalDDRel(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVLegalDDRel(vLegalDDRelPK);
	}

	/**
	* Updates the v legal d d rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalDDRel the v legal d d rel
	* @return the v legal d d rel that was updated
	*/
	public static vn.gov.hoabinh.model.VLegalDDRel updateVLegalDDRel(
		vn.gov.hoabinh.model.VLegalDDRel vLegalDDRel) {
		return getService().updateVLegalDDRel(vLegalDDRel);
	}

	public static void deleteRelByDepartment(long departmentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelByDepartment(departmentId);
	}

	public static void deleteRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelByDoc(docId);
	}

	public static void deleteRelation(long departmentId, java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelation(departmentId, docId);
	}

	public static VLegalDDRelLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalDDRelLocalService, VLegalDDRelLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VLegalDDRelLocalService.class);
}