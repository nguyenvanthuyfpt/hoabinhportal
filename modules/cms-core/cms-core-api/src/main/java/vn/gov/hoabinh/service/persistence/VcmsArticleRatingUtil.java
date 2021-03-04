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

import vn.gov.hoabinh.model.VcmsArticleRating;

import java.util.List;

/**
 * The persistence utility for the vcms article rating service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsArticleRatingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleRatingPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsArticleRatingPersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsArticleRatingUtil {
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
	public static void clearCache(VcmsArticleRating vcmsArticleRating) {
		getPersistence().clearCache(vcmsArticleRating);
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
	public static List<VcmsArticleRating> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsArticleRating> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsArticleRating> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsArticleRating> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsArticleRating update(VcmsArticleRating vcmsArticleRating) {
		return getPersistence().update(vcmsArticleRating);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsArticleRating update(
		VcmsArticleRating vcmsArticleRating, ServiceContext serviceContext) {
		return getPersistence().update(vcmsArticleRating, serviceContext);
	}

	/**
	* Returns all the vcms article ratings where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms article ratings
	*/
	public static List<VcmsArticleRating> findByA_R(long articleId) {
		return getPersistence().findByA_R(articleId);
	}

	/**
	* Returns a range of all the vcms article ratings where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @return the range of matching vcms article ratings
	*/
	public static List<VcmsArticleRating> findByA_R(long articleId, int start,
		int end) {
		return getPersistence().findByA_R(articleId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms article ratings where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms article ratings
	*/
	public static List<VcmsArticleRating> findByA_R(long articleId, int start,
		int end, OrderByComparator<VcmsArticleRating> orderByComparator) {
		return getPersistence()
				   .findByA_R(articleId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms article ratings where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms article ratings
	*/
	public static List<VcmsArticleRating> findByA_R(long articleId, int start,
		int end, OrderByComparator<VcmsArticleRating> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByA_R(articleId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms article rating in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article rating
	* @throws NoSuchVcmsArticleRatingException if a matching vcms article rating could not be found
	*/
	public static VcmsArticleRating findByA_R_First(long articleId,
		OrderByComparator<VcmsArticleRating> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleRatingException {
		return getPersistence().findByA_R_First(articleId, orderByComparator);
	}

	/**
	* Returns the first vcms article rating in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article rating, or <code>null</code> if a matching vcms article rating could not be found
	*/
	public static VcmsArticleRating fetchByA_R_First(long articleId,
		OrderByComparator<VcmsArticleRating> orderByComparator) {
		return getPersistence().fetchByA_R_First(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms article rating in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article rating
	* @throws NoSuchVcmsArticleRatingException if a matching vcms article rating could not be found
	*/
	public static VcmsArticleRating findByA_R_Last(long articleId,
		OrderByComparator<VcmsArticleRating> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleRatingException {
		return getPersistence().findByA_R_Last(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms article rating in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article rating, or <code>null</code> if a matching vcms article rating could not be found
	*/
	public static VcmsArticleRating fetchByA_R_Last(long articleId,
		OrderByComparator<VcmsArticleRating> orderByComparator) {
		return getPersistence().fetchByA_R_Last(articleId, orderByComparator);
	}

	/**
	* Returns the vcms article ratings before and after the current vcms article rating in the ordered set where articleId = &#63;.
	*
	* @param Id the primary key of the current vcms article rating
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article rating
	* @throws NoSuchVcmsArticleRatingException if a vcms article rating with the primary key could not be found
	*/
	public static VcmsArticleRating[] findByA_R_PrevAndNext(long Id,
		long articleId, OrderByComparator<VcmsArticleRating> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleRatingException {
		return getPersistence()
				   .findByA_R_PrevAndNext(Id, articleId, orderByComparator);
	}

	/**
	* Removes all the vcms article ratings where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public static void removeByA_R(long articleId) {
		getPersistence().removeByA_R(articleId);
	}

	/**
	* Returns the number of vcms article ratings where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms article ratings
	*/
	public static int countByA_R(long articleId) {
		return getPersistence().countByA_R(articleId);
	}

	/**
	* Returns all the vcms article ratings where articleId = &#63; and sessionId = &#63;.
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @return the matching vcms article ratings
	*/
	public static List<VcmsArticleRating> findByA_S(long articleId,
		java.lang.String sessionId) {
		return getPersistence().findByA_S(articleId, sessionId);
	}

	/**
	* Returns a range of all the vcms article ratings where articleId = &#63; and sessionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @return the range of matching vcms article ratings
	*/
	public static List<VcmsArticleRating> findByA_S(long articleId,
		java.lang.String sessionId, int start, int end) {
		return getPersistence().findByA_S(articleId, sessionId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms article ratings where articleId = &#63; and sessionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms article ratings
	*/
	public static List<VcmsArticleRating> findByA_S(long articleId,
		java.lang.String sessionId, int start, int end,
		OrderByComparator<VcmsArticleRating> orderByComparator) {
		return getPersistence()
				   .findByA_S(articleId, sessionId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms article ratings where articleId = &#63; and sessionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms article ratings
	*/
	public static List<VcmsArticleRating> findByA_S(long articleId,
		java.lang.String sessionId, int start, int end,
		OrderByComparator<VcmsArticleRating> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByA_S(articleId, sessionId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms article rating in the ordered set where articleId = &#63; and sessionId = &#63;.
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article rating
	* @throws NoSuchVcmsArticleRatingException if a matching vcms article rating could not be found
	*/
	public static VcmsArticleRating findByA_S_First(long articleId,
		java.lang.String sessionId,
		OrderByComparator<VcmsArticleRating> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleRatingException {
		return getPersistence()
				   .findByA_S_First(articleId, sessionId, orderByComparator);
	}

	/**
	* Returns the first vcms article rating in the ordered set where articleId = &#63; and sessionId = &#63;.
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article rating, or <code>null</code> if a matching vcms article rating could not be found
	*/
	public static VcmsArticleRating fetchByA_S_First(long articleId,
		java.lang.String sessionId,
		OrderByComparator<VcmsArticleRating> orderByComparator) {
		return getPersistence()
				   .fetchByA_S_First(articleId, sessionId, orderByComparator);
	}

	/**
	* Returns the last vcms article rating in the ordered set where articleId = &#63; and sessionId = &#63;.
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article rating
	* @throws NoSuchVcmsArticleRatingException if a matching vcms article rating could not be found
	*/
	public static VcmsArticleRating findByA_S_Last(long articleId,
		java.lang.String sessionId,
		OrderByComparator<VcmsArticleRating> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleRatingException {
		return getPersistence()
				   .findByA_S_Last(articleId, sessionId, orderByComparator);
	}

	/**
	* Returns the last vcms article rating in the ordered set where articleId = &#63; and sessionId = &#63;.
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article rating, or <code>null</code> if a matching vcms article rating could not be found
	*/
	public static VcmsArticleRating fetchByA_S_Last(long articleId,
		java.lang.String sessionId,
		OrderByComparator<VcmsArticleRating> orderByComparator) {
		return getPersistence()
				   .fetchByA_S_Last(articleId, sessionId, orderByComparator);
	}

	/**
	* Returns the vcms article ratings before and after the current vcms article rating in the ordered set where articleId = &#63; and sessionId = &#63;.
	*
	* @param Id the primary key of the current vcms article rating
	* @param articleId the article ID
	* @param sessionId the session ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article rating
	* @throws NoSuchVcmsArticleRatingException if a vcms article rating with the primary key could not be found
	*/
	public static VcmsArticleRating[] findByA_S_PrevAndNext(long Id,
		long articleId, java.lang.String sessionId,
		OrderByComparator<VcmsArticleRating> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleRatingException {
		return getPersistence()
				   .findByA_S_PrevAndNext(Id, articleId, sessionId,
			orderByComparator);
	}

	/**
	* Removes all the vcms article ratings where articleId = &#63; and sessionId = &#63; from the database.
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	*/
	public static void removeByA_S(long articleId, java.lang.String sessionId) {
		getPersistence().removeByA_S(articleId, sessionId);
	}

	/**
	* Returns the number of vcms article ratings where articleId = &#63; and sessionId = &#63;.
	*
	* @param articleId the article ID
	* @param sessionId the session ID
	* @return the number of matching vcms article ratings
	*/
	public static int countByA_S(long articleId, java.lang.String sessionId) {
		return getPersistence().countByA_S(articleId, sessionId);
	}

	/**
	* Caches the vcms article rating in the entity cache if it is enabled.
	*
	* @param vcmsArticleRating the vcms article rating
	*/
	public static void cacheResult(VcmsArticleRating vcmsArticleRating) {
		getPersistence().cacheResult(vcmsArticleRating);
	}

	/**
	* Caches the vcms article ratings in the entity cache if it is enabled.
	*
	* @param vcmsArticleRatings the vcms article ratings
	*/
	public static void cacheResult(List<VcmsArticleRating> vcmsArticleRatings) {
		getPersistence().cacheResult(vcmsArticleRatings);
	}

	/**
	* Creates a new vcms article rating with the primary key. Does not add the vcms article rating to the database.
	*
	* @param Id the primary key for the new vcms article rating
	* @return the new vcms article rating
	*/
	public static VcmsArticleRating create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the vcms article rating with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the vcms article rating
	* @return the vcms article rating that was removed
	* @throws NoSuchVcmsArticleRatingException if a vcms article rating with the primary key could not be found
	*/
	public static VcmsArticleRating remove(long Id)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleRatingException {
		return getPersistence().remove(Id);
	}

	public static VcmsArticleRating updateImpl(
		VcmsArticleRating vcmsArticleRating) {
		return getPersistence().updateImpl(vcmsArticleRating);
	}

	/**
	* Returns the vcms article rating with the primary key or throws a {@link NoSuchVcmsArticleRatingException} if it could not be found.
	*
	* @param Id the primary key of the vcms article rating
	* @return the vcms article rating
	* @throws NoSuchVcmsArticleRatingException if a vcms article rating with the primary key could not be found
	*/
	public static VcmsArticleRating findByPrimaryKey(long Id)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleRatingException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the vcms article rating with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the vcms article rating
	* @return the vcms article rating, or <code>null</code> if a vcms article rating with the primary key could not be found
	*/
	public static VcmsArticleRating fetchByPrimaryKey(long Id) {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	public static java.util.Map<java.io.Serializable, VcmsArticleRating> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms article ratings.
	*
	* @return the vcms article ratings
	*/
	public static List<VcmsArticleRating> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms article ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @return the range of vcms article ratings
	*/
	public static List<VcmsArticleRating> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms article ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms article ratings
	*/
	public static List<VcmsArticleRating> findAll(int start, int end,
		OrderByComparator<VcmsArticleRating> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms article ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms article ratings
	*/
	public static List<VcmsArticleRating> findAll(int start, int end,
		OrderByComparator<VcmsArticleRating> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms article ratings from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms article ratings.
	*
	* @return the number of vcms article ratings
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VcmsArticleRatingPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsArticleRatingPersistence, VcmsArticleRatingPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsArticleRatingPersistence.class);
}