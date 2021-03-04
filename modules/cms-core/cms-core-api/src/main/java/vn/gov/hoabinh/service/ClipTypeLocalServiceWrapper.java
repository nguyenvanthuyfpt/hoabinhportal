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
 * Provides a wrapper for {@link ClipTypeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ClipTypeLocalService
 * @generated
 */
@ProviderType
public class ClipTypeLocalServiceWrapper implements ClipTypeLocalService,
	ServiceWrapper<ClipTypeLocalService> {
	public ClipTypeLocalServiceWrapper(
		ClipTypeLocalService clipTypeLocalService) {
		_clipTypeLocalService = clipTypeLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _clipTypeLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _clipTypeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _clipTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countClipTypeByG_L_A(long groupId, java.lang.String language,
		boolean active) throws java.lang.Exception {
		return _clipTypeLocalService.countClipTypeByG_L_A(groupId, language,
			active);
	}

	/**
	* Returns the number of clip types.
	*
	* @return the number of clip types
	*/
	@Override
	public int getClipTypesCount() {
		return _clipTypeLocalService.getClipTypesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _clipTypeLocalService.getOSGiServiceIdentifier();
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
		return _clipTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _clipTypeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _clipTypeLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.ClipType> getCategoryMenu(
		java.lang.String[] ids) {
		return _clipTypeLocalService.getCategoryMenu(ids);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.ClipType> getClipTypeByG_L_A(
		long groupId, java.lang.String language, boolean active)
		throws java.lang.Exception {
		return _clipTypeLocalService.getClipTypeByG_L_A(groupId, language,
			active);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.ClipType> getClipTypeByG_L_A(
		long groupId, java.lang.String language, boolean active, int begin,
		int end) throws java.lang.Exception {
		return _clipTypeLocalService.getClipTypeByG_L_A(groupId, language,
			active, begin, end);
	}

	/**
	* Returns a range of all the clip types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @return the range of clip types
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.ClipType> getClipTypes(
		int start, int end) {
		return _clipTypeLocalService.getClipTypes(start, end);
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
		return _clipTypeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _clipTypeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.gov.hoabinh.model.ClipType addClipType(long groupId,
		java.lang.String language, long companyId, long plid, long userId,
		java.lang.String title, java.lang.String name,
		java.lang.String description, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _clipTypeLocalService.addClipType(groupId, language, companyId,
			plid, userId, title, name, description, active);
	}

	/**
	* Adds the clip type to the database. Also notifies the appropriate model listeners.
	*
	* @param clipType the clip type
	* @return the clip type that was added
	*/
	@Override
	public vn.gov.hoabinh.model.ClipType addClipType(
		vn.gov.hoabinh.model.ClipType clipType) {
		return _clipTypeLocalService.addClipType(clipType);
	}

	/**
	* Creates a new clip type with the primary key. Does not add the clip type to the database.
	*
	* @param id the primary key for the new clip type
	* @return the new clip type
	*/
	@Override
	public vn.gov.hoabinh.model.ClipType createClipType(java.lang.String id) {
		return _clipTypeLocalService.createClipType(id);
	}

	/**
	* Deletes the clip type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the clip type
	* @return the clip type that was removed
	* @throws PortalException if a clip type with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.ClipType deleteClipType(java.lang.String id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _clipTypeLocalService.deleteClipType(id);
	}

	/**
	* Deletes the clip type from the database. Also notifies the appropriate model listeners.
	*
	* @param clipType the clip type
	* @return the clip type that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.ClipType deleteClipType(
		vn.gov.hoabinh.model.ClipType clipType) {
		return _clipTypeLocalService.deleteClipType(clipType);
	}

	@Override
	public vn.gov.hoabinh.model.ClipType fetchClipType(java.lang.String id) {
		return _clipTypeLocalService.fetchClipType(id);
	}

	/**
	* Returns the clip type with the primary key.
	*
	* @param id the primary key of the clip type
	* @return the clip type
	* @throws PortalException if a clip type with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.ClipType getClipType(java.lang.String id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _clipTypeLocalService.getClipType(id);
	}

	@Override
	public vn.gov.hoabinh.model.ClipType getClipType(long typeId)
		throws java.lang.Exception {
		return _clipTypeLocalService.getClipType(typeId);
	}

	@Override
	public vn.gov.hoabinh.model.ClipType updateClipType(
		java.lang.String clipTypeId, long groupId, java.lang.String language,
		long companyId, java.lang.String title, java.lang.String name,
		java.lang.String description, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _clipTypeLocalService.updateClipType(clipTypeId, groupId,
			language, companyId, title, name, description, active);
	}

	/**
	* Updates the clip type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param clipType the clip type
	* @return the clip type that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.ClipType updateClipType(
		vn.gov.hoabinh.model.ClipType clipType) {
		return _clipTypeLocalService.updateClipType(clipType);
	}

	@Override
	public void deleteClipType(long clipTypeId) throws java.lang.Exception {
		_clipTypeLocalService.deleteClipType(clipTypeId);
	}

	@Override
	public ClipTypeLocalService getWrappedService() {
		return _clipTypeLocalService;
	}

	@Override
	public void setWrappedService(ClipTypeLocalService clipTypeLocalService) {
		_clipTypeLocalService = clipTypeLocalService;
	}

	private ClipTypeLocalService _clipTypeLocalService;
}