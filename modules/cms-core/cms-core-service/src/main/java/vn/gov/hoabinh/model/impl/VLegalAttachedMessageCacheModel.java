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

import vn.gov.hoabinh.model.VLegalAttachedMessage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VLegalAttachedMessage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalAttachedMessage
 * @generated
 */
@ProviderType
public class VLegalAttachedMessageCacheModel implements CacheModel<VLegalAttachedMessage>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalAttachedMessageCacheModel)) {
			return false;
		}

		VLegalAttachedMessageCacheModel vLegalAttachedMessageCacheModel = (VLegalAttachedMessageCacheModel)obj;

		if (messageId.equals(vLegalAttachedMessageCacheModel.messageId)) {
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
		StringBundler sb = new StringBundler(19);

		sb.append("{messageId=");
		sb.append(messageId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
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
	public VLegalAttachedMessage toEntityModel() {
		VLegalAttachedMessageImpl vLegalAttachedMessageImpl = new VLegalAttachedMessageImpl();

		if (messageId == null) {
			vLegalAttachedMessageImpl.setMessageId(StringPool.BLANK);
		}
		else {
			vLegalAttachedMessageImpl.setMessageId(messageId);
		}

		vLegalAttachedMessageImpl.setGroupId(groupId);
		vLegalAttachedMessageImpl.setCompanyId(companyId);
		vLegalAttachedMessageImpl.setUserId(userId);

		if (createdDate == Long.MIN_VALUE) {
			vLegalAttachedMessageImpl.setCreatedDate(null);
		}
		else {
			vLegalAttachedMessageImpl.setCreatedDate(new Date(createdDate));
		}

		vLegalAttachedMessageImpl.setCreatedByUser(createdByUser);

		if (articleId == null) {
			vLegalAttachedMessageImpl.setArticleId(StringPool.BLANK);
		}
		else {
			vLegalAttachedMessageImpl.setArticleId(articleId);
		}

		if (content == null) {
			vLegalAttachedMessageImpl.setContent(StringPool.BLANK);
		}
		else {
			vLegalAttachedMessageImpl.setContent(content);
		}

		vLegalAttachedMessageImpl.setReadMessage(readMessage);

		vLegalAttachedMessageImpl.resetOriginalValues();

		return vLegalAttachedMessageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		messageId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createdDate = objectInput.readLong();

		createdByUser = objectInput.readLong();
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

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createdDate);

		objectOutput.writeLong(createdByUser);

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
	public long userId;
	public long createdDate;
	public long createdByUser;
	public String articleId;
	public String content;
	public boolean readMessage;
}