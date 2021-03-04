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
 * This class is a wrapper for {@link VisitorTracker}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VisitorTracker
 * @generated
 */
@ProviderType
public class VisitorTrackerWrapper implements VisitorTracker,
	ModelWrapper<VisitorTracker> {
	public VisitorTrackerWrapper(VisitorTracker visitorTracker) {
		_visitorTracker = visitorTracker;
	}

	@Override
	public Class<?> getModelClass() {
		return VisitorTracker.class;
	}

	@Override
	public String getModelClassName() {
		return VisitorTracker.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("visitorId", getVisitorId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("expiredDate", getExpiredDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long visitorId = (Long)attributes.get("visitorId");

		if (visitorId != null) {
			setVisitorId(visitorId);
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

		Date expiredDate = (Date)attributes.get("expiredDate");

		if (expiredDate != null) {
			setExpiredDate(expiredDate);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _visitorTracker.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _visitorTracker.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _visitorTracker.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _visitorTracker.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VisitorTracker> toCacheModel() {
		return _visitorTracker.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VisitorTracker visitorTracker) {
		return _visitorTracker.compareTo(visitorTracker);
	}

	@Override
	public int hashCode() {
		return _visitorTracker.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _visitorTracker.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VisitorTrackerWrapper((VisitorTracker)_visitorTracker.clone());
	}

	@Override
	public java.lang.String toString() {
		return _visitorTracker.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _visitorTracker.toXmlString();
	}

	/**
	* Returns the created date of this visitor tracker.
	*
	* @return the created date of this visitor tracker
	*/
	@Override
	public Date getCreatedDate() {
		return _visitorTracker.getCreatedDate();
	}

	/**
	* Returns the expired date of this visitor tracker.
	*
	* @return the expired date of this visitor tracker
	*/
	@Override
	public Date getExpiredDate() {
		return _visitorTracker.getExpiredDate();
	}

	/**
	* Returns the company ID of this visitor tracker.
	*
	* @return the company ID of this visitor tracker
	*/
	@Override
	public long getCompanyId() {
		return _visitorTracker.getCompanyId();
	}

	/**
	* Returns the group ID of this visitor tracker.
	*
	* @return the group ID of this visitor tracker
	*/
	@Override
	public long getGroupId() {
		return _visitorTracker.getGroupId();
	}

	/**
	* Returns the primary key of this visitor tracker.
	*
	* @return the primary key of this visitor tracker
	*/
	@Override
	public long getPrimaryKey() {
		return _visitorTracker.getPrimaryKey();
	}

	/**
	* Returns the visitor ID of this visitor tracker.
	*
	* @return the visitor ID of this visitor tracker
	*/
	@Override
	public long getVisitorId() {
		return _visitorTracker.getVisitorId();
	}

	@Override
	public vn.gov.hoabinh.model.VisitorTracker toEscapedModel() {
		return new VisitorTrackerWrapper(_visitorTracker.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VisitorTracker toUnescapedModel() {
		return new VisitorTrackerWrapper(_visitorTracker.toUnescapedModel());
	}

	@Override
	public void persist() {
		_visitorTracker.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_visitorTracker.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this visitor tracker.
	*
	* @param companyId the company ID of this visitor tracker
	*/
	@Override
	public void setCompanyId(long companyId) {
		_visitorTracker.setCompanyId(companyId);
	}

	/**
	* Sets the created date of this visitor tracker.
	*
	* @param createdDate the created date of this visitor tracker
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_visitorTracker.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_visitorTracker.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_visitorTracker.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_visitorTracker.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expired date of this visitor tracker.
	*
	* @param expiredDate the expired date of this visitor tracker
	*/
	@Override
	public void setExpiredDate(Date expiredDate) {
		_visitorTracker.setExpiredDate(expiredDate);
	}

	/**
	* Sets the group ID of this visitor tracker.
	*
	* @param groupId the group ID of this visitor tracker
	*/
	@Override
	public void setGroupId(long groupId) {
		_visitorTracker.setGroupId(groupId);
	}

	@Override
	public void setNew(boolean n) {
		_visitorTracker.setNew(n);
	}

	/**
	* Sets the primary key of this visitor tracker.
	*
	* @param primaryKey the primary key of this visitor tracker
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_visitorTracker.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_visitorTracker.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the visitor ID of this visitor tracker.
	*
	* @param visitorId the visitor ID of this visitor tracker
	*/
	@Override
	public void setVisitorId(long visitorId) {
		_visitorTracker.setVisitorId(visitorId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VisitorTrackerWrapper)) {
			return false;
		}

		VisitorTrackerWrapper visitorTrackerWrapper = (VisitorTrackerWrapper)obj;

		if (Objects.equals(_visitorTracker,
					visitorTrackerWrapper._visitorTracker)) {
			return true;
		}

		return false;
	}

	@Override
	public VisitorTracker getWrappedModel() {
		return _visitorTracker;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _visitorTracker.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _visitorTracker.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_visitorTracker.resetOriginalValues();
	}

	private final VisitorTracker _visitorTracker;
}