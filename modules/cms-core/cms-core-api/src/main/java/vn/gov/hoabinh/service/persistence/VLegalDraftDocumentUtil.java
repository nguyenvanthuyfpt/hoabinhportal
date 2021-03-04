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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import vn.gov.hoabinh.model.VLegalDraftDocument;

import java.util.List;

/**
 * The persistence utility for the v legal draft document service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalDraftDocumentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDraftDocumentPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalDraftDocumentPersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalDraftDocumentUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(VLegalDraftDocument vLegalDraftDocument) {
		getPersistence().clearCache(vLegalDraftDocument);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VLegalDraftDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalDraftDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalDraftDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalDraftDocument update(
		VLegalDraftDocument vLegalDraftDocument) {
		return getPersistence().update(vLegalDraftDocument);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalDraftDocument update(
		VLegalDraftDocument vLegalDraftDocument, ServiceContext serviceContext) {
		return getPersistence().update(vLegalDraftDocument, serviceContext);
	}

	/**
	* Returns all the v legal draft documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal draft documents
	*/
	public static List<VLegalDraftDocument> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static List<VLegalDraftDocument> findByGroupId(long groupId,
		int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static List<VLegalDraftDocument> findByGroupId(long groupId,
		int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

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
	public static List<VLegalDraftDocument> findByGroupId(long groupId,
		int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument findByGroupId_First(long groupId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument findByGroupId_Last(long groupId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the v legal draft documents before and after the current v legal draft document in the ordered set where groupId = &#63;.
	*
	* @param draftId the primary key of the current v legal draft document
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	*/
	public static VLegalDraftDocument[] findByGroupId_PrevAndNext(
		java.lang.String draftId, long groupId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(draftId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of v legal draft documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal draft documents
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns the v legal draft document where groupId = &#63; and draftId = &#63; or throws a {@link NoSuchVLegalDraftDocumentException} if it could not be found.
	*
	* @param groupId the group ID
	* @param draftId the draft ID
	* @return the matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument findByG_D(long groupId,
		java.lang.String draftId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence().findByG_D(groupId, draftId);
	}

	/**
	* Returns the v legal draft document where groupId = &#63; and draftId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param draftId the draft ID
	* @return the matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByG_D(long groupId,
		java.lang.String draftId) {
		return getPersistence().fetchByG_D(groupId, draftId);
	}

	/**
	* Returns the v legal draft document where groupId = &#63; and draftId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param draftId the draft ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByG_D(long groupId,
		java.lang.String draftId, boolean retrieveFromCache) {
		return getPersistence().fetchByG_D(groupId, draftId, retrieveFromCache);
	}

	/**
	* Removes the v legal draft document where groupId = &#63; and draftId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param draftId the draft ID
	* @return the v legal draft document that was removed
	*/
	public static VLegalDraftDocument removeByG_D(long groupId,
		java.lang.String draftId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence().removeByG_D(groupId, draftId);
	}

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and draftId = &#63;.
	*
	* @param groupId the group ID
	* @param draftId the draft ID
	* @return the number of matching v legal draft documents
	*/
	public static int countByG_D(long groupId, java.lang.String draftId) {
		return getPersistence().countByG_D(groupId, draftId);
	}

	/**
	* Returns all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	* @return the matching v legal draft documents
	*/
	public static List<VLegalDraftDocument> findByP_S_D(long groupId,
		int statusDraft, java.lang.String docCode) {
		return getPersistence().findByP_S_D(groupId, statusDraft, docCode);
	}

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
	public static List<VLegalDraftDocument> findByP_S_D(long groupId,
		int statusDraft, java.lang.String docCode, int start, int end) {
		return getPersistence()
				   .findByP_S_D(groupId, statusDraft, docCode, start, end);
	}

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
	public static List<VLegalDraftDocument> findByP_S_D(long groupId,
		int statusDraft, java.lang.String docCode, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .findByP_S_D(groupId, statusDraft, docCode, start, end,
			orderByComparator);
	}

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
	public static List<VLegalDraftDocument> findByP_S_D(long groupId,
		int statusDraft, java.lang.String docCode, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_S_D(groupId, statusDraft, docCode, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDraftDocument findByP_S_D_First(long groupId,
		int statusDraft, java.lang.String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_D_First(groupId, statusDraft, docCode,
			orderByComparator);
	}

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByP_S_D_First(long groupId,
		int statusDraft, java.lang.String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_S_D_First(groupId, statusDraft, docCode,
			orderByComparator);
	}

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
	public static VLegalDraftDocument findByP_S_D_Last(long groupId,
		int statusDraft, java.lang.String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_D_Last(groupId, statusDraft, docCode,
			orderByComparator);
	}

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByP_S_D_Last(long groupId,
		int statusDraft, java.lang.String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_S_D_Last(groupId, statusDraft, docCode,
			orderByComparator);
	}

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
	public static VLegalDraftDocument[] findByP_S_D_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_D_PrevAndNext(draftId, groupId, statusDraft,
			docCode, orderByComparator);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	*/
	public static void removeByP_S_D(long groupId, int statusDraft,
		java.lang.String docCode) {
		getPersistence().removeByP_S_D(groupId, statusDraft, docCode);
	}

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and statusDraft = &#63; and docCode = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param docCode the doc code
	* @return the number of matching v legal draft documents
	*/
	public static int countByP_S_D(long groupId, int statusDraft,
		java.lang.String docCode) {
		return getPersistence().countByP_S_D(groupId, statusDraft, docCode);
	}

	/**
	* Returns all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	* @return the matching v legal draft documents
	*/
	public static List<VLegalDraftDocument> findByP_S_F(long groupId,
		int statusDraft, java.lang.String fieldId) {
		return getPersistence().findByP_S_F(groupId, statusDraft, fieldId);
	}

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
	public static List<VLegalDraftDocument> findByP_S_F(long groupId,
		int statusDraft, java.lang.String fieldId, int start, int end) {
		return getPersistence()
				   .findByP_S_F(groupId, statusDraft, fieldId, start, end);
	}

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
	public static List<VLegalDraftDocument> findByP_S_F(long groupId,
		int statusDraft, java.lang.String fieldId, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .findByP_S_F(groupId, statusDraft, fieldId, start, end,
			orderByComparator);
	}

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
	public static List<VLegalDraftDocument> findByP_S_F(long groupId,
		int statusDraft, java.lang.String fieldId, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_S_F(groupId, statusDraft, fieldId, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDraftDocument findByP_S_F_First(long groupId,
		int statusDraft, java.lang.String fieldId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_F_First(groupId, statusDraft, fieldId,
			orderByComparator);
	}

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByP_S_F_First(long groupId,
		int statusDraft, java.lang.String fieldId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_S_F_First(groupId, statusDraft, fieldId,
			orderByComparator);
	}

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
	public static VLegalDraftDocument findByP_S_F_Last(long groupId,
		int statusDraft, java.lang.String fieldId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_F_Last(groupId, statusDraft, fieldId,
			orderByComparator);
	}

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByP_S_F_Last(long groupId,
		int statusDraft, java.lang.String fieldId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_S_F_Last(groupId, statusDraft, fieldId,
			orderByComparator);
	}

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
	public static VLegalDraftDocument[] findByP_S_F_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String fieldId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_F_PrevAndNext(draftId, groupId, statusDraft,
			fieldId, orderByComparator);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	*/
	public static void removeByP_S_F(long groupId, int statusDraft,
		java.lang.String fieldId) {
		getPersistence().removeByP_S_F(groupId, statusDraft, fieldId);
	}

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and statusDraft = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param fieldId the field ID
	* @return the number of matching v legal draft documents
	*/
	public static int countByP_S_F(long groupId, int statusDraft,
		java.lang.String fieldId) {
		return getPersistence().countByP_S_F(groupId, statusDraft, fieldId);
	}

	/**
	* Returns all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	* @return the matching v legal draft documents
	*/
	public static List<VLegalDraftDocument> findByDraftPublished(long groupId,
		java.lang.String language, int statusDraft) {
		return getPersistence()
				   .findByDraftPublished(groupId, language, statusDraft);
	}

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
	public static List<VLegalDraftDocument> findByDraftPublished(long groupId,
		java.lang.String language, int statusDraft, int start, int end) {
		return getPersistence()
				   .findByDraftPublished(groupId, language, statusDraft, start,
			end);
	}

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
	public static List<VLegalDraftDocument> findByDraftPublished(long groupId,
		java.lang.String language, int statusDraft, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .findByDraftPublished(groupId, language, statusDraft, start,
			end, orderByComparator);
	}

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
	public static List<VLegalDraftDocument> findByDraftPublished(long groupId,
		java.lang.String language, int statusDraft, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDraftPublished(groupId, language, statusDraft, start,
			end, orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDraftDocument findByDraftPublished_First(long groupId,
		java.lang.String language, int statusDraft,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByDraftPublished_First(groupId, language, statusDraft,
			orderByComparator);
	}

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByDraftPublished_First(
		long groupId, java.lang.String language, int statusDraft,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByDraftPublished_First(groupId, language, statusDraft,
			orderByComparator);
	}

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
	public static VLegalDraftDocument findByDraftPublished_Last(long groupId,
		java.lang.String language, int statusDraft,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByDraftPublished_Last(groupId, language, statusDraft,
			orderByComparator);
	}

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByDraftPublished_Last(long groupId,
		java.lang.String language, int statusDraft,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByDraftPublished_Last(groupId, language, statusDraft,
			orderByComparator);
	}

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
	public static VLegalDraftDocument[] findByDraftPublished_PrevAndNext(
		java.lang.String draftId, long groupId, java.lang.String language,
		int statusDraft,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByDraftPublished_PrevAndNext(draftId, groupId,
			language, statusDraft, orderByComparator);
	}

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
	public static List<VLegalDraftDocument> findByDraftPublished(long groupId,
		java.lang.String language, int[] statusDrafts) {
		return getPersistence()
				   .findByDraftPublished(groupId, language, statusDrafts);
	}

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
	public static List<VLegalDraftDocument> findByDraftPublished(long groupId,
		java.lang.String language, int[] statusDrafts, int start, int end) {
		return getPersistence()
				   .findByDraftPublished(groupId, language, statusDrafts,
			start, end);
	}

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
	public static List<VLegalDraftDocument> findByDraftPublished(long groupId,
		java.lang.String language, int[] statusDrafts, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .findByDraftPublished(groupId, language, statusDrafts,
			start, end, orderByComparator);
	}

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
	public static List<VLegalDraftDocument> findByDraftPublished(long groupId,
		java.lang.String language, int[] statusDrafts, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDraftPublished(groupId, language, statusDrafts,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	*/
	public static void removeByDraftPublished(long groupId,
		java.lang.String language, int statusDraft) {
		getPersistence().removeByDraftPublished(groupId, language, statusDraft);
	}

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDraft the status draft
	* @return the number of matching v legal draft documents
	*/
	public static int countByDraftPublished(long groupId,
		java.lang.String language, int statusDraft) {
		return getPersistence()
				   .countByDraftPublished(groupId, language, statusDraft);
	}

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and language = &#63; and statusDraft = any &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDrafts the status drafts
	* @return the number of matching v legal draft documents
	*/
	public static int countByDraftPublished(long groupId,
		java.lang.String language, int[] statusDrafts) {
		return getPersistence()
				   .countByDraftPublished(groupId, language, statusDrafts);
	}

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
	public static List<VLegalDraftDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId) {
		return getPersistence()
				   .findByG_L_F_S_D(groupId, language, fieldId, statusDraft,
			draftId);
	}

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
	public static List<VLegalDraftDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId, int start, int end) {
		return getPersistence()
				   .findByG_L_F_S_D(groupId, language, fieldId, statusDraft,
			draftId, start, end);
	}

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
	public static List<VLegalDraftDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_F_S_D(groupId, language, fieldId, statusDraft,
			draftId, start, end, orderByComparator);
	}

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
	public static List<VLegalDraftDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_F_S_D(groupId, language, fieldId, statusDraft,
			draftId, start, end, orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDraftDocument findByG_L_F_S_D_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByG_L_F_S_D_First(groupId, language, fieldId,
			statusDraft, draftId, orderByComparator);
	}

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
	public static VLegalDraftDocument fetchByG_L_F_S_D_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_F_S_D_First(groupId, language, fieldId,
			statusDraft, draftId, orderByComparator);
	}

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
	public static VLegalDraftDocument findByG_L_F_S_D_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByG_L_F_S_D_Last(groupId, language, fieldId,
			statusDraft, draftId, orderByComparator);
	}

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
	public static VLegalDraftDocument fetchByG_L_F_S_D_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_F_S_D_Last(groupId, language, fieldId,
			statusDraft, draftId, orderByComparator);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDraft = &#63; and draftId &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	*/
	public static void removeByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId) {
		getPersistence()
			.removeByG_L_F_S_D(groupId, language, fieldId, statusDraft, draftId);
	}

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
	public static int countByG_L_F_S_D(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDraft, java.lang.String draftId) {
		return getPersistence()
				   .countByG_L_F_S_D(groupId, language, fieldId, statusDraft,
			draftId);
	}

	/**
	* Returns all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	* @return the matching v legal draft documents
	*/
	public static List<VLegalDraftDocument> findByP_S_T(long groupId,
		int statusDraft, java.lang.String typeId) {
		return getPersistence().findByP_S_T(groupId, statusDraft, typeId);
	}

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
	public static List<VLegalDraftDocument> findByP_S_T(long groupId,
		int statusDraft, java.lang.String typeId, int start, int end) {
		return getPersistence()
				   .findByP_S_T(groupId, statusDraft, typeId, start, end);
	}

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
	public static List<VLegalDraftDocument> findByP_S_T(long groupId,
		int statusDraft, java.lang.String typeId, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .findByP_S_T(groupId, statusDraft, typeId, start, end,
			orderByComparator);
	}

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
	public static List<VLegalDraftDocument> findByP_S_T(long groupId,
		int statusDraft, java.lang.String typeId, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_S_T(groupId, statusDraft, typeId, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDraftDocument findByP_S_T_First(long groupId,
		int statusDraft, java.lang.String typeId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_T_First(groupId, statusDraft, typeId,
			orderByComparator);
	}

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByP_S_T_First(long groupId,
		int statusDraft, java.lang.String typeId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_S_T_First(groupId, statusDraft, typeId,
			orderByComparator);
	}

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
	public static VLegalDraftDocument findByP_S_T_Last(long groupId,
		int statusDraft, java.lang.String typeId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_T_Last(groupId, statusDraft, typeId,
			orderByComparator);
	}

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByP_S_T_Last(long groupId,
		int statusDraft, java.lang.String typeId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_S_T_Last(groupId, statusDraft, typeId,
			orderByComparator);
	}

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
	public static VLegalDraftDocument[] findByP_S_T_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String typeId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_T_PrevAndNext(draftId, groupId, statusDraft,
			typeId, orderByComparator);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	*/
	public static void removeByP_S_T(long groupId, int statusDraft,
		java.lang.String typeId) {
		getPersistence().removeByP_S_T(groupId, statusDraft, typeId);
	}

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and statusDraft = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param typeId the type ID
	* @return the number of matching v legal draft documents
	*/
	public static int countByP_S_T(long groupId, int statusDraft,
		java.lang.String typeId) {
		return getPersistence().countByP_S_T(groupId, statusDraft, typeId);
	}

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
	public static List<VLegalDraftDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId) {
		return getPersistence()
				   .findByG_L_T_S_D(groupId, language, typeId, statusDraft,
			draftId);
	}

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
	public static List<VLegalDraftDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId, int start, int end) {
		return getPersistence()
				   .findByG_L_T_S_D(groupId, language, typeId, statusDraft,
			draftId, start, end);
	}

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
	public static List<VLegalDraftDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_T_S_D(groupId, language, typeId, statusDraft,
			draftId, start, end, orderByComparator);
	}

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
	public static List<VLegalDraftDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_T_S_D(groupId, language, typeId, statusDraft,
			draftId, start, end, orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDraftDocument findByG_L_T_S_D_First(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByG_L_T_S_D_First(groupId, language, typeId,
			statusDraft, draftId, orderByComparator);
	}

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
	public static VLegalDraftDocument fetchByG_L_T_S_D_First(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_T_S_D_First(groupId, language, typeId,
			statusDraft, draftId, orderByComparator);
	}

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
	public static VLegalDraftDocument findByG_L_T_S_D_Last(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByG_L_T_S_D_Last(groupId, language, typeId,
			statusDraft, draftId, orderByComparator);
	}

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
	public static VLegalDraftDocument fetchByG_L_T_S_D_Last(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_T_S_D_Last(groupId, language, typeId,
			statusDraft, draftId, orderByComparator);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; and language = &#63; and typeId = &#63; and statusDraft = &#63; and draftId &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeId the type ID
	* @param statusDraft the status draft
	* @param draftId the draft ID
	*/
	public static void removeByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId) {
		getPersistence()
			.removeByG_L_T_S_D(groupId, language, typeId, statusDraft, draftId);
	}

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
	public static int countByG_L_T_S_D(long groupId, java.lang.String language,
		java.lang.String typeId, int statusDraft, java.lang.String draftId) {
		return getPersistence()
				   .countByG_L_T_S_D(groupId, language, typeId, statusDraft,
			draftId);
	}

	/**
	* Returns all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	* @return the matching v legal draft documents
	*/
	public static List<VLegalDraftDocument> findByP_S_L(long groupId,
		int statusDraft, java.lang.String language) {
		return getPersistence().findByP_S_L(groupId, statusDraft, language);
	}

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
	public static List<VLegalDraftDocument> findByP_S_L(long groupId,
		int statusDraft, java.lang.String language, int start, int end) {
		return getPersistence()
				   .findByP_S_L(groupId, statusDraft, language, start, end);
	}

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
	public static List<VLegalDraftDocument> findByP_S_L(long groupId,
		int statusDraft, java.lang.String language, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .findByP_S_L(groupId, statusDraft, language, start, end,
			orderByComparator);
	}

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
	public static List<VLegalDraftDocument> findByP_S_L(long groupId,
		int statusDraft, java.lang.String language, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_S_L(groupId, statusDraft, language, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDraftDocument findByP_S_L_First(long groupId,
		int statusDraft, java.lang.String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_L_First(groupId, statusDraft, language,
			orderByComparator);
	}

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByP_S_L_First(long groupId,
		int statusDraft, java.lang.String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_S_L_First(groupId, statusDraft, language,
			orderByComparator);
	}

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
	public static VLegalDraftDocument findByP_S_L_Last(long groupId,
		int statusDraft, java.lang.String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_L_Last(groupId, statusDraft, language,
			orderByComparator);
	}

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByP_S_L_Last(long groupId,
		int statusDraft, java.lang.String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_S_L_Last(groupId, statusDraft, language,
			orderByComparator);
	}

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
	public static VLegalDraftDocument[] findByP_S_L_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		java.lang.String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_L_PrevAndNext(draftId, groupId, statusDraft,
			language, orderByComparator);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	*/
	public static void removeByP_S_L(long groupId, int statusDraft,
		java.lang.String language) {
		getPersistence().removeByP_S_L(groupId, statusDraft, language);
	}

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and statusDraft = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param language the language
	* @return the number of matching v legal draft documents
	*/
	public static int countByP_S_L(long groupId, int statusDraft,
		java.lang.String language) {
		return getPersistence().countByP_S_L(groupId, statusDraft, language);
	}

	/**
	* Returns all the v legal draft documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching v legal draft documents
	*/
	public static List<VLegalDraftDocument> findByP_L(long groupId,
		java.lang.String language) {
		return getPersistence().findByP_L(groupId, language);
	}

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
	public static List<VLegalDraftDocument> findByP_L(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByP_L(groupId, language, start, end);
	}

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
	public static List<VLegalDraftDocument> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .findByP_L(groupId, language, start, end, orderByComparator);
	}

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
	public static List<VLegalDraftDocument> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument findByP_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByP_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument findByP_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last v legal draft document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByP_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_Last(groupId, language, orderByComparator);
	}

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
	public static VLegalDraftDocument[] findByP_L_PrevAndNext(
		java.lang.String draftId, long groupId, java.lang.String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_L_PrevAndNext(draftId, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByP_L(long groupId, java.lang.String language) {
		getPersistence().removeByP_L(groupId, language);
	}

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching v legal draft documents
	*/
	public static int countByP_L(long groupId, java.lang.String language) {
		return getPersistence().countByP_L(groupId, language);
	}

	/**
	* Returns all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param createdByUser the created by user
	* @param language the language
	* @return the matching v legal draft documents
	*/
	public static List<VLegalDraftDocument> findByP_S_U_L(long groupId,
		int statusDraft, long createdByUser, java.lang.String language) {
		return getPersistence()
				   .findByP_S_U_L(groupId, statusDraft, createdByUser, language);
	}

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
	public static List<VLegalDraftDocument> findByP_S_U_L(long groupId,
		int statusDraft, long createdByUser, java.lang.String language,
		int start, int end) {
		return getPersistence()
				   .findByP_S_U_L(groupId, statusDraft, createdByUser,
			language, start, end);
	}

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
	public static List<VLegalDraftDocument> findByP_S_U_L(long groupId,
		int statusDraft, long createdByUser, java.lang.String language,
		int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .findByP_S_U_L(groupId, statusDraft, createdByUser,
			language, start, end, orderByComparator);
	}

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
	public static List<VLegalDraftDocument> findByP_S_U_L(long groupId,
		int statusDraft, long createdByUser, java.lang.String language,
		int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_S_U_L(groupId, statusDraft, createdByUser,
			language, start, end, orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDraftDocument findByP_S_U_L_First(long groupId,
		int statusDraft, long createdByUser, java.lang.String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_U_L_First(groupId, statusDraft, createdByUser,
			language, orderByComparator);
	}

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
	public static VLegalDraftDocument fetchByP_S_U_L_First(long groupId,
		int statusDraft, long createdByUser, java.lang.String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_S_U_L_First(groupId, statusDraft, createdByUser,
			language, orderByComparator);
	}

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
	public static VLegalDraftDocument findByP_S_U_L_Last(long groupId,
		int statusDraft, long createdByUser, java.lang.String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_U_L_Last(groupId, statusDraft, createdByUser,
			language, orderByComparator);
	}

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
	public static VLegalDraftDocument fetchByP_S_U_L_Last(long groupId,
		int statusDraft, long createdByUser, java.lang.String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_S_U_L_Last(groupId, statusDraft, createdByUser,
			language, orderByComparator);
	}

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
	public static VLegalDraftDocument[] findByP_S_U_L_PrevAndNext(
		java.lang.String draftId, long groupId, int statusDraft,
		long createdByUser, java.lang.String language,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByP_S_U_L_PrevAndNext(draftId, groupId, statusDraft,
			createdByUser, language, orderByComparator);
	}

	/**
	* Removes all the v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param createdByUser the created by user
	* @param language the language
	*/
	public static void removeByP_S_U_L(long groupId, int statusDraft,
		long createdByUser, java.lang.String language) {
		getPersistence()
			.removeByP_S_U_L(groupId, statusDraft, createdByUser, language);
	}

	/**
	* Returns the number of v legal draft documents where groupId = &#63; and statusDraft = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusDraft the status draft
	* @param createdByUser the created by user
	* @param language the language
	* @return the number of matching v legal draft documents
	*/
	public static int countByP_S_U_L(long groupId, int statusDraft,
		long createdByUser, java.lang.String language) {
		return getPersistence()
				   .countByP_S_U_L(groupId, statusDraft, createdByUser, language);
	}

	/**
	* Returns all the v legal draft documents where docCode = &#63;.
	*
	* @param docCode the doc code
	* @return the matching v legal draft documents
	*/
	public static List<VLegalDraftDocument> findByDocCode(
		java.lang.String docCode) {
		return getPersistence().findByDocCode(docCode);
	}

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
	public static List<VLegalDraftDocument> findByDocCode(
		java.lang.String docCode, int start, int end) {
		return getPersistence().findByDocCode(docCode, start, end);
	}

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
	public static List<VLegalDraftDocument> findByDocCode(
		java.lang.String docCode, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence()
				   .findByDocCode(docCode, start, end, orderByComparator);
	}

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
	public static List<VLegalDraftDocument> findByDocCode(
		java.lang.String docCode, int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDocCode(docCode, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal draft document in the ordered set where docCode = &#63;.
	*
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument findByDocCode_First(
		java.lang.String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence().findByDocCode_First(docCode, orderByComparator);
	}

	/**
	* Returns the first v legal draft document in the ordered set where docCode = &#63;.
	*
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByDocCode_First(
		java.lang.String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence().fetchByDocCode_First(docCode, orderByComparator);
	}

	/**
	* Returns the last v legal draft document in the ordered set where docCode = &#63;.
	*
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument findByDocCode_Last(
		java.lang.String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence().findByDocCode_Last(docCode, orderByComparator);
	}

	/**
	* Returns the last v legal draft document in the ordered set where docCode = &#63;.
	*
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal draft document, or <code>null</code> if a matching v legal draft document could not be found
	*/
	public static VLegalDraftDocument fetchByDocCode_Last(
		java.lang.String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence().fetchByDocCode_Last(docCode, orderByComparator);
	}

	/**
	* Returns the v legal draft documents before and after the current v legal draft document in the ordered set where docCode = &#63;.
	*
	* @param draftId the primary key of the current v legal draft document
	* @param docCode the doc code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	*/
	public static VLegalDraftDocument[] findByDocCode_PrevAndNext(
		java.lang.String draftId, java.lang.String docCode,
		OrderByComparator<VLegalDraftDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence()
				   .findByDocCode_PrevAndNext(draftId, docCode,
			orderByComparator);
	}

	/**
	* Removes all the v legal draft documents where docCode = &#63; from the database.
	*
	* @param docCode the doc code
	*/
	public static void removeByDocCode(java.lang.String docCode) {
		getPersistence().removeByDocCode(docCode);
	}

	/**
	* Returns the number of v legal draft documents where docCode = &#63;.
	*
	* @param docCode the doc code
	* @return the number of matching v legal draft documents
	*/
	public static int countByDocCode(java.lang.String docCode) {
		return getPersistence().countByDocCode(docCode);
	}

	/**
	* Caches the v legal draft document in the entity cache if it is enabled.
	*
	* @param vLegalDraftDocument the v legal draft document
	*/
	public static void cacheResult(VLegalDraftDocument vLegalDraftDocument) {
		getPersistence().cacheResult(vLegalDraftDocument);
	}

	/**
	* Caches the v legal draft documents in the entity cache if it is enabled.
	*
	* @param vLegalDraftDocuments the v legal draft documents
	*/
	public static void cacheResult(
		List<VLegalDraftDocument> vLegalDraftDocuments) {
		getPersistence().cacheResult(vLegalDraftDocuments);
	}

	/**
	* Creates a new v legal draft document with the primary key. Does not add the v legal draft document to the database.
	*
	* @param draftId the primary key for the new v legal draft document
	* @return the new v legal draft document
	*/
	public static VLegalDraftDocument create(java.lang.String draftId) {
		return getPersistence().create(draftId);
	}

	/**
	* Removes the v legal draft document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param draftId the primary key of the v legal draft document
	* @return the v legal draft document that was removed
	* @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	*/
	public static VLegalDraftDocument remove(java.lang.String draftId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence().remove(draftId);
	}

	public static VLegalDraftDocument updateImpl(
		VLegalDraftDocument vLegalDraftDocument) {
		return getPersistence().updateImpl(vLegalDraftDocument);
	}

	/**
	* Returns the v legal draft document with the primary key or throws a {@link NoSuchVLegalDraftDocumentException} if it could not be found.
	*
	* @param draftId the primary key of the v legal draft document
	* @return the v legal draft document
	* @throws NoSuchVLegalDraftDocumentException if a v legal draft document with the primary key could not be found
	*/
	public static VLegalDraftDocument findByPrimaryKey(java.lang.String draftId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDraftDocumentException {
		return getPersistence().findByPrimaryKey(draftId);
	}

	/**
	* Returns the v legal draft document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param draftId the primary key of the v legal draft document
	* @return the v legal draft document, or <code>null</code> if a v legal draft document with the primary key could not be found
	*/
	public static VLegalDraftDocument fetchByPrimaryKey(
		java.lang.String draftId) {
		return getPersistence().fetchByPrimaryKey(draftId);
	}

	public static java.util.Map<java.io.Serializable, VLegalDraftDocument> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal draft documents.
	*
	* @return the v legal draft documents
	*/
	public static List<VLegalDraftDocument> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<VLegalDraftDocument> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<VLegalDraftDocument> findAll(int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<VLegalDraftDocument> findAll(int start, int end,
		OrderByComparator<VLegalDraftDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal draft documents from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal draft documents.
	*
	* @return the number of v legal draft documents
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalDraftDocumentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalDraftDocumentPersistence, VLegalDraftDocumentPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalDraftDocumentPersistence.class);
}