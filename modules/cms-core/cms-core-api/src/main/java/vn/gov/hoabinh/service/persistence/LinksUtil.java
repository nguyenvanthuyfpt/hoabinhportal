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

import vn.gov.hoabinh.model.Links;

import java.util.List;

/**
 * The persistence utility for the links service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.LinksPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LinksPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.LinksPersistenceImpl
 * @generated
 */
@ProviderType
public class LinksUtil {
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
	public static void clearCache(Links links) {
		getPersistence().clearCache(links);
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
	public static List<Links> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Links> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Links> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Links> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Links update(Links links) {
		return getPersistence().update(links);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Links update(Links links, ServiceContext serviceContext) {
		return getPersistence().update(links, serviceContext);
	}

	/**
	* Returns all the linkses where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @return the matching linkses
	*/
	public static List<Links> findBylinkgroupId(long linkgroupId) {
		return getPersistence().findBylinkgroupId(linkgroupId);
	}

	/**
	* Returns a range of all the linkses where linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param linkgroupId the linkgroup ID
	* @param start the lower bound of the range of linkses
	* @param end the upper bound of the range of linkses (not inclusive)
	* @return the range of matching linkses
	*/
	public static List<Links> findBylinkgroupId(long linkgroupId, int start,
		int end) {
		return getPersistence().findBylinkgroupId(linkgroupId, start, end);
	}

	/**
	* Returns an ordered range of all the linkses where linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param linkgroupId the linkgroup ID
	* @param start the lower bound of the range of linkses
	* @param end the upper bound of the range of linkses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching linkses
	*/
	public static List<Links> findBylinkgroupId(long linkgroupId, int start,
		int end, OrderByComparator<Links> orderByComparator) {
		return getPersistence()
				   .findBylinkgroupId(linkgroupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the linkses where linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param linkgroupId the linkgroup ID
	* @param start the lower bound of the range of linkses
	* @param end the upper bound of the range of linkses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching linkses
	*/
	public static List<Links> findBylinkgroupId(long linkgroupId, int start,
		int end, OrderByComparator<Links> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBylinkgroupId(linkgroupId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first links in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching links
	* @throws NoSuchLinksException if a matching links could not be found
	*/
	public static Links findBylinkgroupId_First(long linkgroupId,
		OrderByComparator<Links> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchLinksException {
		return getPersistence()
				   .findBylinkgroupId_First(linkgroupId, orderByComparator);
	}

	/**
	* Returns the first links in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching links, or <code>null</code> if a matching links could not be found
	*/
	public static Links fetchBylinkgroupId_First(long linkgroupId,
		OrderByComparator<Links> orderByComparator) {
		return getPersistence()
				   .fetchBylinkgroupId_First(linkgroupId, orderByComparator);
	}

	/**
	* Returns the last links in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching links
	* @throws NoSuchLinksException if a matching links could not be found
	*/
	public static Links findBylinkgroupId_Last(long linkgroupId,
		OrderByComparator<Links> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchLinksException {
		return getPersistence()
				   .findBylinkgroupId_Last(linkgroupId, orderByComparator);
	}

	/**
	* Returns the last links in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching links, or <code>null</code> if a matching links could not be found
	*/
	public static Links fetchBylinkgroupId_Last(long linkgroupId,
		OrderByComparator<Links> orderByComparator) {
		return getPersistence()
				   .fetchBylinkgroupId_Last(linkgroupId, orderByComparator);
	}

	/**
	* Returns the linkses before and after the current links in the ordered set where linkgroupId = &#63;.
	*
	* @param linkId the primary key of the current links
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next links
	* @throws NoSuchLinksException if a links with the primary key could not be found
	*/
	public static Links[] findBylinkgroupId_PrevAndNext(long linkId,
		long linkgroupId, OrderByComparator<Links> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchLinksException {
		return getPersistence()
				   .findBylinkgroupId_PrevAndNext(linkId, linkgroupId,
			orderByComparator);
	}

	/**
	* Removes all the linkses where linkgroupId = &#63; from the database.
	*
	* @param linkgroupId the linkgroup ID
	*/
	public static void removeBylinkgroupId(long linkgroupId) {
		getPersistence().removeBylinkgroupId(linkgroupId);
	}

	/**
	* Returns the number of linkses where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @return the number of matching linkses
	*/
	public static int countBylinkgroupId(long linkgroupId) {
		return getPersistence().countBylinkgroupId(linkgroupId);
	}

	/**
	* Returns all the linkses where groupId = &#63; and linkgroupId = &#63;.
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @return the matching linkses
	*/
	public static List<Links> findByG_LG(long groupId, long linkgroupId) {
		return getPersistence().findByG_LG(groupId, linkgroupId);
	}

	/**
	* Returns a range of all the linkses where groupId = &#63; and linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @param start the lower bound of the range of linkses
	* @param end the upper bound of the range of linkses (not inclusive)
	* @return the range of matching linkses
	*/
	public static List<Links> findByG_LG(long groupId, long linkgroupId,
		int start, int end) {
		return getPersistence().findByG_LG(groupId, linkgroupId, start, end);
	}

	/**
	* Returns an ordered range of all the linkses where groupId = &#63; and linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @param start the lower bound of the range of linkses
	* @param end the upper bound of the range of linkses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching linkses
	*/
	public static List<Links> findByG_LG(long groupId, long linkgroupId,
		int start, int end, OrderByComparator<Links> orderByComparator) {
		return getPersistence()
				   .findByG_LG(groupId, linkgroupId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the linkses where groupId = &#63; and linkgroupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @param start the lower bound of the range of linkses
	* @param end the upper bound of the range of linkses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching linkses
	*/
	public static List<Links> findByG_LG(long groupId, long linkgroupId,
		int start, int end, OrderByComparator<Links> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_LG(groupId, linkgroupId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching links
	* @throws NoSuchLinksException if a matching links could not be found
	*/
	public static Links findByG_LG_First(long groupId, long linkgroupId,
		OrderByComparator<Links> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchLinksException {
		return getPersistence()
				   .findByG_LG_First(groupId, linkgroupId, orderByComparator);
	}

	/**
	* Returns the first links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching links, or <code>null</code> if a matching links could not be found
	*/
	public static Links fetchByG_LG_First(long groupId, long linkgroupId,
		OrderByComparator<Links> orderByComparator) {
		return getPersistence()
				   .fetchByG_LG_First(groupId, linkgroupId, orderByComparator);
	}

	/**
	* Returns the last links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching links
	* @throws NoSuchLinksException if a matching links could not be found
	*/
	public static Links findByG_LG_Last(long groupId, long linkgroupId,
		OrderByComparator<Links> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchLinksException {
		return getPersistence()
				   .findByG_LG_Last(groupId, linkgroupId, orderByComparator);
	}

	/**
	* Returns the last links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching links, or <code>null</code> if a matching links could not be found
	*/
	public static Links fetchByG_LG_Last(long groupId, long linkgroupId,
		OrderByComparator<Links> orderByComparator) {
		return getPersistence()
				   .fetchByG_LG_Last(groupId, linkgroupId, orderByComparator);
	}

	/**
	* Returns the linkses before and after the current links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	*
	* @param linkId the primary key of the current links
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next links
	* @throws NoSuchLinksException if a links with the primary key could not be found
	*/
	public static Links[] findByG_LG_PrevAndNext(long linkId, long groupId,
		long linkgroupId, OrderByComparator<Links> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchLinksException {
		return getPersistence()
				   .findByG_LG_PrevAndNext(linkId, groupId, linkgroupId,
			orderByComparator);
	}

	/**
	* Removes all the linkses where groupId = &#63; and linkgroupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	*/
	public static void removeByG_LG(long groupId, long linkgroupId) {
		getPersistence().removeByG_LG(groupId, linkgroupId);
	}

	/**
	* Returns the number of linkses where groupId = &#63; and linkgroupId = &#63;.
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @return the number of matching linkses
	*/
	public static int countByG_LG(long groupId, long linkgroupId) {
		return getPersistence().countByG_LG(groupId, linkgroupId);
	}

	/**
	* Returns all the linkses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching linkses
	*/
	public static List<Links> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the linkses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of linkses
	* @param end the upper bound of the range of linkses (not inclusive)
	* @return the range of matching linkses
	*/
	public static List<Links> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the linkses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of linkses
	* @param end the upper bound of the range of linkses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching linkses
	*/
	public static List<Links> findByGroupId(long groupId, int start, int end,
		OrderByComparator<Links> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the linkses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of linkses
	* @param end the upper bound of the range of linkses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching linkses
	*/
	public static List<Links> findByGroupId(long groupId, int start, int end,
		OrderByComparator<Links> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first links in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching links
	* @throws NoSuchLinksException if a matching links could not be found
	*/
	public static Links findByGroupId_First(long groupId,
		OrderByComparator<Links> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchLinksException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first links in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching links, or <code>null</code> if a matching links could not be found
	*/
	public static Links fetchByGroupId_First(long groupId,
		OrderByComparator<Links> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last links in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching links
	* @throws NoSuchLinksException if a matching links could not be found
	*/
	public static Links findByGroupId_Last(long groupId,
		OrderByComparator<Links> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchLinksException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last links in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching links, or <code>null</code> if a matching links could not be found
	*/
	public static Links fetchByGroupId_Last(long groupId,
		OrderByComparator<Links> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the linkses before and after the current links in the ordered set where groupId = &#63;.
	*
	* @param linkId the primary key of the current links
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next links
	* @throws NoSuchLinksException if a links with the primary key could not be found
	*/
	public static Links[] findByGroupId_PrevAndNext(long linkId, long groupId,
		OrderByComparator<Links> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchLinksException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(linkId, groupId, orderByComparator);
	}

	/**
	* Removes all the linkses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of linkses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching linkses
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Caches the links in the entity cache if it is enabled.
	*
	* @param links the links
	*/
	public static void cacheResult(Links links) {
		getPersistence().cacheResult(links);
	}

	/**
	* Caches the linkses in the entity cache if it is enabled.
	*
	* @param linkses the linkses
	*/
	public static void cacheResult(List<Links> linkses) {
		getPersistence().cacheResult(linkses);
	}

	/**
	* Creates a new links with the primary key. Does not add the links to the database.
	*
	* @param linkId the primary key for the new links
	* @return the new links
	*/
	public static Links create(long linkId) {
		return getPersistence().create(linkId);
	}

	/**
	* Removes the links with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param linkId the primary key of the links
	* @return the links that was removed
	* @throws NoSuchLinksException if a links with the primary key could not be found
	*/
	public static Links remove(long linkId)
		throws vn.gov.hoabinh.exception.NoSuchLinksException {
		return getPersistence().remove(linkId);
	}

	public static Links updateImpl(Links links) {
		return getPersistence().updateImpl(links);
	}

	/**
	* Returns the links with the primary key or throws a {@link NoSuchLinksException} if it could not be found.
	*
	* @param linkId the primary key of the links
	* @return the links
	* @throws NoSuchLinksException if a links with the primary key could not be found
	*/
	public static Links findByPrimaryKey(long linkId)
		throws vn.gov.hoabinh.exception.NoSuchLinksException {
		return getPersistence().findByPrimaryKey(linkId);
	}

	/**
	* Returns the links with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param linkId the primary key of the links
	* @return the links, or <code>null</code> if a links with the primary key could not be found
	*/
	public static Links fetchByPrimaryKey(long linkId) {
		return getPersistence().fetchByPrimaryKey(linkId);
	}

	public static java.util.Map<java.io.Serializable, Links> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the linkses.
	*
	* @return the linkses
	*/
	public static List<Links> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the linkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linkses
	* @param end the upper bound of the range of linkses (not inclusive)
	* @return the range of linkses
	*/
	public static List<Links> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the linkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linkses
	* @param end the upper bound of the range of linkses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of linkses
	*/
	public static List<Links> findAll(int start, int end,
		OrderByComparator<Links> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the linkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link LinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of linkses
	* @param end the upper bound of the range of linkses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of linkses
	*/
	public static List<Links> findAll(int start, int end,
		OrderByComparator<Links> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the linkses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of linkses.
	*
	* @return the number of linkses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static LinksPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<LinksPersistence, LinksPersistence> _serviceTracker =
		ServiceTrackerFactory.open(LinksPersistence.class);
}