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
 * Provides a wrapper for {@link vdocFieldLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see vdocFieldLocalService
 * @generated
 */
@ProviderType
public class vdocFieldLocalServiceWrapper implements vdocFieldLocalService,
	ServiceWrapper<vdocFieldLocalService> {
	public vdocFieldLocalServiceWrapper(
		vdocFieldLocalService vdocFieldLocalService) {
		_vdocFieldLocalService = vdocFieldLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vdocFieldLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocFieldLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocFieldLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countFieldByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLocalService.countFieldByG_L(groupId, language);
	}

	@Override
	public int countFieldByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLocalService.countFieldByG_L_P(groupId, language,
			parentId);
	}

	/**
	* Returns the number of vdoc fields.
	*
	* @return the number of vdoc fields
	*/
	@Override
	public int getvdocFieldsCount() {
		return _vdocFieldLocalService.getvdocFieldsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vdocFieldLocalService.getOSGiServiceIdentifier();
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
		return _vdocFieldLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vdocFieldLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vdocFieldLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocField> getFieldByG_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLocalService.getFieldByG_L(groupId, language);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocField> getFieldByG_L(
		long groupId, java.lang.String language, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLocalService.getFieldByG_L(groupId, language, begin,
			end);
	}

	@Override
	public java.util.List getFieldByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLocalService.getFieldByG_L_P(groupId, language,
			parentId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocField> getFieldByG_L_P(
		long groupId, java.lang.String language, java.lang.String parentId,
		int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLocalService.getFieldByG_L_P(groupId, language,
			parentId, begin, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocField> getFieldByParentId(
		java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLocalService.getFieldByParentId(parentId);
	}

	/**
	* Returns a range of all the vdoc fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc fields
	* @param end the upper bound of the range of vdoc fields (not inclusive)
	* @return the range of vdoc fields
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocField> getvdocFields(
		int start, int end) {
		return _vdocFieldLocalService.getvdocFields(start, end);
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
		return _vdocFieldLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vdocFieldLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.gov.hoabinh.model.vdocField addField(long groupId, long userId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String name, java.lang.String description,
		boolean statusField, int position, java.lang.String listparent,
		java.lang.String levels)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLocalService.addField(groupId, userId, language,
			parentId, name, description, statusField, position, listparent,
			levels);
	}

	/**
	* Adds the vdoc field to the database. Also notifies the appropriate model listeners.
	*
	* @param vdocField the vdoc field
	* @return the vdoc field that was added
	*/
	@Override
	public vn.gov.hoabinh.model.vdocField addvdocField(
		vn.gov.hoabinh.model.vdocField vdocField) {
		return _vdocFieldLocalService.addvdocField(vdocField);
	}

	/**
	* Creates a new vdoc field with the primary key. Does not add the vdoc field to the database.
	*
	* @param fieldId the primary key for the new vdoc field
	* @return the new vdoc field
	*/
	@Override
	public vn.gov.hoabinh.model.vdocField createvdocField(
		java.lang.String fieldId) {
		return _vdocFieldLocalService.createvdocField(fieldId);
	}

	/**
	* Deletes the vdoc field with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fieldId the primary key of the vdoc field
	* @return the vdoc field that was removed
	* @throws PortalException if a vdoc field with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.vdocField deletevdocField(
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocFieldLocalService.deletevdocField(fieldId);
	}

	/**
	* Deletes the vdoc field from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocField the vdoc field
	* @return the vdoc field that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.vdocField deletevdocField(
		vn.gov.hoabinh.model.vdocField vdocField) {
		return _vdocFieldLocalService.deletevdocField(vdocField);
	}

	@Override
	public vn.gov.hoabinh.model.vdocField fetchvdocField(
		java.lang.String fieldId) {
		return _vdocFieldLocalService.fetchvdocField(fieldId);
	}

	@Override
	public vn.gov.hoabinh.model.vdocField getField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLocalService.getField(fieldId);
	}

	/**
	* Returns the vdoc field with the primary key.
	*
	* @param fieldId the primary key of the vdoc field
	* @return the vdoc field
	* @throws PortalException if a vdoc field with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.vdocField getvdocField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocFieldLocalService.getvdocField(fieldId);
	}

	@Override
	public vn.gov.hoabinh.model.vdocField updateField(
		java.lang.String fieldId, long groupId, long userId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String name, java.lang.String description,
		boolean statusField, int position, java.lang.String listparent,
		java.lang.String levels,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLocalService.updateField(fieldId, groupId, userId,
			language, parentId, name, description, statusField, position,
			listparent, levels, themeDisplay);
	}

	@Override
	public vn.gov.hoabinh.model.vdocField updateField(
		vn.gov.hoabinh.model.vdocField field,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocFieldLocalService.updateField(field, themeDisplay);
	}

	/**
	* Updates the vdoc field in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vdocField the vdoc field
	* @return the vdoc field that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.vdocField updatevdocField(
		vn.gov.hoabinh.model.vdocField vdocField) {
		return _vdocFieldLocalService.updatevdocField(vdocField);
	}

	@Override
	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vdocFieldLocalService.addEntryResources(entryId,
			addCommunityPermissions, addGuestPermissions);
	}

	@Override
	public void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vdocFieldLocalService.addEntryResources(entryId, communityPermissions,
			guestPermissions);
	}

	@Override
	public void addEntryResources(vn.gov.hoabinh.model.vdocField entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vdocFieldLocalService.addEntryResources(entry,
			addCommunityPermissions, addGuestPermissions);
	}

	@Override
	public void addEntryResources(vn.gov.hoabinh.model.vdocField entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_vdocFieldLocalService.addEntryResources(entry, communityPermissions,
			guestPermissions);
	}

	@Override
	public void deleteField(java.lang.String fieldId,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vdocFieldLocalService.deleteField(fieldId, themeDisplay);
	}

	@Override
	public vdocFieldLocalService getWrappedService() {
		return _vdocFieldLocalService;
	}

	@Override
	public void setWrappedService(vdocFieldLocalService vdocFieldLocalService) {
		_vdocFieldLocalService = vdocFieldLocalService;
	}

	private vdocFieldLocalService _vdocFieldLocalService;
}