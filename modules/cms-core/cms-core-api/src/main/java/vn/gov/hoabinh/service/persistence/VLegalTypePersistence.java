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

import vn.gov.hoabinh.exception.NoSuchVLegalTypeException;
import vn.gov.hoabinh.model.VLegalType;

/**
 * The persistence interface for the v legal type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalTypePersistenceImpl
 * @see VLegalTypeUtil
 * @generated
 */
@ProviderType
public interface VLegalTypePersistence extends BasePersistence<VLegalType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalTypeUtil} to access the v legal type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal types where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal types
	*/
	public java.util.List<VLegalType> findByGroupId(long groupId);

	/**
	* Returns a range of all the v legal types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @return the range of matching v legal types
	*/
	public java.util.List<VLegalType> findByGroupId(long groupId, int start,
		int end);

	/**
	* Returns an ordered range of all the v legal types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal types
	*/
	public java.util.List<VLegalType> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator);

	/**
	* Returns an ordered range of all the v legal types where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal types
	*/
	public java.util.List<VLegalType> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal type
	* @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	*/
	public VLegalType findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException;

	/**
	* Returns the first v legal type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public VLegalType fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator);

	/**
	* Returns the last v legal type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal type
	* @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	*/
	public VLegalType findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException;

	/**
	* Returns the last v legal type in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public VLegalType fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator);

	/**
	* Returns the v legal types before and after the current v legal type in the ordered set where groupId = &#63;.
	*
	* @param typeId the primary key of the current v legal type
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal type
	* @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	*/
	public VLegalType[] findByGroupId_PrevAndNext(java.lang.String typeId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException;

	/**
	* Removes all the v legal types where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of v legal types where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal types
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns the v legal type where groupId = &#63; and typeId = &#63; or throws a {@link NoSuchVLegalTypeException} if it could not be found.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @return the matching v legal type
	* @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	*/
	public VLegalType findByG_T(long groupId, java.lang.String typeId)
		throws NoSuchVLegalTypeException;

	/**
	* Returns the v legal type where groupId = &#63; and typeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @return the matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public VLegalType fetchByG_T(long groupId, java.lang.String typeId);

	/**
	* Returns the v legal type where groupId = &#63; and typeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public VLegalType fetchByG_T(long groupId, java.lang.String typeId,
		boolean retrieveFromCache);

	/**
	* Removes the v legal type where groupId = &#63; and typeId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @return the v legal type that was removed
	*/
	public VLegalType removeByG_T(long groupId, java.lang.String typeId)
		throws NoSuchVLegalTypeException;

	/**
	* Returns the number of v legal types where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @return the number of matching v legal types
	*/
	public int countByG_T(long groupId, java.lang.String typeId);

	/**
	* Returns all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @return the matching v legal types
	*/
	public java.util.List<VLegalType> findByS_L(long groupId,
		boolean statusType, java.lang.String language);

	/**
	* Returns a range of all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @return the range of matching v legal types
	*/
	public java.util.List<VLegalType> findByS_L(long groupId,
		boolean statusType, java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal types
	*/
	public java.util.List<VLegalType> findByS_L(long groupId,
		boolean statusType, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator);

	/**
	* Returns an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal types
	*/
	public java.util.List<VLegalType> findByS_L(long groupId,
		boolean statusType, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal type
	* @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	*/
	public VLegalType findByS_L_First(long groupId, boolean statusType,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException;

	/**
	* Returns the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public VLegalType fetchByS_L_First(long groupId, boolean statusType,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator);

	/**
	* Returns the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal type
	* @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	*/
	public VLegalType findByS_L_Last(long groupId, boolean statusType,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException;

	/**
	* Returns the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public VLegalType fetchByS_L_Last(long groupId, boolean statusType,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator);

	/**
	* Returns the v legal types before and after the current v legal type in the ordered set where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param typeId the primary key of the current v legal type
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal type
	* @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	*/
	public VLegalType[] findByS_L_PrevAndNext(java.lang.String typeId,
		long groupId, boolean statusType, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException;

	/**
	* Removes all the v legal types where groupId = &#63; and statusType = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	*/
	public void removeByS_L(long groupId, boolean statusType,
		java.lang.String language);

	/**
	* Returns the number of v legal types where groupId = &#63; and statusType = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param language the language
	* @return the number of matching v legal types
	*/
	public int countByS_L(long groupId, boolean statusType,
		java.lang.String language);

	/**
	* Returns all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @return the matching v legal types
	*/
	public java.util.List<VLegalType> findByS_Rss(long groupId,
		boolean statusType, boolean rssable);

	/**
	* Returns a range of all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @return the range of matching v legal types
	*/
	public java.util.List<VLegalType> findByS_Rss(long groupId,
		boolean statusType, boolean rssable, int start, int end);

	/**
	* Returns an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal types
	*/
	public java.util.List<VLegalType> findByS_Rss(long groupId,
		boolean statusType, boolean rssable, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator);

	/**
	* Returns an ordered range of all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal types
	*/
	public java.util.List<VLegalType> findByS_Rss(long groupId,
		boolean statusType, boolean rssable, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal type
	* @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	*/
	public VLegalType findByS_Rss_First(long groupId, boolean statusType,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException;

	/**
	* Returns the first v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public VLegalType fetchByS_Rss_First(long groupId, boolean statusType,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator);

	/**
	* Returns the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal type
	* @throws NoSuchVLegalTypeException if a matching v legal type could not be found
	*/
	public VLegalType findByS_Rss_Last(long groupId, boolean statusType,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException;

	/**
	* Returns the last v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal type, or <code>null</code> if a matching v legal type could not be found
	*/
	public VLegalType fetchByS_Rss_Last(long groupId, boolean statusType,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator);

	/**
	* Returns the v legal types before and after the current v legal type in the ordered set where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param typeId the primary key of the current v legal type
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal type
	* @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	*/
	public VLegalType[] findByS_Rss_PrevAndNext(java.lang.String typeId,
		long groupId, boolean statusType, boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator)
		throws NoSuchVLegalTypeException;

	/**
	* Removes all the v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	*/
	public void removeByS_Rss(long groupId, boolean statusType, boolean rssable);

	/**
	* Returns the number of v legal types where groupId = &#63; and statusType = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusType the status type
	* @param rssable the rssable
	* @return the number of matching v legal types
	*/
	public int countByS_Rss(long groupId, boolean statusType, boolean rssable);

	/**
	* Caches the v legal type in the entity cache if it is enabled.
	*
	* @param vLegalType the v legal type
	*/
	public void cacheResult(VLegalType vLegalType);

	/**
	* Caches the v legal types in the entity cache if it is enabled.
	*
	* @param vLegalTypes the v legal types
	*/
	public void cacheResult(java.util.List<VLegalType> vLegalTypes);

	/**
	* Creates a new v legal type with the primary key. Does not add the v legal type to the database.
	*
	* @param typeId the primary key for the new v legal type
	* @return the new v legal type
	*/
	public VLegalType create(java.lang.String typeId);

	/**
	* Removes the v legal type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the v legal type
	* @return the v legal type that was removed
	* @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	*/
	public VLegalType remove(java.lang.String typeId)
		throws NoSuchVLegalTypeException;

	public VLegalType updateImpl(VLegalType vLegalType);

	/**
	* Returns the v legal type with the primary key or throws a {@link NoSuchVLegalTypeException} if it could not be found.
	*
	* @param typeId the primary key of the v legal type
	* @return the v legal type
	* @throws NoSuchVLegalTypeException if a v legal type with the primary key could not be found
	*/
	public VLegalType findByPrimaryKey(java.lang.String typeId)
		throws NoSuchVLegalTypeException;

	/**
	* Returns the v legal type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param typeId the primary key of the v legal type
	* @return the v legal type, or <code>null</code> if a v legal type with the primary key could not be found
	*/
	public VLegalType fetchByPrimaryKey(java.lang.String typeId);

	@Override
	public java.util.Map<java.io.Serializable, VLegalType> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal types.
	*
	* @return the v legal types
	*/
	public java.util.List<VLegalType> findAll();

	/**
	* Returns a range of all the v legal types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @return the range of v legal types
	*/
	public java.util.List<VLegalType> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v legal types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal types
	*/
	public java.util.List<VLegalType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator);

	/**
	* Returns an ordered range of all the v legal types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal types
	*/
	public java.util.List<VLegalType> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalType> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal types from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal types.
	*
	* @return the number of v legal types
	*/
	public int countAll();
}