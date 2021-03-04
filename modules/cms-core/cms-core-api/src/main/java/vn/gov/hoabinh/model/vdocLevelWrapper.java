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
 * This class is a wrapper for {@link vdocLevel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocLevel
 * @generated
 */
@ProviderType
public class vdocLevelWrapper implements vdocLevel, ModelWrapper<vdocLevel> {
	public vdocLevelWrapper(vdocLevel vdocLevel) {
		_vdocLevel = vdocLevel;
	}

	@Override
	public Class<?> getModelClass() {
		return vdocLevel.class;
	}

	@Override
	public String getModelClassName() {
		return vdocLevel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("levelId", getLevelId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("language", getLanguage());
		attributes.put("position", getPosition());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String levelId = (String)attributes.get("levelId");

		if (levelId != null) {
			setLevelId(levelId);
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

		Integer position = (Integer)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vdocLevel.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vdocLevel.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vdocLevel.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vdocLevel.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.vdocLevel> toCacheModel() {
		return _vdocLevel.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.vdocLevel vdocLevel) {
		return _vdocLevel.compareTo(vdocLevel);
	}

	/**
	* Returns the position of this vdoc level.
	*
	* @return the position of this vdoc level
	*/
	@Override
	public int getPosition() {
		return _vdocLevel.getPosition();
	}

	@Override
	public int hashCode() {
		return _vdocLevel.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vdocLevel.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new vdocLevelWrapper((vdocLevel)_vdocLevel.clone());
	}

	/**
	* Returns the description of this vdoc level.
	*
	* @return the description of this vdoc level
	*/
	@Override
	public java.lang.String getDescription() {
		return _vdocLevel.getDescription();
	}

	/**
	* Returns the language of this vdoc level.
	*
	* @return the language of this vdoc level
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vdocLevel.getLanguage();
	}

	/**
	* Returns the level ID of this vdoc level.
	*
	* @return the level ID of this vdoc level
	*/
	@Override
	public java.lang.String getLevelId() {
		return _vdocLevel.getLevelId();
	}

	/**
	* Returns the name of this vdoc level.
	*
	* @return the name of this vdoc level
	*/
	@Override
	public java.lang.String getName() {
		return _vdocLevel.getName();
	}

	/**
	* Returns the primary key of this vdoc level.
	*
	* @return the primary key of this vdoc level
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vdocLevel.getPrimaryKey();
	}

	/**
	* Returns the user uuid of this vdoc level.
	*
	* @return the user uuid of this vdoc level
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vdocLevel.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vdocLevel.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vdocLevel.toXmlString();
	}

	/**
	* Returns the created date of this vdoc level.
	*
	* @return the created date of this vdoc level
	*/
	@Override
	public Date getCreatedDate() {
		return _vdocLevel.getCreatedDate();
	}

	/**
	* Returns the modified date of this vdoc level.
	*
	* @return the modified date of this vdoc level
	*/
	@Override
	public Date getModifiedDate() {
		return _vdocLevel.getModifiedDate();
	}

	/**
	* Returns the company ID of this vdoc level.
	*
	* @return the company ID of this vdoc level
	*/
	@Override
	public long getCompanyId() {
		return _vdocLevel.getCompanyId();
	}

	/**
	* Returns the group ID of this vdoc level.
	*
	* @return the group ID of this vdoc level
	*/
	@Override
	public long getGroupId() {
		return _vdocLevel.getGroupId();
	}

	/**
	* Returns the user ID of this vdoc level.
	*
	* @return the user ID of this vdoc level
	*/
	@Override
	public long getUserId() {
		return _vdocLevel.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.vdocLevel toEscapedModel() {
		return new vdocLevelWrapper(_vdocLevel.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.vdocLevel toUnescapedModel() {
		return new vdocLevelWrapper(_vdocLevel.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vdocLevel.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vdocLevel.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this vdoc level.
	*
	* @param companyId the company ID of this vdoc level
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vdocLevel.setCompanyId(companyId);
	}

	/**
	* Sets the created date of this vdoc level.
	*
	* @param createdDate the created date of this vdoc level
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vdocLevel.setCreatedDate(createdDate);
	}

	/**
	* Sets the description of this vdoc level.
	*
	* @param description the description of this vdoc level
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vdocLevel.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vdocLevel.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vdocLevel.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vdocLevel.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this vdoc level.
	*
	* @param groupId the group ID of this vdoc level
	*/
	@Override
	public void setGroupId(long groupId) {
		_vdocLevel.setGroupId(groupId);
	}

	/**
	* Sets the language of this vdoc level.
	*
	* @param language the language of this vdoc level
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vdocLevel.setLanguage(language);
	}

	/**
	* Sets the level ID of this vdoc level.
	*
	* @param levelId the level ID of this vdoc level
	*/
	@Override
	public void setLevelId(java.lang.String levelId) {
		_vdocLevel.setLevelId(levelId);
	}

	/**
	* Sets the modified date of this vdoc level.
	*
	* @param modifiedDate the modified date of this vdoc level
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vdocLevel.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this vdoc level.
	*
	* @param name the name of this vdoc level
	*/
	@Override
	public void setName(java.lang.String name) {
		_vdocLevel.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_vdocLevel.setNew(n);
	}

	/**
	* Sets the position of this vdoc level.
	*
	* @param position the position of this vdoc level
	*/
	@Override
	public void setPosition(int position) {
		_vdocLevel.setPosition(position);
	}

	/**
	* Sets the primary key of this vdoc level.
	*
	* @param primaryKey the primary key of this vdoc level
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vdocLevel.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vdocLevel.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this vdoc level.
	*
	* @param userId the user ID of this vdoc level
	*/
	@Override
	public void setUserId(long userId) {
		_vdocLevel.setUserId(userId);
	}

	/**
	* Sets the user uuid of this vdoc level.
	*
	* @param userUuid the user uuid of this vdoc level
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vdocLevel.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof vdocLevelWrapper)) {
			return false;
		}

		vdocLevelWrapper vdocLevelWrapper = (vdocLevelWrapper)obj;

		if (Objects.equals(_vdocLevel, vdocLevelWrapper._vdocLevel)) {
			return true;
		}

		return false;
	}

	@Override
	public vdocLevel getWrappedModel() {
		return _vdocLevel;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vdocLevel.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vdocLevel.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vdocLevel.resetOriginalValues();
	}

	private final vdocLevel _vdocLevel;
}