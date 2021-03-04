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
 * Provides a wrapper for {@link LinksLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LinksLocalService
 * @generated
 */
@ProviderType
public class LinksLocalServiceWrapper implements LinksLocalService,
	ServiceWrapper<LinksLocalService> {
	public LinksLocalServiceWrapper(LinksLocalService linksLocalService) {
		_linksLocalService = linksLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _linksLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildSearch(
		long groupId, long linkGroupId, java.lang.String keyword,
		boolean isCount) {
		return _linksLocalService.buildSearch(groupId, linkGroupId, keyword,
			isCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _linksLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _linksLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _linksLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _linksLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linksLocalService.countByGroupId(groupId);
	}

	@Override
	public int countByLinkG_GL(long groupId, long linkGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linksLocalService.countByLinkG_GL(groupId, linkGroupId);
	}

	@Override
	public int countLinkSearch(long groupId, long linkGroupId,
		java.lang.String keyword)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linksLocalService.countLinkSearch(groupId, linkGroupId, keyword);
	}

	/**
	* Returns the number of linkses.
	*
	* @return the number of linkses
	*/
	@Override
	public int getLinksesCount() {
		return _linksLocalService.getLinksesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _linksLocalService.getOSGiServiceIdentifier();
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
		return _linksLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _linksLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _linksLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Links> getByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linksLocalService.getByGroupId(groupId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Links> getByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linksLocalService.getByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Links> getByLinkG_GL(
		long groupId, long linkGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linksLocalService.getByLinkG_GL(groupId, linkGroupId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Links> getByLinkG_GL(
		long groupId, long linkGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linksLocalService.getByLinkG_GL(groupId, linkGroupId, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Links> getByLinkGroupId(
		long linkGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linksLocalService.getByLinkGroupId(linkGroupId);
	}

	/**
	* Returns a range of all the linkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linkses
	* @param end the upper bound of the range of linkses (not inclusive)
	* @return the range of linkses
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.Links> getLinkses(int start,
		int end) {
		return _linksLocalService.getLinkses(start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Links> searchItem(long groupId,
		long linkGroupId, java.lang.String keyword, int start, int end) {
		return _linksLocalService.searchItem(groupId, linkGroupId, keyword,
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
		return _linksLocalService.dynamicQueryCount(dynamicQuery);
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
		return _linksLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.gov.hoabinh.model.Links addLinks(long groupId, long companyId,
		long plid, long linkgroupId, java.lang.String name,
		java.lang.String description, java.lang.String image,
		java.lang.String url, int position, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linksLocalService.addLinks(groupId, companyId, plid,
			linkgroupId, name, description, image, url, position, userId);
	}

	/**
	* Adds the links to the database. Also notifies the appropriate model listeners.
	*
	* @param links the links
	* @return the links that was added
	*/
	@Override
	public vn.gov.hoabinh.model.Links addLinks(vn.gov.hoabinh.model.Links links) {
		return _linksLocalService.addLinks(links);
	}

	/**
	* Creates a new links with the primary key. Does not add the links to the database.
	*
	* @param linkId the primary key for the new links
	* @return the new links
	*/
	@Override
	public vn.gov.hoabinh.model.Links createLinks(long linkId) {
		return _linksLocalService.createLinks(linkId);
	}

	/**
	* Deletes the links with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param linkId the primary key of the links
	* @return the links that was removed
	* @throws PortalException if a links with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.Links deleteLinks(long linkId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _linksLocalService.deleteLinks(linkId);
	}

	/**
	* Deletes the links from the database. Also notifies the appropriate model listeners.
	*
	* @param links the links
	* @return the links that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.Links deleteLinks(
		vn.gov.hoabinh.model.Links links) {
		return _linksLocalService.deleteLinks(links);
	}

	@Override
	public vn.gov.hoabinh.model.Links fetchLinks(long linkId) {
		return _linksLocalService.fetchLinks(linkId);
	}

	/**
	* Returns the links with the primary key.
	*
	* @param linkId the primary key of the links
	* @return the links
	* @throws PortalException if a links with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.Links getLinks(long linkId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _linksLocalService.getLinks(linkId);
	}

	@Override
	public vn.gov.hoabinh.model.Links updateLink(
		vn.gov.hoabinh.model.Links link)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linksLocalService.updateLink(link);
	}

	@Override
	public vn.gov.hoabinh.model.Links updateLinks(long linkId, long groupId,
		long companyId, long linkgroupId, java.lang.String name,
		java.lang.String description, java.lang.String image,
		java.lang.String url, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _linksLocalService.updateLinks(linkId, groupId, companyId,
			linkgroupId, name, description, image, url, position);
	}

	/**
	* Updates the links in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param links the links
	* @return the links that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.Links updateLinks(
		vn.gov.hoabinh.model.Links links) {
		return _linksLocalService.updateLinks(links);
	}

	@Override
	public void deleteLink(long linkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_linksLocalService.deleteLink(linkId);
	}

	@Override
	public LinksLocalService getWrappedService() {
		return _linksLocalService;
	}

	@Override
	public void setWrappedService(LinksLocalService linksLocalService) {
		_linksLocalService = linksLocalService;
	}

	private LinksLocalService _linksLocalService;
}