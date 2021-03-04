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
 * Provides a wrapper for {@link VcmsArticleRatingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleRatingLocalService
 * @generated
 */
@ProviderType
public class VcmsArticleRatingLocalServiceWrapper
	implements VcmsArticleRatingLocalService,
		ServiceWrapper<VcmsArticleRatingLocalService> {
	public VcmsArticleRatingLocalServiceWrapper(
		VcmsArticleRatingLocalService vcmsArticleRatingLocalService) {
		_vcmsArticleRatingLocalService = vcmsArticleRatingLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vcmsArticleRatingLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vcmsArticleRatingLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vcmsArticleRatingLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleRatingLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleRatingLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public double getAvgRating(long articleId) throws java.lang.Exception {
		return _vcmsArticleRatingLocalService.getAvgRating(articleId);
	}

	@Override
	public int countRatingByA_R(long articleId) throws java.lang.Exception {
		return _vcmsArticleRatingLocalService.countRatingByA_R(articleId);
	}

	/**
	* Returns the number of vcms article ratings.
	*
	* @return the number of vcms article ratings
	*/
	@Override
	public int getVcmsArticleRatingsCount() {
		return _vcmsArticleRatingLocalService.getVcmsArticleRatingsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vcmsArticleRatingLocalService.getOSGiServiceIdentifier();
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
		return _vcmsArticleRatingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsArticleRatingLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsArticleRatingLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticleRating> getRatingByA_R(
		long articleId) throws java.lang.Exception {
		return _vcmsArticleRatingLocalService.getRatingByA_R(articleId);
	}

	/**
	* Returns a range of all the vcms article ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleRatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article ratings
	* @param end the upper bound of the range of vcms article ratings (not inclusive)
	* @return the range of vcms article ratings
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticleRating> getVcmsArticleRatings(
		int start, int end) {
		return _vcmsArticleRatingLocalService.getVcmsArticleRatings(start, end);
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
		return _vcmsArticleRatingLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vcmsArticleRatingLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleRating addRating(long articleId,
		int rating, java.lang.String session) throws java.lang.Exception {
		return _vcmsArticleRatingLocalService.addRating(articleId, rating,
			session);
	}

	/**
	* Adds the vcms article rating to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleRating the vcms article rating
	* @return the vcms article rating that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleRating addVcmsArticleRating(
		vn.gov.hoabinh.model.VcmsArticleRating vcmsArticleRating) {
		return _vcmsArticleRatingLocalService.addVcmsArticleRating(vcmsArticleRating);
	}

	/**
	* Creates a new vcms article rating with the primary key. Does not add the vcms article rating to the database.
	*
	* @param Id the primary key for the new vcms article rating
	* @return the new vcms article rating
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleRating createVcmsArticleRating(
		long Id) {
		return _vcmsArticleRatingLocalService.createVcmsArticleRating(Id);
	}

	/**
	* Deletes the vcms article rating with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the vcms article rating
	* @return the vcms article rating that was removed
	* @throws PortalException if a vcms article rating with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleRating deleteVcmsArticleRating(
		long Id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleRatingLocalService.deleteVcmsArticleRating(Id);
	}

	/**
	* Deletes the vcms article rating from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleRating the vcms article rating
	* @return the vcms article rating that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleRating deleteVcmsArticleRating(
		vn.gov.hoabinh.model.VcmsArticleRating vcmsArticleRating) {
		return _vcmsArticleRatingLocalService.deleteVcmsArticleRating(vcmsArticleRating);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleRating fetchVcmsArticleRating(
		long Id) {
		return _vcmsArticleRatingLocalService.fetchVcmsArticleRating(Id);
	}

	/**
	* Returns the vcms article rating with the primary key.
	*
	* @param Id the primary key of the vcms article rating
	* @return the vcms article rating
	* @throws PortalException if a vcms article rating with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleRating getVcmsArticleRating(long Id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleRatingLocalService.getVcmsArticleRating(Id);
	}

	/**
	* Updates the vcms article rating in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleRating the vcms article rating
	* @return the vcms article rating that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleRating updateVcmsArticleRating(
		vn.gov.hoabinh.model.VcmsArticleRating vcmsArticleRating) {
		return _vcmsArticleRatingLocalService.updateVcmsArticleRating(vcmsArticleRating);
	}

	@Override
	public void deleteRatingByA_S(long articleId, java.lang.String session)
		throws java.lang.Exception {
		_vcmsArticleRatingLocalService.deleteRatingByA_S(articleId, session);
	}

	@Override
	public VcmsArticleRatingLocalService getWrappedService() {
		return _vcmsArticleRatingLocalService;
	}

	@Override
	public void setWrappedService(
		VcmsArticleRatingLocalService vcmsArticleRatingLocalService) {
		_vcmsArticleRatingLocalService = vcmsArticleRatingLocalService;
	}

	private VcmsArticleRatingLocalService _vcmsArticleRatingLocalService;
}