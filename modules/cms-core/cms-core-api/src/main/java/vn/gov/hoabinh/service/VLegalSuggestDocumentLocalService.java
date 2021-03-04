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

import vn.gov.hoabinh.model.VLegalSuggestDocument;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.Date;
import java.util.List;

/**
 * Provides the local service interface for VLegalSuggestDocument. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSuggestDocumentLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.VLegalSuggestDocumentLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalSuggestDocumentLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VLegalSuggestDocumentLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalSuggestDocumentLocalServiceUtil} to access the v legal suggest document local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalSuggestDocumentLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public DynamicQuery buildDQBackEnd(long groupId, java.lang.String language,
		java.lang.String keyword, Date dateFrom, Date dateTo, int approved,
		boolean isCount);

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

	public int countSuggestionsByP_L_A(long groupId, java.lang.String language,
		boolean approved)
		throws PortalException, SystemException, RemoteException;

	public int countSuggestionsByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId)
		throws PortalException, SystemException, RemoteException;

	public int countSugguest(long groupId, java.lang.String language,
		java.lang.String keyword, Date dateFrom, Date dateTo, int approved);

	/**
	* Returns the number of v legal suggest documents.
	*
	* @return the number of v legal suggest documents
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVLegalSuggestDocumentsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<VLegalSuggestDocument> getSuggestions(boolean approved,
		java.lang.String draftId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalSuggestDocument> getSuggestions(java.lang.String draftId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalSuggestDocument> getSuggestionsByP_L(long groupId,
		java.lang.String language)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalSuggestDocument> getSuggestionsByP_L_A(long groupId,
		java.lang.String language, boolean approved)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalSuggestDocument> getSuggestionsByP_L_A(long groupId,
		java.lang.String language, boolean approved, int begin, int end)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalSuggestDocument> getSuggestionsByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalSuggestDocument> getSuggestionsByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId,
		int begin, int end)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns a range of all the v legal suggest documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalSuggestDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal suggest documents
	* @param end the upper bound of the range of v legal suggest documents (not inclusive)
	* @return the range of v legal suggest documents
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalSuggestDocument> getVLegalSuggestDocuments(int start,
		int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalSuggestDocument> searchSugguest(long groupId,
		java.lang.String language, java.lang.String keyword, Date dateFrom,
		Date dateTo, int approved, int start, int end);

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

	public VLegalSuggestDocument addSuggestion(java.lang.String title,
		java.lang.String content, java.lang.String language,
		java.lang.String visitorName, java.lang.String visitorEmail,
		java.lang.String visitorTel, java.lang.String visitorAddress,
		long groupId, java.lang.String draftId, boolean hasAttachment,
		long companyId, long userId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the v legal suggest document to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalSuggestDocument the v legal suggest document
	* @return the v legal suggest document that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalSuggestDocument addVLegalSuggestDocument(
		VLegalSuggestDocument vLegalSuggestDocument);

	/**
	* Creates a new v legal suggest document with the primary key. Does not add the v legal suggest document to the database.
	*
	* @param sugId the primary key for the new v legal suggest document
	* @return the new v legal suggest document
	*/
	public VLegalSuggestDocument createVLegalSuggestDocument(
		java.lang.String sugId);

	/**
	* Deletes the v legal suggest document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sugId the primary key of the v legal suggest document
	* @return the v legal suggest document that was removed
	* @throws PortalException if a v legal suggest document with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalSuggestDocument deleteVLegalSuggestDocument(
		java.lang.String sugId) throws PortalException;

	/**
	* Deletes the v legal suggest document from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalSuggestDocument the v legal suggest document
	* @return the v legal suggest document that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalSuggestDocument deleteVLegalSuggestDocument(
		VLegalSuggestDocument vLegalSuggestDocument);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalSuggestDocument fetchVLegalSuggestDocument(
		java.lang.String sugId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalSuggestDocument getSuggestion(java.lang.String suggestionId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalSuggestDocument getSuggestion(long groupId,
		java.lang.String suggestionId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the v legal suggest document with the primary key.
	*
	* @param sugId the primary key of the v legal suggest document
	* @return the v legal suggest document
	* @throws PortalException if a v legal suggest document with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalSuggestDocument getVLegalSuggestDocument(
		java.lang.String sugId) throws PortalException;

	public VLegalSuggestDocument updateSuggestion(
		java.lang.String suggestionId, java.lang.String draftId, long groupId,
		java.lang.String title, java.lang.String content,
		java.lang.String language, java.lang.String visitorName,
		java.lang.String visitorEmail, java.lang.String visitorTel,
		java.lang.String visitorAddress, boolean approved, boolean hasAttachment)
		throws PortalException, SystemException, RemoteException;

	public VLegalSuggestDocument updateSuggestion(
		VLegalSuggestDocument suggestion)
		throws PortalException, SystemException, RemoteException;

	/**
	* Updates the v legal suggest document in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalSuggestDocument the v legal suggest document
	* @return the v legal suggest document that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalSuggestDocument updateVLegalSuggestDocument(
		VLegalSuggestDocument vLegalSuggestDocument);

	public void deleteSuggestion(java.lang.String suggestionId)
		throws PortalException, SystemException, RemoteException;

	public void deleteSuggestions(java.lang.String draftId)
		throws PortalException, SystemException, RemoteException;

	public void deleteSuggestions(java.lang.String draftId, boolean approved)
		throws PortalException, SystemException, RemoteException;

	public void deleteSuggestions(java.lang.String[] suggestionIds)
		throws PortalException, SystemException, RemoteException;
}