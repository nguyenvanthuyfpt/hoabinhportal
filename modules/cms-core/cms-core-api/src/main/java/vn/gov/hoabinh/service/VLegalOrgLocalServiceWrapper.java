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
 * Provides a wrapper for {@link VLegalOrgLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalOrgLocalService
 * @generated
 */
@ProviderType
public class VLegalOrgLocalServiceWrapper implements VLegalOrgLocalService,
	ServiceWrapper<VLegalOrgLocalService> {
	public VLegalOrgLocalServiceWrapper(
		VLegalOrgLocalService vLegalOrgLocalService) {
		_vLegalOrgLocalService = vLegalOrgLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vLegalOrgLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalOrgLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalOrgLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countOrgByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.countOrgByG_L(groupId, language);
	}

	@Override
	public int countOrgByG_L_P_S(long groupId, java.lang.String language,
		java.lang.String parentId, boolean statusOrg)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.countOrgByG_L_P_S(groupId, language,
			parentId, statusOrg);
	}

	@Override
	public int countOrgByG_L_S(long groupId, java.lang.String language,
		java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.countOrgByG_L_S(groupId, language,
			parentId);
	}

	@Override
	public int countOrgByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalOrgLocalService.countOrgByGroupId(groupId);
	}

	/**
	* Returns the number of v legal orgs.
	*
	* @return the number of v legal orgs
	*/
	@Override
	public int getVLegalOrgsCount() {
		return _vLegalOrgLocalService.getVLegalOrgsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vLegalOrgLocalService.getOSGiServiceIdentifier();
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
		return _vLegalOrgLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vLegalOrgLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vLegalOrgLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalOrg> getAllOrg()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.getAllOrg();
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalOrg> getAllOrgByS_L(
		long groupId, boolean status, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.getAllOrgByS_L(groupId, status, language);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalOrg> getAllOrgByS_Rss(
		long groupId, boolean status, boolean rssable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.getAllOrgByS_Rss(groupId, status, rssable);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByG_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.getOrgByG_L(groupId, language);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByG_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.getOrgByG_L(groupId, language, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByG_L_P(
		long groupId, java.lang.String language, java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.getOrgByG_L_P(groupId, language, parentId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByG_L_P(
		long groupId, java.lang.String language, java.lang.String parentId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.getOrgByG_L_P(groupId, language,
			parentId, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByG_L_P_S(
		long groupId, java.lang.String language, java.lang.String parentId,
		boolean statusOrg)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.getOrgByG_L_P_S(groupId, language,
			parentId, statusOrg);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByG_L_P_S(
		long groupId, java.lang.String language, java.lang.String parentId,
		boolean statusOrg, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.getOrgByG_L_P_S(groupId, language,
			parentId, statusOrg, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalOrgLocalService.getOrgByGroupId(groupId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalOrg> getOrgByGroupId(
		long groupId, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalOrgLocalService.getOrgByGroupId(groupId, begin, end);
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
	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalOrg> getVLegalOrgs(
		int start, int end) {
		return _vLegalOrgLocalService.getVLegalOrgs(start, end);
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
		return _vLegalOrgLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vLegalOrgLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalOrg addOrg(long groupId,
		java.lang.String name, java.lang.String description,
		java.lang.String language, boolean rssable, boolean status,
		java.lang.String parentId,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.addOrg(groupId, name, description,
			language, rssable, status, parentId, themeDisplay);
	}

	/**
	* Adds the v legal org to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalOrg the v legal org
	* @return the v legal org that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalOrg addVLegalOrg(
		vn.gov.hoabinh.model.VLegalOrg vLegalOrg) {
		return _vLegalOrgLocalService.addVLegalOrg(vLegalOrg);
	}

	/**
	* Creates a new v legal org with the primary key. Does not add the v legal org to the database.
	*
	* @param orgId the primary key for the new v legal org
	* @return the new v legal org
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalOrg createVLegalOrg(
		java.lang.String orgId) {
		return _vLegalOrgLocalService.createVLegalOrg(orgId);
	}

	/**
	* Deletes the v legal org with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgId the primary key of the v legal org
	* @return the v legal org that was removed
	* @throws PortalException if a v legal org with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalOrg deleteVLegalOrg(
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalOrgLocalService.deleteVLegalOrg(orgId);
	}

	/**
	* Deletes the v legal org from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalOrg the v legal org
	* @return the v legal org that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalOrg deleteVLegalOrg(
		vn.gov.hoabinh.model.VLegalOrg vLegalOrg) {
		return _vLegalOrgLocalService.deleteVLegalOrg(vLegalOrg);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalOrg fetchVLegalOrg(java.lang.String orgId) {
		return _vLegalOrgLocalService.fetchVLegalOrg(orgId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalOrg getOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.getOrg(orgId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalOrg getOrg(long groupId,
		java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.getOrg(groupId, orgId);
	}

	/**
	* Returns the v legal org with the primary key.
	*
	* @param orgId the primary key of the v legal org
	* @return the v legal org
	* @throws PortalException if a v legal org with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalOrg getVLegalOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalOrgLocalService.getVLegalOrg(orgId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalOrg updateOrg(long groupId,
		java.lang.String orgId, java.lang.String name,
		java.lang.String description, java.lang.String language,
		boolean rssable, boolean status, java.lang.String parentId, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.updateOrg(groupId, orgId, name,
			description, language, rssable, status, parentId, position);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalOrg updateOrg(
		vn.gov.hoabinh.model.VLegalOrg vOrg)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalOrgLocalService.updateOrg(vOrg);
	}

	/**
	* Updates the v legal org in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalOrg the v legal org
	* @return the v legal org that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalOrg updateVLegalOrg(
		vn.gov.hoabinh.model.VLegalOrg vLegalOrg) {
		return _vLegalOrgLocalService.updateVLegalOrg(vLegalOrg);
	}

	@Override
	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalOrgLocalService.addEntryResources(entryId,
			addCommunityPermissions, addGuestPermissions);
	}

	@Override
	public void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalOrgLocalService.addEntryResources(entryId, communityPermissions,
			guestPermissions);
	}

	@Override
	public void addEntryResources(vn.gov.hoabinh.model.VLegalOrg entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalOrgLocalService.addEntryResources(entry,
			addCommunityPermissions, addGuestPermissions);
	}

	@Override
	public void addEntryResources(vn.gov.hoabinh.model.VLegalOrg entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vLegalOrgLocalService.addEntryResources(entry, communityPermissions,
			guestPermissions);
	}

	@Override
	public void deleteOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalOrgLocalService.deleteOrg(orgId);
	}

	@Override
	public VLegalOrgLocalService getWrappedService() {
		return _vLegalOrgLocalService;
	}

	@Override
	public void setWrappedService(VLegalOrgLocalService vLegalOrgLocalService) {
		_vLegalOrgLocalService = vLegalOrgLocalService;
	}

	private VLegalOrgLocalService _vLegalOrgLocalService;
}