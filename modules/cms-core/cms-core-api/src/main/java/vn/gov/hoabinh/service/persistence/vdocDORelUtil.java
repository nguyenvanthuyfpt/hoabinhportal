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

import vn.gov.hoabinh.model.vdocDORel;

import java.util.List;

/**
 * The persistence utility for the vdoc d o rel service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.vdocDORelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocDORelPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.vdocDORelPersistenceImpl
 * @generated
 */
@ProviderType
public class vdocDORelUtil {
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
	public static void clearCache(vdocDORel vdocDORel) {
		getPersistence().clearCache(vdocDORel);
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
	public static List<vdocDORel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<vdocDORel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<vdocDORel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<vdocDORel> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static vdocDORel update(vdocDORel vdocDORel) {
		return getPersistence().update(vdocDORel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static vdocDORel update(vdocDORel vdocDORel,
		ServiceContext serviceContext) {
		return getPersistence().update(vdocDORel, serviceContext);
	}

	/**
	* Returns all the vdoc d o rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the matching vdoc d o rels
	*/
	public static List<vdocDORel> findByDocument(java.lang.String docId) {
		return getPersistence().findByDocument(docId);
	}

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
	public static List<vdocDORel> findByDocument(java.lang.String docId,
		int start, int end) {
		return getPersistence().findByDocument(docId, start, end);
	}

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
	public static List<vdocDORel> findByDocument(java.lang.String docId,
		int start, int end, OrderByComparator<vdocDORel> orderByComparator) {
		return getPersistence()
				   .findByDocument(docId, start, end, orderByComparator);
	}

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
	public static List<vdocDORel> findByDocument(java.lang.String docId,
		int start, int end, OrderByComparator<vdocDORel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDocument(docId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vdoc d o rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc d o rel
	* @throws NoSuchvdocDORelException if a matching vdoc d o rel could not be found
	*/
	public static vdocDORel findByDocument_First(java.lang.String docId,
		OrderByComparator<vdocDORel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDORelException {
		return getPersistence().findByDocument_First(docId, orderByComparator);
	}

	/**
	* Returns the first vdoc d o rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc d o rel, or <code>null</code> if a matching vdoc d o rel could not be found
	*/
	public static vdocDORel fetchByDocument_First(java.lang.String docId,
		OrderByComparator<vdocDORel> orderByComparator) {
		return getPersistence().fetchByDocument_First(docId, orderByComparator);
	}

	/**
	* Returns the last vdoc d o rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc d o rel
	* @throws NoSuchvdocDORelException if a matching vdoc d o rel could not be found
	*/
	public static vdocDORel findByDocument_Last(java.lang.String docId,
		OrderByComparator<vdocDORel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDORelException {
		return getPersistence().findByDocument_Last(docId, orderByComparator);
	}

	/**
	* Returns the last vdoc d o rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc d o rel, or <code>null</code> if a matching vdoc d o rel could not be found
	*/
	public static vdocDORel fetchByDocument_Last(java.lang.String docId,
		OrderByComparator<vdocDORel> orderByComparator) {
		return getPersistence().fetchByDocument_Last(docId, orderByComparator);
	}

	/**
	* Returns the vdoc d o rels before and after the current vdoc d o rel in the ordered set where docId = &#63;.
	*
	* @param vdocDORelPK the primary key of the current vdoc d o rel
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc d o rel
	* @throws NoSuchvdocDORelException if a vdoc d o rel with the primary key could not be found
	*/
	public static vdocDORel[] findByDocument_PrevAndNext(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK,
		java.lang.String docId, OrderByComparator<vdocDORel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDORelException {
		return getPersistence()
				   .findByDocument_PrevAndNext(vdocDORelPK, docId,
			orderByComparator);
	}

	/**
	* Removes all the vdoc d o rels where docId = &#63; from the database.
	*
	* @param docId the doc ID
	*/
	public static void removeByDocument(java.lang.String docId) {
		getPersistence().removeByDocument(docId);
	}

	/**
	* Returns the number of vdoc d o rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the number of matching vdoc d o rels
	*/
	public static int countByDocument(java.lang.String docId) {
		return getPersistence().countByDocument(docId);
	}

	/**
	* Returns all the vdoc d o rels where orgId = &#63;.
	*
	* @param orgId the org ID
	* @return the matching vdoc d o rels
	*/
	public static List<vdocDORel> findByOrg(java.lang.String orgId) {
		return getPersistence().findByOrg(orgId);
	}

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
	public static List<vdocDORel> findByOrg(java.lang.String orgId, int start,
		int end) {
		return getPersistence().findByOrg(orgId, start, end);
	}

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
	public static List<vdocDORel> findByOrg(java.lang.String orgId, int start,
		int end, OrderByComparator<vdocDORel> orderByComparator) {
		return getPersistence().findByOrg(orgId, start, end, orderByComparator);
	}

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
	public static List<vdocDORel> findByOrg(java.lang.String orgId, int start,
		int end, OrderByComparator<vdocDORel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByOrg(orgId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vdoc d o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc d o rel
	* @throws NoSuchvdocDORelException if a matching vdoc d o rel could not be found
	*/
	public static vdocDORel findByOrg_First(java.lang.String orgId,
		OrderByComparator<vdocDORel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDORelException {
		return getPersistence().findByOrg_First(orgId, orderByComparator);
	}

	/**
	* Returns the first vdoc d o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc d o rel, or <code>null</code> if a matching vdoc d o rel could not be found
	*/
	public static vdocDORel fetchByOrg_First(java.lang.String orgId,
		OrderByComparator<vdocDORel> orderByComparator) {
		return getPersistence().fetchByOrg_First(orgId, orderByComparator);
	}

	/**
	* Returns the last vdoc d o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc d o rel
	* @throws NoSuchvdocDORelException if a matching vdoc d o rel could not be found
	*/
	public static vdocDORel findByOrg_Last(java.lang.String orgId,
		OrderByComparator<vdocDORel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDORelException {
		return getPersistence().findByOrg_Last(orgId, orderByComparator);
	}

	/**
	* Returns the last vdoc d o rel in the ordered set where orgId = &#63;.
	*
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc d o rel, or <code>null</code> if a matching vdoc d o rel could not be found
	*/
	public static vdocDORel fetchByOrg_Last(java.lang.String orgId,
		OrderByComparator<vdocDORel> orderByComparator) {
		return getPersistence().fetchByOrg_Last(orgId, orderByComparator);
	}

	/**
	* Returns the vdoc d o rels before and after the current vdoc d o rel in the ordered set where orgId = &#63;.
	*
	* @param vdocDORelPK the primary key of the current vdoc d o rel
	* @param orgId the org ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc d o rel
	* @throws NoSuchvdocDORelException if a vdoc d o rel with the primary key could not be found
	*/
	public static vdocDORel[] findByOrg_PrevAndNext(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK,
		java.lang.String orgId, OrderByComparator<vdocDORel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocDORelException {
		return getPersistence()
				   .findByOrg_PrevAndNext(vdocDORelPK, orgId, orderByComparator);
	}

	/**
	* Removes all the vdoc d o rels where orgId = &#63; from the database.
	*
	* @param orgId the org ID
	*/
	public static void removeByOrg(java.lang.String orgId) {
		getPersistence().removeByOrg(orgId);
	}

	/**
	* Returns the number of vdoc d o rels where orgId = &#63;.
	*
	* @param orgId the org ID
	* @return the number of matching vdoc d o rels
	*/
	public static int countByOrg(java.lang.String orgId) {
		return getPersistence().countByOrg(orgId);
	}

	/**
	* Caches the vdoc d o rel in the entity cache if it is enabled.
	*
	* @param vdocDORel the vdoc d o rel
	*/
	public static void cacheResult(vdocDORel vdocDORel) {
		getPersistence().cacheResult(vdocDORel);
	}

	/**
	* Caches the vdoc d o rels in the entity cache if it is enabled.
	*
	* @param vdocDORels the vdoc d o rels
	*/
	public static void cacheResult(List<vdocDORel> vdocDORels) {
		getPersistence().cacheResult(vdocDORels);
	}

	/**
	* Creates a new vdoc d o rel with the primary key. Does not add the vdoc d o rel to the database.
	*
	* @param vdocDORelPK the primary key for the new vdoc d o rel
	* @return the new vdoc d o rel
	*/
	public static vdocDORel create(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK) {
		return getPersistence().create(vdocDORelPK);
	}

	/**
	* Removes the vdoc d o rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocDORelPK the primary key of the vdoc d o rel
	* @return the vdoc d o rel that was removed
	* @throws NoSuchvdocDORelException if a vdoc d o rel with the primary key could not be found
	*/
	public static vdocDORel remove(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK)
		throws vn.gov.hoabinh.exception.NoSuchvdocDORelException {
		return getPersistence().remove(vdocDORelPK);
	}

	public static vdocDORel updateImpl(vdocDORel vdocDORel) {
		return getPersistence().updateImpl(vdocDORel);
	}

	/**
	* Returns the vdoc d o rel with the primary key or throws a {@link NoSuchvdocDORelException} if it could not be found.
	*
	* @param vdocDORelPK the primary key of the vdoc d o rel
	* @return the vdoc d o rel
	* @throws NoSuchvdocDORelException if a vdoc d o rel with the primary key could not be found
	*/
	public static vdocDORel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK)
		throws vn.gov.hoabinh.exception.NoSuchvdocDORelException {
		return getPersistence().findByPrimaryKey(vdocDORelPK);
	}

	/**
	* Returns the vdoc d o rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vdocDORelPK the primary key of the vdoc d o rel
	* @return the vdoc d o rel, or <code>null</code> if a vdoc d o rel with the primary key could not be found
	*/
	public static vdocDORel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.vdocDORelPK vdocDORelPK) {
		return getPersistence().fetchByPrimaryKey(vdocDORelPK);
	}

	public static java.util.Map<java.io.Serializable, vdocDORel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vdoc d o rels.
	*
	* @return the vdoc d o rels
	*/
	public static List<vdocDORel> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<vdocDORel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<vdocDORel> findAll(int start, int end,
		OrderByComparator<vdocDORel> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<vdocDORel> findAll(int start, int end,
		OrderByComparator<vdocDORel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vdoc d o rels from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vdoc d o rels.
	*
	* @return the number of vdoc d o rels
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static vdocDORelPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<vdocDORelPersistence, vdocDORelPersistence> _serviceTracker =
		ServiceTrackerFactory.open(vdocDORelPersistence.class);
}