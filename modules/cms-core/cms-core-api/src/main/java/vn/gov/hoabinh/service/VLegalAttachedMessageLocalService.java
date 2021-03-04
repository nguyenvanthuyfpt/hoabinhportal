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

import vn.gov.hoabinh.model.VLegalAttachedMessage;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.List;

/**
 * Provides the local service interface for VLegalAttachedMessage. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalAttachedMessageLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.VLegalAttachedMessageLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalAttachedMessageLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VLegalAttachedMessageLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalAttachedMessageLocalServiceUtil} to access the v legal attached message local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalAttachedMessageLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

	public int count(java.lang.String articleId, boolean read)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the number of v legal attached messages.
	*
	* @return the number of v legal attached messages
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVLegalAttachedMessagesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<VLegalAttachedMessage> getAllMessageByStatus(long groupId,
		boolean read) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalAttachedMessage> getMessages(java.lang.String articleId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalAttachedMessage> getMessages(java.lang.String articleId,
		boolean read) throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalAttachedMessage> getMessages(
		java.lang.String[] messageIds)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalAttachedMessage> getMessagesByGroup(long groupId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns a range of all the v legal attached messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal attached messages
	* @param end the upper bound of the range of v legal attached messages (not inclusive)
	* @return the range of v legal attached messages
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalAttachedMessage> getVLegalAttachedMessages(int start,
		int end);

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

	public VLegalAttachedMessage addMessage(long userId, long companyId,
		long groupId, java.lang.String articleId, java.lang.String content,
		boolean read) throws PortalException, SystemException, RemoteException;

	/**
	* Adds the v legal attached message to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalAttachedMessage the v legal attached message
	* @return the v legal attached message that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalAttachedMessage addVLegalAttachedMessage(
		VLegalAttachedMessage vLegalAttachedMessage);

	/**
	* Creates a new v legal attached message with the primary key. Does not add the v legal attached message to the database.
	*
	* @param messageId the primary key for the new v legal attached message
	* @return the new v legal attached message
	*/
	public VLegalAttachedMessage createVLegalAttachedMessage(
		java.lang.String messageId);

	/**
	* Deletes the v legal attached message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the v legal attached message
	* @return the v legal attached message that was removed
	* @throws PortalException if a v legal attached message with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalAttachedMessage deleteVLegalAttachedMessage(
		java.lang.String messageId) throws PortalException;

	/**
	* Deletes the v legal attached message from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalAttachedMessage the v legal attached message
	* @return the v legal attached message that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalAttachedMessage deleteVLegalAttachedMessage(
		VLegalAttachedMessage vLegalAttachedMessage);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalAttachedMessage fetchVLegalAttachedMessage(
		java.lang.String messageId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalAttachedMessage getMessage(java.lang.String messageId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the v legal attached message with the primary key.
	*
	* @param messageId the primary key of the v legal attached message
	* @return the v legal attached message
	* @throws PortalException if a v legal attached message with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalAttachedMessage getVLegalAttachedMessage(
		java.lang.String messageId) throws PortalException;

	public VLegalAttachedMessage updateMessage(java.lang.String messageId,
		boolean read) throws PortalException, SystemException, RemoteException;

	public VLegalAttachedMessage updateMessage(VLegalAttachedMessage message)
		throws PortalException, SystemException, RemoteException;

	/**
	* Updates the v legal attached message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalAttachedMessage the v legal attached message
	* @return the v legal attached message that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalAttachedMessage updateVLegalAttachedMessage(
		VLegalAttachedMessage vLegalAttachedMessage);

	public void deleteMessage(java.lang.String messageId)
		throws PortalException, SystemException, RemoteException;

	public void deleteMessages(java.lang.String articleId)
		throws PortalException, SystemException, RemoteException;
}