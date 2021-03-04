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

import vn.gov.hoabinh.model.vdocDocument;

import java.util.List;

/**
 * The persistence utility for the vdoc document service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.vdocDocumentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocDocumentPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.vdocDocumentPersistenceImpl
 * @generated
 */
@ProviderType
public class vdocDocumentUtil {
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
	public static void clearCache(vdocDocument vdocDocument) {
		getPersistence().clearCache(vdocDocument);
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
	public static List<vdocDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<vdocDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<vdocDocument> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static vdocDocument update(vdocDocument vdocDocument) {
		return getPersistence().update(vdocDocument);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static vdocDocument update(vdocDocument vdocDocument,
		ServiceContext serviceContext) {
		return getPersistence().update(vdocDocument, serviceContext);
	}

	/**
	* Returns all the vdoc documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching vdoc documents
	*/
	public static List<vdocDocument> findByG_L(long groupId,
		java.lang.String language) {
		return getPersistence().findByG_L(groupId, language);
	}

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
	public static List<vdocDocument> findByG_L(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByG_L(groupId, language, start, end);
	}

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
	public static List<vdocDocument> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator);
	}

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
	public static List<vdocDocument> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public static vdocDocument findByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public static vdocDocument fetchByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public static vdocDocument findByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public static vdocDocument fetchByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_Last(groupId, language, orderByComparator);
	}

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
	public static vdocDocument[] findByG_L_PrevAndNext(java.lang.String docId,
		long groupId, java.lang.String language,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_PrevAndNext(docId, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the vdoc documents where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByG_L(long groupId, java.lang.String language) {
		getPersistence().removeByG_L(groupId, language);
	}

	/**
	* Returns the number of vdoc documents where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching vdoc documents
	*/
	public static int countByG_L(long groupId, java.lang.String language) {
		return getPersistence().countByG_L(groupId, language);
	}

	/**
	* Returns all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @return the matching vdoc documents
	*/
	public static List<vdocDocument> findByG_L_S(long groupId,
		java.lang.String language, int statusDoc) {
		return getPersistence().findByG_L_S(groupId, language, statusDoc);
	}

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
	public static List<vdocDocument> findByG_L_S(long groupId,
		java.lang.String language, int statusDoc, int start, int end) {
		return getPersistence()
				   .findByG_L_S(groupId, language, statusDoc, start, end);
	}

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
	public static List<vdocDocument> findByG_L_S(long groupId,
		java.lang.String language, int statusDoc, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_S(groupId, language, statusDoc, start, end,
			orderByComparator);
	}

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
	public static List<vdocDocument> findByG_L_S(long groupId,
		java.lang.String language, int statusDoc, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_S(groupId, language, statusDoc, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static vdocDocument findByG_L_S_First(long groupId,
		java.lang.String language, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_S_First(groupId, language, statusDoc,
			orderByComparator);
	}

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public static vdocDocument fetchByG_L_S_First(long groupId,
		java.lang.String language, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_First(groupId, language, statusDoc,
			orderByComparator);
	}

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
	public static vdocDocument findByG_L_S_Last(long groupId,
		java.lang.String language, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_S_Last(groupId, language, statusDoc,
			orderByComparator);
	}

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public static vdocDocument fetchByG_L_S_Last(long groupId,
		java.lang.String language, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_Last(groupId, language, statusDoc,
			orderByComparator);
	}

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
	public static vdocDocument[] findByG_L_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		int statusDoc, OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_S_PrevAndNext(docId, groupId, language,
			statusDoc, orderByComparator);
	}

	/**
	* Removes all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	*/
	public static void removeByG_L_S(long groupId, java.lang.String language,
		int statusDoc) {
		getPersistence().removeByG_L_S(groupId, language, statusDoc);
	}

	/**
	* Returns the number of vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @return the number of matching vdoc documents
	*/
	public static int countByG_L_S(long groupId, java.lang.String language,
		int statusDoc) {
		return getPersistence().countByG_L_S(groupId, language, statusDoc);
	}

	/**
	* Returns all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param hasService the has service
	* @return the matching vdoc documents
	*/
	public static List<vdocDocument> findByG_L_S_S(long groupId,
		java.lang.String language, int statusDoc, boolean hasService) {
		return getPersistence()
				   .findByG_L_S_S(groupId, language, statusDoc, hasService);
	}

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
	public static List<vdocDocument> findByG_L_S_S(long groupId,
		java.lang.String language, int statusDoc, boolean hasService,
		int start, int end) {
		return getPersistence()
				   .findByG_L_S_S(groupId, language, statusDoc, hasService,
			start, end);
	}

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
	public static List<vdocDocument> findByG_L_S_S(long groupId,
		java.lang.String language, int statusDoc, boolean hasService,
		int start, int end, OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_S_S(groupId, language, statusDoc, hasService,
			start, end, orderByComparator);
	}

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
	public static List<vdocDocument> findByG_L_S_S(long groupId,
		java.lang.String language, int statusDoc, boolean hasService,
		int start, int end, OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_S_S(groupId, language, statusDoc, hasService,
			start, end, orderByComparator, retrieveFromCache);
	}

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
	public static vdocDocument findByG_L_S_S_First(long groupId,
		java.lang.String language, int statusDoc, boolean hasService,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_S_S_First(groupId, language, statusDoc,
			hasService, orderByComparator);
	}

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
	public static vdocDocument fetchByG_L_S_S_First(long groupId,
		java.lang.String language, int statusDoc, boolean hasService,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_S_First(groupId, language, statusDoc,
			hasService, orderByComparator);
	}

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
	public static vdocDocument findByG_L_S_S_Last(long groupId,
		java.lang.String language, int statusDoc, boolean hasService,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_S_S_Last(groupId, language, statusDoc,
			hasService, orderByComparator);
	}

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
	public static vdocDocument fetchByG_L_S_S_Last(long groupId,
		java.lang.String language, int statusDoc, boolean hasService,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_S_Last(groupId, language, statusDoc,
			hasService, orderByComparator);
	}

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
	public static vdocDocument[] findByG_L_S_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		int statusDoc, boolean hasService,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_S_S_PrevAndNext(docId, groupId, language,
			statusDoc, hasService, orderByComparator);
	}

	/**
	* Removes all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param hasService the has service
	*/
	public static void removeByG_L_S_S(long groupId, java.lang.String language,
		int statusDoc, boolean hasService) {
		getPersistence()
			.removeByG_L_S_S(groupId, language, statusDoc, hasService);
	}

	/**
	* Returns the number of vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and hasService = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param hasService the has service
	* @return the number of matching vdoc documents
	*/
	public static int countByG_L_S_S(long groupId, java.lang.String language,
		int statusDoc, boolean hasService) {
		return getPersistence()
				   .countByG_L_S_S(groupId, language, statusDoc, hasService);
	}

	/**
	* Returns all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @return the matching vdoc documents
	*/
	public static List<vdocDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId) {
		return getPersistence().findByG_L_F(groupId, language, fieldId);
	}

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
	public static List<vdocDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId, int start, int end) {
		return getPersistence()
				   .findByG_L_F(groupId, language, fieldId, start, end);
	}

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
	public static List<vdocDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId, int start,
		int end, OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_F(groupId, language, fieldId, start, end,
			orderByComparator);
	}

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
	public static List<vdocDocument> findByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId, int start,
		int end, OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_F(groupId, language, fieldId, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static vdocDocument findByG_L_F_First(long groupId,
		java.lang.String language, java.lang.String fieldId,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_F_First(groupId, language, fieldId,
			orderByComparator);
	}

	/**
	* Returns the first vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public static vdocDocument fetchByG_L_F_First(long groupId,
		java.lang.String language, java.lang.String fieldId,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_F_First(groupId, language, fieldId,
			orderByComparator);
	}

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
	public static vdocDocument findByG_L_F_Last(long groupId,
		java.lang.String language, java.lang.String fieldId,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_F_Last(groupId, language, fieldId,
			orderByComparator);
	}

	/**
	* Returns the last vdoc document in the ordered set where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public static vdocDocument fetchByG_L_F_Last(long groupId,
		java.lang.String language, java.lang.String fieldId,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_F_Last(groupId, language, fieldId,
			orderByComparator);
	}

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
	public static vdocDocument[] findByG_L_F_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String fieldId,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_F_PrevAndNext(docId, groupId, language, fieldId,
			orderByComparator);
	}

	/**
	* Removes all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; from the database.
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
	* Returns the number of vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @return the number of matching vdoc documents
	*/
	public static int countByG_L_F(long groupId, java.lang.String language,
		java.lang.String fieldId) {
		return getPersistence().countByG_L_F(groupId, language, fieldId);
	}

	/**
	* Returns all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @return the matching vdoc documents
	*/
	public static List<vdocDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc) {
		return getPersistence()
				   .findByG_L_F_S(groupId, language, fieldId, statusDoc);
	}

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
	public static List<vdocDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end) {
		return getPersistence()
				   .findByG_L_F_S(groupId, language, fieldId, statusDoc, start,
			end);
	}

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
	public static List<vdocDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end, OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_F_S(groupId, language, fieldId, statusDoc, start,
			end, orderByComparator);
	}

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
	public static List<vdocDocument> findByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		int start, int end, OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_F_S(groupId, language, fieldId, statusDoc, start,
			end, orderByComparator, retrieveFromCache);
	}

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
	public static vdocDocument findByG_L_F_S_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_F_S_First(groupId, language, fieldId, statusDoc,
			orderByComparator);
	}

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
	public static vdocDocument fetchByG_L_F_S_First(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_F_S_First(groupId, language, fieldId, statusDoc,
			orderByComparator);
	}

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
	public static vdocDocument findByG_L_F_S_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_F_S_Last(groupId, language, fieldId, statusDoc,
			orderByComparator);
	}

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
	public static vdocDocument fetchByG_L_F_S_Last(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_F_S_Last(groupId, language, fieldId, statusDoc,
			orderByComparator);
	}

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
	public static vdocDocument[] findByG_L_F_S_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_F_S_PrevAndNext(docId, groupId, language,
			fieldId, statusDoc, orderByComparator);
	}

	/**
	* Removes all the vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63; from the database.
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
	* Returns the number of vdoc documents where groupId = &#63; and language = &#63; and fieldId = &#63; and statusDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param fieldId the field ID
	* @param statusDoc the status doc
	* @return the number of matching vdoc documents
	*/
	public static int countByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int statusDoc) {
		return getPersistence()
				   .countByG_L_F_S(groupId, language, fieldId, statusDoc);
	}

	/**
	* Returns all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param typeDoc the type doc
	* @return the matching vdoc documents
	*/
	public static List<vdocDocument> findByG_L_S_T(long groupId,
		java.lang.String language, int statusDoc, int typeDoc) {
		return getPersistence()
				   .findByG_L_S_T(groupId, language, statusDoc, typeDoc);
	}

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
	public static List<vdocDocument> findByG_L_S_T(long groupId,
		java.lang.String language, int statusDoc, int typeDoc, int start,
		int end) {
		return getPersistence()
				   .findByG_L_S_T(groupId, language, statusDoc, typeDoc, start,
			end);
	}

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
	public static List<vdocDocument> findByG_L_S_T(long groupId,
		java.lang.String language, int statusDoc, int typeDoc, int start,
		int end, OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_S_T(groupId, language, statusDoc, typeDoc, start,
			end, orderByComparator);
	}

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
	public static List<vdocDocument> findByG_L_S_T(long groupId,
		java.lang.String language, int statusDoc, int typeDoc, int start,
		int end, OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_S_T(groupId, language, statusDoc, typeDoc, start,
			end, orderByComparator, retrieveFromCache);
	}

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
	public static vdocDocument findByG_L_S_T_First(long groupId,
		java.lang.String language, int statusDoc, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_S_T_First(groupId, language, statusDoc, typeDoc,
			orderByComparator);
	}

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
	public static vdocDocument fetchByG_L_S_T_First(long groupId,
		java.lang.String language, int statusDoc, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_T_First(groupId, language, statusDoc, typeDoc,
			orderByComparator);
	}

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
	public static vdocDocument findByG_L_S_T_Last(long groupId,
		java.lang.String language, int statusDoc, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_S_T_Last(groupId, language, statusDoc, typeDoc,
			orderByComparator);
	}

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
	public static vdocDocument fetchByG_L_S_T_Last(long groupId,
		java.lang.String language, int statusDoc, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_T_Last(groupId, language, statusDoc, typeDoc,
			orderByComparator);
	}

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
	public static vdocDocument[] findByG_L_S_T_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		int statusDoc, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_S_T_PrevAndNext(docId, groupId, language,
			statusDoc, typeDoc, orderByComparator);
	}

	/**
	* Removes all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param typeDoc the type doc
	*/
	public static void removeByG_L_S_T(long groupId, java.lang.String language,
		int statusDoc, int typeDoc) {
		getPersistence().removeByG_L_S_T(groupId, language, statusDoc, typeDoc);
	}

	/**
	* Returns the number of vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and typeDoc = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param typeDoc the type doc
	* @return the number of matching vdoc documents
	*/
	public static int countByG_L_S_T(long groupId, java.lang.String language,
		int statusDoc, int typeDoc) {
		return getPersistence()
				   .countByG_L_S_T(groupId, language, statusDoc, typeDoc);
	}

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
	public static List<vdocDocument> findByG_L_S_F_T(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc) {
		return getPersistence()
				   .findByG_L_S_F_T(groupId, language, statusDoc, fieldId,
			typeDoc);
	}

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
	public static List<vdocDocument> findByG_L_S_F_T(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc, int start, int end) {
		return getPersistence()
				   .findByG_L_S_F_T(groupId, language, statusDoc, fieldId,
			typeDoc, start, end);
	}

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
	public static List<vdocDocument> findByG_L_S_F_T(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .findByG_L_S_F_T(groupId, language, statusDoc, fieldId,
			typeDoc, start, end, orderByComparator);
	}

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
	public static List<vdocDocument> findByG_L_S_F_T(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc, int start, int end,
		OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_S_F_T(groupId, language, statusDoc, fieldId,
			typeDoc, start, end, orderByComparator, retrieveFromCache);
	}

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
	public static vdocDocument findByG_L_S_F_T_First(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc, OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_S_F_T_First(groupId, language, statusDoc,
			fieldId, typeDoc, orderByComparator);
	}

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
	public static vdocDocument fetchByG_L_S_F_T_First(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc, OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_F_T_First(groupId, language, statusDoc,
			fieldId, typeDoc, orderByComparator);
	}

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
	public static vdocDocument findByG_L_S_F_T_Last(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc, OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_S_F_T_Last(groupId, language, statusDoc, fieldId,
			typeDoc, orderByComparator);
	}

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
	public static vdocDocument fetchByG_L_S_F_T_Last(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc, OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_F_T_Last(groupId, language, statusDoc,
			fieldId, typeDoc, orderByComparator);
	}

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
	public static vdocDocument[] findByG_L_S_F_T_PrevAndNext(
		java.lang.String docId, long groupId, java.lang.String language,
		int statusDoc, java.lang.String fieldId, int typeDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByG_L_S_F_T_PrevAndNext(docId, groupId, language,
			statusDoc, fieldId, typeDoc, orderByComparator);
	}

	/**
	* Removes all the vdoc documents where groupId = &#63; and language = &#63; and statusDoc = &#63; and fieldId = &#63; and typeDoc = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param statusDoc the status doc
	* @param fieldId the field ID
	* @param typeDoc the type doc
	*/
	public static void removeByG_L_S_F_T(long groupId,
		java.lang.String language, int statusDoc, java.lang.String fieldId,
		int typeDoc) {
		getPersistence()
			.removeByG_L_S_F_T(groupId, language, statusDoc, fieldId, typeDoc);
	}

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
	public static int countByG_L_S_F_T(long groupId, java.lang.String language,
		int statusDoc, java.lang.String fieldId, int typeDoc) {
		return getPersistence()
				   .countByG_L_S_F_T(groupId, language, statusDoc, fieldId,
			typeDoc);
	}

	/**
	* Returns all the vdoc documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @return the matching vdoc documents
	*/
	public static List<vdocDocument> findByStatus(int statusDoc) {
		return getPersistence().findByStatus(statusDoc);
	}

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
	public static List<vdocDocument> findByStatus(int statusDoc, int start,
		int end) {
		return getPersistence().findByStatus(statusDoc, start, end);
	}

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
	public static List<vdocDocument> findByStatus(int statusDoc, int start,
		int end, OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .findByStatus(statusDoc, start, end, orderByComparator);
	}

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
	public static List<vdocDocument> findByStatus(int statusDoc, int start,
		int end, OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus(statusDoc, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vdoc document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public static vdocDocument findByStatus_First(int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence().findByStatus_First(statusDoc, orderByComparator);
	}

	/**
	* Returns the first vdoc document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public static vdocDocument fetchByStatus_First(int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence().fetchByStatus_First(statusDoc, orderByComparator);
	}

	/**
	* Returns the last vdoc document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public static vdocDocument findByStatus_Last(int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence().findByStatus_Last(statusDoc, orderByComparator);
	}

	/**
	* Returns the last vdoc document in the ordered set where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public static vdocDocument fetchByStatus_Last(int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence().fetchByStatus_Last(statusDoc, orderByComparator);
	}

	/**
	* Returns the vdoc documents before and after the current vdoc document in the ordered set where statusDoc = &#63;.
	*
	* @param docId the primary key of the current vdoc document
	* @param statusDoc the status doc
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc document
	* @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	*/
	public static vdocDocument[] findByStatus_PrevAndNext(
		java.lang.String docId, int statusDoc,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByStatus_PrevAndNext(docId, statusDoc, orderByComparator);
	}

	/**
	* Removes all the vdoc documents where statusDoc = &#63; from the database.
	*
	* @param statusDoc the status doc
	*/
	public static void removeByStatus(int statusDoc) {
		getPersistence().removeByStatus(statusDoc);
	}

	/**
	* Returns the number of vdoc documents where statusDoc = &#63;.
	*
	* @param statusDoc the status doc
	* @return the number of matching vdoc documents
	*/
	public static int countByStatus(int statusDoc) {
		return getPersistence().countByStatus(statusDoc);
	}

	/**
	* Returns all the vdoc documents where position = &#63;.
	*
	* @param position the position
	* @return the matching vdoc documents
	*/
	public static List<vdocDocument> findByPosition(int position) {
		return getPersistence().findByPosition(position);
	}

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
	public static List<vdocDocument> findByPosition(int position, int start,
		int end) {
		return getPersistence().findByPosition(position, start, end);
	}

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
	public static List<vdocDocument> findByPosition(int position, int start,
		int end, OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .findByPosition(position, start, end, orderByComparator);
	}

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
	public static List<vdocDocument> findByPosition(int position, int start,
		int end, OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByPosition(position, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vdoc document in the ordered set where position = &#63;.
	*
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public static vdocDocument findByPosition_First(int position,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence().findByPosition_First(position, orderByComparator);
	}

	/**
	* Returns the first vdoc document in the ordered set where position = &#63;.
	*
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public static vdocDocument fetchByPosition_First(int position,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence()
				   .fetchByPosition_First(position, orderByComparator);
	}

	/**
	* Returns the last vdoc document in the ordered set where position = &#63;.
	*
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document
	* @throws NoSuchvdocDocumentException if a matching vdoc document could not be found
	*/
	public static vdocDocument findByPosition_Last(int position,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence().findByPosition_Last(position, orderByComparator);
	}

	/**
	* Returns the last vdoc document in the ordered set where position = &#63;.
	*
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc document, or <code>null</code> if a matching vdoc document could not be found
	*/
	public static vdocDocument fetchByPosition_Last(int position,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence().fetchByPosition_Last(position, orderByComparator);
	}

	/**
	* Returns the vdoc documents before and after the current vdoc document in the ordered set where position = &#63;.
	*
	* @param docId the primary key of the current vdoc document
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc document
	* @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	*/
	public static vdocDocument[] findByPosition_PrevAndNext(
		java.lang.String docId, int position,
		OrderByComparator<vdocDocument> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence()
				   .findByPosition_PrevAndNext(docId, position,
			orderByComparator);
	}

	/**
	* Removes all the vdoc documents where position = &#63; from the database.
	*
	* @param position the position
	*/
	public static void removeByPosition(int position) {
		getPersistence().removeByPosition(position);
	}

	/**
	* Returns the number of vdoc documents where position = &#63;.
	*
	* @param position the position
	* @return the number of matching vdoc documents
	*/
	public static int countByPosition(int position) {
		return getPersistence().countByPosition(position);
	}

	/**
	* Caches the vdoc document in the entity cache if it is enabled.
	*
	* @param vdocDocument the vdoc document
	*/
	public static void cacheResult(vdocDocument vdocDocument) {
		getPersistence().cacheResult(vdocDocument);
	}

	/**
	* Caches the vdoc documents in the entity cache if it is enabled.
	*
	* @param vdocDocuments the vdoc documents
	*/
	public static void cacheResult(List<vdocDocument> vdocDocuments) {
		getPersistence().cacheResult(vdocDocuments);
	}

	/**
	* Creates a new vdoc document with the primary key. Does not add the vdoc document to the database.
	*
	* @param docId the primary key for the new vdoc document
	* @return the new vdoc document
	*/
	public static vdocDocument create(java.lang.String docId) {
		return getPersistence().create(docId);
	}

	/**
	* Removes the vdoc document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docId the primary key of the vdoc document
	* @return the vdoc document that was removed
	* @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	*/
	public static vdocDocument remove(java.lang.String docId)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence().remove(docId);
	}

	public static vdocDocument updateImpl(vdocDocument vdocDocument) {
		return getPersistence().updateImpl(vdocDocument);
	}

	/**
	* Returns the vdoc document with the primary key or throws a {@link NoSuchvdocDocumentException} if it could not be found.
	*
	* @param docId the primary key of the vdoc document
	* @return the vdoc document
	* @throws NoSuchvdocDocumentException if a vdoc document with the primary key could not be found
	*/
	public static vdocDocument findByPrimaryKey(java.lang.String docId)
		throws vn.gov.hoabinh.exception.NoSuchvdocDocumentException {
		return getPersistence().findByPrimaryKey(docId);
	}

	/**
	* Returns the vdoc document with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param docId the primary key of the vdoc document
	* @return the vdoc document, or <code>null</code> if a vdoc document with the primary key could not be found
	*/
	public static vdocDocument fetchByPrimaryKey(java.lang.String docId) {
		return getPersistence().fetchByPrimaryKey(docId);
	}

	public static java.util.Map<java.io.Serializable, vdocDocument> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vdoc documents.
	*
	* @return the vdoc documents
	*/
	public static List<vdocDocument> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<vdocDocument> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<vdocDocument> findAll(int start, int end,
		OrderByComparator<vdocDocument> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<vdocDocument> findAll(int start, int end,
		OrderByComparator<vdocDocument> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vdoc documents from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vdoc documents.
	*
	* @return the number of vdoc documents
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static vdocDocumentPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<vdocDocumentPersistence, vdocDocumentPersistence> _serviceTracker =
		ServiceTrackerFactory.open(vdocDocumentPersistence.class);
}