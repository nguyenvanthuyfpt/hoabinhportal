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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import vn.gov.hoabinh.model.VcmsArticle;

import java.io.Serializable;

import java.rmi.RemoteException;

import java.util.Date;
import java.util.List;

/**
 * Provides the local service interface for VcmsArticle. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.VcmsArticleLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.VcmsArticleLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VcmsArticleLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VcmsArticleLocalServiceUtil} to access the vcms article local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.VcmsArticleLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public DynamicQuery buildArticleDQ(long groupId, java.lang.String language,
		long status, java.lang.String categoryId, java.lang.String typeId,
		java.lang.String keyword, boolean isTitle, boolean isLead,
		boolean isContent, java.lang.String searchBy, boolean isFromTo,
		Date fromDate, Date toDate, java.lang.String tabs, boolean andSearch,
		boolean isCount);

	public DynamicQuery buildArticleOrther(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId, boolean lastest);

	public DynamicQuery buildArticlePublished(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		boolean sticky, java.lang.String typeId, boolean isCount);

	public DynamicQuery buildArticleSearch(long groupId,
		java.lang.String language, long status, java.lang.String keyword,
		boolean isCount);

	public DynamicQuery buildArticleSearchByCategory(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		Date publishDate, boolean isCount);

	public DynamicQuery buildArticleSync(Date fromDate, Date toDate);

	public DynamicQuery buildReportCategory(long groupId,
		java.lang.String language, long status, java.lang.String categoryId);

	public DynamicQuery buildReportUser(long groupId,
		java.lang.String language, java.lang.String userId,
		java.lang.String mode);

	public DynamicQuery dynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	public int countArticleByCategory(long groupId, java.lang.String language,
		long status, java.lang.String categoryId, Date publishDate);

	public int countArticleByParam(long groupId, java.lang.String language,
		long status, java.lang.String categoryId, java.lang.String typeId,
		java.lang.String keyword, boolean isTitle, boolean isLead,
		boolean isContent, java.lang.String searchBy, boolean isFromTo,
		Date fromDate, Date toDate, java.lang.String tabs, boolean andSearch);

	public int countArticleBy_G_L_S_C(long groupId, java.lang.String language,
		long status, java.lang.String categoryId, boolean sticky);

	public int countArticleSearch(long groupId, java.lang.String language,
		long status, java.lang.String keyword);

	public int countArticlesByG_L_S_U(long groupId, java.lang.String language,
		long statusId, java.lang.String createdByUser)
		throws PortalException, SystemException, RemoteException;

	public int countArticlesByL_S(long groupId, java.lang.String language,
		long statusId) throws PortalException, SystemException, RemoteException;

	public int countArticlesByL_S_S(long groupId, java.lang.String language,
		long statusId, boolean sticky)
		throws PortalException, SystemException, RemoteException;

	public int countReportCategory(long groupId, java.lang.String language,
		long status, java.lang.String categoryId);

	public int countReportUser(long groupId, java.lang.String language,
		java.lang.String userId, java.lang.String mode);

	/**
	* Returns the number of vcms articles.
	*
	* @return the number of vcms articles
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVcmsArticlesCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	public List<VcmsArticle> findArticleByParam(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String typeId, java.lang.String keyword, boolean isTitle,
		boolean isLead, boolean isContent, java.lang.String searchBy,
		boolean isFromTo, Date fromDate, Date toDate, java.lang.String tabs,
		boolean andSearch, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getArticleByCategory(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		Date publishDate, int start, int end) throws java.lang.Exception;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getArticleByG_L_S_C_A(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId, int quantity);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getArticleByP_L_S_D(long groupId,
		java.lang.String language, long statusId, boolean discussible)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getArticleBy_G_L_S_C(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		boolean sticky, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getArticleSearch(long groupId,
		java.lang.String language, long status, java.lang.String keyword,
		int start, int end) throws java.lang.Exception;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List getArticles(java.lang.String[] articleIds)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getArticlesByG_L_S_U(long groupId,
		java.lang.String language, long statusId,
		java.lang.String createdByUser, int start, int end)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getArticlesByL_S(long groupId,
		java.lang.String language, int status, OrderByComparator obc)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getArticlesByL_S(long groupId,
		java.lang.String language, long statusId)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getArticlesByL_S(long groupId,
		java.lang.String language, long statusId, int start, int end)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getArticlesByL_S_S(long groupId,
		java.lang.String language, int statusId, boolean sticky,
		OrderByComparator obc)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getArticlesByL_S_S(long groupId,
		java.lang.String language, long statusId, boolean sticky)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getArticlesByU_L_S(long groupId,
		java.lang.String userId, int status, java.lang.String language)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getArticlesByU_L_S(long groupId,
		java.lang.String userId, int status, java.lang.String language,
		OrderByComparator obc)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getArticlesNewByL_S_S(long groupId,
		java.lang.String language, long statusId, boolean sticky, int end)
		throws PortalException, SystemException, RemoteException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getOtherArticle(long groupId,
		java.lang.String language, long status, java.lang.String categoryId,
		java.lang.String articleId, boolean lastest, int quantity);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<VcmsArticle> getVcmsArticles(int start, int end);

	public List<VcmsArticle> listArticles(Date fromDate, Date toDate)
		throws java.lang.Exception;

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	public VcmsArticle addArticle(long groupId, long companyId,
		java.lang.String userId, long plid, java.lang.String title,
		java.lang.String lead, java.lang.String content, boolean hasImage,
		java.lang.String imageTitle, java.lang.String image,
		java.lang.String language, boolean hasAttachment, boolean hasPoll,
		java.lang.String pollId, long status, java.lang.String author,
		java.lang.String source, java.lang.String categoryId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Adds the vcms article to the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticle the vcms article
	* @return the vcms article that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VcmsArticle addVcmsArticle(VcmsArticle vcmsArticle);

	/**
	* Creates a new vcms article with the primary key. Does not add the vcms article to the database.
	*
	* @param articleId the primary key for the new vcms article
	* @return the new vcms article
	*/
	public VcmsArticle createVcmsArticle(java.lang.String articleId);

	/**
	* Deletes the vcms article with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param articleId the primary key of the vcms article
	* @return the vcms article that was removed
	* @throws PortalException if a vcms article with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public VcmsArticle deleteVcmsArticle(java.lang.String articleId)
		throws PortalException;

	/**
	* Deletes the vcms article from the database. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticle the vcms article
	* @return the vcms article that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public VcmsArticle deleteVcmsArticle(VcmsArticle vcmsArticle);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VcmsArticle fetchVcmsArticle(java.lang.String articleId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VcmsArticle getArticle(java.lang.String articleId)
		throws PortalException, SystemException, RemoteException;

	/**
	* Returns the vcms article with the primary key.
	*
	* @param articleId the primary key of the vcms article
	* @return the vcms article
	* @throws PortalException if a vcms article with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public VcmsArticle getVcmsArticle(java.lang.String articleId)
		throws PortalException;

	public VcmsArticle updateArticle(long groupId, long companyId,
		java.lang.String userId, java.lang.String articleId, long status,
		java.lang.String title, java.lang.String lead,
		java.lang.String content, java.lang.String author,
		java.lang.String source, boolean hasImage, java.lang.String image,
		java.lang.String imageTitle, java.lang.String language,
		boolean discussible, boolean hasAttachment, boolean hasPoll,
		java.lang.String pollId, boolean sticky, boolean stickyNeverExpired,
		Date createdDate, Date stickyExpireDate, Date publishedDate,
		Date effectiveDate, Date expireDate, java.lang.String categoryId,
		java.lang.String soundLink)
		throws PortalException, SystemException, RemoteException;

	public VcmsArticle updateArticle(VcmsArticle article)
		throws PortalException, SystemException, RemoteException;

	public VcmsArticle updateAttachment(java.lang.String articleId,
		boolean hasAttachment) throws PortalException, SystemException;

	public VcmsArticle updateImage(java.lang.String articleId,
		java.lang.String image, java.lang.String imageTitle)
		throws PortalException, SystemException;

	/**
	* Updates the vcms article in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vcmsArticle the vcms article
	* @return the vcms article that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public VcmsArticle updateVcmsArticle(VcmsArticle vcmsArticle);

	public void deleteArticle(java.lang.String articleId)
		throws PortalException, SystemException, RemoteException;

	public void deleteArticles(java.lang.String[] articleIds)
		throws PortalException, SystemException, RemoteException;

	public void syncArticleAsset(List<VcmsArticle> listArticle)
		throws java.lang.Exception;
}