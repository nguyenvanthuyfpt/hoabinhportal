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
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.VLegalFORel;
import vn.gov.hoabinh.service.base.VLegalFORelLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VLegalFORelPK;
import vn.gov.hoabinh.service.persistence.VLegalFORelUtil;

/**
 * The implementation of the v legal f o rel local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VLegalFORelLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFORelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VLegalFORelLocalServiceUtil
 */
@ProviderType
public class VLegalFORelLocalServiceImpl extends VLegalFORelLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VLegalFORelLocalServiceUtil} to access the v legal
	 * f o rel local service.
	 */

	public VLegalFORel addRelation(String fieldId, String orgId)
			throws RemoteException, SystemException, PortalException {

		VLegalFORel relation = null;

		VLegalFORelPK pKey = new VLegalFORelPK(fieldId, orgId);

		relation = VLegalFORelUtil.create(pKey);

		return VLegalFORelUtil.update(relation);
	}

	public void deleteRelation(String fieldId, String orgId) throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(fieldId) || Validator.isNull(orgId)) {
			return;
		}

		VLegalFORelPK pKey = new VLegalFORelPK(fieldId, orgId);

		VLegalFORelUtil.remove(pKey);
	}

	public void deleteRelByField(String fieldId) throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(fieldId)) {
			return;
		}
		VLegalFORelUtil.removeByField(fieldId);
	}

	public void deleteRelByOrg(String orgId) throws RemoteException, SystemException, PortalException {

		if (Validator.isNull(orgId)) {
			return;
		}

		VLegalFORelUtil.removeByOrg(orgId);

	}

	public List getRelByField(String fieldId) throws RemoteException, SystemException, PortalException {
		List rels = new ArrayList();

		if (Validator.isNull(fieldId)) {
			return rels;
		}

		rels = VLegalFORelUtil.findByField(fieldId);

		return rels;

	}

	public List getRelByOrg(String orgId) throws RemoteException, SystemException, PortalException {

		List rels = new ArrayList();

		if (Validator.isNull(orgId)) {
			return rels;
		}

		rels = VLegalFORelUtil.findByOrg(orgId);

		return rels;

	}
}