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
 * Provides a wrapper for {@link VcmsArticleTypeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleTypeLocalService
 * @generated
 */
@ProviderType
public class VcmsArticleTypeLocalServiceWrapper
	implements VcmsArticleTypeLocalService,
		ServiceWrapper<VcmsArticleTypeLocalService> {
	public VcmsArticleTypeLocalServiceWrapper(
		VcmsArticleTypeLocalService vcmsArticleTypeLocalService) {
		_vcmsArticleTypeLocalService = vcmsArticleTypeLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vcmsArticleTypeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vcmsArticleTypeLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vcmsArticleTypeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleTypeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countByArticleId(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleTypeLocalService.countByArticleId(articleId);
	}

	@Override
	public int countByTypeId(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleTypeLocalService.countByTypeId(typeId);
	}

	/**
	* Returns the number of vcms article types.
	*
	* @return the number of vcms article types
	*/
	@Override
	public int getVcmsArticleTypesCount() {
		return _vcmsArticleTypeLocalService.getVcmsArticleTypesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vcmsArticleTypeLocalService.getOSGiServiceIdentifier();
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
		return _vcmsArticleTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsArticleTypeLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsArticleTypeLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List getByArticleId(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleTypeLocalService.getByArticleId(articleId);
	}

	@Override
	public java.util.List getByArticleId(java.lang.String articleId, int begin,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleTypeLocalService.getByArticleId(articleId, begin, end);
	}

	@Override
	public java.util.List getByTypeId(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleTypeLocalService.getByTypeId(typeId);
	}

	@Override
	public java.util.List getByTypeId(long typeId, int begin, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleTypeLocalService.getByTypeId(typeId, begin, end);
	}

	/**
	* Returns a range of all the vcms article types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms article types
	* @param end the upper bound of the range of vcms article types (not inclusive)
	* @return the range of vcms article types
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticleType> getVcmsArticleTypes(
		int start, int end) {
		return _vcmsArticleTypeLocalService.getVcmsArticleTypes(start, end);
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
		return _vcmsArticleTypeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vcmsArticleTypeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleType addArticleType(
		java.lang.String articleId, long typeId, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleTypeLocalService.addArticleType(articleId, typeId,
			position);
	}

	/**
	* Adds the vcms article type to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleType the vcms article type
	* @return the vcms article type that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleType addVcmsArticleType(
		vn.gov.hoabinh.model.VcmsArticleType vcmsArticleType) {
		return _vcmsArticleTypeLocalService.addVcmsArticleType(vcmsArticleType);
	}

	/**
	* Creates a new vcms article type with the primary key. Does not add the vcms article type to the database.
	*
	* @param vcmsArticleTypePK the primary key for the new vcms article type
	* @return the new vcms article type
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleType createVcmsArticleType(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK) {
		return _vcmsArticleTypeLocalService.createVcmsArticleType(vcmsArticleTypePK);
	}

	/**
	* Deletes the vcms article type from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleType the vcms article type
	* @return the vcms article type that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleType deleteVcmsArticleType(
		vn.gov.hoabinh.model.VcmsArticleType vcmsArticleType) {
		return _vcmsArticleTypeLocalService.deleteVcmsArticleType(vcmsArticleType);
	}

	/**
	* Deletes the vcms article type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleTypePK the primary key of the vcms article type
	* @return the vcms article type that was removed
	* @throws PortalException if a vcms article type with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleType deleteVcmsArticleType(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleTypeLocalService.deleteVcmsArticleType(vcmsArticleTypePK);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleType fetchVcmsArticleType(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK) {
		return _vcmsArticleTypeLocalService.fetchVcmsArticleType(vcmsArticleTypePK);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleType getArticleType(long typeId,
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleTypeLocalService.getArticleType(typeId, articleId);
	}

	/**
	* Returns the vcms article type with the primary key.
	*
	* @param vcmsArticleTypePK the primary key of the vcms article type
	* @return the vcms article type
	* @throws PortalException if a vcms article type with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleType getVcmsArticleType(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK vcmsArticleTypePK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleTypeLocalService.getVcmsArticleType(vcmsArticleTypePK);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleType updateArticleType(
		java.lang.String articleId, long typeId, int position)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleTypeLocalService.updateArticleType(articleId,
			typeId, position);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleType updateArticleType(
		vn.gov.hoabinh.model.VcmsArticleType vArticleType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleTypeLocalService.updateArticleType(vArticleType);
	}

	/**
	* Updates the vcms article type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticleType the vcms article type
	* @return the vcms article type that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticleType updateVcmsArticleType(
		vn.gov.hoabinh.model.VcmsArticleType vcmsArticleType) {
		return _vcmsArticleTypeLocalService.updateVcmsArticleType(vcmsArticleType);
	}

	@Override
	public void deleteRelationByArticleId(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsArticleTypeLocalService.deleteRelationByArticleId(articleId);
	}

	@Override
	public void deleteRelationByTypeId(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsArticleTypeLocalService.deleteRelationByTypeId(typeId);
	}

	@Override
	public VcmsArticleTypeLocalService getWrappedService() {
		return _vcmsArticleTypeLocalService;
	}

	@Override
	public void setWrappedService(
		VcmsArticleTypeLocalService vcmsArticleTypeLocalService) {
		_vcmsArticleTypeLocalService = vcmsArticleTypeLocalService;
	}

	private VcmsArticleTypeLocalService _vcmsArticleTypeLocalService;
}