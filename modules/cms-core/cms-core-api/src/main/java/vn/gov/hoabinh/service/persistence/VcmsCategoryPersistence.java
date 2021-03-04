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

import vn.gov.hoabinh.exception.NoSuchVcmsCategoryException;
import vn.gov.hoabinh.model.VcmsCategory;

/**
 * The persistence interface for the vcms category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsCategoryPersistenceImpl
 * @see VcmsCategoryUtil
 * @generated
 */
@ProviderType
public interface VcmsCategoryPersistence extends BasePersistence<VcmsCategory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsCategoryUtil} to access the vcms category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms categories where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @return the matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByPortion(long groupId,
		java.lang.String language, java.lang.String portionId);

	/**
	* Returns a range of all the vcms categories where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByPortion(long groupId,
		java.lang.String language, java.lang.String portionId, int start,
		int end);

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByPortion(long groupId,
		java.lang.String language, java.lang.String portionId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByPortion(long groupId,
		java.lang.String language, java.lang.String portionId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public VcmsCategory findByPortion_First(long groupId,
		java.lang.String language, java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException;

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public VcmsCategory fetchByPortion_First(long groupId,
		java.lang.String language, java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public VcmsCategory findByPortion_Last(long groupId,
		java.lang.String language, java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException;

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public VcmsCategory fetchByPortion_Last(long groupId,
		java.lang.String language, java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* @param categoryId the primary key of the current vcms category
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms category
	* @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	*/
	public VcmsCategory[] findByPortion_PrevAndNext(
		java.lang.String categoryId, long groupId, java.lang.String language,
		java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException;

	/**
	* Removes all the vcms categories where groupId = &#63; and language = &#63; and portionId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	*/
	public void removeByPortion(long groupId, java.lang.String language,
		java.lang.String portionId);

	/**
	* Returns the number of vcms categories where groupId = &#63; and language = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param portionId the portion ID
	* @return the number of matching vcms categories
	*/
	public int countByPortion(long groupId, java.lang.String language,
		java.lang.String portionId);

	/**
	* Returns all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @return the matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId);

	/**
	* Returns a range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start, int end);

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public VcmsCategory findByG_L_P_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException;

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public VcmsCategory fetchByG_L_P_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public VcmsCategory findByG_L_P_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException;

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public VcmsCategory fetchByG_L_P_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param categoryId the primary key of the current vcms category
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms category
	* @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	*/
	public VcmsCategory[] findByG_L_P_PrevAndNext(java.lang.String categoryId,
		long groupId, java.lang.String language, java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException;

	/**
	* Removes all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	*/
	public void removeByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId);

	/**
	* Returns the number of vcms categories where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @return the number of matching vcms categories
	*/
	public int countByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId);

	/**
	* Returns all the vcms categories where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L(long groupId,
		java.lang.String language);

	/**
	* Returns a range of all the vcms categories where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L(long groupId,
		java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public VcmsCategory findByG_L_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException;

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public VcmsCategory fetchByG_L_First(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public VcmsCategory findByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException;

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public VcmsCategory fetchByG_L_Last(long groupId,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param categoryId the primary key of the current vcms category
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms category
	* @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	*/
	public VcmsCategory[] findByG_L_PrevAndNext(java.lang.String categoryId,
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException;

	/**
	* Removes all the vcms categories where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByG_L(long groupId, java.lang.String language);

	/**
	* Returns the number of vcms categories where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching vcms categories
	*/
	public int countByG_L(long groupId, java.lang.String language);

	/**
	* Returns all the vcms categories where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_C(java.lang.String categoryId);

	/**
	* Returns a range of all the vcms categories where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_C(
		java.lang.String categoryId, int start, int end);

	/**
	* Returns an ordered range of all the vcms categories where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_C(
		java.lang.String categoryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns an ordered range of all the vcms categories where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_C(
		java.lang.String categoryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms category in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public VcmsCategory findByG_L_C_First(java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException;

	/**
	* Returns the first vcms category in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public VcmsCategory fetchByG_L_C_First(java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns the last vcms category in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public VcmsCategory findByG_L_C_Last(java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException;

	/**
	* Returns the last vcms category in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public VcmsCategory fetchByG_L_C_Last(java.lang.String categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns all the vcms categories where categoryId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryIds the category IDs
	* @return the matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_C(
		java.lang.String[] categoryIds);

	/**
	* Returns a range of all the vcms categories where categoryId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryIds the category IDs
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_C(
		java.lang.String[] categoryIds, int start, int end);

	/**
	* Returns an ordered range of all the vcms categories where categoryId = any &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryIds the category IDs
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_C(
		java.lang.String[] categoryIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns an ordered range of all the vcms categories where categoryId = &#63;, optionally using the finder cache.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_C(
		java.lang.String[] categoryIds, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms categories where categoryId = &#63; from the database.
	*
	* @param categoryId the category ID
	*/
	public void removeByG_L_C(java.lang.String categoryId);

	/**
	* Returns the number of vcms categories where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the number of matching vcms categories
	*/
	public int countByG_L_C(java.lang.String categoryId);

	/**
	* Returns the number of vcms categories where categoryId = any &#63;.
	*
	* @param categoryIds the category IDs
	* @return the number of matching vcms categories
	*/
	public int countByG_L_C(java.lang.String[] categoryIds);

	/**
	* Returns all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @return the matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_P_P(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId);

	/**
	* Returns a range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_P_P(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId, int start, int end);

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_P_P(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns an ordered range of all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms categories
	*/
	public java.util.List<VcmsCategory> findByG_L_P_P(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public VcmsCategory findByG_L_P_P_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException;

	/**
	* Returns the first vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public VcmsCategory fetchByG_L_P_P_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category
	* @throws NoSuchVcmsCategoryException if a matching vcms category could not be found
	*/
	public VcmsCategory findByG_L_P_P_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException;

	/**
	* Returns the last vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms category, or <code>null</code> if a matching vcms category could not be found
	*/
	public VcmsCategory fetchByG_L_P_P_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns the vcms categories before and after the current vcms category in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* @param categoryId the primary key of the current vcms category
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms category
	* @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	*/
	public VcmsCategory[] findByG_L_P_P_PrevAndNext(
		java.lang.String categoryId, long groupId, java.lang.String language,
		java.lang.String parentId, java.lang.String portionId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator)
		throws NoSuchVcmsCategoryException;

	/**
	* Removes all the vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	*/
	public void removeByG_L_P_P(long groupId, java.lang.String language,
		java.lang.String parentId, java.lang.String portionId);

	/**
	* Returns the number of vcms categories where groupId = &#63; and language = &#63; and parentId = &#63; and portionId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param portionId the portion ID
	* @return the number of matching vcms categories
	*/
	public int countByG_L_P_P(long groupId, java.lang.String language,
		java.lang.String parentId, java.lang.String portionId);

	/**
	* Caches the vcms category in the entity cache if it is enabled.
	*
	* @param vcmsCategory the vcms category
	*/
	public void cacheResult(VcmsCategory vcmsCategory);

	/**
	* Caches the vcms categories in the entity cache if it is enabled.
	*
	* @param vcmsCategories the vcms categories
	*/
	public void cacheResult(java.util.List<VcmsCategory> vcmsCategories);

	/**
	* Creates a new vcms category with the primary key. Does not add the vcms category to the database.
	*
	* @param categoryId the primary key for the new vcms category
	* @return the new vcms category
	*/
	public VcmsCategory create(java.lang.String categoryId);

	/**
	* Removes the vcms category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryId the primary key of the vcms category
	* @return the vcms category that was removed
	* @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	*/
	public VcmsCategory remove(java.lang.String categoryId)
		throws NoSuchVcmsCategoryException;

	public VcmsCategory updateImpl(VcmsCategory vcmsCategory);

	/**
	* Returns the vcms category with the primary key or throws a {@link NoSuchVcmsCategoryException} if it could not be found.
	*
	* @param categoryId the primary key of the vcms category
	* @return the vcms category
	* @throws NoSuchVcmsCategoryException if a vcms category with the primary key could not be found
	*/
	public VcmsCategory findByPrimaryKey(java.lang.String categoryId)
		throws NoSuchVcmsCategoryException;

	/**
	* Returns the vcms category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param categoryId the primary key of the vcms category
	* @return the vcms category, or <code>null</code> if a vcms category with the primary key could not be found
	*/
	public VcmsCategory fetchByPrimaryKey(java.lang.String categoryId);

	@Override
	public java.util.Map<java.io.Serializable, VcmsCategory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms categories.
	*
	* @return the vcms categories
	*/
	public java.util.List<VcmsCategory> findAll();

	/**
	* Returns a range of all the vcms categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of vcms categories
	*/
	public java.util.List<VcmsCategory> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vcms categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms categories
	*/
	public java.util.List<VcmsCategory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator);

	/**
	* Returns an ordered range of all the vcms categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms categories
	*/
	public java.util.List<VcmsCategory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsCategory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms categories from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms categories.
	*
	* @return the number of vcms categories
	*/
	public int countAll();
}