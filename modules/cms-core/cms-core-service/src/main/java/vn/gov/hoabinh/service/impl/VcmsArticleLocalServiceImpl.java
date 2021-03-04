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

package vn.gov.hoabinh.service.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.service.ResourceLocalServiceUtil;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.MathUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.exception.NoSuchVcmsArticleException;
import vn.gov.hoabinh.model.VcmsArticle;
import vn.gov.hoabinh.model.VcmsArticleType;
import vn.gov.hoabinh.model.VcmsStatus;
import vn.gov.hoabinh.service.VcmsArticleTypeLocalServiceUtil;
import vn.gov.hoabinh.service.VcmsStatusLocalServiceUtil;
import vn.gov.hoabinh.service.base.VcmsArticleLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VcmsArticleUtil;
import vn.gov.hoabinh.service.persistence.VcmsAttachedMessageUtil;
import vn.gov.hoabinh.service.persistence.VcmsCARelationUtil;
import vn.gov.hoabinh.service.persistence.VcmsDiscussionUtil;
import vn.gov.hoabinh.service.persistence.VcmsPARelationUtil;
import vn.gov.hoabinh.service.persistence.VcmsTARelationUtil;

/**
 * The implementation of the vcms article local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VcmsArticleLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VcmsArticleLocalServiceUtil
 */
@ProviderType
public class VcmsArticleLocalServiceImpl extends VcmsArticleLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VcmsArticleLocalServiceUtil} to access the vcms
	 * article local service.
	 */

	@SuppressWarnings("deprecation")
	public VcmsArticle addArticle(long groupId, long companyId, String userId, long plid, String title, String lead, String content,
			boolean hasImage, String imageTitle, String image, String language, boolean hasAttachment, boolean hasPoll,
			String pollId, long status, String author, String source, String categoryId)
			throws PortalException, SystemException, RemoteException {

		String articleId = Long.toString(CounterLocalServiceUtil.increment(VcmsArticle.class.getName()));
		Date now = new Date();
		
		VcmsArticle article = vcmsArticlePersistence.create(articleId);

		article.setGroupId(groupId);
		article.setCompanyId(companyId);

		article.setStatus(status);
		article.setTitle(title);
		article.setLead(lead);
		article.setContent(content);

		article.setLanguage(language);
		article.setDiscussible(false);
		article.setHasAttachment(hasAttachment);
		article.setHasPoll(hasPoll);
		article.setPollId(pollId);
		article.setAuthor(author);
		article.setSource(source);
		article.setCategoryId(categoryId);

		article.setCreatedDate(now);
		article.setCreatedByUser(String.valueOf(userId));

		//article.setUserHit(VcmsArticleImpl.DEFAULT_READ_COUNT);
		//article.setVersion(VcmsArticleImpl.DEFAULT_VERSION);
		
		AssetEntryLocalServiceUtil.updateEntry(Long.parseLong(userId), 20147, now, null, VcmsArticle.class.getName(),
				Long.parseLong(articleId), null, 0, null, null, true, true, null, null, null, ContentTypes.TEXT_HTML, 
				title, lead, lead, null, null, 0, 0, null);
		
		vcmsArticlePersistence.update(article, null);
		return article;
	}
	
	public void syncArticleAsset(List<VcmsArticle> listArticle) throws Exception {
		if (Validator.isNotNull(listArticle) && listArticle.size()>0) {
			for (VcmsArticle artice: listArticle) {
				String articleId = artice.getArticleId();
				AssetEntryLocalServiceUtil.updateEntry(Long.parseLong(artice.getCreatedByUser()), 20147, new Date(), null, VcmsArticle.class.getName(),
						Long.parseLong(articleId), null, 0, null, null, false, true, null, null, null, null, artice.getTitle(), 
						artice.getLead(), artice.getContent(),
						null, null, 0, 0, null);
			}
		}
	}
	
	public VcmsArticle updateImage(String articleId, String image, String imageTitle) throws PortalException, SystemException {
		VcmsArticle article = vcmsArticlePersistence.fetchByPrimaryKey(articleId);
		if (Validator.isNotNull(image)) {
			article.setImage(image);
			article.setImageTitle(imageTitle);
			article.setHasImage(true);
		} else {
			article.setImage(null);
			article.setImageTitle(imageTitle);
			article.setHasImage(false);
		}
		article = vcmsArticlePersistence.update(article);
		return article;
	}
	
	public VcmsArticle updateAttachment(String articleId, boolean hasAttachment) throws PortalException, SystemException {
		VcmsArticle article = vcmsArticlePersistence.fetchByPrimaryKey(articleId);
		article.setHasAttachment(hasAttachment);
		article = vcmsArticlePersistence.update(article);
		return article;
	}
	
	public VcmsArticle updateArticle(VcmsArticle article) throws PortalException, SystemException, RemoteException {
		return updateArticle(article.getGroupId(), article.getCompanyId(), 
				article.getCreatedByUser(), article.getArticleId(), 
				article.getStatus(), article.getTitle(), article.getLead(), article.getContent(), 
				article.getAuthor(), article.getSource(), article.getHasImage(), article.getImage(), 
				article.getImageTitle(), article.getLanguage(), article.getDiscussible(), 
				article.getHasAttachment(), article.getHasPoll(), article.getPollId(), article.getSticky(), 
				article.getStickyNeverExpired(), article.getCreatedDate(), article.getStickyExpireDate(), 
				article.getPublishedDate(), article.getEffectiveDate(), article.getExpireDate(), article.getCategoryId(), article.getSoundLink());
	}

	public VcmsArticle updateArticle(long groupId, long companyId, String userId, String articleId, long status, String title,
			String lead, String content, String author, String source, boolean hasImage, String image,
			String imageTitle, String language, boolean discussible, boolean hasAttachment, boolean hasPoll,
			String pollId, boolean sticky, boolean stickyNeverExpired, Date createdDate, Date stickyExpireDate,
			Date publishedDate, Date effectiveDate, Date expireDate, String categoryId, String soundLink)
			throws PortalException, SystemException, RemoteException {

		Date now = new Date();
		VcmsArticle article = vcmsArticlePersistence.findByPrimaryKey(articleId);
		List listTypes = (List) VcmsArticleTypeLocalServiceUtil.getByArticleId(articleId);
		String typeIds = "";

		if (Validator.isNotNull(listTypes) && listTypes.size() > 0) {
			for (int i = 0; i < listTypes.size(); i++) {
				VcmsArticleType vArticleType = (VcmsArticleType) listTypes.get(i);
				typeIds += String.valueOf(vArticleType.getTypeId()) + (i < listTypes.size() - 1 ? "," : "");
			}
		}

		double oldVersion = article.getVersion();
		double newVersion = MathUtil.format(oldVersion + 0.1, 1, 1);

		String versionName = String.valueOf(oldVersion);

		article.setGroupId(groupId);
		article.setCompanyId(companyId);

		if (Validator.isNotNull(createdDate)) {
			article.setCreatedByUser(article.getCreatedByUser());
			article.setCreatedDate(createdDate);
		} else {
			article.setCreatedByUser(article.getCreatedByUser());
			article.setCreatedDate(article.getCreatedDate());
		}

		article.setModifiedByUser(String.valueOf(userId));
		article.setModifiedDate(now);

		article.setTitle(title);
		article.setLead(lead);
		article.setContent(content);
		article.setAuthor(author);
		article.setSource(source);
		article.setVersion(newVersion);
		article.setCategoryId(categoryId);

		article.setLanguage(language);
		article.setUserHit(article.getUserHit());
		article.setDiscussible(discussible);
		article.setHasAttachment(hasAttachment);

		if (Validator.isNotNull(pollId)) {
			article.setHasPoll(true);
			article.setPollId(pollId);
		} else {
			article.setHasPoll(false);
			article.setPollId(null);
		}
		article.setPollId(pollId);
		article.setSticky(sticky);
		article.setStickyNeverExpired(stickyNeverExpired);
		article.setStickyExpireDate(stickyExpireDate);
		article.setSoundLink(soundLink);

		if (status != 0) {
			VcmsStatus vStatus = VcmsStatusLocalServiceUtil.getVcmsStatus(status);
			if (vStatus.getIsPrimary()) { // Status Basic

				article.setModifiedByUser(userId);
				article.setModifiedDate(now);

				article.setDiscussible(false);
				article.setEffectiveDate(null);
				article.setExpireDate(null);
				article.setStickyExpireDate(null);
				article.setStickyExpireDate(null);
				article.setPublishedByUser(null);
				article.setPublishedDate(null);

			} else if (vStatus.getActive()) { // Status Active

				if (Validator.isNotNull(publishedDate)) {
					article.setPublishedByUser(userId);
					article.setPublishedDate(publishedDate);
				} else {
					article.setPublishedByUser(userId);
					article.setPublishedDate(now);
				}

				if (Validator.isNotNull(expireDate))
					article.setExpireDate(expireDate);

				if (Validator.isNotNull(effectiveDate))
					article.setEffectiveDate(effectiveDate);

			} else {

				article.setModifiedByUser(userId);
				article.setModifiedDate(now);

				article.setDiscussible(false);
				article.setEffectiveDate(null);
				article.setExpireDate(null);
				article.setStickyExpireDate(null);
				article.setStickyExpireDate(null);

				article.setPublishedByUser(null);
				article.setPublishedDate(null);
			}

			article.setStatus(vStatus.getStatusId());

		} else {
			article.setStatus(0);
		}

		vcmsArticlePersistence.update(article);

		return article;
	}

	public VcmsArticle getArticle(String articleId) throws PortalException, SystemException, RemoteException {
		return vcmsArticlePersistence.findByPrimaryKey(articleId);

	}
	
	public void deleteArticle(String articleId) throws PortalException, SystemException, RemoteException {
		if (Validator.isNull(articleId)) {
			throw new NoSuchVcmsArticleException();
		}

		VcmsArticle article = null;

		try {
			article = VcmsArticleUtil.findByPrimaryKey(articleId);
		} catch (Exception ex) {
			// throw new NoSuchArticleException();
		}

		// 0. Remove resource article from system
		ResourceLocalServiceUtil.deleteResource(article.getCompanyId(), VcmsArticle.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, article.getArticleId());

		// 1. Remove all discussions

		VcmsDiscussionUtil.removeByArticle(articleId);

		// 2. Remove all attached messages

		VcmsAttachedMessageUtil.removeByArticle(articleId);

		// 3. Remove all relationships with threads

		VcmsTARelationUtil.removeByArticle(articleId);

		// 4. Remove all relationships with categories

		VcmsCARelationUtil.removeByArticle(articleId);

		// 5. Remove all relationships with portions

		VcmsPARelationUtil.removeByArticle(articleId);

		// 6. Remove all version of article

		// VcmsArticleVersionServiceUtil.deleteVersionByArticleId(articleId);

		// VcmsLoggerServiceUtil.log(article.getGroupId(), articleId, VcmsArticle.class.getName(), sb.toString());

		// 8. Remove the article itself

		VcmsArticleUtil.remove(articleId);

		// 9. Lucene

	}

	public void deleteArticles(String[] articleIds) throws PortalException, SystemException, RemoteException {
		if ((articleIds == null) || (articleIds.length <= 0)) {
			return;
		}
		for (int i = 0; i < articleIds.length; i++) {
			deleteArticle(articleIds[i]);
		}
	}
	
	public List getArticles(String[] articleIds) throws PortalException, SystemException, RemoteException {

		List articles = new ArrayList();

		if ((articleIds == null) || (articleIds.length <= 0)) {
			return articles;
		}

		for (int i = 0; i < articleIds.length; i++) {
			articles.add(getArticle(articleIds[i]));
		}

		return articles;
	}

	public List<VcmsArticle> getArticlesByU_L_S(long groupId, String userId, int status, String language)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticlePersistence.findByU_L_S(groupId, userId, language, status);
	}

	public List<VcmsArticle> getArticlesByU_L_S(long groupId, String userId, int status, String language, OrderByComparator obc)
			throws PortalException, SystemException, RemoteException {
		int count = vcmsArticlePersistence.countByU_L_S(groupId, userId, language, status);
		return vcmsArticlePersistence.findByU_L_S(groupId, userId, language, status, 0, count, obc);
	}

	public List<VcmsArticle> getArticlesByL_S(long groupId, String language, long statusId)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticlePersistence.findByL_S(groupId, language, statusId);

	}

	public List<VcmsArticle> getArticlesByL_S(long groupId, String language, long statusId, int start, int end)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticlePersistence.findByL_S(groupId, language, statusId, start, end);
	}

	public int countArticlesByL_S(long groupId, String language, long statusId)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticlePersistence.countByL_S(groupId, language, statusId);
	}

	public List<VcmsArticle> getArticlesByG_L_S_U(long groupId, String language, long statusId, String createdByUser, int start,
			int end) throws PortalException, SystemException, RemoteException {
		return vcmsArticlePersistence.findByG_L_S_U(groupId, language, statusId, createdByUser, start, end);
	}

	public int countArticlesByG_L_S_U(long groupId, String language, long statusId, String createdByUser)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticlePersistence.countByG_L_S_U(groupId, language, statusId, createdByUser);
	}

	public List<VcmsArticle> getArticlesByL_S(long groupId, String language, int status, OrderByComparator obc)
			throws PortalException, SystemException, RemoteException {
		int count = vcmsArticlePersistence.countByL_S(groupId, language, status);
		return vcmsArticlePersistence.findByL_S(groupId, language, status, 0, count, obc);
	}

	public List<VcmsArticle> getArticlesByL_S_S(long groupId, String language, long statusId, boolean sticky)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticlePersistence.findByL_S_S(groupId, language, statusId, sticky);
	}

	public List<VcmsArticle> getArticlesNewByL_S_S(long groupId, String language, long statusId, boolean sticky, int end)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticlePersistence.findByL_S_S(groupId, language, statusId, sticky, 0, end);
	}

	public int countArticlesByL_S_S(long groupId, String language, long statusId, boolean sticky)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticlePersistence.countByL_S_S(groupId, language, statusId, sticky);

	}

	public List<VcmsArticle> getArticlesByL_S_S(long groupId, String language, int statusId, boolean sticky, OrderByComparator obc)
			throws PortalException, SystemException, RemoteException {

		int count = vcmsArticlePersistence.countByL_S_S(groupId, language, statusId, sticky);

		return vcmsArticlePersistence.findByL_S_S(groupId, language, statusId, sticky, 0, count, obc);
	}

	public List<VcmsArticle> getArticleByP_L_S_D(long groupId, String language, long statusId, boolean discussible)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticlePersistence.findByP_L_S_D(groupId, language, statusId, discussible);
	}
	/*
	public List getArticleByC_P_L_S(String categoryId, long groupId, String language, long statusId)
			throws PortalException, SystemException, RemoteException {

		return (List) vcmsArticleFinder.findByC_P_L_S(categoryId, groupId, language, statusId);
	}

	public List getArticleByC_P_L_S(String categoryId, long groupId, String language, long statusId, int start, int end)
			throws PortalException, SystemException, RemoteException {
		return (List) vcmsArticleFinder.findByC_P_L_S(categoryId, groupId,

				language, statusId, start, end);
	}

	public int countArticleByC_P_L_S(String categoryId, long groupId, String language, long statusId)
			throws PortalException, SystemException, RemoteException {

		return vcmsArticleFinder.countByC_P_L_S(categoryId, groupId, language, statusId);

	}

	public List getArticleByP_P_L_S(String portionId, long groupId, String language, long statusId)
			throws PortalException, SystemException, RemoteException {

		return (List) vcmsArticleFinder.findByP_P_L_S(portionId, groupId, language, statusId);
	}

	public int countArticleByP_P_L_S(String portionId, long groupId, String language, long statusId)
			throws PortalException, SystemException, RemoteException {

		return vcmsArticleFinder.countByP_P_L_S(portionId, groupId, language, statusId);

	}

	public List getArticleByP_P_L_S(String portionId, long groupId,

			String language, long statusId, int start, int end)
			throws PortalException, SystemException, RemoteException {

		return (List) vcmsArticleFinder.findByP_P_L_S(portionId, groupId,

				language, statusId, start, end);

	}

	public List getArticleByT_P_L_S(String threadId, long groupId, String language, long statusId)
			throws PortalException, SystemException, RemoteException {

		return (List) vcmsArticleFinder.findByT_P_L_S(threadId, groupId, language, statusId);
	}

	public List getArticleByT_P_L_S(String threadId, long groupId, String language, long statusId, int start, int end)
			throws PortalException, SystemException, RemoteException {

		return (List) vcmsArticleFinder.findByT_P_L_S(threadId, groupId, language, statusId, start, end);

	}

	public int countArticleByT_P_L_S(String threadId, long groupId, String language, long statusId)
			throws PortalException, SystemException, RemoteException {

		return vcmsArticleFinder.countByT_P_L_S(threadId, groupId, language, statusId);
	}

	public int countByStatus(long groupId, String language, long statusId)

			throws PortalException, SystemException, RemoteException {
		return vcmsArticlePersistence.countByL_S(groupId, language, statusId);
	}

	public int countByStatus(long statusId) throws PortalException, SystemException, RemoteException {
		return vcmsArticlePersistence.countByStatus(statusId);
	}

	// Added APIs

	public List getTopNewArticles(long groupId, String language, String portionId, String categoryId, long statusId,
			int quantity) throws PortalException, SystemException, RemoteException {
		// String listCategoryId = ActionUtil.getListCategory(groupId, language,
		// categoryId);
		String listCategoryId = "";
		if (Validator.isNull(categoryId) && Validator.isNotNull(portionId)) {
			return vcmsArticleFinder.findByP_S(groupId, language, portionId, statusId, quantity);
		} else if (Validator.isNull(portionId) && Validator.isNotNull(categoryId)) {
			return vcmsArticleFinder.findByG_L_C_S(groupId, language, listCategoryId, statusId, quantity);
		} else {
			return new ArrayList();
		}
	}

	public List getHotNewArticles(long groupId, String language, String portionId, String categoryId, long statusId,
			int quantity) throws SystemException {
		if (categoryId.equals("") && !portionId.equals("")) {
			return vcmsArticleFinder.findByP_S(groupId, language, portionId, statusId, quantity);
		} else if (!categoryId.equals("") && portionId.equals("")) {
			return vcmsArticleFinder.findByC_S(groupId, language, categoryId, statusId, quantity);
		} else {
			return new ArrayList();
		}

	}

	public List getTopNewArticles(long groupId, String language, String portionId, String categoryId, long statusId,
			boolean sticky, int quantity) throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(categoryId) && Validator.isNotNull(portionId)) {
			return vcmsArticleFinder.findByP_S_S(groupId, language, portionId, statusId, sticky, quantity);
		} else if (Validator.isNull(portionId) && Validator.isNotNull(categoryId)) {
			return vcmsArticleFinder.findByC_S_S(groupId, language, categoryId, statusId, sticky, quantity);
		} else {
			return new ArrayList();
		}
	}

	public List getTopNewArticles(long groupId, String language, long statusId, boolean sticky, int quantity)
			throws PortalException, SystemException, RemoteException {

		return getTopNewArticles(groupId, language, null, null, statusId, sticky, quantity);

	}

	public List getTopNewArticles(long groupId, String language, String categoryId, long statusId, boolean sticky,
			int quantity) throws PortalException, SystemException, RemoteException {

		return getTopNewArticles(groupId, language, null, categoryId, statusId, sticky, quantity);
	}

	public List getArticlesByCategoryId(long groupId, String language, String categoryId, long statusId, int begin,
			int end) throws PortalException, SystemException, RemoteException {

		return vcmsArticleFinder.findByCategoryId(groupId, language, categoryId, statusId, begin, end);

	}

	public int countArticlesByCategoryId(long groupId, String language, String categoryId, long statusId)
			throws PortalException, SystemException, RemoteException {

		return vcmsArticleFinder.countByCategoryId(groupId, language, categoryId, statusId);
	}

	public List getAllCategoryArticles(long groupId, String language, String categoryId, long statusId, int begin,
			int end) throws PortalException, SystemException, RemoteException {

		// String listCategoryId = ActionUtil.getListCategory(groupId, language,
		// categoryId);
		String listCategoryId = "";
		return vcmsArticleFinder.findByAllL_P_S_S(groupId, language, listCategoryId, statusId, begin, end);
	}

	public List getAllCategoryArticles(long groupId, String language, String categoryId, long statusId, int quantity)
			throws PortalException, SystemException, RemoteException {

		// String listCategoryId = ActionUtil.getListCategory(groupId, language,
		// categoryId);
		String listCategoryId = "";
		return vcmsArticleFinder.findByAllL_P_S_S(groupId, language, listCategoryId, statusId, 0, quantity);
	}

	public int countAllCategoryArticles(long groupId, String language, String categoryId, long statusId)
			throws PortalException, SystemException, RemoteException {

		// String listCategoryId = ActionUtil.getListCategory(groupId, language,
		// categoryId);
		String listCategoryId = "";
		return vcmsArticleFinder.countByAllL_P_S_S(groupId, language, listCategoryId, statusId);
	}

	public List getArticlesInThread(long groupId, String language, String threadId, long statusId)
			throws SystemException, RemoteException {

		return vcmsArticleFinder.findByT_P_L_S(threadId, groupId, language, statusId);
	}

	public List getArticlesInThread(long groupId, String language, String threadId, long statusId, int quantity)
			throws SystemException, RemoteException {
		return vcmsArticleFinder.findByT_P_L_S(groupId, language, threadId, statusId, quantity);
	}

	public List getArticlesInThread(long groupId, String language, String[] threadIds, long statusId, int quantity)
			throws SystemException, RemoteException {
		return vcmsArticleFinder.findByT_P_L_S(groupId, language, threadIds, statusId, quantity);
	}

	public List getOlderArticles(long groupId, String language, String portionId, String categoryId, String articleId,
			long statusId, int quantity) throws PortalException, SystemException, RemoteException {

		VcmsArticle article = null;
		if (Validator.isNull(articleId)) {
			return getTopNewArticles(groupId, language, portionId, categoryId, statusId, quantity);
		} else {
			article = vcmsArticlePersistence.findByPrimaryKey(articleId);
		}

		if (Validator.isNull(categoryId) && Validator.isNotNull(portionId)) {

			return vcmsArticleFinder.findByP_S_After(groupId, language, portionId, statusId, quantity,
					article.getPublishedDate());

		} else if (Validator.isNull(portionId) && Validator.isNotNull(categoryId)) {

			// String listCategoryId = ActionUtil.getListCategory(groupId,
			// language, categoryId);
			String listCategoryId = "";
			return vcmsArticleFinder.findByG_L_C_S_After(groupId, language, categoryId, statusId, quantity,
					article.getPublishedDate());
		} else {
			return new ArrayList();
		}
	}

	public List getNewArticles(long groupId, String language, String portionId, String categoryId, String articleId,
			long statusId, int quantity) throws PortalException, SystemException, RemoteException {
		VcmsArticle article = null;

		if (Validator.isNull(articleId)) {
			return getTopNewArticles(groupId, language, portionId, categoryId, statusId, quantity);
		} else {
			article = vcmsArticlePersistence.findByPrimaryKey(articleId);
		}

		if (Validator.isNull(categoryId) && Validator.isNotNull(portionId)) {
			return vcmsArticleFinder.findByG_L_P_S_Before(groupId, language, portionId, statusId, quantity,
					article.getPublishedDate());

		} else if (Validator.isNull(portionId) && Validator.isNotNull(categoryId)) {

			// String listCategoryId = ActionUtil.getListCategory(groupId,
			// language, categoryId);

			return vcmsArticleFinder.findByG_L_C_S_Before(groupId, language, categoryId, statusId, quantity,
					article.getPublishedDate());
		} else {
			return new ArrayList();
		}
	}

	// report
	public int countByC_P_L_S_D(String categoryId, long groupId, String language, long statusId, Date fromDate,
			Date toDate, String byUser) throws SystemException {
		return vcmsArticleFinder.countByC_P_L_S_D(categoryId, groupId, language, statusId, fromDate, toDate, byUser);
	}

	public int countByP_L_S_D(long groupId, String language, long statusId, Date fromDate, Date toDate, String byUser)
			throws SystemException {
		return vcmsArticleFinder.countByP_L_S_D(groupId, language, statusId, fromDate, toDate, byUser);
	}

	// Search Article into Container - add By Donghh
	public List getArticlesBySearchContainer(String keyword, long groupId, String language, String portionId,
			String categoryId, long typeId, boolean isTitle, boolean isLead, boolean isContent, boolean isDate,
			Date fromDate, Date toDate, long statusId, String select, PermissionChecker permissionChecker)
			throws PortalException, SystemException, RemoteException {

		List lSearchArtilces = new ArrayList();
		if (Validator.isNotNull(portionId)) {

			VcmsPortion portion = VcmsPortionLocalServiceUtil.getPortion(portionId);
			if (portion.getCategorizable() == false) {

				lSearchArtilces = vcmsArticleFinder.findBySearchContainer_P(keyword, groupId, language, portionId,
						isTitle, isLead, isContent, isDate, fromDate, toDate, statusId, select, permissionChecker);

			} else if (Validator.isNotNull(categoryId)) {

				lSearchArtilces = vcmsArticleFinder.findBySearchContainer_C(keyword, groupId, language, categoryId,
						typeId, isTitle, isLead, isContent, isDate, fromDate, toDate, statusId, select,
						permissionChecker);

			}
		} else if (Validator.isNull(portionId) && Validator.isNotNull(categoryId)
				&& !Validator.equals(categoryId, "0")) { // Pass CategoryID

			lSearchArtilces = (List) vcmsArticleFinder.findBySearchContainer_C(keyword, groupId, language, categoryId,
					typeId, isTitle, isLead, isContent, isDate, fromDate, toDate, statusId, select, permissionChecker);

		} else if (Validator.isNull(portionId) && Validator.isNotNull(categoryId)
				&& Validator.equals(categoryId, "0")) {

			lSearchArtilces = (List) vcmsArticleFinder.findBySearchContainer_C(keyword, groupId, language, null, typeId,
					isTitle, isLead, isContent, isDate, fromDate, toDate, statusId, select, permissionChecker);

		}

		return lSearchArtilces;
	}

	public List getArticlesBySearchContainer(String keyword, long groupId, String language, String portionId,
			String categoryId, long typeId, boolean isTitle, boolean isLead, boolean isContent, boolean isDate,
			Date fromDate, Date toDate, long statusId, String select, PermissionChecker permissionChecker, int start,
			int end) throws PortalException, SystemException, RemoteException {

		List lSearchArtilces = new ArrayList();
		if (Validator.isNotNull(portionId)) {

			VcmsPortion portion = VcmsPortionLocalServiceUtil.getPortion(portionId);
			if (portion.getCategorizable() == false) {

				lSearchArtilces = vcmsArticleFinder.findBySearchContainer_P(keyword, groupId, language, portionId,
						isTitle, isLead, isContent, isDate, fromDate, toDate, statusId, select, permissionChecker,
						start, end);

			} else if (Validator.isNotNull(categoryId)) {

				lSearchArtilces = vcmsArticleFinder.findBySearchContainer_C(keyword, groupId, language, categoryId,
						typeId, isTitle, isLead, isContent, isDate, fromDate, toDate, statusId, select,
						permissionChecker, start, end);

			}
		} else if (Validator.isNull(portionId) && Validator.isNotNull(categoryId)
				&& !Validator.equals(categoryId, "0")) { // Pass CategoryID

			lSearchArtilces = (List) vcmsArticleFinder.findBySearchContainer_C(keyword, groupId, language, categoryId,
					typeId, isTitle, isLead, isContent, isDate, fromDate, toDate, statusId, select, permissionChecker,
					start, end);

		} else if (Validator.isNull(portionId) && Validator.isNotNull(categoryId)
				&& Validator.equals(categoryId, "0")) {

			lSearchArtilces = (List) vcmsArticleFinder.findBySearchContainer_C(keyword, groupId, language, null, typeId,
					isTitle, isLead, isContent, isDate, fromDate, toDate, statusId, select, permissionChecker, start,
					end);

		}

		return lSearchArtilces;
	}

	public int countArticlesBySearchContainer(String keyword, long groupId, String language, String portionId,
			String categoryId, long typeId, boolean isTitle, boolean isLead, boolean isContent, boolean isDate,
			Date fromDate, Date toDate, long statusId, String select, PermissionChecker permissionChecker)
			throws PortalException, SystemException, RemoteException {

		int countLSearchArtilces = 0;
		if (Validator.isNotNull(portionId)) {
			VcmsPortion portion = VcmsPortionLocalServiceUtil.getPortion(portionId);

			if (portion.getCategorizable() == false) {
				countLSearchArtilces = vcmsArticleFinder.countBySearchContainer_P(keyword, groupId, language, portionId,
						isTitle, isLead, isContent, isDate, fromDate, toDate, statusId, select, permissionChecker);
			} else if (Validator.isNotNull(categoryId)) {

				countLSearchArtilces = vcmsArticleFinder.countBySearchContainer_C(keyword, groupId, language,
						categoryId, typeId, isTitle, isLead, isContent, isDate, fromDate, toDate, statusId, select,
						permissionChecker);

			}
		} else if (Validator.isNull(portionId) && Validator.isNotNull(categoryId)
				&& !Validator.equals(categoryId, "0")) {

			countLSearchArtilces = vcmsArticleFinder.countBySearchContainer_C(keyword, groupId, language, categoryId,
					typeId, isTitle, isLead, isContent, isDate, fromDate, toDate, statusId, select, permissionChecker);

		} else if (Validator.isNull(portionId) && Validator.isNotNull(categoryId)
				&& Validator.equals(categoryId, "0")) {

			countLSearchArtilces = vcmsArticleFinder.countBySearchContainer_C(keyword, groupId, language, null, typeId,
					isTitle, isLead, isContent, isDate, fromDate, toDate, statusId, select, permissionChecker);

		}

		return countLSearchArtilces;
	}

	public int countArticleByC_U_S(long groupId, String language, long statusId, String[] categoryIds, long userId)
			throws PortalException, SystemException, RemoteException {

		return vcmsArticleFinder.countArticleByC_U_S(groupId, language, statusId, categoryIds, userId);
	}

	public List getArticleByC_U_S(long groupId, String language, long statusId, String[] categoryIds, long userId,
			int begin, int end) throws PortalException, SystemException, RemoteException {

		return vcmsArticleFinder.getArticleByC_U_S(groupId, language, statusId, categoryIds, userId, begin, end);
	}

	public List getArticleInCatId(long groupId, String language, long statusId, String[] categoryIds, int begin,
			int end) throws PortalException, SystemException, RemoteException {

		return vcmsArticleFinder.getArticleInCatId(groupId, language, statusId, categoryIds, begin, end);
	}

	public List getArticleInCatId(long groupId, String language, long statusId, String[] categoryIds)
			throws PortalException, SystemException, RemoteException {

		return vcmsArticleFinder.getArticleInCatId(groupId, language, statusId, categoryIds);
	}

	public int countArticleInCatId(long groupId, String language, long statusId, String[] categoryIds)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.countArticleInCatId(groupId, language, statusId, categoryIds);
	}

	public List getArticleMaxUserHit(long groupId, String language, long statusId, String categoryId, int begin,
			int end) throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.getArticle_Max_UserHit(groupId, language, statusId, categoryId, begin, end);
	}

	public int countArticleMaxUserHit(long groupId, String language, long statusId, String categoryId)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.countArticle_Max_UserHit(groupId, language, statusId, categoryId);
	}

	public List getArticleMaxDiscussion(long groupId, String language, long statusId, int begin, int end)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.getArticle_Max_Discussion(groupId, language, statusId, begin, end);
	}

	public int countArticleMaxDiscussion(long groupId, String language, long statusId)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.countArticle_Max_Discussion(groupId, language, statusId);
	}

	public List getArticlesBySearchContainer_T(String categoryId, long typeId, String keyword, long groupId,
			String language, String threadId, boolean isTitle, boolean isLead, boolean isContent, boolean isDate,
			Date fromDate, Date toDate, long statusId, String select, int start, int end)
			throws PortalException, SystemException, RemoteException {

		return vcmsArticleFinder.findBySearchContainer_T(categoryId, typeId, keyword, groupId, language, threadId,
				isTitle, isLead, isContent, isDate, fromDate, toDate, statusId, select, start, end);
	}

	public int countArticlesBySearchContainer_T(String categoryId, long typeId, String keyword, long groupId,
			String language, String threadId, boolean isTitle, boolean isLead, boolean isContent, boolean isDate,
			Date fromDate, Date toDate, long statusId, String select)
			throws PortalException, SystemException, RemoteException {

		return vcmsArticleFinder.countBySearchContainer_T(categoryId, typeId, keyword, groupId, language, threadId,
				isTitle, isLead, isContent, isDate, fromDate, toDate, statusId, select);
	}

	public List getArticleByG_L_C_S_T(long groupId, String language, String categoryId, long statusId, long typeId,
			int begin, int end) throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.findByG_L_C_S_T(groupId, language, categoryId, statusId, typeId, begin, end);

	}

	public int countArticleByG_L_C_S_T(long groupId, String language, String categoryId, long statusId, long typeId)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.countByG_L_C_S_T(groupId, language, categoryId, statusId, typeId);
	}

	public List getArticleByG_L_S_T(long groupId, String language, long statusId, long typeId, int begin, int end)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.findByG_L_S_T(groupId, language, statusId, typeId, begin, end);

	}

	public List getArticleByG_L_S_T(long groupId, String language, long statusId, long typeId)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.findByG_L_S_T(groupId, language, statusId, typeId);

	}

	public int countArticleByG_L_S_T(long groupId, String language, long statusId, long typeId)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.countByG_L_S_T(groupId, language, statusId, typeId);
	}

	public int countArticleByG_L_S_C_D(long groupId, String language, long statusId, String categoryId, Date fromDate,
			Date toDate) throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.countByG_L_S_C_D(groupId, language, statusId, categoryId, fromDate, toDate);
	}

	public List getArticleByG_L_S_C_D(long groupId, String language, long statusId, String categoryId, Date fromDate,
			Date toDate, int begin, int end) throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.findByG_L_S_C_D(groupId, language, statusId, categoryId, fromDate, toDate, begin, end);
	}

	public int countOtherArticle(long groupId, String language, long statusId, String categoryId, String articleId)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.countOtherArticle(groupId, language, statusId, categoryId, articleId);
	}

	public List getOtherArticle(long groupId, String language, long statusId, String categoryId, String articleId,
			int begin, int end) throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.findOtherArticle(groupId, language, statusId, categoryId, articleId, begin, end);
	}

	public List getStickyArticle(long groupId, String language, long statusId, String categoryId, boolean sticky,
			int begin, int end) throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.findStickyArticle(groupId, language, statusId, categoryId, sticky, begin, end);
	}

	public int countStickyArticle(long groupId, String language, long statusId, String categoryId, boolean sticky)
			throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.countStickyArticle(groupId, language, statusId, categoryId, sticky);
	}

	public List getStickyArticleByParam(long groupId, String language, long statusId, String categoryId, boolean sticky,
			int begin, int end) throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.getArticleStickyByParam(groupId, language, statusId, categoryId, sticky, begin, end);
	}

	public int countStickyArticleByParam(long groupId, String language, long statusId, String categoryId,
			boolean sticky) throws PortalException, SystemException, RemoteException {
		return vcmsArticleFinder.countArticleStickyByParam(groupId, language, statusId, categoryId, sticky);
	}

	public void removeExpiredStickyArticles() throws PortalException, SystemException, RemoteException {

		Date today = new Date();

		List tobeExpiredArticles = vcmsArticleFinder.getUpComingExpiredArticles(today);

		if ((tobeExpiredArticles == null) || (tobeExpiredArticles.size() <= 0)) {
			return;
		}

		for (int i = 0; i < tobeExpiredArticles.size(); i++) {
			VcmsArticle article = (VcmsArticle) tobeExpiredArticles.get(i);

			article.setSticky(false);
			vcmsArticlePersistence.update(article);
		}
	}*/
	
	/*public List<VcmsArticle> getArticlePublish (long status, String categoryId) throws Exception {
		return vcmsArticleFinder.getArticlePublish(status, categoryId);
	}*/
	
	public List<VcmsArticle> getArticleBy_G_L_S_C(long groupId, String language, long status, String categoryId, boolean sticky, int start, int end) {
		DynamicQuery dynamicQuery = buildArticlePublished(groupId, language, status, categoryId, sticky, "0", false);
		return vcmsArticlePersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}
	
	public int countArticleBy_G_L_S_C(long groupId, String language, long status, String categoryId, boolean sticky) {
		DynamicQuery dynamicQuery = buildArticlePublished(groupId, language, status, categoryId, sticky, "0", true);
		return (int) vcmsArticlePersistence.countWithDynamicQuery(dynamicQuery);
	}
	
	public List<VcmsArticle> getArticleByG_L_S_C_A(long groupId, String language, long status, String categoryId, String articleId, int quantity) {
		return vcmsArticlePersistence.findByG_L_S_C_A(groupId, language, status, categoryId, articleId, 0, quantity);
	}
	
	public List<VcmsArticle> getOtherArticle(long groupId, String language, long status, String categoryId, String articleId, boolean lastest, int quantity) {
		DynamicQuery dynamicQuery = buildArticleOrther(groupId, language, status, categoryId, articleId, lastest);
		return vcmsArticlePersistence.findWithDynamicQuery(dynamicQuery, 0, quantity);
	}
	
	public DynamicQuery buildArticleOrther(long groupId, String language, long status, String categoryId, String articleId, boolean lastest) {
		Junction junction = null;
		junction = RestrictionsFactoryUtil.conjunction();
		
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));
		junction.add(PropertyFactoryUtil.forName("status").eq(status));
		
		if (!"0".equals(categoryId)) {
			junction.add(PropertyFactoryUtil.forName("categoryId").eq(categoryId));
		}
		
		VcmsArticle article = vcmsArticlePersistence.fetchByPrimaryKey(articleId);
		Date publishedDate = article.getPublishedDate();
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VcmsArticle.class, getClassLoader());
		if (lastest) {
			dynamicQuery.add(RestrictionsFactoryUtil.ge("publishedDate", publishedDate));
		} else {
			dynamicQuery.add(RestrictionsFactoryUtil.lt("publishedDate", publishedDate));
		}
		dynamicQuery.addOrder(OrderFactoryUtil.desc("publishedDate"));
		return dynamicQuery.add(junction);
	}
	
	public List<VcmsArticle> findArticleByParam(long groupId, String language, long status, String categoryId, String typeId, String keyword,
			boolean isTitle, boolean isLead, boolean isContent, String searchBy, 
			boolean isFromTo, Date fromDate, Date toDate, String tabs, boolean andSearch, int start, int end) {
		
		DynamicQuery dynamicQuery = buildArticleDQ(groupId, language, status, categoryId, typeId, keyword, isTitle, isLead, 
				isContent, searchBy, isFromTo, fromDate, toDate, tabs, andSearch, false);
		
		return vcmsArticlePersistence.findWithDynamicQuery(dynamicQuery, start, end);		
	}
	
	public int countArticleByParam(long groupId, String language, long status, String categoryId, String typeId, String keyword,
			boolean isTitle, boolean isLead, boolean isContent, String searchBy, 
			boolean isFromTo, Date fromDate, Date toDate, String tabs, boolean andSearch) {
		DynamicQuery dynamicQuery = buildArticleDQ(groupId, language, status, categoryId, typeId, keyword, isTitle, isLead, 
				isContent, searchBy, isFromTo, fromDate, toDate, tabs, andSearch, true);
		return (int) vcmsArticlePersistence.countWithDynamicQuery(dynamicQuery);		
	}
	
	public List<VcmsArticle> listArticles(Date fromDate, Date toDate) throws Exception {
		DynamicQuery dynamicQuery = buildArticleSync(fromDate, toDate);		
		return vcmsArticlePersistence.findWithDynamicQuery(dynamicQuery);	
	}
	
	public DynamicQuery buildArticleDQ(long groupId, String language, long status, String categoryId, String typeId, 
			String keyword, boolean isTitle, boolean isLead, boolean isContent, String searchBy, 
			boolean isFromTo, Date fromDate, Date toDate, String tabs, boolean andSearch, boolean isCount) {
		Junction junction = null;
		Junction juncCategory = null;
		if (andSearch) {
			junction = RestrictionsFactoryUtil.conjunction();
		} else {
			junction = RestrictionsFactoryUtil.disjunction();
		}
		
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));
		junction.add(PropertyFactoryUtil.forName("status").eq(status));
		
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VcmsArticle.class, getClassLoader());
		
		if (!"0".equals(categoryId)) {
			juncCategory = RestrictionsFactoryUtil.disjunction();			
			juncCategory.add(PropertyFactoryUtil.forName("categoryId").eq(categoryId));
			juncCategory.add(PropertyFactoryUtil.forName("categoryId").like("%"+categoryId+"%"));
			dynamicQuery.add(juncCategory);
		}
		
		if (Validator.isNotNull(keyword)) {
			if (isTitle) {
				//junction.add(PropertyFactoryUtil.forName("title").like("%"+keyword+"%"));
				junction.add(RestrictionsFactoryUtil.ilike("title", "%"+keyword+"%"));
			}
			
			if (isLead) {
				//junction.add(PropertyFactoryUtil.forName("lead").like("%"+keyword+"%"));
				junction.add(RestrictionsFactoryUtil.ilike("lead", "%"+keyword+"%"));
			}
			
			if (isContent) {
				//junction.add(PropertyFactoryUtil.forName("content").like("%"+keyword+"%"));
				junction.add(RestrictionsFactoryUtil.ilike("content", "%"+keyword+"%"));
			}
		}
		
		boolean hasPublish = VcmsStatusLocalServiceUtil.isStatusPublisher(Long.parseLong(tabs));
		
		if (isFromTo) {
			if ("0".equals(tabs)) {
				if (Validator.isNotNull(fromDate)) {
					dynamicQuery.add(RestrictionsFactoryUtil.ge("createdDate", fromDate));
				}
				
				if (Validator.isNotNull(toDate)) {
					dynamicQuery.add(RestrictionsFactoryUtil.le("createdDate", toDate));
				}
				
			} else { 
				if (hasPublish) {
					if (Validator.isNotNull(fromDate)) {
						dynamicQuery.add(RestrictionsFactoryUtil.ge("publishedDate", fromDate));
					}
					
					if (Validator.isNotNull(toDate)) {
						dynamicQuery.add(RestrictionsFactoryUtil.le("publishedDate", toDate));
					}
					
				} else {
					if (Validator.isNotNull(fromDate)) {
						dynamicQuery.add(RestrictionsFactoryUtil.ge("modifiedDate", fromDate));
					}
					
					if (Validator.isNotNull(toDate)) {
						dynamicQuery.add(RestrictionsFactoryUtil.le("modifiedDate", toDate));
					}
				}
			}
		}
		
		
		if (!isCount) {
			if ("0".equals(tabs)) {
				dynamicQuery.addOrder(OrderFactoryUtil.desc("createdDate"));
			} else {
				if (hasPublish) {
					dynamicQuery.addOrder(OrderFactoryUtil.desc("publishedDate"));
				} else {
					dynamicQuery.addOrder(OrderFactoryUtil.desc("modifiedDate"));
				}
			}
		}
		return dynamicQuery.add(junction);
	}
	
	public DynamicQuery buildArticlePublished(long groupId, String language, long status, String categoryId, boolean sticky, String typeId, boolean isCount) {
		Junction junction = RestrictionsFactoryUtil.conjunction();
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));
		junction.add(PropertyFactoryUtil.forName("status").eq(status));
		
		Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
		if (!"0".equals(categoryId)) {
			/*if (categoryId.indexOf(",")>-1) {				
				String[] arrCategoryId = StringUtil.split(categoryId, ",");
				for (int i = 0; i < arrCategoryId.length; i++) {
					disjunction.add(PropertyFactoryUtil.forName("categoryId").like("%"+arrCategoryId[i]+"%"));
				}
			} else {*/
				junction.add(PropertyFactoryUtil.forName("categoryId").like("%"+categoryId+"%"));
			//}
		}
		
		
		if (sticky) {
			junction.add(PropertyFactoryUtil.forName("sticky").eq(sticky));
		}
		
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VcmsArticle.class, getClassLoader());
		/*if (categoryId.indexOf(",")>-1) {
			dynamicQuery.add(disjunction);
		}*/
		if (!isCount) {
			dynamicQuery.addOrder(OrderFactoryUtil.desc("publishedDate"));
		}
		return dynamicQuery.add(junction);
	}
	
	public DynamicQuery buildArticleSync(Date fromDate, Date toDate) {
		Junction junction = null;
		junction = RestrictionsFactoryUtil.conjunction();
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VcmsArticle.class, getClassLoader());
		dynamicQuery.add(RestrictionsFactoryUtil.between("createdDate", fromDate, toDate));
		return dynamicQuery.add(junction);
	}
	
	public int countArticleSearch(long groupId, String language, long status, String keyword) {
		DynamicQuery dynamicQuery = buildArticleSearch(groupId, language, status, keyword, true);
		return (int) vcmsArticlePersistence.countWithDynamicQuery(dynamicQuery);		
	}
	
	public List<VcmsArticle> getArticleSearch(long groupId, String language, long status, String keyword, int start, int end) throws Exception {
		DynamicQuery dynamicQuery = buildArticleSearch(groupId, language, status, keyword, false);
		return vcmsArticlePersistence.findWithDynamicQuery(dynamicQuery, start, end);	
	}
	
	public DynamicQuery buildArticleSearch(long groupId, String language, long status, String keyword, boolean isCount) {
		Junction junction = RestrictionsFactoryUtil.conjunction();
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));
		junction.add(PropertyFactoryUtil.forName("status").eq(status));
		
		Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
		if (!"".equals(keyword)) {
			disjunction.add(PropertyFactoryUtil.forName("title").like("%"+keyword+"%"));
			disjunction.add(PropertyFactoryUtil.forName("lead").like("%"+keyword+"%"));
			disjunction.add(PropertyFactoryUtil.forName("content").like("%"+keyword+"%"));
		}
		
		junction.add(disjunction);		
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VcmsArticle.class, getClassLoader());
		if (!isCount) {
			dynamicQuery.addOrder(OrderFactoryUtil.desc("publishedDate"));
		}
		return dynamicQuery.add(junction);
	}
	
	public int countArticleByCategory(long groupId, String language, long status, String categoryId, Date publishDate) {
		DynamicQuery dynamicQuery = buildArticleSearchByCategory(groupId, language, status, categoryId, publishDate, true);
		return (int) vcmsArticlePersistence.countWithDynamicQuery(dynamicQuery);		
	}
	
	public List<VcmsArticle> getArticleByCategory(long groupId, String language, long status, String categoryId, Date publishDate, int start, int end) throws Exception {
		DynamicQuery dynamicQuery = buildArticleSearchByCategory(groupId, language, status, categoryId, publishDate, true);
		return vcmsArticlePersistence.findWithDynamicQuery(dynamicQuery, start, end);	
	}
	
	public DynamicQuery buildArticleSearchByCategory(long groupId, String language, long status, String categoryId, Date publishDate, boolean isCount) {
		Junction junction = RestrictionsFactoryUtil.conjunction();
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));
		junction.add(PropertyFactoryUtil.forName("status").eq(status));
		
		Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
		if (!"".equals(categoryId)) {
			junction.add(PropertyFactoryUtil.forName("categoryId").like("%"+categoryId+"%"));
		}
		
		if (Validator.isNotNull(publishDate)) {
			junction.add(PropertyFactoryUtil.forName("publishedDate").between(publishDate, publishDate));
		}
		
		junction.add(disjunction);		
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VcmsArticle.class, getClassLoader());
		if (!isCount) {
			dynamicQuery.addOrder(OrderFactoryUtil.desc("publishedDate"));
		}
		return dynamicQuery.add(junction);
	}
	
	// FOR REPORT
	public int countReportCategory(long groupId, String language, long status, String categoryId) {
		DynamicQuery dynamicQuery = buildReportCategory(groupId, language, status, categoryId);
		return (int) vcmsArticlePersistence.countWithDynamicQuery(dynamicQuery);
	}
	
	public DynamicQuery buildReportCategory(long groupId, String language, long status, String categoryId) {
		Junction junction = RestrictionsFactoryUtil.conjunction();
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));
		junction.add(PropertyFactoryUtil.forName("status").eq(status));
		
		if (!"0".equals(categoryId)) {
			junction.add(PropertyFactoryUtil.forName("categoryId").like("%"+categoryId+"%"));
		}
		
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VcmsArticle.class, getClassLoader());
		return dynamicQuery.add(junction);
	}
	
	public int countReportUser(long groupId, String language, String userId, String mode) {
		DynamicQuery dynamicQuery = buildReportUser(groupId, language, userId, mode);
		return (int) vcmsArticlePersistence.countWithDynamicQuery(dynamicQuery);
	}
	
	public DynamicQuery buildReportUser(long groupId, String language, String userId, String mode) {
		Junction junction = RestrictionsFactoryUtil.conjunction();
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));
		
		if (!"0".equals(userId)) {
			if ("create".equals(mode)) {
				junction.add(PropertyFactoryUtil.forName("createdByUser").eq(userId));
			} else if ("modify".equals(mode)) {
				junction.add(PropertyFactoryUtil.forName("modifiedByUser").eq(userId));
			} else {
				junction.add(PropertyFactoryUtil.forName("publishedByUser").eq(userId));
			}
		}
		
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VcmsArticle.class, getClassLoader());
		return dynamicQuery.add(junction);
	}
} 