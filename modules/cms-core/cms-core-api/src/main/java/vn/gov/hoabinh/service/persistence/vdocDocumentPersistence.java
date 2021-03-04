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

import vn.gov.hoabinh.exception.NoSuchvdocDocumentException;
import vn.gov.hoabinh.model.vdocDocument;

/**
 * The persistence interface for the vdoc document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.vdocDocumentPersistenceImpl
 * @see vdocDocumentUtil
 * @generated
 */
@ProviderType
public interface vdocDocumentPersistence extends BasePersistence<vdocDocument> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link vdocDocumentUtil} to access the vdoc document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vdoc documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L(long groupId,
		java.lang.String language);

	/**
	* Returns a range of all the vdoc documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @return the range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L(long groupId,
		java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByG_L_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByG_L_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByG_L_Last(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param docId the primary key of the current vdoc document
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc document
	* @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	*/
	public vdocDocument[] findByG_L_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Removes all the vdoc documents where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByG_L(long groupId, java.lang.String language);

	/**
	* Returns the number of vdoc documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching vdoc documents
	*/
	public int countByG_L(long groupId, java.lang.String language);

	/**
	* Returns all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @return the matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S(long groupId,
		java.lang.String language, int statusDoc);

	/**
	* Returns a range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @return the range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S(long groupId,
		java.lang.String language, int statusDoc, int start, int end);

	/**
	* Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S(long groupId,
		java.lang.String language, int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S(long groupId,
		java.lang.String language, int statusDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByG_L_S_First(long groupId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByG_L_S_First(long groupId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByG_L_S_Last(long groupId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByG_L_S_Last(long groupId,
		java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param docId the primary key of the current vdoc document
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc document
	* @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	*/
	public vdocDocument[] findByG_L_S_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Removes all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	*/
	public void removeByG_L_S(long groupId, java.lang.String language,
		int statusDoc);

	/**
	* Returns the number of vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @return the number of matching vdoc documents
	*/
	public int countByG_L_S(long groupId, java.lang.String language,
		int statusDoc);

	/**
	* Returns all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param hasService the has service
	* @return the matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S_S(long groupId,
		java.lang.String language, int statusDoc, boolean hasService);

	/**
	* Returns a range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param hasService the has service
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @return the range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S_S(long groupId,
		java.lang.String language, int statusDoc, boolean hasService,
		int start, int end);

	/**
	* Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param hasService the has service
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S_S(long groupId,
		java.lang.String language, int statusDoc, boolean hasService,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param hasService the has service
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S_S(long groupId,
		java.lang.String language, int statusDoc, boolean hasService,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param hasService the has service
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByG_L_S_S_First(long groupId,
		java.lang.String language, int statusDoc, boolean hasService,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param hasService the has service
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByG_L_S_S_First(long groupId,
		java.lang.String language, int statusDoc, boolean hasService,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param hasService the has service
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByG_L_S_S_Last(long groupId,
		java.lang.String language, int statusDoc, boolean hasService,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param hasService the has service
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByG_L_S_S_Last(long groupId,
		java.lang.String language, int statusDoc, boolean hasService,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	*
	* @param docId the primary key of the current vdoc document
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param hasService the has service
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc document
	* @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	*/
	public vdocDocument[] findByG_L_S_S_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language, int statusDoc,
		boolean hasService,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Removes all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param hasService the has service
	*/
	public void removeByG_L_S_S(long groupId, java.lang.String language,
		int statusDoc, boolean hasService);

	/**
	* Returns the number of vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param hasService the has service
	* @return the number of matching vdoc documents
	*/
	public int countByG_L_S_S(long groupId, java.lang.String language,
		int statusDoc, boolean hasService);

	/**
	* Returns all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @return the matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId);

	/**
	* Returns a range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @return the range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId, int start, int end);

	/**
	* Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByG_L_F_First(long groupId,
		java.lang.String language, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByG_L_F_First(long groupId,
		java.lang.String language, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByG_L_F_Last(long groupId,
		java.lang.String language, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByG_L_F_Last(long groupId,
		java.lang.String language, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param docId the primary key of the current vdoc document
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc document
	* @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	*/
	public vdocDocument[] findByG_L_F_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language, java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Removes all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	*/
	public void removeByG_L_F(long groupId, java.lang.String language,
		java.lang.String fieldId);

	/**
	* Returns the number of vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @return the number of matching vdoc documents
	*/
	public int countByG_L_F(long groupId, java.lang.String language,
		java.lang.String fieldId);

	/**
	* Returns all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @return the matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc);

	/**
	* Returns a range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @return the range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end);

	/**
	* Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByG_L_F_S_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByG_L_F_S_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByG_L_F_S_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByG_L_F_S_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param docId the primary key of the current vdoc document
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc document
	* @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	*/
	public vdocDocument[] findByG_L_F_S_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language, java.lang.String fieldId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Removes all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	*/
	public void removeByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc);

	/**
	* Returns the number of vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @return the number of matching vdoc documents
	*/
	public int countByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc);

	/**
	* Returns all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param typeDoc the type doc
	* @return the matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S_T(long groupId,
		java.lang.String language, int statusDoc, int typeDoc);

	/**
	* Returns a range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param typeDoc the type doc
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @return the range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S_T(long groupId,
		java.lang.String language, int statusDoc, int typeDoc, int start,
		int end);

	/**
	* Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param typeDoc the type doc
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S_T(long groupId,
		java.lang.String language, int statusDoc, int typeDoc, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param typeDoc the type doc
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S_T(long groupId,
		java.lang.String language, int statusDoc, int typeDoc, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param typeDoc the type doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByG_L_S_T_First(long groupId,
		java.lang.String language, int statusDoc, int typeDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param typeDoc the type doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByG_L_S_T_First(long groupId,
		java.lang.String language, int statusDoc, int typeDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param typeDoc the type doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByG_L_S_T_Last(long groupId,
		java.lang.String language, int statusDoc, int typeDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param typeDoc the type doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByG_L_S_T_Last(long groupId,
		java.lang.String language, int statusDoc, int typeDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	*
	* @param docId the primary key of the current vdoc document
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param typeDoc the type doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc document
	* @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	*/
	public vdocDocument[] findByG_L_S_T_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language, int statusDoc, int typeDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Removes all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param typeDoc the type doc
	*/
	public void removeByG_L_S_T(long groupId, java.lang.String language,
		int statusDoc, int typeDoc);

	/**
	* Returns the number of vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param typeDoc the type doc
	* @return the number of matching vdoc documents
	*/
	public int countByG_L_S_T(long groupId, java.lang.String language,
		int statusDoc, int typeDoc);

	/**
	* Returns all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param fieldId the field ID
	* @param typeDoc the type doc
	* @return the matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S_F_T(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc);

	/**
	* Returns a range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param fieldId the field ID
	* @param typeDoc the type doc
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @return the range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S_F_T(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc, int start, int end);

	/**
	* Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param fieldId the field ID
	* @param typeDoc the type doc
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S_F_T(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param fieldId the field ID
	* @param typeDoc the type doc
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByG_L_S_F_T(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param fieldId the field ID
	* @param typeDoc the type doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByG_L_S_F_T_First(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param fieldId the field ID
	* @param typeDoc the type doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByG_L_S_F_T_First(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param fieldId the field ID
	* @param typeDoc the type doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByG_L_S_F_T_Last(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param fieldId the field ID
	* @param typeDoc the type doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByG_L_S_F_T_Last(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the vdoc documents before and after the current vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	*
	* @param docId the primary key of the current vdoc document
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param fieldId the field ID
	* @param typeDoc the type doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc document
	* @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	*/
	public vdocDocument[] findByG_L_S_F_T_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language, int statusDoc,
		java.lang.String fieldId, int typeDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Removes all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param fieldId the field ID
	* @param typeDoc the type doc
	*/
	public void removeByG_L_S_F_T(long groupId, java.lang.String language,
		int statusDoc, java.lang.String fieldId, int typeDoc);

	/**
	* Returns the number of vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param fieldId the field ID
	* @param typeDoc the type doc
	* @return the number of matching vdoc documents
	*/
	public int countByG_L_S_F_T(long groupId, java.lang.String language,
		int statusDoc, java.lang.String fieldId, int typeDoc);

	/**
	* Returns all the vdoc documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @return the matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByStatus(int statusDoc);

	/**
	* Returns a range of all the vdoc documents where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param statusDoc the status doc
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @return the range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByStatus(int statusDoc, int start,
		int end);

	/**
	* Returns an ordered range of all the vdoc documents where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param statusDoc the status doc
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByStatus(int statusDoc, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc documents where statusDoc = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param statusDoc the status doc
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByStatus(int statusDoc, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByStatus_First(int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the first vdoc document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByStatus_First(int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the last vdoc document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByStatus_Last(int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the last vdoc document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByStatus_Last(int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the vdoc documents before and after the current vdoc document in the ordered set where statusDoc = &#63;.
	*
	* @param docId the primary key of the current vdoc document
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc document
	* @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	*/
	public vdocDocument[] findByStatus_PrevAndNext(java.lang.String docId,
		int statusDoc,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Removes all the vdoc documents where statusDoc = &#63; from the database.
	*
	* @param statusDoc the status doc
	*/
	public void removeByStatus(int statusDoc);

	/**
	* Returns the number of vdoc documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @return the number of matching vdoc documents
	*/
	public int countByStatus(int statusDoc);

	/**
	* Returns all the vdoc documents where position = &#63;.
	*
	* @param position the position
	* @return the matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByPosition(int position);

	/**
	* Returns a range of all the vdoc documents where position = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param position the position
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @return the range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByPosition(int position, int start,
		int end);

	/**
	* Returns an ordered range of all the vdoc documents where position = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param position the position
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByPosition(int position, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc documents where position = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param position the position
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc documents
	*/
	public java.util.List<vdocDocument> findByPosition(int position, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc document in the ordered set where position = &#63;.
	*
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByPosition_First(int position,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the first vdoc document in the ordered set where position = &#63;.
	*
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByPosition_First(int position,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the last vdoc document in the ordered set where position = &#63;.
	*
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public vdocDocument findByPosition_Last(int position,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the last vdoc document in the ordered set where position = &#63;.
	*
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public vdocDocument fetchByPosition_Last(int position,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns the vdoc documents before and after the current vdoc document in the ordered set where position = &#63;.
	*
	* @param docId the primary key of the current vdoc document
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc document
	* @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	*/
	public vdocDocument[] findByPosition_PrevAndNext(java.lang.String docId,
		int position,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator)
		throws NoSuchvdocDocumentException;

	/**
	* Removes all the vdoc documents where position = &#63; from the database.
	*
	* @param position the position
	*/
	public void removeByPosition(int position);

	/**
	* Returns the number of vdoc documents where position = &#63;.
	*
	* @param position the position
	* @return the number of matching vdoc documents
	*/
	public int countByPosition(int position);

	/**
	* Caches the vdoc document in the entity cache if it is enabled.
	*
	* @param vdocDocument the vdoc document
	*/
	public void cacheResult(vdocDocument vdocDocument);

	/**
	* Caches the vdoc documents in the entity cache if it is enabled.
	*
	* @param vdocDocuments the vdoc documents
	*/
	public void cacheResult(java.util.List<vdocDocument> vdocDocuments);

	/**
	* Creates a new vdoc document with the primary key. Does not add the vdoc document to the database.
	*
	* @param docId the primary key for the new vdoc document
	* @return the new vdoc document
	*/
	public vdocDocument create(java.lang.String docId);

	/**
	* Removes the vdoc document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docId the primary key of the vdoc document
	* @return the vdoc document that was removed
	* @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	*/
	public vdocDocument remove(java.lang.String docId)
		throws NoSuchvdocDocumentException;

	public vdocDocument updateImpl(vdocDocument vdocDocument);

	/**
	* Returns the vdoc document with the primary key or throws a {@link NoSuchvdocDocumentException} if it could not be found.
	*
	* @param docId the primary key of the vdoc document
	* @return the vdoc document
	* @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	*/
	public vdocDocument findByPrimaryKey(java.lang.String docId)
		throws NoSuchvdocDocumentException;

	/**
	* Returns the vdoc document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param docId the primary key of the vdoc document
	* @return the vdoc document, or <code>null</code> if a vdoc document with the primary key could not be found
	*/
	public vdocDocument fetchByPrimaryKey(java.lang.String docId);

	@Override
	public java.util.Map<java.io.Serializable, vdocDocument> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vdoc documents.
	*
	* @return the vdoc documents
	*/
	public java.util.List<vdocDocument> findAll();

	/**
	* Returns a range of all the vdoc documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @return the range of vdoc documents
	*/
	public java.util.List<vdocDocument> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vdoc documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vdoc documents
	*/
	public java.util.List<vdocDocument> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vdoc documents
	*/
	public java.util.List<vdocDocument> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vdoc documents from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vdoc documents.
	*
	* @return the number of vdoc documents
	*/
	public int countAll();
}