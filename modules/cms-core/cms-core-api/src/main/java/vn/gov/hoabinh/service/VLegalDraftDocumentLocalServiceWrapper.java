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
 * Provides a wrapper for {@link VLegalDraftDocumentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDraftDocumentLocalService
 * @generated
 */
@ProviderType
public class VLegalDraftDocumentLocalServiceWrapper
	implements VLegalDraftDocumentLocalService,
		ServiceWrapper<VLegalDraftDocumentLocalService> {
	public VLegalDraftDocumentLocalServiceWrapper(
		VLegalDraftDocumentLocalService vLegalDraftDocumentLocalService) {
		_vLegalDraftDocumentLocalService = vLegalDraftDocumentLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildDQBackEnd(
		long groupId, java.lang.String language, java.lang.String keyword,
		java.lang.String fieldId, java.lang.String typeId,
		java.util.Date dateFrom, java.util.Date dateTo, int status,
		boolean isCount) {
		return _vLegalDraftDocumentLocalService.buildDQBackEnd(groupId,
			language, keyword, fieldId, typeId, dateFrom, dateTo, status,
			isCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildDQFrontEnd(
		long groupId, java.lang.String language, int status, boolean isCount) {
		return _vLegalDraftDocumentLocalService.buildDQFrontEnd(groupId,
			language, status, isCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vLegalDraftDocumentLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDraftDocumentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDraftDocumentLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countByStatus(long groupId, java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _vLegalDraftDocumentLocalService.countByStatus(groupId,
			language, status);
	}

	@Override
	public int countDraft(long groupId, java.lang.String language,
		java.lang.String keyword, java.lang.String fieldId,
		java.lang.String typeId, java.util.Date dateFrom,
		java.util.Date dateTo, int status) {
		return _vLegalDraftDocumentLocalService.countDraft(groupId, language,
			keyword, fieldId, typeId, dateFrom, dateTo, status);
	}

	@Override
	public int countDraftPublished(long groupId, java.lang.String language,
		int status) {
		return _vLegalDraftDocumentLocalService.countDraftPublished(groupId,
			language, status);
	}

	@Override
	public int countDraftsByP_L_S(long groupId, java.lang.String language,
		int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDraftDocumentLocalService.countDraftsByP_L_S(groupId,
			language, status);
	}

	/**
	* Returns the number of v legal draft documents.
	*
	* @return the number of v legal draft documents
	*/
	@Override
	public int getVLegalDraftDocumentsCount() {
		return _vLegalDraftDocumentLocalService.getVLegalDraftDocumentsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vLegalDraftDocumentLocalService.getOSGiServiceIdentifier();
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
		return _vLegalDraftDocumentLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vLegalDraftDocumentLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vLegalDraftDocumentLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDraftDocument> getDraftPublished(
		long groupId, java.lang.String language, int status, int start, int end) {
		return _vLegalDraftDocumentLocalService.getDraftPublished(groupId,
			language, status, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDraftDocument> getDrafts(
		java.lang.String[] draftIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDraftDocumentLocalService.getDrafts(draftIds);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDraftDocument> getDraftsByDocCode(
		java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDraftDocumentLocalService.getDraftsByDocCode(docCode);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDraftDocument> getDraftsByG_L_F_S_D(
		long groupId, java.lang.String language, java.lang.String fieldId,
		int statusDraft, java.lang.String draftId, int num) {
		return _vLegalDraftDocumentLocalService.getDraftsByG_L_F_S_D(groupId,
			language, fieldId, statusDraft, draftId, num);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDraftDocument> getDraftsByG_L_T_S_D(
		long groupId, java.lang.String language, java.lang.String typeId,
		int statusDraft, java.lang.String draftId, int num) {
		return _vLegalDraftDocumentLocalService.getDraftsByG_L_T_S_D(groupId,
			language, typeId, statusDraft, draftId, num);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDraftDocument> getDraftsByP_L_S(
		long groupId, java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDraftDocumentLocalService.getDraftsByP_L_S(groupId,
			language, status);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDraftDocument> getDraftsByP_L_S(
		long groupId, java.lang.String language, int status, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDraftDocumentLocalService.getDraftsByP_L_S(groupId,
			language, status, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDraftDocument> getDraftsByP_S_D(
		long groupId, int status, java.lang.String docCode)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDraftDocumentLocalService.getDraftsByP_S_D(groupId,
			status, docCode);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDraftDocument> getDraftsByP_S_F(
		long groupId, int status, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDraftDocumentLocalService.getDraftsByP_S_F(groupId,
			status, fieldId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDraftDocument> getDraftsByP_S_T(
		long groupId, int status, java.lang.String typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDraftDocumentLocalService.getDraftsByP_S_T(groupId,
			status, typeId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDraftDocument> getDraftsByP_S_U_L(
		long groupId, int status, long createdByUser, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDraftDocumentLocalService.getDraftsByP_S_U_L(groupId,
			status, createdByUser, language);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDraftDocument> getDratfsbyP_S(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDraftDocumentLocalService.getDratfsbyP_S(groupId, language);
	}

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
	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDraftDocument> getVLegalDraftDocuments(
		int start, int end) {
		return _vLegalDraftDocumentLocalService.getVLegalDraftDocuments(start,
			end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalDraftDocument> searchDraft(
		long groupId, java.lang.String language, java.lang.String keyword,
		java.lang.String fieldId, java.lang.String typeId,
		java.util.Date dateFrom, java.util.Date dateTo, int status, int start,
		int end) {
		return _vLegalDraftDocumentLocalService.searchDraft(groupId, language,
			keyword, fieldId, typeId, dateFrom, dateTo, status, start, end);
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
		return _vLegalDraftDocumentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vLegalDraftDocumentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDraftDocument addDraft(long companyId,
		long groupId, long userId, java.lang.String title,
		java.lang.String content, java.lang.String language,
		java.lang.String typeId, java.lang.String fieldId, int highlevel,
		java.lang.String docCode, java.util.Date expiredDate,
		boolean hasAttachment,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDraftDocumentLocalService.addDraft(companyId, groupId,
			userId, title, content, language, typeId, fieldId, highlevel,
			docCode, expiredDate, hasAttachment, themeDisplay);
	}

	/**
	* Adds the v legal draft document to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDraftDocument the v legal draft document
	* @return the v legal draft document that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDraftDocument addVLegalDraftDocument(
		vn.gov.hoabinh.model.VLegalDraftDocument vLegalDraftDocument) {
		return _vLegalDraftDocumentLocalService.addVLegalDraftDocument(vLegalDraftDocument);
	}

	/**
	* Creates a new v legal draft document with the primary key. Does not add the v legal draft document to the database.
	*
	* @param draftId the primary key for the new v legal draft document
	* @return the new v legal draft document
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDraftDocument createVLegalDraftDocument(
		java.lang.String draftId) {
		return _vLegalDraftDocumentLocalService.createVLegalDraftDocument(draftId);
	}

	/**
	* Deletes the v legal draft document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param draftId the primary key of the v legal draft document
	* @return the v legal draft document that was removed
	* @throws PortalException if a v legal draft document with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDraftDocument deleteVLegalDraftDocument(
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDraftDocumentLocalService.deleteVLegalDraftDocument(draftId);
	}

	/**
	* Deletes the v legal draft document from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalDraftDocument the v legal draft document
	* @return the v legal draft document that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDraftDocument deleteVLegalDraftDocument(
		vn.gov.hoabinh.model.VLegalDraftDocument vLegalDraftDocument) {
		return _vLegalDraftDocumentLocalService.deleteVLegalDraftDocument(vLegalDraftDocument);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDraftDocument fetchVLegalDraftDocument(
		java.lang.String draftId) {
		return _vLegalDraftDocumentLocalService.fetchVLegalDraftDocument(draftId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDraftDocument getDraft(
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDraftDocumentLocalService.getDraft(draftId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDraftDocument getDraft(long groupId,
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDraftDocumentLocalService.getDraft(groupId, draftId);
	}

	/**
	* Returns the v legal draft document with the primary key.
	*
	* @param draftId the primary key of the v legal draft document
	* @return the v legal draft document
	* @throws PortalException if a v legal draft document with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDraftDocument getVLegalDraftDocument(
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalDraftDocumentLocalService.getVLegalDraftDocument(draftId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDraftDocument updateDraft(
		java.lang.String draftId, long groupId, long userId,
		java.lang.String title, java.lang.String content,
		java.lang.String language, java.lang.String typeId,
		java.lang.String fieldId, java.util.Date expiredDate, int status,
		boolean hasAttachment)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDraftDocumentLocalService.updateDraft(draftId, groupId,
			userId, title, content, language, typeId, fieldId, expiredDate,
			status, hasAttachment);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDraftDocument updateDraft(
		vn.gov.hoabinh.model.VLegalDraftDocument draft)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalDraftDocumentLocalService.updateDraft(draft);
	}

	/**
	* Updates the v legal draft document in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalDraftDocument the v legal draft document
	* @return the v legal draft document that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalDraftDocument updateVLegalDraftDocument(
		vn.gov.hoabinh.model.VLegalDraftDocument vLegalDraftDocument) {
		return _vLegalDraftDocumentLocalService.updateVLegalDraftDocument(vLegalDraftDocument);
	}

	@Override
	public void deleteDraft(java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDraftDocumentLocalService.deleteDraft(draftId);
	}

	@Override
	public void deleteDrafts(java.lang.String[] draftIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalDraftDocumentLocalService.deleteDrafts(draftIds);
	}

	@Override
	public VLegalDraftDocumentLocalService getWrappedService() {
		return _vLegalDraftDocumentLocalService;
	}

	@Override
	public void setWrappedService(
		VLegalDraftDocumentLocalService vLegalDraftDocumentLocalService) {
		_vLegalDraftDocumentLocalService = vLegalDraftDocumentLocalService;
	}

	private VLegalDraftDocumentLocalService _vLegalDraftDocumentLocalService;
}