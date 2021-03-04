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

import vn.gov.hoabinh.model.vdocLogger;

import java.util.List;

/**
 * The persistence utility for the vdoc logger service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.vdocLoggerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocLoggerPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.vdocLoggerPersistenceImpl
 * @generated
 */
@ProviderType
public class vdocLoggerUtil {
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
	public static void clearCache(vdocLogger vdocLogger) {
		getPersistence().clearCache(vdocLogger);
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
	public static List<vdocLogger> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<vdocLogger> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<vdocLogger> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<vdocLogger> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static vdocLogger update(vdocLogger vdocLogger) {
		return getPersistence().update(vdocLogger);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static vdocLogger update(vdocLogger vdocLogger,
		ServiceContext serviceContext) {
		return getPersistence().update(vdocLogger, serviceContext);
	}

	/**
	* Returns all the vdoc loggers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching vdoc loggers
	*/
	public static List<vdocLogger> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the vdoc loggers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of vdoc loggers
	* @param end the upper bound of the range of vdoc loggers (not inclusive)
	* @return the range of matching vdoc loggers
	*/
	public static List<vdocLogger> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the vdoc loggers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of vdoc loggers
	* @param end the upper bound of the range of vdoc loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc loggers
	*/
	public static List<vdocLogger> findByGroupId(long groupId, int start,
		int end, OrderByComparator<vdocLogger> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vdoc loggers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of vdoc loggers
	* @param end the upper bound of the range of vdoc loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc loggers
	*/
	public static List<vdocLogger> findByGroupId(long groupId, int start,
		int end, OrderByComparator<vdocLogger> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vdoc logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc logger
	* @throws NoSuchvdocLoggerException if a matching vdoc logger could not be found
	*/
	public static vdocLogger findByGroupId_First(long groupId,
		OrderByComparator<vdocLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocLoggerException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first vdoc logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc logger, or <code>null</code> if a matching vdoc logger could not be found
	*/
	public static vdocLogger fetchByGroupId_First(long groupId,
		OrderByComparator<vdocLogger> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last vdoc logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc logger
	* @throws NoSuchvdocLoggerException if a matching vdoc logger could not be found
	*/
	public static vdocLogger findByGroupId_Last(long groupId,
		OrderByComparator<vdocLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocLoggerException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last vdoc logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc logger, or <code>null</code> if a matching vdoc logger could not be found
	*/
	public static vdocLogger fetchByGroupId_Last(long groupId,
		OrderByComparator<vdocLogger> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the vdoc loggers before and after the current vdoc logger in the ordered set where groupId = &#63;.
	*
	* @param loggerId the primary key of the current vdoc logger
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc logger
	* @throws NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	*/
	public static vdocLogger[] findByGroupId_PrevAndNext(
		java.lang.String loggerId, long groupId,
		OrderByComparator<vdocLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocLoggerException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(loggerId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the vdoc loggers where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of vdoc loggers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching vdoc loggers
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the vdoc loggers where groupId = &#63; and entryId = &#63; and className = &#63;.
	*
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	* @return the matching vdoc loggers
	*/
	public static List<vdocLogger> findByG_E_C(long groupId,
		java.lang.String entryId, java.lang.String className) {
		return getPersistence().findByG_E_C(groupId, entryId, className);
	}

	/**
	* Returns a range of all the vdoc loggers where groupId = &#63; and entryId = &#63; and className = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	* @param start the lower bound of the range of vdoc loggers
	* @param end the upper bound of the range of vdoc loggers (not inclusive)
	* @return the range of matching vdoc loggers
	*/
	public static List<vdocLogger> findByG_E_C(long groupId,
		java.lang.String entryId, java.lang.String className, int start, int end) {
		return getPersistence()
				   .findByG_E_C(groupId, entryId, className, start, end);
	}

	/**
	* Returns an ordered range of all the vdoc loggers where groupId = &#63; and entryId = &#63; and className = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	* @param start the lower bound of the range of vdoc loggers
	* @param end the upper bound of the range of vdoc loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc loggers
	*/
	public static List<vdocLogger> findByG_E_C(long groupId,
		java.lang.String entryId, java.lang.String className, int start,
		int end, OrderByComparator<vdocLogger> orderByComparator) {
		return getPersistence()
				   .findByG_E_C(groupId, entryId, className, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vdoc loggers where groupId = &#63; and entryId = &#63; and className = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	* @param start the lower bound of the range of vdoc loggers
	* @param end the upper bound of the range of vdoc loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc loggers
	*/
	public static List<vdocLogger> findByG_E_C(long groupId,
		java.lang.String entryId, java.lang.String className, int start,
		int end, OrderByComparator<vdocLogger> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_E_C(groupId, entryId, className, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vdoc logger in the ordered set where groupId = &#63; and entryId = &#63; and className = &#63;.
	*
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc logger
	* @throws NoSuchvdocLoggerException if a matching vdoc logger could not be found
	*/
	public static vdocLogger findByG_E_C_First(long groupId,
		java.lang.String entryId, java.lang.String className,
		OrderByComparator<vdocLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocLoggerException {
		return getPersistence()
				   .findByG_E_C_First(groupId, entryId, className,
			orderByComparator);
	}

	/**
	* Returns the first vdoc logger in the ordered set where groupId = &#63; and entryId = &#63; and className = &#63;.
	*
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc logger, or <code>null</code> if a matching vdoc logger could not be found
	*/
	public static vdocLogger fetchByG_E_C_First(long groupId,
		java.lang.String entryId, java.lang.String className,
		OrderByComparator<vdocLogger> orderByComparator) {
		return getPersistence()
				   .fetchByG_E_C_First(groupId, entryId, className,
			orderByComparator);
	}

	/**
	* Returns the last vdoc logger in the ordered set where groupId = &#63; and entryId = &#63; and className = &#63;.
	*
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc logger
	* @throws NoSuchvdocLoggerException if a matching vdoc logger could not be found
	*/
	public static vdocLogger findByG_E_C_Last(long groupId,
		java.lang.String entryId, java.lang.String className,
		OrderByComparator<vdocLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocLoggerException {
		return getPersistence()
				   .findByG_E_C_Last(groupId, entryId, className,
			orderByComparator);
	}

	/**
	* Returns the last vdoc logger in the ordered set where groupId = &#63; and entryId = &#63; and className = &#63;.
	*
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc logger, or <code>null</code> if a matching vdoc logger could not be found
	*/
	public static vdocLogger fetchByG_E_C_Last(long groupId,
		java.lang.String entryId, java.lang.String className,
		OrderByComparator<vdocLogger> orderByComparator) {
		return getPersistence()
				   .fetchByG_E_C_Last(groupId, entryId, className,
			orderByComparator);
	}

	/**
	* Returns the vdoc loggers before and after the current vdoc logger in the ordered set where groupId = &#63; and entryId = &#63; and className = &#63;.
	*
	* @param loggerId the primary key of the current vdoc logger
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc logger
	* @throws NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	*/
	public static vdocLogger[] findByG_E_C_PrevAndNext(
		java.lang.String loggerId, long groupId, java.lang.String entryId,
		java.lang.String className,
		OrderByComparator<vdocLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocLoggerException {
		return getPersistence()
				   .findByG_E_C_PrevAndNext(loggerId, groupId, entryId,
			className, orderByComparator);
	}

	/**
	* Removes all the vdoc loggers where groupId = &#63; and entryId = &#63; and className = &#63; from the database.
	*
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	*/
	public static void removeByG_E_C(long groupId, java.lang.String entryId,
		java.lang.String className) {
		getPersistence().removeByG_E_C(groupId, entryId, className);
	}

	/**
	* Returns the number of vdoc loggers where groupId = &#63; and entryId = &#63; and className = &#63;.
	*
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	* @return the number of matching vdoc loggers
	*/
	public static int countByG_E_C(long groupId, java.lang.String entryId,
		java.lang.String className) {
		return getPersistence().countByG_E_C(groupId, entryId, className);
	}

	/**
	* Caches the vdoc logger in the entity cache if it is enabled.
	*
	* @param vdocLogger the vdoc logger
	*/
	public static void cacheResult(vdocLogger vdocLogger) {
		getPersistence().cacheResult(vdocLogger);
	}

	/**
	* Caches the vdoc loggers in the entity cache if it is enabled.
	*
	* @param vdocLoggers the vdoc loggers
	*/
	public static void cacheResult(List<vdocLogger> vdocLoggers) {
		getPersistence().cacheResult(vdocLoggers);
	}

	/**
	* Creates a new vdoc logger with the primary key. Does not add the vdoc logger to the database.
	*
	* @param loggerId the primary key for the new vdoc logger
	* @return the new vdoc logger
	*/
	public static vdocLogger create(java.lang.String loggerId) {
		return getPersistence().create(loggerId);
	}

	/**
	* Removes the vdoc logger with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loggerId the primary key of the vdoc logger
	* @return the vdoc logger that was removed
	* @throws NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	*/
	public static vdocLogger remove(java.lang.String loggerId)
		throws vn.gov.hoabinh.exception.NoSuchvdocLoggerException {
		return getPersistence().remove(loggerId);
	}

	public static vdocLogger updateImpl(vdocLogger vdocLogger) {
		return getPersistence().updateImpl(vdocLogger);
	}

	/**
	* Returns the vdoc logger with the primary key or throws a {@link NoSuchvdocLoggerException} if it could not be found.
	*
	* @param loggerId the primary key of the vdoc logger
	* @return the vdoc logger
	* @throws NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	*/
	public static vdocLogger findByPrimaryKey(java.lang.String loggerId)
		throws vn.gov.hoabinh.exception.NoSuchvdocLoggerException {
		return getPersistence().findByPrimaryKey(loggerId);
	}

	/**
	* Returns the vdoc logger with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loggerId the primary key of the vdoc logger
	* @return the vdoc logger, or <code>null</code> if a vdoc logger with the primary key could not be found
	*/
	public static vdocLogger fetchByPrimaryKey(java.lang.String loggerId) {
		return getPersistence().fetchByPrimaryKey(loggerId);
	}

	public static java.util.Map<java.io.Serializable, vdocLogger> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vdoc loggers.
	*
	* @return the vdoc loggers
	*/
	public static List<vdocLogger> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vdoc loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc loggers
	* @param end the upper bound of the range of vdoc loggers (not inclusive)
	* @return the range of vdoc loggers
	*/
	public static List<vdocLogger> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vdoc loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc loggers
	* @param end the upper bound of the range of vdoc loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vdoc loggers
	*/
	public static List<vdocLogger> findAll(int start, int end,
		OrderByComparator<vdocLogger> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vdoc loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc loggers
	* @param end the upper bound of the range of vdoc loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vdoc loggers
	*/
	public static List<vdocLogger> findAll(int start, int end,
		OrderByComparator<vdocLogger> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vdoc loggers from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vdoc loggers.
	*
	* @return the number of vdoc loggers
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static vdocLoggerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<vdocLoggerPersistence, vdocLoggerPersistence> _serviceTracker =
		ServiceTrackerFactory.open(vdocLoggerPersistence.class);
}