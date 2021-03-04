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

import vn.gov.hoabinh.exception.NoSuchVLegalTagsException;
import vn.gov.hoabinh.model.VLegalTags;

/**
 * The persistence interface for the v legal tags service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalTagsPersistenceImpl
 * @see VLegalTagsUtil
 * @generated
 */
@ProviderType
public interface VLegalTagsPersistence extends BasePersistence<VLegalTags> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalTagsUtil} to access the v legal tags persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal tagses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal tagses
	*/
	public java.util.List<VLegalTags> findByGroupId(long groupId);

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
	public java.util.List<VLegalTags> findByGroupId(long groupId, int start,
		int end);

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
	public java.util.List<VLegalTags> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator);

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
	public java.util.List<VLegalTags> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal tags in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal tags
	* @throws NoSuchVLegalTagsException if a matching v legal tags could not be found
	*/
	public VLegalTags findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator)
		throws NoSuchVLegalTagsException;

	/**
	* Returns the first v legal tags in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal tags, or <code>null</code> if a matching v legal tags could not be found
	*/
	public VLegalTags fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator);

	/**
	* Returns the last v legal tags in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal tags
	* @throws NoSuchVLegalTagsException if a matching v legal tags could not be found
	*/
	public VLegalTags findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator)
		throws NoSuchVLegalTagsException;

	/**
	* Returns the last v legal tags in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal tags, or <code>null</code> if a matching v legal tags could not be found
	*/
	public VLegalTags fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator);

	/**
	* Returns the v legal tagses before and after the current v legal tags in the ordered set where groupId = &#63;.
	*
	* @param tagId the primary key of the current v legal tags
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal tags
	* @throws NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	*/
	public VLegalTags[] findByGroupId_PrevAndNext(java.lang.String tagId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator)
		throws NoSuchVLegalTagsException;

	/**
	* Removes all the v legal tagses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of v legal tagses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal tagses
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the v legal tagses where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	* @return the matching v legal tagses
	*/
	public java.util.List<VLegalTags> findByP_S(long groupId, boolean statusTags);

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
	public java.util.List<VLegalTags> findByP_S(long groupId,
		boolean statusTags, int start, int end);

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
	public java.util.List<VLegalTags> findByP_S(long groupId,
		boolean statusTags, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator);

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
	public java.util.List<VLegalTags> findByP_S(long groupId,
		boolean statusTags, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal tags
	* @throws NoSuchVLegalTagsException if a matching v legal tags could not be found
	*/
	public VLegalTags findByP_S_First(long groupId, boolean statusTags,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator)
		throws NoSuchVLegalTagsException;

	/**
	* Returns the first v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal tags, or <code>null</code> if a matching v legal tags could not be found
	*/
	public VLegalTags fetchByP_S_First(long groupId, boolean statusTags,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator);

	/**
	* Returns the last v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal tags
	* @throws NoSuchVLegalTagsException if a matching v legal tags could not be found
	*/
	public VLegalTags findByP_S_Last(long groupId, boolean statusTags,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator)
		throws NoSuchVLegalTagsException;

	/**
	* Returns the last v legal tags in the ordered set where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal tags, or <code>null</code> if a matching v legal tags could not be found
	*/
	public VLegalTags fetchByP_S_Last(long groupId, boolean statusTags,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator);

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
	public VLegalTags[] findByP_S_PrevAndNext(java.lang.String tagId,
		long groupId, boolean statusTags,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator)
		throws NoSuchVLegalTagsException;

	/**
	* Removes all the v legal tagses where groupId = &#63; and statusTags = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	*/
	public void removeByP_S(long groupId, boolean statusTags);

	/**
	* Returns the number of v legal tagses where groupId = &#63; and statusTags = &#63;.
	*
	* @param groupId the group ID
	* @param statusTags the status tags
	* @return the number of matching v legal tagses
	*/
	public int countByP_S(long groupId, boolean statusTags);

	/**
	* Caches the v legal tags in the entity cache if it is enabled.
	*
	* @param vLegalTags the v legal tags
	*/
	public void cacheResult(VLegalTags vLegalTags);

	/**
	* Caches the v legal tagses in the entity cache if it is enabled.
	*
	* @param vLegalTagses the v legal tagses
	*/
	public void cacheResult(java.util.List<VLegalTags> vLegalTagses);

	/**
	* Creates a new v legal tags with the primary key. Does not add the v legal tags to the database.
	*
	* @param tagId the primary key for the new v legal tags
	* @return the new v legal tags
	*/
	public VLegalTags create(java.lang.String tagId);

	/**
	* Removes the v legal tags with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tagId the primary key of the v legal tags
	* @return the v legal tags that was removed
	* @throws NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	*/
	public VLegalTags remove(java.lang.String tagId)
		throws NoSuchVLegalTagsException;

	public VLegalTags updateImpl(VLegalTags vLegalTags);

	/**
	* Returns the v legal tags with the primary key or throws a {@link NoSuchVLegalTagsException} if it could not be found.
	*
	* @param tagId the primary key of the v legal tags
	* @return the v legal tags
	* @throws NoSuchVLegalTagsException if a v legal tags with the primary key could not be found
	*/
	public VLegalTags findByPrimaryKey(java.lang.String tagId)
		throws NoSuchVLegalTagsException;

	/**
	* Returns the v legal tags with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param tagId the primary key of the v legal tags
	* @return the v legal tags, or <code>null</code> if a v legal tags with the primary key could not be found
	*/
	public VLegalTags fetchByPrimaryKey(java.lang.String tagId);

	@Override
	public java.util.Map<java.io.Serializable, VLegalTags> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal tagses.
	*
	* @return the v legal tagses
	*/
	public java.util.List<VLegalTags> findAll();

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
	public java.util.List<VLegalTags> findAll(int start, int end);

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
	public java.util.List<VLegalTags> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator);

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
	public java.util.List<VLegalTags> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTags> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal tagses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal tagses.
	*
	* @return the number of v legal tagses
	*/
	public int countAll();
}