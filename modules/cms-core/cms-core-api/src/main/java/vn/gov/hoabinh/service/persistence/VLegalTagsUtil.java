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

import vn.gov.hoabinh.model.VLegalTags;

import java.util.List;

/**
 * The persistence utility for the v legal tags service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalTagsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTagsPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalTagsPersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalTagsUtil {
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
	public static void clearCache(VLegalTags vLegalTags) {
		getPersistence().clearCache(vLegalTags);
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
	public static List<VLegalTags> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalTags> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalTags> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalTags> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalTags update(VLegalTags vLegalTags) {
		return getPersistence().update(vLegalTags);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalTags update(VLegalTags vLegalTags,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalTags, serviceContext);
	}

	/**
	* Returns all the v legal tagses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal tagses
	*/
	public static List<VLegalTags> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the v legal tagses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal tagses
	* @param end the upper bound of the range of v legal tagses (not inclusive)
	* @return the range of matching v legal tagses
	*/
	public static List<VLegalTags> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the v legal tagses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal tagses
	* @param end the upper bound of the range of v legal tagses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal tagses
	*/
	public static List<VLegalTags> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalTags> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal tagses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal tagses
	* @param end the upper bound of the range of v legal tagses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal tagses
	*/
	public static List<VLegalTags> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalTags> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal tags in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal tags
	* @throws NoSuchVLegalTagsException if a matching v legal tags could not be found
	*/
	public static VLegalTags findByGroupId_First(long groupId,
		OrderByComparator<VLegalTags> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTagsException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first v legal tags in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal tags, or <code>null</code> if a matching v legal tags could not be found
	*/
	public static VLegalTags fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalTags> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal tags in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal tags
	* @throws NoSuchVLegalTagsException if a matching v legal tags could not be found
	*/
	public static VLegalTags findByGroupId_Last(long groupId,
		OrderByComparator<VLegalTags> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTagsException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal tags in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal tags, or <code>null</code> if a matching v legal tags could not be found
	*/
	public static VLegalTags fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalTags> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the v legal tagses before and after the current v legal tags in the ordered set where groupId = &#63;.
	*
	* @param tagId the primary key of the current v legal tags
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal tags
	* @throws NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	*/
	public static VLegalTags[] findByGroupId_PrevAndNext(
		java.lang.String tagId, long groupId,
		OrderByComparator<VLegalTags> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTagsException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(tagId, groupId, orderByComparator);
	}

	/**
	* Removes all the v legal tagses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of v legal tagses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal tagses
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	* @return the matching v legal tagses
	*/
	public static List<VLegalTags> findByP_S(long groupId, boolean statusTags) {
		return getPersistence().findByP_S(groupId, statusTags);
	}

	/**
	* Returns a range of all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	* @param start the lower bound of the range of v legal tagses
	* @param end the upper bound of the range of v legal tagses (not inclusive)
	* @return the range of matching v legal tagses
	*/
	public static List<VLegalTags> findByP_S(long groupId, boolean statusTags,
		int start, int end) {
		return getPersistence().findByP_S(groupId, statusTags, start, end);
	}

	/**
	* Returns an ordered range of all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	* @param start the lower bound of the range of v legal tagses
	* @param end the upper bound of the range of v legal tagses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal tagses
	*/
	public static List<VLegalTags> findByP_S(long groupId, boolean statusTags,
		int start, int end, OrderByComparator<VLegalTags> orderByComparator) {
		return getPersistence()
				   .findByP_S(groupId, statusTags, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	* @param start the lower bound of the range of v legal tagses
	* @param end the upper bound of the range of v legal tagses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal tagses
	*/
	public static List<VLegalTags> findByP_S(long groupId, boolean statusTags,
		int start, int end, OrderByComparator<VLegalTags> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_S(groupId, statusTags, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal tags
	* @throws NoSuchVLegalTagsException if a matching v legal tags could not be found
	*/
	public static VLegalTags findByP_S_First(long groupId, boolean statusTags,
		OrderByComparator<VLegalTags> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTagsException {
		return getPersistence()
				   .findByP_S_First(groupId, statusTags, orderByComparator);
	}

	/**
	* Returns the first v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal tags, or <code>null</code> if a matching v legal tags could not be found
	*/
	public static VLegalTags fetchByP_S_First(long groupId, boolean statusTags,
		OrderByComparator<VLegalTags> orderByComparator) {
		return getPersistence()
				   .fetchByP_S_First(groupId, statusTags, orderByComparator);
	}

	/**
	* Returns the last v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal tags
	* @throws NoSuchVLegalTagsException if a matching v legal tags could not be found
	*/
	public static VLegalTags findByP_S_Last(long groupId, boolean statusTags,
		OrderByComparator<VLegalTags> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTagsException {
		return getPersistence()
				   .findByP_S_Last(groupId, statusTags, orderByComparator);
	}

	/**
	* Returns the last v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal tags, or <code>null</code> if a matching v legal tags could not be found
	*/
	public static VLegalTags fetchByP_S_Last(long groupId, boolean statusTags,
		OrderByComparator<VLegalTags> orderByComparator) {
		return getPersistence()
				   .fetchByP_S_Last(groupId, statusTags, orderByComparator);
	}

	/**
	* Returns the v legal tagses before and after the current v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	*
	* @param tagId the primary key of the current v legal tags
	* @param groupId the group ID
	* @param statusTags the status tags
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal tags
	* @throws NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	*/
	public static VLegalTags[] findByP_S_PrevAndNext(java.lang.String tagId,
		long groupId, boolean statusTags,
		OrderByComparator<VLegalTags> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTagsException {
		return getPersistence()
				   .findByP_S_PrevAndNext(tagId, groupId, statusTags,
			orderByComparator);
	}

	/**
	* Removes all the v legal tagses where groupId = &#63; and statusTags = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	*/
	public static void removeByP_S(long groupId, boolean statusTags) {
		getPersistence().removeByP_S(groupId, statusTags);
	}

	/**
	* Returns the number of v legal tagses where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	* @return the number of matching v legal tagses
	*/
	public static int countByP_S(long groupId, boolean statusTags) {
		return getPersistence().countByP_S(groupId, statusTags);
	}

	/**
	* Caches the v legal tags in the entity cache if it is enabled.
	*
	* @param vLegalTags the v legal tags
	*/
	public static void cacheResult(VLegalTags vLegalTags) {
		getPersistence().cacheResult(vLegalTags);
	}

	/**
	* Caches the v legal tagses in the entity cache if it is enabled.
	*
	* @param vLegalTagses the v legal tagses
	*/
	public static void cacheResult(List<VLegalTags> vLegalTagses) {
		getPersistence().cacheResult(vLegalTagses);
	}

	/**
	* Creates a new v legal tags with the primary key. Does not add the v legal tags to the database.
	*
	* @param tagId the primary key for the new v legal tags
	* @return the new v legal tags
	*/
	public static VLegalTags create(java.lang.String tagId) {
		return getPersistence().create(tagId);
	}

	/**
	* Removes the v legal tags with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tagId the primary key of the v legal tags
	* @return the v legal tags that was removed
	* @throws NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	*/
	public static VLegalTags remove(java.lang.String tagId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTagsException {
		return getPersistence().remove(tagId);
	}

	public static VLegalTags updateImpl(VLegalTags vLegalTags) {
		return getPersistence().updateImpl(vLegalTags);
	}

	/**
	* Returns the v legal tags with the primary key or throws a {@link NoSuchVLegalTagsException} if it could not be found.
	*
	* @param tagId the primary key of the v legal tags
	* @return the v legal tags
	* @throws NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	*/
	public static VLegalTags findByPrimaryKey(java.lang.String tagId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTagsException {
		return getPersistence().findByPrimaryKey(tagId);
	}

	/**
	* Returns the v legal tags with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tagId the primary key of the v legal tags
	* @return the v legal tags, or <code>null</code> if a v legal tags with the primary key could not be found
	*/
	public static VLegalTags fetchByPrimaryKey(java.lang.String tagId) {
		return getPersistence().fetchByPrimaryKey(tagId);
	}

	public static java.util.Map<java.io.Serializable, VLegalTags> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal tagses.
	*
	* @return the v legal tagses
	*/
	public static List<VLegalTags> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the v legal tagses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal tagses
	* @param end the upper bound of the range of v legal tagses (not inclusive)
	* @return the range of v legal tagses
	*/
	public static List<VLegalTags> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the v legal tagses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal tagses
	* @param end the upper bound of the range of v legal tagses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal tagses
	*/
	public static List<VLegalTags> findAll(int start, int end,
		OrderByComparator<VLegalTags> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal tagses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal tagses
	* @param end the upper bound of the range of v legal tagses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal tagses
	*/
	public static List<VLegalTags> findAll(int start, int end,
		OrderByComparator<VLegalTags> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal tagses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal tagses.
	*
	* @return the number of v legal tagses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalTagsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalTagsPersistence, VLegalTagsPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalTagsPersistence.class);
}