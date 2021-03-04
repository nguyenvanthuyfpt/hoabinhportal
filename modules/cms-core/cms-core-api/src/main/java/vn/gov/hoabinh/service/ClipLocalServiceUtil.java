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
 * Provides the local service utility for Clip. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.ClipLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ClipLocalService
 * @see vn.gov.hoabinh.service.base.ClipLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.ClipLocalServiceImpl
 * @generated
 */
@ProviderType
public class ClipLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.ClipLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.DynamicQuery buildSearch(
		long groupId, java.lang.String clipTypeId, java.lang.String name,
		java.lang.String title, boolean active, boolean isCount) {
		return getService()
				   .buildSearch(groupId, clipTypeId, name, title, active,
			isCount);
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

	public static int countByClipTypeId(java.lang.String clipTypeId)
		throws java.lang.Exception {
		return getService().countByClipTypeId(clipTypeId);
	}

	public static int countClip(long groupId, java.lang.String clipTypeId,
		java.lang.String name, java.lang.String title, boolean active) {
		return getService().countClip(groupId, clipTypeId, name, title, active);
	}

	public static int countClipByG_L(long groupId, java.lang.String language)
		throws java.lang.Exception {
		return getService().countClipByG_L(groupId, language);
	}

	public static int countClipByG_L_A(long groupId, java.lang.String language,
		boolean active) throws java.lang.Exception {
		return getService().countClipByG_L_A(groupId, language, active);
	}

	public static int countClipByG_L_T(long groupId, java.lang.String language,
		java.lang.String clipTypeId) throws java.lang.Exception {
		return getService().countClipByG_L_T(groupId, language, clipTypeId);
	}

	public static int countClipDisplay(java.lang.String[] clipTypeIds) {
		return getService().countClipDisplay(clipTypeIds);
	}

	/**
	* Returns the number of clips.
	*
	* @return the number of clips
	*/
	public static int getClipsCount() {
		return getService().getClipsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<vn.gov.hoabinh.model.Clip> findByClipTypeId(
		java.lang.String clipTypeId) throws java.lang.Exception {
		return getService().findByClipTypeId(clipTypeId);
	}

	public static java.util.List<vn.gov.hoabinh.model.Clip> findByClipTypeId(
		java.lang.String clipTypeId, int start, int end)
		throws java.lang.Exception {
		return getService().findByClipTypeId(clipTypeId, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.Clip> getClipByG_L(
		long groupId, java.lang.String language) throws java.lang.Exception {
		return getService().getClipByG_L(groupId, language);
	}

	public static java.util.List<vn.gov.hoabinh.model.Clip> getClipByG_L(
		long groupId, java.lang.String language, int begin, int end)
		throws java.lang.Exception {
		return getService().getClipByG_L(groupId, language, begin, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.Clip> getClipByG_L_A(
		long groupId, java.lang.String language, boolean active)
		throws java.lang.Exception {
		return getService().getClipByG_L_A(groupId, language, active);
	}

	public static java.util.List<vn.gov.hoabinh.model.Clip> getClipByG_L_A(
		long groupId, java.lang.String language, boolean active, int begin,
		int end) throws java.lang.Exception {
		return getService().getClipByG_L_A(groupId, language, active, begin, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.Clip> getClipByG_L_T(
		long groupId, java.lang.String language, java.lang.String clipTypeId)
		throws java.lang.Exception {
		return getService().getClipByG_L_T(groupId, language, clipTypeId);
	}

	public static java.util.List<vn.gov.hoabinh.model.Clip> getClipByG_L_T(
		long groupId, java.lang.String language, java.lang.String clipTypeId,
		int begin, int end) throws java.lang.Exception {
		return getService()
				   .getClipByG_L_T(groupId, language, clipTypeId, begin, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.Clip> getClipDisplay(
		java.lang.String[] clipTypeIds, int start, int end) {
		return getService().getClipDisplay(clipTypeIds, start, end);
	}

	/**
	* Returns a range of all the clips.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.ClipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of clips
	* @param end the upper bound of the range of clips (not inclusive)
	* @return the range of clips
	*/
	public static java.util.List<vn.gov.hoabinh.model.Clip> getClips(
		int start, int end) {
		return getService().getClips(start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.Clip> searchClip(
		long groupId, java.lang.String clipTypeId, java.lang.String name,
		java.lang.String title, boolean active, int start, int end) {
		return getService()
				   .searchClip(groupId, clipTypeId, name, title, active, start,
			end);
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

	public static vn.gov.hoabinh.model.Clip addClip(long groupId,
		java.lang.String language, long plid, long companyId, long userId,
		java.lang.String clipTypeId, java.lang.String url,
		java.lang.String image, java.lang.String name, java.lang.String title,
		java.lang.String description, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .addClip(groupId, language, plid, companyId, userId,
			clipTypeId, url, image, name, title, description, active);
	}

	/**
	* Adds the clip to the database. Also notifies the appropriate model listeners.
	*
	* @param clip the clip
	* @return the clip that was added
	*/
	public static vn.gov.hoabinh.model.Clip addClip(
		vn.gov.hoabinh.model.Clip clip) {
		return getService().addClip(clip);
	}

	/**
	* Creates a new clip with the primary key. Does not add the clip to the database.
	*
	* @param id the primary key for the new clip
	* @return the new clip
	*/
	public static vn.gov.hoabinh.model.Clip createClip(java.lang.String id) {
		return getService().createClip(id);
	}

	/**
	* Deletes the clip with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the clip
	* @return the clip that was removed
	* @throws PortalException if a clip with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.Clip deleteClip(java.lang.String id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteClip(id);
	}

	/**
	* Deletes the clip from the database. Also notifies the appropriate model listeners.
	*
	* @param clip the clip
	* @return the clip that was removed
	*/
	public static vn.gov.hoabinh.model.Clip deleteClip(
		vn.gov.hoabinh.model.Clip clip) {
		return getService().deleteClip(clip);
	}

	public static vn.gov.hoabinh.model.Clip fetchClip(java.lang.String id) {
		return getService().fetchClip(id);
	}

	/**
	* Returns the clip with the primary key.
	*
	* @param id the primary key of the clip
	* @return the clip
	* @throws PortalException if a clip with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.Clip getClip(java.lang.String id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getClip(id);
	}

	public static vn.gov.hoabinh.model.Clip increaseHitCount(
		java.lang.String clipId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().increaseHitCount(clipId);
	}

	public static vn.gov.hoabinh.model.Clip increaseHitCountView(
		java.lang.String clipId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().increaseHitCountView(clipId);
	}

	public static vn.gov.hoabinh.model.Clip updateClip(
		java.lang.String clipId, long groupId, java.lang.String language,
		java.lang.String title, java.lang.String name,
		java.lang.String description, java.lang.String url,
		java.lang.String image, java.lang.String clipTypeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .updateClip(clipId, groupId, language, title, name,
			description, url, image, clipTypeId);
	}

	/**
	* Updates the clip in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param clip the clip
	* @return the clip that was updated
	*/
	public static vn.gov.hoabinh.model.Clip updateClip(
		vn.gov.hoabinh.model.Clip clip) {
		return getService().updateClip(clip);
	}

	public static void deleteClip(long clipId) throws java.lang.Exception {
		getService().deleteClip(clipId);
	}

	public static ClipLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ClipLocalService, ClipLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ClipLocalService.class);
}