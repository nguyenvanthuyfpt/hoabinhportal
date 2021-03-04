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
 * This class is a wrapper for {@link FAQComment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQComment
 * @generated
 */
@ProviderType
public class FAQCommentWrapper implements FAQComment, ModelWrapper<FAQComment> {
	public FAQCommentWrapper(FAQComment faqComment) {
		_faqComment = faqComment;
	}

	@Override
	public Class<?> getModelClass() {
		return FAQComment.class;
	}

	@Override
	public String getModelClassName() {
		return FAQComment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("answerid", getAnswerid());
		attributes.put("content", getContent());
		attributes.put("commName", getCommName());
		attributes.put("commEmail", getCommEmail());
		attributes.put("approved", getApproved());
		attributes.put("approveByUser", getApproveByUser());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("commDate", getCommDate());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long answerid = (Long)attributes.get("answerid");

		if (answerid != null) {
			setAnswerid(answerid);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		String commName = (String)attributes.get("commName");

		if (commName != null) {
			setCommName(commName);
		}

		String commEmail = (String)attributes.get("commEmail");

		if (commEmail != null) {
			setCommEmail(commEmail);
		}

		Boolean approved = (Boolean)attributes.get("approved");

		if (approved != null) {
			setApproved(approved);
		}

		String approveByUser = (String)attributes.get("approveByUser");

		if (approveByUser != null) {
			setApproveByUser(approveByUser);
		}

		Date approvedDate = (Date)attributes.get("approvedDate");

		if (approvedDate != null) {
			setApprovedDate(approvedDate);
		}

		Date commDate = (Date)attributes.get("commDate");

		if (commDate != null) {
			setCommDate(commDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	/**
	* Returns the approved of this f a q comment.
	*
	* @return the approved of this f a q comment
	*/
	@Override
	public boolean getApproved() {
		return _faqComment.getApproved();
	}

	/**
	* Returns <code>true</code> if this f a q comment is approved.
	*
	* @return <code>true</code> if this f a q comment is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _faqComment.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _faqComment.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _faqComment.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _faqComment.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _faqComment.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.FAQComment> toCacheModel() {
		return _faqComment.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.FAQComment faqComment) {
		return _faqComment.compareTo(faqComment);
	}

	@Override
	public int hashCode() {
		return _faqComment.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _faqComment.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new FAQCommentWrapper((FAQComment)_faqComment.clone());
	}

	/**
	* Returns the approve by user of this f a q comment.
	*
	* @return the approve by user of this f a q comment
	*/
	@Override
	public java.lang.String getApproveByUser() {
		return _faqComment.getApproveByUser();
	}

	/**
	* Returns the comm email of this f a q comment.
	*
	* @return the comm email of this f a q comment
	*/
	@Override
	public java.lang.String getCommEmail() {
		return _faqComment.getCommEmail();
	}

	/**
	* Returns the comm name of this f a q comment.
	*
	* @return the comm name of this f a q comment
	*/
	@Override
	public java.lang.String getCommName() {
		return _faqComment.getCommName();
	}

	/**
	* Returns the content of this f a q comment.
	*
	* @return the content of this f a q comment
	*/
	@Override
	public java.lang.String getContent() {
		return _faqComment.getContent();
	}

	/**
	* Returns the user uuid of this f a q comment.
	*
	* @return the user uuid of this f a q comment
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _faqComment.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _faqComment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _faqComment.toXmlString();
	}

	/**
	* Returns the approved date of this f a q comment.
	*
	* @return the approved date of this f a q comment
	*/
	@Override
	public Date getApprovedDate() {
		return _faqComment.getApprovedDate();
	}

	/**
	* Returns the comm date of this f a q comment.
	*
	* @return the comm date of this f a q comment
	*/
	@Override
	public Date getCommDate() {
		return _faqComment.getCommDate();
	}

	/**
	* Returns the answerid of this f a q comment.
	*
	* @return the answerid of this f a q comment
	*/
	@Override
	public long getAnswerid() {
		return _faqComment.getAnswerid();
	}

	/**
	* Returns the ID of this f a q comment.
	*
	* @return the ID of this f a q comment
	*/
	@Override
	public long getId() {
		return _faqComment.getId();
	}

	/**
	* Returns the primary key of this f a q comment.
	*
	* @return the primary key of this f a q comment
	*/
	@Override
	public long getPrimaryKey() {
		return _faqComment.getPrimaryKey();
	}

	/**
	* Returns the user ID of this f a q comment.
	*
	* @return the user ID of this f a q comment
	*/
	@Override
	public long getUserId() {
		return _faqComment.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.FAQComment toEscapedModel() {
		return new FAQCommentWrapper(_faqComment.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.FAQComment toUnescapedModel() {
		return new FAQCommentWrapper(_faqComment.toUnescapedModel());
	}

	@Override
	public void persist() {
		_faqComment.persist();
	}

	/**
	* Sets the answerid of this f a q comment.
	*
	* @param answerid the answerid of this f a q comment
	*/
	@Override
	public void setAnswerid(long answerid) {
		_faqComment.setAnswerid(answerid);
	}

	/**
	* Sets the approve by user of this f a q comment.
	*
	* @param approveByUser the approve by user of this f a q comment
	*/
	@Override
	public void setApproveByUser(java.lang.String approveByUser) {
		_faqComment.setApproveByUser(approveByUser);
	}

	/**
	* Sets whether this f a q comment is approved.
	*
	* @param approved the approved of this f a q comment
	*/
	@Override
	public void setApproved(boolean approved) {
		_faqComment.setApproved(approved);
	}

	/**
	* Sets the approved date of this f a q comment.
	*
	* @param approvedDate the approved date of this f a q comment
	*/
	@Override
	public void setApprovedDate(Date approvedDate) {
		_faqComment.setApprovedDate(approvedDate);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_faqComment.setCachedModel(cachedModel);
	}

	/**
	* Sets the comm date of this f a q comment.
	*
	* @param commDate the comm date of this f a q comment
	*/
	@Override
	public void setCommDate(Date commDate) {
		_faqComment.setCommDate(commDate);
	}

	/**
	* Sets the comm email of this f a q comment.
	*
	* @param commEmail the comm email of this f a q comment
	*/
	@Override
	public void setCommEmail(java.lang.String commEmail) {
		_faqComment.setCommEmail(commEmail);
	}

	/**
	* Sets the comm name of this f a q comment.
	*
	* @param commName the comm name of this f a q comment
	*/
	@Override
	public void setCommName(java.lang.String commName) {
		_faqComment.setCommName(commName);
	}

	/**
	* Sets the content of this f a q comment.
	*
	* @param content the content of this f a q comment
	*/
	@Override
	public void setContent(java.lang.String content) {
		_faqComment.setContent(content);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_faqComment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_faqComment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_faqComment.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this f a q comment.
	*
	* @param id the ID of this f a q comment
	*/
	@Override
	public void setId(long id) {
		_faqComment.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_faqComment.setNew(n);
	}

	/**
	* Sets the primary key of this f a q comment.
	*
	* @param primaryKey the primary key of this f a q comment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_faqComment.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_faqComment.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this f a q comment.
	*
	* @param userId the user ID of this f a q comment
	*/
	@Override
	public void setUserId(long userId) {
		_faqComment.setUserId(userId);
	}

	/**
	* Sets the user uuid of this f a q comment.
	*
	* @param userUuid the user uuid of this f a q comment
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_faqComment.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FAQCommentWrapper)) {
			return false;
		}

		FAQCommentWrapper faqCommentWrapper = (FAQCommentWrapper)obj;

		if (Objects.equals(_faqComment, faqCommentWrapper._faqComment)) {
			return true;
		}

		return false;
	}

	@Override
	public FAQComment getWrappedModel() {
		return _faqComment;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _faqComment.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _faqComment.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_faqComment.resetOriginalValues();
	}

	private final FAQComment _faqComment;
}