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

import vn.gov.hoabinh.exception.NoSuchvdocFieldLevelRelException;
import vn.gov.hoabinh.model.vdocFieldLevelRel;

/**
 * The persistence interface for the vdoc field level rel service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.vdocFieldLevelRelPersistenceImpl
 * @see vdocFieldLevelRelUtil
 * @generated
 */
@ProviderType
public interface vdocFieldLevelRelPersistence extends BasePersistence<vdocFieldLevelRel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link vdocFieldLevelRelUtil} to access the vdoc field level rel persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vdoc field level rels where levelId = &#63;.
	*
	* @param levelId the level ID
	* @return the matching vdoc field level rels
	*/
	public java.util.List<vdocFieldLevelRel> findByLevel(
		java.lang.String levelId);

	/**
	* Returns a range of all the vdoc field level rels where levelId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param levelId the level ID
	* @param start the lower bound of the range of vdoc field level rels
	* @param end the upper bound of the range of vdoc field level rels (not inclusive)
	* @return the range of matching vdoc field level rels
	*/
	public java.util.List<vdocFieldLevelRel> findByLevel(
		java.lang.String levelId, int start, int end);

	/**
	* Returns an ordered range of all the vdoc field level rels where levelId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param levelId the level ID
	* @param start the lower bound of the range of vdoc field level rels
	* @param end the upper bound of the range of vdoc field level rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc field level rels
	*/
	public java.util.List<vdocFieldLevelRel> findByLevel(
		java.lang.String levelId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc field level rels where levelId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param levelId the level ID
	* @param start the lower bound of the range of vdoc field level rels
	* @param end the upper bound of the range of vdoc field level rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc field level rels
	*/
	public java.util.List<vdocFieldLevelRel> findByLevel(
		java.lang.String levelId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc field level rel in the ordered set where levelId = &#63;.
	*
	* @param levelId the level ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc field level rel
	* @throws NoSuchvdocFieldLevelRelException if a matching vdoc field level rel could not be found
	*/
	public vdocFieldLevelRel findByLevel_First(java.lang.String levelId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws NoSuchvdocFieldLevelRelException;

	/**
	* Returns the first vdoc field level rel in the ordered set where levelId = &#63;.
	*
	* @param levelId the level ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc field level rel, or <code>null</code> if a matching vdoc field level rel could not be found
	*/
	public vdocFieldLevelRel fetchByLevel_First(java.lang.String levelId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator);

	/**
	* Returns the last vdoc field level rel in the ordered set where levelId = &#63;.
	*
	* @param levelId the level ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc field level rel
	* @throws NoSuchvdocFieldLevelRelException if a matching vdoc field level rel could not be found
	*/
	public vdocFieldLevelRel findByLevel_Last(java.lang.String levelId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws NoSuchvdocFieldLevelRelException;

	/**
	* Returns the last vdoc field level rel in the ordered set where levelId = &#63;.
	*
	* @param levelId the level ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc field level rel, or <code>null</code> if a matching vdoc field level rel could not be found
	*/
	public vdocFieldLevelRel fetchByLevel_Last(java.lang.String levelId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator);

	/**
	* Returns the vdoc field level rels before and after the current vdoc field level rel in the ordered set where levelId = &#63;.
	*
	* @param vdocFieldLevelRelPK the primary key of the current vdoc field level rel
	* @param levelId the level ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc field level rel
	* @throws NoSuchvdocFieldLevelRelException if a vdoc field level rel with the primary key could not be found
	*/
	public vdocFieldLevelRel[] findByLevel_PrevAndNext(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK,
		java.lang.String levelId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws NoSuchvdocFieldLevelRelException;

	/**
	* Removes all the vdoc field level rels where levelId = &#63; from the database.
	*
	* @param levelId the level ID
	*/
	public void removeByLevel(java.lang.String levelId);

	/**
	* Returns the number of vdoc field level rels where levelId = &#63;.
	*
	* @param levelId the level ID
	* @return the number of matching vdoc field level rels
	*/
	public int countByLevel(java.lang.String levelId);

	/**
	* Returns all the vdoc field level rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the matching vdoc field level rels
	*/
	public java.util.List<vdocFieldLevelRel> findByField(
		java.lang.String fieldId);

	/**
	* Returns a range of all the vdoc field level rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fieldId the field ID
	* @param start the lower bound of the range of vdoc field level rels
	* @param end the upper bound of the range of vdoc field level rels (not inclusive)
	* @return the range of matching vdoc field level rels
	*/
	public java.util.List<vdocFieldLevelRel> findByField(
		java.lang.String fieldId, int start, int end);

	/**
	* Returns an ordered range of all the vdoc field level rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fieldId the field ID
	* @param start the lower bound of the range of vdoc field level rels
	* @param end the upper bound of the range of vdoc field level rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc field level rels
	*/
	public java.util.List<vdocFieldLevelRel> findByField(
		java.lang.String fieldId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc field level rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fieldId the field ID
	* @param start the lower bound of the range of vdoc field level rels
	* @param end the upper bound of the range of vdoc field level rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc field level rels
	*/
	public java.util.List<vdocFieldLevelRel> findByField(
		java.lang.String fieldId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc field level rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc field level rel
	* @throws NoSuchvdocFieldLevelRelException if a matching vdoc field level rel could not be found
	*/
	public vdocFieldLevelRel findByField_First(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws NoSuchvdocFieldLevelRelException;

	/**
	* Returns the first vdoc field level rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc field level rel, or <code>null</code> if a matching vdoc field level rel could not be found
	*/
	public vdocFieldLevelRel fetchByField_First(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator);

	/**
	* Returns the last vdoc field level rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc field level rel
	* @throws NoSuchvdocFieldLevelRelException if a matching vdoc field level rel could not be found
	*/
	public vdocFieldLevelRel findByField_Last(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws NoSuchvdocFieldLevelRelException;

	/**
	* Returns the last vdoc field level rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc field level rel, or <code>null</code> if a matching vdoc field level rel could not be found
	*/
	public vdocFieldLevelRel fetchByField_Last(java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator);

	/**
	* Returns the vdoc field level rels before and after the current vdoc field level rel in the ordered set where fieldId = &#63;.
	*
	* @param vdocFieldLevelRelPK the primary key of the current vdoc field level rel
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc field level rel
	* @throws NoSuchvdocFieldLevelRelException if a vdoc field level rel with the primary key could not be found
	*/
	public vdocFieldLevelRel[] findByField_PrevAndNext(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK,
		java.lang.String fieldId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws NoSuchvdocFieldLevelRelException;

	/**
	* Removes all the vdoc field level rels where fieldId = &#63; from the database.
	*
	* @param fieldId the field ID
	*/
	public void removeByField(java.lang.String fieldId);

	/**
	* Returns the number of vdoc field level rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the number of matching vdoc field level rels
	*/
	public int countByField(java.lang.String fieldId);

	/**
	* Caches the vdoc field level rel in the entity cache if it is enabled.
	*
	* @param vdocFieldLevelRel the vdoc field level rel
	*/
	public void cacheResult(vdocFieldLevelRel vdocFieldLevelRel);

	/**
	* Caches the vdoc field level rels in the entity cache if it is enabled.
	*
	* @param vdocFieldLevelRels the vdoc field level rels
	*/
	public void cacheResult(
		java.util.List<vdocFieldLevelRel> vdocFieldLevelRels);

	/**
	* Creates a new vdoc field level rel with the primary key. Does not add the vdoc field level rel to the database.
	*
	* @param vdocFieldLevelRelPK the primary key for the new vdoc field level rel
	* @return the new vdoc field level rel
	*/
	public vdocFieldLevelRel create(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK);

	/**
	* Removes the vdoc field level rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocFieldLevelRelPK the primary key of the vdoc field level rel
	* @return the vdoc field level rel that was removed
	* @throws NoSuchvdocFieldLevelRelException if a vdoc field level rel with the primary key could not be found
	*/
	public vdocFieldLevelRel remove(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK)
		throws NoSuchvdocFieldLevelRelException;

	public vdocFieldLevelRel updateImpl(vdocFieldLevelRel vdocFieldLevelRel);

	/**
	* Returns the vdoc field level rel with the primary key or throws a {@link NoSuchvdocFieldLevelRelException} if it could not be found.
	*
	* @param vdocFieldLevelRelPK the primary key of the vdoc field level rel
	* @return the vdoc field level rel
	* @throws NoSuchvdocFieldLevelRelException if a vdoc field level rel with the primary key could not be found
	*/
	public vdocFieldLevelRel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK)
		throws NoSuchvdocFieldLevelRelException;

	/**
	* Returns the vdoc field level rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vdocFieldLevelRelPK the primary key of the vdoc field level rel
	* @return the vdoc field level rel, or <code>null</code> if a vdoc field level rel with the primary key could not be found
	*/
	public vdocFieldLevelRel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK);

	@Override
	public java.util.Map<java.io.Serializable, vdocFieldLevelRel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vdoc field level rels.
	*
	* @return the vdoc field level rels
	*/
	public java.util.List<vdocFieldLevelRel> findAll();

	/**
	* Returns a range of all the vdoc field level rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc field level rels
	* @param end the upper bound of the range of vdoc field level rels (not inclusive)
	* @return the range of vdoc field level rels
	*/
	public java.util.List<vdocFieldLevelRel> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vdoc field level rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc field level rels
	* @param end the upper bound of the range of vdoc field level rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vdoc field level rels
	*/
	public java.util.List<vdocFieldLevelRel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc field level rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc field level rels
	* @param end the upper bound of the range of vdoc field level rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vdoc field level rels
	*/
	public java.util.List<vdocFieldLevelRel> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocFieldLevelRel> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vdoc field level rels from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vdoc field level rels.
	*
	* @return the number of vdoc field level rels
	*/
	public int countAll();
}