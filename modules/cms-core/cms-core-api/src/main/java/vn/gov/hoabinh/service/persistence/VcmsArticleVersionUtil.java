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

import vn.gov.hoabinh.model.VcmsArticleVersion;

import java.util.List;

/**
 * The persistence utility for the vcms article version service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsArticleVersionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleVersionPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsArticleVersionPersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsArticleVersionUtil {
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
	public static void clearCache(VcmsArticleVersion vcmsArticleVersion) {
		getPersistence().clearCache(vcmsArticleVersion);
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
	public static List<VcmsArticleVersion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsArticleVersion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsArticleVersion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsArticleVersion> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsArticleVersion update(
		VcmsArticleVersion vcmsArticleVersion) {
		return getPersistence().update(vcmsArticleVersion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsArticleVersion update(
		VcmsArticleVersion vcmsArticleVersion, ServiceContext serviceContext) {
		return getPersistence().update(vcmsArticleVersion, serviceContext);
	}

	/**
	* Returns all the vcms article versions where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms article versions
	*/
	public static List<VcmsArticleVersion> findByArticle(
		java.lang.String articleId) {
		return getPersistence().findByArticle(articleId);
	}

	/**
	* Returns a range of all the vcms article versions where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article versions
	* @param end the upper bound of the range of vcms article versions (not inclusive)
	* @return the range of matching vcms article versions
	*/
	public static List<VcmsArticleVersion> findByArticle(
		java.lang.String articleId, int start, int end) {
		return getPersistence().findByArticle(articleId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms article versions where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article versions
	* @param end the upper bound of the range of vcms article versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms article versions
	*/
	public static List<VcmsArticleVersion> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsArticleVersion> orderByComparator) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms article versions where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article versions
	* @param end the upper bound of the range of vcms article versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms article versions
	*/
	public static List<VcmsArticleVersion> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsArticleVersion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms article version in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article version
	* @throws NoSuchVcmsArticleVersionException if a matching vcms article version could not be found
	*/
	public static VcmsArticleVersion findByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsArticleVersion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleVersionException {
		return getPersistence().findByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the first vcms article version in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article version, or <code>null</code> if a matching vcms article version could not be found
	*/
	public static VcmsArticleVersion fetchByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsArticleVersion> orderByComparator) {
		return getPersistence()
				   .fetchByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms article version in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article version
	* @throws NoSuchVcmsArticleVersionException if a matching vcms article version could not be found
	*/
	public static VcmsArticleVersion findByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsArticleVersion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleVersionException {
		return getPersistence().findByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms article version in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article version, or <code>null</code> if a matching vcms article version could not be found
	*/
	public static VcmsArticleVersion fetchByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsArticleVersion> orderByComparator) {
		return getPersistence().fetchByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the vcms article versions before and after the current vcms article version in the ordered set where articleId = &#63;.
	*
	* @param articleVersionId the primary key of the current vcms article version
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article version
	* @throws NoSuchVcmsArticleVersionException if a vcms article version with the primary key could not be found
	*/
	public static VcmsArticleVersion[] findByArticle_PrevAndNext(
		long articleVersionId, java.lang.String articleId,
		OrderByComparator<VcmsArticleVersion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleVersionException {
		return getPersistence()
				   .findByArticle_PrevAndNext(articleVersionId, articleId,
			orderByComparator);
	}

	/**
	* Removes all the vcms article versions where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public static void removeByArticle(java.lang.String articleId) {
		getPersistence().removeByArticle(articleId);
	}

	/**
	* Returns the number of vcms article versions where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms article versions
	*/
	public static int countByArticle(java.lang.String articleId) {
		return getPersistence().countByArticle(articleId);
	}

	/**
	* Caches the vcms article version in the entity cache if it is enabled.
	*
	* @param vcmsArticleVersion the vcms article version
	*/
	public static void cacheResult(VcmsArticleVersion vcmsArticleVersion) {
		getPersistence().cacheResult(vcmsArticleVersion);
	}

	/**
	* Caches the vcms article versions in the entity cache if it is enabled.
	*
	* @param vcmsArticleVersions the vcms article versions
	*/
	public static void cacheResult(List<VcmsArticleVersion> vcmsArticleVersions) {
		getPersistence().cacheResult(vcmsArticleVersions);
	}

	/**
	* Creates a new vcms article version with the primary key. Does not add the vcms article version to the database.
	*
	* @param articleVersionId the primary key for the new vcms article version
	* @return the new vcms article version
	*/
	public static VcmsArticleVersion create(long articleVersionId) {
		return getPersistence().create(articleVersionId);
	}

	/**
	* Removes the vcms article version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param articleVersionId the primary key of the vcms article version
	* @return the vcms article version that was removed
	* @throws NoSuchVcmsArticleVersionException if a vcms article version with the primary key could not be found
	*/
	public static VcmsArticleVersion remove(long articleVersionId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleVersionException {
		return getPersistence().remove(articleVersionId);
	}

	public static VcmsArticleVersion updateImpl(
		VcmsArticleVersion vcmsArticleVersion) {
		return getPersistence().updateImpl(vcmsArticleVersion);
	}

	/**
	* Returns the vcms article version with the primary key or throws a {@link NoSuchVcmsArticleVersionException} if it could not be found.
	*
	* @param articleVersionId the primary key of the vcms article version
	* @return the vcms article version
	* @throws NoSuchVcmsArticleVersionException if a vcms article version with the primary key could not be found
	*/
	public static VcmsArticleVersion findByPrimaryKey(long articleVersionId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleVersionException {
		return getPersistence().findByPrimaryKey(articleVersionId);
	}

	/**
	* Returns the vcms article version with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param articleVersionId the primary key of the vcms article version
	* @return the vcms article version, or <code>null</code> if a vcms article version with the primary key could not be found
	*/
	public static VcmsArticleVersion fetchByPrimaryKey(long articleVersionId) {
		return getPersistence().fetchByPrimaryKey(articleVersionId);
	}

	public static java.util.Map<java.io.Serializable, VcmsArticleVersion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms article versions.
	*
	* @return the vcms article versions
	*/
	public static List<VcmsArticleVersion> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms article versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article versions
	* @param end the upper bound of the range of vcms article versions (not inclusive)
	* @return the range of vcms article versions
	*/
	public static List<VcmsArticleVersion> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms article versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article versions
	* @param end the upper bound of the range of vcms article versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms article versions
	*/
	public static List<VcmsArticleVersion> findAll(int start, int end,
		OrderByComparator<VcmsArticleVersion> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms article versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article versions
	* @param end the upper bound of the range of vcms article versions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms article versions
	*/
	public static List<VcmsArticleVersion> findAll(int start, int end,
		OrderByComparator<VcmsArticleVersion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms article versions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms article versions.
	*
	* @return the number of vcms article versions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VcmsArticleVersionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsArticleVersionPersistence, VcmsArticleVersionPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsArticleVersionPersistence.class);
}