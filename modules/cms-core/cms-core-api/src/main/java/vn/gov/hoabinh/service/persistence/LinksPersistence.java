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

import vn.gov.hoabinh.exception.NoSuchLinksException;
import vn.gov.hoabinh.model.Links;

/**
 * The persistence interface for the links service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.LinksPersistenceImpl
 * @see LinksUtil
 * @generated
 */
@ProviderType
public interface LinksPersistence extends BasePersistence<Links> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LinksUtil} to access the links persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the linkses where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @return the matching linkses
	*/
	public java.util.List<Links> findBylinkgroupId(long linkgroupId);

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
	public java.util.List<Links> findBylinkgroupId(long linkgroupId, int start,
		int end);

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
	public java.util.List<Links> findBylinkgroupId(long linkgroupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator);

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
	public java.util.List<Links> findBylinkgroupId(long linkgroupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first links in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching links
	* @throws NoSuchLinksException if a matching links could not be found
	*/
	public Links findBylinkgroupId_First(long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator)
		throws NoSuchLinksException;

	/**
	* Returns the first links in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching links, or <code>null</code> if a matching links could not be found
	*/
	public Links fetchBylinkgroupId_First(long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator);

	/**
	* Returns the last links in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching links
	* @throws NoSuchLinksException if a matching links could not be found
	*/
	public Links findBylinkgroupId_Last(long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator)
		throws NoSuchLinksException;

	/**
	* Returns the last links in the ordered set where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching links, or <code>null</code> if a matching links could not be found
	*/
	public Links fetchBylinkgroupId_Last(long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator);

	/**
	* Returns the linkses before and after the current links in the ordered set where linkgroupId = &#63;.
	*
	* @param linkId the primary key of the current links
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next links
	* @throws NoSuchLinksException if a links with the primary key could not be found
	*/
	public Links[] findBylinkgroupId_PrevAndNext(long linkId, long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator)
		throws NoSuchLinksException;

	/**
	* Removes all the linkses where linkgroupId = &#63; from the database.
	*
	* @param linkgroupId the linkgroup ID
	*/
	public void removeBylinkgroupId(long linkgroupId);

	/**
	* Returns the number of linkses where linkgroupId = &#63;.
	*
	* @param linkgroupId the linkgroup ID
	* @return the number of matching linkses
	*/
	public int countBylinkgroupId(long linkgroupId);

	/**
	* Returns all the linkses where groupId = &#63; and linkgroupId = &#63;.
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @return the matching linkses
	*/
	public java.util.List<Links> findByG_LG(long groupId, long linkgroupId);

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
	public java.util.List<Links> findByG_LG(long groupId, long linkgroupId,
		int start, int end);

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
	public java.util.List<Links> findByG_LG(long groupId, long linkgroupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator);

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
	public java.util.List<Links> findByG_LG(long groupId, long linkgroupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching links
	* @throws NoSuchLinksException if a matching links could not be found
	*/
	public Links findByG_LG_First(long groupId, long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator)
		throws NoSuchLinksException;

	/**
	* Returns the first links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching links, or <code>null</code> if a matching links could not be found
	*/
	public Links fetchByG_LG_First(long groupId, long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator);

	/**
	* Returns the last links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching links
	* @throws NoSuchLinksException if a matching links could not be found
	*/
	public Links findByG_LG_Last(long groupId, long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator)
		throws NoSuchLinksException;

	/**
	* Returns the last links in the ordered set where groupId = &#63; and linkgroupId = &#63;.
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching links, or <code>null</code> if a matching links could not be found
	*/
	public Links fetchByG_LG_Last(long groupId, long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator);

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
	public Links[] findByG_LG_PrevAndNext(long linkId, long groupId,
		long linkgroupId,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator)
		throws NoSuchLinksException;

	/**
	* Removes all the linkses where groupId = &#63; and linkgroupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	*/
	public void removeByG_LG(long groupId, long linkgroupId);

	/**
	* Returns the number of linkses where groupId = &#63; and linkgroupId = &#63;.
	*
	* @param groupId the group ID
	* @param linkgroupId the linkgroup ID
	* @return the number of matching linkses
	*/
	public int countByG_LG(long groupId, long linkgroupId);

	/**
	* Returns all the linkses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching linkses
	*/
	public java.util.List<Links> findByGroupId(long groupId);

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
	public java.util.List<Links> findByGroupId(long groupId, int start, int end);

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
	public java.util.List<Links> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator);

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
	public java.util.List<Links> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first links in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching links
	* @throws NoSuchLinksException if a matching links could not be found
	*/
	public Links findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator)
		throws NoSuchLinksException;

	/**
	* Returns the first links in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching links, or <code>null</code> if a matching links could not be found
	*/
	public Links fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator);

	/**
	* Returns the last links in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching links
	* @throws NoSuchLinksException if a matching links could not be found
	*/
	public Links findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator)
		throws NoSuchLinksException;

	/**
	* Returns the last links in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching links, or <code>null</code> if a matching links could not be found
	*/
	public Links fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator);

	/**
	* Returns the linkses before and after the current links in the ordered set where groupId = &#63;.
	*
	* @param linkId the primary key of the current links
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next links
	* @throws NoSuchLinksException if a links with the primary key could not be found
	*/
	public Links[] findByGroupId_PrevAndNext(long linkId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator)
		throws NoSuchLinksException;

	/**
	* Removes all the linkses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of linkses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching linkses
	*/
	public int countByGroupId(long groupId);

	/**
	* Caches the links in the entity cache if it is enabled.
	*
	* @param links the links
	*/
	public void cacheResult(Links links);

	/**
	* Caches the linkses in the entity cache if it is enabled.
	*
	* @param linkses the linkses
	*/
	public void cacheResult(java.util.List<Links> linkses);

	/**
	* Creates a new links with the primary key. Does not add the links to the database.
	*
	* @param linkId the primary key for the new links
	* @return the new links
	*/
	public Links create(long linkId);

	/**
	* Removes the links with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param linkId the primary key of the links
	* @return the links that was removed
	* @throws NoSuchLinksException if a links with the primary key could not be found
	*/
	public Links remove(long linkId) throws NoSuchLinksException;

	public Links updateImpl(Links links);

	/**
	* Returns the links with the primary key or throws a {@link NoSuchLinksException} if it could not be found.
	*
	* @param linkId the primary key of the links
	* @return the links
	* @throws NoSuchLinksException if a links with the primary key could not be found
	*/
	public Links findByPrimaryKey(long linkId) throws NoSuchLinksException;

	/**
	* Returns the links with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param linkId the primary key of the links
	* @return the links, or <code>null</code> if a links with the primary key could not be found
	*/
	public Links fetchByPrimaryKey(long linkId);

	@Override
	public java.util.Map<java.io.Serializable, Links> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the linkses.
	*
	* @return the linkses
	*/
	public java.util.List<Links> findAll();

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
	public java.util.List<Links> findAll(int start, int end);

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
	public java.util.List<Links> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator);

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
	public java.util.List<Links> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Links> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the linkses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of linkses.
	*
	* @return the number of linkses
	*/
	public int countAll();
}