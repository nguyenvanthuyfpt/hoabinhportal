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

import vn.gov.hoabinh.model.VLegalField;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VLegalField in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalField
 * @generated
 */
@ProviderType
public class VLegalFieldCacheModel implements CacheModel<VLegalField>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalFieldCacheModel)) {
			return false;
		}

		VLegalFieldCacheModel vLegalFieldCacheModel = (VLegalFieldCacheModel)obj;

		if (fieldId.equals(vLegalFieldCacheModel.fieldId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fieldId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{fieldId=");
		sb.append(fieldId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", createdByUser=");
		sb.append(createdByUser);
		sb.append(", modifiedByUser=");
		sb.append(modifiedByUser);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", language=");
		sb.append(language);
		sb.append(", statusField=");
		sb.append(statusField);
		sb.append(", rssable=");
		sb.append(rssable);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VLegalField toEntityModel() {
		VLegalFieldImpl vLegalFieldImpl = new VLegalFieldImpl();

		if (fieldId == null) {
			vLegalFieldImpl.setFieldId(StringPool.BLANK);
		}
		else {
			vLegalFieldImpl.setFieldId(fieldId);
		}

		vLegalFieldImpl.setGroupId(groupId);
		vLegalFieldImpl.setCompanyId(companyId);
		vLegalFieldImpl.setUserId(userId);

		if (createdDate == Long.MIN_VALUE) {
			vLegalFieldImpl.setCreatedDate(null);
		}
		else {
			vLegalFieldImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vLegalFieldImpl.setModifiedDate(null);
		}
		else {
			vLegalFieldImpl.setModifiedDate(new Date(modifiedDate));
		}

		vLegalFieldImpl.setCreatedByUser(createdByUser);
		vLegalFieldImpl.setModifiedByUser(modifiedByUser);

		if (name == null) {
			vLegalFieldImpl.setName(StringPool.BLANK);
		}
		else {
			vLegalFieldImpl.setName(name);
		}

		if (description == null) {
			vLegalFieldImpl.setDescription(StringPool.BLANK);
		}
		else {
			vLegalFieldImpl.setDescription(description);
		}

		if (language == null) {
			vLegalFieldImpl.setLanguage(StringPool.BLANK);
		}
		else {
			vLegalFieldImpl.setLanguage(language);
		}

		vLegalFieldImpl.setStatusField(statusField);
		vLegalFieldImpl.setRssable(rssable);

		vLegalFieldImpl.resetOriginalValues();

		return vLegalFieldImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fieldId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createdDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		createdByUser = objectInput.readLong();

		modifiedByUser = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		language = objectInput.readUTF();

		statusField = objectInput.readBoolean();

		rssable = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (fieldId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fieldId);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(createdByUser);

		objectOutput.writeLong(modifiedByUser);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (language == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(language);
		}

		objectOutput.writeBoolean(statusField);

		objectOutput.writeBoolean(rssable);
	}

	public String fieldId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createdDate;
	public long modifiedDate;
	public long createdByUser;
	public long modifiedByUser;
	public String name;
	public String description;
	public String language;
	public boolean statusField;
	public boolean rssable;
}