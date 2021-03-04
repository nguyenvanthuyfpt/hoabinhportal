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
 * This class is a wrapper for {@link VLegalTags}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTags
 * @generated
 */
@ProviderType
public class VLegalTagsWrapper implements VLegalTags, ModelWrapper<VLegalTags> {
	public VLegalTagsWrapper(VLegalTags vLegalTags) {
		_vLegalTags = vLegalTags;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalTags.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalTags.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tagId", getTagId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("statusTags", getStatusTags());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String tagId = (String)attributes.get("tagId");

		if (tagId != null) {
			setTagId(tagId);
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

		Boolean statusTags = (Boolean)attributes.get("statusTags");

		if (statusTags != null) {
			setStatusTags(statusTags);
		}
	}

	/**
	* Returns the status tags of this v legal tags.
	*
	* @return the status tags of this v legal tags
	*/
	@Override
	public boolean getStatusTags() {
		return _vLegalTags.getStatusTags();
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalTags.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalTags.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vLegalTags.isNew();
	}

	/**
	* Returns <code>true</code> if this v legal tags is status tags.
	*
	* @return <code>true</code> if this v legal tags is status tags; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatusTags() {
		return _vLegalTags.isStatusTags();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalTags.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalTags> toCacheModel() {
		return _vLegalTags.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VLegalTags vLegalTags) {
		return _vLegalTags.compareTo(vLegalTags);
	}

	@Override
	public int hashCode() {
		return _vLegalTags.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalTags.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalTagsWrapper((VLegalTags)_vLegalTags.clone());
	}

	/**
	* Returns the name of this v legal tags.
	*
	* @return the name of this v legal tags
	*/
	@Override
	public java.lang.String getName() {
		return _vLegalTags.getName();
	}

	/**
	* Returns the primary key of this v legal tags.
	*
	* @return the primary key of this v legal tags
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vLegalTags.getPrimaryKey();
	}

	/**
	* Returns the tag ID of this v legal tags.
	*
	* @return the tag ID of this v legal tags
	*/
	@Override
	public java.lang.String getTagId() {
		return _vLegalTags.getTagId();
	}

	/**
	* Returns the user uuid of this v legal tags.
	*
	* @return the user uuid of this v legal tags
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vLegalTags.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalTags.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalTags.toXmlString();
	}

	/**
	* Returns the created date of this v legal tags.
	*
	* @return the created date of this v legal tags
	*/
	@Override
	public Date getCreatedDate() {
		return _vLegalTags.getCreatedDate();
	}

	/**
	* Returns the modified date of this v legal tags.
	*
	* @return the modified date of this v legal tags
	*/
	@Override
	public Date getModifiedDate() {
		return _vLegalTags.getModifiedDate();
	}

	/**
	* Returns the company ID of this v legal tags.
	*
	* @return the company ID of this v legal tags
	*/
	@Override
	public long getCompanyId() {
		return _vLegalTags.getCompanyId();
	}

	/**
	* Returns the group ID of this v legal tags.
	*
	* @return the group ID of this v legal tags
	*/
	@Override
	public long getGroupId() {
		return _vLegalTags.getGroupId();
	}

	/**
	* Returns the user ID of this v legal tags.
	*
	* @return the user ID of this v legal tags
	*/
	@Override
	public long getUserId() {
		return _vLegalTags.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalTags toEscapedModel() {
		return new VLegalTagsWrapper(_vLegalTags.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalTags toUnescapedModel() {
		return new VLegalTagsWrapper(_vLegalTags.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vLegalTags.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalTags.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this v legal tags.
	*
	* @param companyId the company ID of this v legal tags
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vLegalTags.setCompanyId(companyId);
	}

	/**
	* Sets the created date of this v legal tags.
	*
	* @param createdDate the created date of this v legal tags
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vLegalTags.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalTags.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalTags.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalTags.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this v legal tags.
	*
	* @param groupId the group ID of this v legal tags
	*/
	@Override
	public void setGroupId(long groupId) {
		_vLegalTags.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this v legal tags.
	*
	* @param modifiedDate the modified date of this v legal tags
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vLegalTags.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this v legal tags.
	*
	* @param name the name of this v legal tags
	*/
	@Override
	public void setName(java.lang.String name) {
		_vLegalTags.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalTags.setNew(n);
	}

	/**
	* Sets the primary key of this v legal tags.
	*
	* @param primaryKey the primary key of this v legal tags
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vLegalTags.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalTags.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this v legal tags is status tags.
	*
	* @param statusTags the status tags of this v legal tags
	*/
	@Override
	public void setStatusTags(boolean statusTags) {
		_vLegalTags.setStatusTags(statusTags);
	}

	/**
	* Sets the tag ID of this v legal tags.
	*
	* @param tagId the tag ID of this v legal tags
	*/
	@Override
	public void setTagId(java.lang.String tagId) {
		_vLegalTags.setTagId(tagId);
	}

	/**
	* Sets the user ID of this v legal tags.
	*
	* @param userId the user ID of this v legal tags
	*/
	@Override
	public void setUserId(long userId) {
		_vLegalTags.setUserId(userId);
	}

	/**
	* Sets the user uuid of this v legal tags.
	*
	* @param userUuid the user uuid of this v legal tags
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vLegalTags.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalTagsWrapper)) {
			return false;
		}

		VLegalTagsWrapper vLegalTagsWrapper = (VLegalTagsWrapper)obj;

		if (Objects.equals(_vLegalTags, vLegalTagsWrapper._vLegalTags)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalTags getWrappedModel() {
		return _vLegalTags;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalTags.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalTags.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalTags.resetOriginalValues();
	}

	private final VLegalTags _vLegalTags;
}