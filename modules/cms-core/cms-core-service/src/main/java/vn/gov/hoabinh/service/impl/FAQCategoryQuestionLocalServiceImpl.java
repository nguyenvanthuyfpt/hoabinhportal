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

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.FAQCategoryQuestion;
import vn.gov.hoabinh.service.base.FAQCategoryQuestionLocalServiceBaseImpl;

/**
 * The implementation of the f a q category question local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.FAQCategoryQuestionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQCategoryQuestionLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.FAQCategoryQuestionLocalServiceUtil
 */
@ProviderType
public class FAQCategoryQuestionLocalServiceImpl extends FAQCategoryQuestionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.FAQCategoryQuestionLocalServiceUtil} to access the
	 * f a q category question local service.
	 */

	public FAQCategoryQuestion addCategoryQuestion(long categoryId, long questionId)
			throws PortalException, SystemException {
		long cqId = counterLocalService.increment();
		FAQCategoryQuestion cq = faqCategoryQuestionPersistence.create(cqId);
		cq.setCategoryId(categoryId);
		cq.setQuestionId(questionId);

		return faqCategoryQuestionPersistence.update(cq);
	}

	public void deleteByQuestionId(long questionId) throws PortalException, SystemException {
		faqCategoryQuestionPersistence.removeByQuestionId(questionId);
	}

	public void deleteByCategoryId(long categoryId) throws PortalException, SystemException {
		faqCategoryQuestionPersistence.removeByCategoryId(categoryId);
	}

	public List<FAQCategoryQuestion> getAll() throws PortalException, SystemException {
		return faqCategoryQuestionPersistence.findAll();
	}

	public List<FAQCategoryQuestion> getQuestionsInCategory(long categoryId) throws PortalException, SystemException {
		return faqCategoryQuestionPersistence.findByCategoryId(categoryId);
	}

	public List<FAQCategoryQuestion> getCategoriesOfQuestion(long questionId) throws PortalException, SystemException {
		return faqCategoryQuestionPersistence.findByQuestionId(questionId);
	}
}