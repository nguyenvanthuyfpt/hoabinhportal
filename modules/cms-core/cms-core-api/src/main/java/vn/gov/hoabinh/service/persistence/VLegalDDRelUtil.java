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

import vn.gov.hoabinh.model.VLegalDDRel;

import java.util.List;

/**
 * The persistence utility for the v legal d d rel service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalDDRelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDDRelPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalDDRelPersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalDDRelUtil {
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
	public static void clearCache(VLegalDDRel vLegalDDRel) {
		getPersistence().clearCache(vLegalDDRel);
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
	public static List<VLegalDDRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalDDRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalDDRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalDDRel> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalDDRel update(VLegalDDRel vLegalDDRel) {
		return getPersistence().update(vLegalDDRel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalDDRel update(VLegalDDRel vLegalDDRel,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalDDRel, serviceContext);
	}

	/**
	* Returns all the v legal d d rels where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @return the matching v legal d d rels
	*/
	public static List<VLegalDDRel> findByDepartament(long departmentId) {
		return getPersistence().findByDepartament(departmentId);
	}

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
	public static List<VLegalDDRel> findByDepartament(long departmentId,
		int start, int end) {
		return getPersistence().findByDepartament(departmentId, start, end);
	}

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
	public static List<VLegalDDRel> findByDepartament(long departmentId,
		int start, int end, OrderByComparator<VLegalDDRel> orderByComparator) {
		return getPersistence()
				   .findByDepartament(departmentId, start, end,
			orderByComparator);
	}

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
	public static List<VLegalDDRel> findByDepartament(long departmentId,
		int start, int end, OrderByComparator<VLegalDDRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDepartament(departmentId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first v legal d d rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d d rel
	* @throws NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	*/
	public static VLegalDDRel findByDepartament_First(long departmentId,
		OrderByComparator<VLegalDDRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDDRelException {
		return getPersistence()
				   .findByDepartament_First(departmentId, orderByComparator);
	}

	/**
	* Returns the first v legal d d rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d d rel, or <code>null</code> if a matching v legal d d rel could not be found
	*/
	public static VLegalDDRel fetchByDepartament_First(long departmentId,
		OrderByComparator<VLegalDDRel> orderByComparator) {
		return getPersistence()
				   .fetchByDepartament_First(departmentId, orderByComparator);
	}

	/**
	* Returns the last v legal d d rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d d rel
	* @throws NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	*/
	public static VLegalDDRel findByDepartament_Last(long departmentId,
		OrderByComparator<VLegalDDRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDDRelException {
		return getPersistence()
				   .findByDepartament_Last(departmentId, orderByComparator);
	}

	/**
	* Returns the last v legal d d rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d d rel, or <code>null</code> if a matching v legal d d rel could not be found
	*/
	public static VLegalDDRel fetchByDepartament_Last(long departmentId,
		OrderByComparator<VLegalDDRel> orderByComparator) {
		return getPersistence()
				   .fetchByDepartament_Last(departmentId, orderByComparator);
	}

	/**
	* Returns the v legal d d rels before and after the current v legal d d rel in the ordered set where departmentId = &#63;.
	*
	* @param vLegalDDRelPK the primary key of the current v legal d d rel
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d d rel
	* @throws NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	*/
	public static VLegalDDRel[] findByDepartament_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK,
		long departmentId, OrderByComparator<VLegalDDRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDDRelException {
		return getPersistence()
				   .findByDepartament_PrevAndNext(vLegalDDRelPK, departmentId,
			orderByComparator);
	}

	/**
	* Removes all the v legal d d rels where departmentId = &#63; from the database.
	*
	* @param departmentId the department ID
	*/
	public static void removeByDepartament(long departmentId) {
		getPersistence().removeByDepartament(departmentId);
	}

	/**
	* Returns the number of v legal d d rels where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @return the number of matching v legal d d rels
	*/
	public static int countByDepartament(long departmentId) {
		return getPersistence().countByDepartament(departmentId);
	}

	/**
	* Returns all the v legal d d rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the matching v legal d d rels
	*/
	public static List<VLegalDDRel> findByDoc(java.lang.String docId) {
		return getPersistence().findByDoc(docId);
	}

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
	public static List<VLegalDDRel> findByDoc(java.lang.String docId,
		int start, int end) {
		return getPersistence().findByDoc(docId, start, end);
	}

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
	public static List<VLegalDDRel> findByDoc(java.lang.String docId,
		int start, int end, OrderByComparator<VLegalDDRel> orderByComparator) {
		return getPersistence().findByDoc(docId, start, end, orderByComparator);
	}

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
	public static List<VLegalDDRel> findByDoc(java.lang.String docId,
		int start, int end, OrderByComparator<VLegalDDRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDoc(docId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal d d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d d rel
	* @throws NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	*/
	public static VLegalDDRel findByDoc_First(java.lang.String docId,
		OrderByComparator<VLegalDDRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDDRelException {
		return getPersistence().findByDoc_First(docId, orderByComparator);
	}

	/**
	* Returns the first v legal d d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d d rel, or <code>null</code> if a matching v legal d d rel could not be found
	*/
	public static VLegalDDRel fetchByDoc_First(java.lang.String docId,
		OrderByComparator<VLegalDDRel> orderByComparator) {
		return getPersistence().fetchByDoc_First(docId, orderByComparator);
	}

	/**
	* Returns the last v legal d d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d d rel
	* @throws NoSuchVLegalDDRelException if a matching v legal d d rel could not be found
	*/
	public static VLegalDDRel findByDoc_Last(java.lang.String docId,
		OrderByComparator<VLegalDDRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDDRelException {
		return getPersistence().findByDoc_Last(docId, orderByComparator);
	}

	/**
	* Returns the last v legal d d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d d rel, or <code>null</code> if a matching v legal d d rel could not be found
	*/
	public static VLegalDDRel fetchByDoc_Last(java.lang.String docId,
		OrderByComparator<VLegalDDRel> orderByComparator) {
		return getPersistence().fetchByDoc_Last(docId, orderByComparator);
	}

	/**
	* Returns the v legal d d rels before and after the current v legal d d rel in the ordered set where docId = &#63;.
	*
	* @param vLegalDDRelPK the primary key of the current v legal d d rel
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d d rel
	* @throws NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	*/
	public static VLegalDDRel[] findByDoc_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK,
		java.lang.String docId, OrderByComparator<VLegalDDRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDDRelException {
		return getPersistence()
				   .findByDoc_PrevAndNext(vLegalDDRelPK, docId,
			orderByComparator);
	}

	/**
	* Removes all the v legal d d rels where docId = &#63; from the database.
	*
	* @param docId the doc ID
	*/
	public static void removeByDoc(java.lang.String docId) {
		getPersistence().removeByDoc(docId);
	}

	/**
	* Returns the number of v legal d d rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the number of matching v legal d d rels
	*/
	public static int countByDoc(java.lang.String docId) {
		return getPersistence().countByDoc(docId);
	}

	/**
	* Caches the v legal d d rel in the entity cache if it is enabled.
	*
	* @param vLegalDDRel the v legal d d rel
	*/
	public static void cacheResult(VLegalDDRel vLegalDDRel) {
		getPersistence().cacheResult(vLegalDDRel);
	}

	/**
	* Caches the v legal d d rels in the entity cache if it is enabled.
	*
	* @param vLegalDDRels the v legal d d rels
	*/
	public static void cacheResult(List<VLegalDDRel> vLegalDDRels) {
		getPersistence().cacheResult(vLegalDDRels);
	}

	/**
	* Creates a new v legal d d rel with the primary key. Does not add the v legal d d rel to the database.
	*
	* @param vLegalDDRelPK the primary key for the new v legal d d rel
	* @return the new v legal d d rel
	*/
	public static VLegalDDRel create(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK) {
		return getPersistence().create(vLegalDDRelPK);
	}

	/**
	* Removes the v legal d d rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel
	* @return the v legal d d rel that was removed
	* @throws NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	*/
	public static VLegalDDRel remove(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDDRelException {
		return getPersistence().remove(vLegalDDRelPK);
	}

	public static VLegalDDRel updateImpl(VLegalDDRel vLegalDDRel) {
		return getPersistence().updateImpl(vLegalDDRel);
	}

	/**
	* Returns the v legal d d rel with the primary key or throws a {@link NoSuchVLegalDDRelException} if it could not be found.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel
	* @return the v legal d d rel
	* @throws NoSuchVLegalDDRelException if a v legal d d rel with the primary key could not be found
	*/
	public static VLegalDDRel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDDRelException {
		return getPersistence().findByPrimaryKey(vLegalDDRelPK);
	}

	/**
	* Returns the v legal d d rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalDDRelPK the primary key of the v legal d d rel
	* @return the v legal d d rel, or <code>null</code> if a v legal d d rel with the primary key could not be found
	*/
	public static VLegalDDRel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK vLegalDDRelPK) {
		return getPersistence().fetchByPrimaryKey(vLegalDDRelPK);
	}

	public static java.util.Map<java.io.Serializable, VLegalDDRel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal d d rels.
	*
	* @return the v legal d d rels
	*/
	public static List<VLegalDDRel> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<VLegalDDRel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<VLegalDDRel> findAll(int start, int end,
		OrderByComparator<VLegalDDRel> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<VLegalDDRel> findAll(int start, int end,
		OrderByComparator<VLegalDDRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal d d rels from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal d d rels.
	*
	* @return the number of v legal d d rels
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalDDRelPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalDDRelPersistence, VLegalDDRelPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalDDRelPersistence.class);
}