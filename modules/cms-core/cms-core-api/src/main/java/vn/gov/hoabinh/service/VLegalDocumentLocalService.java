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

import java.io.IOException;
import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.Date;
import java.util.List;

/**
 * Provides the local service interface for VLegalDocument. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDocumentLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.VLegalDocumentLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalDocumentLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VLegalDocumentLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VLegalDocumentLocalServiceUtil} to access the v legal document local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalDocumentLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public DynamicQuery buildDQBackEnd(long groupId, java.lang.String language,
		java.lang.String keyword, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId, Date promulDateFrom,
		Date promulDateTo, Date effectivedDateFrom, Date effectivedDateTo,
		Date expireDateFrom, Date expireDateTo, int status, boolean isNum,
		boolean isSymbol, boolean isSummary, boolean isContent,
		boolean andSearch, boolean isPromul, boolean isEffect,
		boolean isExprire, boolean isCount);

	public DynamicQuery buildDQFrontEnd(long groupId,
		java.lang.String language, java.lang.String num,
		java.lang.String symbol, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId, Date promulDateFrom,
		Date promulDateTo, Date effectivedDateFrom, Date effectivedDateTo,
		Date expiredDateFrom, Date expiredDateTo, java.lang.String summary,
		int status, boolean andSearch, boolean isCount);

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

	public int countDoc(long groupId, java.lang.String language,
		java.lang.String keyword, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId, Date promulDateFrom,
		Date promulDateTo, Date effectivedDateFrom, Date effectivedDateTo,
		Date expireDateFrom, Date expireDateTo, int status, boolean isNum,
		boolean isSymbol, boolean isSummary, boolean isContent,
		boolean andSearch, boolean isPromul, boolean isEffect, boolean isExprire);

	public int countDocument(long groupId, java.lang.String language,
		java.lang.String num, java.lang.String symbol,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, Date promulDateFrom, Date promulDateTo,
		Date effectivedDateFrom, Date effectivedDateTo, Date expiredDateFrom,
		Date expiredDateTo, java.lang.String summary, int status,
		boolean andSearch);

	public int countDocumentByF_O_T(long groupId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language) throws PortalException, SystemException;

	public int countDocumentByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int status) throws SystemException;

	public int countDocumentByG_L_O_S(long groupId, java.lang.String language,
		java.lang.String orgId, int status) throws SystemException;

	public int countDocumentByG_L_T_S(long groupId, java.lang.String language,
		java.lang.String typeDocId, int status) throws SystemException;

	public int countDocumentByP_L_S(long groupId, java.lang.String language,
		int status) throws PortalException, SystemException;

	public int countDocumentByStatus(long groupId, java.lang.String language,
		long userId, int status) throws SystemException;

	/**
	* Returns the number of v legal documents.
	*
	* @return the number of v legal documents
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVLegalDocumentsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<VLegalDocument> getAllDocument()
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getAllDocumentByStatus(long groupId,
		java.lang.String language, long userId, int status, int start, int end)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocByG_L_F(long groupId,
		java.lang.String language, java.lang.String fieldId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocByG_L_O(long groupId,
		java.lang.String language, java.lang.String orgId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocByG_L_T(long groupId,
		java.lang.String language, java.lang.String typeId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocByStatus(long groupId,
		java.lang.String language, long userId, int statusDoc)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocumentByF_O_T(long groupId,
		java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int begin, int end)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocumentByG_L(long groupId,
		java.lang.String language) throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocumentByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int status)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocumentByG_L_F_S_D(long groupId,
		java.lang.String language, java.lang.String fieldId,
		java.lang.String docId, int quantity);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocumentByG_L_O_S(long groupId,
		java.lang.String language, java.lang.String orgId, int status)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocumentByG_L_O_S(long groupId,
		java.lang.String language, java.lang.String orgId, int status,
		int start, int end) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocumentByG_L_O_S_D(long groupId,
		java.lang.String language, java.lang.String orgId,
		java.lang.String docId, int quantity);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocumentByG_L_T_S(long groupId,
		java.lang.String language, java.lang.String typeDocId, int status)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocumentByG_L_T_S(long groupId,
		java.lang.String language, java.lang.String typeDocId, int status,
		int start, int end) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocumentByG_L_T_S_D(long groupId,
		java.lang.String language, java.lang.String typeId,
		java.lang.String docId, int quantity);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocumentByG_O_T_L_S(long groupId,
		java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int status) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocumentByP_L_S(long groupId,
		java.lang.String language, int status)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocumentByP_L_S(long groupId,
		java.lang.String language, int status, int begin, int end)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocumentByP_U_S(long groupId,
		long createdByUser, int status, java.lang.String language)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getDocumentByStatus(long groupId,
		java.lang.String language, long userId, int status)
		throws SystemException;

	/**
	* Returns a range of all the v legal documents.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal documents
	* @param end the upper bound of the range of v legal documents (not inclusive)
	* @return the range of v legal documents
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> getVLegalDocuments(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> searchDoc(long groupId,
		java.lang.String language, java.lang.String keyword,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, Date promulDateFrom, Date promulDateTo,
		Date effectivedDateFrom, Date effectivedDateTo, Date expireDateFrom,
		Date expireDateTo, int status, boolean isNum, boolean isSymbol,
		boolean isSummary, boolean isContent, boolean andSearch,
		boolean isPromul, boolean isEffect, boolean isExprire, int start,
		int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VLegalDocument> searchDocument(long groupId,
		java.lang.String language, java.lang.String num,
		java.lang.String symbol, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId, Date promulDateFrom,
		Date promulDateTo, Date effectivedDateFrom, Date effectivedDateTo,
		Date expiredDateFrom, Date expiredDateTo, java.lang.String summary,
		int status, boolean andSearch, int start, int end);

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

	public VLegalDocument addDocument(long companyId, long groupId,
		long userId, java.lang.String symbol, java.lang.String num,
		java.lang.String replaceDoc, java.lang.String summary,
		java.lang.String content, java.lang.String language, Date promulDate,
		Date effectivedDate, Date expiredDate, java.lang.String typeId,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String orgRels, java.lang.String signerRels,
		java.lang.String fieldRels, java.lang.String numRels,
		java.lang.String docCode, java.lang.String departmentRels,
		boolean hasAttachment, ThemeDisplay themeDisplay)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the v legal document to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDocument the v legal document
	* @return the v legal document that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalDocument addVLegalDocument(VLegalDocument vLegalDocument);

	/**
	* Creates a new v legal document with the primary key. Does not add the v legal document to the database.
	*
	* @param docId the primary key for the new v legal document
	* @return the new v legal document
	*/
	public VLegalDocument createVLegalDocument(java.lang.String docId);

	/**
	* Deletes the v legal document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docId the primary key of the v legal document
	* @return the v legal document that was removed
	* @throws PortalException if a v legal document with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalDocument deleteVLegalDocument(java.lang.String docId)
		throws PortalException;

	/**
	* Deletes the v legal document from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDocument the v legal document
	* @return the v legal document that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VLegalDocument deleteVLegalDocument(VLegalDocument vLegalDocument);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalDocument fetchVLegalDocument(java.lang.String docId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalDocument getDocument(java.lang.String docId)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalDocument getDocument(long groupId, java.lang.String docId)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalDocument getDocumentByNS(long groupId, java.lang.String num,
		java.lang.String symbol) throws PortalException, SystemException;

	/**
	* Returns the v legal document with the primary key.
	*
	* @param docId the primary key of the v legal document
	* @return the v legal document
	* @throws PortalException if a v legal document with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VLegalDocument getVLegalDocument(java.lang.String docId)
		throws PortalException;

	public VLegalDocument updateDocument(java.lang.String docId, long userId,
		long groupId, java.lang.String symbol, java.lang.String num,
		java.lang.String replaceDoc, java.lang.String summary,
		java.lang.String content, java.lang.String language, int status,
		Date promulDate, Date effectivedDate, Date expiredDate,
		java.lang.String typeId, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String orgRels,
		java.lang.String signerRels, java.lang.String fieldRels,
		java.lang.String numRels, java.lang.String departmentRels,
		boolean hasAttachment)
		throws PortalException, SystemException, IOException, RemoteException;

	public VLegalDocument updateDocument(VLegalDocument vDoc)
		throws PortalException, SystemException, IOException, RemoteException;

	/**
	* Updates the v legal document in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalDocument the v legal document
	* @return the v legal document that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VLegalDocument updateVLegalDocument(VLegalDocument vLegalDocument);

	public void deleteDocument(java.lang.String docId, long companyId)
		throws PortalException, SystemException, IOException, RemoteException;

	public void deleteDocuments(java.lang.String[] docIds, long companyId)
		throws PortalException, SystemException, IOException, RemoteException;

	public void updateDocument(java.lang.String docId, java.lang.String docCode)
		throws PortalException, SystemException, RemoteException;
}