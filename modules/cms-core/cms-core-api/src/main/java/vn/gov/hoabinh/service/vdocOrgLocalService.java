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
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import vn.gov.hoabinh.model.vdocOrg;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.List;

/**
 * Provides the local service interface for vdocOrg. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see vdocOrgLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.vdocOrgLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.vdocOrgLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface vdocOrgLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link vdocOrgLocalServiceUtil} to access the vdoc org local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.vdocOrgLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

	public int countOrgByG_L(long groupId, java.lang.String language)
		throws PortalException, SystemException, RemoteException;

	public int countOrgByG_L(long groupId, java.lang.String language,
		java.lang.String parentId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the number of vdoc orgs.
	*
	* @return the number of vdoc orgs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getvdocOrgsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<vdocOrg> getOrgByG_L(long groupId, java.lang.String language)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocOrg> getOrgByG_L(long groupId, java.lang.String language,
		int begin, int end)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocOrg> getOrgByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocOrg> getOrgByG_L_P(long groupId, java.lang.String language,
		java.lang.String parentId, int begin, int end)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocOrg> getOrgByParentId(java.lang.String parentId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns a range of all the vdoc orgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocOrgModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc orgs
	* @param end the upper bound of the range of vdoc orgs (not inclusive)
	* @return the range of vdoc orgs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocOrg> getvdocOrgs(int start, int end);

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

	public vdocOrg addOrg(long groupId, java.lang.String language, long userId,
		long companyId, java.lang.String parentId, java.lang.String code,
		java.lang.String name, java.lang.String description,
		java.lang.String address, java.lang.String phone, java.lang.String fax,
		boolean statusOrg, int position, java.lang.String listparent)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the vdoc org to the database. Also notifies the appropriate model listeners.
	*
	* @param vdocOrg the vdoc org
	* @return the vdoc org that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public vdocOrg addvdocOrg(vdocOrg vdocOrg);

	/**
	* Creates a new vdoc org with the primary key. Does not add the vdoc org to the database.
	*
	* @param orgId the primary key for the new vdoc org
	* @return the new vdoc org
	*/
	public vdocOrg createvdocOrg(java.lang.String orgId);

	/**
	* Deletes the vdoc org with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orgId the primary key of the vdoc org
	* @return the vdoc org that was removed
	* @throws PortalException if a vdoc org with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public vdocOrg deletevdocOrg(java.lang.String orgId)
		throws PortalException;

	/**
	* Deletes the vdoc org from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocOrg the vdoc org
	* @return the vdoc org that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public vdocOrg deletevdocOrg(vdocOrg vdocOrg);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vdocOrg fetchvdocOrg(java.lang.String orgId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vdocOrg getOrg(java.lang.String orgId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the vdoc org with the primary key.
	*
	* @param orgId the primary key of the vdoc org
	* @return the vdoc org
	* @throws PortalException if a vdoc org with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vdocOrg getvdocOrg(java.lang.String orgId) throws PortalException;

	public vdocOrg updateOrg(java.lang.String orgId, long groupId,
		java.lang.String language, long userId, java.lang.String parentId,
		java.lang.String code, java.lang.String name,
		java.lang.String description, java.lang.String address,
		java.lang.String phone, java.lang.String fax, boolean statusOrg,
		int position, java.lang.String listparent, ThemeDisplay themeDisplay)
		throws PortalException, SystemException, RemoteException;

	/**
	* Updates the vdoc org in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vdocOrg the vdoc org
	* @return the vdoc org that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public vdocOrg updatevdocOrg(vdocOrg vdocOrg);
}