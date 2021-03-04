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

import vn.gov.hoabinh.exception.NoSuchVcmsStatusException;
import vn.gov.hoabinh.model.VcmsStatus;

/**
 * The persistence interface for the vcms status service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.VcmsStatusPersistenceImpl
 * @see VcmsStatusUtil
 * @generated
 */
@ProviderType
public interface VcmsStatusPersistence extends BasePersistence<VcmsStatus> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsStatusUtil} to access the vcms status persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vcms statuses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching vcms statuses
	*/
	public java.util.List<VcmsStatus> findByCompanyId(long companyId);

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
	public java.util.List<VcmsStatus> findByCompanyId(long companyId,
		int start, int end);

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
	public java.util.List<VcmsStatus> findByCompanyId(long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

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
	public java.util.List<VcmsStatus> findByCompanyId(long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

	/**
	* Returns the vcms statuses before and after the current vcms status in the ordered set where companyId = &#63;.
	*
	* @param statusId the primary key of the current vcms status
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms status
	* @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	*/
	public VcmsStatus[] findByCompanyId_PrevAndNext(long statusId,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Removes all the vcms statuses where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	*/
	public void removeByCompanyId(long companyId);

	/**
	* Returns the number of vcms statuses where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching vcms statuses
	*/
	public int countByCompanyId(long companyId);

	/**
	* Returns all the vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching vcms statuses
	*/
	public java.util.List<VcmsStatus> findByC_G(long companyId, long groupId);

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
	public java.util.List<VcmsStatus> findByC_G(long companyId, long groupId,
		int start, int end);

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
	public java.util.List<VcmsStatus> findByC_G(long companyId, long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

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
	public java.util.List<VcmsStatus> findByC_G(long companyId, long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByC_G_First(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByC_G_First(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByC_G_Last(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByC_G_Last(long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

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
	public VcmsStatus[] findByC_G_PrevAndNext(long statusId, long companyId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Removes all the vcms statuses where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	*/
	public void removeByC_G(long companyId, long groupId);

	/**
	* Returns the number of vcms statuses where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching vcms statuses
	*/
	public int countByC_G(long companyId, long groupId);

	/**
	* Returns all the vcms statuses where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group ID
	* @param position the position
	* @return the matching vcms statuses
	*/
	public java.util.List<VcmsStatus> findByG_P(long groupId, int position);

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
	public java.util.List<VcmsStatus> findByG_P(long groupId, int position,
		int start, int end);

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
	public java.util.List<VcmsStatus> findByG_P(long groupId, int position,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

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
	public java.util.List<VcmsStatus> findByG_P(long groupId, int position,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms status in the ordered set where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group ID
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByG_P_First(long groupId, int position,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the first vcms status in the ordered set where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group ID
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByG_P_First(long groupId, int position,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

	/**
	* Returns the last vcms status in the ordered set where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group ID
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByG_P_Last(long groupId, int position,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the last vcms status in the ordered set where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group ID
	* @param position the position
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByG_P_Last(long groupId, int position,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

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
	public VcmsStatus[] findByG_P_PrevAndNext(long statusId, long groupId,
		int position,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Removes all the vcms statuses where groupId = &#63; and position = &#63; from the database.
	*
	* @param groupId the group ID
	* @param position the position
	*/
	public void removeByG_P(long groupId, int position);

	/**
	* Returns the number of vcms statuses where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group ID
	* @param position the position
	* @return the number of matching vcms statuses
	*/
	public int countByG_P(long groupId, int position);

	/**
	* Returns all the vcms statuses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching vcms statuses
	*/
	public java.util.List<VcmsStatus> findByGroupId(long groupId);

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
	public java.util.List<VcmsStatus> findByGroupId(long groupId, int start,
		int end);

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
	public java.util.List<VcmsStatus> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

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
	public java.util.List<VcmsStatus> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms status in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the first vcms status in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

	/**
	* Returns the last vcms status in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the last vcms status in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

	/**
	* Returns the vcms statuses before and after the current vcms status in the ordered set where groupId = &#63;.
	*
	* @param statusId the primary key of the current vcms status
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vcms status
	* @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	*/
	public VcmsStatus[] findByGroupId_PrevAndNext(long statusId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Removes all the vcms statuses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of vcms statuses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching vcms statuses
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param active the active
	* @return the matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByC_G_A(long companyId, long groupId, boolean active)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param active the active
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByC_G_A(long companyId, long groupId, boolean active);

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param active the active
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByC_G_A(long companyId, long groupId,
		boolean active, boolean retrieveFromCache);

	/**
	* Removes the vcms status where companyId = &#63; and groupId = &#63; and active = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param active the active
	* @return the vcms status that was removed
	*/
	public VcmsStatus removeByC_G_A(long companyId, long groupId, boolean active)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the number of vcms statuses where companyId = &#63; and groupId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param active the active
	* @return the number of matching vcms statuses
	*/
	public int countByC_G_A(long companyId, long groupId, boolean active);

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
	public VcmsStatus findByC_G_P_A(long companyId, long groupId,
		boolean isPrimary, boolean active) throws NoSuchVcmsStatusException;

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; and active = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @param active the active
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByC_G_P_A(long companyId, long groupId,
		boolean isPrimary, boolean active);

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
	public VcmsStatus fetchByC_G_P_A(long companyId, long groupId,
		boolean isPrimary, boolean active, boolean retrieveFromCache);

	/**
	* Removes the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; and active = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @param active the active
	* @return the vcms status that was removed
	*/
	public VcmsStatus removeByC_G_P_A(long companyId, long groupId,
		boolean isPrimary, boolean active) throws NoSuchVcmsStatusException;

	/**
	* Returns the number of vcms statuses where companyId = &#63; and groupId = &#63; and isPrimary = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @param active the active
	* @return the number of matching vcms statuses
	*/
	public int countByC_G_P_A(long companyId, long groupId, boolean isPrimary,
		boolean active);

	/**
	* Returns the vcms status where active = &#63; or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	*
	* @param active the active
	* @return the matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByA(boolean active) throws NoSuchVcmsStatusException;

	/**
	* Returns the vcms status where active = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param active the active
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByA(boolean active);

	/**
	* Returns the vcms status where active = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param active the active
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByA(boolean active, boolean retrieveFromCache);

	/**
	* Removes the vcms status where active = &#63; from the database.
	*
	* @param active the active
	* @return the vcms status that was removed
	*/
	public VcmsStatus removeByA(boolean active)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the number of vcms statuses where active = &#63;.
	*
	* @param active the active
	* @return the number of matching vcms statuses
	*/
	public int countByA(boolean active);

	/**
	* Returns all the vcms statuses where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @return the matching vcms statuses
	*/
	public java.util.List<VcmsStatus> findByC_A(long companyId, boolean active);

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
	public java.util.List<VcmsStatus> findByC_A(long companyId, boolean active,
		int start, int end);

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
	public java.util.List<VcmsStatus> findByC_A(long companyId, boolean active,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

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
	public java.util.List<VcmsStatus> findByC_A(long companyId, boolean active,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByC_A_First(long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByC_A_First(long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByC_A_Last(long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByC_A_Last(long companyId, boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

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
	public VcmsStatus[] findByC_A_PrevAndNext(long statusId, long companyId,
		boolean active,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Removes all the vcms statuses where companyId = &#63; and active = &#63; from the database.
	*
	* @param companyId the company ID
	* @param active the active
	*/
	public void removeByC_A(long companyId, boolean active);

	/**
	* Returns the number of vcms statuses where companyId = &#63; and active = &#63;.
	*
	* @param companyId the company ID
	* @param active the active
	* @return the number of matching vcms statuses
	*/
	public int countByC_A(long companyId, boolean active);

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @return the matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByC_G_P(long companyId, long groupId,
		boolean isPrimary) throws NoSuchVcmsStatusException;

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByC_G_P(long companyId, long groupId,
		boolean isPrimary);

	/**
	* Returns the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByC_G_P(long companyId, long groupId,
		boolean isPrimary, boolean retrieveFromCache);

	/**
	* Removes the vcms status where companyId = &#63; and groupId = &#63; and isPrimary = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @return the vcms status that was removed
	*/
	public VcmsStatus removeByC_G_P(long companyId, long groupId,
		boolean isPrimary) throws NoSuchVcmsStatusException;

	/**
	* Returns the number of vcms statuses where companyId = &#63; and groupId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param isPrimary the is primary
	* @return the number of matching vcms statuses
	*/
	public int countByC_G_P(long companyId, long groupId, boolean isPrimary);

	/**
	* Returns all the vcms statuses where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @return the matching vcms statuses
	*/
	public java.util.List<VcmsStatus> findByC_P(long companyId,
		boolean isPrimary);

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
	public java.util.List<VcmsStatus> findByC_P(long companyId,
		boolean isPrimary, int start, int end);

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
	public java.util.List<VcmsStatus> findByC_P(long companyId,
		boolean isPrimary, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

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
	public java.util.List<VcmsStatus> findByC_P(long companyId,
		boolean isPrimary, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByC_P_First(long companyId, boolean isPrimary,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the first vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByC_P_First(long companyId, boolean isPrimary,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByC_P_Last(long companyId, boolean isPrimary,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the last vcms status in the ordered set where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByC_P_Last(long companyId, boolean isPrimary,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

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
	public VcmsStatus[] findByC_P_PrevAndNext(long statusId, long companyId,
		boolean isPrimary,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator)
		throws NoSuchVcmsStatusException;

	/**
	* Removes all the vcms statuses where companyId = &#63; and isPrimary = &#63; from the database.
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	*/
	public void removeByC_P(long companyId, boolean isPrimary);

	/**
	* Returns the number of vcms statuses where companyId = &#63; and isPrimary = &#63;.
	*
	* @param companyId the company ID
	* @param isPrimary the is primary
	* @return the number of matching vcms statuses
	*/
	public int countByC_P(long companyId, boolean isPrimary);

	/**
	* Returns the vcms status where groupId = &#63; and position = &#63; or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	*
	* @param groupId the group ID
	* @param position the position
	* @return the matching vcms status
	* @throws NoSuchVcmsStatusException if a matching vcms status could not be found
	*/
	public VcmsStatus findByG_Pos(long groupId, int position)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the vcms status where groupId = &#63; and position = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param position the position
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByG_Pos(long groupId, int position);

	/**
	* Returns the vcms status where groupId = &#63; and position = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param position the position
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vcms status, or <code>null</code> if a matching vcms status could not be found
	*/
	public VcmsStatus fetchByG_Pos(long groupId, int position,
		boolean retrieveFromCache);

	/**
	* Removes the vcms status where groupId = &#63; and position = &#63; from the database.
	*
	* @param groupId the group ID
	* @param position the position
	* @return the vcms status that was removed
	*/
	public VcmsStatus removeByG_Pos(long groupId, int position)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the number of vcms statuses where groupId = &#63; and position = &#63;.
	*
	* @param groupId the group ID
	* @param position the position
	* @return the number of matching vcms statuses
	*/
	public int countByG_Pos(long groupId, int position);

	/**
	* Caches the vcms status in the entity cache if it is enabled.
	*
	* @param vcmsStatus the vcms status
	*/
	public void cacheResult(VcmsStatus vcmsStatus);

	/**
	* Caches the vcms statuses in the entity cache if it is enabled.
	*
	* @param vcmsStatuses the vcms statuses
	*/
	public void cacheResult(java.util.List<VcmsStatus> vcmsStatuses);

	/**
	* Creates a new vcms status with the primary key. Does not add the vcms status to the database.
	*
	* @param statusId the primary key for the new vcms status
	* @return the new vcms status
	*/
	public VcmsStatus create(long statusId);

	/**
	* Removes the vcms status with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param statusId the primary key of the vcms status
	* @return the vcms status that was removed
	* @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	*/
	public VcmsStatus remove(long statusId) throws NoSuchVcmsStatusException;

	public VcmsStatus updateImpl(VcmsStatus vcmsStatus);

	/**
	* Returns the vcms status with the primary key or throws a {@link NoSuchVcmsStatusException} if it could not be found.
	*
	* @param statusId the primary key of the vcms status
	* @return the vcms status
	* @throws NoSuchVcmsStatusException if a vcms status with the primary key could not be found
	*/
	public VcmsStatus findByPrimaryKey(long statusId)
		throws NoSuchVcmsStatusException;

	/**
	* Returns the vcms status with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param statusId the primary key of the vcms status
	* @return the vcms status, or <code>null</code> if a vcms status with the primary key could not be found
	*/
	public VcmsStatus fetchByPrimaryKey(long statusId);

	@Override
	public java.util.Map<java.io.Serializable, VcmsStatus> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vcms statuses.
	*
	* @return the vcms statuses
	*/
	public java.util.List<VcmsStatus> findAll();

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
	public java.util.List<VcmsStatus> findAll(int start, int end);

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
	public java.util.List<VcmsStatus> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator);

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
	public java.util.List<VcmsStatus> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VcmsStatus> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vcms statuses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vcms statuses.
	*
	* @return the number of vcms statuses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}