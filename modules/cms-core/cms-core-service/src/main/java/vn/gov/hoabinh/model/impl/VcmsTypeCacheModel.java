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

import vn.gov.hoabinh.model.VcmsType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VcmsType in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsType
 * @generated
 */
@ProviderType
public class VcmsTypeCacheModel implements CacheModel<VcmsType>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsTypeCacheModel)) {
			return false;
		}

		VcmsTypeCacheModel vcmsTypeCacheModel = (VcmsTypeCacheModel)obj;

		if (typeId == vcmsTypeCacheModel.typeId) {
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
		StringBundler sb = new StringBundler(23);

		sb.append("{typeId=");
		sb.append(typeId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdByUser=");
		sb.append(createdByUser);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", modifiedByUser=");
		sb.append(modifiedByUser);
		sb.append(", code=");
		sb.append(code);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", language=");
		sb.append(language);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VcmsType toEntityModel() {
		VcmsTypeImpl vcmsTypeImpl = new VcmsTypeImpl();

		vcmsTypeImpl.setTypeId(typeId);
		vcmsTypeImpl.setGroupId(groupId);
		vcmsTypeImpl.setCompanyId(companyId);

		if (createdDate == Long.MIN_VALUE) {
			vcmsTypeImpl.setCreatedDate(null);
		}
		else {
			vcmsTypeImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdByUser == null) {
			vcmsTypeImpl.setCreatedByUser(StringPool.BLANK);
		}
		else {
			vcmsTypeImpl.setCreatedByUser(createdByUser);
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vcmsTypeImpl.setModifiedDate(null);
		}
		else {
			vcmsTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (modifiedByUser == null) {
			vcmsTypeImpl.setModifiedByUser(StringPool.BLANK);
		}
		else {
			vcmsTypeImpl.setModifiedByUser(modifiedByUser);
		}

		if (code == null) {
			vcmsTypeImpl.setCode(StringPool.BLANK);
		}
		else {
			vcmsTypeImpl.setCode(code);
		}

		if (name == null) {
			vcmsTypeImpl.setName(StringPool.BLANK);
		}
		else {
			vcmsTypeImpl.setName(name);
		}

		if (description == null) {
			vcmsTypeImpl.setDescription(StringPool.BLANK);
		}
		else {
			vcmsTypeImpl.setDescription(description);
		}

		if (language == null) {
			vcmsTypeImpl.setLanguage(StringPool.BLANK);
		}
		else {
			vcmsTypeImpl.setLanguage(language);
		}

		vcmsTypeImpl.resetOriginalValues();

		return vcmsTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		typeId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createdDate = objectInput.readLong();
		createdByUser = objectInput.readUTF();
		modifiedDate = objectInput.readLong();
		modifiedByUser = objectInput.readUTF();
		code = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		language = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(typeId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createdDate);

		if (createdByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createdByUser);
		}

		objectOutput.writeLong(modifiedDate);

		if (modifiedByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(modifiedByUser);
		}

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
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

		if (language == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(language);
		}
	}

	public long typeId;
	public long groupId;
	public long companyId;
	public long createdDate;
	public String createdByUser;
	public long modifiedDate;
	public String modifiedByUser;
	public String code;
	public String name;
	public String description;
	public String language;
}