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
 * Provides the local service utility for Links. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.LinksLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see LinksLocalService
 * @see vn.gov.hoabinh.service.base.LinksLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.LinksLocalServiceImpl
 * @generated
 */
@ProviderType
public class LinksLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.LinksLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery buildSearch(
		long groupId, long linkGroupId, java.lang.String keyword,
		boolean isCount) {
		return getService().buildSearch(groupId, linkGroupId, keyword, isCount);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
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

	public static int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countByGroupId(groupId);
	}

	public static int countByLinkG_GL(long groupId, long linkGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countByLinkG_GL(groupId, linkGroupId);
	}

	public static int countLinkSearch(long groupId, long linkGroupId,
		java.lang.String keyword)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countLinkSearch(groupId, linkGroupId, keyword);
	}

	/**
	* Returns the number of linkses.
	*
	* @return the number of linkses
	*/
	public static int getLinksesCount() {
		return getService().getLinksesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<vn.gov.hoabinh.model.Links> getByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByGroupId(groupId);
	}

	public static java.util.List<vn.gov.hoabinh.model.Links> getByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByGroupId(groupId, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.Links> getByLinkG_GL(
		long groupId, long linkGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByLinkG_GL(groupId, linkGroupId);
	}

	public static java.util.List<vn.gov.hoabinh.model.Links> getByLinkG_GL(
		long groupId, long linkGroupId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByLinkG_GL(groupId, linkGroupId, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.Links> getByLinkGroupId(
		long linkGroupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByLinkGroupId(linkGroupId);
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
	public static java.util.List<vn.gov.hoabinh.model.Links> getLinkses(
		int start, int end) {
		return getService().getLinkses(start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.Links> searchItem(
		long groupId, long linkGroupId, java.lang.String keyword, int start,
		int end) {
		return getService().searchItem(groupId, linkGroupId, keyword, start, end);
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

	public static vn.gov.hoabinh.model.Links addLinks(long groupId,
		long companyId, long plid, long linkgroupId, java.lang.String name,
		java.lang.String description, java.lang.String image,
		java.lang.String url, int position, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addLinks(groupId, companyId, plid, linkgroupId, name,
			description, image, url, position, userId);
	}

	/**
	* Adds the links to the database. Also notifies the appropriate model listeners.
	*
	* @param links the links
	* @return the links that was added
	*/
	public static vn.gov.hoabinh.model.Links addLinks(
		vn.gov.hoabinh.model.Links links) {
		return getService().addLinks(links);
	}

	/**
	* Creates a new links with the primary key. Does not add the links to the database.
	*
	* @param linkId the primary key for the new links
	* @return the new links
	*/
	public static vn.gov.hoabinh.model.Links createLinks(long linkId) {
		return getService().createLinks(linkId);
	}

	/**
	* Deletes the links with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param linkId the primary key of the links
	* @return the links that was removed
	* @throws PortalException if a links with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.Links deleteLinks(long linkId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteLinks(linkId);
	}

	/**
	* Deletes the links from the database. Also notifies the appropriate model listeners.
	*
	* @param links the links
	* @return the links that was removed
	*/
	public static vn.gov.hoabinh.model.Links deleteLinks(
		vn.gov.hoabinh.model.Links links) {
		return getService().deleteLinks(links);
	}

	public static vn.gov.hoabinh.model.Links fetchLinks(long linkId) {
		return getService().fetchLinks(linkId);
	}

	/**
	* Returns the links with the primary key.
	*
	* @param linkId the primary key of the links
	* @return the links
	* @throws PortalException if a links with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.Links getLinks(long linkId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getLinks(linkId);
	}

	public static vn.gov.hoabinh.model.Links updateLink(
		vn.gov.hoabinh.model.Links link)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateLink(link);
	}

	public static vn.gov.hoabinh.model.Links updateLinks(long linkId,
		long groupId, long companyId, long linkgroupId, java.lang.String name,
		java.lang.String description, java.lang.String image,
		java.lang.String url, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateLinks(linkId, groupId, companyId, linkgroupId, name,
			description, image, url, position);
	}

	/**
	* Updates the links in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param links the links
	* @return the links that was updated
	*/
	public static vn.gov.hoabinh.model.Links updateLinks(
		vn.gov.hoabinh.model.Links links) {
		return getService().updateLinks(links);
	}

	public static void deleteLink(long linkId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLink(linkId);
	}

	public static LinksLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LinksLocalService, LinksLocalService> _serviceTracker =
		ServiceTrackerFactory.open(LinksLocalService.class);
}