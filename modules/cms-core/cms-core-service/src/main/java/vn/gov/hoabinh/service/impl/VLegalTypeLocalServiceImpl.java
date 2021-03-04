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
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.VLegalType;
import vn.gov.hoabinh.service.VLegalDocumentLocalServiceUtil;
import vn.gov.hoabinh.service.base.VLegalTypeLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VLegalDocumentUtil;
import vn.gov.hoabinh.util.PortalUtil;

/**
 * The implementation of the v legal type local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VLegalTypeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTypeLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VLegalTypeLocalServiceUtil
 */
@ProviderType
public class VLegalTypeLocalServiceImpl extends VLegalTypeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VLegalTypeLocalServiceUtil} to access the v legal
	 * type local service.
	 */

	// ADD NEW TYPE
	public VLegalType addType(long groupId, String name, String description, String language, boolean status,
			boolean rssable, ThemeDisplay themeDisplay) throws PortalException, SystemException, RemoteException {

		String typeid = String.valueOf(counterLocalService.increment());

		long id = counterLocalService.increment();

		VLegalType type = vLegalTypePersistence.create(typeid);

		Date now = new Date();
		long userId = Long.parseLong(PortalUtil.getUserId());
		User user = userPersistence.findByPrimaryKey(userId);

		type.setCompanyId(user.getCompanyId());
		type.setGroupId(groupId);
		type.setName(name);
		type.setDescription(description);
		type.setLanguage(language);
		type.setStatusType(status);
		type.setRssable(rssable);

		type.setCreatedDate(now);
		type.setCreatedByUser(userId);
		type.setModifiedDate(now);
		type.setModifiedByUser(userId);
		type.setPosition(1);

		vLegalTypePersistence.update(type);

		// Logging...
		/*
		 * VLegalLoggerServiceUtil.log(groupId, CalendarUtil.getTimestamp(now) +
		 * " -- CREATE : [vlegal] -> type [" + name + "] by " +
		 * user.getScreenName());
		 */

		return type;
	}

	// UPDATE TYPE
	public VLegalType updateType(long groupId, String typeId, String language, String name, String description,
			int position, boolean status, boolean rssable) throws PortalException, SystemException, RemoteException {

		VLegalType lType = vLegalTypePersistence.findByPrimaryKey(typeId);

		Date now = new Date();
		long userId = Long.parseLong(PortalUtil.getUserId());
		User user = userPersistence.findByPrimaryKey(userId);

		lType.setModifiedDate(now);
		lType.setModifiedByUser(userId);

		lType.setGroupId(groupId);
		lType.setName(name);
		lType.setDescription(description);
		lType.setPosition(position);
		lType.setLanguage(language);

		lType.setStatusType(status);
		lType.setRssable(rssable);

		vLegalTypePersistence.update(lType);

		// Logging...

		/*
		 * VLegalLoggerServiceUtil.log(groupId, CalendarUtil.getTimestamp(now) +
		 * " -- UPDATE : [vlegal] -> type [" + name + "] by " +
		 * user.getScreenName());
		 */

		return lType;
	}

	public VLegalType updateType(VLegalType lType) throws PortalException, SystemException, RemoteException {
		return updateType(lType.getGroupId(), lType.getPrimaryKey(), lType.getLanguage(), lType.getName(),
				lType.getDescription(), lType.getPosition(), lType.getStatusType(), lType.getRssable());
	}

	public void addEntryResources(long entryId, boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		VLegalType entry = vLegalTypePersistence.findByPrimaryKey(String.valueOf(entryId));

		addEntryResources(entry, addCommunityPermissions, addGuestPermissions);
	}

	public void addEntryResources(VLegalType entry, boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addResources(entry.getCompanyId(), entry.getGroupId(), entry.getUserId(),
				VLegalType.class.getName(), entry.getTypeId(), false, addCommunityPermissions, addGuestPermissions);
	}

	public void addEntryResources(long entryId, String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		VLegalType entry = vLegalTypePersistence.findByPrimaryKey(String.valueOf(entryId));

		addEntryResources(entry, communityPermissions, guestPermissions);
	}

	public void addEntryResources(VLegalType entry, String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addModelResources(entry.getCompanyId(), entry.getGroupId(), entry.getUserId(),
				VLegalType.class.getName(), entry.getTypeId(), communityPermissions, guestPermissions);
	}

	// DELETE TYPE BY TYPEID
	public void deleteType(String typeId) throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(typeId)) {
			return;
		}

		VLegalType lType = vLegalTypePersistence.findByPrimaryKey(typeId);

		List listDocByType = (List) VLegalDocumentLocalServiceUtil.getDocByG_L_T(lType.getGroupId(),
				lType.getLanguage(), typeId);

		/*
		 * if (Validator.isNotNull(listDocByType) && listDocByType.size() > 0) {
		 * throw new DeleteTypeException(); }
		 */

		Date now = new Date();
		long userId = Long.parseLong(PortalUtil.getUserId());
		User user = userPersistence.findByPrimaryKey(userId);
		String name = lType.getName();

		vLegalTypePersistence.remove(lType);

		// Logging...
		/*
		 * VLegalLoggerServiceUtil.log(0, CalendarUtil.getTimestamp(now) +
		 * " -- DELETE : [vlegal] -> type [" + name + "] by " +
		 * user.getScreenName());
		 */

	}

	public void deleteTypeAndDocs(String typeId) throws PortalException, SystemException, RemoteException {
		// delete type and All Document into Type
	}

	public VLegalType getType(String typeId) throws PortalException, SystemException, RemoteException {

		/*
		 * if (Validator.isNull(typeId) || Validator.equals(typeId, "")) { throw
		 * new NoSuchTypeException(); }
		 */

		VLegalType lType = vLegalTypePersistence.findByPrimaryKey(typeId);

		return lType;
	}

	public VLegalType getType(long groupId, String typeId) throws PortalException, SystemException, RemoteException {

		/*
		 * if (Validator.isNull(typeId) || Validator.equals(typeId, "")) { throw
		 * new NoSuchTypeException(); }
		 */

		VLegalType lType = vLegalTypePersistence.findByG_T(groupId, typeId);

		return lType;
	}

	public List<VLegalType> getAllTypes() throws PortalException, SystemException, RemoteException {
		return vLegalTypePersistence.findAll();
	}

	public List<VLegalType> getTypeByGroupId(long groupId) throws PortalException, SystemException, RemoteException {
		return vLegalTypePersistence.findByGroupId(groupId);
	}

	public List<VLegalType> getTypeByGroupId(long groupId, int begin, int end)
			throws PortalException, SystemException, RemoteException {
		return vLegalTypePersistence.findByGroupId(groupId, begin, end);
	}

	public int countTypeByGroupId(long groupId) throws PortalException, SystemException, RemoteException {
		return vLegalTypePersistence.countByGroupId(groupId);
	}

	public List<VLegalType> getTypesByL_S(long groupId, String language, boolean status)
			throws PortalException, SystemException, RemoteException {

		return vLegalTypePersistence.findByS_L(groupId, status, language);
	}

	public List<VLegalType> getTypesByL_RSS(long groupId, boolean status, boolean rss)
			throws PortalException, SystemException, RemoteException {

		return vLegalTypePersistence.findByS_Rss(groupId, status, rss);
	}

}