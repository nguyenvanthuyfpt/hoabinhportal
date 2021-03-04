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

import vn.gov.hoabinh.model.VcmsDiscussion;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.List;

/**
 * Provides the local service interface for VcmsDiscussion. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsDiscussionLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.VcmsDiscussionLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VcmsDiscussionLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VcmsDiscussionLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsDiscussionLocalServiceUtil} to access the vcms discussion local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VcmsDiscussionLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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

	public int countByApproval(long groupId, java.lang.String language,
		boolean approved)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the number of vcms discussions.
	*
	* @return the number of vcms discussions
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVcmsDiscussionsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<VcmsDiscussion> getDiscussions(java.lang.String articleId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsDiscussion> getDiscussions(java.lang.String articleId,
		boolean approved)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsDiscussion> getDiscussionsByA_P_L_A(
		java.lang.String articleId, long groupId, java.lang.String language,
		boolean approved)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsDiscussion> getDiscussionsByP_L(long groupId,
		java.lang.String language)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsDiscussion> getDiscussionsByP_L_A(long groupId,
		java.lang.String language, boolean approved)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns a range of all the vcms discussions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsDiscussionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms discussions
	* @param end the upper bound of the range of vcms discussions (not inclusive)
	* @return the range of vcms discussions
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsDiscussion> getVcmsDiscussions(int start, int end);

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

	public VcmsDiscussion addDiscussion(java.lang.String visitorName,
		java.lang.String visitorEmail, java.lang.String visitorPhone,
		long groupId, long companyId, java.lang.String articleId,
		java.lang.String title, java.lang.String content,
		boolean hasAttachment, java.lang.String language)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the vcms discussion to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsDiscussion the vcms discussion
	* @return the vcms discussion that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VcmsDiscussion addVcmsDiscussion(VcmsDiscussion vcmsDiscussion);

	/**
	* Creates a new vcms discussion with the primary key. Does not add the vcms discussion to the database.
	*
	* @param discussionId the primary key for the new vcms discussion
	* @return the new vcms discussion
	*/
	public VcmsDiscussion createVcmsDiscussion(java.lang.String discussionId);

	/**
	* Deletes the vcms discussion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param discussionId the primary key of the vcms discussion
	* @return the vcms discussion that was removed
	* @throws PortalException if a vcms discussion with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VcmsDiscussion deleteVcmsDiscussion(java.lang.String discussionId)
		throws PortalException;

	/**
	* Deletes the vcms discussion from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsDiscussion the vcms discussion
	* @return the vcms discussion that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VcmsDiscussion deleteVcmsDiscussion(VcmsDiscussion vcmsDiscussion);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VcmsDiscussion fetchVcmsDiscussion(java.lang.String discussionId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VcmsDiscussion getDiscussion(java.lang.String discussionId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the vcms discussion with the primary key.
	*
	* @param discussionId the primary key of the vcms discussion
	* @return the vcms discussion
	* @throws PortalException if a vcms discussion with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VcmsDiscussion getVcmsDiscussion(java.lang.String discussionId)
		throws PortalException;

	public VcmsDiscussion updateDiscussion(java.lang.String discussionId,
		java.lang.String visitorName, java.lang.String visitorEmail,
		java.lang.String visitorPhone, long groupId, long companyId,
		java.lang.String articleId, java.lang.String title,
		java.lang.String content, boolean hasAttachment, boolean approved,
		java.lang.String language)
		throws PortalException, SystemException, RemoteException;

	/**
	* Updates the vcms discussion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsDiscussion the vcms discussion
	* @return the vcms discussion that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VcmsDiscussion updateVcmsDiscussion(VcmsDiscussion vcmsDiscussion);

	public void deleteDiscussions(java.lang.String articleId)
		throws PortalException, SystemException, RemoteException;

	public void deleteDiscussions(java.lang.String articleId, boolean approved)
		throws PortalException, SystemException, RemoteException;
}