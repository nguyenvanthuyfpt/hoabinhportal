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

package vn.gov.hoabinh.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import vn.gov.hoabinh.model.VcmsCARelation;
import vn.gov.hoabinh.service.persistence.VcmsCARelationPK;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.List;

/**
 * Provides the local service interface for VcmsCARelation. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCARelationLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.VcmsCARelationLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VcmsCARelationLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VcmsCARelationLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsCARelationLocalServiceUtil} to access the vcms c a relation local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VcmsCARelationLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public DynamicQuery dynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	public int countArticlesOfCategory(java.lang.String categoryId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the number of vcms c a relations.
	*
	* @return the number of vcms c a relations
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVcmsCARelationsCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsCARelation> getRelationsByArticle(
		java.lang.String articleId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsCARelation> getRelationsByCategory(
		java.lang.String categoryId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns a range of all the vcms c a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @return the range of vcms c a relations
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsCARelation> getVcmsCARelations(int start, int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	public VcmsCARelation addRelation(java.lang.String categoryId,
		java.lang.String articleId, long statusId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the vcms c a relation to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCARelation the vcms c a relation
	* @return the vcms c a relation that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VcmsCARelation addVcmsCARelation(VcmsCARelation vcmsCARelation);

	/**
	* Creates a new vcms c a relation with the primary key. Does not add the vcms c a relation to the database.
	*
	* @param vcmsCARelationPK the primary key for the new vcms c a relation
	* @return the new vcms c a relation
	*/
	public VcmsCARelation createVcmsCARelation(
		VcmsCARelationPK vcmsCARelationPK);

	/**
	* Deletes the vcms c a relation from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCARelation the vcms c a relation
	* @return the vcms c a relation that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VcmsCARelation deleteVcmsCARelation(VcmsCARelation vcmsCARelation);

	/**
	* Deletes the vcms c a relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCARelationPK the primary key of the vcms c a relation
	* @return the vcms c a relation that was removed
	* @throws PortalException if a vcms c a relation with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VcmsCARelation deleteVcmsCARelation(
		VcmsCARelationPK vcmsCARelationPK) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VcmsCARelation fetchVcmsCARelation(VcmsCARelationPK vcmsCARelationPK);

	public VcmsCARelation findRelationsByArticle(java.lang.String articleId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the vcms c a relation with the primary key.
	*
	* @param vcmsCARelationPK the primary key of the vcms c a relation
	* @return the vcms c a relation
	* @throws PortalException if a vcms c a relation with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VcmsCARelation getVcmsCARelation(VcmsCARelationPK vcmsCARelationPK)
		throws PortalException;

	/**
	* Updates the vcms c a relation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsCARelation the vcms c a relation
	* @return the vcms c a relation that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VcmsCARelation updateVcmsCARelation(VcmsCARelation vcmsCARelation);

	public void deleteRelation(java.lang.String categoryId,
		java.lang.String articleId)
		throws PortalException, SystemException, RemoteException;

	public void deleteRelationsByArticle(java.lang.String articleId)
		throws PortalException, SystemException, RemoteException;

	public void deleteRelationsByCategory(java.lang.String categoryId)
		throws PortalException, SystemException, RemoteException;
}