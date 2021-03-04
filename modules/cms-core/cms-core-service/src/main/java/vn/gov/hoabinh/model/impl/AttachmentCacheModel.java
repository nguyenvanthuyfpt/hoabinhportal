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

import vn.gov.hoabinh.model.Attachment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Attachment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Attachment
 * @generated
 */
@ProviderType
public class AttachmentCacheModel implements CacheModel<Attachment>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AttachmentCacheModel)) {
			return false;
		}

		AttachmentCacheModel attachmentCacheModel = (AttachmentCacheModel)obj;

		if (attachmentId == attachmentCacheModel.attachmentId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, attachmentId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{attachmentId=");
		sb.append(attachmentId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", entryId=");
		sb.append(entryId);
		sb.append(", entryClass=");
		sb.append(entryClass);
		sb.append(", fileEntryId=");
		sb.append(fileEntryId);
		sb.append(", folderId=");
		sb.append(folderId);
		sb.append(", fileName=");
		sb.append(fileName);
		sb.append(", imageId=");
		sb.append(imageId);
		sb.append(", extension=");
		sb.append(extension);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Attachment toEntityModel() {
		AttachmentImpl attachmentImpl = new AttachmentImpl();

		attachmentImpl.setAttachmentId(attachmentId);
		attachmentImpl.setGroupId(groupId);
		attachmentImpl.setCompanyId(companyId);
		attachmentImpl.setEntryId(entryId);

		if (entryClass == null) {
			attachmentImpl.setEntryClass(StringPool.BLANK);
		}
		else {
			attachmentImpl.setEntryClass(entryClass);
		}

		attachmentImpl.setFileEntryId(fileEntryId);
		attachmentImpl.setFolderId(folderId);

		if (fileName == null) {
			attachmentImpl.setFileName(StringPool.BLANK);
		}
		else {
			attachmentImpl.setFileName(fileName);
		}

		attachmentImpl.setImageId(imageId);

		if (extension == null) {
			attachmentImpl.setExtension(StringPool.BLANK);
		}
		else {
			attachmentImpl.setExtension(extension);
		}

		attachmentImpl.resetOriginalValues();

		return attachmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attachmentId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		entryId = objectInput.readLong();
		entryClass = objectInput.readUTF();

		fileEntryId = objectInput.readLong();

		folderId = objectInput.readLong();
		fileName = objectInput.readUTF();

		imageId = objectInput.readLong();
		extension = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(attachmentId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(entryId);

		if (entryClass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(entryClass);
		}

		objectOutput.writeLong(fileEntryId);

		objectOutput.writeLong(folderId);

		if (fileName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fileName);
		}

		objectOutput.writeLong(imageId);

		if (extension == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(extension);
		}
	}

	public long attachmentId;
	public long groupId;
	public long companyId;
	public long entryId;
	public String entryClass;
	public long fileEntryId;
	public long folderId;
	public String fileName;
	public long imageId;
	public String extension;
}