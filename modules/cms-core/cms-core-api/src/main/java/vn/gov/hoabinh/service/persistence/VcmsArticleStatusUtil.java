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

import vn.gov.hoabinh.model.VcmsArticleStatus;

import java.util.List;

/**
 * The persistence utility for the vcms article status service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsArticleStatusPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleStatusPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsArticleStatusPersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsArticleStatusUtil {
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
	public static void clearCache(VcmsArticleStatus vcmsArticleStatus) {
		getPersistence().clearCache(vcmsArticleStatus);
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
	public static List<VcmsArticleStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsArticleStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsArticleStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsArticleStatus update(VcmsArticleStatus vcmsArticleStatus) {
		return getPersistence().update(vcmsArticleStatus);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsArticleStatus update(
		VcmsArticleStatus vcmsArticleStatus, ServiceContext serviceContext) {
		return getPersistence().update(vcmsArticleStatus, serviceContext);
	}

	/**
	* Returns all the vcms article statuses where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByArticle(
		java.lang.String articleId) {
		return getPersistence().findByArticle(articleId);
	}

	/**
	* Returns a range of all the vcms article statuses where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @return the range of matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByArticle(
		java.lang.String articleId, int start, int end) {
		return getPersistence().findByArticle(articleId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms article statuses where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms article statuses where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsArticleStatus> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms article status in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus findByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException {
		return getPersistence().findByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the first vcms article status in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus fetchByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return getPersistence()
				   .fetchByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms article status in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus findByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException {
		return getPersistence().findByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms article status in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus fetchByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return getPersistence().fetchByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the vcms article statuses before and after the current vcms article status in the ordered set where articleId = &#63;.
	*
	* @param vcmsArticleStatusPK the primary key of the current vcms article status
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article status
	* @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	*/
	public static VcmsArticleStatus[] findByArticle_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK,
		java.lang.String articleId,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException {
		return getPersistence()
				   .findByArticle_PrevAndNext(vcmsArticleStatusPK, articleId,
			orderByComparator);
	}

	/**
	* Removes all the vcms article statuses where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public static void removeByArticle(java.lang.String articleId) {
		getPersistence().removeByArticle(articleId);
	}

	/**
	* Returns the number of vcms article statuses where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms article statuses
	*/
	public static int countByArticle(java.lang.String articleId) {
		return getPersistence().countByArticle(articleId);
	}

	/**
	* Returns all the vcms article statuses where active = &#63;.
	*
	* @param active the active
	* @return the matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByActive(boolean active) {
		return getPersistence().findByActive(active);
	}

	/**
	* Returns a range of all the vcms article statuses where active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param active the active
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @return the range of matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByActive(boolean active,
		int start, int end) {
		return getPersistence().findByActive(active, start, end);
	}

	/**
	* Returns an ordered range of all the vcms article statuses where active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param active the active
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByActive(boolean active,
		int start, int end,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return getPersistence()
				   .findByActive(active, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms article statuses where active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param active the active
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByActive(boolean active,
		int start, int end,
		OrderByComparator<VcmsArticleStatus> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByActive(active, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms article status in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus findByActive_First(boolean active,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException {
		return getPersistence().findByActive_First(active, orderByComparator);
	}

	/**
	* Returns the first vcms article status in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus fetchByActive_First(boolean active,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return getPersistence().fetchByActive_First(active, orderByComparator);
	}

	/**
	* Returns the last vcms article status in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus findByActive_Last(boolean active,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException {
		return getPersistence().findByActive_Last(active, orderByComparator);
	}

	/**
	* Returns the last vcms article status in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus fetchByActive_Last(boolean active,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return getPersistence().fetchByActive_Last(active, orderByComparator);
	}

	/**
	* Returns the vcms article statuses before and after the current vcms article status in the ordered set where active = &#63;.
	*
	* @param vcmsArticleStatusPK the primary key of the current vcms article status
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article status
	* @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	*/
	public static VcmsArticleStatus[] findByActive_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK,
		boolean active, OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException {
		return getPersistence()
				   .findByActive_PrevAndNext(vcmsArticleStatusPK, active,
			orderByComparator);
	}

	/**
	* Removes all the vcms article statuses where active = &#63; from the database.
	*
	* @param active the active
	*/
	public static void removeByActive(boolean active) {
		getPersistence().removeByActive(active);
	}

	/**
	* Returns the number of vcms article statuses where active = &#63;.
	*
	* @param active the active
	* @return the number of matching vcms article statuses
	*/
	public static int countByActive(boolean active) {
		return getPersistence().countByActive(active);
	}

	/**
	* Returns all the vcms article statuses where createdByUser = &#63;.
	*
	* @param createdByUser the created by user
	* @return the matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByUser(
		java.lang.String createdByUser) {
		return getPersistence().findByUser(createdByUser);
	}

	/**
	* Returns a range of all the vcms article statuses where createdByUser = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createdByUser the created by user
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @return the range of matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByUser(
		java.lang.String createdByUser, int start, int end) {
		return getPersistence().findByUser(createdByUser, start, end);
	}

	/**
	* Returns an ordered range of all the vcms article statuses where createdByUser = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createdByUser the created by user
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByUser(
		java.lang.String createdByUser, int start, int end,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return getPersistence()
				   .findByUser(createdByUser, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms article statuses where createdByUser = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createdByUser the created by user
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByUser(
		java.lang.String createdByUser, int start, int end,
		OrderByComparator<VcmsArticleStatus> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUser(createdByUser, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms article status in the ordered set where createdByUser = &#63;.
	*
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus findByUser_First(
		java.lang.String createdByUser,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException {
		return getPersistence()
				   .findByUser_First(createdByUser, orderByComparator);
	}

	/**
	* Returns the first vcms article status in the ordered set where createdByUser = &#63;.
	*
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus fetchByUser_First(
		java.lang.String createdByUser,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return getPersistence()
				   .fetchByUser_First(createdByUser, orderByComparator);
	}

	/**
	* Returns the last vcms article status in the ordered set where createdByUser = &#63;.
	*
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus findByUser_Last(
		java.lang.String createdByUser,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException {
		return getPersistence().findByUser_Last(createdByUser, orderByComparator);
	}

	/**
	* Returns the last vcms article status in the ordered set where createdByUser = &#63;.
	*
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus fetchByUser_Last(
		java.lang.String createdByUser,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return getPersistence()
				   .fetchByUser_Last(createdByUser, orderByComparator);
	}

	/**
	* Returns the vcms article statuses before and after the current vcms article status in the ordered set where createdByUser = &#63;.
	*
	* @param vcmsArticleStatusPK the primary key of the current vcms article status
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article status
	* @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	*/
	public static VcmsArticleStatus[] findByUser_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK,
		java.lang.String createdByUser,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException {
		return getPersistence()
				   .findByUser_PrevAndNext(vcmsArticleStatusPK, createdByUser,
			orderByComparator);
	}

	/**
	* Removes all the vcms article statuses where createdByUser = &#63; from the database.
	*
	* @param createdByUser the created by user
	*/
	public static void removeByUser(java.lang.String createdByUser) {
		getPersistence().removeByUser(createdByUser);
	}

	/**
	* Returns the number of vcms article statuses where createdByUser = &#63;.
	*
	* @param createdByUser the created by user
	* @return the number of matching vcms article statuses
	*/
	public static int countByUser(java.lang.String createdByUser) {
		return getPersistence().countByUser(createdByUser);
	}

	/**
	* Returns all the vcms article statuses where createdByUser = &#63; and active = &#63;.
	*
	* @param createdByUser the created by user
	* @param active the active
	* @return the matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByU_A(
		java.lang.String createdByUser, boolean active) {
		return getPersistence().findByU_A(createdByUser, active);
	}

	/**
	* Returns a range of all the vcms article statuses where createdByUser = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createdByUser the created by user
	* @param active the active
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @return the range of matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByU_A(
		java.lang.String createdByUser, boolean active, int start, int end) {
		return getPersistence().findByU_A(createdByUser, active, start, end);
	}

	/**
	* Returns an ordered range of all the vcms article statuses where createdByUser = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createdByUser the created by user
	* @param active the active
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByU_A(
		java.lang.String createdByUser, boolean active, int start, int end,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return getPersistence()
				   .findByU_A(createdByUser, active, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms article statuses where createdByUser = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createdByUser the created by user
	* @param active the active
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms article statuses
	*/
	public static List<VcmsArticleStatus> findByU_A(
		java.lang.String createdByUser, boolean active, int start, int end,
		OrderByComparator<VcmsArticleStatus> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByU_A(createdByUser, active, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms article status in the ordered set where createdByUser = &#63; and active = &#63;.
	*
	* @param createdByUser the created by user
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus findByU_A_First(
		java.lang.String createdByUser, boolean active,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException {
		return getPersistence()
				   .findByU_A_First(createdByUser, active, orderByComparator);
	}

	/**
	* Returns the first vcms article status in the ordered set where createdByUser = &#63; and active = &#63;.
	*
	* @param createdByUser the created by user
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus fetchByU_A_First(
		java.lang.String createdByUser, boolean active,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return getPersistence()
				   .fetchByU_A_First(createdByUser, active, orderByComparator);
	}

	/**
	* Returns the last vcms article status in the ordered set where createdByUser = &#63; and active = &#63;.
	*
	* @param createdByUser the created by user
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus findByU_A_Last(
		java.lang.String createdByUser, boolean active,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException {
		return getPersistence()
				   .findByU_A_Last(createdByUser, active, orderByComparator);
	}

	/**
	* Returns the last vcms article status in the ordered set where createdByUser = &#63; and active = &#63;.
	*
	* @param createdByUser the created by user
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public static VcmsArticleStatus fetchByU_A_Last(
		java.lang.String createdByUser, boolean active,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return getPersistence()
				   .fetchByU_A_Last(createdByUser, active, orderByComparator);
	}

	/**
	* Returns the vcms article statuses before and after the current vcms article status in the ordered set where createdByUser = &#63; and active = &#63;.
	*
	* @param vcmsArticleStatusPK the primary key of the current vcms article status
	* @param createdByUser the created by user
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article status
	* @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	*/
	public static VcmsArticleStatus[] findByU_A_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK,
		java.lang.String createdByUser, boolean active,
		OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException {
		return getPersistence()
				   .findByU_A_PrevAndNext(vcmsArticleStatusPK, createdByUser,
			active, orderByComparator);
	}

	/**
	* Removes all the vcms article statuses where createdByUser = &#63; and active = &#63; from the database.
	*
	* @param createdByUser the created by user
	* @param active the active
	*/
	public static void removeByU_A(java.lang.String createdByUser,
		boolean active) {
		getPersistence().removeByU_A(createdByUser, active);
	}

	/**
	* Returns the number of vcms article statuses where createdByUser = &#63; and active = &#63;.
	*
	* @param createdByUser the created by user
	* @param active the active
	* @return the number of matching vcms article statuses
	*/
	public static int countByU_A(java.lang.String createdByUser, boolean active) {
		return getPersistence().countByU_A(createdByUser, active);
	}

	/**
	* Caches the vcms article status in the entity cache if it is enabled.
	*
	* @param vcmsArticleStatus the vcms article status
	*/
	public static void cacheResult(VcmsArticleStatus vcmsArticleStatus) {
		getPersistence().cacheResult(vcmsArticleStatus);
	}

	/**
	* Caches the vcms article statuses in the entity cache if it is enabled.
	*
	* @param vcmsArticleStatuses the vcms article statuses
	*/
	public static void cacheResult(List<VcmsArticleStatus> vcmsArticleStatuses) {
		getPersistence().cacheResult(vcmsArticleStatuses);
	}

	/**
	* Creates a new vcms article status with the primary key. Does not add the vcms article status to the database.
	*
	* @param vcmsArticleStatusPK the primary key for the new vcms article status
	* @return the new vcms article status
	*/
	public static VcmsArticleStatus create(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK) {
		return getPersistence().create(vcmsArticleStatusPK);
	}

	/**
	* Removes the vcms article status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleStatusPK the primary key of the vcms article status
	* @return the vcms article status that was removed
	* @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	*/
	public static VcmsArticleStatus remove(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException {
		return getPersistence().remove(vcmsArticleStatusPK);
	}

	public static VcmsArticleStatus updateImpl(
		VcmsArticleStatus vcmsArticleStatus) {
		return getPersistence().updateImpl(vcmsArticleStatus);
	}

	/**
	* Returns the vcms article status with the primary key or throws a {@link NoSuchVcmsArticleStatusException} if it could not be found.
	*
	* @param vcmsArticleStatusPK the primary key of the vcms article status
	* @return the vcms article status
	* @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	*/
	public static VcmsArticleStatus findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException {
		return getPersistence().findByPrimaryKey(vcmsArticleStatusPK);
	}

	/**
	* Returns the vcms article status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vcmsArticleStatusPK the primary key of the vcms article status
	* @return the vcms article status, or <code>null</code> if a vcms article status with the primary key could not be found
	*/
	public static VcmsArticleStatus fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK) {
		return getPersistence().fetchByPrimaryKey(vcmsArticleStatusPK);
	}

	public static java.util.Map<java.io.Serializable, VcmsArticleStatus> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms article statuses.
	*
	* @return the vcms article statuses
	*/
	public static List<VcmsArticleStatus> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms article statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @return the range of vcms article statuses
	*/
	public static List<VcmsArticleStatus> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms article statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms article statuses
	*/
	public static List<VcmsArticleStatus> findAll(int start, int end,
		OrderByComparator<VcmsArticleStatus> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms article statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article statuses
	* @param end the upper bound of the range of vcms article statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms article statuses
	*/
	public static List<VcmsArticleStatus> findAll(int start, int end,
		OrderByComparator<VcmsArticleStatus> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms article statuses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms article statuses.
	*
	* @return the number of vcms article statuses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VcmsArticleStatusPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsArticleStatusPersistence, VcmsArticleStatusPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsArticleStatusPersistence.class);
}