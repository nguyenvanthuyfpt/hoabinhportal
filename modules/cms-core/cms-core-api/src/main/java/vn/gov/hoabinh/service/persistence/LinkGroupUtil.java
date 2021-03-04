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

package vn.gov.hoabinh.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import vn.gov.hoabinh.model.LinkGroup;

import java.util.List;

/**
 * The persistence utility for the link group service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.LinkGroupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LinkGroupPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.LinkGroupPersistenceImpl
 * @generated
 */
@ProviderType
public class LinkGroupUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(LinkGroup linkGroup) {
		getPersistence().clearCache(linkGroup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LinkGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LinkGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LinkGroup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<LinkGroup> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static LinkGroup update(LinkGroup linkGroup) {
		return getPersistence().update(linkGroup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static LinkGroup update(LinkGroup linkGroup,
		ServiceContext serviceContext) {
		return getPersistence().update(linkGroup, serviceContext);
	}

	/**
	* Returns all the link groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching link groups
	*/
	public static List<LinkGroup> findBygroupId(long groupId) {
		return getPersistence().findBygroupId(groupId);
	}

	/**
	* Returns a range of all the link groups where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of link groups
	* @param end the upper bound of the range of link groups (not inclusive)
	* @return the range of matching link groups
	*/
	public static List<LinkGroup> findBygroupId(long groupId, int start, int end) {
		return getPersistence().findBygroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the link groups where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of link groups
	* @param end the upper bound of the range of link groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching link groups
	*/
	public static List<LinkGroup> findBygroupId(long groupId, int start,
		int end, OrderByComparator<LinkGroup> orderByComparator) {
		return getPersistence()
				   .findBygroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the link groups where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of link groups
	* @param end the upper bound of the range of link groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching link groups
	*/
	public static List<LinkGroup> findBygroupId(long groupId, int start,
		int end, OrderByComparator<LinkGroup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBygroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first link group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching link group
	* @throws NoSuchLinkGroupException if a matching link group could not be found
	*/
	public static LinkGroup findBygroupId_First(long groupId,
		OrderByComparator<LinkGroup> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchLinkGroupException {
		return getPersistence().findBygroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first link group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching link group, or <code>null</code> if a matching link group could not be found
	*/
	public static LinkGroup fetchBygroupId_First(long groupId,
		OrderByComparator<LinkGroup> orderByComparator) {
		return getPersistence().fetchBygroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last link group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching link group
	* @throws NoSuchLinkGroupException if a matching link group could not be found
	*/
	public static LinkGroup findBygroupId_Last(long groupId,
		OrderByComparator<LinkGroup> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchLinkGroupException {
		return getPersistence().findBygroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last link group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching link group, or <code>null</code> if a matching link group could not be found
	*/
	public static LinkGroup fetchBygroupId_Last(long groupId,
		OrderByComparator<LinkGroup> orderByComparator) {
		return getPersistence().fetchBygroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the link groups before and after the current link group in the ordered set where groupId = &#63;.
	*
	* @param linkgroupId the primary key of the current link group
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next link group
	* @throws NoSuchLinkGroupException if a link group with the primary key could not be found
	*/
	public static LinkGroup[] findBygroupId_PrevAndNext(long linkgroupId,
		long groupId, OrderByComparator<LinkGroup> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchLinkGroupException {
		return getPersistence()
				   .findBygroupId_PrevAndNext(linkgroupId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the link groups where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeBygroupId(long groupId) {
		getPersistence().removeBygroupId(groupId);
	}

	/**
	* Returns the number of link groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching link groups
	*/
	public static int countBygroupId(long groupId) {
		return getPersistence().countBygroupId(groupId);
	}

	/**
	* Returns all the link groups where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @return the matching link groups
	*/
	public static List<LinkGroup> findByMenu(long linkgroupId) {
		return getPersistence().findByMenu(linkgroupId);
	}

	/**
	* Returns a range of all the link groups where linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param linkgroupId the linkgroup ID
	* @param start the lower bound of the range of link groups
	* @param end the upper bound of the range of link groups (not inclusive)
	* @return the range of matching link groups
	*/
	public static List<LinkGroup> findByMenu(long linkgroupId, int start,
		int end) {
		return getPersistence().findByMenu(linkgroupId, start, end);
	}

	/**
	* Returns an ordered range of all the link groups where linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param linkgroupId the linkgroup ID
	* @param start the lower bound of the range of link groups
	* @param end the upper bound of the range of link groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching link groups
	*/
	public static List<LinkGroup> findByMenu(long linkgroupId, int start,
		int end, OrderByComparator<LinkGroup> orderByComparator) {
		return getPersistence()
				   .findByMenu(linkgroupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the link groups where linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param linkgroupId the linkgroup ID
	* @param start the lower bound of the range of link groups
	* @param end the upper bound of the range of link groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching link groups
	*/
	public static List<LinkGroup> findByMenu(long linkgroupId, int start,
		int end, OrderByComparator<LinkGroup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByMenu(linkgroupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first link group in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching link group
	* @throws NoSuchLinkGroupException if a matching link group could not be found
	*/
	public static LinkGroup findByMenu_First(long linkgroupId,
		OrderByComparator<LinkGroup> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchLinkGroupException {
		return getPersistence().findByMenu_First(linkgroupId, orderByComparator);
	}

	/**
	* Returns the first link group in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching link group, or <code>null</code> if a matching link group could not be found
	*/
	public static LinkGroup fetchByMenu_First(long linkgroupId,
		OrderByComparator<LinkGroup> orderByComparator) {
		return getPersistence().fetchByMenu_First(linkgroupId, orderByComparator);
	}

	/**
	* Returns the last link group in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching link group
	* @throws NoSuchLinkGroupException if a matching link group could not be found
	*/
	public static LinkGroup findByMenu_Last(long linkgroupId,
		OrderByComparator<LinkGroup> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchLinkGroupException {
		return getPersistence().findByMenu_Last(linkgroupId, orderByComparator);
	}

	/**
	* Returns the last link group in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching link group, or <code>null</code> if a matching link group could not be found
	*/
	public static LinkGroup fetchByMenu_Last(long linkgroupId,
		OrderByComparator<LinkGroup> orderByComparator) {
		return getPersistence().fetchByMenu_Last(linkgroupId, orderByComparator);
	}

	/**
	* Returns all the link groups where linkgroupId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param linkgroupIds the linkgroup IDs
	* @return the matching link groups
	*/
	public static List<LinkGroup> findByMenu(long[] linkgroupIds) {
		return getPersistence().findByMenu(linkgroupIds);
	}

	/**
	* Returns a range of all the link groups where linkgroupId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param linkgroupIds the linkgroup IDs
	* @param start the lower bound of the range of link groups
	* @param end the upper bound of the range of link groups (not inclusive)
	* @return the range of matching link groups
	*/
	public static List<LinkGroup> findByMenu(long[] linkgroupIds, int start,
		int end) {
		return getPersistence().findByMenu(linkgroupIds, start, end);
	}

	/**
	* Returns an ordered range of all the link groups where linkgroupId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param linkgroupIds the linkgroup IDs
	* @param start the lower bound of the range of link groups
	* @param end the upper bound of the range of link groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching link groups
	*/
	public static List<LinkGroup> findByMenu(long[] linkgroupIds, int start,
		int end, OrderByComparator<LinkGroup> orderByComparator) {
		return getPersistence()
				   .findByMenu(linkgroupIds, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the link groups where linkgroupId = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param linkgroupId the linkgroup ID
	* @param start the lower bound of the range of link groups
	* @param end the upper bound of the range of link groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching link groups
	*/
	public static List<LinkGroup> findByMenu(long[] linkgroupIds, int start,
		int end, OrderByComparator<LinkGroup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByMenu(linkgroupIds, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Removes all the link groups where linkgroupId = &#63; from the database.
	*
	* @param linkgroupId the linkgroup ID
	*/
	public static void removeByMenu(long linkgroupId) {
		getPersistence().removeByMenu(linkgroupId);
	}

	/**
	* Returns the number of link groups where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @return the number of matching link groups
	*/
	public static int countByMenu(long linkgroupId) {
		return getPersistence().countByMenu(linkgroupId);
	}

	/**
	* Returns the number of link groups where linkgroupId = any &#63;.
	*
	* @param linkgroupIds the linkgroup IDs
	* @return the number of matching link groups
	*/
	public static int countByMenu(long[] linkgroupIds) {
		return getPersistence().countByMenu(linkgroupIds);
	}

	/**
	* Caches the link group in the entity cache if it is enabled.
	*
	* @param linkGroup the link group
	*/
	public static void cacheResult(LinkGroup linkGroup) {
		getPersistence().cacheResult(linkGroup);
	}

	/**
	* Caches the link groups in the entity cache if it is enabled.
	*
	* @param linkGroups the link groups
	*/
	public static void cacheResult(List<LinkGroup> linkGroups) {
		getPersistence().cacheResult(linkGroups);
	}

	/**
	* Creates a new link group with the primary key. Does not add the link group to the database.
	*
	* @param linkgroupId the primary key for the new link group
	* @return the new link group
	*/
	public static LinkGroup create(long linkgroupId) {
		return getPersistence().create(linkgroupId);
	}

	/**
	* Removes the link group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param linkgroupId the primary key of the link group
	* @return the link group that was removed
	* @throws NoSuchLinkGroupException if a link group with the primary key could not be found
	*/
	public static LinkGroup remove(long linkgroupId)
		throws vn.gov.hoabinh.exception.NoSuchLinkGroupException {
		return getPersistence().remove(linkgroupId);
	}

	public static LinkGroup updateImpl(LinkGroup linkGroup) {
		return getPersistence().updateImpl(linkGroup);
	}

	/**
	* Returns the link group with the primary key or throws a {@link NoSuchLinkGroupException} if it could not be found.
	*
	* @param linkgroupId the primary key of the link group
	* @return the link group
	* @throws NoSuchLinkGroupException if a link group with the primary key could not be found
	*/
	public static LinkGroup findByPrimaryKey(long linkgroupId)
		throws vn.gov.hoabinh.exception.NoSuchLinkGroupException {
		return getPersistence().findByPrimaryKey(linkgroupId);
	}

	/**
	* Returns the link group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param linkgroupId the primary key of the link group
	* @return the link group, or <code>null</code> if a link group with the primary key could not be found
	*/
	public static LinkGroup fetchByPrimaryKey(long linkgroupId) {
		return getPersistence().fetchByPrimaryKey(linkgroupId);
	}

	public static java.util.Map<java.io.Serializable, LinkGroup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the link groups.
	*
	* @return the link groups
	*/
	public static List<LinkGroup> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the link groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of link groups
	* @param end the upper bound of the range of link groups (not inclusive)
	* @return the range of link groups
	*/
	public static List<LinkGroup> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the link groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of link groups
	* @param end the upper bound of the range of link groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of link groups
	*/
	public static List<LinkGroup> findAll(int start, int end,
		OrderByComparator<LinkGroup> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the link groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinkGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of link groups
	* @param end the upper bound of the range of link groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of link groups
	*/
	public static List<LinkGroup> findAll(int start, int end,
		OrderByComparator<LinkGroup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the link groups from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of link groups.
	*
	* @return the number of link groups
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LinkGroupPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LinkGroupPersistence, LinkGroupPersistence> _serviceTracker =
		ServiceTrackerFactory.open(LinkGroupPersistence.class);
}