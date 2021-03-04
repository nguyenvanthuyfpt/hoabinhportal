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

import vn.gov.hoabinh.exception.NoSuchClipException;
import vn.gov.hoabinh.model.Clip;

/**
 * The persistence interface for the clip service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.ClipPersistenceImpl
 * @see ClipUtil
 * @generated
 */
@ProviderType
public interface ClipPersistence extends BasePersistence<Clip> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ClipUtil} to access the clip persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the clips where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching clips
	*/
	public java.util.List<Clip> findByG_L(long groupId,
		java.lang.String language);

	/**
	* Returns a range of all the clips where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public java.util.List<Clip> findByG_L(long groupId,
		java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the clips where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns an ordered range of all the clips where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first clip in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public Clip findByG_L_First(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Returns the first clip in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public Clip fetchByG_L_First(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns the last clip in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public Clip findByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Returns the last clip in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public Clip fetchByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns the clips before and after the current clip in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param id the primary key of the current clip
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public Clip[] findByG_L_PrevAndNext(java.lang.String id, long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Removes all the clips where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByG_L(long groupId, java.lang.String language);

	/**
	* Returns the number of clips where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching clips
	*/
	public int countByG_L(long groupId, java.lang.String language);

	/**
	* Returns all the clips where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @return the matching clips
	*/
	public java.util.List<Clip> findByG_L_A(long groupId,
		java.lang.String language, boolean active);

	/**
	* Returns a range of all the clips where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public java.util.List<Clip> findByG_L_A(long groupId,
		java.lang.String language, boolean active, int start, int end);

	/**
	* Returns an ordered range of all the clips where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByG_L_A(long groupId,
		java.lang.String language, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns an ordered range of all the clips where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByG_L_A(long groupId,
		java.lang.String language, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first clip in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public Clip findByG_L_A_First(long groupId, java.lang.String language,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Returns the first clip in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public Clip fetchByG_L_A_First(long groupId, java.lang.String language,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns the last clip in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public Clip findByG_L_A_Last(long groupId, java.lang.String language,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Returns the last clip in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public Clip fetchByG_L_A_Last(long groupId, java.lang.String language,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns the clips before and after the current clip in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param id the primary key of the current clip
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public Clip[] findByG_L_A_PrevAndNext(java.lang.String id, long groupId,
		java.lang.String language, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Removes all the clips where groupId = &#63; and language = &#63; and active = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	*/
	public void removeByG_L_A(long groupId, java.lang.String language,
		boolean active);

	/**
	* Returns the number of clips where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @return the number of matching clips
	*/
	public int countByG_L_A(long groupId, java.lang.String language,
		boolean active);

	/**
	* Returns all the clips where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @return the matching clips
	*/
	public java.util.List<Clip> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String clipTypeId);

	/**
	* Returns a range of all the clips where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public java.util.List<Clip> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String clipTypeId, int start,
		int end);

	/**
	* Returns an ordered range of all the clips where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String clipTypeId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns an ordered range of all the clips where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String clipTypeId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first clip in the ordered set where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public Clip findByG_L_T_First(long groupId, java.lang.String language,
		java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Returns the first clip in the ordered set where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public Clip fetchByG_L_T_First(long groupId, java.lang.String language,
		java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns the last clip in the ordered set where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public Clip findByG_L_T_Last(long groupId, java.lang.String language,
		java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Returns the last clip in the ordered set where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public Clip fetchByG_L_T_Last(long groupId, java.lang.String language,
		java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns the clips before and after the current clip in the ordered set where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* @param id the primary key of the current clip
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public Clip[] findByG_L_T_PrevAndNext(java.lang.String id, long groupId,
		java.lang.String language, java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Removes all the clips where groupId = &#63; and language = &#63; and clipTypeId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	*/
	public void removeByG_L_T(long groupId, java.lang.String language,
		java.lang.String clipTypeId);

	/**
	* Returns the number of clips where groupId = &#63; and language = &#63; and clipTypeId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param clipTypeId the clip type ID
	* @return the number of matching clips
	*/
	public int countByG_L_T(long groupId, java.lang.String language,
		java.lang.String clipTypeId);

	/**
	* Returns all the clips where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @return the matching clips
	*/
	public java.util.List<Clip> findByClipTypeId(java.lang.String clipTypeId);

	/**
	* Returns a range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public java.util.List<Clip> findByClipTypeId(java.lang.String clipTypeId,
		int start, int end);

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByClipTypeId(java.lang.String clipTypeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByClipTypeId(java.lang.String clipTypeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public Clip findByClipTypeId_First(java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Returns the first clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public Clip fetchByClipTypeId_First(java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns the last clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public Clip findByClipTypeId_Last(java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Returns the last clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public Clip fetchByClipTypeId_Last(java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns the clips before and after the current clip in the ordered set where clipTypeId = &#63;.
	*
	* @param id the primary key of the current clip
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public Clip[] findByClipTypeId_PrevAndNext(java.lang.String id,
		java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Removes all the clips where clipTypeId = &#63; from the database.
	*
	* @param clipTypeId the clip type ID
	*/
	public void removeByClipTypeId(java.lang.String clipTypeId);

	/**
	* Returns the number of clips where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @return the number of matching clips
	*/
	public int countByClipTypeId(java.lang.String clipTypeId);

	/**
	* Returns all the clips where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @return the matching clips
	*/
	public java.util.List<Clip> findByMenu(java.lang.String clipTypeId);

	/**
	* Returns a range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public java.util.List<Clip> findByMenu(java.lang.String clipTypeId,
		int start, int end);

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByMenu(java.lang.String clipTypeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByMenu(java.lang.String clipTypeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public Clip findByMenu_First(java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Returns the first clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public Clip fetchByMenu_First(java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns the last clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public Clip findByMenu_Last(java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Returns the last clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public Clip fetchByMenu_Last(java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns the clips before and after the current clip in the ordered set where clipTypeId = &#63;.
	*
	* @param id the primary key of the current clip
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public Clip[] findByMenu_PrevAndNext(java.lang.String id,
		java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Returns all the clips where clipTypeId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeIds the clip type IDs
	* @return the matching clips
	*/
	public java.util.List<Clip> findByMenu(java.lang.String[] clipTypeIds);

	/**
	* Returns a range of all the clips where clipTypeId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeIds the clip type IDs
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public java.util.List<Clip> findByMenu(java.lang.String[] clipTypeIds,
		int start, int end);

	/**
	* Returns an ordered range of all the clips where clipTypeId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeIds the clip type IDs
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByMenu(java.lang.String[] clipTypeIds,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByMenu(java.lang.String[] clipTypeIds,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the clips where clipTypeId = &#63; from the database.
	*
	* @param clipTypeId the clip type ID
	*/
	public void removeByMenu(java.lang.String clipTypeId);

	/**
	* Returns the number of clips where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @return the number of matching clips
	*/
	public int countByMenu(java.lang.String clipTypeId);

	/**
	* Returns the number of clips where clipTypeId = any &#63;.
	*
	* @param clipTypeIds the clip type IDs
	* @return the number of matching clips
	*/
	public int countByMenu(java.lang.String[] clipTypeIds);

	/**
	* Returns all the clips where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @return the matching clips
	*/
	public java.util.List<Clip> findByClipDisplay(java.lang.String clipTypeId);

	/**
	* Returns a range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public java.util.List<Clip> findByClipDisplay(java.lang.String clipTypeId,
		int start, int end);

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByClipDisplay(java.lang.String clipTypeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByClipDisplay(java.lang.String clipTypeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public Clip findByClipDisplay_First(java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Returns the first clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public Clip fetchByClipDisplay_First(java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns the last clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip
	* @throws NoSuchClipException if a matching clip could not be found
	*/
	public Clip findByClipDisplay_Last(java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Returns the last clip in the ordered set where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip, or <code>null</code> if a matching clip could not be found
	*/
	public Clip fetchByClipDisplay_Last(java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns the clips before and after the current clip in the ordered set where clipTypeId = &#63;.
	*
	* @param id the primary key of the current clip
	* @param clipTypeId the clip type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public Clip[] findByClipDisplay_PrevAndNext(java.lang.String id,
		java.lang.String clipTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator)
		throws NoSuchClipException;

	/**
	* Returns all the clips where clipTypeId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeIds the clip type IDs
	* @return the matching clips
	*/
	public java.util.List<Clip> findByClipDisplay(
		java.lang.String[] clipTypeIds);

	/**
	* Returns a range of all the clips where clipTypeId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeIds the clip type IDs
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of matching clips
	*/
	public java.util.List<Clip> findByClipDisplay(
		java.lang.String[] clipTypeIds, int start, int end);

	/**
	* Returns an ordered range of all the clips where clipTypeId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeIds the clip type IDs
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByClipDisplay(
		java.lang.String[] clipTypeIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns an ordered range of all the clips where clipTypeId = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param clipTypeId the clip type ID
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clips
	*/
	public java.util.List<Clip> findByClipDisplay(
		java.lang.String[] clipTypeIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the clips where clipTypeId = &#63; from the database.
	*
	* @param clipTypeId the clip type ID
	*/
	public void removeByClipDisplay(java.lang.String clipTypeId);

	/**
	* Returns the number of clips where clipTypeId = &#63;.
	*
	* @param clipTypeId the clip type ID
	* @return the number of matching clips
	*/
	public int countByClipDisplay(java.lang.String clipTypeId);

	/**
	* Returns the number of clips where clipTypeId = any &#63;.
	*
	* @param clipTypeIds the clip type IDs
	* @return the number of matching clips
	*/
	public int countByClipDisplay(java.lang.String[] clipTypeIds);

	/**
	* Caches the clip in the entity cache if it is enabled.
	*
	* @param clip the clip
	*/
	public void cacheResult(Clip clip);

	/**
	* Caches the clips in the entity cache if it is enabled.
	*
	* @param clips the clips
	*/
	public void cacheResult(java.util.List<Clip> clips);

	/**
	* Creates a new clip with the primary key. Does not add the clip to the database.
	*
	* @param id the primary key for the new clip
	* @return the new clip
	*/
	public Clip create(java.lang.String id);

	/**
	* Removes the clip with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the clip
	* @return the clip that was removed
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public Clip remove(java.lang.String id) throws NoSuchClipException;

	public Clip updateImpl(Clip clip);

	/**
	* Returns the clip with the primary key or throws a {@link NoSuchClipException} if it could not be found.
	*
	* @param id the primary key of the clip
	* @return the clip
	* @throws NoSuchClipException if a clip with the primary key could not be found
	*/
	public Clip findByPrimaryKey(java.lang.String id)
		throws NoSuchClipException;

	/**
	* Returns the clip with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the clip
	* @return the clip, or <code>null</code> if a clip with the primary key could not be found
	*/
	public Clip fetchByPrimaryKey(java.lang.String id);

	@Override
	public java.util.Map<java.io.Serializable, Clip> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the clips.
	*
	* @return the clips
	*/
	public java.util.List<Clip> findAll();

	/**
	* Returns a range of all the clips.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of clips
	*/
	public java.util.List<Clip> findAll(int start, int end);

	/**
	* Returns an ordered range of all the clips.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of clips
	*/
	public java.util.List<Clip> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator);

	/**
	* Returns an ordered range of all the clips.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of clips
	*/
	public java.util.List<Clip> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Clip> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the clips from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of clips.
	*
	* @return the number of clips
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}