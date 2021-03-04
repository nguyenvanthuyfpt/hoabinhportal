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
 * Provides a wrapper for {@link VcmsTARelationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsTARelationLocalService
 * @generated
 */
@ProviderType
public class VcmsTARelationLocalServiceWrapper
	implements VcmsTARelationLocalService,
		ServiceWrapper<VcmsTARelationLocalService> {
	public VcmsTARelationLocalServiceWrapper(
		VcmsTARelationLocalService vcmsTARelationLocalService) {
		_vcmsTARelationLocalService = vcmsTARelationLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vcmsTARelationLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsTARelationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsTARelationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vcms t a relations.
	*
	* @return the number of vcms t a relations
	*/
	@Override
	public int getVcmsTARelationsCount() {
		return _vcmsTARelationLocalService.getVcmsTARelationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vcmsTARelationLocalService.getOSGiServiceIdentifier();
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
		return _vcmsTARelationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsTARelationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsTARelationLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the vcms t a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms t a relations
	* @param end the upper bound of the range of vcms t a relations (not inclusive)
	* @return the range of vcms t a relations
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsTARelation> getVcmsTARelations(
		int start, int end) {
		return _vcmsTARelationLocalService.getVcmsTARelations(start, end);
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
		return _vcmsTARelationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vcmsTARelationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the vcms t a relation to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsTARelation the vcms t a relation
	* @return the vcms t a relation that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsTARelation addVcmsTARelation(
		vn.gov.hoabinh.model.VcmsTARelation vcmsTARelation) {
		return _vcmsTARelationLocalService.addVcmsTARelation(vcmsTARelation);
	}

	/**
	* Creates a new vcms t a relation with the primary key. Does not add the vcms t a relation to the database.
	*
	* @param vcmsTARelationPK the primary key for the new vcms t a relation
	* @return the new vcms t a relation
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsTARelation createVcmsTARelation(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK) {
		return _vcmsTARelationLocalService.createVcmsTARelation(vcmsTARelationPK);
	}

	/**
	* Deletes the vcms t a relation from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsTARelation the vcms t a relation
	* @return the vcms t a relation that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsTARelation deleteVcmsTARelation(
		vn.gov.hoabinh.model.VcmsTARelation vcmsTARelation) {
		return _vcmsTARelationLocalService.deleteVcmsTARelation(vcmsTARelation);
	}

	/**
	* Deletes the vcms t a relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsTARelationPK the primary key of the vcms t a relation
	* @return the vcms t a relation that was removed
	* @throws PortalException if a vcms t a relation with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsTARelation deleteVcmsTARelation(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsTARelationLocalService.deleteVcmsTARelation(vcmsTARelationPK);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsTARelation fetchVcmsTARelation(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK) {
		return _vcmsTARelationLocalService.fetchVcmsTARelation(vcmsTARelationPK);
	}

	/**
	* Returns the vcms t a relation with the primary key.
	*
	* @param vcmsTARelationPK the primary key of the vcms t a relation
	* @return the vcms t a relation
	* @throws PortalException if a vcms t a relation with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsTARelation getVcmsTARelation(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsTARelationLocalService.getVcmsTARelation(vcmsTARelationPK);
	}

	/**
	* Updates the vcms t a relation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsTARelation the vcms t a relation
	* @return the vcms t a relation that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsTARelation updateVcmsTARelation(
		vn.gov.hoabinh.model.VcmsTARelation vcmsTARelation) {
		return _vcmsTARelationLocalService.updateVcmsTARelation(vcmsTARelation);
	}

	@Override
	public VcmsTARelationLocalService getWrappedService() {
		return _vcmsTARelationLocalService;
	}

	@Override
	public void setWrappedService(
		VcmsTARelationLocalService vcmsTARelationLocalService) {
		_vcmsTARelationLocalService = vcmsTARelationLocalService;
	}

	private VcmsTARelationLocalService _vcmsTARelationLocalService;
}