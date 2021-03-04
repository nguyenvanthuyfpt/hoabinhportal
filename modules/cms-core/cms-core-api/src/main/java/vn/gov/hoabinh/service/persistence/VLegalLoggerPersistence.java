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

import vn.gov.hoabinh.exception.NoSuchVLegalLoggerException;
import vn.gov.hoabinh.model.VLegalLogger;

import java.util.Date;

/**
 * The persistence interface for the v legal logger service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalLoggerPersistenceImpl
 * @see VLegalLoggerUtil
 * @generated
 */
@ProviderType
public interface VLegalLoggerPersistence extends BasePersistence<VLegalLogger> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalLoggerUtil} to access the v legal logger persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the v legal logger where groupId = &#63; and loggerId = &#63; or throws a {@link NoSuchVLegalLoggerException} if it could not be found.
	*
	* @param groupId the group ID
	* @param loggerId the logger ID
	* @return the matching v legal logger
	* @throws NoSuchVLegalLoggerException if a matching v legal logger could not be found
	*/
	public VLegalLogger findByG_L(long groupId, java.lang.String loggerId)
		throws NoSuchVLegalLoggerException;

	/**
	* Returns the v legal logger where groupId = &#63; and loggerId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param loggerId the logger ID
	* @return the matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	*/
	public VLegalLogger fetchByG_L(long groupId, java.lang.String loggerId);

	/**
	* Returns the v legal logger where groupId = &#63; and loggerId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param loggerId the logger ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	*/
	public VLegalLogger fetchByG_L(long groupId, java.lang.String loggerId,
		boolean retrieveFromCache);

	/**
	* Removes the v legal logger where groupId = &#63; and loggerId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param loggerId the logger ID
	* @return the v legal logger that was removed
	*/
	public VLegalLogger removeByG_L(long groupId, java.lang.String loggerId)
		throws NoSuchVLegalLoggerException;

	/**
	* Returns the number of v legal loggers where groupId = &#63; and loggerId = &#63;.
	*
	* @param groupId the group ID
	* @param loggerId the logger ID
	* @return the number of matching v legal loggers
	*/
	public int countByG_L(long groupId, java.lang.String loggerId);

	/**
	* Returns all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @return the matching v legal loggers
	*/
	public java.util.List<VLegalLogger> findByU_D(long groupId,
		long createdByUser, Date createdDate);

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
	public java.util.List<VLegalLogger> findByU_D(long groupId,
		long createdByUser, Date createdDate, int start, int end);

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
	public java.util.List<VLegalLogger> findByU_D(long groupId,
		long createdByUser, Date createdDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator);

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
	public java.util.List<VLegalLogger> findByU_D(long groupId,
		long createdByUser, Date createdDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator,
		boolean retrieveFromCache);

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
	public VLegalLogger findByU_D_First(long groupId, long createdByUser,
		Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator)
		throws NoSuchVLegalLoggerException;

	/**
	* Returns the first v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	*/
	public VLegalLogger fetchByU_D_First(long groupId, long createdByUser,
		Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator);

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
	public VLegalLogger findByU_D_Last(long groupId, long createdByUser,
		Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator)
		throws NoSuchVLegalLoggerException;

	/**
	* Returns the last v legal logger in the ordered set where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	*/
	public VLegalLogger fetchByU_D_Last(long groupId, long createdByUser,
		Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator);

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
	public VLegalLogger[] findByU_D_PrevAndNext(java.lang.String loggerId,
		long groupId, long createdByUser, Date createdDate,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator)
		throws NoSuchVLegalLoggerException;

	/**
	* Removes all the v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63; from the database.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	*/
	public void removeByU_D(long groupId, long createdByUser, Date createdDate);

	/**
	* Returns the number of v legal loggers where groupId = &#63; and createdByUser = &#63; and createdDate = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param createdDate the created date
	* @return the number of matching v legal loggers
	*/
	public int countByU_D(long groupId, long createdByUser, Date createdDate);

	/**
	* Returns all the v legal loggers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal loggers
	*/
	public java.util.List<VLegalLogger> findByGroupId(long groupId);

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
	public java.util.List<VLegalLogger> findByGroupId(long groupId, int start,
		int end);

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
	public java.util.List<VLegalLogger> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator);

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
	public java.util.List<VLegalLogger> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal logger
	* @throws NoSuchVLegalLoggerException if a matching v legal logger could not be found
	*/
	public VLegalLogger findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator)
		throws NoSuchVLegalLoggerException;

	/**
	* Returns the first v legal logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	*/
	public VLegalLogger fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator);

	/**
	* Returns the last v legal logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal logger
	* @throws NoSuchVLegalLoggerException if a matching v legal logger could not be found
	*/
	public VLegalLogger findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator)
		throws NoSuchVLegalLoggerException;

	/**
	* Returns the last v legal logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal logger, or <code>null</code> if a matching v legal logger could not be found
	*/
	public VLegalLogger fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator);

	/**
	* Returns the v legal loggers before and after the current v legal logger in the ordered set where groupId = &#63;.
	*
	* @param loggerId the primary key of the current v legal logger
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal logger
	* @throws NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	*/
	public VLegalLogger[] findByGroupId_PrevAndNext(java.lang.String loggerId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator)
		throws NoSuchVLegalLoggerException;

	/**
	* Removes all the v legal loggers where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of v legal loggers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal loggers
	*/
	public int countByGroupId(long groupId);

	/**
	* Caches the v legal logger in the entity cache if it is enabled.
	*
	* @param vLegalLogger the v legal logger
	*/
	public void cacheResult(VLegalLogger vLegalLogger);

	/**
	* Caches the v legal loggers in the entity cache if it is enabled.
	*
	* @param vLegalLoggers the v legal loggers
	*/
	public void cacheResult(java.util.List<VLegalLogger> vLegalLoggers);

	/**
	* Creates a new v legal logger with the primary key. Does not add the v legal logger to the database.
	*
	* @param loggerId the primary key for the new v legal logger
	* @return the new v legal logger
	*/
	public VLegalLogger create(java.lang.String loggerId);

	/**
	* Removes the v legal logger with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loggerId the primary key of the v legal logger
	* @return the v legal logger that was removed
	* @throws NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	*/
	public VLegalLogger remove(java.lang.String loggerId)
		throws NoSuchVLegalLoggerException;

	public VLegalLogger updateImpl(VLegalLogger vLegalLogger);

	/**
	* Returns the v legal logger with the primary key or throws a {@link NoSuchVLegalLoggerException} if it could not be found.
	*
	* @param loggerId the primary key of the v legal logger
	* @return the v legal logger
	* @throws NoSuchVLegalLoggerException if a v legal logger with the primary key could not be found
	*/
	public VLegalLogger findByPrimaryKey(java.lang.String loggerId)
		throws NoSuchVLegalLoggerException;

	/**
	* Returns the v legal logger with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loggerId the primary key of the v legal logger
	* @return the v legal logger, or <code>null</code> if a v legal logger with the primary key could not be found
	*/
	public VLegalLogger fetchByPrimaryKey(java.lang.String loggerId);

	@Override
	public java.util.Map<java.io.Serializable, VLegalLogger> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal loggers.
	*
	* @return the v legal loggers
	*/
	public java.util.List<VLegalLogger> findAll();

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
	public java.util.List<VLegalLogger> findAll(int start, int end);

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
	public java.util.List<VLegalLogger> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator);

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
	public java.util.List<VLegalLogger> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalLogger> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal loggers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal loggers.
	*
	* @return the number of v legal loggers
	*/
	public int countAll();
}