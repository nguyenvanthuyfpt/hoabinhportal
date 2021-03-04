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

import vn.gov.hoabinh.model.VLegalDraftDocument;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VLegalDraftDocument in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDraftDocument
 * @generated
 */
@ProviderType
public class VLegalDraftDocumentCacheModel implements CacheModel<VLegalDraftDocument>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalDraftDocumentCacheModel)) {
			return false;
		}

		VLegalDraftDocumentCacheModel vLegalDraftDocumentCacheModel = (VLegalDraftDocumentCacheModel)obj;

		if (draftId.equals(vLegalDraftDocumentCacheModel.draftId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, draftId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(45);

		sb.append("{draftId=");
		sb.append(draftId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createdByUser=");
		sb.append(createdByUser);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", modifiedByUser=");
		sb.append(modifiedByUser);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", approvedByUser=");
		sb.append(approvedByUser);
		sb.append(", approvedDate=");
		sb.append(approvedDate);
		sb.append(", publishedByUser=");
		sb.append(publishedByUser);
		sb.append(", publishedDate=");
		sb.append(publishedDate);
		sb.append(", title=");
		sb.append(title);
		sb.append(", expiredDate=");
		sb.append(expiredDate);
		sb.append(", language=");
		sb.append(language);
		sb.append(", content=");
		sb.append(content);
		sb.append(", typeId=");
		sb.append(typeId);
		sb.append(", fieldId=");
		sb.append(fieldId);
		sb.append(", hasAttachment=");
		sb.append(hasAttachment);
		sb.append(", draftLevel=");
		sb.append(draftLevel);
		sb.append(", docCode=");
		sb.append(docCode);
		sb.append(", statusDraft=");
		sb.append(statusDraft);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VLegalDraftDocument toEntityModel() {
		VLegalDraftDocumentImpl vLegalDraftDocumentImpl = new VLegalDraftDocumentImpl();

		if (draftId == null) {
			vLegalDraftDocumentImpl.setDraftId(StringPool.BLANK);
		}
		else {
			vLegalDraftDocumentImpl.setDraftId(draftId);
		}

		vLegalDraftDocumentImpl.setGroupId(groupId);
		vLegalDraftDocumentImpl.setCompanyId(companyId);
		vLegalDraftDocumentImpl.setUserId(userId);
		vLegalDraftDocumentImpl.setCreatedByUser(createdByUser);

		if (createdDate == Long.MIN_VALUE) {
			vLegalDraftDocumentImpl.setCreatedDate(null);
		}
		else {
			vLegalDraftDocumentImpl.setCreatedDate(new Date(createdDate));
		}

		vLegalDraftDocumentImpl.setModifiedByUser(modifiedByUser);

		if (modifiedDate == Long.MIN_VALUE) {
			vLegalDraftDocumentImpl.setModifiedDate(null);
		}
		else {
			vLegalDraftDocumentImpl.setModifiedDate(new Date(modifiedDate));
		}

		vLegalDraftDocumentImpl.setApprovedByUser(approvedByUser);

		if (approvedDate == Long.MIN_VALUE) {
			vLegalDraftDocumentImpl.setApprovedDate(null);
		}
		else {
			vLegalDraftDocumentImpl.setApprovedDate(new Date(approvedDate));
		}

		vLegalDraftDocumentImpl.setPublishedByUser(publishedByUser);

		if (publishedDate == Long.MIN_VALUE) {
			vLegalDraftDocumentImpl.setPublishedDate(null);
		}
		else {
			vLegalDraftDocumentImpl.setPublishedDate(new Date(publishedDate));
		}

		if (title == null) {
			vLegalDraftDocumentImpl.setTitle(StringPool.BLANK);
		}
		else {
			vLegalDraftDocumentImpl.setTitle(title);
		}

		if (expiredDate == Long.MIN_VALUE) {
			vLegalDraftDocumentImpl.setExpiredDate(null);
		}
		else {
			vLegalDraftDocumentImpl.setExpiredDate(new Date(expiredDate));
		}

		if (language == null) {
			vLegalDraftDocumentImpl.setLanguage(StringPool.BLANK);
		}
		else {
			vLegalDraftDocumentImpl.setLanguage(language);
		}

		if (content == null) {
			vLegalDraftDocumentImpl.setContent(StringPool.BLANK);
		}
		else {
			vLegalDraftDocumentImpl.setContent(content);
		}

		if (typeId == null) {
			vLegalDraftDocumentImpl.setTypeId(StringPool.BLANK);
		}
		else {
			vLegalDraftDocumentImpl.setTypeId(typeId);
		}

		if (fieldId == null) {
			vLegalDraftDocumentImpl.setFieldId(StringPool.BLANK);
		}
		else {
			vLegalDraftDocumentImpl.setFieldId(fieldId);
		}

		vLegalDraftDocumentImpl.setHasAttachment(hasAttachment);
		vLegalDraftDocumentImpl.setDraftLevel(draftLevel);

		if (docCode == null) {
			vLegalDraftDocumentImpl.setDocCode(StringPool.BLANK);
		}
		else {
			vLegalDraftDocumentImpl.setDocCode(docCode);
		}

		vLegalDraftDocumentImpl.setStatusDraft(statusDraft);

		vLegalDraftDocumentImpl.resetOriginalValues();

		return vLegalDraftDocumentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		draftId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();

		createdByUser = objectInput.readLong();
		createdDate = objectInput.readLong();

		modifiedByUser = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		approvedByUser = objectInput.readLong();
		approvedDate = objectInput.readLong();

		publishedByUser = objectInput.readLong();
		publishedDate = objectInput.readLong();
		title = objectInput.readUTF();
		expiredDate = objectInput.readLong();
		language = objectInput.readUTF();
		content = objectInput.readUTF();
		typeId = objectInput.readUTF();
		fieldId = objectInput.readUTF();

		hasAttachment = objectInput.readBoolean();

		draftLevel = objectInput.readInt();
		docCode = objectInput.readUTF();

		statusDraft = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (draftId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(draftId);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(createdByUser);
		objectOutput.writeLong(createdDate);

		objectOutput.writeLong(modifiedByUser);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(approvedByUser);
		objectOutput.writeLong(approvedDate);

		objectOutput.writeLong(publishedByUser);
		objectOutput.writeLong(publishedDate);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		objectOutput.writeLong(expiredDate);

		if (language == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(language);
		}

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		if (typeId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(typeId);
		}

		if (fieldId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fieldId);
		}

		objectOutput.writeBoolean(hasAttachment);

		objectOutput.writeInt(draftLevel);

		if (docCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(docCode);
		}

		objectOutput.writeInt(statusDraft);
	}

	public String draftId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createdByUser;
	public long createdDate;
	public long modifiedByUser;
	public long modifiedDate;
	public long approvedByUser;
	public long approvedDate;
	public long publishedByUser;
	public long publishedDate;
	public String title;
	public long expiredDate;
	public String language;
	public String content;
	public String typeId;
	public String fieldId;
	public boolean hasAttachment;
	public int draftLevel;
	public String docCode;
	public int statusDraft;
}