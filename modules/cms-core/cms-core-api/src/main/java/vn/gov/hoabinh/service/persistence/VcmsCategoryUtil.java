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

import vn.gov.hoabinh.model.VcmsCategory;

import java.util.List;

/**
 * The persistence utility for the vcms category service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsCategoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCategoryPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsCategoryPersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsCategoryUtil {
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
	public static void clearCache(VcmsCategory vcmsCategory) {
		getPersistence().clearCache(vcmsCategory);
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
	public static List<VcmsCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsCategory update(VcmsCategory vcmsCategory) {
		return getPersistence().update(vcmsCategory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsCategory update(VcmsCategory vcmsCategory,
		ServiceContext serviceContext) {
		return getPersistence().update(vcmsCategory, serviceContext);
	}

	/**
	* Returns all the vcms categories where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @return the matching vcms categories
	*/
	public static List<VcmsCategory> findByPortion(long groupId,
		java.lang.String language, java.lang.String portionId) {
		return getPersistence().findByPortion(groupId, language, portionId);
	}

	/**
	* Returns a range of all the vcms categories where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of matching vcms categories
	*/
	public static List<VcmsCategory> findByPortion(long groupId,
		java.lang.String language, java.lang.String portionId, int start,
		int end) {
		return getPersistence()
				   .findByPortion(groupId, language, portionId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms categories
	*/
	public static List<VcmsCategory> findByPortion(long groupId,
		java.lang.String language, java.lang.String portionId, int start,
		int end, OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence()
				   .findByPortion(groupId, language, portionId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms categories
	*/
	public static List<VcmsCategory> findByPortion(long groupId,
		java.lang.String language, java.lang.String portionId, int start,
		int end, OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByPortion(groupId, language, portionId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public static VcmsCategory findByPortion_First(long groupId,
		java.lang.String language, java.lang.String portionId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence()
				   .findByPortion_First(groupId, language, portionId,
			orderByComparator);
	}

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public static VcmsCategory fetchByPortion_First(long groupId,
		java.lang.String language, java.lang.String portionId,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence()
				   .fetchByPortion_First(groupId, language, portionId,
			orderByComparator);
	}

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public static VcmsCategory findByPortion_Last(long groupId,
		java.lang.String language, java.lang.String portionId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence()
				   .findByPortion_Last(groupId, language, portionId,
			orderByComparator);
	}

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public static VcmsCategory fetchByPortion_Last(long groupId,
		java.lang.String language, java.lang.String portionId,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence()
				   .fetchByPortion_Last(groupId, language, portionId,
			orderByComparator);
	}

	/**
	* Returns the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* @param categoryId the primary key of the current vcms category
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms category
	* @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	*/
	public static VcmsCategory[] findByPortion_PrevAndNext(
		java.lang.String categoryId, long groupId, java.lang.String language,
		java.lang.String portionId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence()
				   .findByPortion_PrevAndNext(categoryId, groupId, language,
			portionId, orderByComparator);
	}

	/**
	* Removes all the vcms categories where groupId = &#63; and language = &#63; and portionId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	*/
	public static void removeByPortion(long groupId, java.lang.String language,
		java.lang.String portionId) {
		getPersistence().removeByPortion(groupId, language, portionId);
	}

	/**
	* Returns the number of vcms categories where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @return the number of matching vcms categories
	*/
	public static int countByPortion(long groupId, java.lang.String language,
		java.lang.String portionId) {
		return getPersistence().countByPortion(groupId, language, portionId);
	}

	/**
	* Returns all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @return the matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId) {
		return getPersistence().findByG_L_P(groupId, language, parentId);
	}

	/**
	* Returns a range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start, int end) {
		return getPersistence()
				   .findByG_L_P(groupId, language, parentId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start,
		int end, OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence()
				   .findByG_L_P(groupId, language, parentId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start,
		int end, OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_P(groupId, language, parentId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public static VcmsCategory findByG_L_P_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence()
				   .findByG_L_P_First(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public static VcmsCategory fetchByG_L_P_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_P_First(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public static VcmsCategory findByG_L_P_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence()
				   .findByG_L_P_Last(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public static VcmsCategory fetchByG_L_P_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_P_Last(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Returns the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param categoryId the primary key of the current vcms category
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms category
	* @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	*/
	public static VcmsCategory[] findByG_L_P_PrevAndNext(
		java.lang.String categoryId, long groupId, java.lang.String language,
		java.lang.String parentId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence()
				   .findByG_L_P_PrevAndNext(categoryId, groupId, language,
			parentId, orderByComparator);
	}

	/**
	* Removes all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; from the database.
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
	* Returns the number of vcms categories where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @return the number of matching vcms categories
	*/
	public static int countByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId) {
		return getPersistence().countByG_L_P(groupId, language, parentId);
	}

	/**
	* Returns all the vcms categories where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L(long groupId,
		java.lang.String language) {
		return getPersistence().findByG_L(groupId, language);
	}

	/**
	* Returns a range of all the vcms categories where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByG_L(groupId, language, start, end);
	}

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public static VcmsCategory findByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence()
				   .findByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public static VcmsCategory fetchByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public static VcmsCategory findByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence()
				   .findByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public static VcmsCategory fetchByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param categoryId the primary key of the current vcms category
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms category
	* @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	*/
	public static VcmsCategory[] findByG_L_PrevAndNext(
		java.lang.String categoryId, long groupId, java.lang.String language,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence()
				   .findByG_L_PrevAndNext(categoryId, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the vcms categories where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByG_L(long groupId, java.lang.String language) {
		getPersistence().removeByG_L(groupId, language);
	}

	/**
	* Returns the number of vcms categories where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching vcms categories
	*/
	public static int countByG_L(long groupId, java.lang.String language) {
		return getPersistence().countByG_L(groupId, language);
	}

	/**
	* Returns all the vcms categories where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_C(java.lang.String categoryId) {
		return getPersistence().findByG_L_C(categoryId);
	}

	/**
	* Returns a range of all the vcms categories where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_C(java.lang.String categoryId,
		int start, int end) {
		return getPersistence().findByG_L_C(categoryId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms categories where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_C(java.lang.String categoryId,
		int start, int end, OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence()
				   .findByG_L_C(categoryId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms categories where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_C(java.lang.String categoryId,
		int start, int end, OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_C(categoryId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms category in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public static VcmsCategory findByG_L_C_First(java.lang.String categoryId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence().findByG_L_C_First(categoryId, orderByComparator);
	}

	/**
	* Returns the first vcms category in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public static VcmsCategory fetchByG_L_C_First(java.lang.String categoryId,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence().fetchByG_L_C_First(categoryId, orderByComparator);
	}

	/**
	* Returns the last vcms category in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public static VcmsCategory findByG_L_C_Last(java.lang.String categoryId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence().findByG_L_C_Last(categoryId, orderByComparator);
	}

	/**
	* Returns the last vcms category in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public static VcmsCategory fetchByG_L_C_Last(java.lang.String categoryId,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence().fetchByG_L_C_Last(categoryId, orderByComparator);
	}

	/**
	* Returns all the vcms categories where categoryId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryIds the category IDs
	* @return the matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_C(java.lang.String[] categoryIds) {
		return getPersistence().findByG_L_C(categoryIds);
	}

	/**
	* Returns a range of all the vcms categories where categoryId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryIds the category IDs
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_C(
		java.lang.String[] categoryIds, int start, int end) {
		return getPersistence().findByG_L_C(categoryIds, start, end);
	}

	/**
	* Returns an ordered range of all the vcms categories where categoryId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryIds the category IDs
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_C(
		java.lang.String[] categoryIds, int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence()
				   .findByG_L_C(categoryIds, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms categories where categoryId = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_C(
		java.lang.String[] categoryIds, int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_C(categoryIds, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Removes all the vcms categories where categoryId = &#63; from the database.
	*
	* @param categoryId the category ID
	*/
	public static void removeByG_L_C(java.lang.String categoryId) {
		getPersistence().removeByG_L_C(categoryId);
	}

	/**
	* Returns the number of vcms categories where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the number of matching vcms categories
	*/
	public static int countByG_L_C(java.lang.String categoryId) {
		return getPersistence().countByG_L_C(categoryId);
	}

	/**
	* Returns the number of vcms categories where categoryId = any &#63;.
	*
	* @param categoryIds the category IDs
	* @return the number of matching vcms categories
	*/
	public static int countByG_L_C(java.lang.String[] categoryIds) {
		return getPersistence().countByG_L_C(categoryIds);
	}

	/**
	* Returns all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @return the matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_P_P(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId) {
		return getPersistence()
				   .findByG_L_P_P(groupId, language, parentId, portionId);
	}

	/**
	* Returns a range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_P_P(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId, int start, int end) {
		return getPersistence()
				   .findByG_L_P_P(groupId, language, parentId, portionId,
			start, end);
	}

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_P_P(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId, int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence()
				   .findByG_L_P_P(groupId, language, parentId, portionId,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms categories
	*/
	public static List<VcmsCategory> findByG_L_P_P(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId, int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_P_P(groupId, language, parentId, portionId,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public static VcmsCategory findByG_L_P_P_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence()
				   .findByG_L_P_P_First(groupId, language, parentId, portionId,
			orderByComparator);
	}

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public static VcmsCategory fetchByG_L_P_P_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_P_P_First(groupId, language, parentId,
			portionId, orderByComparator);
	}

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public static VcmsCategory findByG_L_P_P_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence()
				   .findByG_L_P_P_Last(groupId, language, parentId, portionId,
			orderByComparator);
	}

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public static VcmsCategory fetchByG_L_P_P_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_P_P_Last(groupId, language, parentId, portionId,
			orderByComparator);
	}

	/**
	* Returns the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* @param categoryId the primary key of the current vcms category
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms category
	* @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	*/
	public static VcmsCategory[] findByG_L_P_P_PrevAndNext(
		java.lang.String categoryId, long groupId, java.lang.String language,
		java.lang.String parentId, java.lang.String portionId,
		OrderByComparator<VcmsCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence()
				   .findByG_L_P_P_PrevAndNext(categoryId, groupId, language,
			parentId, portionId, orderByComparator);
	}

	/**
	* Removes all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	*/
	public static void removeByG_L_P_P(long groupId, java.lang.String language,
		java.lang.String parentId, java.lang.String portionId) {
		getPersistence().removeByG_L_P_P(groupId, language, parentId, portionId);
	}

	/**
	* Returns the number of vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @return the number of matching vcms categories
	*/
	public static int countByG_L_P_P(long groupId, java.lang.String language,
		java.lang.String parentId, java.lang.String portionId) {
		return getPersistence()
				   .countByG_L_P_P(groupId, language, parentId, portionId);
	}

	/**
	* Caches the vcms category in the entity cache if it is enabled.
	*
	* @param vcmsCategory the vcms category
	*/
	public static void cacheResult(VcmsCategory vcmsCategory) {
		getPersistence().cacheResult(vcmsCategory);
	}

	/**
	* Caches the vcms categories in the entity cache if it is enabled.
	*
	* @param vcmsCategories the vcms categories
	*/
	public static void cacheResult(List<VcmsCategory> vcmsCategories) {
		getPersistence().cacheResult(vcmsCategories);
	}

	/**
	* Creates a new vcms category with the primary key. Does not add the vcms category to the database.
	*
	* @param categoryId the primary key for the new vcms category
	* @return the new vcms category
	*/
	public static VcmsCategory create(java.lang.String categoryId) {
		return getPersistence().create(categoryId);
	}

	/**
	* Removes the vcms category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryId the primary key of the vcms category
	* @return the vcms category that was removed
	* @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	*/
	public static VcmsCategory remove(java.lang.String categoryId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence().remove(categoryId);
	}

	public static VcmsCategory updateImpl(VcmsCategory vcmsCategory) {
		return getPersistence().updateImpl(vcmsCategory);
	}

	/**
	* Returns the vcms category with the primary key or throws a {@link NoSuchVcmsCategoryException} if it could not be found.
	*
	* @param categoryId the primary key of the vcms category
	* @return the vcms category
	* @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	*/
	public static VcmsCategory findByPrimaryKey(java.lang.String categoryId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCategoryException {
		return getPersistence().findByPrimaryKey(categoryId);
	}

	/**
	* Returns the vcms category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param categoryId the primary key of the vcms category
	* @return the vcms category, or <code>null</code> if a vcms category with the primary key could not be found
	*/
	public static VcmsCategory fetchByPrimaryKey(java.lang.String categoryId) {
		return getPersistence().fetchByPrimaryKey(categoryId);
	}

	public static java.util.Map<java.io.Serializable, VcmsCategory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms categories.
	*
	* @return the vcms categories
	*/
	public static List<VcmsCategory> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of vcms categories
	*/
	public static List<VcmsCategory> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms categories
	*/
	public static List<VcmsCategory> findAll(int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms categories
	*/
	public static List<VcmsCategory> findAll(int start, int end,
		OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms categories from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms categories.
	*
	* @return the number of vcms categories
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VcmsCategoryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsCategoryPersistence, VcmsCategoryPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsCategoryPersistence.class);
}