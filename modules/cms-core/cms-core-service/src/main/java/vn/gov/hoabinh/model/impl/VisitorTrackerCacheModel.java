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

package vn.gov.hoabinh.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import vn.gov.hoabinh.model.VisitorTracker;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VisitorTracker in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VisitorTracker
 * @generated
 */
@ProviderType
public class VisitorTrackerCacheModel implements CacheModel<VisitorTracker>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VisitorTrackerCacheModel)) {
			return false;
		}

		VisitorTrackerCacheModel visitorTrackerCacheModel = (VisitorTrackerCacheModel)obj;

		if (visitorId == visitorTrackerCacheModel.visitorId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, visitorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{visitorId=");
		sb.append(visitorId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", expiredDate=");
		sb.append(expiredDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VisitorTracker toEntityModel() {
		VisitorTrackerImpl visitorTrackerImpl = new VisitorTrackerImpl();

		visitorTrackerImpl.setVisitorId(visitorId);
		visitorTrackerImpl.setCompanyId(companyId);
		visitorTrackerImpl.setGroupId(groupId);

		if (createdDate == Long.MIN_VALUE) {
			visitorTrackerImpl.setCreatedDate(null);
		}
		else {
			visitorTrackerImpl.setCreatedDate(new Date(createdDate));
		}

		if (expiredDate == Long.MIN_VALUE) {
			visitorTrackerImpl.setExpiredDate(null);
		}
		else {
			visitorTrackerImpl.setExpiredDate(new Date(expiredDate));
		}

		visitorTrackerImpl.resetOriginalValues();

		return visitorTrackerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		visitorId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();
		createdDate = objectInput.readLong();
		expiredDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(visitorId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(expiredDate);
	}

	public long visitorId;
	public long companyId;
	public long groupId;
	public long createdDate;
	public long expiredDate;
}