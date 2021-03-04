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
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ResourceLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.vdocField;
import vn.gov.hoabinh.service.base.vdocFieldLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.vdocFieldUtil;

/**
 * The implementation of the vdoc field local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.vdocFieldLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocFieldLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.vdocFieldLocalServiceUtil
 */
@ProviderType
public class vdocFieldLocalServiceImpl extends vdocFieldLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.vdocFieldLocalServiceUtil} to access the vdoc
	 * field local service.
	 */
	public vdocField addField(long groupId, long userId, String language, String parentId, String name,
			String description, boolean statusField, int position, String listparent, String levels)
			throws PortalException, SystemException, RemoteException {

		String fieldId = String.valueOf(counterLocalService.increment());
		Date now = new Date();

		User user = userPersistence.findByPrimaryKey(userId);
		vdocField vField = vdocFieldPersistence.create(fieldId);

		vField.setCreatedDate(now);
		vField.setCreatedByUser(userId);
		vField.setGroupId(groupId);
		vField.setLanguage(language);
		vField.setCompanyId(user.getCompanyId());

		vField.setParentId(parentId);

		vField.setName(name);
		vField.setDescription(description);
		vField.setStatusField(statusField);
		vField.setPosition(position);
		vField.setLevels(levels);

		if (Validator.equals(parentId, "0")) {
			vField.setListparent(0 + "/" + fieldId + "/");
		} else {
			vField.setListparent(listparent + fieldId + "/");
		}

		vdocFieldPersistence.update(vField);

		return vField;
	}

	public vdocField updateField(String fieldId, long groupId, long userId, String language, String parentId,
			String name, String description, boolean statusField, int position, String listparent, String levels,
			ThemeDisplay themeDisplay) throws PortalException, SystemException, RemoteException {

		vdocField vField = vdocFieldPersistence.findByPrimaryKey(fieldId);

		User user = userPersistence.findByPrimaryKey(userId);

		vField.setCompanyId(user.getCompanyId());
		vField.setGroupId(groupId);
		vField.setLanguage(language);
		vField.setName(name);
		vField.setDescription(description);
		vField.setStatusField(statusField);
		vField.setPosition(position);
		vField.setLevels(levels);
		vField.setParentId(parentId);

		vField.setModifiedDate(new Date());
		vField.setModifiedByUser(userId);

		if (Validator.equals(parentId, "0")) {
			vField.setListparent(0 + "/" + fieldId + "/");
		} else {
			vField.setListparent(listparent + fieldId + "/");
		}

		vdocFieldPersistence.update(vField);

		return vField;
	}

	public vdocField updateField(vdocField field, ThemeDisplay themeDisplay)
			throws PortalException, RemoteException, SystemException {

		return updateField(field.getFieldId(), field.getGroupId(), field.getUserId(), field.getLanguage(),
				field.getParentId(), field.getName(), field.getDescription(), field.getStatusField(),
				field.getPosition(), field.getListparent(), field.getLevels(), themeDisplay);
	}

	public vdocField getField(String fieldId) throws PortalException, SystemException, RemoteException {

		return vdocFieldPersistence.findByPrimaryKey(fieldId);
	}

	public void deleteField(String fieldId, ThemeDisplay themeDisplay)
			throws PortalException, SystemException, RemoteException {

		vdocField vField = vdocFieldUtil.findByPrimaryKey(fieldId);

		List listField = (List) vdocFieldPersistence.findByParentId(vField.getFieldId());

		/*
		 * long userId = getUserId();
		 * 
		 * User user = userPersistence.findByPrimaryKey(userId);
		 * 
		 * if (Validator.isNotNull(listField) && listField.size() > 0) { throw
		 * new DeleteFieldException(); }
		 * 
		 * List listDoc = (List) vdocDocumentServiceUtil.getDocByG_L_F(
		 * vField.getGroupId(), vField.getLanguage(), vField.getFieldId());
		 * 
		 * if (Validator.isNotNull(listDoc) && listDoc.size() > 0) { throw new
		 * DeleteFieldException(); }
		 */

		// Remove
		vdocFieldPersistence.remove(vField);

		ResourceLocalServiceUtil.deleteResource(vField.getCompanyId(), vdocField.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, vField.getFieldId());

	}

	public List<vdocField> getFieldByParentId(String parentId)
			throws PortalException, SystemException, RemoteException {
		return vdocFieldPersistence.findByParentId(parentId);
	}

	public List<vdocField> getFieldByG_L(long groupId, String language)
			throws PortalException, SystemException, RemoteException {
		return vdocFieldPersistence.findByG_L(groupId, language);
	}

	public List<vdocField> getFieldByG_L(long groupId, String language, int begin, int end)
			throws PortalException, SystemException, RemoteException {
		return vdocFieldPersistence.findByG_L(groupId, language, begin, end);
	}

	public int countFieldByG_L(long groupId, String language) throws PortalException, SystemException, RemoteException {
		return vdocFieldPersistence.countByG_L(groupId, language);
	}

	public int countFieldByG_L_P(long groupId, String language, String parentId)
			throws PortalException, SystemException, RemoteException {
		return vdocFieldPersistence.countByG_L_P(groupId, language, parentId);
	}

	public List getFieldByG_L_P(long groupId, String language, String parentId)
			throws PortalException, SystemException, RemoteException {

		return vdocFieldPersistence.findByG_L_P(groupId, language, parentId);
	}

	public List<vdocField> getFieldByG_L_P(long groupId, String language, String parentId, int begin, int end)
			throws PortalException, SystemException, RemoteException {

		return vdocFieldPersistence.findByG_L_P(groupId, language, parentId, begin, end);
	}

	/*
	 * public List getFieldByParam(long groupId, String language, String
	 * parentId, String[] arrayLevel) throws PortalException, SystemException,
	 * RemoteException { return vdocFieldFinder.findFieldByParam(groupId,
	 * language, parentId, arrayLevel); }
	 */

	public void addEntryResources(long entryId, boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		vdocField entry = vdocFieldPersistence.findByPrimaryKey(String.valueOf(entryId));

		addEntryResources(entry, addCommunityPermissions, addGuestPermissions);
	}

	public void addEntryResources(vdocField entry, boolean addCommunityPermissions, boolean addGuestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addResources(entry.getCompanyId(), entry.getGroupId(), entry.getUserId(),
				vdocField.class.getName(), entry.getFieldId(), false, addCommunityPermissions, addGuestPermissions);
	}

	public void addEntryResources(long entryId, String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		vdocField entry = vdocFieldPersistence.findByPrimaryKey(String.valueOf(entryId));

		addEntryResources(entry, communityPermissions, guestPermissions);
	}

	public void addEntryResources(vdocField entry, String[] communityPermissions, String[] guestPermissions)
			throws PortalException, SystemException {

		resourceLocalService.addModelResources(entry.getCompanyId(), entry.getGroupId(), entry.getUserId(),
				vdocField.class.getName(), entry.getFieldId(), communityPermissions, guestPermissions);
	}

}