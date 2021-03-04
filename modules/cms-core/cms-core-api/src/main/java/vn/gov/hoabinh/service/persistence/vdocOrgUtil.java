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

import vn.gov.hoabinh.model.vdocOrg;

import java.util.List;

/**
 * The persistence utility for the vdoc org service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.vdocOrgPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocOrgPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.vdocOrgPersistenceImpl
 * @generated
 */
@ProviderType
public class vdocOrgUtil {
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
	public static void clearCache(vdocOrg vdocOrg) {
		getPersistence().clearCache(vdocOrg);
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
	public static List<vdocOrg> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<vdocOrg> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<vdocOrg> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<vdocOrg> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static vdocOrg update(vdocOrg vdocOrg) {
		return getPersistence().update(vdocOrg);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static vdocOrg update(vdocOrg vdocOrg, ServiceContext serviceContext) {
		return getPersistence().update(vdocOrg, serviceContext);
	}

	/**
	* Returns all the vdoc orgs where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @return the matching vdoc orgs
	*/
	public static List<vdocOrg> findByParentId(java.lang.String parentId) {
		return getPersistence().findByParentId(parentId);
	}

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
	public static List<vdocOrg> findByParentId(java.lang.String parentId,
		int start, int end) {
		return getPersistence().findByParentId(parentId, start, end);
	}

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
	public static List<vdocOrg> findByParentId(java.lang.String parentId,
		int start, int end, OrderByComparator<vdocOrg> orderByComparator) {
		return getPersistence()
				   .findByParentId(parentId, start, end, orderByComparator);
	}

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
	public static List<vdocOrg> findByParentId(java.lang.String parentId,
		int start, int end, OrderByComparator<vdocOrg> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByParentId(parentId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vdoc org in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc org
	* @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	*/
	public static vdocOrg findByParentId_First(java.lang.String parentId,
		OrderByComparator<vdocOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocOrgException {
		return getPersistence().findByParentId_First(parentId, orderByComparator);
	}

	/**
	* Returns the first vdoc org in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public static vdocOrg fetchByParentId_First(java.lang.String parentId,
		OrderByComparator<vdocOrg> orderByComparator) {
		return getPersistence()
				   .fetchByParentId_First(parentId, orderByComparator);
	}

	/**
	* Returns the last vdoc org in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc org
	* @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	*/
	public static vdocOrg findByParentId_Last(java.lang.String parentId,
		OrderByComparator<vdocOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocOrgException {
		return getPersistence().findByParentId_Last(parentId, orderByComparator);
	}

	/**
	* Returns the last vdoc org in the ordered set where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public static vdocOrg fetchByParentId_Last(java.lang.String parentId,
		OrderByComparator<vdocOrg> orderByComparator) {
		return getPersistence().fetchByParentId_Last(parentId, orderByComparator);
	}

	/**
	* Returns the vdoc orgs before and after the current vdoc org in the ordered set where parentId = &#63;.
	*
	* @param orgId the primary key of the current vdoc org
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vdoc org
	* @throws NoSuchvdocOrgException if a vdoc org with the primary key could not be found
	*/
	public static vdocOrg[] findByParentId_PrevAndNext(java.lang.String orgId,
		java.lang.String parentId, OrderByComparator<vdocOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocOrgException {
		return getPersistence()
				   .findByParentId_PrevAndNext(orgId, parentId,
			orderByComparator);
	}

	/**
	* Removes all the vdoc orgs where parentId = &#63; from the database.
	*
	* @param parentId the parent ID
	*/
	public static void removeByParentId(java.lang.String parentId) {
		getPersistence().removeByParentId(parentId);
	}

	/**
	* Returns the number of vdoc orgs where parentId = &#63;.
	*
	* @param parentId the parent ID
	* @return the number of matching vdoc orgs
	*/
	public static int countByParentId(java.lang.String parentId) {
		return getPersistence().countByParentId(parentId);
	}

	/**
	* Returns all the vdoc orgs where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching vdoc orgs
	*/
	public static List<vdocOrg> findByG_L(long groupId,
		java.lang.String language) {
		return getPersistence().findByG_L(groupId, language);
	}

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
	public static List<vdocOrg> findByG_L(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByG_L(groupId, language, start, end);
	}

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
	public static List<vdocOrg> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<vdocOrg> orderByComparator) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator);
	}

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
	public static List<vdocOrg> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<vdocOrg> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vdoc org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc org
	* @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	*/
	public static vdocOrg findByG_L_First(long groupId,
		java.lang.String language, OrderByComparator<vdocOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocOrgException {
		return getPersistence()
				   .findByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first vdoc org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public static vdocOrg fetchByG_L_First(long groupId,
		java.lang.String language, OrderByComparator<vdocOrg> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vdoc org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc org
	* @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	*/
	public static vdocOrg findByG_L_Last(long groupId,
		java.lang.String language, OrderByComparator<vdocOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocOrgException {
		return getPersistence()
				   .findByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last vdoc org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public static vdocOrg fetchByG_L_Last(long groupId,
		java.lang.String language, OrderByComparator<vdocOrg> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_Last(groupId, language, orderByComparator);
	}

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
	public static vdocOrg[] findByG_L_PrevAndNext(java.lang.String orgId,
		long groupId, java.lang.String language,
		OrderByComparator<vdocOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocOrgException {
		return getPersistence()
				   .findByG_L_PrevAndNext(orgId, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the vdoc orgs where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByG_L(long groupId, java.lang.String language) {
		getPersistence().removeByG_L(groupId, language);
	}

	/**
	* Returns the number of vdoc orgs where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching vdoc orgs
	*/
	public static int countByG_L(long groupId, java.lang.String language) {
		return getPersistence().countByG_L(groupId, language);
	}

	/**
	* Returns all the vdoc orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @return the matching vdoc orgs
	*/
	public static List<vdocOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId) {
		return getPersistence().findByG_L_P(groupId, language, parentId);
	}

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
	public static List<vdocOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start, int end) {
		return getPersistence()
				   .findByG_L_P(groupId, language, parentId, start, end);
	}

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
	public static List<vdocOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start,
		int end, OrderByComparator<vdocOrg> orderByComparator) {
		return getPersistence()
				   .findByG_L_P(groupId, language, parentId, start, end,
			orderByComparator);
	}

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
	public static List<vdocOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start,
		int end, OrderByComparator<vdocOrg> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_P(groupId, language, parentId, start, end,
			orderByComparator, retrieveFromCache);
	}

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
	public static vdocOrg findByG_L_P_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<vdocOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocOrgException {
		return getPersistence()
				   .findByG_L_P_First(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Returns the first vdoc org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public static vdocOrg fetchByG_L_P_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<vdocOrg> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_P_First(groupId, language, parentId,
			orderByComparator);
	}

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
	public static vdocOrg findByG_L_P_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<vdocOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocOrgException {
		return getPersistence()
				   .findByG_L_P_Last(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Returns the last vdoc org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public static vdocOrg fetchByG_L_P_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<vdocOrg> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_P_Last(groupId, language, parentId,
			orderByComparator);
	}

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
	public static vdocOrg[] findByG_L_P_PrevAndNext(java.lang.String orgId,
		long groupId, java.lang.String language, java.lang.String parentId,
		OrderByComparator<vdocOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchvdocOrgException {
		return getPersistence()
				   .findByG_L_P_PrevAndNext(orgId, groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Removes all the vdoc orgs where groupId = &#63; and language = &#63; and parentId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	*/
	public static void removeByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId) {
		getPersistence().removeByG_L_P(groupId, language, parentId);
	}

	/**
	* Returns the number of vdoc orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @return the number of matching vdoc orgs
	*/
	public static int countByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId) {
		return getPersistence().countByG_L_P(groupId, language, parentId);
	}

	/**
	* Returns the vdoc org where groupId = &#63; and code = &#63; or throws a {@link NoSuchvdocOrgException} if it could not be found.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the matching vdoc org
	* @throws NoSuchvdocOrgException if a matching vdoc org could not be found
	*/
	public static vdocOrg findByG_C(long groupId, java.lang.String code)
		throws vn.gov.hoabinh.exception.NoSuchvdocOrgException {
		return getPersistence().findByG_C(groupId, code);
	}

	/**
	* Returns the vdoc org where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public static vdocOrg fetchByG_C(long groupId, java.lang.String code) {
		return getPersistence().fetchByG_C(groupId, code);
	}

	/**
	* Returns the vdoc org where groupId = &#63; and code = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param code the code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vdoc org, or <code>null</code> if a matching vdoc org could not be found
	*/
	public static vdocOrg fetchByG_C(long groupId, java.lang.String code,
		boolean retrieveFromCache) {
		return getPersistence().fetchByG_C(groupId, code, retrieveFromCache);
	}

	/**
	* Removes the vdoc org where groupId = &#63; and code = &#63; from the database.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the vdoc org that was removed
	*/
	public static vdocOrg removeByG_C(long groupId, java.lang.String code)
		throws vn.gov.hoabinh.exception.NoSuchvdocOrgException {
		return getPersistence().removeByG_C(groupId, code);
	}

	/**
	* Returns the number of vdoc orgs where groupId = &#63; and code = &#63;.
	*
	* @param groupId the group ID
	* @param code the code
	* @return the number of matching vdoc orgs
	*/
	public static int countByG_C(long groupId, java.lang.String code) {
		return getPersistence().countByG_C(groupId, code);
	}

	/**
	* Caches the vdoc org in the entity cache if it is enabled.
	*
	* @param vdocOrg the vdoc org
	*/
	public static void cacheResult(vdocOrg vdocOrg) {
		getPersistence().cacheResult(vdocOrg);
	}

	/**
	* Caches the vdoc orgs in the entity cache if it is enabled.
	*
	* @param vdocOrgs the vdoc orgs
	*/
	public static void cacheResult(List<vdocOrg> vdocOrgs) {
		getPersistence().cacheResult(vdocOrgs);
	}

	/**
	* Creates a new vdoc org with the primary key. Does not add the vdoc org to the database.
	*
	* @param orgId the primary key for the new vdoc org
	* @return the new vdoc org
	*/
	public static vdocOrg create(java.lang.String orgId) {
		return getPersistence().create(orgId);
	}

	/**
	* Removes the vdoc org with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgId the primary key of the vdoc org
	* @return the vdoc org that was removed
	* @throws NoSuchvdocOrgException if a vdoc org with the primary key could not be found
	*/
	public static vdocOrg remove(java.lang.String orgId)
		throws vn.gov.hoabinh.exception.NoSuchvdocOrgException {
		return getPersistence().remove(orgId);
	}

	public static vdocOrg updateImpl(vdocOrg vdocOrg) {
		return getPersistence().updateImpl(vdocOrg);
	}

	/**
	* Returns the vdoc org with the primary key or throws a {@link NoSuchvdocOrgException} if it could not be found.
	*
	* @param orgId the primary key of the vdoc org
	* @return the vdoc org
	* @throws NoSuchvdocOrgException if a vdoc org with the primary key could not be found
	*/
	public static vdocOrg findByPrimaryKey(java.lang.String orgId)
		throws vn.gov.hoabinh.exception.NoSuchvdocOrgException {
		return getPersistence().findByPrimaryKey(orgId);
	}

	/**
	* Returns the vdoc org with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orgId the primary key of the vdoc org
	* @return the vdoc org, or <code>null</code> if a vdoc org with the primary key could not be found
	*/
	public static vdocOrg fetchByPrimaryKey(java.lang.String orgId) {
		return getPersistence().fetchByPrimaryKey(orgId);
	}

	public static java.util.Map<java.io.Serializable, vdocOrg> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vdoc orgs.
	*
	* @return the vdoc orgs
	*/
	public static List<vdocOrg> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<vdocOrg> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<vdocOrg> findAll(int start, int end,
		OrderByComparator<vdocOrg> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<vdocOrg> findAll(int start, int end,
		OrderByComparator<vdocOrg> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vdoc orgs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vdoc orgs.
	*
	* @return the number of vdoc orgs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static vdocOrgPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<vdocOrgPersistence, vdocOrgPersistence> _serviceTracker =
		ServiceTrackerFactory.open(vdocOrgPersistence.class);
}