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

import vn.gov.hoabinh.exception.NoSuchVcmsThreadException;
import vn.gov.hoabinh.model.VcmsThread;

/**
 * The persistence interface for the vcms thread service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsThreadPersistenceImpl
 * @see VcmsThreadUtil
 * @generated
 */
@ProviderType
public interface VcmsThreadPersistence extends BasePersistence<VcmsThread> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsThreadUtil} to access the vcms thread persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms threads where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching vcms threads
	*/
	public java.util.List<VcmsThread> findByP_L(long groupId,
		java.lang.String language);

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
	public java.util.List<VcmsThread> findByP_L(long groupId,
		java.lang.String language, int start, int end);

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
	public java.util.List<VcmsThread> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsThread> orderByComparator);

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
	public java.util.List<VcmsThread> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsThread> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms thread in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms thread
	* @throws NoSuchVcmsThreadException if a matching vcms thread could not be found
	*/
	public VcmsThread findByP_L_First(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsThread> orderByComparator)
		throws NoSuchVcmsThreadException;

	/**
	* Returns the first vcms thread in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms thread, or <code>null</code> if a matching vcms thread could not be found
	*/
	public VcmsThread fetchByP_L_First(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsThread> orderByComparator);

	/**
	* Returns the last vcms thread in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms thread
	* @throws NoSuchVcmsThreadException if a matching vcms thread could not be found
	*/
	public VcmsThread findByP_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsThread> orderByComparator)
		throws NoSuchVcmsThreadException;

	/**
	* Returns the last vcms thread in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms thread, or <code>null</code> if a matching vcms thread could not be found
	*/
	public VcmsThread fetchByP_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsThread> orderByComparator);

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
	public VcmsThread[] findByP_L_PrevAndNext(java.lang.String threadId,
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsThread> orderByComparator)
		throws NoSuchVcmsThreadException;

	/**
	* Removes all the vcms threads where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByP_L(long groupId, java.lang.String language);

	/**
	* Returns the number of vcms threads where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching vcms threads
	*/
	public int countByP_L(long groupId, java.lang.String language);

	/**
	* Caches the vcms thread in the entity cache if it is enabled.
	*
	* @param vcmsThread the vcms thread
	*/
	public void cacheResult(VcmsThread vcmsThread);

	/**
	* Caches the vcms threads in the entity cache if it is enabled.
	*
	* @param vcmsThreads the vcms threads
	*/
	public void cacheResult(java.util.List<VcmsThread> vcmsThreads);

	/**
	* Creates a new vcms thread with the primary key. Does not add the vcms thread to the database.
	*
	* @param threadId the primary key for the new vcms thread
	* @return the new vcms thread
	*/
	public VcmsThread create(java.lang.String threadId);

	/**
	* Removes the vcms thread with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param threadId the primary key of the vcms thread
	* @return the vcms thread that was removed
	* @throws NoSuchVcmsThreadException if a vcms thread with the primary key could not be found
	*/
	public VcmsThread remove(java.lang.String threadId)
		throws NoSuchVcmsThreadException;

	public VcmsThread updateImpl(VcmsThread vcmsThread);

	/**
	* Returns the vcms thread with the primary key or throws a {@link NoSuchVcmsThreadException} if it could not be found.
	*
	* @param threadId the primary key of the vcms thread
	* @return the vcms thread
	* @throws NoSuchVcmsThreadException if a vcms thread with the primary key could not be found
	*/
	public VcmsThread findByPrimaryKey(java.lang.String threadId)
		throws NoSuchVcmsThreadException;

	/**
	* Returns the vcms thread with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param threadId the primary key of the vcms thread
	* @return the vcms thread, or <code>null</code> if a vcms thread with the primary key could not be found
	*/
	public VcmsThread fetchByPrimaryKey(java.lang.String threadId);

	@Override
	public java.util.Map<java.io.Serializable, VcmsThread> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms threads.
	*
	* @return the vcms threads
	*/
	public java.util.List<VcmsThread> findAll();

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
	public java.util.List<VcmsThread> findAll(int start, int end);

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
	public java.util.List<VcmsThread> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsThread> orderByComparator);

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
	public java.util.List<VcmsThread> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsThread> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms threads from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms threads.
	*
	* @return the number of vcms threads
	*/
	public int countAll();
}