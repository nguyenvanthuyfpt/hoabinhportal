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
 * This class is a wrapper for {@link VLegalType}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalType
 * @generated
 */
@ProviderType
public class VLegalTypeWrapper implements VLegalType, ModelWrapper<VLegalType> {
	public VLegalTypeWrapper(VLegalType vLegalType) {
		_vLegalType = vLegalType;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalType.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("typeId", getTypeId());
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
		attributes.put("statusType", getStatusType());
		attributes.put("rssable", getRssable());
		attributes.put("position", getPosition());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String typeId = (String)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
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

		Boolean statusType = (Boolean)attributes.get("statusType");

		if (statusType != null) {
			setStatusType(statusType);
		}

		Boolean rssable = (Boolean)attributes.get("rssable");

		if (rssable != null) {
			setRssable(rssable);
		}

		Integer position = (Integer)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}
	}

	/**
	* Returns the rssable of this v legal type.
	*
	* @return the rssable of this v legal type
	*/
	@Override
	public boolean getRssable() {
		return _vLegalType.getRssable();
	}

	/**
	* Returns the status type of this v legal type.
	*
	* @return the status type of this v legal type
	*/
	@Override
	public boolean getStatusType() {
		return _vLegalType.getStatusType();
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalType.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalType.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vLegalType.isNew();
	}

	/**
	* Returns <code>true</code> if this v legal type is rssable.
	*
	* @return <code>true</code> if this v legal type is rssable; <code>false</code> otherwise
	*/
	@Override
	public boolean isRssable() {
		return _vLegalType.isRssable();
	}

	/**
	* Returns <code>true</code> if this v legal type is status type.
	*
	* @return <code>true</code> if this v legal type is status type; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatusType() {
		return _vLegalType.isStatusType();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalType.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalType> toCacheModel() {
		return _vLegalType.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VLegalType vLegalType) {
		return _vLegalType.compareTo(vLegalType);
	}

	/**
	* Returns the position of this v legal type.
	*
	* @return the position of this v legal type
	*/
	@Override
	public int getPosition() {
		return _vLegalType.getPosition();
	}

	@Override
	public int hashCode() {
		return _vLegalType.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalType.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalTypeWrapper((VLegalType)_vLegalType.clone());
	}

	/**
	* Returns the description of this v legal type.
	*
	* @return the description of this v legal type
	*/
	@Override
	public java.lang.String getDescription() {
		return _vLegalType.getDescription();
	}

	/**
	* Returns the language of this v legal type.
	*
	* @return the language of this v legal type
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vLegalType.getLanguage();
	}

	/**
	* Returns the name of this v legal type.
	*
	* @return the name of this v legal type
	*/
	@Override
	public java.lang.String getName() {
		return _vLegalType.getName();
	}

	/**
	* Returns the primary key of this v legal type.
	*
	* @return the primary key of this v legal type
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vLegalType.getPrimaryKey();
	}

	/**
	* Returns the type ID of this v legal type.
	*
	* @return the type ID of this v legal type
	*/
	@Override
	public java.lang.String getTypeId() {
		return _vLegalType.getTypeId();
	}

	/**
	* Returns the user uuid of this v legal type.
	*
	* @return the user uuid of this v legal type
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vLegalType.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalType.toXmlString();
	}

	/**
	* Returns the created date of this v legal type.
	*
	* @return the created date of this v legal type
	*/
	@Override
	public Date getCreatedDate() {
		return _vLegalType.getCreatedDate();
	}

	/**
	* Returns the modified date of this v legal type.
	*
	* @return the modified date of this v legal type
	*/
	@Override
	public Date getModifiedDate() {
		return _vLegalType.getModifiedDate();
	}

	/**
	* Returns the company ID of this v legal type.
	*
	* @return the company ID of this v legal type
	*/
	@Override
	public long getCompanyId() {
		return _vLegalType.getCompanyId();
	}

	/**
	* Returns the created by user of this v legal type.
	*
	* @return the created by user of this v legal type
	*/
	@Override
	public long getCreatedByUser() {
		return _vLegalType.getCreatedByUser();
	}

	/**
	* Returns the group ID of this v legal type.
	*
	* @return the group ID of this v legal type
	*/
	@Override
	public long getGroupId() {
		return _vLegalType.getGroupId();
	}

	/**
	* Returns the modified by user of this v legal type.
	*
	* @return the modified by user of this v legal type
	*/
	@Override
	public long getModifiedByUser() {
		return _vLegalType.getModifiedByUser();
	}

	/**
	* Returns the user ID of this v legal type.
	*
	* @return the user ID of this v legal type
	*/
	@Override
	public long getUserId() {
		return _vLegalType.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalType toEscapedModel() {
		return new VLegalTypeWrapper(_vLegalType.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalType toUnescapedModel() {
		return new VLegalTypeWrapper(_vLegalType.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vLegalType.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalType.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this v legal type.
	*
	* @param companyId the company ID of this v legal type
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vLegalType.setCompanyId(companyId);
	}

	/**
	* Sets the created by user of this v legal type.
	*
	* @param createdByUser the created by user of this v legal type
	*/
	@Override
	public void setCreatedByUser(long createdByUser) {
		_vLegalType.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this v legal type.
	*
	* @param createdDate the created date of this v legal type
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vLegalType.setCreatedDate(createdDate);
	}

	/**
	* Sets the description of this v legal type.
	*
	* @param description the description of this v legal type
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vLegalType.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalType.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this v legal type.
	*
	* @param groupId the group ID of this v legal type
	*/
	@Override
	public void setGroupId(long groupId) {
		_vLegalType.setGroupId(groupId);
	}

	/**
	* Sets the language of this v legal type.
	*
	* @param language the language of this v legal type
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vLegalType.setLanguage(language);
	}

	/**
	* Sets the modified by user of this v legal type.
	*
	* @param modifiedByUser the modified by user of this v legal type
	*/
	@Override
	public void setModifiedByUser(long modifiedByUser) {
		_vLegalType.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this v legal type.
	*
	* @param modifiedDate the modified date of this v legal type
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vLegalType.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this v legal type.
	*
	* @param name the name of this v legal type
	*/
	@Override
	public void setName(java.lang.String name) {
		_vLegalType.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalType.setNew(n);
	}

	/**
	* Sets the position of this v legal type.
	*
	* @param position the position of this v legal type
	*/
	@Override
	public void setPosition(int position) {
		_vLegalType.setPosition(position);
	}

	/**
	* Sets the primary key of this v legal type.
	*
	* @param primaryKey the primary key of this v legal type
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vLegalType.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalType.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this v legal type is rssable.
	*
	* @param rssable the rssable of this v legal type
	*/
	@Override
	public void setRssable(boolean rssable) {
		_vLegalType.setRssable(rssable);
	}

	/**
	* Sets whether this v legal type is status type.
	*
	* @param statusType the status type of this v legal type
	*/
	@Override
	public void setStatusType(boolean statusType) {
		_vLegalType.setStatusType(statusType);
	}

	/**
	* Sets the type ID of this v legal type.
	*
	* @param typeId the type ID of this v legal type
	*/
	@Override
	public void setTypeId(java.lang.String typeId) {
		_vLegalType.setTypeId(typeId);
	}

	/**
	* Sets the user ID of this v legal type.
	*
	* @param userId the user ID of this v legal type
	*/
	@Override
	public void setUserId(long userId) {
		_vLegalType.setUserId(userId);
	}

	/**
	* Sets the user uuid of this v legal type.
	*
	* @param userUuid the user uuid of this v legal type
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vLegalType.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalTypeWrapper)) {
			return false;
		}

		VLegalTypeWrapper vLegalTypeWrapper = (VLegalTypeWrapper)obj;

		if (Objects.equals(_vLegalType, vLegalTypeWrapper._vLegalType)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalType getWrappedModel() {
		return _vLegalType;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalType.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalType.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalType.resetOriginalValues();
	}

	private final VLegalType _vLegalType;
}