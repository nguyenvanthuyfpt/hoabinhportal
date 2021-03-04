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
 * Provides a wrapper for {@link VcmsCARelationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCARelationLocalService
 * @generated
 */
@ProviderType
public class VcmsCARelationLocalServiceWrapper
	implements VcmsCARelationLocalService,
		ServiceWrapper<VcmsCARelationLocalService> {
	public VcmsCARelationLocalServiceWrapper(
		VcmsCARelationLocalService vcmsCARelationLocalService) {
		_vcmsCARelationLocalService = vcmsCARelationLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vcmsCARelationLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsCARelationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsCARelationLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countArticlesOfCategory(java.lang.String categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsCARelationLocalService.countArticlesOfCategory(categoryId);
	}

	/**
	* Returns the number of vcms c a relations.
	*
	* @return the number of vcms c a relations
	*/
	@Override
	public int getVcmsCARelationsCount() {
		return _vcmsCARelationLocalService.getVcmsCARelationsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vcmsCARelationLocalService.getOSGiServiceIdentifier();
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
		return _vcmsCARelationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsCARelationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsCARelationLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsCARelation> getRelationsByArticle(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsCARelationLocalService.getRelationsByArticle(articleId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsCARelation> getRelationsByCategory(
		java.lang.String categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsCARelationLocalService.getRelationsByCategory(categoryId);
	}

	/**
	* Returns a range of all the vcms c a relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsCARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms c a relations
	* @param end the upper bound of the range of vcms c a relations (not inclusive)
	* @return the range of vcms c a relations
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsCARelation> getVcmsCARelations(
		int start, int end) {
		return _vcmsCARelationLocalService.getVcmsCARelations(start, end);
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
		return _vcmsCARelationLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vcmsCARelationLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsCARelation addRelation(
		java.lang.String categoryId, java.lang.String articleId, long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsCARelationLocalService.addRelation(categoryId, articleId,
			statusId);
	}

	/**
	* Adds the vcms c a relation to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCARelation the vcms c a relation
	* @return the vcms c a relation that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsCARelation addVcmsCARelation(
		vn.gov.hoabinh.model.VcmsCARelation vcmsCARelation) {
		return _vcmsCARelationLocalService.addVcmsCARelation(vcmsCARelation);
	}

	/**
	* Creates a new vcms c a relation with the primary key. Does not add the vcms c a relation to the database.
	*
	* @param vcmsCARelationPK the primary key for the new vcms c a relation
	* @return the new vcms c a relation
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsCARelation createVcmsCARelation(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK) {
		return _vcmsCARelationLocalService.createVcmsCARelation(vcmsCARelationPK);
	}

	/**
	* Deletes the vcms c a relation from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCARelation the vcms c a relation
	* @return the vcms c a relation that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsCARelation deleteVcmsCARelation(
		vn.gov.hoabinh.model.VcmsCARelation vcmsCARelation) {
		return _vcmsCARelationLocalService.deleteVcmsCARelation(vcmsCARelation);
	}

	/**
	* Deletes the vcms c a relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCARelationPK the primary key of the vcms c a relation
	* @return the vcms c a relation that was removed
	* @throws PortalException if a vcms c a relation with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsCARelation deleteVcmsCARelation(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsCARelationLocalService.deleteVcmsCARelation(vcmsCARelationPK);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsCARelation fetchVcmsCARelation(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK) {
		return _vcmsCARelationLocalService.fetchVcmsCARelation(vcmsCARelationPK);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsCARelation findRelationsByArticle(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsCARelationLocalService.findRelationsByArticle(articleId);
	}

	/**
	* Returns the vcms c a relation with the primary key.
	*
	* @param vcmsCARelationPK the primary key of the vcms c a relation
	* @return the vcms c a relation
	* @throws PortalException if a vcms c a relation with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsCARelation getVcmsCARelation(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK vcmsCARelationPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsCARelationLocalService.getVcmsCARelation(vcmsCARelationPK);
	}

	/**
	* Updates the vcms c a relation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsCARelation the vcms c a relation
	* @return the vcms c a relation that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsCARelation updateVcmsCARelation(
		vn.gov.hoabinh.model.VcmsCARelation vcmsCARelation) {
		return _vcmsCARelationLocalService.updateVcmsCARelation(vcmsCARelation);
	}

	@Override
	public void deleteRelation(java.lang.String categoryId,
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsCARelationLocalService.deleteRelation(categoryId, articleId);
	}

	@Override
	public void deleteRelationsByArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsCARelationLocalService.deleteRelationsByArticle(articleId);
	}

	@Override
	public void deleteRelationsByCategory(java.lang.String categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsCARelationLocalService.deleteRelationsByCategory(categoryId);
	}

	@Override
	public VcmsCARelationLocalService getWrappedService() {
		return _vcmsCARelationLocalService;
	}

	@Override
	public void setWrappedService(
		VcmsCARelationLocalService vcmsCARelationLocalService) {
		_vcmsCARelationLocalService = vcmsCARelationLocalService;
	}

	private VcmsCARelationLocalService _vcmsCARelationLocalService;
}