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
 * Provides the local service utility for vdocLevel. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.vdocLevelLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see vdocLevelLocalService
 * @see vn.gov.hoabinh.service.base.vdocLevelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.vdocLevelLocalServiceImpl
 * @generated
 */
@ProviderType
public class vdocLevelLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.vdocLevelLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static int countLevelByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().countLevelByG_L(groupId, language);
	}

	/**
	* Returns the number of vdoc levels.
	*
	* @return the number of vdoc levels
	*/
	public static int getvdocLevelsCount() {
		return getService().getvdocLevelsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<vn.gov.hoabinh.model.vdocLevel> getLevelByG_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getLevelByG_L(groupId, language);
	}

	public static java.util.List<vn.gov.hoabinh.model.vdocLevel> getLevelByG_L(
		long groupId, java.lang.String language, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getLevelByG_L(groupId, language, begin, end);
	}

	/**
	* Returns a range of all the vdoc levels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc levels
	* @param end the upper bound of the range of vdoc levels (not inclusive)
	* @return the range of vdoc levels
	*/
	public static java.util.List<vn.gov.hoabinh.model.vdocLevel> getvdocLevels(
		int start, int end) {
		return getService().getvdocLevels(start, end);
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

	public static vn.gov.hoabinh.model.vdocLevel addLevel(long groupId,
		long userId, java.lang.String language, java.lang.String name,
		java.lang.String description, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .addLevel(groupId, userId, language, name, description,
			position);
	}

	/**
	* Adds the vdoc level to the database. Also notifies the appropriate model listeners.
	*
	* @param vdocLevel the vdoc level
	* @return the vdoc level that was added
	*/
	public static vn.gov.hoabinh.model.vdocLevel addvdocLevel(
		vn.gov.hoabinh.model.vdocLevel vdocLevel) {
		return getService().addvdocLevel(vdocLevel);
	}

	/**
	* Creates a new vdoc level with the primary key. Does not add the vdoc level to the database.
	*
	* @param levelId the primary key for the new vdoc level
	* @return the new vdoc level
	*/
	public static vn.gov.hoabinh.model.vdocLevel createvdocLevel(
		java.lang.String levelId) {
		return getService().createvdocLevel(levelId);
	}

	/**
	* Deletes the vdoc level with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param levelId the primary key of the vdoc level
	* @return the vdoc level that was removed
	* @throws PortalException if a vdoc level with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.vdocLevel deletevdocLevel(
		java.lang.String levelId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletevdocLevel(levelId);
	}

	/**
	* Deletes the vdoc level from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocLevel the vdoc level
	* @return the vdoc level that was removed
	*/
	public static vn.gov.hoabinh.model.vdocLevel deletevdocLevel(
		vn.gov.hoabinh.model.vdocLevel vdocLevel) {
		return getService().deletevdocLevel(vdocLevel);
	}

	public static vn.gov.hoabinh.model.vdocLevel fetchvdocLevel(
		java.lang.String levelId) {
		return getService().fetchvdocLevel(levelId);
	}

	public static vn.gov.hoabinh.model.vdocLevel getLevel(
		java.lang.String levelId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getLevel(levelId);
	}

	/**
	* Returns the vdoc level with the primary key.
	*
	* @param levelId the primary key of the vdoc level
	* @return the vdoc level
	* @throws PortalException if a vdoc level with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.vdocLevel getvdocLevel(
		java.lang.String levelId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getvdocLevel(levelId);
	}

	public static vn.gov.hoabinh.model.vdocLevel updateLevel(
		java.lang.String levelId, long groupId, long userId,
		java.lang.String language, java.lang.String name,
		java.lang.String description, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .updateLevel(levelId, groupId, userId, language, name,
			description, position);
	}

	/**
	* Updates the vdoc level in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vdocLevel the vdoc level
	* @return the vdoc level that was updated
	*/
	public static vn.gov.hoabinh.model.vdocLevel updatevdocLevel(
		vn.gov.hoabinh.model.vdocLevel vdocLevel) {
		return getService().updatevdocLevel(vdocLevel);
	}

	public static void deleteLevel(java.lang.String levelId,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteLevel(levelId, themeDisplay);
	}

	public static vdocLevelLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<vdocLevelLocalService, vdocLevelLocalService> _serviceTracker =
		ServiceTrackerFactory.open(vdocLevelLocalService.class);
}