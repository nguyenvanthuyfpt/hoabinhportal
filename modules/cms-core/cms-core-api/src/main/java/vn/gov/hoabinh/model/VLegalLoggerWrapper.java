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
 * This class is a wrapper for {@link VLegalLogger}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalLogger
 * @generated
 */
@ProviderType
public class VLegalLoggerWrapper implements VLegalLogger,
	ModelWrapper<VLegalLogger> {
	public VLegalLoggerWrapper(VLegalLogger vLegalLogger) {
		_vLegalLogger = vLegalLogger;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalLogger.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalLogger.class.getName();
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

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalLogger.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalLogger.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vLegalLogger.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalLogger.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalLogger> toCacheModel() {
		return _vLegalLogger.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VLegalLogger vLegalLogger) {
		return _vLegalLogger.compareTo(vLegalLogger);
	}

	@Override
	public int hashCode() {
		return _vLegalLogger.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalLogger.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalLoggerWrapper((VLegalLogger)_vLegalLogger.clone());
	}

	/**
	* Returns the content of this v legal logger.
	*
	* @return the content of this v legal logger
	*/
	@Override
	public java.lang.String getContent() {
		return _vLegalLogger.getContent();
	}

	/**
	* Returns the logger ID of this v legal logger.
	*
	* @return the logger ID of this v legal logger
	*/
	@Override
	public java.lang.String getLoggerId() {
		return _vLegalLogger.getLoggerId();
	}

	/**
	* Returns the primary key of this v legal logger.
	*
	* @return the primary key of this v legal logger
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vLegalLogger.getPrimaryKey();
	}

	/**
	* Returns the user uuid of this v legal logger.
	*
	* @return the user uuid of this v legal logger
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vLegalLogger.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalLogger.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalLogger.toXmlString();
	}

	/**
	* Returns the created date of this v legal logger.
	*
	* @return the created date of this v legal logger
	*/
	@Override
	public Date getCreatedDate() {
		return _vLegalLogger.getCreatedDate();
	}

	/**
	* Returns the company ID of this v legal logger.
	*
	* @return the company ID of this v legal logger
	*/
	@Override
	public long getCompanyId() {
		return _vLegalLogger.getCompanyId();
	}

	/**
	* Returns the created by user of this v legal logger.
	*
	* @return the created by user of this v legal logger
	*/
	@Override
	public long getCreatedByUser() {
		return _vLegalLogger.getCreatedByUser();
	}

	/**
	* Returns the group ID of this v legal logger.
	*
	* @return the group ID of this v legal logger
	*/
	@Override
	public long getGroupId() {
		return _vLegalLogger.getGroupId();
	}

	/**
	* Returns the user ID of this v legal logger.
	*
	* @return the user ID of this v legal logger
	*/
	@Override
	public long getUserId() {
		return _vLegalLogger.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalLogger toEscapedModel() {
		return new VLegalLoggerWrapper(_vLegalLogger.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalLogger toUnescapedModel() {
		return new VLegalLoggerWrapper(_vLegalLogger.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vLegalLogger.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalLogger.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this v legal logger.
	*
	* @param companyId the company ID of this v legal logger
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vLegalLogger.setCompanyId(companyId);
	}

	/**
	* Sets the content of this v legal logger.
	*
	* @param content the content of this v legal logger
	*/
	@Override
	public void setContent(java.lang.String content) {
		_vLegalLogger.setContent(content);
	}

	/**
	* Sets the created by user of this v legal logger.
	*
	* @param createdByUser the created by user of this v legal logger
	*/
	@Override
	public void setCreatedByUser(long createdByUser) {
		_vLegalLogger.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this v legal logger.
	*
	* @param createdDate the created date of this v legal logger
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vLegalLogger.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalLogger.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalLogger.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalLogger.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this v legal logger.
	*
	* @param groupId the group ID of this v legal logger
	*/
	@Override
	public void setGroupId(long groupId) {
		_vLegalLogger.setGroupId(groupId);
	}

	/**
	* Sets the logger ID of this v legal logger.
	*
	* @param loggerId the logger ID of this v legal logger
	*/
	@Override
	public void setLoggerId(java.lang.String loggerId) {
		_vLegalLogger.setLoggerId(loggerId);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalLogger.setNew(n);
	}

	/**
	* Sets the primary key of this v legal logger.
	*
	* @param primaryKey the primary key of this v legal logger
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vLegalLogger.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalLogger.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this v legal logger.
	*
	* @param userId the user ID of this v legal logger
	*/
	@Override
	public void setUserId(long userId) {
		_vLegalLogger.setUserId(userId);
	}

	/**
	* Sets the user uuid of this v legal logger.
	*
	* @param userUuid the user uuid of this v legal logger
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vLegalLogger.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalLoggerWrapper)) {
			return false;
		}

		VLegalLoggerWrapper vLegalLoggerWrapper = (VLegalLoggerWrapper)obj;

		if (Objects.equals(_vLegalLogger, vLegalLoggerWrapper._vLegalLogger)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalLogger getWrappedModel() {
		return _vLegalLogger;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalLogger.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalLogger.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalLogger.resetOriginalValues();
	}

	private final VLegalLogger _vLegalLogger;
}