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

import vn.gov.hoabinh.model.vdocField;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing vdocField in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see vdocField
 * @generated
 */
@ProviderType
public class vdocFieldCacheModel implements CacheModel<vdocField>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof vdocFieldCacheModel)) {
			return false;
		}

		vdocFieldCacheModel vdocFieldCacheModel = (vdocFieldCacheModel)obj;

		if (fieldId.equals(vdocFieldCacheModel.fieldId)) {
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
		StringBundler sb = new StringBundler(33);

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
		sb.append(", parentId=");
		sb.append(parentId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", language=");
		sb.append(language);
		sb.append(", statusField=");
		sb.append(statusField);
		sb.append(", position=");
		sb.append(position);
		sb.append(", listparent=");
		sb.append(listparent);
		sb.append(", levels=");
		sb.append(levels);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public vdocField toEntityModel() {
		vdocFieldImpl vdocFieldImpl = new vdocFieldImpl();

		if (fieldId == null) {
			vdocFieldImpl.setFieldId(StringPool.BLANK);
		}
		else {
			vdocFieldImpl.setFieldId(fieldId);
		}

		vdocFieldImpl.setGroupId(groupId);
		vdocFieldImpl.setCompanyId(companyId);
		vdocFieldImpl.setUserId(userId);

		if (createdDate == Long.MIN_VALUE) {
			vdocFieldImpl.setCreatedDate(null);
		}
		else {
			vdocFieldImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vdocFieldImpl.setModifiedDate(null);
		}
		else {
			vdocFieldImpl.setModifiedDate(new Date(modifiedDate));
		}

		vdocFieldImpl.setCreatedByUser(createdByUser);
		vdocFieldImpl.setModifiedByUser(modifiedByUser);

		if (parentId == null) {
			vdocFieldImpl.setParentId(StringPool.BLANK);
		}
		else {
			vdocFieldImpl.setParentId(parentId);
		}

		if (name == null) {
			vdocFieldImpl.setName(StringPool.BLANK);
		}
		else {
			vdocFieldImpl.setName(name);
		}

		if (description == null) {
			vdocFieldImpl.setDescription(StringPool.BLANK);
		}
		else {
			vdocFieldImpl.setDescription(description);
		}

		if (language == null) {
			vdocFieldImpl.setLanguage(StringPool.BLANK);
		}
		else {
			vdocFieldImpl.setLanguage(language);
		}

		vdocFieldImpl.setStatusField(statusField);
		vdocFieldImpl.setPosition(position);

		if (listparent == null) {
			vdocFieldImpl.setListparent(StringPool.BLANK);
		}
		else {
			vdocFieldImpl.setListparent(listparent);
		}

		if (levels == null) {
			vdocFieldImpl.setLevels(StringPool.BLANK);
		}
		else {
			vdocFieldImpl.setLevels(levels);
		}

		vdocFieldImpl.resetOriginalValues();

		return vdocFieldImpl;
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
		parentId = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		language = objectInput.readUTF();

		statusField = objectInput.readBoolean();

		position = objectInput.readInt();
		listparent = objectInput.readUTF();
		levels = objectInput.readUTF();
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

		if (parentId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(parentId);
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

		objectOutput.writeBoolean(statusField);

		objectOutput.writeInt(position);

		if (listparent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(listparent);
		}

		if (levels == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(levels);
		}
	}

	public String fieldId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createdDate;
	public long modifiedDate;
	public long createdByUser;
	public long modifiedByUser;
	public String parentId;
	public String name;
	public String description;
	public String language;
	public boolean statusField;
	public int position;
	public String listparent;
	public String levels;
}