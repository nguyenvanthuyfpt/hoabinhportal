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
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.VcmsPARelation;
import vn.gov.hoabinh.service.base.VcmsPARelationLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VcmsPARelationPK;
import vn.gov.hoabinh.service.persistence.VcmsPARelationUtil;

/**
 * The implementation of the vcms p a relation local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VcmsPARelationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsPARelationLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VcmsPARelationLocalServiceUtil
 */
@ProviderType
public class VcmsPARelationLocalServiceImpl extends VcmsPARelationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VcmsPARelationLocalServiceUtil} to access the vcms
	 * p a relation local service.
	 */

	public VcmsPARelation addRelation(String portionId, String articleId)
			throws PortalException, SystemException, RemoteException {

		VcmsPARelation relation = null;

		VcmsPARelationPK primaryKey = new VcmsPARelationPK(portionId, articleId);

		relation = VcmsPARelationUtil.create(primaryKey);

		return vcmsPARelationPersistence.update(relation, null);
	}

	public void deleteRelation(String portionId, String articleId)
			throws PortalException, SystemException, RemoteException {

		VcmsPARelationPK primaryKey = new VcmsPARelationPK(portionId, articleId);

		VcmsPARelationUtil.remove(primaryKey);
	}

	public void deleteRelationsByPortion(String portionId) throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(portionId)) {
			return;
		}

		vcmsPARelationPersistence.removeByPortion(portionId);
	}

	public void deleteRelationsByArticle(String articleId) throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(articleId)) {
			return;
		}

		vcmsPARelationPersistence.removeByArticle(articleId);
	}

	public List getRelationsByPortion(String portionId) throws PortalException, SystemException, RemoteException {

		return vcmsPARelationPersistence.findByPortion(portionId);
	}

	public List getRelationsByArticle(String articleId) throws PortalException, SystemException, RemoteException {

		return vcmsPARelationPersistence.findByArticle(articleId);
	}
}