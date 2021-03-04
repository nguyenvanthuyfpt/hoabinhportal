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

import vn.gov.hoabinh.model.vdocFieldLevelRel;
import vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.List;

/**
 * Provides the local service interface for vdocFieldLevelRel. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see vdocFieldLevelRelLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.vdocFieldLevelRelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.vdocFieldLevelRelLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface vdocFieldLevelRelLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link vdocFieldLevelRelLocalServiceUtil} to access the vdoc field level rel local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.vdocFieldLevelRelLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

	public int countRelationByField(java.lang.String fieldId)
		throws PortalException, SystemException, RemoteException;

	public int countRelationByLevel(java.lang.String levelId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the number of vdoc field level rels.
	*
	* @return the number of vdoc field level rels
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getvdocFieldLevelRelsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List getRelationByField(java.lang.String fieldId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getRelationByLevel(java.lang.String levelId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns a range of all the vdoc field level rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocFieldLevelRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc field level rels
	* @param end the upper bound of the range of vdoc field level rels (not inclusive)
	* @return the range of vdoc field level rels
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocFieldLevelRel> getvdocFieldLevelRels(int start, int end);

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

	public vdocFieldLevelRel addRelation(java.lang.String fieldId,
		java.lang.String levelId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the vdoc field level rel to the database. Also notifies the appropriate model listeners.
	*
	* @param vdocFieldLevelRel the vdoc field level rel
	* @return the vdoc field level rel that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public vdocFieldLevelRel addvdocFieldLevelRel(
		vdocFieldLevelRel vdocFieldLevelRel);

	/**
	* Creates a new vdoc field level rel with the primary key. Does not add the vdoc field level rel to the database.
	*
	* @param vdocFieldLevelRelPK the primary key for the new vdoc field level rel
	* @return the new vdoc field level rel
	*/
	public vdocFieldLevelRel createvdocFieldLevelRel(
		vdocFieldLevelRelPK vdocFieldLevelRelPK);

	/**
	* Deletes the vdoc field level rel from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocFieldLevelRel the vdoc field level rel
	* @return the vdoc field level rel that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public vdocFieldLevelRel deletevdocFieldLevelRel(
		vdocFieldLevelRel vdocFieldLevelRel);

	/**
	* Deletes the vdoc field level rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocFieldLevelRelPK the primary key of the vdoc field level rel
	* @return the vdoc field level rel that was removed
	* @throws PortalException if a vdoc field level rel with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public vdocFieldLevelRel deletevdocFieldLevelRel(
		vdocFieldLevelRelPK vdocFieldLevelRelPK) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vdocFieldLevelRel fetchvdocFieldLevelRel(
		vdocFieldLevelRelPK vdocFieldLevelRelPK);

	/**
	* Returns the vdoc field level rel with the primary key.
	*
	* @param vdocFieldLevelRelPK the primary key of the vdoc field level rel
	* @return the vdoc field level rel
	* @throws PortalException if a vdoc field level rel with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vdocFieldLevelRel getvdocFieldLevelRel(
		vdocFieldLevelRelPK vdocFieldLevelRelPK) throws PortalException;

	/**
	* Updates the vdoc field level rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vdocFieldLevelRel the vdoc field level rel
	* @return the vdoc field level rel that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public vdocFieldLevelRel updatevdocFieldLevelRel(
		vdocFieldLevelRel vdocFieldLevelRel);

	public void deleteRelationByField(java.lang.String fieldId)
		throws PortalException, SystemException, RemoteException;
}