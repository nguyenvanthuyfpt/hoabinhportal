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

import vn.gov.hoabinh.model.VcmsCARelation;

import java.util.List;

/**
 * The persistence utility for the vcms c a relation service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsCARelationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCARelationPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsCARelationPersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsCARelationUtil {
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
	public static void clearCache(VcmsCARelation vcmsCARelation) {
		getPersistence().clearCache(vcmsCARelation);
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
	public static List<VcmsCARelation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsCARelation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsCARelation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsCARelation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsCARelation update(VcmsCARelation vcmsCARelation) {
		return getPersistence().update(vcmsCARelation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsCARelation update(VcmsCARelation vcmsCARelation,
		ServiceContext serviceContext) {
		return getPersistence().update(vcmsCARelation, serviceContext);
	}

	/**
	* Returns all the vcms c a relations where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the matching vcms c a relations
	*/
	public static List<VcmsCARelation> findByCategory(
		java.lang.String categoryId) {
		return getPersistence().findByCategory(categoryId);
	}

	/**
	* Returns a range of all the vcms c a relations where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @return the range of matching vcms c a relations
	*/
	public static List<VcmsCARelation> findByCategory(
		java.lang.String categoryId, int start, int end) {
		return getPersistence().findByCategory(categoryId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms c a relations where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms c a relations
	*/
	public static List<VcmsCARelation> findByCategory(
		java.lang.String categoryId, int start, int end,
		OrderByComparator<VcmsCARelation> orderByComparator) {
		return getPersistence()
				   .findByCategory(categoryId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms c a relations where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms c a relations
	*/
	public static List<VcmsCARelation> findByCategory(
		java.lang.String categoryId, int start, int end,
		OrderByComparator<VcmsCARelation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCategory(categoryId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms c a relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c a relation
	* @throws NoSuchVcmsCARelationException if a matching vcms c a relation could not be found
	*/
	public static VcmsCARelation findByCategory_First(
		java.lang.String categoryId,
		OrderByComparator<VcmsCARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCARelationException {
		return getPersistence()
				   .findByCategory_First(categoryId, orderByComparator);
	}

	/**
	* Returns the first vcms c a relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c a relation, or <code>null</code> if a matching vcms c a relation could not be found
	*/
	public static VcmsCARelation fetchByCategory_First(
		java.lang.String categoryId,
		OrderByComparator<VcmsCARelation> orderByComparator) {
		return getPersistence()
				   .fetchByCategory_First(categoryId, orderByComparator);
	}

	/**
	* Returns the last vcms c a relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c a relation
	* @throws NoSuchVcmsCARelationException if a matching vcms c a relation could not be found
	*/
	public static VcmsCARelation findByCategory_Last(
		java.lang.String categoryId,
		OrderByComparator<VcmsCARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCARelationException {
		return getPersistence()
				   .findByCategory_Last(categoryId, orderByComparator);
	}

	/**
	* Returns the last vcms c a relation in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c a relation, or <code>null</code> if a matching vcms c a relation could not be found
	*/
	public static VcmsCARelation fetchByCategory_Last(
		java.lang.String categoryId,
		OrderByComparator<VcmsCARelation> orderByComparator) {
		return getPersistence()
				   .fetchByCategory_Last(categoryId, orderByComparator);
	}

	/**
	* Returns the vcms c a relations before and after the current vcms c a relation in the ordered set where categoryId = &#63;.
	*
	* @param vcmsCARelationPK the primary key of the current vcms c a relation
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms c a relation
	* @throws NoSuchVcmsCARelationException if a vcms c a relation with the primary key could not be found
	*/
	public static VcmsCARelation[] findByCategory_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK,
		java.lang.String categoryId,
		OrderByComparator<VcmsCARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCARelationException {
		return getPersistence()
				   .findByCategory_PrevAndNext(vcmsCARelationPK, categoryId,
			orderByComparator);
	}

	/**
	* Removes all the vcms c a relations where categoryId = &#63; from the database.
	*
	* @param categoryId the category ID
	*/
	public static void removeByCategory(java.lang.String categoryId) {
		getPersistence().removeByCategory(categoryId);
	}

	/**
	* Returns the number of vcms c a relations where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the number of matching vcms c a relations
	*/
	public static int countByCategory(java.lang.String categoryId) {
		return getPersistence().countByCategory(categoryId);
	}

	/**
	* Returns all the vcms c a relations where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms c a relations
	*/
	public static List<VcmsCARelation> findByArticle(java.lang.String articleId) {
		return getPersistence().findByArticle(articleId);
	}

	/**
	* Returns a range of all the vcms c a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @return the range of matching vcms c a relations
	*/
	public static List<VcmsCARelation> findByArticle(
		java.lang.String articleId, int start, int end) {
		return getPersistence().findByArticle(articleId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms c a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms c a relations
	*/
	public static List<VcmsCARelation> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsCARelation> orderByComparator) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms c a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms c a relations
	*/
	public static List<VcmsCARelation> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsCARelation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms c a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c a relation
	* @throws NoSuchVcmsCARelationException if a matching vcms c a relation could not be found
	*/
	public static VcmsCARelation findByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsCARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCARelationException {
		return getPersistence().findByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the first vcms c a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms c a relation, or <code>null</code> if a matching vcms c a relation could not be found
	*/
	public static VcmsCARelation fetchByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsCARelation> orderByComparator) {
		return getPersistence()
				   .fetchByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms c a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c a relation
	* @throws NoSuchVcmsCARelationException if a matching vcms c a relation could not be found
	*/
	public static VcmsCARelation findByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsCARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCARelationException {
		return getPersistence().findByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms c a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms c a relation, or <code>null</code> if a matching vcms c a relation could not be found
	*/
	public static VcmsCARelation fetchByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsCARelation> orderByComparator) {
		return getPersistence().fetchByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the vcms c a relations before and after the current vcms c a relation in the ordered set where articleId = &#63;.
	*
	* @param vcmsCARelationPK the primary key of the current vcms c a relation
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms c a relation
	* @throws NoSuchVcmsCARelationException if a vcms c a relation with the primary key could not be found
	*/
	public static VcmsCARelation[] findByArticle_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK,
		java.lang.String articleId,
		OrderByComparator<VcmsCARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCARelationException {
		return getPersistence()
				   .findByArticle_PrevAndNext(vcmsCARelationPK, articleId,
			orderByComparator);
	}

	/**
	* Removes all the vcms c a relations where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public static void removeByArticle(java.lang.String articleId) {
		getPersistence().removeByArticle(articleId);
	}

	/**
	* Returns the number of vcms c a relations where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms c a relations
	*/
	public static int countByArticle(java.lang.String articleId) {
		return getPersistence().countByArticle(articleId);
	}

	/**
	* Caches the vcms c a relation in the entity cache if it is enabled.
	*
	* @param vcmsCARelation the vcms c a relation
	*/
	public static void cacheResult(VcmsCARelation vcmsCARelation) {
		getPersistence().cacheResult(vcmsCARelation);
	}

	/**
	* Caches the vcms c a relations in the entity cache if it is enabled.
	*
	* @param vcmsCARelations the vcms c a relations
	*/
	public static void cacheResult(List<VcmsCARelation> vcmsCARelations) {
		getPersistence().cacheResult(vcmsCARelations);
	}

	/**
	* Creates a new vcms c a relation with the primary key. Does not add the vcms c a relation to the database.
	*
	* @param vcmsCARelationPK the primary key for the new vcms c a relation
	* @return the new vcms c a relation
	*/
	public static VcmsCARelation create(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK) {
		return getPersistence().create(vcmsCARelationPK);
	}

	/**
	* Removes the vcms c a relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCARelationPK the primary key of the vcms c a relation
	* @return the vcms c a relation that was removed
	* @throws NoSuchVcmsCARelationException if a vcms c a relation with the primary key could not be found
	*/
	public static VcmsCARelation remove(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCARelationException {
		return getPersistence().remove(vcmsCARelationPK);
	}

	public static VcmsCARelation updateImpl(VcmsCARelation vcmsCARelation) {
		return getPersistence().updateImpl(vcmsCARelation);
	}

	/**
	* Returns the vcms c a relation with the primary key or throws a {@link NoSuchVcmsCARelationException} if it could not be found.
	*
	* @param vcmsCARelationPK the primary key of the vcms c a relation
	* @return the vcms c a relation
	* @throws NoSuchVcmsCARelationException if a vcms c a relation with the primary key could not be found
	*/
	public static VcmsCARelation findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK)
		throws vn.gov.hoabinh.exception.NoSuchVcmsCARelationException {
		return getPersistence().findByPrimaryKey(vcmsCARelationPK);
	}

	/**
	* Returns the vcms c a relation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vcmsCARelationPK the primary key of the vcms c a relation
	* @return the vcms c a relation, or <code>null</code> if a vcms c a relation with the primary key could not be found
	*/
	public static VcmsCARelation fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK) {
		return getPersistence().fetchByPrimaryKey(vcmsCARelationPK);
	}

	public static java.util.Map<java.io.Serializable, VcmsCARelation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms c a relations.
	*
	* @return the vcms c a relations
	*/
	public static List<VcmsCARelation> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms c a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @return the range of vcms c a relations
	*/
	public static List<VcmsCARelation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms c a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms c a relations
	*/
	public static List<VcmsCARelation> findAll(int start, int end,
		OrderByComparator<VcmsCARelation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms c a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms c a relations
	*/
	public static List<VcmsCARelation> findAll(int start, int end,
		OrderByComparator<VcmsCARelation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms c a relations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms c a relations.
	*
	* @return the number of vcms c a relations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VcmsCARelationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsCARelationPersistence, VcmsCARelationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsCARelationPersistence.class);
}