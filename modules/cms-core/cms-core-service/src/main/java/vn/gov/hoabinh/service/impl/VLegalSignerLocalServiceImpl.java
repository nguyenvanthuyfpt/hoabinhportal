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
import com.liferay.portal.kernel.service.permission.PortletPermissionUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.VLegalSigner;
import vn.gov.hoabinh.service.base.VLegalSignerLocalServiceBaseImpl;
import vn.gov.hoabinh.util.PortalUtil;

/**
 * The implementation of the v legal signer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VLegalSignerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSignerLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VLegalSignerLocalServiceUtil
 */
@ProviderType
public class VLegalSignerLocalServiceImpl extends VLegalSignerLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VLegalSignerLocalServiceUtil} to access the v
	 * legal signer local service.
	 */

	public VLegalSigner addSigner(long groupId, String firstName, String lastName, String language,
			boolean statusSigner, ThemeDisplay themeDisplay)
			throws PortalException, SystemException, RemoteException {

		String sigId = String.valueOf(counterLocalService.increment());
		Date now = new Date();

		long userId = Long.parseLong(PortalUtil.getUserId());
		User user = userPersistence.findByPrimaryKey(userId);
		VLegalSigner vSigner = vLegalSignerPersistence.create(sigId);

		vSigner.setFirstName(firstName);
		vSigner.setLastName(lastName);
		vSigner.setLanguage(language);
		vSigner.setStatusSigner(statusSigner);

		vSigner.setCreatedDate(now);
		vSigner.setCreatedByUser(userId);
		vSigner.setUserId(userId);
		vSigner.setCompanyId(user.getCompanyId());
		vSigner.setGroupId(groupId);

		vSigner.setModifiedDate(now);

		vLegalSignerPersistence.update(vSigner);
		// Logging...
		/*VLegalLoggerServiceUtil.log(groupId, CalendarUtil.getTimestamp(now) + " -- CREATE: [vlegal] -> signer ["
				+ firstName + " " + lastName + "] by " + user.getScreenName());*/

		return vSigner;

	}

	// Update Signer
	public VLegalSigner updateSigner(long groupId, String sigId, String firstName, String lastName, String language,
			boolean statusSigner) throws PortalException, SystemException, RemoteException {

		VLegalSigner vSigner = vLegalSignerPersistence.findByPrimaryKey(sigId);

		vSigner.setFirstName(firstName);
		vSigner.setLastName(lastName);
		vSigner.setLanguage(language);
		vSigner.setStatusSigner(statusSigner);

		vLegalSignerPersistence.update(vSigner);
		// Logging...
		/*VLegalLoggerServiceUtil.log(groupId, CalendarUtil.getTimestamp(new Date()) + " -- UPDATE: [vlegal] -> signer ["
				+ firstName + " " + lastName + "] by " + getUserId());*/

		return vSigner;
	}

	public VLegalSigner updateSigner(VLegalSigner vSigner) throws PortalException, SystemException, RemoteException {
		return updateSigner(vSigner.getGroupId(), vSigner.getSigId(), vSigner.getFirstName(), vSigner.getLastName(),
				vSigner.getLanguage(), vSigner.getStatusSigner());
	}

	public void addEntryResources(long entryId, boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		VLegalSigner entry = vLegalSignerPersistence.findByPrimaryKey(String.valueOf(entryId));

		addEntryResources(entry, addCommunityPermissions, addGuestPermissions);
	}

	public void addEntryResources(VLegalSigner entry, boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addResources(entry.getCompanyId(), entry.getGroupId(), entry.getUserId(),
				VLegalSigner.class.getName(), entry.getSigId(), false, addCommunityPermissions, addGuestPermissions);
	}

	public void addEntryResources(long entryId, String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		VLegalSigner entry = vLegalSignerPersistence.findByPrimaryKey(String.valueOf(entryId));

		addEntryResources(entry, communityPermissions, guestPermissions);
	}

	public void addEntryResources(VLegalSigner entry, String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addModelResources(entry.getCompanyId(), entry.getGroupId(), entry.getUserId(),
				VLegalSigner.class.getName(), entry.getSigId(), communityPermissions, guestPermissions);
	}

	public List getSignerByGroupId(long groupId) throws SystemException {
		return vLegalSignerPersistence.findByGroupId(groupId);
	}

	public List getSignerByGroupId(long groupId, int begin, int end) throws SystemException {
		return vLegalSignerPersistence.findByGroupId(groupId, begin, end);
	}

	public int countSignerByGroupId(long groupId) throws SystemException {
		return vLegalSignerPersistence.countByGroupId(groupId);
	}

	// List all signer by groupId + language + status
	public List getAllByG_L_S(long groupId, String language, boolean statusSigner)
			throws PortalException, SystemException, RemoteException {
		return vLegalSignerPersistence.findByG_L_S(groupId, language, statusSigner);
	}

	// List all signer by groupid and language
	public List getAllSignerByG_L(long groupId, String language)
			throws PortalException, SystemException, RemoteException {
		return vLegalSignerPersistence.findByGroup_Lang(groupId, language);
	}

	// List all signer
	public List getAllSigner() throws PortalException, SystemException, RemoteException {
		return vLegalSignerPersistence.findAll();
	}

	// Get a Signer
	public VLegalSigner getSigner(String sigId) throws PortalException, SystemException, RemoteException {
		/*if (Validator.isNull(sigId)) {
			throw new NoSuchSignerException();
		}*/
		return vLegalSignerPersistence.findByPrimaryKey(sigId);
	}

	// Get a Signer
	public VLegalSigner getSigner(long groupId, String sigId) throws PortalException, SystemException, RemoteException {
		/*if (Validator.isNull(sigId)) {
			throw new NoSuchSignerException();
		}*/
		return vLegalSignerPersistence.findByG_S(groupId, sigId);
	}

	// Delete Signer
	public void deleteSigner(String sigId) throws PortalException, SystemException, RemoteException {

		/*if (Validator.isNull(sigId)) {
			throw new NoSuchSignerException();
		}*/
		/*String firstName = VLegalSignerServiceUtil.getSigner(sigId).getFirstName();
		String lastName = VLegalSignerServiceUtil.getSigner(sigId).getLastName();*/

		vLegalSignerPersistence.remove(sigId);
		// Logging...
		/*VLegalLoggerServiceUtil.log(0, CalendarUtil.getTimestamp(new Date()) + " -- DELETE: [vlegal] -> signer ["
				+ firstName + " " + lastName + "] by " + getUserId());*/

	}
}