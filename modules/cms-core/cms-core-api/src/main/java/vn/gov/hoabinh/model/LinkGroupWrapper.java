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
 * This class is a wrapper for {@link LinkGroup}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LinkGroup
 * @generated
 */
@ProviderType
public class LinkGroupWrapper implements LinkGroup, ModelWrapper<LinkGroup> {
	public LinkGroupWrapper(LinkGroup linkGroup) {
		_linkGroup = linkGroup;
	}

	@Override
	public Class<?> getModelClass() {
		return LinkGroup.class;
	}

	@Override
	public String getModelClassName() {
		return LinkGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("linkgroupId", getLinkgroupId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("position", getPosition());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long linkgroupId = (Long)attributes.get("linkgroupId");

		if (linkgroupId != null) {
			setLinkgroupId(linkgroupId);
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

		Integer position = (Integer)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _linkGroup.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _linkGroup.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _linkGroup.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _linkGroup.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.LinkGroup> toCacheModel() {
		return _linkGroup.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.LinkGroup linkGroup) {
		return _linkGroup.compareTo(linkGroup);
	}

	/**
	* Returns the position of this link group.
	*
	* @return the position of this link group
	*/
	@Override
	public int getPosition() {
		return _linkGroup.getPosition();
	}

	@Override
	public int hashCode() {
		return _linkGroup.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _linkGroup.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new LinkGroupWrapper((LinkGroup)_linkGroup.clone());
	}

	/**
	* Returns the description of this link group.
	*
	* @return the description of this link group
	*/
	@Override
	public java.lang.String getDescription() {
		return _linkGroup.getDescription();
	}

	/**
	* Returns the name of this link group.
	*
	* @return the name of this link group
	*/
	@Override
	public java.lang.String getName() {
		return _linkGroup.getName();
	}

	@Override
	public java.lang.String toString() {
		return _linkGroup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _linkGroup.toXmlString();
	}

	/**
	* Returns the created date of this link group.
	*
	* @return the created date of this link group
	*/
	@Override
	public Date getCreatedDate() {
		return _linkGroup.getCreatedDate();
	}

	/**
	* Returns the modified date of this link group.
	*
	* @return the modified date of this link group
	*/
	@Override
	public Date getModifiedDate() {
		return _linkGroup.getModifiedDate();
	}

	/**
	* Returns the company ID of this link group.
	*
	* @return the company ID of this link group
	*/
	@Override
	public long getCompanyId() {
		return _linkGroup.getCompanyId();
	}

	/**
	* Returns the group ID of this link group.
	*
	* @return the group ID of this link group
	*/
	@Override
	public long getGroupId() {
		return _linkGroup.getGroupId();
	}

	/**
	* Returns the linkgroup ID of this link group.
	*
	* @return the linkgroup ID of this link group
	*/
	@Override
	public long getLinkgroupId() {
		return _linkGroup.getLinkgroupId();
	}

	/**
	* Returns the primary key of this link group.
	*
	* @return the primary key of this link group
	*/
	@Override
	public long getPrimaryKey() {
		return _linkGroup.getPrimaryKey();
	}

	@Override
	public vn.gov.hoabinh.model.LinkGroup toEscapedModel() {
		return new LinkGroupWrapper(_linkGroup.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.LinkGroup toUnescapedModel() {
		return new LinkGroupWrapper(_linkGroup.toUnescapedModel());
	}

	@Override
	public void persist() {
		_linkGroup.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_linkGroup.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this link group.
	*
	* @param companyId the company ID of this link group
	*/
	@Override
	public void setCompanyId(long companyId) {
		_linkGroup.setCompanyId(companyId);
	}

	/**
	* Sets the created date of this link group.
	*
	* @param createdDate the created date of this link group
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_linkGroup.setCreatedDate(createdDate);
	}

	/**
	* Sets the description of this link group.
	*
	* @param description the description of this link group
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_linkGroup.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_linkGroup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_linkGroup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_linkGroup.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this link group.
	*
	* @param groupId the group ID of this link group
	*/
	@Override
	public void setGroupId(long groupId) {
		_linkGroup.setGroupId(groupId);
	}

	/**
	* Sets the linkgroup ID of this link group.
	*
	* @param linkgroupId the linkgroup ID of this link group
	*/
	@Override
	public void setLinkgroupId(long linkgroupId) {
		_linkGroup.setLinkgroupId(linkgroupId);
	}

	/**
	* Sets the modified date of this link group.
	*
	* @param modifiedDate the modified date of this link group
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_linkGroup.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this link group.
	*
	* @param name the name of this link group
	*/
	@Override
	public void setName(java.lang.String name) {
		_linkGroup.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_linkGroup.setNew(n);
	}

	/**
	* Sets the position of this link group.
	*
	* @param position the position of this link group
	*/
	@Override
	public void setPosition(int position) {
		_linkGroup.setPosition(position);
	}

	/**
	* Sets the primary key of this link group.
	*
	* @param primaryKey the primary key of this link group
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_linkGroup.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_linkGroup.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LinkGroupWrapper)) {
			return false;
		}

		LinkGroupWrapper linkGroupWrapper = (LinkGroupWrapper)obj;

		if (Objects.equals(_linkGroup, linkGroupWrapper._linkGroup)) {
			return true;
		}

		return false;
	}

	@Override
	public LinkGroup getWrappedModel() {
		return _linkGroup;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _linkGroup.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _linkGroup.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_linkGroup.resetOriginalValues();
	}

	private final LinkGroup _linkGroup;
}