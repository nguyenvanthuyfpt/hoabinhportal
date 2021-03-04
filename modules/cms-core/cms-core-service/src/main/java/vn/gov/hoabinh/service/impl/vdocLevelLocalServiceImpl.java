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
import vn.gov.hoabinh.model.vdocLevel;
import vn.gov.hoabinh.service.base.vdocLevelLocalServiceBaseImpl;

/**
 * The implementation of the vdoc level local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.vdocLevelLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocLevelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.vdocLevelLocalServiceUtil
 */
@ProviderType
public class vdocLevelLocalServiceImpl extends vdocLevelLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.vdocLevelLocalServiceUtil} to access the vdoc
	 * level local service.
	 */

	public vdocLevel addLevel(long groupId, long userId, String language, String name, String description, int position)
			throws PortalException, SystemException, RemoteException {

		String levelId = String.valueOf(counterLocalService.increment());
		Date now = new Date();

		User user = userPersistence.findByPrimaryKey(userId);

		vdocLevel vLevel = vdocLevelPersistence.create(levelId);

		vLevel.setName(name);
		vLevel.setDescription(description);
		vLevel.setGroupId(groupId);
		vLevel.setLanguage(language);
		vLevel.setCreatedDate(now);
		// vLevel.setCompanyId(themeDisplay.getCompanyId());
		vLevel.setUserId(userId);
		vLevel.setPosition(position);
		vdocLevelPersistence.update(vLevel);
		return vLevel;
	}

	public vdocLevel updateLevel(String levelId, long groupId, long userId, String language, String name,
			String description, int position) throws PortalException, SystemException, RemoteException {

		vdocLevel vLevel = vdocLevelPersistence.findByPrimaryKey(levelId);
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		vLevel.setName(name);
		vLevel.setDescription(description);
		vLevel.setGroupId(groupId);
		vLevel.setLanguage(language);
		vLevel.setModifiedDate(now);
		vLevel.setPosition(position);
		vdocLevelPersistence.update(vLevel);

		return vLevel;
	}

	public vdocLevel getLevel(String levelId) throws PortalException, SystemException, RemoteException {
		return vdocLevelPersistence.findByPrimaryKey(levelId);
	}

	public List<vdocLevel> getLevelByG_L(long groupId, String language)
			throws PortalException, SystemException, RemoteException {
		return vdocLevelPersistence.findByG_L(groupId, language);
	}

	public List<vdocLevel> getLevelByG_L(long groupId, String language, int begin, int end)
			throws PortalException, SystemException, RemoteException {
		return vdocLevelPersistence.findByG_L(groupId, language, begin, end);
	}

	public int countLevelByG_L(long groupId, String language) throws PortalException, SystemException, RemoteException {
		return vdocLevelPersistence.countByG_L(groupId, language);
	}

	public void deleteLevel(String levelId, ThemeDisplay themeDisplay)
			throws PortalException, SystemException, RemoteException {

		vdocLevel vLevel = vdocLevelPersistence.findByPrimaryKey(levelId);

		long userId = 0;
		User user = userPersistence.findByPrimaryKey(userId);
		vdocLevelPersistence.remove(vLevel);
	}
}