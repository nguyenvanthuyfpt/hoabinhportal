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

import vn.gov.hoabinh.model.VcmsPortion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VcmsPortion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsPortion
 * @generated
 */
@ProviderType
public class VcmsPortionCacheModel implements CacheModel<VcmsPortion>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsPortionCacheModel)) {
			return false;
		}

		VcmsPortionCacheModel vcmsPortionCacheModel = (VcmsPortionCacheModel)obj;

		if (portionId.equals(vcmsPortionCacheModel.portionId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, portionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{portionId=");
		sb.append(portionId);
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
		sb.append(", categorizable=");
		sb.append(categorizable);
		sb.append(", language=");
		sb.append(language);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VcmsPortion toEntityModel() {
		VcmsPortionImpl vcmsPortionImpl = new VcmsPortionImpl();

		if (portionId == null) {
			vcmsPortionImpl.setPortionId(StringPool.BLANK);
		}
		else {
			vcmsPortionImpl.setPortionId(portionId);
		}

		vcmsPortionImpl.setGroupId(groupId);
		vcmsPortionImpl.setCompanyId(companyId);

		if (createdDate == Long.MIN_VALUE) {
			vcmsPortionImpl.setCreatedDate(null);
		}
		else {
			vcmsPortionImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdByUser == null) {
			vcmsPortionImpl.setCreatedByUser(StringPool.BLANK);
		}
		else {
			vcmsPortionImpl.setCreatedByUser(createdByUser);
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vcmsPortionImpl.setModifiedDate(null);
		}
		else {
			vcmsPortionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (modifiedByUser == null) {
			vcmsPortionImpl.setModifiedByUser(StringPool.BLANK);
		}
		else {
			vcmsPortionImpl.setModifiedByUser(modifiedByUser);
		}

		if (code == null) {
			vcmsPortionImpl.setCode(StringPool.BLANK);
		}
		else {
			vcmsPortionImpl.setCode(code);
		}

		if (name == null) {
			vcmsPortionImpl.setName(StringPool.BLANK);
		}
		else {
			vcmsPortionImpl.setName(name);
		}

		if (description == null) {
			vcmsPortionImpl.setDescription(StringPool.BLANK);
		}
		else {
			vcmsPortionImpl.setDescription(description);
		}

		vcmsPortionImpl.setCategorizable(categorizable);

		if (language == null) {
			vcmsPortionImpl.setLanguage(StringPool.BLANK);
		}
		else {
			vcmsPortionImpl.setLanguage(language);
		}

		vcmsPortionImpl.resetOriginalValues();

		return vcmsPortionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		portionId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createdDate = objectInput.readLong();
		createdByUser = objectInput.readUTF();
		modifiedDate = objectInput.readLong();
		modifiedByUser = objectInput.readUTF();
		code = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();

		categorizable = objectInput.readBoolean();
		language = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (portionId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portionId);
		}

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

		objectOutput.writeBoolean(categorizable);

		if (language == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(language);
		}
	}

	public String portionId;
	public long groupId;
	public long companyId;
	public long createdDate;
	public String createdByUser;
	public long modifiedDate;
	public String modifiedByUser;
	public String code;
	public String name;
	public String description;
	public boolean categorizable;
	public String language;
}