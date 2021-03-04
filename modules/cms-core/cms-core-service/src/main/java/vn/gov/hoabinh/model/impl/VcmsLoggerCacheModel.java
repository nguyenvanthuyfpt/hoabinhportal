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

import vn.gov.hoabinh.model.VcmsLogger;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VcmsLogger in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsLogger
 * @generated
 */
@ProviderType
public class VcmsLoggerCacheModel implements CacheModel<VcmsLogger>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsLoggerCacheModel)) {
			return false;
		}

		VcmsLoggerCacheModel vcmsLoggerCacheModel = (VcmsLoggerCacheModel)obj;

		if (loggerId.equals(vcmsLoggerCacheModel.loggerId)) {
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
		StringBundler sb = new StringBundler(17);

		sb.append("{loggerId=");
		sb.append(loggerId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", entryId=");
		sb.append(entryId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdByUser=");
		sb.append(createdByUser);
		sb.append(", classEntry=");
		sb.append(classEntry);
		sb.append(", content=");
		sb.append(content);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VcmsLogger toEntityModel() {
		VcmsLoggerImpl vcmsLoggerImpl = new VcmsLoggerImpl();

		if (loggerId == null) {
			vcmsLoggerImpl.setLoggerId(StringPool.BLANK);
		}
		else {
			vcmsLoggerImpl.setLoggerId(loggerId);
		}

		vcmsLoggerImpl.setGroupId(groupId);
		vcmsLoggerImpl.setCompanyId(companyId);

		if (entryId == null) {
			vcmsLoggerImpl.setEntryId(StringPool.BLANK);
		}
		else {
			vcmsLoggerImpl.setEntryId(entryId);
		}

		if (createdDate == Long.MIN_VALUE) {
			vcmsLoggerImpl.setCreatedDate(null);
		}
		else {
			vcmsLoggerImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdByUser == null) {
			vcmsLoggerImpl.setCreatedByUser(StringPool.BLANK);
		}
		else {
			vcmsLoggerImpl.setCreatedByUser(createdByUser);
		}

		if (classEntry == null) {
			vcmsLoggerImpl.setClassEntry(StringPool.BLANK);
		}
		else {
			vcmsLoggerImpl.setClassEntry(classEntry);
		}

		if (content == null) {
			vcmsLoggerImpl.setContent(StringPool.BLANK);
		}
		else {
			vcmsLoggerImpl.setContent(content);
		}

		vcmsLoggerImpl.resetOriginalValues();

		return vcmsLoggerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		loggerId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		entryId = objectInput.readUTF();
		createdDate = objectInput.readLong();
		createdByUser = objectInput.readUTF();
		classEntry = objectInput.readUTF();
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

		if (entryId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(entryId);
		}

		objectOutput.writeLong(createdDate);

		if (createdByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createdByUser);
		}

		if (classEntry == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(classEntry);
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
	public String entryId;
	public long createdDate;
	public String createdByUser;
	public String classEntry;
	public String content;
}