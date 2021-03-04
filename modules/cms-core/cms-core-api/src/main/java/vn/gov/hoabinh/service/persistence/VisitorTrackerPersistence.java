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

import vn.gov.hoabinh.exception.NoSuchVisitorTrackerException;
import vn.gov.hoabinh.model.VisitorTracker;

/**
 * The persistence interface for the visitor tracker service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VisitorTrackerPersistenceImpl
 * @see VisitorTrackerUtil
 * @generated
 */
@ProviderType
public interface VisitorTrackerPersistence extends BasePersistence<VisitorTracker> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VisitorTrackerUtil} to access the visitor tracker persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the visitor trackers where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching visitor trackers
	*/
	public java.util.List<VisitorTracker> findByC_G(long companyId, long groupId);

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
	public java.util.List<VisitorTracker> findByC_G(long companyId,
		long groupId, int start, int end);

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
	public java.util.List<VisitorTracker> findByC_G(long companyId,
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitorTracker> orderByComparator);

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
	public java.util.List<VisitorTracker> findByC_G(long companyId,
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitorTracker> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first visitor tracker in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching visitor tracker
	* @throws NoSuchVisitorTrackerException if a matching visitor tracker could not be found
	*/
	public VisitorTracker findByC_G_First(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitorTracker> orderByComparator)
		throws NoSuchVisitorTrackerException;

	/**
	* Returns the first visitor tracker in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching visitor tracker, or <code>null</code> if a matching visitor tracker could not be found
	*/
	public VisitorTracker fetchByC_G_First(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitorTracker> orderByComparator);

	/**
	* Returns the last visitor tracker in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching visitor tracker
	* @throws NoSuchVisitorTrackerException if a matching visitor tracker could not be found
	*/
	public VisitorTracker findByC_G_Last(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitorTracker> orderByComparator)
		throws NoSuchVisitorTrackerException;

	/**
	* Returns the last visitor tracker in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching visitor tracker, or <code>null</code> if a matching visitor tracker could not be found
	*/
	public VisitorTracker fetchByC_G_Last(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitorTracker> orderByComparator);

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
	public VisitorTracker[] findByC_G_PrevAndNext(long visitorId,
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VisitorTracker> orderByComparator)
		throws NoSuchVisitorTrackerException;

	/**
	* Removes all the visitor trackers where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	*/
	public void removeByC_G(long companyId, long groupId);

	/**
	* Returns the number of visitor trackers where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching visitor trackers
	*/
	public int countByC_G(long companyId, long groupId);

	/**
	* Caches the visitor tracker in the entity cache if it is enabled.
	*
	* @param visitorTracker the visitor tracker
	*/
	public void cacheResult(VisitorTracker visitorTracker);

	/**
	* Caches the visitor trackers in the entity cache if it is enabled.
	*
	* @param visitorTrackers the visitor trackers
	*/
	public void cacheResult(java.util.List<VisitorTracker> visitorTrackers);

	/**
	* Creates a new visitor tracker with the primary key. Does not add the visitor tracker to the database.
	*
	* @param visitorId the primary key for the new visitor tracker
	* @return the new visitor tracker
	*/
	public VisitorTracker create(long visitorId);

	/**
	* Removes the visitor tracker with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param visitorId the primary key of the visitor tracker
	* @return the visitor tracker that was removed
	* @throws NoSuchVisitorTrackerException if a visitor tracker with the primary key could not be found
	*/
	public VisitorTracker remove(long visitorId)
		throws NoSuchVisitorTrackerException;

	public VisitorTracker updateImpl(VisitorTracker visitorTracker);

	/**
	* Returns the visitor tracker with the primary key or throws a {@link NoSuchVisitorTrackerException} if it could not be found.
	*
	* @param visitorId the primary key of the visitor tracker
	* @return the visitor tracker
	* @throws NoSuchVisitorTrackerException if a visitor tracker with the primary key could not be found
	*/
	public VisitorTracker findByPrimaryKey(long visitorId)
		throws NoSuchVisitorTrackerException;

	/**
	* Returns the visitor tracker with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param visitorId the primary key of the visitor tracker
	* @return the visitor tracker, or <code>null</code> if a visitor tracker with the primary key could not be found
	*/
	public VisitorTracker fetchByPrimaryKey(long visitorId);

	@Override
	public java.util.Map<java.io.Serializable, VisitorTracker> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the visitor trackers.
	*
	* @return the visitor trackers
	*/
	public java.util.List<VisitorTracker> findAll();

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
	public java.util.List<VisitorTracker> findAll(int start, int end);

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
	public java.util.List<VisitorTracker> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitorTracker> orderByComparator);

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
	public java.util.List<VisitorTracker> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VisitorTracker> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the visitor trackers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of visitor trackers.
	*
	* @return the number of visitor trackers
	*/
	public int countAll();
}