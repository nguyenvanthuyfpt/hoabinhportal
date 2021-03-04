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

import vn.gov.hoabinh.model.VLegalOrg;

import java.util.List;

/**
 * The persistence utility for the v legal org service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VLegalOrgPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalOrgPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VLegalOrgPersistenceImpl
 * @generated
 */
@ProviderType
public class VLegalOrgUtil {
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
	public static void clearCache(VLegalOrg vLegalOrg) {
		getPersistence().clearCache(vLegalOrg);
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
	public static List<VLegalOrg> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VLegalOrg> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VLegalOrg> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VLegalOrg update(VLegalOrg vLegalOrg) {
		return getPersistence().update(vLegalOrg);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VLegalOrg update(VLegalOrg vLegalOrg,
		ServiceContext serviceContext) {
		return getPersistence().update(vLegalOrg, serviceContext);
	}

	/**
	* Returns all the v legal orgs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching v legal orgs
	*/
	public static List<VLegalOrg> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the v legal orgs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @return the range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public static VLegalOrg findByGroupId_First(long groupId,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public static VLegalOrg fetchByGroupId_First(long groupId,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public static VLegalOrg findByGroupId_Last(long groupId,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public static VLegalOrg fetchByGroupId_Last(long groupId,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63;.
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal org
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public static VLegalOrg[] findByGroupId_PrevAndNext(
		java.lang.String orgId, long groupId,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(orgId, groupId, orderByComparator);
	}

	/**
	* Removes all the v legal orgs where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of v legal orgs where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching v legal orgs
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching v legal orgs
	*/
	public static List<VLegalOrg> findByG_L(long groupId,
		java.lang.String language) {
		return getPersistence().findByG_L(groupId, language);
	}

	/**
	* Returns a range of all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @return the range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByG_L(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByG_L(groupId, language, start, end);
	}

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public static VLegalOrg findByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public static VLegalOrg fetchByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public static VLegalOrg findByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public static VLegalOrg fetchByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal org
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public static VLegalOrg[] findByG_L_PrevAndNext(java.lang.String orgId,
		long groupId, java.lang.String language,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_PrevAndNext(orgId, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the v legal orgs where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByG_L(long groupId, java.lang.String language) {
		getPersistence().removeByG_L(groupId, language);
	}

	/**
	* Returns the number of v legal orgs where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching v legal orgs
	*/
	public static int countByG_L(long groupId, java.lang.String language) {
		return getPersistence().countByG_L(groupId, language);
	}

	/**
	* Returns the v legal org where groupId = &#63; and orgId = &#63; or throws a {@link NoSuchVLegalOrgException} if it could not be found.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @return the matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public static VLegalOrg findByG_O(long groupId, java.lang.String orgId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence().findByG_O(groupId, orgId);
	}

	/**
	* Returns the v legal org where groupId = &#63; and orgId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @return the matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public static VLegalOrg fetchByG_O(long groupId, java.lang.String orgId) {
		return getPersistence().fetchByG_O(groupId, orgId);
	}

	/**
	* Returns the v legal org where groupId = &#63; and orgId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public static VLegalOrg fetchByG_O(long groupId, java.lang.String orgId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByG_O(groupId, orgId, retrieveFromCache);
	}

	/**
	* Removes the v legal org where groupId = &#63; and orgId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @return the v legal org that was removed
	*/
	public static VLegalOrg removeByG_O(long groupId, java.lang.String orgId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence().removeByG_O(groupId, orgId);
	}

	/**
	* Returns the number of v legal orgs where groupId = &#63; and orgId = &#63;.
	*
	* @param groupId the group ID
	* @param orgId the org ID
	* @return the number of matching v legal orgs
	*/
	public static int countByG_O(long groupId, java.lang.String orgId) {
		return getPersistence().countByG_O(groupId, orgId);
	}

	/**
	* Returns all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @return the matching v legal orgs
	*/
	public static List<VLegalOrg> findByS_L(long groupId, boolean statusOrg,
		java.lang.String language) {
		return getPersistence().findByS_L(groupId, statusOrg, language);
	}

	/**
	* Returns a range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @return the range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByS_L(long groupId, boolean statusOrg,
		java.lang.String language, int start, int end) {
		return getPersistence()
				   .findByS_L(groupId, statusOrg, language, start, end);
	}

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByS_L(long groupId, boolean statusOrg,
		java.lang.String language, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .findByS_L(groupId, statusOrg, language, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByS_L(long groupId, boolean statusOrg,
		java.lang.String language, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByS_L(groupId, statusOrg, language, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public static VLegalOrg findByS_L_First(long groupId, boolean statusOrg,
		java.lang.String language,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByS_L_First(groupId, statusOrg, language,
			orderByComparator);
	}

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public static VLegalOrg fetchByS_L_First(long groupId, boolean statusOrg,
		java.lang.String language,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .fetchByS_L_First(groupId, statusOrg, language,
			orderByComparator);
	}

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public static VLegalOrg findByS_L_Last(long groupId, boolean statusOrg,
		java.lang.String language,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByS_L_Last(groupId, statusOrg, language,
			orderByComparator);
	}

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public static VLegalOrg fetchByS_L_Last(long groupId, boolean statusOrg,
		java.lang.String language,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .fetchByS_L_Last(groupId, statusOrg, language,
			orderByComparator);
	}

	/**
	* Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal org
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public static VLegalOrg[] findByS_L_PrevAndNext(java.lang.String orgId,
		long groupId, boolean statusOrg, java.lang.String language,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByS_L_PrevAndNext(orgId, groupId, statusOrg, language,
			orderByComparator);
	}

	/**
	* Removes all the v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	*/
	public static void removeByS_L(long groupId, boolean statusOrg,
		java.lang.String language) {
		getPersistence().removeByS_L(groupId, statusOrg, language);
	}

	/**
	* Returns the number of v legal orgs where groupId = &#63; and statusOrg = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param language the language
	* @return the number of matching v legal orgs
	*/
	public static int countByS_L(long groupId, boolean statusOrg,
		java.lang.String language) {
		return getPersistence().countByS_L(groupId, statusOrg, language);
	}

	/**
	* Returns all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @return the matching v legal orgs
	*/
	public static List<VLegalOrg> findByS_Rss(long groupId, boolean statusOrg,
		boolean rssable) {
		return getPersistence().findByS_Rss(groupId, statusOrg, rssable);
	}

	/**
	* Returns a range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @return the range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByS_Rss(long groupId, boolean statusOrg,
		boolean rssable, int start, int end) {
		return getPersistence()
				   .findByS_Rss(groupId, statusOrg, rssable, start, end);
	}

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByS_Rss(long groupId, boolean statusOrg,
		boolean rssable, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .findByS_Rss(groupId, statusOrg, rssable, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByS_Rss(long groupId, boolean statusOrg,
		boolean rssable, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByS_Rss(groupId, statusOrg, rssable, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public static VLegalOrg findByS_Rss_First(long groupId, boolean statusOrg,
		boolean rssable, OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByS_Rss_First(groupId, statusOrg, rssable,
			orderByComparator);
	}

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public static VLegalOrg fetchByS_Rss_First(long groupId, boolean statusOrg,
		boolean rssable, OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .fetchByS_Rss_First(groupId, statusOrg, rssable,
			orderByComparator);
	}

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public static VLegalOrg findByS_Rss_Last(long groupId, boolean statusOrg,
		boolean rssable, OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByS_Rss_Last(groupId, statusOrg, rssable,
			orderByComparator);
	}

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public static VLegalOrg fetchByS_Rss_Last(long groupId, boolean statusOrg,
		boolean rssable, OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .fetchByS_Rss_Last(groupId, statusOrg, rssable,
			orderByComparator);
	}

	/**
	* Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal org
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public static VLegalOrg[] findByS_Rss_PrevAndNext(java.lang.String orgId,
		long groupId, boolean statusOrg, boolean rssable,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByS_Rss_PrevAndNext(orgId, groupId, statusOrg, rssable,
			orderByComparator);
	}

	/**
	* Removes all the v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63; from the database.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	*/
	public static void removeByS_Rss(long groupId, boolean statusOrg,
		boolean rssable) {
		getPersistence().removeByS_Rss(groupId, statusOrg, rssable);
	}

	/**
	* Returns the number of v legal orgs where groupId = &#63; and statusOrg = &#63; and rssable = &#63;.
	*
	* @param groupId the group ID
	* @param statusOrg the status org
	* @param rssable the rssable
	* @return the number of matching v legal orgs
	*/
	public static int countByS_Rss(long groupId, boolean statusOrg,
		boolean rssable) {
		return getPersistence().countByS_Rss(groupId, statusOrg, rssable);
	}

	/**
	* Returns all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @return the matching v legal orgs
	*/
	public static List<VLegalOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId) {
		return getPersistence().findByG_L_P(groupId, language, parentId);
	}

	/**
	* Returns a range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @return the range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start, int end) {
		return getPersistence()
				   .findByG_L_P(groupId, language, parentId, start, end);
	}

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start,
		int end, OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .findByG_L_P(groupId, language, parentId, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByG_L_P(long groupId,
		java.lang.String language, java.lang.String parentId, int start,
		int end, OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_P(groupId, language, parentId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public static VLegalOrg findByG_L_P_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_P_First(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public static VLegalOrg fetchByG_L_P_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_P_First(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public static VLegalOrg findByG_L_P_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_P_Last(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public static VLegalOrg fetchByG_L_P_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_P_Last(groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal org
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public static VLegalOrg[] findByG_L_P_PrevAndNext(java.lang.String orgId,
		long groupId, java.lang.String language, java.lang.String parentId,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_P_PrevAndNext(orgId, groupId, language, parentId,
			orderByComparator);
	}

	/**
	* Removes all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; from the database.
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
	* Returns the number of v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @return the number of matching v legal orgs
	*/
	public static int countByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId) {
		return getPersistence().countByG_L_P(groupId, language, parentId);
	}

	/**
	* Returns all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @return the matching v legal orgs
	*/
	public static List<VLegalOrg> findByG_L_P_S(long groupId,
		java.lang.String language, java.lang.String parentId, boolean statusOrg) {
		return getPersistence()
				   .findByG_L_P_S(groupId, language, parentId, statusOrg);
	}

	/**
	* Returns a range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @return the range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByG_L_P_S(long groupId,
		java.lang.String language, java.lang.String parentId,
		boolean statusOrg, int start, int end) {
		return getPersistence()
				   .findByG_L_P_S(groupId, language, parentId, statusOrg,
			start, end);
	}

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByG_L_P_S(long groupId,
		java.lang.String language, java.lang.String parentId,
		boolean statusOrg, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .findByG_L_P_S(groupId, language, parentId, statusOrg,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching v legal orgs
	*/
	public static List<VLegalOrg> findByG_L_P_S(long groupId,
		java.lang.String language, java.lang.String parentId,
		boolean statusOrg, int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_P_S(groupId, language, parentId, statusOrg,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public static VLegalOrg findByG_L_P_S_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		boolean statusOrg, OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_P_S_First(groupId, language, parentId, statusOrg,
			orderByComparator);
	}

	/**
	* Returns the first v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public static VLegalOrg fetchByG_L_P_S_First(long groupId,
		java.lang.String language, java.lang.String parentId,
		boolean statusOrg, OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_P_S_First(groupId, language, parentId,
			statusOrg, orderByComparator);
	}

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org
	* @throws NoSuchVLegalOrgException if a matching v legal org could not be found
	*/
	public static VLegalOrg findByG_L_P_S_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		boolean statusOrg, OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_P_S_Last(groupId, language, parentId, statusOrg,
			orderByComparator);
	}

	/**
	* Returns the last v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching v legal org, or <code>null</code> if a matching v legal org could not be found
	*/
	public static VLegalOrg fetchByG_L_P_S_Last(long groupId,
		java.lang.String language, java.lang.String parentId,
		boolean statusOrg, OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_P_S_Last(groupId, language, parentId, statusOrg,
			orderByComparator);
	}

	/**
	* Returns the v legal orgs before and after the current v legal org in the ordered set where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param orgId the primary key of the current v legal org
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next v legal org
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public static VLegalOrg[] findByG_L_P_S_PrevAndNext(
		java.lang.String orgId, long groupId, java.lang.String language,
		java.lang.String parentId, boolean statusOrg,
		OrderByComparator<VLegalOrg> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence()
				   .findByG_L_P_S_PrevAndNext(orgId, groupId, language,
			parentId, statusOrg, orderByComparator);
	}

	/**
	* Removes all the v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	*/
	public static void removeByG_L_P_S(long groupId, java.lang.String language,
		java.lang.String parentId, boolean statusOrg) {
		getPersistence().removeByG_L_P_S(groupId, language, parentId, statusOrg);
	}

	/**
	* Returns the number of v legal orgs where groupId = &#63; and language = &#63; and parentId = &#63; and statusOrg = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param parentId the parent ID
	* @param statusOrg the status org
	* @return the number of matching v legal orgs
	*/
	public static int countByG_L_P_S(long groupId, java.lang.String language,
		java.lang.String parentId, boolean statusOrg) {
		return getPersistence()
				   .countByG_L_P_S(groupId, language, parentId, statusOrg);
	}

	/**
	* Caches the v legal org in the entity cache if it is enabled.
	*
	* @param vLegalOrg the v legal org
	*/
	public static void cacheResult(VLegalOrg vLegalOrg) {
		getPersistence().cacheResult(vLegalOrg);
	}

	/**
	* Caches the v legal orgs in the entity cache if it is enabled.
	*
	* @param vLegalOrgs the v legal orgs
	*/
	public static void cacheResult(List<VLegalOrg> vLegalOrgs) {
		getPersistence().cacheResult(vLegalOrgs);
	}

	/**
	* Creates a new v legal org with the primary key. Does not add the v legal org to the database.
	*
	* @param orgId the primary key for the new v legal org
	* @return the new v legal org
	*/
	public static VLegalOrg create(java.lang.String orgId) {
		return getPersistence().create(orgId);
	}

	/**
	* Removes the v legal org with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgId the primary key of the v legal org
	* @return the v legal org that was removed
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public static VLegalOrg remove(java.lang.String orgId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence().remove(orgId);
	}

	public static VLegalOrg updateImpl(VLegalOrg vLegalOrg) {
		return getPersistence().updateImpl(vLegalOrg);
	}

	/**
	* Returns the v legal org with the primary key or throws a {@link NoSuchVLegalOrgException} if it could not be found.
	*
	* @param orgId the primary key of the v legal org
	* @return the v legal org
	* @throws NoSuchVLegalOrgException if a v legal org with the primary key could not be found
	*/
	public static VLegalOrg findByPrimaryKey(java.lang.String orgId)
		throws vn.gov.hoabinh.exception.NoSuchVLegalOrgException {
		return getPersistence().findByPrimaryKey(orgId);
	}

	/**
	* Returns the v legal org with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orgId the primary key of the v legal org
	* @return the v legal org, or <code>null</code> if a v legal org with the primary key could not be found
	*/
	public static VLegalOrg fetchByPrimaryKey(java.lang.String orgId) {
		return getPersistence().fetchByPrimaryKey(orgId);
	}

	public static java.util.Map<java.io.Serializable, VLegalOrg> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the v legal orgs.
	*
	* @return the v legal orgs
	*/
	public static List<VLegalOrg> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the v legal orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @return the range of v legal orgs
	*/
	public static List<VLegalOrg> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the v legal orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of v legal orgs
	*/
	public static List<VLegalOrg> findAll(int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the v legal orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VLegalOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal orgs
	* @param end the upper bound of the range of v legal orgs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of v legal orgs
	*/
	public static List<VLegalOrg> findAll(int start, int end,
		OrderByComparator<VLegalOrg> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the v legal orgs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of v legal orgs.
	*
	* @return the number of v legal orgs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VLegalOrgPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalOrgPersistence, VLegalOrgPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VLegalOrgPersistence.class);
}