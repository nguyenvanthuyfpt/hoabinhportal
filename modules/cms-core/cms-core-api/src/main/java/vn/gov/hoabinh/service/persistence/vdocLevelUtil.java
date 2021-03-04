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

import vn.gov.hoabinh.model.vdocLevel;

import java.util.List;

/**
 * The persistence utility for the vdoc level service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.vdocLevelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocLevelPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.vdocLevelPersistenceImpl
 * @generated
 */
@ProviderType
public class vdocLevelUtil {
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
	public static void clearCache(vdocLevel vdocLevel) {
		getPersistence().clearCache(vdocLevel);
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
	public static List<vdocLevel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<vdocLevel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<vdocLevel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<vdocLevel> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static vdocLevel update(vdocLevel vdocLevel) {
		return getPersistence().update(vdocLevel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static vdocLevel update(vdocLevel vdocLevel,
		ServiceContext serviceContext) {
		return getPersistence().update(vdocLevel, serviceContext);
	}

	/**
	* Returns all the vdoc levels where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching vdoc levels
	*/
	public static List<vdocLevel> findByG_L(long groupId,
		java.lang.String language) {
		return getPersistence().findByG_L(groupId, language);
	}

	/**
	* Returns a range of all the vdoc levels where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vdoc levels
	* @param end the upper bound of the range of vdoc levels (not inclusive)
	* @return the range of matching vdoc levels
	*/
	public static List<vdocLevel> findByG_L(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByG_L(groupId, language, start, end);
	}

	/**
	* Returns an ordered range of all the vdoc levels where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vdoc levels
	* @param end the upper bound of the range of vdoc levels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc levels
	*/
	public static List<vdocLevel> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<vdocLevel> orderByComparator) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vdoc levels where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vdoc levels
	* @param end the upper bound of the range of vdoc levels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc levels
	*/
	public static List<vdocLevel> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<vdocLevel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vdoc level in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc level
	* @throws NoSuchvdocLevelException if a matching vdoc level could not be found
	*/
	public static vdocLevel findByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<vdocLevel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocLevelException {
		return getPersistence()
				   .findByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first vdoc level in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc level, or <code>null</code> if a matching vdoc level could not be found
	*/
	public static vdocLevel fetchByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<vdocLevel> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vdoc level in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc level
	* @throws NoSuchvdocLevelException if a matching vdoc level could not be found
	*/
	public static vdocLevel findByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<vdocLevel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocLevelException {
		return getPersistence()
				   .findByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vdoc level in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc level, or <code>null</code> if a matching vdoc level could not be found
	*/
	public static vdocLevel fetchByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<vdocLevel> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the vdoc levels before and after the current vdoc level in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param levelId the primary key of the current vdoc level
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc level
	* @throws NoSuchvdocLevelException if a vdoc level with the primary key could not be found
	*/
	public static vdocLevel[] findByG_L_PrevAndNext(java.lang.String levelId,
		long groupId, java.lang.String language,
		OrderByComparator<vdocLevel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocLevelException {
		return getPersistence()
				   .findByG_L_PrevAndNext(levelId, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the vdoc levels where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByG_L(long groupId, java.lang.String language) {
		getPersistence().removeByG_L(groupId, language);
	}

	/**
	* Returns the number of vdoc levels where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching vdoc levels
	*/
	public static int countByG_L(long groupId, java.lang.String language) {
		return getPersistence().countByG_L(groupId, language);
	}

	/**
	* Caches the vdoc level in the entity cache if it is enabled.
	*
	* @param vdocLevel the vdoc level
	*/
	public static void cacheResult(vdocLevel vdocLevel) {
		getPersistence().cacheResult(vdocLevel);
	}

	/**
	* Caches the vdoc levels in the entity cache if it is enabled.
	*
	* @param vdocLevels the vdoc levels
	*/
	public static void cacheResult(List<vdocLevel> vdocLevels) {
		getPersistence().cacheResult(vdocLevels);
	}

	/**
	* Creates a new vdoc level with the primary key. Does not add the vdoc level to the database.
	*
	* @param levelId the primary key for the new vdoc level
	* @return the new vdoc level
	*/
	public static vdocLevel create(java.lang.String levelId) {
		return getPersistence().create(levelId);
	}

	/**
	* Removes the vdoc level with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param levelId the primary key of the vdoc level
	* @return the vdoc level that was removed
	* @throws NoSuchvdocLevelException if a vdoc level with the primary key could not be found
	*/
	public static vdocLevel remove(java.lang.String levelId)
		throws vn.gov.hoabinh.exception.NoSuchvdocLevelException {
		return getPersistence().remove(levelId);
	}

	public static vdocLevel updateImpl(vdocLevel vdocLevel) {
		return getPersistence().updateImpl(vdocLevel);
	}

	/**
	* Returns the vdoc level with the primary key or throws a {@link NoSuchvdocLevelException} if it could not be found.
	*
	* @param levelId the primary key of the vdoc level
	* @return the vdoc level
	* @throws NoSuchvdocLevelException if a vdoc level with the primary key could not be found
	*/
	public static vdocLevel findByPrimaryKey(java.lang.String levelId)
		throws vn.gov.hoabinh.exception.NoSuchvdocLevelException {
		return getPersistence().findByPrimaryKey(levelId);
	}

	/**
	* Returns the vdoc level with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param levelId the primary key of the vdoc level
	* @return the vdoc level, or <code>null</code> if a vdoc level with the primary key could not be found
	*/
	public static vdocLevel fetchByPrimaryKey(java.lang.String levelId) {
		return getPersistence().fetchByPrimaryKey(levelId);
	}

	public static java.util.Map<java.io.Serializable, vdocLevel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vdoc levels.
	*
	* @return the vdoc levels
	*/
	public static List<vdocLevel> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vdoc levels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc levels
	* @param end the upper bound of the range of vdoc levels (not inclusive)
	* @return the range of vdoc levels
	*/
	public static List<vdocLevel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vdoc levels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc levels
	* @param end the upper bound of the range of vdoc levels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vdoc levels
	*/
	public static List<vdocLevel> findAll(int start, int end,
		OrderByComparator<vdocLevel> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vdoc levels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc levels
	* @param end the upper bound of the range of vdoc levels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vdoc levels
	*/
	public static List<vdocLevel> findAll(int start, int end,
		OrderByComparator<vdocLevel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vdoc levels from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vdoc levels.
	*
	* @return the number of vdoc levels
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static vdocLevelPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<vdocLevelPersistence, vdocLevelPersistence> _serviceTracker =
		ServiceTrackerFactory.open(vdocLevelPersistence.class);
}