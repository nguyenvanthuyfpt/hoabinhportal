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

import vn.gov.hoabinh.model.LinkGroup;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing LinkGroup in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see LinkGroup
 * @generated
 */
@ProviderType
public class LinkGroupCacheModel implements CacheModel<LinkGroup>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LinkGroupCacheModel)) {
			return false;
		}

		LinkGroupCacheModel linkGroupCacheModel = (LinkGroupCacheModel)obj;

		if (linkgroupId == linkGroupCacheModel.linkgroupId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, linkgroupId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{linkgroupId=");
		sb.append(linkgroupId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", position=");
		sb.append(position);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LinkGroup toEntityModel() {
		LinkGroupImpl linkGroupImpl = new LinkGroupImpl();

		linkGroupImpl.setLinkgroupId(linkgroupId);
		linkGroupImpl.setGroupId(groupId);
		linkGroupImpl.setCompanyId(companyId);

		if (createdDate == Long.MIN_VALUE) {
			linkGroupImpl.setCreatedDate(null);
		}
		else {
			linkGroupImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			linkGroupImpl.setModifiedDate(null);
		}
		else {
			linkGroupImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			linkGroupImpl.setName(StringPool.BLANK);
		}
		else {
			linkGroupImpl.setName(name);
		}

		if (description == null) {
			linkGroupImpl.setDescription(StringPool.BLANK);
		}
		else {
			linkGroupImpl.setDescription(description);
		}

		linkGroupImpl.setPosition(position);

		linkGroupImpl.resetOriginalValues();

		return linkGroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		linkgroupId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createdDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();

		position = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(linkgroupId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(modifiedDate);

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

		objectOutput.writeInt(position);
	}

	public long linkgroupId;
	public long groupId;
	public long companyId;
	public long createdDate;
	public long modifiedDate;
	public String name;
	public String description;
	public int position;
}