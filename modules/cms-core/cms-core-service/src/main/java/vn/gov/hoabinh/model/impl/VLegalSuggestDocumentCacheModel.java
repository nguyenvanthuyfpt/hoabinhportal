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

import vn.gov.hoabinh.model.VLegalSuggestDocument;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VLegalSuggestDocument in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSuggestDocument
 * @generated
 */
@ProviderType
public class VLegalSuggestDocumentCacheModel implements CacheModel<VLegalSuggestDocument>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalSuggestDocumentCacheModel)) {
			return false;
		}

		VLegalSuggestDocumentCacheModel vLegalSuggestDocumentCacheModel = (VLegalSuggestDocumentCacheModel)obj;

		if (sugId.equals(vLegalSuggestDocumentCacheModel.sugId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sugId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{sugId=");
		sb.append(sugId);
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
		sb.append(", modifiedByUser=");
		sb.append(modifiedByUser);
		sb.append(", approved=");
		sb.append(approved);
		sb.append(", approvedByUser=");
		sb.append(approvedByUser);
		sb.append(", approvedDate=");
		sb.append(approvedDate);
		sb.append(", title=");
		sb.append(title);
		sb.append(", content=");
		sb.append(content);
		sb.append(", language=");
		sb.append(language);
		sb.append(", visitorName=");
		sb.append(visitorName);
		sb.append(", visitorEmail=");
		sb.append(visitorEmail);
		sb.append(", visitorTel=");
		sb.append(visitorTel);
		sb.append(", visitorAddress=");
		sb.append(visitorAddress);
		sb.append(", draftId=");
		sb.append(draftId);
		sb.append(", hasAttachment=");
		sb.append(hasAttachment);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VLegalSuggestDocument toEntityModel() {
		VLegalSuggestDocumentImpl vLegalSuggestDocumentImpl = new VLegalSuggestDocumentImpl();

		if (sugId == null) {
			vLegalSuggestDocumentImpl.setSugId(StringPool.BLANK);
		}
		else {
			vLegalSuggestDocumentImpl.setSugId(sugId);
		}

		vLegalSuggestDocumentImpl.setGroupId(groupId);
		vLegalSuggestDocumentImpl.setCompanyId(companyId);
		vLegalSuggestDocumentImpl.setUserId(userId);

		if (createdDate == Long.MIN_VALUE) {
			vLegalSuggestDocumentImpl.setCreatedDate(null);
		}
		else {
			vLegalSuggestDocumentImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vLegalSuggestDocumentImpl.setModifiedDate(null);
		}
		else {
			vLegalSuggestDocumentImpl.setModifiedDate(new Date(modifiedDate));
		}

		vLegalSuggestDocumentImpl.setModifiedByUser(modifiedByUser);
		vLegalSuggestDocumentImpl.setApproved(approved);
		vLegalSuggestDocumentImpl.setApprovedByUser(approvedByUser);

		if (approvedDate == Long.MIN_VALUE) {
			vLegalSuggestDocumentImpl.setApprovedDate(null);
		}
		else {
			vLegalSuggestDocumentImpl.setApprovedDate(new Date(approvedDate));
		}

		if (title == null) {
			vLegalSuggestDocumentImpl.setTitle(StringPool.BLANK);
		}
		else {
			vLegalSuggestDocumentImpl.setTitle(title);
		}

		if (content == null) {
			vLegalSuggestDocumentImpl.setContent(StringPool.BLANK);
		}
		else {
			vLegalSuggestDocumentImpl.setContent(content);
		}

		if (language == null) {
			vLegalSuggestDocumentImpl.setLanguage(StringPool.BLANK);
		}
		else {
			vLegalSuggestDocumentImpl.setLanguage(language);
		}

		if (visitorName == null) {
			vLegalSuggestDocumentImpl.setVisitorName(StringPool.BLANK);
		}
		else {
			vLegalSuggestDocumentImpl.setVisitorName(visitorName);
		}

		if (visitorEmail == null) {
			vLegalSuggestDocumentImpl.setVisitorEmail(StringPool.BLANK);
		}
		else {
			vLegalSuggestDocumentImpl.setVisitorEmail(visitorEmail);
		}

		if (visitorTel == null) {
			vLegalSuggestDocumentImpl.setVisitorTel(StringPool.BLANK);
		}
		else {
			vLegalSuggestDocumentImpl.setVisitorTel(visitorTel);
		}

		if (visitorAddress == null) {
			vLegalSuggestDocumentImpl.setVisitorAddress(StringPool.BLANK);
		}
		else {
			vLegalSuggestDocumentImpl.setVisitorAddress(visitorAddress);
		}

		if (draftId == null) {
			vLegalSuggestDocumentImpl.setDraftId(StringPool.BLANK);
		}
		else {
			vLegalSuggestDocumentImpl.setDraftId(draftId);
		}

		vLegalSuggestDocumentImpl.setHasAttachment(hasAttachment);

		vLegalSuggestDocumentImpl.resetOriginalValues();

		return vLegalSuggestDocumentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sugId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createdDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		modifiedByUser = objectInput.readLong();

		approved = objectInput.readBoolean();

		approvedByUser = objectInput.readLong();
		approvedDate = objectInput.readLong();
		title = objectInput.readUTF();
		content = objectInput.readUTF();
		language = objectInput.readUTF();
		visitorName = objectInput.readUTF();
		visitorEmail = objectInput.readUTF();
		visitorTel = objectInput.readUTF();
		visitorAddress = objectInput.readUTF();
		draftId = objectInput.readUTF();

		hasAttachment = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (sugId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sugId);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(modifiedByUser);

		objectOutput.writeBoolean(approved);

		objectOutput.writeLong(approvedByUser);
		objectOutput.writeLong(approvedDate);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		if (language == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(language);
		}

		if (visitorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(visitorName);
		}

		if (visitorEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(visitorEmail);
		}

		if (visitorTel == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(visitorTel);
		}

		if (visitorAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(visitorAddress);
		}

		if (draftId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(draftId);
		}

		objectOutput.writeBoolean(hasAttachment);
	}

	public String sugId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createdDate;
	public long modifiedDate;
	public long modifiedByUser;
	public boolean approved;
	public long approvedByUser;
	public long approvedDate;
	public String title;
	public String content;
	public String language;
	public String visitorName;
	public String visitorEmail;
	public String visitorTel;
	public String visitorAddress;
	public String draftId;
	public boolean hasAttachment;
}