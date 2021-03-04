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
import vn.gov.hoabinh.model.vdocDORel;
import vn.gov.hoabinh.service.base.vdocDORelLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.vdocDORelPK;
import vn.gov.hoabinh.service.persistence.vdocDORelUtil;

/**
 * The implementation of the vdoc d o rel local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.vdocDORelLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocDORelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.vdocDORelLocalServiceUtil
 */
@ProviderType
public class vdocDORelLocalServiceImpl extends vdocDORelLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.vdocDORelLocalServiceUtil} to access the vdoc d o
	 * rel local service.
	 */
	public vdocDORel addRelation(String docId, String orgId) throws RemoteException, SystemException, PortalException {

		vdocDORel relation = null;

		vdocDORelPK pKey = new vdocDORelPK(docId, orgId);

		relation = vdocDORelUtil.create(pKey);

		return vdocDORelUtil.update(relation);

	}

	public void deleteRelation(String docId, String orgId) throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(orgId) || Validator.isNull(docId)) {
			return;
		}

		vdocDORelPK pKey = new vdocDORelPK(docId, orgId);

		vdocDORelUtil.remove(pKey);
	}

	public void deleteRelByDoc(String docId) throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(docId)) {
			return;
		}
		vdocDORelUtil.removeByDocument(docId);
	}

	public void deleteRelByOrg(String orgId) throws RemoteException, SystemException, PortalException {

		if (Validator.isNull(orgId)) {
			return;
		}

		vdocDORelUtil.removeByOrg(orgId);

	}

	public List getRelByDoc(String docId) throws RemoteException, SystemException, PortalException {

		List rels = new ArrayList();

		if (Validator.isNull(docId)) {
			return rels;
		}

		rels = vdocDORelUtil.findByDocument(docId);

		return rels;

	}

	public List getRelByField(String orgId) throws RemoteException, SystemException, PortalException {

		List rels = new ArrayList();

		if (Validator.isNull(orgId)) {
			return rels;
		}

		rels = vdocDORelUtil.findByOrg(orgId);

		return rels;

	}
}