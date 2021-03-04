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

import vn.gov.hoabinh.model.vdocField;

import java.util.List;

/**
 * The persistence utility for the vdoc field service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.vdocFieldPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocFieldPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.vdocFieldPersistenceImpl
 * @generated
 */
@ProviderType
public class vdocFieldUtil {
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
	public static void clearCache(vdocField vdocField) {
		getPersistence().clearCache(vdocField);
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
	public static List<vdocField> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<vdocField> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<vdocField> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<vdocField> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static vdocField update(vdocField vdocField) {
		return getPersistence().update(vdocField);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static vdocField update(vdocField vdocField,
		ServiceContext serviceContext) {
		return getPersistence().update(vdocField, serviceContext);
	}

	/**
	* Returns all the vdoc fields where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @return the matching vdoc fields
	*/
	public static List<vdocField> findByParentId(java.lang.String parentId) {
		return getPersistence().findByParentId(parentId);
	}

	/**
	* Returns a range of all the vdoc fields where parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parentId the parent ID
	* @param start the lower bound of the range of vdoc fields
	* @param end the upper bound of the range of vdoc fields (not inclusive)
	* @return the range of matching vdoc fields
	*/
	public static List<vdocField> findByParentId(java.lang.String parentId,
		int start, int end) {
		return getPersistence().findByParentId(parentId, start, end);
	}

	/**
	* Returns an ordered range of all the vdoc fields where parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parentId the parent ID
	* @param start the lower bound of the range of vdoc fields
	* @param end the upper bound of the range of vdoc fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc fields
	*/
	public static List<vdocField> findByParentId(java.lang.String parentId,
		int start, int end, OrderByComparator<vdocField> orderByComparator) {
		return getPersistence()
				   .findByParentId(parentId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vdoc fields where parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parentId the parent ID
	* @param start the lower bound of the range of vdoc fields
	* @param end the upper bound of the range of vdoc fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc fields
	*/
	public static List<vdocField> findByParentId(java.lang.String parentId,
		int start, int end, OrderByComparator<vdocField> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByParentId(parentId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vdoc field in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc field
	* @throws NoSuchvdocFieldException if a matching vdoc field could not be found
	*/
	public static vdocField findByParentId_First(java.lang.String parentId,
		OrderByComparator<vdocField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldException {
		return getPersistence().findByParentId_First(parentId, orderByComparator);
	}

	/**
	* Returns the first vdoc field in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc field, or <code>null</code> if a matching vdoc field could not be found
	*/
	public static vdocField fetchByParentId_First(java.lang.String parentId,
		OrderByComparator<vdocField> orderByComparator) {
		return getPersistence()
				   .fetchByParentId_First(parentId, orderByComparator);
	}

	/**
	* Returns the last vdoc field in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc field
	* @throws NoSuchvdocFieldException if a matching vdoc field could not be found
	*/
	public static vdocField findByParentId_Last(java.lang.String parentId,
		OrderByComparator<vdocField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldException {
		return getPersistence().findByParentId_Last(parentId, orderByComparator);
	}

	/**
	* Returns the last vdoc field in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc field, or <code>null</code> if a matching vdoc field could not be found
	*/
	public static vdocField fetchByParentId_Last(java.lang.String parentId,
		OrderByComparator<vdocField> orderByComparator) {
		return getPersistence().fetchByParentId_Last(parentId, orderByComparator);
	}

	/**
	* Returns the vdoc fields before and after the current vdoc field in the ordered set where parentId = &#63;.
	*
	* @param fieldId the primary key of the current vdoc field
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc field
	* @throws NoSuchvdocFieldException if a vdoc field with the primary key could not be found
	*/
	public static vdocField[] findByParentId_PrevAndNext(
		java.lang.String fieldId, java.lang.String parentId,
		OrderByComparator<vdocField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldException {
		return getPersistence()
				   .findByParentId_PrevAndNext(fieldId, parentId,
			orderByComparator);
	}

	/**
	* Removes all the vdoc fields where parentId = &#63; from the database.
	*
	* @param parentId the parent ID
	*/
	public static void removeByParentId(java.lang.String parentId) {
		getPersistence().removeByParentId(parentId);
	}

	/**
	* Returns the number of vdoc fields where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @return the number of matching vdoc fields
	*/
	public static int countByParentId(java.lang.String parentId) {
		return getPersistence().countByParentId(parentId);
	}

	/**
	* Returns all the vdoc fields where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching vdoc fields
	*/
	public static List<vdocField> findByG_L(long groupId,
		java.lang.String language) {
		return getPersistence().findByG_L(groupId, language);
	}

	/**
	* Returns a range of all the vdoc fields where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vdoc fields
	* @param end the upper bound of the range of vdoc fields (not inclusive)
	* @return the range of matching vdoc fields
	*/
	public static List<vdocField> findByG_L(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByG_L(groupId, language, start, end);
	}

	/**
	* Returns an ordered range of all the vdoc fields where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vdoc fields
	* @param end the upper bound of the range of vdoc fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc fields
	*/
	public static List<vdocField> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<vdocField> orderByComparator) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vdoc fields where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vdoc fields
	* @param end the upper bound of the range of vdoc fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc fields
	*/
	public static List<vdocField> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<vdocField> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vdoc field in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc field
	* @throws NoSuchvdocFieldException if a matching vdoc field could not be found
	*/
	public static vdocField findByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<vdocField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldException {
		return getPersistence()
				   .findByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first vdoc field in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc field, or <code>null</code> if a matching vdoc field could not be found
	*/
	public static vdocField fetchByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<vdocField> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vdoc field in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc field
	* @throws NoSuchvdocFieldException if a matching vdoc field could not be found
	*/
	public static vdocField findByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<vdocField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldException {
		return getPersistence()
				   .findByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vdoc field in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc field, or <code>null</code> if a matching vdoc field could not be found
	*/
	public static vdocField fetchByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<vdocField> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the vdoc fields before and after the current vdoc field in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param fieldId the primary key of the current vdoc field
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc field
	* @throws NoSuchvdocFieldException if a vdoc field with the primary key could not be found
	*/
	public static vdocField[] findByG_L_PrevAndNext(java.lang.String fieldId,
		long groupId, java.lang.String language,
		OrderByComparator<vdocField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldException {
		return getPersistence()
				   .findByG_L_PrevAndNext(fieldId, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the vdoc fields where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByG_L(long groupId, java.lang.String language) {
		getPersistence().removeByG_L(groupId, language);
	}

	/**
	* Returns the number of vdoc fields where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching vdoc fields
	*/
	public static int countByG_L(long groupId, java.lang.String language) {
		return getPersistence().countByG_L(groupId, language);
	}

	/**
	* Returns all the vdoc fields where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @return the matching vdoc fields
	*/
	public static List<vdocField> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId) {
		return getPersistence().findByG_L_P(groupId, language, parentId);
	}

	/**
	* Returns a range of all the vdoc fields where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of vdoc fields
	* @param end the upper bound of the range of vdoc fields (not inclusive)
	* @return the range of matching vdoc fields
	*/
	public static List<vdocField> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start, int end) {
		return getPersistence()
				   .findByG_L_P(groupId, language, parentId, start, end);
	}

	/**
	* Returns an ordered range of all the vdoc fields where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of vdoc fields
	* @param end the upper bound of the range of vdoc fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc fields
	*/
	public static List<vdocField> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start,
		int end, OrderByComparator<vdocField> orderByComparator) {
		return getPersistence()
				   .findByG_L_P(groupId, language, parentId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vdoc fields where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of vdoc fields
	* @param end the upper bound of the range of vdoc fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc fields
	*/
	public static List<vdocField> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start,
		int end, OrderByComparator<vdocField> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_P(groupId, language, parentId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vdoc field in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc field
	* @throws NoSuchvdocFieldException if a matching vdoc field could not be found
	*/
	public static vdocField findByG_L_P_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<vdocField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldException {
		return getPersistence()
				   .findByG_L_P_First(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Returns the first vdoc field in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc field, or <code>null</code> if a matching vdoc field could not be found
	*/
	public static vdocField fetchByG_L_P_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<vdocField> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_P_First(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Returns the last vdoc field in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc field
	* @throws NoSuchvdocFieldException if a matching vdoc field could not be found
	*/
	public static vdocField findByG_L_P_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<vdocField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldException {
		return getPersistence()
				   .findByG_L_P_Last(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Returns the last vdoc field in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc field, or <code>null</code> if a matching vdoc field could not be found
	*/
	public static vdocField fetchByG_L_P_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<vdocField> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_P_Last(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Returns the vdoc fields before and after the current vdoc field in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param fieldId the primary key of the current vdoc field
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc field
	* @throws NoSuchvdocFieldException if a vdoc field with the primary key could not be found
	*/
	public static vdocField[] findByG_L_P_PrevAndNext(
		java.lang.String fieldId, long groupId, java.lang.String language,
		java.lang.String parentId,
		OrderByComparator<vdocField> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldException {
		return getPersistence()
				   .findByG_L_P_PrevAndNext(fieldId, groupId, language,
			parentId, orderByComparator);
	}

	/**
	* Removes all the vdoc fields where groupId = &#63; and language = &#63; and parentId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	*/
	public static void removeByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId) {
		getPersistence().removeByG_L_P(groupId, language, parentId);
	}

	/**
	* Returns the number of vdoc fields where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @return the number of matching vdoc fields
	*/
	public static int countByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId) {
		return getPersistence().countByG_L_P(groupId, language, parentId);
	}

	/**
	* Caches the vdoc field in the entity cache if it is enabled.
	*
	* @param vdocField the vdoc field
	*/
	public static void cacheResult(vdocField vdocField) {
		getPersistence().cacheResult(vdocField);
	}

	/**
	* Caches the vdoc fields in the entity cache if it is enabled.
	*
	* @param vdocFields the vdoc fields
	*/
	public static void cacheResult(List<vdocField> vdocFields) {
		getPersistence().cacheResult(vdocFields);
	}

	/**
	* Creates a new vdoc field with the primary key. Does not add the vdoc field to the database.
	*
	* @param fieldId the primary key for the new vdoc field
	* @return the new vdoc field
	*/
	public static vdocField create(java.lang.String fieldId) {
		return getPersistence().create(fieldId);
	}

	/**
	* Removes the vdoc field with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fieldId the primary key of the vdoc field
	* @return the vdoc field that was removed
	* @throws NoSuchvdocFieldException if a vdoc field with the primary key could not be found
	*/
	public static vdocField remove(java.lang.String fieldId)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldException {
		return getPersistence().remove(fieldId);
	}

	public static vdocField updateImpl(vdocField vdocField) {
		return getPersistence().updateImpl(vdocField);
	}

	/**
	* Returns the vdoc field with the primary key or throws a {@link NoSuchvdocFieldException} if it could not be found.
	*
	* @param fieldId the primary key of the vdoc field
	* @return the vdoc field
	* @throws NoSuchvdocFieldException if a vdoc field with the primary key could not be found
	*/
	public static vdocField findByPrimaryKey(java.lang.String fieldId)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldException {
		return getPersistence().findByPrimaryKey(fieldId);
	}

	/**
	* Returns the vdoc field with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param fieldId the primary key of the vdoc field
	* @return the vdoc field, or <code>null</code> if a vdoc field with the primary key could not be found
	*/
	public static vdocField fetchByPrimaryKey(java.lang.String fieldId) {
		return getPersistence().fetchByPrimaryKey(fieldId);
	}

	public static java.util.Map<java.io.Serializable, vdocField> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vdoc fields.
	*
	* @return the vdoc fields
	*/
	public static List<vdocField> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vdoc fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc fields
	* @param end the upper bound of the range of vdoc fields (not inclusive)
	* @return the range of vdoc fields
	*/
	public static List<vdocField> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vdoc fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc fields
	* @param end the upper bound of the range of vdoc fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vdoc fields
	*/
	public static List<vdocField> findAll(int start, int end,
		OrderByComparator<vdocField> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vdoc fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc fields
	* @param end the upper bound of the range of vdoc fields (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vdoc fields
	*/
	public static List<vdocField> findAll(int start, int end,
		OrderByComparator<vdocField> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vdoc fields from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vdoc fields.
	*
	* @return the number of vdoc fields
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static vdocFieldPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<vdocFieldPersistence, vdocFieldPersistence> _serviceTracker =
		ServiceTrackerFactory.open(vdocFieldPersistence.class);
}