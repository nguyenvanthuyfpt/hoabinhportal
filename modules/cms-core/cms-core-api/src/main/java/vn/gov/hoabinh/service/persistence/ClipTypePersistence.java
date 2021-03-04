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

import vn.gov.hoabinh.exception.NoSuchClipTypeException;
import vn.gov.hoabinh.model.ClipType;

/**
 * The persistence interface for the clip type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.ClipTypePersistenceImpl
 * @see ClipTypeUtil
 * @generated
 */
@ProviderType
public interface ClipTypePersistence extends BasePersistence<ClipType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ClipTypeUtil} to access the clip type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the clip types where language = &#63; and active = &#63;.
	*
	* @param language the language
	* @param active the active
	* @return the matching clip types
	*/
	public java.util.List<ClipType> findByLanguage(java.lang.String language,
		boolean active);

	/**
	* Returns a range of all the clip types where language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @return the range of matching clip types
	*/
	public java.util.List<ClipType> findByLanguage(java.lang.String language,
		boolean active, int start, int end);

	/**
	* Returns an ordered range of all the clip types where language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clip types
	*/
	public java.util.List<ClipType> findByLanguage(java.lang.String language,
		boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator);

	/**
	* Returns an ordered range of all the clip types where language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clip types
	*/
	public java.util.List<ClipType> findByLanguage(java.lang.String language,
		boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first clip type in the ordered set where language = &#63; and active = &#63;.
	*
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public ClipType findByLanguage_First(java.lang.String language,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException;

	/**
	* Returns the first clip type in the ordered set where language = &#63; and active = &#63;.
	*
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public ClipType fetchByLanguage_First(java.lang.String language,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator);

	/**
	* Returns the last clip type in the ordered set where language = &#63; and active = &#63;.
	*
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public ClipType findByLanguage_Last(java.lang.String language,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException;

	/**
	* Returns the last clip type in the ordered set where language = &#63; and active = &#63;.
	*
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public ClipType fetchByLanguage_Last(java.lang.String language,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator);

	/**
	* Returns the clip types before and after the current clip type in the ordered set where language = &#63; and active = &#63;.
	*
	* @param id the primary key of the current clip type
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip type
	* @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	*/
	public ClipType[] findByLanguage_PrevAndNext(java.lang.String id,
		java.lang.String language, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException;

	/**
	* Removes all the clip types where language = &#63; and active = &#63; from the database.
	*
	* @param language the language
	* @param active the active
	*/
	public void removeByLanguage(java.lang.String language, boolean active);

	/**
	* Returns the number of clip types where language = &#63; and active = &#63;.
	*
	* @param language the language
	* @param active the active
	* @return the number of matching clip types
	*/
	public int countByLanguage(java.lang.String language, boolean active);

	/**
	* Returns all the clip types where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @return the matching clip types
	*/
	public java.util.List<ClipType> findByG_L_A(long groupId,
		java.lang.String language, boolean active);

	/**
	* Returns a range of all the clip types where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @return the range of matching clip types
	*/
	public java.util.List<ClipType> findByG_L_A(long groupId,
		java.lang.String language, boolean active, int start, int end);

	/**
	* Returns an ordered range of all the clip types where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clip types
	*/
	public java.util.List<ClipType> findByG_L_A(long groupId,
		java.lang.String language, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator);

	/**
	* Returns an ordered range of all the clip types where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clip types
	*/
	public java.util.List<ClipType> findByG_L_A(long groupId,
		java.lang.String language, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first clip type in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public ClipType findByG_L_A_First(long groupId, java.lang.String language,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException;

	/**
	* Returns the first clip type in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public ClipType fetchByG_L_A_First(long groupId, java.lang.String language,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator);

	/**
	* Returns the last clip type in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public ClipType findByG_L_A_Last(long groupId, java.lang.String language,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException;

	/**
	* Returns the last clip type in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public ClipType fetchByG_L_A_Last(long groupId, java.lang.String language,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator);

	/**
	* Returns the clip types before and after the current clip type in the ordered set where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param id the primary key of the current clip type
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip type
	* @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	*/
	public ClipType[] findByG_L_A_PrevAndNext(java.lang.String id,
		long groupId, java.lang.String language, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException;

	/**
	* Removes all the clip types where groupId = &#63; and language = &#63; and active = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	*/
	public void removeByG_L_A(long groupId, java.lang.String language,
		boolean active);

	/**
	* Returns the number of clip types where groupId = &#63; and language = &#63; and active = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param active the active
	* @return the number of matching clip types
	*/
	public int countByG_L_A(long groupId, java.lang.String language,
		boolean active);

	/**
	* Returns all the clip types where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching clip types
	*/
	public java.util.List<ClipType> findByG_L(long groupId,
		java.lang.String language);

	/**
	* Returns a range of all the clip types where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @return the range of matching clip types
	*/
	public java.util.List<ClipType> findByG_L(long groupId,
		java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the clip types where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clip types
	*/
	public java.util.List<ClipType> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator);

	/**
	* Returns an ordered range of all the clip types where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clip types
	*/
	public java.util.List<ClipType> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first clip type in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public ClipType findByG_L_First(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException;

	/**
	* Returns the first clip type in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public ClipType fetchByG_L_First(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator);

	/**
	* Returns the last clip type in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public ClipType findByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException;

	/**
	* Returns the last clip type in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public ClipType fetchByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator);

	/**
	* Returns the clip types before and after the current clip type in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param id the primary key of the current clip type
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next clip type
	* @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	*/
	public ClipType[] findByG_L_PrevAndNext(java.lang.String id, long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException;

	/**
	* Removes all the clip types where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByG_L(long groupId, java.lang.String language);

	/**
	* Returns the number of clip types where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching clip types
	*/
	public int countByG_L(long groupId, java.lang.String language);

	/**
	* Returns all the clip types where id = &#63;.
	*
	* @param id the ID
	* @return the matching clip types
	*/
	public java.util.List<ClipType> findByMenu(java.lang.String id);

	/**
	* Returns a range of all the clip types where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @return the range of matching clip types
	*/
	public java.util.List<ClipType> findByMenu(java.lang.String id, int start,
		int end);

	/**
	* Returns an ordered range of all the clip types where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clip types
	*/
	public java.util.List<ClipType> findByMenu(java.lang.String id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator);

	/**
	* Returns an ordered range of all the clip types where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clip types
	*/
	public java.util.List<ClipType> findByMenu(java.lang.String id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first clip type in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public ClipType findByMenu_First(java.lang.String id,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException;

	/**
	* Returns the first clip type in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public ClipType fetchByMenu_First(java.lang.String id,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator);

	/**
	* Returns the last clip type in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type
	* @throws NoSuchClipTypeException if a matching clip type could not be found
	*/
	public ClipType findByMenu_Last(java.lang.String id,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator)
		throws NoSuchClipTypeException;

	/**
	* Returns the last clip type in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching clip type, or <code>null</code> if a matching clip type could not be found
	*/
	public ClipType fetchByMenu_Last(java.lang.String id,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator);

	/**
	* Returns all the clip types where id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ids the IDs
	* @return the matching clip types
	*/
	public java.util.List<ClipType> findByMenu(java.lang.String[] ids);

	/**
	* Returns a range of all the clip types where id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ids the IDs
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @return the range of matching clip types
	*/
	public java.util.List<ClipType> findByMenu(java.lang.String[] ids,
		int start, int end);

	/**
	* Returns an ordered range of all the clip types where id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ids the IDs
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching clip types
	*/
	public java.util.List<ClipType> findByMenu(java.lang.String[] ids,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator);

	/**
	* Returns an ordered range of all the clip types where id = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching clip types
	*/
	public java.util.List<ClipType> findByMenu(java.lang.String[] ids,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the clip types where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByMenu(java.lang.String id);

	/**
	* Returns the number of clip types where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching clip types
	*/
	public int countByMenu(java.lang.String id);

	/**
	* Returns the number of clip types where id = any &#63;.
	*
	* @param ids the IDs
	* @return the number of matching clip types
	*/
	public int countByMenu(java.lang.String[] ids);

	/**
	* Caches the clip type in the entity cache if it is enabled.
	*
	* @param clipType the clip type
	*/
	public void cacheResult(ClipType clipType);

	/**
	* Caches the clip types in the entity cache if it is enabled.
	*
	* @param clipTypes the clip types
	*/
	public void cacheResult(java.util.List<ClipType> clipTypes);

	/**
	* Creates a new clip type with the primary key. Does not add the clip type to the database.
	*
	* @param id the primary key for the new clip type
	* @return the new clip type
	*/
	public ClipType create(java.lang.String id);

	/**
	* Removes the clip type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the clip type
	* @return the clip type that was removed
	* @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	*/
	public ClipType remove(java.lang.String id) throws NoSuchClipTypeException;

	public ClipType updateImpl(ClipType clipType);

	/**
	* Returns the clip type with the primary key or throws a {@link NoSuchClipTypeException} if it could not be found.
	*
	* @param id the primary key of the clip type
	* @return the clip type
	* @throws NoSuchClipTypeException if a clip type with the primary key could not be found
	*/
	public ClipType findByPrimaryKey(java.lang.String id)
		throws NoSuchClipTypeException;

	/**
	* Returns the clip type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the clip type
	* @return the clip type, or <code>null</code> if a clip type with the primary key could not be found
	*/
	public ClipType fetchByPrimaryKey(java.lang.String id);

	@Override
	public java.util.Map<java.io.Serializable, ClipType> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the clip types.
	*
	* @return the clip types
	*/
	public java.util.List<ClipType> findAll();

	/**
	* Returns a range of all the clip types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @return the range of clip types
	*/
	public java.util.List<ClipType> findAll(int start, int end);

	/**
	* Returns an ordered range of all the clip types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of clip types
	*/
	public java.util.List<ClipType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator);

	/**
	* Returns an ordered range of all the clip types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of clip types
	*/
	public java.util.List<ClipType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ClipType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the clip types from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of clip types.
	*
	* @return the number of clip types
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}