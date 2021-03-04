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

import vn.gov.hoabinh.model.vdocOrg;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing vdocOrg in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see vdocOrg
 * @generated
 */
@ProviderType
public class vdocOrgCacheModel implements CacheModel<vdocOrg>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof vdocOrgCacheModel)) {
			return false;
		}

		vdocOrgCacheModel vdocOrgCacheModel = (vdocOrgCacheModel)obj;

		if (orgId.equals(vdocOrgCacheModel.orgId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, orgId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{orgId=");
		sb.append(orgId);
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
		sb.append(", code=");
		sb.append(code);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", address=");
		sb.append(address);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", fax=");
		sb.append(fax);
		sb.append(", language=");
		sb.append(language);
		sb.append(", statusOrg=");
		sb.append(statusOrg);
		sb.append(", position=");
		sb.append(position);
		sb.append(", listparent=");
		sb.append(listparent);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public vdocOrg toEntityModel() {
		vdocOrgImpl vdocOrgImpl = new vdocOrgImpl();

		if (orgId == null) {
			vdocOrgImpl.setOrgId(StringPool.BLANK);
		}
		else {
			vdocOrgImpl.setOrgId(orgId);
		}

		vdocOrgImpl.setGroupId(groupId);
		vdocOrgImpl.setCompanyId(companyId);
		vdocOrgImpl.setUserId(userId);

		if (createdDate == Long.MIN_VALUE) {
			vdocOrgImpl.setCreatedDate(null);
		}
		else {
			vdocOrgImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vdocOrgImpl.setModifiedDate(null);
		}
		else {
			vdocOrgImpl.setModifiedDate(new Date(modifiedDate));
		}

		vdocOrgImpl.setCreatedByUser(createdByUser);
		vdocOrgImpl.setModifiedByUser(modifiedByUser);

		if (parentId == null) {
			vdocOrgImpl.setParentId(StringPool.BLANK);
		}
		else {
			vdocOrgImpl.setParentId(parentId);
		}

		if (code == null) {
			vdocOrgImpl.setCode(StringPool.BLANK);
		}
		else {
			vdocOrgImpl.setCode(code);
		}

		if (name == null) {
			vdocOrgImpl.setName(StringPool.BLANK);
		}
		else {
			vdocOrgImpl.setName(name);
		}

		if (description == null) {
			vdocOrgImpl.setDescription(StringPool.BLANK);
		}
		else {
			vdocOrgImpl.setDescription(description);
		}

		if (address == null) {
			vdocOrgImpl.setAddress(StringPool.BLANK);
		}
		else {
			vdocOrgImpl.setAddress(address);
		}

		if (phone == null) {
			vdocOrgImpl.setPhone(StringPool.BLANK);
		}
		else {
			vdocOrgImpl.setPhone(phone);
		}

		if (fax == null) {
			vdocOrgImpl.setFax(StringPool.BLANK);
		}
		else {
			vdocOrgImpl.setFax(fax);
		}

		if (language == null) {
			vdocOrgImpl.setLanguage(StringPool.BLANK);
		}
		else {
			vdocOrgImpl.setLanguage(language);
		}

		vdocOrgImpl.setStatusOrg(statusOrg);
		vdocOrgImpl.setPosition(position);

		if (listparent == null) {
			vdocOrgImpl.setListparent(StringPool.BLANK);
		}
		else {
			vdocOrgImpl.setListparent(listparent);
		}

		vdocOrgImpl.resetOriginalValues();

		return vdocOrgImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		orgId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createdDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		createdByUser = objectInput.readLong();

		modifiedByUser = objectInput.readLong();
		parentId = objectInput.readUTF();
		code = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		address = objectInput.readUTF();
		phone = objectInput.readUTF();
		fax = objectInput.readUTF();
		language = objectInput.readUTF();

		statusOrg = objectInput.readBoolean();

		position = objectInput.readInt();
		listparent = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (orgId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(orgId);
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

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone);
		}

		if (fax == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fax);
		}

		if (language == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(language);
		}

		objectOutput.writeBoolean(statusOrg);

		objectOutput.writeInt(position);

		if (listparent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(listparent);
		}
	}

	public String orgId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createdDate;
	public long modifiedDate;
	public long createdByUser;
	public long modifiedByUser;
	public String parentId;
	public String code;
	public String name;
	public String description;
	public String address;
	public String phone;
	public String fax;
	public String language;
	public boolean statusOrg;
	public int position;
	public String listparent;
}