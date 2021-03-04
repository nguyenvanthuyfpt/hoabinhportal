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
import com.liferay.portal.kernel.theme.ThemeDisplay;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.vdocOrg;
import vn.gov.hoabinh.service.base.vdocOrgLocalServiceBaseImpl;

/**
 * The implementation of the vdoc org local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.vdocOrgLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocOrgLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.vdocOrgLocalServiceUtil
 */
@ProviderType
public class vdocOrgLocalServiceImpl extends vdocOrgLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.vdocOrgLocalServiceUtil} to access the vdoc org
	 * local service.
	 */

	public vdocOrg addOrg(long groupId, String language, long userId, long companyId, String parentId, String code,
			String name, String description, String address, String phone, String fax, boolean statusOrg, int position,
			String listparent) throws PortalException, SystemException, RemoteException {

		String orgId = String.valueOf(counterLocalService.increment());
		Date now = new Date();

		vdocOrg vOrg = vdocOrgPersistence.create(orgId);

		vOrg.setCreatedDate(now);
		vOrg.setGroupId(groupId);
		vOrg.setCompanyId(companyId);
		vOrg.setLanguage(language);
		vOrg.setParentId(parentId);

		vOrg.setName(name);
		vOrg.setDescription(description);
		vOrg.setAddress(address);
		vOrg.setPhone(phone);
		vOrg.setFax(fax);
		vOrg.setStatusOrg(statusOrg);
		vOrg.setPosition(position);
		vOrg.setListparent(listparent);

		vOrg.setCode(code);

		vdocOrgPersistence.update(vOrg);

		return vOrg;
	}

	public vdocOrg updateOrg(String orgId, long groupId, String language, long userId, String parentId, String code,
			String name, String description, String address, String phone, String fax, boolean statusOrg, int position,
			String listparent, ThemeDisplay themeDisplay) throws PortalException, SystemException, RemoteException {

		vdocOrg vOrg = vdocOrgPersistence.findByPrimaryKey(orgId);

		Date now = new Date();
		vOrg.setGroupId(groupId);
		vOrg.setLanguage(language);
		vOrg.setModifiedDate(now);
		vOrg.setModifiedByUser(userId);

		vOrg.setParentId(parentId);

		vOrg.setName(name);
		vOrg.setDescription(description);
		vOrg.setAddress(address);
		vOrg.setPhone(phone);
		vOrg.setFax(fax);
		vOrg.setStatusOrg(statusOrg);
		vOrg.setPosition(position);
		vOrg.setListparent(listparent);

		vOrg.setCode(code);
		vdocOrgPersistence.update(vOrg);

		return vOrg;
	}

	public vdocOrg getOrg(String orgId) throws PortalException, SystemException, RemoteException {

		return vdocOrgPersistence.findByPrimaryKey(orgId);

	}

	public List<vdocOrg> getOrgByParentId(String parentId) throws PortalException, SystemException, RemoteException {

		return vdocOrgPersistence.findByParentId(parentId);
	}

	public List<vdocOrg> getOrgByG_L(long groupId, String language)
			throws PortalException, SystemException, RemoteException {
		return vdocOrgPersistence.findByG_L(groupId, language);
	}

	public List<vdocOrg> getOrgByG_L(long groupId, String language, int begin, int end)
			throws PortalException, SystemException, RemoteException {
		return vdocOrgPersistence.findByG_L(groupId, language, begin, end);
	}

	public int countOrgByG_L(long groupId, String language) throws PortalException, SystemException, RemoteException {
		return vdocOrgPersistence.countByG_L(groupId, language);
	}

	public List<vdocOrg> getOrgByG_L_P(long groupId, String language, String parentId)
			throws PortalException, SystemException, RemoteException {
		return vdocOrgPersistence.findByG_L_P(groupId, language, parentId);
	}

	public List<vdocOrg> getOrgByG_L_P(long groupId, String language, String parentId, int begin, int end)
			throws PortalException, SystemException, RemoteException {
		return vdocOrgPersistence.findByG_L_P(groupId, language, parentId, begin, end);
	}

	public int countOrgByG_L(long groupId, String language, String parentId)
			throws PortalException, SystemException, RemoteException {
		return vdocOrgPersistence.countByG_L_P(groupId, language, parentId);
	}
}