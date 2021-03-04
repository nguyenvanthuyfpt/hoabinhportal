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

import vn.gov.hoabinh.model.VLegalDocument;

import java.util.List;

/**
 * The persistence utility for the v legal document service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalDocumentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDocumentPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalDocumentPersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalDocumentUtil {
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
	public static void clearCache(VLegalDocument vLegalDocument) {
		getPersistence().clearCache(vLegalDocument);
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
	public static List<VLegalDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalDocument update(VLegalDocument vLegalDocument) {
		return getPersistence().update(vLegalDocument);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalDocument update(VLegalDocument vLegalDocument,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalDocument, serviceContext);
	}

	/**
	* Returns all the v legal documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal documents
	*/
	public static List<VLegalDocument> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static List<VLegalDocument> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static List<VLegalDocument> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

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
	public static List<VLegalDocument> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public static VLegalDocument findByGroupId_First(long groupId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public static VLegalDocument findByGroupId_Last(long groupId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where groupId = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public static VLegalDocument[] findByGroupId_PrevAndNext(
		java.lang.String docId, long groupId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(docId, groupId, orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of v legal documents where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal documents
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching v legal documents
	*/
	public static List<VLegalDocument> findByG_L(long groupId,
		java.lang.String language) {
		return getPersistence().findByG_L(groupId, language);
	}

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
	public static List<VLegalDocument> findByG_L(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByG_L(groupId, language, start, end);
	}

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
	public static List<VLegalDocument> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator);
	}

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
	public static List<VLegalDocument> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public static VLegalDocument findByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public static VLegalDocument findByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_Last(groupId, language, orderByComparator);
	}

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
	public static VLegalDocument[] findByG_L_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_PrevAndNext(docId, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByG_L(long groupId, java.lang.String language) {
		getPersistence().removeByG_L(groupId, language);
	}

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching v legal documents
	*/
	public static int countByG_L(long groupId, java.lang.String language) {
		return getPersistence().countByG_L(groupId, language);
	}

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
	public static List<VLegalDocument> findByDocsByF_O_T_L_S(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc) {
		return getPersistence()
				   .findByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc);
	}

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
	public static List<VLegalDocument> findByDocsByF_O_T_L_S(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end) {
		return getPersistence()
				   .findByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc, start, end);
	}

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
	public static List<VLegalDocument> findByDocsByF_O_T_L_S(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end, OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc, start, end, orderByComparator);
	}

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
	public static List<VLegalDocument> findByDocsByF_O_T_L_S(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc, start, end, orderByComparator,
			retrieveFromCache);
	}

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
	public static VLegalDocument findByDocsByF_O_T_L_S_First(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByF_O_T_L_S_First(groupId, typeDocId, orgId,
			fieldId, language, statusDoc, orderByComparator);
	}

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
	public static VLegalDocument fetchByDocsByF_O_T_L_S_First(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByDocsByF_O_T_L_S_First(groupId, typeDocId, orgId,
			fieldId, language, statusDoc, orderByComparator);
	}

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
	public static VLegalDocument findByDocsByF_O_T_L_S_Last(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByF_O_T_L_S_Last(groupId, typeDocId, orgId,
			fieldId, language, statusDoc, orderByComparator);
	}

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
	public static VLegalDocument fetchByDocsByF_O_T_L_S_Last(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByDocsByF_O_T_L_S_Last(groupId, typeDocId, orgId,
			fieldId, language, statusDoc, orderByComparator);
	}

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
	public static VLegalDocument[] findByDocsByF_O_T_L_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByF_O_T_L_S_PrevAndNext(docId, groupId,
			typeDocId, orgId, fieldId, language, statusDoc, orderByComparator);
	}

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
	public static void removeByDocsByF_O_T_L_S(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc) {
		getPersistence()
			.removeByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc);
	}

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
	public static int countByDocsByF_O_T_L_S(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int statusDoc) {
		return getPersistence()
				   .countByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId,
			language, statusDoc);
	}

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
	public static List<VLegalDocument> findByDocsByG_O_T_L_S(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc) {
		return getPersistence()
				   .findByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc);
	}

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
	public static List<VLegalDocument> findByDocsByG_O_T_L_S(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc, int start, int end) {
		return getPersistence()
				   .findByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc, start, end);
	}

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
	public static List<VLegalDocument> findByDocsByG_O_T_L_S(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc, start, end, orderByComparator);
	}

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
	public static List<VLegalDocument> findByDocsByG_O_T_L_S(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc, start, end, orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDocument findByDocsByG_O_T_L_S_First(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByG_O_T_L_S_First(groupId, orgId, typeDocId,
			language, statusDoc, orderByComparator);
	}

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
	public static VLegalDocument fetchByDocsByG_O_T_L_S_First(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByDocsByG_O_T_L_S_First(groupId, orgId, typeDocId,
			language, statusDoc, orderByComparator);
	}

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
	public static VLegalDocument findByDocsByG_O_T_L_S_Last(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByG_O_T_L_S_Last(groupId, orgId, typeDocId,
			language, statusDoc, orderByComparator);
	}

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
	public static VLegalDocument fetchByDocsByG_O_T_L_S_Last(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByDocsByG_O_T_L_S_Last(groupId, orgId, typeDocId,
			language, statusDoc, orderByComparator);
	}

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
	public static VLegalDocument[] findByDocsByG_O_T_L_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String orgId,
		java.lang.String typeDocId, java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByG_O_T_L_S_PrevAndNext(docId, groupId, orgId,
			typeDocId, language, statusDoc, orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and orgId = &#63; and typeDocId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @param typeDocId the type doc ID
	* @param language the language
	* @param statusDoc the status doc
	*/
	public static void removeByDocsByG_O_T_L_S(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc) {
		getPersistence()
			.removeByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc);
	}

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
	public static int countByDocsByG_O_T_L_S(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int statusDoc) {
		return getPersistence()
				   .countByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language,
			statusDoc);
	}

	/**
	* Returns all the v legal documents where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc ID
	* @param language the language
	* @return the matching v legal documents
	*/
	public static List<VLegalDocument> findByDocsByT_L(
		java.lang.String typeDocId, java.lang.String language) {
		return getPersistence().findByDocsByT_L(typeDocId, language);
	}

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
	public static List<VLegalDocument> findByDocsByT_L(
		java.lang.String typeDocId, java.lang.String language, int start,
		int end) {
		return getPersistence().findByDocsByT_L(typeDocId, language, start, end);
	}

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
	public static List<VLegalDocument> findByDocsByT_L(
		java.lang.String typeDocId, java.lang.String language, int start,
		int end, OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByDocsByT_L(typeDocId, language, start, end,
			orderByComparator);
	}

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
	public static List<VLegalDocument> findByDocsByT_L(
		java.lang.String typeDocId, java.lang.String language, int start,
		int end, OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDocsByT_L(typeDocId, language, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public static VLegalDocument findByDocsByT_L_First(
		java.lang.String typeDocId, java.lang.String language,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByT_L_First(typeDocId, language, orderByComparator);
	}

	/**
	* Returns the first v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByDocsByT_L_First(
		java.lang.String typeDocId, java.lang.String language,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByDocsByT_L_First(typeDocId, language,
			orderByComparator);
	}

	/**
	* Returns the last v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public static VLegalDocument findByDocsByT_L_Last(
		java.lang.String typeDocId, java.lang.String language,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByT_L_Last(typeDocId, language, orderByComparator);
	}

	/**
	* Returns the last v legal document in the ordered set where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByDocsByT_L_Last(
		java.lang.String typeDocId, java.lang.String language,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByDocsByT_L_Last(typeDocId, language, orderByComparator);
	}

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
	public static VLegalDocument[] findByDocsByT_L_PrevAndNext(
		java.lang.String docId, java.lang.String typeDocId,
		java.lang.String language,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByDocsByT_L_PrevAndNext(docId, typeDocId, language,
			orderByComparator);
	}

	/**
	* Removes all the v legal documents where typeDocId = &#63; and language = &#63; from the database.
	*
	* @param typeDocId the type doc ID
	* @param language the language
	*/
	public static void removeByDocsByT_L(java.lang.String typeDocId,
		java.lang.String language) {
		getPersistence().removeByDocsByT_L(typeDocId, language);
	}

	/**
	* Returns the number of v legal documents where typeDocId = &#63; and language = &#63;.
	*
	* @param typeDocId the type doc ID
	* @param language the language
	* @return the number of matching v legal documents
	*/
	public static int countByDocsByT_L(java.lang.String typeDocId,
		java.lang.String language) {
		return getPersistence().countByDocsByT_L(typeDocId, language);
	}

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param userId the user ID
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public static List<VLegalDocument> findByG_L_U_S(long groupId,
		java.lang.String language, long userId, int statusDoc) {
		return getPersistence()
				   .findByG_L_U_S(groupId, language, userId, statusDoc);
	}

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
	public static List<VLegalDocument> findByG_L_U_S(long groupId,
		java.lang.String language, long userId, int statusDoc, int start,
		int end) {
		return getPersistence()
				   .findByG_L_U_S(groupId, language, userId, statusDoc, start,
			end);
	}

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
	public static List<VLegalDocument> findByG_L_U_S(long groupId,
		java.lang.String language, long userId, int statusDoc, int start,
		int end, OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_U_S(groupId, language, userId, statusDoc, start,
			end, orderByComparator);
	}

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
	public static List<VLegalDocument> findByG_L_U_S(long groupId,
		java.lang.String language, long userId, int statusDoc, int start,
		int end, OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_U_S(groupId, language, userId, statusDoc, start,
			end, orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDocument findByG_L_U_S_First(long groupId,
		java.lang.String language, long userId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_U_S_First(groupId, language, userId, statusDoc,
			orderByComparator);
	}

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
	public static VLegalDocument fetchByG_L_U_S_First(long groupId,
		java.lang.String language, long userId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_U_S_First(groupId, language, userId, statusDoc,
			orderByComparator);
	}

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
	public static VLegalDocument findByG_L_U_S_Last(long groupId,
		java.lang.String language, long userId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_U_S_Last(groupId, language, userId, statusDoc,
			orderByComparator);
	}

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
	public static VLegalDocument fetchByG_L_U_S_Last(long groupId,
		java.lang.String language, long userId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_U_S_Last(groupId, language, userId, statusDoc,
			orderByComparator);
	}

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
	public static VLegalDocument[] findByG_L_U_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		long userId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_U_S_PrevAndNext(docId, groupId, language, userId,
			statusDoc, orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param userId the user ID
	* @param statusDoc the status doc
	*/
	public static void removeByG_L_U_S(long groupId, java.lang.String language,
		long userId, int statusDoc) {
		getPersistence().removeByG_L_U_S(groupId, language, userId, statusDoc);
	}

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and userId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param userId the user ID
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public static int countByG_L_U_S(long groupId, java.lang.String language,
		long userId, int statusDoc) {
		return getPersistence()
				   .countByG_L_U_S(groupId, language, userId, statusDoc);
	}

	/**
	* Returns the v legal document where groupId = &#63; and docId = &#63; or throws a {@link NoSuchVLegalDocumentException} if it could not be found.
	*
	* @param groupId the group ID
	* @param docId the doc ID
	* @return the matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public static VLegalDocument findByG_D(long groupId, java.lang.String docId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence().findByG_D(groupId, docId);
	}

	/**
	* Returns the v legal document where groupId = &#63; and docId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param docId the doc ID
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByG_D(long groupId, java.lang.String docId) {
		return getPersistence().fetchByG_D(groupId, docId);
	}

	/**
	* Returns the v legal document where groupId = &#63; and docId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param docId the doc ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByG_D(long groupId,
		java.lang.String docId, boolean retrieveFromCache) {
		return getPersistence().fetchByG_D(groupId, docId, retrieveFromCache);
	}

	/**
	* Removes the v legal document where groupId = &#63; and docId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param docId the doc ID
	* @return the v legal document that was removed
	*/
	public static VLegalDocument removeByG_D(long groupId,
		java.lang.String docId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence().removeByG_D(groupId, docId);
	}

	/**
	* Returns the number of v legal documents where groupId = &#63; and docId = &#63;.
	*
	* @param groupId the group ID
	* @param docId the doc ID
	* @return the number of matching v legal documents
	*/
	public static int countByG_D(long groupId, java.lang.String docId) {
		return getPersistence().countByG_D(groupId, docId);
	}

	/**
	* Returns the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or throws a {@link NoSuchVLegalDocumentException} if it could not be found.
	*
	* @param groupId the group ID
	* @param num the num
	* @param symbol the symbol
	* @return the matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public static VLegalDocument findByP_N_S(long groupId,
		java.lang.String num, java.lang.String symbol)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence().findByP_N_S(groupId, num, symbol);
	}

	/**
	* Returns the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param num the num
	* @param symbol the symbol
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByP_N_S(long groupId,
		java.lang.String num, java.lang.String symbol) {
		return getPersistence().fetchByP_N_S(groupId, num, symbol);
	}

	/**
	* Returns the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param num the num
	* @param symbol the symbol
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByP_N_S(long groupId,
		java.lang.String num, java.lang.String symbol, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByP_N_S(groupId, num, symbol, retrieveFromCache);
	}

	/**
	* Removes the v legal document where groupId = &#63; and num = &#63; and symbol = &#63; from the database.
	*
	* @param groupId the group ID
	* @param num the num
	* @param symbol the symbol
	* @return the v legal document that was removed
	*/
	public static VLegalDocument removeByP_N_S(long groupId,
		java.lang.String num, java.lang.String symbol)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence().removeByP_N_S(groupId, num, symbol);
	}

	/**
	* Returns the number of v legal documents where groupId = &#63; and num = &#63; and symbol = &#63;.
	*
	* @param groupId the group ID
	* @param num the num
	* @param symbol the symbol
	* @return the number of matching v legal documents
	*/
	public static int countByP_N_S(long groupId, java.lang.String num,
		java.lang.String symbol) {
		return getPersistence().countByP_N_S(groupId, num, symbol);
	}

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public static List<VLegalDocument> findByP_L_S(long groupId,
		java.lang.String language, int statusDoc) {
		return getPersistence().findByP_L_S(groupId, language, statusDoc);
	}

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
	public static List<VLegalDocument> findByP_L_S(long groupId,
		java.lang.String language, int statusDoc, int start, int end) {
		return getPersistence()
				   .findByP_L_S(groupId, language, statusDoc, start, end);
	}

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
	public static List<VLegalDocument> findByP_L_S(long groupId,
		java.lang.String language, int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByP_L_S(groupId, language, statusDoc, start, end,
			orderByComparator);
	}

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
	public static List<VLegalDocument> findByP_L_S(long groupId,
		java.lang.String language, int statusDoc, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_L_S(groupId, language, statusDoc, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDocument findByP_L_S_First(long groupId,
		java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByP_L_S_First(groupId, language, statusDoc,
			orderByComparator);
	}

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByP_L_S_First(long groupId,
		java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_S_First(groupId, language, statusDoc,
			orderByComparator);
	}

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
	public static VLegalDocument findByP_L_S_Last(long groupId,
		java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByP_L_S_Last(groupId, language, statusDoc,
			orderByComparator);
	}

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByP_L_S_Last(long groupId,
		java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_S_Last(groupId, language, statusDoc,
			orderByComparator);
	}

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
	public static VLegalDocument[] findByP_L_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		int statusDoc, OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByP_L_S_PrevAndNext(docId, groupId, language,
			statusDoc, orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	*/
	public static void removeByP_L_S(long groupId, java.lang.String language,
		int statusDoc) {
		getPersistence().removeByP_L_S(groupId, language, statusDoc);
	}

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public static int countByP_L_S(long groupId, java.lang.String language,
		int statusDoc) {
		return getPersistence().countByP_L_S(groupId, language, statusDoc);
	}

	/**
	* Returns all the v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public static List<VLegalDocument> findBystatusDoc(int statusDoc) {
		return getPersistence().findBystatusDoc(statusDoc);
	}

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
	public static List<VLegalDocument> findBystatusDoc(int statusDoc,
		int start, int end) {
		return getPersistence().findBystatusDoc(statusDoc, start, end);
	}

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
	public static List<VLegalDocument> findBystatusDoc(int statusDoc,
		int start, int end, OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findBystatusDoc(statusDoc, start, end, orderByComparator);
	}

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
	public static List<VLegalDocument> findBystatusDoc(int statusDoc,
		int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBystatusDoc(statusDoc, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public static VLegalDocument findBystatusDoc_First(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findBystatusDoc_First(statusDoc, orderByComparator);
	}

	/**
	* Returns the first v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchBystatusDoc_First(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchBystatusDoc_First(statusDoc, orderByComparator);
	}

	/**
	* Returns the last v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public static VLegalDocument findBystatusDoc_Last(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findBystatusDoc_Last(statusDoc, orderByComparator);
	}

	/**
	* Returns the last v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchBystatusDoc_Last(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchBystatusDoc_Last(statusDoc, orderByComparator);
	}

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public static VLegalDocument[] findBystatusDoc_PrevAndNext(
		java.lang.String docId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findBystatusDoc_PrevAndNext(docId, statusDoc,
			orderByComparator);
	}

	/**
	* Removes all the v legal documents where statusDoc = &#63; from the database.
	*
	* @param statusDoc the status doc
	*/
	public static void removeBystatusDoc(int statusDoc) {
		getPersistence().removeBystatusDoc(statusDoc);
	}

	/**
	* Returns the number of v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public static int countBystatusDoc(int statusDoc) {
		return getPersistence().countBystatusDoc(statusDoc);
	}

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public static List<VLegalDocument> findByG_L_O_S(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc) {
		return getPersistence()
				   .findByG_L_O_S(groupId, language, orgId, statusDoc);
	}

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
	public static List<VLegalDocument> findByG_L_O_S(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		int start, int end) {
		return getPersistence()
				   .findByG_L_O_S(groupId, language, orgId, statusDoc, start,
			end);
	}

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
	public static List<VLegalDocument> findByG_L_O_S(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		int start, int end, OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_O_S(groupId, language, orgId, statusDoc, start,
			end, orderByComparator);
	}

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
	public static List<VLegalDocument> findByG_L_O_S(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_O_S(groupId, language, orgId, statusDoc, start,
			end, orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDocument findByG_L_O_S_First(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_O_S_First(groupId, language, orgId, statusDoc,
			orderByComparator);
	}

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
	public static VLegalDocument fetchByG_L_O_S_First(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_O_S_First(groupId, language, orgId, statusDoc,
			orderByComparator);
	}

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
	public static VLegalDocument findByG_L_O_S_Last(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_O_S_Last(groupId, language, orgId, statusDoc,
			orderByComparator);
	}

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
	public static VLegalDocument fetchByG_L_O_S_Last(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_O_S_Last(groupId, language, orgId, statusDoc,
			orderByComparator);
	}

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
	public static VLegalDocument[] findByG_L_O_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String orgId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_O_S_PrevAndNext(docId, groupId, language, orgId,
			statusDoc, orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	*/
	public static void removeByG_L_O_S(long groupId, java.lang.String language,
		java.lang.String orgId, int statusDoc) {
		getPersistence().removeByG_L_O_S(groupId, language, orgId, statusDoc);
	}

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public static int countByG_L_O_S(long groupId, java.lang.String language,
		java.lang.String orgId, int statusDoc) {
		return getPersistence()
				   .countByG_L_O_S(groupId, language, orgId, statusDoc);
	}

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public static List<VLegalDocument> findByG_L_T_S(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc) {
		return getPersistence()
				   .findByG_L_T_S(groupId, language, typeDocId, statusDoc);
	}

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
	public static List<VLegalDocument> findByG_L_T_S(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		int start, int end) {
		return getPersistence()
				   .findByG_L_T_S(groupId, language, typeDocId, statusDoc,
			start, end);
	}

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
	public static List<VLegalDocument> findByG_L_T_S(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		int start, int end, OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_T_S(groupId, language, typeDocId, statusDoc,
			start, end, orderByComparator);
	}

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
	public static List<VLegalDocument> findByG_L_T_S(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_T_S(groupId, language, typeDocId, statusDoc,
			start, end, orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDocument findByG_L_T_S_First(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_T_S_First(groupId, language, typeDocId,
			statusDoc, orderByComparator);
	}

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
	public static VLegalDocument fetchByG_L_T_S_First(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_T_S_First(groupId, language, typeDocId,
			statusDoc, orderByComparator);
	}

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
	public static VLegalDocument findByG_L_T_S_Last(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_T_S_Last(groupId, language, typeDocId, statusDoc,
			orderByComparator);
	}

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
	public static VLegalDocument fetchByG_L_T_S_Last(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_T_S_Last(groupId, language, typeDocId,
			statusDoc, orderByComparator);
	}

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
	public static VLegalDocument[] findByG_L_T_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String typeDocId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_T_S_PrevAndNext(docId, groupId, language,
			typeDocId, statusDoc, orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	*/
	public static void removeByG_L_T_S(long groupId, java.lang.String language,
		java.lang.String typeDocId, int statusDoc) {
		getPersistence().removeByG_L_T_S(groupId, language, typeDocId, statusDoc);
	}

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public static int countByG_L_T_S(long groupId, java.lang.String language,
		java.lang.String typeDocId, int statusDoc) {
		return getPersistence()
				   .countByG_L_T_S(groupId, language, typeDocId, statusDoc);
	}

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public static List<VLegalDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc) {
		return getPersistence()
				   .findByG_L_F_S(groupId, language, fieldId, statusDoc);
	}

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
	public static List<VLegalDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end) {
		return getPersistence()
				   .findByG_L_F_S(groupId, language, fieldId, statusDoc, start,
			end);
	}

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
	public static List<VLegalDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end, OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_F_S(groupId, language, fieldId, statusDoc, start,
			end, orderByComparator);
	}

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
	public static List<VLegalDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_F_S(groupId, language, fieldId, statusDoc, start,
			end, orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDocument findByG_L_F_S_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_F_S_First(groupId, language, fieldId, statusDoc,
			orderByComparator);
	}

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
	public static VLegalDocument fetchByG_L_F_S_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_F_S_First(groupId, language, fieldId, statusDoc,
			orderByComparator);
	}

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
	public static VLegalDocument findByG_L_F_S_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_F_S_Last(groupId, language, fieldId, statusDoc,
			orderByComparator);
	}

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
	public static VLegalDocument fetchByG_L_F_S_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_F_S_Last(groupId, language, fieldId, statusDoc,
			orderByComparator);
	}

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
	public static VLegalDocument[] findByG_L_F_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_F_S_PrevAndNext(docId, groupId, language,
			fieldId, statusDoc, orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	*/
	public static void removeByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc) {
		getPersistence().removeByG_L_F_S(groupId, language, fieldId, statusDoc);
	}

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public static int countByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc) {
		return getPersistence()
				   .countByG_L_F_S(groupId, language, fieldId, statusDoc);
	}

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @return the matching v legal documents
	*/
	public static List<VLegalDocument> findByG_L_O(long groupId,
		java.lang.String language, java.lang.String orgId) {
		return getPersistence().findByG_L_O(groupId, language, orgId);
	}

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
	public static List<VLegalDocument> findByG_L_O(long groupId,
		java.lang.String language, java.lang.String orgId, int start, int end) {
		return getPersistence().findByG_L_O(groupId, language, orgId, start, end);
	}

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
	public static List<VLegalDocument> findByG_L_O(long groupId,
		java.lang.String language, java.lang.String orgId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_O(groupId, language, orgId, start, end,
			orderByComparator);
	}

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
	public static List<VLegalDocument> findByG_L_O(long groupId,
		java.lang.String language, java.lang.String orgId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_O(groupId, language, orgId, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDocument findByG_L_O_First(long groupId,
		java.lang.String language, java.lang.String orgId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_O_First(groupId, language, orgId,
			orderByComparator);
	}

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByG_L_O_First(long groupId,
		java.lang.String language, java.lang.String orgId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_O_First(groupId, language, orgId,
			orderByComparator);
	}

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
	public static VLegalDocument findByG_L_O_Last(long groupId,
		java.lang.String language, java.lang.String orgId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_O_Last(groupId, language, orgId, orderByComparator);
	}

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByG_L_O_Last(long groupId,
		java.lang.String language, java.lang.String orgId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_O_Last(groupId, language, orgId,
			orderByComparator);
	}

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
	public static VLegalDocument[] findByG_L_O_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String orgId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_O_PrevAndNext(docId, groupId, language, orgId,
			orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	*/
	public static void removeByG_L_O(long groupId, java.lang.String language,
		java.lang.String orgId) {
		getPersistence().removeByG_L_O(groupId, language, orgId);
	}

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and orgId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @return the number of matching v legal documents
	*/
	public static int countByG_L_O(long groupId, java.lang.String language,
		java.lang.String orgId) {
		return getPersistence().countByG_L_O(groupId, language, orgId);
	}

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @return the matching v legal documents
	*/
	public static List<VLegalDocument> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String typeDocId) {
		return getPersistence().findByG_L_T(groupId, language, typeDocId);
	}

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
	public static List<VLegalDocument> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String typeDocId, int start,
		int end) {
		return getPersistence()
				   .findByG_L_T(groupId, language, typeDocId, start, end);
	}

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
	public static List<VLegalDocument> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String typeDocId, int start,
		int end, OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_T(groupId, language, typeDocId, start, end,
			orderByComparator);
	}

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
	public static List<VLegalDocument> findByG_L_T(long groupId,
		java.lang.String language, java.lang.String typeDocId, int start,
		int end, OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_T(groupId, language, typeDocId, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDocument findByG_L_T_First(long groupId,
		java.lang.String language, java.lang.String typeDocId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_T_First(groupId, language, typeDocId,
			orderByComparator);
	}

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByG_L_T_First(long groupId,
		java.lang.String language, java.lang.String typeDocId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_T_First(groupId, language, typeDocId,
			orderByComparator);
	}

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
	public static VLegalDocument findByG_L_T_Last(long groupId,
		java.lang.String language, java.lang.String typeDocId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_T_Last(groupId, language, typeDocId,
			orderByComparator);
	}

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByG_L_T_Last(long groupId,
		java.lang.String language, java.lang.String typeDocId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_T_Last(groupId, language, typeDocId,
			orderByComparator);
	}

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
	public static VLegalDocument[] findByG_L_T_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String typeDocId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_T_PrevAndNext(docId, groupId, language,
			typeDocId, orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	*/
	public static void removeByG_L_T(long groupId, java.lang.String language,
		java.lang.String typeDocId) {
		getPersistence().removeByG_L_T(groupId, language, typeDocId);
	}

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @return the number of matching v legal documents
	*/
	public static int countByG_L_T(long groupId, java.lang.String language,
		java.lang.String typeDocId) {
		return getPersistence().countByG_L_T(groupId, language, typeDocId);
	}

	/**
	* Returns all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @return the matching v legal documents
	*/
	public static List<VLegalDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId) {
		return getPersistence().findByG_L_F(groupId, language, fieldId);
	}

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
	public static List<VLegalDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId, int start, int end) {
		return getPersistence()
				   .findByG_L_F(groupId, language, fieldId, start, end);
	}

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
	public static List<VLegalDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId, int start,
		int end, OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_F(groupId, language, fieldId, start, end,
			orderByComparator);
	}

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
	public static List<VLegalDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId, int start,
		int end, OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_F(groupId, language, fieldId, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDocument findByG_L_F_First(long groupId,
		java.lang.String language, java.lang.String fieldId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_F_First(groupId, language, fieldId,
			orderByComparator);
	}

	/**
	* Returns the first v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByG_L_F_First(long groupId,
		java.lang.String language, java.lang.String fieldId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_F_First(groupId, language, fieldId,
			orderByComparator);
	}

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
	public static VLegalDocument findByG_L_F_Last(long groupId,
		java.lang.String language, java.lang.String fieldId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_F_Last(groupId, language, fieldId,
			orderByComparator);
	}

	/**
	* Returns the last v legal document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByG_L_F_Last(long groupId,
		java.lang.String language, java.lang.String fieldId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_F_Last(groupId, language, fieldId,
			orderByComparator);
	}

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
	public static VLegalDocument[] findByG_L_F_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String fieldId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_F_PrevAndNext(docId, groupId, language, fieldId,
			orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	*/
	public static void removeByG_L_F(long groupId, java.lang.String language,
		java.lang.String fieldId) {
		getPersistence().removeByG_L_F(groupId, language, fieldId);
	}

	/**
	* Returns the number of v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @return the number of matching v legal documents
	*/
	public static int countByG_L_F(long groupId, java.lang.String language,
		java.lang.String fieldId) {
		return getPersistence().countByG_L_F(groupId, language, fieldId);
	}

	/**
	* Returns all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public static List<VLegalDocument> findByP_U_S(long groupId,
		long createdByUser, java.lang.String language, int statusDoc) {
		return getPersistence()
				   .findByP_U_S(groupId, createdByUser, language, statusDoc);
	}

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
	public static List<VLegalDocument> findByP_U_S(long groupId,
		long createdByUser, java.lang.String language, int statusDoc,
		int start, int end) {
		return getPersistence()
				   .findByP_U_S(groupId, createdByUser, language, statusDoc,
			start, end);
	}

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
	public static List<VLegalDocument> findByP_U_S(long groupId,
		long createdByUser, java.lang.String language, int statusDoc,
		int start, int end, OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByP_U_S(groupId, createdByUser, language, statusDoc,
			start, end, orderByComparator);
	}

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
	public static List<VLegalDocument> findByP_U_S(long groupId,
		long createdByUser, java.lang.String language, int statusDoc,
		int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_U_S(groupId, createdByUser, language, statusDoc,
			start, end, orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDocument findByP_U_S_First(long groupId,
		long createdByUser, java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByP_U_S_First(groupId, createdByUser, language,
			statusDoc, orderByComparator);
	}

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
	public static VLegalDocument fetchByP_U_S_First(long groupId,
		long createdByUser, java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_U_S_First(groupId, createdByUser, language,
			statusDoc, orderByComparator);
	}

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
	public static VLegalDocument findByP_U_S_Last(long groupId,
		long createdByUser, java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByP_U_S_Last(groupId, createdByUser, language,
			statusDoc, orderByComparator);
	}

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
	public static VLegalDocument fetchByP_U_S_Last(long groupId,
		long createdByUser, java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByP_U_S_Last(groupId, createdByUser, language,
			statusDoc, orderByComparator);
	}

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
	public static VLegalDocument[] findByP_U_S_PrevAndNext(
		java.lang.String docId, long groupId, long createdByUser,
		java.lang.String language, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByP_U_S_PrevAndNext(docId, groupId, createdByUser,
			language, statusDoc, orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param statusDoc the status doc
	*/
	public static void removeByP_U_S(long groupId, long createdByUser,
		java.lang.String language, int statusDoc) {
		getPersistence()
			.removeByP_U_S(groupId, createdByUser, language, statusDoc);
	}

	/**
	* Returns the number of v legal documents where groupId = &#63; and createdByUser = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public static int countByP_U_S(long groupId, long createdByUser,
		java.lang.String language, int statusDoc) {
		return getPersistence()
				   .countByP_U_S(groupId, createdByUser, language, statusDoc);
	}

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
	public static List<VLegalDocument> findByG_L_O_S_D(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId) {
		return getPersistence()
				   .findByG_L_O_S_D(groupId, language, orgId, statusDoc, docId);
	}

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
	public static List<VLegalDocument> findByG_L_O_S_D(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId, int start, int end) {
		return getPersistence()
				   .findByG_L_O_S_D(groupId, language, orgId, statusDoc, docId,
			start, end);
	}

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
	public static List<VLegalDocument> findByG_L_O_S_D(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_O_S_D(groupId, language, orgId, statusDoc, docId,
			start, end, orderByComparator);
	}

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
	public static List<VLegalDocument> findByG_L_O_S_D(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_O_S_D(groupId, language, orgId, statusDoc, docId,
			start, end, orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDocument findByG_L_O_S_D_First(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_O_S_D_First(groupId, language, orgId, statusDoc,
			docId, orderByComparator);
	}

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
	public static VLegalDocument fetchByG_L_O_S_D_First(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_O_S_D_First(groupId, language, orgId, statusDoc,
			docId, orderByComparator);
	}

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
	public static VLegalDocument findByG_L_O_S_D_Last(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_O_S_D_Last(groupId, language, orgId, statusDoc,
			docId, orderByComparator);
	}

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
	public static VLegalDocument fetchByG_L_O_S_D_Last(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_O_S_D_Last(groupId, language, orgId, statusDoc,
			docId, orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and orgId = &#63; and statusDoc = &#63; and docId &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orgId the org ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	*/
	public static void removeByG_L_O_S_D(long groupId,
		java.lang.String language, java.lang.String orgId, int statusDoc,
		java.lang.String docId) {
		getPersistence()
			.removeByG_L_O_S_D(groupId, language, orgId, statusDoc, docId);
	}

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
	public static int countByG_L_O_S_D(long groupId, java.lang.String language,
		java.lang.String orgId, int statusDoc, java.lang.String docId) {
		return getPersistence()
				   .countByG_L_O_S_D(groupId, language, orgId, statusDoc, docId);
	}

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
	public static List<VLegalDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId) {
		return getPersistence()
				   .findByG_L_T_S_D(groupId, language, typeDocId, statusDoc,
			docId);
	}

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
	public static List<VLegalDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId, int start, int end) {
		return getPersistence()
				   .findByG_L_T_S_D(groupId, language, typeDocId, statusDoc,
			docId, start, end);
	}

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
	public static List<VLegalDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_T_S_D(groupId, language, typeDocId, statusDoc,
			docId, start, end, orderByComparator);
	}

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
	public static List<VLegalDocument> findByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_T_S_D(groupId, language, typeDocId, statusDoc,
			docId, start, end, orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDocument findByG_L_T_S_D_First(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_T_S_D_First(groupId, language, typeDocId,
			statusDoc, docId, orderByComparator);
	}

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
	public static VLegalDocument fetchByG_L_T_S_D_First(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_T_S_D_First(groupId, language, typeDocId,
			statusDoc, docId, orderByComparator);
	}

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
	public static VLegalDocument findByG_L_T_S_D_Last(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_T_S_D_Last(groupId, language, typeDocId,
			statusDoc, docId, orderByComparator);
	}

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
	public static VLegalDocument fetchByG_L_T_S_D_Last(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_T_S_D_Last(groupId, language, typeDocId,
			statusDoc, docId, orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and typeDocId = &#63; and statusDoc = &#63; and docId &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param typeDocId the type doc ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	*/
	public static void removeByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeDocId, int statusDoc,
		java.lang.String docId) {
		getPersistence()
			.removeByG_L_T_S_D(groupId, language, typeDocId, statusDoc, docId);
	}

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
	public static int countByG_L_T_S_D(long groupId, java.lang.String language,
		java.lang.String typeDocId, int statusDoc, java.lang.String docId) {
		return getPersistence()
				   .countByG_L_T_S_D(groupId, language, typeDocId, statusDoc,
			docId);
	}

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
	public static List<VLegalDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId) {
		return getPersistence()
				   .findByG_L_F_S_D(groupId, language, fieldId, statusDoc, docId);
	}

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
	public static List<VLegalDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId, int start, int end) {
		return getPersistence()
				   .findByG_L_F_S_D(groupId, language, fieldId, statusDoc,
			docId, start, end);
	}

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
	public static List<VLegalDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_F_S_D(groupId, language, fieldId, statusDoc,
			docId, start, end, orderByComparator);
	}

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
	public static List<VLegalDocument> findByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId, int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_F_S_D(groupId, language, fieldId, statusDoc,
			docId, start, end, orderByComparator, retrieveFromCache);
	}

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
	public static VLegalDocument findByG_L_F_S_D_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_F_S_D_First(groupId, language, fieldId,
			statusDoc, docId, orderByComparator);
	}

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
	public static VLegalDocument fetchByG_L_F_S_D_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_F_S_D_First(groupId, language, fieldId,
			statusDoc, docId, orderByComparator);
	}

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
	public static VLegalDocument findByG_L_F_S_D_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByG_L_F_S_D_Last(groupId, language, fieldId, statusDoc,
			docId, orderByComparator);
	}

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
	public static VLegalDocument fetchByG_L_F_S_D_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_F_S_D_Last(groupId, language, fieldId,
			statusDoc, docId, orderByComparator);
	}

	/**
	* Removes all the v legal documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; and docId &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @param docId the doc ID
	*/
	public static void removeByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		java.lang.String docId) {
		getPersistence()
			.removeByG_L_F_S_D(groupId, language, fieldId, statusDoc, docId);
	}

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
	public static int countByG_L_F_S_D(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc, java.lang.String docId) {
		return getPersistence()
				   .countByG_L_F_S_D(groupId, language, fieldId, statusDoc,
			docId);
	}

	/**
	* Returns all the v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @return the matching v legal documents
	*/
	public static List<VLegalDocument> findByStatus(int statusDoc) {
		return getPersistence().findByStatus(statusDoc);
	}

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
	public static List<VLegalDocument> findByStatus(int statusDoc, int start,
		int end) {
		return getPersistence().findByStatus(statusDoc, start, end);
	}

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
	public static List<VLegalDocument> findByStatus(int statusDoc, int start,
		int end, OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence()
				   .findByStatus(statusDoc, start, end, orderByComparator);
	}

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
	public static List<VLegalDocument> findByStatus(int statusDoc, int start,
		int end, OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus(statusDoc, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public static VLegalDocument findByStatus_First(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence().findByStatus_First(statusDoc, orderByComparator);
	}

	/**
	* Returns the first v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByStatus_First(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence().fetchByStatus_First(statusDoc, orderByComparator);
	}

	/**
	* Returns the last v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document
	* @throws NoSuchVLegalDocumentException if a matching v legal document could not be found
	*/
	public static VLegalDocument findByStatus_Last(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence().findByStatus_Last(statusDoc, orderByComparator);
	}

	/**
	* Returns the last v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal document, or <code>null</code> if a matching v legal document could not be found
	*/
	public static VLegalDocument fetchByStatus_Last(int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence().fetchByStatus_Last(statusDoc, orderByComparator);
	}

	/**
	* Returns the v legal documents before and after the current v legal document in the ordered set where statusDoc = &#63;.
	*
	* @param docId the primary key of the current v legal document
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public static VLegalDocument[] findByStatus_PrevAndNext(
		java.lang.String docId, int statusDoc,
		OrderByComparator<VLegalDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence()
				   .findByStatus_PrevAndNext(docId, statusDoc, orderByComparator);
	}

	/**
	* Removes all the v legal documents where statusDoc = &#63; from the database.
	*
	* @param statusDoc the status doc
	*/
	public static void removeByStatus(int statusDoc) {
		getPersistence().removeByStatus(statusDoc);
	}

	/**
	* Returns the number of v legal documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @return the number of matching v legal documents
	*/
	public static int countByStatus(int statusDoc) {
		return getPersistence().countByStatus(statusDoc);
	}

	/**
	* Caches the v legal document in the entity cache if it is enabled.
	*
	* @param vLegalDocument the v legal document
	*/
	public static void cacheResult(VLegalDocument vLegalDocument) {
		getPersistence().cacheResult(vLegalDocument);
	}

	/**
	* Caches the v legal documents in the entity cache if it is enabled.
	*
	* @param vLegalDocuments the v legal documents
	*/
	public static void cacheResult(List<VLegalDocument> vLegalDocuments) {
		getPersistence().cacheResult(vLegalDocuments);
	}

	/**
	* Creates a new v legal document with the primary key. Does not add the v legal document to the database.
	*
	* @param docId the primary key for the new v legal document
	* @return the new v legal document
	*/
	public static VLegalDocument create(java.lang.String docId) {
		return getPersistence().create(docId);
	}

	/**
	* Removes the v legal document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docId the primary key of the v legal document
	* @return the v legal document that was removed
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public static VLegalDocument remove(java.lang.String docId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence().remove(docId);
	}

	public static VLegalDocument updateImpl(VLegalDocument vLegalDocument) {
		return getPersistence().updateImpl(vLegalDocument);
	}

	/**
	* Returns the v legal document with the primary key or throws a {@link NoSuchVLegalDocumentException} if it could not be found.
	*
	* @param docId the primary key of the v legal document
	* @return the v legal document
	* @throws NoSuchVLegalDocumentException if a v legal document with the primary key could not be found
	*/
	public static VLegalDocument findByPrimaryKey(java.lang.String docId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDocumentException {
		return getPersistence().findByPrimaryKey(docId);
	}

	/**
	* Returns the v legal document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param docId the primary key of the v legal document
	* @return the v legal document, or <code>null</code> if a v legal document with the primary key could not be found
	*/
	public static VLegalDocument fetchByPrimaryKey(java.lang.String docId) {
		return getPersistence().fetchByPrimaryKey(docId);
	}

	public static java.util.Map<java.io.Serializable, VLegalDocument> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal documents.
	*
	* @return the v legal documents
	*/
	public static List<VLegalDocument> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<VLegalDocument> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<VLegalDocument> findAll(int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<VLegalDocument> findAll(int start, int end,
		OrderByComparator<VLegalDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal documents from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal documents.
	*
	* @return the number of v legal documents
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalDocumentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalDocumentPersistence, VLegalDocumentPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalDocumentPersistence.class);
}