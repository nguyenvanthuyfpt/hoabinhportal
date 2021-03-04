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
 * Provides a wrapper for {@link ClipLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ClipLocalService
 * @generated
 */
@ProviderType
public class ClipLocalServiceWrapper implements ClipLocalService,
	ServiceWrapper<ClipLocalService> {
	public ClipLocalServiceWrapper(ClipLocalService clipLocalService) {
		_clipLocalService = clipLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildSearch(
		long groupId, java.lang.String clipTypeId, java.lang.String name,
		java.lang.String title, boolean active, boolean isCount) {
		return _clipLocalService.buildSearch(groupId, clipTypeId, name, title,
			active, isCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _clipLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _clipLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _clipLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countByClipTypeId(java.lang.String clipTypeId)
		throws java.lang.Exception {
		return _clipLocalService.countByClipTypeId(clipTypeId);
	}

	@Override
	public int countClip(long groupId, java.lang.String clipTypeId,
		java.lang.String name, java.lang.String title, boolean active) {
		return _clipLocalService.countClip(groupId, clipTypeId, name, title,
			active);
	}

	@Override
	public int countClipByG_L(long groupId, java.lang.String language)
		throws java.lang.Exception {
		return _clipLocalService.countClipByG_L(groupId, language);
	}

	@Override
	public int countClipByG_L_A(long groupId, java.lang.String language,
		boolean active) throws java.lang.Exception {
		return _clipLocalService.countClipByG_L_A(groupId, language, active);
	}

	@Override
	public int countClipByG_L_T(long groupId, java.lang.String language,
		java.lang.String clipTypeId) throws java.lang.Exception {
		return _clipLocalService.countClipByG_L_T(groupId, language, clipTypeId);
	}

	@Override
	public int countClipDisplay(java.lang.String[] clipTypeIds) {
		return _clipLocalService.countClipDisplay(clipTypeIds);
	}

	/**
	* Returns the number of clips.
	*
	* @return the number of clips
	*/
	@Override
	public int getClipsCount() {
		return _clipLocalService.getClipsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _clipLocalService.getOSGiServiceIdentifier();
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
		return _clipLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _clipLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _clipLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Clip> findByClipTypeId(
		java.lang.String clipTypeId) throws java.lang.Exception {
		return _clipLocalService.findByClipTypeId(clipTypeId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Clip> findByClipTypeId(
		java.lang.String clipTypeId, int start, int end)
		throws java.lang.Exception {
		return _clipLocalService.findByClipTypeId(clipTypeId, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Clip> getClipByG_L(
		long groupId, java.lang.String language) throws java.lang.Exception {
		return _clipLocalService.getClipByG_L(groupId, language);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Clip> getClipByG_L(
		long groupId, java.lang.String language, int begin, int end)
		throws java.lang.Exception {
		return _clipLocalService.getClipByG_L(groupId, language, begin, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Clip> getClipByG_L_A(
		long groupId, java.lang.String language, boolean active)
		throws java.lang.Exception {
		return _clipLocalService.getClipByG_L_A(groupId, language, active);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Clip> getClipByG_L_A(
		long groupId, java.lang.String language, boolean active, int begin,
		int end) throws java.lang.Exception {
		return _clipLocalService.getClipByG_L_A(groupId, language, active,
			begin, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Clip> getClipByG_L_T(
		long groupId, java.lang.String language, java.lang.String clipTypeId)
		throws java.lang.Exception {
		return _clipLocalService.getClipByG_L_T(groupId, language, clipTypeId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Clip> getClipByG_L_T(
		long groupId, java.lang.String language, java.lang.String clipTypeId,
		int begin, int end) throws java.lang.Exception {
		return _clipLocalService.getClipByG_L_T(groupId, language, clipTypeId,
			begin, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Clip> getClipDisplay(
		java.lang.String[] clipTypeIds, int start, int end) {
		return _clipLocalService.getClipDisplay(clipTypeIds, start, end);
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
	@Override
	public java.util.List<vn.gov.hoabinh.model.Clip> getClips(int start, int end) {
		return _clipLocalService.getClips(start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.Clip> searchClip(long groupId,
		java.lang.String clipTypeId, java.lang.String name,
		java.lang.String title, boolean active, int start, int end) {
		return _clipLocalService.searchClip(groupId, clipTypeId, name, title,
			active, start, end);
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
		return _clipLocalService.dynamicQueryCount(dynamicQuery);
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
		return _clipLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public vn.gov.hoabinh.model.Clip addClip(long groupId,
		java.lang.String language, long plid, long companyId, long userId,
		java.lang.String clipTypeId, java.lang.String url,
		java.lang.String image, java.lang.String name, java.lang.String title,
		java.lang.String description, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _clipLocalService.addClip(groupId, language, plid, companyId,
			userId, clipTypeId, url, image, name, title, description, active);
	}

	/**
	* Adds the clip to the database. Also notifies the appropriate model listeners.
	*
	* @param clip the clip
	* @return the clip that was added
	*/
	@Override
	public vn.gov.hoabinh.model.Clip addClip(vn.gov.hoabinh.model.Clip clip) {
		return _clipLocalService.addClip(clip);
	}

	/**
	* Creates a new clip with the primary key. Does not add the clip to the database.
	*
	* @param id the primary key for the new clip
	* @return the new clip
	*/
	@Override
	public vn.gov.hoabinh.model.Clip createClip(java.lang.String id) {
		return _clipLocalService.createClip(id);
	}

	/**
	* Deletes the clip with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the clip
	* @return the clip that was removed
	* @throws PortalException if a clip with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.Clip deleteClip(java.lang.String id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _clipLocalService.deleteClip(id);
	}

	/**
	* Deletes the clip from the database. Also notifies the appropriate model listeners.
	*
	* @param clip the clip
	* @return the clip that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.Clip deleteClip(vn.gov.hoabinh.model.Clip clip) {
		return _clipLocalService.deleteClip(clip);
	}

	@Override
	public vn.gov.hoabinh.model.Clip fetchClip(java.lang.String id) {
		return _clipLocalService.fetchClip(id);
	}

	/**
	* Returns the clip with the primary key.
	*
	* @param id the primary key of the clip
	* @return the clip
	* @throws PortalException if a clip with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.Clip getClip(java.lang.String id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _clipLocalService.getClip(id);
	}

	@Override
	public vn.gov.hoabinh.model.Clip increaseHitCount(java.lang.String clipId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _clipLocalService.increaseHitCount(clipId);
	}

	@Override
	public vn.gov.hoabinh.model.Clip increaseHitCountView(
		java.lang.String clipId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _clipLocalService.increaseHitCountView(clipId);
	}

	@Override
	public vn.gov.hoabinh.model.Clip updateClip(java.lang.String clipId,
		long groupId, java.lang.String language, java.lang.String title,
		java.lang.String name, java.lang.String description,
		java.lang.String url, java.lang.String image,
		java.lang.String clipTypeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _clipLocalService.updateClip(clipId, groupId, language, title,
			name, description, url, image, clipTypeId);
	}

	/**
	* Updates the clip in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param clip the clip
	* @return the clip that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.Clip updateClip(vn.gov.hoabinh.model.Clip clip) {
		return _clipLocalService.updateClip(clip);
	}

	@Override
	public void deleteClip(long clipId) throws java.lang.Exception {
		_clipLocalService.deleteClip(clipId);
	}

	@Override
	public ClipLocalService getWrappedService() {
		return _clipLocalService;
	}

	@Override
	public void setWrappedService(ClipLocalService clipLocalService) {
		_clipLocalService = clipLocalService;
	}

	private ClipLocalService _clipLocalService;
}