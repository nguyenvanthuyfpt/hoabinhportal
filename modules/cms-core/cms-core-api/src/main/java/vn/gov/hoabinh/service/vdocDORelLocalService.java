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

import vn.gov.hoabinh.model.vdocDORel;
import vn.gov.hoabinh.service.persistence.vdocDORelPK;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.List;

/**
 * Provides the local service interface for vdocDORel. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see vdocDORelLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.vdocDORelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.vdocDORelLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface vdocDORelLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link vdocDORelLocalServiceUtil} to access the vdoc d o rel local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.vdocDORelLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

	/**
	* Returns the number of vdoc d o rels.
	*
	* @return the number of vdoc d o rels
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getvdocDORelsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List getRelByDoc(java.lang.String docId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getRelByField(java.lang.String orgId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns a range of all the vdoc d o rels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocDORelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc d o rels
	* @param end the upper bound of the range of vdoc d o rels (not inclusive)
	* @return the range of vdoc d o rels
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocDORel> getvdocDORels(int start, int end);

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

	public vdocDORel addRelation(java.lang.String docId, java.lang.String orgId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the vdoc d o rel to the database. Also notifies the appropriate model listeners.
	*
	* @param vdocDORel the vdoc d o rel
	* @return the vdoc d o rel that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public vdocDORel addvdocDORel(vdocDORel vdocDORel);

	/**
	* Creates a new vdoc d o rel with the primary key. Does not add the vdoc d o rel to the database.
	*
	* @param vdocDORelPK the primary key for the new vdoc d o rel
	* @return the new vdoc d o rel
	*/
	public vdocDORel createvdocDORel(vdocDORelPK vdocDORelPK);

	/**
	* Deletes the vdoc d o rel from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocDORel the vdoc d o rel
	* @return the vdoc d o rel that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public vdocDORel deletevdocDORel(vdocDORel vdocDORel);

	/**
	* Deletes the vdoc d o rel with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocDORelPK the primary key of the vdoc d o rel
	* @return the vdoc d o rel that was removed
	* @throws PortalException if a vdoc d o rel with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public vdocDORel deletevdocDORel(vdocDORelPK vdocDORelPK)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vdocDORel fetchvdocDORel(vdocDORelPK vdocDORelPK);

	/**
	* Returns the vdoc d o rel with the primary key.
	*
	* @param vdocDORelPK the primary key of the vdoc d o rel
	* @return the vdoc d o rel
	* @throws PortalException if a vdoc d o rel with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vdocDORel getvdocDORel(vdocDORelPK vdocDORelPK)
		throws PortalException;

	/**
	* Updates the vdoc d o rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vdocDORel the vdoc d o rel
	* @return the vdoc d o rel that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public vdocDORel updatevdocDORel(vdocDORel vdocDORel);

	public void deleteRelByDoc(java.lang.String docId)
		throws PortalException, SystemException, RemoteException;

	public void deleteRelByOrg(java.lang.String orgId)
		throws PortalException, SystemException, RemoteException;

	public void deleteRelation(java.lang.String docId, java.lang.String orgId)
		throws PortalException, SystemException, RemoteException;
}