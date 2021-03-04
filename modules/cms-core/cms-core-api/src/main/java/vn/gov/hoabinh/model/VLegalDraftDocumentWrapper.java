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
 * This class is a wrapper for {@link VLegalDraftDocument}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDraftDocument
 * @generated
 */
@ProviderType
public class VLegalDraftDocumentWrapper implements VLegalDraftDocument,
	ModelWrapper<VLegalDraftDocument> {
	public VLegalDraftDocumentWrapper(VLegalDraftDocument vLegalDraftDocument) {
		_vLegalDraftDocument = vLegalDraftDocument;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalDraftDocument.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalDraftDocument.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("draftId", getDraftId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("approvedByUser", getApprovedByUser());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("publishedByUser", getPublishedByUser());
		attributes.put("publishedDate", getPublishedDate());
		attributes.put("title", getTitle());
		attributes.put("expiredDate", getExpiredDate());
		attributes.put("language", getLanguage());
		attributes.put("content", getContent());
		attributes.put("typeId", getTypeId());
		attributes.put("fieldId", getFieldId());
		attributes.put("hasAttachment", getHasAttachment());
		attributes.put("draftLevel", getDraftLevel());
		attributes.put("docCode", getDocCode());
		attributes.put("statusDraft", getStatusDraft());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String draftId = (String)attributes.get("draftId");

		if (draftId != null) {
			setDraftId(draftId);
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

		Long createdByUser = (Long)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long modifiedByUser = (Long)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long approvedByUser = (Long)attributes.get("approvedByUser");

		if (approvedByUser != null) {
			setApprovedByUser(approvedByUser);
		}

		Date approvedDate = (Date)attributes.get("approvedDate");

		if (approvedDate != null) {
			setApprovedDate(approvedDate);
		}

		Long publishedByUser = (Long)attributes.get("publishedByUser");

		if (publishedByUser != null) {
			setPublishedByUser(publishedByUser);
		}

		Date publishedDate = (Date)attributes.get("publishedDate");

		if (publishedDate != null) {
			setPublishedDate(publishedDate);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Date expiredDate = (Date)attributes.get("expiredDate");

		if (expiredDate != null) {
			setExpiredDate(expiredDate);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		String typeId = (String)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}

		String fieldId = (String)attributes.get("fieldId");

		if (fieldId != null) {
			setFieldId(fieldId);
		}

		Boolean hasAttachment = (Boolean)attributes.get("hasAttachment");

		if (hasAttachment != null) {
			setHasAttachment(hasAttachment);
		}

		Integer draftLevel = (Integer)attributes.get("draftLevel");

		if (draftLevel != null) {
			setDraftLevel(draftLevel);
		}

		String docCode = (String)attributes.get("docCode");

		if (docCode != null) {
			setDocCode(docCode);
		}

		Integer statusDraft = (Integer)attributes.get("statusDraft");

		if (statusDraft != null) {
			setStatusDraft(statusDraft);
		}
	}

	/**
	* Returns the has attachment of this v legal draft document.
	*
	* @return the has attachment of this v legal draft document
	*/
	@Override
	public boolean getHasAttachment() {
		return _vLegalDraftDocument.getHasAttachment();
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalDraftDocument.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalDraftDocument.isEscapedModel();
	}

	@Override
	public boolean isExpired() {
		return _vLegalDraftDocument.isExpired();
	}

	/**
	* Returns <code>true</code> if this v legal draft document is has attachment.
	*
	* @return <code>true</code> if this v legal draft document is has attachment; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasAttachment() {
		return _vLegalDraftDocument.isHasAttachment();
	}

	@Override
	public boolean isNew() {
		return _vLegalDraftDocument.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalDraftDocument.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalDraftDocument> toCacheModel() {
		return _vLegalDraftDocument.toCacheModel();
	}

	@Override
	public int compareTo(
		vn.gov.hoabinh.model.VLegalDraftDocument vLegalDraftDocument) {
		return _vLegalDraftDocument.compareTo(vLegalDraftDocument);
	}

	/**
	* Returns the draft level of this v legal draft document.
	*
	* @return the draft level of this v legal draft document
	*/
	@Override
	public int getDraftLevel() {
		return _vLegalDraftDocument.getDraftLevel();
	}

	/**
	* Returns the status draft of this v legal draft document.
	*
	* @return the status draft of this v legal draft document
	*/
	@Override
	public int getStatusDraft() {
		return _vLegalDraftDocument.getStatusDraft();
	}

	@Override
	public int hashCode() {
		return _vLegalDraftDocument.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalDraftDocument.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalDraftDocumentWrapper((VLegalDraftDocument)_vLegalDraftDocument.clone());
	}

	/**
	* Returns the content of this v legal draft document.
	*
	* @return the content of this v legal draft document
	*/
	@Override
	public java.lang.String getContent() {
		return _vLegalDraftDocument.getContent();
	}

	/**
	* Returns the doc code of this v legal draft document.
	*
	* @return the doc code of this v legal draft document
	*/
	@Override
	public java.lang.String getDocCode() {
		return _vLegalDraftDocument.getDocCode();
	}

	/**
	* Returns the draft ID of this v legal draft document.
	*
	* @return the draft ID of this v legal draft document
	*/
	@Override
	public java.lang.String getDraftId() {
		return _vLegalDraftDocument.getDraftId();
	}

	/**
	* Returns the field ID of this v legal draft document.
	*
	* @return the field ID of this v legal draft document
	*/
	@Override
	public java.lang.String getFieldId() {
		return _vLegalDraftDocument.getFieldId();
	}

	/**
	* Returns the language of this v legal draft document.
	*
	* @return the language of this v legal draft document
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vLegalDraftDocument.getLanguage();
	}

	/**
	* Returns the primary key of this v legal draft document.
	*
	* @return the primary key of this v legal draft document
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vLegalDraftDocument.getPrimaryKey();
	}

	/**
	* Returns the title of this v legal draft document.
	*
	* @return the title of this v legal draft document
	*/
	@Override
	public java.lang.String getTitle() {
		return _vLegalDraftDocument.getTitle();
	}

	/**
	* Returns the type ID of this v legal draft document.
	*
	* @return the type ID of this v legal draft document
	*/
	@Override
	public java.lang.String getTypeId() {
		return _vLegalDraftDocument.getTypeId();
	}

	/**
	* Returns the user uuid of this v legal draft document.
	*
	* @return the user uuid of this v legal draft document
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vLegalDraftDocument.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalDraftDocument.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalDraftDocument.toXmlString();
	}

	/**
	* Returns the approved date of this v legal draft document.
	*
	* @return the approved date of this v legal draft document
	*/
	@Override
	public Date getApprovedDate() {
		return _vLegalDraftDocument.getApprovedDate();
	}

	/**
	* Returns the created date of this v legal draft document.
	*
	* @return the created date of this v legal draft document
	*/
	@Override
	public Date getCreatedDate() {
		return _vLegalDraftDocument.getCreatedDate();
	}

	/**
	* Returns the expired date of this v legal draft document.
	*
	* @return the expired date of this v legal draft document
	*/
	@Override
	public Date getExpiredDate() {
		return _vLegalDraftDocument.getExpiredDate();
	}

	/**
	* Returns the modified date of this v legal draft document.
	*
	* @return the modified date of this v legal draft document
	*/
	@Override
	public Date getModifiedDate() {
		return _vLegalDraftDocument.getModifiedDate();
	}

	/**
	* Returns the published date of this v legal draft document.
	*
	* @return the published date of this v legal draft document
	*/
	@Override
	public Date getPublishedDate() {
		return _vLegalDraftDocument.getPublishedDate();
	}

	/**
	* Returns the approved by user of this v legal draft document.
	*
	* @return the approved by user of this v legal draft document
	*/
	@Override
	public long getApprovedByUser() {
		return _vLegalDraftDocument.getApprovedByUser();
	}

	/**
	* Returns the company ID of this v legal draft document.
	*
	* @return the company ID of this v legal draft document
	*/
	@Override
	public long getCompanyId() {
		return _vLegalDraftDocument.getCompanyId();
	}

	/**
	* Returns the created by user of this v legal draft document.
	*
	* @return the created by user of this v legal draft document
	*/
	@Override
	public long getCreatedByUser() {
		return _vLegalDraftDocument.getCreatedByUser();
	}

	/**
	* Returns the group ID of this v legal draft document.
	*
	* @return the group ID of this v legal draft document
	*/
	@Override
	public long getGroupId() {
		return _vLegalDraftDocument.getGroupId();
	}

	/**
	* Returns the modified by user of this v legal draft document.
	*
	* @return the modified by user of this v legal draft document
	*/
	@Override
	public long getModifiedByUser() {
		return _vLegalDraftDocument.getModifiedByUser();
	}

	/**
	* Returns the published by user of this v legal draft document.
	*
	* @return the published by user of this v legal draft document
	*/
	@Override
	public long getPublishedByUser() {
		return _vLegalDraftDocument.getPublishedByUser();
	}

	/**
	* Returns the user ID of this v legal draft document.
	*
	* @return the user ID of this v legal draft document
	*/
	@Override
	public long getUserId() {
		return _vLegalDraftDocument.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDraftDocument toEscapedModel() {
		return new VLegalDraftDocumentWrapper(_vLegalDraftDocument.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDraftDocument toUnescapedModel() {
		return new VLegalDraftDocumentWrapper(_vLegalDraftDocument.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vLegalDraftDocument.persist();
	}

	/**
	* Sets the approved by user of this v legal draft document.
	*
	* @param approvedByUser the approved by user of this v legal draft document
	*/
	@Override
	public void setApprovedByUser(long approvedByUser) {
		_vLegalDraftDocument.setApprovedByUser(approvedByUser);
	}

	/**
	* Sets the approved date of this v legal draft document.
	*
	* @param approvedDate the approved date of this v legal draft document
	*/
	@Override
	public void setApprovedDate(Date approvedDate) {
		_vLegalDraftDocument.setApprovedDate(approvedDate);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalDraftDocument.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this v legal draft document.
	*
	* @param companyId the company ID of this v legal draft document
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vLegalDraftDocument.setCompanyId(companyId);
	}

	/**
	* Sets the content of this v legal draft document.
	*
	* @param content the content of this v legal draft document
	*/
	@Override
	public void setContent(java.lang.String content) {
		_vLegalDraftDocument.setContent(content);
	}

	/**
	* Sets the created by user of this v legal draft document.
	*
	* @param createdByUser the created by user of this v legal draft document
	*/
	@Override
	public void setCreatedByUser(long createdByUser) {
		_vLegalDraftDocument.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this v legal draft document.
	*
	* @param createdDate the created date of this v legal draft document
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vLegalDraftDocument.setCreatedDate(createdDate);
	}

	/**
	* Sets the doc code of this v legal draft document.
	*
	* @param docCode the doc code of this v legal draft document
	*/
	@Override
	public void setDocCode(java.lang.String docCode) {
		_vLegalDraftDocument.setDocCode(docCode);
	}

	/**
	* Sets the draft ID of this v legal draft document.
	*
	* @param draftId the draft ID of this v legal draft document
	*/
	@Override
	public void setDraftId(java.lang.String draftId) {
		_vLegalDraftDocument.setDraftId(draftId);
	}

	/**
	* Sets the draft level of this v legal draft document.
	*
	* @param draftLevel the draft level of this v legal draft document
	*/
	@Override
	public void setDraftLevel(int draftLevel) {
		_vLegalDraftDocument.setDraftLevel(draftLevel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalDraftDocument.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalDraftDocument.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalDraftDocument.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expired date of this v legal draft document.
	*
	* @param expiredDate the expired date of this v legal draft document
	*/
	@Override
	public void setExpiredDate(Date expiredDate) {
		_vLegalDraftDocument.setExpiredDate(expiredDate);
	}

	/**
	* Sets the field ID of this v legal draft document.
	*
	* @param fieldId the field ID of this v legal draft document
	*/
	@Override
	public void setFieldId(java.lang.String fieldId) {
		_vLegalDraftDocument.setFieldId(fieldId);
	}

	/**
	* Sets the group ID of this v legal draft document.
	*
	* @param groupId the group ID of this v legal draft document
	*/
	@Override
	public void setGroupId(long groupId) {
		_vLegalDraftDocument.setGroupId(groupId);
	}

	/**
	* Sets whether this v legal draft document is has attachment.
	*
	* @param hasAttachment the has attachment of this v legal draft document
	*/
	@Override
	public void setHasAttachment(boolean hasAttachment) {
		_vLegalDraftDocument.setHasAttachment(hasAttachment);
	}

	/**
	* Sets the language of this v legal draft document.
	*
	* @param language the language of this v legal draft document
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vLegalDraftDocument.setLanguage(language);
	}

	/**
	* Sets the modified by user of this v legal draft document.
	*
	* @param modifiedByUser the modified by user of this v legal draft document
	*/
	@Override
	public void setModifiedByUser(long modifiedByUser) {
		_vLegalDraftDocument.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this v legal draft document.
	*
	* @param modifiedDate the modified date of this v legal draft document
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vLegalDraftDocument.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalDraftDocument.setNew(n);
	}

	/**
	* Sets the primary key of this v legal draft document.
	*
	* @param primaryKey the primary key of this v legal draft document
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vLegalDraftDocument.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalDraftDocument.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the published by user of this v legal draft document.
	*
	* @param publishedByUser the published by user of this v legal draft document
	*/
	@Override
	public void setPublishedByUser(long publishedByUser) {
		_vLegalDraftDocument.setPublishedByUser(publishedByUser);
	}

	/**
	* Sets the published date of this v legal draft document.
	*
	* @param publishedDate the published date of this v legal draft document
	*/
	@Override
	public void setPublishedDate(Date publishedDate) {
		_vLegalDraftDocument.setPublishedDate(publishedDate);
	}

	/**
	* Sets the status draft of this v legal draft document.
	*
	* @param statusDraft the status draft of this v legal draft document
	*/
	@Override
	public void setStatusDraft(int statusDraft) {
		_vLegalDraftDocument.setStatusDraft(statusDraft);
	}

	/**
	* Sets the title of this v legal draft document.
	*
	* @param title the title of this v legal draft document
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_vLegalDraftDocument.setTitle(title);
	}

	/**
	* Sets the type ID of this v legal draft document.
	*
	* @param typeId the type ID of this v legal draft document
	*/
	@Override
	public void setTypeId(java.lang.String typeId) {
		_vLegalDraftDocument.setTypeId(typeId);
	}

	/**
	* Sets the user ID of this v legal draft document.
	*
	* @param userId the user ID of this v legal draft document
	*/
	@Override
	public void setUserId(long userId) {
		_vLegalDraftDocument.setUserId(userId);
	}

	/**
	* Sets the user uuid of this v legal draft document.
	*
	* @param userUuid the user uuid of this v legal draft document
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vLegalDraftDocument.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalDraftDocumentWrapper)) {
			return false;
		}

		VLegalDraftDocumentWrapper vLegalDraftDocumentWrapper = (VLegalDraftDocumentWrapper)obj;

		if (Objects.equals(_vLegalDraftDocument,
					vLegalDraftDocumentWrapper._vLegalDraftDocument)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalDraftDocument getWrappedModel() {
		return _vLegalDraftDocument;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalDraftDocument.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalDraftDocument.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalDraftDocument.resetOriginalValues();
	}

	private final VLegalDraftDocument _vLegalDraftDocument;
}