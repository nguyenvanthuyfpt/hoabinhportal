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
import vn.gov.hoabinh.model.VLegalDDRel;
import vn.gov.hoabinh.service.base.VLegalDDRelLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VLegalDDRelPK;
import vn.gov.hoabinh.service.persistence.VLegalDDRelUtil;

/**
 * The implementation of the v legal d d rel local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VLegalDDRelLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDDRelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VLegalDDRelLocalServiceUtil
 */
@ProviderType
public class VLegalDDRelLocalServiceImpl extends VLegalDDRelLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VLegalDDRelLocalServiceUtil} to access the v legal
	 * d d rel local service.
	 */

	public VLegalDDRel addRelation(long departmentId, String docId)
			throws PortalException, SystemException, RemoteException {
		VLegalDDRel relation = null;

		VLegalDDRelPK pKey = new VLegalDDRelPK(departmentId, docId);

		relation = VLegalDDRelUtil.create(pKey);

		return VLegalDDRelUtil.update(relation);
	}

	public void deleteRelation(long departmentId, String docId)
			throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(String.valueOf(departmentId)) || Validator.isNull(docId)) {
			return;
		}

		VLegalDDRelPK pKey = new VLegalDDRelPK(departmentId, docId);

		VLegalDDRelUtil.remove(pKey);
	}

	public void deleteRelByDepartment(long departmentId) throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(String.valueOf(departmentId))) {
			return;
		}
		VLegalDDRelUtil.removeByDepartament(departmentId);
	}

	public void deleteRelByDoc(String docId) throws RemoteException, SystemException, PortalException {

		if (Validator.isNull(docId)) {
			return;
		}

		VLegalDDRelUtil.removeByDoc(docId);
	}

	public List getRelByDoc(String docId) throws RemoteException, SystemException, PortalException {

		List rels = new ArrayList();
		if (Validator.isNull(docId)) {
			return rels;
		}

		rels = VLegalDDRelUtil.findByDoc(docId);

		return rels;
	}

	public List getRelByDepartment(long departmentId) throws RemoteException, SystemException, PortalException {

		List rels = new ArrayList();

		if (Validator.isNull(String.valueOf(departmentId))) {
			return rels;
		}

		rels = VLegalDDRelUtil.findByDepartament(departmentId);

		return rels;
	}
}