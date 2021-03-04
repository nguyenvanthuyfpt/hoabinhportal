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

import vn.gov.hoabinh.model.VLegalLogger;

import java.util.Date;
import java.util.List;

/**
 * The persistence utility for the v legal logger service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalLoggerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalLoggerPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalLoggerPersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalLoggerUtil {
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
	public static void clearCache(VLegalLogger vLegalLogger) {
		getPersistence().clearCache(vLegalLogger);
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
	public static List<VLegalLogger> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalLogger> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalLogger> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalLogger> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalLogger update(VLegalLogger vLegalLogger) {
		return getPersistence().update(vLegalLogger);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalLogger update(VLegalLogger vLegalLogger,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalLogger, serviceContext);
	}

	/**
	* Returns the v legal logger where groupId = &#63; and loggerId = &#63; or throws a {@link NoSuchVLegalLoggerException} if it could not be found.
	*
	* @param groupId the group ID
	* @param loggerId the logger ID
	* @return the matching v legal logger
	* @throws NoSuchVLegalLoggerException if a matching v legal logger could not be found
	*/
	public static VLegalLogger findByG_L(long groupId, java.lang.String loggerId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalLoggerException {
		return getPersistence().findByG_L(groupId, loggerId);
	}

	/**
	* Returns the v legal logger where groupId = &#63; and loggerId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param loggerId the logger ID
	* @return the matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	*/
	public static VLegalLogger fetchByG_L(long groupId,
		java.lang.String loggerId) {
		return getPersistence().fetchByG_L(groupId, loggerId);
	}

	/**
	* Returns the v legal logger where groupId = &#63; and loggerId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param loggerId the logger ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	*/
	public static VLegalLogger fetchByG_L(long groupId,
		java.lang.String loggerId, boolean retrieveFromCache) {
		return getPersistence().fetchByG_L(groupId, loggerId, retrieveFromCache);
	}

	/**
	* Removes the v legal logger where groupId = &#63; and loggerId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param loggerId the logger ID
	* @return the v legal logger that was removed
	*/
	public static VLegalLogger removeByG_L(long groupId,
		java.lang.String loggerId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalLoggerException {
		return getPersistence().removeByG_L(groupId, loggerId);
	}

	/**
	* Returns the number of v legal loggers where groupId = &#63; and loggerId = &#63;.
	*
	* @param groupId the group ID
	* @param loggerId the logger ID
	* @return the number of matching v legal loggers
	*/
	public static int countByG_L(long groupId, java.lang.String loggerId) {
		return getPersistence().countByG_L(groupId, loggerId);
	}

	/**
	* Returns all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @return the matching v legal loggers
	*/
	public static List<VLegalLogger> findByU_D(long groupId,
		long createdByUser, Date createdDate) {
		return getPersistence().findByU_D(groupId, createdByUser, createdDate);
	}

	/**
	* Returns a range of all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param start the lower bound of the range of v legal loggers
	* @param end the upper bound of the range of v legal loggers (not inclusive)
	* @return the range of matching v legal loggers
	*/
	public static List<VLegalLogger> findByU_D(long groupId,
		long createdByUser, Date createdDate, int start, int end) {
		return getPersistence()
				   .findByU_D(groupId, createdByUser, createdDate, start, end);
	}

	/**
	* Returns an ordered range of all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param start the lower bound of the range of v legal loggers
	* @param end the upper bound of the range of v legal loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal loggers
	*/
	public static List<VLegalLogger> findByU_D(long groupId,
		long createdByUser, Date createdDate, int start, int end,
		OrderByComparator<VLegalLogger> orderByComparator) {
		return getPersistence()
				   .findByU_D(groupId, createdByUser, createdDate, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param start the lower bound of the range of v legal loggers
	* @param end the upper bound of the range of v legal loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal loggers
	*/
	public static List<VLegalLogger> findByU_D(long groupId,
		long createdByUser, Date createdDate, int start, int end,
		OrderByComparator<VLegalLogger> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByU_D(groupId, createdByUser, createdDate, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal logger
	* @throws NoSuchVLegalLoggerException if a matching v legal logger could not be found
	*/
	public static VLegalLogger findByU_D_First(long groupId,
		long createdByUser, Date createdDate,
		OrderByComparator<VLegalLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalLoggerException {
		return getPersistence()
				   .findByU_D_First(groupId, createdByUser, createdDate,
			orderByComparator);
	}

	/**
	* Returns the first v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	*/
	public static VLegalLogger fetchByU_D_First(long groupId,
		long createdByUser, Date createdDate,
		OrderByComparator<VLegalLogger> orderByComparator) {
		return getPersistence()
				   .fetchByU_D_First(groupId, createdByUser, createdDate,
			orderByComparator);
	}

	/**
	* Returns the last v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal logger
	* @throws NoSuchVLegalLoggerException if a matching v legal logger could not be found
	*/
	public static VLegalLogger findByU_D_Last(long groupId, long createdByUser,
		Date createdDate, OrderByComparator<VLegalLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalLoggerException {
		return getPersistence()
				   .findByU_D_Last(groupId, createdByUser, createdDate,
			orderByComparator);
	}

	/**
	* Returns the last v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	*/
	public static VLegalLogger fetchByU_D_Last(long groupId,
		long createdByUser, Date createdDate,
		OrderByComparator<VLegalLogger> orderByComparator) {
		return getPersistence()
				   .fetchByU_D_Last(groupId, createdByUser, createdDate,
			orderByComparator);
	}

	/**
	* Returns the v legal loggers before and after the current v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* @param loggerId the primary key of the current v legal logger
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal logger
	* @throws NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	*/
	public static VLegalLogger[] findByU_D_PrevAndNext(
		java.lang.String loggerId, long groupId, long createdByUser,
		Date createdDate, OrderByComparator<VLegalLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalLoggerException {
		return getPersistence()
				   .findByU_D_PrevAndNext(loggerId, groupId, createdByUser,
			createdDate, orderByComparator);
	}

	/**
	* Removes all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63; from the database.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	*/
	public static void removeByU_D(long groupId, long createdByUser,
		Date createdDate) {
		getPersistence().removeByU_D(groupId, createdByUser, createdDate);
	}

	/**
	* Returns the number of v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @return the number of matching v legal loggers
	*/
	public static int countByU_D(long groupId, long createdByUser,
		Date createdDate) {
		return getPersistence().countByU_D(groupId, createdByUser, createdDate);
	}

	/**
	* Returns all the v legal loggers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal loggers
	*/
	public static List<VLegalLogger> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the v legal loggers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal loggers
	* @param end the upper bound of the range of v legal loggers (not inclusive)
	* @return the range of matching v legal loggers
	*/
	public static List<VLegalLogger> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the v legal loggers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal loggers
	* @param end the upper bound of the range of v legal loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal loggers
	*/
	public static List<VLegalLogger> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalLogger> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal loggers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal loggers
	* @param end the upper bound of the range of v legal loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal loggers
	*/
	public static List<VLegalLogger> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalLogger> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal logger
	* @throws NoSuchVLegalLoggerException if a matching v legal logger could not be found
	*/
	public static VLegalLogger findByGroupId_First(long groupId,
		OrderByComparator<VLegalLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalLoggerException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first v legal logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	*/
	public static VLegalLogger fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalLogger> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal logger
	* @throws NoSuchVLegalLoggerException if a matching v legal logger could not be found
	*/
	public static VLegalLogger findByGroupId_Last(long groupId,
		OrderByComparator<VLegalLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalLoggerException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	*/
	public static VLegalLogger fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalLogger> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the v legal loggers before and after the current v legal logger in the ordered set where groupId = &#63;.
	*
	* @param loggerId the primary key of the current v legal logger
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal logger
	* @throws NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	*/
	public static VLegalLogger[] findByGroupId_PrevAndNext(
		java.lang.String loggerId, long groupId,
		OrderByComparator<VLegalLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalLoggerException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(loggerId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the v legal loggers where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of v legal loggers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal loggers
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Caches the v legal logger in the entity cache if it is enabled.
	*
	* @param vLegalLogger the v legal logger
	*/
	public static void cacheResult(VLegalLogger vLegalLogger) {
		getPersistence().cacheResult(vLegalLogger);
	}

	/**
	* Caches the v legal loggers in the entity cache if it is enabled.
	*
	* @param vLegalLoggers the v legal loggers
	*/
	public static void cacheResult(List<VLegalLogger> vLegalLoggers) {
		getPersistence().cacheResult(vLegalLoggers);
	}

	/**
	* Creates a new v legal logger with the primary key. Does not add the v legal logger to the database.
	*
	* @param loggerId the primary key for the new v legal logger
	* @return the new v legal logger
	*/
	public static VLegalLogger create(java.lang.String loggerId) {
		return getPersistence().create(loggerId);
	}

	/**
	* Removes the v legal logger with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loggerId the primary key of the v legal logger
	* @return the v legal logger that was removed
	* @throws NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	*/
	public static VLegalLogger remove(java.lang.String loggerId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalLoggerException {
		return getPersistence().remove(loggerId);
	}

	public static VLegalLogger updateImpl(VLegalLogger vLegalLogger) {
		return getPersistence().updateImpl(vLegalLogger);
	}

	/**
	* Returns the v legal logger with the primary key or throws a {@link NoSuchVLegalLoggerException} if it could not be found.
	*
	* @param loggerId the primary key of the v legal logger
	* @return the v legal logger
	* @throws NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	*/
	public static VLegalLogger findByPrimaryKey(java.lang.String loggerId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalLoggerException {
		return getPersistence().findByPrimaryKey(loggerId);
	}

	/**
	* Returns the v legal logger with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loggerId the primary key of the v legal logger
	* @return the v legal logger, or <code>null</code> if a v legal logger with the primary key could not be found
	*/
	public static VLegalLogger fetchByPrimaryKey(java.lang.String loggerId) {
		return getPersistence().fetchByPrimaryKey(loggerId);
	}

	public static java.util.Map<java.io.Serializable, VLegalLogger> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal loggers.
	*
	* @return the v legal loggers
	*/
	public static List<VLegalLogger> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the v legal loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal loggers
	* @param end the upper bound of the range of v legal loggers (not inclusive)
	* @return the range of v legal loggers
	*/
	public static List<VLegalLogger> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the v legal loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal loggers
	* @param end the upper bound of the range of v legal loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal loggers
	*/
	public static List<VLegalLogger> findAll(int start, int end,
		OrderByComparator<VLegalLogger> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal loggers
	* @param end the upper bound of the range of v legal loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal loggers
	*/
	public static List<VLegalLogger> findAll(int start, int end,
		OrderByComparator<VLegalLogger> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal loggers from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal loggers.
	*
	* @return the number of v legal loggers
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalLoggerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalLoggerPersistence, VLegalLoggerPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalLoggerPersistence.class);
}