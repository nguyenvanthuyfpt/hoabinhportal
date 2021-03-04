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

import vn.gov.hoabinh.model.VLegalDURel;

import java.util.List;

/**
 * The persistence utility for the v legal d u rel service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalDURelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDURelPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalDURelPersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalDURelUtil {
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
	public static void clearCache(VLegalDURel vLegalDURel) {
		getPersistence().clearCache(vLegalDURel);
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
	public static List<VLegalDURel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalDURel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalDURel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalDURel> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalDURel update(VLegalDURel vLegalDURel) {
		return getPersistence().update(vLegalDURel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalDURel update(VLegalDURel vLegalDURel,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalDURel, serviceContext);
	}

	/**
	* Returns all the v legal d u rels where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @return the matching v legal d u rels
	*/
	public static List<VLegalDURel> findByDepartament(long departmentId) {
		return getPersistence().findByDepartament(departmentId);
	}

	/**
	* Returns a range of all the v legal d u rels where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param departmentId the department ID
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @return the range of matching v legal d u rels
	*/
	public static List<VLegalDURel> findByDepartament(long departmentId,
		int start, int end) {
		return getPersistence().findByDepartament(departmentId, start, end);
	}

	/**
	* Returns an ordered range of all the v legal d u rels where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param departmentId the department ID
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal d u rels
	*/
	public static List<VLegalDURel> findByDepartament(long departmentId,
		int start, int end, OrderByComparator<VLegalDURel> orderByComparator) {
		return getPersistence()
				   .findByDepartament(departmentId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal d u rels where departmentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param departmentId the department ID
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal d u rels
	*/
	public static List<VLegalDURel> findByDepartament(long departmentId,
		int start, int end, OrderByComparator<VLegalDURel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDepartament(departmentId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first v legal d u rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d u rel
	* @throws NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	*/
	public static VLegalDURel findByDepartament_First(long departmentId,
		OrderByComparator<VLegalDURel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDURelException {
		return getPersistence()
				   .findByDepartament_First(departmentId, orderByComparator);
	}

	/**
	* Returns the first v legal d u rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	*/
	public static VLegalDURel fetchByDepartament_First(long departmentId,
		OrderByComparator<VLegalDURel> orderByComparator) {
		return getPersistence()
				   .fetchByDepartament_First(departmentId, orderByComparator);
	}

	/**
	* Returns the last v legal d u rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d u rel
	* @throws NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	*/
	public static VLegalDURel findByDepartament_Last(long departmentId,
		OrderByComparator<VLegalDURel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDURelException {
		return getPersistence()
				   .findByDepartament_Last(departmentId, orderByComparator);
	}

	/**
	* Returns the last v legal d u rel in the ordered set where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	*/
	public static VLegalDURel fetchByDepartament_Last(long departmentId,
		OrderByComparator<VLegalDURel> orderByComparator) {
		return getPersistence()
				   .fetchByDepartament_Last(departmentId, orderByComparator);
	}

	/**
	* Returns the v legal d u rels before and after the current v legal d u rel in the ordered set where departmentId = &#63;.
	*
	* @param vLegalDURelPK the primary key of the current v legal d u rel
	* @param departmentId the department ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d u rel
	* @throws NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	*/
	public static VLegalDURel[] findByDepartament_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK,
		long departmentId, OrderByComparator<VLegalDURel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDURelException {
		return getPersistence()
				   .findByDepartament_PrevAndNext(vLegalDURelPK, departmentId,
			orderByComparator);
	}

	/**
	* Removes all the v legal d u rels where departmentId = &#63; from the database.
	*
	* @param departmentId the department ID
	*/
	public static void removeByDepartament(long departmentId) {
		getPersistence().removeByDepartament(departmentId);
	}

	/**
	* Returns the number of v legal d u rels where departmentId = &#63;.
	*
	* @param departmentId the department ID
	* @return the number of matching v legal d u rels
	*/
	public static int countByDepartament(long departmentId) {
		return getPersistence().countByDepartament(departmentId);
	}

	/**
	* Returns all the v legal d u rels where userid = &#63;.
	*
	* @param userid the userid
	* @return the matching v legal d u rels
	*/
	public static List<VLegalDURel> findByUser(long userid) {
		return getPersistence().findByUser(userid);
	}

	/**
	* Returns a range of all the v legal d u rels where userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userid the userid
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @return the range of matching v legal d u rels
	*/
	public static List<VLegalDURel> findByUser(long userid, int start, int end) {
		return getPersistence().findByUser(userid, start, end);
	}

	/**
	* Returns an ordered range of all the v legal d u rels where userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userid the userid
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal d u rels
	*/
	public static List<VLegalDURel> findByUser(long userid, int start, int end,
		OrderByComparator<VLegalDURel> orderByComparator) {
		return getPersistence().findByUser(userid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal d u rels where userid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userid the userid
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal d u rels
	*/
	public static List<VLegalDURel> findByUser(long userid, int start, int end,
		OrderByComparator<VLegalDURel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUser(userid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal d u rel in the ordered set where userid = &#63;.
	*
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d u rel
	* @throws NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	*/
	public static VLegalDURel findByUser_First(long userid,
		OrderByComparator<VLegalDURel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDURelException {
		return getPersistence().findByUser_First(userid, orderByComparator);
	}

	/**
	* Returns the first v legal d u rel in the ordered set where userid = &#63;.
	*
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	*/
	public static VLegalDURel fetchByUser_First(long userid,
		OrderByComparator<VLegalDURel> orderByComparator) {
		return getPersistence().fetchByUser_First(userid, orderByComparator);
	}

	/**
	* Returns the last v legal d u rel in the ordered set where userid = &#63;.
	*
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d u rel
	* @throws NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	*/
	public static VLegalDURel findByUser_Last(long userid,
		OrderByComparator<VLegalDURel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDURelException {
		return getPersistence().findByUser_Last(userid, orderByComparator);
	}

	/**
	* Returns the last v legal d u rel in the ordered set where userid = &#63;.
	*
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	*/
	public static VLegalDURel fetchByUser_Last(long userid,
		OrderByComparator<VLegalDURel> orderByComparator) {
		return getPersistence().fetchByUser_Last(userid, orderByComparator);
	}

	/**
	* Returns the v legal d u rels before and after the current v legal d u rel in the ordered set where userid = &#63;.
	*
	* @param vLegalDURelPK the primary key of the current v legal d u rel
	* @param userid the userid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d u rel
	* @throws NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	*/
	public static VLegalDURel[] findByUser_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK,
		long userid, OrderByComparator<VLegalDURel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDURelException {
		return getPersistence()
				   .findByUser_PrevAndNext(vLegalDURelPK, userid,
			orderByComparator);
	}

	/**
	* Removes all the v legal d u rels where userid = &#63; from the database.
	*
	* @param userid the userid
	*/
	public static void removeByUser(long userid) {
		getPersistence().removeByUser(userid);
	}

	/**
	* Returns the number of v legal d u rels where userid = &#63;.
	*
	* @param userid the userid
	* @return the number of matching v legal d u rels
	*/
	public static int countByUser(long userid) {
		return getPersistence().countByUser(userid);
	}

	/**
	* Returns the v legal d u rel where userid = &#63; or throws a {@link NoSuchVLegalDURelException} if it could not be found.
	*
	* @param userid the userid
	* @return the matching v legal d u rel
	* @throws NoSuchVLegalDURelException if a matching v legal d u rel could not be found
	*/
	public static VLegalDURel findByUserId(long userid)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDURelException {
		return getPersistence().findByUserId(userid);
	}

	/**
	* Returns the v legal d u rel where userid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userid the userid
	* @return the matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	*/
	public static VLegalDURel fetchByUserId(long userid) {
		return getPersistence().fetchByUserId(userid);
	}

	/**
	* Returns the v legal d u rel where userid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userid the userid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal d u rel, or <code>null</code> if a matching v legal d u rel could not be found
	*/
	public static VLegalDURel fetchByUserId(long userid,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUserId(userid, retrieveFromCache);
	}

	/**
	* Removes the v legal d u rel where userid = &#63; from the database.
	*
	* @param userid the userid
	* @return the v legal d u rel that was removed
	*/
	public static VLegalDURel removeByUserId(long userid)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDURelException {
		return getPersistence().removeByUserId(userid);
	}

	/**
	* Returns the number of v legal d u rels where userid = &#63;.
	*
	* @param userid the userid
	* @return the number of matching v legal d u rels
	*/
	public static int countByUserId(long userid) {
		return getPersistence().countByUserId(userid);
	}

	/**
	* Caches the v legal d u rel in the entity cache if it is enabled.
	*
	* @param vLegalDURel the v legal d u rel
	*/
	public static void cacheResult(VLegalDURel vLegalDURel) {
		getPersistence().cacheResult(vLegalDURel);
	}

	/**
	* Caches the v legal d u rels in the entity cache if it is enabled.
	*
	* @param vLegalDURels the v legal d u rels
	*/
	public static void cacheResult(List<VLegalDURel> vLegalDURels) {
		getPersistence().cacheResult(vLegalDURels);
	}

	/**
	* Creates a new v legal d u rel with the primary key. Does not add the v legal d u rel to the database.
	*
	* @param vLegalDURelPK the primary key for the new v legal d u rel
	* @return the new v legal d u rel
	*/
	public static VLegalDURel create(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK) {
		return getPersistence().create(vLegalDURelPK);
	}

	/**
	* Removes the v legal d u rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDURelPK the primary key of the v legal d u rel
	* @return the v legal d u rel that was removed
	* @throws NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	*/
	public static VLegalDURel remove(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDURelException {
		return getPersistence().remove(vLegalDURelPK);
	}

	public static VLegalDURel updateImpl(VLegalDURel vLegalDURel) {
		return getPersistence().updateImpl(vLegalDURel);
	}

	/**
	* Returns the v legal d u rel with the primary key or throws a {@link NoSuchVLegalDURelException} if it could not be found.
	*
	* @param vLegalDURelPK the primary key of the v legal d u rel
	* @return the v legal d u rel
	* @throws NoSuchVLegalDURelException if a v legal d u rel with the primary key could not be found
	*/
	public static VLegalDURel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDURelException {
		return getPersistence().findByPrimaryKey(vLegalDURelPK);
	}

	/**
	* Returns the v legal d u rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalDURelPK the primary key of the v legal d u rel
	* @return the v legal d u rel, or <code>null</code> if a v legal d u rel with the primary key could not be found
	*/
	public static VLegalDURel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK vLegalDURelPK) {
		return getPersistence().fetchByPrimaryKey(vLegalDURelPK);
	}

	public static java.util.Map<java.io.Serializable, VLegalDURel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal d u rels.
	*
	* @return the v legal d u rels
	*/
	public static List<VLegalDURel> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the v legal d u rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @return the range of v legal d u rels
	*/
	public static List<VLegalDURel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the v legal d u rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal d u rels
	*/
	public static List<VLegalDURel> findAll(int start, int end,
		OrderByComparator<VLegalDURel> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal d u rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDURelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d u rels
	* @param end the upper bound of the range of v legal d u rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal d u rels
	*/
	public static List<VLegalDURel> findAll(int start, int end,
		OrderByComparator<VLegalDURel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal d u rels from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal d u rels.
	*
	* @return the number of v legal d u rels
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalDURelPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalDURelPersistence, VLegalDURelPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalDURelPersistence.class);
}