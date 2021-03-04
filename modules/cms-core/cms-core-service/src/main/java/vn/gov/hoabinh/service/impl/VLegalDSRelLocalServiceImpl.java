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
import vn.gov.hoabinh.model.VLegalDSRel;
import vn.gov.hoabinh.service.base.VLegalDSRelLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VLegalDFRelUtil;
import vn.gov.hoabinh.service.persistence.VLegalDSRelPK;
import vn.gov.hoabinh.service.persistence.VLegalDSRelUtil;

/**
 * The implementation of the v legal d s rel local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VLegalDSRelLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDSRelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VLegalDSRelLocalServiceUtil
 */
@ProviderType
public class VLegalDSRelLocalServiceImpl extends VLegalDSRelLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VLegalDSRelLocalServiceUtil} to access the v legal
	 * d s rel local service.
	 */

	public VLegalDSRel addRelation(String docId, String sigId)
			throws RemoteException, SystemException, PortalException {
		VLegalDSRel relation = null;
		VLegalDSRelPK pKey = new VLegalDSRelPK(sigId, docId);
		relation = VLegalDSRelUtil.create(pKey);
		return vLegalDSRelPersistence.update(relation);

	}

	public void deleteRelation(String docId, String sigId) throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(sigId) || Validator.isNull(docId)) {
			return;
		}

		VLegalDSRelPK pKey = new VLegalDSRelPK(sigId, docId);
		vLegalDSRelPersistence.remove(pKey);
	}

	public void deleteRelBySigner(String sigId) throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(sigId)) {
			return;
		}
		VLegalDSRelUtil.removeBySigner(sigId);
	}

	public void deleteRelByDoc(String docId) throws RemoteException, SystemException, PortalException {

		if (Validator.isNull(docId)) {
			return;
		}
		vLegalDSRelPersistence.removeByDoc(docId);
	}

	public List getRelByDoc(String docId) throws RemoteException, SystemException, PortalException {
		return vLegalDSRelPersistence.findByDoc(docId);
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