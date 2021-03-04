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

import vn.gov.hoabinh.model.VcmsPARelation;

import java.util.List;

/**
 * The persistence utility for the vcms p a relation service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsPARelationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsPARelationPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsPARelationPersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsPARelationUtil {
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
	public static void clearCache(VcmsPARelation vcmsPARelation) {
		getPersistence().clearCache(vcmsPARelation);
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
	public static List<VcmsPARelation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsPARelation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsPARelation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsPARelation> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsPARelation update(VcmsPARelation vcmsPARelation) {
		return getPersistence().update(vcmsPARelation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsPARelation update(VcmsPARelation vcmsPARelation,
		ServiceContext serviceContext) {
		return getPersistence().update(vcmsPARelation, serviceContext);
	}

	/**
	* Returns all the vcms p a relations where portionId = &#63;.
	*
	* @param portionId the portion ID
	* @return the matching vcms p a relations
	*/
	public static List<VcmsPARelation> findByPortion(java.lang.String portionId) {
		return getPersistence().findByPortion(portionId);
	}

	/**
	* Returns a range of all the vcms p a relations where portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @return the range of matching vcms p a relations
	*/
	public static List<VcmsPARelation> findByPortion(
		java.lang.String portionId, int start, int end) {
		return getPersistence().findByPortion(portionId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms p a relations where portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms p a relations
	*/
	public static List<VcmsPARelation> findByPortion(
		java.lang.String portionId, int start, int end,
		OrderByComparator<VcmsPARelation> orderByComparator) {
		return getPersistence()
				   .findByPortion(portionId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms p a relations where portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms p a relations
	*/
	public static List<VcmsPARelation> findByPortion(
		java.lang.String portionId, int start, int end,
		OrderByComparator<VcmsPARelation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByPortion(portionId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms p a relation in the ordered set where portionId = &#63;.
	*
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms p a relation
	* @throws NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	*/
	public static VcmsPARelation findByPortion_First(
		java.lang.String portionId,
		OrderByComparator<VcmsPARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPARelationException {
		return getPersistence().findByPortion_First(portionId, orderByComparator);
	}

	/**
	* Returns the first vcms p a relation in the ordered set where portionId = &#63;.
	*
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms p a relation, or <code>null</code> if a matching vcms p a relation could not be found
	*/
	public static VcmsPARelation fetchByPortion_First(
		java.lang.String portionId,
		OrderByComparator<VcmsPARelation> orderByComparator) {
		return getPersistence()
				   .fetchByPortion_First(portionId, orderByComparator);
	}

	/**
	* Returns the last vcms p a relation in the ordered set where portionId = &#63;.
	*
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms p a relation
	* @throws NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	*/
	public static VcmsPARelation findByPortion_Last(
		java.lang.String portionId,
		OrderByComparator<VcmsPARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPARelationException {
		return getPersistence().findByPortion_Last(portionId, orderByComparator);
	}

	/**
	* Returns the last vcms p a relation in the ordered set where portionId = &#63;.
	*
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms p a relation, or <code>null</code> if a matching vcms p a relation could not be found
	*/
	public static VcmsPARelation fetchByPortion_Last(
		java.lang.String portionId,
		OrderByComparator<VcmsPARelation> orderByComparator) {
		return getPersistence().fetchByPortion_Last(portionId, orderByComparator);
	}

	/**
	* Returns the vcms p a relations before and after the current vcms p a relation in the ordered set where portionId = &#63;.
	*
	* @param vcmsPARelationPK the primary key of the current vcms p a relation
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms p a relation
	* @throws NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	*/
	public static VcmsPARelation[] findByPortion_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK,
		java.lang.String portionId,
		OrderByComparator<VcmsPARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPARelationException {
		return getPersistence()
				   .findByPortion_PrevAndNext(vcmsPARelationPK, portionId,
			orderByComparator);
	}

	/**
	* Removes all the vcms p a relations where portionId = &#63; from the database.
	*
	* @param portionId the portion ID
	*/
	public static void removeByPortion(java.lang.String portionId) {
		getPersistence().removeByPortion(portionId);
	}

	/**
	* Returns the number of vcms p a relations where portionId = &#63;.
	*
	* @param portionId the portion ID
	* @return the number of matching vcms p a relations
	*/
	public static int countByPortion(java.lang.String portionId) {
		return getPersistence().countByPortion(portionId);
	}

	/**
	* Returns all the vcms p a relations where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms p a relations
	*/
	public static List<VcmsPARelation> findByArticle(java.lang.String articleId) {
		return getPersistence().findByArticle(articleId);
	}

	/**
	* Returns a range of all the vcms p a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @return the range of matching vcms p a relations
	*/
	public static List<VcmsPARelation> findByArticle(
		java.lang.String articleId, int start, int end) {
		return getPersistence().findByArticle(articleId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms p a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms p a relations
	*/
	public static List<VcmsPARelation> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsPARelation> orderByComparator) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms p a relations where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms p a relations
	*/
	public static List<VcmsPARelation> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsPARelation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms p a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms p a relation
	* @throws NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	*/
	public static VcmsPARelation findByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsPARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPARelationException {
		return getPersistence().findByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the first vcms p a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms p a relation, or <code>null</code> if a matching vcms p a relation could not be found
	*/
	public static VcmsPARelation fetchByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsPARelation> orderByComparator) {
		return getPersistence()
				   .fetchByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms p a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms p a relation
	* @throws NoSuchVcmsPARelationException if a matching vcms p a relation could not be found
	*/
	public static VcmsPARelation findByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsPARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPARelationException {
		return getPersistence().findByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms p a relation in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms p a relation, or <code>null</code> if a matching vcms p a relation could not be found
	*/
	public static VcmsPARelation fetchByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsPARelation> orderByComparator) {
		return getPersistence().fetchByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the vcms p a relations before and after the current vcms p a relation in the ordered set where articleId = &#63;.
	*
	* @param vcmsPARelationPK the primary key of the current vcms p a relation
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms p a relation
	* @throws NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	*/
	public static VcmsPARelation[] findByArticle_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK,
		java.lang.String articleId,
		OrderByComparator<VcmsPARelation> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPARelationException {
		return getPersistence()
				   .findByArticle_PrevAndNext(vcmsPARelationPK, articleId,
			orderByComparator);
	}

	/**
	* Removes all the vcms p a relations where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public static void removeByArticle(java.lang.String articleId) {
		getPersistence().removeByArticle(articleId);
	}

	/**
	* Returns the number of vcms p a relations where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms p a relations
	*/
	public static int countByArticle(java.lang.String articleId) {
		return getPersistence().countByArticle(articleId);
	}

	/**
	* Caches the vcms p a relation in the entity cache if it is enabled.
	*
	* @param vcmsPARelation the vcms p a relation
	*/
	public static void cacheResult(VcmsPARelation vcmsPARelation) {
		getPersistence().cacheResult(vcmsPARelation);
	}

	/**
	* Caches the vcms p a relations in the entity cache if it is enabled.
	*
	* @param vcmsPARelations the vcms p a relations
	*/
	public static void cacheResult(List<VcmsPARelation> vcmsPARelations) {
		getPersistence().cacheResult(vcmsPARelations);
	}

	/**
	* Creates a new vcms p a relation with the primary key. Does not add the vcms p a relation to the database.
	*
	* @param vcmsPARelationPK the primary key for the new vcms p a relation
	* @return the new vcms p a relation
	*/
	public static VcmsPARelation create(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK) {
		return getPersistence().create(vcmsPARelationPK);
	}

	/**
	* Removes the vcms p a relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsPARelationPK the primary key of the vcms p a relation
	* @return the vcms p a relation that was removed
	* @throws NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	*/
	public static VcmsPARelation remove(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPARelationException {
		return getPersistence().remove(vcmsPARelationPK);
	}

	public static VcmsPARelation updateImpl(VcmsPARelation vcmsPARelation) {
		return getPersistence().updateImpl(vcmsPARelation);
	}

	/**
	* Returns the vcms p a relation with the primary key or throws a {@link NoSuchVcmsPARelationException} if it could not be found.
	*
	* @param vcmsPARelationPK the primary key of the vcms p a relation
	* @return the vcms p a relation
	* @throws NoSuchVcmsPARelationException if a vcms p a relation with the primary key could not be found
	*/
	public static VcmsPARelation findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK)
		throws vn.gov.hoabinh.exception.NoSuchVcmsPARelationException {
		return getPersistence().findByPrimaryKey(vcmsPARelationPK);
	}

	/**
	* Returns the vcms p a relation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vcmsPARelationPK the primary key of the vcms p a relation
	* @return the vcms p a relation, or <code>null</code> if a vcms p a relation with the primary key could not be found
	*/
	public static VcmsPARelation fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK) {
		return getPersistence().fetchByPrimaryKey(vcmsPARelationPK);
	}

	public static java.util.Map<java.io.Serializable, VcmsPARelation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms p a relations.
	*
	* @return the vcms p a relations
	*/
	public static List<VcmsPARelation> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms p a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @return the range of vcms p a relations
	*/
	public static List<VcmsPARelation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms p a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms p a relations
	*/
	public static List<VcmsPARelation> findAll(int start, int end,
		OrderByComparator<VcmsPARelation> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms p a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms p a relations
	*/
	public static List<VcmsPARelation> findAll(int start, int end,
		OrderByComparator<VcmsPARelation> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms p a relations from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms p a relations.
	*
	* @return the number of vcms p a relations
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VcmsPARelationPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsPARelationPersistence, VcmsPARelationPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsPARelationPersistence.class);
}