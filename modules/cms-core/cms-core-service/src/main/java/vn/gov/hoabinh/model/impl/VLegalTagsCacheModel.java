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

import vn.gov.hoabinh.model.VLegalTags;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VLegalTags in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTags
 * @generated
 */
@ProviderType
public class VLegalTagsCacheModel implements CacheModel<VLegalTags>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalTagsCacheModel)) {
			return false;
		}

		VLegalTagsCacheModel vLegalTagsCacheModel = (VLegalTagsCacheModel)obj;

		if (tagId.equals(vLegalTagsCacheModel.tagId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tagId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{tagId=");
		sb.append(tagId);
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
		sb.append(", name=");
		sb.append(name);
		sb.append(", statusTags=");
		sb.append(statusTags);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VLegalTags toEntityModel() {
		VLegalTagsImpl vLegalTagsImpl = new VLegalTagsImpl();

		if (tagId == null) {
			vLegalTagsImpl.setTagId(StringPool.BLANK);
		}
		else {
			vLegalTagsImpl.setTagId(tagId);
		}

		vLegalTagsImpl.setGroupId(groupId);
		vLegalTagsImpl.setCompanyId(companyId);
		vLegalTagsImpl.setUserId(userId);

		if (createdDate == Long.MIN_VALUE) {
			vLegalTagsImpl.setCreatedDate(null);
		}
		else {
			vLegalTagsImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vLegalTagsImpl.setModifiedDate(null);
		}
		else {
			vLegalTagsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			vLegalTagsImpl.setName(StringPool.BLANK);
		}
		else {
			vLegalTagsImpl.setName(name);
		}

		vLegalTagsImpl.setStatusTags(statusTags);

		vLegalTagsImpl.resetOriginalValues();

		return vLegalTagsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		tagId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createdDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();

		statusTags = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (tagId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tagId);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeBoolean(statusTags);
	}

	public String tagId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createdDate;
	public long modifiedDate;
	public String name;
	public boolean statusTags;
}