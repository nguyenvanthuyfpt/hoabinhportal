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
 * This class is a wrapper for {@link vdocOrg}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocOrg
 * @generated
 */
@ProviderType
public class vdocOrgWrapper implements vdocOrg, ModelWrapper<vdocOrg> {
	public vdocOrgWrapper(vdocOrg vdocOrg) {
		_vdocOrg = vdocOrg;
	}

	@Override
	public Class<?> getModelClass() {
		return vdocOrg.class;
	}

	@Override
	public String getModelClassName() {
		return vdocOrg.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("orgId", getOrgId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("parentId", getParentId());
		attributes.put("code", getCode());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("address", getAddress());
		attributes.put("phone", getPhone());
		attributes.put("fax", getFax());
		attributes.put("language", getLanguage());
		attributes.put("statusOrg", getStatusOrg());
		attributes.put("position", getPosition());
		attributes.put("listparent", getListparent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String orgId = (String)attributes.get("orgId");

		if (orgId != null) {
			setOrgId(orgId);
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

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Boolean statusOrg = (Boolean)attributes.get("statusOrg");

		if (statusOrg != null) {
			setStatusOrg(statusOrg);
		}

		Integer position = (Integer)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String listparent = (String)attributes.get("listparent");

		if (listparent != null) {
			setListparent(listparent);
		}
	}

	/**
	* Returns the status org of this vdoc org.
	*
	* @return the status org of this vdoc org
	*/
	@Override
	public boolean getStatusOrg() {
		return _vdocOrg.getStatusOrg();
	}

	@Override
	public boolean isCachedModel() {
		return _vdocOrg.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vdocOrg.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vdocOrg.isNew();
	}

	/**
	* Returns <code>true</code> if this vdoc org is status org.
	*
	* @return <code>true</code> if this vdoc org is status org; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatusOrg() {
		return _vdocOrg.isStatusOrg();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vdocOrg.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.vdocOrg> toCacheModel() {
		return _vdocOrg.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.vdocOrg vdocOrg) {
		return _vdocOrg.compareTo(vdocOrg);
	}

	/**
	* Returns the position of this vdoc org.
	*
	* @return the position of this vdoc org
	*/
	@Override
	public int getPosition() {
		return _vdocOrg.getPosition();
	}

	@Override
	public int hashCode() {
		return _vdocOrg.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vdocOrg.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new vdocOrgWrapper((vdocOrg)_vdocOrg.clone());
	}

	/**
	* Returns the address of this vdoc org.
	*
	* @return the address of this vdoc org
	*/
	@Override
	public java.lang.String getAddress() {
		return _vdocOrg.getAddress();
	}

	/**
	* Returns the code of this vdoc org.
	*
	* @return the code of this vdoc org
	*/
	@Override
	public java.lang.String getCode() {
		return _vdocOrg.getCode();
	}

	/**
	* Returns the description of this vdoc org.
	*
	* @return the description of this vdoc org
	*/
	@Override
	public java.lang.String getDescription() {
		return _vdocOrg.getDescription();
	}

	/**
	* Returns the fax of this vdoc org.
	*
	* @return the fax of this vdoc org
	*/
	@Override
	public java.lang.String getFax() {
		return _vdocOrg.getFax();
	}

	/**
	* Returns the language of this vdoc org.
	*
	* @return the language of this vdoc org
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vdocOrg.getLanguage();
	}

	/**
	* Returns the listparent of this vdoc org.
	*
	* @return the listparent of this vdoc org
	*/
	@Override
	public java.lang.String getListparent() {
		return _vdocOrg.getListparent();
	}

	/**
	* Returns the name of this vdoc org.
	*
	* @return the name of this vdoc org
	*/
	@Override
	public java.lang.String getName() {
		return _vdocOrg.getName();
	}

	/**
	* Returns the org ID of this vdoc org.
	*
	* @return the org ID of this vdoc org
	*/
	@Override
	public java.lang.String getOrgId() {
		return _vdocOrg.getOrgId();
	}

	/**
	* Returns the parent ID of this vdoc org.
	*
	* @return the parent ID of this vdoc org
	*/
	@Override
	public java.lang.String getParentId() {
		return _vdocOrg.getParentId();
	}

	/**
	* Returns the phone of this vdoc org.
	*
	* @return the phone of this vdoc org
	*/
	@Override
	public java.lang.String getPhone() {
		return _vdocOrg.getPhone();
	}

	/**
	* Returns the primary key of this vdoc org.
	*
	* @return the primary key of this vdoc org
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vdocOrg.getPrimaryKey();
	}

	/**
	* Returns the user uuid of this vdoc org.
	*
	* @return the user uuid of this vdoc org
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vdocOrg.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vdocOrg.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vdocOrg.toXmlString();
	}

	/**
	* Returns the created date of this vdoc org.
	*
	* @return the created date of this vdoc org
	*/
	@Override
	public Date getCreatedDate() {
		return _vdocOrg.getCreatedDate();
	}

	/**
	* Returns the modified date of this vdoc org.
	*
	* @return the modified date of this vdoc org
	*/
	@Override
	public Date getModifiedDate() {
		return _vdocOrg.getModifiedDate();
	}

	/**
	* Returns the company ID of this vdoc org.
	*
	* @return the company ID of this vdoc org
	*/
	@Override
	public long getCompanyId() {
		return _vdocOrg.getCompanyId();
	}

	/**
	* Returns the created by user of this vdoc org.
	*
	* @return the created by user of this vdoc org
	*/
	@Override
	public long getCreatedByUser() {
		return _vdocOrg.getCreatedByUser();
	}

	/**
	* Returns the group ID of this vdoc org.
	*
	* @return the group ID of this vdoc org
	*/
	@Override
	public long getGroupId() {
		return _vdocOrg.getGroupId();
	}

	/**
	* Returns the modified by user of this vdoc org.
	*
	* @return the modified by user of this vdoc org
	*/
	@Override
	public long getModifiedByUser() {
		return _vdocOrg.getModifiedByUser();
	}

	/**
	* Returns the user ID of this vdoc org.
	*
	* @return the user ID of this vdoc org
	*/
	@Override
	public long getUserId() {
		return _vdocOrg.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.vdocOrg toEscapedModel() {
		return new vdocOrgWrapper(_vdocOrg.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.vdocOrg toUnescapedModel() {
		return new vdocOrgWrapper(_vdocOrg.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vdocOrg.persist();
	}

	/**
	* Sets the address of this vdoc org.
	*
	* @param address the address of this vdoc org
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_vdocOrg.setAddress(address);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vdocOrg.setCachedModel(cachedModel);
	}

	/**
	* Sets the code of this vdoc org.
	*
	* @param code the code of this vdoc org
	*/
	@Override
	public void setCode(java.lang.String code) {
		_vdocOrg.setCode(code);
	}

	/**
	* Sets the company ID of this vdoc org.
	*
	* @param companyId the company ID of this vdoc org
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vdocOrg.setCompanyId(companyId);
	}

	/**
	* Sets the created by user of this vdoc org.
	*
	* @param createdByUser the created by user of this vdoc org
	*/
	@Override
	public void setCreatedByUser(long createdByUser) {
		_vdocOrg.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this vdoc org.
	*
	* @param createdDate the created date of this vdoc org
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vdocOrg.setCreatedDate(createdDate);
	}

	/**
	* Sets the description of this vdoc org.
	*
	* @param description the description of this vdoc org
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vdocOrg.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vdocOrg.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vdocOrg.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vdocOrg.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fax of this vdoc org.
	*
	* @param fax the fax of this vdoc org
	*/
	@Override
	public void setFax(java.lang.String fax) {
		_vdocOrg.setFax(fax);
	}

	/**
	* Sets the group ID of this vdoc org.
	*
	* @param groupId the group ID of this vdoc org
	*/
	@Override
	public void setGroupId(long groupId) {
		_vdocOrg.setGroupId(groupId);
	}

	/**
	* Sets the language of this vdoc org.
	*
	* @param language the language of this vdoc org
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vdocOrg.setLanguage(language);
	}

	/**
	* Sets the listparent of this vdoc org.
	*
	* @param listparent the listparent of this vdoc org
	*/
	@Override
	public void setListparent(java.lang.String listparent) {
		_vdocOrg.setListparent(listparent);
	}

	/**
	* Sets the modified by user of this vdoc org.
	*
	* @param modifiedByUser the modified by user of this vdoc org
	*/
	@Override
	public void setModifiedByUser(long modifiedByUser) {
		_vdocOrg.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this vdoc org.
	*
	* @param modifiedDate the modified date of this vdoc org
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vdocOrg.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this vdoc org.
	*
	* @param name the name of this vdoc org
	*/
	@Override
	public void setName(java.lang.String name) {
		_vdocOrg.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_vdocOrg.setNew(n);
	}

	/**
	* Sets the org ID of this vdoc org.
	*
	* @param orgId the org ID of this vdoc org
	*/
	@Override
	public void setOrgId(java.lang.String orgId) {
		_vdocOrg.setOrgId(orgId);
	}

	/**
	* Sets the parent ID of this vdoc org.
	*
	* @param parentId the parent ID of this vdoc org
	*/
	@Override
	public void setParentId(java.lang.String parentId) {
		_vdocOrg.setParentId(parentId);
	}

	/**
	* Sets the phone of this vdoc org.
	*
	* @param phone the phone of this vdoc org
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_vdocOrg.setPhone(phone);
	}

	/**
	* Sets the position of this vdoc org.
	*
	* @param position the position of this vdoc org
	*/
	@Override
	public void setPosition(int position) {
		_vdocOrg.setPosition(position);
	}

	/**
	* Sets the primary key of this vdoc org.
	*
	* @param primaryKey the primary key of this vdoc org
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vdocOrg.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vdocOrg.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this vdoc org is status org.
	*
	* @param statusOrg the status org of this vdoc org
	*/
	@Override
	public void setStatusOrg(boolean statusOrg) {
		_vdocOrg.setStatusOrg(statusOrg);
	}

	/**
	* Sets the user ID of this vdoc org.
	*
	* @param userId the user ID of this vdoc org
	*/
	@Override
	public void setUserId(long userId) {
		_vdocOrg.setUserId(userId);
	}

	/**
	* Sets the user uuid of this vdoc org.
	*
	* @param userUuid the user uuid of this vdoc org
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vdocOrg.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof vdocOrgWrapper)) {
			return false;
		}

		vdocOrgWrapper vdocOrgWrapper = (vdocOrgWrapper)obj;

		if (Objects.equals(_vdocOrg, vdocOrgWrapper._vdocOrg)) {
			return true;
		}

		return false;
	}

	@Override
	public vdocOrg getWrappedModel() {
		return _vdocOrg;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vdocOrg.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vdocOrg.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vdocOrg.resetOriginalValues();
	}

	private final vdocOrg _vdocOrg;
}