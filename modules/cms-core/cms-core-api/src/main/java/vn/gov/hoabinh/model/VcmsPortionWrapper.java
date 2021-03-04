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
 * This class is a wrapper for {@link VcmsPortion}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsPortion
 * @generated
 */
@ProviderType
public class VcmsPortionWrapper implements VcmsPortion,
	ModelWrapper<VcmsPortion> {
	public VcmsPortionWrapper(VcmsPortion vcmsPortion) {
		_vcmsPortion = vcmsPortion;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsPortion.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsPortion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("portionId", getPortionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("code", getCode());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("categorizable", getCategorizable());
		attributes.put("language", getLanguage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String portionId = (String)attributes.get("portionId");

		if (portionId != null) {
			setPortionId(portionId);
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

		Boolean categorizable = (Boolean)attributes.get("categorizable");

		if (categorizable != null) {
			setCategorizable(categorizable);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}
	}

	/**
	* Returns the categorizable of this vcms portion.
	*
	* @return the categorizable of this vcms portion
	*/
	@Override
	public boolean getCategorizable() {
		return _vcmsPortion.getCategorizable();
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsPortion.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this vcms portion is categorizable.
	*
	* @return <code>true</code> if this vcms portion is categorizable; <code>false</code> otherwise
	*/
	@Override
	public boolean isCategorizable() {
		return _vcmsPortion.isCategorizable();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsPortion.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vcmsPortion.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsPortion.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsPortion> toCacheModel() {
		return _vcmsPortion.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VcmsPortion vcmsPortion) {
		return _vcmsPortion.compareTo(vcmsPortion);
	}

	@Override
	public int hashCode() {
		return _vcmsPortion.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsPortion.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsPortionWrapper((VcmsPortion)_vcmsPortion.clone());
	}

	/**
	* Returns the code of this vcms portion.
	*
	* @return the code of this vcms portion
	*/
	@Override
	public java.lang.String getCode() {
		return _vcmsPortion.getCode();
	}

	/**
	* Returns the created by user of this vcms portion.
	*
	* @return the created by user of this vcms portion
	*/
	@Override
	public java.lang.String getCreatedByUser() {
		return _vcmsPortion.getCreatedByUser();
	}

	/**
	* Returns the description of this vcms portion.
	*
	* @return the description of this vcms portion
	*/
	@Override
	public java.lang.String getDescription() {
		return _vcmsPortion.getDescription();
	}

	/**
	* Returns the language of this vcms portion.
	*
	* @return the language of this vcms portion
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vcmsPortion.getLanguage();
	}

	/**
	* Returns the modified by user of this vcms portion.
	*
	* @return the modified by user of this vcms portion
	*/
	@Override
	public java.lang.String getModifiedByUser() {
		return _vcmsPortion.getModifiedByUser();
	}

	/**
	* Returns the name of this vcms portion.
	*
	* @return the name of this vcms portion
	*/
	@Override
	public java.lang.String getName() {
		return _vcmsPortion.getName();
	}

	/**
	* Returns the portion ID of this vcms portion.
	*
	* @return the portion ID of this vcms portion
	*/
	@Override
	public java.lang.String getPortionId() {
		return _vcmsPortion.getPortionId();
	}

	/**
	* Returns the primary key of this vcms portion.
	*
	* @return the primary key of this vcms portion
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vcmsPortion.getPrimaryKey();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsPortion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsPortion.toXmlString();
	}

	/**
	* Returns the created date of this vcms portion.
	*
	* @return the created date of this vcms portion
	*/
	@Override
	public Date getCreatedDate() {
		return _vcmsPortion.getCreatedDate();
	}

	/**
	* Returns the modified date of this vcms portion.
	*
	* @return the modified date of this vcms portion
	*/
	@Override
	public Date getModifiedDate() {
		return _vcmsPortion.getModifiedDate();
	}

	/**
	* Returns the company ID of this vcms portion.
	*
	* @return the company ID of this vcms portion
	*/
	@Override
	public long getCompanyId() {
		return _vcmsPortion.getCompanyId();
	}

	/**
	* Returns the group ID of this vcms portion.
	*
	* @return the group ID of this vcms portion
	*/
	@Override
	public long getGroupId() {
		return _vcmsPortion.getGroupId();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsPortion toEscapedModel() {
		return new VcmsPortionWrapper(_vcmsPortion.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsPortion toUnescapedModel() {
		return new VcmsPortionWrapper(_vcmsPortion.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vcmsPortion.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsPortion.setCachedModel(cachedModel);
	}

	/**
	* Sets whether this vcms portion is categorizable.
	*
	* @param categorizable the categorizable of this vcms portion
	*/
	@Override
	public void setCategorizable(boolean categorizable) {
		_vcmsPortion.setCategorizable(categorizable);
	}

	/**
	* Sets the code of this vcms portion.
	*
	* @param code the code of this vcms portion
	*/
	@Override
	public void setCode(java.lang.String code) {
		_vcmsPortion.setCode(code);
	}

	/**
	* Sets the company ID of this vcms portion.
	*
	* @param companyId the company ID of this vcms portion
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vcmsPortion.setCompanyId(companyId);
	}

	/**
	* Sets the created by user of this vcms portion.
	*
	* @param createdByUser the created by user of this vcms portion
	*/
	@Override
	public void setCreatedByUser(java.lang.String createdByUser) {
		_vcmsPortion.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this vcms portion.
	*
	* @param createdDate the created date of this vcms portion
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vcmsPortion.setCreatedDate(createdDate);
	}

	/**
	* Sets the description of this vcms portion.
	*
	* @param description the description of this vcms portion
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vcmsPortion.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsPortion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsPortion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsPortion.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this vcms portion.
	*
	* @param groupId the group ID of this vcms portion
	*/
	@Override
	public void setGroupId(long groupId) {
		_vcmsPortion.setGroupId(groupId);
	}

	/**
	* Sets the language of this vcms portion.
	*
	* @param language the language of this vcms portion
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vcmsPortion.setLanguage(language);
	}

	/**
	* Sets the modified by user of this vcms portion.
	*
	* @param modifiedByUser the modified by user of this vcms portion
	*/
	@Override
	public void setModifiedByUser(java.lang.String modifiedByUser) {
		_vcmsPortion.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this vcms portion.
	*
	* @param modifiedDate the modified date of this vcms portion
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vcmsPortion.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this vcms portion.
	*
	* @param name the name of this vcms portion
	*/
	@Override
	public void setName(java.lang.String name) {
		_vcmsPortion.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsPortion.setNew(n);
	}

	/**
	* Sets the portion ID of this vcms portion.
	*
	* @param portionId the portion ID of this vcms portion
	*/
	@Override
	public void setPortionId(java.lang.String portionId) {
		_vcmsPortion.setPortionId(portionId);
	}

	/**
	* Sets the primary key of this vcms portion.
	*
	* @param primaryKey the primary key of this vcms portion
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vcmsPortion.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsPortion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsPortionWrapper)) {
			return false;
		}

		VcmsPortionWrapper vcmsPortionWrapper = (VcmsPortionWrapper)obj;

		if (Objects.equals(_vcmsPortion, vcmsPortionWrapper._vcmsPortion)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsPortion getWrappedModel() {
		return _vcmsPortion;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsPortion.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsPortion.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsPortion.resetOriginalValues();
	}

	private final VcmsPortion _vcmsPortion;
}