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
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.vdocFieldLevelRel;
import vn.gov.hoabinh.service.base.vdocFieldLevelRelLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK;
import vn.gov.hoabinh.service.persistence.vdocFieldLevelRelUtil;

/**
 * The implementation of the vdoc field level rel local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.vdocFieldLevelRelLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocFieldLevelRelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.vdocFieldLevelRelLocalServiceUtil
 */
@ProviderType
public class vdocFieldLevelRelLocalServiceImpl extends vdocFieldLevelRelLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.vdocFieldLevelRelLocalServiceUtil} to access the
	 * vdoc field level rel local service.
	 */

	public vdocFieldLevelRel addRelation(String fieldId, String levelId)
			throws RemoteException, SystemException, PortalException {

		vdocFieldLevelRel relation = null;

		vdocFieldLevelRelPK pKey = new vdocFieldLevelRelPK(fieldId, levelId);

		relation = vdocFieldLevelRelUtil.create(pKey);

		return vdocFieldLevelRelUtil.update(relation);
	}

	public List getRelationByField(String fieldId) throws RemoteException, SystemException, PortalException {
		return vdocFieldLevelRelPersistence.findByField(fieldId);
	}

	public int countRelationByField(String fieldId) throws RemoteException, SystemException, PortalException {
		return vdocFieldLevelRelPersistence.countByField(fieldId);
	}

	public List getRelationByLevel(String levelId) throws RemoteException, SystemException, PortalException {
		return vdocFieldLevelRelPersistence.findByLevel(levelId);
	}

	public int countRelationByLevel(String levelId) throws RemoteException, SystemException, PortalException {
		return vdocFieldLevelRelPersistence.countByLevel(levelId);
	}

	public void deleteRelationByField(String fieldId) throws RemoteException, SystemException, PortalException {
		vdocFieldLevelRelPersistence.removeByField(fieldId);
	}
}