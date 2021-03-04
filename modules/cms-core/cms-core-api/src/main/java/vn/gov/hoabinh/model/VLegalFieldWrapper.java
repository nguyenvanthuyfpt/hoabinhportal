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
 * This class is a wrapper for {@link VLegalField}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalField
 * @generated
 */
@ProviderType
public class VLegalFieldWrapper implements VLegalField,
	ModelWrapper<VLegalField> {
	public VLegalFieldWrapper(VLegalField vLegalField) {
		_vLegalField = vLegalField;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalField.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalField.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fieldId", getFieldId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("language", getLanguage());
		attributes.put("statusField", getStatusField());
		attributes.put("rssable", getRssable());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String fieldId = (String)attributes.get("fieldId");

		if (fieldId != null) {
			setFieldId(fieldId);
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

		Long createdByUser = (Long)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Long modifiedByUser = (Long)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Boolean statusField = (Boolean)attributes.get("statusField");

		if (statusField != null) {
			setStatusField(statusField);
		}

		Boolean rssable = (Boolean)attributes.get("rssable");

		if (rssable != null) {
			setRssable(rssable);
		}
	}

	/**
	* Returns the rssable of this v legal field.
	*
	* @return the rssable of this v legal field
	*/
	@Override
	public boolean getRssable() {
		return _vLegalField.getRssable();
	}

	/**
	* Returns the status field of this v legal field.
	*
	* @return the status field of this v legal field
	*/
	@Override
	public boolean getStatusField() {
		return _vLegalField.getStatusField();
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalField.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalField.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vLegalField.isNew();
	}

	/**
	* Returns <code>true</code> if this v legal field is rssable.
	*
	* @return <code>true</code> if this v legal field is rssable; <code>false</code> otherwise
	*/
	@Override
	public boolean isRssable() {
		return _vLegalField.isRssable();
	}

	/**
	* Returns <code>true</code> if this v legal field is status field.
	*
	* @return <code>true</code> if this v legal field is status field; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatusField() {
		return _vLegalField.isStatusField();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalField.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalField> toCacheModel() {
		return _vLegalField.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VLegalField vLegalField) {
		return _vLegalField.compareTo(vLegalField);
	}

	@Override
	public int hashCode() {
		return _vLegalField.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalField.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalFieldWrapper((VLegalField)_vLegalField.clone());
	}

	/**
	* Returns the description of this v legal field.
	*
	* @return the description of this v legal field
	*/
	@Override
	public java.lang.String getDescription() {
		return _vLegalField.getDescription();
	}

	/**
	* Returns the field ID of this v legal field.
	*
	* @return the field ID of this v legal field
	*/
	@Override
	public java.lang.String getFieldId() {
		return _vLegalField.getFieldId();
	}

	/**
	* Returns the language of this v legal field.
	*
	* @return the language of this v legal field
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vLegalField.getLanguage();
	}

	/**
	* Returns the name of this v legal field.
	*
	* @return the name of this v legal field
	*/
	@Override
	public java.lang.String getName() {
		return _vLegalField.getName();
	}

	/**
	* Returns the primary key of this v legal field.
	*
	* @return the primary key of this v legal field
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vLegalField.getPrimaryKey();
	}

	/**
	* Returns the user uuid of this v legal field.
	*
	* @return the user uuid of this v legal field
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vLegalField.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalField.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalField.toXmlString();
	}

	/**
	* Returns the created date of this v legal field.
	*
	* @return the created date of this v legal field
	*/
	@Override
	public Date getCreatedDate() {
		return _vLegalField.getCreatedDate();
	}

	/**
	* Returns the modified date of this v legal field.
	*
	* @return the modified date of this v legal field
	*/
	@Override
	public Date getModifiedDate() {
		return _vLegalField.getModifiedDate();
	}

	/**
	* Returns the company ID of this v legal field.
	*
	* @return the company ID of this v legal field
	*/
	@Override
	public long getCompanyId() {
		return _vLegalField.getCompanyId();
	}

	/**
	* Returns the created by user of this v legal field.
	*
	* @return the created by user of this v legal field
	*/
	@Override
	public long getCreatedByUser() {
		return _vLegalField.getCreatedByUser();
	}

	/**
	* Returns the group ID of this v legal field.
	*
	* @return the group ID of this v legal field
	*/
	@Override
	public long getGroupId() {
		return _vLegalField.getGroupId();
	}

	/**
	* Returns the modified by user of this v legal field.
	*
	* @return the modified by user of this v legal field
	*/
	@Override
	public long getModifiedByUser() {
		return _vLegalField.getModifiedByUser();
	}

	/**
	* Returns the user ID of this v legal field.
	*
	* @return the user ID of this v legal field
	*/
	@Override
	public long getUserId() {
		return _vLegalField.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalField toEscapedModel() {
		return new VLegalFieldWrapper(_vLegalField.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalField toUnescapedModel() {
		return new VLegalFieldWrapper(_vLegalField.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vLegalField.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalField.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this v legal field.
	*
	* @param companyId the company ID of this v legal field
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vLegalField.setCompanyId(companyId);
	}

	/**
	* Sets the created by user of this v legal field.
	*
	* @param createdByUser the created by user of this v legal field
	*/
	@Override
	public void setCreatedByUser(long createdByUser) {
		_vLegalField.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this v legal field.
	*
	* @param createdDate the created date of this v legal field
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vLegalField.setCreatedDate(createdDate);
	}

	/**
	* Sets the description of this v legal field.
	*
	* @param description the description of this v legal field
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vLegalField.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalField.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalField.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalField.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field ID of this v legal field.
	*
	* @param fieldId the field ID of this v legal field
	*/
	@Override
	public void setFieldId(java.lang.String fieldId) {
		_vLegalField.setFieldId(fieldId);
	}

	/**
	* Sets the group ID of this v legal field.
	*
	* @param groupId the group ID of this v legal field
	*/
	@Override
	public void setGroupId(long groupId) {
		_vLegalField.setGroupId(groupId);
	}

	/**
	* Sets the language of this v legal field.
	*
	* @param language the language of this v legal field
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vLegalField.setLanguage(language);
	}

	/**
	* Sets the modified by user of this v legal field.
	*
	* @param modifiedByUser the modified by user of this v legal field
	*/
	@Override
	public void setModifiedByUser(long modifiedByUser) {
		_vLegalField.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this v legal field.
	*
	* @param modifiedDate the modified date of this v legal field
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vLegalField.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this v legal field.
	*
	* @param name the name of this v legal field
	*/
	@Override
	public void setName(java.lang.String name) {
		_vLegalField.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalField.setNew(n);
	}

	/**
	* Sets the primary key of this v legal field.
	*
	* @param primaryKey the primary key of this v legal field
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vLegalField.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalField.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this v legal field is rssable.
	*
	* @param rssable the rssable of this v legal field
	*/
	@Override
	public void setRssable(boolean rssable) {
		_vLegalField.setRssable(rssable);
	}

	/**
	* Sets whether this v legal field is status field.
	*
	* @param statusField the status field of this v legal field
	*/
	@Override
	public void setStatusField(boolean statusField) {
		_vLegalField.setStatusField(statusField);
	}

	/**
	* Sets the user ID of this v legal field.
	*
	* @param userId the user ID of this v legal field
	*/
	@Override
	public void setUserId(long userId) {
		_vLegalField.setUserId(userId);
	}

	/**
	* Sets the user uuid of this v legal field.
	*
	* @param userUuid the user uuid of this v legal field
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vLegalField.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalFieldWrapper)) {
			return false;
		}

		VLegalFieldWrapper vLegalFieldWrapper = (VLegalFieldWrapper)obj;

		if (Objects.equals(_vLegalField, vLegalFieldWrapper._vLegalField)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalField getWrappedModel() {
		return _vLegalField;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalField.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalField.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalField.resetOriginalValues();
	}

	private final VLegalField _vLegalField;
}