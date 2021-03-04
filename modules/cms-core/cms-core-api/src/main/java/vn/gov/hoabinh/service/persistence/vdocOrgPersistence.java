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

import vn.gov.hoabinh.exception.NoSuchvdocOrgException;
import vn.gov.hoabinh.model.vdocOrg;

/**
 * The persistence interface for the vdoc org service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.vdocOrgPersistenceImpl
 * @see vdocOrgUtil
 * @generated
 */
@ProviderType
public interface vdocOrgPersistence extends BasePersistence<vdocOrg> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link vdocOrgUtil} to access the vdoc org persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vdoc orgs where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @return the matching vdoc orgs
	*/
	public java.util.List<vdocOrg> findByParentId(java.lang.String parentId);

	/**
	* Returns a range of all the vdoc orgs where parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parentId the parent ID
	* @param start the lower bound of the range of vdoc orgs
	* @param end the upper bound of the range of vdoc orgs (not inclusive)
	* @return the range of matching vdoc orgs
	*/
	public java.util.List<vdocOrg> findByParentId(java.lang.String parentId,
		int start, int end);

	/**
	* Returns an ordered range of all the vdoc orgs where parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parentId the parent ID
	* @param start the lower bound of the range of vdoc orgs
	* @param end the upper bound of the range of vdoc orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc orgs
	*/
	public java.util.List<vdocOrg> findByParentId(java.lang.String parentId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc orgs where parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param parentId the parent ID
	* @param start the lower bound of the range of vdoc orgs
	* @param end the upper bound of the range of vdoc orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc orgs
	*/
	public java.util.List<vdocOrg> findByParentId(java.lang.String parentId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc org in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc org
	* @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	*/
	public vdocOrg findByParentId_First(java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException;

	/**
	* Returns the first vdoc org in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public vdocOrg fetchByParentId_First(java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator);

	/**
	* Returns the last vdoc org in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc org
	* @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	*/
	public vdocOrg findByParentId_Last(java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException;

	/**
	* Returns the last vdoc org in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public vdocOrg fetchByParentId_Last(java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator);

	/**
	* Returns the vdoc orgs before and after the current vdoc org in the ordered set where parentId = &#63;.
	*
	* @param orgId the primary key of the current vdoc org
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc org
	* @throws NoSuchvdocOrgException if a vdoc org with the primary key could not be found
	*/
	public vdocOrg[] findByParentId_PrevAndNext(java.lang.String orgId,
		java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException;

	/**
	* Removes all the vdoc orgs where parentId = &#63; from the database.
	*
	* @param parentId the parent ID
	*/
	public void removeByParentId(java.lang.String parentId);

	/**
	* Returns the number of vdoc orgs where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @return the number of matching vdoc orgs
	*/
	public int countByParentId(java.lang.String parentId);

	/**
	* Returns all the vdoc orgs where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching vdoc orgs
	*/
	public java.util.List<vdocOrg> findByG_L(long groupId,
		java.lang.String language);

	/**
	* Returns a range of all the vdoc orgs where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vdoc orgs
	* @param end the upper bound of the range of vdoc orgs (not inclusive)
	* @return the range of matching vdoc orgs
	*/
	public java.util.List<vdocOrg> findByG_L(long groupId,
		java.lang.String language, int start, int end);

	/**
	* Returns an ordered range of all the vdoc orgs where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vdoc orgs
	* @param end the upper bound of the range of vdoc orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc orgs
	*/
	public java.util.List<vdocOrg> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc orgs where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of vdoc orgs
	* @param end the upper bound of the range of vdoc orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc orgs
	*/
	public java.util.List<vdocOrg> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc org
	* @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	*/
	public vdocOrg findByG_L_First(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException;

	/**
	* Returns the first vdoc org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public vdocOrg fetchByG_L_First(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator);

	/**
	* Returns the last vdoc org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc org
	* @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	*/
	public vdocOrg findByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException;

	/**
	* Returns the last vdoc org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public vdocOrg fetchByG_L_Last(long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator);

	/**
	* Returns the vdoc orgs before and after the current vdoc org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param orgId the primary key of the current vdoc org
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc org
	* @throws NoSuchvdocOrgException if a vdoc org with the primary key could not be found
	*/
	public vdocOrg[] findByG_L_PrevAndNext(java.lang.String orgId,
		long groupId, java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException;

	/**
	* Removes all the vdoc orgs where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public void removeByG_L(long groupId, java.lang.String language);

	/**
	* Returns the number of vdoc orgs where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching vdoc orgs
	*/
	public int countByG_L(long groupId, java.lang.String language);

	/**
	* Returns all the vdoc orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @return the matching vdoc orgs
	*/
	public java.util.List<vdocOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId);

	/**
	* Returns a range of all the vdoc orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of vdoc orgs
	* @param end the upper bound of the range of vdoc orgs (not inclusive)
	* @return the range of matching vdoc orgs
	*/
	public java.util.List<vdocOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start, int end);

	/**
	* Returns an ordered range of all the vdoc orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of vdoc orgs
	* @param end the upper bound of the range of vdoc orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vdoc orgs
	*/
	public java.util.List<vdocOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of vdoc orgs
	* @param end the upper bound of the range of vdoc orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vdoc orgs
	*/
	public java.util.List<vdocOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vdoc org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc org
	* @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	*/
	public vdocOrg findByG_L_P_First(long groupId, java.lang.String language,
		java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException;

	/**
	* Returns the first vdoc org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public vdocOrg fetchByG_L_P_First(long groupId, java.lang.String language,
		java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator);

	/**
	* Returns the last vdoc org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc org
	* @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	*/
	public vdocOrg findByG_L_P_Last(long groupId, java.lang.String language,
		java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException;

	/**
	* Returns the last vdoc org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public vdocOrg fetchByG_L_P_Last(long groupId, java.lang.String language,
		java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator);

	/**
	* Returns the vdoc orgs before and after the current vdoc org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param orgId the primary key of the current vdoc org
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc org
	* @throws NoSuchvdocOrgException if a vdoc org with the primary key could not be found
	*/
	public vdocOrg[] findByG_L_P_PrevAndNext(java.lang.String orgId,
		long groupId, java.lang.String language, java.lang.String parentId,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator)
		throws NoSuchvdocOrgException;

	/**
	* Removes all the vdoc orgs where groupId = &#63; and language = &#63; and parentId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	*/
	public void removeByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId);

	/**
	* Returns the number of vdoc orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @return the number of matching vdoc orgs
	*/
	public int countByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId);

	/**
	* Returns the vdoc org where groupId = &#63; and code = &#63; or throws a {@link NoSuchvdocOrgException} if it could not be found.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the matching vdoc org
	* @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	*/
	public vdocOrg findByG_C(long groupId, java.lang.String code)
		throws NoSuchvdocOrgException;

	/**
	* Returns the vdoc org where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public vdocOrg fetchByG_C(long groupId, java.lang.String code);

	/**
	* Returns the vdoc org where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param code the code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public vdocOrg fetchByG_C(long groupId, java.lang.String code,
		boolean retrieveFromCache);

	/**
	* Removes the vdoc org where groupId = &#63; and code = &#63; from the database.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the vdoc org that was removed
	*/
	public vdocOrg removeByG_C(long groupId, java.lang.String code)
		throws NoSuchvdocOrgException;

	/**
	* Returns the number of vdoc orgs where groupId = &#63; and code = &#63;.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the number of matching vdoc orgs
	*/
	public int countByG_C(long groupId, java.lang.String code);

	/**
	* Caches the vdoc org in the entity cache if it is enabled.
	*
	* @param vdocOrg the vdoc org
	*/
	public void cacheResult(vdocOrg vdocOrg);

	/**
	* Caches the vdoc orgs in the entity cache if it is enabled.
	*
	* @param vdocOrgs the vdoc orgs
	*/
	public void cacheResult(java.util.List<vdocOrg> vdocOrgs);

	/**
	* Creates a new vdoc org with the primary key. Does not add the vdoc org to the database.
	*
	* @param orgId the primary key for the new vdoc org
	* @return the new vdoc org
	*/
	public vdocOrg create(java.lang.String orgId);

	/**
	* Removes the vdoc org with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgId the primary key of the vdoc org
	* @return the vdoc org that was removed
	* @throws NoSuchvdocOrgException if a vdoc org with the primary key could not be found
	*/
	public vdocOrg remove(java.lang.String orgId) throws NoSuchvdocOrgException;

	public vdocOrg updateImpl(vdocOrg vdocOrg);

	/**
	* Returns the vdoc org with the primary key or throws a {@link NoSuchvdocOrgException} if it could not be found.
	*
	* @param orgId the primary key of the vdoc org
	* @return the vdoc org
	* @throws NoSuchvdocOrgException if a vdoc org with the primary key could not be found
	*/
	public vdocOrg findByPrimaryKey(java.lang.String orgId)
		throws NoSuchvdocOrgException;

	/**
	* Returns the vdoc org with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orgId the primary key of the vdoc org
	* @return the vdoc org, or <code>null</code> if a vdoc org with the primary key could not be found
	*/
	public vdocOrg fetchByPrimaryKey(java.lang.String orgId);

	@Override
	public java.util.Map<java.io.Serializable, vdocOrg> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vdoc orgs.
	*
	* @return the vdoc orgs
	*/
	public java.util.List<vdocOrg> findAll();

	/**
	* Returns a range of all the vdoc orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc orgs
	* @param end the upper bound of the range of vdoc orgs (not inclusive)
	* @return the range of vdoc orgs
	*/
	public java.util.List<vdocOrg> findAll(int start, int end);

	/**
	* Returns an ordered range of all the vdoc orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc orgs
	* @param end the upper bound of the range of vdoc orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vdoc orgs
	*/
	public java.util.List<vdocOrg> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator);

	/**
	* Returns an ordered range of all the vdoc orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc orgs
	* @param end the upper bound of the range of vdoc orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vdoc orgs
	*/
	public java.util.List<vdocOrg> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<vdocOrg> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vdoc orgs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vdoc orgs.
	*
	* @return the number of vdoc orgs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}