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
 * Provides the local service utility for VLegalField. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.VLegalFieldLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFieldLocalService
 * @see vn.gov.hoabinh.service.base.VLegalFieldLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VLegalFieldLocalServiceImpl
 * @generated
 */
@ProviderType
public class VLegalFieldLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VLegalFieldLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
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

	public static int countFieldByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countFieldByGroupId(groupId);
	}

	/**
	* Returns the number of v legal fields.
	*
	* @return the number of v legal fields
	*/
	public static int getVLegalFieldsCount() {
		return getService().getVLegalFieldsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List getAllFields()
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getAllFields();
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalField> getFieldByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFieldByGroupId(groupId);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalField> getFieldByGroupId(
		long groupId, int begin, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFieldByGroupId(groupId, begin, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalField> getVFieldByS_L(
		long groupId, boolean status, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getVFieldByS_L(groupId, status, language);
	}

	public static java.util.List<vn.gov.hoabinh.model.VLegalField> getVFieldByS_Rss(
		long groupId, boolean status, boolean rssable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getVFieldByS_Rss(groupId, status, rssable);
	}

	/**
	* Returns a range of all the v legal fields.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalFieldModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal fields
	* @param end the upper bound of the range of v legal fields (not inclusive)
	* @return the range of v legal fields
	*/
	public static java.util.List<vn.gov.hoabinh.model.VLegalField> getVLegalFields(
		int start, int end) {
		return getService().getVLegalFields(start, end);
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

	public static vn.gov.hoabinh.model.VLegalField addField(long groupId,
		java.lang.String name, java.lang.String description,
		java.lang.String language, boolean status, boolean rssable,
		com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .addField(groupId, name, description, language, status,
			rssable, themeDisplay);
	}

	/**
	* Adds the v legal field to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalField the v legal field
	* @return the v legal field that was added
	*/
	public static vn.gov.hoabinh.model.VLegalField addVLegalField(
		vn.gov.hoabinh.model.VLegalField vLegalField) {
		return getService().addVLegalField(vLegalField);
	}

	/**
	* Creates a new v legal field with the primary key. Does not add the v legal field to the database.
	*
	* @param fieldId the primary key for the new v legal field
	* @return the new v legal field
	*/
	public static vn.gov.hoabinh.model.VLegalField createVLegalField(
		java.lang.String fieldId) {
		return getService().createVLegalField(fieldId);
	}

	/**
	* Deletes the v legal field with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param fieldId the primary key of the v legal field
	* @return the v legal field that was removed
	* @throws PortalException if a v legal field with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalField deleteVLegalField(
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVLegalField(fieldId);
	}

	/**
	* Deletes the v legal field from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalField the v legal field
	* @return the v legal field that was removed
	*/
	public static vn.gov.hoabinh.model.VLegalField deleteVLegalField(
		vn.gov.hoabinh.model.VLegalField vLegalField) {
		return getService().deleteVLegalField(vLegalField);
	}

	public static vn.gov.hoabinh.model.VLegalField fetchVLegalField(
		java.lang.String fieldId) {
		return getService().fetchVLegalField(fieldId);
	}

	public static vn.gov.hoabinh.model.VLegalField getVField(
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getVField(fieldId);
	}

	public static vn.gov.hoabinh.model.VLegalField getVField(long groupId,
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getVField(groupId, fieldId);
	}

	/**
	* Returns the v legal field with the primary key.
	*
	* @param fieldId the primary key of the v legal field
	* @return the v legal field
	* @throws PortalException if a v legal field with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VLegalField getVLegalField(
		java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVLegalField(fieldId);
	}

	public static vn.gov.hoabinh.model.VLegalField updateField(long groupId,
		java.lang.String fieldId, java.lang.String name,
		java.lang.String description, java.lang.String language,
		boolean status, boolean rss)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .updateField(groupId, fieldId, name, description, language,
			status, rss);
	}

	/**
	* Updates the v legal field in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalField the v legal field
	* @return the v legal field that was updated
	*/
	public static vn.gov.hoabinh.model.VLegalField updateVLegalField(
		vn.gov.hoabinh.model.VLegalField vLegalField) {
		return getService().updateVLegalField(vLegalField);
	}

	public static void deleteField(java.lang.String fieldId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteField(fieldId);
	}

	public static VLegalFieldLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VLegalFieldLocalService, VLegalFieldLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VLegalFieldLocalService.class);
}