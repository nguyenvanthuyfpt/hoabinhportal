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
 * Provides a wrapper for {@link VcmsArticleVersionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleVersionLocalService
 * @generated
 */
@ProviderType
public class VcmsArticleVersionLocalServiceWrapper
	implements VcmsArticleVersionLocalService,
		ServiceWrapper<VcmsArticleVersionLocalService> {
	public VcmsArticleVersionLocalServiceWrapper(
		VcmsArticleVersionLocalService vcmsArticleVersionLocalService) {
		_vcmsArticleVersionLocalService = vcmsArticleVersionLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vcmsArticleVersionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vcmsArticleVersionLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vcmsArticleVersionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleVersionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleVersionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vcms article versions.
	*
	* @return the number of vcms article versions
	*/
	@Override
	public int getVcmsArticleVersionsCount() {
		return _vcmsArticleVersionLocalService.getVcmsArticleVersionsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vcmsArticleVersionLocalService.getOSGiServiceIdentifier();
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
		return _vcmsArticleVersionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsArticleVersionLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsArticleVersionLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the vcms article versions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleVersionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article versions
	* @param end the upper bound of the range of vcms article versions (not inclusive)
	* @return the range of vcms article versions
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticleVersion> getVcmsArticleVersions(
		int start, int end) {
		return _vcmsArticleVersionLocalService.getVcmsArticleVersions(start, end);
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
		return _vcmsArticleVersionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vcmsArticleVersionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the vcms article version to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleVersion the vcms article version
	* @return the vcms article version that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleVersion addVcmsArticleVersion(
		vn.gov.hoabinh.model.VcmsArticleVersion vcmsArticleVersion) {
		return _vcmsArticleVersionLocalService.addVcmsArticleVersion(vcmsArticleVersion);
	}

	/**
	* Creates a new vcms article version with the primary key. Does not add the vcms article version to the database.
	*
	* @param articleVersionId the primary key for the new vcms article version
	* @return the new vcms article version
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleVersion createVcmsArticleVersion(
		long articleVersionId) {
		return _vcmsArticleVersionLocalService.createVcmsArticleVersion(articleVersionId);
	}

	/**
	* Deletes the vcms article version with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param articleVersionId the primary key of the vcms article version
	* @return the vcms article version that was removed
	* @throws PortalException if a vcms article version with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleVersion deleteVcmsArticleVersion(
		long articleVersionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleVersionLocalService.deleteVcmsArticleVersion(articleVersionId);
	}

	/**
	* Deletes the vcms article version from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleVersion the vcms article version
	* @return the vcms article version that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleVersion deleteVcmsArticleVersion(
		vn.gov.hoabinh.model.VcmsArticleVersion vcmsArticleVersion) {
		return _vcmsArticleVersionLocalService.deleteVcmsArticleVersion(vcmsArticleVersion);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleVersion fetchVcmsArticleVersion(
		long articleVersionId) {
		return _vcmsArticleVersionLocalService.fetchVcmsArticleVersion(articleVersionId);
	}

	/**
	* Returns the vcms article version with the primary key.
	*
	* @param articleVersionId the primary key of the vcms article version
	* @return the vcms article version
	* @throws PortalException if a vcms article version with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleVersion getVcmsArticleVersion(
		long articleVersionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleVersionLocalService.getVcmsArticleVersion(articleVersionId);
	}

	/**
	* Updates the vcms article version in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleVersion the vcms article version
	* @return the vcms article version that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleVersion updateVcmsArticleVersion(
		vn.gov.hoabinh.model.VcmsArticleVersion vcmsArticleVersion) {
		return _vcmsArticleVersionLocalService.updateVcmsArticleVersion(vcmsArticleVersion);
	}

	@Override
	public VcmsArticleVersionLocalService getWrappedService() {
		return _vcmsArticleVersionLocalService;
	}

	@Override
	public void setWrappedService(
		VcmsArticleVersionLocalService vcmsArticleVersionLocalService) {
		_vcmsArticleVersionLocalService = vcmsArticleVersionLocalService;
	}

	private VcmsArticleVersionLocalService _vcmsArticleVersionLocalService;
}