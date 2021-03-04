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

import vn.gov.hoabinh.exception.NoSuchvdocDORelException;
import vn.gov.hoabinh.model.vdocDORel;

/**
 * The persistence interface for the vdoc d o rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.vdocDORelPersistenceImpl
 * @see vdocDORelUtil
 * @generated
 */
@ProviderType
public interface vdocDORelPersistence extends BasePersistence<vdocDORel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link vdocDORelUtil} to access the vdoc d o rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vdoc d o rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the matching vdoc d o rels
	*/
	public java.util.List<vdocDORel> findByDocument(java.lang.String docId);

	/**
	* Returns a range of all the vdoc d o rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of vdoc d o rels
	* @param end the upper bound of the range of vdoc d o rels (not inclusive)
	* @return the range of matching vdoc d o rels
	*/
	public java.util.List<vdocDORel> findByDocument(java.lang.String docId,
		int start, int end);

	/**
	* Returns an ordered range of all the vdoc d o rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of vdoc d o rels
	* @param end the upper bound of the range of vdoc d o rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc d o rels
	*/
	public java.util.List<vdocDORel> findByDocument(java.lang.String docId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc d o rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of vdoc d o rels
	* @param end the upper bound of the range of vdoc d o rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc d o rels
	*/
	public java.util.List<vdocDORel> findByDocument(java.lang.String docId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc d o rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc d o rel
	* @throws NoSuchvdocDORelException if a matching vdoc d o rel could not be found
	*/
	public vdocDORel findByDocument_First(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator)
		throws NoSuchvdocDORelException;

	/**
	* Returns the first vdoc d o rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc d o rel, or <code>null</code> if a matching vdoc d o rel could not be found
	*/
	public vdocDORel fetchByDocument_First(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator);

	/**
	* Returns the last vdoc d o rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc d o rel
	* @throws NoSuchvdocDORelException if a matching vdoc d o rel could not be found
	*/
	public vdocDORel findByDocument_Last(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator)
		throws NoSuchvdocDORelException;

	/**
	* Returns the last vdoc d o rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc d o rel, or <code>null</code> if a matching vdoc d o rel could not be found
	*/
	public vdocDORel fetchByDocument_Last(java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator);

	/**
	* Returns the vdoc d o rels before and after the current vdoc d o rel in the ordered set where docId = &#63;.
	*
	* @param vdocDORelPK the primary key of the current vdoc d o rel
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc d o rel
	* @throws NoSuchvdocDORelException if a vdoc d o rel with the primary key could not be found
	*/
	public vdocDORel[] findByDocument_PrevAndNext(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK,
		java.lang.String docId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator)
		throws NoSuchvdocDORelException;

	/**
	* Removes all the vdoc d o rels where docId = &#63; from the database.
	*
	* @param docId the doc ID
	*/
	public void removeByDocument(java.lang.String docId);

	/**
	* Returns the number of vdoc d o rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the number of matching vdoc d o rels
	*/
	public int countByDocument(java.lang.String docId);

	/**
	* Returns all the vdoc d o rels where orgId = &#63;.
	*
	* @param orgId the org ID
	* @return the matching vdoc d o rels
	*/
	public java.util.List<vdocDORel> findByOrg(java.lang.String orgId);

	/**
	* Returns a range of all the vdoc d o rels where orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgId the org ID
	* @param start the lower bound of the range of vdoc d o rels
	* @param end the upper bound of the range of vdoc d o rels (not inclusive)
	* @return the range of matching vdoc d o rels
	*/
	public java.util.List<vdocDORel> findByOrg(java.lang.String orgId,
		int start, int end);

	/**
	* Returns an ordered range of all the vdoc d o rels where orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgId the org ID
	* @param start the lower bound of the range of vdoc d o rels
	* @param end the upper bound of the range of vdoc d o rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc d o rels
	*/
	public java.util.List<vdocDORel> findByOrg(java.lang.String orgId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc d o rels where orgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgId the org ID
	* @param start the lower bound of the range of vdoc d o rels
	* @param end the upper bound of the range of vdoc d o rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc d o rels
	*/
	public java.util.List<vdocDORel> findByOrg(java.lang.String orgId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc d o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc d o rel
	* @throws NoSuchvdocDORelException if a matching vdoc d o rel could not be found
	*/
	public vdocDORel findByOrg_First(java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator)
		throws NoSuchvdocDORelException;

	/**
	* Returns the first vdoc d o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc d o rel, or <code>null</code> if a matching vdoc d o rel could not be found
	*/
	public vdocDORel fetchByOrg_First(java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator);

	/**
	* Returns the last vdoc d o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc d o rel
	* @throws NoSuchvdocDORelException if a matching vdoc d o rel could not be found
	*/
	public vdocDORel findByOrg_Last(java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator)
		throws NoSuchvdocDORelException;

	/**
	* Returns the last vdoc d o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc d o rel, or <code>null</code> if a matching vdoc d o rel could not be found
	*/
	public vdocDORel fetchByOrg_Last(java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator);

	/**
	* Returns the vdoc d o rels before and after the current vdoc d o rel in the ordered set where orgId = &#63;.
	*
	* @param vdocDORelPK the primary key of the current vdoc d o rel
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc d o rel
	* @throws NoSuchvdocDORelException if a vdoc d o rel with the primary key could not be found
	*/
	public vdocDORel[] findByOrg_PrevAndNext(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK,
		java.lang.String orgId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator)
		throws NoSuchvdocDORelException;

	/**
	* Removes all the vdoc d o rels where orgId = &#63; from the database.
	*
	* @param orgId the org ID
	*/
	public void removeByOrg(java.lang.String orgId);

	/**
	* Returns the number of vdoc d o rels where orgId = &#63;.
	*
	* @param orgId the org ID
	* @return the number of matching vdoc d o rels
	*/
	public int countByOrg(java.lang.String orgId);

	/**
	* Caches the vdoc d o rel in the entity cache if it is enabled.
	*
	* @param vdocDORel the vdoc d o rel
	*/
	public void cacheResult(vdocDORel vdocDORel);

	/**
	* Caches the vdoc d o rels in the entity cache if it is enabled.
	*
	* @param vdocDORels the vdoc d o rels
	*/
	public void cacheResult(java.util.List<vdocDORel> vdocDORels);

	/**
	* Creates a new vdoc d o rel with the primary key. Does not add the vdoc d o rel to the database.
	*
	* @param vdocDORelPK the primary key for the new vdoc d o rel
	* @return the new vdoc d o rel
	*/
	public vdocDORel create(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK);

	/**
	* Removes the vdoc d o rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocDORelPK the primary key of the vdoc d o rel
	* @return the vdoc d o rel that was removed
	* @throws NoSuchvdocDORelException if a vdoc d o rel with the primary key could not be found
	*/
	public vdocDORel remove(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK)
		throws NoSuchvdocDORelException;

	public vdocDORel updateImpl(vdocDORel vdocDORel);

	/**
	* Returns the vdoc d o rel with the primary key or throws a {@link NoSuchvdocDORelException} if it could not be found.
	*
	* @param vdocDORelPK the primary key of the vdoc d o rel
	* @return the vdoc d o rel
	* @throws NoSuchvdocDORelException if a vdoc d o rel with the primary key could not be found
	*/
	public vdocDORel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK)
		throws NoSuchvdocDORelException;

	/**
	* Returns the vdoc d o rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vdocDORelPK the primary key of the vdoc d o rel
	* @return the vdoc d o rel, or <code>null</code> if a vdoc d o rel with the primary key could not be found
	*/
	public vdocDORel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK);

	@Override
	public java.util.Map<java.io.Serializable, vdocDORel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vdoc d o rels.
	*
	* @return the vdoc d o rels
	*/
	public java.util.List<vdocDORel> findAll();

	/**
	* Returns a range of all the vdoc d o rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc d o rels
	* @param end the upper bound of the range of vdoc d o rels (not inclusive)
	* @return the range of vdoc d o rels
	*/
	public java.util.List<vdocDORel> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vdoc d o rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc d o rels
	* @param end the upper bound of the range of vdoc d o rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vdoc d o rels
	*/
	public java.util.List<vdocDORel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc d o rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc d o rels
	* @param end the upper bound of the range of vdoc d o rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vdoc d o rels
	*/
	public java.util.List<vdocDORel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocDORel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vdoc d o rels from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vdoc d o rels.
	*
	* @return the number of vdoc d o rels
	*/
	public int countAll();
}