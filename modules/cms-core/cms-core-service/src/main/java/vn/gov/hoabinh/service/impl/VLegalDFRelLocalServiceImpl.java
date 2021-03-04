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
import vn.gov.hoabinh.model.VLegalDFRel;
import vn.gov.hoabinh.service.base.VLegalDFRelLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VLegalDFRelPK;
import vn.gov.hoabinh.service.persistence.VLegalDFRelUtil;

/**
 * The implementation of the v legal d f rel local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VLegalDFRelLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDFRelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VLegalDFRelLocalServiceUtil
 */
@ProviderType
public class VLegalDFRelLocalServiceImpl extends VLegalDFRelLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VLegalDFRelLocalServiceUtil} to access the v legal
	 * d f rel local service.
	 */
	public VLegalDFRel addRelation(String docId, String fieldId)
			throws RemoteException, SystemException, PortalException {

		VLegalDFRel relation = null;

		VLegalDFRelPK pKey = new VLegalDFRelPK(fieldId, docId);

		relation = VLegalDFRelUtil.create(pKey);

		return VLegalDFRelUtil.update(relation);
	}

	public void deleteRelation(String docId, String fieldId) throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(fieldId) || Validator.isNull(docId)) {
			return;
		}

		VLegalDFRelPK pKey = new VLegalDFRelPK(fieldId, docId);

		VLegalDFRelUtil.remove(pKey);
	}

	public void deleteRelByField(String fieldId) throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(fieldId)) {
			return;
		}
		VLegalDFRelUtil.removeByField(fieldId);
	}

	public void deleteRelByDoc(String docId) throws RemoteException, SystemException, PortalException {

		if (Validator.isNull(docId)) {
			return;
		}

		VLegalDFRelUtil.removeByDoc(docId);

	}

	public List getRelByDoc(String docId) throws RemoteException, SystemException, PortalException {
		List rels = new ArrayList();

		if (Validator.isNull(docId)) {
			return rels;
		}

		rels = VLegalDFRelUtil.findByDoc(docId);

		return rels;

	}

	public List getRelByField(String fieldId) throws RemoteException, SystemException, PortalException {

		List rels = new ArrayList();

		if (Validator.isNull(fieldId)) {
			return rels;
		}

		rels = VLegalDFRelUtil.findByField(fieldId);

		return rels;

	}
}