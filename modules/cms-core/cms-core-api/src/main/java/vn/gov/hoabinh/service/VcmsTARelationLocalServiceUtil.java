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
 * Provides the local service utility for VcmsTARelation. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.VcmsTARelationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsTARelationLocalService
 * @see vn.gov.hoabinh.service.base.VcmsTARelationLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VcmsTARelationLocalServiceImpl
 * @generated
 */
@ProviderType
public class VcmsTARelationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VcmsTARelationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of vcms t a relations.
	*
	* @return the number of vcms t a relations
	*/
	public static int getVcmsTARelationsCount() {
		return getService().getVcmsTARelationsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsTARelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List<vn.gov.hoabinh.model.VcmsTARelation> getVcmsTARelations(
		int start, int end) {
		return getService().getVcmsTARelations(start, end);
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

	/**
	* Adds the vcms t a relation to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsTARelation the vcms t a relation
	* @return the vcms t a relation that was added
	*/
	public static vn.gov.hoabinh.model.VcmsTARelation addVcmsTARelation(
		vn.gov.hoabinh.model.VcmsTARelation vcmsTARelation) {
		return getService().addVcmsTARelation(vcmsTARelation);
	}

	/**
	* Creates a new vcms t a relation with the primary key. Does not add the vcms t a relation to the database.
	*
	* @param vcmsTARelationPK the primary key for the new vcms t a relation
	* @return the new vcms t a relation
	*/
	public static vn.gov.hoabinh.model.VcmsTARelation createVcmsTARelation(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK) {
		return getService().createVcmsTARelation(vcmsTARelationPK);
	}

	/**
	* Deletes the vcms t a relation from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsTARelation the vcms t a relation
	* @return the vcms t a relation that was removed
	*/
	public static vn.gov.hoabinh.model.VcmsTARelation deleteVcmsTARelation(
		vn.gov.hoabinh.model.VcmsTARelation vcmsTARelation) {
		return getService().deleteVcmsTARelation(vcmsTARelation);
	}

	/**
	* Deletes the vcms t a relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsTARelationPK the primary key of the vcms t a relation
	* @return the vcms t a relation that was removed
	* @throws PortalException if a vcms t a relation with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VcmsTARelation deleteVcmsTARelation(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVcmsTARelation(vcmsTARelationPK);
	}

	public static vn.gov.hoabinh.model.VcmsTARelation fetchVcmsTARelation(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK) {
		return getService().fetchVcmsTARelation(vcmsTARelationPK);
	}

	/**
	* Returns the vcms t a relation with the primary key.
	*
	* @param vcmsTARelationPK the primary key of the vcms t a relation
	* @return the vcms t a relation
	* @throws PortalException if a vcms t a relation with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VcmsTARelation getVcmsTARelation(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK vcmsTARelationPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVcmsTARelation(vcmsTARelationPK);
	}

	/**
	* Updates the vcms t a relation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsTARelation the vcms t a relation
	* @return the vcms t a relation that was updated
	*/
	public static vn.gov.hoabinh.model.VcmsTARelation updateVcmsTARelation(
		vn.gov.hoabinh.model.VcmsTARelation vcmsTARelation) {
		return getService().updateVcmsTARelation(vcmsTARelation);
	}

	public static VcmsTARelationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsTARelationLocalService, VcmsTARelationLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VcmsTARelationLocalService.class);
}