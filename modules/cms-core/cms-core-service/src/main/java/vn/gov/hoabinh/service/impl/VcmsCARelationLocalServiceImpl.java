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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.VcmsCARelation;
import vn.gov.hoabinh.model.VcmsCategory;
import vn.gov.hoabinh.service.base.VcmsCARelationLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VcmsCARelationPK;
import vn.gov.hoabinh.util.PortalUtil;

/**
 * The implementation of the vcms c a relation local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VcmsCARelationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCARelationLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VcmsCARelationLocalServiceUtil
 */
@ProviderType
public class VcmsCARelationLocalServiceImpl extends VcmsCARelationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VcmsCARelationLocalServiceUtil} to access the vcms
	 * c a relation local service.
	 */

	public VcmsCARelation addRelation(String categoryId, String articleId, long statusId)
			throws PortalException, SystemException, RemoteException {
		String userId = PortalUtil.getUserId();
		VcmsCARelation relation = null;
		VcmsCARelationPK primaryKey = new VcmsCARelationPK(categoryId, articleId);
		
		relation = vcmsCARelationPersistence.create(primaryKey);
		relation.setCreatedDate(new Date());
		relation.setCreatedByUser(userId);
		relation.setStatus(statusId);

		return vcmsCARelationPersistence.update(relation, null);
	}

	public void deleteRelation(String categoryId, String articleId)
			throws PortalException, SystemException, RemoteException {

		VcmsCARelationPK primaryKey = new VcmsCARelationPK(categoryId, articleId);

		vcmsCARelationPersistence.remove(primaryKey);
	}

	public void deleteRelationsByCategory(String categoryId) throws PortalException, SystemException, RemoteException {

		vcmsCARelationPersistence.removeByCategory(categoryId);
	}

	public void deleteRelationsByArticle(String articleId) throws PortalException, SystemException, RemoteException {

		vcmsCARelationPersistence.removeByArticle(articleId);
	}

	public List<VcmsCARelation> getRelationsByCategory(String categoryId) throws PortalException, SystemException, RemoteException {

		return vcmsCARelationPersistence.findByCategory(categoryId);
	}

	public List<VcmsCARelation> getRelationsByArticle(String articleId) throws PortalException, SystemException, RemoteException {

		return vcmsCARelationPersistence.findByArticle(articleId);
	}

	public int countArticlesOfCategory(String categoryId) throws PortalException, SystemException, RemoteException {
		return vcmsCARelationPersistence.countByCategory(categoryId);
	}

	public VcmsCARelation findRelationsByArticle(String articleId)
			throws PortalException, SystemException, RemoteException {
		VcmsCARelation vcmsCARelation = null;
		List list = vcmsCARelationPersistence.findByArticle(articleId, 0, 1);
		if (list.size() > 0) {
			vcmsCARelation = (VcmsCARelation) list.get(0);
		}
		return vcmsCARelation;
	}
}