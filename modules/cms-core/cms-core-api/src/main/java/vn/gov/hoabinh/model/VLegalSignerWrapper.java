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
 * This class is a wrapper for {@link VLegalSigner}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSigner
 * @generated
 */
@ProviderType
public class VLegalSignerWrapper implements VLegalSigner,
	ModelWrapper<VLegalSigner> {
	public VLegalSignerWrapper(VLegalSigner vLegalSigner) {
		_vLegalSigner = vLegalSigner;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalSigner.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalSigner.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sigId", getSigId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("language", getLanguage());
		attributes.put("statusSigner", getStatusSigner());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String sigId = (String)attributes.get("sigId");

		if (sigId != null) {
			setSigId(sigId);
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

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Boolean statusSigner = (Boolean)attributes.get("statusSigner");

		if (statusSigner != null) {
			setStatusSigner(statusSigner);
		}
	}

	/**
	* Returns the status signer of this v legal signer.
	*
	* @return the status signer of this v legal signer
	*/
	@Override
	public boolean getStatusSigner() {
		return _vLegalSigner.getStatusSigner();
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalSigner.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalSigner.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vLegalSigner.isNew();
	}

	/**
	* Returns <code>true</code> if this v legal signer is status signer.
	*
	* @return <code>true</code> if this v legal signer is status signer; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatusSigner() {
		return _vLegalSigner.isStatusSigner();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalSigner.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalSigner> toCacheModel() {
		return _vLegalSigner.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VLegalSigner vLegalSigner) {
		return _vLegalSigner.compareTo(vLegalSigner);
	}

	@Override
	public int hashCode() {
		return _vLegalSigner.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalSigner.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalSignerWrapper((VLegalSigner)_vLegalSigner.clone());
	}

	/**
	* Returns the first name of this v legal signer.
	*
	* @return the first name of this v legal signer
	*/
	@Override
	public java.lang.String getFirstName() {
		return _vLegalSigner.getFirstName();
	}

	/**
	* Returns the language of this v legal signer.
	*
	* @return the language of this v legal signer
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vLegalSigner.getLanguage();
	}

	/**
	* Returns the last name of this v legal signer.
	*
	* @return the last name of this v legal signer
	*/
	@Override
	public java.lang.String getLastName() {
		return _vLegalSigner.getLastName();
	}

	/**
	* Returns the primary key of this v legal signer.
	*
	* @return the primary key of this v legal signer
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vLegalSigner.getPrimaryKey();
	}

	/**
	* Returns the sig ID of this v legal signer.
	*
	* @return the sig ID of this v legal signer
	*/
	@Override
	public java.lang.String getSigId() {
		return _vLegalSigner.getSigId();
	}

	/**
	* Returns the user uuid of this v legal signer.
	*
	* @return the user uuid of this v legal signer
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vLegalSigner.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalSigner.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalSigner.toXmlString();
	}

	/**
	* Returns the created date of this v legal signer.
	*
	* @return the created date of this v legal signer
	*/
	@Override
	public Date getCreatedDate() {
		return _vLegalSigner.getCreatedDate();
	}

	/**
	* Returns the modified date of this v legal signer.
	*
	* @return the modified date of this v legal signer
	*/
	@Override
	public Date getModifiedDate() {
		return _vLegalSigner.getModifiedDate();
	}

	/**
	* Returns the company ID of this v legal signer.
	*
	* @return the company ID of this v legal signer
	*/
	@Override
	public long getCompanyId() {
		return _vLegalSigner.getCompanyId();
	}

	/**
	* Returns the created by user of this v legal signer.
	*
	* @return the created by user of this v legal signer
	*/
	@Override
	public long getCreatedByUser() {
		return _vLegalSigner.getCreatedByUser();
	}

	/**
	* Returns the group ID of this v legal signer.
	*
	* @return the group ID of this v legal signer
	*/
	@Override
	public long getGroupId() {
		return _vLegalSigner.getGroupId();
	}

	/**
	* Returns the modified by user of this v legal signer.
	*
	* @return the modified by user of this v legal signer
	*/
	@Override
	public long getModifiedByUser() {
		return _vLegalSigner.getModifiedByUser();
	}

	/**
	* Returns the user ID of this v legal signer.
	*
	* @return the user ID of this v legal signer
	*/
	@Override
	public long getUserId() {
		return _vLegalSigner.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSigner toEscapedModel() {
		return new VLegalSignerWrapper(_vLegalSigner.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalSigner toUnescapedModel() {
		return new VLegalSignerWrapper(_vLegalSigner.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vLegalSigner.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalSigner.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this v legal signer.
	*
	* @param companyId the company ID of this v legal signer
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vLegalSigner.setCompanyId(companyId);
	}

	/**
	* Sets the created by user of this v legal signer.
	*
	* @param createdByUser the created by user of this v legal signer
	*/
	@Override
	public void setCreatedByUser(long createdByUser) {
		_vLegalSigner.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this v legal signer.
	*
	* @param createdDate the created date of this v legal signer
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vLegalSigner.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalSigner.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalSigner.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalSigner.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the first name of this v legal signer.
	*
	* @param firstName the first name of this v legal signer
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_vLegalSigner.setFirstName(firstName);
	}

	/**
	* Sets the group ID of this v legal signer.
	*
	* @param groupId the group ID of this v legal signer
	*/
	@Override
	public void setGroupId(long groupId) {
		_vLegalSigner.setGroupId(groupId);
	}

	/**
	* Sets the language of this v legal signer.
	*
	* @param language the language of this v legal signer
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vLegalSigner.setLanguage(language);
	}

	/**
	* Sets the last name of this v legal signer.
	*
	* @param lastName the last name of this v legal signer
	*/
	@Override
	public void setLastName(java.lang.String lastName) {
		_vLegalSigner.setLastName(lastName);
	}

	/**
	* Sets the modified by user of this v legal signer.
	*
	* @param modifiedByUser the modified by user of this v legal signer
	*/
	@Override
	public void setModifiedByUser(long modifiedByUser) {
		_vLegalSigner.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this v legal signer.
	*
	* @param modifiedDate the modified date of this v legal signer
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vLegalSigner.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalSigner.setNew(n);
	}

	/**
	* Sets the primary key of this v legal signer.
	*
	* @param primaryKey the primary key of this v legal signer
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vLegalSigner.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalSigner.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sig ID of this v legal signer.
	*
	* @param sigId the sig ID of this v legal signer
	*/
	@Override
	public void setSigId(java.lang.String sigId) {
		_vLegalSigner.setSigId(sigId);
	}

	/**
	* Sets whether this v legal signer is status signer.
	*
	* @param statusSigner the status signer of this v legal signer
	*/
	@Override
	public void setStatusSigner(boolean statusSigner) {
		_vLegalSigner.setStatusSigner(statusSigner);
	}

	/**
	* Sets the user ID of this v legal signer.
	*
	* @param userId the user ID of this v legal signer
	*/
	@Override
	public void setUserId(long userId) {
		_vLegalSigner.setUserId(userId);
	}

	/**
	* Sets the user uuid of this v legal signer.
	*
	* @param userUuid the user uuid of this v legal signer
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vLegalSigner.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalSignerWrapper)) {
			return false;
		}

		VLegalSignerWrapper vLegalSignerWrapper = (VLegalSignerWrapper)obj;

		if (Objects.equals(_vLegalSigner, vLegalSignerWrapper._vLegalSigner)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalSigner getWrappedModel() {
		return _vLegalSigner;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalSigner.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalSigner.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalSigner.resetOriginalValues();
	}

	private final VLegalSigner _vLegalSigner;
}