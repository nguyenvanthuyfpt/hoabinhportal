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
 * Provides the local service utility for VcmsCURelation. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.VcmsCURelationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCURelationLocalService
 * @see vn.gov.hoabinh.service.base.VcmsCURelationLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VcmsCURelationLocalServiceImpl
 * @generated
 */
@ProviderType
public class VcmsCURelationLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VcmsCURelationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Returns the number of vcms c u relations.
	*
	* @return the number of vcms c u relations
	*/
	public static int getVcmsCURelationsCount() {
		return getService().getVcmsCURelationsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the vcms c u relations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsCURelationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms c u relations
	* @param end the upper bound of the range of vcms c u relations (not inclusive)
	* @return the range of vcms c u relations
	*/
	public static java.util.List<vn.gov.hoabinh.model.VcmsCURelation> getVcmsCURelations(
		int start, int end) {
		return getService().getVcmsCURelations(start, end);
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
	* Adds the vcms c u relation to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCURelation the vcms c u relation
	* @return the vcms c u relation that was added
	*/
	public static vn.gov.hoabinh.model.VcmsCURelation addVcmsCURelation(
		vn.gov.hoabinh.model.VcmsCURelation vcmsCURelation) {
		return getService().addVcmsCURelation(vcmsCURelation);
	}

	/**
	* Creates a new vcms c u relation with the primary key. Does not add the vcms c u relation to the database.
	*
	* @param vcmsCURelationPK the primary key for the new vcms c u relation
	* @return the new vcms c u relation
	*/
	public static vn.gov.hoabinh.model.VcmsCURelation createVcmsCURelation(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK) {
		return getService().createVcmsCURelation(vcmsCURelationPK);
	}

	/**
	* Deletes the vcms c u relation from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCURelation the vcms c u relation
	* @return the vcms c u relation that was removed
	*/
	public static vn.gov.hoabinh.model.VcmsCURelation deleteVcmsCURelation(
		vn.gov.hoabinh.model.VcmsCURelation vcmsCURelation) {
		return getService().deleteVcmsCURelation(vcmsCURelation);
	}

	/**
	* Deletes the vcms c u relation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCURelationPK the primary key of the vcms c u relation
	* @return the vcms c u relation that was removed
	* @throws PortalException if a vcms c u relation with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VcmsCURelation deleteVcmsCURelation(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVcmsCURelation(vcmsCURelationPK);
	}

	public static vn.gov.hoabinh.model.VcmsCURelation fetchVcmsCURelation(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK) {
		return getService().fetchVcmsCURelation(vcmsCURelationPK);
	}

	/**
	* Returns the vcms c u relation with the primary key.
	*
	* @param vcmsCURelationPK the primary key of the vcms c u relation
	* @return the vcms c u relation
	* @throws PortalException if a vcms c u relation with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VcmsCURelation getVcmsCURelation(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK vcmsCURelationPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVcmsCURelation(vcmsCURelationPK);
	}

	/**
	* Updates the vcms c u relation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsCURelation the vcms c u relation
	* @return the vcms c u relation that was updated
	*/
	public static vn.gov.hoabinh.model.VcmsCURelation updateVcmsCURelation(
		vn.gov.hoabinh.model.VcmsCURelation vcmsCURelation) {
		return getService().updateVcmsCURelation(vcmsCURelation);
	}

	public static VcmsCURelationLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsCURelationLocalService, VcmsCURelationLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VcmsCURelationLocalService.class);
}