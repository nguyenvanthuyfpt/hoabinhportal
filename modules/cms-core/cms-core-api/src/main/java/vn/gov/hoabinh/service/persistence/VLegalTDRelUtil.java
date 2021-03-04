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

import vn.gov.hoabinh.model.VLegalTDRel;

import java.util.List;

/**
 * The persistence utility for the v legal t d rel service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalTDRelPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTDRelPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalTDRelPersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalTDRelUtil {
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
	public static void clearCache(VLegalTDRel vLegalTDRel) {
		getPersistence().clearCache(vLegalTDRel);
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
	public static List<VLegalTDRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalTDRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalTDRel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalTDRel> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalTDRel update(VLegalTDRel vLegalTDRel) {
		return getPersistence().update(vLegalTDRel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalTDRel update(VLegalTDRel vLegalTDRel,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalTDRel, serviceContext);
	}

	/**
	* Returns all the v legal t d rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the matching v legal t d rels
	*/
	public static List<VLegalTDRel> findByDocument(java.lang.String docId) {
		return getPersistence().findByDocument(docId);
	}

	/**
	* Returns a range of all the v legal t d rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @return the range of matching v legal t d rels
	*/
	public static List<VLegalTDRel> findByDocument(java.lang.String docId,
		int start, int end) {
		return getPersistence().findByDocument(docId, start, end);
	}

	/**
	* Returns an ordered range of all the v legal t d rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal t d rels
	*/
	public static List<VLegalTDRel> findByDocument(java.lang.String docId,
		int start, int end, OrderByComparator<VLegalTDRel> orderByComparator) {
		return getPersistence()
				   .findByDocument(docId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal t d rels where docId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param docId the doc ID
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal t d rels
	*/
	public static List<VLegalTDRel> findByDocument(java.lang.String docId,
		int start, int end, OrderByComparator<VLegalTDRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDocument(docId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal t d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal t d rel
	* @throws NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	*/
	public static VLegalTDRel findByDocument_First(java.lang.String docId,
		OrderByComparator<VLegalTDRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTDRelException {
		return getPersistence().findByDocument_First(docId, orderByComparator);
	}

	/**
	* Returns the first v legal t d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal t d rel, or <code>null</code> if a matching v legal t d rel could not be found
	*/
	public static VLegalTDRel fetchByDocument_First(java.lang.String docId,
		OrderByComparator<VLegalTDRel> orderByComparator) {
		return getPersistence().fetchByDocument_First(docId, orderByComparator);
	}

	/**
	* Returns the last v legal t d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal t d rel
	* @throws NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	*/
	public static VLegalTDRel findByDocument_Last(java.lang.String docId,
		OrderByComparator<VLegalTDRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTDRelException {
		return getPersistence().findByDocument_Last(docId, orderByComparator);
	}

	/**
	* Returns the last v legal t d rel in the ordered set where docId = &#63;.
	*
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal t d rel, or <code>null</code> if a matching v legal t d rel could not be found
	*/
	public static VLegalTDRel fetchByDocument_Last(java.lang.String docId,
		OrderByComparator<VLegalTDRel> orderByComparator) {
		return getPersistence().fetchByDocument_Last(docId, orderByComparator);
	}

	/**
	* Returns the v legal t d rels before and after the current v legal t d rel in the ordered set where docId = &#63;.
	*
	* @param vLegalTDRelPK the primary key of the current v legal t d rel
	* @param docId the doc ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal t d rel
	* @throws NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	*/
	public static VLegalTDRel[] findByDocument_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalTDRelPK vLegalTDRelPK,
		java.lang.String docId, OrderByComparator<VLegalTDRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTDRelException {
		return getPersistence()
				   .findByDocument_PrevAndNext(vLegalTDRelPK, docId,
			orderByComparator);
	}

	/**
	* Removes all the v legal t d rels where docId = &#63; from the database.
	*
	* @param docId the doc ID
	*/
	public static void removeByDocument(java.lang.String docId) {
		getPersistence().removeByDocument(docId);
	}

	/**
	* Returns the number of v legal t d rels where docId = &#63;.
	*
	* @param docId the doc ID
	* @return the number of matching v legal t d rels
	*/
	public static int countByDocument(java.lang.String docId) {
		return getPersistence().countByDocument(docId);
	}

	/**
	* Returns all the v legal t d rels where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @return the matching v legal t d rels
	*/
	public static List<VLegalTDRel> findByTag(java.lang.String tagId) {
		return getPersistence().findByTag(tagId);
	}

	/**
	* Returns a range of all the v legal t d rels where tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tagId the tag ID
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @return the range of matching v legal t d rels
	*/
	public static List<VLegalTDRel> findByTag(java.lang.String tagId,
		int start, int end) {
		return getPersistence().findByTag(tagId, start, end);
	}

	/**
	* Returns an ordered range of all the v legal t d rels where tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tagId the tag ID
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal t d rels
	*/
	public static List<VLegalTDRel> findByTag(java.lang.String tagId,
		int start, int end, OrderByComparator<VLegalTDRel> orderByComparator) {
		return getPersistence().findByTag(tagId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal t d rels where tagId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param tagId the tag ID
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal t d rels
	*/
	public static List<VLegalTDRel> findByTag(java.lang.String tagId,
		int start, int end, OrderByComparator<VLegalTDRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByTag(tagId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal t d rel in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal t d rel
	* @throws NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	*/
	public static VLegalTDRel findByTag_First(java.lang.String tagId,
		OrderByComparator<VLegalTDRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTDRelException {
		return getPersistence().findByTag_First(tagId, orderByComparator);
	}

	/**
	* Returns the first v legal t d rel in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal t d rel, or <code>null</code> if a matching v legal t d rel could not be found
	*/
	public static VLegalTDRel fetchByTag_First(java.lang.String tagId,
		OrderByComparator<VLegalTDRel> orderByComparator) {
		return getPersistence().fetchByTag_First(tagId, orderByComparator);
	}

	/**
	* Returns the last v legal t d rel in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal t d rel
	* @throws NoSuchVLegalTDRelException if a matching v legal t d rel could not be found
	*/
	public static VLegalTDRel findByTag_Last(java.lang.String tagId,
		OrderByComparator<VLegalTDRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTDRelException {
		return getPersistence().findByTag_Last(tagId, orderByComparator);
	}

	/**
	* Returns the last v legal t d rel in the ordered set where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal t d rel, or <code>null</code> if a matching v legal t d rel could not be found
	*/
	public static VLegalTDRel fetchByTag_Last(java.lang.String tagId,
		OrderByComparator<VLegalTDRel> orderByComparator) {
		return getPersistence().fetchByTag_Last(tagId, orderByComparator);
	}

	/**
	* Returns the v legal t d rels before and after the current v legal t d rel in the ordered set where tagId = &#63;.
	*
	* @param vLegalTDRelPK the primary key of the current v legal t d rel
	* @param tagId the tag ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal t d rel
	* @throws NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	*/
	public static VLegalTDRel[] findByTag_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VLegalTDRelPK vLegalTDRelPK,
		java.lang.String tagId, OrderByComparator<VLegalTDRel> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTDRelException {
		return getPersistence()
				   .findByTag_PrevAndNext(vLegalTDRelPK, tagId,
			orderByComparator);
	}

	/**
	* Removes all the v legal t d rels where tagId = &#63; from the database.
	*
	* @param tagId the tag ID
	*/
	public static void removeByTag(java.lang.String tagId) {
		getPersistence().removeByTag(tagId);
	}

	/**
	* Returns the number of v legal t d rels where tagId = &#63;.
	*
	* @param tagId the tag ID
	* @return the number of matching v legal t d rels
	*/
	public static int countByTag(java.lang.String tagId) {
		return getPersistence().countByTag(tagId);
	}

	/**
	* Caches the v legal t d rel in the entity cache if it is enabled.
	*
	* @param vLegalTDRel the v legal t d rel
	*/
	public static void cacheResult(VLegalTDRel vLegalTDRel) {
		getPersistence().cacheResult(vLegalTDRel);
	}

	/**
	* Caches the v legal t d rels in the entity cache if it is enabled.
	*
	* @param vLegalTDRels the v legal t d rels
	*/
	public static void cacheResult(List<VLegalTDRel> vLegalTDRels) {
		getPersistence().cacheResult(vLegalTDRels);
	}

	/**
	* Creates a new v legal t d rel with the primary key. Does not add the v legal t d rel to the database.
	*
	* @param vLegalTDRelPK the primary key for the new v legal t d rel
	* @return the new v legal t d rel
	*/
	public static VLegalTDRel create(
		vn.gov.hoabinh.service.persistence.VLegalTDRelPK vLegalTDRelPK) {
		return getPersistence().create(vLegalTDRelPK);
	}

	/**
	* Removes the v legal t d rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalTDRelPK the primary key of the v legal t d rel
	* @return the v legal t d rel that was removed
	* @throws NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	*/
	public static VLegalTDRel remove(
		vn.gov.hoabinh.service.persistence.VLegalTDRelPK vLegalTDRelPK)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTDRelException {
		return getPersistence().remove(vLegalTDRelPK);
	}

	public static VLegalTDRel updateImpl(VLegalTDRel vLegalTDRel) {
		return getPersistence().updateImpl(vLegalTDRel);
	}

	/**
	* Returns the v legal t d rel with the primary key or throws a {@link NoSuchVLegalTDRelException} if it could not be found.
	*
	* @param vLegalTDRelPK the primary key of the v legal t d rel
	* @return the v legal t d rel
	* @throws NoSuchVLegalTDRelException if a v legal t d rel with the primary key could not be found
	*/
	public static VLegalTDRel findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalTDRelPK vLegalTDRelPK)
		throws vn.gov.hoabinh.exception.NoSuchVLegalTDRelException {
		return getPersistence().findByPrimaryKey(vLegalTDRelPK);
	}

	/**
	* Returns the v legal t d rel with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vLegalTDRelPK the primary key of the v legal t d rel
	* @return the v legal t d rel, or <code>null</code> if a v legal t d rel with the primary key could not be found
	*/
	public static VLegalTDRel fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalTDRelPK vLegalTDRelPK) {
		return getPersistence().fetchByPrimaryKey(vLegalTDRelPK);
	}

	public static java.util.Map<java.io.Serializable, VLegalTDRel> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal t d rels.
	*
	* @return the v legal t d rels
	*/
	public static List<VLegalTDRel> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the v legal t d rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @return the range of v legal t d rels
	*/
	public static List<VLegalTDRel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the v legal t d rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal t d rels
	*/
	public static List<VLegalTDRel> findAll(int start, int end,
		OrderByComparator<VLegalTDRel> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal t d rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalTDRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal t d rels
	* @param end the upper bound of the range of v legal t d rels (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal t d rels
	*/
	public static List<VLegalTDRel> findAll(int start, int end,
		OrderByComparator<VLegalTDRel> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal t d rels from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal t d rels.
	*
	* @return the number of v legal t d rels
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalTDRelPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalTDRelPersistence, VLegalTDRelPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalTDRelPersistence.class);
}