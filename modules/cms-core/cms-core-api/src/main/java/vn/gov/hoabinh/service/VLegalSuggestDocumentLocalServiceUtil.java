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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for VLegalSuggestDocument. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.VLegalSuggestDocumentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSuggestDocumentLocalService
 * @see vn.gov.hoabinh.service.base.VLegalSuggestDocumentLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalSuggestDocumentLocalServiceImpl
 * @generated
 */
@ProviderType
public class VLegalSuggestDocumentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalSuggestDocumentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.DynamicQuery buildDQBackEnd(
		long groupId, java.lang.String language, java.lang.String keyword,
		java.util.Date dateFrom, java.util.Date dateTo, int approved,
		boolean isCount) {
		return getService()
				   .buildDQBackEnd(groupId, language, keyword, dateFrom,
			dateTo, approved, isCount);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static int countSuggestionsByP_L_A(long groupId,
		java.lang.String language, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().countSuggestionsByP_L_A(groupId, language, approved);
	}

	public static int countSuggestionsByP_L_A_D(long groupId,
		java.lang.String language, boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .countSuggestionsByP_L_A_D(groupId, language, approved,
			draftId);
	}

	public static int countSugguest(long groupId, java.lang.String language,
		java.lang.String keyword, java.util.Date dateFrom,
		java.util.Date dateTo, int approved) {
		return getService()
				   .countSugguest(groupId, language, keyword, dateFrom, dateTo,
			approved);
	}

	/**
	* Returns the number of v legal suggest documents.
	*
	* @return the number of v legal suggest documents
	*/
	public static int getVLegalSuggestDocumentsCount() {
		return getService().getVLegalSuggestDocumentsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getSuggestions(
		boolean approved, java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getSuggestions(approved, draftId);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getSuggestions(
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getSuggestions(draftId);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getSuggestionsByP_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getSuggestionsByP_L(groupId, language);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getSuggestionsByP_L_A(
		long groupId, java.lang.String language, boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getSuggestionsByP_L_A(groupId, language, approved);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getSuggestionsByP_L_A(
		long groupId, java.lang.String language, boolean approved, int begin,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getSuggestionsByP_L_A(groupId, language, approved, begin,
			end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getSuggestionsByP_L_A_D(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getSuggestionsByP_L_A_D(groupId, language, approved, draftId);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getSuggestionsByP_L_A_D(
		long groupId, java.lang.String language, boolean approved,
		java.lang.String draftId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getSuggestionsByP_L_A_D(groupId, language, approved,
			draftId, begin, end);
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
	public static java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> getVLegalSuggestDocuments(
		int start, int end) {
		return getService().getVLegalSuggestDocuments(start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalSuggestDocument> searchSugguest(
		long groupId, java.lang.String language, java.lang.String keyword,
		java.util.Date dateFrom, java.util.Date dateTo, int approved,
		int start, int end) {
		return getService()
				   .searchSugguest(groupId, language, keyword, dateFrom,
			dateTo, approved, start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static vn.gov.hoabinh.model.VLegalSuggestDocument addSuggestion(
		java.lang.String title, java.lang.String content,
		java.lang.String language, java.lang.String visitorName,
		java.lang.String visitorEmail, java.lang.String visitorTel,
		java.lang.String visitorAddress, long groupId,
		java.lang.String draftId, boolean hasAttachment, long companyId,
		long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .addSuggestion(title, content, language, visitorName,
			visitorEmail, visitorTel, visitorAddress, groupId, draftId,
			hasAttachment, companyId, userId);
	}

	/**
	* Adds the v legal suggest document to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalSuggestDocument the v legal suggest document
	* @return the v legal suggest document that was added
	*/
	public static vn.gov.hoabinh.model.VLegalSuggestDocument addVLegalSuggestDocument(
		vn.gov.hoabinh.model.VLegalSuggestDocument vLegalSuggestDocument) {
		return getService().addVLegalSuggestDocument(vLegalSuggestDocument);
	}

	/**
	* Creates a new v legal suggest document with the primary key. Does not add the v legal suggest document to the database.
	*
	* @param sugId the primary key for the new v legal suggest document
	* @return the new v legal suggest document
	*/
	public static vn.gov.hoabinh.model.VLegalSuggestDocument createVLegalSuggestDocument(
		java.lang.String sugId) {
		return getService().createVLegalSuggestDocument(sugId);
	}

	/**
	* Deletes the v legal suggest document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sugId the primary key of the v legal suggest document
	* @return the v legal suggest document that was removed
	* @throws PortalException if a v legal suggest document with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalSuggestDocument deleteVLegalSuggestDocument(
		java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVLegalSuggestDocument(sugId);
	}

	/**
	* Deletes the v legal suggest document from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalSuggestDocument the v legal suggest document
	* @return the v legal suggest document that was removed
	*/
	public static vn.gov.hoabinh.model.VLegalSuggestDocument deleteVLegalSuggestDocument(
		vn.gov.hoabinh.model.VLegalSuggestDocument vLegalSuggestDocument) {
		return getService().deleteVLegalSuggestDocument(vLegalSuggestDocument);
	}

	public static vn.gov.hoabinh.model.VLegalSuggestDocument fetchVLegalSuggestDocument(
		java.lang.String sugId) {
		return getService().fetchVLegalSuggestDocument(sugId);
	}

	public static vn.gov.hoabinh.model.VLegalSuggestDocument getSuggestion(
		java.lang.String suggestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getSuggestion(suggestionId);
	}

	public static vn.gov.hoabinh.model.VLegalSuggestDocument getSuggestion(
		long groupId, java.lang.String suggestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getSuggestion(groupId, suggestionId);
	}

	/**
	* Returns the v legal suggest document with the primary key.
	*
	* @param sugId the primary key of the v legal suggest document
	* @return the v legal suggest document
	* @throws PortalException if a v legal suggest document with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalSuggestDocument getVLegalSuggestDocument(
		java.lang.String sugId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVLegalSuggestDocument(sugId);
	}

	public static vn.gov.hoabinh.model.VLegalSuggestDocument updateSuggestion(
		java.lang.String suggestionId, java.lang.String draftId, long groupId,
		java.lang.String title, java.lang.String content,
		java.lang.String language, java.lang.String visitorName,
		java.lang.String visitorEmail, java.lang.String visitorTel,
		java.lang.String visitorAddress, boolean approved, boolean hasAttachment)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .updateSuggestion(suggestionId, draftId, groupId, title,
			content, language, visitorName, visitorEmail, visitorTel,
			visitorAddress, approved, hasAttachment);
	}

	public static vn.gov.hoabinh.model.VLegalSuggestDocument updateSuggestion(
		vn.gov.hoabinh.model.VLegalSuggestDocument suggestion)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().updateSuggestion(suggestion);
	}

	/**
	* Updates the v legal suggest document in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalSuggestDocument the v legal suggest document
	* @return the v legal suggest document that was updated
	*/
	public static vn.gov.hoabinh.model.VLegalSuggestDocument updateVLegalSuggestDocument(
		vn.gov.hoabinh.model.VLegalSuggestDocument vLegalSuggestDocument) {
		return getService().updateVLegalSuggestDocument(vLegalSuggestDocument);
	}

	public static void deleteSuggestion(java.lang.String suggestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteSuggestion(suggestionId);
	}

	public static void deleteSuggestions(java.lang.String draftId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteSuggestions(draftId);
	}

	public static void deleteSuggestions(java.lang.String draftId,
		boolean approved)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteSuggestions(draftId, approved);
	}

	public static void deleteSuggestions(java.lang.String[] suggestionIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteSuggestions(suggestionIds);
	}

	public static VLegalSuggestDocumentLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalSuggestDocumentLocalService, VLegalSuggestDocumentLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VLegalSuggestDocumentLocalService.class);
}