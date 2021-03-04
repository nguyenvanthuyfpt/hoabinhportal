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

import vn.gov.hoabinh.model.VLegalType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VLegalType in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalType
 * @generated
 */
@ProviderType
public class VLegalTypeCacheModel implements CacheModel<VLegalType>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalTypeCacheModel)) {
			return false;
		}

		VLegalTypeCacheModel vLegalTypeCacheModel = (VLegalTypeCacheModel)obj;

		if (typeId.equals(vLegalTypeCacheModel.typeId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, typeId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{typeId=");
		sb.append(typeId);
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
		sb.append(", statusType=");
		sb.append(statusType);
		sb.append(", rssable=");
		sb.append(rssable);
		sb.append(", position=");
		sb.append(position);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VLegalType toEntityModel() {
		VLegalTypeImpl vLegalTypeImpl = new VLegalTypeImpl();

		if (typeId == null) {
			vLegalTypeImpl.setTypeId(StringPool.BLANK);
		}
		else {
			vLegalTypeImpl.setTypeId(typeId);
		}

		vLegalTypeImpl.setGroupId(groupId);
		vLegalTypeImpl.setCompanyId(companyId);
		vLegalTypeImpl.setUserId(userId);

		if (createdDate == Long.MIN_VALUE) {
			vLegalTypeImpl.setCreatedDate(null);
		}
		else {
			vLegalTypeImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vLegalTypeImpl.setModifiedDate(null);
		}
		else {
			vLegalTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		vLegalTypeImpl.setCreatedByUser(createdByUser);
		vLegalTypeImpl.setModifiedByUser(modifiedByUser);

		if (name == null) {
			vLegalTypeImpl.setName(StringPool.BLANK);
		}
		else {
			vLegalTypeImpl.setName(name);
		}

		if (description == null) {
			vLegalTypeImpl.setDescription(StringPool.BLANK);
		}
		else {
			vLegalTypeImpl.setDescription(description);
		}

		if (language == null) {
			vLegalTypeImpl.setLanguage(StringPool.BLANK);
		}
		else {
			vLegalTypeImpl.setLanguage(language);
		}

		vLegalTypeImpl.setStatusType(statusType);
		vLegalTypeImpl.setRssable(rssable);
		vLegalTypeImpl.setPosition(position);

		vLegalTypeImpl.resetOriginalValues();

		return vLegalTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		typeId = objectInput.readUTF();

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

		statusType = objectInput.readBoolean();

		rssable = objectInput.readBoolean();

		position = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (typeId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(typeId);
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

		objectOutput.writeBoolean(statusType);

		objectOutput.writeBoolean(rssable);

		objectOutput.writeInt(position);
	}

	public String typeId;
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
	public boolean statusType;
	public boolean rssable;
	public int position;
}