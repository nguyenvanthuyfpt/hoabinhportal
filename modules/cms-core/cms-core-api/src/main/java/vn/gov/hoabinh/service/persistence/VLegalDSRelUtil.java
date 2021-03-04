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

import vn.gov.hoabinh.model.VLegalDSRel;

import java.util.List;

/**
 * The persistence utility for the v legal d s rel service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalDSRelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDSRelPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalDSRelPersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalDSRelUtil {
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
	public static void clearCache(VLegalDSRel vLegalDSRel) {
		getPersistence().clearCache(vLegalDSRel);
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
	public static List<VLegalDSRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalDSRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalDSRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalDSRel> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalDSRel update(VLegalDSRel vLegalDSRel) {
		return getPersistence().update(vLegalDSRel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalDSRel update(VLegalDSRel vLegalDSRel,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalDSRel, serviceContext);
	}

	/**
	* Returns all the v legal d s rels where sigId = &#63;.
	*
	* @param sigId the sig ID
	* @return the matching v legal d s rels
	*/
	public static List<VLegalDSRel> findBySigner(java.lang.String sigId) {
		return getPersistence().findBySigner(sigId);
	}

	/**
	* Returns a range of all the v legal d s rels where sigId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param sigId the sig ID
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @return the range of matching v legal d s rels
	*/
	public static List<VLegalDSRel> findBySigner(java.lang.String sigId,
		int start, int end) {
		return getPersistence().findBySigner(sigId, start, end);
	}

	/**
	* Returns an ordered range of all the v legal d s rels where sigId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param sigId the sig ID
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal d s rels
	*/
	public static List<VLegalDSRel> findBySigner(java.lang.String sigId,
		int start, int end, OrderByComparator<VLegalDSRel> orderByComparator) {
		return getPersistence()
				   .findBySigner(sigId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal d s rels where sigId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param sigId the sig ID
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal d s rels
	*/
	public static List<VLegalDSRel> findBySigner(java.lang.String sigId,
		int start, int end, OrderByComparator<VLegalDSRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySigner(sigId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal d s rel in the ordered set where sigId = &#63;.
	*
	* @param sigId the sig ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d s rel
	* @throws NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	*/
	public static VLegalDSRel findBySigner_First(java.lang.String sigId,
		OrderByComparator<VLegalDSRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDSRelException {
		return getPersistence().findBySigner_First(sigId, orderByComparator);
	}

	/**
	* Returns the first v legal d s rel in the ordered set where sigId = &#63;.
	*
	* @param sigId the sig ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d s rel, or <code>null</code> if a matching v legal d s rel could not be found
	*/
	public static VLegalDSRel fetchBySigner_First(java.lang.String sigId,
		OrderByComparator<VLegalDSRel> orderByComparator) {
		return getPersistence().fetchBySigner_First(sigId, orderByComparator);
	}

	/**
	* Returns the last v legal d s rel in the ordered set where sigId = &#63;.
	*
	* @param sigId the sig ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d s rel
	* @throws NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	*/
	public static VLegalDSRel findBySigner_Last(java.lang.String sigId,
		OrderByComparator<VLegalDSRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDSRelException {
		return getPersistence().findBySigner_Last(sigId, orderByComparator);
	}

	/**
	* Returns the last v legal d s rel in the ordered set where sigId = &#63;.
	*
	* @param sigId the sig ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d s rel, or <code>null</code> if a matching v legal d s rel could not be found
	*/
	public static VLegalDSRel fetchBySigner_Last(java.lang.String sigId,
		OrderByComparator<VLegalDSRel> orderByComparator) {
		return getPersistence().fetchBySigner_Last(sigId, orderByComparator);
	}

	/**
	* Returns the v legal d s rels before and after the current v legal d s rel in the ordered set where sigId = &#63;.
	*
	* @param vLegalDSRelPK the primary key of the current v legal d s rel
	* @param sigId the sig ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d s rel
	* @throws NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	*/
	public static VLegalDSRel[] findBySigner_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK,
		java.lang.String sigId, OrderByComparator<VLegalDSRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDSRelException {
		return getPersistence()
				   .findBySigner_PrevAndNext(vLegalDSRelPK, sigId,
			orderByComparator);
	}

	/**
	* Removes all the v legal d s rels where sigId = &#63; from the database.
	*
	* @param sigId the sig ID
	*/
	public static void removeBySigner(java.lang.String sigId) {
		getPersistence().removeBySigner(sigId);
	}

	/**
	* Returns the number of v legal d s rels where sigId = &#63;.
	*
	* @param sigId the sig ID
	* @return the number of matching v legal d s rels
	*/
	public static int countBySigner(java.lang.String sigId) {
		return getPersistence().countBySigner(sigId);
	}

	/**
	* Returns all the v legal d s rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the matching v legal d s rels
	*/
	public static List<VLegalDSRel> findByDoc(java.lang.String docId) {
		return getPersistence().findByDoc(docId);
	}

	/**
	* Returns a range of all the v legal d s rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @return the range of matching v legal d s rels
	*/
	public static List<VLegalDSRel> findByDoc(java.lang.String docId,
		int start, int end) {
		return getPersistence().findByDoc(docId, start, end);
	}

	/**
	* Returns an ordered range of all the v legal d s rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal d s rels
	*/
	public static List<VLegalDSRel> findByDoc(java.lang.String docId,
		int start, int end, OrderByComparator<VLegalDSRel> orderByComparator) {
		return getPersistence().findByDoc(docId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal d s rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal d s rels
	*/
	public static List<VLegalDSRel> findByDoc(java.lang.String docId,
		int start, int end, OrderByComparator<VLegalDSRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDoc(docId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal d s rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d s rel
	* @throws NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	*/
	public static VLegalDSRel findByDoc_First(java.lang.String docId,
		OrderByComparator<VLegalDSRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDSRelException {
		return getPersistence().findByDoc_First(docId, orderByComparator);
	}

	/**
	* Returns the first v legal d s rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal d s rel, or <code>null</code> if a matching v legal d s rel could not be found
	*/
	public static VLegalDSRel fetchByDoc_First(java.lang.String docId,
		OrderByComparator<VLegalDSRel> orderByComparator) {
		return getPersistence().fetchByDoc_First(docId, orderByComparator);
	}

	/**
	* Returns the last v legal d s rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d s rel
	* @throws NoSuchVLegalDSRelException if a matching v legal d s rel could not be found
	*/
	public static VLegalDSRel findByDoc_Last(java.lang.String docId,
		OrderByComparator<VLegalDSRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDSRelException {
		return getPersistence().findByDoc_Last(docId, orderByComparator);
	}

	/**
	* Returns the last v legal d s rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal d s rel, or <code>null</code> if a matching v legal d s rel could not be found
	*/
	public static VLegalDSRel fetchByDoc_Last(java.lang.String docId,
		OrderByComparator<VLegalDSRel> orderByComparator) {
		return getPersistence().fetchByDoc_Last(docId, orderByComparator);
	}

	/**
	* Returns the v legal d s rels before and after the current v legal d s rel in the ordered set where docId = &#63;.
	*
	* @param vLegalDSRelPK the primary key of the current v legal d s rel
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal d s rel
	* @throws NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	*/
	public static VLegalDSRel[] findByDoc_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK,
		java.lang.String docId, OrderByComparator<VLegalDSRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDSRelException {
		return getPersistence()
				   .findByDoc_PrevAndNext(vLegalDSRelPK, docId,
			orderByComparator);
	}

	/**
	* Removes all the v legal d s rels where docId = &#63; from the database.
	*
	* @param docId the doc ID
	*/
	public static void removeByDoc(java.lang.String docId) {
		getPersistence().removeByDoc(docId);
	}

	/**
	* Returns the number of v legal d s rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the number of matching v legal d s rels
	*/
	public static int countByDoc(java.lang.String docId) {
		return getPersistence().countByDoc(docId);
	}

	/**
	* Caches the v legal d s rel in the entity cache if it is enabled.
	*
	* @param vLegalDSRel the v legal d s rel
	*/
	public static void cacheResult(VLegalDSRel vLegalDSRel) {
		getPersistence().cacheResult(vLegalDSRel);
	}

	/**
	* Caches the v legal d s rels in the entity cache if it is enabled.
	*
	* @param vLegalDSRels the v legal d s rels
	*/
	public static void cacheResult(List<VLegalDSRel> vLegalDSRels) {
		getPersistence().cacheResult(vLegalDSRels);
	}

	/**
	* Creates a new v legal d s rel with the primary key. Does not add the v legal d s rel to the database.
	*
	* @param vLegalDSRelPK the primary key for the new v legal d s rel
	* @return the new v legal d s rel
	*/
	public static VLegalDSRel create(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK) {
		return getPersistence().create(vLegalDSRelPK);
	}

	/**
	* Removes the v legal d s rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel
	* @return the v legal d s rel that was removed
	* @throws NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	*/
	public static VLegalDSRel remove(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDSRelException {
		return getPersistence().remove(vLegalDSRelPK);
	}

	public static VLegalDSRel updateImpl(VLegalDSRel vLegalDSRel) {
		return getPersistence().updateImpl(vLegalDSRel);
	}

	/**
	* Returns the v legal d s rel with the primary key or throws a {@link NoSuchVLegalDSRelException} if it could not be found.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel
	* @return the v legal d s rel
	* @throws NoSuchVLegalDSRelException if a v legal d s rel with the primary key could not be found
	*/
	public static VLegalDSRel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK)
		throws vn.gov.hoabinh.exception.NoSuchVLegalDSRelException {
		return getPersistence().findByPrimaryKey(vLegalDSRelPK);
	}

	/**
	* Returns the v legal d s rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalDSRelPK the primary key of the v legal d s rel
	* @return the v legal d s rel, or <code>null</code> if a v legal d s rel with the primary key could not be found
	*/
	public static VLegalDSRel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK vLegalDSRelPK) {
		return getPersistence().fetchByPrimaryKey(vLegalDSRelPK);
	}

	public static java.util.Map<java.io.Serializable, VLegalDSRel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal d s rels.
	*
	* @return the v legal d s rels
	*/
	public static List<VLegalDSRel> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the v legal d s rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @return the range of v legal d s rels
	*/
	public static List<VLegalDSRel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the v legal d s rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal d s rels
	*/
	public static List<VLegalDSRel> findAll(int start, int end,
		OrderByComparator<VLegalDSRel> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal d s rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalDSRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal d s rels
	* @param end the upper bound of the range of v legal d s rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal d s rels
	*/
	public static List<VLegalDSRel> findAll(int start, int end,
		OrderByComparator<VLegalDSRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal d s rels from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal d s rels.
	*
	* @return the number of v legal d s rels
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalDSRelPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalDSRelPersistence, VLegalDSRelPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalDSRelPersistence.class);
}