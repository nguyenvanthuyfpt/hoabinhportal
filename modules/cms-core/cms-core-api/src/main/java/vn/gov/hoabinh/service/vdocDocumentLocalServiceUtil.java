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
 * Provides the local service utility for vdocDocument. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.vdocDocumentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see vdocDocumentLocalService
 * @see vn.gov.hoabinh.service.base.vdocDocumentLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.vdocDocumentLocalServiceImpl
 * @generated
 */
@ProviderType
public class vdocDocumentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.vdocDocumentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.DynamicQuery buildDQBackEnd(
		long groupId, java.lang.String language, java.lang.String keyword,
		java.lang.String fieldId, java.util.Date dateFrom,
		java.util.Date dateTo, int status, boolean isCount) {
		return getService()
				   .buildDQBackEnd(groupId, language, keyword, fieldId,
			dateFrom, dateTo, status, isCount);
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

	public static int countDocByG_L_F(long groupId, java.lang.String language,
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countDocByG_L_F(groupId, language, fieldId);
	}

	public static int countDocByG_L_F_S(long groupId,
		java.lang.String language, java.lang.String fieldId, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countDocByG_L_F_S(groupId, language, fieldId, status);
	}

	public static int countDocByG_L_S(long groupId, java.lang.String language,
		int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countDocByG_L_S(groupId, language, status);
	}

	public static int countDocByG_L_S_F_T(long groupId,
		java.lang.String language, int status, java.lang.String fieldId,
		int type)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .countDocByG_L_S_F_T(groupId, language, status, fieldId, type);
	}

	public static int countDocByG_L_S_S(long groupId,
		java.lang.String language, int status, boolean hasService)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countDocByG_L_S_S(groupId, language, status, hasService);
	}

	public static int countDocByG_L_S_T(long groupId,
		java.lang.String language, int status, int type)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().countDocByG_L_S_T(groupId, language, status, type);
	}

	public static int countDocument(long groupId, java.lang.String language,
		java.lang.String keyword, java.lang.String fieldId,
		java.lang.String typeId, java.util.Date dateFrom,
		java.util.Date dateTo, int status, boolean isTitle, boolean isContent) {
		return getService()
				   .countDocument(groupId, language, keyword, fieldId, typeId,
			dateFrom, dateTo, status, isTitle, isContent);
	}

	/**
	* Returns the number of vdoc documents.
	*
	* @return the number of vdoc documents
	*/
	public static int getvdocDocumentsCount() {
		return getService().getvdocDocumentsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.vdocDocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<vn.gov.hoabinh.model.vdocDocument> getDocByG_L_F(
		long groupId, java.lang.String language, java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocByG_L_F(groupId, language, fieldId);
	}

	public static java.util.List<vn.gov.hoabinh.model.vdocDocument> getDocByG_L_S(
		long groupId, java.lang.String language, int status)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocByG_L_S(groupId, language, status);
	}

	public static java.util.List<vn.gov.hoabinh.model.vdocDocument> getDocByG_L_S(
		long groupId, java.lang.String language, int status, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocByG_L_S(groupId, language, status, begin, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.vdocDocument> getDocByG_L_S_F_T(
		long groupId, java.lang.String language, int status,
		java.lang.String fieldId, int type)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getDocByG_L_S_F_T(groupId, language, status, fieldId, type);
	}

	public static java.util.List<vn.gov.hoabinh.model.vdocDocument> getDocByG_L_S_F_T(
		long groupId, java.lang.String language, int status,
		java.lang.String fieldId, int type, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getDocByG_L_S_F_T(groupId, language, status, fieldId, type,
			start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.vdocDocument> getDocByG_L_S_S(
		long groupId, java.lang.String language, int status, boolean hasService)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDocByG_L_S_S(groupId, language, status, hasService);
	}

	public static java.util.List<vn.gov.hoabinh.model.vdocDocument> getDocByG_L_S_S(
		long groupId, java.lang.String language, int status,
		boolean hasService, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDocByG_L_S_S(groupId, language, status, hasService,
			begin, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.vdocDocument> getDocByG_L_S_T(
		long groupId, java.lang.String language, int status, int type)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocByG_L_S_T(groupId, language, status, type);
	}

	public static java.util.List<vn.gov.hoabinh.model.vdocDocument> getDocByG_L_S_T(
		long groupId, java.lang.String language, int status, int type,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getDocByG_L_S_T(groupId, language, status, type, start, end);
	}

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
	public static java.util.List<vn.gov.hoabinh.model.vdocDocument> getvdocDocuments(
		int start, int end) {
		return getService().getvdocDocuments(start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalDocument> searchDocument(
		long groupId, java.lang.String language, java.lang.String keyword,
		java.lang.String fieldId, java.lang.String typeId,
		java.util.Date dateFrom, java.util.Date dateTo, int status,
		boolean isTitle, boolean isContent, int start, int end) {
		return getService()
				   .searchDocument(groupId, language, keyword, fieldId, typeId,
			dateFrom, dateTo, status, isTitle, isContent, start, end);
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

	public static vn.gov.hoabinh.model.vdocDocument addDocument(long groupId,
		long userId, long companyId, java.lang.String language,
		java.lang.String title, java.lang.String content,
		java.lang.String process, java.lang.String base,
		java.lang.String timeProcess, java.lang.String cost,
		java.lang.String result, java.lang.String requireDoc,
		java.lang.String objects, java.lang.String style,
		java.lang.String note, java.util.Date promulDate,
		java.util.Date effectivedDate, java.util.Date expiredDate,
		java.lang.String fieldId, java.lang.String orgRels,
		java.lang.String fieldRels, boolean hasAttachment, boolean hasService,
		int typeDoc, java.lang.String levels, java.lang.String executeOrg)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .addDocument(groupId, userId, companyId, language, title,
			content, process, base, timeProcess, cost, result, requireDoc,
			objects, style, note, promulDate, effectivedDate, expiredDate,
			fieldId, orgRels, fieldRels, hasAttachment, hasService, typeDoc,
			levels, executeOrg);
	}

	/**
	* Adds the vdoc document to the database. Also notifies the appropriate model listeners.
	*
	* @param vdocDocument the vdoc document
	* @return the vdoc document that was added
	*/
	public static vn.gov.hoabinh.model.vdocDocument addvdocDocument(
		vn.gov.hoabinh.model.vdocDocument vdocDocument) {
		return getService().addvdocDocument(vdocDocument);
	}

	/**
	* Creates a new vdoc document with the primary key. Does not add the vdoc document to the database.
	*
	* @param docId the primary key for the new vdoc document
	* @return the new vdoc document
	*/
	public static vn.gov.hoabinh.model.vdocDocument createvdocDocument(
		java.lang.String docId) {
		return getService().createvdocDocument(docId);
	}

	/**
	* Deletes the vdoc document with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param docId the primary key of the vdoc document
	* @return the vdoc document that was removed
	* @throws PortalException if a vdoc document with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.vdocDocument deletevdocDocument(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletevdocDocument(docId);
	}

	/**
	* Deletes the vdoc document from the database. Also notifies the appropriate model listeners.
	*
	* @param vdocDocument the vdoc document
	* @return the vdoc document that was removed
	*/
	public static vn.gov.hoabinh.model.vdocDocument deletevdocDocument(
		vn.gov.hoabinh.model.vdocDocument vdocDocument) {
		return getService().deletevdocDocument(vdocDocument);
	}

	public static vn.gov.hoabinh.model.vdocDocument fetchvdocDocument(
		java.lang.String docId) {
		return getService().fetchvdocDocument(docId);
	}

	public static vn.gov.hoabinh.model.vdocDocument findByPosition(int position)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByPosition(position);
	}

	public static vn.gov.hoabinh.model.vdocDocument getDocument(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDocument(docId);
	}

	/**
	* Returns the vdoc document with the primary key.
	*
	* @param docId the primary key of the vdoc document
	* @return the vdoc document
	* @throws PortalException if a vdoc document with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.vdocDocument getvdocDocument(
		java.lang.String docId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getvdocDocument(docId);
	}

	public static vn.gov.hoabinh.model.vdocDocument updateDoc(long userId,
		long companyId, java.lang.String docId, long groupId,
		java.lang.String language, int status, java.lang.String title,
		java.lang.String content, java.lang.String process,
		java.lang.String base, java.lang.String timeProcess,
		java.lang.String cost, java.lang.String result,
		java.lang.String requireDoc, java.lang.String objects,
		java.lang.String style, java.lang.String note,
		java.util.Date promulDate, java.util.Date effectivedDate,
		java.util.Date expiredDate, java.lang.String fieldId,
		java.lang.String orgRels, java.lang.String fieldRels,
		boolean hasAttachment, boolean hasService, int typeDoc,
		java.lang.String levels, java.lang.String executeOrg,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .updateDoc(userId, companyId, docId, groupId, language,
			status, title, content, process, base, timeProcess, cost, result,
			requireDoc, objects, style, note, promulDate, effectivedDate,
			expiredDate, fieldId, orgRels, fieldRels, hasAttachment,
			hasService, typeDoc, levels, executeOrg, themeDisplay);
	}

	public static vn.gov.hoabinh.model.vdocDocument updateDocument(
		java.lang.String docId, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().updateDocument(docId, position);
	}

	public static vn.gov.hoabinh.model.vdocDocument updateDocument(
		vn.gov.hoabinh.model.vdocDocument vDoc,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().updateDocument(vDoc, themeDisplay);
	}

	/**
	* Updates the vdoc document in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vdocDocument the vdoc document
	* @return the vdoc document that was updated
	*/
	public static vn.gov.hoabinh.model.vdocDocument updatevdocDocument(
		vn.gov.hoabinh.model.vdocDocument vdocDocument) {
		return getService().updatevdocDocument(vdocDocument);
	}

	public static void deleteDocument(java.lang.String documentId,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteDocument(documentId, themeDisplay);
	}

	public static vdocDocumentLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<vdocDocumentLocalService, vdocDocumentLocalService> _serviceTracker =
		ServiceTrackerFactory.open(vdocDocumentLocalService.class);
}