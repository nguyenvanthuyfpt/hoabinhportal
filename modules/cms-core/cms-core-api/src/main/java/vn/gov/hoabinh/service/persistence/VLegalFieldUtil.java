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

import vn.gov.hoabinh.model.VLegalField;

import java.util.List;

/**
 * The persistence utility for the v legal field service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalFieldPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFieldPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalFieldPersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalFieldUtil {
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
	public static void clearCache(VLegalField vLegalField) {
		getPersistence().clearCache(vLegalField);
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
	public static List<VLegalField> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalField> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalField> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalField> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalField update(VLegalField vLegalField) {
		return getPersistence().update(vLegalField);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalField update(VLegalField vLegalField,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalField, serviceContext);
	}

	/**
	* Returns all the v legal fields where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal fields
	*/
	public static List<VLegalField> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

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
	public static List<VLegalField> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

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
	public static List<VLegalField> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalField> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

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
	public static List<VLegalField> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalField> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal field in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal field
	* @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	*/
	public static VLegalField findByGroupId_First(long groupId,
		OrderByComparator<VLegalField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFieldException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first v legal field in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public static VLegalField fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalField> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal field in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal field
	* @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	*/
	public static VLegalField findByGroupId_Last(long groupId,
		OrderByComparator<VLegalField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFieldException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal field in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public static VLegalField fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalField> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the v legal fields before and after the current v legal field in the ordered set where groupId = &#63;.
	*
	* @param fieldId the primary key of the current v legal field
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal field
	* @throws NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	*/
	public static VLegalField[] findByGroupId_PrevAndNext(
		java.lang.String fieldId, long groupId,
		OrderByComparator<VLegalField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFieldException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(fieldId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the v legal fields where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of v legal fields where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal fields
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns the v legal field where groupId = &#63; and fieldId = &#63; or throws a {@link NoSuchVLegalFieldException} if it could not be found.
	*
	* @param groupId the group ID
	* @param fieldId the field ID
	* @return the matching v legal field
	* @throws NoSuchVLegalFieldException if a matching v legal field could not be found
	*/
	public static VLegalField findByG_F(long groupId, java.lang.String fieldId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFieldException {
		return getPersistence().findByG_F(groupId, fieldId);
	}

	/**
	* Returns the v legal field where groupId = &#63; and fieldId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param fieldId the field ID
	* @return the matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public static VLegalField fetchByG_F(long groupId, java.lang.String fieldId) {
		return getPersistence().fetchByG_F(groupId, fieldId);
	}

	/**
	* Returns the v legal field where groupId = &#63; and fieldId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param fieldId the field ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public static VLegalField fetchByG_F(long groupId,
		java.lang.String fieldId, boolean retrieveFromCache) {
		return getPersistence().fetchByG_F(groupId, fieldId, retrieveFromCache);
	}

	/**
	* Removes the v legal field where groupId = &#63; and fieldId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param fieldId the field ID
	* @return the v legal field that was removed
	*/
	public static VLegalField removeByG_F(long groupId, java.lang.String fieldId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFieldException {
		return getPersistence().removeByG_F(groupId, fieldId);
	}

	/**
	* Returns the number of v legal fields where groupId = &#63; and fieldId = &#63;.
	*
	* @param groupId the group ID
	* @param fieldId the field ID
	* @return the number of matching v legal fields
	*/
	public static int countByG_F(long groupId, java.lang.String fieldId) {
		return getPersistence().countByG_F(groupId, fieldId);
	}

	/**
	* Returns all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	* @return the matching v legal fields
	*/
	public static List<VLegalField> findByS_L(long groupId,
		boolean statusField, java.lang.String language) {
		return getPersistence().findByS_L(groupId, statusField, language);
	}

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
	public static List<VLegalField> findByS_L(long groupId,
		boolean statusField, java.lang.String language, int start, int end) {
		return getPersistence()
				   .findByS_L(groupId, statusField, language, start, end);
	}

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
	public static List<VLegalField> findByS_L(long groupId,
		boolean statusField, java.lang.String language, int start, int end,
		OrderByComparator<VLegalField> orderByComparator) {
		return getPersistence()
				   .findByS_L(groupId, statusField, language, start, end,
			orderByComparator);
	}

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
	public static List<VLegalField> findByS_L(long groupId,
		boolean statusField, java.lang.String language, int start, int end,
		OrderByComparator<VLegalField> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByS_L(groupId, statusField, language, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static VLegalField findByS_L_First(long groupId,
		boolean statusField, java.lang.String language,
		OrderByComparator<VLegalField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFieldException {
		return getPersistence()
				   .findByS_L_First(groupId, statusField, language,
			orderByComparator);
	}

	/**
	* Returns the first v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public static VLegalField fetchByS_L_First(long groupId,
		boolean statusField, java.lang.String language,
		OrderByComparator<VLegalField> orderByComparator) {
		return getPersistence()
				   .fetchByS_L_First(groupId, statusField, language,
			orderByComparator);
	}

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
	public static VLegalField findByS_L_Last(long groupId, boolean statusField,
		java.lang.String language,
		OrderByComparator<VLegalField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFieldException {
		return getPersistence()
				   .findByS_L_Last(groupId, statusField, language,
			orderByComparator);
	}

	/**
	* Returns the last v legal field in the ordered set where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public static VLegalField fetchByS_L_Last(long groupId,
		boolean statusField, java.lang.String language,
		OrderByComparator<VLegalField> orderByComparator) {
		return getPersistence()
				   .fetchByS_L_Last(groupId, statusField, language,
			orderByComparator);
	}

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
	public static VLegalField[] findByS_L_PrevAndNext(
		java.lang.String fieldId, long groupId, boolean statusField,
		java.lang.String language,
		OrderByComparator<VLegalField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFieldException {
		return getPersistence()
				   .findByS_L_PrevAndNext(fieldId, groupId, statusField,
			language, orderByComparator);
	}

	/**
	* Removes all the v legal fields where groupId = &#63; and statusField = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	*/
	public static void removeByS_L(long groupId, boolean statusField,
		java.lang.String language) {
		getPersistence().removeByS_L(groupId, statusField, language);
	}

	/**
	* Returns the number of v legal fields where groupId = &#63; and statusField = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param language the language
	* @return the number of matching v legal fields
	*/
	public static int countByS_L(long groupId, boolean statusField,
		java.lang.String language) {
		return getPersistence().countByS_L(groupId, statusField, language);
	}

	/**
	* Returns all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	* @return the matching v legal fields
	*/
	public static List<VLegalField> findByS_Rss(long groupId,
		boolean statusField, boolean rssable) {
		return getPersistence().findByS_Rss(groupId, statusField, rssable);
	}

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
	public static List<VLegalField> findByS_Rss(long groupId,
		boolean statusField, boolean rssable, int start, int end) {
		return getPersistence()
				   .findByS_Rss(groupId, statusField, rssable, start, end);
	}

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
	public static List<VLegalField> findByS_Rss(long groupId,
		boolean statusField, boolean rssable, int start, int end,
		OrderByComparator<VLegalField> orderByComparator) {
		return getPersistence()
				   .findByS_Rss(groupId, statusField, rssable, start, end,
			orderByComparator);
	}

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
	public static List<VLegalField> findByS_Rss(long groupId,
		boolean statusField, boolean rssable, int start, int end,
		OrderByComparator<VLegalField> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByS_Rss(groupId, statusField, rssable, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static VLegalField findByS_Rss_First(long groupId,
		boolean statusField, boolean rssable,
		OrderByComparator<VLegalField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFieldException {
		return getPersistence()
				   .findByS_Rss_First(groupId, statusField, rssable,
			orderByComparator);
	}

	/**
	* Returns the first v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public static VLegalField fetchByS_Rss_First(long groupId,
		boolean statusField, boolean rssable,
		OrderByComparator<VLegalField> orderByComparator) {
		return getPersistence()
				   .fetchByS_Rss_First(groupId, statusField, rssable,
			orderByComparator);
	}

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
	public static VLegalField findByS_Rss_Last(long groupId,
		boolean statusField, boolean rssable,
		OrderByComparator<VLegalField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFieldException {
		return getPersistence()
				   .findByS_Rss_Last(groupId, statusField, rssable,
			orderByComparator);
	}

	/**
	* Returns the last v legal field in the ordered set where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal field, or <code>null</code> if a matching v legal field could not be found
	*/
	public static VLegalField fetchByS_Rss_Last(long groupId,
		boolean statusField, boolean rssable,
		OrderByComparator<VLegalField> orderByComparator) {
		return getPersistence()
				   .fetchByS_Rss_Last(groupId, statusField, rssable,
			orderByComparator);
	}

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
	public static VLegalField[] findByS_Rss_PrevAndNext(
		java.lang.String fieldId, long groupId, boolean statusField,
		boolean rssable, OrderByComparator<VLegalField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFieldException {
		return getPersistence()
				   .findByS_Rss_PrevAndNext(fieldId, groupId, statusField,
			rssable, orderByComparator);
	}

	/**
	* Removes all the v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	*/
	public static void removeByS_Rss(long groupId, boolean statusField,
		boolean rssable) {
		getPersistence().removeByS_Rss(groupId, statusField, rssable);
	}

	/**
	* Returns the number of v legal fields where groupId = &#63; and statusField = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusField the status field
	* @param rssable the rssable
	* @return the number of matching v legal fields
	*/
	public static int countByS_Rss(long groupId, boolean statusField,
		boolean rssable) {
		return getPersistence().countByS_Rss(groupId, statusField, rssable);
	}

	/**
	* Caches the v legal field in the entity cache if it is enabled.
	*
	* @param vLegalField the v legal field
	*/
	public static void cacheResult(VLegalField vLegalField) {
		getPersistence().cacheResult(vLegalField);
	}

	/**
	* Caches the v legal fields in the entity cache if it is enabled.
	*
	* @param vLegalFields the v legal fields
	*/
	public static void cacheResult(List<VLegalField> vLegalFields) {
		getPersistence().cacheResult(vLegalFields);
	}

	/**
	* Creates a new v legal field with the primary key. Does not add the v legal field to the database.
	*
	* @param fieldId the primary key for the new v legal field
	* @return the new v legal field
	*/
	public static VLegalField create(java.lang.String fieldId) {
		return getPersistence().create(fieldId);
	}

	/**
	* Removes the v legal field with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fieldId the primary key of the v legal field
	* @return the v legal field that was removed
	* @throws NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	*/
	public static VLegalField remove(java.lang.String fieldId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFieldException {
		return getPersistence().remove(fieldId);
	}

	public static VLegalField updateImpl(VLegalField vLegalField) {
		return getPersistence().updateImpl(vLegalField);
	}

	/**
	* Returns the v legal field with the primary key or throws a {@link NoSuchVLegalFieldException} if it could not be found.
	*
	* @param fieldId the primary key of the v legal field
	* @return the v legal field
	* @throws NoSuchVLegalFieldException if a v legal field with the primary key could not be found
	*/
	public static VLegalField findByPrimaryKey(java.lang.String fieldId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFieldException {
		return getPersistence().findByPrimaryKey(fieldId);
	}

	/**
	* Returns the v legal field with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fieldId the primary key of the v legal field
	* @return the v legal field, or <code>null</code> if a v legal field with the primary key could not be found
	*/
	public static VLegalField fetchByPrimaryKey(java.lang.String fieldId) {
		return getPersistence().fetchByPrimaryKey(fieldId);
	}

	public static java.util.Map<java.io.Serializable, VLegalField> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal fields.
	*
	* @return the v legal fields
	*/
	public static List<VLegalField> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<VLegalField> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<VLegalField> findAll(int start, int end,
		OrderByComparator<VLegalField> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<VLegalField> findAll(int start, int end,
		OrderByComparator<VLegalField> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal fields from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal fields.
	*
	* @return the number of v legal fields
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalFieldPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalFieldPersistence, VLegalFieldPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalFieldPersistence.class);
}