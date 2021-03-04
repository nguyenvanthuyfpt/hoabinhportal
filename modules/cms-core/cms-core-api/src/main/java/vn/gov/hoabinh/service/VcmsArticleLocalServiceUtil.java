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
 * Provides the local service utility for VcmsArticle. This utility wraps
 * {@link vn.gov.hoabinh.service.impl.VcmsArticleLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleLocalService
 * @see vn.gov.hoabinh.service.base.VcmsArticleLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VcmsArticleLocalServiceImpl
 * @generated
 */
@ProviderType
public class VcmsArticleLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VcmsArticleLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.DynamicQuery buildArticleDQ(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, java.lang.String typeId,
		java.lang.String keyword, boolean isTitle, boolean isLead,
		boolean isContent, java.lang.String searchBy, boolean isFromTo,
		java.util.Date fromDate, java.util.Date toDate, java.lang.String tabs,
		boolean andSearch, boolean isCount) {
		return getService()
				   .buildArticleDQ(groupId, language, status, categoryId,
			typeId, keyword, isTitle, isLead, isContent, searchBy, isFromTo,
			fromDate, toDate, tabs, andSearch, isCount);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery buildArticleOrther(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, java.lang.String articleId, boolean lastest) {
		return getService()
				   .buildArticleOrther(groupId, language, status, categoryId,
			articleId, lastest);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery buildArticlePublished(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, boolean sticky, java.lang.String typeId,
		boolean isCount) {
		return getService()
				   .buildArticlePublished(groupId, language, status,
			categoryId, sticky, typeId, isCount);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery buildArticleSearch(
		long groupId, java.lang.String language, long status,
		java.lang.String keyword, boolean isCount) {
		return getService()
				   .buildArticleSearch(groupId, language, status, keyword,
			isCount);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery buildArticleSearchByCategory(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, java.util.Date publishDate, boolean isCount) {
		return getService()
				   .buildArticleSearchByCategory(groupId, language, status,
			categoryId, publishDate, isCount);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery buildArticleSync(
		java.util.Date fromDate, java.util.Date toDate) {
		return getService().buildArticleSync(fromDate, toDate);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery buildReportCategory(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId) {
		return getService()
				   .buildReportCategory(groupId, language, status, categoryId);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery buildReportUser(
		long groupId, java.lang.String language, java.lang.String userId,
		java.lang.String mode) {
		return getService().buildReportUser(groupId, language, userId, mode);
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

	public static int countArticleByCategory(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.util.Date publishDate) {
		return getService()
				   .countArticleByCategory(groupId, language, status,
			categoryId, publishDate);
	}

	public static int countArticleByParam(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String typeId, java.lang.String keyword, boolean isTitle,
		boolean isLead, boolean isContent, java.lang.String searchBy,
		boolean isFromTo, java.util.Date fromDate, java.util.Date toDate,
		java.lang.String tabs, boolean andSearch) {
		return getService()
				   .countArticleByParam(groupId, language, status, categoryId,
			typeId, keyword, isTitle, isLead, isContent, searchBy, isFromTo,
			fromDate, toDate, tabs, andSearch);
	}

	public static int countArticleBy_G_L_S_C(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		boolean sticky) {
		return getService()
				   .countArticleBy_G_L_S_C(groupId, language, status,
			categoryId, sticky);
	}

	public static int countArticleSearch(long groupId,
		java.lang.String language, long status, java.lang.String keyword) {
		return getService()
				   .countArticleSearch(groupId, language, status, keyword);
	}

	public static int countArticlesByG_L_S_U(long groupId,
		java.lang.String language, long statusId, java.lang.String createdByUser)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .countArticlesByG_L_S_U(groupId, language, statusId,
			createdByUser);
	}

	public static int countArticlesByL_S(long groupId,
		java.lang.String language, long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().countArticlesByL_S(groupId, language, statusId);
	}

	public static int countArticlesByL_S_S(long groupId,
		java.lang.String language, long statusId, boolean sticky)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .countArticlesByL_S_S(groupId, language, statusId, sticky);
	}

	public static int countReportCategory(long groupId,
		java.lang.String language, long status, java.lang.String categoryId) {
		return getService()
				   .countReportCategory(groupId, language, status, categoryId);
	}

	public static int countReportUser(long groupId, java.lang.String language,
		java.lang.String userId, java.lang.String mode) {
		return getService().countReportUser(groupId, language, userId, mode);
	}

	/**
	* Returns the number of vcms articles.
	*
	* @return the number of vcms articles
	*/
	public static int getVcmsArticlesCount() {
		return getService().getVcmsArticlesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VcmsArticleModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> findArticleByParam(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, java.lang.String typeId,
		java.lang.String keyword, boolean isTitle, boolean isLead,
		boolean isContent, java.lang.String searchBy, boolean isFromTo,
		java.util.Date fromDate, java.util.Date toDate, java.lang.String tabs,
		boolean andSearch, int start, int end) {
		return getService()
				   .findArticleByParam(groupId, language, status, categoryId,
			typeId, keyword, isTitle, isLead, isContent, searchBy, isFromTo,
			fromDate, toDate, tabs, andSearch, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticleByCategory(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, java.util.Date publishDate, int start,
		int end) throws java.lang.Exception {
		return getService()
				   .getArticleByCategory(groupId, language, status, categoryId,
			publishDate, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticleByG_L_S_C_A(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, java.lang.String articleId, int quantity) {
		return getService()
				   .getArticleByG_L_S_C_A(groupId, language, status,
			categoryId, articleId, quantity);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticleByP_L_S_D(
		long groupId, java.lang.String language, long statusId,
		boolean discussible)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getArticleByP_L_S_D(groupId, language, statusId, discussible);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticleBy_G_L_S_C(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, boolean sticky, int start, int end) {
		return getService()
				   .getArticleBy_G_L_S_C(groupId, language, status, categoryId,
			sticky, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticleSearch(
		long groupId, java.lang.String language, long status,
		java.lang.String keyword, int start, int end)
		throws java.lang.Exception {
		return getService()
				   .getArticleSearch(groupId, language, status, keyword, start,
			end);
	}

	public static java.util.List getArticles(java.lang.String[] articleIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getArticles(articleIds);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByG_L_S_U(
		long groupId, java.lang.String language, long statusId,
		java.lang.String createdByUser, int start, int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getArticlesByG_L_S_U(groupId, language, statusId,
			createdByUser, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByL_S(
		long groupId, java.lang.String language, int status,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getArticlesByL_S(groupId, language, status, obc);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByL_S(
		long groupId, java.lang.String language, long statusId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getArticlesByL_S(groupId, language, statusId);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByL_S(
		long groupId, java.lang.String language, long statusId, int start,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getArticlesByL_S(groupId, language, statusId, start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByL_S_S(
		long groupId, java.lang.String language, int statusId, boolean sticky,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getArticlesByL_S_S(groupId, language, statusId, sticky, obc);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByL_S_S(
		long groupId, java.lang.String language, long statusId, boolean sticky)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getArticlesByL_S_S(groupId, language, statusId, sticky);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByU_L_S(
		long groupId, java.lang.String userId, int status,
		java.lang.String language)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getArticlesByU_L_S(groupId, userId, status, language);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesByU_L_S(
		long groupId, java.lang.String userId, int status,
		java.lang.String language,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getArticlesByU_L_S(groupId, userId, status, language, obc);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getArticlesNewByL_S_S(
		long groupId, java.lang.String language, long statusId, boolean sticky,
		int end)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService()
				   .getArticlesNewByL_S_S(groupId, language, statusId, sticky,
			end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getOtherArticle(
		long groupId, java.lang.String language, long status,
		java.lang.String categoryId, java.lang.String articleId,
		boolean lastest, int quantity) {
		return getService()
				   .getOtherArticle(groupId, language, status, categoryId,
			articleId, lastest, quantity);
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
	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> getVcmsArticles(
		int start, int end) {
		return getService().getVcmsArticles(start, end);
	}

	public static java.util.List<vn.gov.hoabinh.model.VcmsArticle> listArticles(
		java.util.Date fromDate, java.util.Date toDate)
		throws java.lang.Exception {
		return getService().listArticles(fromDate, toDate);
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

	public static vn.gov.hoabinh.model.VcmsArticle addArticle(long groupId,
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
		return getService()
				   .addArticle(groupId, companyId, userId, plid, title, lead,
			content, hasImage, imageTitle, image, language, hasAttachment,
			hasPoll, pollId, status, author, source, categoryId);
	}

	/**
	* Adds the vcms article to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticle the vcms article
	* @return the vcms article that was added
	*/
	public static vn.gov.hoabinh.model.VcmsArticle addVcmsArticle(
		vn.gov.hoabinh.model.VcmsArticle vcmsArticle) {
		return getService().addVcmsArticle(vcmsArticle);
	}

	/**
	* Creates a new vcms article with the primary key. Does not add the vcms article to the database.
	*
	* @param articleId the primary key for the new vcms article
	* @return the new vcms article
	*/
	public static vn.gov.hoabinh.model.VcmsArticle createVcmsArticle(
		java.lang.String articleId) {
		return getService().createVcmsArticle(articleId);
	}

	/**
	* Deletes the vcms article with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param articleId the primary key of the vcms article
	* @return the vcms article that was removed
	* @throws PortalException if a vcms article with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VcmsArticle deleteVcmsArticle(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVcmsArticle(articleId);
	}

	/**
	* Deletes the vcms article from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticle the vcms article
	* @return the vcms article that was removed
	*/
	public static vn.gov.hoabinh.model.VcmsArticle deleteVcmsArticle(
		vn.gov.hoabinh.model.VcmsArticle vcmsArticle) {
		return getService().deleteVcmsArticle(vcmsArticle);
	}

	public static vn.gov.hoabinh.model.VcmsArticle fetchVcmsArticle(
		java.lang.String articleId) {
		return getService().fetchVcmsArticle(articleId);
	}

	public static vn.gov.hoabinh.model.VcmsArticle getArticle(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().getArticle(articleId);
	}

	/**
	* Returns the vcms article with the primary key.
	*
	* @param articleId the primary key of the vcms article
	* @return the vcms article
	* @throws PortalException if a vcms article with the primary key could not be found
	*/
	public static vn.gov.hoabinh.model.VcmsArticle getVcmsArticle(
		java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVcmsArticle(articleId);
	}

	public static vn.gov.hoabinh.model.VcmsArticle updateArticle(long groupId,
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
		return getService()
				   .updateArticle(groupId, companyId, userId, articleId,
			status, title, lead, content, author, source, hasImage, image,
			imageTitle, language, discussible, hasAttachment, hasPoll, pollId,
			sticky, stickyNeverExpired, createdDate, stickyExpireDate,
			publishedDate, effectiveDate, expireDate, categoryId, soundLink);
	}

	public static vn.gov.hoabinh.model.VcmsArticle updateArticle(
		vn.gov.hoabinh.model.VcmsArticle article)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		return getService().updateArticle(article);
	}

	public static vn.gov.hoabinh.model.VcmsArticle updateAttachment(
		java.lang.String articleId, boolean hasAttachment)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateAttachment(articleId, hasAttachment);
	}

	public static vn.gov.hoabinh.model.VcmsArticle updateImage(
		java.lang.String articleId, java.lang.String image,
		java.lang.String imageTitle)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateImage(articleId, image, imageTitle);
	}

	/**
	* Updates the vcms article in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticle the vcms article
	* @return the vcms article that was updated
	*/
	public static vn.gov.hoabinh.model.VcmsArticle updateVcmsArticle(
		vn.gov.hoabinh.model.VcmsArticle vcmsArticle) {
		return getService().updateVcmsArticle(vcmsArticle);
	}

	public static void deleteArticle(java.lang.String articleId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteArticle(articleId);
	}

	public static void deleteArticles(java.lang.String[] articleIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException,
			java.rmi.RemoteException {
		getService().deleteArticles(articleIds);
	}

	public static void syncArticleAsset(
		java.util.List<vn.gov.hoabinh.model.VcmsArticle> listArticle)
		throws java.lang.Exception {
		getService().syncArticleAsset(listArticle);
	}

	public static VcmsArticleLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VcmsArticleLocalService, VcmsArticleLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VcmsArticleLocalService.class);
}