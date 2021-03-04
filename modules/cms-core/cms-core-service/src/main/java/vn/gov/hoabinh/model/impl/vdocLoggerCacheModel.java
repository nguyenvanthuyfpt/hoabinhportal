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

import vn.gov.hoabinh.model.vdocLogger;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing vdocLogger in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see vdocLogger
 * @generated
 */
@ProviderType
public class vdocLoggerCacheModel implements CacheModel<vdocLogger>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof vdocLoggerCacheModel)) {
			return false;
		}

		vdocLoggerCacheModel vdocLoggerCacheModel = (vdocLoggerCacheModel)obj;

		if (loggerId.equals(vdocLoggerCacheModel.loggerId)) {
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
		StringBundler sb = new StringBundler(19);

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
		sb.append(", entryId=");
		sb.append(entryId);
		sb.append(", className=");
		sb.append(className);
		sb.append(", content=");
		sb.append(content);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public vdocLogger toEntityModel() {
		vdocLoggerImpl vdocLoggerImpl = new vdocLoggerImpl();

		if (loggerId == null) {
			vdocLoggerImpl.setLoggerId(StringPool.BLANK);
		}
		else {
			vdocLoggerImpl.setLoggerId(loggerId);
		}

		vdocLoggerImpl.setGroupId(groupId);
		vdocLoggerImpl.setCompanyId(companyId);
		vdocLoggerImpl.setUserId(userId);

		if (createdDate == Long.MIN_VALUE) {
			vdocLoggerImpl.setCreatedDate(null);
		}
		else {
			vdocLoggerImpl.setCreatedDate(new Date(createdDate));
		}

		vdocLoggerImpl.setCreatedByUser(createdByUser);

		if (entryId == null) {
			vdocLoggerImpl.setEntryId(StringPool.BLANK);
		}
		else {
			vdocLoggerImpl.setEntryId(entryId);
		}

		if (className == null) {
			vdocLoggerImpl.setClassName(StringPool.BLANK);
		}
		else {
			vdocLoggerImpl.setClassName(className);
		}

		if (content == null) {
			vdocLoggerImpl.setContent(StringPool.BLANK);
		}
		else {
			vdocLoggerImpl.setContent(content);
		}

		vdocLoggerImpl.resetOriginalValues();

		return vdocLoggerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		loggerId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createdDate = objectInput.readLong();

		createdByUser = objectInput.readLong();
		entryId = objectInput.readUTF();
		className = objectInput.readUTF();
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

		if (entryId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(entryId);
		}

		if (className == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(className);
		}

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
	public String entryId;
	public String className;
	public String content;
}