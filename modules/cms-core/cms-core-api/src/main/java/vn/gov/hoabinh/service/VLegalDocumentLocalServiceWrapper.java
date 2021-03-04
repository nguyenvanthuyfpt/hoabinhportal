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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VLegalDocumentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDocumentLocalService
 * @generated
 */
@ProviderType
public class VLegalDocumentLocalServiceWrapper
	implements VLegalDocumentLocalService,
		ServiceWrapper<VLegalDocumentLocalService> {
	public VLegalDocumentLocalServiceWrapper(
		VLegalDocumentLocalService vLegalDocumentLocalService) {
		_vLegalDocumentLocalService = vLegalDocumentLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildDQBackEnd(
		long groupId, java.lang.String language, java.lang.String keyword,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, java.util.Date promulDateFrom,
		java.util.Date promulDateTo, java.util.Date effectivedDateFrom,
		java.util.Date effectivedDateTo, java.util.Date expireDateFrom,
		java.util.Date expireDateTo, int status, boolean isNum,
		boolean isSymbol, boolean isSummary, boolean isContent,
		boolean andSearch, boolean isPromul, boolean isEffect,
		boolean isExprire, boolean isCount) {
		return _vLegalDocumentLocalService.buildDQBackEnd(groupId, language,
			keyword, fieldId, orgId, typeId, promulDateFrom, promulDateTo,
			effectivedDateFrom, effectivedDateTo, expireDateFrom, expireDateTo,
			status, isNum, isSymbol, isSummary, isContent, andSearch, isPromul,
			isEffect, isExprire, isCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildDQFrontEnd(
		long groupId, java.lang.String language, java.lang.String num,
		java.lang.String symbol, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.util.Date promulDateFrom, java.util.Date promulDateTo,
		java.util.Date effectivedDateFrom, java.util.Date effectivedDateTo,
		java.util.Date expiredDateFrom, java.util.Date expiredDateTo,
		java.lang.String summary, int status, boolean andSearch, boolean isCount) {
		return _vLegalDocumentLocalService.buildDQFrontEnd(groupId, language,
			num, symbol, fieldId, orgId, typeId, promulDateFrom, promulDateTo,
			effectivedDateFrom, effectivedDateTo, expiredDateFrom,
			expiredDateTo, summary, status, andSearch, isCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vLegalDocumentLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDocumentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDocumentLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countByStatus(long groupId, java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.countByStatus(groupId, language,
			status);
	}

	@Override
	public int countDoc(long groupId, java.lang.String language,
		java.lang.String keyword, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.util.Date promulDateFrom, java.util.Date promulDateTo,
		java.util.Date effectivedDateFrom, java.util.Date effectivedDateTo,
		java.util.Date expireDateFrom, java.util.Date expireDateTo, int status,
		boolean isNum, boolean isSymbol, boolean isSummary, boolean isContent,
		boolean andSearch, boolean isPromul, boolean isEffect, boolean isExprire) {
		return _vLegalDocumentLocalService.countDoc(groupId, language, keyword,
			fieldId, orgId, typeId, promulDateFrom, promulDateTo,
			effectivedDateFrom, effectivedDateTo, expireDateFrom, expireDateTo,
			status, isNum, isSymbol, isSummary, isContent, andSearch, isPromul,
			isEffect, isExprire);
	}

	@Override
	public int countDocument(long groupId, java.lang.String language,
		java.lang.String num, java.lang.String symbol,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, java.util.Date promulDateFrom,
		java.util.Date promulDateTo, java.util.Date effectivedDateFrom,
		java.util.Date effectivedDateTo, java.util.Date expiredDateFrom,
		java.util.Date expiredDateTo, java.lang.String summary, int status,
		boolean andSearch) {
		return _vLegalDocumentLocalService.countDocument(groupId, language,
			num, symbol, fieldId, orgId, typeId, promulDateFrom, promulDateTo,
			effectivedDateFrom, effectivedDateTo, expiredDateFrom,
			expiredDateTo, summary, status, andSearch);
	}

	@Override
	public int countDocumentByF_O_T(long groupId, java.lang.String typeDocId,
		java.lang.String orgId, java.lang.String fieldId,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.countDocumentByF_O_T(groupId,
			typeDocId, orgId, fieldId, language);
	}

	@Override
	public int countDocumentByG_L_F_S(long groupId, java.lang.String language,
		java.lang.String fieldId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.countDocumentByG_L_F_S(groupId,
			language, fieldId, status);
	}

	@Override
	public int countDocumentByG_L_O_S(long groupId, java.lang.String language,
		java.lang.String orgId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.countDocumentByG_L_O_S(groupId,
			language, orgId, status);
	}

	@Override
	public int countDocumentByG_L_T_S(long groupId, java.lang.String language,
		java.lang.String typeDocId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.countDocumentByG_L_T_S(groupId,
			language, typeDocId, status);
	}

	@Override
	public int countDocumentByP_L_S(long groupId, java.lang.String language,
		int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.countDocumentByP_L_S(groupId,
			language, status);
	}

	@Override
	public int countDocumentByStatus(long groupId, java.lang.String language,
		long userId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.countDocumentByStatus(groupId,
			language, userId, status);
	}

	/**
	* Returns the number of v legal documents.
	*
	* @return the number of v legal documents
	*/
	@Override
	public int getVLegalDocumentsCount() {
		return _vLegalDocumentLocalService.getVLegalDocumentsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vLegalDocumentLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vLegalDocumentLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vLegalDocumentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vLegalDocumentLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getAllDocument()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getAllDocument();
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getAllDocumentByStatus(
		long groupId, java.lang.String language, long userId, int status,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getAllDocumentByStatus(groupId,
			language, userId, status, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocByG_L_F(
		long groupId, java.lang.String language, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDocumentLocalService.getDocByG_L_F(groupId, language,
			fieldId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocByG_L_O(
		long groupId, java.lang.String language, java.lang.String orgId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDocumentLocalService.getDocByG_L_O(groupId, language,
			orgId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocByG_L_T(
		long groupId, java.lang.String language, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDocumentLocalService.getDocByG_L_T(groupId, language,
			typeId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocByStatus(
		long groupId, java.lang.String language, long userId, int statusDoc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocByStatus(groupId, language,
			userId, statusDoc);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocumentByF_O_T(
		long groupId, java.lang.String typeDocId, java.lang.String orgId,
		java.lang.String fieldId, java.lang.String language, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocumentByF_O_T(groupId,
			typeDocId, orgId, fieldId, language, begin, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocumentByG_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocumentByG_L(groupId, language);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocumentByG_L_F_S(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocumentByG_L_F_S(groupId,
			language, fieldId, status);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocumentByG_L_F_S_D(
		long groupId, java.lang.String language, java.lang.String fieldId,
		java.lang.String docId, int quantity) {
		return _vLegalDocumentLocalService.getDocumentByG_L_F_S_D(groupId,
			language, fieldId, docId, quantity);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocumentByG_L_O_S(
		long groupId, java.lang.String language, java.lang.String orgId,
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocumentByG_L_O_S(groupId,
			language, orgId, status);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocumentByG_L_O_S(
		long groupId, java.lang.String language, java.lang.String orgId,
		int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocumentByG_L_O_S(groupId,
			language, orgId, status, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocumentByG_L_O_S_D(
		long groupId, java.lang.String language, java.lang.String orgId,
		java.lang.String docId, int quantity) {
		return _vLegalDocumentLocalService.getDocumentByG_L_O_S_D(groupId,
			language, orgId, docId, quantity);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocumentByG_L_T_S(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocumentByG_L_T_S(groupId,
			language, typeDocId, status);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocumentByG_L_T_S(
		long groupId, java.lang.String language, java.lang.String typeDocId,
		int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocumentByG_L_T_S(groupId,
			language, typeDocId, status, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocumentByG_L_T_S_D(
		long groupId, java.lang.String language, java.lang.String typeId,
		java.lang.String docId, int quantity) {
		return _vLegalDocumentLocalService.getDocumentByG_L_T_S_D(groupId,
			language, typeId, docId, quantity);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocumentByG_O_T_L_S(
		long groupId, java.lang.String orgId, java.lang.String typeDocId,
		java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocumentByG_O_T_L_S(groupId,
			orgId, typeDocId, language, status);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocumentByP_L_S(
		long groupId, java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocumentByP_L_S(groupId,
			language, status);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocumentByP_L_S(
		long groupId, java.lang.String language, int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocumentByP_L_S(groupId,
			language, status, begin, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocumentByP_U_S(
		long groupId, long createdByUser, int status, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocumentByP_U_S(groupId,
			createdByUser, status, language);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getDocumentByStatus(
		long groupId, java.lang.String language, long userId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocumentByStatus(groupId,
			language, userId, status);
	}

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
	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> getVLegalDocuments(
		int start, int end) {
		return _vLegalDocumentLocalService.getVLegalDocuments(start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> searchDoc(
		long groupId, java.lang.String language, java.lang.String keyword,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String typeId, java.util.Date promulDateFrom,
		java.util.Date promulDateTo, java.util.Date effectivedDateFrom,
		java.util.Date effectivedDateTo, java.util.Date expireDateFrom,
		java.util.Date expireDateTo, int status, boolean isNum,
		boolean isSymbol, boolean isSummary, boolean isContent,
		boolean andSearch, boolean isPromul, boolean isEffect,
		boolean isExprire, int start, int end) {
		return _vLegalDocumentLocalService.searchDoc(groupId, language,
			keyword, fieldId, orgId, typeId, promulDateFrom, promulDateTo,
			effectivedDateFrom, effectivedDateTo, expireDateFrom, expireDateTo,
			status, isNum, isSymbol, isSummary, isContent, andSearch, isPromul,
			isEffect, isExprire, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDocument> searchDocument(
		long groupId, java.lang.String language, java.lang.String num,
		java.lang.String symbol, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String typeId,
		java.util.Date promulDateFrom, java.util.Date promulDateTo,
		java.util.Date effectivedDateFrom, java.util.Date effectivedDateTo,
		java.util.Date expiredDateFrom, java.util.Date expiredDateTo,
		java.lang.String summary, int status, boolean andSearch, int start,
		int end) {
		return _vLegalDocumentLocalService.searchDocument(groupId, language,
			num, symbol, fieldId, orgId, typeId, promulDateFrom, promulDateTo,
			effectivedDateFrom, effectivedDateTo, expiredDateFrom,
			expiredDateTo, summary, status, andSearch, start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vLegalDocumentLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _vLegalDocumentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDocument addDocument(long companyId,
		long groupId, long userId, java.lang.String symbol,
		java.lang.String num, java.lang.String replaceDoc,
		java.lang.String summary, java.lang.String content,
		java.lang.String language, java.util.Date promulDate,
		java.util.Date effectivedDate, java.util.Date expiredDate,
		java.lang.String typeId, java.lang.String fieldId,
		java.lang.String orgId, java.lang.String orgRels,
		java.lang.String signerRels, java.lang.String fieldRels,
		java.lang.String numRels, java.lang.String docCode,
		java.lang.String departmentRels, boolean hasAttachment,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDocumentLocalService.addDocument(companyId, groupId,
			userId, symbol, num, replaceDoc, summary, content, language,
			promulDate, effectivedDate, expiredDate, typeId, fieldId, orgId,
			orgRels, signerRels, fieldRels, numRels, docCode, departmentRels,
			hasAttachment, themeDisplay);
	}

	/**
	* Adds the v legal document to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDocument the v legal document
	* @return the v legal document that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDocument addVLegalDocument(
		vn.gov.hoabinh.model.VLegalDocument vLegalDocument) {
		return _vLegalDocumentLocalService.addVLegalDocument(vLegalDocument);
	}

	/**
	* Creates a new v legal document with the primary key. Does not add the v legal document to the database.
	*
	* @param docId the primary key for the new v legal document
	* @return the new v legal document
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDocument createVLegalDocument(
		java.lang.String docId) {
		return _vLegalDocumentLocalService.createVLegalDocument(docId);
	}

	/**
	* Deletes the v legal document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docId the primary key of the v legal document
	* @return the v legal document that was removed
	* @throws PortalException if a v legal document with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDocument deleteVLegalDocument(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDocumentLocalService.deleteVLegalDocument(docId);
	}

	/**
	* Deletes the v legal document from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDocument the v legal document
	* @return the v legal document that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDocument deleteVLegalDocument(
		vn.gov.hoabinh.model.VLegalDocument vLegalDocument) {
		return _vLegalDocumentLocalService.deleteVLegalDocument(vLegalDocument);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDocument fetchVLegalDocument(
		java.lang.String docId) {
		return _vLegalDocumentLocalService.fetchVLegalDocument(docId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDocument getDocument(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocument(docId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDocument getDocument(long groupId,
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocument(groupId, docId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDocument getDocumentByNS(long groupId,
		java.lang.String num, java.lang.String symbol)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDocumentLocalService.getDocumentByNS(groupId, num, symbol);
	}

	/**
	* Returns the v legal document with the primary key.
	*
	* @param docId the primary key of the v legal document
	* @return the v legal document
	* @throws PortalException if a v legal document with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDocument getVLegalDocument(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDocumentLocalService.getVLegalDocument(docId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDocument updateDocument(
		java.lang.String docId, long userId, long groupId,
		java.lang.String symbol, java.lang.String num,
		java.lang.String replaceDoc, java.lang.String summary,
		java.lang.String content, java.lang.String language, int status,
		java.util.Date promulDate, java.util.Date effectivedDate,
		java.util.Date expiredDate, java.lang.String typeId,
		java.lang.String fieldId, java.lang.String orgId,
		java.lang.String orgRels, java.lang.String signerRels,
		java.lang.String fieldRels, java.lang.String numRels,
		java.lang.String departmentRels, boolean hasAttachment)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException, java.rmi.RemoteException {
		return _vLegalDocumentLocalService.updateDocument(docId, userId,
			groupId, symbol, num, replaceDoc, summary, content, language,
			status, promulDate, effectivedDate, expiredDate, typeId, fieldId,
			orgId, orgRels, signerRels, fieldRels, numRels, departmentRels,
			hasAttachment);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDocument updateDocument(
		vn.gov.hoabinh.model.VLegalDocument vDoc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException, java.rmi.RemoteException {
		return _vLegalDocumentLocalService.updateDocument(vDoc);
	}

	/**
	* Updates the v legal document in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalDocument the v legal document
	* @return the v legal document that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDocument updateVLegalDocument(
		vn.gov.hoabinh.model.VLegalDocument vLegalDocument) {
		return _vLegalDocumentLocalService.updateVLegalDocument(vLegalDocument);
	}

	@Override
	public void deleteDocument(java.lang.String docId, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException, java.rmi.RemoteException {
		_vLegalDocumentLocalService.deleteDocument(docId, companyId);
	}

	@Override
	public void deleteDocuments(java.lang.String[] docIds, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException, java.rmi.RemoteException {
		_vLegalDocumentLocalService.deleteDocuments(docIds, companyId);
	}

	@Override
	public void updateDocument(java.lang.String docId, java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDocumentLocalService.updateDocument(docId, docCode);
	}

	@Override
	public VLegalDocumentLocalService getWrappedService() {
		return _vLegalDocumentLocalService;
	}

	@Override
	public void setWrappedService(
		VLegalDocumentLocalService vLegalDocumentLocalService) {
		_vLegalDocumentLocalService = vLegalDocumentLocalService;
	}

	private VLegalDocumentLocalService _vLegalDocumentLocalService;
}