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

import vn.gov.hoabinh.model.vdocLevel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing vdocLevel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see vdocLevel
 * @generated
 */
@ProviderType
public class vdocLevelCacheModel implements CacheModel<vdocLevel>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof vdocLevelCacheModel)) {
			return false;
		}

		vdocLevelCacheModel vdocLevelCacheModel = (vdocLevelCacheModel)obj;

		if (levelId.equals(vdocLevelCacheModel.levelId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, levelId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{levelId=");
		sb.append(levelId);
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
		sb.append(", description=");
		sb.append(description);
		sb.append(", language=");
		sb.append(language);
		sb.append(", position=");
		sb.append(position);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public vdocLevel toEntityModel() {
		vdocLevelImpl vdocLevelImpl = new vdocLevelImpl();

		if (levelId == null) {
			vdocLevelImpl.setLevelId(StringPool.BLANK);
		}
		else {
			vdocLevelImpl.setLevelId(levelId);
		}

		vdocLevelImpl.setGroupId(groupId);
		vdocLevelImpl.setCompanyId(companyId);
		vdocLevelImpl.setUserId(userId);

		if (createdDate == Long.MIN_VALUE) {
			vdocLevelImpl.setCreatedDate(null);
		}
		else {
			vdocLevelImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vdocLevelImpl.setModifiedDate(null);
		}
		else {
			vdocLevelImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			vdocLevelImpl.setName(StringPool.BLANK);
		}
		else {
			vdocLevelImpl.setName(name);
		}

		if (description == null) {
			vdocLevelImpl.setDescription(StringPool.BLANK);
		}
		else {
			vdocLevelImpl.setDescription(description);
		}

		if (language == null) {
			vdocLevelImpl.setLanguage(StringPool.BLANK);
		}
		else {
			vdocLevelImpl.setLanguage(language);
		}

		vdocLevelImpl.setPosition(position);

		vdocLevelImpl.resetOriginalValues();

		return vdocLevelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		levelId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createdDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		language = objectInput.readUTF();

		position = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (levelId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(levelId);
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

		objectOutput.writeInt(position);
	}

	public String levelId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createdDate;
	public long modifiedDate;
	public String name;
	public String description;
	public String language;
	public int position;
}