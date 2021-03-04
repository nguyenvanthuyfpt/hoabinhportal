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

import vn.gov.hoabinh.exception.NoSuchVcmsArticleStatusException;
import vn.gov.hoabinh.model.VcmsArticleStatus;

/**
 * The persistence interface for the vcms article status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsArticleStatusPersistenceImpl
 * @see VcmsArticleStatusUtil
 * @generated
 */
@ProviderType
public interface VcmsArticleStatusPersistence extends BasePersistence<VcmsArticleStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsArticleStatusUtil} to access the vcms article status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms article statuses where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the matching vcms article statuses
	*/
	public java.util.List<VcmsArticleStatus> findByArticle(
		java.lang.String articleId);

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
	public java.util.List<VcmsArticleStatus> findByArticle(
		java.lang.String articleId, int start, int end);

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
	public java.util.List<VcmsArticleStatus> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator);

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
	public java.util.List<VcmsArticleStatus> findByArticle(
		java.lang.String articleId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article status in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus findByArticle_First(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException;

	/**
	* Returns the first vcms article status in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus fetchByArticle_First(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator);

	/**
	* Returns the last vcms article status in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus findByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException;

	/**
	* Returns the last vcms article status in the ordered set where articleId = &#63;.
	*
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus fetchByArticle_Last(java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator);

	/**
	* Returns the vcms article statuses before and after the current vcms article status in the ordered set where articleId = &#63;.
	*
	* @param vcmsArticleStatusPK the primary key of the current vcms article status
	* @param articleId the article ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article status
	* @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	*/
	public VcmsArticleStatus[] findByArticle_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK,
		java.lang.String articleId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException;

	/**
	* Removes all the vcms article statuses where articleId = &#63; from the database.
	*
	* @param articleId the article ID
	*/
	public void removeByArticle(java.lang.String articleId);

	/**
	* Returns the number of vcms article statuses where articleId = &#63;.
	*
	* @param articleId the article ID
	* @return the number of matching vcms article statuses
	*/
	public int countByArticle(java.lang.String articleId);

	/**
	* Returns all the vcms article statuses where active = &#63;.
	*
	* @param active the active
	* @return the matching vcms article statuses
	*/
	public java.util.List<VcmsArticleStatus> findByActive(boolean active);

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
	public java.util.List<VcmsArticleStatus> findByActive(boolean active,
		int start, int end);

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
	public java.util.List<VcmsArticleStatus> findByActive(boolean active,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator);

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
	public java.util.List<VcmsArticleStatus> findByActive(boolean active,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article status in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus findByActive_First(boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException;

	/**
	* Returns the first vcms article status in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus fetchByActive_First(boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator);

	/**
	* Returns the last vcms article status in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus findByActive_Last(boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException;

	/**
	* Returns the last vcms article status in the ordered set where active = &#63;.
	*
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus fetchByActive_Last(boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator);

	/**
	* Returns the vcms article statuses before and after the current vcms article status in the ordered set where active = &#63;.
	*
	* @param vcmsArticleStatusPK the primary key of the current vcms article status
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article status
	* @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	*/
	public VcmsArticleStatus[] findByActive_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException;

	/**
	* Removes all the vcms article statuses where active = &#63; from the database.
	*
	* @param active the active
	*/
	public void removeByActive(boolean active);

	/**
	* Returns the number of vcms article statuses where active = &#63;.
	*
	* @param active the active
	* @return the number of matching vcms article statuses
	*/
	public int countByActive(boolean active);

	/**
	* Returns all the vcms article statuses where createdByUser = &#63;.
	*
	* @param createdByUser the created by user
	* @return the matching vcms article statuses
	*/
	public java.util.List<VcmsArticleStatus> findByUser(
		java.lang.String createdByUser);

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
	public java.util.List<VcmsArticleStatus> findByUser(
		java.lang.String createdByUser, int start, int end);

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
	public java.util.List<VcmsArticleStatus> findByUser(
		java.lang.String createdByUser, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator);

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
	public java.util.List<VcmsArticleStatus> findByUser(
		java.lang.String createdByUser, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article status in the ordered set where createdByUser = &#63;.
	*
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus findByUser_First(java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException;

	/**
	* Returns the first vcms article status in the ordered set where createdByUser = &#63;.
	*
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus fetchByUser_First(java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator);

	/**
	* Returns the last vcms article status in the ordered set where createdByUser = &#63;.
	*
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus findByUser_Last(java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException;

	/**
	* Returns the last vcms article status in the ordered set where createdByUser = &#63;.
	*
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus fetchByUser_Last(java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator);

	/**
	* Returns the vcms article statuses before and after the current vcms article status in the ordered set where createdByUser = &#63;.
	*
	* @param vcmsArticleStatusPK the primary key of the current vcms article status
	* @param createdByUser the created by user
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms article status
	* @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	*/
	public VcmsArticleStatus[] findByUser_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK,
		java.lang.String createdByUser,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException;

	/**
	* Removes all the vcms article statuses where createdByUser = &#63; from the database.
	*
	* @param createdByUser the created by user
	*/
	public void removeByUser(java.lang.String createdByUser);

	/**
	* Returns the number of vcms article statuses where createdByUser = &#63;.
	*
	* @param createdByUser the created by user
	* @return the number of matching vcms article statuses
	*/
	public int countByUser(java.lang.String createdByUser);

	/**
	* Returns all the vcms article statuses where createdByUser = &#63; and active = &#63;.
	*
	* @param createdByUser the created by user
	* @param active the active
	* @return the matching vcms article statuses
	*/
	public java.util.List<VcmsArticleStatus> findByU_A(
		java.lang.String createdByUser, boolean active);

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
	public java.util.List<VcmsArticleStatus> findByU_A(
		java.lang.String createdByUser, boolean active, int start, int end);

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
	public java.util.List<VcmsArticleStatus> findByU_A(
		java.lang.String createdByUser, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator);

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
	public java.util.List<VcmsArticleStatus> findByU_A(
		java.lang.String createdByUser, boolean active, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms article status in the ordered set where createdByUser = &#63; and active = &#63;.
	*
	* @param createdByUser the created by user
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus findByU_A_First(java.lang.String createdByUser,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException;

	/**
	* Returns the first vcms article status in the ordered set where createdByUser = &#63; and active = &#63;.
	*
	* @param createdByUser the created by user
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus fetchByU_A_First(java.lang.String createdByUser,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator);

	/**
	* Returns the last vcms article status in the ordered set where createdByUser = &#63; and active = &#63;.
	*
	* @param createdByUser the created by user
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status
	* @throws NoSuchVcmsArticleStatusException if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus findByU_A_Last(java.lang.String createdByUser,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException;

	/**
	* Returns the last vcms article status in the ordered set where createdByUser = &#63; and active = &#63;.
	*
	* @param createdByUser the created by user
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms article status, or <code>null</code> if a matching vcms article status could not be found
	*/
	public VcmsArticleStatus fetchByU_A_Last(java.lang.String createdByUser,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator);

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
	public VcmsArticleStatus[] findByU_A_PrevAndNext(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK,
		java.lang.String createdByUser, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator)
		throws NoSuchVcmsArticleStatusException;

	/**
	* Removes all the vcms article statuses where createdByUser = &#63; and active = &#63; from the database.
	*
	* @param createdByUser the created by user
	* @param active the active
	*/
	public void removeByU_A(java.lang.String createdByUser, boolean active);

	/**
	* Returns the number of vcms article statuses where createdByUser = &#63; and active = &#63;.
	*
	* @param createdByUser the created by user
	* @param active the active
	* @return the number of matching vcms article statuses
	*/
	public int countByU_A(java.lang.String createdByUser, boolean active);

	/**
	* Caches the vcms article status in the entity cache if it is enabled.
	*
	* @param vcmsArticleStatus the vcms article status
	*/
	public void cacheResult(VcmsArticleStatus vcmsArticleStatus);

	/**
	* Caches the vcms article statuses in the entity cache if it is enabled.
	*
	* @param vcmsArticleStatuses the vcms article statuses
	*/
	public void cacheResult(
		java.util.List<VcmsArticleStatus> vcmsArticleStatuses);

	/**
	* Creates a new vcms article status with the primary key. Does not add the vcms article status to the database.
	*
	* @param vcmsArticleStatusPK the primary key for the new vcms article status
	* @return the new vcms article status
	*/
	public VcmsArticleStatus create(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK);

	/**
	* Removes the vcms article status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleStatusPK the primary key of the vcms article status
	* @return the vcms article status that was removed
	* @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	*/
	public VcmsArticleStatus remove(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK)
		throws NoSuchVcmsArticleStatusException;

	public VcmsArticleStatus updateImpl(VcmsArticleStatus vcmsArticleStatus);

	/**
	* Returns the vcms article status with the primary key or throws a {@link NoSuchVcmsArticleStatusException} if it could not be found.
	*
	* @param vcmsArticleStatusPK the primary key of the vcms article status
	* @return the vcms article status
	* @throws NoSuchVcmsArticleStatusException if a vcms article status with the primary key could not be found
	*/
	public VcmsArticleStatus findByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK)
		throws NoSuchVcmsArticleStatusException;

	/**
	* Returns the vcms article status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param vcmsArticleStatusPK the primary key of the vcms article status
	* @return the vcms article status, or <code>null</code> if a vcms article status with the primary key could not be found
	*/
	public VcmsArticleStatus fetchByPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK vcmsArticleStatusPK);

	@Override
	public java.util.Map<java.io.Serializable, VcmsArticleStatus> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms article statuses.
	*
	* @return the vcms article statuses
	*/
	public java.util.List<VcmsArticleStatus> findAll();

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
	public java.util.List<VcmsArticleStatus> findAll(int start, int end);

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
	public java.util.List<VcmsArticleStatus> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator);

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
	public java.util.List<VcmsArticleStatus> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsArticleStatus> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms article statuses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms article statuses.
	*
	* @return the number of vcms article statuses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}