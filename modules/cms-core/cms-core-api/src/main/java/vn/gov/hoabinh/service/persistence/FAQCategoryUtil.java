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

import vn.gov.hoabinh.model.FAQCategory;

import java.util.List;

/**
 * The persistence utility for the f a q category service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.FAQCategoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQCategoryPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.FAQCategoryPersistenceImpl
 * @generated
 */
@ProviderType
public class FAQCategoryUtil {
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
	public static void clearCache(FAQCategory faqCategory) {
		getPersistence().clearCache(faqCategory);
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
	public static List<FAQCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FAQCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FAQCategory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FAQCategory update(FAQCategory faqCategory) {
		return getPersistence().update(faqCategory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FAQCategory update(FAQCategory faqCategory,
		ServiceContext serviceContext) {
		return getPersistence().update(faqCategory, serviceContext);
	}

	/**
	* Returns all the f a q categories where parent = &#63;.
	*
	* @param parent the parent
	* @return the matching f a q categories
	*/
	public static List<FAQCategory> findByParentId(long parent) {
		return getPersistence().findByParentId(parent);
	}

	/**
	* Returns a range of all the f a q categories where parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parent the parent
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @return the range of matching f a q categories
	*/
	public static List<FAQCategory> findByParentId(long parent, int start,
		int end) {
		return getPersistence().findByParentId(parent, start, end);
	}

	/**
	* Returns an ordered range of all the f a q categories where parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parent the parent
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q categories
	*/
	public static List<FAQCategory> findByParentId(long parent, int start,
		int end, OrderByComparator<FAQCategory> orderByComparator) {
		return getPersistence()
				   .findByParentId(parent, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q categories where parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parent the parent
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q categories
	*/
	public static List<FAQCategory> findByParentId(long parent, int start,
		int end, OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByParentId(parent, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first f a q category in the ordered set where parent = &#63;.
	*
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category
	* @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	*/
	public static FAQCategory findByParentId_First(long parent,
		OrderByComparator<FAQCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryException {
		return getPersistence().findByParentId_First(parent, orderByComparator);
	}

	/**
	* Returns the first f a q category in the ordered set where parent = &#63;.
	*
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public static FAQCategory fetchByParentId_First(long parent,
		OrderByComparator<FAQCategory> orderByComparator) {
		return getPersistence().fetchByParentId_First(parent, orderByComparator);
	}

	/**
	* Returns the last f a q category in the ordered set where parent = &#63;.
	*
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category
	* @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	*/
	public static FAQCategory findByParentId_Last(long parent,
		OrderByComparator<FAQCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryException {
		return getPersistence().findByParentId_Last(parent, orderByComparator);
	}

	/**
	* Returns the last f a q category in the ordered set where parent = &#63;.
	*
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public static FAQCategory fetchByParentId_Last(long parent,
		OrderByComparator<FAQCategory> orderByComparator) {
		return getPersistence().fetchByParentId_Last(parent, orderByComparator);
	}

	/**
	* Returns the f a q categories before and after the current f a q category in the ordered set where parent = &#63;.
	*
	* @param id the primary key of the current f a q category
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q category
	* @throws NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	*/
	public static FAQCategory[] findByParentId_PrevAndNext(long id,
		long parent, OrderByComparator<FAQCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByParentId_PrevAndNext(id, parent, orderByComparator);
	}

	/**
	* Removes all the f a q categories where parent = &#63; from the database.
	*
	* @param parent the parent
	*/
	public static void removeByParentId(long parent) {
		getPersistence().removeByParentId(parent);
	}

	/**
	* Returns the number of f a q categories where parent = &#63;.
	*
	* @param parent the parent
	* @return the number of matching f a q categories
	*/
	public static int countByParentId(long parent) {
		return getPersistence().countByParentId(parent);
	}

	/**
	* Returns all the f a q categories where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching f a q categories
	*/
	public static List<FAQCategory> findByG_L(long groupId,
		java.lang.String language) {
		return getPersistence().findByG_L(groupId, language);
	}

	/**
	* Returns a range of all the f a q categories where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @return the range of matching f a q categories
	*/
	public static List<FAQCategory> findByG_L(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByG_L(groupId, language, start, end);
	}

	/**
	* Returns an ordered range of all the f a q categories where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q categories
	*/
	public static List<FAQCategory> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q categories where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q categories
	*/
	public static List<FAQCategory> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first f a q category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category
	* @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	*/
	public static FAQCategory findByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<FAQCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first f a q category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public static FAQCategory fetchByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<FAQCategory> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last f a q category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category
	* @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	*/
	public static FAQCategory findByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<FAQCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last f a q category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public static FAQCategory fetchByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<FAQCategory> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the f a q categories before and after the current f a q category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param id the primary key of the current f a q category
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q category
	* @throws NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	*/
	public static FAQCategory[] findByG_L_PrevAndNext(long id, long groupId,
		java.lang.String language,
		OrderByComparator<FAQCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByG_L_PrevAndNext(id, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the f a q categories where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByG_L(long groupId, java.lang.String language) {
		getPersistence().removeByG_L(groupId, language);
	}

	/**
	* Returns the number of f a q categories where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching f a q categories
	*/
	public static int countByG_L(long groupId, java.lang.String language) {
		return getPersistence().countByG_L(groupId, language);
	}

	/**
	* Returns all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	* @return the matching f a q categories
	*/
	public static List<FAQCategory> findByG_L_P(long groupId,
		java.lang.String language, long parent) {
		return getPersistence().findByG_L_P(groupId, language, parent);
	}

	/**
	* Returns a range of all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @return the range of matching f a q categories
	*/
	public static List<FAQCategory> findByG_L_P(long groupId,
		java.lang.String language, long parent, int start, int end) {
		return getPersistence()
				   .findByG_L_P(groupId, language, parent, start, end);
	}

	/**
	* Returns an ordered range of all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q categories
	*/
	public static List<FAQCategory> findByG_L_P(long groupId,
		java.lang.String language, long parent, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator) {
		return getPersistence()
				   .findByG_L_P(groupId, language, parent, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q categories
	*/
	public static List<FAQCategory> findByG_L_P(long groupId,
		java.lang.String language, long parent, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_P(groupId, language, parent, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first f a q category in the ordered set where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category
	* @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	*/
	public static FAQCategory findByG_L_P_First(long groupId,
		java.lang.String language, long parent,
		OrderByComparator<FAQCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByG_L_P_First(groupId, language, parent,
			orderByComparator);
	}

	/**
	* Returns the first f a q category in the ordered set where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public static FAQCategory fetchByG_L_P_First(long groupId,
		java.lang.String language, long parent,
		OrderByComparator<FAQCategory> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_P_First(groupId, language, parent,
			orderByComparator);
	}

	/**
	* Returns the last f a q category in the ordered set where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category
	* @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	*/
	public static FAQCategory findByG_L_P_Last(long groupId,
		java.lang.String language, long parent,
		OrderByComparator<FAQCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByG_L_P_Last(groupId, language, parent,
			orderByComparator);
	}

	/**
	* Returns the last f a q category in the ordered set where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public static FAQCategory fetchByG_L_P_Last(long groupId,
		java.lang.String language, long parent,
		OrderByComparator<FAQCategory> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_P_Last(groupId, language, parent,
			orderByComparator);
	}

	/**
	* Returns the f a q categories before and after the current f a q category in the ordered set where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* @param id the primary key of the current f a q category
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q category
	* @throws NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	*/
	public static FAQCategory[] findByG_L_P_PrevAndNext(long id, long groupId,
		java.lang.String language, long parent,
		OrderByComparator<FAQCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryException {
		return getPersistence()
				   .findByG_L_P_PrevAndNext(id, groupId, language, parent,
			orderByComparator);
	}

	/**
	* Removes all the f a q categories where groupId = &#63; and language = &#63; and parent = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	*/
	public static void removeByG_L_P(long groupId, java.lang.String language,
		long parent) {
		getPersistence().removeByG_L_P(groupId, language, parent);
	}

	/**
	* Returns the number of f a q categories where groupId = &#63; and language = &#63; and parent = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parent the parent
	* @return the number of matching f a q categories
	*/
	public static int countByG_L_P(long groupId, java.lang.String language,
		long parent) {
		return getPersistence().countByG_L_P(groupId, language, parent);
	}

	/**
	* Returns all the f a q categories where id = &#63;.
	*
	* @param id the ID
	* @return the matching f a q categories
	*/
	public static List<FAQCategory> findByMenu(long id) {
		return getPersistence().findByMenu(id);
	}

	/**
	* Returns a range of all the f a q categories where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @return the range of matching f a q categories
	*/
	public static List<FAQCategory> findByMenu(long id, int start, int end) {
		return getPersistence().findByMenu(id, start, end);
	}

	/**
	* Returns an ordered range of all the f a q categories where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q categories
	*/
	public static List<FAQCategory> findByMenu(long id, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator) {
		return getPersistence().findByMenu(id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q categories where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q categories
	*/
	public static List<FAQCategory> findByMenu(long id, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByMenu(id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first f a q category in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category
	* @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	*/
	public static FAQCategory findByMenu_First(long id,
		OrderByComparator<FAQCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryException {
		return getPersistence().findByMenu_First(id, orderByComparator);
	}

	/**
	* Returns the first f a q category in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public static FAQCategory fetchByMenu_First(long id,
		OrderByComparator<FAQCategory> orderByComparator) {
		return getPersistence().fetchByMenu_First(id, orderByComparator);
	}

	/**
	* Returns the last f a q category in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category
	* @throws NoSuchFAQCategoryException if a matching f a q category could not be found
	*/
	public static FAQCategory findByMenu_Last(long id,
		OrderByComparator<FAQCategory> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryException {
		return getPersistence().findByMenu_Last(id, orderByComparator);
	}

	/**
	* Returns the last f a q category in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category, or <code>null</code> if a matching f a q category could not be found
	*/
	public static FAQCategory fetchByMenu_Last(long id,
		OrderByComparator<FAQCategory> orderByComparator) {
		return getPersistence().fetchByMenu_Last(id, orderByComparator);
	}

	/**
	* Returns all the f a q categories where id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ids the IDs
	* @return the matching f a q categories
	*/
	public static List<FAQCategory> findByMenu(long[] ids) {
		return getPersistence().findByMenu(ids);
	}

	/**
	* Returns a range of all the f a q categories where id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ids the IDs
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @return the range of matching f a q categories
	*/
	public static List<FAQCategory> findByMenu(long[] ids, int start, int end) {
		return getPersistence().findByMenu(ids, start, end);
	}

	/**
	* Returns an ordered range of all the f a q categories where id = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param ids the IDs
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q categories
	*/
	public static List<FAQCategory> findByMenu(long[] ids, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator) {
		return getPersistence().findByMenu(ids, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q categories where id = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q categories
	*/
	public static List<FAQCategory> findByMenu(long[] ids, int start, int end,
		OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByMenu(ids, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Removes all the f a q categories where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public static void removeByMenu(long id) {
		getPersistence().removeByMenu(id);
	}

	/**
	* Returns the number of f a q categories where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching f a q categories
	*/
	public static int countByMenu(long id) {
		return getPersistence().countByMenu(id);
	}

	/**
	* Returns the number of f a q categories where id = any &#63;.
	*
	* @param ids the IDs
	* @return the number of matching f a q categories
	*/
	public static int countByMenu(long[] ids) {
		return getPersistence().countByMenu(ids);
	}

	/**
	* Caches the f a q category in the entity cache if it is enabled.
	*
	* @param faqCategory the f a q category
	*/
	public static void cacheResult(FAQCategory faqCategory) {
		getPersistence().cacheResult(faqCategory);
	}

	/**
	* Caches the f a q categories in the entity cache if it is enabled.
	*
	* @param faqCategories the f a q categories
	*/
	public static void cacheResult(List<FAQCategory> faqCategories) {
		getPersistence().cacheResult(faqCategories);
	}

	/**
	* Creates a new f a q category with the primary key. Does not add the f a q category to the database.
	*
	* @param id the primary key for the new f a q category
	* @return the new f a q category
	*/
	public static FAQCategory create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the f a q category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q category
	* @return the f a q category that was removed
	* @throws NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	*/
	public static FAQCategory remove(long id)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryException {
		return getPersistence().remove(id);
	}

	public static FAQCategory updateImpl(FAQCategory faqCategory) {
		return getPersistence().updateImpl(faqCategory);
	}

	/**
	* Returns the f a q category with the primary key or throws a {@link NoSuchFAQCategoryException} if it could not be found.
	*
	* @param id the primary key of the f a q category
	* @return the f a q category
	* @throws NoSuchFAQCategoryException if a f a q category with the primary key could not be found
	*/
	public static FAQCategory findByPrimaryKey(long id)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the f a q category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the f a q category
	* @return the f a q category, or <code>null</code> if a f a q category with the primary key could not be found
	*/
	public static FAQCategory fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, FAQCategory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the f a q categories.
	*
	* @return the f a q categories
	*/
	public static List<FAQCategory> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the f a q categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @return the range of f a q categories
	*/
	public static List<FAQCategory> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the f a q categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of f a q categories
	*/
	public static List<FAQCategory> findAll(int start, int end,
		OrderByComparator<FAQCategory> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of f a q categories
	*/
	public static List<FAQCategory> findAll(int start, int end,
		OrderByComparator<FAQCategory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the f a q categories from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of f a q categories.
	*
	* @return the number of f a q categories
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static FAQCategoryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FAQCategoryPersistence, FAQCategoryPersistence> _serviceTracker =
		ServiceTrackerFactory.open(FAQCategoryPersistence.class);
}