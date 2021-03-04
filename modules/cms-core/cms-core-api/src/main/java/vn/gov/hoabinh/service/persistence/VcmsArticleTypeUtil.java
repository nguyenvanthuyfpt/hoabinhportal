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

import vn.gov.hoabinh.model.VcmsArticleType;

import java.util.List;

/**
 * The persistence utility for the vcms article type service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsArticleTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleTypePersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsArticleTypePersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsArticleTypeUtil {
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
	public static void clearCache(VcmsArticleType vcmsArticleType) {
		getPersistence().clearCache(vcmsArticleType);
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
	public static List<VcmsArticleType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsArticleType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsArticleType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsArticleType> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsArticleType update(VcmsArticleType vcmsArticleType) {
		return getPersistence().update(vcmsArticleType);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsArticleType update(VcmsArticleType vcmsArticleType,
		ServiceContext serviceContext) {
		return getPersistence().update(vcmsArticleType, serviceContext);
	}

	/**
	* Returns all the vcms article types where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the matching vcms article types
	*/
	public static List<VcmsArticleType> findByType(long typeId) {
		return getPersistence().findByType(typeId);
	}

	/**
	* Returns a range of all the vcms article types where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @return the range of matching vcms article types
	*/
	public static List<VcmsArticleType> findByType(long typeId, int start,
		int end) {
		return getPersistence().findByType(typeId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms article types where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms article types
	*/
	public static List<VcmsArticleType> findByType(long typeId, int start,
		int end, OrderByComparator<VcmsArticleType> orderByComparator) {
		return getPersistence().findByType(typeId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms article types where typeId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param typeId the type ID
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms article types
	*/
	public static List<VcmsArticleType> findByType(long typeId, int start,
		int end, OrderByComparator<VcmsArticleType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByType(typeId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms article type in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article type
	* @throws NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	*/
	public static VcmsArticleType findByType_First(long typeId,
		OrderByComparator<VcmsArticleType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleTypeException {
		return getPersistence().findByType_First(typeId, orderByComparator);
	}

	/**
	* Returns the first vcms article type in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	*/
	public static VcmsArticleType fetchByType_First(long typeId,
		OrderByComparator<VcmsArticleType> orderByComparator) {
		return getPersistence().fetchByType_First(typeId, orderByComparator);
	}

	/**
	* Returns the last vcms article type in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article type
	* @throws NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	*/
	public static VcmsArticleType findByType_Last(long typeId,
		OrderByComparator<VcmsArticleType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleTypeException {
		return getPersistence().findByType_Last(typeId, orderByComparator);
	}

	/**
	* Returns the last vcms article type in the ordered set where typeId = &#63;.
	*
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	*/
	public static VcmsArticleType fetchByType_Last(long typeId,
		OrderByComparator<VcmsArticleType> orderByComparator) {
		return getPersistence().fetchByType_Last(typeId, orderByComparator);
	}

	/**
	* Returns the vcms article types before and after the current vcms article type in the ordered set where typeId = &#63;.
	*
	* @param vcmsArticleTypePK the primary key of the current vcms article type
	* @param typeId the type ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article type
	* @throws NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	*/
	public static VcmsArticleType[] findByType_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK,
		long typeId, OrderByComparator<VcmsArticleType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleTypeException {
		return getPersistence()
				   .findByType_PrevAndNext(vcmsArticleTypePK, typeId,
			orderByComparator);
	}

	/**
	* Removes all the vcms article types where typeId = &#63; from the database.
	*
	* @param typeId the type ID
	*/
	public static void removeByType(long typeId) {
		getPersistence().removeByType(typeId);
	}

	/**
	* Returns the number of vcms article types where typeId = &#63;.
	*
	* @param typeId the type ID
	* @return the number of matching vcms article types
	*/
	public static int countByType(long typeId) {
		return getPersistence().countByType(typeId);
	}

	/**
	* Returns all the vcms article types where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms article types
	*/
	public static List<VcmsArticleType> findByArticle(
		java.lang.String articleId) {
		return getPersistence().findByArticle(articleId);
	}

	/**
	* Returns a range of all the vcms article types where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @return the range of matching vcms article types
	*/
	public static List<VcmsArticleType> findByArticle(
		java.lang.String articleId, int start, int end) {
		return getPersistence().findByArticle(articleId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms article types where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms article types
	*/
	public static List<VcmsArticleType> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsArticleType> orderByComparator) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms article types where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms article types
	*/
	public static List<VcmsArticleType> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsArticleType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms article type in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article type
	* @throws NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	*/
	public static VcmsArticleType findByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsArticleType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleTypeException {
		return getPersistence().findByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the first vcms article type in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	*/
	public static VcmsArticleType fetchByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsArticleType> orderByComparator) {
		return getPersistence()
				   .fetchByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms article type in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article type
	* @throws NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	*/
	public static VcmsArticleType findByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsArticleType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleTypeException {
		return getPersistence().findByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms article type in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	*/
	public static VcmsArticleType fetchByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsArticleType> orderByComparator) {
		return getPersistence().fetchByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the vcms article types before and after the current vcms article type in the ordered set where articleId = &#63;.
	*
	* @param vcmsArticleTypePK the primary key of the current vcms article type
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article type
	* @throws NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	*/
	public static VcmsArticleType[] findByArticle_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK,
		java.lang.String articleId,
		OrderByComparator<VcmsArticleType> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleTypeException {
		return getPersistence()
				   .findByArticle_PrevAndNext(vcmsArticleTypePK, articleId,
			orderByComparator);
	}

	/**
	* Removes all the vcms article types where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public static void removeByArticle(java.lang.String articleId) {
		getPersistence().removeByArticle(articleId);
	}

	/**
	* Returns the number of vcms article types where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms article types
	*/
	public static int countByArticle(java.lang.String articleId) {
		return getPersistence().countByArticle(articleId);
	}

	/**
	* Returns the vcms article type where typeId = &#63; and articleId = &#63; or throws a {@link NoSuchVcmsArticleTypeException} if it could not be found.
	*
	* @param typeId the type ID
	* @param articleId the article ID
	* @return the matching vcms article type
	* @throws NoSuchVcmsArticleTypeException if a matching vcms article type could not be found
	*/
	public static VcmsArticleType findByT_A(long typeId,
		java.lang.String articleId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleTypeException {
		return getPersistence().findByT_A(typeId, articleId);
	}

	/**
	* Returns the vcms article type where typeId = &#63; and articleId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param typeId the type ID
	* @param articleId the article ID
	* @return the matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	*/
	public static VcmsArticleType fetchByT_A(long typeId,
		java.lang.String articleId) {
		return getPersistence().fetchByT_A(typeId, articleId);
	}

	/**
	* Returns the vcms article type where typeId = &#63; and articleId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param typeId the type ID
	* @param articleId the article ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vcms article type, or <code>null</code> if a matching vcms article type could not be found
	*/
	public static VcmsArticleType fetchByT_A(long typeId,
		java.lang.String articleId, boolean retrieveFromCache) {
		return getPersistence().fetchByT_A(typeId, articleId, retrieveFromCache);
	}

	/**
	* Removes the vcms article type where typeId = &#63; and articleId = &#63; from the database.
	*
	* @param typeId the type ID
	* @param articleId the article ID
	* @return the vcms article type that was removed
	*/
	public static VcmsArticleType removeByT_A(long typeId,
		java.lang.String articleId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleTypeException {
		return getPersistence().removeByT_A(typeId, articleId);
	}

	/**
	* Returns the number of vcms article types where typeId = &#63; and articleId = &#63;.
	*
	* @param typeId the type ID
	* @param articleId the article ID
	* @return the number of matching vcms article types
	*/
	public static int countByT_A(long typeId, java.lang.String articleId) {
		return getPersistence().countByT_A(typeId, articleId);
	}

	/**
	* Caches the vcms article type in the entity cache if it is enabled.
	*
	* @param vcmsArticleType the vcms article type
	*/
	public static void cacheResult(VcmsArticleType vcmsArticleType) {
		getPersistence().cacheResult(vcmsArticleType);
	}

	/**
	* Caches the vcms article types in the entity cache if it is enabled.
	*
	* @param vcmsArticleTypes the vcms article types
	*/
	public static void cacheResult(List<VcmsArticleType> vcmsArticleTypes) {
		getPersistence().cacheResult(vcmsArticleTypes);
	}

	/**
	* Creates a new vcms article type with the primary key. Does not add the vcms article type to the database.
	*
	* @param vcmsArticleTypePK the primary key for the new vcms article type
	* @return the new vcms article type
	*/
	public static VcmsArticleType create(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK) {
		return getPersistence().create(vcmsArticleTypePK);
	}

	/**
	* Removes the vcms article type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleTypePK the primary key of the vcms article type
	* @return the vcms article type that was removed
	* @throws NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	*/
	public static VcmsArticleType remove(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleTypeException {
		return getPersistence().remove(vcmsArticleTypePK);
	}

	public static VcmsArticleType updateImpl(VcmsArticleType vcmsArticleType) {
		return getPersistence().updateImpl(vcmsArticleType);
	}

	/**
	* Returns the vcms article type with the primary key or throws a {@link NoSuchVcmsArticleTypeException} if it could not be found.
	*
	* @param vcmsArticleTypePK the primary key of the vcms article type
	* @return the vcms article type
	* @throws NoSuchVcmsArticleTypeException if a vcms article type with the primary key could not be found
	*/
	public static VcmsArticleType findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleTypeException {
		return getPersistence().findByPrimaryKey(vcmsArticleTypePK);
	}

	/**
	* Returns the vcms article type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vcmsArticleTypePK the primary key of the vcms article type
	* @return the vcms article type, or <code>null</code> if a vcms article type with the primary key could not be found
	*/
	public static VcmsArticleType fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK) {
		return getPersistence().fetchByPrimaryKey(vcmsArticleTypePK);
	}

	public static java.util.Map<java.io.Serializable, VcmsArticleType> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms article types.
	*
	* @return the vcms article types
	*/
	public static List<VcmsArticleType> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms article types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @return the range of vcms article types
	*/
	public static List<VcmsArticleType> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms article types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms article types
	*/
	public static List<VcmsArticleType> findAll(int start, int end,
		OrderByComparator<VcmsArticleType> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms article types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms article types
	*/
	public static List<VcmsArticleType> findAll(int start, int end,
		OrderByComparator<VcmsArticleType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms article types from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms article types.
	*
	* @return the number of vcms article types
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VcmsArticleTypePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsArticleTypePersistence, VcmsArticleTypePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsArticleTypePersistence.class);
}