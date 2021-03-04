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

import vn.gov.hoabinh.model.VLegalOrg;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VLegalOrg in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalOrg
 * @generated
 */
@ProviderType
public class VLegalOrgCacheModel implements CacheModel<VLegalOrg>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalOrgCacheModel)) {
			return false;
		}

		VLegalOrgCacheModel vLegalOrgCacheModel = (VLegalOrgCacheModel)obj;

		if (orgId.equals(vLegalOrgCacheModel.orgId)) {
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
		StringBundler sb = new StringBundler(31);

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
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", parentId=");
		sb.append(parentId);
		sb.append(", language=");
		sb.append(language);
		sb.append(", statusOrg=");
		sb.append(statusOrg);
		sb.append(", rssable=");
		sb.append(rssable);
		sb.append(", position=");
		sb.append(position);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VLegalOrg toEntityModel() {
		VLegalOrgImpl vLegalOrgImpl = new VLegalOrgImpl();

		if (orgId == null) {
			vLegalOrgImpl.setOrgId(StringPool.BLANK);
		}
		else {
			vLegalOrgImpl.setOrgId(orgId);
		}

		vLegalOrgImpl.setGroupId(groupId);
		vLegalOrgImpl.setCompanyId(companyId);
		vLegalOrgImpl.setUserId(userId);

		if (createdDate == Long.MIN_VALUE) {
			vLegalOrgImpl.setCreatedDate(null);
		}
		else {
			vLegalOrgImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vLegalOrgImpl.setModifiedDate(null);
		}
		else {
			vLegalOrgImpl.setModifiedDate(new Date(modifiedDate));
		}

		vLegalOrgImpl.setCreatedByUser(createdByUser);
		vLegalOrgImpl.setModifiedByUser(modifiedByUser);

		if (name == null) {
			vLegalOrgImpl.setName(StringPool.BLANK);
		}
		else {
			vLegalOrgImpl.setName(name);
		}

		if (description == null) {
			vLegalOrgImpl.setDescription(StringPool.BLANK);
		}
		else {
			vLegalOrgImpl.setDescription(description);
		}

		if (parentId == null) {
			vLegalOrgImpl.setParentId(StringPool.BLANK);
		}
		else {
			vLegalOrgImpl.setParentId(parentId);
		}

		if (language == null) {
			vLegalOrgImpl.setLanguage(StringPool.BLANK);
		}
		else {
			vLegalOrgImpl.setLanguage(language);
		}

		vLegalOrgImpl.setStatusOrg(statusOrg);
		vLegalOrgImpl.setRssable(rssable);
		vLegalOrgImpl.setPosition(position);

		vLegalOrgImpl.resetOriginalValues();

		return vLegalOrgImpl;
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
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		parentId = objectInput.readUTF();
		language = objectInput.readUTF();

		statusOrg = objectInput.readBoolean();

		rssable = objectInput.readBoolean();

		position = objectInput.readInt();
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

		if (parentId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(parentId);
		}

		if (language == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(language);
		}

		objectOutput.writeBoolean(statusOrg);

		objectOutput.writeBoolean(rssable);

		objectOutput.writeInt(position);
	}

	public String orgId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createdDate;
	public long modifiedDate;
	public long createdByUser;
	public long modifiedByUser;
	public String name;
	public String description;
	public String parentId;
	public String language;
	public boolean statusOrg;
	public boolean rssable;
	public int position;
}