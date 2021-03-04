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

import vn.gov.hoabinh.model.Clip;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Clip in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Clip
 * @generated
 */
@ProviderType
public class ClipCacheModel implements CacheModel<Clip>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ClipCacheModel)) {
			return false;
		}

		ClipCacheModel clipCacheModel = (ClipCacheModel)obj;

		if (id.equals(clipCacheModel.id)) {
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
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(id);
		sb.append(", clipTypeId=");
		sb.append(clipTypeId);
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
		sb.append(", url=");
		sb.append(url);
		sb.append(", name=");
		sb.append(name);
		sb.append(", title=");
		sb.append(title);
		sb.append(", image=");
		sb.append(image);
		sb.append(", description=");
		sb.append(description);
		sb.append(", active=");
		sb.append(active);
		sb.append(", language=");
		sb.append(language);
		sb.append(", hitcount=");
		sb.append(hitcount);
		sb.append(", hitcountview=");
		sb.append(hitcountview);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Clip toEntityModel() {
		ClipImpl clipImpl = new ClipImpl();

		if (id == null) {
			clipImpl.setId(StringPool.BLANK);
		}
		else {
			clipImpl.setId(id);
		}

		if (clipTypeId == null) {
			clipImpl.setClipTypeId(StringPool.BLANK);
		}
		else {
			clipImpl.setClipTypeId(clipTypeId);
		}

		clipImpl.setGroupId(groupId);
		clipImpl.setCompanyId(companyId);
		clipImpl.setUserId(userId);

		if (createdDate == Long.MIN_VALUE) {
			clipImpl.setCreatedDate(null);
		}
		else {
			clipImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			clipImpl.setModifiedDate(null);
		}
		else {
			clipImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (url == null) {
			clipImpl.setUrl(StringPool.BLANK);
		}
		else {
			clipImpl.setUrl(url);
		}

		if (name == null) {
			clipImpl.setName(StringPool.BLANK);
		}
		else {
			clipImpl.setName(name);
		}

		if (title == null) {
			clipImpl.setTitle(StringPool.BLANK);
		}
		else {
			clipImpl.setTitle(title);
		}

		if (image == null) {
			clipImpl.setImage(StringPool.BLANK);
		}
		else {
			clipImpl.setImage(image);
		}

		if (description == null) {
			clipImpl.setDescription(StringPool.BLANK);
		}
		else {
			clipImpl.setDescription(description);
		}

		clipImpl.setActive(active);

		if (language == null) {
			clipImpl.setLanguage(StringPool.BLANK);
		}
		else {
			clipImpl.setLanguage(language);
		}

		clipImpl.setHitcount(hitcount);
		clipImpl.setHitcountview(hitcountview);

		clipImpl.resetOriginalValues();

		return clipImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readUTF();
		clipTypeId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createdDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		url = objectInput.readUTF();
		name = objectInput.readUTF();
		title = objectInput.readUTF();
		image = objectInput.readUTF();
		description = objectInput.readUTF();

		active = objectInput.readBoolean();
		language = objectInput.readUTF();

		hitcount = objectInput.readInt();

		hitcountview = objectInput.readInt();
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

		if (clipTypeId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(clipTypeId);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(modifiedDate);

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (image == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(image);
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

		objectOutput.writeInt(hitcount);

		objectOutput.writeInt(hitcountview);
	}

	public String id;
	public String clipTypeId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createdDate;
	public long modifiedDate;
	public String url;
	public String name;
	public String title;
	public String image;
	public String description;
	public boolean active;
	public String language;
	public int hitcount;
	public int hitcountview;
}