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

import vn.gov.hoabinh.exception.NoSuchVLegalDDRelException;
import vn.gov.hoabinh.model.VLegalDDRel;

/**
 * The persistence interface for the v legal d d rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalDDRelPersistenceImpl
 * @see VLegalDDRelUtil
 * @generated
 */
@ProviderType
public interface VLegalDDRelPersistence extends BasePersistence<VLegalDDRel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalDDRelUtil} to access the v legal d d rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal d d rels where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @return the matching v legal d d rels
	*/
	public java.util.List<VLegalDDRel> findByDepartament(long departmentId);

	/**
	* Returns a range of all the v legal d d rels where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param departmentId the department ID
	* @param start the lower bound of the range of v legal d d rels
	* @param end the upper bound of the range of v legal d d rels (not inclusive)
	* @return the range of matching v legal d d rels
	*/
	public java.util.List<VLegalDDRel> findByDepartament(long departmentId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal d d rels where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param departmentId the department ID
	* @param start the lower bound of the range of v legal d d rels
	* @param end the upper bound of the range of v legal d d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal d d rels
	*/
	public java.util.List<VLegalDDRel> findByDepartament(long departmentId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal d d rels where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param departmentId the department ID
	* @param start the lower bound of the range of v legal d d rels
	* @param end the upper bound of the range of v legal d d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal d d rels
	*/
	public java.util.List<VLegalDDRel> findByDepartament(long departmentId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal d d rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d d rel
	* @throws NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	*/
	public VLegalDDRel findByDepartament_First(long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator)
		throws NoSuchVLegalDDRelException;

	/**
	* Returns the first v legal d d rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d d rel, or <code>null</code> if a matching v legal d d rel could not be found
	*/
	public VLegalDDRel fetchByDepartament_First(long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator);

	/**
	* Returns the last v legal d d rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d d rel
	* @throws NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	*/
	public VLegalDDRel findByDepartament_Last(long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator)
		throws NoSuchVLegalDDRelException;

	/**
	* Returns the last v legal d d rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d d rel, or <code>null</code> if a matching v legal d d rel could not be found
	*/
	public VLegalDDRel fetchByDepartament_Last(long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator);

	/**
	* Returns the v legal d d rels before and after the current v legal d d rel in the ordered set where departmentId = &#63;.
	*
	* @param vLegalDDRelPK the primary key of the current v legal d d rel
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d d rel
	* @throws NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	*/
	public VLegalDDRel[] findByDepartament_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK,
		long departmentId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator)
		throws NoSuchVLegalDDRelException;

	/**
	* Removes all the v legal d d rels where departmentId = &#63; from the database.
	*
	* @param departmentId the department ID
	*/
	public void removeByDepartament(long departmentId);

	/**
	* Returns the number of v legal d d rels where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @return the number of matching v legal d d rels
	*/
	public int countByDepartament(long departmentId);

	/**
	* Returns all the v legal d d rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the matching v legal d d rels
	*/
	public java.util.List<VLegalDDRel> findByDoc(java.lang.String docId);

	/**
	* Returns a range of all the v legal d d rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal d d rels
	* @param end the upper bound of the range of v legal d d rels (not inclusive)
	* @return the range of matching v legal d d rels
	*/
	public java.util.List<VLegalDDRel> findByDoc(java.lang.String docId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal d d rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal d d rels
	* @param end the upper bound of the range of v legal d d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal d d rels
	*/
	public java.util.List<VLegalDDRel> findByDoc(java.lang.String docId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal d d rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal d d rels
	* @param end the upper bound of the range of v legal d d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal d d rels
	*/
	public java.util.List<VLegalDDRel> findByDoc(java.lang.String docId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal d d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d d rel
	* @throws NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	*/
	public VLegalDDRel findByDoc_First(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator)
		throws NoSuchVLegalDDRelException;

	/**
	* Returns the first v legal d d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d d rel, or <code>null</code> if a matching v legal d d rel could not be found
	*/
	public VLegalDDRel fetchByDoc_First(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator);

	/**
	* Returns the last v legal d d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d d rel
	* @throws NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	*/
	public VLegalDDRel findByDoc_Last(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator)
		throws NoSuchVLegalDDRelException;

	/**
	* Returns the last v legal d d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d d rel, or <code>null</code> if a matching v legal d d rel could not be found
	*/
	public VLegalDDRel fetchByDoc_Last(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator);

	/**
	* Returns the v legal d d rels before and after the current v legal d d rel in the ordered set where docId = &#63;.
	*
	* @param vLegalDDRelPK the primary key of the current v legal d d rel
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d d rel
	* @throws NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	*/
	public VLegalDDRel[] findByDoc_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator)
		throws NoSuchVLegalDDRelException;

	/**
	* Removes all the v legal d d rels where docId = &#63; from the database.
	*
	* @param docId the doc ID
	*/
	public void removeByDoc(java.lang.String docId);

	/**
	* Returns the number of v legal d d rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the number of matching v legal d d rels
	*/
	public int countByDoc(java.lang.String docId);

	/**
	* Caches the v legal d d rel in the entity cache if it is enabled.
	*
	* @param vLegalDDRel the v legal d d rel
	*/
	public void cacheResult(VLegalDDRel vLegalDDRel);

	/**
	* Caches the v legal d d rels in the entity cache if it is enabled.
	*
	* @param vLegalDDRels the v legal d d rels
	*/
	public void cacheResult(java.util.List<VLegalDDRel> vLegalDDRels);

	/**
	* Creates a new v legal d d rel with the primary key. Does not add the v legal d d rel to the database.
	*
	* @param vLegalDDRelPK the primary key for the new v legal d d rel
	* @return the new v legal d d rel
	*/
	public VLegalDDRel create(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK);

	/**
	* Removes the v legal d d rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel
	* @return the v legal d d rel that was removed
	* @throws NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	*/
	public VLegalDDRel remove(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK)
		throws NoSuchVLegalDDRelException;

	public VLegalDDRel updateImpl(VLegalDDRel vLegalDDRel);

	/**
	* Returns the v legal d d rel with the primary key or throws a {@link NoSuchVLegalDDRelException} if it could not be found.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel
	* @return the v legal d d rel
	* @throws NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	*/
	public VLegalDDRel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK)
		throws NoSuchVLegalDDRelException;

	/**
	* Returns the v legal d d rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel
	* @return the v legal d d rel, or <code>null</code> if a v legal d d rel with the primary key could not be found
	*/
	public VLegalDDRel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK);

	@Override
	public java.util.Map<java.io.Serializable, VLegalDDRel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal d d rels.
	*
	* @return the v legal d d rels
	*/
	public java.util.List<VLegalDDRel> findAll();

	/**
	* Returns a range of all the v legal d d rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d d rels
	* @param end the upper bound of the range of v legal d d rels (not inclusive)
	* @return the range of v legal d d rels
	*/
	public java.util.List<VLegalDDRel> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v legal d d rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d d rels
	* @param end the upper bound of the range of v legal d d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal d d rels
	*/
	public java.util.List<VLegalDDRel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal d d rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d d rels
	* @param end the upper bound of the range of v legal d d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal d d rels
	*/
	public java.util.List<VLegalDDRel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDDRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal d d rels from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal d d rels.
	*
	* @return the number of v legal d d rels
	*/
	public int countAll();
}