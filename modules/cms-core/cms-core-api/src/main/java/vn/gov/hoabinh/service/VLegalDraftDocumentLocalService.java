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

import vn.gov.hoabinh.model.VLegalDraftDocument;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.Date;
import java.util.List;

/**
 * Provides the local service interface for VLegalDraftDocument. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDraftDocumentLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.VLegalDraftDocumentLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalDraftDocumentLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VLegalDraftDocumentLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalDraftDocumentLocalServiceUtil} to access the v legal draft document local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalDraftDocumentLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public DynamicQuery buildDQBackEnd(long groupId, java.lang.String language,
		java.lang.String keyword, java.lang.String fieldId,
		java.lang.String typeId, Date dateFrom, Date dateTo, int status,
		boolean isCount);

	public DynamicQuery buildDQFrontEnd(long groupId,
		java.lang.String language, int status, boolean isCount);

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

	public int countByStatus(long groupId, java.lang.String language, int status)
		throws SystemException;

	public int countDraft(long groupId, java.lang.String language,
		java.lang.String keyword, java.lang.String fieldId,
		java.lang.String typeId, Date dateFrom, Date dateTo, int status);

	public int countDraftPublished(long groupId, java.lang.String language,
		int status);

	public int countDraftsByP_L_S(long groupId, java.lang.String language,
		int status) throws PortalException, SystemException, RemoteException;

	/**
	* Returns the number of v legal draft documents.
	*
	* @return the number of v legal draft documents
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVLegalDraftDocumentsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<VLegalDraftDocument> getDraftPublished(long groupId,
		java.lang.String language, int status, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDraftDocument> getDrafts(java.lang.String[] draftIds)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDraftDocument> getDraftsByDocCode(
		java.lang.String docCode)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDraftDocument> getDraftsByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId, int statusDraft,
		java.lang.String draftId, int num);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDraftDocument> getDraftsByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeId, int statusDraft,
		java.lang.String draftId, int num);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDraftDocument> getDraftsByP_L_S(long groupId,
		java.lang.String language, int status)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDraftDocument> getDraftsByP_L_S(long groupId,
		java.lang.String language, int status, int start, int end)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDraftDocument> getDraftsByP_S_D(long groupId, int status,
		java.lang.String docCode)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDraftDocument> getDraftsByP_S_F(long groupId, int status,
		java.lang.String fieldId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDraftDocument> getDraftsByP_S_T(long groupId, int status,
		java.lang.String typeId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDraftDocument> getDraftsByP_S_U_L(long groupId,
		int status, long createdByUser, java.lang.String language)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDraftDocument> getDratfsbyP_S(long groupId,
		java.lang.String language)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns a range of all the v legal draft documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDraftDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal draft documents
	* @param end the upper bound of the range of v legal draft documents (not inclusive)
	* @return the range of v legal draft documents
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDraftDocument> getVLegalDraftDocuments(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDraftDocument> searchDraft(long groupId,
		java.lang.String language, java.lang.String keyword,
		java.lang.String fieldId, java.lang.String typeId, Date dateFrom,
		Date dateTo, int status, int start, int end);

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

	public VLegalDraftDocument addDraft(long companyId, long groupId,
		long userId, java.lang.String title, java.lang.String content,
		java.lang.String language, java.lang.String typeId,
		java.lang.String fieldId, int highlevel, java.lang.String docCode,
		Date expiredDate, boolean hasAttachment, ThemeDisplay themeDisplay)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the v legal draft document to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDraftDocument the v legal draft document
	* @return the v legal draft document that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalDraftDocument addVLegalDraftDocument(
		VLegalDraftDocument vLegalDraftDocument);

	/**
	* Creates a new v legal draft document with the primary key. Does not add the v legal draft document to the database.
	*
	* @param draftId the primary key for the new v legal draft document
	* @return the new v legal draft document
	*/
	public VLegalDraftDocument createVLegalDraftDocument(
		java.lang.String draftId);

	/**
	* Deletes the v legal draft document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param draftId the primary key of the v legal draft document
	* @return the v legal draft document that was removed
	* @throws PortalException if a v legal draft document with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalDraftDocument deleteVLegalDraftDocument(
		java.lang.String draftId) throws PortalException;

	/**
	* Deletes the v legal draft document from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDraftDocument the v legal draft document
	* @return the v legal draft document that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalDraftDocument deleteVLegalDraftDocument(
		VLegalDraftDocument vLegalDraftDocument);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalDraftDocument fetchVLegalDraftDocument(
		java.lang.String draftId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalDraftDocument getDraft(java.lang.String draftId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalDraftDocument getDraft(long groupId, java.lang.String draftId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the v legal draft document with the primary key.
	*
	* @param draftId the primary key of the v legal draft document
	* @return the v legal draft document
	* @throws PortalException if a v legal draft document with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalDraftDocument getVLegalDraftDocument(java.lang.String draftId)
		throws PortalException;

	public VLegalDraftDocument updateDraft(java.lang.String draftId,
		long groupId, long userId, java.lang.String title,
		java.lang.String content, java.lang.String language,
		java.lang.String typeId, java.lang.String fieldId, Date expiredDate,
		int status, boolean hasAttachment)
		throws PortalException, SystemException, RemoteException;

	public VLegalDraftDocument updateDraft(VLegalDraftDocument draft)
		throws PortalException, SystemException, RemoteException;

	/**
	* Updates the v legal draft document in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalDraftDocument the v legal draft document
	* @return the v legal draft document that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalDraftDocument updateVLegalDraftDocument(
		VLegalDraftDocument vLegalDraftDocument);

	public void deleteDraft(java.lang.String draftId)
		throws PortalException, SystemException, RemoteException;

	public void deleteDrafts(java.lang.String[] draftIds)
		throws PortalException, SystemException, RemoteException;
}