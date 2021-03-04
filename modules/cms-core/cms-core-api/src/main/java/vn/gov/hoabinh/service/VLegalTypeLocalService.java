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

import vn.gov.hoabinh.model.VLegalType;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.List;

/**
 * Provides the local service interface for VLegalType. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTypeLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.VLegalTypeLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalTypeLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VLegalTypeLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalTypeLocalServiceUtil} to access the v legal type local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalTypeLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

	public int countTypeByGroupId(long groupId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the number of v legal types.
	*
	* @return the number of v legal types
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVLegalTypesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<VLegalType> getAllTypes()
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalType> getTypeByGroupId(long groupId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalType> getTypeByGroupId(long groupId, int begin, int end)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalType> getTypesByL_RSS(long groupId, boolean status,
		boolean rss) throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalType> getTypesByL_S(long groupId,
		java.lang.String language, boolean status)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns a range of all the v legal types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal types
	* @param end the upper bound of the range of v legal types (not inclusive)
	* @return the range of v legal types
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalType> getVLegalTypes(int start, int end);

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

	public VLegalType addType(long groupId, java.lang.String name,
		java.lang.String description, java.lang.String language,
		boolean status, boolean rssable, ThemeDisplay themeDisplay)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the v legal type to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalType the v legal type
	* @return the v legal type that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalType addVLegalType(VLegalType vLegalType);

	/**
	* Creates a new v legal type with the primary key. Does not add the v legal type to the database.
	*
	* @param typeId the primary key for the new v legal type
	* @return the new v legal type
	*/
	public VLegalType createVLegalType(java.lang.String typeId);

	/**
	* Deletes the v legal type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the v legal type
	* @return the v legal type that was removed
	* @throws PortalException if a v legal type with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalType deleteVLegalType(java.lang.String typeId)
		throws PortalException;

	/**
	* Deletes the v legal type from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalType the v legal type
	* @return the v legal type that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalType deleteVLegalType(VLegalType vLegalType);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalType fetchVLegalType(java.lang.String typeId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalType getType(java.lang.String typeId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalType getType(long groupId, java.lang.String typeId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the v legal type with the primary key.
	*
	* @param typeId the primary key of the v legal type
	* @return the v legal type
	* @throws PortalException if a v legal type with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalType getVLegalType(java.lang.String typeId)
		throws PortalException;

	public VLegalType updateType(long groupId, java.lang.String typeId,
		java.lang.String language, java.lang.String name,
		java.lang.String description, int position, boolean status,
		boolean rssable)
		throws PortalException, SystemException, RemoteException;

	public VLegalType updateType(VLegalType lType)
		throws PortalException, SystemException, RemoteException;

	/**
	* Updates the v legal type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalType the v legal type
	* @return the v legal type that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalType updateVLegalType(VLegalType vLegalType);

	public void addEntryResources(long entryId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws PortalException, SystemException;

	public void addEntryResources(long entryId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws PortalException, SystemException;

	public void addEntryResources(VLegalType entry,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws PortalException, SystemException;

	public void addEntryResources(VLegalType entry,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws PortalException, SystemException;

	public void deleteType(java.lang.String typeId)
		throws PortalException, SystemException, RemoteException;

	public void deleteTypeAndDocs(java.lang.String typeId)
		throws PortalException, SystemException, RemoteException;
}