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

import vn.gov.hoabinh.model.VLegalDocument;
import vn.gov.hoabinh.model.vdocDocument;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.Date;
import java.util.List;

/**
 * Provides the local service interface for vdocDocument. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see vdocDocumentLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.vdocDocumentLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.vdocDocumentLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface vdocDocumentLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link vdocDocumentLocalServiceUtil} to access the vdoc document local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.vdocDocumentLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public DynamicQuery buildDQBackEnd(long groupId, java.lang.String language,
		java.lang.String keyword, java.lang.String fieldId, Date dateFrom,
		Date dateTo, int status, boolean isCount);

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

	public int countDocByG_L_F(long groupId, java.lang.String language,
		java.lang.String fieldId) throws PortalException, SystemException;

	public int countDocByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int status)
		throws PortalException, SystemException;

	public int countDocByG_L_S(long groupId, java.lang.String language,
		int status) throws PortalException, SystemException;

	public int countDocByG_L_S_F_T(long groupId, java.lang.String language,
		int status, java.lang.String fieldId, int type)
		throws PortalException, SystemException, RemoteException;

	public int countDocByG_L_S_S(long groupId, java.lang.String language,
		int status, boolean hasService) throws PortalException, SystemException;

	public int countDocByG_L_S_T(long groupId, java.lang.String language,
		int status, int type) throws PortalException, SystemException;

	public int countDocument(long groupId, java.lang.String language,
		java.lang.String keyword, java.lang.String fieldId,
		java.lang.String typeId, Date dateFrom, Date dateTo, int status,
		boolean isTitle, boolean isContent);

	/**
	* Returns the number of vdoc documents.
	*
	* @return the number of vdoc documents
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getvdocDocumentsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<vdocDocument> getDocByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocDocument> getDocByG_L_S(long groupId,
		java.lang.String language, int status)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocDocument> getDocByG_L_S(long groupId,
		java.lang.String language, int status, int begin, int end)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocDocument> getDocByG_L_S_F_T(long groupId,
		java.lang.String language, int status, java.lang.String fieldId,
		int type) throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocDocument> getDocByG_L_S_F_T(long groupId,
		java.lang.String language, int status, java.lang.String fieldId,
		int type, int start, int end)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocDocument> getDocByG_L_S_S(long groupId,
		java.lang.String language, int status, boolean hasService)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocDocument> getDocByG_L_S_S(long groupId,
		java.lang.String language, int status, boolean hasService, int begin,
		int end) throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocDocument> getDocByG_L_S_T(long groupId,
		java.lang.String language, int status, int type)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocDocument> getDocByG_L_S_T(long groupId,
		java.lang.String language, int status, int type, int start, int end)
		throws PortalException, SystemException;

	/**
	* Returns a range of all the vdoc documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vdoc documents
	* @param end the upper bound of the range of vdoc documents (not inclusive)
	* @return the range of vdoc documents
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<vdocDocument> getvdocDocuments(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> searchDocument(long groupId,
		java.lang.String language, java.lang.String keyword,
		java.lang.String fieldId, java.lang.String typeId, Date dateFrom,
		Date dateTo, int status, boolean isTitle, boolean isContent, int start,
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

	public vdocDocument addDocument(long groupId, long userId, long companyId,
		java.lang.String language, java.lang.String title,
		java.lang.String content, java.lang.String process,
		java.lang.String base, java.lang.String timeProcess,
		java.lang.String cost, java.lang.String result,
		java.lang.String requireDoc, java.lang.String objects,
		java.lang.String style, java.lang.String note, Date promulDate,
		Date effectivedDate, Date expiredDate, java.lang.String fieldId,
		java.lang.String orgRels, java.lang.String fieldRels,
		boolean hasAttachment, boolean hasService, int typeDoc,
		java.lang.String levels, java.lang.String executeOrg)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the vdoc document to the database. Also notifies the appropriate model listeners.
	*
	* @param vdocDocument the vdoc document
	* @return the vdoc document that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public vdocDocument addvdocDocument(vdocDocument vdocDocument);

	/**
	* Creates a new vdoc document with the primary key. Does not add the vdoc document to the database.
	*
	* @param docId the primary key for the new vdoc document
	* @return the new vdoc document
	*/
	public vdocDocument createvdocDocument(java.lang.String docId);

	/**
	* Deletes the vdoc document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docId the primary key of the vdoc document
	* @return the vdoc document that was removed
	* @throws PortalException if a vdoc document with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public vdocDocument deletevdocDocument(java.lang.String docId)
		throws PortalException;

	/**
	* Deletes the vdoc document from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocDocument the vdoc document
	* @return the vdoc document that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public vdocDocument deletevdocDocument(vdocDocument vdocDocument);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vdocDocument fetchvdocDocument(java.lang.String docId);

	public vdocDocument findByPosition(int position) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vdocDocument getDocument(java.lang.String docId)
		throws PortalException, SystemException;

	/**
	* Returns the vdoc document with the primary key.
	*
	* @param docId the primary key of the vdoc document
	* @return the vdoc document
	* @throws PortalException if a vdoc document with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vdocDocument getvdocDocument(java.lang.String docId)
		throws PortalException;

	public vdocDocument updateDoc(long userId, long companyId,
		java.lang.String docId, long groupId, java.lang.String language,
		int status, java.lang.String title, java.lang.String content,
		java.lang.String process, java.lang.String base,
		java.lang.String timeProcess, java.lang.String cost,
		java.lang.String result, java.lang.String requireDoc,
		java.lang.String objects, java.lang.String style,
		java.lang.String note, Date promulDate, Date effectivedDate,
		Date expiredDate, java.lang.String fieldId, java.lang.String orgRels,
		java.lang.String fieldRels, boolean hasAttachment, boolean hasService,
		int typeDoc, java.lang.String levels, java.lang.String executeOrg,
		ThemeDisplay themeDisplay)
		throws PortalException, SystemException, RemoteException;

	public vdocDocument updateDocument(java.lang.String docId, int position)
		throws PortalException, SystemException, RemoteException;

	public vdocDocument updateDocument(vdocDocument vDoc,
		ThemeDisplay themeDisplay)
		throws PortalException, SystemException, RemoteException;

	/**
	* Updates the vdoc document in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vdocDocument the vdoc document
	* @return the vdoc document that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public vdocDocument updatevdocDocument(vdocDocument vdocDocument);

	public void deleteDocument(java.lang.String documentId,
		ThemeDisplay themeDisplay)
		throws PortalException, SystemException, RemoteException;
}