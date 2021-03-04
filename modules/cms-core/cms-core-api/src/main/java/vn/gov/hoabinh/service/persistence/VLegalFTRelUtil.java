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

import vn.gov.hoabinh.model.VLegalFTRel;

import java.util.List;

/**
 * The persistence utility for the v legal f t rel service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalFTRelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFTRelPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalFTRelPersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalFTRelUtil {
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
	public static void clearCache(VLegalFTRel vLegalFTRel) {
		getPersistence().clearCache(vLegalFTRel);
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
	public static List<VLegalFTRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalFTRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalFTRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalFTRel> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalFTRel update(VLegalFTRel vLegalFTRel) {
		return getPersistence().update(vLegalFTRel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalFTRel update(VLegalFTRel vLegalFTRel,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalFTRel, serviceContext);
	}

	/**
	* Returns all the v legal f t rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the matching v legal f t rels
	*/
	public static List<VLegalFTRel> findByField(java.lang.String fieldId) {
		return getPersistence().findByField(fieldId);
	}

	/**
	* Returns a range of all the v legal f t rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @return the range of matching v legal f t rels
	*/
	public static List<VLegalFTRel> findByField(java.lang.String fieldId,
		int start, int end) {
		return getPersistence().findByField(fieldId, start, end);
	}

	/**
	* Returns an ordered range of all the v legal f t rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal f t rels
	*/
	public static List<VLegalFTRel> findByField(java.lang.String fieldId,
		int start, int end, OrderByComparator<VLegalFTRel> orderByComparator) {
		return getPersistence()
				   .findByField(fieldId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal f t rels where fieldId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param fieldId the field ID
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal f t rels
	*/
	public static List<VLegalFTRel> findByField(java.lang.String fieldId,
		int start, int end, OrderByComparator<VLegalFTRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByField(fieldId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal f t rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f t rel
	* @throws NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	*/
	public static VLegalFTRel findByField_First(java.lang.String fieldId,
		OrderByComparator<VLegalFTRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFTRelException {
		return getPersistence().findByField_First(fieldId, orderByComparator);
	}

	/**
	* Returns the first v legal f t rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f t rel, or <code>null</code> if a matching v legal f t rel could not be found
	*/
	public static VLegalFTRel fetchByField_First(java.lang.String fieldId,
		OrderByComparator<VLegalFTRel> orderByComparator) {
		return getPersistence().fetchByField_First(fieldId, orderByComparator);
	}

	/**
	* Returns the last v legal f t rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f t rel
	* @throws NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	*/
	public static VLegalFTRel findByField_Last(java.lang.String fieldId,
		OrderByComparator<VLegalFTRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFTRelException {
		return getPersistence().findByField_Last(fieldId, orderByComparator);
	}

	/**
	* Returns the last v legal f t rel in the ordered set where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f t rel, or <code>null</code> if a matching v legal f t rel could not be found
	*/
	public static VLegalFTRel fetchByField_Last(java.lang.String fieldId,
		OrderByComparator<VLegalFTRel> orderByComparator) {
		return getPersistence().fetchByField_Last(fieldId, orderByComparator);
	}

	/**
	* Returns the v legal f t rels before and after the current v legal f t rel in the ordered set where fieldId = &#63;.
	*
	* @param vLegalFTRelPK the primary key of the current v legal f t rel
	* @param fieldId the field ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal f t rel
	* @throws NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	*/
	public static VLegalFTRel[] findByField_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK,
		java.lang.String fieldId,
		OrderByComparator<VLegalFTRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFTRelException {
		return getPersistence()
				   .findByField_PrevAndNext(vLegalFTRelPK, fieldId,
			orderByComparator);
	}

	/**
	* Removes all the v legal f t rels where fieldId = &#63; from the database.
	*
	* @param fieldId the field ID
	*/
	public static void removeByField(java.lang.String fieldId) {
		getPersistence().removeByField(fieldId);
	}

	/**
	* Returns the number of v legal f t rels where fieldId = &#63;.
	*
	* @param fieldId the field ID
	* @return the number of matching v legal f t rels
	*/
	public static int countByField(java.lang.String fieldId) {
		return getPersistence().countByField(fieldId);
	}

	/**
	* Returns all the v legal f t rels where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the matching v legal f t rels
	*/
	public static List<VLegalFTRel> findByType(java.lang.String typeId) {
		return getPersistence().findByType(typeId);
	}

	/**
	* Returns a range of all the v legal f t rels where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @return the range of matching v legal f t rels
	*/
	public static List<VLegalFTRel> findByType(java.lang.String typeId,
		int start, int end) {
		return getPersistence().findByType(typeId, start, end);
	}

	/**
	* Returns an ordered range of all the v legal f t rels where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal f t rels
	*/
	public static List<VLegalFTRel> findByType(java.lang.String typeId,
		int start, int end, OrderByComparator<VLegalFTRel> orderByComparator) {
		return getPersistence().findByType(typeId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal f t rels where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal f t rels
	*/
	public static List<VLegalFTRel> findByType(java.lang.String typeId,
		int start, int end, OrderByComparator<VLegalFTRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByType(typeId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal f t rel in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f t rel
	* @throws NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	*/
	public static VLegalFTRel findByType_First(java.lang.String typeId,
		OrderByComparator<VLegalFTRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFTRelException {
		return getPersistence().findByType_First(typeId, orderByComparator);
	}

	/**
	* Returns the first v legal f t rel in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal f t rel, or <code>null</code> if a matching v legal f t rel could not be found
	*/
	public static VLegalFTRel fetchByType_First(java.lang.String typeId,
		OrderByComparator<VLegalFTRel> orderByComparator) {
		return getPersistence().fetchByType_First(typeId, orderByComparator);
	}

	/**
	* Returns the last v legal f t rel in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f t rel
	* @throws NoSuchVLegalFTRelException if a matching v legal f t rel could not be found
	*/
	public static VLegalFTRel findByType_Last(java.lang.String typeId,
		OrderByComparator<VLegalFTRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFTRelException {
		return getPersistence().findByType_Last(typeId, orderByComparator);
	}

	/**
	* Returns the last v legal f t rel in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal f t rel, or <code>null</code> if a matching v legal f t rel could not be found
	*/
	public static VLegalFTRel fetchByType_Last(java.lang.String typeId,
		OrderByComparator<VLegalFTRel> orderByComparator) {
		return getPersistence().fetchByType_Last(typeId, orderByComparator);
	}

	/**
	* Returns the v legal f t rels before and after the current v legal f t rel in the ordered set where typeId = &#63;.
	*
	* @param vLegalFTRelPK the primary key of the current v legal f t rel
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal f t rel
	* @throws NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	*/
	public static VLegalFTRel[] findByType_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK,
		java.lang.String typeId,
		OrderByComparator<VLegalFTRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFTRelException {
		return getPersistence()
				   .findByType_PrevAndNext(vLegalFTRelPK, typeId,
			orderByComparator);
	}

	/**
	* Removes all the v legal f t rels where typeId = &#63; from the database.
	*
	* @param typeId the type ID
	*/
	public static void removeByType(java.lang.String typeId) {
		getPersistence().removeByType(typeId);
	}

	/**
	* Returns the number of v legal f t rels where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the number of matching v legal f t rels
	*/
	public static int countByType(java.lang.String typeId) {
		return getPersistence().countByType(typeId);
	}

	/**
	* Caches the v legal f t rel in the entity cache if it is enabled.
	*
	* @param vLegalFTRel the v legal f t rel
	*/
	public static void cacheResult(VLegalFTRel vLegalFTRel) {
		getPersistence().cacheResult(vLegalFTRel);
	}

	/**
	* Caches the v legal f t rels in the entity cache if it is enabled.
	*
	* @param vLegalFTRels the v legal f t rels
	*/
	public static void cacheResult(List<VLegalFTRel> vLegalFTRels) {
		getPersistence().cacheResult(vLegalFTRels);
	}

	/**
	* Creates a new v legal f t rel with the primary key. Does not add the v legal f t rel to the database.
	*
	* @param vLegalFTRelPK the primary key for the new v legal f t rel
	* @return the new v legal f t rel
	*/
	public static VLegalFTRel create(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK) {
		return getPersistence().create(vLegalFTRelPK);
	}

	/**
	* Removes the v legal f t rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalFTRelPK the primary key of the v legal f t rel
	* @return the v legal f t rel that was removed
	* @throws NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	*/
	public static VLegalFTRel remove(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFTRelException {
		return getPersistence().remove(vLegalFTRelPK);
	}

	public static VLegalFTRel updateImpl(VLegalFTRel vLegalFTRel) {
		return getPersistence().updateImpl(vLegalFTRel);
	}

	/**
	* Returns the v legal f t rel with the primary key or throws a {@link NoSuchVLegalFTRelException} if it could not be found.
	*
	* @param vLegalFTRelPK the primary key of the v legal f t rel
	* @return the v legal f t rel
	* @throws NoSuchVLegalFTRelException if a v legal f t rel with the primary key could not be found
	*/
	public static VLegalFTRel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK)
		throws vn.gov.hoabinh.exception.NoSuchVLegalFTRelException {
		return getPersistence().findByPrimaryKey(vLegalFTRelPK);
	}

	/**
	* Returns the v legal f t rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalFTRelPK the primary key of the v legal f t rel
	* @return the v legal f t rel, or <code>null</code> if a v legal f t rel with the primary key could not be found
	*/
	public static VLegalFTRel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK vLegalFTRelPK) {
		return getPersistence().fetchByPrimaryKey(vLegalFTRelPK);
	}

	public static java.util.Map<java.io.Serializable, VLegalFTRel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal f t rels.
	*
	* @return the v legal f t rels
	*/
	public static List<VLegalFTRel> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the v legal f t rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @return the range of v legal f t rels
	*/
	public static List<VLegalFTRel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the v legal f t rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal f t rels
	*/
	public static List<VLegalFTRel> findAll(int start, int end,
		OrderByComparator<VLegalFTRel> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal f t rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalFTRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal f t rels
	* @param end the upper bound of the range of v legal f t rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal f t rels
	*/
	public static List<VLegalFTRel> findAll(int start, int end,
		OrderByComparator<VLegalFTRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal f t rels from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal f t rels.
	*
	* @return the number of v legal f t rels
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalFTRelPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalFTRelPersistence, VLegalFTRelPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalFTRelPersistence.class);
}