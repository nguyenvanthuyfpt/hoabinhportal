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
 * This class is a wrapper for {@link ClipType}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ClipType
 * @generated
 */
@ProviderType
public class ClipTypeWrapper implements ClipType, ModelWrapper<ClipType> {
	public ClipTypeWrapper(ClipType clipType) {
		_clipType = clipType;
	}

	@Override
	public Class<?> getModelClass() {
		return ClipType.class;
	}

	@Override
	public String getModelClassName() {
		return ClipType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("active", getActive());
		attributes.put("language", getLanguage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String id = (String)attributes.get("id");

		if (id != null) {
			setId(id);
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

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}
	}

	/**
	* Returns the active of this clip type.
	*
	* @return the active of this clip type
	*/
	@Override
	public boolean getActive() {
		return _clipType.getActive();
	}

	/**
	* Returns <code>true</code> if this clip type is active.
	*
	* @return <code>true</code> if this clip type is active; <code>false</code> otherwise
	*/
	@Override
	public boolean isActive() {
		return _clipType.isActive();
	}

	@Override
	public boolean isCachedModel() {
		return _clipType.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _clipType.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _clipType.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _clipType.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.ClipType> toCacheModel() {
		return _clipType.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.ClipType clipType) {
		return _clipType.compareTo(clipType);
	}

	@Override
	public int hashCode() {
		return _clipType.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _clipType.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ClipTypeWrapper((ClipType)_clipType.clone());
	}

	/**
	* Returns the description of this clip type.
	*
	* @return the description of this clip type
	*/
	@Override
	public java.lang.String getDescription() {
		return _clipType.getDescription();
	}

	/**
	* Returns the ID of this clip type.
	*
	* @return the ID of this clip type
	*/
	@Override
	public java.lang.String getId() {
		return _clipType.getId();
	}

	/**
	* Returns the language of this clip type.
	*
	* @return the language of this clip type
	*/
	@Override
	public java.lang.String getLanguage() {
		return _clipType.getLanguage();
	}

	/**
	* Returns the name of this clip type.
	*
	* @return the name of this clip type
	*/
	@Override
	public java.lang.String getName() {
		return _clipType.getName();
	}

	/**
	* Returns the primary key of this clip type.
	*
	* @return the primary key of this clip type
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _clipType.getPrimaryKey();
	}

	/**
	* Returns the title of this clip type.
	*
	* @return the title of this clip type
	*/
	@Override
	public java.lang.String getTitle() {
		return _clipType.getTitle();
	}

	/**
	* Returns the user uuid of this clip type.
	*
	* @return the user uuid of this clip type
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _clipType.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _clipType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _clipType.toXmlString();
	}

	/**
	* Returns the created date of this clip type.
	*
	* @return the created date of this clip type
	*/
	@Override
	public Date getCreatedDate() {
		return _clipType.getCreatedDate();
	}

	/**
	* Returns the modified date of this clip type.
	*
	* @return the modified date of this clip type
	*/
	@Override
	public Date getModifiedDate() {
		return _clipType.getModifiedDate();
	}

	/**
	* Returns the company ID of this clip type.
	*
	* @return the company ID of this clip type
	*/
	@Override
	public long getCompanyId() {
		return _clipType.getCompanyId();
	}

	/**
	* Returns the group ID of this clip type.
	*
	* @return the group ID of this clip type
	*/
	@Override
	public long getGroupId() {
		return _clipType.getGroupId();
	}

	/**
	* Returns the user ID of this clip type.
	*
	* @return the user ID of this clip type
	*/
	@Override
	public long getUserId() {
		return _clipType.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.ClipType toEscapedModel() {
		return new ClipTypeWrapper(_clipType.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.ClipType toUnescapedModel() {
		return new ClipTypeWrapper(_clipType.toUnescapedModel());
	}

	@Override
	public void persist() {
		_clipType.persist();
	}

	/**
	* Sets whether this clip type is active.
	*
	* @param active the active of this clip type
	*/
	@Override
	public void setActive(boolean active) {
		_clipType.setActive(active);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_clipType.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this clip type.
	*
	* @param companyId the company ID of this clip type
	*/
	@Override
	public void setCompanyId(long companyId) {
		_clipType.setCompanyId(companyId);
	}

	/**
	* Sets the created date of this clip type.
	*
	* @param createdDate the created date of this clip type
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_clipType.setCreatedDate(createdDate);
	}

	/**
	* Sets the description of this clip type.
	*
	* @param description the description of this clip type
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_clipType.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_clipType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_clipType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_clipType.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this clip type.
	*
	* @param groupId the group ID of this clip type
	*/
	@Override
	public void setGroupId(long groupId) {
		_clipType.setGroupId(groupId);
	}

	/**
	* Sets the ID of this clip type.
	*
	* @param id the ID of this clip type
	*/
	@Override
	public void setId(java.lang.String id) {
		_clipType.setId(id);
	}

	/**
	* Sets the language of this clip type.
	*
	* @param language the language of this clip type
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_clipType.setLanguage(language);
	}

	/**
	* Sets the modified date of this clip type.
	*
	* @param modifiedDate the modified date of this clip type
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_clipType.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this clip type.
	*
	* @param name the name of this clip type
	*/
	@Override
	public void setName(java.lang.String name) {
		_clipType.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_clipType.setNew(n);
	}

	/**
	* Sets the primary key of this clip type.
	*
	* @param primaryKey the primary key of this clip type
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_clipType.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_clipType.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the title of this clip type.
	*
	* @param title the title of this clip type
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_clipType.setTitle(title);
	}

	/**
	* Sets the user ID of this clip type.
	*
	* @param userId the user ID of this clip type
	*/
	@Override
	public void setUserId(long userId) {
		_clipType.setUserId(userId);
	}

	/**
	* Sets the user uuid of this clip type.
	*
	* @param userUuid the user uuid of this clip type
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_clipType.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ClipTypeWrapper)) {
			return false;
		}

		ClipTypeWrapper clipTypeWrapper = (ClipTypeWrapper)obj;

		if (Objects.equals(_clipType, clipTypeWrapper._clipType)) {
			return true;
		}

		return false;
	}

	@Override
	public ClipType getWrappedModel() {
		return _clipType;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _clipType.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _clipType.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_clipType.resetOriginalValues();
	}

	private final ClipType _clipType;
}