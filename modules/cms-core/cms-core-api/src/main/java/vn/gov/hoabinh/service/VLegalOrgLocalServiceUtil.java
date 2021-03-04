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
 * Provides the local service utility for VLegalOrg. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.VLegalOrgLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalOrgLocalService
 * @see vn.gov.hoabinh.service.base.VLegalOrgLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalOrgLocalServiceImpl
 * @generated
 */
@ProviderType
public class VLegalOrgLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalOrgLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	public static int countOrgByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().countOrgByG_L(groupId, language);
	}

	public static int countOrgByG_L_P_S(long groupId,
		java.lang.String language, java.lang.String parentId, boolean statusOrg)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .countOrgByG_L_P_S(groupId, language, parentId, statusOrg);
	}

	public static int countOrgByG_L_S(long groupId, java.lang.String language,
		java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().countOrgByG_L_S(groupId, language, parentId);
	}

	public static int countOrgByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countOrgByGroupId(groupId);
	}

	/**
	* Returns the number of v legal orgs.
	*
	* @return the number of v legal orgs
	*/
	public static int getVLegalOrgsCount() {
		return getService().getVLegalOrgsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<vn.gov.hoabinh.model.VLegalOrg> getAllOrg()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getAllOrg();
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalOrg> getAllOrgByS_L(
		long groupId, boolean status, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getAllOrgByS_L(groupId, status, language);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalOrg> getAllOrgByS_Rss(
		long groupId, boolean status, boolean rssable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getAllOrgByS_Rss(groupId, status, rssable);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByG_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getOrgByG_L(groupId, language);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByG_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getOrgByG_L(groupId, language, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByG_L_P(
		long groupId, java.lang.String language, java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getOrgByG_L_P(groupId, language, parentId);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByG_L_P(
		long groupId, java.lang.String language, java.lang.String parentId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getOrgByG_L_P(groupId, language, parentId, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByG_L_P_S(
		long groupId, java.lang.String language, java.lang.String parentId,
		boolean statusOrg)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getOrgByG_L_P_S(groupId, language, parentId, statusOrg);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByG_L_P_S(
		long groupId, java.lang.String language, java.lang.String parentId,
		boolean statusOrg, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getOrgByG_L_P_S(groupId, language, parentId, statusOrg,
			start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrgByGroupId(groupId);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByGroupId(
		long groupId, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrgByGroupId(groupId, begin, end);
	}

	/**
	* Returns a range of all the v legal orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @return the range of v legal orgs
	*/
	public static java.util.List<vn.gov.hoabinh.model.VLegalOrg> getVLegalOrgs(
		int start, int end) {
		return getService().getVLegalOrgs(start, end);
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

	public static vn.gov.hoabinh.model.VLegalOrg addOrg(long groupId,
		java.lang.String name, java.lang.String description,
		java.lang.String language, boolean rssable, boolean status,
		java.lang.String parentId,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .addOrg(groupId, name, description, language, rssable,
			status, parentId, themeDisplay);
	}

	/**
	* Adds the v legal org to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalOrg the v legal org
	* @return the v legal org that was added
	*/
	public static vn.gov.hoabinh.model.VLegalOrg addVLegalOrg(
		vn.gov.hoabinh.model.VLegalOrg vLegalOrg) {
		return getService().addVLegalOrg(vLegalOrg);
	}

	/**
	* Creates a new v legal org with the primary key. Does not add the v legal org to the database.
	*
	* @param orgId the primary key for the new v legal org
	* @return the new v legal org
	*/
	public static vn.gov.hoabinh.model.VLegalOrg createVLegalOrg(
		java.lang.String orgId) {
		return getService().createVLegalOrg(orgId);
	}

	/**
	* Deletes the v legal org with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgId the primary key of the v legal org
	* @return the v legal org that was removed
	* @throws PortalException if a v legal org with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalOrg deleteVLegalOrg(
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVLegalOrg(orgId);
	}

	/**
	* Deletes the v legal org from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalOrg the v legal org
	* @return the v legal org that was removed
	*/
	public static vn.gov.hoabinh.model.VLegalOrg deleteVLegalOrg(
		vn.gov.hoabinh.model.VLegalOrg vLegalOrg) {
		return getService().deleteVLegalOrg(vLegalOrg);
	}

	public static vn.gov.hoabinh.model.VLegalOrg fetchVLegalOrg(
		java.lang.String orgId) {
		return getService().fetchVLegalOrg(orgId);
	}

	public static vn.gov.hoabinh.model.VLegalOrg getOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getOrg(orgId);
	}

	public static vn.gov.hoabinh.model.VLegalOrg getOrg(long groupId,
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getOrg(groupId, orgId);
	}

	/**
	* Returns the v legal org with the primary key.
	*
	* @param orgId the primary key of the v legal org
	* @return the v legal org
	* @throws PortalException if a v legal org with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalOrg getVLegalOrg(
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVLegalOrg(orgId);
	}

	public static vn.gov.hoabinh.model.VLegalOrg updateOrg(long groupId,
		java.lang.String orgId, java.lang.String name,
		java.lang.String description, java.lang.String language,
		boolean rssable, boolean status, java.lang.String parentId, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .updateOrg(groupId, orgId, name, description, language,
			rssable, status, parentId, position);
	}

	public static vn.gov.hoabinh.model.VLegalOrg updateOrg(
		vn.gov.hoabinh.model.VLegalOrg vOrg)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().updateOrg(vOrg);
	}

	/**
	* Updates the v legal org in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalOrg the v legal org
	* @return the v legal org that was updated
	*/
	public static vn.gov.hoabinh.model.VLegalOrg updateVLegalOrg(
		vn.gov.hoabinh.model.VLegalOrg vLegalOrg) {
		return getService().updateVLegalOrg(vLegalOrg);
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

	public static void addEntryResources(vn.gov.hoabinh.model.VLegalOrg entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entry, addCommunityPermissions,
			addGuestPermissions);
	}

	public static void addEntryResources(vn.gov.hoabinh.model.VLegalOrg entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addEntryResources(entry, communityPermissions, guestPermissions);
	}

	public static void deleteOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteOrg(orgId);
	}

	public static VLegalOrgLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalOrgLocalService, VLegalOrgLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VLegalOrgLocalService.class);
}