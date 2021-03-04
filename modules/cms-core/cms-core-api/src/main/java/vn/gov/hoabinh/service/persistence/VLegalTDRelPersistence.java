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

import vn.gov.hoabinh.exception.NoSuchVLegalTDRelException;
import vn.gov.hoabinh.model.VLegalTDRel;

/**
 * The persistence interface for the v legal t d rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalTDRelPersistenceImpl
 * @see VLegalTDRelUtil
 * @generated
 */
@ProviderType
public interface VLegalTDRelPersistence extends BasePersistence<VLegalTDRel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalTDRelUtil} to access the v legal t d rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the v legal t d rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the matching v legal t d rels
	*/
	public java.util.List<VLegalTDRel> findByDocument(java.lang.String docId);

	/**
	* Returns a range of all the v legal t d rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @return the range of matching v legal t d rels
	*/
	public java.util.List<VLegalTDRel> findByDocument(java.lang.String docId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal t d rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal t d rels
	*/
	public java.util.List<VLegalTDRel> findByDocument(java.lang.String docId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal t d rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal t d rels
	*/
	public java.util.List<VLegalTDRel> findByDocument(java.lang.String docId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal t d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal t d rel
	* @throws NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	*/
	public VLegalTDRel findByDocument_First(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator)
		throws NoSuchVLegalTDRelException;

	/**
	* Returns the first v legal t d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal t d rel, or <code>null</code> if a matching v legal t d rel could not be found
	*/
	public VLegalTDRel fetchByDocument_First(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator);

	/**
	* Returns the last v legal t d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal t d rel
	* @throws NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	*/
	public VLegalTDRel findByDocument_Last(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator)
		throws NoSuchVLegalTDRelException;

	/**
	* Returns the last v legal t d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal t d rel, or <code>null</code> if a matching v legal t d rel could not be found
	*/
	public VLegalTDRel fetchByDocument_Last(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator);

	/**
	* Returns the v legal t d rels before and after the current v legal t d rel in the ordered set where docId = &#63;.
	*
	* @param vLegalTDRelPK the primary key of the current v legal t d rel
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal t d rel
	* @throws NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	*/
	public VLegalTDRel[] findByDocument_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalTDRelPK vLegalTDRelPK,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator)
		throws NoSuchVLegalTDRelException;

	/**
	* Removes all the v legal t d rels where docId = &#63; from the database.
	*
	* @param docId the doc ID
	*/
	public void removeByDocument(java.lang.String docId);

	/**
	* Returns the number of v legal t d rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the number of matching v legal t d rels
	*/
	public int countByDocument(java.lang.String docId);

	/**
	* Returns all the v legal t d rels where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @return the matching v legal t d rels
	*/
	public java.util.List<VLegalTDRel> findByTag(java.lang.String tagId);

	/**
	* Returns a range of all the v legal t d rels where tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tagId the tag ID
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @return the range of matching v legal t d rels
	*/
	public java.util.List<VLegalTDRel> findByTag(java.lang.String tagId,
		int start, int end);

	/**
	* Returns an ordered range of all the v legal t d rels where tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tagId the tag ID
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal t d rels
	*/
	public java.util.List<VLegalTDRel> findByTag(java.lang.String tagId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal t d rels where tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tagId the tag ID
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal t d rels
	*/
	public java.util.List<VLegalTDRel> findByTag(java.lang.String tagId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first v legal t d rel in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal t d rel
	* @throws NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	*/
	public VLegalTDRel findByTag_First(java.lang.String tagId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator)
		throws NoSuchVLegalTDRelException;

	/**
	* Returns the first v legal t d rel in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal t d rel, or <code>null</code> if a matching v legal t d rel could not be found
	*/
	public VLegalTDRel fetchByTag_First(java.lang.String tagId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator);

	/**
	* Returns the last v legal t d rel in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal t d rel
	* @throws NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	*/
	public VLegalTDRel findByTag_Last(java.lang.String tagId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator)
		throws NoSuchVLegalTDRelException;

	/**
	* Returns the last v legal t d rel in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal t d rel, or <code>null</code> if a matching v legal t d rel could not be found
	*/
	public VLegalTDRel fetchByTag_Last(java.lang.String tagId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator);

	/**
	* Returns the v legal t d rels before and after the current v legal t d rel in the ordered set where tagId = &#63;.
	*
	* @param vLegalTDRelPK the primary key of the current v legal t d rel
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal t d rel
	* @throws NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	*/
	public VLegalTDRel[] findByTag_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalTDRelPK vLegalTDRelPK,
		java.lang.String tagId,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator)
		throws NoSuchVLegalTDRelException;

	/**
	* Removes all the v legal t d rels where tagId = &#63; from the database.
	*
	* @param tagId the tag ID
	*/
	public void removeByTag(java.lang.String tagId);

	/**
	* Returns the number of v legal t d rels where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @return the number of matching v legal t d rels
	*/
	public int countByTag(java.lang.String tagId);

	/**
	* Caches the v legal t d rel in the entity cache if it is enabled.
	*
	* @param vLegalTDRel the v legal t d rel
	*/
	public void cacheResult(VLegalTDRel vLegalTDRel);

	/**
	* Caches the v legal t d rels in the entity cache if it is enabled.
	*
	* @param vLegalTDRels the v legal t d rels
	*/
	public void cacheResult(java.util.List<VLegalTDRel> vLegalTDRels);

	/**
	* Creates a new v legal t d rel with the primary key. Does not add the v legal t d rel to the database.
	*
	* @param vLegalTDRelPK the primary key for the new v legal t d rel
	* @return the new v legal t d rel
	*/
	public VLegalTDRel create(
		vn.gov.hoabinh.service.persistence.VLegalTDRelPK vLegalTDRelPK);

	/**
	* Removes the v legal t d rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalTDRelPK the primary key of the v legal t d rel
	* @return the v legal t d rel that was removed
	* @throws NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	*/
	public VLegalTDRel remove(
		vn.gov.hoabinh.service.persistence.VLegalTDRelPK vLegalTDRelPK)
		throws NoSuchVLegalTDRelException;

	public VLegalTDRel updateImpl(VLegalTDRel vLegalTDRel);

	/**
	* Returns the v legal t d rel with the primary key or throws a {@link NoSuchVLegalTDRelException} if it could not be found.
	*
	* @param vLegalTDRelPK the primary key of the v legal t d rel
	* @return the v legal t d rel
	* @throws NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	*/
	public VLegalTDRel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalTDRelPK vLegalTDRelPK)
		throws NoSuchVLegalTDRelException;

	/**
	* Returns the v legal t d rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalTDRelPK the primary key of the v legal t d rel
	* @return the v legal t d rel, or <code>null</code> if a v legal t d rel with the primary key could not be found
	*/
	public VLegalTDRel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalTDRelPK vLegalTDRelPK);

	@Override
	public java.util.Map<java.io.Serializable, VLegalTDRel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the v legal t d rels.
	*
	* @return the v legal t d rels
	*/
	public java.util.List<VLegalTDRel> findAll();

	/**
	* Returns a range of all the v legal t d rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @return the range of v legal t d rels
	*/
	public java.util.List<VLegalTDRel> findAll(int start, int end);

	/**
	* Returns an ordered range of all the v legal t d rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal t d rels
	*/
	public java.util.List<VLegalTDRel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator);

	/**
	* Returns an ordered range of all the v legal t d rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal t d rels
	*/
	public java.util.List<VLegalTDRel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VLegalTDRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the v legal t d rels from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of v legal t d rels.
	*
	* @return the number of v legal t d rels
	*/
	public int countAll();
}