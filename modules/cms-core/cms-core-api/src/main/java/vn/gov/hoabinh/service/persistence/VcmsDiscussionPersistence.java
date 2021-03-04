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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException;
import vn.gov.hoabinh.model.VcmsDiscussion;

/**
 * The persistence interface for the vcms discussion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsDiscussionPersistenceImpl
 * @see VcmsDiscussionUtil
 * @generated
 */
@ProviderType
public interface VcmsDiscussionPersistence extends BasePersistence<VcmsDiscussion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsDiscussionUtil} to access the vcms discussion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms discussions where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching vcms discussions
	*/
	public java.util.List<VcmsDiscussion> findByP_L(long groupId,
		java.lang.String language);

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
	public java.util.List<VcmsDiscussion> findByP_L(long groupId,
		java.lang.String language, int start, int end);

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
	public java.util.List<VcmsDiscussion> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

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
	public java.util.List<VcmsDiscussion> findByP_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public VcmsDiscussion findByP_L_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException;

	/**
	* Returns the first vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public VcmsDiscussion fetchByP_L_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

	/**
	* Returns the last vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public VcmsDiscussion findByP_L_Last(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException;

	/**
	* Returns the last vcms discussion in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public VcmsDiscussion fetchByP_L_Last(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

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
	public VcmsDiscussion[] findByP_L_PrevAndNext(
		java.lang.String discussionId, long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException;

	/**
	* Removes all the vcms discussions where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByP_L(long groupId, java.lang.String language);

	/**
	* Returns the number of vcms discussions where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching vcms discussions
	*/
	public int countByP_L(long groupId, java.lang.String language);

	/**
	* Returns all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the matching vcms discussions
	*/
	public java.util.List<VcmsDiscussion> findByP_L_A(long groupId,
		java.lang.String language, boolean approved);

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
	public java.util.List<VcmsDiscussion> findByP_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end);

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
	public java.util.List<VcmsDiscussion> findByP_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

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
	public java.util.List<VcmsDiscussion> findByP_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache);

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
	public VcmsDiscussion findByP_L_A_First(long groupId,
		java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException;

	/**
	* Returns the first vcms discussion in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public VcmsDiscussion fetchByP_L_A_First(long groupId,
		java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

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
	public VcmsDiscussion findByP_L_A_Last(long groupId,
		java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException;

	/**
	* Returns the last vcms discussion in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public VcmsDiscussion fetchByP_L_A_Last(long groupId,
		java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

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
	public VcmsDiscussion[] findByP_L_A_PrevAndNext(
		java.lang.String discussionId, long groupId, java.lang.String language,
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException;

	/**
	* Removes all the vcms discussions where groupId = &#63; and language = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	*/
	public void removeByP_L_A(long groupId, java.lang.String language,
		boolean approved);

	/**
	* Returns the number of vcms discussions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the number of matching vcms discussions
	*/
	public int countByP_L_A(long groupId, java.lang.String language,
		boolean approved);

	/**
	* Returns all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the matching vcms discussions
	*/
	public java.util.List<VcmsDiscussion> findByA_P_L_A(
		java.lang.String articleId, long groupId, java.lang.String language,
		boolean approved);

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
	public java.util.List<VcmsDiscussion> findByA_P_L_A(
		java.lang.String articleId, long groupId, java.lang.String language,
		boolean approved, int start, int end);

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
	public java.util.List<VcmsDiscussion> findByA_P_L_A(
		java.lang.String articleId, long groupId, java.lang.String language,
		boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

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
	public java.util.List<VcmsDiscussion> findByA_P_L_A(
		java.lang.String articleId, long groupId, java.lang.String language,
		boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache);

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
	public VcmsDiscussion findByA_P_L_A_First(java.lang.String articleId,
		long groupId, java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException;

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
	public VcmsDiscussion fetchByA_P_L_A_First(java.lang.String articleId,
		long groupId, java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

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
	public VcmsDiscussion findByA_P_L_A_Last(java.lang.String articleId,
		long groupId, java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException;

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
	public VcmsDiscussion fetchByA_P_L_A_Last(java.lang.String articleId,
		long groupId, java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

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
	public VcmsDiscussion[] findByA_P_L_A_PrevAndNext(
		java.lang.String discussionId, java.lang.String articleId,
		long groupId, java.lang.String language, boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException;

	/**
	* Removes all the vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63; from the database.
	*
	* @param articleId the article ID
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	*/
	public void removeByA_P_L_A(java.lang.String articleId, long groupId,
		java.lang.String language, boolean approved);

	/**
	* Returns the number of vcms discussions where articleId = &#63; and groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the number of matching vcms discussions
	*/
	public int countByA_P_L_A(java.lang.String articleId, long groupId,
		java.lang.String language, boolean approved);

	/**
	* Returns all the vcms discussions where articleId = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param approved the approved
	* @return the matching vcms discussions
	*/
	public java.util.List<VcmsDiscussion> findByA_A(
		java.lang.String articleId, boolean approved);

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
	public java.util.List<VcmsDiscussion> findByA_A(
		java.lang.String articleId, boolean approved, int start, int end);

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
	public java.util.List<VcmsDiscussion> findByA_A(
		java.lang.String articleId, boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

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
	public java.util.List<VcmsDiscussion> findByA_A(
		java.lang.String articleId, boolean approved, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public VcmsDiscussion findByA_A_First(java.lang.String articleId,
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException;

	/**
	* Returns the first vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public VcmsDiscussion fetchByA_A_First(java.lang.String articleId,
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

	/**
	* Returns the last vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public VcmsDiscussion findByA_A_Last(java.lang.String articleId,
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException;

	/**
	* Returns the last vcms discussion in the ordered set where articleId = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public VcmsDiscussion fetchByA_A_Last(java.lang.String articleId,
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

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
	public VcmsDiscussion[] findByA_A_PrevAndNext(
		java.lang.String discussionId, java.lang.String articleId,
		boolean approved,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException;

	/**
	* Removes all the vcms discussions where articleId = &#63; and approved = &#63; from the database.
	*
	* @param articleId the article ID
	* @param approved the approved
	*/
	public void removeByA_A(java.lang.String articleId, boolean approved);

	/**
	* Returns the number of vcms discussions where articleId = &#63; and approved = &#63;.
	*
	* @param articleId the article ID
	* @param approved the approved
	* @return the number of matching vcms discussions
	*/
	public int countByA_A(java.lang.String articleId, boolean approved);

	/**
	* Returns all the vcms discussions where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms discussions
	*/
	public java.util.List<VcmsDiscussion> findByArticle(
		java.lang.String articleId);

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
	public java.util.List<VcmsDiscussion> findByArticle(
		java.lang.String articleId, int start, int end);

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
	public java.util.List<VcmsDiscussion> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

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
	public java.util.List<VcmsDiscussion> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms discussion in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public VcmsDiscussion findByArticle_First(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException;

	/**
	* Returns the first vcms discussion in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public VcmsDiscussion fetchByArticle_First(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

	/**
	* Returns the last vcms discussion in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion
	* @throws NoSuchVcmsDiscussionException if a matching vcms discussion could not be found
	*/
	public VcmsDiscussion findByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException;

	/**
	* Returns the last vcms discussion in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms discussion, or <code>null</code> if a matching vcms discussion could not be found
	*/
	public VcmsDiscussion fetchByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

	/**
	* Returns the vcms discussions before and after the current vcms discussion in the ordered set where articleId = &#63;.
	*
	* @param discussionId the primary key of the current vcms discussion
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms discussion
	* @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	*/
	public VcmsDiscussion[] findByArticle_PrevAndNext(
		java.lang.String discussionId, java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator)
		throws NoSuchVcmsDiscussionException;

	/**
	* Removes all the vcms discussions where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public void removeByArticle(java.lang.String articleId);

	/**
	* Returns the number of vcms discussions where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms discussions
	*/
	public int countByArticle(java.lang.String articleId);

	/**
	* Caches the vcms discussion in the entity cache if it is enabled.
	*
	* @param vcmsDiscussion the vcms discussion
	*/
	public void cacheResult(VcmsDiscussion vcmsDiscussion);

	/**
	* Caches the vcms discussions in the entity cache if it is enabled.
	*
	* @param vcmsDiscussions the vcms discussions
	*/
	public void cacheResult(java.util.List<VcmsDiscussion> vcmsDiscussions);

	/**
	* Creates a new vcms discussion with the primary key. Does not add the vcms discussion to the database.
	*
	* @param discussionId the primary key for the new vcms discussion
	* @return the new vcms discussion
	*/
	public VcmsDiscussion create(java.lang.String discussionId);

	/**
	* Removes the vcms discussion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param discussionId the primary key of the vcms discussion
	* @return the vcms discussion that was removed
	* @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	*/
	public VcmsDiscussion remove(java.lang.String discussionId)
		throws NoSuchVcmsDiscussionException;

	public VcmsDiscussion updateImpl(VcmsDiscussion vcmsDiscussion);

	/**
	* Returns the vcms discussion with the primary key or throws a {@link NoSuchVcmsDiscussionException} if it could not be found.
	*
	* @param discussionId the primary key of the vcms discussion
	* @return the vcms discussion
	* @throws NoSuchVcmsDiscussionException if a vcms discussion with the primary key could not be found
	*/
	public VcmsDiscussion findByPrimaryKey(java.lang.String discussionId)
		throws NoSuchVcmsDiscussionException;

	/**
	* Returns the vcms discussion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param discussionId the primary key of the vcms discussion
	* @return the vcms discussion, or <code>null</code> if a vcms discussion with the primary key could not be found
	*/
	public VcmsDiscussion fetchByPrimaryKey(java.lang.String discussionId);

	@Override
	public java.util.Map<java.io.Serializable, VcmsDiscussion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms discussions.
	*
	* @return the vcms discussions
	*/
	public java.util.List<VcmsDiscussion> findAll();

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
	public java.util.List<VcmsDiscussion> findAll(int start, int end);

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
	public java.util.List<VcmsDiscussion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator);

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
	public java.util.List<VcmsDiscussion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsDiscussion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms discussions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms discussions.
	*
	* @return the number of vcms discussions
	*/
	public int countAll();
}