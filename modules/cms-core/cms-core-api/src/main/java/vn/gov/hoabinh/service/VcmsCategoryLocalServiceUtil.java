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
 * Provides the local service utility for VcmsCategory. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.VcmsCategoryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCategoryLocalService
 * @see vn.gov.hoabinh.service.base.VcmsCategoryLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VcmsCategoryLocalServiceImpl
 * @generated
 */
@ProviderType
public class VcmsCategoryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VcmsCategoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.DynamicQuery buildSearchCategory(
		long groupId, java.lang.String language, java.lang.String portionId,
		java.lang.String parentId, java.lang.String keyword, int hasHref,
		int hasImage, int isRss, boolean isCount) {
		return getService()
				   .buildSearchCategory(groupId, language, portionId, parentId,
			keyword, hasHref, hasImage, isRss, isCount);
	}

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

	public static int countByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().countByG_L(groupId, language);
	}

	public static int countCategoriesByP_P(long groupId,
		java.lang.String language, java.lang.String parentId,
		java.lang.String portionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .countCategoriesByP_P(groupId, language, parentId, portionId);
	}

	public static int countCategoriesByParent(long groupId,
		java.lang.String language, java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().countCategoriesByParent(groupId, language, parentId);
	}

	public static int countCategorySearch(long groupId,
		java.lang.String language, java.lang.String portionId,
		java.lang.String parentId, java.lang.String keyword, int hasHref,
		int hasImage, int isRss) {
		return getService()
				   .countCategorySearch(groupId, language, portionId, parentId,
			keyword, hasHref, hasImage, isRss);
	}

	/**
	* Returns the number of vcms categories.
	*
	* @return the number of vcms categories
	*/
	public static int getVcmsCategoriesCount() {
		return getService().getVcmsCategoriesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<vn.gov.hoabinh.model.VcmsCategory> getCategoriesByP_P(
		long groupId, java.lang.String language, java.lang.String parentId,
		java.lang.String portionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getCategoriesByP_P(groupId, language, parentId, portionId);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsCategory> getCategoriesByP_P(
		long groupId, java.lang.String language, java.lang.String parentId,
		java.lang.String portionId, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getCategoriesByP_P(groupId, language, parentId, portionId,
			start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsCategory> getCategoriesByParent(
		long groupId, java.lang.String language, java.lang.String parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getCategoriesByParent(groupId, language, parentId);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsCategory> getCategoriesByParent(
		long groupId, java.lang.String language, java.lang.String parentId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getCategoriesByParent(groupId, language, parentId, start,
			end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsCategory> getCategoriesByPortion(
		long groupId, java.lang.String language, java.lang.String portionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getCategoriesByPortion(groupId, language, portionId);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsCategory> getCategoryByG_L(
		long groupId, java.lang.String language) {
		return getService().getCategoryByG_L(groupId, language);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsCategory> getCategoryByG_L(
		long groupId, java.lang.String language, int start, int end) {
		return getService().getCategoryByG_L(groupId, language, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsCategory> getCategoryMenu(
		java.lang.String[] categoryIds) {
		return getService().getCategoryMenu(categoryIds);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsCategory> getCategorySearch(
		long groupId, java.lang.String language, java.lang.String portionId,
		java.lang.String parentId, java.lang.String keyword, int hasHref,
		int hasImage, int isRss, int start, int end) throws java.lang.Exception {
		return getService()
				   .getCategorySearch(groupId, language, portionId, parentId,
			keyword, hasHref, hasImage, isRss, start, end);
	}

	/**
	* Returns a range of all the vcms categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms categories
	* @param end the upper bound of the range of vcms categories (not inclusive)
	* @return the range of vcms categories
	*/
	public static java.util.List<vn.gov.hoabinh.model.VcmsCategory> getVcmsCategories(
		int start, int end) {
		return getService().getVcmsCategories(start, end);
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

	public static vn.gov.hoabinh.model.VcmsCategory addCategory(long groupId,
		long companyId, long plid, java.lang.String portionId,
		java.lang.String parentId, java.lang.String name,
		java.lang.String description, boolean anchored, java.lang.String href,
		java.lang.String language, boolean hasImage, java.lang.String image,
		boolean rssable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .addCategory(groupId, companyId, plid, portionId, parentId,
			name, description, anchored, href, language, hasImage, image,
			rssable);
	}

	/**
	* Adds the vcms category to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCategory the vcms category
	* @return the vcms category that was added
	*/
	public static vn.gov.hoabinh.model.VcmsCategory addVcmsCategory(
		vn.gov.hoabinh.model.VcmsCategory vcmsCategory) {
		return getService().addVcmsCategory(vcmsCategory);
	}

	/**
	* Creates a new vcms category with the primary key. Does not add the vcms category to the database.
	*
	* @param categoryId the primary key for the new vcms category
	* @return the new vcms category
	*/
	public static vn.gov.hoabinh.model.VcmsCategory createVcmsCategory(
		java.lang.String categoryId) {
		return getService().createVcmsCategory(categoryId);
	}

	/**
	* Deletes the vcms category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryId the primary key of the vcms category
	* @return the vcms category that was removed
	* @throws PortalException if a vcms category with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VcmsCategory deleteVcmsCategory(
		java.lang.String categoryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVcmsCategory(categoryId);
	}

	/**
	* Deletes the vcms category from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsCategory the vcms category
	* @return the vcms category that was removed
	*/
	public static vn.gov.hoabinh.model.VcmsCategory deleteVcmsCategory(
		vn.gov.hoabinh.model.VcmsCategory vcmsCategory) {
		return getService().deleteVcmsCategory(vcmsCategory);
	}

	public static vn.gov.hoabinh.model.VcmsCategory fetchVcmsCategory(
		java.lang.String categoryId) {
		return getService().fetchVcmsCategory(categoryId);
	}

	public static vn.gov.hoabinh.model.VcmsCategory getCategory(
		java.lang.String categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getCategory(categoryId);
	}

	/**
	* Returns the vcms category with the primary key.
	*
	* @param categoryId the primary key of the vcms category
	* @return the vcms category
	* @throws PortalException if a vcms category with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VcmsCategory getVcmsCategory(
		java.lang.String categoryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVcmsCategory(categoryId);
	}

	public static vn.gov.hoabinh.model.VcmsCategory updateCategory(
		long groupId, long companyId, java.lang.String categoryId,
		java.lang.String portionId, java.lang.String parentId,
		java.lang.String name, java.lang.String description, boolean anchored,
		java.lang.String href, java.lang.String language, boolean hasImage,
		java.lang.String image, int position, int userHit, boolean rssable)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .updateCategory(groupId, companyId, categoryId, portionId,
			parentId, name, description, anchored, href, language, hasImage,
			image, position, userHit, rssable);
	}

	public static vn.gov.hoabinh.model.VcmsCategory updateCategory(
		vn.gov.hoabinh.model.VcmsCategory category)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().updateCategory(category);
	}

	/**
	* Updates the vcms category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsCategory the vcms category
	* @return the vcms category that was updated
	*/
	public static vn.gov.hoabinh.model.VcmsCategory updateVcmsCategory(
		vn.gov.hoabinh.model.VcmsCategory vcmsCategory) {
		return getService().updateVcmsCategory(vcmsCategory);
	}

	public static void changePortion(java.lang.String parentId, long groupId,
		java.lang.String portionId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().changePortion(parentId, groupId, portionId, language);
	}

	public static void deleteCategory(java.lang.String categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteCategory(categoryId);
	}

	public static VcmsCategoryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsCategoryLocalService, VcmsCategoryLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VcmsCategoryLocalService.class);
}