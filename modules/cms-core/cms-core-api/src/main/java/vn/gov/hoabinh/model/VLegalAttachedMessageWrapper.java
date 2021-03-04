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
 * This class is a wrapper for {@link VLegalAttachedMessage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalAttachedMessage
 * @generated
 */
@ProviderType
public class VLegalAttachedMessageWrapper implements VLegalAttachedMessage,
	ModelWrapper<VLegalAttachedMessage> {
	public VLegalAttachedMessageWrapper(
		VLegalAttachedMessage vLegalAttachedMessage) {
		_vLegalAttachedMessage = vLegalAttachedMessage;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalAttachedMessage.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalAttachedMessage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("messageId", getMessageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("articleId", getArticleId());
		attributes.put("content", getContent());
		attributes.put("readMessage", getReadMessage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String messageId = (String)attributes.get("messageId");

		if (messageId != null) {
			setMessageId(messageId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long createdByUser = (Long)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		String articleId = (String)attributes.get("articleId");

		if (articleId != null) {
			setArticleId(articleId);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Boolean readMessage = (Boolean)attributes.get("readMessage");

		if (readMessage != null) {
			setReadMessage(readMessage);
		}
	}

	/**
	* Returns the read message of this v legal attached message.
	*
	* @return the read message of this v legal attached message
	*/
	@Override
	public boolean getReadMessage() {
		return _vLegalAttachedMessage.getReadMessage();
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalAttachedMessage.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalAttachedMessage.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vLegalAttachedMessage.isNew();
	}

	/**
	* Returns <code>true</code> if this v legal attached message is read message.
	*
	* @return <code>true</code> if this v legal attached message is read message; <code>false</code> otherwise
	*/
	@Override
	public boolean isReadMessage() {
		return _vLegalAttachedMessage.isReadMessage();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalAttachedMessage.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalAttachedMessage> toCacheModel() {
		return _vLegalAttachedMessage.toCacheModel();
	}

	@Override
	public int compareTo(
		vn.gov.hoabinh.model.VLegalAttachedMessage vLegalAttachedMessage) {
		return _vLegalAttachedMessage.compareTo(vLegalAttachedMessage);
	}

	@Override
	public int hashCode() {
		return _vLegalAttachedMessage.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalAttachedMessage.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalAttachedMessageWrapper((VLegalAttachedMessage)_vLegalAttachedMessage.clone());
	}

	/**
	* Returns the article ID of this v legal attached message.
	*
	* @return the article ID of this v legal attached message
	*/
	@Override
	public java.lang.String getArticleId() {
		return _vLegalAttachedMessage.getArticleId();
	}

	/**
	* Returns the content of this v legal attached message.
	*
	* @return the content of this v legal attached message
	*/
	@Override
	public java.lang.String getContent() {
		return _vLegalAttachedMessage.getContent();
	}

	/**
	* Returns the message ID of this v legal attached message.
	*
	* @return the message ID of this v legal attached message
	*/
	@Override
	public java.lang.String getMessageId() {
		return _vLegalAttachedMessage.getMessageId();
	}

	/**
	* Returns the primary key of this v legal attached message.
	*
	* @return the primary key of this v legal attached message
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vLegalAttachedMessage.getPrimaryKey();
	}

	/**
	* Returns the user uuid of this v legal attached message.
	*
	* @return the user uuid of this v legal attached message
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vLegalAttachedMessage.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalAttachedMessage.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalAttachedMessage.toXmlString();
	}

	/**
	* Returns the created date of this v legal attached message.
	*
	* @return the created date of this v legal attached message
	*/
	@Override
	public Date getCreatedDate() {
		return _vLegalAttachedMessage.getCreatedDate();
	}

	/**
	* Returns the company ID of this v legal attached message.
	*
	* @return the company ID of this v legal attached message
	*/
	@Override
	public long getCompanyId() {
		return _vLegalAttachedMessage.getCompanyId();
	}

	/**
	* Returns the created by user of this v legal attached message.
	*
	* @return the created by user of this v legal attached message
	*/
	@Override
	public long getCreatedByUser() {
		return _vLegalAttachedMessage.getCreatedByUser();
	}

	/**
	* Returns the group ID of this v legal attached message.
	*
	* @return the group ID of this v legal attached message
	*/
	@Override
	public long getGroupId() {
		return _vLegalAttachedMessage.getGroupId();
	}

	/**
	* Returns the user ID of this v legal attached message.
	*
	* @return the user ID of this v legal attached message
	*/
	@Override
	public long getUserId() {
		return _vLegalAttachedMessage.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalAttachedMessage toEscapedModel() {
		return new VLegalAttachedMessageWrapper(_vLegalAttachedMessage.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalAttachedMessage toUnescapedModel() {
		return new VLegalAttachedMessageWrapper(_vLegalAttachedMessage.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vLegalAttachedMessage.persist();
	}

	/**
	* Sets the article ID of this v legal attached message.
	*
	* @param articleId the article ID of this v legal attached message
	*/
	@Override
	public void setArticleId(java.lang.String articleId) {
		_vLegalAttachedMessage.setArticleId(articleId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalAttachedMessage.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this v legal attached message.
	*
	* @param companyId the company ID of this v legal attached message
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vLegalAttachedMessage.setCompanyId(companyId);
	}

	/**
	* Sets the content of this v legal attached message.
	*
	* @param content the content of this v legal attached message
	*/
	@Override
	public void setContent(java.lang.String content) {
		_vLegalAttachedMessage.setContent(content);
	}

	/**
	* Sets the created by user of this v legal attached message.
	*
	* @param createdByUser the created by user of this v legal attached message
	*/
	@Override
	public void setCreatedByUser(long createdByUser) {
		_vLegalAttachedMessage.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this v legal attached message.
	*
	* @param createdDate the created date of this v legal attached message
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vLegalAttachedMessage.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalAttachedMessage.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalAttachedMessage.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalAttachedMessage.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this v legal attached message.
	*
	* @param groupId the group ID of this v legal attached message
	*/
	@Override
	public void setGroupId(long groupId) {
		_vLegalAttachedMessage.setGroupId(groupId);
	}

	/**
	* Sets the message ID of this v legal attached message.
	*
	* @param messageId the message ID of this v legal attached message
	*/
	@Override
	public void setMessageId(java.lang.String messageId) {
		_vLegalAttachedMessage.setMessageId(messageId);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalAttachedMessage.setNew(n);
	}

	/**
	* Sets the primary key of this v legal attached message.
	*
	* @param primaryKey the primary key of this v legal attached message
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vLegalAttachedMessage.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalAttachedMessage.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this v legal attached message is read message.
	*
	* @param readMessage the read message of this v legal attached message
	*/
	@Override
	public void setReadMessage(boolean readMessage) {
		_vLegalAttachedMessage.setReadMessage(readMessage);
	}

	/**
	* Sets the user ID of this v legal attached message.
	*
	* @param userId the user ID of this v legal attached message
	*/
	@Override
	public void setUserId(long userId) {
		_vLegalAttachedMessage.setUserId(userId);
	}

	/**
	* Sets the user uuid of this v legal attached message.
	*
	* @param userUuid the user uuid of this v legal attached message
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vLegalAttachedMessage.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalAttachedMessageWrapper)) {
			return false;
		}

		VLegalAttachedMessageWrapper vLegalAttachedMessageWrapper = (VLegalAttachedMessageWrapper)obj;

		if (Objects.equals(_vLegalAttachedMessage,
					vLegalAttachedMessageWrapper._vLegalAttachedMessage)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalAttachedMessage getWrappedModel() {
		return _vLegalAttachedMessage;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalAttachedMessage.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalAttachedMessage.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalAttachedMessage.resetOriginalValues();
	}

	private final VLegalAttachedMessage _vLegalAttachedMessage;
}