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
 * This class is a wrapper for {@link FAQAnswer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQAnswer
 * @generated
 */
@ProviderType
public class FAQAnswerWrapper implements FAQAnswer, ModelWrapper<FAQAnswer> {
	public FAQAnswerWrapper(FAQAnswer faqAnswer) {
		_faqAnswer = faqAnswer;
	}

	@Override
	public Class<?> getModelClass() {
		return FAQAnswer.class;
	}

	@Override
	public String getModelClassName() {
		return FAQAnswer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("questionid", getQuestionid());
		attributes.put("content", getContent());
		attributes.put("answerOrder", getAnswerOrder());
		attributes.put("answeredByUser", getAnsweredByUser());
		attributes.put("answeredDate", getAnsweredDate());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("language", getLanguage());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("approved", getApproved());
		attributes.put("approvedByUser", getApprovedByUser());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("userId", getUserId());
		attributes.put("attachName", getAttachName());
		attributes.put("folderId", getFolderId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long questionid = (Long)attributes.get("questionid");

		if (questionid != null) {
			setQuestionid(questionid);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Integer answerOrder = (Integer)attributes.get("answerOrder");

		if (answerOrder != null) {
			setAnswerOrder(answerOrder);
		}

		String answeredByUser = (String)attributes.get("answeredByUser");

		if (answeredByUser != null) {
			setAnsweredByUser(answeredByUser);
		}

		Date answeredDate = (Date)attributes.get("answeredDate");

		if (answeredDate != null) {
			setAnsweredDate(answeredDate);
		}

		String modifiedByUser = (String)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Boolean approved = (Boolean)attributes.get("approved");

		if (approved != null) {
			setApproved(approved);
		}

		String approvedByUser = (String)attributes.get("approvedByUser");

		if (approvedByUser != null) {
			setApprovedByUser(approvedByUser);
		}

		Date approvedDate = (Date)attributes.get("approvedDate");

		if (approvedDate != null) {
			setApprovedDate(approvedDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String attachName = (String)attributes.get("attachName");

		if (attachName != null) {
			setAttachName(attachName);
		}

		Long folderId = (Long)attributes.get("folderId");

		if (folderId != null) {
			setFolderId(folderId);
		}
	}

	/**
	* Returns the approved of this f a q answer.
	*
	* @return the approved of this f a q answer
	*/
	@Override
	public boolean getApproved() {
		return _faqAnswer.getApproved();
	}

	/**
	* Returns <code>true</code> if this f a q answer is approved.
	*
	* @return <code>true</code> if this f a q answer is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _faqAnswer.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _faqAnswer.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _faqAnswer.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _faqAnswer.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _faqAnswer.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.FAQAnswer> toCacheModel() {
		return _faqAnswer.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.FAQAnswer faqAnswer) {
		return _faqAnswer.compareTo(faqAnswer);
	}

	/**
	* Returns the answer order of this f a q answer.
	*
	* @return the answer order of this f a q answer
	*/
	@Override
	public int getAnswerOrder() {
		return _faqAnswer.getAnswerOrder();
	}

	@Override
	public int hashCode() {
		return _faqAnswer.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _faqAnswer.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new FAQAnswerWrapper((FAQAnswer)_faqAnswer.clone());
	}

	/**
	* Returns the answered by user of this f a q answer.
	*
	* @return the answered by user of this f a q answer
	*/
	@Override
	public java.lang.String getAnsweredByUser() {
		return _faqAnswer.getAnsweredByUser();
	}

	/**
	* Returns the approved by user of this f a q answer.
	*
	* @return the approved by user of this f a q answer
	*/
	@Override
	public java.lang.String getApprovedByUser() {
		return _faqAnswer.getApprovedByUser();
	}

	/**
	* Returns the attach name of this f a q answer.
	*
	* @return the attach name of this f a q answer
	*/
	@Override
	public java.lang.String getAttachName() {
		return _faqAnswer.getAttachName();
	}

	/**
	* Returns the content of this f a q answer.
	*
	* @return the content of this f a q answer
	*/
	@Override
	public java.lang.String getContent() {
		return _faqAnswer.getContent();
	}

	/**
	* Returns the language of this f a q answer.
	*
	* @return the language of this f a q answer
	*/
	@Override
	public java.lang.String getLanguage() {
		return _faqAnswer.getLanguage();
	}

	/**
	* Returns the modified by user of this f a q answer.
	*
	* @return the modified by user of this f a q answer
	*/
	@Override
	public java.lang.String getModifiedByUser() {
		return _faqAnswer.getModifiedByUser();
	}

	/**
	* Returns the user uuid of this f a q answer.
	*
	* @return the user uuid of this f a q answer
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _faqAnswer.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _faqAnswer.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _faqAnswer.toXmlString();
	}

	/**
	* Returns the answered date of this f a q answer.
	*
	* @return the answered date of this f a q answer
	*/
	@Override
	public Date getAnsweredDate() {
		return _faqAnswer.getAnsweredDate();
	}

	/**
	* Returns the approved date of this f a q answer.
	*
	* @return the approved date of this f a q answer
	*/
	@Override
	public Date getApprovedDate() {
		return _faqAnswer.getApprovedDate();
	}

	/**
	* Returns the modified date of this f a q answer.
	*
	* @return the modified date of this f a q answer
	*/
	@Override
	public Date getModifiedDate() {
		return _faqAnswer.getModifiedDate();
	}

	/**
	* Returns the folder ID of this f a q answer.
	*
	* @return the folder ID of this f a q answer
	*/
	@Override
	public long getFolderId() {
		return _faqAnswer.getFolderId();
	}

	/**
	* Returns the ID of this f a q answer.
	*
	* @return the ID of this f a q answer
	*/
	@Override
	public long getId() {
		return _faqAnswer.getId();
	}

	/**
	* Returns the primary key of this f a q answer.
	*
	* @return the primary key of this f a q answer
	*/
	@Override
	public long getPrimaryKey() {
		return _faqAnswer.getPrimaryKey();
	}

	/**
	* Returns the questionid of this f a q answer.
	*
	* @return the questionid of this f a q answer
	*/
	@Override
	public long getQuestionid() {
		return _faqAnswer.getQuestionid();
	}

	/**
	* Returns the user ID of this f a q answer.
	*
	* @return the user ID of this f a q answer
	*/
	@Override
	public long getUserId() {
		return _faqAnswer.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.FAQAnswer toEscapedModel() {
		return new FAQAnswerWrapper(_faqAnswer.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.FAQAnswer toUnescapedModel() {
		return new FAQAnswerWrapper(_faqAnswer.toUnescapedModel());
	}

	@Override
	public void persist() {
		_faqAnswer.persist();
	}

	/**
	* Sets the answer order of this f a q answer.
	*
	* @param answerOrder the answer order of this f a q answer
	*/
	@Override
	public void setAnswerOrder(int answerOrder) {
		_faqAnswer.setAnswerOrder(answerOrder);
	}

	/**
	* Sets the answered by user of this f a q answer.
	*
	* @param answeredByUser the answered by user of this f a q answer
	*/
	@Override
	public void setAnsweredByUser(java.lang.String answeredByUser) {
		_faqAnswer.setAnsweredByUser(answeredByUser);
	}

	/**
	* Sets the answered date of this f a q answer.
	*
	* @param answeredDate the answered date of this f a q answer
	*/
	@Override
	public void setAnsweredDate(Date answeredDate) {
		_faqAnswer.setAnsweredDate(answeredDate);
	}

	/**
	* Sets whether this f a q answer is approved.
	*
	* @param approved the approved of this f a q answer
	*/
	@Override
	public void setApproved(boolean approved) {
		_faqAnswer.setApproved(approved);
	}

	/**
	* Sets the approved by user of this f a q answer.
	*
	* @param approvedByUser the approved by user of this f a q answer
	*/
	@Override
	public void setApprovedByUser(java.lang.String approvedByUser) {
		_faqAnswer.setApprovedByUser(approvedByUser);
	}

	/**
	* Sets the approved date of this f a q answer.
	*
	* @param approvedDate the approved date of this f a q answer
	*/
	@Override
	public void setApprovedDate(Date approvedDate) {
		_faqAnswer.setApprovedDate(approvedDate);
	}

	/**
	* Sets the attach name of this f a q answer.
	*
	* @param attachName the attach name of this f a q answer
	*/
	@Override
	public void setAttachName(java.lang.String attachName) {
		_faqAnswer.setAttachName(attachName);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_faqAnswer.setCachedModel(cachedModel);
	}

	/**
	* Sets the content of this f a q answer.
	*
	* @param content the content of this f a q answer
	*/
	@Override
	public void setContent(java.lang.String content) {
		_faqAnswer.setContent(content);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_faqAnswer.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_faqAnswer.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_faqAnswer.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the folder ID of this f a q answer.
	*
	* @param folderId the folder ID of this f a q answer
	*/
	@Override
	public void setFolderId(long folderId) {
		_faqAnswer.setFolderId(folderId);
	}

	/**
	* Sets the ID of this f a q answer.
	*
	* @param id the ID of this f a q answer
	*/
	@Override
	public void setId(long id) {
		_faqAnswer.setId(id);
	}

	/**
	* Sets the language of this f a q answer.
	*
	* @param language the language of this f a q answer
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_faqAnswer.setLanguage(language);
	}

	/**
	* Sets the modified by user of this f a q answer.
	*
	* @param modifiedByUser the modified by user of this f a q answer
	*/
	@Override
	public void setModifiedByUser(java.lang.String modifiedByUser) {
		_faqAnswer.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this f a q answer.
	*
	* @param modifiedDate the modified date of this f a q answer
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_faqAnswer.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_faqAnswer.setNew(n);
	}

	/**
	* Sets the primary key of this f a q answer.
	*
	* @param primaryKey the primary key of this f a q answer
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_faqAnswer.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_faqAnswer.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the questionid of this f a q answer.
	*
	* @param questionid the questionid of this f a q answer
	*/
	@Override
	public void setQuestionid(long questionid) {
		_faqAnswer.setQuestionid(questionid);
	}

	/**
	* Sets the user ID of this f a q answer.
	*
	* @param userId the user ID of this f a q answer
	*/
	@Override
	public void setUserId(long userId) {
		_faqAnswer.setUserId(userId);
	}

	/**
	* Sets the user uuid of this f a q answer.
	*
	* @param userUuid the user uuid of this f a q answer
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_faqAnswer.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FAQAnswerWrapper)) {
			return false;
		}

		FAQAnswerWrapper faqAnswerWrapper = (FAQAnswerWrapper)obj;

		if (Objects.equals(_faqAnswer, faqAnswerWrapper._faqAnswer)) {
			return true;
		}

		return false;
	}

	@Override
	public FAQAnswer getWrappedModel() {
		return _faqAnswer;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _faqAnswer.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _faqAnswer.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_faqAnswer.resetOriginalValues();
	}

	private final FAQAnswer _faqAnswer;
}