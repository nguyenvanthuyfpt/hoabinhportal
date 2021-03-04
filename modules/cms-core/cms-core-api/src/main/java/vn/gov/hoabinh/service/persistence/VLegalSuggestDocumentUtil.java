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

import vn.gov.hoabinh.model.VLegalSuggestDocument;

import java.util.List;

/**
 * The persistence utility for the v legal suggest document service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalSuggestDocumentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSuggestDocumentPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalSuggestDocumentPersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalSuggestDocumentUtil {
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
	public static void clearCache(VLegalSuggestDocument vLegalSuggestDocument) {
		getPersistence().clearCache(vLegalSuggestDocument);
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
	public static List<VLegalSuggestDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalSuggestDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalSuggestDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalSuggestDocument update(
		VLegalSuggestDocument vLegalSuggestDocument) {
		return getPersistence().update(vLegalSuggestDocument);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalSuggestDocument update(
		VLegalSuggestDocument vLegalSuggestDocument,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalSuggestDocument, serviceContext);
	}

	/**
	* Returns all the v legal suggest documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal suggest documents
	*/
	public static List<VLegalSuggestDocument> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static List<VLegalSuggestDocument> findByGroupId(long groupId,
		int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static List<VLegalSuggestDocument> findByGroupId(long groupId,
		int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

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
	public static List<VLegalSuggestDocument> findByGroupId(long groupId,
		int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument findByGroupId_First(long groupId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument findByGroupId_Last(long groupId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where groupId = &#63;.
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	*/
	public static VLegalSuggestDocument[] findByGroupId_PrevAndNext(
		java.lang.String sugId, long groupId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(sugId, groupId, orderByComparator);
	}

	/**
	* Removes all the v legal suggest documents where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of v legal suggest documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal suggest documents
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the v legal suggest documents where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @return the matching v legal suggest documents
	*/
	public static List<VLegalSuggestDocument> findByP_A(long groupId,
		boolean approved) {
		return getPersistence().findByP_A(groupId, approved);
	}

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
	public static List<VLegalSuggestDocument> findByP_A(long groupId,
		boolean approved, int start, int end) {
		return getPersistence().findByP_A(groupId, approved, start, end);
	}

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
	public static List<VLegalSuggestDocument> findByP_A(long groupId,
		boolean approved, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .findByP_A(groupId, approved, start, end, orderByComparator);
	}

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
	public static List<VLegalSuggestDocument> findByP_A(long groupId,
		boolean approved, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_A(groupId, approved, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument findByP_A_First(long groupId,
		boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_A_First(groupId, approved, orderByComparator);
	}

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument fetchByP_A_First(long groupId,
		boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_A_First(groupId, approved, orderByComparator);
	}

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument findByP_A_Last(long groupId,
		boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_A_Last(groupId, approved, orderByComparator);
	}

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument fetchByP_A_Last(long groupId,
		boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_A_Last(groupId, approved, orderByComparator);
	}

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
	public static VLegalSuggestDocument[] findByP_A_PrevAndNext(
		java.lang.String sugId, long groupId, boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_A_PrevAndNext(sugId, groupId, approved,
			orderByComparator);
	}

	/**
	* Removes all the v legal suggest documents where groupId = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group ID
	* @param approved the approved
	*/
	public static void removeByP_A(long groupId, boolean approved) {
		getPersistence().removeByP_A(groupId, approved);
	}

	/**
	* Returns the number of v legal suggest documents where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @return the number of matching v legal suggest documents
	*/
	public static int countByP_A(long groupId, boolean approved) {
		return getPersistence().countByP_A(groupId, approved);
	}

	/**
	* Returns the v legal suggest document where groupId = &#63; and sugId = &#63; or throws a {@link NoSuchVLegalSuggestDocumentException} if it could not be found.
	*
	* @param groupId the group ID
	* @param sugId the sug ID
	* @return the matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument findByG_S(long groupId,
		java.lang.String sugId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence().findByG_S(groupId, sugId);
	}

	/**
	* Returns the v legal suggest document where groupId = &#63; and sugId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param sugId the sug ID
	* @return the matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument fetchByG_S(long groupId,
		java.lang.String sugId) {
		return getPersistence().fetchByG_S(groupId, sugId);
	}

	/**
	* Returns the v legal suggest document where groupId = &#63; and sugId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param sugId the sug ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument fetchByG_S(long groupId,
		java.lang.String sugId, boolean retrieveFromCache) {
		return getPersistence().fetchByG_S(groupId, sugId, retrieveFromCache);
	}

	/**
	* Removes the v legal suggest document where groupId = &#63; and sugId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param sugId the sug ID
	* @return the v legal suggest document that was removed
	*/
	public static VLegalSuggestDocument removeByG_S(long groupId,
		java.lang.String sugId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence().removeByG_S(groupId, sugId);
	}

	/**
	* Returns the number of v legal suggest documents where groupId = &#63; and sugId = &#63;.
	*
	* @param groupId the group ID
	* @param sugId the sug ID
	* @return the number of matching v legal suggest documents
	*/
	public static int countByG_S(long groupId, java.lang.String sugId) {
		return getPersistence().countByG_S(groupId, sugId);
	}

	/**
	* Returns all the v legal suggest documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching v legal suggest documents
	*/
	public static List<VLegalSuggestDocument> findByP_L(long groupId,
		java.lang.String language) {
		return getPersistence().findByP_L(groupId, language);
	}

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
	public static List<VLegalSuggestDocument> findByP_L(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByP_L(groupId, language, start, end);
	}

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
	public static List<VLegalSuggestDocument> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .findByP_L(groupId, language, start, end, orderByComparator);
	}

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
	public static List<VLegalSuggestDocument> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument findByP_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument fetchByP_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument findByP_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument fetchByP_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_Last(groupId, language, orderByComparator);
	}

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
	public static VLegalSuggestDocument[] findByP_L_PrevAndNext(
		java.lang.String sugId, long groupId, java.lang.String language,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_PrevAndNext(sugId, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the v legal suggest documents where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByP_L(long groupId, java.lang.String language) {
		getPersistence().removeByP_L(groupId, language);
	}

	/**
	* Returns the number of v legal suggest documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching v legal suggest documents
	*/
	public static int countByP_L(long groupId, java.lang.String language) {
		return getPersistence().countByP_L(groupId, language);
	}

	/**
	* Returns all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the matching v legal suggest documents
	*/
	public static List<VLegalSuggestDocument> findByP_L_A(long groupId,
		java.lang.String language, boolean approved) {
		return getPersistence().findByP_L_A(groupId, language, approved);
	}

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
	public static List<VLegalSuggestDocument> findByP_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end) {
		return getPersistence()
				   .findByP_L_A(groupId, language, approved, start, end);
	}

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
	public static List<VLegalSuggestDocument> findByP_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .findByP_L_A(groupId, language, approved, start, end,
			orderByComparator);
	}

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
	public static List<VLegalSuggestDocument> findByP_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_L_A(groupId, language, approved, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static VLegalSuggestDocument findByP_L_A_First(long groupId,
		java.lang.String language, boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_A_First(groupId, language, approved,
			orderByComparator);
	}

	/**
	* Returns the first v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument fetchByP_L_A_First(long groupId,
		java.lang.String language, boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_A_First(groupId, language, approved,
			orderByComparator);
	}

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
	public static VLegalSuggestDocument findByP_L_A_Last(long groupId,
		java.lang.String language, boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_A_Last(groupId, language, approved,
			orderByComparator);
	}

	/**
	* Returns the last v legal suggest document in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument fetchByP_L_A_Last(long groupId,
		java.lang.String language, boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_A_Last(groupId, language, approved,
			orderByComparator);
	}

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
	public static VLegalSuggestDocument[] findByP_L_A_PrevAndNext(
		java.lang.String sugId, long groupId, java.lang.String language,
		boolean approved,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_A_PrevAndNext(sugId, groupId, language, approved,
			orderByComparator);
	}

	/**
	* Removes all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	*/
	public static void removeByP_L_A(long groupId, java.lang.String language,
		boolean approved) {
		getPersistence().removeByP_L_A(groupId, language, approved);
	}

	/**
	* Returns the number of v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the number of matching v legal suggest documents
	*/
	public static int countByP_L_A(long groupId, java.lang.String language,
		boolean approved) {
		return getPersistence().countByP_L_A(groupId, language, approved);
	}

	/**
	* Returns all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param draftId the draft ID
	* @return the matching v legal suggest documents
	*/
	public static List<VLegalSuggestDocument> findByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId) {
		return getPersistence()
				   .findByP_L_A_D(groupId, language, approved, draftId);
	}

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
	public static List<VLegalSuggestDocument> findByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		int start, int end) {
		return getPersistence()
				   .findByP_L_A_D(groupId, language, approved, draftId, start,
			end);
	}

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
	public static List<VLegalSuggestDocument> findByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .findByP_L_A_D(groupId, language, approved, draftId, start,
			end, orderByComparator);
	}

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
	public static List<VLegalSuggestDocument> findByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_L_A_D(groupId, language, approved, draftId, start,
			end, orderByComparator, retrieveFromCache);
	}

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
	public static VLegalSuggestDocument findByP_L_A_D_First(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_A_D_First(groupId, language, approved, draftId,
			orderByComparator);
	}

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
	public static VLegalSuggestDocument fetchByP_L_A_D_First(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_A_D_First(groupId, language, approved, draftId,
			orderByComparator);
	}

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
	public static VLegalSuggestDocument findByP_L_A_D_Last(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_A_D_Last(groupId, language, approved, draftId,
			orderByComparator);
	}

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
	public static VLegalSuggestDocument fetchByP_L_A_D_Last(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_A_D_Last(groupId, language, approved, draftId,
			orderByComparator);
	}

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
	public static VLegalSuggestDocument[] findByP_L_A_D_PrevAndNext(
		java.lang.String sugId, long groupId, java.lang.String language,
		boolean approved, java.lang.String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByP_L_A_D_PrevAndNext(sugId, groupId, language,
			approved, draftId, orderByComparator);
	}

	/**
	* Removes all the v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param draftId the draft ID
	*/
	public static void removeByP_L_A_D(long groupId, java.lang.String language,
		boolean approved, java.lang.String draftId) {
		getPersistence().removeByP_L_A_D(groupId, language, approved, draftId);
	}

	/**
	* Returns the number of v legal suggest documents where groupId = &#63; and language = &#63; and approved = &#63; and draftId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param draftId the draft ID
	* @return the number of matching v legal suggest documents
	*/
	public static int countByP_L_A_D(long groupId, java.lang.String language,
		boolean approved, java.lang.String draftId) {
		return getPersistence()
				   .countByP_L_A_D(groupId, language, approved, draftId);
	}

	/**
	* Returns all the v legal suggest documents where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved
	* @param draftId the draft ID
	* @return the matching v legal suggest documents
	*/
	public static List<VLegalSuggestDocument> findByA_D(boolean approved,
		java.lang.String draftId) {
		return getPersistence().findByA_D(approved, draftId);
	}

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
	public static List<VLegalSuggestDocument> findByA_D(boolean approved,
		java.lang.String draftId, int start, int end) {
		return getPersistence().findByA_D(approved, draftId, start, end);
	}

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
	public static List<VLegalSuggestDocument> findByA_D(boolean approved,
		java.lang.String draftId, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .findByA_D(approved, draftId, start, end, orderByComparator);
	}

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
	public static List<VLegalSuggestDocument> findByA_D(boolean approved,
		java.lang.String draftId, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByA_D(approved, draftId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument findByA_D_First(boolean approved,
		java.lang.String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByA_D_First(approved, draftId, orderByComparator);
	}

	/**
	* Returns the first v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument fetchByA_D_First(boolean approved,
		java.lang.String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .fetchByA_D_First(approved, draftId, orderByComparator);
	}

	/**
	* Returns the last v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument findByA_D_Last(boolean approved,
		java.lang.String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByA_D_Last(approved, draftId, orderByComparator);
	}

	/**
	* Returns the last v legal suggest document in the ordered set where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument fetchByA_D_Last(boolean approved,
		java.lang.String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .fetchByA_D_Last(approved, draftId, orderByComparator);
	}

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
	public static VLegalSuggestDocument[] findByA_D_PrevAndNext(
		java.lang.String sugId, boolean approved, java.lang.String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findByA_D_PrevAndNext(sugId, approved, draftId,
			orderByComparator);
	}

	/**
	* Removes all the v legal suggest documents where approved = &#63; and draftId = &#63; from the database.
	*
	* @param approved the approved
	* @param draftId the draft ID
	*/
	public static void removeByA_D(boolean approved, java.lang.String draftId) {
		getPersistence().removeByA_D(approved, draftId);
	}

	/**
	* Returns the number of v legal suggest documents where approved = &#63; and draftId = &#63;.
	*
	* @param approved the approved
	* @param draftId the draft ID
	* @return the number of matching v legal suggest documents
	*/
	public static int countByA_D(boolean approved, java.lang.String draftId) {
		return getPersistence().countByA_D(approved, draftId);
	}

	/**
	* Returns all the v legal suggest documents where draftId = &#63;.
	*
	* @param draftId the draft ID
	* @return the matching v legal suggest documents
	*/
	public static List<VLegalSuggestDocument> findBySuggByDraftId(
		java.lang.String draftId) {
		return getPersistence().findBySuggByDraftId(draftId);
	}

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
	public static List<VLegalSuggestDocument> findBySuggByDraftId(
		java.lang.String draftId, int start, int end) {
		return getPersistence().findBySuggByDraftId(draftId, start, end);
	}

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
	public static List<VLegalSuggestDocument> findBySuggByDraftId(
		java.lang.String draftId, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .findBySuggByDraftId(draftId, start, end, orderByComparator);
	}

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
	public static List<VLegalSuggestDocument> findBySuggByDraftId(
		java.lang.String draftId, int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySuggByDraftId(draftId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal suggest document in the ordered set where draftId = &#63;.
	*
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument findBySuggByDraftId_First(
		java.lang.String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findBySuggByDraftId_First(draftId, orderByComparator);
	}

	/**
	* Returns the first v legal suggest document in the ordered set where draftId = &#63;.
	*
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument fetchBySuggByDraftId_First(
		java.lang.String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .fetchBySuggByDraftId_First(draftId, orderByComparator);
	}

	/**
	* Returns the last v legal suggest document in the ordered set where draftId = &#63;.
	*
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument findBySuggByDraftId_Last(
		java.lang.String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findBySuggByDraftId_Last(draftId, orderByComparator);
	}

	/**
	* Returns the last v legal suggest document in the ordered set where draftId = &#63;.
	*
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal suggest document, or <code>null</code> if a matching v legal suggest document could not be found
	*/
	public static VLegalSuggestDocument fetchBySuggByDraftId_Last(
		java.lang.String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence()
				   .fetchBySuggByDraftId_Last(draftId, orderByComparator);
	}

	/**
	* Returns the v legal suggest documents before and after the current v legal suggest document in the ordered set where draftId = &#63;.
	*
	* @param sugId the primary key of the current v legal suggest document
	* @param draftId the draft ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	*/
	public static VLegalSuggestDocument[] findBySuggByDraftId_PrevAndNext(
		java.lang.String sugId, java.lang.String draftId,
		OrderByComparator<VLegalSuggestDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence()
				   .findBySuggByDraftId_PrevAndNext(sugId, draftId,
			orderByComparator);
	}

	/**
	* Removes all the v legal suggest documents where draftId = &#63; from the database.
	*
	* @param draftId the draft ID
	*/
	public static void removeBySuggByDraftId(java.lang.String draftId) {
		getPersistence().removeBySuggByDraftId(draftId);
	}

	/**
	* Returns the number of v legal suggest documents where draftId = &#63;.
	*
	* @param draftId the draft ID
	* @return the number of matching v legal suggest documents
	*/
	public static int countBySuggByDraftId(java.lang.String draftId) {
		return getPersistence().countBySuggByDraftId(draftId);
	}

	/**
	* Caches the v legal suggest document in the entity cache if it is enabled.
	*
	* @param vLegalSuggestDocument the v legal suggest document
	*/
	public static void cacheResult(VLegalSuggestDocument vLegalSuggestDocument) {
		getPersistence().cacheResult(vLegalSuggestDocument);
	}

	/**
	* Caches the v legal suggest documents in the entity cache if it is enabled.
	*
	* @param vLegalSuggestDocuments the v legal suggest documents
	*/
	public static void cacheResult(
		List<VLegalSuggestDocument> vLegalSuggestDocuments) {
		getPersistence().cacheResult(vLegalSuggestDocuments);
	}

	/**
	* Creates a new v legal suggest document with the primary key. Does not add the v legal suggest document to the database.
	*
	* @param sugId the primary key for the new v legal suggest document
	* @return the new v legal suggest document
	*/
	public static VLegalSuggestDocument create(java.lang.String sugId) {
		return getPersistence().create(sugId);
	}

	/**
	* Removes the v legal suggest document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sugId the primary key of the v legal suggest document
	* @return the v legal suggest document that was removed
	* @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	*/
	public static VLegalSuggestDocument remove(java.lang.String sugId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence().remove(sugId);
	}

	public static VLegalSuggestDocument updateImpl(
		VLegalSuggestDocument vLegalSuggestDocument) {
		return getPersistence().updateImpl(vLegalSuggestDocument);
	}

	/**
	* Returns the v legal suggest document with the primary key or throws a {@link NoSuchVLegalSuggestDocumentException} if it could not be found.
	*
	* @param sugId the primary key of the v legal suggest document
	* @return the v legal suggest document
	* @throws NoSuchVLegalSuggestDocumentException if a v legal suggest document with the primary key could not be found
	*/
	public static VLegalSuggestDocument findByPrimaryKey(java.lang.String sugId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalSuggestDocumentException {
		return getPersistence().findByPrimaryKey(sugId);
	}

	/**
	* Returns the v legal suggest document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sugId the primary key of the v legal suggest document
	* @return the v legal suggest document, or <code>null</code> if a v legal suggest document with the primary key could not be found
	*/
	public static VLegalSuggestDocument fetchByPrimaryKey(
		java.lang.String sugId) {
		return getPersistence().fetchByPrimaryKey(sugId);
	}

	public static java.util.Map<java.io.Serializable, VLegalSuggestDocument> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal suggest documents.
	*
	* @return the v legal suggest documents
	*/
	public static List<VLegalSuggestDocument> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<VLegalSuggestDocument> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<VLegalSuggestDocument> findAll(int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<VLegalSuggestDocument> findAll(int start, int end,
		OrderByComparator<VLegalSuggestDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal suggest documents from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal suggest documents.
	*
	* @return the number of v legal suggest documents
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalSuggestDocumentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalSuggestDocumentPersistence, VLegalSuggestDocumentPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalSuggestDocumentPersistence.class);
}