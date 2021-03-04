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

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.FAQCategory;
import vn.gov.hoabinh.service.base.FAQCategoryLocalServiceBaseImpl;

/**
 * The implementation of the f a q category local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.FAQCategoryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQCategoryLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.FAQCategoryLocalServiceUtil
 */
@ProviderType
public class FAQCategoryLocalServiceImpl extends FAQCategoryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.FAQCategoryLocalServiceUtil} to access the f a q
	 * category local service.
	 */

	public FAQCategory addCategory(long groupId, String language, String name, String description, long parentId,
			int catOrder, int catLevel, String image, long userId) throws PortalException, SystemException {

		long catId = counterLocalService.increment();
		FAQCategory category = faqCategoryPersistence.create(catId);

		category.setGroupId(groupId);
		category.setLanguage(language);

		category.setName(name);
		category.setDescription(description);
		category.setParent(parentId);
		category.setCatorder(catOrder);
		category.setCatlevel(catLevel);
		category.setCreatedByUser(String.valueOf(userId));
		category.setCreatedDate(new Date());

		category.setUserId(userId);

		faqCategoryPersistence.update(category);

		return category;
	}

	public FAQCategory updateImage(long categoryId, String imageName) throws SystemException, PortalException {
		FAQCategory category = faqCategoryPersistence.findByPrimaryKey(categoryId);
		category.setImage(imageName);
		return faqCategoryPersistence.update(category);
	}

	public FAQCategory updateCategory(long groupId, String language, long categoryId, String name, String description,
			long parentId, int catOrder, int catLevel, String image, long userId)
			throws PortalException, SystemException {

		FAQCategory category = faqCategoryPersistence.findByPrimaryKey(categoryId);

		category.setName(name);
		category.setDescription(description);
		category.setLanguage(language);
		category.setParent(parentId);
		category.setCatorder(catOrder);
		category.setCatlevel(catLevel);
		category.setModifiedByUser(String.valueOf(userId));
		category.setModifiedDate(new Date());
		category.setGroupId(groupId);
		category.setUserId(userId);

		faqCategoryPersistence.update(category);
		return category;
	}

	public FAQCategory getCategory(long categoryId) throws PortalException, SystemException {

		return faqCategoryPersistence.findByPrimaryKey(categoryId);
	}

	public List<FAQCategory> getByParentId(long parentId) throws PortalException, SystemException {
		return faqCategoryPersistence.findByParentId(parentId);
	}

	public List<FAQCategory> getByG_L(long groupId, String language) throws SystemException {
		return faqCategoryPersistence.findByG_L(groupId, language);
	}

	public List<FAQCategory> getByG_L(long groupId, String language, int start, int end) throws SystemException {
		return faqCategoryPersistence.findByG_L(groupId, language, start, end);
	}

	public int countByG_L(long groupId, String language) throws SystemException {
		return faqCategoryPersistence.countByG_L(groupId, language);
	}

	public List<FAQCategory> getByG_L_P(long groupId, String language, long parentId) throws SystemException {
		return faqCategoryPersistence.findByG_L_P(groupId, language, parentId);
	}

	public List<FAQCategory> getByG_L_P(long groupId, String language, long parentId, int start, int end) throws SystemException {
		return faqCategoryPersistence.findByG_L_P(groupId, language, parentId, start, end);
	}

	public int countByG_L_P(long groupId, String language, long parentId) throws SystemException {
		return faqCategoryPersistence.countByG_L_P(groupId, language, parentId);
	}

	public List<FAQCategory> getCategoryMenu(long[] ids) {
		return faqCategoryPersistence.findByMenu(ids);
	}
	
	public List<FAQCategory> getCategoryMenu(String[] categorySel) {
		List<FAQCategory> retval = null;
		long[] ids = new long[categorySel.length];
		if (Validator.isNotNull(categorySel)) {
			for (int i=0;i<categorySel.length;i++) {
				ids[i] = Long.parseLong(categorySel[i]);
			}
			retval = faqCategoryPersistence.findByMenu(ids);
		}
		return retval;
	}
	
}