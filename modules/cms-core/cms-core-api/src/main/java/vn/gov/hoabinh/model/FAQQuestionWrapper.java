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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link FAQQuestion}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQQuestion
 * @generated
 */
@ProviderType
public class FAQQuestionWrapper implements FAQQuestion,
	ModelWrapper<FAQQuestion> {
	public FAQQuestionWrapper(FAQQuestion faqQuestion) {
		_faqQuestion = faqQuestion;
	}

	@Override
	public Class<?> getModelClass() {
		return FAQQuestion.class;
	}

	@Override
	public String getModelClassName() {
		return FAQQuestion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("title", getTitle());
		attributes.put("content", getContent());
		attributes.put("language", getLanguage());
		attributes.put("questionOrder", getQuestionOrder());
		attributes.put("sentDate", getSentDate());
		attributes.put("sentByUser", getSentByUser());
		attributes.put("senderEmail", getSenderEmail());
		attributes.put("questionType", getQuestionType());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("hitCount", getHitCount());
		attributes.put("approved", getApproved());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("categoryId", getCategoryId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Integer questionOrder = (Integer)attributes.get("questionOrder");

		if (questionOrder != null) {
			setQuestionOrder(questionOrder);
		}

		Date sentDate = (Date)attributes.get("sentDate");

		if (sentDate != null) {
			setSentDate(sentDate);
		}

		String sentByUser = (String)attributes.get("sentByUser");

		if (sentByUser != null) {
			setSentByUser(sentByUser);
		}

		String senderEmail = (String)attributes.get("senderEmail");

		if (senderEmail != null) {
			setSenderEmail(senderEmail);
		}

		String questionType = (String)attributes.get("questionType");

		if (questionType != null) {
			setQuestionType(questionType);
		}

		String modifiedByUser = (String)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer hitCount = (Integer)attributes.get("hitCount");

		if (hitCount != null) {
			setHitCount(hitCount);
		}

		Boolean approved = (Boolean)attributes.get("approved");

		if (approved != null) {
			setApproved(approved);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long categoryId = (Long)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}
	}

	/**
	* Returns the approved of this f a q question.
	*
	* @return the approved of this f a q question
	*/
	@Override
	public boolean getApproved() {
		return _faqQuestion.getApproved();
	}

	/**
	* Returns <code>true</code> if this f a q question is approved.
	*
	* @return <code>true</code> if this f a q question is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _faqQuestion.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _faqQuestion.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _faqQuestion.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _faqQuestion.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _faqQuestion.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.FAQQuestion> toCacheModel() {
		return _faqQuestion.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.FAQQuestion faqQuestion) {
		return _faqQuestion.compareTo(faqQuestion);
	}

	/**
	* Returns the hit count of this f a q question.
	*
	* @return the hit count of this f a q question
	*/
	@Override
	public int getHitCount() {
		return _faqQuestion.getHitCount();
	}

	/**
	* Returns the question order of this f a q question.
	*
	* @return the question order of this f a q question
	*/
	@Override
	public int getQuestionOrder() {
		return _faqQuestion.getQuestionOrder();
	}

	@Override
	public int hashCode() {
		return _faqQuestion.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _faqQuestion.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new FAQQuestionWrapper((FAQQuestion)_faqQuestion.clone());
	}

	/**
	* Returns the content of this f a q question.
	*
	* @return the content of this f a q question
	*/
	@Override
	public java.lang.String getContent() {
		return _faqQuestion.getContent();
	}

	/**
	* Returns the language of this f a q question.
	*
	* @return the language of this f a q question
	*/
	@Override
	public java.lang.String getLanguage() {
		return _faqQuestion.getLanguage();
	}

	/**
	* Returns the modified by user of this f a q question.
	*
	* @return the modified by user of this f a q question
	*/
	@Override
	public java.lang.String getModifiedByUser() {
		return _faqQuestion.getModifiedByUser();
	}

	/**
	* Returns the question type of this f a q question.
	*
	* @return the question type of this f a q question
	*/
	@Override
	public java.lang.String getQuestionType() {
		return _faqQuestion.getQuestionType();
	}

	/**
	* Returns the sender email of this f a q question.
	*
	* @return the sender email of this f a q question
	*/
	@Override
	public java.lang.String getSenderEmail() {
		return _faqQuestion.getSenderEmail();
	}

	/**
	* Returns the sent by user of this f a q question.
	*
	* @return the sent by user of this f a q question
	*/
	@Override
	public java.lang.String getSentByUser() {
		return _faqQuestion.getSentByUser();
	}

	/**
	* Returns the title of this f a q question.
	*
	* @return the title of this f a q question
	*/
	@Override
	public java.lang.String getTitle() {
		return _faqQuestion.getTitle();
	}

	/**
	* Returns the user uuid of this f a q question.
	*
	* @return the user uuid of this f a q question
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _faqQuestion.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _faqQuestion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _faqQuestion.toXmlString();
	}

	/**
	* Returns the modified date of this f a q question.
	*
	* @return the modified date of this f a q question
	*/
	@Override
	public Date getModifiedDate() {
		return _faqQuestion.getModifiedDate();
	}

	/**
	* Returns the sent date of this f a q question.
	*
	* @return the sent date of this f a q question
	*/
	@Override
	public Date getSentDate() {
		return _faqQuestion.getSentDate();
	}

	/**
	* Returns the category ID of this f a q question.
	*
	* @return the category ID of this f a q question
	*/
	@Override
	public long getCategoryId() {
		return _faqQuestion.getCategoryId();
	}

	/**
	* Returns the group ID of this f a q question.
	*
	* @return the group ID of this f a q question
	*/
	@Override
	public long getGroupId() {
		return _faqQuestion.getGroupId();
	}

	/**
	* Returns the ID of this f a q question.
	*
	* @return the ID of this f a q question
	*/
	@Override
	public long getId() {
		return _faqQuestion.getId();
	}

	/**
	* Returns the primary key of this f a q question.
	*
	* @return the primary key of this f a q question
	*/
	@Override
	public long getPrimaryKey() {
		return _faqQuestion.getPrimaryKey();
	}

	/**
	* Returns the user ID of this f a q question.
	*
	* @return the user ID of this f a q question
	*/
	@Override
	public long getUserId() {
		return _faqQuestion.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.FAQQuestion toEscapedModel() {
		return new FAQQuestionWrapper(_faqQuestion.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.FAQQuestion toUnescapedModel() {
		return new FAQQuestionWrapper(_faqQuestion.toUnescapedModel());
	}

	@Override
	public void persist() {
		_faqQuestion.persist();
	}

	/**
	* Sets whether this f a q question is approved.
	*
	* @param approved the approved of this f a q question
	*/
	@Override
	public void setApproved(boolean approved) {
		_faqQuestion.setApproved(approved);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_faqQuestion.setCachedModel(cachedModel);
	}

	/**
	* Sets the category ID of this f a q question.
	*
	* @param categoryId the category ID of this f a q question
	*/
	@Override
	public void setCategoryId(long categoryId) {
		_faqQuestion.setCategoryId(categoryId);
	}

	/**
	* Sets the content of this f a q question.
	*
	* @param content the content of this f a q question
	*/
	@Override
	public void setContent(java.lang.String content) {
		_faqQuestion.setContent(content);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_faqQuestion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_faqQuestion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_faqQuestion.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this f a q question.
	*
	* @param groupId the group ID of this f a q question
	*/
	@Override
	public void setGroupId(long groupId) {
		_faqQuestion.setGroupId(groupId);
	}

	/**
	* Sets the hit count of this f a q question.
	*
	* @param hitCount the hit count of this f a q question
	*/
	@Override
	public void setHitCount(int hitCount) {
		_faqQuestion.setHitCount(hitCount);
	}

	/**
	* Sets the ID of this f a q question.
	*
	* @param id the ID of this f a q question
	*/
	@Override
	public void setId(long id) {
		_faqQuestion.setId(id);
	}

	/**
	* Sets the language of this f a q question.
	*
	* @param language the language of this f a q question
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_faqQuestion.setLanguage(language);
	}

	/**
	* Sets the modified by user of this f a q question.
	*
	* @param modifiedByUser the modified by user of this f a q question
	*/
	@Override
	public void setModifiedByUser(java.lang.String modifiedByUser) {
		_faqQuestion.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this f a q question.
	*
	* @param modifiedDate the modified date of this f a q question
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_faqQuestion.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_faqQuestion.setNew(n);
	}

	/**
	* Sets the primary key of this f a q question.
	*
	* @param primaryKey the primary key of this f a q question
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_faqQuestion.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_faqQuestion.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the question order of this f a q question.
	*
	* @param questionOrder the question order of this f a q question
	*/
	@Override
	public void setQuestionOrder(int questionOrder) {
		_faqQuestion.setQuestionOrder(questionOrder);
	}

	/**
	* Sets the question type of this f a q question.
	*
	* @param questionType the question type of this f a q question
	*/
	@Override
	public void setQuestionType(java.lang.String questionType) {
		_faqQuestion.setQuestionType(questionType);
	}

	/**
	* Sets the sender email of this f a q question.
	*
	* @param senderEmail the sender email of this f a q question
	*/
	@Override
	public void setSenderEmail(java.lang.String senderEmail) {
		_faqQuestion.setSenderEmail(senderEmail);
	}

	/**
	* Sets the sent by user of this f a q question.
	*
	* @param sentByUser the sent by user of this f a q question
	*/
	@Override
	public void setSentByUser(java.lang.String sentByUser) {
		_faqQuestion.setSentByUser(sentByUser);
	}

	/**
	* Sets the sent date of this f a q question.
	*
	* @param sentDate the sent date of this f a q question
	*/
	@Override
	public void setSentDate(Date sentDate) {
		_faqQuestion.setSentDate(sentDate);
	}

	/**
	* Sets the title of this f a q question.
	*
	* @param title the title of this f a q question
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_faqQuestion.setTitle(title);
	}

	/**
	* Sets the user ID of this f a q question.
	*
	* @param userId the user ID of this f a q question
	*/
	@Override
	public void setUserId(long userId) {
		_faqQuestion.setUserId(userId);
	}

	/**
	* Sets the user uuid of this f a q question.
	*
	* @param userUuid the user uuid of this f a q question
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_faqQuestion.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FAQQuestionWrapper)) {
			return false;
		}

		FAQQuestionWrapper faqQuestionWrapper = (FAQQuestionWrapper)obj;

		if (Objects.equals(_faqQuestion, faqQuestionWrapper._faqQuestion)) {
			return true;
		}

		return false;
	}

	@Override
	public FAQQuestion getWrappedModel() {
		return _faqQuestion;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _faqQuestion.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _faqQuestion.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_faqQuestion.resetOriginalValues();
	}

	private final FAQQuestion _faqQuestion;
}