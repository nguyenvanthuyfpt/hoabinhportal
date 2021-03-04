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
 * Provides the local service utility for VcmsAttachedMessage. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.VcmsAttachedMessageLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsAttachedMessageLocalService
 * @see vn.gov.hoabinh.service.base.VcmsAttachedMessageLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VcmsAttachedMessageLocalServiceImpl
 * @generated
 */
@ProviderType
public class VcmsAttachedMessageLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VcmsAttachedMessageLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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

	/**
	* Returns the number of vcms attached messages.
	*
	* @return the number of vcms attached messages
	*/
	public static int getVcmsAttachedMessagesCount() {
		return getService().getVcmsAttachedMessagesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<vn.gov.hoabinh.model.VcmsAttachedMessage> getAttachedMessageByArticle(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getAttachedMessageByArticle(articleId);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsAttachedMessage> getAttachedMessageByG(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getAttachedMessageByG(groupId);
	}

	/**
	* Returns a range of all the vcms attached messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsAttachedMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms attached messages
	* @param end the upper bound of the range of vcms attached messages (not inclusive)
	* @return the range of vcms attached messages
	*/
	public static java.util.List<vn.gov.hoabinh.model.VcmsAttachedMessage> getVcmsAttachedMessages(
		int start, int end) {
		return getService().getVcmsAttachedMessages(start, end);
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

	public static vn.gov.hoabinh.model.VcmsAttachedMessage addAttachedMessage(
		long groupId, java.lang.String createdByUser,
		java.lang.String articleId, java.lang.String message)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .addAttachedMessage(groupId, createdByUser, articleId,
			message);
	}

	/**
	* Adds the vcms attached message to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsAttachedMessage the vcms attached message
	* @return the vcms attached message that was added
	*/
	public static vn.gov.hoabinh.model.VcmsAttachedMessage addVcmsAttachedMessage(
		vn.gov.hoabinh.model.VcmsAttachedMessage vcmsAttachedMessage) {
		return getService().addVcmsAttachedMessage(vcmsAttachedMessage);
	}

	/**
	* Creates a new vcms attached message with the primary key. Does not add the vcms attached message to the database.
	*
	* @param messageId the primary key for the new vcms attached message
	* @return the new vcms attached message
	*/
	public static vn.gov.hoabinh.model.VcmsAttachedMessage createVcmsAttachedMessage(
		java.lang.String messageId) {
		return getService().createVcmsAttachedMessage(messageId);
	}

	/**
	* Deletes the vcms attached message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the vcms attached message
	* @return the vcms attached message that was removed
	* @throws PortalException if a vcms attached message with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VcmsAttachedMessage deleteVcmsAttachedMessage(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVcmsAttachedMessage(messageId);
	}

	/**
	* Deletes the vcms attached message from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsAttachedMessage the vcms attached message
	* @return the vcms attached message that was removed
	*/
	public static vn.gov.hoabinh.model.VcmsAttachedMessage deleteVcmsAttachedMessage(
		vn.gov.hoabinh.model.VcmsAttachedMessage vcmsAttachedMessage) {
		return getService().deleteVcmsAttachedMessage(vcmsAttachedMessage);
	}

	public static vn.gov.hoabinh.model.VcmsAttachedMessage fetchVcmsAttachedMessage(
		java.lang.String messageId) {
		return getService().fetchVcmsAttachedMessage(messageId);
	}

	/**
	* Returns the vcms attached message with the primary key.
	*
	* @param messageId the primary key of the vcms attached message
	* @return the vcms attached message
	* @throws PortalException if a vcms attached message with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VcmsAttachedMessage getVcmsAttachedMessage(
		java.lang.String messageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVcmsAttachedMessage(messageId);
	}

	public static vn.gov.hoabinh.model.VcmsAttachedMessage updateAttachedMessage(
		java.lang.String messageId, boolean read)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().updateAttachedMessage(messageId, read);
	}

	/**
	* Updates the vcms attached message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsAttachedMessage the vcms attached message
	* @return the vcms attached message that was updated
	*/
	public static vn.gov.hoabinh.model.VcmsAttachedMessage updateVcmsAttachedMessage(
		vn.gov.hoabinh.model.VcmsAttachedMessage vcmsAttachedMessage) {
		return getService().updateVcmsAttachedMessage(vcmsAttachedMessage);
	}

	public static VcmsAttachedMessageLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsAttachedMessageLocalService, VcmsAttachedMessageLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VcmsAttachedMessageLocalService.class);
}