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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import vn.gov.hoabinh.exception.NoSuchLinkGroupException;
import vn.gov.hoabinh.model.LinkGroup;

/**
 * The persistence interface for the link group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.LinkGroupPersistenceImpl
 * @see LinkGroupUtil
 * @generated
 */
@ProviderType
public interface LinkGroupPersistence extends BasePersistence<LinkGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LinkGroupUtil} to access the link group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the link groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching link groups
	*/
	public java.util.List<LinkGroup> findBygroupId(long groupId);

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
	public java.util.List<LinkGroup> findBygroupId(long groupId, int start,
		int end);

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
	public java.util.List<LinkGroup> findBygroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator);

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
	public java.util.List<LinkGroup> findBygroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first link group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching link group
	* @throws NoSuchLinkGroupException if a matching link group could not be found
	*/
	public LinkGroup findBygroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator)
		throws NoSuchLinkGroupException;

	/**
	* Returns the first link group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching link group, or <code>null</code> if a matching link group could not be found
	*/
	public LinkGroup fetchBygroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator);

	/**
	* Returns the last link group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching link group
	* @throws NoSuchLinkGroupException if a matching link group could not be found
	*/
	public LinkGroup findBygroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator)
		throws NoSuchLinkGroupException;

	/**
	* Returns the last link group in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching link group, or <code>null</code> if a matching link group could not be found
	*/
	public LinkGroup fetchBygroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator);

	/**
	* Returns the link groups before and after the current link group in the ordered set where groupId = &#63;.
	*
	* @param linkgroupId the primary key of the current link group
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next link group
	* @throws NoSuchLinkGroupException if a link group with the primary key could not be found
	*/
	public LinkGroup[] findBygroupId_PrevAndNext(long linkgroupId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator)
		throws NoSuchLinkGroupException;

	/**
	* Removes all the link groups where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeBygroupId(long groupId);

	/**
	* Returns the number of link groups where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching link groups
	*/
	public int countBygroupId(long groupId);

	/**
	* Returns all the link groups where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @return the matching link groups
	*/
	public java.util.List<LinkGroup> findByMenu(long linkgroupId);

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
	public java.util.List<LinkGroup> findByMenu(long linkgroupId, int start,
		int end);

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
	public java.util.List<LinkGroup> findByMenu(long linkgroupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator);

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
	public java.util.List<LinkGroup> findByMenu(long linkgroupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first link group in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching link group
	* @throws NoSuchLinkGroupException if a matching link group could not be found
	*/
	public LinkGroup findByMenu_First(long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator)
		throws NoSuchLinkGroupException;

	/**
	* Returns the first link group in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching link group, or <code>null</code> if a matching link group could not be found
	*/
	public LinkGroup fetchByMenu_First(long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator);

	/**
	* Returns the last link group in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching link group
	* @throws NoSuchLinkGroupException if a matching link group could not be found
	*/
	public LinkGroup findByMenu_Last(long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator)
		throws NoSuchLinkGroupException;

	/**
	* Returns the last link group in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching link group, or <code>null</code> if a matching link group could not be found
	*/
	public LinkGroup fetchByMenu_Last(long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator);

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
	public java.util.List<LinkGroup> findByMenu(long[] linkgroupIds);

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
	public java.util.List<LinkGroup> findByMenu(long[] linkgroupIds, int start,
		int end);

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
	public java.util.List<LinkGroup> findByMenu(long[] linkgroupIds, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator);

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
	public java.util.List<LinkGroup> findByMenu(long[] linkgroupIds, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the link groups where linkgroupId = &#63; from the database.
	*
	* @param linkgroupId the linkgroup ID
	*/
	public void removeByMenu(long linkgroupId);

	/**
	* Returns the number of link groups where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @return the number of matching link groups
	*/
	public int countByMenu(long linkgroupId);

	/**
	* Returns the number of link groups where linkgroupId = any &#63;.
	*
	* @param linkgroupIds the linkgroup IDs
	* @return the number of matching link groups
	*/
	public int countByMenu(long[] linkgroupIds);

	/**
	* Caches the link group in the entity cache if it is enabled.
	*
	* @param linkGroup the link group
	*/
	public void cacheResult(LinkGroup linkGroup);

	/**
	* Caches the link groups in the entity cache if it is enabled.
	*
	* @param linkGroups the link groups
	*/
	public void cacheResult(java.util.List<LinkGroup> linkGroups);

	/**
	* Creates a new link group with the primary key. Does not add the link group to the database.
	*
	* @param linkgroupId the primary key for the new link group
	* @return the new link group
	*/
	public LinkGroup create(long linkgroupId);

	/**
	* Removes the link group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param linkgroupId the primary key of the link group
	* @return the link group that was removed
	* @throws NoSuchLinkGroupException if a link group with the primary key could not be found
	*/
	public LinkGroup remove(long linkgroupId) throws NoSuchLinkGroupException;

	public LinkGroup updateImpl(LinkGroup linkGroup);

	/**
	* Returns the link group with the primary key or throws a {@link NoSuchLinkGroupException} if it could not be found.
	*
	* @param linkgroupId the primary key of the link group
	* @return the link group
	* @throws NoSuchLinkGroupException if a link group with the primary key could not be found
	*/
	public LinkGroup findByPrimaryKey(long linkgroupId)
		throws NoSuchLinkGroupException;

	/**
	* Returns the link group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param linkgroupId the primary key of the link group
	* @return the link group, or <code>null</code> if a link group with the primary key could not be found
	*/
	public LinkGroup fetchByPrimaryKey(long linkgroupId);

	@Override
	public java.util.Map<java.io.Serializable, LinkGroup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the link groups.
	*
	* @return the link groups
	*/
	public java.util.List<LinkGroup> findAll();

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
	public java.util.List<LinkGroup> findAll(int start, int end);

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
	public java.util.List<LinkGroup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator);

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
	public java.util.List<LinkGroup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<LinkGroup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the link groups from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of link groups.
	*
	* @return the number of link groups
	*/
	public int countAll();
}