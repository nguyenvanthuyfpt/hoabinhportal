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
 * Provides the local service utility for FAQCategory. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.FAQCategoryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FAQCategoryLocalService
 * @see vn.gov.hoabinh.service.base.FAQCategoryLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.FAQCategoryLocalServiceImpl
 * @generated
 */
@ProviderType
public class FAQCategoryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.FAQCategoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
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
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByG_L(groupId, language);
	}

	public static int countByG_L_P(long groupId, java.lang.String language,
		long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByG_L_P(groupId, language, parentId);
	}

	/**
	* Returns the number of f a q categories.
	*
	* @return the number of f a q categories
	*/
	public static int getFAQCategoriesCount() {
		return getService().getFAQCategoriesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<vn.gov.hoabinh.model.FAQCategory> getByG_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByG_L(groupId, language);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQCategory> getByG_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByG_L(groupId, language, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQCategory> getByG_L_P(
		long groupId, java.lang.String language, long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByG_L_P(groupId, language, parentId);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQCategory> getByG_L_P(
		long groupId, java.lang.String language, long parentId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getByG_L_P(groupId, language, parentId, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQCategory> getByParentId(
		long parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getByParentId(parentId);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQCategory> getCategoryMenu(
		java.lang.String[] categorySel) {
		return getService().getCategoryMenu(categorySel);
	}

	public static java.util.List<vn.gov.hoabinh.model.FAQCategory> getCategoryMenu(
		long[] ids) {
		return getService().getCategoryMenu(ids);
	}

	/**
	* Returns a range of all the f a q categories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q categories
	* @param end the upper bound of the range of f a q categories (not inclusive)
	* @return the range of f a q categories
	*/
	public static java.util.List<vn.gov.hoabinh.model.FAQCategory> getFAQCategories(
		int start, int end) {
		return getService().getFAQCategories(start, end);
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

	public static vn.gov.hoabinh.model.FAQCategory addCategory(long groupId,
		java.lang.String language, java.lang.String name,
		java.lang.String description, long parentId, int catOrder,
		int catLevel, java.lang.String image, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addCategory(groupId, language, name, description, parentId,
			catOrder, catLevel, image, userId);
	}

	/**
	* Adds the f a q category to the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategory the f a q category
	* @return the f a q category that was added
	*/
	public static vn.gov.hoabinh.model.FAQCategory addFAQCategory(
		vn.gov.hoabinh.model.FAQCategory faqCategory) {
		return getService().addFAQCategory(faqCategory);
	}

	/**
	* Creates a new f a q category with the primary key. Does not add the f a q category to the database.
	*
	* @param id the primary key for the new f a q category
	* @return the new f a q category
	*/
	public static vn.gov.hoabinh.model.FAQCategory createFAQCategory(long id) {
		return getService().createFAQCategory(id);
	}

	/**
	* Deletes the f a q category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q category
	* @return the f a q category that was removed
	* @throws PortalException if a f a q category with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.FAQCategory deleteFAQCategory(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteFAQCategory(id);
	}

	/**
	* Deletes the f a q category from the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategory the f a q category
	* @return the f a q category that was removed
	*/
	public static vn.gov.hoabinh.model.FAQCategory deleteFAQCategory(
		vn.gov.hoabinh.model.FAQCategory faqCategory) {
		return getService().deleteFAQCategory(faqCategory);
	}

	public static vn.gov.hoabinh.model.FAQCategory fetchFAQCategory(long id) {
		return getService().fetchFAQCategory(id);
	}

	public static vn.gov.hoabinh.model.FAQCategory getCategory(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCategory(categoryId);
	}

	/**
	* Returns the f a q category with the primary key.
	*
	* @param id the primary key of the f a q category
	* @return the f a q category
	* @throws PortalException if a f a q category with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.FAQCategory getFAQCategory(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getFAQCategory(id);
	}

	public static vn.gov.hoabinh.model.FAQCategory updateCategory(
		long groupId, java.lang.String language, long categoryId,
		java.lang.String name, java.lang.String description, long parentId,
		int catOrder, int catLevel, java.lang.String image, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateCategory(groupId, language, categoryId, name,
			description, parentId, catOrder, catLevel, image, userId);
	}

	/**
	* Updates the f a q category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param faqCategory the f a q category
	* @return the f a q category that was updated
	*/
	public static vn.gov.hoabinh.model.FAQCategory updateFAQCategory(
		vn.gov.hoabinh.model.FAQCategory faqCategory) {
		return getService().updateFAQCategory(faqCategory);
	}

	public static vn.gov.hoabinh.model.FAQCategory updateImage(
		long categoryId, java.lang.String imageName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImage(categoryId, imageName);
	}

	public static FAQCategoryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FAQCategoryLocalService, FAQCategoryLocalService> _serviceTracker =
		ServiceTrackerFactory.open(FAQCategoryLocalService.class);
}