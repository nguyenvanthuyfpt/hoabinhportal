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

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.ClipType;
import vn.gov.hoabinh.model.FAQCategory;
import vn.gov.hoabinh.service.base.ClipTypeLocalServiceBaseImpl;

/**
 * The implementation of the clip type local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.ClipTypeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClipTypeLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.ClipTypeLocalServiceUtil
 */
@ProviderType
public class ClipTypeLocalServiceImpl extends ClipTypeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.ClipTypeLocalServiceUtil} to access the clip type
	 * local service.
	 */
	public ClipType addClipType(long groupId, String language, long companyId, long plid, long userId, String title,
			String name, String description, boolean active) throws PortalException, SystemException, RemoteException {

		String Id = Long.toString(CounterLocalServiceUtil.increment(ClipType.class.getName()));

		ClipType vClipType = clipTypePersistence.create(Id);

		vClipType.setGroupId(groupId);
		vClipType.setGroupId(groupId);
		vClipType.setLanguage(language);
		vClipType.setCompanyId(companyId);
		vClipType.setName(name);
		vClipType.setTitle(title);
		vClipType.setDescription(description);
		vClipType.setActive(active);
		vClipType.setUserId(userId);
		vClipType.setCreatedDate(new Date());

		vClipType = clipTypePersistence.update(vClipType);

		return vClipType;
	}

	public ClipType updateClipType(String clipTypeId, long groupId, String language, long companyId, String title,
			String name, String description, boolean active) throws PortalException, SystemException, RemoteException {

		ClipType vClipType = clipTypePersistence.findByPrimaryKey(clipTypeId);

		vClipType.setGroupId(groupId);
		vClipType.setLanguage(language);
		vClipType.setCompanyId(companyId);
		vClipType.setName(name);
		vClipType.setTitle(title);
		vClipType.setDescription(description);
		vClipType.setActive(active);
		vClipType.setModifiedDate(new Date());

		vClipType = clipTypePersistence.update(vClipType);

		return vClipType;
	}

	public void deleteClipType(long clipTypeId) throws Exception {
		clipTypePersistence.remove(clipTypeId);
	}

	public ClipType getClipType(long typeId) throws Exception {
		return clipTypePersistence.fetchByPrimaryKey(typeId);
	}

	public List<ClipType> getClipTypeByG_L_A(long groupId, String language, boolean active) throws Exception {
		return clipTypePersistence.findByG_L_A(groupId, language, active);
	}

	public List<ClipType> getClipTypeByG_L_A(long groupId, String language, boolean active, int begin, int end)
			throws Exception {
		return clipTypePersistence.findByG_L_A(groupId, language, active, begin, end);
	}

	public int countClipTypeByG_L_A(long groupId, String language, boolean active) throws Exception {
		return clipTypePersistence.countByG_L_A(groupId, language, active);
	}

	public List<ClipType> getCategoryMenu(String[] ids) {
		return clipTypePersistence.findByMenu(ids);
	}
}