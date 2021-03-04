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

import vn.gov.hoabinh.exception.NoSuchVLegalFORelException;
import vn.gov.hoabinh.model.VLegalFORel;

/**
 * The persistence interface for the v legal f o rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalFORelPersistenceImpl
 * @see VLegalFORelUtil
 * @generated
 */
@ProviderType
public interface VLegalFORelPersistence extends BasePersistence<VLegalFORel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalFORelUtil} to access the v legal f o rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal f o rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the matching v legal f o rels
	*/
	public java.util.List<VLegalFORel> findByField(java.lang.String fieldId);

	/**
	* Returns a range of all the v legal f o rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal f o rels
	* @param end the upper bound of the range of v legal f o rels (not inclusive)
	* @return the range of matching v legal f o rels
	*/
	public java.util.List<VLegalFORel> findByField(java.lang.String fieldId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal f o rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal f o rels
	* @param end the upper bound of the range of v legal f o rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal f o rels
	*/
	public java.util.List<VLegalFORel> findByField(java.lang.String fieldId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal f o rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal f o rels
	* @param end the upper bound of the range of v legal f o rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal f o rels
	*/
	public java.util.List<VLegalFORel> findByField(java.lang.String fieldId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal f o rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f o rel
	* @throws NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	*/
	public VLegalFORel findByField_First(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator)
		throws NoSuchVLegalFORelException;

	/**
	* Returns the first v legal f o rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f o rel, or <code>null</code> if a matching v legal f o rel could not be found
	*/
	public VLegalFORel fetchByField_First(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator);

	/**
	* Returns the last v legal f o rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f o rel
	* @throws NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	*/
	public VLegalFORel findByField_Last(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator)
		throws NoSuchVLegalFORelException;

	/**
	* Returns the last v legal f o rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f o rel, or <code>null</code> if a matching v legal f o rel could not be found
	*/
	public VLegalFORel fetchByField_Last(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator);

	/**
	* Returns the v legal f o rels before and after the current v legal f o rel in the ordered set where fieldId = &#63;.
	*
	* @param vLegalFORelPK the primary key of the current v legal f o rel
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal f o rel
	* @throws NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	*/
	public VLegalFORel[] findByField_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK,
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator)
		throws NoSuchVLegalFORelException;

	/**
	* Removes all the v legal f o rels where fieldId = &#63; from the database.
	*
	* @param fieldId the field ID
	*/
	public void removeByField(java.lang.String fieldId);

	/**
	* Returns the number of v legal f o rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the number of matching v legal f o rels
	*/
	public int countByField(java.lang.String fieldId);

	/**
	* Returns all the v legal f o rels where orgId = &#63;.
	*
	* @param orgId the org ID
	* @return the matching v legal f o rels
	*/
	public java.util.List<VLegalFORel> findByOrg(java.lang.String orgId);

	/**
	* Returns a range of all the v legal f o rels where orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgId the org ID
	* @param start the lower bound of the range of v legal f o rels
	* @param end the upper bound of the range of v legal f o rels (not inclusive)
	* @return the range of matching v legal f o rels
	*/
	public java.util.List<VLegalFORel> findByOrg(java.lang.String orgId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal f o rels where orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgId the org ID
	* @param start the lower bound of the range of v legal f o rels
	* @param end the upper bound of the range of v legal f o rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal f o rels
	*/
	public java.util.List<VLegalFORel> findByOrg(java.lang.String orgId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal f o rels where orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgId the org ID
	* @param start the lower bound of the range of v legal f o rels
	* @param end the upper bound of the range of v legal f o rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal f o rels
	*/
	public java.util.List<VLegalFORel> findByOrg(java.lang.String orgId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal f o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f o rel
	* @throws NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	*/
	public VLegalFORel findByOrg_First(java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator)
		throws NoSuchVLegalFORelException;

	/**
	* Returns the first v legal f o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f o rel, or <code>null</code> if a matching v legal f o rel could not be found
	*/
	public VLegalFORel fetchByOrg_First(java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator);

	/**
	* Returns the last v legal f o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f o rel
	* @throws NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	*/
	public VLegalFORel findByOrg_Last(java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator)
		throws NoSuchVLegalFORelException;

	/**
	* Returns the last v legal f o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f o rel, or <code>null</code> if a matching v legal f o rel could not be found
	*/
	public VLegalFORel fetchByOrg_Last(java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator);

	/**
	* Returns the v legal f o rels before and after the current v legal f o rel in the ordered set where orgId = &#63;.
	*
	* @param vLegalFORelPK the primary key of the current v legal f o rel
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal f o rel
	* @throws NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	*/
	public VLegalFORel[] findByOrg_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK,
		java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator)
		throws NoSuchVLegalFORelException;

	/**
	* Removes all the v legal f o rels where orgId = &#63; from the database.
	*
	* @param orgId the org ID
	*/
	public void removeByOrg(java.lang.String orgId);

	/**
	* Returns the number of v legal f o rels where orgId = &#63;.
	*
	* @param orgId the org ID
	* @return the number of matching v legal f o rels
	*/
	public int countByOrg(java.lang.String orgId);

	/**
	* Caches the v legal f o rel in the entity cache if it is enabled.
	*
	* @param vLegalFORel the v legal f o rel
	*/
	public void cacheResult(VLegalFORel vLegalFORel);

	/**
	* Caches the v legal f o rels in the entity cache if it is enabled.
	*
	* @param vLegalFORels the v legal f o rels
	*/
	public void cacheResult(java.util.List<VLegalFORel> vLegalFORels);

	/**
	* Creates a new v legal f o rel with the primary key. Does not add the v legal f o rel to the database.
	*
	* @param vLegalFORelPK the primary key for the new v legal f o rel
	* @return the new v legal f o rel
	*/
	public VLegalFORel create(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK);

	/**
	* Removes the v legal f o rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFORelPK the primary key of the v legal f o rel
	* @return the v legal f o rel that was removed
	* @throws NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	*/
	public VLegalFORel remove(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK)
		throws NoSuchVLegalFORelException;

	public VLegalFORel updateImpl(VLegalFORel vLegalFORel);

	/**
	* Returns the v legal f o rel with the primary key or throws a {@link NoSuchVLegalFORelException} if it could not be found.
	*
	* @param vLegalFORelPK the primary key of the v legal f o rel
	* @return the v legal f o rel
	* @throws NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	*/
	public VLegalFORel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK)
		throws NoSuchVLegalFORelException;

	/**
	* Returns the v legal f o rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalFORelPK the primary key of the v legal f o rel
	* @return the v legal f o rel, or <code>null</code> if a v legal f o rel with the primary key could not be found
	*/
	public VLegalFORel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK);

	@Override
	public java.util.Map<java.io.Serializable, VLegalFORel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal f o rels.
	*
	* @return the v legal f o rels
	*/
	public java.util.List<VLegalFORel> findAll();

	/**
	* Returns a range of all the v legal f o rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal f o rels
	* @param end the upper bound of the range of v legal f o rels (not inclusive)
	* @return the range of v legal f o rels
	*/
	public java.util.List<VLegalFORel> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v legal f o rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal f o rels
	* @param end the upper bound of the range of v legal f o rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal f o rels
	*/
	public java.util.List<VLegalFORel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal f o rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal f o rels
	* @param end the upper bound of the range of v legal f o rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal f o rels
	*/
	public java.util.List<VLegalFORel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFORel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal f o rels from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal f o rels.
	*
	* @return the number of v legal f o rels
	*/
	public int countAll();
}