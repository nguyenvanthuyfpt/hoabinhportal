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

import vn.gov.hoabinh.model.AdvItem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing AdvItem in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AdvItem
 * @generated
 */
@ProviderType
public class AdvItemCacheModel implements CacheModel<AdvItem>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AdvItemCacheModel)) {
			return false;
		}

		AdvItemCacheModel advItemCacheModel = (AdvItemCacheModel)obj;

		if (itemId == advItemCacheModel.itemId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, itemId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{itemId=");
		sb.append(itemId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", expriedDate=");
		sb.append(expriedDate);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", url=");
		sb.append(url);
		sb.append(", isTargetBlank=");
		sb.append(isTargetBlank);
		sb.append(", txtMouseOver=");
		sb.append(txtMouseOver);
		sb.append(", folderId=");
		sb.append(folderId);
		sb.append(", status=");
		sb.append(status);
		sb.append(", typeId=");
		sb.append(typeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AdvItem toEntityModel() {
		AdvItemImpl advItemImpl = new AdvItemImpl();

		advItemImpl.setItemId(itemId);

		if (createDate == Long.MIN_VALUE) {
			advItemImpl.setCreateDate(null);
		}
		else {
			advItemImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			advItemImpl.setModifiedDate(null);
		}
		else {
			advItemImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (expriedDate == Long.MIN_VALUE) {
			advItemImpl.setExpriedDate(null);
		}
		else {
			advItemImpl.setExpriedDate(new Date(expriedDate));
		}

		advItemImpl.setGroupId(groupId);
		advItemImpl.setCompanyId(companyId);

		if (name == null) {
			advItemImpl.setName(StringPool.BLANK);
		}
		else {
			advItemImpl.setName(name);
		}

		if (description == null) {
			advItemImpl.setDescription(StringPool.BLANK);
		}
		else {
			advItemImpl.setDescription(description);
		}

		if (url == null) {
			advItemImpl.setUrl(StringPool.BLANK);
		}
		else {
			advItemImpl.setUrl(url);
		}

		advItemImpl.setIsTargetBlank(isTargetBlank);

		if (txtMouseOver == null) {
			advItemImpl.setTxtMouseOver(StringPool.BLANK);
		}
		else {
			advItemImpl.setTxtMouseOver(txtMouseOver);
		}

		advItemImpl.setFolderId(folderId);
		advItemImpl.setStatus(status);
		advItemImpl.setTypeId(typeId);

		advItemImpl.resetOriginalValues();

		return advItemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		itemId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		expriedDate = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		url = objectInput.readUTF();

		isTargetBlank = objectInput.readBoolean();
		txtMouseOver = objectInput.readUTF();

		folderId = objectInput.readLong();

		status = objectInput.readBoolean();

		typeId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(itemId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(expriedDate);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

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

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}

		objectOutput.writeBoolean(isTargetBlank);

		if (txtMouseOver == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(txtMouseOver);
		}

		objectOutput.writeLong(folderId);

		objectOutput.writeBoolean(status);

		objectOutput.writeLong(typeId);
	}

	public long itemId;
	public long createDate;
	public long modifiedDate;
	public long expriedDate;
	public long groupId;
	public long companyId;
	public String name;
	public String description;
	public String url;
	public boolean isTargetBlank;
	public String txtMouseOver;
	public long folderId;
	public boolean status;
	public long typeId;
}