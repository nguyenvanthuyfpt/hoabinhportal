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

import vn.gov.hoabinh.exception.NoSuchVContactException;
import vn.gov.hoabinh.model.VContact;

/**
 * The persistence interface for the v contact service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VContactPersistenceImpl
 * @see VContactUtil
 * @generated
 */
@ProviderType
public interface VContactPersistence extends BasePersistence<VContact> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VContactUtil} to access the v contact persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v contacts where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v contacts
	*/
	public java.util.List<VContact> findByG(long groupId);

	/**
	* Returns a range of all the v contacts where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v contacts
	* @param end the upper bound of the range of v contacts (not inclusive)
	* @return the range of matching v contacts
	*/
	public java.util.List<VContact> findByG(long groupId, int start, int end);

	/**
	* Returns an ordered range of all the v contacts where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v contacts
	* @param end the upper bound of the range of v contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v contacts
	*/
	public java.util.List<VContact> findByG(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator);

	/**
	* Returns an ordered range of all the v contacts where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v contacts
	* @param end the upper bound of the range of v contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v contacts
	*/
	public java.util.List<VContact> findByG(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v contact in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v contact
	* @throws NoSuchVContactException if a matching v contact could not be found
	*/
	public VContact findByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator)
		throws NoSuchVContactException;

	/**
	* Returns the first v contact in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v contact, or <code>null</code> if a matching v contact could not be found
	*/
	public VContact fetchByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator);

	/**
	* Returns the last v contact in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v contact
	* @throws NoSuchVContactException if a matching v contact could not be found
	*/
	public VContact findByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator)
		throws NoSuchVContactException;

	/**
	* Returns the last v contact in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v contact, or <code>null</code> if a matching v contact could not be found
	*/
	public VContact fetchByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator);

	/**
	* Returns the v contacts before and after the current v contact in the ordered set where groupId = &#63;.
	*
	* @param id the primary key of the current v contact
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v contact
	* @throws NoSuchVContactException if a v contact with the primary key could not be found
	*/
	public VContact[] findByG_PrevAndNext(long id, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator)
		throws NoSuchVContactException;

	/**
	* Removes all the v contacts where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByG(long groupId);

	/**
	* Returns the number of v contacts where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v contacts
	*/
	public int countByG(long groupId);

	/**
	* Returns all the v contacts where status = &#63;.
	*
	* @param status the status
	* @return the matching v contacts
	*/
	public java.util.List<VContact> findByStatus(int status);

	/**
	* Returns a range of all the v contacts where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of v contacts
	* @param end the upper bound of the range of v contacts (not inclusive)
	* @return the range of matching v contacts
	*/
	public java.util.List<VContact> findByStatus(int status, int start, int end);

	/**
	* Returns an ordered range of all the v contacts where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of v contacts
	* @param end the upper bound of the range of v contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v contacts
	*/
	public java.util.List<VContact> findByStatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator);

	/**
	* Returns an ordered range of all the v contacts where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of v contacts
	* @param end the upper bound of the range of v contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v contacts
	*/
	public java.util.List<VContact> findByStatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v contact
	* @throws NoSuchVContactException if a matching v contact could not be found
	*/
	public VContact findByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator)
		throws NoSuchVContactException;

	/**
	* Returns the first v contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v contact, or <code>null</code> if a matching v contact could not be found
	*/
	public VContact fetchByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator);

	/**
	* Returns the last v contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v contact
	* @throws NoSuchVContactException if a matching v contact could not be found
	*/
	public VContact findByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator)
		throws NoSuchVContactException;

	/**
	* Returns the last v contact in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v contact, or <code>null</code> if a matching v contact could not be found
	*/
	public VContact fetchByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator);

	/**
	* Returns the v contacts before and after the current v contact in the ordered set where status = &#63;.
	*
	* @param id the primary key of the current v contact
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v contact
	* @throws NoSuchVContactException if a v contact with the primary key could not be found
	*/
	public VContact[] findByStatus_PrevAndNext(long id, int status,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator)
		throws NoSuchVContactException;

	/**
	* Removes all the v contacts where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeByStatus(int status);

	/**
	* Returns the number of v contacts where status = &#63;.
	*
	* @param status the status
	* @return the number of matching v contacts
	*/
	public int countByStatus(int status);

	/**
	* Returns all the v contacts where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching v contacts
	*/
	public java.util.List<VContact> findByG_S(long groupId, int status);

	/**
	* Returns a range of all the v contacts where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of v contacts
	* @param end the upper bound of the range of v contacts (not inclusive)
	* @return the range of matching v contacts
	*/
	public java.util.List<VContact> findByG_S(long groupId, int status,
		int start, int end);

	/**
	* Returns an ordered range of all the v contacts where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of v contacts
	* @param end the upper bound of the range of v contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v contacts
	*/
	public java.util.List<VContact> findByG_S(long groupId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator);

	/**
	* Returns an ordered range of all the v contacts where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of v contacts
	* @param end the upper bound of the range of v contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v contacts
	*/
	public java.util.List<VContact> findByG_S(long groupId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v contact in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v contact
	* @throws NoSuchVContactException if a matching v contact could not be found
	*/
	public VContact findByG_S_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator)
		throws NoSuchVContactException;

	/**
	* Returns the first v contact in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v contact, or <code>null</code> if a matching v contact could not be found
	*/
	public VContact fetchByG_S_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator);

	/**
	* Returns the last v contact in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v contact
	* @throws NoSuchVContactException if a matching v contact could not be found
	*/
	public VContact findByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator)
		throws NoSuchVContactException;

	/**
	* Returns the last v contact in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v contact, or <code>null</code> if a matching v contact could not be found
	*/
	public VContact fetchByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator);

	/**
	* Returns the v contacts before and after the current v contact in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param id the primary key of the current v contact
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v contact
	* @throws NoSuchVContactException if a v contact with the primary key could not be found
	*/
	public VContact[] findByG_S_PrevAndNext(long id, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator)
		throws NoSuchVContactException;

	/**
	* Removes all the v contacts where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public void removeByG_S(long groupId, int status);

	/**
	* Returns the number of v contacts where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching v contacts
	*/
	public int countByG_S(long groupId, int status);

	/**
	* Caches the v contact in the entity cache if it is enabled.
	*
	* @param vContact the v contact
	*/
	public void cacheResult(VContact vContact);

	/**
	* Caches the v contacts in the entity cache if it is enabled.
	*
	* @param vContacts the v contacts
	*/
	public void cacheResult(java.util.List<VContact> vContacts);

	/**
	* Creates a new v contact with the primary key. Does not add the v contact to the database.
	*
	* @param id the primary key for the new v contact
	* @return the new v contact
	*/
	public VContact create(long id);

	/**
	* Removes the v contact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the v contact
	* @return the v contact that was removed
	* @throws NoSuchVContactException if a v contact with the primary key could not be found
	*/
	public VContact remove(long id) throws NoSuchVContactException;

	public VContact updateImpl(VContact vContact);

	/**
	* Returns the v contact with the primary key or throws a {@link NoSuchVContactException} if it could not be found.
	*
	* @param id the primary key of the v contact
	* @return the v contact
	* @throws NoSuchVContactException if a v contact with the primary key could not be found
	*/
	public VContact findByPrimaryKey(long id) throws NoSuchVContactException;

	/**
	* Returns the v contact with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the v contact
	* @return the v contact, or <code>null</code> if a v contact with the primary key could not be found
	*/
	public VContact fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VContact> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v contacts.
	*
	* @return the v contacts
	*/
	public java.util.List<VContact> findAll();

	/**
	* Returns a range of all the v contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v contacts
	* @param end the upper bound of the range of v contacts (not inclusive)
	* @return the range of v contacts
	*/
	public java.util.List<VContact> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v contacts
	* @param end the upper bound of the range of v contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v contacts
	*/
	public java.util.List<VContact> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator);

	/**
	* Returns an ordered range of all the v contacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v contacts
	* @param end the upper bound of the range of v contacts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v contacts
	*/
	public java.util.List<VContact> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VContact> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v contacts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v contacts.
	*
	* @return the number of v contacts
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}