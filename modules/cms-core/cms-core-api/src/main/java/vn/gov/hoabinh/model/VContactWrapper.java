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
 * This class is a wrapper for {@link VContact}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VContact
 * @generated
 */
@ProviderType
public class VContactWrapper implements VContact, ModelWrapper<VContact> {
	public VContactWrapper(VContact vContact) {
		_vContact = vContact;
	}

	@Override
	public Class<?> getModelClass() {
		return VContact.class;
	}

	@Override
	public String getModelClassName() {
		return VContact.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("guestName", getGuestName());
		attributes.put("email", getEmail());
		attributes.put("title", getTitle());
		attributes.put("address", getAddress());
		attributes.put("phone", getPhone());
		attributes.put("fax", getFax());
		attributes.put("content", getContent());
		attributes.put("hasAttach", getHasAttach());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

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

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String guestName = (String)attributes.get("guestName");

		if (guestName != null) {
			setGuestName(guestName);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
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

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Boolean hasAttach = (Boolean)attributes.get("hasAttach");

		if (hasAttach != null) {
			setHasAttach(hasAttach);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the has attach of this v contact.
	*
	* @return the has attach of this v contact
	*/
	@Override
	public boolean getHasAttach() {
		return _vContact.getHasAttach();
	}

	@Override
	public boolean isCachedModel() {
		return _vContact.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vContact.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this v contact is has attach.
	*
	* @return <code>true</code> if this v contact is has attach; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasAttach() {
		return _vContact.isHasAttach();
	}

	@Override
	public boolean isNew() {
		return _vContact.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vContact.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VContact> toCacheModel() {
		return _vContact.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VContact vContact) {
		return _vContact.compareTo(vContact);
	}

	/**
	* Returns the status of this v contact.
	*
	* @return the status of this v contact
	*/
	@Override
	public int getStatus() {
		return _vContact.getStatus();
	}

	@Override
	public int hashCode() {
		return _vContact.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vContact.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VContactWrapper((VContact)_vContact.clone());
	}

	/**
	* Returns the address of this v contact.
	*
	* @return the address of this v contact
	*/
	@Override
	public java.lang.String getAddress() {
		return _vContact.getAddress();
	}

	/**
	* Returns the content of this v contact.
	*
	* @return the content of this v contact
	*/
	@Override
	public java.lang.String getContent() {
		return _vContact.getContent();
	}

	/**
	* Returns the email of this v contact.
	*
	* @return the email of this v contact
	*/
	@Override
	public java.lang.String getEmail() {
		return _vContact.getEmail();
	}

	/**
	* Returns the fax of this v contact.
	*
	* @return the fax of this v contact
	*/
	@Override
	public java.lang.String getFax() {
		return _vContact.getFax();
	}

	/**
	* Returns the guest name of this v contact.
	*
	* @return the guest name of this v contact
	*/
	@Override
	public java.lang.String getGuestName() {
		return _vContact.getGuestName();
	}

	/**
	* Returns the phone of this v contact.
	*
	* @return the phone of this v contact
	*/
	@Override
	public java.lang.String getPhone() {
		return _vContact.getPhone();
	}

	/**
	* Returns the title of this v contact.
	*
	* @return the title of this v contact
	*/
	@Override
	public java.lang.String getTitle() {
		return _vContact.getTitle();
	}

	@Override
	public java.lang.String toString() {
		return _vContact.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vContact.toXmlString();
	}

	/**
	* Returns the created date of this v contact.
	*
	* @return the created date of this v contact
	*/
	@Override
	public Date getCreatedDate() {
		return _vContact.getCreatedDate();
	}

	/**
	* Returns the modified date of this v contact.
	*
	* @return the modified date of this v contact
	*/
	@Override
	public Date getModifiedDate() {
		return _vContact.getModifiedDate();
	}

	/**
	* Returns the company ID of this v contact.
	*
	* @return the company ID of this v contact
	*/
	@Override
	public long getCompanyId() {
		return _vContact.getCompanyId();
	}

	/**
	* Returns the group ID of this v contact.
	*
	* @return the group ID of this v contact
	*/
	@Override
	public long getGroupId() {
		return _vContact.getGroupId();
	}

	/**
	* Returns the ID of this v contact.
	*
	* @return the ID of this v contact
	*/
	@Override
	public long getId() {
		return _vContact.getId();
	}

	/**
	* Returns the primary key of this v contact.
	*
	* @return the primary key of this v contact
	*/
	@Override
	public long getPrimaryKey() {
		return _vContact.getPrimaryKey();
	}

	@Override
	public vn.gov.hoabinh.model.VContact toEscapedModel() {
		return new VContactWrapper(_vContact.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VContact toUnescapedModel() {
		return new VContactWrapper(_vContact.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vContact.persist();
	}

	/**
	* Sets the address of this v contact.
	*
	* @param address the address of this v contact
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_vContact.setAddress(address);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vContact.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this v contact.
	*
	* @param companyId the company ID of this v contact
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vContact.setCompanyId(companyId);
	}

	/**
	* Sets the content of this v contact.
	*
	* @param content the content of this v contact
	*/
	@Override
	public void setContent(java.lang.String content) {
		_vContact.setContent(content);
	}

	/**
	* Sets the created date of this v contact.
	*
	* @param createdDate the created date of this v contact
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vContact.setCreatedDate(createdDate);
	}

	/**
	* Sets the email of this v contact.
	*
	* @param email the email of this v contact
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_vContact.setEmail(email);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vContact.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vContact.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vContact.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fax of this v contact.
	*
	* @param fax the fax of this v contact
	*/
	@Override
	public void setFax(java.lang.String fax) {
		_vContact.setFax(fax);
	}

	/**
	* Sets the group ID of this v contact.
	*
	* @param groupId the group ID of this v contact
	*/
	@Override
	public void setGroupId(long groupId) {
		_vContact.setGroupId(groupId);
	}

	/**
	* Sets the guest name of this v contact.
	*
	* @param guestName the guest name of this v contact
	*/
	@Override
	public void setGuestName(java.lang.String guestName) {
		_vContact.setGuestName(guestName);
	}

	/**
	* Sets whether this v contact is has attach.
	*
	* @param hasAttach the has attach of this v contact
	*/
	@Override
	public void setHasAttach(boolean hasAttach) {
		_vContact.setHasAttach(hasAttach);
	}

	/**
	* Sets the ID of this v contact.
	*
	* @param id the ID of this v contact
	*/
	@Override
	public void setId(long id) {
		_vContact.setId(id);
	}

	/**
	* Sets the modified date of this v contact.
	*
	* @param modifiedDate the modified date of this v contact
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vContact.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_vContact.setNew(n);
	}

	/**
	* Sets the phone of this v contact.
	*
	* @param phone the phone of this v contact
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_vContact.setPhone(phone);
	}

	/**
	* Sets the primary key of this v contact.
	*
	* @param primaryKey the primary key of this v contact
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vContact.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vContact.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this v contact.
	*
	* @param status the status of this v contact
	*/
	@Override
	public void setStatus(int status) {
		_vContact.setStatus(status);
	}

	/**
	* Sets the title of this v contact.
	*
	* @param title the title of this v contact
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_vContact.setTitle(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VContactWrapper)) {
			return false;
		}

		VContactWrapper vContactWrapper = (VContactWrapper)obj;

		if (Objects.equals(_vContact, vContactWrapper._vContact)) {
			return true;
		}

		return false;
	}

	@Override
	public VContact getWrappedModel() {
		return _vContact;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vContact.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vContact.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vContact.resetOriginalValues();
	}

	private final VContact _vContact;
}