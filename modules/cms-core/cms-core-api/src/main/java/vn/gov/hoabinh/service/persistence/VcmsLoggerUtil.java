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

import vn.gov.hoabinh.model.VcmsLogger;

import java.util.Date;
import java.util.List;

/**
 * The persistence utility for the vcms logger service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsLoggerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsLoggerPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsLoggerPersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsLoggerUtil {
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
	public static void clearCache(VcmsLogger vcmsLogger) {
		getPersistence().clearCache(vcmsLogger);
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
	public static List<VcmsLogger> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsLogger> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsLogger> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsLogger> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsLogger update(VcmsLogger vcmsLogger) {
		return getPersistence().update(vcmsLogger);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsLogger update(VcmsLogger vcmsLogger,
		ServiceContext serviceContext) {
		return getPersistence().update(vcmsLogger, serviceContext);
	}

	/**
	* Returns all the vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @return the matching vcms loggers
	*/
	public static List<VcmsLogger> findByU_D(java.lang.String createdByUser,
		Date createdDate) {
		return getPersistence().findByU_D(createdByUser, createdDate);
	}

	/**
	* Returns a range of all the vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param start the lower bound of the range of vcms loggers
	* @param end the upper bound of the range of vcms loggers (not inclusive)
	* @return the range of matching vcms loggers
	*/
	public static List<VcmsLogger> findByU_D(java.lang.String createdByUser,
		Date createdDate, int start, int end) {
		return getPersistence().findByU_D(createdByUser, createdDate, start, end);
	}

	/**
	* Returns an ordered range of all the vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param start the lower bound of the range of vcms loggers
	* @param end the upper bound of the range of vcms loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms loggers
	*/
	public static List<VcmsLogger> findByU_D(java.lang.String createdByUser,
		Date createdDate, int start, int end,
		OrderByComparator<VcmsLogger> orderByComparator) {
		return getPersistence()
				   .findByU_D(createdByUser, createdDate, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param start the lower bound of the range of vcms loggers
	* @param end the upper bound of the range of vcms loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms loggers
	*/
	public static List<VcmsLogger> findByU_D(java.lang.String createdByUser,
		Date createdDate, int start, int end,
		OrderByComparator<VcmsLogger> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByU_D(createdByUser, createdDate, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms logger
	* @throws NoSuchVcmsLoggerException if a matching vcms logger could not be found
	*/
	public static VcmsLogger findByU_D_First(java.lang.String createdByUser,
		Date createdDate, OrderByComparator<VcmsLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsLoggerException {
		return getPersistence()
				   .findByU_D_First(createdByUser, createdDate,
			orderByComparator);
	}

	/**
	* Returns the first vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms logger, or <code>null</code> if a matching vcms logger could not be found
	*/
	public static VcmsLogger fetchByU_D_First(java.lang.String createdByUser,
		Date createdDate, OrderByComparator<VcmsLogger> orderByComparator) {
		return getPersistence()
				   .fetchByU_D_First(createdByUser, createdDate,
			orderByComparator);
	}

	/**
	* Returns the last vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms logger
	* @throws NoSuchVcmsLoggerException if a matching vcms logger could not be found
	*/
	public static VcmsLogger findByU_D_Last(java.lang.String createdByUser,
		Date createdDate, OrderByComparator<VcmsLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsLoggerException {
		return getPersistence()
				   .findByU_D_Last(createdByUser, createdDate, orderByComparator);
	}

	/**
	* Returns the last vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms logger, or <code>null</code> if a matching vcms logger could not be found
	*/
	public static VcmsLogger fetchByU_D_Last(java.lang.String createdByUser,
		Date createdDate, OrderByComparator<VcmsLogger> orderByComparator) {
		return getPersistence()
				   .fetchByU_D_Last(createdByUser, createdDate,
			orderByComparator);
	}

	/**
	* Returns the vcms loggers before and after the current vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	*
	* @param loggerId the primary key of the current vcms logger
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms logger
	* @throws NoSuchVcmsLoggerException if a vcms logger with the primary key could not be found
	*/
	public static VcmsLogger[] findByU_D_PrevAndNext(
		java.lang.String loggerId, java.lang.String createdByUser,
		Date createdDate, OrderByComparator<VcmsLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsLoggerException {
		return getPersistence()
				   .findByU_D_PrevAndNext(loggerId, createdByUser, createdDate,
			orderByComparator);
	}

	/**
	* Removes all the vcms loggers where createdByUser = &#63; and createdDate = &#63; from the database.
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	*/
	public static void removeByU_D(java.lang.String createdByUser,
		Date createdDate) {
		getPersistence().removeByU_D(createdByUser, createdDate);
	}

	/**
	* Returns the number of vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @return the number of matching vcms loggers
	*/
	public static int countByU_D(java.lang.String createdByUser,
		Date createdDate) {
		return getPersistence().countByU_D(createdByUser, createdDate);
	}

	/**
	* Returns all the vcms loggers where entryId = &#63; and classEntry = &#63;.
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @return the matching vcms loggers
	*/
	public static List<VcmsLogger> findByE_C(java.lang.String entryId,
		java.lang.String classEntry) {
		return getPersistence().findByE_C(entryId, classEntry);
	}

	/**
	* Returns a range of all the vcms loggers where entryId = &#63; and classEntry = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @param start the lower bound of the range of vcms loggers
	* @param end the upper bound of the range of vcms loggers (not inclusive)
	* @return the range of matching vcms loggers
	*/
	public static List<VcmsLogger> findByE_C(java.lang.String entryId,
		java.lang.String classEntry, int start, int end) {
		return getPersistence().findByE_C(entryId, classEntry, start, end);
	}

	/**
	* Returns an ordered range of all the vcms loggers where entryId = &#63; and classEntry = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @param start the lower bound of the range of vcms loggers
	* @param end the upper bound of the range of vcms loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms loggers
	*/
	public static List<VcmsLogger> findByE_C(java.lang.String entryId,
		java.lang.String classEntry, int start, int end,
		OrderByComparator<VcmsLogger> orderByComparator) {
		return getPersistence()
				   .findByE_C(entryId, classEntry, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms loggers where entryId = &#63; and classEntry = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @param start the lower bound of the range of vcms loggers
	* @param end the upper bound of the range of vcms loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms loggers
	*/
	public static List<VcmsLogger> findByE_C(java.lang.String entryId,
		java.lang.String classEntry, int start, int end,
		OrderByComparator<VcmsLogger> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByE_C(entryId, classEntry, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms logger in the ordered set where entryId = &#63; and classEntry = &#63;.
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms logger
	* @throws NoSuchVcmsLoggerException if a matching vcms logger could not be found
	*/
	public static VcmsLogger findByE_C_First(java.lang.String entryId,
		java.lang.String classEntry,
		OrderByComparator<VcmsLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsLoggerException {
		return getPersistence()
				   .findByE_C_First(entryId, classEntry, orderByComparator);
	}

	/**
	* Returns the first vcms logger in the ordered set where entryId = &#63; and classEntry = &#63;.
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms logger, or <code>null</code> if a matching vcms logger could not be found
	*/
	public static VcmsLogger fetchByE_C_First(java.lang.String entryId,
		java.lang.String classEntry,
		OrderByComparator<VcmsLogger> orderByComparator) {
		return getPersistence()
				   .fetchByE_C_First(entryId, classEntry, orderByComparator);
	}

	/**
	* Returns the last vcms logger in the ordered set where entryId = &#63; and classEntry = &#63;.
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms logger
	* @throws NoSuchVcmsLoggerException if a matching vcms logger could not be found
	*/
	public static VcmsLogger findByE_C_Last(java.lang.String entryId,
		java.lang.String classEntry,
		OrderByComparator<VcmsLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsLoggerException {
		return getPersistence()
				   .findByE_C_Last(entryId, classEntry, orderByComparator);
	}

	/**
	* Returns the last vcms logger in the ordered set where entryId = &#63; and classEntry = &#63;.
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms logger, or <code>null</code> if a matching vcms logger could not be found
	*/
	public static VcmsLogger fetchByE_C_Last(java.lang.String entryId,
		java.lang.String classEntry,
		OrderByComparator<VcmsLogger> orderByComparator) {
		return getPersistence()
				   .fetchByE_C_Last(entryId, classEntry, orderByComparator);
	}

	/**
	* Returns the vcms loggers before and after the current vcms logger in the ordered set where entryId = &#63; and classEntry = &#63;.
	*
	* @param loggerId the primary key of the current vcms logger
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms logger
	* @throws NoSuchVcmsLoggerException if a vcms logger with the primary key could not be found
	*/
	public static VcmsLogger[] findByE_C_PrevAndNext(
		java.lang.String loggerId, java.lang.String entryId,
		java.lang.String classEntry,
		OrderByComparator<VcmsLogger> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsLoggerException {
		return getPersistence()
				   .findByE_C_PrevAndNext(loggerId, entryId, classEntry,
			orderByComparator);
	}

	/**
	* Removes all the vcms loggers where entryId = &#63; and classEntry = &#63; from the database.
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	*/
	public static void removeByE_C(java.lang.String entryId,
		java.lang.String classEntry) {
		getPersistence().removeByE_C(entryId, classEntry);
	}

	/**
	* Returns the number of vcms loggers where entryId = &#63; and classEntry = &#63;.
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @return the number of matching vcms loggers
	*/
	public static int countByE_C(java.lang.String entryId,
		java.lang.String classEntry) {
		return getPersistence().countByE_C(entryId, classEntry);
	}

	/**
	* Caches the vcms logger in the entity cache if it is enabled.
	*
	* @param vcmsLogger the vcms logger
	*/
	public static void cacheResult(VcmsLogger vcmsLogger) {
		getPersistence().cacheResult(vcmsLogger);
	}

	/**
	* Caches the vcms loggers in the entity cache if it is enabled.
	*
	* @param vcmsLoggers the vcms loggers
	*/
	public static void cacheResult(List<VcmsLogger> vcmsLoggers) {
		getPersistence().cacheResult(vcmsLoggers);
	}

	/**
	* Creates a new vcms logger with the primary key. Does not add the vcms logger to the database.
	*
	* @param loggerId the primary key for the new vcms logger
	* @return the new vcms logger
	*/
	public static VcmsLogger create(java.lang.String loggerId) {
		return getPersistence().create(loggerId);
	}

	/**
	* Removes the vcms logger with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loggerId the primary key of the vcms logger
	* @return the vcms logger that was removed
	* @throws NoSuchVcmsLoggerException if a vcms logger with the primary key could not be found
	*/
	public static VcmsLogger remove(java.lang.String loggerId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsLoggerException {
		return getPersistence().remove(loggerId);
	}

	public static VcmsLogger updateImpl(VcmsLogger vcmsLogger) {
		return getPersistence().updateImpl(vcmsLogger);
	}

	/**
	* Returns the vcms logger with the primary key or throws a {@link NoSuchVcmsLoggerException} if it could not be found.
	*
	* @param loggerId the primary key of the vcms logger
	* @return the vcms logger
	* @throws NoSuchVcmsLoggerException if a vcms logger with the primary key could not be found
	*/
	public static VcmsLogger findByPrimaryKey(java.lang.String loggerId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsLoggerException {
		return getPersistence().findByPrimaryKey(loggerId);
	}

	/**
	* Returns the vcms logger with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loggerId the primary key of the vcms logger
	* @return the vcms logger, or <code>null</code> if a vcms logger with the primary key could not be found
	*/
	public static VcmsLogger fetchByPrimaryKey(java.lang.String loggerId) {
		return getPersistence().fetchByPrimaryKey(loggerId);
	}

	public static java.util.Map<java.io.Serializable, VcmsLogger> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms loggers.
	*
	* @return the vcms loggers
	*/
	public static List<VcmsLogger> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms loggers
	* @param end the upper bound of the range of vcms loggers (not inclusive)
	* @return the range of vcms loggers
	*/
	public static List<VcmsLogger> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms loggers
	* @param end the upper bound of the range of vcms loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms loggers
	*/
	public static List<VcmsLogger> findAll(int start, int end,
		OrderByComparator<VcmsLogger> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms loggers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsLoggerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms loggers
	* @param end the upper bound of the range of vcms loggers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms loggers
	*/
	public static List<VcmsLogger> findAll(int start, int end,
		OrderByComparator<VcmsLogger> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms loggers from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms loggers.
	*
	* @return the number of vcms loggers
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VcmsLoggerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsLoggerPersistence, VcmsLoggerPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsLoggerPersistence.class);
}