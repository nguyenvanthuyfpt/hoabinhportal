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

import vn.gov.hoabinh.model.VLegalFORel;

import java.util.List;

/**
 * The persistence utility for the v legal f o rel service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalFORelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFORelPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalFORelPersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalFORelUtil {
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
	public static void clearCache(VLegalFORel vLegalFORel) {
		getPersistence().clearCache(vLegalFORel);
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
	public static List<VLegalFORel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalFORel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalFORel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalFORel> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalFORel update(VLegalFORel vLegalFORel) {
		return getPersistence().update(vLegalFORel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalFORel update(VLegalFORel vLegalFORel,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalFORel, serviceContext);
	}

	/**
	* Returns all the v legal f o rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the matching v legal f o rels
	*/
	public static List<VLegalFORel> findByField(java.lang.String fieldId) {
		return getPersistence().findByField(fieldId);
	}

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
	public static List<VLegalFORel> findByField(java.lang.String fieldId,
		int start, int end) {
		return getPersistence().findByField(fieldId, start, end);
	}

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
	public static List<VLegalFORel> findByField(java.lang.String fieldId,
		int start, int end, OrderByComparator<VLegalFORel> orderByComparator) {
		return getPersistence()
				   .findByField(fieldId, start, end, orderByComparator);
	}

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
	public static List<VLegalFORel> findByField(java.lang.String fieldId,
		int start, int end, OrderByComparator<VLegalFORel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByField(fieldId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal f o rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f o rel
	* @throws NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	*/
	public static VLegalFORel findByField_First(java.lang.String fieldId,
		OrderByComparator<VLegalFORel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFORelException {
		return getPersistence().findByField_First(fieldId, orderByComparator);
	}

	/**
	* Returns the first v legal f o rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f o rel, or <code>null</code> if a matching v legal f o rel could not be found
	*/
	public static VLegalFORel fetchByField_First(java.lang.String fieldId,
		OrderByComparator<VLegalFORel> orderByComparator) {
		return getPersistence().fetchByField_First(fieldId, orderByComparator);
	}

	/**
	* Returns the last v legal f o rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f o rel
	* @throws NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	*/
	public static VLegalFORel findByField_Last(java.lang.String fieldId,
		OrderByComparator<VLegalFORel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFORelException {
		return getPersistence().findByField_Last(fieldId, orderByComparator);
	}

	/**
	* Returns the last v legal f o rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f o rel, or <code>null</code> if a matching v legal f o rel could not be found
	*/
	public static VLegalFORel fetchByField_Last(java.lang.String fieldId,
		OrderByComparator<VLegalFORel> orderByComparator) {
		return getPersistence().fetchByField_Last(fieldId, orderByComparator);
	}

	/**
	* Returns the v legal f o rels before and after the current v legal f o rel in the ordered set where fieldId = &#63;.
	*
	* @param vLegalFORelPK the primary key of the current v legal f o rel
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal f o rel
	* @throws NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	*/
	public static VLegalFORel[] findByField_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK,
		java.lang.String fieldId,
		OrderByComparator<VLegalFORel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFORelException {
		return getPersistence()
				   .findByField_PrevAndNext(vLegalFORelPK, fieldId,
			orderByComparator);
	}

	/**
	* Removes all the v legal f o rels where fieldId = &#63; from the database.
	*
	* @param fieldId the field ID
	*/
	public static void removeByField(java.lang.String fieldId) {
		getPersistence().removeByField(fieldId);
	}

	/**
	* Returns the number of v legal f o rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the number of matching v legal f o rels
	*/
	public static int countByField(java.lang.String fieldId) {
		return getPersistence().countByField(fieldId);
	}

	/**
	* Returns all the v legal f o rels where orgId = &#63;.
	*
	* @param orgId the org ID
	* @return the matching v legal f o rels
	*/
	public static List<VLegalFORel> findByOrg(java.lang.String orgId) {
		return getPersistence().findByOrg(orgId);
	}

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
	public static List<VLegalFORel> findByOrg(java.lang.String orgId,
		int start, int end) {
		return getPersistence().findByOrg(orgId, start, end);
	}

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
	public static List<VLegalFORel> findByOrg(java.lang.String orgId,
		int start, int end, OrderByComparator<VLegalFORel> orderByComparator) {
		return getPersistence().findByOrg(orgId, start, end, orderByComparator);
	}

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
	public static List<VLegalFORel> findByOrg(java.lang.String orgId,
		int start, int end, OrderByComparator<VLegalFORel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOrg(orgId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal f o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f o rel
	* @throws NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	*/
	public static VLegalFORel findByOrg_First(java.lang.String orgId,
		OrderByComparator<VLegalFORel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFORelException {
		return getPersistence().findByOrg_First(orgId, orderByComparator);
	}

	/**
	* Returns the first v legal f o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f o rel, or <code>null</code> if a matching v legal f o rel could not be found
	*/
	public static VLegalFORel fetchByOrg_First(java.lang.String orgId,
		OrderByComparator<VLegalFORel> orderByComparator) {
		return getPersistence().fetchByOrg_First(orgId, orderByComparator);
	}

	/**
	* Returns the last v legal f o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f o rel
	* @throws NoSuchVLegalFORelException if a matching v legal f o rel could not be found
	*/
	public static VLegalFORel findByOrg_Last(java.lang.String orgId,
		OrderByComparator<VLegalFORel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFORelException {
		return getPersistence().findByOrg_Last(orgId, orderByComparator);
	}

	/**
	* Returns the last v legal f o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f o rel, or <code>null</code> if a matching v legal f o rel could not be found
	*/
	public static VLegalFORel fetchByOrg_Last(java.lang.String orgId,
		OrderByComparator<VLegalFORel> orderByComparator) {
		return getPersistence().fetchByOrg_Last(orgId, orderByComparator);
	}

	/**
	* Returns the v legal f o rels before and after the current v legal f o rel in the ordered set where orgId = &#63;.
	*
	* @param vLegalFORelPK the primary key of the current v legal f o rel
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal f o rel
	* @throws NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	*/
	public static VLegalFORel[] findByOrg_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK,
		java.lang.String orgId, OrderByComparator<VLegalFORel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFORelException {
		return getPersistence()
				   .findByOrg_PrevAndNext(vLegalFORelPK, orgId,
			orderByComparator);
	}

	/**
	* Removes all the v legal f o rels where orgId = &#63; from the database.
	*
	* @param orgId the org ID
	*/
	public static void removeByOrg(java.lang.String orgId) {
		getPersistence().removeByOrg(orgId);
	}

	/**
	* Returns the number of v legal f o rels where orgId = &#63;.
	*
	* @param orgId the org ID
	* @return the number of matching v legal f o rels
	*/
	public static int countByOrg(java.lang.String orgId) {
		return getPersistence().countByOrg(orgId);
	}

	/**
	* Caches the v legal f o rel in the entity cache if it is enabled.
	*
	* @param vLegalFORel the v legal f o rel
	*/
	public static void cacheResult(VLegalFORel vLegalFORel) {
		getPersistence().cacheResult(vLegalFORel);
	}

	/**
	* Caches the v legal f o rels in the entity cache if it is enabled.
	*
	* @param vLegalFORels the v legal f o rels
	*/
	public static void cacheResult(List<VLegalFORel> vLegalFORels) {
		getPersistence().cacheResult(vLegalFORels);
	}

	/**
	* Creates a new v legal f o rel with the primary key. Does not add the v legal f o rel to the database.
	*
	* @param vLegalFORelPK the primary key for the new v legal f o rel
	* @return the new v legal f o rel
	*/
	public static VLegalFORel create(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK) {
		return getPersistence().create(vLegalFORelPK);
	}

	/**
	* Removes the v legal f o rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFORelPK the primary key of the v legal f o rel
	* @return the v legal f o rel that was removed
	* @throws NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	*/
	public static VLegalFORel remove(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFORelException {
		return getPersistence().remove(vLegalFORelPK);
	}

	public static VLegalFORel updateImpl(VLegalFORel vLegalFORel) {
		return getPersistence().updateImpl(vLegalFORel);
	}

	/**
	* Returns the v legal f o rel with the primary key or throws a {@link NoSuchVLegalFORelException} if it could not be found.
	*
	* @param vLegalFORelPK the primary key of the v legal f o rel
	* @return the v legal f o rel
	* @throws NoSuchVLegalFORelException if a v legal f o rel with the primary key could not be found
	*/
	public static VLegalFORel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFORelException {
		return getPersistence().findByPrimaryKey(vLegalFORelPK);
	}

	/**
	* Returns the v legal f o rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalFORelPK the primary key of the v legal f o rel
	* @return the v legal f o rel, or <code>null</code> if a v legal f o rel with the primary key could not be found
	*/
	public static VLegalFORel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK vLegalFORelPK) {
		return getPersistence().fetchByPrimaryKey(vLegalFORelPK);
	}

	public static java.util.Map<java.io.Serializable, VLegalFORel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal f o rels.
	*
	* @return the v legal f o rels
	*/
	public static List<VLegalFORel> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<VLegalFORel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<VLegalFORel> findAll(int start, int end,
		OrderByComparator<VLegalFORel> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<VLegalFORel> findAll(int start, int end,
		OrderByComparator<VLegalFORel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal f o rels from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal f o rels.
	*
	* @return the number of v legal f o rels
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalFORelPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalFORelPersistence, VLegalFORelPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalFORelPersistence.class);
}