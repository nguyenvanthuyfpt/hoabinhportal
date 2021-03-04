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

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
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

import vn.gov.hoabinh.model.AdvItem;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.Date;
import java.util.List;

/**
 * Provides the local service interface for AdvItem. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see AdvItemLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.AdvItemLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.AdvItemLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface AdvItemLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AdvItemLocalServiceUtil} to access the adv item local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.AdvItemLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery buildSearch(long groupId, long typeId,
		java.lang.String desc, int status, boolean isCount);

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

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

	public int countItem(long groupId, long typeId, java.lang.String desc,
		int status);

	public int countItemByG(long groupId)
		throws PortalException, SystemException, RemoteException;

	public int countItemByG_S(long groupId, boolean status)
		throws PortalException, SystemException, RemoteException;

	public int countItemByG_T(long groupId, long typeId)
		throws PortalException, SystemException, RemoteException;

	public int countItemByG_T_S(long groupId, long typeId, boolean status)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the number of adv items.
	*
	* @return the number of adv items
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getAdvItemsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	/**
	* Returns a range of all the adv items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.AdvItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of adv items
	* @param end the upper bound of the range of adv items (not inclusive)
	* @return the range of adv items
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AdvItem> getAdvItems(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AdvItem> getAllbyType(long typeId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AdvItem> getItemByG(long groupId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AdvItem> getItemByG(long groupId, int start, int end)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AdvItem> getItemByG_S(long groupId, boolean status)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AdvItem> getItemByG_S(long groupId, boolean status, int start,
		int end) throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AdvItem> getItemByG_T_S(long groupId, long typeId,
		boolean status)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AdvItem> getItemByG_T_S(long groupId, long typeId,
		boolean status, int begin, int end)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<AdvItem> searchItem(long groupId, long typeId,
		java.lang.String desc, int status, int start, int end);

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

	/**
	* Adds the adv item to the database. Also notifies the appropriate model listeners.
	*
	* @param advItem the adv item
	* @return the adv item that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public AdvItem addAdvItem(AdvItem advItem);

	public AdvItem addItem(long groupId, long companyId, long plid,
		java.lang.String name, java.lang.String description,
		java.lang.String url, boolean isTargetBlank,
		java.lang.String txtMouseOver, boolean status, long typeId,
		long folderId, Date expriedDate)
		throws PortalException, SystemException, RemoteException;

	/**
	* Creates a new adv item with the primary key. Does not add the adv item to the database.
	*
	* @param itemId the primary key for the new adv item
	* @return the new adv item
	*/
	public AdvItem createAdvItem(long itemId);

	/**
	* Deletes the adv item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemId the primary key of the adv item
	* @return the adv item that was removed
	* @throws PortalException if a adv item with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public AdvItem deleteAdvItem(long itemId) throws PortalException;

	/**
	* Deletes the adv item from the database. Also notifies the appropriate model listeners.
	*
	* @param advItem the adv item
	* @return the adv item that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public AdvItem deleteAdvItem(AdvItem advItem);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AdvItem fetchAdvItem(long itemId);

	/**
	* Returns the adv item with the primary key.
	*
	* @param itemId the primary key of the adv item
	* @return the adv item
	* @throws PortalException if a adv item with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AdvItem getAdvItem(long itemId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public AdvItem getItem(long itemId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Updates the adv item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param advItem the adv item
	* @return the adv item that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public AdvItem updateAdvItem(AdvItem advItem);

	public AdvItem updateItem(long itemId, long groupId, long companyId,
		java.lang.String name, java.lang.String description,
		java.lang.String url, boolean isTargetBlank,
		java.lang.String txtMouseOver, boolean status, long typeId,
		long folderId, Date expriedDate)
		throws PortalException, SystemException, RemoteException;

	public AdvItem updateItem(AdvItem advItem)
		throws PortalException, SystemException, RemoteException;

	public void deleteItem(long itemId)
		throws PortalException, SystemException, RemoteException;

	public void deleteItembyType(long typeId)
		throws PortalException, SystemException, RemoteException;
}