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

import vn.gov.hoabinh.model.VLegalDFRel;

import java.util.List;

/**
 * The persistence utility for the v legal d f rel service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalDFRelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDFRelPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalDFRelPersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalDFRelUtil {
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
	public static void clearCache(VLegalDFRel vLegalDFRel) {
		getPersistence().clearCache(vLegalDFRel);
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
	public static List<VLegalDFRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalDFRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalDFRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalDFRel> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalDFRel update(VLegalDFRel vLegalDFRel) {
		return getPersistence().update(vLegalDFRel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalDFRel update(VLegalDFRel vLegalDFRel,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalDFRel, serviceContext);
	}

	/**
	* Returns all the v legal d f rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the matching v legal d f rels
	*/
	public static List<VLegalDFRel> findByField(java.lang.String fieldId) {
		return getPersistence().findByField(fieldId);
	}

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
	public static List<VLegalDFRel> findByField(java.lang.String fieldId,
		int start, int end) {
		return getPersistence().findByField(fieldId, start, end);
	}

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
	public static List<VLegalDFRel> findByField(java.lang.String fieldId,
		int start, int end, OrderByComparator<VLegalDFRel> orderByComparator) {
		return getPersistence()
				   .findByField(fieldId, start, end, orderByComparator);
	}

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
	public static List<VLegalDFRel> findByField(java.lang.String fieldId,
		int start, int end, OrderByComparator<VLegalDFRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByField(fieldId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal d f rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d f rel
	* @throws NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	*/
	public static VLegalDFRel findByField_First(java.lang.String fieldId,
		OrderByComparator<VLegalDFRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDFRelException {
		return getPersistence().findByField_First(fieldId, orderByComparator);
	}

	/**
	* Returns the first v legal d f rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d f rel, or <code>null</code> if a matching v legal d f rel could not be found
	*/
	public static VLegalDFRel fetchByField_First(java.lang.String fieldId,
		OrderByComparator<VLegalDFRel> orderByComparator) {
		return getPersistence().fetchByField_First(fieldId, orderByComparator);
	}

	/**
	* Returns the last v legal d f rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d f rel
	* @throws NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	*/
	public static VLegalDFRel findByField_Last(java.lang.String fieldId,
		OrderByComparator<VLegalDFRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDFRelException {
		return getPersistence().findByField_Last(fieldId, orderByComparator);
	}

	/**
	* Returns the last v legal d f rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d f rel, or <code>null</code> if a matching v legal d f rel could not be found
	*/
	public static VLegalDFRel fetchByField_Last(java.lang.String fieldId,
		OrderByComparator<VLegalDFRel> orderByComparator) {
		return getPersistence().fetchByField_Last(fieldId, orderByComparator);
	}

	/**
	* Returns the v legal d f rels before and after the current v legal d f rel in the ordered set where fieldId = &#63;.
	*
	* @param vLegalDFRelPK the primary key of the current v legal d f rel
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d f rel
	* @throws NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	*/
	public static VLegalDFRel[] findByField_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK,
		java.lang.String fieldId,
		OrderByComparator<VLegalDFRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDFRelException {
		return getPersistence()
				   .findByField_PrevAndNext(vLegalDFRelPK, fieldId,
			orderByComparator);
	}

	/**
	* Removes all the v legal d f rels where fieldId = &#63; from the database.
	*
	* @param fieldId the field ID
	*/
	public static void removeByField(java.lang.String fieldId) {
		getPersistence().removeByField(fieldId);
	}

	/**
	* Returns the number of v legal d f rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the number of matching v legal d f rels
	*/
	public static int countByField(java.lang.String fieldId) {
		return getPersistence().countByField(fieldId);
	}

	/**
	* Returns all the v legal d f rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the matching v legal d f rels
	*/
	public static List<VLegalDFRel> findByDoc(java.lang.String docId) {
		return getPersistence().findByDoc(docId);
	}

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
	public static List<VLegalDFRel> findByDoc(java.lang.String docId,
		int start, int end) {
		return getPersistence().findByDoc(docId, start, end);
	}

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
	public static List<VLegalDFRel> findByDoc(java.lang.String docId,
		int start, int end, OrderByComparator<VLegalDFRel> orderByComparator) {
		return getPersistence().findByDoc(docId, start, end, orderByComparator);
	}

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
	public static List<VLegalDFRel> findByDoc(java.lang.String docId,
		int start, int end, OrderByComparator<VLegalDFRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDoc(docId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal d f rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d f rel
	* @throws NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	*/
	public static VLegalDFRel findByDoc_First(java.lang.String docId,
		OrderByComparator<VLegalDFRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDFRelException {
		return getPersistence().findByDoc_First(docId, orderByComparator);
	}

	/**
	* Returns the first v legal d f rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d f rel, or <code>null</code> if a matching v legal d f rel could not be found
	*/
	public static VLegalDFRel fetchByDoc_First(java.lang.String docId,
		OrderByComparator<VLegalDFRel> orderByComparator) {
		return getPersistence().fetchByDoc_First(docId, orderByComparator);
	}

	/**
	* Returns the last v legal d f rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d f rel
	* @throws NoSuchVLegalDFRelException if a matching v legal d f rel could not be found
	*/
	public static VLegalDFRel findByDoc_Last(java.lang.String docId,
		OrderByComparator<VLegalDFRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDFRelException {
		return getPersistence().findByDoc_Last(docId, orderByComparator);
	}

	/**
	* Returns the last v legal d f rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d f rel, or <code>null</code> if a matching v legal d f rel could not be found
	*/
	public static VLegalDFRel fetchByDoc_Last(java.lang.String docId,
		OrderByComparator<VLegalDFRel> orderByComparator) {
		return getPersistence().fetchByDoc_Last(docId, orderByComparator);
	}

	/**
	* Returns the v legal d f rels before and after the current v legal d f rel in the ordered set where docId = &#63;.
	*
	* @param vLegalDFRelPK the primary key of the current v legal d f rel
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d f rel
	* @throws NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	*/
	public static VLegalDFRel[] findByDoc_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK,
		java.lang.String docId, OrderByComparator<VLegalDFRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDFRelException {
		return getPersistence()
				   .findByDoc_PrevAndNext(vLegalDFRelPK, docId,
			orderByComparator);
	}

	/**
	* Removes all the v legal d f rels where docId = &#63; from the database.
	*
	* @param docId the doc ID
	*/
	public static void removeByDoc(java.lang.String docId) {
		getPersistence().removeByDoc(docId);
	}

	/**
	* Returns the number of v legal d f rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the number of matching v legal d f rels
	*/
	public static int countByDoc(java.lang.String docId) {
		return getPersistence().countByDoc(docId);
	}

	/**
	* Caches the v legal d f rel in the entity cache if it is enabled.
	*
	* @param vLegalDFRel the v legal d f rel
	*/
	public static void cacheResult(VLegalDFRel vLegalDFRel) {
		getPersistence().cacheResult(vLegalDFRel);
	}

	/**
	* Caches the v legal d f rels in the entity cache if it is enabled.
	*
	* @param vLegalDFRels the v legal d f rels
	*/
	public static void cacheResult(List<VLegalDFRel> vLegalDFRels) {
		getPersistence().cacheResult(vLegalDFRels);
	}

	/**
	* Creates a new v legal d f rel with the primary key. Does not add the v legal d f rel to the database.
	*
	* @param vLegalDFRelPK the primary key for the new v legal d f rel
	* @return the new v legal d f rel
	*/
	public static VLegalDFRel create(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK) {
		return getPersistence().create(vLegalDFRelPK);
	}

	/**
	* Removes the v legal d f rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDFRelPK the primary key of the v legal d f rel
	* @return the v legal d f rel that was removed
	* @throws NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	*/
	public static VLegalDFRel remove(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDFRelException {
		return getPersistence().remove(vLegalDFRelPK);
	}

	public static VLegalDFRel updateImpl(VLegalDFRel vLegalDFRel) {
		return getPersistence().updateImpl(vLegalDFRel);
	}

	/**
	* Returns the v legal d f rel with the primary key or throws a {@link NoSuchVLegalDFRelException} if it could not be found.
	*
	* @param vLegalDFRelPK the primary key of the v legal d f rel
	* @return the v legal d f rel
	* @throws NoSuchVLegalDFRelException if a v legal d f rel with the primary key could not be found
	*/
	public static VLegalDFRel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDFRelException {
		return getPersistence().findByPrimaryKey(vLegalDFRelPK);
	}

	/**
	* Returns the v legal d f rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalDFRelPK the primary key of the v legal d f rel
	* @return the v legal d f rel, or <code>null</code> if a v legal d f rel with the primary key could not be found
	*/
	public static VLegalDFRel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK vLegalDFRelPK) {
		return getPersistence().fetchByPrimaryKey(vLegalDFRelPK);
	}

	public static java.util.Map<java.io.Serializable, VLegalDFRel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal d f rels.
	*
	* @return the v legal d f rels
	*/
	public static List<VLegalDFRel> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<VLegalDFRel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<VLegalDFRel> findAll(int start, int end,
		OrderByComparator<VLegalDFRel> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<VLegalDFRel> findAll(int start, int end,
		OrderByComparator<VLegalDFRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal d f rels from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal d f rels.
	*
	* @return the number of v legal d f rels
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalDFRelPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalDFRelPersistence, VLegalDFRelPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalDFRelPersistence.class);
}