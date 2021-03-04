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

import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VisitorTracker service. Represents a row in the &quot;VisitorTracker&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gov.hoabinh.model.impl.VisitorTrackerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gov.hoabinh.model.impl.VisitorTrackerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VisitorTracker
 * @see vn.gov.hoabinh.model.impl.VisitorTrackerImpl
 * @see vn.gov.hoabinh.model.impl.VisitorTrackerModelImpl
 * @generated
 */
@ProviderType
public interface VisitorTrackerModel extends BaseModel<VisitorTracker>,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a visitor tracker model instance should use the {@link VisitorTracker} interface instead.
	 */

	/**
	 * Returns the primary key of this visitor tracker.
	 *
	 * @return the primary key of this visitor tracker
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this visitor tracker.
	 *
	 * @param primaryKey the primary key of this visitor tracker
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the visitor ID of this visitor tracker.
	 *
	 * @return the visitor ID of this visitor tracker
	 */
	public long getVisitorId();

	/**
	 * Sets the visitor ID of this visitor tracker.
	 *
	 * @param visitorId the visitor ID of this visitor tracker
	 */
	public void setVisitorId(long visitorId);

	/**
	 * Returns the company ID of this visitor tracker.
	 *
	 * @return the company ID of this visitor tracker
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this visitor tracker.
	 *
	 * @param companyId the company ID of this visitor tracker
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this visitor tracker.
	 *
	 * @return the group ID of this visitor tracker
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this visitor tracker.
	 *
	 * @param groupId the group ID of this visitor tracker
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the created date of this visitor tracker.
	 *
	 * @return the created date of this visitor tracker
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this visitor tracker.
	 *
	 * @param createdDate the created date of this visitor tracker
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the expired date of this visitor tracker.
	 *
	 * @return the expired date of this visitor tracker
	 */
	public Date getExpiredDate();

	/**
	 * Sets the expired date of this visitor tracker.
	 *
	 * @param expiredDate the expired date of this visitor tracker
	 */
	public void setExpiredDate(Date expiredDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(vn.gov.hoabinh.model.VisitorTracker visitorTracker);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.gov.hoabinh.model.VisitorTracker> toCacheModel();

	@Override
	public vn.gov.hoabinh.model.VisitorTracker toEscapedModel();

	@Override
	public vn.gov.hoabinh.model.VisitorTracker toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}