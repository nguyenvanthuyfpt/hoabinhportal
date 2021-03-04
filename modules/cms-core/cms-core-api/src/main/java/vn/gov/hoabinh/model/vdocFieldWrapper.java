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
 * This class is a wrapper for {@link vdocField}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocField
 * @generated
 */
@ProviderType
public class vdocFieldWrapper implements vdocField, ModelWrapper<vdocField> {
	public vdocFieldWrapper(vdocField vdocField) {
		_vdocField = vdocField;
	}

	@Override
	public Class<?> getModelClass() {
		return vdocField.class;
	}

	@Override
	public String getModelClassName() {
		return vdocField.class.getName();
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
		attributes.put("parentId", getParentId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("language", getLanguage());
		attributes.put("statusField", getStatusField());
		attributes.put("position", getPosition());
		attributes.put("listparent", getListparent());
		attributes.put("levels", getLevels());

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

		String parentId = (String)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
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

		Integer position = (Integer)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String listparent = (String)attributes.get("listparent");

		if (listparent != null) {
			setListparent(listparent);
		}

		String levels = (String)attributes.get("levels");

		if (levels != null) {
			setLevels(levels);
		}
	}

	/**
	* Returns the status field of this vdoc field.
	*
	* @return the status field of this vdoc field
	*/
	@Override
	public boolean getStatusField() {
		return _vdocField.getStatusField();
	}

	@Override
	public boolean isCachedModel() {
		return _vdocField.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vdocField.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vdocField.isNew();
	}

	/**
	* Returns <code>true</code> if this vdoc field is status field.
	*
	* @return <code>true</code> if this vdoc field is status field; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatusField() {
		return _vdocField.isStatusField();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vdocField.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.vdocField> toCacheModel() {
		return _vdocField.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.vdocField vdocField) {
		return _vdocField.compareTo(vdocField);
	}

	/**
	* Returns the position of this vdoc field.
	*
	* @return the position of this vdoc field
	*/
	@Override
	public int getPosition() {
		return _vdocField.getPosition();
	}

	@Override
	public int hashCode() {
		return _vdocField.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vdocField.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new vdocFieldWrapper((vdocField)_vdocField.clone());
	}

	/**
	* Returns the description of this vdoc field.
	*
	* @return the description of this vdoc field
	*/
	@Override
	public java.lang.String getDescription() {
		return _vdocField.getDescription();
	}

	/**
	* Returns the field ID of this vdoc field.
	*
	* @return the field ID of this vdoc field
	*/
	@Override
	public java.lang.String getFieldId() {
		return _vdocField.getFieldId();
	}

	/**
	* Returns the language of this vdoc field.
	*
	* @return the language of this vdoc field
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vdocField.getLanguage();
	}

	/**
	* Returns the levels of this vdoc field.
	*
	* @return the levels of this vdoc field
	*/
	@Override
	public java.lang.String getLevels() {
		return _vdocField.getLevels();
	}

	/**
	* Returns the listparent of this vdoc field.
	*
	* @return the listparent of this vdoc field
	*/
	@Override
	public java.lang.String getListparent() {
		return _vdocField.getListparent();
	}

	/**
	* Returns the name of this vdoc field.
	*
	* @return the name of this vdoc field
	*/
	@Override
	public java.lang.String getName() {
		return _vdocField.getName();
	}

	/**
	* Returns the parent ID of this vdoc field.
	*
	* @return the parent ID of this vdoc field
	*/
	@Override
	public java.lang.String getParentId() {
		return _vdocField.getParentId();
	}

	/**
	* Returns the primary key of this vdoc field.
	*
	* @return the primary key of this vdoc field
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vdocField.getPrimaryKey();
	}

	/**
	* Returns the user uuid of this vdoc field.
	*
	* @return the user uuid of this vdoc field
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vdocField.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vdocField.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vdocField.toXmlString();
	}

	/**
	* Returns the created date of this vdoc field.
	*
	* @return the created date of this vdoc field
	*/
	@Override
	public Date getCreatedDate() {
		return _vdocField.getCreatedDate();
	}

	/**
	* Returns the modified date of this vdoc field.
	*
	* @return the modified date of this vdoc field
	*/
	@Override
	public Date getModifiedDate() {
		return _vdocField.getModifiedDate();
	}

	/**
	* Returns the company ID of this vdoc field.
	*
	* @return the company ID of this vdoc field
	*/
	@Override
	public long getCompanyId() {
		return _vdocField.getCompanyId();
	}

	/**
	* Returns the created by user of this vdoc field.
	*
	* @return the created by user of this vdoc field
	*/
	@Override
	public long getCreatedByUser() {
		return _vdocField.getCreatedByUser();
	}

	/**
	* Returns the group ID of this vdoc field.
	*
	* @return the group ID of this vdoc field
	*/
	@Override
	public long getGroupId() {
		return _vdocField.getGroupId();
	}

	/**
	* Returns the modified by user of this vdoc field.
	*
	* @return the modified by user of this vdoc field
	*/
	@Override
	public long getModifiedByUser() {
		return _vdocField.getModifiedByUser();
	}

	/**
	* Returns the user ID of this vdoc field.
	*
	* @return the user ID of this vdoc field
	*/
	@Override
	public long getUserId() {
		return _vdocField.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.vdocField toEscapedModel() {
		return new vdocFieldWrapper(_vdocField.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.vdocField toUnescapedModel() {
		return new vdocFieldWrapper(_vdocField.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vdocField.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vdocField.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this vdoc field.
	*
	* @param companyId the company ID of this vdoc field
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vdocField.setCompanyId(companyId);
	}

	/**
	* Sets the created by user of this vdoc field.
	*
	* @param createdByUser the created by user of this vdoc field
	*/
	@Override
	public void setCreatedByUser(long createdByUser) {
		_vdocField.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this vdoc field.
	*
	* @param createdDate the created date of this vdoc field
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vdocField.setCreatedDate(createdDate);
	}

	/**
	* Sets the description of this vdoc field.
	*
	* @param description the description of this vdoc field
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vdocField.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vdocField.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vdocField.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vdocField.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field ID of this vdoc field.
	*
	* @param fieldId the field ID of this vdoc field
	*/
	@Override
	public void setFieldId(java.lang.String fieldId) {
		_vdocField.setFieldId(fieldId);
	}

	/**
	* Sets the group ID of this vdoc field.
	*
	* @param groupId the group ID of this vdoc field
	*/
	@Override
	public void setGroupId(long groupId) {
		_vdocField.setGroupId(groupId);
	}

	/**
	* Sets the language of this vdoc field.
	*
	* @param language the language of this vdoc field
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vdocField.setLanguage(language);
	}

	/**
	* Sets the levels of this vdoc field.
	*
	* @param levels the levels of this vdoc field
	*/
	@Override
	public void setLevels(java.lang.String levels) {
		_vdocField.setLevels(levels);
	}

	/**
	* Sets the listparent of this vdoc field.
	*
	* @param listparent the listparent of this vdoc field
	*/
	@Override
	public void setListparent(java.lang.String listparent) {
		_vdocField.setListparent(listparent);
	}

	/**
	* Sets the modified by user of this vdoc field.
	*
	* @param modifiedByUser the modified by user of this vdoc field
	*/
	@Override
	public void setModifiedByUser(long modifiedByUser) {
		_vdocField.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this vdoc field.
	*
	* @param modifiedDate the modified date of this vdoc field
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vdocField.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this vdoc field.
	*
	* @param name the name of this vdoc field
	*/
	@Override
	public void setName(java.lang.String name) {
		_vdocField.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_vdocField.setNew(n);
	}

	/**
	* Sets the parent ID of this vdoc field.
	*
	* @param parentId the parent ID of this vdoc field
	*/
	@Override
	public void setParentId(java.lang.String parentId) {
		_vdocField.setParentId(parentId);
	}

	/**
	* Sets the position of this vdoc field.
	*
	* @param position the position of this vdoc field
	*/
	@Override
	public void setPosition(int position) {
		_vdocField.setPosition(position);
	}

	/**
	* Sets the primary key of this vdoc field.
	*
	* @param primaryKey the primary key of this vdoc field
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vdocField.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vdocField.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this vdoc field is status field.
	*
	* @param statusField the status field of this vdoc field
	*/
	@Override
	public void setStatusField(boolean statusField) {
		_vdocField.setStatusField(statusField);
	}

	/**
	* Sets the user ID of this vdoc field.
	*
	* @param userId the user ID of this vdoc field
	*/
	@Override
	public void setUserId(long userId) {
		_vdocField.setUserId(userId);
	}

	/**
	* Sets the user uuid of this vdoc field.
	*
	* @param userUuid the user uuid of this vdoc field
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vdocField.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof vdocFieldWrapper)) {
			return false;
		}

		vdocFieldWrapper vdocFieldWrapper = (vdocFieldWrapper)obj;

		if (Objects.equals(_vdocField, vdocFieldWrapper._vdocField)) {
			return true;
		}

		return false;
	}

	@Override
	public vdocField getWrappedModel() {
		return _vdocField;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vdocField.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vdocField.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vdocField.resetOriginalValues();
	}

	private final vdocField _vdocField;
}