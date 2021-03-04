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
 * Provides a wrapper for {@link AdvItemLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AdvItemLocalService
 * @generated
 */
@ProviderType
public class AdvItemLocalServiceWrapper implements AdvItemLocalService,
	ServiceWrapper<AdvItemLocalService> {
	public AdvItemLocalServiceWrapper(AdvItemLocalService advItemLocalService) {
		_advItemLocalService = advItemLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _advItemLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildSearch(
		long groupId, long typeId, java.lang.String desc, int status,
		boolean isCount) {
		return _advItemLocalService.buildSearch(groupId, typeId, desc, status,
			isCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _advItemLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _advItemLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advItemLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advItemLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countItem(long groupId, long typeId, java.lang.String desc,
		int status) {
		return _advItemLocalService.countItem(groupId, typeId, desc, status);
	}

	@Override
	public int countItemByG(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advItemLocalService.countItemByG(groupId);
	}

	@Override
	public int countItemByG_S(long groupId, boolean status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advItemLocalService.countItemByG_S(groupId, status);
	}

	@Override
	public int countItemByG_T(long groupId, long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advItemLocalService.countItemByG_T(groupId, typeId);
	}

	@Override
	public int countItemByG_T_S(long groupId, long typeId, boolean status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advItemLocalService.countItemByG_T_S(groupId, typeId, status);
	}

	/**
	* Returns the number of adv items.
	*
	* @return the number of adv items
	*/
	@Override
	public int getAdvItemsCount() {
		return _advItemLocalService.getAdvItemsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _advItemLocalService.getOSGiServiceIdentifier();
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
		return _advItemLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _advItemLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _advItemLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the adv items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of adv items
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.AdvItem> getAdvItems(int start,
		int end) {
		return _advItemLocalService.getAdvItems(start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.AdvItem> getAllbyType(
		long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advItemLocalService.getAllbyType(typeId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.AdvItem> getItemByG(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advItemLocalService.getItemByG(groupId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.AdvItem> getItemByG(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advItemLocalService.getItemByG(groupId, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.AdvItem> getItemByG_S(
		long groupId, boolean status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advItemLocalService.getItemByG_S(groupId, status);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.AdvItem> getItemByG_S(
		long groupId, boolean status, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advItemLocalService.getItemByG_S(groupId, status, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.AdvItem> getItemByG_T_S(
		long groupId, long typeId, boolean status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advItemLocalService.getItemByG_T_S(groupId, typeId, status);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.AdvItem> getItemByG_T_S(
		long groupId, long typeId, boolean status, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advItemLocalService.getItemByG_T_S(groupId, typeId, status,
			begin, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.AdvItem> searchItem(
		long groupId, long typeId, java.lang.String desc, int status,
		int start, int end) {
		return _advItemLocalService.searchItem(groupId, typeId, desc, status,
			start, end);
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
		return _advItemLocalService.dynamicQueryCount(dynamicQuery);
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
		return _advItemLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the adv item to the database. Also notifies the appropriate model listeners.
	*
	* @param advItem the adv item
	* @return the adv item that was added
	*/
	@Override
	public vn.gov.hoabinh.model.AdvItem addAdvItem(
		vn.gov.hoabinh.model.AdvItem advItem) {
		return _advItemLocalService.addAdvItem(advItem);
	}

	@Override
	public vn.gov.hoabinh.model.AdvItem addItem(long groupId, long companyId,
		long plid, java.lang.String name, java.lang.String description,
		java.lang.String url, boolean isTargetBlank,
		java.lang.String txtMouseOver, boolean status, long typeId,
		long folderId, java.util.Date expriedDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advItemLocalService.addItem(groupId, companyId, plid, name,
			description, url, isTargetBlank, txtMouseOver, status, typeId,
			folderId, expriedDate);
	}

	/**
	* Creates a new adv item with the primary key. Does not add the adv item to the database.
	*
	* @param itemId the primary key for the new adv item
	* @return the new adv item
	*/
	@Override
	public vn.gov.hoabinh.model.AdvItem createAdvItem(long itemId) {
		return _advItemLocalService.createAdvItem(itemId);
	}

	/**
	* Deletes the adv item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemId the primary key of the adv item
	* @return the adv item that was removed
	* @throws PortalException if a adv item with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.AdvItem deleteAdvItem(long itemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advItemLocalService.deleteAdvItem(itemId);
	}

	/**
	* Deletes the adv item from the database. Also notifies the appropriate model listeners.
	*
	* @param advItem the adv item
	* @return the adv item that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.AdvItem deleteAdvItem(
		vn.gov.hoabinh.model.AdvItem advItem) {
		return _advItemLocalService.deleteAdvItem(advItem);
	}

	@Override
	public vn.gov.hoabinh.model.AdvItem fetchAdvItem(long itemId) {
		return _advItemLocalService.fetchAdvItem(itemId);
	}

	/**
	* Returns the adv item with the primary key.
	*
	* @param itemId the primary key of the adv item
	* @return the adv item
	* @throws PortalException if a adv item with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.AdvItem getAdvItem(long itemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _advItemLocalService.getAdvItem(itemId);
	}

	@Override
	public vn.gov.hoabinh.model.AdvItem getItem(long itemId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advItemLocalService.getItem(itemId);
	}

	/**
	* Updates the adv item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param advItem the adv item
	* @return the adv item that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.AdvItem updateAdvItem(
		vn.gov.hoabinh.model.AdvItem advItem) {
		return _advItemLocalService.updateAdvItem(advItem);
	}

	@Override
	public vn.gov.hoabinh.model.AdvItem updateItem(long itemId, long groupId,
		long companyId, java.lang.String name, java.lang.String description,
		java.lang.String url, boolean isTargetBlank,
		java.lang.String txtMouseOver, boolean status, long typeId,
		long folderId, java.util.Date expriedDate)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advItemLocalService.updateItem(itemId, groupId, companyId,
			name, description, url, isTargetBlank, txtMouseOver, status,
			typeId, folderId, expriedDate);
	}

	@Override
	public vn.gov.hoabinh.model.AdvItem updateItem(
		vn.gov.hoabinh.model.AdvItem advItem)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _advItemLocalService.updateItem(advItem);
	}

	@Override
	public void deleteItem(long itemId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_advItemLocalService.deleteItem(itemId);
	}

	@Override
	public void deleteItembyType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_advItemLocalService.deleteItembyType(typeId);
	}

	@Override
	public AdvItemLocalService getWrappedService() {
		return _advItemLocalService;
	}

	@Override
	public void setWrappedService(AdvItemLocalService advItemLocalService) {
		_advItemLocalService = advItemLocalService;
	}

	private AdvItemLocalService _advItemLocalService;
}