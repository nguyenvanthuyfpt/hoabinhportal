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

import vn.gov.hoabinh.exception.NoSuchVLegalDFRelException;
import vn.gov.hoabinh.model.VLegalDFRel;

/**
 * The persistence interface for the v legal d f rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalDFRelPersistenceImpl
 * @see VLegalDFRelUtil
 * @generated
 */
@ProviderType
public interface VLegalDFRelPersistence extends BasePersistence<VLegalDFRel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalDFRelUtil} to access the v legal d f rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal d f rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the matching v legal d f rels
	*/
	public java.util.List<VLegalDFRel> findByField(java.lang.String fieldId);

	/**
	* Returns a range of all the v legal d f rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal d f rels
	* @param end the upper bound of the range of v legal d f rels (not inclusive)
	* @return the range of matching v legal d f rels
	*/
	public java.util.List<VLegalDFRel> findByField(java.lang.String fieldId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal d f rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal d f rels
	* @param end the upper bound of the range of v legal d f rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal d f rels
	*/
	public java.util.List<VLegalDFRel> findByField(java.lang.String fieldId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal d f rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal d f rels
	* @param end the upper bound of the range of v legal d f rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal d f rels
	*/
	public java.util.List<VLegalDFRel> findByField(java.lang.String fieldId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal d f rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d f rel
	* @throws NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	*/
	public VLegalDFRel findByField_First(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator)
		throws NoSuchVLegalDFRelException;

	/**
	* Returns the first v legal d f rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d f rel, or <code>null</code> if a matching v legal d f rel could not be found
	*/
	public VLegalDFRel fetchByField_First(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator);

	/**
	* Returns the last v legal d f rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d f rel
	* @throws NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	*/
	public VLegalDFRel findByField_Last(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator)
		throws NoSuchVLegalDFRelException;

	/**
	* Returns the last v legal d f rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d f rel, or <code>null</code> if a matching v legal d f rel could not be found
	*/
	public VLegalDFRel fetchByField_Last(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator);

	/**
	* Returns the v legal d f rels before and after the current v legal d f rel in the ordered set where fieldId = &#63;.
	*
	* @param vLegalDFRelPK the primary key of the current v legal d f rel
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d f rel
	* @throws NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	*/
	public VLegalDFRel[] findByField_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK,
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator)
		throws NoSuchVLegalDFRelException;

	/**
	* Removes all the v legal d f rels where fieldId = &#63; from the database.
	*
	* @param fieldId the field ID
	*/
	public void removeByField(java.lang.String fieldId);

	/**
	* Returns the number of v legal d f rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the number of matching v legal d f rels
	*/
	public int countByField(java.lang.String fieldId);

	/**
	* Returns all the v legal d f rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the matching v legal d f rels
	*/
	public java.util.List<VLegalDFRel> findByDoc(java.lang.String docId);

	/**
	* Returns a range of all the v legal d f rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal d f rels
	* @param end the upper bound of the range of v legal d f rels (not inclusive)
	* @return the range of matching v legal d f rels
	*/
	public java.util.List<VLegalDFRel> findByDoc(java.lang.String docId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal d f rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal d f rels
	* @param end the upper bound of the range of v legal d f rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal d f rels
	*/
	public java.util.List<VLegalDFRel> findByDoc(java.lang.String docId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal d f rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal d f rels
	* @param end the upper bound of the range of v legal d f rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal d f rels
	*/
	public java.util.List<VLegalDFRel> findByDoc(java.lang.String docId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal d f rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d f rel
	* @throws NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	*/
	public VLegalDFRel findByDoc_First(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator)
		throws NoSuchVLegalDFRelException;

	/**
	* Returns the first v legal d f rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d f rel, or <code>null</code> if a matching v legal d f rel could not be found
	*/
	public VLegalDFRel fetchByDoc_First(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator);

	/**
	* Returns the last v legal d f rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d f rel
	* @throws NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	*/
	public VLegalDFRel findByDoc_Last(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator)
		throws NoSuchVLegalDFRelException;

	/**
	* Returns the last v legal d f rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d f rel, or <code>null</code> if a matching v legal d f rel could not be found
	*/
	public VLegalDFRel fetchByDoc_Last(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator);

	/**
	* Returns the v legal d f rels before and after the current v legal d f rel in the ordered set where docId = &#63;.
	*
	* @param vLegalDFRelPK the primary key of the current v legal d f rel
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d f rel
	* @throws NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	*/
	public VLegalDFRel[] findByDoc_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator)
		throws NoSuchVLegalDFRelException;

	/**
	* Removes all the v legal d f rels where docId = &#63; from the database.
	*
	* @param docId the doc ID
	*/
	public void removeByDoc(java.lang.String docId);

	/**
	* Returns the number of v legal d f rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the number of matching v legal d f rels
	*/
	public int countByDoc(java.lang.String docId);

	/**
	* Caches the v legal d f rel in the entity cache if it is enabled.
	*
	* @param vLegalDFRel the v legal d f rel
	*/
	public void cacheResult(VLegalDFRel vLegalDFRel);

	/**
	* Caches the v legal d f rels in the entity cache if it is enabled.
	*
	* @param vLegalDFRels the v legal d f rels
	*/
	public void cacheResult(java.util.List<VLegalDFRel> vLegalDFRels);

	/**
	* Creates a new v legal d f rel with the primary key. Does not add the v legal d f rel to the database.
	*
	* @param vLegalDFRelPK the primary key for the new v legal d f rel
	* @return the new v legal d f rel
	*/
	public VLegalDFRel create(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK);

	/**
	* Removes the v legal d f rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDFRelPK the primary key of the v legal d f rel
	* @return the v legal d f rel that was removed
	* @throws NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	*/
	public VLegalDFRel remove(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK)
		throws NoSuchVLegalDFRelException;

	public VLegalDFRel updateImpl(VLegalDFRel vLegalDFRel);

	/**
	* Returns the v legal d f rel with the primary key or throws a {@link NoSuchVLegalDFRelException} if it could not be found.
	*
	* @param vLegalDFRelPK the primary key of the v legal d f rel
	* @return the v legal d f rel
	* @throws NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	*/
	public VLegalDFRel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK)
		throws NoSuchVLegalDFRelException;

	/**
	* Returns the v legal d f rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalDFRelPK the primary key of the v legal d f rel
	* @return the v legal d f rel, or <code>null</code> if a v legal d f rel with the primary key could not be found
	*/
	public VLegalDFRel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK);

	@Override
	public java.util.Map<java.io.Serializable, VLegalDFRel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal d f rels.
	*
	* @return the v legal d f rels
	*/
	public java.util.List<VLegalDFRel> findAll();

	/**
	* Returns a range of all the v legal d f rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d f rels
	* @param end the upper bound of the range of v legal d f rels (not inclusive)
	* @return the range of v legal d f rels
	*/
	public java.util.List<VLegalDFRel> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v legal d f rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d f rels
	* @param end the upper bound of the range of v legal d f rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal d f rels
	*/
	public java.util.List<VLegalDFRel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal d f rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d f rels
	* @param end the upper bound of the range of v legal d f rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal d f rels
	*/
	public java.util.List<VLegalDFRel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDFRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal d f rels from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal d f rels.
	*
	* @return the number of v legal d f rels
	*/
	public int countAll();
}