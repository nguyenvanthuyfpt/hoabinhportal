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

import vn.gov.hoabinh.model.ClipType;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.List;

/**
 * Provides the local service interface for ClipType. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ClipTypeLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.ClipTypeLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.ClipTypeLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ClipTypeLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ClipTypeLocalServiceUtil} to access the clip type local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.ClipTypeLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

	public int countClipTypeByG_L_A(long groupId, java.lang.String language,
		boolean active) throws java.lang.Exception;

	/**
	* Returns the number of clip types.
	*
	* @return the number of clip types
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getClipTypesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<ClipType> getCategoryMenu(java.lang.String[] ids);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ClipType> getClipTypeByG_L_A(long groupId,
		java.lang.String language, boolean active) throws java.lang.Exception;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ClipType> getClipTypeByG_L_A(long groupId,
		java.lang.String language, boolean active, int begin, int end)
		throws java.lang.Exception;

	/**
	* Returns a range of all the clip types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.ClipTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clip types
	* @param end the upper bound of the range of clip types (not inclusive)
	* @return the range of clip types
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ClipType> getClipTypes(int start, int end);

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

	public ClipType addClipType(long groupId, java.lang.String language,
		long companyId, long plid, long userId, java.lang.String title,
		java.lang.String name, java.lang.String description, boolean active)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the clip type to the database. Also notifies the appropriate model listeners.
	*
	* @param clipType the clip type
	* @return the clip type that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ClipType addClipType(ClipType clipType);

	/**
	* Creates a new clip type with the primary key. Does not add the clip type to the database.
	*
	* @param id the primary key for the new clip type
	* @return the new clip type
	*/
	public ClipType createClipType(java.lang.String id);

	/**
	* Deletes the clip type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the clip type
	* @return the clip type that was removed
	* @throws PortalException if a clip type with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public ClipType deleteClipType(java.lang.String id)
		throws PortalException;

	/**
	* Deletes the clip type from the database. Also notifies the appropriate model listeners.
	*
	* @param clipType the clip type
	* @return the clip type that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public ClipType deleteClipType(ClipType clipType);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ClipType fetchClipType(java.lang.String id);

	/**
	* Returns the clip type with the primary key.
	*
	* @param id the primary key of the clip type
	* @return the clip type
	* @throws PortalException if a clip type with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ClipType getClipType(java.lang.String id) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ClipType getClipType(long typeId) throws java.lang.Exception;

	public ClipType updateClipType(java.lang.String clipTypeId, long groupId,
		java.lang.String language, long companyId, java.lang.String title,
		java.lang.String name, java.lang.String description, boolean active)
		throws PortalException, SystemException, RemoteException;

	/**
	* Updates the clip type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param clipType the clip type
	* @return the clip type that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ClipType updateClipType(ClipType clipType);

	public void deleteClipType(long clipTypeId) throws java.lang.Exception;
}