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

package vn.gov.hoabinh.service.impl;

import java.rmi.RemoteException;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.exception.NoSuchVcmsStatusException;
import vn.gov.hoabinh.model.VcmsStatus;
import vn.gov.hoabinh.service.base.VcmsStatusLocalServiceBaseImpl;

/**
 * The implementation of the vcms status local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VcmsStatusLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsStatusLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VcmsStatusLocalServiceUtil
 */
@ProviderType
public class VcmsStatusLocalServiceImpl extends VcmsStatusLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VcmsStatusLocalServiceUtil} to access the vcms
	 * status local service.
	 */
	/*public VcmsStatus addStatus(long companyId, long groupId, long userId, String name, String description,
			String cssClass, String textColor, int position, boolean isPrimary, boolean active,
			Boolean addCommunityPermissions, Boolean addGuestPermissions, String[] communityPermissions,
			String[] guestPermissions) throws PortalException, SystemException, RemoteException {

		long statusId = CounterLocalServiceUtil.increment(VcmsStatus.class.getName());

		Date now = new Date();

		VcmsStatus status = VcmsStatusUtil.create(statusId);
		status.setName(name);
		status.setDescription(description);
		status.setIsPrimary(isPrimary);
		status.setCssClass(cssClass);
		status.setTextColor(textColor);

		status.setCompanyId(companyId);
		status.setGroupId(groupId);
		status.setPosition(position);
		status.setActive(active);
		status.setCreatedByUser(String.valueOf(userId));
		status.setCreatedDate(now);

		vcmsStatusPersistence.update(status);

		vcmsStatusFinder.updatePostion(statusId, companyId, groupId, position, true);
		if (isPrimary)
			vcmsStatusFinder.updatePrimary(statusId, companyId, groupId);
		if (active)
			vcmsStatusFinder.updateActive(statusId, companyId, groupId);

		return status;
	}
	
	public VcmsStatus updateStatus(long statusId, long companyId, long groupId, long userId, String name,
			String description, String cssClass, String textColor, int position, boolean isPrimary, boolean active,
			Boolean addCommunityPermissions, Boolean addGuestPermissions, String[] communityPermissions,
			String[] guestPermissions) throws PortalException, SystemException, RemoteException {

		Date now = new Date();

		VcmsStatus status = vcmsStatusPersistence.findByPrimaryKey(statusId);
		// decrease position of all status where position >= status. old
		// position
		vcmsStatusFinder.updatePostion(statusId, companyId, groupId, status.getPosition(), false);

		status.setName(name);
		status.setDescription(description);
		status.setIsPrimary(isPrimary);
		status.setCssClass(cssClass);
		status.setTextColor(textColor);

		status.setCompanyId(companyId);
		status.setGroupId(groupId);
		status.setPosition(position);
		status.setActive(active);
		status.setModifiedByUser(String.valueOf(userId));
		status.setModifiedDate(now);

		vcmsStatusPersistence.update(status);

		// increase position of all status where position >= status.position
		vcmsStatusFinder.updatePostion(statusId, companyId, groupId, position, true);
		if (isPrimary)
			vcmsStatusFinder.updatePrimary(statusId, companyId, groupId);
		if (active)
			vcmsStatusFinder.updateActive(statusId, companyId, groupId);

		return status;
	}*/

	public VcmsStatus getVcmsStatus(long statusId) throws PortalException {
		return vcmsStatusPersistence.fetchByPrimaryKey(statusId);
	}


	public List<VcmsStatus> getByG_P(long groupId, int position) throws PortalException, SystemException, RemoteException {
		return vcmsStatusPersistence.findByG_P(groupId, position);
	}

	public List<VcmsStatus> getByGroupId(long groupId) throws PortalException, SystemException, RemoteException {
		return vcmsStatusPersistence.findByGroupId(groupId);
	}

	public List<VcmsStatus> getByGroupId(long groupId, int begin, int end)
			throws PortalException, SystemException, RemoteException {
		return vcmsStatusPersistence.findByGroupId(groupId, begin, end);
	}

	public int countByGroupId(long groupId) throws PortalException, SystemException, RemoteException {
		return vcmsStatusPersistence.countByGroupId(groupId);
	}

	public VcmsStatus getByC_G_A(long companyId, long groupId, boolean active)
			throws PortalException, SystemException, RemoteException {
		return vcmsStatusPersistence.findByC_G_A(companyId, groupId, active);
	}
	
	public VcmsStatus getByC_G_P_A(long companyId, long groupId, boolean isPrimary, boolean active)
			throws PortalException, SystemException, RemoteException {
		return vcmsStatusPersistence.findByC_G_P_A(companyId, groupId, isPrimary, active);
	}

	public VcmsStatus getByA(boolean active) throws PortalException, SystemException, RemoteException {
		return vcmsStatusPersistence.findByA(active);
	}
	
	public VcmsStatus getByG_Pos(long groupId, int position) throws NoSuchVcmsStatusException {
		return vcmsStatusPersistence.findByG_Pos(groupId, position);
	}

	public boolean isStatusPublisher(long statusId) {
		boolean retval = false;
		VcmsStatus status = vcmsStatusPersistence.fetchByPrimaryKey(statusId);
		if (status!=null) {
			retval = status.getActive();
		}
		return retval;
	}
}