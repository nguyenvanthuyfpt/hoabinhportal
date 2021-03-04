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

import vn.gov.hoabinh.exception.NoSuchvdocLoggerException;
import vn.gov.hoabinh.model.vdocLogger;

/**
 * The persistence interface for the vdoc logger service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.vdocLoggerPersistenceImpl
 * @see vdocLoggerUtil
 * @generated
 */
@ProviderType
public interface vdocLoggerPersistence extends BasePersistence<vdocLogger> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link vdocLoggerUtil} to access the vdoc logger persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vdoc loggers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching vdoc loggers
	*/
	public java.util.List<vdocLogger> findByGroupId(long groupId);

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
	public java.util.List<vdocLogger> findByGroupId(long groupId, int start,
		int end);

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
	public java.util.List<vdocLogger> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator);

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
	public java.util.List<vdocLogger> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc logger
	* @throws NoSuchvdocLoggerException if a matching vdoc logger could not be found
	*/
	public vdocLogger findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator)
		throws NoSuchvdocLoggerException;

	/**
	* Returns the first vdoc logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc logger, or <code>null</code> if a matching vdoc logger could not be found
	*/
	public vdocLogger fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator);

	/**
	* Returns the last vdoc logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc logger
	* @throws NoSuchvdocLoggerException if a matching vdoc logger could not be found
	*/
	public vdocLogger findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator)
		throws NoSuchvdocLoggerException;

	/**
	* Returns the last vdoc logger in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc logger, or <code>null</code> if a matching vdoc logger could not be found
	*/
	public vdocLogger fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator);

	/**
	* Returns the vdoc loggers before and after the current vdoc logger in the ordered set where groupId = &#63;.
	*
	* @param loggerId the primary key of the current vdoc logger
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc logger
	* @throws NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	*/
	public vdocLogger[] findByGroupId_PrevAndNext(java.lang.String loggerId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator)
		throws NoSuchvdocLoggerException;

	/**
	* Removes all the vdoc loggers where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of vdoc loggers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching vdoc loggers
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the vdoc loggers where groupId = &#63; and entryId = &#63; and className = &#63;.
	*
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	* @return the matching vdoc loggers
	*/
	public java.util.List<vdocLogger> findByG_E_C(long groupId,
		java.lang.String entryId, java.lang.String className);

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
	public java.util.List<vdocLogger> findByG_E_C(long groupId,
		java.lang.String entryId, java.lang.String className, int start, int end);

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
	public java.util.List<vdocLogger> findByG_E_C(long groupId,
		java.lang.String entryId, java.lang.String className, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator);

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
	public java.util.List<vdocLogger> findByG_E_C(long groupId,
		java.lang.String entryId, java.lang.String className, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator,
		boolean retrieveFromCache);

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
	public vdocLogger findByG_E_C_First(long groupId, java.lang.String entryId,
		java.lang.String className,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator)
		throws NoSuchvdocLoggerException;

	/**
	* Returns the first vdoc logger in the ordered set where groupId = &#63; and entryId = &#63; and className = &#63;.
	*
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc logger, or <code>null</code> if a matching vdoc logger could not be found
	*/
	public vdocLogger fetchByG_E_C_First(long groupId,
		java.lang.String entryId, java.lang.String className,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator);

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
	public vdocLogger findByG_E_C_Last(long groupId, java.lang.String entryId,
		java.lang.String className,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator)
		throws NoSuchvdocLoggerException;

	/**
	* Returns the last vdoc logger in the ordered set where groupId = &#63; and entryId = &#63; and className = &#63;.
	*
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc logger, or <code>null</code> if a matching vdoc logger could not be found
	*/
	public vdocLogger fetchByG_E_C_Last(long groupId, java.lang.String entryId,
		java.lang.String className,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator);

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
	public vdocLogger[] findByG_E_C_PrevAndNext(java.lang.String loggerId,
		long groupId, java.lang.String entryId, java.lang.String className,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator)
		throws NoSuchvdocLoggerException;

	/**
	* Removes all the vdoc loggers where groupId = &#63; and entryId = &#63; and className = &#63; from the database.
	*
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	*/
	public void removeByG_E_C(long groupId, java.lang.String entryId,
		java.lang.String className);

	/**
	* Returns the number of vdoc loggers where groupId = &#63; and entryId = &#63; and className = &#63;.
	*
	* @param groupId the group ID
	* @param entryId the entry ID
	* @param className the class name
	* @return the number of matching vdoc loggers
	*/
	public int countByG_E_C(long groupId, java.lang.String entryId,
		java.lang.String className);

	/**
	* Caches the vdoc logger in the entity cache if it is enabled.
	*
	* @param vdocLogger the vdoc logger
	*/
	public void cacheResult(vdocLogger vdocLogger);

	/**
	* Caches the vdoc loggers in the entity cache if it is enabled.
	*
	* @param vdocLoggers the vdoc loggers
	*/
	public void cacheResult(java.util.List<vdocLogger> vdocLoggers);

	/**
	* Creates a new vdoc logger with the primary key. Does not add the vdoc logger to the database.
	*
	* @param loggerId the primary key for the new vdoc logger
	* @return the new vdoc logger
	*/
	public vdocLogger create(java.lang.String loggerId);

	/**
	* Removes the vdoc logger with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loggerId the primary key of the vdoc logger
	* @return the vdoc logger that was removed
	* @throws NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	*/
	public vdocLogger remove(java.lang.String loggerId)
		throws NoSuchvdocLoggerException;

	public vdocLogger updateImpl(vdocLogger vdocLogger);

	/**
	* Returns the vdoc logger with the primary key or throws a {@link NoSuchvdocLoggerException} if it could not be found.
	*
	* @param loggerId the primary key of the vdoc logger
	* @return the vdoc logger
	* @throws NoSuchvdocLoggerException if a vdoc logger with the primary key could not be found
	*/
	public vdocLogger findByPrimaryKey(java.lang.String loggerId)
		throws NoSuchvdocLoggerException;

	/**
	* Returns the vdoc logger with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loggerId the primary key of the vdoc logger
	* @return the vdoc logger, or <code>null</code> if a vdoc logger with the primary key could not be found
	*/
	public vdocLogger fetchByPrimaryKey(java.lang.String loggerId);

	@Override
	public java.util.Map<java.io.Serializable, vdocLogger> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vdoc loggers.
	*
	* @return the vdoc loggers
	*/
	public java.util.List<vdocLogger> findAll();

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
	public java.util.List<vdocLogger> findAll(int start, int end);

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
	public java.util.List<vdocLogger> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator);

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
	public java.util.List<vdocLogger> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocLogger> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vdoc loggers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vdoc loggers.
	*
	* @return the number of vdoc loggers
	*/
	public int countAll();
}