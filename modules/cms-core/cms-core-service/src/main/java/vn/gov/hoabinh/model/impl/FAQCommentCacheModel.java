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

import vn.gov.hoabinh.model.FAQComment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FAQComment in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see FAQComment
 * @generated
 */
@ProviderType
public class FAQCommentCacheModel implements CacheModel<FAQComment>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FAQCommentCacheModel)) {
			return false;
		}

		FAQCommentCacheModel faqCommentCacheModel = (FAQCommentCacheModel)obj;

		if (id == faqCommentCacheModel.id) {
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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", answerid=");
		sb.append(answerid);
		sb.append(", content=");
		sb.append(content);
		sb.append(", commName=");
		sb.append(commName);
		sb.append(", commEmail=");
		sb.append(commEmail);
		sb.append(", approved=");
		sb.append(approved);
		sb.append(", approveByUser=");
		sb.append(approveByUser);
		sb.append(", approvedDate=");
		sb.append(approvedDate);
		sb.append(", commDate=");
		sb.append(commDate);
		sb.append(", userId=");
		sb.append(userId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FAQComment toEntityModel() {
		FAQCommentImpl faqCommentImpl = new FAQCommentImpl();

		faqCommentImpl.setId(id);
		faqCommentImpl.setAnswerid(answerid);

		if (content == null) {
			faqCommentImpl.setContent(StringPool.BLANK);
		}
		else {
			faqCommentImpl.setContent(content);
		}

		if (commName == null) {
			faqCommentImpl.setCommName(StringPool.BLANK);
		}
		else {
			faqCommentImpl.setCommName(commName);
		}

		if (commEmail == null) {
			faqCommentImpl.setCommEmail(StringPool.BLANK);
		}
		else {
			faqCommentImpl.setCommEmail(commEmail);
		}

		faqCommentImpl.setApproved(approved);

		if (approveByUser == null) {
			faqCommentImpl.setApproveByUser(StringPool.BLANK);
		}
		else {
			faqCommentImpl.setApproveByUser(approveByUser);
		}

		if (approvedDate == Long.MIN_VALUE) {
			faqCommentImpl.setApprovedDate(null);
		}
		else {
			faqCommentImpl.setApprovedDate(new Date(approvedDate));
		}

		if (commDate == Long.MIN_VALUE) {
			faqCommentImpl.setCommDate(null);
		}
		else {
			faqCommentImpl.setCommDate(new Date(commDate));
		}

		faqCommentImpl.setUserId(userId);

		faqCommentImpl.resetOriginalValues();

		return faqCommentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		answerid = objectInput.readLong();
		content = objectInput.readUTF();
		commName = objectInput.readUTF();
		commEmail = objectInput.readUTF();

		approved = objectInput.readBoolean();
		approveByUser = objectInput.readUTF();
		approvedDate = objectInput.readLong();
		commDate = objectInput.readLong();

		userId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(answerid);

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		if (commName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commName);
		}

		if (commEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commEmail);
		}

		objectOutput.writeBoolean(approved);

		if (approveByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approveByUser);
		}

		objectOutput.writeLong(approvedDate);
		objectOutput.writeLong(commDate);

		objectOutput.writeLong(userId);
	}

	public long id;
	public long answerid;
	public String content;
	public String commName;
	public String commEmail;
	public boolean approved;
	public String approveByUser;
	public long approvedDate;
	public long commDate;
	public long userId;
}