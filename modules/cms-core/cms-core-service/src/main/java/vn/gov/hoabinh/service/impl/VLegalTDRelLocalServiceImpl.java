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
import vn.gov.hoabinh.model.VLegalTDRel;
import vn.gov.hoabinh.service.base.VLegalTDRelLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VLegalTDRelPK;
import vn.gov.hoabinh.service.persistence.VLegalTDRelUtil;

/**
 * The implementation of the v legal t d rel local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VLegalTDRelLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTDRelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VLegalTDRelLocalServiceUtil
 */
@ProviderType
public class VLegalTDRelLocalServiceImpl extends VLegalTDRelLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VLegalTDRelLocalServiceUtil} to access the v legal
	 * t d rel local service.
	 */

	public VLegalTDRel addRelation(String docId, String tagId)
			throws RemoteException, SystemException, PortalException {

		VLegalTDRel relation = null;

		VLegalTDRelPK pKey = new VLegalTDRelPK(docId, tagId);

		relation = VLegalTDRelUtil.create(pKey);

		return VLegalTDRelUtil.update(relation);
	}

	public void deleteRelation(String docId, String tagId) throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(docId) || Validator.isNull(tagId)) {
			return;
		}

		VLegalTDRelPK pKey = new VLegalTDRelPK(docId, tagId);

		VLegalTDRelUtil.remove(pKey);
	}

	public void deleteRelByDoc(String docId) throws RemoteException, PortalException, SystemException {

		if (Validator.isNull(docId)) {
			return;
		}
		VLegalTDRelUtil.removeByDocument(docId);
	}

	public void deleteRelByTag(String tagId) throws RemoteException, SystemException, PortalException {

		if (Validator.isNull(tagId)) {
			return;
		}

		VLegalTDRelUtil.removeByTag(tagId);

	}

	public List getRelByDoc(String docId) throws RemoteException, SystemException, PortalException {
		List rels = new ArrayList();

		if (Validator.isNull(docId)) {
			return rels;
		}

		rels = VLegalTDRelUtil.findByDocument(docId);

		return rels;

	}

	public List getRelByTag(String tagId) throws RemoteException, SystemException, PortalException {

		List rels = new ArrayList();

		if (Validator.isNull(tagId)) {
			return rels;
		}

		rels = VLegalTDRelUtil.findByTag(tagId);

		return rels;

	}
}