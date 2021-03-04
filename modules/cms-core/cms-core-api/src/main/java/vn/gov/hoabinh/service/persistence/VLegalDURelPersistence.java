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

import vn.gov.hoabinh.exception.NoSuchVLegalDURelException;
import vn.gov.hoabinh.model.VLegalDURel;

/**
 * The persistence interface for the v legal d u rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalDURelPersistenceImpl
 * @see VLegalDURelUtil
 * @generated
 */
@ProviderType
public interface VLegalDURelPersistence extends BasePersistence<VLegalDURel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalDURelUtil} to access the v legal d u rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal d u rels where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @return the matching v legal d u rels
	*/
	public java.util.List<VLegalDURel> findByDepartament(long departmentId);

	/**
	* Returns a range of all the v legal d u rels where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param departmentId the department ID
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @return the range of matching v legal d u rels
	*/
	public java.util.List<VLegalDURel> findByDepartament(long departmentId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal d u rels where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param departmentId the department ID
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal d u rels
	*/
	public java.util.List<VLegalDURel> findByDepartament(long departmentId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal d u rels where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param departmentId the department ID
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal d u rels
	*/
	public java.util.List<VLegalDURel> findByDepartament(long departmentId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal d u rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d u rel
	* @throws NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	*/
	public VLegalDURel findByDepartament_First(long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator)
		throws NoSuchVLegalDURelException;

	/**
	* Returns the first v legal d u rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	*/
	public VLegalDURel fetchByDepartament_First(long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator);

	/**
	* Returns the last v legal d u rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d u rel
	* @throws NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	*/
	public VLegalDURel findByDepartament_Last(long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator)
		throws NoSuchVLegalDURelException;

	/**
	* Returns the last v legal d u rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	*/
	public VLegalDURel fetchByDepartament_Last(long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator);

	/**
	* Returns the v legal d u rels before and after the current v legal d u rel in the ordered set where departmentId = &#63;.
	*
	* @param vLegalDURelPK the primary key of the current v legal d u rel
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d u rel
	* @throws NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	*/
	public VLegalDURel[] findByDepartament_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK,
		long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator)
		throws NoSuchVLegalDURelException;

	/**
	* Removes all the v legal d u rels where departmentId = &#63; from the database.
	*
	* @param departmentId the department ID
	*/
	public void removeByDepartament(long departmentId);

	/**
	* Returns the number of v legal d u rels where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @return the number of matching v legal d u rels
	*/
	public int countByDepartament(long departmentId);

	/**
	* Returns all the v legal d u rels where userid = &#63;.
	*
	* @param userid the userid
	* @return the matching v legal d u rels
	*/
	public java.util.List<VLegalDURel> findByUser(long userid);

	/**
	* Returns a range of all the v legal d u rels where userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userid the userid
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @return the range of matching v legal d u rels
	*/
	public java.util.List<VLegalDURel> findByUser(long userid, int start,
		int end);

	/**
	* Returns an ordered range of all the v legal d u rels where userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userid the userid
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal d u rels
	*/
	public java.util.List<VLegalDURel> findByUser(long userid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal d u rels where userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userid the userid
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal d u rels
	*/
	public java.util.List<VLegalDURel> findByUser(long userid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal d u rel in the ordered set where userid = &#63;.
	*
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d u rel
	* @throws NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	*/
	public VLegalDURel findByUser_First(long userid,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator)
		throws NoSuchVLegalDURelException;

	/**
	* Returns the first v legal d u rel in the ordered set where userid = &#63;.
	*
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	*/
	public VLegalDURel fetchByUser_First(long userid,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator);

	/**
	* Returns the last v legal d u rel in the ordered set where userid = &#63;.
	*
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d u rel
	* @throws NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	*/
	public VLegalDURel findByUser_Last(long userid,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator)
		throws NoSuchVLegalDURelException;

	/**
	* Returns the last v legal d u rel in the ordered set where userid = &#63;.
	*
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	*/
	public VLegalDURel fetchByUser_Last(long userid,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator);

	/**
	* Returns the v legal d u rels before and after the current v legal d u rel in the ordered set where userid = &#63;.
	*
	* @param vLegalDURelPK the primary key of the current v legal d u rel
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d u rel
	* @throws NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	*/
	public VLegalDURel[] findByUser_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK,
		long userid,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator)
		throws NoSuchVLegalDURelException;

	/**
	* Removes all the v legal d u rels where userid = &#63; from the database.
	*
	* @param userid the userid
	*/
	public void removeByUser(long userid);

	/**
	* Returns the number of v legal d u rels where userid = &#63;.
	*
	* @param userid the userid
	* @return the number of matching v legal d u rels
	*/
	public int countByUser(long userid);

	/**
	* Returns the v legal d u rel where userid = &#63; or throws a {@link NoSuchVLegalDURelException} if it could not be found.
	*
	* @param userid the userid
	* @return the matching v legal d u rel
	* @throws NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	*/
	public VLegalDURel findByUserId(long userid)
		throws NoSuchVLegalDURelException;

	/**
	* Returns the v legal d u rel where userid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userid the userid
	* @return the matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	*/
	public VLegalDURel fetchByUserId(long userid);

	/**
	* Returns the v legal d u rel where userid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userid the userid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	*/
	public VLegalDURel fetchByUserId(long userid, boolean retrieveFromCache);

	/**
	* Removes the v legal d u rel where userid = &#63; from the database.
	*
	* @param userid the userid
	* @return the v legal d u rel that was removed
	*/
	public VLegalDURel removeByUserId(long userid)
		throws NoSuchVLegalDURelException;

	/**
	* Returns the number of v legal d u rels where userid = &#63;.
	*
	* @param userid the userid
	* @return the number of matching v legal d u rels
	*/
	public int countByUserId(long userid);

	/**
	* Caches the v legal d u rel in the entity cache if it is enabled.
	*
	* @param vLegalDURel the v legal d u rel
	*/
	public void cacheResult(VLegalDURel vLegalDURel);

	/**
	* Caches the v legal d u rels in the entity cache if it is enabled.
	*
	* @param vLegalDURels the v legal d u rels
	*/
	public void cacheResult(java.util.List<VLegalDURel> vLegalDURels);

	/**
	* Creates a new v legal d u rel with the primary key. Does not add the v legal d u rel to the database.
	*
	* @param vLegalDURelPK the primary key for the new v legal d u rel
	* @return the new v legal d u rel
	*/
	public VLegalDURel create(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK);

	/**
	* Removes the v legal d u rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDURelPK the primary key of the v legal d u rel
	* @return the v legal d u rel that was removed
	* @throws NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	*/
	public VLegalDURel remove(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK)
		throws NoSuchVLegalDURelException;

	public VLegalDURel updateImpl(VLegalDURel vLegalDURel);

	/**
	* Returns the v legal d u rel with the primary key or throws a {@link NoSuchVLegalDURelException} if it could not be found.
	*
	* @param vLegalDURelPK the primary key of the v legal d u rel
	* @return the v legal d u rel
	* @throws NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	*/
	public VLegalDURel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK)
		throws NoSuchVLegalDURelException;

	/**
	* Returns the v legal d u rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalDURelPK the primary key of the v legal d u rel
	* @return the v legal d u rel, or <code>null</code> if a v legal d u rel with the primary key could not be found
	*/
	public VLegalDURel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK);

	@Override
	public java.util.Map<java.io.Serializable, VLegalDURel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal d u rels.
	*
	* @return the v legal d u rels
	*/
	public java.util.List<VLegalDURel> findAll();

	/**
	* Returns a range of all the v legal d u rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @return the range of v legal d u rels
	*/
	public java.util.List<VLegalDURel> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v legal d u rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal d u rels
	*/
	public java.util.List<VLegalDURel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal d u rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal d u rels
	*/
	public java.util.List<VLegalDURel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDURel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal d u rels from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal d u rels.
	*
	* @return the number of v legal d u rels
	*/
	public int countAll();
}