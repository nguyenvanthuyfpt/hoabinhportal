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
 * This class is a wrapper for {@link VLegalSuggestDocument}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSuggestDocument
 * @generated
 */
@ProviderType
public class VLegalSuggestDocumentWrapper implements VLegalSuggestDocument,
	ModelWrapper<VLegalSuggestDocument> {
	public VLegalSuggestDocumentWrapper(
		VLegalSuggestDocument vLegalSuggestDocument) {
		_vLegalSuggestDocument = vLegalSuggestDocument;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalSuggestDocument.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalSuggestDocument.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sugId", getSugId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("approved", getApproved());
		attributes.put("approvedByUser", getApprovedByUser());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("title", getTitle());
		attributes.put("content", getContent());
		attributes.put("language", getLanguage());
		attributes.put("visitorName", getVisitorName());
		attributes.put("visitorEmail", getVisitorEmail());
		attributes.put("visitorTel", getVisitorTel());
		attributes.put("visitorAddress", getVisitorAddress());
		attributes.put("draftId", getDraftId());
		attributes.put("hasAttachment", getHasAttachment());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String sugId = (String)attributes.get("sugId");

		if (sugId != null) {
			setSugId(sugId);
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

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long modifiedByUser = (Long)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		Boolean approved = (Boolean)attributes.get("approved");

		if (approved != null) {
			setApproved(approved);
		}

		Long approvedByUser = (Long)attributes.get("approvedByUser");

		if (approvedByUser != null) {
			setApprovedByUser(approvedByUser);
		}

		Date approvedDate = (Date)attributes.get("approvedDate");

		if (approvedDate != null) {
			setApprovedDate(approvedDate);
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

		String visitorName = (String)attributes.get("visitorName");

		if (visitorName != null) {
			setVisitorName(visitorName);
		}

		String visitorEmail = (String)attributes.get("visitorEmail");

		if (visitorEmail != null) {
			setVisitorEmail(visitorEmail);
		}

		String visitorTel = (String)attributes.get("visitorTel");

		if (visitorTel != null) {
			setVisitorTel(visitorTel);
		}

		String visitorAddress = (String)attributes.get("visitorAddress");

		if (visitorAddress != null) {
			setVisitorAddress(visitorAddress);
		}

		String draftId = (String)attributes.get("draftId");

		if (draftId != null) {
			setDraftId(draftId);
		}

		Boolean hasAttachment = (Boolean)attributes.get("hasAttachment");

		if (hasAttachment != null) {
			setHasAttachment(hasAttachment);
		}
	}

	/**
	* Returns the approved of this v legal suggest document.
	*
	* @return the approved of this v legal suggest document
	*/
	@Override
	public boolean getApproved() {
		return _vLegalSuggestDocument.getApproved();
	}

	/**
	* Returns the has attachment of this v legal suggest document.
	*
	* @return the has attachment of this v legal suggest document
	*/
	@Override
	public boolean getHasAttachment() {
		return _vLegalSuggestDocument.getHasAttachment();
	}

	/**
	* Returns <code>true</code> if this v legal suggest document is approved.
	*
	* @return <code>true</code> if this v legal suggest document is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _vLegalSuggestDocument.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalSuggestDocument.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalSuggestDocument.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this v legal suggest document is has attachment.
	*
	* @return <code>true</code> if this v legal suggest document is has attachment; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasAttachment() {
		return _vLegalSuggestDocument.isHasAttachment();
	}

	@Override
	public boolean isNew() {
		return _vLegalSuggestDocument.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalSuggestDocument.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalSuggestDocument> toCacheModel() {
		return _vLegalSuggestDocument.toCacheModel();
	}

	@Override
	public int compareTo(
		vn.gov.hoabinh.model.VLegalSuggestDocument vLegalSuggestDocument) {
		return _vLegalSuggestDocument.compareTo(vLegalSuggestDocument);
	}

	@Override
	public int hashCode() {
		return _vLegalSuggestDocument.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalSuggestDocument.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalSuggestDocumentWrapper((VLegalSuggestDocument)_vLegalSuggestDocument.clone());
	}

	/**
	* Returns the content of this v legal suggest document.
	*
	* @return the content of this v legal suggest document
	*/
	@Override
	public java.lang.String getContent() {
		return _vLegalSuggestDocument.getContent();
	}

	/**
	* Returns the draft ID of this v legal suggest document.
	*
	* @return the draft ID of this v legal suggest document
	*/
	@Override
	public java.lang.String getDraftId() {
		return _vLegalSuggestDocument.getDraftId();
	}

	/**
	* Returns the language of this v legal suggest document.
	*
	* @return the language of this v legal suggest document
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vLegalSuggestDocument.getLanguage();
	}

	/**
	* Returns the primary key of this v legal suggest document.
	*
	* @return the primary key of this v legal suggest document
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vLegalSuggestDocument.getPrimaryKey();
	}

	/**
	* Returns the sug ID of this v legal suggest document.
	*
	* @return the sug ID of this v legal suggest document
	*/
	@Override
	public java.lang.String getSugId() {
		return _vLegalSuggestDocument.getSugId();
	}

	/**
	* Returns the title of this v legal suggest document.
	*
	* @return the title of this v legal suggest document
	*/
	@Override
	public java.lang.String getTitle() {
		return _vLegalSuggestDocument.getTitle();
	}

	/**
	* Returns the user uuid of this v legal suggest document.
	*
	* @return the user uuid of this v legal suggest document
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vLegalSuggestDocument.getUserUuid();
	}

	/**
	* Returns the visitor address of this v legal suggest document.
	*
	* @return the visitor address of this v legal suggest document
	*/
	@Override
	public java.lang.String getVisitorAddress() {
		return _vLegalSuggestDocument.getVisitorAddress();
	}

	/**
	* Returns the visitor email of this v legal suggest document.
	*
	* @return the visitor email of this v legal suggest document
	*/
	@Override
	public java.lang.String getVisitorEmail() {
		return _vLegalSuggestDocument.getVisitorEmail();
	}

	/**
	* Returns the visitor name of this v legal suggest document.
	*
	* @return the visitor name of this v legal suggest document
	*/
	@Override
	public java.lang.String getVisitorName() {
		return _vLegalSuggestDocument.getVisitorName();
	}

	/**
	* Returns the visitor tel of this v legal suggest document.
	*
	* @return the visitor tel of this v legal suggest document
	*/
	@Override
	public java.lang.String getVisitorTel() {
		return _vLegalSuggestDocument.getVisitorTel();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalSuggestDocument.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalSuggestDocument.toXmlString();
	}

	/**
	* Returns the approved date of this v legal suggest document.
	*
	* @return the approved date of this v legal suggest document
	*/
	@Override
	public Date getApprovedDate() {
		return _vLegalSuggestDocument.getApprovedDate();
	}

	/**
	* Returns the created date of this v legal suggest document.
	*
	* @return the created date of this v legal suggest document
	*/
	@Override
	public Date getCreatedDate() {
		return _vLegalSuggestDocument.getCreatedDate();
	}

	/**
	* Returns the modified date of this v legal suggest document.
	*
	* @return the modified date of this v legal suggest document
	*/
	@Override
	public Date getModifiedDate() {
		return _vLegalSuggestDocument.getModifiedDate();
	}

	/**
	* Returns the approved by user of this v legal suggest document.
	*
	* @return the approved by user of this v legal suggest document
	*/
	@Override
	public long getApprovedByUser() {
		return _vLegalSuggestDocument.getApprovedByUser();
	}

	/**
	* Returns the company ID of this v legal suggest document.
	*
	* @return the company ID of this v legal suggest document
	*/
	@Override
	public long getCompanyId() {
		return _vLegalSuggestDocument.getCompanyId();
	}

	/**
	* Returns the group ID of this v legal suggest document.
	*
	* @return the group ID of this v legal suggest document
	*/
	@Override
	public long getGroupId() {
		return _vLegalSuggestDocument.getGroupId();
	}

	/**
	* Returns the modified by user of this v legal suggest document.
	*
	* @return the modified by user of this v legal suggest document
	*/
	@Override
	public long getModifiedByUser() {
		return _vLegalSuggestDocument.getModifiedByUser();
	}

	/**
	* Returns the user ID of this v legal suggest document.
	*
	* @return the user ID of this v legal suggest document
	*/
	@Override
	public long getUserId() {
		return _vLegalSuggestDocument.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument toEscapedModel() {
		return new VLegalSuggestDocumentWrapper(_vLegalSuggestDocument.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSuggestDocument toUnescapedModel() {
		return new VLegalSuggestDocumentWrapper(_vLegalSuggestDocument.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vLegalSuggestDocument.persist();
	}

	/**
	* Sets whether this v legal suggest document is approved.
	*
	* @param approved the approved of this v legal suggest document
	*/
	@Override
	public void setApproved(boolean approved) {
		_vLegalSuggestDocument.setApproved(approved);
	}

	/**
	* Sets the approved by user of this v legal suggest document.
	*
	* @param approvedByUser the approved by user of this v legal suggest document
	*/
	@Override
	public void setApprovedByUser(long approvedByUser) {
		_vLegalSuggestDocument.setApprovedByUser(approvedByUser);
	}

	/**
	* Sets the approved date of this v legal suggest document.
	*
	* @param approvedDate the approved date of this v legal suggest document
	*/
	@Override
	public void setApprovedDate(Date approvedDate) {
		_vLegalSuggestDocument.setApprovedDate(approvedDate);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalSuggestDocument.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this v legal suggest document.
	*
	* @param companyId the company ID of this v legal suggest document
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vLegalSuggestDocument.setCompanyId(companyId);
	}

	/**
	* Sets the content of this v legal suggest document.
	*
	* @param content the content of this v legal suggest document
	*/
	@Override
	public void setContent(java.lang.String content) {
		_vLegalSuggestDocument.setContent(content);
	}

	/**
	* Sets the created date of this v legal suggest document.
	*
	* @param createdDate the created date of this v legal suggest document
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vLegalSuggestDocument.setCreatedDate(createdDate);
	}

	/**
	* Sets the draft ID of this v legal suggest document.
	*
	* @param draftId the draft ID of this v legal suggest document
	*/
	@Override
	public void setDraftId(java.lang.String draftId) {
		_vLegalSuggestDocument.setDraftId(draftId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalSuggestDocument.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalSuggestDocument.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalSuggestDocument.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this v legal suggest document.
	*
	* @param groupId the group ID of this v legal suggest document
	*/
	@Override
	public void setGroupId(long groupId) {
		_vLegalSuggestDocument.setGroupId(groupId);
	}

	/**
	* Sets whether this v legal suggest document is has attachment.
	*
	* @param hasAttachment the has attachment of this v legal suggest document
	*/
	@Override
	public void setHasAttachment(boolean hasAttachment) {
		_vLegalSuggestDocument.setHasAttachment(hasAttachment);
	}

	/**
	* Sets the language of this v legal suggest document.
	*
	* @param language the language of this v legal suggest document
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vLegalSuggestDocument.setLanguage(language);
	}

	/**
	* Sets the modified by user of this v legal suggest document.
	*
	* @param modifiedByUser the modified by user of this v legal suggest document
	*/
	@Override
	public void setModifiedByUser(long modifiedByUser) {
		_vLegalSuggestDocument.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this v legal suggest document.
	*
	* @param modifiedDate the modified date of this v legal suggest document
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vLegalSuggestDocument.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalSuggestDocument.setNew(n);
	}

	/**
	* Sets the primary key of this v legal suggest document.
	*
	* @param primaryKey the primary key of this v legal suggest document
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vLegalSuggestDocument.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalSuggestDocument.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sug ID of this v legal suggest document.
	*
	* @param sugId the sug ID of this v legal suggest document
	*/
	@Override
	public void setSugId(java.lang.String sugId) {
		_vLegalSuggestDocument.setSugId(sugId);
	}

	/**
	* Sets the title of this v legal suggest document.
	*
	* @param title the title of this v legal suggest document
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_vLegalSuggestDocument.setTitle(title);
	}

	/**
	* Sets the user ID of this v legal suggest document.
	*
	* @param userId the user ID of this v legal suggest document
	*/
	@Override
	public void setUserId(long userId) {
		_vLegalSuggestDocument.setUserId(userId);
	}

	/**
	* Sets the user uuid of this v legal suggest document.
	*
	* @param userUuid the user uuid of this v legal suggest document
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vLegalSuggestDocument.setUserUuid(userUuid);
	}

	/**
	* Sets the visitor address of this v legal suggest document.
	*
	* @param visitorAddress the visitor address of this v legal suggest document
	*/
	@Override
	public void setVisitorAddress(java.lang.String visitorAddress) {
		_vLegalSuggestDocument.setVisitorAddress(visitorAddress);
	}

	/**
	* Sets the visitor email of this v legal suggest document.
	*
	* @param visitorEmail the visitor email of this v legal suggest document
	*/
	@Override
	public void setVisitorEmail(java.lang.String visitorEmail) {
		_vLegalSuggestDocument.setVisitorEmail(visitorEmail);
	}

	/**
	* Sets the visitor name of this v legal suggest document.
	*
	* @param visitorName the visitor name of this v legal suggest document
	*/
	@Override
	public void setVisitorName(java.lang.String visitorName) {
		_vLegalSuggestDocument.setVisitorName(visitorName);
	}

	/**
	* Sets the visitor tel of this v legal suggest document.
	*
	* @param visitorTel the visitor tel of this v legal suggest document
	*/
	@Override
	public void setVisitorTel(java.lang.String visitorTel) {
		_vLegalSuggestDocument.setVisitorTel(visitorTel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalSuggestDocumentWrapper)) {
			return false;
		}

		VLegalSuggestDocumentWrapper vLegalSuggestDocumentWrapper = (VLegalSuggestDocumentWrapper)obj;

		if (Objects.equals(_vLegalSuggestDocument,
					vLegalSuggestDocumentWrapper._vLegalSuggestDocument)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalSuggestDocument getWrappedModel() {
		return _vLegalSuggestDocument;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalSuggestDocument.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalSuggestDocument.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalSuggestDocument.resetOriginalValues();
	}

	private final VLegalSuggestDocument _vLegalSuggestDocument;
}