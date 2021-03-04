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
 * Provides a wrapper for {@link FAQCategoryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FAQCategoryLocalService
 * @generated
 */
@ProviderType
public class FAQCategoryLocalServiceWrapper implements FAQCategoryLocalService,
	ServiceWrapper<FAQCategoryLocalService> {
	public FAQCategoryLocalServiceWrapper(
		FAQCategoryLocalService faqCategoryLocalService) {
		_faqCategoryLocalService = faqCategoryLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _faqCategoryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _faqCategoryLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _faqCategoryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqCategoryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqCategoryLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countByG_L(long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryLocalService.countByG_L(groupId, language);
	}

	@Override
	public int countByG_L_P(long groupId, java.lang.String language,
		long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryLocalService.countByG_L_P(groupId, language, parentId);
	}

	/**
	* Returns the number of f a q categories.
	*
	* @return the number of f a q categories
	*/
	@Override
	public int getFAQCategoriesCount() {
		return _faqCategoryLocalService.getFAQCategoriesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _faqCategoryLocalService.getOSGiServiceIdentifier();
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
		return _faqCategoryLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _faqCategoryLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _faqCategoryLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQCategory> getByG_L(
		long groupId, java.lang.String language)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryLocalService.getByG_L(groupId, language);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQCategory> getByG_L(
		long groupId, java.lang.String language, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryLocalService.getByG_L(groupId, language, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQCategory> getByG_L_P(
		long groupId, java.lang.String language, long parentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryLocalService.getByG_L_P(groupId, language, parentId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQCategory> getByG_L_P(
		long groupId, java.lang.String language, long parentId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryLocalService.getByG_L_P(groupId, language, parentId,
			start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQCategory> getByParentId(
		long parentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryLocalService.getByParentId(parentId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQCategory> getCategoryMenu(
		java.lang.String[] categorySel) {
		return _faqCategoryLocalService.getCategoryMenu(categorySel);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQCategory> getCategoryMenu(
		long[] ids) {
		return _faqCategoryLocalService.getCategoryMenu(ids);
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
	@Override
	public java.util.List<vn.gov.hoabinh.model.FAQCategory> getFAQCategories(
		int start, int end) {
		return _faqCategoryLocalService.getFAQCategories(start, end);
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
		return _faqCategoryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _faqCategoryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.FAQCategory addCategory(long groupId,
		java.lang.String language, java.lang.String name,
		java.lang.String description, long parentId, int catOrder,
		int catLevel, java.lang.String image, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryLocalService.addCategory(groupId, language, name,
			description, parentId, catOrder, catLevel, image, userId);
	}

	/**
	* Adds the f a q category to the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategory the f a q category
	* @return the f a q category that was added
	*/
	@Override
	public vn.gov.hoabinh.model.FAQCategory addFAQCategory(
		vn.gov.hoabinh.model.FAQCategory faqCategory) {
		return _faqCategoryLocalService.addFAQCategory(faqCategory);
	}

	/**
	* Creates a new f a q category with the primary key. Does not add the f a q category to the database.
	*
	* @param id the primary key for the new f a q category
	* @return the new f a q category
	*/
	@Override
	public vn.gov.hoabinh.model.FAQCategory createFAQCategory(long id) {
		return _faqCategoryLocalService.createFAQCategory(id);
	}

	/**
	* Deletes the f a q category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q category
	* @return the f a q category that was removed
	* @throws PortalException if a f a q category with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.FAQCategory deleteFAQCategory(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqCategoryLocalService.deleteFAQCategory(id);
	}

	/**
	* Deletes the f a q category from the database. Also notifies the appropriate model listeners.
	*
	* @param faqCategory the f a q category
	* @return the f a q category that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.FAQCategory deleteFAQCategory(
		vn.gov.hoabinh.model.FAQCategory faqCategory) {
		return _faqCategoryLocalService.deleteFAQCategory(faqCategory);
	}

	@Override
	public vn.gov.hoabinh.model.FAQCategory fetchFAQCategory(long id) {
		return _faqCategoryLocalService.fetchFAQCategory(id);
	}

	@Override
	public vn.gov.hoabinh.model.FAQCategory getCategory(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryLocalService.getCategory(categoryId);
	}

	/**
	* Returns the f a q category with the primary key.
	*
	* @param id the primary key of the f a q category
	* @return the f a q category
	* @throws PortalException if a f a q category with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.FAQCategory getFAQCategory(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _faqCategoryLocalService.getFAQCategory(id);
	}

	@Override
	public vn.gov.hoabinh.model.FAQCategory updateCategory(long groupId,
		java.lang.String language, long categoryId, java.lang.String name,
		java.lang.String description, long parentId, int catOrder,
		int catLevel, java.lang.String image, long userId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryLocalService.updateCategory(groupId, language,
			categoryId, name, description, parentId, catOrder, catLevel, image,
			userId);
	}

	/**
	* Updates the f a q category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param faqCategory the f a q category
	* @return the f a q category that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.FAQCategory updateFAQCategory(
		vn.gov.hoabinh.model.FAQCategory faqCategory) {
		return _faqCategoryLocalService.updateFAQCategory(faqCategory);
	}

	@Override
	public vn.gov.hoabinh.model.FAQCategory updateImage(long categoryId,
		java.lang.String imageName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _faqCategoryLocalService.updateImage(categoryId, imageName);
	}

	@Override
	public FAQCategoryLocalService getWrappedService() {
		return _faqCategoryLocalService;
	}

	@Override
	public void setWrappedService(
		FAQCategoryLocalService faqCategoryLocalService) {
		_faqCategoryLocalService = faqCategoryLocalService;
	}

	private FAQCategoryLocalService _faqCategoryLocalService;
}