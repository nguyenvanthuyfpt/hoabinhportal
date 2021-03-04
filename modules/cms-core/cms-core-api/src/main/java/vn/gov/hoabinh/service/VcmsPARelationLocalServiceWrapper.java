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
 * Provides a wrapper for {@link VcmsPARelationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsPARelationLocalService
 * @generated
 */
@ProviderType
public class VcmsPARelationLocalServiceWrapper
	implements VcmsPARelationLocalService,
		ServiceWrapper<VcmsPARelationLocalService> {
	public VcmsPARelationLocalServiceWrapper(
		VcmsPARelationLocalService vcmsPARelationLocalService) {
		_vcmsPARelationLocalService = vcmsPARelationLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vcmsPARelationLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsPARelationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsPARelationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vcms p a relations.
	*
	* @return the number of vcms p a relations
	*/
	@Override
	public int getVcmsPARelationsCount() {
		return _vcmsPARelationLocalService.getVcmsPARelationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vcmsPARelationLocalService.getOSGiServiceIdentifier();
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
		return _vcmsPARelationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsPARelationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsPARelationLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List getRelationsByArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsPARelationLocalService.getRelationsByArticle(articleId);
	}

	@Override
	public java.util.List getRelationsByPortion(java.lang.String portionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsPARelationLocalService.getRelationsByPortion(portionId);
	}

	/**
	* Returns a range of all the vcms p a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsPARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms p a relations
	* @param end the upper bound of the range of vcms p a relations (not inclusive)
	* @return the range of vcms p a relations
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsPARelation> getVcmsPARelations(
		int start, int end) {
		return _vcmsPARelationLocalService.getVcmsPARelations(start, end);
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
		return _vcmsPARelationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vcmsPARelationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsPARelation addRelation(
		java.lang.String portionId, java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsPARelationLocalService.addRelation(portionId, articleId);
	}

	/**
	* Adds the vcms p a relation to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsPARelation the vcms p a relation
	* @return the vcms p a relation that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsPARelation addVcmsPARelation(
		vn.gov.hoabinh.model.VcmsPARelation vcmsPARelation) {
		return _vcmsPARelationLocalService.addVcmsPARelation(vcmsPARelation);
	}

	/**
	* Creates a new vcms p a relation with the primary key. Does not add the vcms p a relation to the database.
	*
	* @param vcmsPARelationPK the primary key for the new vcms p a relation
	* @return the new vcms p a relation
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsPARelation createVcmsPARelation(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK) {
		return _vcmsPARelationLocalService.createVcmsPARelation(vcmsPARelationPK);
	}

	/**
	* Deletes the vcms p a relation from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsPARelation the vcms p a relation
	* @return the vcms p a relation that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsPARelation deleteVcmsPARelation(
		vn.gov.hoabinh.model.VcmsPARelation vcmsPARelation) {
		return _vcmsPARelationLocalService.deleteVcmsPARelation(vcmsPARelation);
	}

	/**
	* Deletes the vcms p a relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsPARelationPK the primary key of the vcms p a relation
	* @return the vcms p a relation that was removed
	* @throws PortalException if a vcms p a relation with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsPARelation deleteVcmsPARelation(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsPARelationLocalService.deleteVcmsPARelation(vcmsPARelationPK);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsPARelation fetchVcmsPARelation(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK) {
		return _vcmsPARelationLocalService.fetchVcmsPARelation(vcmsPARelationPK);
	}

	/**
	* Returns the vcms p a relation with the primary key.
	*
	* @param vcmsPARelationPK the primary key of the vcms p a relation
	* @return the vcms p a relation
	* @throws PortalException if a vcms p a relation with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsPARelation getVcmsPARelation(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK vcmsPARelationPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsPARelationLocalService.getVcmsPARelation(vcmsPARelationPK);
	}

	/**
	* Updates the vcms p a relation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsPARelation the vcms p a relation
	* @return the vcms p a relation that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsPARelation updateVcmsPARelation(
		vn.gov.hoabinh.model.VcmsPARelation vcmsPARelation) {
		return _vcmsPARelationLocalService.updateVcmsPARelation(vcmsPARelation);
	}

	@Override
	public void deleteRelation(java.lang.String portionId,
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsPARelationLocalService.deleteRelation(portionId, articleId);
	}

	@Override
	public void deleteRelationsByArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsPARelationLocalService.deleteRelationsByArticle(articleId);
	}

	@Override
	public void deleteRelationsByPortion(java.lang.String portionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsPARelationLocalService.deleteRelationsByPortion(portionId);
	}

	@Override
	public VcmsPARelationLocalService getWrappedService() {
		return _vcmsPARelationLocalService;
	}

	@Override
	public void setWrappedService(
		VcmsPARelationLocalService vcmsPARelationLocalService) {
		_vcmsPARelationLocalService = vcmsPARelationLocalService;
	}

	private VcmsPARelationLocalService _vcmsPARelationLocalService;
}