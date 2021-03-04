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
 * This class is a wrapper for {@link VcmsLogger}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsLogger
 * @generated
 */
@ProviderType
public class VcmsLoggerWrapper implements VcmsLogger, ModelWrapper<VcmsLogger> {
	public VcmsLoggerWrapper(VcmsLogger vcmsLogger) {
		_vcmsLogger = vcmsLogger;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsLogger.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsLogger.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("loggerId", getLoggerId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("entryId", getEntryId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("classEntry", getClassEntry());
		attributes.put("content", getContent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String loggerId = (String)attributes.get("loggerId");

		if (loggerId != null) {
			setLoggerId(loggerId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String entryId = (String)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String createdByUser = (String)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		String classEntry = (String)attributes.get("classEntry");

		if (classEntry != null) {
			setClassEntry(classEntry);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsLogger.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsLogger.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vcmsLogger.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsLogger.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsLogger> toCacheModel() {
		return _vcmsLogger.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VcmsLogger vcmsLogger) {
		return _vcmsLogger.compareTo(vcmsLogger);
	}

	@Override
	public int hashCode() {
		return _vcmsLogger.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsLogger.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsLoggerWrapper((VcmsLogger)_vcmsLogger.clone());
	}

	/**
	* Returns the class entry of this vcms logger.
	*
	* @return the class entry of this vcms logger
	*/
	@Override
	public java.lang.String getClassEntry() {
		return _vcmsLogger.getClassEntry();
	}

	/**
	* Returns the content of this vcms logger.
	*
	* @return the content of this vcms logger
	*/
	@Override
	public java.lang.String getContent() {
		return _vcmsLogger.getContent();
	}

	/**
	* Returns the created by user of this vcms logger.
	*
	* @return the created by user of this vcms logger
	*/
	@Override
	public java.lang.String getCreatedByUser() {
		return _vcmsLogger.getCreatedByUser();
	}

	/**
	* Returns the entry ID of this vcms logger.
	*
	* @return the entry ID of this vcms logger
	*/
	@Override
	public java.lang.String getEntryId() {
		return _vcmsLogger.getEntryId();
	}

	/**
	* Returns the logger ID of this vcms logger.
	*
	* @return the logger ID of this vcms logger
	*/
	@Override
	public java.lang.String getLoggerId() {
		return _vcmsLogger.getLoggerId();
	}

	/**
	* Returns the primary key of this vcms logger.
	*
	* @return the primary key of this vcms logger
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vcmsLogger.getPrimaryKey();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsLogger.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsLogger.toXmlString();
	}

	/**
	* Returns the created date of this vcms logger.
	*
	* @return the created date of this vcms logger
	*/
	@Override
	public Date getCreatedDate() {
		return _vcmsLogger.getCreatedDate();
	}

	/**
	* Returns the company ID of this vcms logger.
	*
	* @return the company ID of this vcms logger
	*/
	@Override
	public long getCompanyId() {
		return _vcmsLogger.getCompanyId();
	}

	/**
	* Returns the group ID of this vcms logger.
	*
	* @return the group ID of this vcms logger
	*/
	@Override
	public long getGroupId() {
		return _vcmsLogger.getGroupId();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsLogger toEscapedModel() {
		return new VcmsLoggerWrapper(_vcmsLogger.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsLogger toUnescapedModel() {
		return new VcmsLoggerWrapper(_vcmsLogger.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vcmsLogger.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsLogger.setCachedModel(cachedModel);
	}

	/**
	* Sets the class entry of this vcms logger.
	*
	* @param classEntry the class entry of this vcms logger
	*/
	@Override
	public void setClassEntry(java.lang.String classEntry) {
		_vcmsLogger.setClassEntry(classEntry);
	}

	/**
	* Sets the company ID of this vcms logger.
	*
	* @param companyId the company ID of this vcms logger
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vcmsLogger.setCompanyId(companyId);
	}

	/**
	* Sets the content of this vcms logger.
	*
	* @param content the content of this vcms logger
	*/
	@Override
	public void setContent(java.lang.String content) {
		_vcmsLogger.setContent(content);
	}

	/**
	* Sets the created by user of this vcms logger.
	*
	* @param createdByUser the created by user of this vcms logger
	*/
	@Override
	public void setCreatedByUser(java.lang.String createdByUser) {
		_vcmsLogger.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this vcms logger.
	*
	* @param createdDate the created date of this vcms logger
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vcmsLogger.setCreatedDate(createdDate);
	}

	/**
	* Sets the entry ID of this vcms logger.
	*
	* @param entryId the entry ID of this vcms logger
	*/
	@Override
	public void setEntryId(java.lang.String entryId) {
		_vcmsLogger.setEntryId(entryId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsLogger.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsLogger.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsLogger.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this vcms logger.
	*
	* @param groupId the group ID of this vcms logger
	*/
	@Override
	public void setGroupId(long groupId) {
		_vcmsLogger.setGroupId(groupId);
	}

	/**
	* Sets the logger ID of this vcms logger.
	*
	* @param loggerId the logger ID of this vcms logger
	*/
	@Override
	public void setLoggerId(java.lang.String loggerId) {
		_vcmsLogger.setLoggerId(loggerId);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsLogger.setNew(n);
	}

	/**
	* Sets the primary key of this vcms logger.
	*
	* @param primaryKey the primary key of this vcms logger
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vcmsLogger.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsLogger.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsLoggerWrapper)) {
			return false;
		}

		VcmsLoggerWrapper vcmsLoggerWrapper = (VcmsLoggerWrapper)obj;

		if (Objects.equals(_vcmsLogger, vcmsLoggerWrapper._vcmsLogger)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsLogger getWrappedModel() {
		return _vcmsLogger;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsLogger.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsLogger.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsLogger.resetOriginalValues();
	}

	private final VcmsLogger _vcmsLogger;
}