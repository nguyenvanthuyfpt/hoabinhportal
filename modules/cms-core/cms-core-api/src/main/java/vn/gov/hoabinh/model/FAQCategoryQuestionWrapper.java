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

package vn.gov.hoabinh.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link FAQCategoryQuestion}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQCategoryQuestion
 * @generated
 */
@ProviderType
public class FAQCategoryQuestionWrapper implements FAQCategoryQuestion,
	ModelWrapper<FAQCategoryQuestion> {
	public FAQCategoryQuestionWrapper(FAQCategoryQuestion faqCategoryQuestion) {
		_faqCategoryQuestion = faqCategoryQuestion;
	}

	@Override
	public Class<?> getModelClass() {
		return FAQCategoryQuestion.class;
	}

	@Override
	public String getModelClassName() {
		return FAQCategoryQuestion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("questionId", getQuestionId());
		attributes.put("categoryId", getCategoryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long questionId = (Long)attributes.get("questionId");

		if (questionId != null) {
			setQuestionId(questionId);
		}

		Long categoryId = (Long)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _faqCategoryQuestion.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _faqCategoryQuestion.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _faqCategoryQuestion.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _faqCategoryQuestion.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.FAQCategoryQuestion> toCacheModel() {
		return _faqCategoryQuestion.toCacheModel();
	}

	@Override
	public int compareTo(
		vn.gov.hoabinh.model.FAQCategoryQuestion faqCategoryQuestion) {
		return _faqCategoryQuestion.compareTo(faqCategoryQuestion);
	}

	@Override
	public int hashCode() {
		return _faqCategoryQuestion.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _faqCategoryQuestion.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new FAQCategoryQuestionWrapper((FAQCategoryQuestion)_faqCategoryQuestion.clone());
	}

	@Override
	public java.lang.String toString() {
		return _faqCategoryQuestion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _faqCategoryQuestion.toXmlString();
	}

	/**
	* Returns the category ID of this f a q category question.
	*
	* @return the category ID of this f a q category question
	*/
	@Override
	public long getCategoryId() {
		return _faqCategoryQuestion.getCategoryId();
	}

	/**
	* Returns the ID of this f a q category question.
	*
	* @return the ID of this f a q category question
	*/
	@Override
	public long getId() {
		return _faqCategoryQuestion.getId();
	}

	/**
	* Returns the primary key of this f a q category question.
	*
	* @return the primary key of this f a q category question
	*/
	@Override
	public long getPrimaryKey() {
		return _faqCategoryQuestion.getPrimaryKey();
	}

	/**
	* Returns the question ID of this f a q category question.
	*
	* @return the question ID of this f a q category question
	*/
	@Override
	public long getQuestionId() {
		return _faqCategoryQuestion.getQuestionId();
	}

	@Override
	public vn.gov.hoabinh.model.FAQCategoryQuestion toEscapedModel() {
		return new FAQCategoryQuestionWrapper(_faqCategoryQuestion.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.FAQCategoryQuestion toUnescapedModel() {
		return new FAQCategoryQuestionWrapper(_faqCategoryQuestion.toUnescapedModel());
	}

	@Override
	public void persist() {
		_faqCategoryQuestion.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_faqCategoryQuestion.setCachedModel(cachedModel);
	}

	/**
	* Sets the category ID of this f a q category question.
	*
	* @param categoryId the category ID of this f a q category question
	*/
	@Override
	public void setCategoryId(long categoryId) {
		_faqCategoryQuestion.setCategoryId(categoryId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_faqCategoryQuestion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_faqCategoryQuestion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_faqCategoryQuestion.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this f a q category question.
	*
	* @param id the ID of this f a q category question
	*/
	@Override
	public void setId(long id) {
		_faqCategoryQuestion.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_faqCategoryQuestion.setNew(n);
	}

	/**
	* Sets the primary key of this f a q category question.
	*
	* @param primaryKey the primary key of this f a q category question
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_faqCategoryQuestion.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_faqCategoryQuestion.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the question ID of this f a q category question.
	*
	* @param questionId the question ID of this f a q category question
	*/
	@Override
	public void setQuestionId(long questionId) {
		_faqCategoryQuestion.setQuestionId(questionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FAQCategoryQuestionWrapper)) {
			return false;
		}

		FAQCategoryQuestionWrapper faqCategoryQuestionWrapper = (FAQCategoryQuestionWrapper)obj;

		if (Objects.equals(_faqCategoryQuestion,
					faqCategoryQuestionWrapper._faqCategoryQuestion)) {
			return true;
		}

		return false;
	}

	@Override
	public FAQCategoryQuestion getWrappedModel() {
		return _faqCategoryQuestion;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _faqCategoryQuestion.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _faqCategoryQuestion.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_faqCategoryQuestion.resetOriginalValues();
	}

	private final FAQCategoryQuestion _faqCategoryQuestion;
}