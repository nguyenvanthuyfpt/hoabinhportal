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

import vn.gov.hoabinh.model.VcmsThread;

import java.util.List;

/**
 * The persistence utility for the vcms thread service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsThreadPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsThreadPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsThreadPersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsThreadUtil {
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
	public static void clearCache(VcmsThread vcmsThread) {
		getPersistence().clearCache(vcmsThread);
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
	public static List<VcmsThread> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsThread> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsThread> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsThread> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsThread update(VcmsThread vcmsThread) {
		return getPersistence().update(vcmsThread);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsThread update(VcmsThread vcmsThread,
		ServiceContext serviceContext) {
		return getPersistence().update(vcmsThread, serviceContext);
	}

	/**
	* Returns all the vcms threads where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching vcms threads
	*/
	public static List<VcmsThread> findByP_L(long groupId,
		java.lang.String language) {
		return getPersistence().findByP_L(groupId, language);
	}

	/**
	* Returns a range of all the vcms threads where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsThreadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms threads
	* @param end the upper bound of the range of vcms threads (not inclusive)
	* @return the range of matching vcms threads
	*/
	public static List<VcmsThread> findByP_L(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByP_L(groupId, language, start, end);
	}

	/**
	* Returns an ordered range of all the vcms threads where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsThreadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms threads
	* @param end the upper bound of the range of vcms threads (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms threads
	*/
	public static List<VcmsThread> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VcmsThread> orderByComparator) {
		return getPersistence()
				   .findByP_L(groupId, language, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms threads where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsThreadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms threads
	* @param end the upper bound of the range of vcms threads (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms threads
	*/
	public static List<VcmsThread> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VcmsThread> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms thread in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms thread
	* @throws NoSuchVcmsThreadException if a matching vcms thread could not be found
	*/
	public static VcmsThread findByP_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsThread> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsThreadException {
		return getPersistence()
				   .findByP_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first vcms thread in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms thread, or <code>null</code> if a matching vcms thread could not be found
	*/
	public static VcmsThread fetchByP_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsThread> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vcms thread in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms thread
	* @throws NoSuchVcmsThreadException if a matching vcms thread could not be found
	*/
	public static VcmsThread findByP_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsThread> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsThreadException {
		return getPersistence()
				   .findByP_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vcms thread in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms thread, or <code>null</code> if a matching vcms thread could not be found
	*/
	public static VcmsThread fetchByP_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsThread> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the vcms threads before and after the current vcms thread in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param threadId the primary key of the current vcms thread
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms thread
	* @throws NoSuchVcmsThreadException if a vcms thread with the primary key could not be found
	*/
	public static VcmsThread[] findByP_L_PrevAndNext(
		java.lang.String threadId, long groupId, java.lang.String language,
		OrderByComparator<VcmsThread> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsThreadException {
		return getPersistence()
				   .findByP_L_PrevAndNext(threadId, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the vcms threads where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByP_L(long groupId, java.lang.String language) {
		getPersistence().removeByP_L(groupId, language);
	}

	/**
	* Returns the number of vcms threads where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching vcms threads
	*/
	public static int countByP_L(long groupId, java.lang.String language) {
		return getPersistence().countByP_L(groupId, language);
	}

	/**
	* Caches the vcms thread in the entity cache if it is enabled.
	*
	* @param vcmsThread the vcms thread
	*/
	public static void cacheResult(VcmsThread vcmsThread) {
		getPersistence().cacheResult(vcmsThread);
	}

	/**
	* Caches the vcms threads in the entity cache if it is enabled.
	*
	* @param vcmsThreads the vcms threads
	*/
	public static void cacheResult(List<VcmsThread> vcmsThreads) {
		getPersistence().cacheResult(vcmsThreads);
	}

	/**
	* Creates a new vcms thread with the primary key. Does not add the vcms thread to the database.
	*
	* @param threadId the primary key for the new vcms thread
	* @return the new vcms thread
	*/
	public static VcmsThread create(java.lang.String threadId) {
		return getPersistence().create(threadId);
	}

	/**
	* Removes the vcms thread with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param threadId the primary key of the vcms thread
	* @return the vcms thread that was removed
	* @throws NoSuchVcmsThreadException if a vcms thread with the primary key could not be found
	*/
	public static VcmsThread remove(java.lang.String threadId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsThreadException {
		return getPersistence().remove(threadId);
	}

	public static VcmsThread updateImpl(VcmsThread vcmsThread) {
		return getPersistence().updateImpl(vcmsThread);
	}

	/**
	* Returns the vcms thread with the primary key or throws a {@link NoSuchVcmsThreadException} if it could not be found.
	*
	* @param threadId the primary key of the vcms thread
	* @return the vcms thread
	* @throws NoSuchVcmsThreadException if a vcms thread with the primary key could not be found
	*/
	public static VcmsThread findByPrimaryKey(java.lang.String threadId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsThreadException {
		return getPersistence().findByPrimaryKey(threadId);
	}

	/**
	* Returns the vcms thread with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param threadId the primary key of the vcms thread
	* @return the vcms thread, or <code>null</code> if a vcms thread with the primary key could not be found
	*/
	public static VcmsThread fetchByPrimaryKey(java.lang.String threadId) {
		return getPersistence().fetchByPrimaryKey(threadId);
	}

	public static java.util.Map<java.io.Serializable, VcmsThread> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms threads.
	*
	* @return the vcms threads
	*/
	public static List<VcmsThread> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms threads.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsThreadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms threads
	* @param end the upper bound of the range of vcms threads (not inclusive)
	* @return the range of vcms threads
	*/
	public static List<VcmsThread> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms threads.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsThreadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms threads
	* @param end the upper bound of the range of vcms threads (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms threads
	*/
	public static List<VcmsThread> findAll(int start, int end,
		OrderByComparator<VcmsThread> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms threads.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsThreadModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms threads
	* @param end the upper bound of the range of vcms threads (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms threads
	*/
	public static List<VcmsThread> findAll(int start, int end,
		OrderByComparator<VcmsThread> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms threads from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms threads.
	*
	* @return the number of vcms threads
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VcmsThreadPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsThreadPersistence, VcmsThreadPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsThreadPersistence.class);
}