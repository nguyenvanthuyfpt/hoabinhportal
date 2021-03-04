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
 * This class is a wrapper for {@link vdocLogger}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocLogger
 * @generated
 */
@ProviderType
public class vdocLoggerWrapper implements vdocLogger, ModelWrapper<vdocLogger> {
	public vdocLoggerWrapper(vdocLogger vdocLogger) {
		_vdocLogger = vdocLogger;
	}

	@Override
	public Class<?> getModelClass() {
		return vdocLogger.class;
	}

	@Override
	public String getModelClassName() {
		return vdocLogger.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("loggerId", getLoggerId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("entryId", getEntryId());
		attributes.put("className", getClassName());
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

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long createdByUser = (Long)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		String entryId = (String)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
		}

		String className = (String)attributes.get("className");

		if (className != null) {
			setClassName(className);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vdocLogger.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vdocLogger.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vdocLogger.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vdocLogger.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.vdocLogger> toCacheModel() {
		return _vdocLogger.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.vdocLogger vdocLogger) {
		return _vdocLogger.compareTo(vdocLogger);
	}

	@Override
	public int hashCode() {
		return _vdocLogger.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vdocLogger.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new vdocLoggerWrapper((vdocLogger)_vdocLogger.clone());
	}

	/**
	* Returns the class name of this vdoc logger.
	*
	* @return the class name of this vdoc logger
	*/
	@Override
	public java.lang.String getClassName() {
		return _vdocLogger.getClassName();
	}

	/**
	* Returns the content of this vdoc logger.
	*
	* @return the content of this vdoc logger
	*/
	@Override
	public java.lang.String getContent() {
		return _vdocLogger.getContent();
	}

	/**
	* Returns the entry ID of this vdoc logger.
	*
	* @return the entry ID of this vdoc logger
	*/
	@Override
	public java.lang.String getEntryId() {
		return _vdocLogger.getEntryId();
	}

	/**
	* Returns the logger ID of this vdoc logger.
	*
	* @return the logger ID of this vdoc logger
	*/
	@Override
	public java.lang.String getLoggerId() {
		return _vdocLogger.getLoggerId();
	}

	/**
	* Returns the primary key of this vdoc logger.
	*
	* @return the primary key of this vdoc logger
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vdocLogger.getPrimaryKey();
	}

	/**
	* Returns the user uuid of this vdoc logger.
	*
	* @return the user uuid of this vdoc logger
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vdocLogger.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vdocLogger.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vdocLogger.toXmlString();
	}

	/**
	* Returns the created date of this vdoc logger.
	*
	* @return the created date of this vdoc logger
	*/
	@Override
	public Date getCreatedDate() {
		return _vdocLogger.getCreatedDate();
	}

	/**
	* Returns the company ID of this vdoc logger.
	*
	* @return the company ID of this vdoc logger
	*/
	@Override
	public long getCompanyId() {
		return _vdocLogger.getCompanyId();
	}

	/**
	* Returns the created by user of this vdoc logger.
	*
	* @return the created by user of this vdoc logger
	*/
	@Override
	public long getCreatedByUser() {
		return _vdocLogger.getCreatedByUser();
	}

	/**
	* Returns the group ID of this vdoc logger.
	*
	* @return the group ID of this vdoc logger
	*/
	@Override
	public long getGroupId() {
		return _vdocLogger.getGroupId();
	}

	/**
	* Returns the user ID of this vdoc logger.
	*
	* @return the user ID of this vdoc logger
	*/
	@Override
	public long getUserId() {
		return _vdocLogger.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.vdocLogger toEscapedModel() {
		return new vdocLoggerWrapper(_vdocLogger.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.vdocLogger toUnescapedModel() {
		return new vdocLoggerWrapper(_vdocLogger.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vdocLogger.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vdocLogger.setCachedModel(cachedModel);
	}

	/**
	* Sets the class name of this vdoc logger.
	*
	* @param className the class name of this vdoc logger
	*/
	@Override
	public void setClassName(java.lang.String className) {
		_vdocLogger.setClassName(className);
	}

	/**
	* Sets the company ID of this vdoc logger.
	*
	* @param companyId the company ID of this vdoc logger
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vdocLogger.setCompanyId(companyId);
	}

	/**
	* Sets the content of this vdoc logger.
	*
	* @param content the content of this vdoc logger
	*/
	@Override
	public void setContent(java.lang.String content) {
		_vdocLogger.setContent(content);
	}

	/**
	* Sets the created by user of this vdoc logger.
	*
	* @param createdByUser the created by user of this vdoc logger
	*/
	@Override
	public void setCreatedByUser(long createdByUser) {
		_vdocLogger.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this vdoc logger.
	*
	* @param createdDate the created date of this vdoc logger
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vdocLogger.setCreatedDate(createdDate);
	}

	/**
	* Sets the entry ID of this vdoc logger.
	*
	* @param entryId the entry ID of this vdoc logger
	*/
	@Override
	public void setEntryId(java.lang.String entryId) {
		_vdocLogger.setEntryId(entryId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vdocLogger.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vdocLogger.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vdocLogger.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this vdoc logger.
	*
	* @param groupId the group ID of this vdoc logger
	*/
	@Override
	public void setGroupId(long groupId) {
		_vdocLogger.setGroupId(groupId);
	}

	/**
	* Sets the logger ID of this vdoc logger.
	*
	* @param loggerId the logger ID of this vdoc logger
	*/
	@Override
	public void setLoggerId(java.lang.String loggerId) {
		_vdocLogger.setLoggerId(loggerId);
	}

	@Override
	public void setNew(boolean n) {
		_vdocLogger.setNew(n);
	}

	/**
	* Sets the primary key of this vdoc logger.
	*
	* @param primaryKey the primary key of this vdoc logger
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vdocLogger.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vdocLogger.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this vdoc logger.
	*
	* @param userId the user ID of this vdoc logger
	*/
	@Override
	public void setUserId(long userId) {
		_vdocLogger.setUserId(userId);
	}

	/**
	* Sets the user uuid of this vdoc logger.
	*
	* @param userUuid the user uuid of this vdoc logger
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vdocLogger.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof vdocLoggerWrapper)) {
			return false;
		}

		vdocLoggerWrapper vdocLoggerWrapper = (vdocLoggerWrapper)obj;

		if (Objects.equals(_vdocLogger, vdocLoggerWrapper._vdocLogger)) {
			return true;
		}

		return false;
	}

	@Override
	public vdocLogger getWrappedModel() {
		return _vdocLogger;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vdocLogger.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vdocLogger.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vdocLogger.resetOriginalValues();
	}

	private final vdocLogger _vdocLogger;
}