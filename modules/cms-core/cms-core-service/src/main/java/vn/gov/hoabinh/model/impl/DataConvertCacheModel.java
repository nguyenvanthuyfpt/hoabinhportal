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

import vn.gov.hoabinh.model.DataConvert;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DataConvert in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see DataConvert
 * @generated
 */
@ProviderType
public class DataConvertCacheModel implements CacheModel<DataConvert>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DataConvertCacheModel)) {
			return false;
		}

		DataConvertCacheModel dataConvertCacheModel = (DataConvertCacheModel)obj;

		if (id == dataConvertCacheModel.id) {
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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", folderId=");
		sb.append(folderId);
		sb.append(", dataId=");
		sb.append(dataId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", fileEntryId=");
		sb.append(fileEntryId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", fileName=");
		sb.append(fileName);
		sb.append(", url=");
		sb.append(url);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DataConvert toEntityModel() {
		DataConvertImpl dataConvertImpl = new DataConvertImpl();

		dataConvertImpl.setId(id);
		dataConvertImpl.setFolderId(folderId);

		if (dataId == null) {
			dataConvertImpl.setDataId(StringPool.BLANK);
		}
		else {
			dataConvertImpl.setDataId(dataId);
		}

		dataConvertImpl.setGroupId(groupId);
		dataConvertImpl.setFileEntryId(fileEntryId);

		if (createdDate == Long.MIN_VALUE) {
			dataConvertImpl.setCreatedDate(null);
		}
		else {
			dataConvertImpl.setCreatedDate(new Date(createdDate));
		}

		if (fileName == null) {
			dataConvertImpl.setFileName(StringPool.BLANK);
		}
		else {
			dataConvertImpl.setFileName(fileName);
		}

		if (url == null) {
			dataConvertImpl.setUrl(StringPool.BLANK);
		}
		else {
			dataConvertImpl.setUrl(url);
		}

		dataConvertImpl.resetOriginalValues();

		return dataConvertImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		folderId = objectInput.readLong();
		dataId = objectInput.readUTF();

		groupId = objectInput.readLong();

		fileEntryId = objectInput.readLong();
		createdDate = objectInput.readLong();
		fileName = objectInput.readUTF();
		url = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(folderId);

		if (dataId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dataId);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(fileEntryId);
		objectOutput.writeLong(createdDate);

		if (fileName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fileName);
		}

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}
	}

	public long id;
	public long folderId;
	public String dataId;
	public long groupId;
	public long fileEntryId;
	public long createdDate;
	public String fileName;
	public String url;
}