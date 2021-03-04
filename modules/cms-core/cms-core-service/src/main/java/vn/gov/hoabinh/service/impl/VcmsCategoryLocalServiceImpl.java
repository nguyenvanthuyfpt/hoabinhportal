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
import java.util.Date;
import java.util.List;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.exception.NoSuchVcmsCategoryException;
import vn.gov.hoabinh.model.VcmsCARelation;
import vn.gov.hoabinh.model.VcmsCategory;
import vn.gov.hoabinh.service.VcmsCARelationLocalServiceUtil;
import vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil;
import vn.gov.hoabinh.service.base.VcmsCategoryLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VcmsCategoryUtil;
import vn.gov.hoabinh.util.PortalUtil;

/**
 * The implementation of the vcms category local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VcmsCategoryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCategoryLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil
 */
@ProviderType
public class VcmsCategoryLocalServiceImpl extends VcmsCategoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VcmsCategoryLocalServiceUtil} to access the vcms
	 * category local service.
	 */

	public VcmsCategory addCategory(long groupId, long companyId, long plid, String portionId, String parentId,
			String name, String description, boolean anchored, String href, String language, boolean hasImage,
			String image, boolean rssable) throws PortalException, SystemException, RemoteException {

		String categoryId = Long.toString(CounterLocalServiceUtil.increment(VcmsCategory.class.getName()));

		Date now = new Date();
		String userId = PortalUtil.getUserId();

		VcmsCategory category = vcmsCategoryPersistence.create(categoryId);

		category.setGroupId(groupId);
		category.setCompanyId(companyId);

		category.setPortionId(portionId);
		category.setParentId(parentId);
		category.setName(name);
		category.setDescription(description);
		category.setAnchored(anchored);
		category.setHref(href);
		category.setLanguage(language);
		category.setHasImage(hasImage);
		category.setImage(image);

		// set position
		int total = VcmsCategoryLocalServiceUtil.countCategoriesByP_P(groupId, portionId, parentId, language);
		category.setPosition(total + 1);

		category.setUserHit(0);
		category.setRssable(rssable);

		category.setCreatedDate(now);
		category.setCreatedByUser(String.valueOf(userId));

		category.setModifiedDate(now);
		category.setModifiedByUser(String.valueOf(userId));

		VcmsCategoryUtil.update(category, null);

		return category;
	}

	// change portion
	public void changePortion(String parentId, long groupId, String portionId, String language) throws SystemException {

		List list = vcmsCategoryPersistence.findByPortion(groupId, language, portionId);

		for (int i = 0; i < list.size(); i++) {
			VcmsCategory vcmsCategory = (VcmsCategory) list.get(i);
			vcmsCategory.setPortionId(portionId);
			vcmsCategoryPersistence.update(vcmsCategory);
			changePortion(vcmsCategory.getCategoryId(), groupId, portionId, language);
		}
	}

	public VcmsCategory updateCategory(long groupId, long companyId, String categoryId, String portionId,
			String parentId, String name, String description, boolean anchored, String href, String language,
			boolean hasImage, String image, int position, int userHit, boolean rssable)
			throws PortalException, SystemException, RemoteException {

		Date now = new Date();
		String userId = PortalUtil.getUserId();
		VcmsCategory category = vcmsCategoryPersistence.findByPrimaryKey(categoryId);

		category.setGroupId(groupId);
		category.setCompanyId(companyId);

		category.setPortionId(portionId);
		category.setParentId(parentId);
		category.setName(name);
		category.setDescription(description);
		category.setAnchored(anchored);
		category.setHref(href);
		category.setLanguage(language);
		category.setHasImage(hasImage);
		category.setImage(image);
		category.setPosition(position);
		category.setUserHit(userHit);
		category.setRssable(rssable);

		category.setModifiedDate(now);
		category.setModifiedByUser(userId);

		vcmsCategoryPersistence.update(category);

		return category;
	}

	public VcmsCategory updateCategory(VcmsCategory category) throws PortalException, SystemException, RemoteException {

		return updateCategory(category.getGroupId(), category.getCompanyId(), category.getCategoryId(),
				category.getPortionId(), category.getParentId(), category.getName(), category.getDescription(),
				category.getAnchored(), category.getHref(), category.getLanguage(), category.getHasImage(),
				category.getImage(), category.getPosition(), category.getUserHit(), category.getRssable());

	}

	public void deleteCategory(String categoryId) throws PortalException, SystemException, RemoteException {
		if (Validator.isNull(categoryId)) {
			throw new NoSuchVcmsCategoryException();
		}
		VcmsCategory category = null;
		try {
			category = vcmsCategoryPersistence.findByPrimaryKey(categoryId);
			List<VcmsCARelation> relations = VcmsCARelationLocalServiceUtil.getRelationsByCategory(categoryId);
			List<VcmsCategory> categories = vcmsCategoryPersistence.findByG_L_P(category.getGroupId(),
					category.getLanguage(), category.getCategoryId());
		} catch (Exception ex) {
		}
	}

	public VcmsCategory getCategory(String categoryId) throws PortalException, SystemException, RemoteException {
		if (Validator.isNull(categoryId)) {
			throw new NoSuchVcmsCategoryException();
		}
		return vcmsCategoryPersistence.findByPrimaryKey(categoryId);
	}

	public List<VcmsCategory> getCategoriesByPortion(long groupId, String language, String portionId)
			throws PortalException, SystemException, RemoteException {
		return vcmsCategoryPersistence.findByPortion(groupId, language, portionId);
	}

	public List<VcmsCategory> getCategoriesByParent(long groupId, String language, String parentId)
			throws PortalException, SystemException, RemoteException {
		return vcmsCategoryPersistence.findByG_L_P(groupId, language, parentId);
	}

	public List<VcmsCategory> getCategoriesByParent(long groupId, String language, String parentId, int start, int end)
			throws PortalException, SystemException, RemoteException {
		return vcmsCategoryPersistence.findByG_L_P(groupId, language, parentId, start, end);
	}

	public int countCategoriesByParent(long groupId, String language, String parentId)
			throws PortalException, SystemException, RemoteException {
		return vcmsCategoryPersistence.countByG_L_P(groupId, language, parentId);
	}

	public List<VcmsCategory> getCategoriesByP_P(long groupId, String language, String parentId, String portionId)
			throws PortalException, SystemException, RemoteException {
		return vcmsCategoryPersistence.findByG_L_P_P(groupId, language, parentId, portionId);
	}

	public List<VcmsCategory> getCategoriesByP_P(long groupId, String language, String parentId, String portionId,
			int start, int end) throws PortalException, SystemException, RemoteException {
		return vcmsCategoryPersistence.findByG_L_P_P(groupId, language, parentId, portionId, start, end);
	}

	public int countCategoriesByP_P(long groupId, String language, String parentId, String portionId)
			throws PortalException, SystemException, RemoteException {
		return vcmsCategoryPersistence.countByG_L_P_P(groupId, language, parentId, portionId);
	}

	public int countByG_L(long groupId, String language) throws PortalException, SystemException, RemoteException {
		return vcmsCategoryPersistence.countByG_L(groupId, language);
	}

	public List<VcmsCategory> getCategoryByG_L(long groupId, String language) {
		return vcmsCategoryPersistence.findByG_L(groupId, language);
	}

	public List<VcmsCategory> getCategoryByG_L(long groupId, String language, int start, int end) {
		return vcmsCategoryPersistence.findByG_L(groupId, language, start, end);
	}

	public List<VcmsCategory> getCategoryMenu(String[] categoryIds) {
		return vcmsCategoryPersistence.findByG_L_C(categoryIds);
	}

	public int countCategorySearch(long groupId, String language, String portionId, String parentId, String keyword,
			int hasHref, int hasImage, int isRss) {
		DynamicQuery dynamicQuery = buildSearchCategory(groupId, language, portionId, parentId, keyword, hasHref,
				hasImage, isRss, true);
		return (int) vcmsCategoryPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public List<VcmsCategory> getCategorySearch(long groupId, String language, String portionId, String parentId,
			String keyword, int hasHref, int hasImage, int isRss, int start, int end) throws Exception {
		DynamicQuery dynamicQuery = buildSearchCategory(groupId, language, portionId, parentId, keyword, hasHref,
				hasImage, isRss, false);
		return vcmsCategoryPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	public DynamicQuery buildSearchCategory(long groupId, String language, String portionId, String parentId,
			String keyword, int hasHref, int hasImage, int isRss, boolean isCount) {
		Junction junction = RestrictionsFactoryUtil.conjunction();
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));

		if (!"0".equals(portionId)) {
			junction.add(PropertyFactoryUtil.forName("portionId").eq(portionId));
		}

		if (!"0".equals(parentId)) {
			junction.add(PropertyFactoryUtil.forName("parentId").eq(parentId));
		}

		if (hasHref > -1) {
			junction.add(PropertyFactoryUtil.forName("anchored").eq((hasHref > 0 ? true : false)));
		}

		if (hasImage > -1) {
			junction.add(PropertyFactoryUtil.forName("hasImage").eq((hasImage > 0 ? true : false)));
		}

		if (isRss > -1) {
			junction.add(PropertyFactoryUtil.forName("rssable").eq((isRss > 0 ? true : false)));
		}
		
		if (Validator.isNotNull(keyword) && !"".equals(keyword)) {
			junction.add(PropertyFactoryUtil.forName("name").like("%"+keyword+"%"));
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VcmsCategory.class, getClassLoader());

		if (!isCount) {
			dynamicQuery.addOrder(OrderFactoryUtil.desc("createdDate"));
		}

		return dynamicQuery.add(junction);
	}
}