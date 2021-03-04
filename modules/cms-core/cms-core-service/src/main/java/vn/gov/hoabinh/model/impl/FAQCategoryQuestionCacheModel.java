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

package vn.gov.hoabinh.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import vn.gov.hoabinh.model.FAQCategoryQuestion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing FAQCategoryQuestion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see FAQCategoryQuestion
 * @generated
 */
@ProviderType
public class FAQCategoryQuestionCacheModel implements CacheModel<FAQCategoryQuestion>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FAQCategoryQuestionCacheModel)) {
			return false;
		}

		FAQCategoryQuestionCacheModel faqCategoryQuestionCacheModel = (FAQCategoryQuestionCacheModel)obj;

		if (id == faqCategoryQuestionCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", questionId=");
		sb.append(questionId);
		sb.append(", categoryId=");
		sb.append(categoryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FAQCategoryQuestion toEntityModel() {
		FAQCategoryQuestionImpl faqCategoryQuestionImpl = new FAQCategoryQuestionImpl();

		faqCategoryQuestionImpl.setId(id);
		faqCategoryQuestionImpl.setQuestionId(questionId);
		faqCategoryQuestionImpl.setCategoryId(categoryId);

		faqCategoryQuestionImpl.resetOriginalValues();

		return faqCategoryQuestionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		questionId = objectInput.readLong();

		categoryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(questionId);

		objectOutput.writeLong(categoryId);
	}

	public long id;
	public long questionId;
	public long categoryId;
}