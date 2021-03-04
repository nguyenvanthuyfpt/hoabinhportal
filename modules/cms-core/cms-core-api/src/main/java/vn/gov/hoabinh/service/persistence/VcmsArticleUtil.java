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

import vn.gov.hoabinh.model.VcmsArticle;

import java.util.List;

/**
 * The persistence utility for the vcms article service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsArticlePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticlePersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsArticlePersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsArticleUtil {
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
	public static void clearCache(VcmsArticle vcmsArticle) {
		getPersistence().clearCache(vcmsArticle);
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
	public static List<VcmsArticle> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsArticle> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsArticle> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsArticle update(VcmsArticle vcmsArticle) {
		return getPersistence().update(vcmsArticle);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsArticle update(VcmsArticle vcmsArticle,
		ServiceContext serviceContext) {
		return getPersistence().update(vcmsArticle, serviceContext);
	}

	/**
	* Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @return the matching vcms articles
	*/
	public static List<VcmsArticle> findByL_S(long groupId,
		java.lang.String language, long status) {
		return getPersistence().findByL_S(groupId, language, status);
	}

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public static List<VcmsArticle> findByL_S(long groupId,
		java.lang.String language, long status, int start, int end) {
		return getPersistence().findByL_S(groupId, language, status, start, end);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByL_S(long groupId,
		java.lang.String language, long status, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .findByL_S(groupId, language, status, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByL_S(long groupId,
		java.lang.String language, long status, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByL_S(groupId, language, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByL_S_First(long groupId,
		java.lang.String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByL_S_First(groupId, language, status, orderByComparator);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByL_S_First(long groupId,
		java.lang.String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByL_S_First(groupId, language, status,
			orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByL_S_Last(long groupId,
		java.lang.String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByL_S_Last(groupId, language, status, orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByL_S_Last(long groupId,
		java.lang.String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByL_S_Last(groupId, language, status, orderByComparator);
	}

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public static VcmsArticle[] findByL_S_PrevAndNext(
		java.lang.String articleId, long groupId, java.lang.String language,
		long status, OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByL_S_PrevAndNext(articleId, groupId, language, status,
			orderByComparator);
	}

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	*/
	public static void removeByL_S(long groupId, java.lang.String language,
		long status) {
		getPersistence().removeByL_S(groupId, language, status);
	}

	/**
	* Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @return the number of matching vcms articles
	*/
	public static int countByL_S(long groupId, java.lang.String language,
		long status) {
		return getPersistence().countByL_S(groupId, language, status);
	}

	/**
	* Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @return the matching vcms articles
	*/
	public static List<VcmsArticle> findByG_L_S_C(long groupId,
		java.lang.String language, long status, java.lang.String categoryId) {
		return getPersistence()
				   .findByG_L_S_C(groupId, language, status, categoryId);
	}

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public static List<VcmsArticle> findByG_L_S_C(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		int start, int end) {
		return getPersistence()
				   .findByG_L_S_C(groupId, language, status, categoryId, start,
			end);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByG_L_S_C(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		int start, int end, OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .findByG_L_S_C(groupId, language, status, categoryId, start,
			end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByG_L_S_C(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		int start, int end, OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_S_C(groupId, language, status, categoryId, start,
			end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByG_L_S_C_First(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByG_L_S_C_First(groupId, language, status, categoryId,
			orderByComparator);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByG_L_S_C_First(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_C_First(groupId, language, status, categoryId,
			orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByG_L_S_C_Last(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByG_L_S_C_Last(groupId, language, status, categoryId,
			orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByG_L_S_C_Last(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_C_Last(groupId, language, status, categoryId,
			orderByComparator);
	}

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public static VcmsArticle[] findByG_L_S_C_PrevAndNext(
		java.lang.String articleId, long groupId, java.lang.String language,
		long status, java.lang.String categoryId,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByG_L_S_C_PrevAndNext(articleId, groupId, language,
			status, categoryId, orderByComparator);
	}

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	*/
	public static void removeByG_L_S_C(long groupId, java.lang.String language,
		long status, java.lang.String categoryId) {
		getPersistence().removeByG_L_S_C(groupId, language, status, categoryId);
	}

	/**
	* Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @return the number of matching vcms articles
	*/
	public static int countByG_L_S_C(long groupId, java.lang.String language,
		long status, java.lang.String categoryId) {
		return getPersistence()
				   .countByG_L_S_C(groupId, language, status, categoryId);
	}

	/**
	* Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @return the matching vcms articles
	*/
	public static List<VcmsArticle> findByG_L_S_C_A(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId) {
		return getPersistence()
				   .findByG_L_S_C_A(groupId, language, status, categoryId,
			articleId);
	}

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public static List<VcmsArticle> findByG_L_S_C_A(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId, int start, int end) {
		return getPersistence()
				   .findByG_L_S_C_A(groupId, language, status, categoryId,
			articleId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByG_L_S_C_A(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .findByG_L_S_C_A(groupId, language, status, categoryId,
			articleId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByG_L_S_C_A(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_S_C_A(groupId, language, status, categoryId,
			articleId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByG_L_S_C_A_First(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByG_L_S_C_A_First(groupId, language, status,
			categoryId, articleId, orderByComparator);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByG_L_S_C_A_First(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_C_A_First(groupId, language, status,
			categoryId, articleId, orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByG_L_S_C_A_Last(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByG_L_S_C_A_Last(groupId, language, status, categoryId,
			articleId, orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByG_L_S_C_A_Last(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_C_A_Last(groupId, language, status,
			categoryId, articleId, orderByComparator);
	}

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	*/
	public static void removeByG_L_S_C_A(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId) {
		getPersistence()
			.removeByG_L_S_C_A(groupId, language, status, categoryId, articleId);
	}

	/**
	* Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63; and categoryId = &#63; and articleId &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param categoryId the category ID
	* @param articleId the article ID
	* @return the number of matching vcms articles
	*/
	public static int countByG_L_S_C_A(long groupId, java.lang.String language,
		long status, java.lang.String categoryId, java.lang.String articleId) {
		return getPersistence()
				   .countByG_L_S_C_A(groupId, language, status, categoryId,
			articleId);
	}

	/**
	* Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @return the matching vcms articles
	*/
	public static List<VcmsArticle> findByG_L_S_U(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser) {
		return getPersistence()
				   .findByG_L_S_U(groupId, language, status, createdByUser);
	}

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public static List<VcmsArticle> findByG_L_S_U(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser,
		int start, int end) {
		return getPersistence()
				   .findByG_L_S_U(groupId, language, status, createdByUser,
			start, end);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByG_L_S_U(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser,
		int start, int end, OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .findByG_L_S_U(groupId, language, status, createdByUser,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByG_L_S_U(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser,
		int start, int end, OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_S_U(groupId, language, status, createdByUser,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByG_L_S_U_First(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByG_L_S_U_First(groupId, language, status,
			createdByUser, orderByComparator);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByG_L_S_U_First(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_U_First(groupId, language, status,
			createdByUser, orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByG_L_S_U_Last(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByG_L_S_U_Last(groupId, language, status,
			createdByUser, orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByG_L_S_U_Last(long groupId,
		java.lang.String language, long status, java.lang.String createdByUser,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_S_U_Last(groupId, language, status,
			createdByUser, orderByComparator);
	}

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public static VcmsArticle[] findByG_L_S_U_PrevAndNext(
		java.lang.String articleId, long groupId, java.lang.String language,
		long status, java.lang.String createdByUser,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByG_L_S_U_PrevAndNext(articleId, groupId, language,
			status, createdByUser, orderByComparator);
	}

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	*/
	public static void removeByG_L_S_U(long groupId, java.lang.String language,
		long status, java.lang.String createdByUser) {
		getPersistence()
			.removeByG_L_S_U(groupId, language, status, createdByUser);
	}

	/**
	* Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63; and createdByUser = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param createdByUser the created by user
	* @return the number of matching vcms articles
	*/
	public static int countByG_L_S_U(long groupId, java.lang.String language,
		long status, java.lang.String createdByUser) {
		return getPersistence()
				   .countByG_L_S_U(groupId, language, status, createdByUser);
	}

	/**
	* Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @return the matching vcms articles
	*/
	public static List<VcmsArticle> findByL_S_S(long groupId,
		java.lang.String language, long status, boolean sticky) {
		return getPersistence().findByL_S_S(groupId, language, status, sticky);
	}

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public static List<VcmsArticle> findByL_S_S(long groupId,
		java.lang.String language, long status, boolean sticky, int start,
		int end) {
		return getPersistence()
				   .findByL_S_S(groupId, language, status, sticky, start, end);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByL_S_S(long groupId,
		java.lang.String language, long status, boolean sticky, int start,
		int end, OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .findByL_S_S(groupId, language, status, sticky, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByL_S_S(long groupId,
		java.lang.String language, long status, boolean sticky, int start,
		int end, OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByL_S_S(groupId, language, status, sticky, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByL_S_S_First(long groupId,
		java.lang.String language, long status, boolean sticky,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByL_S_S_First(groupId, language, status, sticky,
			orderByComparator);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByL_S_S_First(long groupId,
		java.lang.String language, long status, boolean sticky,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByL_S_S_First(groupId, language, status, sticky,
			orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByL_S_S_Last(long groupId,
		java.lang.String language, long status, boolean sticky,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByL_S_S_Last(groupId, language, status, sticky,
			orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByL_S_S_Last(long groupId,
		java.lang.String language, long status, boolean sticky,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByL_S_S_Last(groupId, language, status, sticky,
			orderByComparator);
	}

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public static VcmsArticle[] findByL_S_S_PrevAndNext(
		java.lang.String articleId, long groupId, java.lang.String language,
		long status, boolean sticky,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByL_S_S_PrevAndNext(articleId, groupId, language,
			status, sticky, orderByComparator);
	}

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	*/
	public static void removeByL_S_S(long groupId, java.lang.String language,
		long status, boolean sticky) {
		getPersistence().removeByL_S_S(groupId, language, status, sticky);
	}

	/**
	* Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63; and sticky = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param sticky the sticky
	* @return the number of matching vcms articles
	*/
	public static int countByL_S_S(long groupId, java.lang.String language,
		long status, boolean sticky) {
		return getPersistence().countByL_S_S(groupId, language, status, sticky);
	}

	/**
	* Returns all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @return the matching vcms articles
	*/
	public static List<VcmsArticle> findByU_L(long groupId,
		java.lang.String createdByUser, java.lang.String language) {
		return getPersistence().findByU_L(groupId, createdByUser, language);
	}

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public static List<VcmsArticle> findByU_L(long groupId,
		java.lang.String createdByUser, java.lang.String language, int start,
		int end) {
		return getPersistence()
				   .findByU_L(groupId, createdByUser, language, start, end);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByU_L(long groupId,
		java.lang.String createdByUser, java.lang.String language, int start,
		int end, OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .findByU_L(groupId, createdByUser, language, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByU_L(long groupId,
		java.lang.String createdByUser, java.lang.String language, int start,
		int end, OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByU_L(groupId, createdByUser, language, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByU_L_First(long groupId,
		java.lang.String createdByUser, java.lang.String language,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByU_L_First(groupId, createdByUser, language,
			orderByComparator);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByU_L_First(long groupId,
		java.lang.String createdByUser, java.lang.String language,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByU_L_First(groupId, createdByUser, language,
			orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByU_L_Last(long groupId,
		java.lang.String createdByUser, java.lang.String language,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByU_L_Last(groupId, createdByUser, language,
			orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByU_L_Last(long groupId,
		java.lang.String createdByUser, java.lang.String language,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByU_L_Last(groupId, createdByUser, language,
			orderByComparator);
	}

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public static VcmsArticle[] findByU_L_PrevAndNext(
		java.lang.String articleId, long groupId,
		java.lang.String createdByUser, java.lang.String language,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByU_L_PrevAndNext(articleId, groupId, createdByUser,
			language, orderByComparator);
	}

	/**
	* Removes all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	*/
	public static void removeByU_L(long groupId,
		java.lang.String createdByUser, java.lang.String language) {
		getPersistence().removeByU_L(groupId, createdByUser, language);
	}

	/**
	* Returns the number of vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @return the number of matching vcms articles
	*/
	public static int countByU_L(long groupId, java.lang.String createdByUser,
		java.lang.String language) {
		return getPersistence().countByU_L(groupId, createdByUser, language);
	}

	/**
	* Returns all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @return the matching vcms articles
	*/
	public static List<VcmsArticle> findByU_L_S(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status) {
		return getPersistence()
				   .findByU_L_S(groupId, createdByUser, language, status);
	}

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public static List<VcmsArticle> findByU_L_S(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		int start, int end) {
		return getPersistence()
				   .findByU_L_S(groupId, createdByUser, language, status,
			start, end);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByU_L_S(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		int start, int end, OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .findByU_L_S(groupId, createdByUser, language, status,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByU_L_S(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		int start, int end, OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByU_L_S(groupId, createdByUser, language, status,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByU_L_S_First(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByU_L_S_First(groupId, createdByUser, language, status,
			orderByComparator);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByU_L_S_First(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByU_L_S_First(groupId, createdByUser, language,
			status, orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByU_L_S_Last(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByU_L_S_Last(groupId, createdByUser, language, status,
			orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByU_L_S_Last(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByU_L_S_Last(groupId, createdByUser, language, status,
			orderByComparator);
	}

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public static VcmsArticle[] findByU_L_S_PrevAndNext(
		java.lang.String articleId, long groupId,
		java.lang.String createdByUser, java.lang.String language, long status,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByU_L_S_PrevAndNext(articleId, groupId, createdByUser,
			language, status, orderByComparator);
	}

	/**
	* Removes all the vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	*/
	public static void removeByU_L_S(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status) {
		getPersistence().removeByU_L_S(groupId, createdByUser, language, status);
	}

	/**
	* Returns the number of vcms articles where groupId = &#63; and createdByUser = &#63; and language = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param createdByUser the created by user
	* @param language the language
	* @param status the status
	* @return the number of matching vcms articles
	*/
	public static int countByU_L_S(long groupId,
		java.lang.String createdByUser, java.lang.String language, long status) {
		return getPersistence()
				   .countByU_L_S(groupId, createdByUser, language, status);
	}

	/**
	* Returns all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @return the matching vcms articles
	*/
	public static List<VcmsArticle> findByP_L_S_D(long groupId,
		java.lang.String language, long status, boolean discussible) {
		return getPersistence()
				   .findByP_L_S_D(groupId, language, status, discussible);
	}

	/**
	* Returns a range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public static List<VcmsArticle> findByP_L_S_D(long groupId,
		java.lang.String language, long status, boolean discussible, int start,
		int end) {
		return getPersistence()
				   .findByP_L_S_D(groupId, language, status, discussible,
			start, end);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByP_L_S_D(long groupId,
		java.lang.String language, long status, boolean discussible, int start,
		int end, OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .findByP_L_S_D(groupId, language, status, discussible,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByP_L_S_D(long groupId,
		java.lang.String language, long status, boolean discussible, int start,
		int end, OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_L_S_D(groupId, language, status, discussible,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByP_L_S_D_First(long groupId,
		java.lang.String language, long status, boolean discussible,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByP_L_S_D_First(groupId, language, status, discussible,
			orderByComparator);
	}

	/**
	* Returns the first vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByP_L_S_D_First(long groupId,
		java.lang.String language, long status, boolean discussible,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_S_D_First(groupId, language, status,
			discussible, orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByP_L_S_D_Last(long groupId,
		java.lang.String language, long status, boolean discussible,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByP_L_S_D_Last(groupId, language, status, discussible,
			orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByP_L_S_D_Last(long groupId,
		java.lang.String language, long status, boolean discussible,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_S_D_Last(groupId, language, status, discussible,
			orderByComparator);
	}

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public static VcmsArticle[] findByP_L_S_D_PrevAndNext(
		java.lang.String articleId, long groupId, java.lang.String language,
		long status, boolean discussible,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByP_L_S_D_PrevAndNext(articleId, groupId, language,
			status, discussible, orderByComparator);
	}

	/**
	* Removes all the vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	*/
	public static void removeByP_L_S_D(long groupId, java.lang.String language,
		long status, boolean discussible) {
		getPersistence().removeByP_L_S_D(groupId, language, status, discussible);
	}

	/**
	* Returns the number of vcms articles where groupId = &#63; and language = &#63; and status = &#63; and discussible = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param status the status
	* @param discussible the discussible
	* @return the number of matching vcms articles
	*/
	public static int countByP_L_S_D(long groupId, java.lang.String language,
		long status, boolean discussible) {
		return getPersistence()
				   .countByP_L_S_D(groupId, language, status, discussible);
	}

	/**
	* Returns all the vcms articles where status = &#63;.
	*
	* @param status the status
	* @return the matching vcms articles
	*/
	public static List<VcmsArticle> findByStatus(long status) {
		return getPersistence().findByStatus(status);
	}

	/**
	* Returns a range of all the vcms articles where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of matching vcms articles
	*/
	public static List<VcmsArticle> findByStatus(long status, int start, int end) {
		return getPersistence().findByStatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the vcms articles where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByStatus(long status, int start,
		int end, OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms articles where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms articles
	*/
	public static List<VcmsArticle> findByStatus(long status, int start,
		int end, OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms article in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByStatus_First(long status,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the first vcms article in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByStatus_First(long status,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article
	* @throws NoSuchVcmsArticleException if a matching vcms article could not be found
	*/
	public static VcmsArticle findByStatus_Last(long status,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last vcms article in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article, or <code>null</code> if a matching vcms article could not be found
	*/
	public static VcmsArticle fetchByStatus_Last(long status,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the vcms articles before and after the current vcms article in the ordered set where status = &#63;.
	*
	* @param articleId the primary key of the current vcms article
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public static VcmsArticle[] findByStatus_PrevAndNext(
		java.lang.String articleId, long status,
		OrderByComparator<VcmsArticle> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence()
				   .findByStatus_PrevAndNext(articleId, status,
			orderByComparator);
	}

	/**
	* Removes all the vcms articles where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeByStatus(long status) {
		getPersistence().removeByStatus(status);
	}

	/**
	* Returns the number of vcms articles where status = &#63;.
	*
	* @param status the status
	* @return the number of matching vcms articles
	*/
	public static int countByStatus(long status) {
		return getPersistence().countByStatus(status);
	}

	/**
	* Caches the vcms article in the entity cache if it is enabled.
	*
	* @param vcmsArticle the vcms article
	*/
	public static void cacheResult(VcmsArticle vcmsArticle) {
		getPersistence().cacheResult(vcmsArticle);
	}

	/**
	* Caches the vcms articles in the entity cache if it is enabled.
	*
	* @param vcmsArticles the vcms articles
	*/
	public static void cacheResult(List<VcmsArticle> vcmsArticles) {
		getPersistence().cacheResult(vcmsArticles);
	}

	/**
	* Creates a new vcms article with the primary key. Does not add the vcms article to the database.
	*
	* @param articleId the primary key for the new vcms article
	* @return the new vcms article
	*/
	public static VcmsArticle create(java.lang.String articleId) {
		return getPersistence().create(articleId);
	}

	/**
	* Removes the vcms article with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param articleId the primary key of the vcms article
	* @return the vcms article that was removed
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public static VcmsArticle remove(java.lang.String articleId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence().remove(articleId);
	}

	public static VcmsArticle updateImpl(VcmsArticle vcmsArticle) {
		return getPersistence().updateImpl(vcmsArticle);
	}

	/**
	* Returns the vcms article with the primary key or throws a {@link NoSuchVcmsArticleException} if it could not be found.
	*
	* @param articleId the primary key of the vcms article
	* @return the vcms article
	* @throws NoSuchVcmsArticleException if a vcms article with the primary key could not be found
	*/
	public static VcmsArticle findByPrimaryKey(java.lang.String articleId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsArticleException {
		return getPersistence().findByPrimaryKey(articleId);
	}

	/**
	* Returns the vcms article with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param articleId the primary key of the vcms article
	* @return the vcms article, or <code>null</code> if a vcms article with the primary key could not be found
	*/
	public static VcmsArticle fetchByPrimaryKey(java.lang.String articleId) {
		return getPersistence().fetchByPrimaryKey(articleId);
	}

	public static java.util.Map<java.io.Serializable, VcmsArticle> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms articles.
	*
	* @return the vcms articles
	*/
	public static List<VcmsArticle> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms articles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of vcms articles
	*/
	public static List<VcmsArticle> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms articles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms articles
	*/
	public static List<VcmsArticle> findAll(int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms articles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms articles
	*/
	public static List<VcmsArticle> findAll(int start, int end,
		OrderByComparator<VcmsArticle> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms articles from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms articles.
	*
	* @return the number of vcms articles
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VcmsArticlePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsArticlePersistence, VcmsArticlePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsArticlePersistence.class);
}