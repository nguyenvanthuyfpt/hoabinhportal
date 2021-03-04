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
import vn.gov.hoabinh.model.VLegalField;
import vn.gov.hoabinh.service.VLegalDocumentLocalServiceUtil;
import vn.gov.hoabinh.service.base.VLegalFieldLocalServiceBaseImpl;
import vn.gov.hoabinh.util.PortalUtil;

/**
 * The implementation of the v legal field local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VLegalFieldLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFieldLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VLegalFieldLocalServiceUtil
 */
@ProviderType
public class VLegalFieldLocalServiceImpl extends VLegalFieldLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VLegalFieldLocalServiceUtil} to access the v legal
	 * field local service.
	 */

	public VLegalField addField(long groupId, String name, String description, String language, boolean status,
			boolean rssable, ThemeDisplay themeDisplay) throws PortalException, SystemException, RemoteException {

		String fieldId = String.valueOf(counterLocalService.increment());

		long id = counterLocalService.increment();

		// Get Current Datetime
		Date now = new Date();
		long userId = Long.parseLong(PortalUtil.getUserId());
		User user = userPersistence.findByPrimaryKey(userId);

		VLegalField vField = vLegalFieldPersistence.create(fieldId);

		vField.setCompanyId(user.getCompanyId());
		vField.setGroupId(groupId);
		vField.setName(name);
		vField.setDescription(description);
		vField.setLanguage(language);
		vField.setStatusField(status);
		vField.setRssable(rssable);
		vField.setCreatedDate(now);
		vField.setCreatedByUser(userId);
		vField.setUserId(userId);
		vField.setModifiedDate(now);

		vLegalFieldPersistence.update(vField);

		return vField;
	}

	// UPDATE A EXIST FIELD ENTRY
	public VLegalField updateField(long groupId, String fieldId, String name, String description, String language,
			boolean status, boolean rss) throws PortalException, SystemException, RemoteException {

		Date now = new Date();
		VLegalField vField = vLegalFieldPersistence.findByPrimaryKey(fieldId);

		vField.setGroupId(groupId);
		vField.setName(name);
		vField.setDescription(description);
		vField.setLanguage(language);
		vField.setStatusField(status);
		vField.setRssable(rss);
		vField.setModifiedDate(now);

		vLegalFieldPersistence.update(vField);
		return vField;
	}

	public void deleteField(String fieldId) throws PortalException, SystemException, RemoteException {

		VLegalField vDoc = vLegalFieldPersistence.findByPrimaryKey(fieldId);
		List listDocByField = (List) VLegalDocumentLocalServiceUtil.getDocByG_L_F(vDoc.getGroupId(), vDoc.getLanguage(),
				fieldId);

		vLegalFieldPersistence.remove(fieldId);

	}

	public VLegalField getVField(String fieldId) throws PortalException, SystemException, RemoteException {
		return vLegalFieldPersistence.findByPrimaryKey(fieldId);
	}

	public VLegalField getVField(long groupId, String fieldId)
			throws PortalException, SystemException, RemoteException {

		return vLegalFieldPersistence.findByG_F(groupId, fieldId);
	}

	// get all fields
	public List getAllFields() throws PortalException, SystemException, RemoteException {

		return vLegalFieldPersistence.findAll();
	}

	public List<VLegalField> getFieldByGroupId(long groupId) throws SystemException {
		return vLegalFieldPersistence.findByGroupId(groupId);
	}

	public List<VLegalField> getFieldByGroupId(long groupId, int begin, int end) throws SystemException {
		return vLegalFieldPersistence.findByGroupId(groupId, begin, end);
	}

	public int countFieldByGroupId(long groupId) throws SystemException {
		return vLegalFieldPersistence.countByGroupId(groupId);
	}

	public List<VLegalField> getVFieldByS_L(long groupId, boolean status, String language)
			throws PortalException, SystemException, RemoteException {
		return vLegalFieldPersistence.findByS_L(groupId, status, language);
	}

	public List<VLegalField> getVFieldByS_Rss(long groupId, boolean status, boolean rssable)
			throws PortalException, SystemException, RemoteException {
		return vLegalFieldPersistence.findByS_Rss(groupId, status, rssable);
	}
}