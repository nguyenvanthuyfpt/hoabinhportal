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

import vn.gov.hoabinh.model.VLegalField;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.List;

/**
 * Provides the local service interface for VLegalField. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFieldLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.VLegalFieldLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalFieldLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VLegalFieldLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalFieldLocalServiceUtil} to access the v legal field local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalFieldLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

	public int countFieldByGroupId(long groupId) throws SystemException;

	/**
	* Returns the number of v legal fields.
	*
	* @return the number of v legal fields
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVLegalFieldsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List getAllFields()
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalField> getFieldByGroupId(long groupId)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalField> getFieldByGroupId(long groupId, int begin, int end)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalField> getVFieldByS_L(long groupId, boolean status,
		java.lang.String language)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalField> getVFieldByS_Rss(long groupId, boolean status,
		boolean rssable)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns a range of all the v legal fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal fields
	* @param end the upper bound of the range of v legal fields (not inclusive)
	* @return the range of v legal fields
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalField> getVLegalFields(int start, int end);

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

	public VLegalField addField(long groupId, java.lang.String name,
		java.lang.String description, java.lang.String language,
		boolean status, boolean rssable, ThemeDisplay themeDisplay)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the v legal field to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalField the v legal field
	* @return the v legal field that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalField addVLegalField(VLegalField vLegalField);

	/**
	* Creates a new v legal field with the primary key. Does not add the v legal field to the database.
	*
	* @param fieldId the primary key for the new v legal field
	* @return the new v legal field
	*/
	public VLegalField createVLegalField(java.lang.String fieldId);

	/**
	* Deletes the v legal field with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fieldId the primary key of the v legal field
	* @return the v legal field that was removed
	* @throws PortalException if a v legal field with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalField deleteVLegalField(java.lang.String fieldId)
		throws PortalException;

	/**
	* Deletes the v legal field from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalField the v legal field
	* @return the v legal field that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalField deleteVLegalField(VLegalField vLegalField);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalField fetchVLegalField(java.lang.String fieldId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalField getVField(java.lang.String fieldId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalField getVField(long groupId, java.lang.String fieldId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the v legal field with the primary key.
	*
	* @param fieldId the primary key of the v legal field
	* @return the v legal field
	* @throws PortalException if a v legal field with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalField getVLegalField(java.lang.String fieldId)
		throws PortalException;

	public VLegalField updateField(long groupId, java.lang.String fieldId,
		java.lang.String name, java.lang.String description,
		java.lang.String language, boolean status, boolean rss)
		throws PortalException, SystemException, RemoteException;

	/**
	* Updates the v legal field in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalField the v legal field
	* @return the v legal field that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalField updateVLegalField(VLegalField vLegalField);

	public void deleteField(java.lang.String fieldId)
		throws PortalException, SystemException, RemoteException;
}