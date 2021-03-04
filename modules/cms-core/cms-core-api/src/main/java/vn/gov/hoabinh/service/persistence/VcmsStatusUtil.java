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

import vn.gov.hoabinh.model.VcmsStatus;

import java.util.List;

/**
 * The persistence utility for the vcms status service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.VcmsStatusPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsStatusPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsStatusPersistenceImpl
 * @generated
 */
@ProviderType
public class VcmsStatusUtil {
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
	public static void clearCache(VcmsStatus vcmsStatus) {
		getPersistence().clearCache(vcmsStatus);
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
	public static List<VcmsStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VcmsStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VcmsStatus> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VcmsStatus update(VcmsStatus vcmsStatus) {
		return getPersistence().update(vcmsStatus);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VcmsStatus update(VcmsStatus vcmsStatus,
		ServiceContext serviceContext) {
		return getPersistence().update(vcmsStatus, serviceContext);
	}

	/**
	* Returns all the vcms statuses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching vcms statuses
	*/
	public static List<VcmsStatus> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the vcms statuses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @return the range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByCompanyId(long companyId, int start,
		int end) {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms statuses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByCompanyId(long companyId, int start,
		int end, OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms statuses where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByCompanyId(long companyId, int start,
		int end, OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByCompanyId_First(long companyId,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByCompanyId_First(long companyId,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByCompanyId_Last(long companyId,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByCompanyId_Last(long companyId,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the vcms statuses before and after the current vcms status in the ordered set where companyId = &#63;.
	*
	* @param statusId the primary key of the current vcms status
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms status
	* @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	*/
	public static VcmsStatus[] findByCompanyId_PrevAndNext(long statusId,
		long companyId, OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(statusId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the vcms statuses where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	*/
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of vcms statuses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching vcms statuses
	*/
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching vcms statuses
	*/
	public static List<VcmsStatus> findByC_G(long companyId, long groupId) {
		return getPersistence().findByC_G(companyId, groupId);
	}

	/**
	* Returns a range of all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @return the range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByC_G(long companyId, long groupId,
		int start, int end) {
		return getPersistence().findByC_G(companyId, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByC_G(long companyId, long groupId,
		int start, int end, OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByC_G(long companyId, long groupId,
		int start, int end, OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByC_G(companyId, groupId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByC_G_First(long companyId, long groupId,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByC_G_First(long companyId, long groupId,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .fetchByC_G_First(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByC_G_Last(long companyId, long groupId,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByC_G_Last(long companyId, long groupId,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .fetchByC_G_Last(companyId, groupId, orderByComparator);
	}

	/**
	* Returns the vcms statuses before and after the current vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param statusId the primary key of the current vcms status
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms status
	* @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	*/
	public static VcmsStatus[] findByC_G_PrevAndNext(long statusId,
		long companyId, long groupId,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_G_PrevAndNext(statusId, companyId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the vcms statuses where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	*/
	public static void removeByC_G(long companyId, long groupId) {
		getPersistence().removeByC_G(companyId, groupId);
	}

	/**
	* Returns the number of vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching vcms statuses
	*/
	public static int countByC_G(long companyId, long groupId) {
		return getPersistence().countByC_G(companyId, groupId);
	}

	/**
	* Returns all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group ID
	* @param position the position
	* @return the matching vcms statuses
	*/
	public static List<VcmsStatus> findByG_P(long groupId, int position) {
		return getPersistence().findByG_P(groupId, position);
	}

	/**
	* Returns a range of all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param position the position
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @return the range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByG_P(long groupId, int position,
		int start, int end) {
		return getPersistence().findByG_P(groupId, position, start, end);
	}

	/**
	* Returns an ordered range of all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param position the position
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByG_P(long groupId, int position,
		int start, int end, OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .findByG_P(groupId, position, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param position the position
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByG_P(long groupId, int position,
		int start, int end, OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_P(groupId, position, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms status in the ordered set where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group ID
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByG_P_First(long groupId, int position,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByG_P_First(groupId, position, orderByComparator);
	}

	/**
	* Returns the first vcms status in the ordered set where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group ID
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByG_P_First(long groupId, int position,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .fetchByG_P_First(groupId, position, orderByComparator);
	}

	/**
	* Returns the last vcms status in the ordered set where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group ID
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByG_P_Last(long groupId, int position,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByG_P_Last(groupId, position, orderByComparator);
	}

	/**
	* Returns the last vcms status in the ordered set where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group ID
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByG_P_Last(long groupId, int position,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .fetchByG_P_Last(groupId, position, orderByComparator);
	}

	/**
	* Returns the vcms statuses before and after the current vcms status in the ordered set where groupId = &#63; and position = &#63;.
	*
	* @param statusId the primary key of the current vcms status
	* @param groupId the group ID
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms status
	* @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	*/
	public static VcmsStatus[] findByG_P_PrevAndNext(long statusId,
		long groupId, int position,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByG_P_PrevAndNext(statusId, groupId, position,
			orderByComparator);
	}

	/**
	* Removes all the vcms statuses where groupId = &#63; and position = &#63; from the database.
	*
	* @param groupId the group ID
	* @param position the position
	*/
	public static void removeByG_P(long groupId, int position) {
		getPersistence().removeByG_P(groupId, position);
	}

	/**
	* Returns the number of vcms statuses where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group ID
	* @param position the position
	* @return the number of matching vcms statuses
	*/
	public static int countByG_P(long groupId, int position) {
		return getPersistence().countByG_P(groupId, position);
	}

	/**
	* Returns all the vcms statuses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching vcms statuses
	*/
	public static List<VcmsStatus> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the vcms statuses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @return the range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByGroupId(long groupId, int start,
		int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the vcms statuses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms statuses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByGroupId(long groupId, int start,
		int end, OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms status in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByGroupId_First(long groupId,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first vcms status in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByGroupId_First(long groupId,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last vcms status in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByGroupId_Last(long groupId,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last vcms status in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByGroupId_Last(long groupId,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the vcms statuses before and after the current vcms status in the ordered set where groupId = &#63;.
	*
	* @param statusId the primary key of the current vcms status
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms status
	* @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	*/
	public static VcmsStatus[] findByGroupId_PrevAndNext(long statusId,
		long groupId, OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(statusId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the vcms statuses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of vcms statuses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching vcms statuses
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param active the active
	* @return the matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByC_G_A(long companyId, long groupId,
		boolean active)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence().findByC_G_A(companyId, groupId, active);
	}

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param active the active
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByC_G_A(long companyId, long groupId,
		boolean active) {
		return getPersistence().fetchByC_G_A(companyId, groupId, active);
	}

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param active the active
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByC_G_A(long companyId, long groupId,
		boolean active, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByC_G_A(companyId, groupId, active, retrieveFromCache);
	}

	/**
	* Removes the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param active the active
	* @return the vcms status that was removed
	*/
	public static VcmsStatus removeByC_G_A(long companyId, long groupId,
		boolean active)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence().removeByC_G_A(companyId, groupId, active);
	}

	/**
	* Returns the number of vcms statuses where companyId = &#63; and groupId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param active the active
	* @return the number of matching vcms statuses
	*/
	public static int countByC_G_A(long companyId, long groupId, boolean active) {
		return getPersistence().countByC_G_A(companyId, groupId, active);
	}

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; and active = &#63; or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @param active the active
	* @return the matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByC_G_P_A(long companyId, long groupId,
		boolean isPrimary, boolean active)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_G_P_A(companyId, groupId, isPrimary, active);
	}

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; and active = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @param active the active
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByC_G_P_A(long companyId, long groupId,
		boolean isPrimary, boolean active) {
		return getPersistence()
				   .fetchByC_G_P_A(companyId, groupId, isPrimary, active);
	}

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; and active = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @param active the active
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByC_G_P_A(long companyId, long groupId,
		boolean isPrimary, boolean active, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByC_G_P_A(companyId, groupId, isPrimary, active,
			retrieveFromCache);
	}

	/**
	* Removes the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; and active = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @param active the active
	* @return the vcms status that was removed
	*/
	public static VcmsStatus removeByC_G_P_A(long companyId, long groupId,
		boolean isPrimary, boolean active)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .removeByC_G_P_A(companyId, groupId, isPrimary, active);
	}

	/**
	* Returns the number of vcms statuses where companyId = &#63; and groupId = &#63; and isPrimary = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @param active the active
	* @return the number of matching vcms statuses
	*/
	public static int countByC_G_P_A(long companyId, long groupId,
		boolean isPrimary, boolean active) {
		return getPersistence()
				   .countByC_G_P_A(companyId, groupId, isPrimary, active);
	}

	/**
	* Returns the vcms status where active = &#63; or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	*
	* @param active the active
	* @return the matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByA(boolean active)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence().findByA(active);
	}

	/**
	* Returns the vcms status where active = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param active the active
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByA(boolean active) {
		return getPersistence().fetchByA(active);
	}

	/**
	* Returns the vcms status where active = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param active the active
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByA(boolean active, boolean retrieveFromCache) {
		return getPersistence().fetchByA(active, retrieveFromCache);
	}

	/**
	* Removes the vcms status where active = &#63; from the database.
	*
	* @param active the active
	* @return the vcms status that was removed
	*/
	public static VcmsStatus removeByA(boolean active)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence().removeByA(active);
	}

	/**
	* Returns the number of vcms statuses where active = &#63;.
	*
	* @param active the active
	* @return the number of matching vcms statuses
	*/
	public static int countByA(boolean active) {
		return getPersistence().countByA(active);
	}

	/**
	* Returns all the vcms statuses where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @return the matching vcms statuses
	*/
	public static List<VcmsStatus> findByC_A(long companyId, boolean active) {
		return getPersistence().findByC_A(companyId, active);
	}

	/**
	* Returns a range of all the vcms statuses where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param active the active
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @return the range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByC_A(long companyId, boolean active,
		int start, int end) {
		return getPersistence().findByC_A(companyId, active, start, end);
	}

	/**
	* Returns an ordered range of all the vcms statuses where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param active the active
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByC_A(long companyId, boolean active,
		int start, int end, OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .findByC_A(companyId, active, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms statuses where companyId = &#63; and active = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param active the active
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByC_A(long companyId, boolean active,
		int start, int end, OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByC_A(companyId, active, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByC_A_First(long companyId, boolean active,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_A_First(companyId, active, orderByComparator);
	}

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByC_A_First(long companyId, boolean active,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .fetchByC_A_First(companyId, active, orderByComparator);
	}

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByC_A_Last(long companyId, boolean active,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_A_Last(companyId, active, orderByComparator);
	}

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByC_A_Last(long companyId, boolean active,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .fetchByC_A_Last(companyId, active, orderByComparator);
	}

	/**
	* Returns the vcms statuses before and after the current vcms status in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param statusId the primary key of the current vcms status
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms status
	* @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	*/
	public static VcmsStatus[] findByC_A_PrevAndNext(long statusId,
		long companyId, boolean active,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_A_PrevAndNext(statusId, companyId, active,
			orderByComparator);
	}

	/**
	* Removes all the vcms statuses where companyId = &#63; and active = &#63; from the database.
	*
	* @param companyId the company ID
	* @param active the active
	*/
	public static void removeByC_A(long companyId, boolean active) {
		getPersistence().removeByC_A(companyId, active);
	}

	/**
	* Returns the number of vcms statuses where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @return the number of matching vcms statuses
	*/
	public static int countByC_A(long companyId, boolean active) {
		return getPersistence().countByC_A(companyId, active);
	}

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @return the matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByC_G_P(long companyId, long groupId,
		boolean isPrimary)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence().findByC_G_P(companyId, groupId, isPrimary);
	}

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByC_G_P(long companyId, long groupId,
		boolean isPrimary) {
		return getPersistence().fetchByC_G_P(companyId, groupId, isPrimary);
	}

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByC_G_P(long companyId, long groupId,
		boolean isPrimary, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByC_G_P(companyId, groupId, isPrimary,
			retrieveFromCache);
	}

	/**
	* Removes the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @return the vcms status that was removed
	*/
	public static VcmsStatus removeByC_G_P(long companyId, long groupId,
		boolean isPrimary)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence().removeByC_G_P(companyId, groupId, isPrimary);
	}

	/**
	* Returns the number of vcms statuses where companyId = &#63; and groupId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @return the number of matching vcms statuses
	*/
	public static int countByC_G_P(long companyId, long groupId,
		boolean isPrimary) {
		return getPersistence().countByC_G_P(companyId, groupId, isPrimary);
	}

	/**
	* Returns all the vcms statuses where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @return the matching vcms statuses
	*/
	public static List<VcmsStatus> findByC_P(long companyId, boolean isPrimary) {
		return getPersistence().findByC_P(companyId, isPrimary);
	}

	/**
	* Returns a range of all the vcms statuses where companyId = &#63; and isPrimary = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @return the range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByC_P(long companyId, boolean isPrimary,
		int start, int end) {
		return getPersistence().findByC_P(companyId, isPrimary, start, end);
	}

	/**
	* Returns an ordered range of all the vcms statuses where companyId = &#63; and isPrimary = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByC_P(long companyId, boolean isPrimary,
		int start, int end, OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .findByC_P(companyId, isPrimary, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms statuses where companyId = &#63; and isPrimary = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vcms statuses
	*/
	public static List<VcmsStatus> findByC_P(long companyId, boolean isPrimary,
		int start, int end, OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByC_P(companyId, isPrimary, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByC_P_First(long companyId, boolean isPrimary,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_P_First(companyId, isPrimary, orderByComparator);
	}

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByC_P_First(long companyId,
		boolean isPrimary, OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .fetchByC_P_First(companyId, isPrimary, orderByComparator);
	}

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByC_P_Last(long companyId, boolean isPrimary,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_P_Last(companyId, isPrimary, orderByComparator);
	}

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByC_P_Last(long companyId, boolean isPrimary,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence()
				   .fetchByC_P_Last(companyId, isPrimary, orderByComparator);
	}

	/**
	* Returns the vcms statuses before and after the current vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	*
	* @param statusId the primary key of the current vcms status
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms status
	* @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	*/
	public static VcmsStatus[] findByC_P_PrevAndNext(long statusId,
		long companyId, boolean isPrimary,
		OrderByComparator<VcmsStatus> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence()
				   .findByC_P_PrevAndNext(statusId, companyId, isPrimary,
			orderByComparator);
	}

	/**
	* Removes all the vcms statuses where companyId = &#63; and isPrimary = &#63; from the database.
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	*/
	public static void removeByC_P(long companyId, boolean isPrimary) {
		getPersistence().removeByC_P(companyId, isPrimary);
	}

	/**
	* Returns the number of vcms statuses where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @return the number of matching vcms statuses
	*/
	public static int countByC_P(long companyId, boolean isPrimary) {
		return getPersistence().countByC_P(companyId, isPrimary);
	}

	/**
	* Returns the vcms status where groupId = &#63; and position = &#63; or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	*
	* @param groupId the group ID
	* @param position the position
	* @return the matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public static VcmsStatus findByG_Pos(long groupId, int position)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence().findByG_Pos(groupId, position);
	}

	/**
	* Returns the vcms status where groupId = &#63; and position = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param position the position
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByG_Pos(long groupId, int position) {
		return getPersistence().fetchByG_Pos(groupId, position);
	}

	/**
	* Returns the vcms status where groupId = &#63; and position = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param position the position
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public static VcmsStatus fetchByG_Pos(long groupId, int position,
		boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByG_Pos(groupId, position, retrieveFromCache);
	}

	/**
	* Removes the vcms status where groupId = &#63; and position = &#63; from the database.
	*
	* @param groupId the group ID
	* @param position the position
	* @return the vcms status that was removed
	*/
	public static VcmsStatus removeByG_Pos(long groupId, int position)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence().removeByG_Pos(groupId, position);
	}

	/**
	* Returns the number of vcms statuses where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group ID
	* @param position the position
	* @return the number of matching vcms statuses
	*/
	public static int countByG_Pos(long groupId, int position) {
		return getPersistence().countByG_Pos(groupId, position);
	}

	/**
	* Caches the vcms status in the entity cache if it is enabled.
	*
	* @param vcmsStatus the vcms status
	*/
	public static void cacheResult(VcmsStatus vcmsStatus) {
		getPersistence().cacheResult(vcmsStatus);
	}

	/**
	* Caches the vcms statuses in the entity cache if it is enabled.
	*
	* @param vcmsStatuses the vcms statuses
	*/
	public static void cacheResult(List<VcmsStatus> vcmsStatuses) {
		getPersistence().cacheResult(vcmsStatuses);
	}

	/**
	* Creates a new vcms status with the primary key. Does not add the vcms status to the database.
	*
	* @param statusId the primary key for the new vcms status
	* @return the new vcms status
	*/
	public static VcmsStatus create(long statusId) {
		return getPersistence().create(statusId);
	}

	/**
	* Removes the vcms status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statusId the primary key of the vcms status
	* @return the vcms status that was removed
	* @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	*/
	public static VcmsStatus remove(long statusId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence().remove(statusId);
	}

	public static VcmsStatus updateImpl(VcmsStatus vcmsStatus) {
		return getPersistence().updateImpl(vcmsStatus);
	}

	/**
	* Returns the vcms status with the primary key or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	*
	* @param statusId the primary key of the vcms status
	* @return the vcms status
	* @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	*/
	public static VcmsStatus findByPrimaryKey(long statusId)
		throws vn.gov.hoabinh.exception.NoSuchVcmsStatusException {
		return getPersistence().findByPrimaryKey(statusId);
	}

	/**
	* Returns the vcms status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param statusId the primary key of the vcms status
	* @return the vcms status, or <code>null</code> if a vcms status with the primary key could not be found
	*/
	public static VcmsStatus fetchByPrimaryKey(long statusId) {
		return getPersistence().fetchByPrimaryKey(statusId);
	}

	public static java.util.Map<java.io.Serializable, VcmsStatus> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vcms statuses.
	*
	* @return the vcms statuses
	*/
	public static List<VcmsStatus> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vcms statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @return the range of vcms statuses
	*/
	public static List<VcmsStatus> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vcms statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vcms statuses
	*/
	public static List<VcmsStatus> findAll(int start, int end,
		OrderByComparator<VcmsStatus> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vcms statuses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VcmsStatusModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms statuses
	* @param end the upper bound of the range of vcms statuses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vcms statuses
	*/
	public static List<VcmsStatus> findAll(int start, int end,
		OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vcms statuses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vcms statuses.
	*
	* @return the number of vcms statuses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VcmsStatusPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsStatusPersistence, VcmsStatusPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VcmsStatusPersistence.class);
}