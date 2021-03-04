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

import vn.gov.hoabinh.exception.NoSuchVLegalFieldException;
import vn.gov.hoabinh.model.VLegalField;

/**
 * The persistence interface for the v legal field service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalFieldPersistenceImpl
 * @see VLegalFieldUtil
 * @generated
 */
@ProviderType
public interface VLegalFieldPersistence extends BasePersistence<VLegalField> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalFieldUtil} to access the v legal field persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal fields where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal fields
	*/
	public java.util.List<VLegalField> findByGroupId(long groupId);

	/**
	* Returns a range of all the v legal fields where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal fields
	* @param end the upper bound of the range of v legal fields (not inclusive)
	* @return the range of matching v legal fields
	*/
	public java.util.List<VLegalField> findByGroupId(long groupId, int start,
		int end);

	/**
	* Returns an ordered range of all the v legal fields where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal fields
	* @param end the upper bound of the range of v legal fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal fields
	*/
	public java.util.List<VLegalField> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator);

	/**
	* Returns an ordered range of all the v legal fields where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal fields
	* @param end the upper bound of the range of v legal fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal fields
	*/
	public java.util.List<VLegalField> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal field in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal field
	* @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	*/
	public VLegalField findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException;

	/**
	* Returns the first v legal field in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public VLegalField fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator);

	/**
	* Returns the last v legal field in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal field
	* @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	*/
	public VLegalField findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException;

	/**
	* Returns the last v legal field in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public VLegalField fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator);

	/**
	* Returns the v legal fields before and after the current v legal field in the ordered set where groupId = &#63;.
	*
	* @param fieldId the primary key of the current v legal field
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal field
	* @throws NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	*/
	public VLegalField[] findByGroupId_PrevAndNext(java.lang.String fieldId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException;

	/**
	* Removes all the v legal fields where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of v legal fields where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal fields
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns the v legal field where groupId = &#63; and fieldId = &#63; or throws a {@link NoSuchVLegalFieldException} if it could not be found.
	*
	* @param groupId the group ID
	* @param fieldId the field ID
	* @return the matching v legal field
	* @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	*/
	public VLegalField findByG_F(long groupId, java.lang.String fieldId)
		throws NoSuchVLegalFieldException;

	/**
	* Returns the v legal field where groupId = &#63; and fieldId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param fieldId the field ID
	* @return the matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public VLegalField fetchByG_F(long groupId, java.lang.String fieldId);

	/**
	* Returns the v legal field where groupId = &#63; and fieldId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param fieldId the field ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public VLegalField fetchByG_F(long groupId, java.lang.String fieldId,
		boolean retrieveFromCache);

	/**
	* Removes the v legal field where groupId = &#63; and fieldId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param fieldId the field ID
	* @return the v legal field that was removed
	*/
	public VLegalField removeByG_F(long groupId, java.lang.String fieldId)
		throws NoSuchVLegalFieldException;

	/**
	* Returns the number of v legal fields where groupId = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param fieldId the field ID
	* @return the number of matching v legal fields
	*/
	public int countByG_F(long groupId, java.lang.String fieldId);

	/**
	* Returns all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	* @return the matching v legal fields
	*/
	public java.util.List<VLegalField> findByS_L(long groupId,
		boolean statusField, java.lang.String language);

	/**
	* Returns a range of all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	* @param start the lower bound of the range of v legal fields
	* @param end the upper bound of the range of v legal fields (not inclusive)
	* @return the range of matching v legal fields
	*/
	public java.util.List<VLegalField> findByS_L(long groupId,
		boolean statusField, java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	* @param start the lower bound of the range of v legal fields
	* @param end the upper bound of the range of v legal fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal fields
	*/
	public java.util.List<VLegalField> findByS_L(long groupId,
		boolean statusField, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator);

	/**
	* Returns an ordered range of all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	* @param start the lower bound of the range of v legal fields
	* @param end the upper bound of the range of v legal fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal fields
	*/
	public java.util.List<VLegalField> findByS_L(long groupId,
		boolean statusField, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal field
	* @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	*/
	public VLegalField findByS_L_First(long groupId, boolean statusField,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException;

	/**
	* Returns the first v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public VLegalField fetchByS_L_First(long groupId, boolean statusField,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator);

	/**
	* Returns the last v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal field
	* @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	*/
	public VLegalField findByS_L_Last(long groupId, boolean statusField,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException;

	/**
	* Returns the last v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public VLegalField fetchByS_L_Last(long groupId, boolean statusField,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator);

	/**
	* Returns the v legal fields before and after the current v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* @param fieldId the primary key of the current v legal field
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal field
	* @throws NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	*/
	public VLegalField[] findByS_L_PrevAndNext(java.lang.String fieldId,
		long groupId, boolean statusField, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException;

	/**
	* Removes all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	*/
	public void removeByS_L(long groupId, boolean statusField,
		java.lang.String language);

	/**
	* Returns the number of v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	* @return the number of matching v legal fields
	*/
	public int countByS_L(long groupId, boolean statusField,
		java.lang.String language);

	/**
	* Returns all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	* @return the matching v legal fields
	*/
	public java.util.List<VLegalField> findByS_Rss(long groupId,
		boolean statusField, boolean rssable);

	/**
	* Returns a range of all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	* @param start the lower bound of the range of v legal fields
	* @param end the upper bound of the range of v legal fields (not inclusive)
	* @return the range of matching v legal fields
	*/
	public java.util.List<VLegalField> findByS_Rss(long groupId,
		boolean statusField, boolean rssable, int start, int end);

	/**
	* Returns an ordered range of all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	* @param start the lower bound of the range of v legal fields
	* @param end the upper bound of the range of v legal fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal fields
	*/
	public java.util.List<VLegalField> findByS_Rss(long groupId,
		boolean statusField, boolean rssable, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator);

	/**
	* Returns an ordered range of all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	* @param start the lower bound of the range of v legal fields
	* @param end the upper bound of the range of v legal fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal fields
	*/
	public java.util.List<VLegalField> findByS_Rss(long groupId,
		boolean statusField, boolean rssable, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal field
	* @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	*/
	public VLegalField findByS_Rss_First(long groupId, boolean statusField,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException;

	/**
	* Returns the first v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public VLegalField fetchByS_Rss_First(long groupId, boolean statusField,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator);

	/**
	* Returns the last v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal field
	* @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	*/
	public VLegalField findByS_Rss_Last(long groupId, boolean statusField,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException;

	/**
	* Returns the last v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public VLegalField fetchByS_Rss_Last(long groupId, boolean statusField,
		boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator);

	/**
	* Returns the v legal fields before and after the current v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* @param fieldId the primary key of the current v legal field
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal field
	* @throws NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	*/
	public VLegalField[] findByS_Rss_PrevAndNext(java.lang.String fieldId,
		long groupId, boolean statusField, boolean rssable,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator)
		throws NoSuchVLegalFieldException;

	/**
	* Removes all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	*/
	public void removeByS_Rss(long groupId, boolean statusField, boolean rssable);

	/**
	* Returns the number of v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	* @return the number of matching v legal fields
	*/
	public int countByS_Rss(long groupId, boolean statusField, boolean rssable);

	/**
	* Caches the v legal field in the entity cache if it is enabled.
	*
	* @param vLegalField the v legal field
	*/
	public void cacheResult(VLegalField vLegalField);

	/**
	* Caches the v legal fields in the entity cache if it is enabled.
	*
	* @param vLegalFields the v legal fields
	*/
	public void cacheResult(java.util.List<VLegalField> vLegalFields);

	/**
	* Creates a new v legal field with the primary key. Does not add the v legal field to the database.
	*
	* @param fieldId the primary key for the new v legal field
	* @return the new v legal field
	*/
	public VLegalField create(java.lang.String fieldId);

	/**
	* Removes the v legal field with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fieldId the primary key of the v legal field
	* @return the v legal field that was removed
	* @throws NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	*/
	public VLegalField remove(java.lang.String fieldId)
		throws NoSuchVLegalFieldException;

	public VLegalField updateImpl(VLegalField vLegalField);

	/**
	* Returns the v legal field with the primary key or throws a {@link NoSuchVLegalFieldException} if it could not be found.
	*
	* @param fieldId the primary key of the v legal field
	* @return the v legal field
	* @throws NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	*/
	public VLegalField findByPrimaryKey(java.lang.String fieldId)
		throws NoSuchVLegalFieldException;

	/**
	* Returns the v legal field with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fieldId the primary key of the v legal field
	* @return the v legal field, or <code>null</code> if a v legal field with the primary key could not be found
	*/
	public VLegalField fetchByPrimaryKey(java.lang.String fieldId);

	@Override
	public java.util.Map<java.io.Serializable, VLegalField> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal fields.
	*
	* @return the v legal fields
	*/
	public java.util.List<VLegalField> findAll();

	/**
	* Returns a range of all the v legal fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal fields
	* @param end the upper bound of the range of v legal fields (not inclusive)
	* @return the range of v legal fields
	*/
	public java.util.List<VLegalField> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v legal fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal fields
	* @param end the upper bound of the range of v legal fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal fields
	*/
	public java.util.List<VLegalField> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator);

	/**
	* Returns an ordered range of all the v legal fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal fields
	* @param end the upper bound of the range of v legal fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal fields
	*/
	public java.util.List<VLegalField> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalField> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal fields from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal fields.
	*
	* @return the number of v legal fields
	*/
	public int countAll();
}