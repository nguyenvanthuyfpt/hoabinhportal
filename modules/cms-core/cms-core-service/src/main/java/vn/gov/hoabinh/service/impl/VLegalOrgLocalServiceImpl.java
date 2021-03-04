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
import com.liferay.portal.kernel.theme.ThemeDisplay;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.VLegalOrg;
import vn.gov.hoabinh.service.base.VLegalOrgLocalServiceBaseImpl;
import vn.gov.hoabinh.util.PortalUtil;

/**
 * The implementation of the v legal org local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gov.hoabinh.service.VLegalOrgLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalOrgLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VLegalOrgLocalServiceUtil
 */
@ProviderType
public class VLegalOrgLocalServiceImpl extends VLegalOrgLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link vn.gov.hoabinh.service.VLegalOrgLocalServiceUtil} to access the v legal org local service.
	 */
	public VLegalOrg addOrg(long groupId, String name, String description,
			String language, boolean rssable, boolean status, String parentId, 
			ThemeDisplay themeDisplay) throws PortalException, SystemException,
			RemoteException {

		String orgId = String.valueOf(counterLocalService.increment());
		Date now = new Date();

		long userId = Long.parseLong(PortalUtil.getUserId());
			
		User user = userPersistence.findByPrimaryKey(userId);

		VLegalOrg vOrg = vLegalOrgPersistence.create(orgId);

		vOrg.setCompanyId(user.getCompanyId());
		vOrg.setGroupId(groupId);
		vOrg.setName(name);
		vOrg.setDescription(description);
		vOrg.setStatusOrg(status);
		vOrg.setLanguage(language);
		vOrg.setRssable(rssable);

		vOrg.setParentId(parentId);
		vOrg.setCreatedDate(now);
		vOrg.setCreatedByUser(userId);
		vOrg.setUserId(userId);

		vOrg.setModifiedDate(now);
		vOrg.setPosition(1);

		vLegalOrgPersistence.update(vOrg);

		// Logging...
		/*VLegalLoggerServiceUtil
				.log(groupId, CalendarUtil.getTimestamp(now)
						+ " -- CREATE: [vlegal] -> Organization ["
						+ name
						+ "] by "
						+ userPersistence.findByPrimaryKey(getUserId())
								.getScreenName());*/

		return vOrg;

	}

	// Update Organization
	public VLegalOrg updateOrg(long groupId, String orgId, String name,
			String description, String language, boolean rssable,
			boolean status, String parentId, int position)
			throws PortalException, SystemException, RemoteException {
		Date now = new Date();

		VLegalOrg vOrg = vLegalOrgPersistence.findByPrimaryKey(orgId);
		long userId = Long.parseLong(PortalUtil.getUserId());
		vOrg.setGroupId(groupId);
		vOrg.setName(name);
		vOrg.setDescription(description);
		vOrg.setStatusOrg(status);
		vOrg.setRssable(rssable);
		vOrg.setParentId(parentId);
		vOrg.setPosition(position);

		vOrg.setCreatedDate(now);
		vOrg.setCreatedByUser(userId);

		vOrg.setModifiedDate(now);
		vOrg.setModifiedByUser(userId);

		vLegalOrgPersistence.update(vOrg);

		// Logging...
		/*VLegalLoggerServiceUtil
				.log(groupId, CalendarUtil.getTimestamp(now)
						+ " -- UPDATE: [vlegal] -> Organization ["
						+ name
						+ "] by "
						+ userPersistence.findByPrimaryKey(getUserId())
								.getScreenName());*/

		return vOrg;
	}

	public VLegalOrg updateOrg(VLegalOrg vOrg) throws PortalException,
			SystemException, RemoteException {
		return updateOrg(vOrg.getGroupId(), vOrg.getOrgId(), vOrg.getName(),
				vOrg.getDescription(), vOrg.getLanguage(), vOrg.getRssable(),
				vOrg.getStatusOrg(), vOrg.getParentId(), vOrg.getPosition());
	}

	public void addEntryResources(long entryId,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		VLegalOrg entry = vLegalOrgPersistence.findByPrimaryKey(String
				.valueOf(entryId));

		addEntryResources(entry, addCommunityPermissions, addGuestPermissions);
	}

	public void addEntryResources(VLegalOrg entry,
			boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addResources(entry.getCompanyId(), entry
				.getGroupId(), entry.getUserId(), VLegalOrg.class.getName(),
				entry.getOrgId(), false, addCommunityPermissions,
				addGuestPermissions);
	}

	public void addEntryResources(long entryId, String[] communityPermissions,
			String[] guestPermissions) throws PortalException, SystemException {

		VLegalOrg entry = vLegalOrgPersistence.findByPrimaryKey(String
				.valueOf(entryId));

		addEntryResources(entry, communityPermissions, guestPermissions);
	}

	public void addEntryResources(VLegalOrg entry,
			String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addModelResources(entry.getCompanyId(), entry
				.getGroupId(), entry.getUserId(), VLegalOrg.class.getName(),
				entry.getOrgId(), communityPermissions, guestPermissions);
	}

	public List<VLegalOrg> getAllOrg() throws PortalException, SystemException,
			RemoteException {
		return vLegalOrgPersistence.findAll();
	}

	public List<VLegalOrg> getAllOrgByS_L(long groupId, boolean status, String language)
			throws PortalException, SystemException, RemoteException {
		return vLegalOrgPersistence.findByS_L(groupId, status, language);
	}

	public List<VLegalOrg> getAllOrgByS_Rss(long groupId, boolean status, boolean rssable)
			throws PortalException, SystemException, RemoteException {
		return vLegalOrgPersistence.findByS_Rss(groupId, status, rssable);
	}

	public List<VLegalOrg> getOrgByG_L_P(long groupId, String language, String parentId)
			throws PortalException, SystemException, RemoteException {
		return vLegalOrgPersistence.findByG_L_P(groupId, language, parentId);
	}

	public List<VLegalOrg> getOrgByG_L_P(long groupId, String language, String parentId,
			int start, int end) throws PortalException, SystemException,
			RemoteException {
		return vLegalOrgPersistence.findByG_L_P(groupId, language, parentId,
				start, end);
	}

	public List<VLegalOrg> getOrgByG_L(long groupId, String language)
			throws PortalException, SystemException, RemoteException {
		return vLegalOrgPersistence.findByG_L(groupId, language);
	}

	public List<VLegalOrg> getOrgByG_L(long groupId, String language, int start, int end)
			throws PortalException, SystemException, RemoteException {
		return vLegalOrgPersistence.findByG_L(groupId, language, start, end);
	}

	public int countOrgByG_L(long groupId, String language)
			throws PortalException, SystemException, RemoteException {
		return vLegalOrgPersistence.countByG_L(groupId, language);
	}

	public int countOrgByG_L_S(long groupId, String language, String parentId)
			throws PortalException, SystemException, RemoteException {
		return vLegalOrgPersistence.countByG_L_P(groupId, language, parentId);
	}

	public List<VLegalOrg> getOrgByG_L_P_S(long groupId, String language, String parentId,
			boolean statusOrg) throws PortalException, SystemException,
			RemoteException {
		return vLegalOrgPersistence.findByG_L_P_S(groupId, language, parentId,
				statusOrg);
	}

	public List<VLegalOrg> getOrgByG_L_P_S(long groupId, String language, String parentId,
			boolean statusOrg, int start, int end) throws PortalException,
			SystemException, RemoteException {
		return vLegalOrgPersistence.findByG_L_P_S(groupId, language, parentId,
				statusOrg, start, end);
	}

	public int countOrgByG_L_P_S(long groupId, String language,
			String parentId, boolean statusOrg) throws PortalException,
			SystemException, RemoteException {
		return vLegalOrgPersistence.countByG_L_P_S(groupId, language, parentId,
				statusOrg);
	}

	public List<VLegalOrg> getOrgByGroupId(long groupId) throws SystemException {
		return vLegalOrgPersistence.findByGroupId(groupId);
	}

	public List<VLegalOrg> getOrgByGroupId(long groupId, int begin, int end)
			throws SystemException {
		return vLegalOrgPersistence.findByGroupId(groupId, begin, end);
	}

	public int countOrgByGroupId(long groupId) throws SystemException {
		return vLegalOrgPersistence.countByGroupId(groupId);
	}

	// Get a Organization
	public VLegalOrg getOrg(String orgId) throws PortalException,
			SystemException, RemoteException {
		/*if (Validator.isNull(orgId)) {
			throw new NoSuchSignerException();
		}*/
		return vLegalOrgPersistence.findByPrimaryKey(orgId);
	}

	// Get a Organization
	public VLegalOrg getOrg(long groupId, String orgId) throws PortalException,
			SystemException, RemoteException {
		/*if (Validator.isNull(orgId)) {
			throw new NoSuchSignerException();
		}*/
		return vLegalOrgPersistence.findByG_O(groupId, orgId);
	}

	// Delete Organization
	public void deleteOrg(String orgId) throws PortalException,
			SystemException, RemoteException {

		/*if (Validator.isNull(orgId)) {
			throw new NoSuchSignerException();
		}*/

		VLegalOrg vOrg = vLegalOrgPersistence.findByPrimaryKey(orgId);

		/*List listDocByOrg = (List) VLegalDocumentLocalServiceUtil.getDocByG_L_O(vOrg
				.getGroupId(), vOrg.getLanguage(), orgId);*/

		/*if (Validator.isNotNull(listDocByOrg) && listDocByOrg.size() > 0) {
			throw new DeleteOrgException();
		}*/

		String name = vOrg.getName();

		vLegalOrgPersistence.remove(vOrg);

		// Logging...
		/*VLegalLoggerServiceUtil.log(0, CalendarUtil.getTimestamp(new Date())
				+ " -- DELETE: [vlegal] -> organization [" + name + "] by "
				+ getUserId());*/

	}

	/*public void _validator(String name) throws PortalException, SystemException {
		if (Validator.isNull(name) || Validator.equals(name, "")) {
			throw new InvalidOrgNameExceptionException();
		}
	}*/
}