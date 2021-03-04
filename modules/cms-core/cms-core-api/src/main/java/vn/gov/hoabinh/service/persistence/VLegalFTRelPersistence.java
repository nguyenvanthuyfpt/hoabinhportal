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

import vn.gov.hoabinh.exception.NoSuchVLegalFTRelException;
import vn.gov.hoabinh.model.VLegalFTRel;

/**
 * The persistence interface for the v legal f t rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalFTRelPersistenceImpl
 * @see VLegalFTRelUtil
 * @generated
 */
@ProviderType
public interface VLegalFTRelPersistence extends BasePersistence<VLegalFTRel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalFTRelUtil} to access the v legal f t rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal f t rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the matching v legal f t rels
	*/
	public java.util.List<VLegalFTRel> findByField(java.lang.String fieldId);

	/**
	* Returns a range of all the v legal f t rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @return the range of matching v legal f t rels
	*/
	public java.util.List<VLegalFTRel> findByField(java.lang.String fieldId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal f t rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal f t rels
	*/
	public java.util.List<VLegalFTRel> findByField(java.lang.String fieldId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal f t rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal f t rels
	*/
	public java.util.List<VLegalFTRel> findByField(java.lang.String fieldId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal f t rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f t rel
	* @throws NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	*/
	public VLegalFTRel findByField_First(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator)
		throws NoSuchVLegalFTRelException;

	/**
	* Returns the first v legal f t rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f t rel, or <code>null</code> if a matching v legal f t rel could not be found
	*/
	public VLegalFTRel fetchByField_First(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator);

	/**
	* Returns the last v legal f t rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f t rel
	* @throws NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	*/
	public VLegalFTRel findByField_Last(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator)
		throws NoSuchVLegalFTRelException;

	/**
	* Returns the last v legal f t rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f t rel, or <code>null</code> if a matching v legal f t rel could not be found
	*/
	public VLegalFTRel fetchByField_Last(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator);

	/**
	* Returns the v legal f t rels before and after the current v legal f t rel in the ordered set where fieldId = &#63;.
	*
	* @param vLegalFTRelPK the primary key of the current v legal f t rel
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal f t rel
	* @throws NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	*/
	public VLegalFTRel[] findByField_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK,
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator)
		throws NoSuchVLegalFTRelException;

	/**
	* Removes all the v legal f t rels where fieldId = &#63; from the database.
	*
	* @param fieldId the field ID
	*/
	public void removeByField(java.lang.String fieldId);

	/**
	* Returns the number of v legal f t rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the number of matching v legal f t rels
	*/
	public int countByField(java.lang.String fieldId);

	/**
	* Returns all the v legal f t rels where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the matching v legal f t rels
	*/
	public java.util.List<VLegalFTRel> findByType(java.lang.String typeId);

	/**
	* Returns a range of all the v legal f t rels where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @return the range of matching v legal f t rels
	*/
	public java.util.List<VLegalFTRel> findByType(java.lang.String typeId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal f t rels where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal f t rels
	*/
	public java.util.List<VLegalFTRel> findByType(java.lang.String typeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal f t rels where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal f t rels
	*/
	public java.util.List<VLegalFTRel> findByType(java.lang.String typeId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal f t rel in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f t rel
	* @throws NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	*/
	public VLegalFTRel findByType_First(java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator)
		throws NoSuchVLegalFTRelException;

	/**
	* Returns the first v legal f t rel in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f t rel, or <code>null</code> if a matching v legal f t rel could not be found
	*/
	public VLegalFTRel fetchByType_First(java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator);

	/**
	* Returns the last v legal f t rel in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f t rel
	* @throws NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	*/
	public VLegalFTRel findByType_Last(java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator)
		throws NoSuchVLegalFTRelException;

	/**
	* Returns the last v legal f t rel in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f t rel, or <code>null</code> if a matching v legal f t rel could not be found
	*/
	public VLegalFTRel fetchByType_Last(java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator);

	/**
	* Returns the v legal f t rels before and after the current v legal f t rel in the ordered set where typeId = &#63;.
	*
	* @param vLegalFTRelPK the primary key of the current v legal f t rel
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal f t rel
	* @throws NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	*/
	public VLegalFTRel[] findByType_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK,
		java.lang.String typeId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator)
		throws NoSuchVLegalFTRelException;

	/**
	* Removes all the v legal f t rels where typeId = &#63; from the database.
	*
	* @param typeId the type ID
	*/
	public void removeByType(java.lang.String typeId);

	/**
	* Returns the number of v legal f t rels where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the number of matching v legal f t rels
	*/
	public int countByType(java.lang.String typeId);

	/**
	* Caches the v legal f t rel in the entity cache if it is enabled.
	*
	* @param vLegalFTRel the v legal f t rel
	*/
	public void cacheResult(VLegalFTRel vLegalFTRel);

	/**
	* Caches the v legal f t rels in the entity cache if it is enabled.
	*
	* @param vLegalFTRels the v legal f t rels
	*/
	public void cacheResult(java.util.List<VLegalFTRel> vLegalFTRels);

	/**
	* Creates a new v legal f t rel with the primary key. Does not add the v legal f t rel to the database.
	*
	* @param vLegalFTRelPK the primary key for the new v legal f t rel
	* @return the new v legal f t rel
	*/
	public VLegalFTRel create(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK);

	/**
	* Removes the v legal f t rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFTRelPK the primary key of the v legal f t rel
	* @return the v legal f t rel that was removed
	* @throws NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	*/
	public VLegalFTRel remove(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK)
		throws NoSuchVLegalFTRelException;

	public VLegalFTRel updateImpl(VLegalFTRel vLegalFTRel);

	/**
	* Returns the v legal f t rel with the primary key or throws a {@link NoSuchVLegalFTRelException} if it could not be found.
	*
	* @param vLegalFTRelPK the primary key of the v legal f t rel
	* @return the v legal f t rel
	* @throws NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	*/
	public VLegalFTRel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK)
		throws NoSuchVLegalFTRelException;

	/**
	* Returns the v legal f t rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalFTRelPK the primary key of the v legal f t rel
	* @return the v legal f t rel, or <code>null</code> if a v legal f t rel with the primary key could not be found
	*/
	public VLegalFTRel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK);

	@Override
	public java.util.Map<java.io.Serializable, VLegalFTRel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal f t rels.
	*
	* @return the v legal f t rels
	*/
	public java.util.List<VLegalFTRel> findAll();

	/**
	* Returns a range of all the v legal f t rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @return the range of v legal f t rels
	*/
	public java.util.List<VLegalFTRel> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v legal f t rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal f t rels
	*/
	public java.util.List<VLegalFTRel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal f t rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal f t rels
	*/
	public java.util.List<VLegalFTRel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalFTRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal f t rels from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal f t rels.
	*
	* @return the number of v legal f t rels
	*/
	public int countAll();
}