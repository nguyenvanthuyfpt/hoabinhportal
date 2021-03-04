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

import vn.gov.hoabinh.model.VcmsTARelation;

import java.util.List;

/**
 * The persistence utility for the vcms t a relation service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsTARelationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsTARelationPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsTARelationPersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsTARelationUtil {
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
	public static void clearCache(VcmsTARelation vcmsTARelation) {
		getPersistence().clearCache(vcmsTARelation);
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
	public static List<VcmsTARelation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsTARelation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsTARelation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsTARelation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsTARelation update(VcmsTARelation vcmsTARelation) {
		return getPersistence().update(vcmsTARelation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsTARelation update(VcmsTARelation vcmsTARelation,
		ServiceContext serviceContext) {
		return getPersistence().update(vcmsTARelation, serviceContext);
	}

	/**
	* Returns all the vcms t a relations where threadId = &#63;.
	*
	* @param threadId the thread ID
	* @return the matching vcms t a relations
	*/
	public static List<VcmsTARelation> findByThread(java.lang.String threadId) {
		return getPersistence().findByThread(threadId);
	}

	/**
	* Returns a range of all the vcms t a relations where threadId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param threadId the thread ID
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @return the range of matching vcms t a relations
	*/
	public static List<VcmsTARelation> findByThread(java.lang.String threadId,
		int start, int end) {
		return getPersistence().findByThread(threadId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms t a relations where threadId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param threadId the thread ID
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms t a relations
	*/
	public static List<VcmsTARelation> findByThread(java.lang.String threadId,
		int start, int end, OrderByComparator<VcmsTARelation> orderByComparator) {
		return getPersistence()
				   .findByThread(threadId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms t a relations where threadId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param threadId the thread ID
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms t a relations
	*/
	public static List<VcmsTARelation> findByThread(java.lang.String threadId,
		int start, int end,
		OrderByComparator<VcmsTARelation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByThread(threadId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms t a relation in the ordered set where threadId = &#63;.
	*
	* @param threadId the thread ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms t a relation
	* @throws NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	*/
	public static VcmsTARelation findByThread_First(java.lang.String threadId,
		OrderByComparator<VcmsTARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsTARelationException {
		return getPersistence().findByThread_First(threadId, orderByComparator);
	}

	/**
	* Returns the first vcms t a relation in the ordered set where threadId = &#63;.
	*
	* @param threadId the thread ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms t a relation, or <code>null</code> if a matching vcms t a relation could not be found
	*/
	public static VcmsTARelation fetchByThread_First(
		java.lang.String threadId,
		OrderByComparator<VcmsTARelation> orderByComparator) {
		return getPersistence().fetchByThread_First(threadId, orderByComparator);
	}

	/**
	* Returns the last vcms t a relation in the ordered set where threadId = &#63;.
	*
	* @param threadId the thread ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms t a relation
	* @throws NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	*/
	public static VcmsTARelation findByThread_Last(java.lang.String threadId,
		OrderByComparator<VcmsTARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsTARelationException {
		return getPersistence().findByThread_Last(threadId, orderByComparator);
	}

	/**
	* Returns the last vcms t a relation in the ordered set where threadId = &#63;.
	*
	* @param threadId the thread ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms t a relation, or <code>null</code> if a matching vcms t a relation could not be found
	*/
	public static VcmsTARelation fetchByThread_Last(java.lang.String threadId,
		OrderByComparator<VcmsTARelation> orderByComparator) {
		return getPersistence().fetchByThread_Last(threadId, orderByComparator);
	}

	/**
	* Returns the vcms t a relations before and after the current vcms t a relation in the ordered set where threadId = &#63;.
	*
	* @param vcmsTARelationPK the primary key of the current vcms t a relation
	* @param threadId the thread ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms t a relation
	* @throws NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	*/
	public static VcmsTARelation[] findByThread_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK,
		java.lang.String threadId,
		OrderByComparator<VcmsTARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsTARelationException {
		return getPersistence()
				   .findByThread_PrevAndNext(vcmsTARelationPK, threadId,
			orderByComparator);
	}

	/**
	* Removes all the vcms t a relations where threadId = &#63; from the database.
	*
	* @param threadId the thread ID
	*/
	public static void removeByThread(java.lang.String threadId) {
		getPersistence().removeByThread(threadId);
	}

	/**
	* Returns the number of vcms t a relations where threadId = &#63;.
	*
	* @param threadId the thread ID
	* @return the number of matching vcms t a relations
	*/
	public static int countByThread(java.lang.String threadId) {
		return getPersistence().countByThread(threadId);
	}

	/**
	* Returns all the vcms t a relations where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms t a relations
	*/
	public static List<VcmsTARelation> findByArticle(java.lang.String articleId) {
		return getPersistence().findByArticle(articleId);
	}

	/**
	* Returns a range of all the vcms t a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @return the range of matching vcms t a relations
	*/
	public static List<VcmsTARelation> findByArticle(
		java.lang.String articleId, int start, int end) {
		return getPersistence().findByArticle(articleId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms t a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms t a relations
	*/
	public static List<VcmsTARelation> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsTARelation> orderByComparator) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms t a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms t a relations
	*/
	public static List<VcmsTARelation> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsTARelation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms t a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms t a relation
	* @throws NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	*/
	public static VcmsTARelation findByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsTARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsTARelationException {
		return getPersistence().findByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the first vcms t a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms t a relation, or <code>null</code> if a matching vcms t a relation could not be found
	*/
	public static VcmsTARelation fetchByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsTARelation> orderByComparator) {
		return getPersistence()
				   .fetchByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms t a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms t a relation
	* @throws NoSuchVcmsTARelationException if a matching vcms t a relation could not be found
	*/
	public static VcmsTARelation findByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsTARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsTARelationException {
		return getPersistence().findByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms t a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms t a relation, or <code>null</code> if a matching vcms t a relation could not be found
	*/
	public static VcmsTARelation fetchByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsTARelation> orderByComparator) {
		return getPersistence().fetchByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the vcms t a relations before and after the current vcms t a relation in the ordered set where articleId = &#63;.
	*
	* @param vcmsTARelationPK the primary key of the current vcms t a relation
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms t a relation
	* @throws NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	*/
	public static VcmsTARelation[] findByArticle_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK,
		java.lang.String articleId,
		OrderByComparator<VcmsTARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsTARelationException {
		return getPersistence()
				   .findByArticle_PrevAndNext(vcmsTARelationPK, articleId,
			orderByComparator);
	}

	/**
	* Removes all the vcms t a relations where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public static void removeByArticle(java.lang.String articleId) {
		getPersistence().removeByArticle(articleId);
	}

	/**
	* Returns the number of vcms t a relations where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms t a relations
	*/
	public static int countByArticle(java.lang.String articleId) {
		return getPersistence().countByArticle(articleId);
	}

	/**
	* Caches the vcms t a relation in the entity cache if it is enabled.
	*
	* @param vcmsTARelation the vcms t a relation
	*/
	public static void cacheResult(VcmsTARelation vcmsTARelation) {
		getPersistence().cacheResult(vcmsTARelation);
	}

	/**
	* Caches the vcms t a relations in the entity cache if it is enabled.
	*
	* @param vcmsTARelations the vcms t a relations
	*/
	public static void cacheResult(List<VcmsTARelation> vcmsTARelations) {
		getPersistence().cacheResult(vcmsTARelations);
	}

	/**
	* Creates a new vcms t a relation with the primary key. Does not add the vcms t a relation to the database.
	*
	* @param vcmsTARelationPK the primary key for the new vcms t a relation
	* @return the new vcms t a relation
	*/
	public static VcmsTARelation create(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK) {
		return getPersistence().create(vcmsTARelationPK);
	}

	/**
	* Removes the vcms t a relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsTARelationPK the primary key of the vcms t a relation
	* @return the vcms t a relation that was removed
	* @throws NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	*/
	public static VcmsTARelation remove(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK)
		throws vn.gov.hoabinh.exception.NoSuchVcmsTARelationException {
		return getPersistence().remove(vcmsTARelationPK);
	}

	public static VcmsTARelation updateImpl(VcmsTARelation vcmsTARelation) {
		return getPersistence().updateImpl(vcmsTARelation);
	}

	/**
	* Returns the vcms t a relation with the primary key or throws a {@link NoSuchVcmsTARelationException} if it could not be found.
	*
	* @param vcmsTARelationPK the primary key of the vcms t a relation
	* @return the vcms t a relation
	* @throws NoSuchVcmsTARelationException if a vcms t a relation with the primary key could not be found
	*/
	public static VcmsTARelation findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK)
		throws vn.gov.hoabinh.exception.NoSuchVcmsTARelationException {
		return getPersistence().findByPrimaryKey(vcmsTARelationPK);
	}

	/**
	* Returns the vcms t a relation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vcmsTARelationPK the primary key of the vcms t a relation
	* @return the vcms t a relation, or <code>null</code> if a vcms t a relation with the primary key could not be found
	*/
	public static VcmsTARelation fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK) {
		return getPersistence().fetchByPrimaryKey(vcmsTARelationPK);
	}

	public static java.util.Map<java.io.Serializable, VcmsTARelation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms t a relations.
	*
	* @return the vcms t a relations
	*/
	public static List<VcmsTARelation> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms t a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @return the range of vcms t a relations
	*/
	public static List<VcmsTARelation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms t a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms t a relations
	*/
	public static List<VcmsTARelation> findAll(int start, int end,
		OrderByComparator<VcmsTARelation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms t a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms t a relations
	*/
	public static List<VcmsTARelation> findAll(int start, int end,
		OrderByComparator<VcmsTARelation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms t a relations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms t a relations.
	*
	* @return the number of vcms t a relations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VcmsTARelationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsTARelationPersistence, VcmsTARelationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsTARelationPersistence.class);
}