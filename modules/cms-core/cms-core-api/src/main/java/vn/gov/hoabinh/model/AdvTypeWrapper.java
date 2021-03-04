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
 * This class is a wrapper for {@link AdvType}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvType
 * @generated
 */
@ProviderType
public class AdvTypeWrapper implements AdvType, ModelWrapper<AdvType> {
	public AdvTypeWrapper(AdvType advType) {
		_advType = advType;
	}

	@Override
	public Class<?> getModelClass() {
		return AdvType.class;
	}

	@Override
	public String getModelClassName() {
		return AdvType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("typeId", getTypeId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long typeId = (Long)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _advType.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _advType.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _advType.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _advType.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.AdvType> toCacheModel() {
		return _advType.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.AdvType advType) {
		return _advType.compareTo(advType);
	}

	@Override
	public int hashCode() {
		return _advType.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _advType.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AdvTypeWrapper((AdvType)_advType.clone());
	}

	/**
	* Returns the description of this adv type.
	*
	* @return the description of this adv type
	*/
	@Override
	public java.lang.String getDescription() {
		return _advType.getDescription();
	}

	/**
	* Returns the name of this adv type.
	*
	* @return the name of this adv type
	*/
	@Override
	public java.lang.String getName() {
		return _advType.getName();
	}

	@Override
	public java.lang.String toString() {
		return _advType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _advType.toXmlString();
	}

	/**
	* Returns the create date of this adv type.
	*
	* @return the create date of this adv type
	*/
	@Override
	public Date getCreateDate() {
		return _advType.getCreateDate();
	}

	/**
	* Returns the modified date of this adv type.
	*
	* @return the modified date of this adv type
	*/
	@Override
	public Date getModifiedDate() {
		return _advType.getModifiedDate();
	}

	/**
	* Returns the company ID of this adv type.
	*
	* @return the company ID of this adv type
	*/
	@Override
	public long getCompanyId() {
		return _advType.getCompanyId();
	}

	/**
	* Returns the group ID of this adv type.
	*
	* @return the group ID of this adv type
	*/
	@Override
	public long getGroupId() {
		return _advType.getGroupId();
	}

	/**
	* Returns the primary key of this adv type.
	*
	* @return the primary key of this adv type
	*/
	@Override
	public long getPrimaryKey() {
		return _advType.getPrimaryKey();
	}

	/**
	* Returns the type ID of this adv type.
	*
	* @return the type ID of this adv type
	*/
	@Override
	public long getTypeId() {
		return _advType.getTypeId();
	}

	@Override
	public vn.gov.hoabinh.model.AdvType toEscapedModel() {
		return new AdvTypeWrapper(_advType.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.AdvType toUnescapedModel() {
		return new AdvTypeWrapper(_advType.toUnescapedModel());
	}

	@Override
	public void persist() {
		_advType.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_advType.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this adv type.
	*
	* @param companyId the company ID of this adv type
	*/
	@Override
	public void setCompanyId(long companyId) {
		_advType.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this adv type.
	*
	* @param createDate the create date of this adv type
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_advType.setCreateDate(createDate);
	}

	/**
	* Sets the description of this adv type.
	*
	* @param description the description of this adv type
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_advType.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_advType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_advType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_advType.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this adv type.
	*
	* @param groupId the group ID of this adv type
	*/
	@Override
	public void setGroupId(long groupId) {
		_advType.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this adv type.
	*
	* @param modifiedDate the modified date of this adv type
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_advType.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this adv type.
	*
	* @param name the name of this adv type
	*/
	@Override
	public void setName(java.lang.String name) {
		_advType.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_advType.setNew(n);
	}

	/**
	* Sets the primary key of this adv type.
	*
	* @param primaryKey the primary key of this adv type
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_advType.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_advType.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the type ID of this adv type.
	*
	* @param typeId the type ID of this adv type
	*/
	@Override
	public void setTypeId(long typeId) {
		_advType.setTypeId(typeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AdvTypeWrapper)) {
			return false;
		}

		AdvTypeWrapper advTypeWrapper = (AdvTypeWrapper)obj;

		if (Objects.equals(_advType, advTypeWrapper._advType)) {
			return true;
		}

		return false;
	}

	@Override
	public AdvType getWrappedModel() {
		return _advType;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _advType.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _advType.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_advType.resetOriginalValues();
	}

	private final AdvType _advType;
}