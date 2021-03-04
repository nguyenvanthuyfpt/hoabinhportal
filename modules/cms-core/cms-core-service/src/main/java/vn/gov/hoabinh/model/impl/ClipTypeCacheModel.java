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

import vn.gov.hoabinh.model.ClipType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ClipType in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ClipType
 * @generated
 */
@ProviderType
public class ClipTypeCacheModel implements CacheModel<ClipType>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ClipTypeCacheModel)) {
			return false;
		}

		ClipTypeCacheModel clipTypeCacheModel = (ClipTypeCacheModel)obj;

		if (id.equals(clipTypeCacheModel.id)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
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
		sb.append(", title=");
		sb.append(title);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", active=");
		sb.append(active);
		sb.append(", language=");
		sb.append(language);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ClipType toEntityModel() {
		ClipTypeImpl clipTypeImpl = new ClipTypeImpl();

		if (id == null) {
			clipTypeImpl.setId(StringPool.BLANK);
		}
		else {
			clipTypeImpl.setId(id);
		}

		clipTypeImpl.setGroupId(groupId);
		clipTypeImpl.setCompanyId(companyId);
		clipTypeImpl.setUserId(userId);

		if (createdDate == Long.MIN_VALUE) {
			clipTypeImpl.setCreatedDate(null);
		}
		else {
			clipTypeImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			clipTypeImpl.setModifiedDate(null);
		}
		else {
			clipTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (title == null) {
			clipTypeImpl.setTitle(StringPool.BLANK);
		}
		else {
			clipTypeImpl.setTitle(title);
		}

		if (name == null) {
			clipTypeImpl.setName(StringPool.BLANK);
		}
		else {
			clipTypeImpl.setName(name);
		}

		if (description == null) {
			clipTypeImpl.setDescription(StringPool.BLANK);
		}
		else {
			clipTypeImpl.setDescription(description);
		}

		clipTypeImpl.setActive(active);

		if (language == null) {
			clipTypeImpl.setLanguage(StringPool.BLANK);
		}
		else {
			clipTypeImpl.setLanguage(language);
		}

		clipTypeImpl.resetOriginalValues();

		return clipTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createdDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		title = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();

		active = objectInput.readBoolean();
		language = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (id == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(id);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(modifiedDate);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

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

		objectOutput.writeBoolean(active);

		if (language == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(language);
		}
	}

	public String id;
	public long groupId;
	public long companyId;
	public long userId;
	public long createdDate;
	public long modifiedDate;
	public String title;
	public String name;
	public String description;
	public boolean active;
	public String language;
}