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
 * This class is a wrapper for {@link VcmsType}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsType
 * @generated
 */
@ProviderType
public class VcmsTypeWrapper implements VcmsType, ModelWrapper<VcmsType> {
	public VcmsTypeWrapper(VcmsType vcmsType) {
		_vcmsType = vcmsType;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsType.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("typeId", getTypeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("code", getCode());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("language", getLanguage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long typeId = (Long)attributes.get("typeId");

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

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String createdByUser = (String)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String modifiedByUser = (String)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
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
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsType.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsType.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vcmsType.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsType.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsType> toCacheModel() {
		return _vcmsType.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VcmsType vcmsType) {
		return _vcmsType.compareTo(vcmsType);
	}

	@Override
	public int hashCode() {
		return _vcmsType.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsType.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsTypeWrapper((VcmsType)_vcmsType.clone());
	}

	/**
	* Returns the code of this vcms type.
	*
	* @return the code of this vcms type
	*/
	@Override
	public java.lang.String getCode() {
		return _vcmsType.getCode();
	}

	/**
	* Returns the created by user of this vcms type.
	*
	* @return the created by user of this vcms type
	*/
	@Override
	public java.lang.String getCreatedByUser() {
		return _vcmsType.getCreatedByUser();
	}

	/**
	* Returns the description of this vcms type.
	*
	* @return the description of this vcms type
	*/
	@Override
	public java.lang.String getDescription() {
		return _vcmsType.getDescription();
	}

	/**
	* Returns the language of this vcms type.
	*
	* @return the language of this vcms type
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vcmsType.getLanguage();
	}

	/**
	* Returns the modified by user of this vcms type.
	*
	* @return the modified by user of this vcms type
	*/
	@Override
	public java.lang.String getModifiedByUser() {
		return _vcmsType.getModifiedByUser();
	}

	/**
	* Returns the name of this vcms type.
	*
	* @return the name of this vcms type
	*/
	@Override
	public java.lang.String getName() {
		return _vcmsType.getName();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsType.toXmlString();
	}

	/**
	* Returns the created date of this vcms type.
	*
	* @return the created date of this vcms type
	*/
	@Override
	public Date getCreatedDate() {
		return _vcmsType.getCreatedDate();
	}

	/**
	* Returns the modified date of this vcms type.
	*
	* @return the modified date of this vcms type
	*/
	@Override
	public Date getModifiedDate() {
		return _vcmsType.getModifiedDate();
	}

	/**
	* Returns the company ID of this vcms type.
	*
	* @return the company ID of this vcms type
	*/
	@Override
	public long getCompanyId() {
		return _vcmsType.getCompanyId();
	}

	/**
	* Returns the group ID of this vcms type.
	*
	* @return the group ID of this vcms type
	*/
	@Override
	public long getGroupId() {
		return _vcmsType.getGroupId();
	}

	/**
	* Returns the primary key of this vcms type.
	*
	* @return the primary key of this vcms type
	*/
	@Override
	public long getPrimaryKey() {
		return _vcmsType.getPrimaryKey();
	}

	/**
	* Returns the type ID of this vcms type.
	*
	* @return the type ID of this vcms type
	*/
	@Override
	public long getTypeId() {
		return _vcmsType.getTypeId();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsType toEscapedModel() {
		return new VcmsTypeWrapper(_vcmsType.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsType toUnescapedModel() {
		return new VcmsTypeWrapper(_vcmsType.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vcmsType.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsType.setCachedModel(cachedModel);
	}

	/**
	* Sets the code of this vcms type.
	*
	* @param code the code of this vcms type
	*/
	@Override
	public void setCode(java.lang.String code) {
		_vcmsType.setCode(code);
	}

	/**
	* Sets the company ID of this vcms type.
	*
	* @param companyId the company ID of this vcms type
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vcmsType.setCompanyId(companyId);
	}

	/**
	* Sets the created by user of this vcms type.
	*
	* @param createdByUser the created by user of this vcms type
	*/
	@Override
	public void setCreatedByUser(java.lang.String createdByUser) {
		_vcmsType.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this vcms type.
	*
	* @param createdDate the created date of this vcms type
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vcmsType.setCreatedDate(createdDate);
	}

	/**
	* Sets the description of this vcms type.
	*
	* @param description the description of this vcms type
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vcmsType.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsType.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this vcms type.
	*
	* @param groupId the group ID of this vcms type
	*/
	@Override
	public void setGroupId(long groupId) {
		_vcmsType.setGroupId(groupId);
	}

	/**
	* Sets the language of this vcms type.
	*
	* @param language the language of this vcms type
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vcmsType.setLanguage(language);
	}

	/**
	* Sets the modified by user of this vcms type.
	*
	* @param modifiedByUser the modified by user of this vcms type
	*/
	@Override
	public void setModifiedByUser(java.lang.String modifiedByUser) {
		_vcmsType.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this vcms type.
	*
	* @param modifiedDate the modified date of this vcms type
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vcmsType.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this vcms type.
	*
	* @param name the name of this vcms type
	*/
	@Override
	public void setName(java.lang.String name) {
		_vcmsType.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsType.setNew(n);
	}

	/**
	* Sets the primary key of this vcms type.
	*
	* @param primaryKey the primary key of this vcms type
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vcmsType.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsType.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the type ID of this vcms type.
	*
	* @param typeId the type ID of this vcms type
	*/
	@Override
	public void setTypeId(long typeId) {
		_vcmsType.setTypeId(typeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsTypeWrapper)) {
			return false;
		}

		VcmsTypeWrapper vcmsTypeWrapper = (VcmsTypeWrapper)obj;

		if (Objects.equals(_vcmsType, vcmsTypeWrapper._vcmsType)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsType getWrappedModel() {
		return _vcmsType;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsType.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsType.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsType.resetOriginalValues();
	}

	private final VcmsType _vcmsType;
}