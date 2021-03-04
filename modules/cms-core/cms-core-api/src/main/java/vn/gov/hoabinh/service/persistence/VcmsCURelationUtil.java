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

import vn.gov.hoabinh.model.VcmsCURelation;

import java.util.List;

/**
 * The persistence utility for the vcms c u relation service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsCURelationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCURelationPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsCURelationPersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsCURelationUtil {
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
	public static void clearCache(VcmsCURelation vcmsCURelation) {
		getPersistence().clearCache(vcmsCURelation);
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
	public static List<VcmsCURelation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsCURelation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsCURelation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsCURelation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsCURelation update(VcmsCURelation vcmsCURelation) {
		return getPersistence().update(vcmsCURelation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsCURelation update(VcmsCURelation vcmsCURelation,
		ServiceContext serviceContext) {
		return getPersistence().update(vcmsCURelation, serviceContext);
	}

	/**
	* Returns all the vcms c u relations where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the matching vcms c u relations
	*/
	public static List<VcmsCURelation> findByCategory(
		java.lang.String categoryId) {
		return getPersistence().findByCategory(categoryId);
	}

	/**
	* Returns a range of all the vcms c u relations where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @return the range of matching vcms c u relations
	*/
	public static List<VcmsCURelation> findByCategory(
		java.lang.String categoryId, int start, int end) {
		return getPersistence().findByCategory(categoryId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms c u relations where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms c u relations
	*/
	public static List<VcmsCURelation> findByCategory(
		java.lang.String categoryId, int start, int end,
		OrderByComparator<VcmsCURelation> orderByComparator) {
		return getPersistence()
				   .findByCategory(categoryId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms c u relations where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms c u relations
	*/
	public static List<VcmsCURelation> findByCategory(
		java.lang.String categoryId, int start, int end,
		OrderByComparator<VcmsCURelation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCategory(categoryId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms c u relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c u relation
	* @throws NoSuchVcmsCURelationException if a matching vcms c u relation could not be found
	*/
	public static VcmsCURelation findByCategory_First(
		java.lang.String categoryId,
		OrderByComparator<VcmsCURelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCURelationException {
		return getPersistence()
				   .findByCategory_First(categoryId, orderByComparator);
	}

	/**
	* Returns the first vcms c u relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c u relation, or <code>null</code> if a matching vcms c u relation could not be found
	*/
	public static VcmsCURelation fetchByCategory_First(
		java.lang.String categoryId,
		OrderByComparator<VcmsCURelation> orderByComparator) {
		return getPersistence()
				   .fetchByCategory_First(categoryId, orderByComparator);
	}

	/**
	* Returns the last vcms c u relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c u relation
	* @throws NoSuchVcmsCURelationException if a matching vcms c u relation could not be found
	*/
	public static VcmsCURelation findByCategory_Last(
		java.lang.String categoryId,
		OrderByComparator<VcmsCURelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCURelationException {
		return getPersistence()
				   .findByCategory_Last(categoryId, orderByComparator);
	}

	/**
	* Returns the last vcms c u relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c u relation, or <code>null</code> if a matching vcms c u relation could not be found
	*/
	public static VcmsCURelation fetchByCategory_Last(
		java.lang.String categoryId,
		OrderByComparator<VcmsCURelation> orderByComparator) {
		return getPersistence()
				   .fetchByCategory_Last(categoryId, orderByComparator);
	}

	/**
	* Returns the vcms c u relations before and after the current vcms c u relation in the ordered set where categoryId = &#63;.
	*
	* @param vcmsCURelationPK the primary key of the current vcms c u relation
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms c u relation
	* @throws NoSuchVcmsCURelationException if a vcms c u relation with the primary key could not be found
	*/
	public static VcmsCURelation[] findByCategory_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK,
		java.lang.String categoryId,
		OrderByComparator<VcmsCURelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCURelationException {
		return getPersistence()
				   .findByCategory_PrevAndNext(vcmsCURelationPK, categoryId,
			orderByComparator);
	}

	/**
	* Removes all the vcms c u relations where categoryId = &#63; from the database.
	*
	* @param categoryId the category ID
	*/
	public static void removeByCategory(java.lang.String categoryId) {
		getPersistence().removeByCategory(categoryId);
	}

	/**
	* Returns the number of vcms c u relations where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the number of matching vcms c u relations
	*/
	public static int countByCategory(java.lang.String categoryId) {
		return getPersistence().countByCategory(categoryId);
	}

	/**
	* Returns all the vcms c u relations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching vcms c u relations
	*/
	public static List<VcmsCURelation> findByUser(java.lang.String userId) {
		return getPersistence().findByUser(userId);
	}

	/**
	* Returns a range of all the vcms c u relations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @return the range of matching vcms c u relations
	*/
	public static List<VcmsCURelation> findByUser(java.lang.String userId,
		int start, int end) {
		return getPersistence().findByUser(userId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms c u relations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms c u relations
	*/
	public static List<VcmsCURelation> findByUser(java.lang.String userId,
		int start, int end, OrderByComparator<VcmsCURelation> orderByComparator) {
		return getPersistence().findByUser(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms c u relations where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms c u relations
	*/
	public static List<VcmsCURelation> findByUser(java.lang.String userId,
		int start, int end,
		OrderByComparator<VcmsCURelation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUser(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms c u relation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c u relation
	* @throws NoSuchVcmsCURelationException if a matching vcms c u relation could not be found
	*/
	public static VcmsCURelation findByUser_First(java.lang.String userId,
		OrderByComparator<VcmsCURelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCURelationException {
		return getPersistence().findByUser_First(userId, orderByComparator);
	}

	/**
	* Returns the first vcms c u relation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c u relation, or <code>null</code> if a matching vcms c u relation could not be found
	*/
	public static VcmsCURelation fetchByUser_First(java.lang.String userId,
		OrderByComparator<VcmsCURelation> orderByComparator) {
		return getPersistence().fetchByUser_First(userId, orderByComparator);
	}

	/**
	* Returns the last vcms c u relation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c u relation
	* @throws NoSuchVcmsCURelationException if a matching vcms c u relation could not be found
	*/
	public static VcmsCURelation findByUser_Last(java.lang.String userId,
		OrderByComparator<VcmsCURelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCURelationException {
		return getPersistence().findByUser_Last(userId, orderByComparator);
	}

	/**
	* Returns the last vcms c u relation in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c u relation, or <code>null</code> if a matching vcms c u relation could not be found
	*/
	public static VcmsCURelation fetchByUser_Last(java.lang.String userId,
		OrderByComparator<VcmsCURelation> orderByComparator) {
		return getPersistence().fetchByUser_Last(userId, orderByComparator);
	}

	/**
	* Returns the vcms c u relations before and after the current vcms c u relation in the ordered set where userId = &#63;.
	*
	* @param vcmsCURelationPK the primary key of the current vcms c u relation
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms c u relation
	* @throws NoSuchVcmsCURelationException if a vcms c u relation with the primary key could not be found
	*/
	public static VcmsCURelation[] findByUser_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK,
		java.lang.String userId,
		OrderByComparator<VcmsCURelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCURelationException {
		return getPersistence()
				   .findByUser_PrevAndNext(vcmsCURelationPK, userId,
			orderByComparator);
	}

	/**
	* Removes all the vcms c u relations where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByUser(java.lang.String userId) {
		getPersistence().removeByUser(userId);
	}

	/**
	* Returns the number of vcms c u relations where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching vcms c u relations
	*/
	public static int countByUser(java.lang.String userId) {
		return getPersistence().countByUser(userId);
	}

	/**
	* Caches the vcms c u relation in the entity cache if it is enabled.
	*
	* @param vcmsCURelation the vcms c u relation
	*/
	public static void cacheResult(VcmsCURelation vcmsCURelation) {
		getPersistence().cacheResult(vcmsCURelation);
	}

	/**
	* Caches the vcms c u relations in the entity cache if it is enabled.
	*
	* @param vcmsCURelations the vcms c u relations
	*/
	public static void cacheResult(List<VcmsCURelation> vcmsCURelations) {
		getPersistence().cacheResult(vcmsCURelations);
	}

	/**
	* Creates a new vcms c u relation with the primary key. Does not add the vcms c u relation to the database.
	*
	* @param vcmsCURelationPK the primary key for the new vcms c u relation
	* @return the new vcms c u relation
	*/
	public static VcmsCURelation create(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK) {
		return getPersistence().create(vcmsCURelationPK);
	}

	/**
	* Removes the vcms c u relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCURelationPK the primary key of the vcms c u relation
	* @return the vcms c u relation that was removed
	* @throws NoSuchVcmsCURelationException if a vcms c u relation with the primary key could not be found
	*/
	public static VcmsCURelation remove(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCURelationException {
		return getPersistence().remove(vcmsCURelationPK);
	}

	public static VcmsCURelation updateImpl(VcmsCURelation vcmsCURelation) {
		return getPersistence().updateImpl(vcmsCURelation);
	}

	/**
	* Returns the vcms c u relation with the primary key or throws a {@link NoSuchVcmsCURelationException} if it could not be found.
	*
	* @param vcmsCURelationPK the primary key of the vcms c u relation
	* @return the vcms c u relation
	* @throws NoSuchVcmsCURelationException if a vcms c u relation with the primary key could not be found
	*/
	public static VcmsCURelation findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCURelationException {
		return getPersistence().findByPrimaryKey(vcmsCURelationPK);
	}

	/**
	* Returns the vcms c u relation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vcmsCURelationPK the primary key of the vcms c u relation
	* @return the vcms c u relation, or <code>null</code> if a vcms c u relation with the primary key could not be found
	*/
	public static VcmsCURelation fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK) {
		return getPersistence().fetchByPrimaryKey(vcmsCURelationPK);
	}

	public static java.util.Map<java.io.Serializable, VcmsCURelation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms c u relations.
	*
	* @return the vcms c u relations
	*/
	public static List<VcmsCURelation> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms c u relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @return the range of vcms c u relations
	*/
	public static List<VcmsCURelation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms c u relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms c u relations
	*/
	public static List<VcmsCURelation> findAll(int start, int end,
		OrderByComparator<VcmsCURelation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms c u relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms c u relations
	*/
	public static List<VcmsCURelation> findAll(int start, int end,
		OrderByComparator<VcmsCURelation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms c u relations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms c u relations.
	*
	* @return the number of vcms c u relations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VcmsCURelationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsCURelationPersistence, VcmsCURelationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsCURelationPersistence.class);
}