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
 * This class is a wrapper for {@link VcmsAttachedMessage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsAttachedMessage
 * @generated
 */
@ProviderType
public class VcmsAttachedMessageWrapper implements VcmsAttachedMessage,
	ModelWrapper<VcmsAttachedMessage> {
	public VcmsAttachedMessageWrapper(VcmsAttachedMessage vcmsAttachedMessage) {
		_vcmsAttachedMessage = vcmsAttachedMessage;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsAttachedMessage.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsAttachedMessage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("messageId", getMessageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
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

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String createdByUser = (String)attributes.get("createdByUser");

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
	* Returns the read message of this vcms attached message.
	*
	* @return the read message of this vcms attached message
	*/
	@Override
	public boolean getReadMessage() {
		return _vcmsAttachedMessage.getReadMessage();
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsAttachedMessage.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsAttachedMessage.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vcmsAttachedMessage.isNew();
	}

	/**
	* Returns <code>true</code> if this vcms attached message is read message.
	*
	* @return <code>true</code> if this vcms attached message is read message; <code>false</code> otherwise
	*/
	@Override
	public boolean isReadMessage() {
		return _vcmsAttachedMessage.isReadMessage();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsAttachedMessage.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsAttachedMessage> toCacheModel() {
		return _vcmsAttachedMessage.toCacheModel();
	}

	@Override
	public int compareTo(
		vn.gov.hoabinh.model.VcmsAttachedMessage vcmsAttachedMessage) {
		return _vcmsAttachedMessage.compareTo(vcmsAttachedMessage);
	}

	@Override
	public int hashCode() {
		return _vcmsAttachedMessage.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsAttachedMessage.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsAttachedMessageWrapper((VcmsAttachedMessage)_vcmsAttachedMessage.clone());
	}

	/**
	* Returns the article ID of this vcms attached message.
	*
	* @return the article ID of this vcms attached message
	*/
	@Override
	public java.lang.String getArticleId() {
		return _vcmsAttachedMessage.getArticleId();
	}

	/**
	* Returns the content of this vcms attached message.
	*
	* @return the content of this vcms attached message
	*/
	@Override
	public java.lang.String getContent() {
		return _vcmsAttachedMessage.getContent();
	}

	/**
	* Returns the created by user of this vcms attached message.
	*
	* @return the created by user of this vcms attached message
	*/
	@Override
	public java.lang.String getCreatedByUser() {
		return _vcmsAttachedMessage.getCreatedByUser();
	}

	/**
	* Returns the message ID of this vcms attached message.
	*
	* @return the message ID of this vcms attached message
	*/
	@Override
	public java.lang.String getMessageId() {
		return _vcmsAttachedMessage.getMessageId();
	}

	/**
	* Returns the primary key of this vcms attached message.
	*
	* @return the primary key of this vcms attached message
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vcmsAttachedMessage.getPrimaryKey();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsAttachedMessage.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsAttachedMessage.toXmlString();
	}

	/**
	* Returns the created date of this vcms attached message.
	*
	* @return the created date of this vcms attached message
	*/
	@Override
	public Date getCreatedDate() {
		return _vcmsAttachedMessage.getCreatedDate();
	}

	/**
	* Returns the company ID of this vcms attached message.
	*
	* @return the company ID of this vcms attached message
	*/
	@Override
	public long getCompanyId() {
		return _vcmsAttachedMessage.getCompanyId();
	}

	/**
	* Returns the group ID of this vcms attached message.
	*
	* @return the group ID of this vcms attached message
	*/
	@Override
	public long getGroupId() {
		return _vcmsAttachedMessage.getGroupId();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsAttachedMessage toEscapedModel() {
		return new VcmsAttachedMessageWrapper(_vcmsAttachedMessage.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsAttachedMessage toUnescapedModel() {
		return new VcmsAttachedMessageWrapper(_vcmsAttachedMessage.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vcmsAttachedMessage.persist();
	}

	/**
	* Sets the article ID of this vcms attached message.
	*
	* @param articleId the article ID of this vcms attached message
	*/
	@Override
	public void setArticleId(java.lang.String articleId) {
		_vcmsAttachedMessage.setArticleId(articleId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsAttachedMessage.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this vcms attached message.
	*
	* @param companyId the company ID of this vcms attached message
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vcmsAttachedMessage.setCompanyId(companyId);
	}

	/**
	* Sets the content of this vcms attached message.
	*
	* @param content the content of this vcms attached message
	*/
	@Override
	public void setContent(java.lang.String content) {
		_vcmsAttachedMessage.setContent(content);
	}

	/**
	* Sets the created by user of this vcms attached message.
	*
	* @param createdByUser the created by user of this vcms attached message
	*/
	@Override
	public void setCreatedByUser(java.lang.String createdByUser) {
		_vcmsAttachedMessage.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this vcms attached message.
	*
	* @param createdDate the created date of this vcms attached message
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vcmsAttachedMessage.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsAttachedMessage.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsAttachedMessage.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsAttachedMessage.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this vcms attached message.
	*
	* @param groupId the group ID of this vcms attached message
	*/
	@Override
	public void setGroupId(long groupId) {
		_vcmsAttachedMessage.setGroupId(groupId);
	}

	/**
	* Sets the message ID of this vcms attached message.
	*
	* @param messageId the message ID of this vcms attached message
	*/
	@Override
	public void setMessageId(java.lang.String messageId) {
		_vcmsAttachedMessage.setMessageId(messageId);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsAttachedMessage.setNew(n);
	}

	/**
	* Sets the primary key of this vcms attached message.
	*
	* @param primaryKey the primary key of this vcms attached message
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vcmsAttachedMessage.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsAttachedMessage.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this vcms attached message is read message.
	*
	* @param readMessage the read message of this vcms attached message
	*/
	@Override
	public void setReadMessage(boolean readMessage) {
		_vcmsAttachedMessage.setReadMessage(readMessage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsAttachedMessageWrapper)) {
			return false;
		}

		VcmsAttachedMessageWrapper vcmsAttachedMessageWrapper = (VcmsAttachedMessageWrapper)obj;

		if (Objects.equals(_vcmsAttachedMessage,
					vcmsAttachedMessageWrapper._vcmsAttachedMessage)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsAttachedMessage getWrappedModel() {
		return _vcmsAttachedMessage;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsAttachedMessage.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsAttachedMessage.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsAttachedMessage.resetOriginalValues();
	}

	private final VcmsAttachedMessage _vcmsAttachedMessage;
}