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
 * This class is a wrapper for {@link VcmsStatus}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsStatus
 * @generated
 */
@ProviderType
public class VcmsStatusWrapper implements VcmsStatus, ModelWrapper<VcmsStatus> {
	public VcmsStatusWrapper(VcmsStatus vcmsStatus) {
		_vcmsStatus = vcmsStatus;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsStatus.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsStatus.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("statusId", getStatusId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("cssClass", getCssClass());
		attributes.put("textColor", getTextColor());
		attributes.put("position", getPosition());
		attributes.put("isPrimary", getIsPrimary());
		attributes.put("active", getActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long statusId = (Long)attributes.get("statusId");

		if (statusId != null) {
			setStatusId(statusId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String cssClass = (String)attributes.get("cssClass");

		if (cssClass != null) {
			setCssClass(cssClass);
		}

		String textColor = (String)attributes.get("textColor");

		if (textColor != null) {
			setTextColor(textColor);
		}

		Integer position = (Integer)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		Boolean isPrimary = (Boolean)attributes.get("isPrimary");

		if (isPrimary != null) {
			setIsPrimary(isPrimary);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}
	}

	/**
	* Returns the active of this vcms status.
	*
	* @return the active of this vcms status
	*/
	@Override
	public boolean getActive() {
		return _vcmsStatus.getActive();
	}

	/**
	* Returns the is primary of this vcms status.
	*
	* @return the is primary of this vcms status
	*/
	@Override
	public boolean getIsPrimary() {
		return _vcmsStatus.getIsPrimary();
	}

	/**
	* Returns <code>true</code> if this vcms status is active.
	*
	* @return <code>true</code> if this vcms status is active; <code>false</code> otherwise
	*/
	@Override
	public boolean isActive() {
		return _vcmsStatus.isActive();
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsStatus.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsStatus.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this vcms status is is primary.
	*
	* @return <code>true</code> if this vcms status is is primary; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsPrimary() {
		return _vcmsStatus.isIsPrimary();
	}

	@Override
	public boolean isNew() {
		return _vcmsStatus.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsStatus.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsStatus> toCacheModel() {
		return _vcmsStatus.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VcmsStatus vcmsStatus) {
		return _vcmsStatus.compareTo(vcmsStatus);
	}

	/**
	* Returns the position of this vcms status.
	*
	* @return the position of this vcms status
	*/
	@Override
	public int getPosition() {
		return _vcmsStatus.getPosition();
	}

	@Override
	public int hashCode() {
		return _vcmsStatus.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsStatus.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsStatusWrapper((VcmsStatus)_vcmsStatus.clone());
	}

	/**
	* Returns the created by user of this vcms status.
	*
	* @return the created by user of this vcms status
	*/
	@Override
	public java.lang.String getCreatedByUser() {
		return _vcmsStatus.getCreatedByUser();
	}

	/**
	* Returns the css class of this vcms status.
	*
	* @return the css class of this vcms status
	*/
	@Override
	public java.lang.String getCssClass() {
		return _vcmsStatus.getCssClass();
	}

	/**
	* Returns the description of this vcms status.
	*
	* @return the description of this vcms status
	*/
	@Override
	public java.lang.String getDescription() {
		return _vcmsStatus.getDescription();
	}

	/**
	* Returns the modified by user of this vcms status.
	*
	* @return the modified by user of this vcms status
	*/
	@Override
	public java.lang.String getModifiedByUser() {
		return _vcmsStatus.getModifiedByUser();
	}

	/**
	* Returns the name of this vcms status.
	*
	* @return the name of this vcms status
	*/
	@Override
	public java.lang.String getName() {
		return _vcmsStatus.getName();
	}

	/**
	* Returns the text color of this vcms status.
	*
	* @return the text color of this vcms status
	*/
	@Override
	public java.lang.String getTextColor() {
		return _vcmsStatus.getTextColor();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsStatus.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsStatus.toXmlString();
	}

	/**
	* Returns the created date of this vcms status.
	*
	* @return the created date of this vcms status
	*/
	@Override
	public Date getCreatedDate() {
		return _vcmsStatus.getCreatedDate();
	}

	/**
	* Returns the modified date of this vcms status.
	*
	* @return the modified date of this vcms status
	*/
	@Override
	public Date getModifiedDate() {
		return _vcmsStatus.getModifiedDate();
	}

	/**
	* Returns the company ID of this vcms status.
	*
	* @return the company ID of this vcms status
	*/
	@Override
	public long getCompanyId() {
		return _vcmsStatus.getCompanyId();
	}

	/**
	* Returns the group ID of this vcms status.
	*
	* @return the group ID of this vcms status
	*/
	@Override
	public long getGroupId() {
		return _vcmsStatus.getGroupId();
	}

	/**
	* Returns the primary key of this vcms status.
	*
	* @return the primary key of this vcms status
	*/
	@Override
	public long getPrimaryKey() {
		return _vcmsStatus.getPrimaryKey();
	}

	/**
	* Returns the status ID of this vcms status.
	*
	* @return the status ID of this vcms status
	*/
	@Override
	public long getStatusId() {
		return _vcmsStatus.getStatusId();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsStatus toEscapedModel() {
		return new VcmsStatusWrapper(_vcmsStatus.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsStatus toUnescapedModel() {
		return new VcmsStatusWrapper(_vcmsStatus.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vcmsStatus.persist();
	}

	/**
	* Sets whether this vcms status is active.
	*
	* @param active the active of this vcms status
	*/
	@Override
	public void setActive(boolean active) {
		_vcmsStatus.setActive(active);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsStatus.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this vcms status.
	*
	* @param companyId the company ID of this vcms status
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vcmsStatus.setCompanyId(companyId);
	}

	/**
	* Sets the created by user of this vcms status.
	*
	* @param createdByUser the created by user of this vcms status
	*/
	@Override
	public void setCreatedByUser(java.lang.String createdByUser) {
		_vcmsStatus.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this vcms status.
	*
	* @param createdDate the created date of this vcms status
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vcmsStatus.setCreatedDate(createdDate);
	}

	/**
	* Sets the css class of this vcms status.
	*
	* @param cssClass the css class of this vcms status
	*/
	@Override
	public void setCssClass(java.lang.String cssClass) {
		_vcmsStatus.setCssClass(cssClass);
	}

	/**
	* Sets the description of this vcms status.
	*
	* @param description the description of this vcms status
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vcmsStatus.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsStatus.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsStatus.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsStatus.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this vcms status.
	*
	* @param groupId the group ID of this vcms status
	*/
	@Override
	public void setGroupId(long groupId) {
		_vcmsStatus.setGroupId(groupId);
	}

	/**
	* Sets whether this vcms status is is primary.
	*
	* @param isPrimary the is primary of this vcms status
	*/
	@Override
	public void setIsPrimary(boolean isPrimary) {
		_vcmsStatus.setIsPrimary(isPrimary);
	}

	/**
	* Sets the modified by user of this vcms status.
	*
	* @param modifiedByUser the modified by user of this vcms status
	*/
	@Override
	public void setModifiedByUser(java.lang.String modifiedByUser) {
		_vcmsStatus.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this vcms status.
	*
	* @param modifiedDate the modified date of this vcms status
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vcmsStatus.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this vcms status.
	*
	* @param name the name of this vcms status
	*/
	@Override
	public void setName(java.lang.String name) {
		_vcmsStatus.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsStatus.setNew(n);
	}

	/**
	* Sets the position of this vcms status.
	*
	* @param position the position of this vcms status
	*/
	@Override
	public void setPosition(int position) {
		_vcmsStatus.setPosition(position);
	}

	/**
	* Sets the primary key of this vcms status.
	*
	* @param primaryKey the primary key of this vcms status
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vcmsStatus.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsStatus.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status ID of this vcms status.
	*
	* @param statusId the status ID of this vcms status
	*/
	@Override
	public void setStatusId(long statusId) {
		_vcmsStatus.setStatusId(statusId);
	}

	/**
	* Sets the text color of this vcms status.
	*
	* @param textColor the text color of this vcms status
	*/
	@Override
	public void setTextColor(java.lang.String textColor) {
		_vcmsStatus.setTextColor(textColor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsStatusWrapper)) {
			return false;
		}

		VcmsStatusWrapper vcmsStatusWrapper = (VcmsStatusWrapper)obj;

		if (Objects.equals(_vcmsStatus, vcmsStatusWrapper._vcmsStatus)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsStatus getWrappedModel() {
		return _vcmsStatus;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsStatus.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsStatus.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsStatus.resetOriginalValues();
	}

	private final VcmsStatus _vcmsStatus;
}