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

import vn.gov.hoabinh.model.VisitorTracker;

import java.util.List;

/**
 * The persistence utility for the visitor tracker service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VisitorTrackerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VisitorTrackerPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VisitorTrackerPersistenceImpl
 * @generated
 */
@ProviderType
public class VisitorTrackerUtil {
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
	public static void clearCache(VisitorTracker visitorTracker) {
		getPersistence().clearCache(visitorTracker);
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
	public static List<VisitorTracker> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VisitorTracker> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VisitorTracker> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VisitorTracker> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VisitorTracker update(VisitorTracker visitorTracker) {
		return getPersistence().update(visitorTracker);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VisitorTracker update(VisitorTracker visitorTracker,
		ServiceContext serviceContext) {
		return getPersistence().update(visitorTracker, serviceContext);
	}

	/**
	* Returns all the visitor trackers where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching visitor trackers
	*/
	public static List<VisitorTracker> findByC_G(long companyId, long groupId) {
		return getPersistence().findByC_G(companyId, groupId);
	}

	/**
	* Returns a range of all the visitor trackers where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VisitorTrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of visitor trackers
	* @param end the upper bound of the range of visitor trackers (not inclusive)
	* @return the range of matching visitor trackers
	*/
	public static List<VisitorTracker> findByC_G(long companyId, long groupId,
		int start, int end) {
		return getPersistence().findByC_G(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the visitor trackers where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VisitorTrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of visitor trackers
	* @param end the upper bound of the range of visitor trackers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching visitor trackers
	*/
	public static List<VisitorTracker> findByC_G(long companyId, long groupId,
		int start, int end, OrderByComparator<VisitorTracker> orderByComparator) {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the visitor trackers where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VisitorTrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of visitor trackers
	* @param end the upper bound of the range of visitor trackers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching visitor trackers
	*/
	public static List<VisitorTracker> findByC_G(long companyId, long groupId,
		int start, int end,
		OrderByComparator<VisitorTracker> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first visitor tracker in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching visitor tracker
	* @throws NoSuchVisitorTrackerException if a matching visitor tracker could not be found
	*/
	public static VisitorTracker findByC_G_First(long companyId, long groupId,
		OrderByComparator<VisitorTracker> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVisitorTrackerException {
		return getPersistence()
				   .findByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the first visitor tracker in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching visitor tracker, or <code>null</code> if a matching visitor tracker could not be found
	*/
	public static VisitorTracker fetchByC_G_First(long companyId, long groupId,
		OrderByComparator<VisitorTracker> orderByComparator) {
		return getPersistence()
				   .fetchByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last visitor tracker in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching visitor tracker
	* @throws NoSuchVisitorTrackerException if a matching visitor tracker could not be found
	*/
	public static VisitorTracker findByC_G_Last(long companyId, long groupId,
		OrderByComparator<VisitorTracker> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVisitorTrackerException {
		return getPersistence()
				   .findByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last visitor tracker in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching visitor tracker, or <code>null</code> if a matching visitor tracker could not be found
	*/
	public static VisitorTracker fetchByC_G_Last(long companyId, long groupId,
		OrderByComparator<VisitorTracker> orderByComparator) {
		return getPersistence()
				   .fetchByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the visitor trackers before and after the current visitor tracker in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param visitorId the primary key of the current visitor tracker
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next visitor tracker
	* @throws NoSuchVisitorTrackerException if a visitor tracker with the primary key could not be found
	*/
	public static VisitorTracker[] findByC_G_PrevAndNext(long visitorId,
		long companyId, long groupId,
		OrderByComparator<VisitorTracker> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVisitorTrackerException {
		return getPersistence()
				   .findByC_G_PrevAndNext(visitorId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the visitor trackers where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	*/
	public static void removeByC_G(long companyId, long groupId) {
		getPersistence().removeByC_G(companyId, groupId);
	}

	/**
	* Returns the number of visitor trackers where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching visitor trackers
	*/
	public static int countByC_G(long companyId, long groupId) {
		return getPersistence().countByC_G(companyId, groupId);
	}

	/**
	* Caches the visitor tracker in the entity cache if it is enabled.
	*
	* @param visitorTracker the visitor tracker
	*/
	public static void cacheResult(VisitorTracker visitorTracker) {
		getPersistence().cacheResult(visitorTracker);
	}

	/**
	* Caches the visitor trackers in the entity cache if it is enabled.
	*
	* @param visitorTrackers the visitor trackers
	*/
	public static void cacheResult(List<VisitorTracker> visitorTrackers) {
		getPersistence().cacheResult(visitorTrackers);
	}

	/**
	* Creates a new visitor tracker with the primary key. Does not add the visitor tracker to the database.
	*
	* @param visitorId the primary key for the new visitor tracker
	* @return the new visitor tracker
	*/
	public static VisitorTracker create(long visitorId) {
		return getPersistence().create(visitorId);
	}

	/**
	* Removes the visitor tracker with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param visitorId the primary key of the visitor tracker
	* @return the visitor tracker that was removed
	* @throws NoSuchVisitorTrackerException if a visitor tracker with the primary key could not be found
	*/
	public static VisitorTracker remove(long visitorId)
		throws vn.gov.hoabinh.exception.NoSuchVisitorTrackerException {
		return getPersistence().remove(visitorId);
	}

	public static VisitorTracker updateImpl(VisitorTracker visitorTracker) {
		return getPersistence().updateImpl(visitorTracker);
	}

	/**
	* Returns the visitor tracker with the primary key or throws a {@link NoSuchVisitorTrackerException} if it could not be found.
	*
	* @param visitorId the primary key of the visitor tracker
	* @return the visitor tracker
	* @throws NoSuchVisitorTrackerException if a visitor tracker with the primary key could not be found
	*/
	public static VisitorTracker findByPrimaryKey(long visitorId)
		throws vn.gov.hoabinh.exception.NoSuchVisitorTrackerException {
		return getPersistence().findByPrimaryKey(visitorId);
	}

	/**
	* Returns the visitor tracker with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param visitorId the primary key of the visitor tracker
	* @return the visitor tracker, or <code>null</code> if a visitor tracker with the primary key could not be found
	*/
	public static VisitorTracker fetchByPrimaryKey(long visitorId) {
		return getPersistence().fetchByPrimaryKey(visitorId);
	}

	public static java.util.Map<java.io.Serializable, VisitorTracker> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the visitor trackers.
	*
	* @return the visitor trackers
	*/
	public static List<VisitorTracker> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the visitor trackers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VisitorTrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of visitor trackers
	* @param end the upper bound of the range of visitor trackers (not inclusive)
	* @return the range of visitor trackers
	*/
	public static List<VisitorTracker> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the visitor trackers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VisitorTrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of visitor trackers
	* @param end the upper bound of the range of visitor trackers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of visitor trackers
	*/
	public static List<VisitorTracker> findAll(int start, int end,
		OrderByComparator<VisitorTracker> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the visitor trackers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VisitorTrackerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of visitor trackers
	* @param end the upper bound of the range of visitor trackers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of visitor trackers
	*/
	public static List<VisitorTracker> findAll(int start, int end,
		OrderByComparator<VisitorTracker> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the visitor trackers from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of visitor trackers.
	*
	* @return the number of visitor trackers
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VisitorTrackerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VisitorTrackerPersistence, VisitorTrackerPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VisitorTrackerPersistence.class);
}