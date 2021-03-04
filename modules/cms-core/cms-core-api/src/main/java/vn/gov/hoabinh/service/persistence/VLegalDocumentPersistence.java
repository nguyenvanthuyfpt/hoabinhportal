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

import vn.gov.hoabinh.exception.NoSuchVLegalDocumentException;
import vn.gov.hoabinh.model.VLegalDocument;

/**
 * The persistence interface for the v legal document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalDocumentPersistenceImpl
 * @see VLegalDocumentUtil
 * @generated
 */
@ProviderType
public interface VLegalDocumentPersistence extends BasePersistence<VLegalDocument> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalDocumentUtil} to access the v legal document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByGroupId(long groupId);

	/**
	* Returns a range of all the v legal documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByGroupId(long groupId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByGroupId(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findByGroupId_PrevAndNext(java.lang.String docId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of v legal documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal documents
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L(long groupId,
		java.lang.String language);

	/**
	* Returns a range of all the v legal documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L(long groupId,
		java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_Last(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_Last(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findByG_L_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByG_L(long groupId, java.lang.String language);

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching v legal documents
	*/
	public int countByG_L(long groupId, java.lang.String language);

	/**
	* Returns all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param typeDocId the type doc ID
	* @param orgId the org ID
	* @param fieldId the field ID
	* @param language the language
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByDocsByF_O_T_L_S(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc);

	/**
	* Returns a range of all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param typeDocId the type doc ID
	* @param orgId the org ID
	* @param fieldId the field ID
	* @param language the language
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByDocsByF_O_T_L_S(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param typeDocId the type doc ID
	* @param orgId the org ID
	* @param fieldId the field ID
	* @param language the language
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByDocsByF_O_T_L_S(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param typeDocId the type doc ID
	* @param orgId the org ID
	* @param fieldId the field ID
	* @param language the language
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByDocsByF_O_T_L_S(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param typeDocId the type doc ID
	* @param orgId the org ID
	* @param fieldId the field ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByDocsByF_O_T_L_S_First(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param typeDocId the type doc ID
	* @param orgId the org ID
	* @param fieldId the field ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByDocsByF_O_T_L_S_First(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param typeDocId the type doc ID
	* @param orgId the org ID
	* @param fieldId the field ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByDocsByF_O_T_L_S_Last(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param typeDocId the type doc ID
	* @param orgId the org ID
	* @param fieldId the field ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByDocsByF_O_T_L_S_Last(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group ID
	* @param typeDocId the type doc ID
	* @param orgId the org ID
	* @param fieldId the field ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findByDocsByF_O_T_L_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param typeDocId the type doc ID
	* @param orgId the org ID
	* @param fieldId the field ID
	* @param language the language
	* @param statusDoc the status doc
	*/
	public void removeByDocsByF_O_T_L_S(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc);

	/**
	* Returns the number of v legal documents where groupId = &#63; and typeDocId = &#63; and orgId = &#63; and fieldId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param typeDocId the type doc ID
	* @param orgId the org ID
	* @param fieldId the field ID
	* @param language the language
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public int countByDocsByF_O_T_L_S(long groupId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc);

	/**
	* Returns all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @param typeDocId the type doc ID
	* @param language the language
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByDocsByG_O_T_L_S(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc);

	/**
	* Returns a range of all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @param typeDocId the type doc ID
	* @param language the language
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByDocsByG_O_T_L_S(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc, int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @param typeDocId the type doc ID
	* @param language the language
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByDocsByG_O_T_L_S(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @param typeDocId the type doc ID
	* @param language the language
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByDocsByG_O_T_L_S(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @param typeDocId the type doc ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByDocsByG_O_T_L_S_First(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @param typeDocId the type doc ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByDocsByG_O_T_L_S_First(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @param typeDocId the type doc ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByDocsByG_O_T_L_S_Last(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @param typeDocId the type doc ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByDocsByG_O_T_L_S_Last(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group ID
	* @param orgId the org ID
	* @param typeDocId the type doc ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findByDocsByG_O_T_L_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String orgId,
		java.lang.String typeDocId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @param typeDocId the type doc ID
	* @param language the language
	* @param statusDoc the status doc
	*/
	public void removeByDocsByG_O_T_L_S(long groupId, java.lang.String orgId,
		java.lang.String typeDocId, java.lang.String language, int statusDoc);

	/**
	* Returns the number of v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @param typeDocId the type doc ID
	* @param language the language
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public int countByDocsByG_O_T_L_S(long groupId, java.lang.String orgId,
		java.lang.String typeDocId, java.lang.String language, int statusDoc);

	/**
	* Returns all the v legal documents where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc ID
	* @param language the language
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByDocsByT_L(
		java.lang.String typeDocId, java.lang.String language);

	/**
	* Returns a range of all the v legal documents where typeDocId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeDocId the type doc ID
	* @param language the language
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByDocsByT_L(
		java.lang.String typeDocId, java.lang.String language, int start,
		int end);

	/**
	* Returns an ordered range of all the v legal documents where typeDocId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeDocId the type doc ID
	* @param language the language
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByDocsByT_L(
		java.lang.String typeDocId, java.lang.String language, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where typeDocId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeDocId the type doc ID
	* @param language the language
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByDocsByT_L(
		java.lang.String typeDocId, java.lang.String language, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByDocsByT_L_First(java.lang.String typeDocId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByDocsByT_L_First(java.lang.String typeDocId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByDocsByT_L_Last(java.lang.String typeDocId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByDocsByT_L_Last(java.lang.String typeDocId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param typeDocId the type doc ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findByDocsByT_L_PrevAndNext(
		java.lang.String docId, java.lang.String typeDocId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where typeDocId = &#63; and language = &#63; from the database.
	*
	* @param typeDocId the type doc ID
	* @param language the language
	*/
	public void removeByDocsByT_L(java.lang.String typeDocId,
		java.lang.String language);

	/**
	* Returns the number of v legal documents where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc ID
	* @param language the language
	* @return the number of matching v legal documents
	*/
	public int countByDocsByT_L(java.lang.String typeDocId,
		java.lang.String language);

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param userId the user ID
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_U_S(long groupId,
		java.lang.String language, long userId, int statusDoc);

	/**
	* Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param userId the user ID
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_U_S(long groupId,
		java.lang.String language, long userId, int statusDoc, int start,
		int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param userId the user ID
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_U_S(long groupId,
		java.lang.String language, long userId, int statusDoc, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param userId the user ID
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_U_S(long groupId,
		java.lang.String language, long userId, int statusDoc, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param userId the user ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_U_S_First(long groupId,
		java.lang.String language, long userId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param userId the user ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_U_S_First(long groupId,
		java.lang.String language, long userId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param userId the user ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_U_S_Last(long groupId,
		java.lang.String language, long userId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param userId the user ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_U_S_Last(long groupId,
		java.lang.String language, long userId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group ID
	* @param language the language
	* @param userId the user ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findByG_L_U_S_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language, long userId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param userId the user ID
	* @param statusDoc the status doc
	*/
	public void removeByG_L_U_S(long groupId, java.lang.String language,
		long userId, int statusDoc);

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param userId the user ID
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public int countByG_L_U_S(long groupId, java.lang.String language,
		long userId, int statusDoc);

	/**
	* Returns the v legal document where groupId = &#63; and docId = &#63; or throws a {@link NoSuchVLegalDocumentException} if it could not be found.
	*
	* @param groupId the group ID
	* @param docId the doc ID
	* @return the matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_D(long groupId, java.lang.String docId)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the v legal document where groupId = &#63; and docId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param docId the doc ID
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_D(long groupId, java.lang.String docId);

	/**
	* Returns the v legal document where groupId = &#63; and docId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param docId the doc ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_D(long groupId, java.lang.String docId,
		boolean retrieveFromCache);

	/**
	* Removes the v legal document where groupId = &#63; and docId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param docId the doc ID
	* @return the v legal document that was removed
	*/
	public VLegalDocument removeByG_D(long groupId, java.lang.String docId)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the number of v legal documents where groupId = &#63; and docId = &#63;.
	*
	* @param groupId the group ID
	* @param docId the doc ID
	* @return the number of matching v legal documents
	*/
	public int countByG_D(long groupId, java.lang.String docId);

	/**
	* Returns the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or throws a {@link NoSuchVLegalDocumentException} if it could not be found.
	*
	* @param groupId the group ID
	* @param num the num
	* @param symbol the symbol
	* @return the matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByP_N_S(long groupId, java.lang.String num,
		java.lang.String symbol) throws NoSuchVLegalDocumentException;

	/**
	* Returns the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param num the num
	* @param symbol the symbol
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByP_N_S(long groupId, java.lang.String num,
		java.lang.String symbol);

	/**
	* Returns the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param num the num
	* @param symbol the symbol
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByP_N_S(long groupId, java.lang.String num,
		java.lang.String symbol, boolean retrieveFromCache);

	/**
	* Removes the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; from the database.
	*
	* @param groupId the group ID
	* @param num the num
	* @param symbol the symbol
	* @return the v legal document that was removed
	*/
	public VLegalDocument removeByP_N_S(long groupId, java.lang.String num,
		java.lang.String symbol) throws NoSuchVLegalDocumentException;

	/**
	* Returns the number of v legal documents where groupId = &#63; and num = &#63; and symbol = &#63;.
	*
	* @param groupId the group ID
	* @param num the num
	* @param symbol the symbol
	* @return the number of matching v legal documents
	*/
	public int countByP_N_S(long groupId, java.lang.String num,
		java.lang.String symbol);

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByP_L_S(long groupId,
		java.lang.String language, int statusDoc);

	/**
	* Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByP_L_S(long groupId,
		java.lang.String language, int statusDoc, int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByP_L_S(long groupId,
		java.lang.String language, int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByP_L_S(long groupId,
		java.lang.String language, int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByP_L_S_First(long groupId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByP_L_S_First(long groupId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByP_L_S_Last(long groupId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByP_L_S_Last(long groupId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findByP_L_S_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	*/
	public void removeByP_L_S(long groupId, java.lang.String language,
		int statusDoc);

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public int countByP_L_S(long groupId, java.lang.String language,
		int statusDoc);

	/**
	* Returns all the v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findBystatusDoc(int statusDoc);

	/**
	* Returns a range of all the v legal documents where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findBystatusDoc(int statusDoc,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findBystatusDoc(int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findBystatusDoc(int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findBystatusDoc_First(int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchBystatusDoc_First(int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findBystatusDoc_Last(int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchBystatusDoc_Last(int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findBystatusDoc_PrevAndNext(
		java.lang.String docId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where statusDoc = &#63; from the database.
	*
	* @param statusDoc the status doc
	*/
	public void removeBystatusDoc(int statusDoc);

	/**
	* Returns the number of v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public int countBystatusDoc(int statusDoc);

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_O_S(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc);

	/**
	* Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_O_S(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_O_S(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_O_S(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_O_S_First(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_O_S_First(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_O_S_Last(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_O_S_Last(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findByG_L_O_S_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language, java.lang.String orgId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	*/
	public void removeByG_L_O_S(long groupId, java.lang.String language,
		java.lang.String orgId, int statusDoc);

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public int countByG_L_O_S(long groupId, java.lang.String language,
		java.lang.String orgId, int statusDoc);

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_T_S(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc);

	/**
	* Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_T_S(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_T_S(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_T_S(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_T_S_First(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_T_S_First(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_T_S_Last(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_T_S_Last(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findByG_L_T_S_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	*/
	public void removeByG_L_T_S(long groupId, java.lang.String language,
		java.lang.String typeDocId, int statusDoc);

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public int countByG_L_T_S(long groupId, java.lang.String language,
		java.lang.String typeDocId, int statusDoc);

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc);

	/**
	* Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_F_S_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_F_S_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_F_S_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_F_S_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findByG_L_F_S_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language, java.lang.String fieldId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	*/
	public void removeByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc);

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public int countByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc);

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_O(long groupId,
		java.lang.String language, java.lang.String orgId);

	/**
	* Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_O(long groupId,
		java.lang.String language, java.lang.String orgId, int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_O(long groupId,
		java.lang.String language, java.lang.String orgId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_O(long groupId,
		java.lang.String language, java.lang.String orgId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_O_First(long groupId,
		java.lang.String language, java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_O_First(long groupId,
		java.lang.String language, java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_O_Last(long groupId,
		java.lang.String language, java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_O_Last(long groupId,
		java.lang.String language, java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findByG_L_O_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language, java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	*/
	public void removeByG_L_O(long groupId, java.lang.String language,
		java.lang.String orgId);

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @return the number of matching v legal documents
	*/
	public int countByG_L_O(long groupId, java.lang.String language,
		java.lang.String orgId);

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String typeDocId);

	/**
	* Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String typeDocId, int start,
		int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String typeDocId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String typeDocId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_T_First(long groupId,
		java.lang.String language, java.lang.String typeDocId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_T_First(long groupId,
		java.lang.String language, java.lang.String typeDocId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_T_Last(long groupId,
		java.lang.String language, java.lang.String typeDocId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_T_Last(long groupId,
		java.lang.String language, java.lang.String typeDocId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findByG_L_T_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language, java.lang.String typeDocId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	*/
	public void removeByG_L_T(long groupId, java.lang.String language,
		java.lang.String typeDocId);

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @return the number of matching v legal documents
	*/
	public int countByG_L_T(long groupId, java.lang.String language,
		java.lang.String typeDocId);

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId);

	/**
	* Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId, int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_F_First(long groupId,
		java.lang.String language, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_F_First(long groupId,
		java.lang.String language, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_F_Last(long groupId,
		java.lang.String language, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_F_Last(long groupId,
		java.lang.String language, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findByG_L_F_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	*/
	public void removeByG_L_F(long groupId, java.lang.String language,
		java.lang.String fieldId);

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @return the number of matching v legal documents
	*/
	public int countByG_L_F(long groupId, java.lang.String language,
		java.lang.String fieldId);

	/**
	* Returns all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByP_U_S(long groupId,
		long createdByUser, java.lang.String language, int statusDoc);

	/**
	* Returns a range of all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByP_U_S(long groupId,
		long createdByUser, java.lang.String language, int statusDoc,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByP_U_S(long groupId,
		long createdByUser, java.lang.String language, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByP_U_S(long groupId,
		long createdByUser, java.lang.String language, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByP_U_S_First(long groupId, long createdByUser,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByP_U_S_First(long groupId, long createdByUser,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByP_U_S_Last(long groupId, long createdByUser,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByP_U_S_Last(long groupId, long createdByUser,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findByP_U_S_PrevAndNext(java.lang.String docId,
		long groupId, long createdByUser, java.lang.String language,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param statusDoc the status doc
	*/
	public void removeByP_U_S(long groupId, long createdByUser,
		java.lang.String language, int statusDoc);

	/**
	* Returns the number of v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public int countByP_U_S(long groupId, long createdByUser,
		java.lang.String language, int statusDoc);

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_O_S_D(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId);

	/**
	* Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_O_S_D(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId, int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_O_S_D(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_O_S_D(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_O_S_D_First(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_O_S_D_First(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_O_S_D_Last(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_O_S_D_Last(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	*/
	public void removeByG_L_O_S_D(long groupId, java.lang.String language,
		java.lang.String orgId, int statusDoc, java.lang.String docId);

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @return the number of matching v legal documents
	*/
	public int countByG_L_O_S_D(long groupId, java.lang.String language,
		java.lang.String orgId, int statusDoc, java.lang.String docId);

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId);

	/**
	* Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId, int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_T_S_D_First(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_T_S_D_First(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_T_S_D_Last(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_T_S_D_Last(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	*/
	public void removeByG_L_T_S_D(long groupId, java.lang.String language,
		java.lang.String typeDocId, int statusDoc, java.lang.String docId);

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @return the number of matching v legal documents
	*/
	public int countByG_L_T_S_D(long groupId, java.lang.String language,
		java.lang.String typeDocId, int statusDoc, java.lang.String docId);

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId);

	/**
	* Returns a range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId, int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_F_S_D_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_F_S_D_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByG_L_F_S_D_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByG_L_F_S_D_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	*/
	public void removeByG_L_F_S_D(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc, java.lang.String docId);

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	* @return the number of matching v legal documents
	*/
	public int countByG_L_F_S_D(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc, java.lang.String docId);

	/**
	* Returns all the v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByStatus(int statusDoc);

	/**
	* Returns a range of all the v legal documents where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByStatus(int statusDoc,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal documents where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByStatus(int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param statusDoc the status doc
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal documents
	*/
	public java.util.List<VLegalDocument> findByStatus(int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByStatus_First(int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the first v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByStatus_First(int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the last v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public VLegalDocument findByStatus_Last(int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the last v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public VLegalDocument fetchByStatus_Last(int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument[] findByStatus_PrevAndNext(java.lang.String docId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator)
		throws NoSuchVLegalDocumentException;

	/**
	* Removes all the v legal documents where statusDoc = &#63; from the database.
	*
	* @param statusDoc the status doc
	*/
	public void removeByStatus(int statusDoc);

	/**
	* Returns the number of v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public int countByStatus(int statusDoc);

	/**
	* Caches the v legal document in the entity cache if it is enabled.
	*
	* @param vLegalDocument the v legal document
	*/
	public void cacheResult(VLegalDocument vLegalDocument);

	/**
	* Caches the v legal documents in the entity cache if it is enabled.
	*
	* @param vLegalDocuments the v legal documents
	*/
	public void cacheResult(java.util.List<VLegalDocument> vLegalDocuments);

	/**
	* Creates a new v legal document with the primary key. Does not add the v legal document to the database.
	*
	* @param docId the primary key for the new v legal document
	* @return the new v legal document
	*/
	public VLegalDocument create(java.lang.String docId);

	/**
	* Removes the v legal document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docId the primary key of the v legal document
	* @return the v legal document that was removed
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument remove(java.lang.String docId)
		throws NoSuchVLegalDocumentException;

	public VLegalDocument updateImpl(VLegalDocument vLegalDocument);

	/**
	* Returns the v legal document with the primary key or throws a {@link NoSuchVLegalDocumentException} if it could not be found.
	*
	* @param docId the primary key of the v legal document
	* @return the v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public VLegalDocument findByPrimaryKey(java.lang.String docId)
		throws NoSuchVLegalDocumentException;

	/**
	* Returns the v legal document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param docId the primary key of the v legal document
	* @return the v legal document, or <code>null</code> if a v legal document with the primary key could not be found
	*/
	public VLegalDocument fetchByPrimaryKey(java.lang.String docId);

	@Override
	public java.util.Map<java.io.Serializable, VLegalDocument> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal documents.
	*
	* @return the v legal documents
	*/
	public java.util.List<VLegalDocument> findAll();

	/**
	* Returns a range of all the v legal documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of v legal documents
	*/
	public java.util.List<VLegalDocument> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v legal documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal documents
	*/
	public java.util.List<VLegalDocument> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator);

	/**
	* Returns an ordered range of all the v legal documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal documents
	*/
	public java.util.List<VLegalDocument> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal documents from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal documents.
	*
	* @return the number of v legal documents
	*/
	public int countAll();
}