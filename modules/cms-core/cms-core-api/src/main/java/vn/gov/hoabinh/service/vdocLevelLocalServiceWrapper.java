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
 * Provides a wrapper for {@link vdocLevelLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see vdocLevelLocalService
 * @generated
 */
@ProviderType
public class vdocLevelLocalServiceWrapper implements vdocLevelLocalService,
	ServiceWrapper<vdocLevelLocalService> {
	public vdocLevelLocalServiceWrapper(
		vdocLevelLocalService vdocLevelLocalService) {
		_vdocLevelLocalService = vdocLevelLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vdocLevelLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocLevelLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocLevelLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countLevelByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocLevelLocalService.countLevelByG_L(groupId, language);
	}

	/**
	* Returns the number of vdoc levels.
	*
	* @return the number of vdoc levels
	*/
	@Override
	public int getvdocLevelsCount() {
		return _vdocLevelLocalService.getvdocLevelsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vdocLevelLocalService.getOSGiServiceIdentifier();
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
		return _vdocLevelLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vdocLevelLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vdocLevelLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocLevel> getLevelByG_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocLevelLocalService.getLevelByG_L(groupId, language);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocLevel> getLevelByG_L(
		long groupId, java.lang.String language, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocLevelLocalService.getLevelByG_L(groupId, language, begin,
			end);
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
	@Override
	public java.util.List<vn.gov.hoabinh.model.vdocLevel> getvdocLevels(
		int start, int end) {
		return _vdocLevelLocalService.getvdocLevels(start, end);
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
		return _vdocLevelLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vdocLevelLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.gov.hoabinh.model.vdocLevel addLevel(long groupId, long userId,
		java.lang.String language, java.lang.String name,
		java.lang.String description, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocLevelLocalService.addLevel(groupId, userId, language, name,
			description, position);
	}

	/**
	* Adds the vdoc level to the database. Also notifies the appropriate model listeners.
	*
	* @param vdocLevel the vdoc level
	* @return the vdoc level that was added
	*/
	@Override
	public vn.gov.hoabinh.model.vdocLevel addvdocLevel(
		vn.gov.hoabinh.model.vdocLevel vdocLevel) {
		return _vdocLevelLocalService.addvdocLevel(vdocLevel);
	}

	/**
	* Creates a new vdoc level with the primary key. Does not add the vdoc level to the database.
	*
	* @param levelId the primary key for the new vdoc level
	* @return the new vdoc level
	*/
	@Override
	public vn.gov.hoabinh.model.vdocLevel createvdocLevel(
		java.lang.String levelId) {
		return _vdocLevelLocalService.createvdocLevel(levelId);
	}

	/**
	* Deletes the vdoc level with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param levelId the primary key of the vdoc level
	* @return the vdoc level that was removed
	* @throws PortalException if a vdoc level with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.vdocLevel deletevdocLevel(
		java.lang.String levelId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocLevelLocalService.deletevdocLevel(levelId);
	}

	/**
	* Deletes the vdoc level from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocLevel the vdoc level
	* @return the vdoc level that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.vdocLevel deletevdocLevel(
		vn.gov.hoabinh.model.vdocLevel vdocLevel) {
		return _vdocLevelLocalService.deletevdocLevel(vdocLevel);
	}

	@Override
	public vn.gov.hoabinh.model.vdocLevel fetchvdocLevel(
		java.lang.String levelId) {
		return _vdocLevelLocalService.fetchvdocLevel(levelId);
	}

	@Override
	public vn.gov.hoabinh.model.vdocLevel getLevel(java.lang.String levelId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocLevelLocalService.getLevel(levelId);
	}

	/**
	* Returns the vdoc level with the primary key.
	*
	* @param levelId the primary key of the vdoc level
	* @return the vdoc level
	* @throws PortalException if a vdoc level with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.vdocLevel getvdocLevel(java.lang.String levelId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vdocLevelLocalService.getvdocLevel(levelId);
	}

	@Override
	public vn.gov.hoabinh.model.vdocLevel updateLevel(
		java.lang.String levelId, long groupId, long userId,
		java.lang.String language, java.lang.String name,
		java.lang.String description, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vdocLevelLocalService.updateLevel(levelId, groupId, userId,
			language, name, description, position);
	}

	/**
	* Updates the vdoc level in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vdocLevel the vdoc level
	* @return the vdoc level that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.vdocLevel updatevdocLevel(
		vn.gov.hoabinh.model.vdocLevel vdocLevel) {
		return _vdocLevelLocalService.updatevdocLevel(vdocLevel);
	}

	@Override
	public void deleteLevel(java.lang.String levelId,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vdocLevelLocalService.deleteLevel(levelId, themeDisplay);
	}

	@Override
	public vdocLevelLocalService getWrappedService() {
		return _vdocLevelLocalService;
	}

	@Override
	public void setWrappedService(vdocLevelLocalService vdocLevelLocalService) {
		_vdocLevelLocalService = vdocLevelLocalService;
	}

	private vdocLevelLocalService _vdocLevelLocalService;
}