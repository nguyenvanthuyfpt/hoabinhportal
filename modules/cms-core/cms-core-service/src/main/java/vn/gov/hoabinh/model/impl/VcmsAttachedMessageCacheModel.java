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

import vn.gov.hoabinh.model.VcmsAttachedMessage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VcmsAttachedMessage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsAttachedMessage
 * @generated
 */
@ProviderType
public class VcmsAttachedMessageCacheModel implements CacheModel<VcmsAttachedMessage>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsAttachedMessageCacheModel)) {
			return false;
		}

		VcmsAttachedMessageCacheModel vcmsAttachedMessageCacheModel = (VcmsAttachedMessageCacheModel)obj;

		if (messageId.equals(vcmsAttachedMessageCacheModel.messageId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, messageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{messageId=");
		sb.append(messageId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdByUser=");
		sb.append(createdByUser);
		sb.append(", articleId=");
		sb.append(articleId);
		sb.append(", content=");
		sb.append(content);
		sb.append(", readMessage=");
		sb.append(readMessage);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VcmsAttachedMessage toEntityModel() {
		VcmsAttachedMessageImpl vcmsAttachedMessageImpl = new VcmsAttachedMessageImpl();

		if (messageId == null) {
			vcmsAttachedMessageImpl.setMessageId(StringPool.BLANK);
		}
		else {
			vcmsAttachedMessageImpl.setMessageId(messageId);
		}

		vcmsAttachedMessageImpl.setGroupId(groupId);
		vcmsAttachedMessageImpl.setCompanyId(companyId);

		if (createdDate == Long.MIN_VALUE) {
			vcmsAttachedMessageImpl.setCreatedDate(null);
		}
		else {
			vcmsAttachedMessageImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdByUser == null) {
			vcmsAttachedMessageImpl.setCreatedByUser(StringPool.BLANK);
		}
		else {
			vcmsAttachedMessageImpl.setCreatedByUser(createdByUser);
		}

		if (articleId == null) {
			vcmsAttachedMessageImpl.setArticleId(StringPool.BLANK);
		}
		else {
			vcmsAttachedMessageImpl.setArticleId(articleId);
		}

		if (content == null) {
			vcmsAttachedMessageImpl.setContent(StringPool.BLANK);
		}
		else {
			vcmsAttachedMessageImpl.setContent(content);
		}

		vcmsAttachedMessageImpl.setReadMessage(readMessage);

		vcmsAttachedMessageImpl.resetOriginalValues();

		return vcmsAttachedMessageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		messageId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createdDate = objectInput.readLong();
		createdByUser = objectInput.readUTF();
		articleId = objectInput.readUTF();
		content = objectInput.readUTF();

		readMessage = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (messageId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(messageId);
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

		if (articleId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(articleId);
		}

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		objectOutput.writeBoolean(readMessage);
	}

	public String messageId;
	public long groupId;
	public long companyId;
	public long createdDate;
	public String createdByUser;
	public String articleId;
	public String content;
	public boolean readMessage;
}