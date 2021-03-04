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
import com.liferay.portal.kernel.util.StringPool;

import vn.gov.hoabinh.model.VLegalLogger;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VLegalLogger in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalLogger
 * @generated
 */
@ProviderType
public class VLegalLoggerCacheModel implements CacheModel<VLegalLogger>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalLoggerCacheModel)) {
			return false;
		}

		VLegalLoggerCacheModel vLegalLoggerCacheModel = (VLegalLoggerCacheModel)obj;

		if (loggerId.equals(vLegalLoggerCacheModel.loggerId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, loggerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{loggerId=");
		sb.append(loggerId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdByUser=");
		sb.append(createdByUser);
		sb.append(", content=");
		sb.append(content);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VLegalLogger toEntityModel() {
		VLegalLoggerImpl vLegalLoggerImpl = new VLegalLoggerImpl();

		if (loggerId == null) {
			vLegalLoggerImpl.setLoggerId(StringPool.BLANK);
		}
		else {
			vLegalLoggerImpl.setLoggerId(loggerId);
		}

		vLegalLoggerImpl.setGroupId(groupId);
		vLegalLoggerImpl.setCompanyId(companyId);
		vLegalLoggerImpl.setUserId(userId);

		if (createdDate == Long.MIN_VALUE) {
			vLegalLoggerImpl.setCreatedDate(null);
		}
		else {
			vLegalLoggerImpl.setCreatedDate(new Date(createdDate));
		}

		vLegalLoggerImpl.setCreatedByUser(createdByUser);

		if (content == null) {
			vLegalLoggerImpl.setContent(StringPool.BLANK);
		}
		else {
			vLegalLoggerImpl.setContent(content);
		}

		vLegalLoggerImpl.resetOriginalValues();

		return vLegalLoggerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		loggerId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createdDate = objectInput.readLong();

		createdByUser = objectInput.readLong();
		content = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (loggerId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(loggerId);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createdDate);

		objectOutput.writeLong(createdByUser);

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}
	}

	public String loggerId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createdDate;
	public long createdByUser;
	public String content;
}