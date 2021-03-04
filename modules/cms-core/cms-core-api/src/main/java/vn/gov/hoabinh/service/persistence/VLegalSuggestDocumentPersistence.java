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

import vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException;
import vn.gov.hoabinh.model.VLegalSuggestDocument;

/**
 * The persistence interface for the v legal suggest document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalSuggestDocumentPersistenceImpl
 * @see VLegalSuggestDocumentUtil
 * @generated
 */
@ProviderType
public interface VLegalSuggestDocumentPersistence extends BasePersistence<VLegalSuggestDocument> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalSuggestDocumentUtil} to access the v legal suggest document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal suggest documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByGroupId(long groupId);

	/**
	* Returns a range of all the v legal suggest documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @return the range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByGroupId(long groupId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal suggest documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal suggest documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63;.
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	*/
	public VLegalSuggestDocument[] findByGroupId_PrevAndNext(
		java.lang.String sugId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Removes all the v legal suggest documents where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of v legal suggest documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal suggest documents
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @return the matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_A(long groupId,
		boolean approved);

	/**
	* Returns a range of all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @return the range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_A(long groupId,
		boolean approved, int start, int end);

	/**
	* Returns an ordered range of all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_A(long groupId,
		boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_A(long groupId,
		boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument findByP_A_First(long groupId,
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchByP_A_First(long groupId,
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument findByP_A_Last(long groupId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchByP_A_Last(long groupId,
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	*/
	public VLegalSuggestDocument[] findByP_A_PrevAndNext(
		java.lang.String sugId, long groupId, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Removes all the v legal suggest documents where groupId = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group ID
	* @param approved the approved
	*/
	public void removeByP_A(long groupId, boolean approved);

	/**
	* Returns the number of v legal suggest documents where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @return the number of matching v legal suggest documents
	*/
	public int countByP_A(long groupId, boolean approved);

	/**
	* Returns the v legal suggest document where groupId = &#63; and sugId = &#63; or throws a {@link NoSuchVLegalSuggestDocumentException} if it could not be found.
	*
	* @param groupId the group ID
	* @param sugId the sug ID
	* @return the matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument findByG_S(long groupId, java.lang.String sugId)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the v legal suggest document where groupId = &#63; and sugId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param sugId the sug ID
	* @return the matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchByG_S(long groupId, java.lang.String sugId);

	/**
	* Returns the v legal suggest document where groupId = &#63; and sugId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param sugId the sug ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchByG_S(long groupId,
		java.lang.String sugId, boolean retrieveFromCache);

	/**
	* Removes the v legal suggest document where groupId = &#63; and sugId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param sugId the sug ID
	* @return the v legal suggest document that was removed
	*/
	public VLegalSuggestDocument removeByG_S(long groupId,
		java.lang.String sugId) throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the number of v legal suggest documents where groupId = &#63; and sugId = &#63;.
	*
	* @param groupId the group ID
	* @param sugId the sug ID
	* @return the number of matching v legal suggest documents
	*/
	public int countByG_S(long groupId, java.lang.String sugId);

	/**
	* Returns all the v legal suggest documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_L(long groupId,
		java.lang.String language);

	/**
	* Returns a range of all the v legal suggest documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @return the range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_L(long groupId,
		java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument findByP_L_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchByP_L_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument findByP_L_Last(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchByP_L_Last(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	*/
	public VLegalSuggestDocument[] findByP_L_PrevAndNext(
		java.lang.String sugId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Removes all the v legal suggest documents where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByP_L(long groupId, java.lang.String language);

	/**
	* Returns the number of v legal suggest documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching v legal suggest documents
	*/
	public int countByP_L(long groupId, java.lang.String language);

	/**
	* Returns all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_L_A(long groupId,
		java.lang.String language, boolean approved);

	/**
	* Returns a range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @return the range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end);

	/**
	* Returns an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument findByP_L_A_First(long groupId,
		java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchByP_L_A_First(long groupId,
		java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument findByP_L_A_Last(long groupId,
		java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchByP_L_A_Last(long groupId,
		java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	*/
	public VLegalSuggestDocument[] findByP_L_A_PrevAndNext(
		java.lang.String sugId, long groupId, java.lang.String language,
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Removes all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	*/
	public void removeByP_L_A(long groupId, java.lang.String language,
		boolean approved);

	/**
	* Returns the number of v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the number of matching v legal suggest documents
	*/
	public int countByP_L_A(long groupId, java.lang.String language,
		boolean approved);

	/**
	* Returns all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param draftId the draft ID
	* @return the matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId);

	/**
	* Returns a range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param draftId the draft ID
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @return the range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param draftId the draft ID
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param draftId the draft ID
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument findByP_L_A_D_First(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchByP_L_A_D_First(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument findByP_L_A_D_Last(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchByP_L_A_D_Last(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	*/
	public VLegalSuggestDocument[] findByP_L_A_D_PrevAndNext(
		java.lang.String sugId, long groupId, java.lang.String language,
		boolean approved, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Removes all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param draftId the draft ID
	*/
	public void removeByP_L_A_D(long groupId, java.lang.String language,
		boolean approved, java.lang.String draftId);

	/**
	* Returns the number of v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param draftId the draft ID
	* @return the number of matching v legal suggest documents
	*/
	public int countByP_L_A_D(long groupId, java.lang.String language,
		boolean approved, java.lang.String draftId);

	/**
	* Returns all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved
	* @param draftId the draft ID
	* @return the matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByA_D(boolean approved,
		java.lang.String draftId);

	/**
	* Returns a range of all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param approved the approved
	* @param draftId the draft ID
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @return the range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByA_D(boolean approved,
		java.lang.String draftId, int start, int end);

	/**
	* Returns an ordered range of all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param approved the approved
	* @param draftId the draft ID
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByA_D(boolean approved,
		java.lang.String draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param approved the approved
	* @param draftId the draft ID
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findByA_D(boolean approved,
		java.lang.String draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument findByA_D_First(boolean approved,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the first v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchByA_D_First(boolean approved,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns the last v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument findByA_D_Last(boolean approved,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the last v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchByA_D_Last(boolean approved,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param approved the approved
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	*/
	public VLegalSuggestDocument[] findByA_D_PrevAndNext(
		java.lang.String sugId, boolean approved, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Removes all the v legal suggest documents where approved = &#63; and draftId = &#63; from the database.
	*
	* @param approved the approved
	* @param draftId the draft ID
	*/
	public void removeByA_D(boolean approved, java.lang.String draftId);

	/**
	* Returns the number of v legal suggest documents where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved
	* @param draftId the draft ID
	* @return the number of matching v legal suggest documents
	*/
	public int countByA_D(boolean approved, java.lang.String draftId);

	/**
	* Returns all the v legal suggest documents where draftId = &#63;.
	*
	* @param draftId the draft ID
	* @return the matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findBySuggByDraftId(
		java.lang.String draftId);

	/**
	* Returns a range of all the v legal suggest documents where draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param draftId the draft ID
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @return the range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findBySuggByDraftId(
		java.lang.String draftId, int start, int end);

	/**
	* Returns an ordered range of all the v legal suggest documents where draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param draftId the draft ID
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findBySuggByDraftId(
		java.lang.String draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal suggest documents where draftId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param draftId the draft ID
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findBySuggByDraftId(
		java.lang.String draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal suggest document in the ordered set where draftId = &#63;.
	*
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument findBySuggByDraftId_First(
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the first v legal suggest document in the ordered set where draftId = &#63;.
	*
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchBySuggByDraftId_First(
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns the last v legal suggest document in the ordered set where draftId = &#63;.
	*
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument findBySuggByDraftId_Last(
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the last v legal suggest document in the ordered set where draftId = &#63;.
	*
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public VLegalSuggestDocument fetchBySuggByDraftId_Last(
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where draftId = &#63;.
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	*/
	public VLegalSuggestDocument[] findBySuggByDraftId_PrevAndNext(
		java.lang.String sugId, java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Removes all the v legal suggest documents where draftId = &#63; from the database.
	*
	* @param draftId the draft ID
	*/
	public void removeBySuggByDraftId(java.lang.String draftId);

	/**
	* Returns the number of v legal suggest documents where draftId = &#63;.
	*
	* @param draftId the draft ID
	* @return the number of matching v legal suggest documents
	*/
	public int countBySuggByDraftId(java.lang.String draftId);

	/**
	* Caches the v legal suggest document in the entity cache if it is enabled.
	*
	* @param vLegalSuggestDocument the v legal suggest document
	*/
	public void cacheResult(VLegalSuggestDocument vLegalSuggestDocument);

	/**
	* Caches the v legal suggest documents in the entity cache if it is enabled.
	*
	* @param vLegalSuggestDocuments the v legal suggest documents
	*/
	public void cacheResult(
		java.util.List<VLegalSuggestDocument> vLegalSuggestDocuments);

	/**
	* Creates a new v legal suggest document with the primary key. Does not add the v legal suggest document to the database.
	*
	* @param sugId the primary key for the new v legal suggest document
	* @return the new v legal suggest document
	*/
	public VLegalSuggestDocument create(java.lang.String sugId);

	/**
	* Removes the v legal suggest document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sugId the primary key of the v legal suggest document
	* @return the v legal suggest document that was removed
	* @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	*/
	public VLegalSuggestDocument remove(java.lang.String sugId)
		throws NoSuchVLegalSuggestDocumentException;

	public VLegalSuggestDocument updateImpl(
		VLegalSuggestDocument vLegalSuggestDocument);

	/**
	* Returns the v legal suggest document with the primary key or throws a {@link NoSuchVLegalSuggestDocumentException} if it could not be found.
	*
	* @param sugId the primary key of the v legal suggest document
	* @return the v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	*/
	public VLegalSuggestDocument findByPrimaryKey(java.lang.String sugId)
		throws NoSuchVLegalSuggestDocumentException;

	/**
	* Returns the v legal suggest document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sugId the primary key of the v legal suggest document
	* @return the v legal suggest document, or <code>null</code> if a v legal suggest document with the primary key could not be found
	*/
	public VLegalSuggestDocument fetchByPrimaryKey(java.lang.String sugId);

	@Override
	public java.util.Map<java.io.Serializable, VLegalSuggestDocument> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal suggest documents.
	*
	* @return the v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findAll();

	/**
	* Returns a range of all the v legal suggest documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @return the range of v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v legal suggest documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal suggest documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal suggest documents
	*/
	public java.util.List<VLegalSuggestDocument> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal suggest documents from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal suggest documents.
	*
	* @return the number of v legal suggest documents
	*/
	public int countAll();
}