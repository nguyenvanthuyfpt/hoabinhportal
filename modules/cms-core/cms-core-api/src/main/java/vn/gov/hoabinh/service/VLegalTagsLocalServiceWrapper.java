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
 * Provides a wrapper for {@link VLegalTagsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTagsLocalService
 * @generated
 */
@ProviderType
public class VLegalTagsLocalServiceWrapper implements VLegalTagsLocalService,
	ServiceWrapper<VLegalTagsLocalService> {
	public VLegalTagsLocalServiceWrapper(
		VLegalTagsLocalService vLegalTagsLocalService) {
		_vLegalTagsLocalService = vLegalTagsLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vLegalTagsLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalTagsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalTagsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of v legal tagses.
	*
	* @return the number of v legal tagses
	*/
	@Override
	public int getVLegalTagsesCount() {
		return _vLegalTagsLocalService.getVLegalTagsesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vLegalTagsLocalService.getOSGiServiceIdentifier();
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
		return _vLegalTagsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalTagsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vLegalTagsLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the v legal tagses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalTagsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of v legal tagses
	* @param end the upper bound of the range of v legal tagses (not inclusive)
	* @return the range of v legal tagses
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VLegalTags> getVLegalTagses(
		int start, int end) {
		return _vLegalTagsLocalService.getVLegalTagses(start, end);
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
		return _vLegalTagsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vLegalTagsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the v legal tags to the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalTags the v legal tags
	* @return the v legal tags that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalTags addVLegalTags(
		vn.gov.hoabinh.model.VLegalTags vLegalTags) {
		return _vLegalTagsLocalService.addVLegalTags(vLegalTags);
	}

	/**
	* Creates a new v legal tags with the primary key. Does not add the v legal tags to the database.
	*
	* @param tagId the primary key for the new v legal tags
	* @return the new v legal tags
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalTags createVLegalTags(
		java.lang.String tagId) {
		return _vLegalTagsLocalService.createVLegalTags(tagId);
	}

	/**
	* Deletes the v legal tags with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param tagId the primary key of the v legal tags
	* @return the v legal tags that was removed
	* @throws PortalException if a v legal tags with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalTags deleteVLegalTags(
		java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalTagsLocalService.deleteVLegalTags(tagId);
	}

	/**
	* Deletes the v legal tags from the database. Also notifies the appropriate model listeners.
	*
	* @param vLegalTags the v legal tags
	* @return the v legal tags that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalTags deleteVLegalTags(
		vn.gov.hoabinh.model.VLegalTags vLegalTags) {
		return _vLegalTagsLocalService.deleteVLegalTags(vLegalTags);
	}

	@Override
	public vn.gov.hoabinh.model.VLegalTags fetchVLegalTags(
		java.lang.String tagId) {
		return _vLegalTagsLocalService.fetchVLegalTags(tagId);
	}

	/**
	* Returns the v legal tags with the primary key.
	*
	* @param tagId the primary key of the v legal tags
	* @return the v legal tags
	* @throws PortalException if a v legal tags with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalTags getVLegalTags(java.lang.String tagId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vLegalTagsLocalService.getVLegalTags(tagId);
	}

	/**
	* Updates the v legal tags in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vLegalTags the v legal tags
	* @return the v legal tags that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VLegalTags updateVLegalTags(
		vn.gov.hoabinh.model.VLegalTags vLegalTags) {
		return _vLegalTagsLocalService.updateVLegalTags(vLegalTags);
	}

	@Override
	public VLegalTagsLocalService getWrappedService() {
		return _vLegalTagsLocalService;
	}

	@Override
	public void setWrappedService(VLegalTagsLocalService vLegalTagsLocalService) {
		_vLegalTagsLocalService = vLegalTagsLocalService;
	}

	private VLegalTagsLocalService _vLegalTagsLocalService;
}