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

import vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException;
import vn.gov.hoabinh.model.VLegalDraftDocument;

/**
 * The persistence interface for the v legal draft document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalDraftDocumentPersistenceImpl
 * @see VLegalDraftDocumentUtil
 * @generated
 */
@ProviderType
public interface VLegalDraftDocumentPersistence extends BasePersistence<VLegalDraftDocument> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalDraftDocumentUtil} to access the v legal draft document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal draft documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByGroupId(long groupId);

	/**
	* Returns a range of all the v legal draft documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @return the range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByGroupId(long groupId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63;.
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	*/
	public VLegalDraftDocument[] findByGroupId_PrevAndNext(
		java.lang.String draftId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Removes all the v legal draft documents where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of v legal draft documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal draft documents
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns the v legal draft document where groupId = &#63; and draftId = &#63; or throws a {@link NoSuchVLegalDraftDocumentException} if it could not be found.
	*
	* @param groupId the group ID
	* @param draftId the draft ID
	* @return the matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByG_D(long groupId, java.lang.String draftId)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the v legal draft document where groupId = &#63; and draftId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param draftId the draft ID
	* @return the matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByG_D(long groupId, java.lang.String draftId);

	/**
	* Returns the v legal draft document where groupId = &#63; and draftId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param draftId the draft ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByG_D(long groupId,
		java.lang.String draftId, boolean retrieveFromCache);

	/**
	* Removes the v legal draft document where groupId = &#63; and draftId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param draftId the draft ID
	* @return the v legal draft document that was removed
	*/
	public VLegalDraftDocument removeByG_D(long groupId,
		java.lang.String draftId) throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and draftId = &#63;.
	*
	* @param groupId the group ID
	* @param draftId the draft ID
	* @return the number of matching v legal draft documents
	*/
	public int countByG_D(long groupId, java.lang.String draftId);

	/**
	* Returns all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	* @return the matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_D(long groupId,
		int statusDraft, java.lang.String docCode);

	/**
	* Returns a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @return the range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_D(long groupId,
		int statusDraft, java.lang.String docCode, int start, int end);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_D(long groupId,
		int statusDraft, java.lang.String docCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_D(long groupId,
		int statusDraft, java.lang.String docCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByP_S_D_First(long groupId, int statusDraft,
		java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByP_S_D_First(long groupId,
		int statusDraft, java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByP_S_D_Last(long groupId, int statusDraft,
		java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByP_S_D_Last(long groupId, int statusDraft,
		java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	*/
	public VLegalDraftDocument[] findByP_S_D_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	*/
	public void removeByP_S_D(long groupId, int statusDraft,
		java.lang.String docCode);

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	* @return the number of matching v legal draft documents
	*/
	public int countByP_S_D(long groupId, int statusDraft,
		java.lang.String docCode);

	/**
	* Returns all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	* @return the matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_F(long groupId,
		int statusDraft, java.lang.String fieldId);

	/**
	* Returns a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @return the range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_F(long groupId,
		int statusDraft, java.lang.String fieldId, int start, int end);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_F(long groupId,
		int statusDraft, java.lang.String fieldId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_F(long groupId,
		int statusDraft, java.lang.String fieldId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByP_S_F_First(long groupId, int statusDraft,
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByP_S_F_First(long groupId,
		int statusDraft, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByP_S_F_Last(long groupId, int statusDraft,
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByP_S_F_Last(long groupId, int statusDraft,
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	*/
	public VLegalDraftDocument[] findByP_S_F_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	*/
	public void removeByP_S_F(long groupId, int statusDraft,
		java.lang.String fieldId);

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	* @return the number of matching v legal draft documents
	*/
	public int countByP_S_F(long groupId, int statusDraft,
		java.lang.String fieldId);

	/**
	* Returns all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	* @return the matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByDraftPublished(
		long groupId, java.lang.String language, int statusDraft);

	/**
	* Returns a range of all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @return the range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByDraftPublished(
		long groupId, java.lang.String language, int statusDraft, int start,
		int end);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByDraftPublished(
		long groupId, java.lang.String language, int statusDraft, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByDraftPublished(
		long groupId, java.lang.String language, int statusDraft, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByDraftPublished_First(long groupId,
		java.lang.String language, int statusDraft,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByDraftPublished_First(long groupId,
		java.lang.String language, int statusDraft,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByDraftPublished_Last(long groupId,
		java.lang.String language, int statusDraft,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByDraftPublished_Last(long groupId,
		java.lang.String language, int statusDraft,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	*/
	public VLegalDraftDocument[] findByDraftPublished_PrevAndNext(
		java.lang.String draftId, long groupId, java.lang.String language,
		int statusDraft,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDrafts the status drafts
	* @return the matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByDraftPublished(
		long groupId, java.lang.String language, int[] statusDrafts);

	/**
	* Returns a range of all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDrafts the status drafts
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @return the range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByDraftPublished(
		long groupId, java.lang.String language, int[] statusDrafts, int start,
		int end);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDrafts the status drafts
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByDraftPublished(
		long groupId, java.lang.String language, int[] statusDrafts, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByDraftPublished(
		long groupId, java.lang.String language, int[] statusDrafts, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	*/
	public void removeByDraftPublished(long groupId, java.lang.String language,
		int statusDraft);

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	* @return the number of matching v legal draft documents
	*/
	public int countByDraftPublished(long groupId, java.lang.String language,
		int statusDraft);

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = any &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDrafts the status drafts
	* @return the number of matching v legal draft documents
	*/
	public int countByDraftPublished(long groupId, java.lang.String language,
		int[] statusDrafts);

	/**
	* Returns all the v legal draft documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @return the matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId);

	/**
	* Returns a range of all the v legal draft documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @return the range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId, int start, int end);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByG_L_F_S_D_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByG_L_F_S_D_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByG_L_F_S_D_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByG_L_F_S_D_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Removes all the v legal draft documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	*/
	public void removeByG_L_F_S_D(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDraft, java.lang.String draftId);

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @return the number of matching v legal draft documents
	*/
	public int countByG_L_F_S_D(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDraft, java.lang.String draftId);

	/**
	* Returns all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	* @return the matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_T(long groupId,
		int statusDraft, java.lang.String typeId);

	/**
	* Returns a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @return the range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_T(long groupId,
		int statusDraft, java.lang.String typeId, int start, int end);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_T(long groupId,
		int statusDraft, java.lang.String typeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_T(long groupId,
		int statusDraft, java.lang.String typeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByP_S_T_First(long groupId, int statusDraft,
		java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByP_S_T_First(long groupId,
		int statusDraft, java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByP_S_T_Last(long groupId, int statusDraft,
		java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByP_S_T_Last(long groupId, int statusDraft,
		java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	*/
	public VLegalDraftDocument[] findByP_S_T_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	*/
	public void removeByP_S_T(long groupId, int statusDraft,
		java.lang.String typeId);

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	* @return the number of matching v legal draft documents
	*/
	public int countByP_S_T(long groupId, int statusDraft,
		java.lang.String typeId);

	/**
	* Returns all the v legal draft documents where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeId the type ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @return the matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId);

	/**
	* Returns a range of all the v legal draft documents where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeId the type ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @return the range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId, int start, int end);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeId the type ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeId the type ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeId the type ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByG_L_T_S_D_First(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeId the type ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByG_L_T_S_D_First(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeId the type ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByG_L_T_S_D_Last(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeId the type ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByG_L_T_S_D_Last(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Removes all the v legal draft documents where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeId the type ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	*/
	public void removeByG_L_T_S_D(long groupId, java.lang.String language,
		java.lang.String typeId, int statusDraft, java.lang.String draftId);

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeId the type ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	* @return the number of matching v legal draft documents
	*/
	public int countByG_L_T_S_D(long groupId, java.lang.String language,
		java.lang.String typeId, int statusDraft, java.lang.String draftId);

	/**
	* Returns all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	* @return the matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_L(long groupId,
		int statusDraft, java.lang.String language);

	/**
	* Returns a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @return the range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_L(long groupId,
		int statusDraft, java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_L(long groupId,
		int statusDraft, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_L(long groupId,
		int statusDraft, java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByP_S_L_First(long groupId, int statusDraft,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByP_S_L_First(long groupId,
		int statusDraft, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByP_S_L_Last(long groupId, int statusDraft,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByP_S_L_Last(long groupId, int statusDraft,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	*/
	public VLegalDraftDocument[] findByP_S_L_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	*/
	public void removeByP_S_L(long groupId, int statusDraft,
		java.lang.String language);

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	* @return the number of matching v legal draft documents
	*/
	public int countByP_S_L(long groupId, int statusDraft,
		java.lang.String language);

	/**
	* Returns all the v legal draft documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_L(long groupId,
		java.lang.String language);

	/**
	* Returns a range of all the v legal draft documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @return the range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_L(long groupId,
		java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByP_L_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByP_L_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByP_L_Last(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByP_L_Last(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	*/
	public VLegalDraftDocument[] findByP_L_PrevAndNext(
		java.lang.String draftId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Removes all the v legal draft documents where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByP_L(long groupId, java.lang.String language);

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching v legal draft documents
	*/
	public int countByP_L(long groupId, java.lang.String language);

	/**
	* Returns all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param createdByUser the created by user
	* @param language the language
	* @return the matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_U_L(long groupId,
		int statusDraft, long createdByUser, java.lang.String language);

	/**
	* Returns a range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param createdByUser the created by user
	* @param language the language
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @return the range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_U_L(long groupId,
		int statusDraft, long createdByUser, java.lang.String language,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param createdByUser the created by user
	* @param language the language
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_U_L(long groupId,
		int statusDraft, long createdByUser, java.lang.String language,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param createdByUser the created by user
	* @param language the language
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByP_S_U_L(long groupId,
		int statusDraft, long createdByUser, java.lang.String language,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param createdByUser the created by user
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByP_S_U_L_First(long groupId,
		int statusDraft, long createdByUser, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param createdByUser the created by user
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByP_S_U_L_First(long groupId,
		int statusDraft, long createdByUser, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param createdByUser the created by user
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByP_S_U_L_Last(long groupId,
		int statusDraft, long createdByUser, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param createdByUser the created by user
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByP_S_U_L_Last(long groupId,
		int statusDraft, long createdByUser, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param createdByUser the created by user
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	*/
	public VLegalDraftDocument[] findByP_S_U_L_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		long createdByUser, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param createdByUser the created by user
	* @param language the language
	*/
	public void removeByP_S_U_L(long groupId, int statusDraft,
		long createdByUser, java.lang.String language);

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param createdByUser the created by user
	* @param language the language
	* @return the number of matching v legal draft documents
	*/
	public int countByP_S_U_L(long groupId, int statusDraft,
		long createdByUser, java.lang.String language);

	/**
	* Returns all the v legal draft documents where docCode = &#63;.
	*
	* @param docCode the doc code
	* @return the matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByDocCode(
		java.lang.String docCode);

	/**
	* Returns a range of all the v legal draft documents where docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docCode the doc code
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @return the range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByDocCode(
		java.lang.String docCode, int start, int end);

	/**
	* Returns an ordered range of all the v legal draft documents where docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docCode the doc code
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByDocCode(
		java.lang.String docCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal draft documents where docCode = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docCode the doc code
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findByDocCode(
		java.lang.String docCode, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal draft document in the ordered set where docCode = &#63;.
	*
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByDocCode_First(java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the first v legal draft document in the ordered set where docCode = &#63;.
	*
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByDocCode_First(java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the last v legal draft document in the ordered set where docCode = &#63;.
	*
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument findByDocCode_Last(java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the last v legal draft document in the ordered set where docCode = &#63;.
	*
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public VLegalDraftDocument fetchByDocCode_Last(java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns the v legal draft documents before and after the current v legal draft document in the ordered set where docCode = &#63;.
	*
	* @param draftId the primary key of the current v legal draft document
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	*/
	public VLegalDraftDocument[] findByDocCode_PrevAndNext(
		java.lang.String draftId, java.lang.String docCode,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Removes all the v legal draft documents where docCode = &#63; from the database.
	*
	* @param docCode the doc code
	*/
	public void removeByDocCode(java.lang.String docCode);

	/**
	* Returns the number of v legal draft documents where docCode = &#63;.
	*
	* @param docCode the doc code
	* @return the number of matching v legal draft documents
	*/
	public int countByDocCode(java.lang.String docCode);

	/**
	* Caches the v legal draft document in the entity cache if it is enabled.
	*
	* @param vLegalDraftDocument the v legal draft document
	*/
	public void cacheResult(VLegalDraftDocument vLegalDraftDocument);

	/**
	* Caches the v legal draft documents in the entity cache if it is enabled.
	*
	* @param vLegalDraftDocuments the v legal draft documents
	*/
	public void cacheResult(
		java.util.List<VLegalDraftDocument> vLegalDraftDocuments);

	/**
	* Creates a new v legal draft document with the primary key. Does not add the v legal draft document to the database.
	*
	* @param draftId the primary key for the new v legal draft document
	* @return the new v legal draft document
	*/
	public VLegalDraftDocument create(java.lang.String draftId);

	/**
	* Removes the v legal draft document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param draftId the primary key of the v legal draft document
	* @return the v legal draft document that was removed
	* @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	*/
	public VLegalDraftDocument remove(java.lang.String draftId)
		throws NoSuchVLegalDraftDocumentException;

	public VLegalDraftDocument updateImpl(
		VLegalDraftDocument vLegalDraftDocument);

	/**
	* Returns the v legal draft document with the primary key or throws a {@link NoSuchVLegalDraftDocumentException} if it could not be found.
	*
	* @param draftId the primary key of the v legal draft document
	* @return the v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	*/
	public VLegalDraftDocument findByPrimaryKey(java.lang.String draftId)
		throws NoSuchVLegalDraftDocumentException;

	/**
	* Returns the v legal draft document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param draftId the primary key of the v legal draft document
	* @return the v legal draft document, or <code>null</code> if a v legal draft document with the primary key could not be found
	*/
	public VLegalDraftDocument fetchByPrimaryKey(java.lang.String draftId);

	@Override
	public java.util.Map<java.io.Serializable, VLegalDraftDocument> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal draft documents.
	*
	* @return the v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findAll();

	/**
	* Returns a range of all the v legal draft documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @return the range of v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v legal draft documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal draft documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal draft documents
	*/
	public java.util.List<VLegalDraftDocument> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal draft documents from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal draft documents.
	*
	* @return the number of v legal draft documents
	*/
	public int countAll();
}