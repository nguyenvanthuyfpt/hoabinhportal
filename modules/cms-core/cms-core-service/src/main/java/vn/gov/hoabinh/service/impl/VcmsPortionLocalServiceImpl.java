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
import vn.gov.hoabinh.model.VcmsPortion;
import vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil;
import vn.gov.hoabinh.service.VcmsPARelationLocalServiceUtil;
import vn.gov.hoabinh.service.base.VcmsPortionLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VcmsPortionUtil;
import vn.gov.hoabinh.util.PortalUtil;

/**
 * The implementation of the vcms portion local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VcmsPortionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsPortionLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VcmsPortionLocalServiceUtil
 */
@ProviderType
public class VcmsPortionLocalServiceImpl extends VcmsPortionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VcmsPortionLocalServiceUtil} to access the vcms
	 * portion local service.
	 */

	public VcmsPortion addPortion(long groupId, long companyId, long plid, String code, String name, String description,
			boolean categorizable, String language) throws PortalException, SystemException, RemoteException {

		VcmsPortion portion = null;

		String userId = PortalUtil.getUserId();

		Date now = new Date();

		String portionId = Long.toString(CounterLocalServiceUtil.increment(VcmsPortion.class.getName()));

		portion = VcmsPortionUtil.create(portionId);

		portion.setGroupId(groupId);
		portion.setCompanyId(companyId);

		portion.setCode(code);
		portion.setName(name);
		portion.setDescription(description);
		portion.setCategorizable(categorizable);
		portion.setLanguage(language);

		portion.setCreatedDate(now);
		portion.setCreatedByUser(userId);

		vcmsPortionPersistence.update(portion, null);

		return portion;
	}

	public VcmsPortion updatePortion(String portionId, long groupId, long companyId, String code, String name,
			String description, boolean categorizable, String language)
			throws PortalException, SystemException, RemoteException {

		VcmsPortion portion = null;

		Date now = new Date();
		String userId = PortalUtil.getUserId();

		portion = vcmsPortionPersistence.findByPrimaryKey(portionId);

		portion.setGroupId(groupId);
		portion.setCompanyId(companyId);

		portion.setCode(code);
		portion.setName(name);
		portion.setDescription(description);
		portion.setCategorizable(categorizable);
		portion.setLanguage(language);

		portion.setModifiedDate(now);
		portion.setModifiedByUser(userId);

		vcmsPortionPersistence.update(portion);

		return portion;
	}

	public void deletePortion(String portionId) throws PortalException, SystemException, RemoteException {

		VcmsPortion portion = vcmsPortionPersistence.findByPrimaryKey(portionId);

		List categories = VcmsCategoryLocalServiceUtil.getCategoriesByPortion(portion.getGroupId(), portionId,
				portion.getLanguage());

		List paRelations = VcmsPARelationLocalServiceUtil.getRelationsByPortion(portionId);

		if (((categories != null) && (categories.size() > 0)) || ((paRelations != null) && (paRelations.size() > 0))) {

		}

		// Remove portion
		vcmsPortionPersistence.remove(portion);
	}

	public void deletePortions(String[] portionIds) throws PortalException, SystemException, RemoteException {

		if ((portionIds == null) || (portionIds.length <= 0)) {
			return;
		}

		for (int i = 0; i < portionIds.length; i++) {
			deletePortion(portionIds[i]);
		}
	}

	public VcmsPortion getPortion(String portionId) throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(portionId)) {
		}

		return vcmsPortionPersistence.findByPrimaryKey(portionId);
	}

	public VcmsPortion getPortionByS_C(long groupId, String code)
			throws PortalException, SystemException, RemoteException {
		return vcmsPortionPersistence.findByS_C(groupId, code);
	}

	public List<VcmsPortion> getPortionsByG_L(long groupId, String language)
			throws PortalException, SystemException, RemoteException {
		return vcmsPortionPersistence.findByG_L(groupId, language);
	}

	public List<VcmsPortion> getPortionsByG_L(long groupId, String language, int start, int end)
			throws PortalException, SystemException, RemoteException {
		return vcmsPortionPersistence.findByG_L(groupId, language, start, end);
	}

	public int countPortionsByG_L(long groupId, String language) throws SystemException {
		return vcmsPortionPersistence.countByG_L(groupId, language);
	}

	public int countByG_L_C(long groupId, String language, boolean categorizable)
			throws PortalException, SystemException, RemoteException {
		return vcmsPortionPersistence.countByG_L_C(groupId, language, categorizable);
	}

	public List<VcmsPortion> getPortionsByG_L_C(long groupId, String language, boolean categorizable)
			throws PortalException, SystemException, RemoteException {
		return vcmsPortionPersistence.findByG_L_C(groupId, language, categorizable);
	}
}