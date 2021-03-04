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

import vn.gov.hoabinh.exception.NoSuchVLegalDSRelException;
import vn.gov.hoabinh.model.VLegalDSRel;

/**
 * The persistence interface for the v legal d s rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalDSRelPersistenceImpl
 * @see VLegalDSRelUtil
 * @generated
 */
@ProviderType
public interface VLegalDSRelPersistence extends BasePersistence<VLegalDSRel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalDSRelUtil} to access the v legal d s rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal d s rels where sigId = &#63;.
	*
	* @param sigId the sig ID
	* @return the matching v legal d s rels
	*/
	public java.util.List<VLegalDSRel> findBySigner(java.lang.String sigId);

	/**
	* Returns a range of all the v legal d s rels where sigId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param sigId the sig ID
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @return the range of matching v legal d s rels
	*/
	public java.util.List<VLegalDSRel> findBySigner(java.lang.String sigId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal d s rels where sigId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param sigId the sig ID
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal d s rels
	*/
	public java.util.List<VLegalDSRel> findBySigner(java.lang.String sigId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal d s rels where sigId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param sigId the sig ID
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal d s rels
	*/
	public java.util.List<VLegalDSRel> findBySigner(java.lang.String sigId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal d s rel in the ordered set where sigId = &#63;.
	*
	* @param sigId the sig ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d s rel
	* @throws NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	*/
	public VLegalDSRel findBySigner_First(java.lang.String sigId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator)
		throws NoSuchVLegalDSRelException;

	/**
	* Returns the first v legal d s rel in the ordered set where sigId = &#63;.
	*
	* @param sigId the sig ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d s rel, or <code>null</code> if a matching v legal d s rel could not be found
	*/
	public VLegalDSRel fetchBySigner_First(java.lang.String sigId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator);

	/**
	* Returns the last v legal d s rel in the ordered set where sigId = &#63;.
	*
	* @param sigId the sig ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d s rel
	* @throws NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	*/
	public VLegalDSRel findBySigner_Last(java.lang.String sigId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator)
		throws NoSuchVLegalDSRelException;

	/**
	* Returns the last v legal d s rel in the ordered set where sigId = &#63;.
	*
	* @param sigId the sig ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d s rel, or <code>null</code> if a matching v legal d s rel could not be found
	*/
	public VLegalDSRel fetchBySigner_Last(java.lang.String sigId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator);

	/**
	* Returns the v legal d s rels before and after the current v legal d s rel in the ordered set where sigId = &#63;.
	*
	* @param vLegalDSRelPK the primary key of the current v legal d s rel
	* @param sigId the sig ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d s rel
	* @throws NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	*/
	public VLegalDSRel[] findBySigner_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK,
		java.lang.String sigId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator)
		throws NoSuchVLegalDSRelException;

	/**
	* Removes all the v legal d s rels where sigId = &#63; from the database.
	*
	* @param sigId the sig ID
	*/
	public void removeBySigner(java.lang.String sigId);

	/**
	* Returns the number of v legal d s rels where sigId = &#63;.
	*
	* @param sigId the sig ID
	* @return the number of matching v legal d s rels
	*/
	public int countBySigner(java.lang.String sigId);

	/**
	* Returns all the v legal d s rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the matching v legal d s rels
	*/
	public java.util.List<VLegalDSRel> findByDoc(java.lang.String docId);

	/**
	* Returns a range of all the v legal d s rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @return the range of matching v legal d s rels
	*/
	public java.util.List<VLegalDSRel> findByDoc(java.lang.String docId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal d s rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal d s rels
	*/
	public java.util.List<VLegalDSRel> findByDoc(java.lang.String docId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal d s rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal d s rels
	*/
	public java.util.List<VLegalDSRel> findByDoc(java.lang.String docId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal d s rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d s rel
	* @throws NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	*/
	public VLegalDSRel findByDoc_First(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator)
		throws NoSuchVLegalDSRelException;

	/**
	* Returns the first v legal d s rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d s rel, or <code>null</code> if a matching v legal d s rel could not be found
	*/
	public VLegalDSRel fetchByDoc_First(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator);

	/**
	* Returns the last v legal d s rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d s rel
	* @throws NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	*/
	public VLegalDSRel findByDoc_Last(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator)
		throws NoSuchVLegalDSRelException;

	/**
	* Returns the last v legal d s rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d s rel, or <code>null</code> if a matching v legal d s rel could not be found
	*/
	public VLegalDSRel fetchByDoc_Last(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator);

	/**
	* Returns the v legal d s rels before and after the current v legal d s rel in the ordered set where docId = &#63;.
	*
	* @param vLegalDSRelPK the primary key of the current v legal d s rel
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d s rel
	* @throws NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	*/
	public VLegalDSRel[] findByDoc_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator)
		throws NoSuchVLegalDSRelException;

	/**
	* Removes all the v legal d s rels where docId = &#63; from the database.
	*
	* @param docId the doc ID
	*/
	public void removeByDoc(java.lang.String docId);

	/**
	* Returns the number of v legal d s rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the number of matching v legal d s rels
	*/
	public int countByDoc(java.lang.String docId);

	/**
	* Caches the v legal d s rel in the entity cache if it is enabled.
	*
	* @param vLegalDSRel the v legal d s rel
	*/
	public void cacheResult(VLegalDSRel vLegalDSRel);

	/**
	* Caches the v legal d s rels in the entity cache if it is enabled.
	*
	* @param vLegalDSRels the v legal d s rels
	*/
	public void cacheResult(java.util.List<VLegalDSRel> vLegalDSRels);

	/**
	* Creates a new v legal d s rel with the primary key. Does not add the v legal d s rel to the database.
	*
	* @param vLegalDSRelPK the primary key for the new v legal d s rel
	* @return the new v legal d s rel
	*/
	public VLegalDSRel create(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK);

	/**
	* Removes the v legal d s rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel
	* @return the v legal d s rel that was removed
	* @throws NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	*/
	public VLegalDSRel remove(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK)
		throws NoSuchVLegalDSRelException;

	public VLegalDSRel updateImpl(VLegalDSRel vLegalDSRel);

	/**
	* Returns the v legal d s rel with the primary key or throws a {@link NoSuchVLegalDSRelException} if it could not be found.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel
	* @return the v legal d s rel
	* @throws NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	*/
	public VLegalDSRel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK)
		throws NoSuchVLegalDSRelException;

	/**
	* Returns the v legal d s rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel
	* @return the v legal d s rel, or <code>null</code> if a v legal d s rel with the primary key could not be found
	*/
	public VLegalDSRel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK);

	@Override
	public java.util.Map<java.io.Serializable, VLegalDSRel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal d s rels.
	*
	* @return the v legal d s rels
	*/
	public java.util.List<VLegalDSRel> findAll();

	/**
	* Returns a range of all the v legal d s rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @return the range of v legal d s rels
	*/
	public java.util.List<VLegalDSRel> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v legal d s rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal d s rels
	*/
	public java.util.List<VLegalDSRel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal d s rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal d s rels
	*/
	public java.util.List<VLegalDSRel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalDSRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal d s rels from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal d s rels.
	*
	* @return the number of v legal d s rels
	*/
	public int countAll();
}