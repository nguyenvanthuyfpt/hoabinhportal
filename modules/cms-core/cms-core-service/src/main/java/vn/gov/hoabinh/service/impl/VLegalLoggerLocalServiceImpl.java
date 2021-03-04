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
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.VLegalLogger;
import vn.gov.hoabinh.service.base.VLegalLoggerLocalServiceBaseImpl;
import vn.gov.hoabinh.util.PortalUtil;

/**
 * The implementation of the v legal logger local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VLegalLoggerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalLoggerLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VLegalLoggerLocalServiceUtil
 */
@ProviderType
public class VLegalLoggerLocalServiceImpl extends VLegalLoggerLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VLegalLoggerLocalServiceUtil} to access the v
	 * legal logger local service.
	 */
	public VLegalLogger log(long groupId, String content) throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(content)) {
			return null;
		}

		String loggerId = String.valueOf(counterLocalService.increment());

		long userId = Long.parseLong(PortalUtil.getUserId());
		User user = userPersistence.findByPrimaryKey(userId);

		VLegalLogger logger = vLegalLoggerPersistence.create(loggerId);

		logger.setGroupId(groupId);
		logger.setUserId(userId);
		logger.setCompanyId(user.getCompanyId());
		logger.setCreatedDate(new Date());
		logger.setCreatedByUser(userId);
		logger.setContent(content);

		vLegalLoggerPersistence.update(logger);

		return logger;
	}

	/*public List findLogsByUser(String userId) throws PortalException, SystemException, RemoteException {
		return vLegalLoggerFinder.findByUser(userId);
	}

	public List findLogs(Date from, Date to) throws PortalException, SystemException, RemoteException {
		return vLegalLoggerFinder.findByPeriod(from, to);
	}*/

	public void removeLogs(String loggerId) throws PortalException, SystemException, RemoteException {
		vLegalLoggerPersistence.remove(loggerId);
	}

	public List findLogs() throws PortalException, SystemException, RemoteException {

		return vLegalLoggerPersistence.findAll();
	}

	public List findLogs(int begin, int end) throws PortalException, SystemException, RemoteException {

		return vLegalLoggerPersistence.findAll(begin, end);
	}

	public int countLogs() throws PortalException, SystemException, RemoteException {

		return vLegalLoggerPersistence.countAll();
	}

	/*public void removeLogs(Date from, Date to) throws PortalException, SystemException, RemoteException {

		vLegalLoggerFinder.removeByPeriod(from, to);
	}*/

	public void addEntryResources(long entryId, boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		VLegalLogger entry = vLegalLoggerPersistence.findByPrimaryKey(String.valueOf(entryId));

		addEntryResources(entry, addCommunityPermissions, addGuestPermissions);
	}

	public void addEntryResources(VLegalLogger entry, boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addResources(entry.getCompanyId(), entry.getGroupId(), entry.getUserId(),
				VLegalLogger.class.getName(), entry.getLoggerId(), false, addCommunityPermissions, addGuestPermissions);
	}

	public void addEntryResources(long entryId, String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		VLegalLogger entry = vLegalLoggerPersistence.findByPrimaryKey(String.valueOf(entryId));

		addEntryResources(entry, communityPermissions, guestPermissions);
	}

	public void addEntryResources(VLegalLogger entry, String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addModelResources(entry.getCompanyId(), entry.getGroupId(), entry.getUserId(),
				VLegalLogger.class.getName(), entry.getLoggerId(), communityPermissions, guestPermissions);
	}
}