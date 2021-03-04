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
import vn.gov.hoabinh.model.VLegalFTRel;
import vn.gov.hoabinh.service.base.VLegalFTRelLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VLegalFTRelPK;
import vn.gov.hoabinh.service.persistence.VLegalFTRelUtil;

/**
 * The implementation of the v legal f t rel local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VLegalFTRelLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFTRelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VLegalFTRelLocalServiceUtil
 */
@ProviderType
public class VLegalFTRelLocalServiceImpl extends VLegalFTRelLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VLegalFTRelLocalServiceUtil} to access the v legal
	 * f t rel local service.
	 */

	public VLegalFTRel addRelation(String fieldId, String typeId)
			throws RemoteException, SystemException, PortalException {

		VLegalFTRel relation = null;

		VLegalFTRelPK pKey = new VLegalFTRelPK(fieldId, typeId);

		relation = VLegalFTRelUtil.create(pKey);

		return VLegalFTRelUtil.update(relation);
	}

	public void deleteRelation(String fieldId, String typeId) throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(fieldId) || Validator.isNull(typeId)) {
			return;
		}

		VLegalFTRelPK pKey = new VLegalFTRelPK(fieldId, typeId);

		VLegalFTRelUtil.remove(pKey);
	}

	public void deleteRelByField(String fieldId) throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(fieldId)) {
			return;
		}
		VLegalFTRelUtil.removeByField(fieldId);
	}

	public void deleteRelByType(String typeId) throws RemoteException, SystemException, PortalException {

		if (Validator.isNull(typeId)) {
			return;
		}

		VLegalFTRelUtil.removeByType(typeId);

	}

	public List getRelByType(String typeId) throws RemoteException, SystemException, PortalException {
		List rels = new ArrayList();

		if (Validator.isNull(typeId)) {
			return rels;
		}

		rels = VLegalFTRelUtil.findByType(typeId);

		return rels;

	}

	public List getRelByField(String fieldId) throws RemoteException, SystemException, PortalException {

		List rels = new ArrayList();

		if (Validator.isNull(fieldId)) {
			return rels;
		}

		rels = VLegalFTRelUtil.findByField(fieldId);

		return rels;

	}
}