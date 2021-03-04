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

import vn.gov.hoabinh.model.VcmsDiscussion;

import java.util.List;

/**
 * The persistence utility for the vcms discussion service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsDiscussionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsDiscussionPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsDiscussionPersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsDiscussionUtil {
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
	public static void clearCache(VcmsDiscussion vcmsDiscussion) {
		getPersistence().clearCache(vcmsDiscussion);
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
	public static List<VcmsDiscussion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsDiscussion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsDiscussion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsDiscussion update(VcmsDiscussion vcmsDiscussion) {
		return getPersistence().update(vcmsDiscussion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsDiscussion update(VcmsDiscussion vcmsDiscussion,
		ServiceContext serviceContext) {
		return getPersistence().update(vcmsDiscussion, serviceContext);
	}

	/**
	* Returns all the vcms discussions where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByP_L(long groupId,
		java.lang.String language) {
		return getPersistence().findByP_L(groupId, language);
	}

	/**
	* Returns a range of all the vcms discussions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @return the range of matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByP_L(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByP_L(groupId, language, start, end);
	}

	/**
	* Returns an ordered range of all the vcms discussions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence()
				   .findByP_L(groupId, language, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms discussions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion findByP_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence()
				   .findByP_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion fetchByP_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion findByP_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence()
				   .findByP_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion fetchByP_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the vcms discussions before and after the current vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param discussionId the primary key of the current vcms discussion
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms discussion
	* @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	*/
	public static VcmsDiscussion[] findByP_L_PrevAndNext(
		java.lang.String discussionId, long groupId, java.lang.String language,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence()
				   .findByP_L_PrevAndNext(discussionId, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the vcms discussions where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByP_L(long groupId, java.lang.String language) {
		getPersistence().removeByP_L(groupId, language);
	}

	/**
	* Returns the number of vcms discussions where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching vcms discussions
	*/
	public static int countByP_L(long groupId, java.lang.String language) {
		return getPersistence().countByP_L(groupId, language);
	}

	/**
	* Returns all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByP_L_A(long groupId,
		java.lang.String language, boolean approved) {
		return getPersistence().findByP_L_A(groupId, language, approved);
	}

	/**
	* Returns a range of all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @return the range of matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByP_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end) {
		return getPersistence()
				   .findByP_L_A(groupId, language, approved, start, end);
	}

	/**
	* Returns an ordered range of all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByP_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence()
				   .findByP_L_A(groupId, language, approved, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByP_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByP_L_A(groupId, language, approved, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms discussion in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion findByP_L_A_First(long groupId,
		java.lang.String language, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence()
				   .findByP_L_A_First(groupId, language, approved,
			orderByComparator);
	}

	/**
	* Returns the first vcms discussion in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion fetchByP_L_A_First(long groupId,
		java.lang.String language, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_A_First(groupId, language, approved,
			orderByComparator);
	}

	/**
	* Returns the last vcms discussion in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion findByP_L_A_Last(long groupId,
		java.lang.String language, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence()
				   .findByP_L_A_Last(groupId, language, approved,
			orderByComparator);
	}

	/**
	* Returns the last vcms discussion in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion fetchByP_L_A_Last(long groupId,
		java.lang.String language, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence()
				   .fetchByP_L_A_Last(groupId, language, approved,
			orderByComparator);
	}

	/**
	* Returns the vcms discussions before and after the current vcms discussion in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param discussionId the primary key of the current vcms discussion
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms discussion
	* @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	*/
	public static VcmsDiscussion[] findByP_L_A_PrevAndNext(
		java.lang.String discussionId, long groupId, java.lang.String language,
		boolean approved, OrderByComparator<VcmsDiscussion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence()
				   .findByP_L_A_PrevAndNext(discussionId, groupId, language,
			approved, orderByComparator);
	}

	/**
	* Removes all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	*/
	public static void removeByP_L_A(long groupId, java.lang.String language,
		boolean approved) {
		getPersistence().removeByP_L_A(groupId, language, approved);
	}

	/**
	* Returns the number of vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the number of matching vcms discussions
	*/
	public static int countByP_L_A(long groupId, java.lang.String language,
		boolean approved) {
		return getPersistence().countByP_L_A(groupId, language, approved);
	}

	/**
	* Returns all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByA_P_L_A(
		java.lang.String articleId, long groupId, java.lang.String language,
		boolean approved) {
		return getPersistence()
				   .findByA_P_L_A(articleId, groupId, language, approved);
	}

	/**
	* Returns a range of all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @return the range of matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByA_P_L_A(
		java.lang.String articleId, long groupId, java.lang.String language,
		boolean approved, int start, int end) {
		return getPersistence()
				   .findByA_P_L_A(articleId, groupId, language, approved,
			start, end);
	}

	/**
	* Returns an ordered range of all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByA_P_L_A(
		java.lang.String articleId, long groupId, java.lang.String language,
		boolean approved, int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence()
				   .findByA_P_L_A(articleId, groupId, language, approved,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByA_P_L_A(
		java.lang.String articleId, long groupId, java.lang.String language,
		boolean approved, int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByA_P_L_A(articleId, groupId, language, approved,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms discussion in the ordered set where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion findByA_P_L_A_First(
		java.lang.String articleId, long groupId, java.lang.String language,
		boolean approved, OrderByComparator<VcmsDiscussion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence()
				   .findByA_P_L_A_First(articleId, groupId, language, approved,
			orderByComparator);
	}

	/**
	* Returns the first vcms discussion in the ordered set where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion fetchByA_P_L_A_First(
		java.lang.String articleId, long groupId, java.lang.String language,
		boolean approved, OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence()
				   .fetchByA_P_L_A_First(articleId, groupId, language,
			approved, orderByComparator);
	}

	/**
	* Returns the last vcms discussion in the ordered set where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion findByA_P_L_A_Last(
		java.lang.String articleId, long groupId, java.lang.String language,
		boolean approved, OrderByComparator<VcmsDiscussion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence()
				   .findByA_P_L_A_Last(articleId, groupId, language, approved,
			orderByComparator);
	}

	/**
	* Returns the last vcms discussion in the ordered set where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion fetchByA_P_L_A_Last(
		java.lang.String articleId, long groupId, java.lang.String language,
		boolean approved, OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence()
				   .fetchByA_P_L_A_Last(articleId, groupId, language, approved,
			orderByComparator);
	}

	/**
	* Returns the vcms discussions before and after the current vcms discussion in the ordered set where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param discussionId the primary key of the current vcms discussion
	* @param articleId the article ID
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms discussion
	* @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	*/
	public static VcmsDiscussion[] findByA_P_L_A_PrevAndNext(
		java.lang.String discussionId, java.lang.String articleId,
		long groupId, java.lang.String language, boolean approved,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence()
				   .findByA_P_L_A_PrevAndNext(discussionId, articleId, groupId,
			language, approved, orderByComparator);
	}

	/**
	* Removes all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63; from the database.
	*
	* @param articleId the article ID
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	*/
	public static void removeByA_P_L_A(java.lang.String articleId,
		long groupId, java.lang.String language, boolean approved) {
		getPersistence().removeByA_P_L_A(articleId, groupId, language, approved);
	}

	/**
	* Returns the number of vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the number of matching vcms discussions
	*/
	public static int countByA_P_L_A(java.lang.String articleId, long groupId,
		java.lang.String language, boolean approved) {
		return getPersistence()
				   .countByA_P_L_A(articleId, groupId, language, approved);
	}

	/**
	* Returns all the vcms discussions where articleId = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param approved the approved
	* @return the matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByA_A(java.lang.String articleId,
		boolean approved) {
		return getPersistence().findByA_A(articleId, approved);
	}

	/**
	* Returns a range of all the vcms discussions where articleId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param approved the approved
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @return the range of matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByA_A(java.lang.String articleId,
		boolean approved, int start, int end) {
		return getPersistence().findByA_A(articleId, approved, start, end);
	}

	/**
	* Returns an ordered range of all the vcms discussions where articleId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param approved the approved
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByA_A(java.lang.String articleId,
		boolean approved, int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence()
				   .findByA_A(articleId, approved, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms discussions where articleId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param approved the approved
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByA_A(java.lang.String articleId,
		boolean approved, int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByA_A(articleId, approved, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion findByA_A_First(java.lang.String articleId,
		boolean approved, OrderByComparator<VcmsDiscussion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence()
				   .findByA_A_First(articleId, approved, orderByComparator);
	}

	/**
	* Returns the first vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion fetchByA_A_First(java.lang.String articleId,
		boolean approved, OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence()
				   .fetchByA_A_First(articleId, approved, orderByComparator);
	}

	/**
	* Returns the last vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion findByA_A_Last(java.lang.String articleId,
		boolean approved, OrderByComparator<VcmsDiscussion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence()
				   .findByA_A_Last(articleId, approved, orderByComparator);
	}

	/**
	* Returns the last vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion fetchByA_A_Last(java.lang.String articleId,
		boolean approved, OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence()
				   .fetchByA_A_Last(articleId, approved, orderByComparator);
	}

	/**
	* Returns the vcms discussions before and after the current vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	*
	* @param discussionId the primary key of the current vcms discussion
	* @param articleId the article ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms discussion
	* @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	*/
	public static VcmsDiscussion[] findByA_A_PrevAndNext(
		java.lang.String discussionId, java.lang.String articleId,
		boolean approved, OrderByComparator<VcmsDiscussion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence()
				   .findByA_A_PrevAndNext(discussionId, articleId, approved,
			orderByComparator);
	}

	/**
	* Removes all the vcms discussions where articleId = &#63; and approved = &#63; from the database.
	*
	* @param articleId the article ID
	* @param approved the approved
	*/
	public static void removeByA_A(java.lang.String articleId, boolean approved) {
		getPersistence().removeByA_A(articleId, approved);
	}

	/**
	* Returns the number of vcms discussions where articleId = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param approved the approved
	* @return the number of matching vcms discussions
	*/
	public static int countByA_A(java.lang.String articleId, boolean approved) {
		return getPersistence().countByA_A(articleId, approved);
	}

	/**
	* Returns all the vcms discussions where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByArticle(java.lang.String articleId) {
		return getPersistence().findByArticle(articleId);
	}

	/**
	* Returns a range of all the vcms discussions where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @return the range of matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByArticle(
		java.lang.String articleId, int start, int end) {
		return getPersistence().findByArticle(articleId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms discussions where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms discussions where articleId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param articleId the article ID
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms discussions
	*/
	public static List<VcmsDiscussion> findByArticle(
		java.lang.String articleId, int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByArticle(articleId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms discussion in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion findByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence().findByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the first vcms discussion in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion fetchByArticle_First(
		java.lang.String articleId,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence()
				   .fetchByArticle_First(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms discussion in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion findByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence().findByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the last vcms discussion in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public static VcmsDiscussion fetchByArticle_Last(
		java.lang.String articleId,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence().fetchByArticle_Last(articleId, orderByComparator);
	}

	/**
	* Returns the vcms discussions before and after the current vcms discussion in the ordered set where articleId = &#63;.
	*
	* @param discussionId the primary key of the current vcms discussion
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms discussion
	* @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	*/
	public static VcmsDiscussion[] findByArticle_PrevAndNext(
		java.lang.String discussionId, java.lang.String articleId,
		OrderByComparator<VcmsDiscussion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence()
				   .findByArticle_PrevAndNext(discussionId, articleId,
			orderByComparator);
	}

	/**
	* Removes all the vcms discussions where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public static void removeByArticle(java.lang.String articleId) {
		getPersistence().removeByArticle(articleId);
	}

	/**
	* Returns the number of vcms discussions where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms discussions
	*/
	public static int countByArticle(java.lang.String articleId) {
		return getPersistence().countByArticle(articleId);
	}

	/**
	* Caches the vcms discussion in the entity cache if it is enabled.
	*
	* @param vcmsDiscussion the vcms discussion
	*/
	public static void cacheResult(VcmsDiscussion vcmsDiscussion) {
		getPersistence().cacheResult(vcmsDiscussion);
	}

	/**
	* Caches the vcms discussions in the entity cache if it is enabled.
	*
	* @param vcmsDiscussions the vcms discussions
	*/
	public static void cacheResult(List<VcmsDiscussion> vcmsDiscussions) {
		getPersistence().cacheResult(vcmsDiscussions);
	}

	/**
	* Creates a new vcms discussion with the primary key. Does not add the vcms discussion to the database.
	*
	* @param discussionId the primary key for the new vcms discussion
	* @return the new vcms discussion
	*/
	public static VcmsDiscussion create(java.lang.String discussionId) {
		return getPersistence().create(discussionId);
	}

	/**
	* Removes the vcms discussion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param discussionId the primary key of the vcms discussion
	* @return the vcms discussion that was removed
	* @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	*/
	public static VcmsDiscussion remove(java.lang.String discussionId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence().remove(discussionId);
	}

	public static VcmsDiscussion updateImpl(VcmsDiscussion vcmsDiscussion) {
		return getPersistence().updateImpl(vcmsDiscussion);
	}

	/**
	* Returns the vcms discussion with the primary key or throws a {@link NoSuchVcmsDiscussionException} if it could not be found.
	*
	* @param discussionId the primary key of the vcms discussion
	* @return the vcms discussion
	* @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	*/
	public static VcmsDiscussion findByPrimaryKey(java.lang.String discussionId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException {
		return getPersistence().findByPrimaryKey(discussionId);
	}

	/**
	* Returns the vcms discussion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param discussionId the primary key of the vcms discussion
	* @return the vcms discussion, or <code>null</code> if a vcms discussion with the primary key could not be found
	*/
	public static VcmsDiscussion fetchByPrimaryKey(
		java.lang.String discussionId) {
		return getPersistence().fetchByPrimaryKey(discussionId);
	}

	public static java.util.Map<java.io.Serializable, VcmsDiscussion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms discussions.
	*
	* @return the vcms discussions
	*/
	public static List<VcmsDiscussion> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms discussions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @return the range of vcms discussions
	*/
	public static List<VcmsDiscussion> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms discussions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms discussions
	*/
	public static List<VcmsDiscussion> findAll(int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms discussions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms discussions
	*/
	public static List<VcmsDiscussion> findAll(int start, int end,
		OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms discussions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms discussions.
	*
	* @return the number of vcms discussions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VcmsDiscussionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsDiscussionPersistence, VcmsDiscussionPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsDiscussionPersistence.class);
}