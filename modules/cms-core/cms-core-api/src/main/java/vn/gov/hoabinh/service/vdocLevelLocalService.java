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

import vn.gov.hoabinh.model.vdocLevel;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.List;

/**
 * Provides the local service interface for vdocLevel. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see vdocLevelLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.vdocLevelLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.vdocLevelLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface vdocLevelLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link vdocLevelLocalServiceUtil} to access the vdoc level local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.vdocLevelLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

	public int countLevelByG_L(long groupId, java.lang.String language)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the number of vdoc levels.
	*
	* @return the number of vdoc levels
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getvdocLevelsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<vdocLevel> getLevelByG_L(long groupId, java.lang.String language)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocLevel> getLevelByG_L(long groupId,
		java.lang.String language, int begin, int end)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns a range of all the vdoc levels.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocLevelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc levels
	* @param end the upper bound of the range of vdoc levels (not inclusive)
	* @return the range of vdoc levels
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocLevel> getvdocLevels(int start, int end);

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

	public vdocLevel addLevel(long groupId, long userId,
		java.lang.String language, java.lang.String name,
		java.lang.String description, int position)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the vdoc level to the database. Also notifies the appropriate model listeners.
	*
	* @param vdocLevel the vdoc level
	* @return the vdoc level that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public vdocLevel addvdocLevel(vdocLevel vdocLevel);

	/**
	* Creates a new vdoc level with the primary key. Does not add the vdoc level to the database.
	*
	* @param levelId the primary key for the new vdoc level
	* @return the new vdoc level
	*/
	public vdocLevel createvdocLevel(java.lang.String levelId);

	/**
	* Deletes the vdoc level with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param levelId the primary key of the vdoc level
	* @return the vdoc level that was removed
	* @throws PortalException if a vdoc level with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public vdocLevel deletevdocLevel(java.lang.String levelId)
		throws PortalException;

	/**
	* Deletes the vdoc level from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocLevel the vdoc level
	* @return the vdoc level that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public vdocLevel deletevdocLevel(vdocLevel vdocLevel);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vdocLevel fetchvdocLevel(java.lang.String levelId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vdocLevel getLevel(java.lang.String levelId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the vdoc level with the primary key.
	*
	* @param levelId the primary key of the vdoc level
	* @return the vdoc level
	* @throws PortalException if a vdoc level with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vdocLevel getvdocLevel(java.lang.String levelId)
		throws PortalException;

	public vdocLevel updateLevel(java.lang.String levelId, long groupId,
		long userId, java.lang.String language, java.lang.String name,
		java.lang.String description, int position)
		throws PortalException, SystemException, RemoteException;

	/**
	* Updates the vdoc level in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vdocLevel the vdoc level
	* @return the vdoc level that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public vdocLevel updatevdocLevel(vdocLevel vdocLevel);

	public void deleteLevel(java.lang.String levelId, ThemeDisplay themeDisplay)
		throws PortalException, SystemException, RemoteException;
}