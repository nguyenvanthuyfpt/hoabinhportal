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
 * Provides a wrapper for {@link VcmsArticleLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleLocalService
 * @generated
 */
@ProviderType
public class VcmsArticleLocalServiceWrapper implements VcmsArticleLocalService,
	ServiceWrapper<VcmsArticleLocalService> {
	public VcmsArticleLocalServiceWrapper(
		VcmsArticleLocalService vcmsArticleLocalService) {
		_vcmsArticleLocalService = vcmsArticleLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildArticleDQ(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, java.lang.String typeId,
		java.lang.String keyword, boolean isTitle, boolean isLead,
		boolean isContent, java.lang.String searchBy, boolean isFromTo,
		java.util.Date fromDate, java.util.Date toDate, java.lang.String tabs,
		boolean andSearch, boolean isCount) {
		return _vcmsArticleLocalService.buildArticleDQ(groupId, language,
			status, categoryId, typeId, keyword, isTitle, isLead, isContent,
			searchBy, isFromTo, fromDate, toDate, tabs, andSearch, isCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildArticleOrther(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, java.lang.String articleId, boolean lastest) {
		return _vcmsArticleLocalService.buildArticleOrther(groupId, language,
			status, categoryId, articleId, lastest);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildArticlePublished(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, boolean sticky, java.lang.String typeId,
		boolean isCount) {
		return _vcmsArticleLocalService.buildArticlePublished(groupId,
			language, status, categoryId, sticky, typeId, isCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildArticleSearch(
		long groupId, java.lang.String language, long status,
		java.lang.String keyword, boolean isCount) {
		return _vcmsArticleLocalService.buildArticleSearch(groupId, language,
			status, keyword, isCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildArticleSearchByCategory(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, java.util.Date publishDate, boolean isCount) {
		return _vcmsArticleLocalService.buildArticleSearchByCategory(groupId,
			language, status, categoryId, publishDate, isCount);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildArticleSync(
		java.util.Date fromDate, java.util.Date toDate) {
		return _vcmsArticleLocalService.buildArticleSync(fromDate, toDate);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildReportCategory(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId) {
		return _vcmsArticleLocalService.buildReportCategory(groupId, language,
			status, categoryId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery buildReportUser(
		long groupId, java.lang.String language, java.lang.String userId,
		java.lang.String mode) {
		return _vcmsArticleLocalService.buildReportUser(groupId, language,
			userId, mode);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vcmsArticleLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public int countArticleByCategory(long groupId, java.lang.String language,
		long status, java.lang.String categoryId, java.util.Date publishDate) {
		return _vcmsArticleLocalService.countArticleByCategory(groupId,
			language, status, categoryId, publishDate);
	}

	@Override
	public int countArticleByParam(long groupId, java.lang.String language,
		long status, java.lang.String categoryId, java.lang.String typeId,
		java.lang.String keyword, boolean isTitle, boolean isLead,
		boolean isContent, java.lang.String searchBy, boolean isFromTo,
		java.util.Date fromDate, java.util.Date toDate, java.lang.String tabs,
		boolean andSearch) {
		return _vcmsArticleLocalService.countArticleByParam(groupId, language,
			status, categoryId, typeId, keyword, isTitle, isLead, isContent,
			searchBy, isFromTo, fromDate, toDate, tabs, andSearch);
	}

	@Override
	public int countArticleBy_G_L_S_C(long groupId, java.lang.String language,
		long status, java.lang.String categoryId, boolean sticky) {
		return _vcmsArticleLocalService.countArticleBy_G_L_S_C(groupId,
			language, status, categoryId, sticky);
	}

	@Override
	public int countArticleSearch(long groupId, java.lang.String language,
		long status, java.lang.String keyword) {
		return _vcmsArticleLocalService.countArticleSearch(groupId, language,
			status, keyword);
	}

	@Override
	public int countArticlesByG_L_S_U(long groupId, java.lang.String language,
		long statusId, java.lang.String createdByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.countArticlesByG_L_S_U(groupId,
			language, statusId, createdByUser);
	}

	@Override
	public int countArticlesByL_S(long groupId, java.lang.String language,
		long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.countArticlesByL_S(groupId, language,
			statusId);
	}

	@Override
	public int countArticlesByL_S_S(long groupId, java.lang.String language,
		long statusId, boolean sticky)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.countArticlesByL_S_S(groupId, language,
			statusId, sticky);
	}

	@Override
	public int countReportCategory(long groupId, java.lang.String language,
		long status, java.lang.String categoryId) {
		return _vcmsArticleLocalService.countReportCategory(groupId, language,
			status, categoryId);
	}

	@Override
	public int countReportUser(long groupId, java.lang.String language,
		java.lang.String userId, java.lang.String mode) {
		return _vcmsArticleLocalService.countReportUser(groupId, language,
			userId, mode);
	}

	/**
	* Returns the number of vcms articles.
	*
	* @return the number of vcms articles
	*/
	@Override
	public int getVcmsArticlesCount() {
		return _vcmsArticleLocalService.getVcmsArticlesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vcmsArticleLocalService.getOSGiServiceIdentifier();
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
		return _vcmsArticleLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsArticleLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _vcmsArticleLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> findArticleByParam(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, java.lang.String typeId,
		java.lang.String keyword, boolean isTitle, boolean isLead,
		boolean isContent, java.lang.String searchBy, boolean isFromTo,
		java.util.Date fromDate, java.util.Date toDate, java.lang.String tabs,
		boolean andSearch, int start, int end) {
		return _vcmsArticleLocalService.findArticleByParam(groupId, language,
			status, categoryId, typeId, keyword, isTitle, isLead, isContent,
			searchBy, isFromTo, fromDate, toDate, tabs, andSearch, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticleByCategory(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, java.util.Date publishDate, int start,
		int end) throws java.lang.Exception {
		return _vcmsArticleLocalService.getArticleByCategory(groupId, language,
			status, categoryId, publishDate, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticleByG_L_S_C_A(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, java.lang.String articleId, int quantity) {
		return _vcmsArticleLocalService.getArticleByG_L_S_C_A(groupId,
			language, status, categoryId, articleId, quantity);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticleByP_L_S_D(
		long groupId, java.lang.String language, long statusId,
		boolean discussible)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.getArticleByP_L_S_D(groupId, language,
			statusId, discussible);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticleBy_G_L_S_C(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, boolean sticky, int start, int end) {
		return _vcmsArticleLocalService.getArticleBy_G_L_S_C(groupId, language,
			status, categoryId, sticky, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticleSearch(
		long groupId, java.lang.String language, long status,
		java.lang.String keyword, int start, int end)
		throws java.lang.Exception {
		return _vcmsArticleLocalService.getArticleSearch(groupId, language,
			status, keyword, start, end);
	}

	@Override
	public java.util.List getArticles(java.lang.String[] articleIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.getArticles(articleIds);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByG_L_S_U(
		long groupId, java.lang.String language, long statusId,
		java.lang.String createdByUser, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.getArticlesByG_L_S_U(groupId, language,
			statusId, createdByUser, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByL_S(
		long groupId, java.lang.String language, int status,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.getArticlesByL_S(groupId, language,
			status, obc);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByL_S(
		long groupId, java.lang.String language, long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.getArticlesByL_S(groupId, language,
			statusId);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByL_S(
		long groupId, java.lang.String language, long statusId, int start,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.getArticlesByL_S(groupId, language,
			statusId, start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByL_S_S(
		long groupId, java.lang.String language, int statusId, boolean sticky,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.getArticlesByL_S_S(groupId, language,
			statusId, sticky, obc);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByL_S_S(
		long groupId, java.lang.String language, long statusId, boolean sticky)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.getArticlesByL_S_S(groupId, language,
			statusId, sticky);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByU_L_S(
		long groupId, java.lang.String userId, int status,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.getArticlesByU_L_S(groupId, userId,
			status, language);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByU_L_S(
		long groupId, java.lang.String userId, int status,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.getArticlesByU_L_S(groupId, userId,
			status, language, obc);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesNewByL_S_S(
		long groupId, java.lang.String language, long statusId, boolean sticky,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.getArticlesNewByL_S_S(groupId,
			language, statusId, sticky, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getOtherArticle(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, java.lang.String articleId,
		boolean lastest, int quantity) {
		return _vcmsArticleLocalService.getOtherArticle(groupId, language,
			status, categoryId, articleId, lastest, quantity);
	}

	/**
	* Returns a range of all the vcms articles.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vcms articles
	* @param end the upper bound of the range of vcms articles (not inclusive)
	* @return the range of vcms articles
	*/
	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> getVcmsArticles(
		int start, int end) {
		return _vcmsArticleLocalService.getVcmsArticles(start, end);
	}

	@Override
	public java.util.List<vn.gov.hoabinh.model.VcmsArticle> listArticles(
		java.util.Date fromDate, java.util.Date toDate)
		throws java.lang.Exception {
		return _vcmsArticleLocalService.listArticles(fromDate, toDate);
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
		return _vcmsArticleLocalService.dynamicQueryCount(dynamicQuery);
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
		return _vcmsArticleLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticle addArticle(long groupId,
		long companyId, java.lang.String userId, long plid,
		java.lang.String title, java.lang.String lead,
		java.lang.String content, boolean hasImage,
		java.lang.String imageTitle, java.lang.String image,
		java.lang.String language, boolean hasAttachment, boolean hasPoll,
		java.lang.String pollId, long status, java.lang.String author,
		java.lang.String source, java.lang.String categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.addArticle(groupId, companyId, userId,
			plid, title, lead, content, hasImage, imageTitle, image, language,
			hasAttachment, hasPoll, pollId, status, author, source, categoryId);
	}

	/**
	* Adds the vcms article to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticle the vcms article
	* @return the vcms article that was added
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticle addVcmsArticle(
		vn.gov.hoabinh.model.VcmsArticle vcmsArticle) {
		return _vcmsArticleLocalService.addVcmsArticle(vcmsArticle);
	}

	/**
	* Creates a new vcms article with the primary key. Does not add the vcms article to the database.
	*
	* @param articleId the primary key for the new vcms article
	* @return the new vcms article
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticle createVcmsArticle(
		java.lang.String articleId) {
		return _vcmsArticleLocalService.createVcmsArticle(articleId);
	}

	/**
	* Deletes the vcms article with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param articleId the primary key of the vcms article
	* @return the vcms article that was removed
	* @throws PortalException if a vcms article with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticle deleteVcmsArticle(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleLocalService.deleteVcmsArticle(articleId);
	}

	/**
	* Deletes the vcms article from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticle the vcms article
	* @return the vcms article that was removed
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticle deleteVcmsArticle(
		vn.gov.hoabinh.model.VcmsArticle vcmsArticle) {
		return _vcmsArticleLocalService.deleteVcmsArticle(vcmsArticle);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticle fetchVcmsArticle(
		java.lang.String articleId) {
		return _vcmsArticleLocalService.fetchVcmsArticle(articleId);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticle getArticle(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.getArticle(articleId);
	}

	/**
	* Returns the vcms article with the primary key.
	*
	* @param articleId the primary key of the vcms article
	* @return the vcms article
	* @throws PortalException if a vcms article with the primary key could not be found
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticle getVcmsArticle(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vcmsArticleLocalService.getVcmsArticle(articleId);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticle updateArticle(long groupId,
		long companyId, java.lang.String userId, java.lang.String articleId,
		long status, java.lang.String title, java.lang.String lead,
		java.lang.String content, java.lang.String author,
		java.lang.String source, boolean hasImage, java.lang.String image,
		java.lang.String imageTitle, java.lang.String language,
		boolean discussible, boolean hasAttachment, boolean hasPoll,
		java.lang.String pollId, boolean sticky, boolean stickyNeverExpired,
		java.util.Date createdDate, java.util.Date stickyExpireDate,
		java.util.Date publishedDate, java.util.Date effectiveDate,
		java.util.Date expireDate, java.lang.String categoryId,
		java.lang.String soundLink)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.updateArticle(groupId, companyId,
			userId, articleId, status, title, lead, content, author, source,
			hasImage, image, imageTitle, language, discussible, hasAttachment,
			hasPoll, pollId, sticky, stickyNeverExpired, createdDate,
			stickyExpireDate, publishedDate, effectiveDate, expireDate,
			categoryId, soundLink);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticle updateArticle(
		vn.gov.hoabinh.model.VcmsArticle article)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return _vcmsArticleLocalService.updateArticle(article);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticle updateAttachment(
		java.lang.String articleId, boolean hasAttachment)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vcmsArticleLocalService.updateAttachment(articleId,
			hasAttachment);
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticle updateImage(
		java.lang.String articleId, java.lang.String image,
		java.lang.String imageTitle)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _vcmsArticleLocalService.updateImage(articleId, image, imageTitle);
	}

	/**
	* Updates the vcms article in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticle the vcms article
	* @return the vcms article that was updated
	*/
	@Override
	public vn.gov.hoabinh.model.VcmsArticle updateVcmsArticle(
		vn.gov.hoabinh.model.VcmsArticle vcmsArticle) {
		return _vcmsArticleLocalService.updateVcmsArticle(vcmsArticle);
	}

	@Override
	public void deleteArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsArticleLocalService.deleteArticle(articleId);
	}

	@Override
	public void deleteArticles(java.lang.String[] articleIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		_vcmsArticleLocalService.deleteArticles(articleIds);
	}

	@Override
	public void syncArticleAsset(
		java.util.List<vn.gov.hoabinh.model.VcmsArticle> listArticle)
		throws java.lang.Exception {
		_vcmsArticleLocalService.syncArticleAsset(listArticle);
	}

	@Override
	public VcmsArticleLocalService getWrappedService() {
		return _vcmsArticleLocalService;
	}

	@Override
	public void setWrappedService(
		VcmsArticleLocalService vcmsArticleLocalService) {
		_vcmsArticleLocalService = vcmsArticleLocalService;
	}

	private VcmsArticleLocalService _vcmsArticleLocalService;
}