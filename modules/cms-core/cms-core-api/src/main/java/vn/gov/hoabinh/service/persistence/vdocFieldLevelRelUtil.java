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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import vn.gov.hoabinh.model.vdocFieldLevelRel;

import java.util.List;

/**
 * The persistence utility for the vdoc field level rel service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.vdocFieldLevelRelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocFieldLevelRelPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.vdocFieldLevelRelPersistenceImpl
 * @generated
 */
@ProviderType
public class vdocFieldLevelRelUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(vdocFieldLevelRel vdocFieldLevelRel) {
		getPersistence().clearCache(vdocFieldLevelRel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<vdocFieldLevelRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<vdocFieldLevelRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<vdocFieldLevelRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<vdocFieldLevelRel> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static vdocFieldLevelRel update(vdocFieldLevelRel vdocFieldLevelRel) {
		return getPersistence().update(vdocFieldLevelRel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static vdocFieldLevelRel update(
		vdocFieldLevelRel vdocFieldLevelRel, ServiceContext serviceContext) {
		return getPersistence().update(vdocFieldLevelRel, serviceContext);
	}

	/**
	* Returns all the vdoc field level rels where levelId = &#63;.
	*
	* @param levelId the level ID
	* @return the matching vdoc field level rels
	*/
	public static List<vdocFieldLevelRel> findByLevel(java.lang.String levelId) {
		return getPersistence().findByLevel(levelId);
	}

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
	public static List<vdocFieldLevelRel> findByLevel(
		java.lang.String levelId, int start, int end) {
		return getPersistence().findByLevel(levelId, start, end);
	}

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
	public static List<vdocFieldLevelRel> findByLevel(
		java.lang.String levelId, int start, int end,
		OrderByComparator<vdocFieldLevelRel> orderByComparator) {
		return getPersistence()
				   .findByLevel(levelId, start, end, orderByComparator);
	}

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
	public static List<vdocFieldLevelRel> findByLevel(
		java.lang.String levelId, int start, int end,
		OrderByComparator<vdocFieldLevelRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByLevel(levelId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vdoc field level rel in the ordered set where levelId = &#63;.
	*
	* @param levelId the level ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc field level rel
	* @throws NoSuchvdocFieldLevelRelException if a matching vdoc field level rel could not be found
	*/
	public static vdocFieldLevelRel findByLevel_First(
		java.lang.String levelId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldLevelRelException {
		return getPersistence().findByLevel_First(levelId, orderByComparator);
	}

	/**
	* Returns the first vdoc field level rel in the ordered set where levelId = &#63;.
	*
	* @param levelId the level ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc field level rel, or <code>null</code> if a matching vdoc field level rel could not be found
	*/
	public static vdocFieldLevelRel fetchByLevel_First(
		java.lang.String levelId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator) {
		return getPersistence().fetchByLevel_First(levelId, orderByComparator);
	}

	/**
	* Returns the last vdoc field level rel in the ordered set where levelId = &#63;.
	*
	* @param levelId the level ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc field level rel
	* @throws NoSuchvdocFieldLevelRelException if a matching vdoc field level rel could not be found
	*/
	public static vdocFieldLevelRel findByLevel_Last(java.lang.String levelId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldLevelRelException {
		return getPersistence().findByLevel_Last(levelId, orderByComparator);
	}

	/**
	* Returns the last vdoc field level rel in the ordered set where levelId = &#63;.
	*
	* @param levelId the level ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc field level rel, or <code>null</code> if a matching vdoc field level rel could not be found
	*/
	public static vdocFieldLevelRel fetchByLevel_Last(
		java.lang.String levelId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator) {
		return getPersistence().fetchByLevel_Last(levelId, orderByComparator);
	}

	/**
	* Returns the vdoc field level rels before and after the current vdoc field level rel in the ordered set where levelId = &#63;.
	*
	* @param vdocFieldLevelRelPK the primary key of the current vdoc field level rel
	* @param levelId the level ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc field level rel
	* @throws NoSuchvdocFieldLevelRelException if a vdoc field level rel with the primary key could not be found
	*/
	public static vdocFieldLevelRel[] findByLevel_PrevAndNext(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK,
		java.lang.String levelId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldLevelRelException {
		return getPersistence()
				   .findByLevel_PrevAndNext(vdocFieldLevelRelPK, levelId,
			orderByComparator);
	}

	/**
	* Removes all the vdoc field level rels where levelId = &#63; from the database.
	*
	* @param levelId the level ID
	*/
	public static void removeByLevel(java.lang.String levelId) {
		getPersistence().removeByLevel(levelId);
	}

	/**
	* Returns the number of vdoc field level rels where levelId = &#63;.
	*
	* @param levelId the level ID
	* @return the number of matching vdoc field level rels
	*/
	public static int countByLevel(java.lang.String levelId) {
		return getPersistence().countByLevel(levelId);
	}

	/**
	* Returns all the vdoc field level rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the matching vdoc field level rels
	*/
	public static List<vdocFieldLevelRel> findByField(java.lang.String fieldId) {
		return getPersistence().findByField(fieldId);
	}

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
	public static List<vdocFieldLevelRel> findByField(
		java.lang.String fieldId, int start, int end) {
		return getPersistence().findByField(fieldId, start, end);
	}

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
	public static List<vdocFieldLevelRel> findByField(
		java.lang.String fieldId, int start, int end,
		OrderByComparator<vdocFieldLevelRel> orderByComparator) {
		return getPersistence()
				   .findByField(fieldId, start, end, orderByComparator);
	}

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
	public static List<vdocFieldLevelRel> findByField(
		java.lang.String fieldId, int start, int end,
		OrderByComparator<vdocFieldLevelRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByField(fieldId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vdoc field level rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc field level rel
	* @throws NoSuchvdocFieldLevelRelException if a matching vdoc field level rel could not be found
	*/
	public static vdocFieldLevelRel findByField_First(
		java.lang.String fieldId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldLevelRelException {
		return getPersistence().findByField_First(fieldId, orderByComparator);
	}

	/**
	* Returns the first vdoc field level rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc field level rel, or <code>null</code> if a matching vdoc field level rel could not be found
	*/
	public static vdocFieldLevelRel fetchByField_First(
		java.lang.String fieldId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator) {
		return getPersistence().fetchByField_First(fieldId, orderByComparator);
	}

	/**
	* Returns the last vdoc field level rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc field level rel
	* @throws NoSuchvdocFieldLevelRelException if a matching vdoc field level rel could not be found
	*/
	public static vdocFieldLevelRel findByField_Last(java.lang.String fieldId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldLevelRelException {
		return getPersistence().findByField_Last(fieldId, orderByComparator);
	}

	/**
	* Returns the last vdoc field level rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc field level rel, or <code>null</code> if a matching vdoc field level rel could not be found
	*/
	public static vdocFieldLevelRel fetchByField_Last(
		java.lang.String fieldId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator) {
		return getPersistence().fetchByField_Last(fieldId, orderByComparator);
	}

	/**
	* Returns the vdoc field level rels before and after the current vdoc field level rel in the ordered set where fieldId = &#63;.
	*
	* @param vdocFieldLevelRelPK the primary key of the current vdoc field level rel
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc field level rel
	* @throws NoSuchvdocFieldLevelRelException if a vdoc field level rel with the primary key could not be found
	*/
	public static vdocFieldLevelRel[] findByField_PrevAndNext(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK,
		java.lang.String fieldId,
		OrderByComparator<vdocFieldLevelRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldLevelRelException {
		return getPersistence()
				   .findByField_PrevAndNext(vdocFieldLevelRelPK, fieldId,
			orderByComparator);
	}

	/**
	* Removes all the vdoc field level rels where fieldId = &#63; from the database.
	*
	* @param fieldId the field ID
	*/
	public static void removeByField(java.lang.String fieldId) {
		getPersistence().removeByField(fieldId);
	}

	/**
	* Returns the number of vdoc field level rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the number of matching vdoc field level rels
	*/
	public static int countByField(java.lang.String fieldId) {
		return getPersistence().countByField(fieldId);
	}

	/**
	* Caches the vdoc field level rel in the entity cache if it is enabled.
	*
	* @param vdocFieldLevelRel the vdoc field level rel
	*/
	public static void cacheResult(vdocFieldLevelRel vdocFieldLevelRel) {
		getPersistence().cacheResult(vdocFieldLevelRel);
	}

	/**
	* Caches the vdoc field level rels in the entity cache if it is enabled.
	*
	* @param vdocFieldLevelRels the vdoc field level rels
	*/
	public static void cacheResult(List<vdocFieldLevelRel> vdocFieldLevelRels) {
		getPersistence().cacheResult(vdocFieldLevelRels);
	}

	/**
	* Creates a new vdoc field level rel with the primary key. Does not add the vdoc field level rel to the database.
	*
	* @param vdocFieldLevelRelPK the primary key for the new vdoc field level rel
	* @return the new vdoc field level rel
	*/
	public static vdocFieldLevelRel create(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK) {
		return getPersistence().create(vdocFieldLevelRelPK);
	}

	/**
	* Removes the vdoc field level rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocFieldLevelRelPK the primary key of the vdoc field level rel
	* @return the vdoc field level rel that was removed
	* @throws NoSuchvdocFieldLevelRelException if a vdoc field level rel with the primary key could not be found
	*/
	public static vdocFieldLevelRel remove(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldLevelRelException {
		return getPersistence().remove(vdocFieldLevelRelPK);
	}

	public static vdocFieldLevelRel updateImpl(
		vdocFieldLevelRel vdocFieldLevelRel) {
		return getPersistence().updateImpl(vdocFieldLevelRel);
	}

	/**
	* Returns the vdoc field level rel with the primary key or throws a {@link NoSuchvdocFieldLevelRelException} if it could not be found.
	*
	* @param vdocFieldLevelRelPK the primary key of the vdoc field level rel
	* @return the vdoc field level rel
	* @throws NoSuchvdocFieldLevelRelException if a vdoc field level rel with the primary key could not be found
	*/
	public static vdocFieldLevelRel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK)
		throws vn.gov.hoabinh.exception.NoSuchvdocFieldLevelRelException {
		return getPersistence().findByPrimaryKey(vdocFieldLevelRelPK);
	}

	/**
	* Returns the vdoc field level rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vdocFieldLevelRelPK the primary key of the vdoc field level rel
	* @return the vdoc field level rel, or <code>null</code> if a vdoc field level rel with the primary key could not be found
	*/
	public static vdocFieldLevelRel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK vdocFieldLevelRelPK) {
		return getPersistence().fetchByPrimaryKey(vdocFieldLevelRelPK);
	}

	public static java.util.Map<java.io.Serializable, vdocFieldLevelRel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vdoc field level rels.
	*
	* @return the vdoc field level rels
	*/
	public static List<vdocFieldLevelRel> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<vdocFieldLevelRel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<vdocFieldLevelRel> findAll(int start, int end,
		OrderByComparator<vdocFieldLevelRel> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<vdocFieldLevelRel> findAll(int start, int end,
		OrderByComparator<vdocFieldLevelRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vdoc field level rels from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vdoc field level rels.
	*
	* @return the number of vdoc field level rels
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static vdocFieldLevelRelPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<vdocFieldLevelRelPersistence, vdocFieldLevelRelPersistence> _serviceTracker =
		ServiceTrackerFactory.open(vdocFieldLevelRelPersistence.class);
}