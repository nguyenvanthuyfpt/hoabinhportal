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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import vn.gov.hoabinh.exception.NoSuchVcmsLoggerException;
import vn.gov.hoabinh.model.VcmsLogger;

import java.util.Date;

/**
 * The persistence interface for the vcms logger service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsLoggerPersistenceImpl
 * @see VcmsLoggerUtil
 * @generated
 */
@ProviderType
public interface VcmsLoggerPersistence extends BasePersistence<VcmsLogger> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsLoggerUtil} to access the vcms logger persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @return the matching vcms loggers
	*/
	public java.util.List<VcmsLogger> findByU_D(
		java.lang.String createdByUser, Date createdDate);

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
	public java.util.List<VcmsLogger> findByU_D(
		java.lang.String createdByUser, Date createdDate, int start, int end);

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
	public java.util.List<VcmsLogger> findByU_D(
		java.lang.String createdByUser, Date createdDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator);

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
	public java.util.List<VcmsLogger> findByU_D(
		java.lang.String createdByUser, Date createdDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms logger
	* @throws NoSuchVcmsLoggerException if a matching vcms logger could not be found
	*/
	public VcmsLogger findByU_D_First(java.lang.String createdByUser,
		Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator)
		throws NoSuchVcmsLoggerException;

	/**
	* Returns the first vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms logger, or <code>null</code> if a matching vcms logger could not be found
	*/
	public VcmsLogger fetchByU_D_First(java.lang.String createdByUser,
		Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator);

	/**
	* Returns the last vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms logger
	* @throws NoSuchVcmsLoggerException if a matching vcms logger could not be found
	*/
	public VcmsLogger findByU_D_Last(java.lang.String createdByUser,
		Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator)
		throws NoSuchVcmsLoggerException;

	/**
	* Returns the last vcms logger in the ordered set where createdByUser = &#63; and createdDate = &#63;.
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms logger, or <code>null</code> if a matching vcms logger could not be found
	*/
	public VcmsLogger fetchByU_D_Last(java.lang.String createdByUser,
		Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator);

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
	public VcmsLogger[] findByU_D_PrevAndNext(java.lang.String loggerId,
		java.lang.String createdByUser, Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator)
		throws NoSuchVcmsLoggerException;

	/**
	* Removes all the vcms loggers where createdByUser = &#63; and createdDate = &#63; from the database.
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	*/
	public void removeByU_D(java.lang.String createdByUser, Date createdDate);

	/**
	* Returns the number of vcms loggers where createdByUser = &#63; and createdDate = &#63;.
	*
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @return the number of matching vcms loggers
	*/
	public int countByU_D(java.lang.String createdByUser, Date createdDate);

	/**
	* Returns all the vcms loggers where entryId = &#63; and classEntry = &#63;.
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @return the matching vcms loggers
	*/
	public java.util.List<VcmsLogger> findByE_C(java.lang.String entryId,
		java.lang.String classEntry);

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
	public java.util.List<VcmsLogger> findByE_C(java.lang.String entryId,
		java.lang.String classEntry, int start, int end);

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
	public java.util.List<VcmsLogger> findByE_C(java.lang.String entryId,
		java.lang.String classEntry, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator);

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
	public java.util.List<VcmsLogger> findByE_C(java.lang.String entryId,
		java.lang.String classEntry, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms logger in the ordered set where entryId = &#63; and classEntry = &#63;.
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms logger
	* @throws NoSuchVcmsLoggerException if a matching vcms logger could not be found
	*/
	public VcmsLogger findByE_C_First(java.lang.String entryId,
		java.lang.String classEntry,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator)
		throws NoSuchVcmsLoggerException;

	/**
	* Returns the first vcms logger in the ordered set where entryId = &#63; and classEntry = &#63;.
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms logger, or <code>null</code> if a matching vcms logger could not be found
	*/
	public VcmsLogger fetchByE_C_First(java.lang.String entryId,
		java.lang.String classEntry,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator);

	/**
	* Returns the last vcms logger in the ordered set where entryId = &#63; and classEntry = &#63;.
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms logger
	* @throws NoSuchVcmsLoggerException if a matching vcms logger could not be found
	*/
	public VcmsLogger findByE_C_Last(java.lang.String entryId,
		java.lang.String classEntry,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator)
		throws NoSuchVcmsLoggerException;

	/**
	* Returns the last vcms logger in the ordered set where entryId = &#63; and classEntry = &#63;.
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms logger, or <code>null</code> if a matching vcms logger could not be found
	*/
	public VcmsLogger fetchByE_C_Last(java.lang.String entryId,
		java.lang.String classEntry,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator);

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
	public VcmsLogger[] findByE_C_PrevAndNext(java.lang.String loggerId,
		java.lang.String entryId, java.lang.String classEntry,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator)
		throws NoSuchVcmsLoggerException;

	/**
	* Removes all the vcms loggers where entryId = &#63; and classEntry = &#63; from the database.
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	*/
	public void removeByE_C(java.lang.String entryId,
		java.lang.String classEntry);

	/**
	* Returns the number of vcms loggers where entryId = &#63; and classEntry = &#63;.
	*
	* @param entryId the entry ID
	* @param classEntry the class entry
	* @return the number of matching vcms loggers
	*/
	public int countByE_C(java.lang.String entryId, java.lang.String classEntry);

	/**
	* Caches the vcms logger in the entity cache if it is enabled.
	*
	* @param vcmsLogger the vcms logger
	*/
	public void cacheResult(VcmsLogger vcmsLogger);

	/**
	* Caches the vcms loggers in the entity cache if it is enabled.
	*
	* @param vcmsLoggers the vcms loggers
	*/
	public void cacheResult(java.util.List<VcmsLogger> vcmsLoggers);

	/**
	* Creates a new vcms logger with the primary key. Does not add the vcms logger to the database.
	*
	* @param loggerId the primary key for the new vcms logger
	* @return the new vcms logger
	*/
	public VcmsLogger create(java.lang.String loggerId);

	/**
	* Removes the vcms logger with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loggerId the primary key of the vcms logger
	* @return the vcms logger that was removed
	* @throws NoSuchVcmsLoggerException if a vcms logger with the primary key could not be found
	*/
	public VcmsLogger remove(java.lang.String loggerId)
		throws NoSuchVcmsLoggerException;

	public VcmsLogger updateImpl(VcmsLogger vcmsLogger);

	/**
	* Returns the vcms logger with the primary key or throws a {@link NoSuchVcmsLoggerException} if it could not be found.
	*
	* @param loggerId the primary key of the vcms logger
	* @return the vcms logger
	* @throws NoSuchVcmsLoggerException if a vcms logger with the primary key could not be found
	*/
	public VcmsLogger findByPrimaryKey(java.lang.String loggerId)
		throws NoSuchVcmsLoggerException;

	/**
	* Returns the vcms logger with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loggerId the primary key of the vcms logger
	* @return the vcms logger, or <code>null</code> if a vcms logger with the primary key could not be found
	*/
	public VcmsLogger fetchByPrimaryKey(java.lang.String loggerId);

	@Override
	public java.util.Map<java.io.Serializable, VcmsLogger> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms loggers.
	*
	* @return the vcms loggers
	*/
	public java.util.List<VcmsLogger> findAll();

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
	public java.util.List<VcmsLogger> findAll(int start, int end);

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
	public java.util.List<VcmsLogger> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator);

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
	public java.util.List<VcmsLogger> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsLogger> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms loggers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms loggers.
	*
	* @return the number of vcms loggers
	*/
	public int countAll();
}