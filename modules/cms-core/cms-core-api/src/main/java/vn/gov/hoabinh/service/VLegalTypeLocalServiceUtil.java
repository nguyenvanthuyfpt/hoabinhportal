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
 * Provides the local service utility for VLegalType. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.VLegalTypeLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTypeLocalService
 * @see vn.gov.hoabinh.service.base.VLegalTypeLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalTypeLocalServiceImpl
 * @generated
 */
@ProviderType
public class VLegalTypeLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalTypeLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static int countTypeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().countTypeByGroupId(groupId);
	}

	/**
	* Returns the number of v legal types.
	*
	* @return the number of v legal types
	*/
	public static int getVLegalTypesCount() {
		return getService().getVLegalTypesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<vn.gov.hoabinh.model.VLegalType> getAllTypes()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getAllTypes();
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalType> getTypeByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getTypeByGroupId(groupId);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalType> getTypeByGroupId(
		long groupId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getTypeByGroupId(groupId, begin, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalType> getTypesByL_RSS(
		long groupId, boolean status, boolean rss)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getTypesByL_RSS(groupId, status, rss);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalType> getTypesByL_S(
		long groupId, java.lang.String language, boolean status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getTypesByL_S(groupId, language, status);
	}

	/**
	* Returns a range of all the v legal types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @return the range of v legal types
	*/
	public static java.util.List<vn.gov.hoabinh.model.VLegalType> getVLegalTypes(
		int start, int end) {
		return getService().getVLegalTypes(start, end);
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

	public static vn.gov.hoabinh.model.VLegalType addType(long groupId,
		java.lang.String name, java.lang.String description,
		java.lang.String language, boolean status, boolean rssable,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .addType(groupId, name, description, language, status,
			rssable, themeDisplay);
	}

	/**
	* Adds the v legal type to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalType the v legal type
	* @return the v legal type that was added
	*/
	public static vn.gov.hoabinh.model.VLegalType addVLegalType(
		vn.gov.hoabinh.model.VLegalType vLegalType) {
		return getService().addVLegalType(vLegalType);
	}

	/**
	* Creates a new v legal type with the primary key. Does not add the v legal type to the database.
	*
	* @param typeId the primary key for the new v legal type
	* @return the new v legal type
	*/
	public static vn.gov.hoabinh.model.VLegalType createVLegalType(
		java.lang.String typeId) {
		return getService().createVLegalType(typeId);
	}

	/**
	* Deletes the v legal type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the v legal type
	* @return the v legal type that was removed
	* @throws PortalException if a v legal type with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalType deleteVLegalType(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVLegalType(typeId);
	}

	/**
	* Deletes the v legal type from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalType the v legal type
	* @return the v legal type that was removed
	*/
	public static vn.gov.hoabinh.model.VLegalType deleteVLegalType(
		vn.gov.hoabinh.model.VLegalType vLegalType) {
		return getService().deleteVLegalType(vLegalType);
	}

	public static vn.gov.hoabinh.model.VLegalType fetchVLegalType(
		java.lang.String typeId) {
		return getService().fetchVLegalType(typeId);
	}

	public static vn.gov.hoabinh.model.VLegalType getType(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getType(typeId);
	}

	public static vn.gov.hoabinh.model.VLegalType getType(long groupId,
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getType(groupId, typeId);
	}

	/**
	* Returns the v legal type with the primary key.
	*
	* @param typeId the primary key of the v legal type
	* @return the v legal type
	* @throws PortalException if a v legal type with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalType getVLegalType(
		java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVLegalType(typeId);
	}

	public static vn.gov.hoabinh.model.VLegalType updateType(long groupId,
		java.lang.String typeId, java.lang.String language,
		java.lang.String name, java.lang.String description, int position,
		boolean status, boolean rssable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .updateType(groupId, typeId, language, name, description,
			position, status, rssable);
	}

	public static vn.gov.hoabinh.model.VLegalType updateType(
		vn.gov.hoabinh.model.VLegalType lType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().updateType(lType);
	}

	/**
	* Updates the v legal type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalType the v legal type
	* @return the v legal type that was updated
	*/
	public static vn.gov.hoabinh.model.VLegalType updateVLegalType(
		vn.gov.hoabinh.model.VLegalType vLegalType) {
		return getService().updateVLegalType(vLegalType);
	}

	public static void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entryId, addCommunityPermissions,
			addGuestPermissions);
	}

	public static void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entryId, communityPermissions, guestPermissions);
	}

	public static void addEntryResources(
		vn.gov.hoabinh.model.VLegalType entry, boolean addCommunityPermissions,
		boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entry, addCommunityPermissions,
			addGuestPermissions);
	}

	public static void addEntryResources(
		vn.gov.hoabinh.model.VLegalType entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entry, communityPermissions, guestPermissions);
	}

	public static void deleteType(java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteType(typeId);
	}

	public static void deleteTypeAndDocs(java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteTypeAndDocs(typeId);
	}

	public static VLegalTypeLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalTypeLocalService, VLegalTypeLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VLegalTypeLocalService.class);
}