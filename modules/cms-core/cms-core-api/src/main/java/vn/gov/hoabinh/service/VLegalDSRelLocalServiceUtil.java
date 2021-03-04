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
 * Provides the local service utility for VLegalDSRel. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.VLegalDSRelLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDSRelLocalService
 * @see vn.gov.hoabinh.service.base.VLegalDSRelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalDSRelLocalServiceImpl
 * @generated
 */
@ProviderType
public class VLegalDSRelLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalDSRelLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of v legal d s rels.
	*
	* @return the number of v legal d s rels
	*/
	public static int getVLegalDSRelsCount() {
		return getService().getVLegalDSRelsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List getRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getRelByDoc(docId);
	}

	public static java.util.List getRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getRelByField(fieldId);
	}

	/**
	* Returns a range of all the v legal d s rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @return the range of v legal d s rels
	*/
	public static java.util.List<vn.gov.hoabinh.model.VLegalDSRel> getVLegalDSRels(
		int start, int end) {
		return getService().getVLegalDSRels(start, end);
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

	public static vn.gov.hoabinh.model.VLegalDSRel addRelation(
		java.lang.String docId, java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().addRelation(docId, sigId);
	}

	/**
	* Adds the v legal d s rel to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRel the v legal d s rel
	* @return the v legal d s rel that was added
	*/
	public static vn.gov.hoabinh.model.VLegalDSRel addVLegalDSRel(
		vn.gov.hoabinh.model.VLegalDSRel vLegalDSRel) {
		return getService().addVLegalDSRel(vLegalDSRel);
	}

	/**
	* Creates a new v legal d s rel with the primary key. Does not add the v legal d s rel to the database.
	*
	* @param vLegalDSRelPK the primary key for the new v legal d s rel
	* @return the new v legal d s rel
	*/
	public static vn.gov.hoabinh.model.VLegalDSRel createVLegalDSRel(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK) {
		return getService().createVLegalDSRel(vLegalDSRelPK);
	}

	/**
	* Deletes the v legal d s rel from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRel the v legal d s rel
	* @return the v legal d s rel that was removed
	*/
	public static vn.gov.hoabinh.model.VLegalDSRel deleteVLegalDSRel(
		vn.gov.hoabinh.model.VLegalDSRel vLegalDSRel) {
		return getService().deleteVLegalDSRel(vLegalDSRel);
	}

	/**
	* Deletes the v legal d s rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel
	* @return the v legal d s rel that was removed
	* @throws PortalException if a v legal d s rel with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalDSRel deleteVLegalDSRel(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVLegalDSRel(vLegalDSRelPK);
	}

	public static vn.gov.hoabinh.model.VLegalDSRel fetchVLegalDSRel(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK) {
		return getService().fetchVLegalDSRel(vLegalDSRelPK);
	}

	/**
	* Returns the v legal d s rel with the primary key.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel
	* @return the v legal d s rel
	* @throws PortalException if a v legal d s rel with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalDSRel getVLegalDSRel(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVLegalDSRel(vLegalDSRelPK);
	}

	/**
	* Updates the v legal d s rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRel the v legal d s rel
	* @return the v legal d s rel that was updated
	*/
	public static vn.gov.hoabinh.model.VLegalDSRel updateVLegalDSRel(
		vn.gov.hoabinh.model.VLegalDSRel vLegalDSRel) {
		return getService().updateVLegalDSRel(vLegalDSRel);
	}

	public static void deleteRelByDoc(java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelByDoc(docId);
	}

	public static void deleteRelBySigner(java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelBySigner(sigId);
	}

	public static void deleteRelation(java.lang.String docId,
		java.lang.String sigId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelation(docId, sigId);
	}

	public static VLegalDSRelLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalDSRelLocalService, VLegalDSRelLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VLegalDSRelLocalService.class);
}