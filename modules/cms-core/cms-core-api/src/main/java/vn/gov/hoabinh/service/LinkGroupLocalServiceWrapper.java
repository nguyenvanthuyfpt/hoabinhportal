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
 * Provides a wrapper for {@link LinkGroupLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LinkGroupLocalService
 * @generated
 */
@ProviderType
public class LinkGroupLocalServiceWrapper implements LinkGroupLocalService,
	ServiceWrapper<LinkGroupLocalService> {
	public LinkGroupLocalServiceWrapper(
		LinkGroupLocalService linkGroupLocalService) {
		_linkGroupLocalService = linkGroupLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _linkGroupLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _linkGroupLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _linkGroupLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _linkGroupLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _linkGroupLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _linkGroupLocalService.countByGroupId(groupId);
	}

	/**
	* Returns the number of link groups.
	*
	* @return the number of link groups
	*/
	@Override
	public int getLinkGroupsCount() {
		return _linkGroupLocalService.getLinkGroupsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _linkGroupLocalService.getOSGiServiceIdentifier();
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
		return _linkGroupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _linkGroupLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _linkGroupLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.LinkGroup> getByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linkGroupLocalService.getByGroupId(groupId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.LinkGroup> getByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _linkGroupLocalService.getByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.LinkGroup> getLinkGroupByIds(
		java.lang.String[] linkGroupSel) {
		return _linkGroupLocalService.getLinkGroupByIds(linkGroupSel);
	}

	/**
	* Returns a range of all the link groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of link groups
	* @param end the upper bound of the range of link groups (not inclusive)
	* @return the range of link groups
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.LinkGroup> getLinkGroups(
		int start, int end) {
		return _linkGroupLocalService.getLinkGroups(start, end);
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
		return _linkGroupLocalService.dynamicQueryCount(dynamicQuery);
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
		return _linkGroupLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.gov.hoabinh.model.LinkGroup addLinkGroup(long groupId,
		long companyId, long plid, java.lang.String name,
		java.lang.String description, int position, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _linkGroupLocalService.addLinkGroup(groupId, companyId, plid,
			name, description, position, userId);
	}

	/**
	* Adds the link group to the database. Also notifies the appropriate model listeners.
	*
	* @param linkGroup the link group
	* @return the link group that was added
	*/
	@Override
	public vn.gov.hoabinh.model.LinkGroup addLinkGroup(
		vn.gov.hoabinh.model.LinkGroup linkGroup) {
		return _linkGroupLocalService.addLinkGroup(linkGroup);
	}

	/**
	* Creates a new link group with the primary key. Does not add the link group to the database.
	*
	* @param linkgroupId the primary key for the new link group
	* @return the new link group
	*/
	@Override
	public vn.gov.hoabinh.model.LinkGroup createLinkGroup(long linkgroupId) {
		return _linkGroupLocalService.createLinkGroup(linkgroupId);
	}

	/**
	* Deletes the link group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param linkgroupId the primary key of the link group
	* @return the link group that was removed
	* @throws PortalException if a link group with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.LinkGroup deleteLinkGroup(long linkgroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _linkGroupLocalService.deleteLinkGroup(linkgroupId);
	}

	/**
	* Deletes the link group from the database. Also notifies the appropriate model listeners.
	*
	* @param linkGroup the link group
	* @return the link group that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.LinkGroup deleteLinkGroup(
		vn.gov.hoabinh.model.LinkGroup linkGroup) {
		return _linkGroupLocalService.deleteLinkGroup(linkGroup);
	}

	@Override
	public vn.gov.hoabinh.model.LinkGroup fetchLinkGroup(long linkgroupId) {
		return _linkGroupLocalService.fetchLinkGroup(linkgroupId);
	}

	/**
	* Returns the link group with the primary key.
	*
	* @param linkgroupId the primary key of the link group
	* @return the link group
	* @throws PortalException if a link group with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.LinkGroup getLinkGroup(long linkgroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _linkGroupLocalService.getLinkGroup(linkgroupId);
	}

	@Override
	public vn.gov.hoabinh.model.LinkGroup updateLinkGroup(long linkgroupId,
		long groupId, long companyId, java.lang.String name,
		java.lang.String description, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linkGroupLocalService.updateLinkGroup(linkgroupId, groupId,
			companyId, name, description, position);
	}

	/**
	* Updates the link group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param linkGroup the link group
	* @return the link group that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.LinkGroup updateLinkGroup(
		vn.gov.hoabinh.model.LinkGroup linkGroup) {
		return _linkGroupLocalService.updateLinkGroup(linkGroup);
	}

	@Override
	public LinkGroupLocalService getWrappedService() {
		return _linkGroupLocalService;
	}

	@Override
	public void setWrappedService(LinkGroupLocalService linkGroupLocalService) {
		_linkGroupLocalService = linkGroupLocalService;
	}

	private LinkGroupLocalService _linkGroupLocalService;
}