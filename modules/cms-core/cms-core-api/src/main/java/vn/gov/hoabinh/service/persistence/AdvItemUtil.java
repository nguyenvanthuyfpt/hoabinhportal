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

import vn.gov.hoabinh.model.AdvItem;

import java.util.List;

/**
 * The persistence utility for the adv item service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.AdvItemPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvItemPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.AdvItemPersistenceImpl
 * @generated
 */
@ProviderType
public class AdvItemUtil {
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
	public static void clearCache(AdvItem advItem) {
		getPersistence().clearCache(advItem);
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
	public static List<AdvItem> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AdvItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AdvItem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AdvItem update(AdvItem advItem) {
		return getPersistence().update(advItem);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AdvItem update(AdvItem advItem, ServiceContext serviceContext) {
		return getPersistence().update(advItem, serviceContext);
	}

	/**
	* Returns all the adv items where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching adv items
	*/
	public static List<AdvItem> findByG(long groupId) {
		return getPersistence().findByG(groupId);
	}

	/**
	* Returns a range of all the adv items where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of matching adv items
	*/
	public static List<AdvItem> findByG(long groupId, int start, int end) {
		return getPersistence().findByG(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the adv items where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching adv items
	*/
	public static List<AdvItem> findByG(long groupId, int start, int end,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence().findByG(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the adv items where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching adv items
	*/
	public static List<AdvItem> findByG(long groupId, int start, int end,
		OrderByComparator<AdvItem> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByG(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first adv item in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public static AdvItem findByG_First(long groupId,
		OrderByComparator<AdvItem> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence().findByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the first adv item in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public static AdvItem fetchByG_First(long groupId,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence().fetchByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the last adv item in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public static AdvItem findByG_Last(long groupId,
		OrderByComparator<AdvItem> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence().findByG_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last adv item in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public static AdvItem fetchByG_Last(long groupId,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence().fetchByG_Last(groupId, orderByComparator);
	}

	/**
	* Returns the adv items before and after the current adv item in the ordered set where groupId = &#63;.
	*
	* @param itemId the primary key of the current adv item
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public static AdvItem[] findByG_PrevAndNext(long itemId, long groupId,
		OrderByComparator<AdvItem> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_PrevAndNext(itemId, groupId, orderByComparator);
	}

	/**
	* Removes all the adv items where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByG(long groupId) {
		getPersistence().removeByG(groupId);
	}

	/**
	* Returns the number of adv items where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching adv items
	*/
	public static int countByG(long groupId) {
		return getPersistence().countByG(groupId);
	}

	/**
	* Returns all the adv items where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the matching adv items
	*/
	public static List<AdvItem> findByT(long typeId) {
		return getPersistence().findByT(typeId);
	}

	/**
	* Returns a range of all the adv items where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of matching adv items
	*/
	public static List<AdvItem> findByT(long typeId, int start, int end) {
		return getPersistence().findByT(typeId, start, end);
	}

	/**
	* Returns an ordered range of all the adv items where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching adv items
	*/
	public static List<AdvItem> findByT(long typeId, int start, int end,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence().findByT(typeId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the adv items where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching adv items
	*/
	public static List<AdvItem> findByT(long typeId, int start, int end,
		OrderByComparator<AdvItem> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByT(typeId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first adv item in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public static AdvItem findByT_First(long typeId,
		OrderByComparator<AdvItem> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence().findByT_First(typeId, orderByComparator);
	}

	/**
	* Returns the first adv item in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public static AdvItem fetchByT_First(long typeId,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence().fetchByT_First(typeId, orderByComparator);
	}

	/**
	* Returns the last adv item in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public static AdvItem findByT_Last(long typeId,
		OrderByComparator<AdvItem> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence().findByT_Last(typeId, orderByComparator);
	}

	/**
	* Returns the last adv item in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public static AdvItem fetchByT_Last(long typeId,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence().fetchByT_Last(typeId, orderByComparator);
	}

	/**
	* Returns the adv items before and after the current adv item in the ordered set where typeId = &#63;.
	*
	* @param itemId the primary key of the current adv item
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public static AdvItem[] findByT_PrevAndNext(long itemId, long typeId,
		OrderByComparator<AdvItem> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence()
				   .findByT_PrevAndNext(itemId, typeId, orderByComparator);
	}

	/**
	* Removes all the adv items where typeId = &#63; from the database.
	*
	* @param typeId the type ID
	*/
	public static void removeByT(long typeId) {
		getPersistence().removeByT(typeId);
	}

	/**
	* Returns the number of adv items where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the number of matching adv items
	*/
	public static int countByT(long typeId) {
		return getPersistence().countByT(typeId);
	}

	/**
	* Returns all the adv items where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @return the matching adv items
	*/
	public static List<AdvItem> findByG_T(long groupId, long typeId) {
		return getPersistence().findByG_T(groupId, typeId);
	}

	/**
	* Returns a range of all the adv items where groupId = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of matching adv items
	*/
	public static List<AdvItem> findByG_T(long groupId, long typeId, int start,
		int end) {
		return getPersistence().findByG_T(groupId, typeId, start, end);
	}

	/**
	* Returns an ordered range of all the adv items where groupId = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching adv items
	*/
	public static List<AdvItem> findByG_T(long groupId, long typeId, int start,
		int end, OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence()
				   .findByG_T(groupId, typeId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the adv items where groupId = &#63; and typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching adv items
	*/
	public static List<AdvItem> findByG_T(long groupId, long typeId, int start,
		int end, OrderByComparator<AdvItem> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_T(groupId, typeId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public static AdvItem findByG_T_First(long groupId, long typeId,
		OrderByComparator<AdvItem> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_T_First(groupId, typeId, orderByComparator);
	}

	/**
	* Returns the first adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public static AdvItem fetchByG_T_First(long groupId, long typeId,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence()
				   .fetchByG_T_First(groupId, typeId, orderByComparator);
	}

	/**
	* Returns the last adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public static AdvItem findByG_T_Last(long groupId, long typeId,
		OrderByComparator<AdvItem> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_T_Last(groupId, typeId, orderByComparator);
	}

	/**
	* Returns the last adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public static AdvItem fetchByG_T_Last(long groupId, long typeId,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence()
				   .fetchByG_T_Last(groupId, typeId, orderByComparator);
	}

	/**
	* Returns the adv items before and after the current adv item in the ordered set where groupId = &#63; and typeId = &#63;.
	*
	* @param itemId the primary key of the current adv item
	* @param groupId the group ID
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public static AdvItem[] findByG_T_PrevAndNext(long itemId, long groupId,
		long typeId, OrderByComparator<AdvItem> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_T_PrevAndNext(itemId, groupId, typeId,
			orderByComparator);
	}

	/**
	* Removes all the adv items where groupId = &#63; and typeId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	*/
	public static void removeByG_T(long groupId, long typeId) {
		getPersistence().removeByG_T(groupId, typeId);
	}

	/**
	* Returns the number of adv items where groupId = &#63; and typeId = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @return the number of matching adv items
	*/
	public static int countByG_T(long groupId, long typeId) {
		return getPersistence().countByG_T(groupId, typeId);
	}

	/**
	* Returns all the adv items where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching adv items
	*/
	public static List<AdvItem> findByG_S(long groupId, boolean status) {
		return getPersistence().findByG_S(groupId, status);
	}

	/**
	* Returns a range of all the adv items where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of matching adv items
	*/
	public static List<AdvItem> findByG_S(long groupId, boolean status,
		int start, int end) {
		return getPersistence().findByG_S(groupId, status, start, end);
	}

	/**
	* Returns an ordered range of all the adv items where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching adv items
	*/
	public static List<AdvItem> findByG_S(long groupId, boolean status,
		int start, int end, OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence()
				   .findByG_S(groupId, status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the adv items where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching adv items
	*/
	public static List<AdvItem> findByG_S(long groupId, boolean status,
		int start, int end, OrderByComparator<AdvItem> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_S(groupId, status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first adv item in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public static AdvItem findByG_S_First(long groupId, boolean status,
		OrderByComparator<AdvItem> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_S_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the first adv item in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public static AdvItem fetchByG_S_First(long groupId, boolean status,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence()
				   .fetchByG_S_First(groupId, status, orderByComparator);
	}

	/**
	* Returns the last adv item in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public static AdvItem findByG_S_Last(long groupId, boolean status,
		OrderByComparator<AdvItem> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_S_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the last adv item in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public static AdvItem fetchByG_S_Last(long groupId, boolean status,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence()
				   .fetchByG_S_Last(groupId, status, orderByComparator);
	}

	/**
	* Returns the adv items before and after the current adv item in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param itemId the primary key of the current adv item
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public static AdvItem[] findByG_S_PrevAndNext(long itemId, long groupId,
		boolean status, OrderByComparator<AdvItem> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_S_PrevAndNext(itemId, groupId, status,
			orderByComparator);
	}

	/**
	* Removes all the adv items where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public static void removeByG_S(long groupId, boolean status) {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	* Returns the number of adv items where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching adv items
	*/
	public static int countByG_S(long groupId, boolean status) {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	* Returns all the adv items where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @return the matching adv items
	*/
	public static List<AdvItem> findByG_T_S(long groupId, long typeId,
		boolean status) {
		return getPersistence().findByG_T_S(groupId, typeId, status);
	}

	/**
	* Returns a range of all the adv items where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of matching adv items
	*/
	public static List<AdvItem> findByG_T_S(long groupId, long typeId,
		boolean status, int start, int end) {
		return getPersistence().findByG_T_S(groupId, typeId, status, start, end);
	}

	/**
	* Returns an ordered range of all the adv items where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching adv items
	*/
	public static List<AdvItem> findByG_T_S(long groupId, long typeId,
		boolean status, int start, int end,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence()
				   .findByG_T_S(groupId, typeId, status, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the adv items where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching adv items
	*/
	public static List<AdvItem> findByG_T_S(long groupId, long typeId,
		boolean status, int start, int end,
		OrderByComparator<AdvItem> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_T_S(groupId, typeId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first adv item in the ordered set where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public static AdvItem findByG_T_S_First(long groupId, long typeId,
		boolean status, OrderByComparator<AdvItem> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_T_S_First(groupId, typeId, status, orderByComparator);
	}

	/**
	* Returns the first adv item in the ordered set where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public static AdvItem fetchByG_T_S_First(long groupId, long typeId,
		boolean status, OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence()
				   .fetchByG_T_S_First(groupId, typeId, status,
			orderByComparator);
	}

	/**
	* Returns the last adv item in the ordered set where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item
	* @throws NoSuchAdvItemException if a matching adv item could not be found
	*/
	public static AdvItem findByG_T_S_Last(long groupId, long typeId,
		boolean status, OrderByComparator<AdvItem> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_T_S_Last(groupId, typeId, status, orderByComparator);
	}

	/**
	* Returns the last adv item in the ordered set where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching adv item, or <code>null</code> if a matching adv item could not be found
	*/
	public static AdvItem fetchByG_T_S_Last(long groupId, long typeId,
		boolean status, OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence()
				   .fetchByG_T_S_Last(groupId, typeId, status, orderByComparator);
	}

	/**
	* Returns the adv items before and after the current adv item in the ordered set where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* @param itemId the primary key of the current adv item
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public static AdvItem[] findByG_T_S_PrevAndNext(long itemId, long groupId,
		long typeId, boolean status,
		OrderByComparator<AdvItem> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence()
				   .findByG_T_S_PrevAndNext(itemId, groupId, typeId, status,
			orderByComparator);
	}

	/**
	* Removes all the adv items where groupId = &#63; and typeId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	*/
	public static void removeByG_T_S(long groupId, long typeId, boolean status) {
		getPersistence().removeByG_T_S(groupId, typeId, status);
	}

	/**
	* Returns the number of adv items where groupId = &#63; and typeId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param typeId the type ID
	* @param status the status
	* @return the number of matching adv items
	*/
	public static int countByG_T_S(long groupId, long typeId, boolean status) {
		return getPersistence().countByG_T_S(groupId, typeId, status);
	}

	/**
	* Caches the adv item in the entity cache if it is enabled.
	*
	* @param advItem the adv item
	*/
	public static void cacheResult(AdvItem advItem) {
		getPersistence().cacheResult(advItem);
	}

	/**
	* Caches the adv items in the entity cache if it is enabled.
	*
	* @param advItems the adv items
	*/
	public static void cacheResult(List<AdvItem> advItems) {
		getPersistence().cacheResult(advItems);
	}

	/**
	* Creates a new adv item with the primary key. Does not add the adv item to the database.
	*
	* @param itemId the primary key for the new adv item
	* @return the new adv item
	*/
	public static AdvItem create(long itemId) {
		return getPersistence().create(itemId);
	}

	/**
	* Removes the adv item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemId the primary key of the adv item
	* @return the adv item that was removed
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public static AdvItem remove(long itemId)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence().remove(itemId);
	}

	public static AdvItem updateImpl(AdvItem advItem) {
		return getPersistence().updateImpl(advItem);
	}

	/**
	* Returns the adv item with the primary key or throws a {@link NoSuchAdvItemException} if it could not be found.
	*
	* @param itemId the primary key of the adv item
	* @return the adv item
	* @throws NoSuchAdvItemException if a adv item with the primary key could not be found
	*/
	public static AdvItem findByPrimaryKey(long itemId)
		throws vn.gov.hoabinh.exception.NoSuchAdvItemException {
		return getPersistence().findByPrimaryKey(itemId);
	}

	/**
	* Returns the adv item with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param itemId the primary key of the adv item
	* @return the adv item, or <code>null</code> if a adv item with the primary key could not be found
	*/
	public static AdvItem fetchByPrimaryKey(long itemId) {
		return getPersistence().fetchByPrimaryKey(itemId);
	}

	public static java.util.Map<java.io.Serializable, AdvItem> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the adv items.
	*
	* @return the adv items
	*/
	public static List<AdvItem> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the adv items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of adv items
	*/
	public static List<AdvItem> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the adv items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of adv items
	*/
	public static List<AdvItem> findAll(int start, int end,
		OrderByComparator<AdvItem> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the adv items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of adv items
	*/
	public static List<AdvItem> findAll(int start, int end,
		OrderByComparator<AdvItem> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the adv items from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of adv items.
	*
	* @return the number of adv items
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AdvItemPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AdvItemPersistence, AdvItemPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AdvItemPersistence.class);
}