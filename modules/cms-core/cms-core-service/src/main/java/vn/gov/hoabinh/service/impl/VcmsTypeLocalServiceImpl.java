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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;

import vn.gov.hoabinh.exception.NoSuchVcmsTypeException;
import vn.gov.hoabinh.model.VcmsType;
import vn.gov.hoabinh.service.VcmsArticleTypeLocalServiceUtil;
import vn.gov.hoabinh.service.base.VcmsTypeLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VcmsTypeUtil;
import vn.gov.hoabinh.util.PortalUtil;

/**
 * The implementation of the vcms type local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VcmsTypeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsTypeLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VcmsTypeLocalServiceUtil
 */
@ProviderType
public class VcmsTypeLocalServiceImpl extends VcmsTypeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VcmsTypeLocalServiceUtil} to access the vcms type
	 * local service.
	 */

	public VcmsType addType(long groupId, long companyId, long plid, String code, String name, String description,
			String language) throws PortalException, SystemException {

		VcmsType type = null;

		// _validate(groupId, null, code, name, true);

		Date now = new Date();
		long userId = 0; // getUserId();
		long typeId = CounterLocalServiceUtil.increment(VcmsType.class.getName());
		type = vcmsTypePersistence.create(typeId);

		type.setGroupId(groupId);
		type.setCompanyId(companyId);

		type.setCode(code);
		type.setName(name);
		type.setDescription(description);

		type.setLanguage(language);

		type.setCreatedDate(now);
		type.setCreatedByUser(String.valueOf(userId));

		VcmsTypeUtil.update(type);

		return type;
	}

	public VcmsType updateType(long typeId, long groupId, long companyId, String code, String name,
			String description, String language) throws PortalException, SystemException, RemoteException {

		VcmsType type = null;

		Date now = new Date();
		String userId = PortalUtil.getUserId();

		type = VcmsTypeUtil.findByPrimaryKey(typeId);

		type.setGroupId(groupId);
		type.setCompanyId(companyId);

		type.setCode(code);
		type.setName(name);
		type.setDescription(description);
		type.setLanguage(language);
		type.setModifiedDate(now);
		type.setModifiedByUser(userId);

		VcmsTypeUtil.update(type);

		return type;
	}

	public void deleteType(long typeId) throws PortalException, SystemException, RemoteException {
		try {
			VcmsType type = VcmsTypeUtil.findByPrimaryKey(typeId);
			long groupId = type.getGroupId();

			List listArticles = new ArrayList();

			listArticles = (List) VcmsArticleTypeLocalServiceUtil.getByTypeId(typeId);

			// Type can only be deleted when it has no children
			/*
			 * if (Validator.isNotNull(listArticles) && listArticles.size() > 0)
			 * { throw new DeleteTypeArticleException(); }
			 */

			// Remove Type
			vcmsTypePersistence.remove(type);

		} catch (Exception ex) {
		}

	}

	/*public void deleteTypes(String[] typeIds) throws PortalException, SystemException, RemoteException {

		if ((typeIds == null) || (typeIds.length <= 0)) {
			return;
		}

		for (int i = 0; i < typeIds.length; i++) {
			deleteType(typeIds[i]);
		}
	}*/

	public VcmsType getType(long typeId) throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(typeId)) {
			throw new NoSuchVcmsTypeException();
		}

		return VcmsTypeUtil.findByPrimaryKey(typeId);
	}

	public VcmsType getTypeByS_C(long groupId, String code) throws PortalException, SystemException, RemoteException {

		return VcmsTypeUtil.findByG_C(groupId, code);
	}

	public List<VcmsType> getTypesByS_L(long groupId, String language)
			throws PortalException, SystemException, RemoteException {

		return vcmsTypePersistence.findByG_L(groupId, language);
	}

	public List getTypesByS_L(long groupId, String language, int start, int end)
			throws PortalException, SystemException, RemoteException {

		return vcmsTypePersistence.findByG_L(groupId, language, start, end);
	}

	public int countTypesByS_L(long groupId, String language) throws PortalException, SystemException, RemoteException {

		return vcmsTypePersistence.countByG_L(groupId, language);
	}
}
