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
 * Provides a wrapper for {@link VLegalSuggestDocumentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSuggestDocumentLocalService
 * @generated
 */
@ProviderType
public class VLegalSuggestDocumentLocalServiceWrapper
	implements VLegalSuggestDocumentLocalService,
		ServiceWrapper<VLegalSuggestDocumentLocalService> {
	public VLegalSuggestDocumentLocalServiceWrapper(
		VLegalSuggestDocumentLocalService vLegalSuggestDocumentLocalService) {
		_vLegalSuggestDocumentLocalService = vLegalSuggestDocumentLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildDQBackEnd(
		long groupId, java.lang.String language, java.lang.String keyword,
		java.util.Date dateFrom, java.util.Date dateTo, int approved,
		boolean isCount) {
		return _vLegalSuggestDocumentLocalService.buildDQBackEnd(groupId,
			language, keyword, dateFrom, dateTo, approved, isCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vLegalSuggestDocumentLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalSuggestDocumentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalSuggestDocumentLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countSuggestionsByP_L_A(long groupId, java.lang.String language,
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSuggestDocumentLocalService.countSuggestionsByP_L_A(groupId,
			language, approved);
	}

	@Override
	public int countSuggestionsByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSuggestDocumentLocalService.countSuggestionsByP_L_A_D(groupId,
			language, approved, draftId);
	}

	@Override
	public int countSugguest(long groupId, java.lang.String language,
		java.lang.String keyword, java.util.Date dateFrom,
		java.util.Date dateTo, int approved) {
		return _vLegalSuggestDocumentLocalService.countSugguest(groupId,
			language, keyword, dateFrom, dateTo, approved);
	}

	/**
	* Returns the number of v legal suggest documents.
	*
	* @return the number of v legal suggest documents
	*/
	@Override
	public int getVLegalSuggestDocumentsCount() {
		return _vLegalSuggestDocumentLocalService.getVLegalSuggestDocumentsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vLegalSuggestDocumentLocalService.getOSGiServiceIdentifier();
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
		return _vLegalSuggestDocumentLocalService.dynamicQuery(dynamicQuery);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vLegalSuggestDocumentLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vLegalSuggestDocumentLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getSuggestions(
		boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSuggestDocumentLocalService.getSuggestions(approved,
			draftId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getSuggestions(
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSuggestDocumentLocalService.getSuggestions(draftId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getSuggestionsByP_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSuggestDocumentLocalService.getSuggestionsByP_L(groupId,
			language);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getSuggestionsByP_L_A(
		long groupId, java.lang.String language, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSuggestDocumentLocalService.getSuggestionsByP_L_A(groupId,
			language, approved);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getSuggestionsByP_L_A(
		long groupId, java.lang.String language, boolean approved, int begin,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSuggestDocumentLocalService.getSuggestionsByP_L_A(groupId,
			language, approved, begin, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getSuggestionsByP_L_A_D(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSuggestDocumentLocalService.getSuggestionsByP_L_A_D(groupId,
			language, approved, draftId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getSuggestionsByP_L_A_D(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSuggestDocumentLocalService.getSuggestionsByP_L_A_D(groupId,
			language, approved, draftId, begin, end);
	}

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
	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getVLegalSuggestDocuments(
		int start, int end) {
		return _vLegalSuggestDocumentLocalService.getVLegalSuggestDocuments(start,
			end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> searchSugguest(
		long groupId, java.lang.String language, java.lang.String keyword,
		java.util.Date dateFrom, java.util.Date dateTo, int approved,
		int start, int end) {
		return _vLegalSuggestDocumentLocalService.searchSugguest(groupId,
			language, keyword, dateFrom, dateTo, approved, start, end);
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
		return _vLegalSuggestDocumentLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vLegalSuggestDocumentLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument addSuggestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, java.lang.String visitorName,
		java.lang.String visitorEmail, java.lang.String visitorTel,
		java.lang.String visitorAddress, long groupId,
		java.lang.String draftId, boolean hasAttachment, long companyId,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSuggestDocumentLocalService.addSuggestion(title, content,
			language, visitorName, visitorEmail, visitorTel, visitorAddress,
			groupId, draftId, hasAttachment, companyId, userId);
	}

	/**
	* Adds the v legal suggest document to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalSuggestDocument the v legal suggest document
	* @return the v legal suggest document that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument addVLegalSuggestDocument(
		vn.gov.hoabinh.model.VLegalSuggestDocument vLegalSuggestDocument) {
		return _vLegalSuggestDocumentLocalService.addVLegalSuggestDocument(vLegalSuggestDocument);
	}

	/**
	* Creates a new v legal suggest document with the primary key. Does not add the v legal suggest document to the database.
	*
	* @param sugId the primary key for the new v legal suggest document
	* @return the new v legal suggest document
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument createVLegalSuggestDocument(
		java.lang.String sugId) {
		return _vLegalSuggestDocumentLocalService.createVLegalSuggestDocument(sugId);
	}

	/**
	* Deletes the v legal suggest document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sugId the primary key of the v legal suggest document
	* @return the v legal suggest document that was removed
	* @throws PortalException if a v legal suggest document with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument deleteVLegalSuggestDocument(
		java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalSuggestDocumentLocalService.deleteVLegalSuggestDocument(sugId);
	}

	/**
	* Deletes the v legal suggest document from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalSuggestDocument the v legal suggest document
	* @return the v legal suggest document that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument deleteVLegalSuggestDocument(
		vn.gov.hoabinh.model.VLegalSuggestDocument vLegalSuggestDocument) {
		return _vLegalSuggestDocumentLocalService.deleteVLegalSuggestDocument(vLegalSuggestDocument);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument fetchVLegalSuggestDocument(
		java.lang.String sugId) {
		return _vLegalSuggestDocumentLocalService.fetchVLegalSuggestDocument(sugId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument getSuggestion(
		java.lang.String suggestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSuggestDocumentLocalService.getSuggestion(suggestionId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument getSuggestion(
		long groupId, java.lang.String suggestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSuggestDocumentLocalService.getSuggestion(groupId,
			suggestionId);
	}

	/**
	* Returns the v legal suggest document with the primary key.
	*
	* @param sugId the primary key of the v legal suggest document
	* @return the v legal suggest document
	* @throws PortalException if a v legal suggest document with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument getVLegalSuggestDocument(
		java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalSuggestDocumentLocalService.getVLegalSuggestDocument(sugId);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument updateSuggestion(
		java.lang.String suggestionId, java.lang.String draftId, long groupId,
		java.lang.String title, java.lang.String content,
		java.lang.String language, java.lang.String visitorName,
		java.lang.String visitorEmail, java.lang.String visitorTel,
		java.lang.String visitorAddress, boolean approved, boolean hasAttachment)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSuggestDocumentLocalService.updateSuggestion(suggestionId,
			draftId, groupId, title, content, language, visitorName,
			visitorEmail, visitorTel, visitorAddress, approved, hasAttachment);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument updateSuggestion(
		vn.gov.hoabinh.model.VLegalSuggestDocument suggestion)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vLegalSuggestDocumentLocalService.updateSuggestion(suggestion);
	}

	/**
	* Updates the v legal suggest document in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalSuggestDocument the v legal suggest document
	* @return the v legal suggest document that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument updateVLegalSuggestDocument(
		vn.gov.hoabinh.model.VLegalSuggestDocument vLegalSuggestDocument) {
		return _vLegalSuggestDocumentLocalService.updateVLegalSuggestDocument(vLegalSuggestDocument);
	}

	@Override
	public void deleteSuggestion(java.lang.String suggestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalSuggestDocumentLocalService.deleteSuggestion(suggestionId);
	}

	@Override
	public void deleteSuggestions(java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalSuggestDocumentLocalService.deleteSuggestions(draftId);
	}

	@Override
	public void deleteSuggestions(java.lang.String draftId, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalSuggestDocumentLocalService.deleteSuggestions(draftId, approved);
	}

	@Override
	public void deleteSuggestions(java.lang.String[] suggestionIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vLegalSuggestDocumentLocalService.deleteSuggestions(suggestionIds);
	}

	@Override
	public VLegalSuggestDocumentLocalService getWrappedService() {
		return _vLegalSuggestDocumentLocalService;
	}

	@Override
	public void setWrappedService(
		VLegalSuggestDocumentLocalService vLegalSuggestDocumentLocalService) {
		_vLegalSuggestDocumentLocalService = vLegalSuggestDocumentLocalService;
	}

	private VLegalSuggestDocumentLocalService _vLegalSuggestDocumentLocalService;
}