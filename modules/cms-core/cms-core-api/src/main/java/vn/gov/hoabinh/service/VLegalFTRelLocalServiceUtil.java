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
 * Provides the local service utility for VLegalFTRel. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.VLegalFTRelLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFTRelLocalService
 * @see vn.gov.hoabinh.service.base.VLegalFTRelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalFTRelLocalServiceImpl
 * @generated
 */
@ProviderType
public class VLegalFTRelLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalFTRelLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of v legal f t rels.
	*
	* @return the number of v legal f t rels
	*/
	public static int getVLegalFTRelsCount() {
		return getService().getVLegalFTRelsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List getRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getRelByField(fieldId);
	}

	public static java.util.List getRelByType(java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getRelByType(typeId);
	}

	/**
	* Returns a range of all the v legal f t rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @return the range of v legal f t rels
	*/
	public static java.util.List<vn.gov.hoabinh.model.VLegalFTRel> getVLegalFTRels(
		int start, int end) {
		return getService().getVLegalFTRels(start, end);
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

	public static vn.gov.hoabinh.model.VLegalFTRel addRelation(
		java.lang.String fieldId, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().addRelation(fieldId, typeId);
	}

	/**
	* Adds the v legal f t rel to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFTRel the v legal f t rel
	* @return the v legal f t rel that was added
	*/
	public static vn.gov.hoabinh.model.VLegalFTRel addVLegalFTRel(
		vn.gov.hoabinh.model.VLegalFTRel vLegalFTRel) {
		return getService().addVLegalFTRel(vLegalFTRel);
	}

	/**
	* Creates a new v legal f t rel with the primary key. Does not add the v legal f t rel to the database.
	*
	* @param vLegalFTRelPK the primary key for the new v legal f t rel
	* @return the new v legal f t rel
	*/
	public static vn.gov.hoabinh.model.VLegalFTRel createVLegalFTRel(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK) {
		return getService().createVLegalFTRel(vLegalFTRelPK);
	}

	/**
	* Deletes the v legal f t rel from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFTRel the v legal f t rel
	* @return the v legal f t rel that was removed
	*/
	public static vn.gov.hoabinh.model.VLegalFTRel deleteVLegalFTRel(
		vn.gov.hoabinh.model.VLegalFTRel vLegalFTRel) {
		return getService().deleteVLegalFTRel(vLegalFTRel);
	}

	/**
	* Deletes the v legal f t rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFTRelPK the primary key of the v legal f t rel
	* @return the v legal f t rel that was removed
	* @throws PortalException if a v legal f t rel with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalFTRel deleteVLegalFTRel(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVLegalFTRel(vLegalFTRelPK);
	}

	public static vn.gov.hoabinh.model.VLegalFTRel fetchVLegalFTRel(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK) {
		return getService().fetchVLegalFTRel(vLegalFTRelPK);
	}

	/**
	* Returns the v legal f t rel with the primary key.
	*
	* @param vLegalFTRelPK the primary key of the v legal f t rel
	* @return the v legal f t rel
	* @throws PortalException if a v legal f t rel with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalFTRel getVLegalFTRel(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVLegalFTRel(vLegalFTRelPK);
	}

	/**
	* Updates the v legal f t rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalFTRel the v legal f t rel
	* @return the v legal f t rel that was updated
	*/
	public static vn.gov.hoabinh.model.VLegalFTRel updateVLegalFTRel(
		vn.gov.hoabinh.model.VLegalFTRel vLegalFTRel) {
		return getService().updateVLegalFTRel(vLegalFTRel);
	}

	public static void deleteRelByField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelByField(fieldId);
	}

	public static void deleteRelByType(java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelByType(typeId);
	}

	public static void deleteRelation(java.lang.String fieldId,
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteRelation(fieldId, typeId);
	}

	public static VLegalFTRelLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalFTRelLocalService, VLegalFTRelLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VLegalFTRelLocalService.class);
}