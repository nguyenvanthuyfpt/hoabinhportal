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
 * Provides a wrapper for {@link vdocOrgLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see vdocOrgLocalService
 * @generated
 */
@ProviderType
public class vdocOrgLocalServiceWrapper implements vdocOrgLocalService,
	ServiceWrapper<vdocOrgLocalService> {
	public vdocOrgLocalServiceWrapper(vdocOrgLocalService vdocOrgLocalService) {
		_vdocOrgLocalService = vdocOrgLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vdocOrgLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocOrgLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocOrgLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countOrgByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocOrgLocalService.countOrgByG_L(groupId, language);
	}

	@Override
	public int countOrgByG_L(long groupId, java.lang.String language,
		java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocOrgLocalService.countOrgByG_L(groupId, language, parentId);
	}

	/**
	* Returns the number of vdoc orgs.
	*
	* @return the number of vdoc orgs
	*/
	@Override
	public int getvdocOrgsCount() {
		return _vdocOrgLocalService.getvdocOrgsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vdocOrgLocalService.getOSGiServiceIdentifier();
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
		return _vdocOrgLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vdocOrgLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vdocOrgLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocOrg> getOrgByG_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocOrgLocalService.getOrgByG_L(groupId, language);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocOrg> getOrgByG_L(
		long groupId, java.lang.String language, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocOrgLocalService.getOrgByG_L(groupId, language, begin, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocOrg> getOrgByG_L_P(
		long groupId, java.lang.String language, java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocOrgLocalService.getOrgByG_L_P(groupId, language, parentId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocOrg> getOrgByG_L_P(
		long groupId, java.lang.String language, java.lang.String parentId,
		int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocOrgLocalService.getOrgByG_L_P(groupId, language, parentId,
			begin, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocOrg> getOrgByParentId(
		java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocOrgLocalService.getOrgByParentId(parentId);
	}

	/**
	* Returns a range of all the vdoc orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc orgs
	* @param end the upper bound of the range of vdoc orgs (not inclusive)
	* @return the range of vdoc orgs
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocOrg> getvdocOrgs(int start,
		int end) {
		return _vdocOrgLocalService.getvdocOrgs(start, end);
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
		return _vdocOrgLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vdocOrgLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.gov.hoabinh.model.vdocOrg addOrg(long groupId,
		java.lang.String language, long userId, long companyId,
		java.lang.String parentId, java.lang.String code,
		java.lang.String name, java.lang.String description,
		java.lang.String address, java.lang.String phone, java.lang.String fax,
		boolean statusOrg, int position, java.lang.String listparent)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocOrgLocalService.addOrg(groupId, language, userId,
			companyId, parentId, code, name, description, address, phone, fax,
			statusOrg, position, listparent);
	}

	/**
	* Adds the vdoc org to the database. Also notifies the appropriate model listeners.
	*
	* @param vdocOrg the vdoc org
	* @return the vdoc org that was added
	*/
	@Override
	public vn.gov.hoabinh.model.vdocOrg addvdocOrg(
		vn.gov.hoabinh.model.vdocOrg vdocOrg) {
		return _vdocOrgLocalService.addvdocOrg(vdocOrg);
	}

	/**
	* Creates a new vdoc org with the primary key. Does not add the vdoc org to the database.
	*
	* @param orgId the primary key for the new vdoc org
	* @return the new vdoc org
	*/
	@Override
	public vn.gov.hoabinh.model.vdocOrg createvdocOrg(java.lang.String orgId) {
		return _vdocOrgLocalService.createvdocOrg(orgId);
	}

	/**
	* Deletes the vdoc org with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgId the primary key of the vdoc org
	* @return the vdoc org that was removed
	* @throws PortalException if a vdoc org with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.vdocOrg deletevdocOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocOrgLocalService.deletevdocOrg(orgId);
	}

	/**
	* Deletes the vdoc org from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocOrg the vdoc org
	* @return the vdoc org that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.vdocOrg deletevdocOrg(
		vn.gov.hoabinh.model.vdocOrg vdocOrg) {
		return _vdocOrgLocalService.deletevdocOrg(vdocOrg);
	}

	@Override
	public vn.gov.hoabinh.model.vdocOrg fetchvdocOrg(java.lang.String orgId) {
		return _vdocOrgLocalService.fetchvdocOrg(orgId);
	}

	@Override
	public vn.gov.hoabinh.model.vdocOrg getOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocOrgLocalService.getOrg(orgId);
	}

	/**
	* Returns the vdoc org with the primary key.
	*
	* @param orgId the primary key of the vdoc org
	* @return the vdoc org
	* @throws PortalException if a vdoc org with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.vdocOrg getvdocOrg(java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocOrgLocalService.getvdocOrg(orgId);
	}

	@Override
	public vn.gov.hoabinh.model.vdocOrg updateOrg(java.lang.String orgId,
		long groupId, java.lang.String language, long userId,
		java.lang.String parentId, java.lang.String code,
		java.lang.String name, java.lang.String description,
		java.lang.String address, java.lang.String phone, java.lang.String fax,
		boolean statusOrg, int position, java.lang.String listparent,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocOrgLocalService.updateOrg(orgId, groupId, language, userId,
			parentId, code, name, description, address, phone, fax, statusOrg,
			position, listparent, themeDisplay);
	}

	/**
	* Updates the vdoc org in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vdocOrg the vdoc org
	* @return the vdoc org that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.vdocOrg updatevdocOrg(
		vn.gov.hoabinh.model.vdocOrg vdocOrg) {
		return _vdocOrgLocalService.updatevdocOrg(vdocOrg);
	}

	@Override
	public vdocOrgLocalService getWrappedService() {
		return _vdocOrgLocalService;
	}

	@Override
	public void setWrappedService(vdocOrgLocalService vdocOrgLocalService) {
		_vdocOrgLocalService = vdocOrgLocalService;
	}

	private vdocOrgLocalService _vdocOrgLocalService;
}