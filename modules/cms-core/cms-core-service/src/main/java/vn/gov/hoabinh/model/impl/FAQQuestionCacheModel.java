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

import vn.gov.hoabinh.model.FAQQuestion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FAQQuestion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see FAQQuestion
 * @generated
 */
@ProviderType
public class FAQQuestionCacheModel implements CacheModel<FAQQuestion>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FAQQuestionCacheModel)) {
			return false;
		}

		FAQQuestionCacheModel faqQuestionCacheModel = (FAQQuestionCacheModel)obj;

		if (id == faqQuestionCacheModel.id) {
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
		StringBundler sb = new StringBundler(33);

		sb.append("{id=");
		sb.append(id);
		sb.append(", title=");
		sb.append(title);
		sb.append(", content=");
		sb.append(content);
		sb.append(", language=");
		sb.append(language);
		sb.append(", questionOrder=");
		sb.append(questionOrder);
		sb.append(", sentDate=");
		sb.append(sentDate);
		sb.append(", sentByUser=");
		sb.append(sentByUser);
		sb.append(", senderEmail=");
		sb.append(senderEmail);
		sb.append(", questionType=");
		sb.append(questionType);
		sb.append(", modifiedByUser=");
		sb.append(modifiedByUser);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", hitCount=");
		sb.append(hitCount);
		sb.append(", approved=");
		sb.append(approved);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", categoryId=");
		sb.append(categoryId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FAQQuestion toEntityModel() {
		FAQQuestionImpl faqQuestionImpl = new FAQQuestionImpl();

		faqQuestionImpl.setId(id);

		if (title == null) {
			faqQuestionImpl.setTitle(StringPool.BLANK);
		}
		else {
			faqQuestionImpl.setTitle(title);
		}

		if (content == null) {
			faqQuestionImpl.setContent(StringPool.BLANK);
		}
		else {
			faqQuestionImpl.setContent(content);
		}

		if (language == null) {
			faqQuestionImpl.setLanguage(StringPool.BLANK);
		}
		else {
			faqQuestionImpl.setLanguage(language);
		}

		faqQuestionImpl.setQuestionOrder(questionOrder);

		if (sentDate == Long.MIN_VALUE) {
			faqQuestionImpl.setSentDate(null);
		}
		else {
			faqQuestionImpl.setSentDate(new Date(sentDate));
		}

		if (sentByUser == null) {
			faqQuestionImpl.setSentByUser(StringPool.BLANK);
		}
		else {
			faqQuestionImpl.setSentByUser(sentByUser);
		}

		if (senderEmail == null) {
			faqQuestionImpl.setSenderEmail(StringPool.BLANK);
		}
		else {
			faqQuestionImpl.setSenderEmail(senderEmail);
		}

		if (questionType == null) {
			faqQuestionImpl.setQuestionType(StringPool.BLANK);
		}
		else {
			faqQuestionImpl.setQuestionType(questionType);
		}

		if (modifiedByUser == null) {
			faqQuestionImpl.setModifiedByUser(StringPool.BLANK);
		}
		else {
			faqQuestionImpl.setModifiedByUser(modifiedByUser);
		}

		if (modifiedDate == Long.MIN_VALUE) {
			faqQuestionImpl.setModifiedDate(null);
		}
		else {
			faqQuestionImpl.setModifiedDate(new Date(modifiedDate));
		}

		faqQuestionImpl.setHitCount(hitCount);
		faqQuestionImpl.setApproved(approved);
		faqQuestionImpl.setGroupId(groupId);
		faqQuestionImpl.setUserId(userId);
		faqQuestionImpl.setCategoryId(categoryId);

		faqQuestionImpl.resetOriginalValues();

		return faqQuestionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		title = objectInput.readUTF();
		content = objectInput.readUTF();
		language = objectInput.readUTF();

		questionOrder = objectInput.readInt();
		sentDate = objectInput.readLong();
		sentByUser = objectInput.readUTF();
		senderEmail = objectInput.readUTF();
		questionType = objectInput.readUTF();
		modifiedByUser = objectInput.readUTF();
		modifiedDate = objectInput.readLong();

		hitCount = objectInput.readInt();

		approved = objectInput.readBoolean();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();

		categoryId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

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

		objectOutput.writeInt(questionOrder);
		objectOutput.writeLong(sentDate);

		if (sentByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sentByUser);
		}

		if (senderEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(senderEmail);
		}

		if (questionType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(questionType);
		}

		if (modifiedByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(modifiedByUser);
		}

		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(hitCount);

		objectOutput.writeBoolean(approved);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(categoryId);
	}

	public long id;
	public String title;
	public String content;
	public String language;
	public int questionOrder;
	public long sentDate;
	public String sentByUser;
	public String senderEmail;
	public String questionType;
	public String modifiedByUser;
	public long modifiedDate;
	public int hitCount;
	public boolean approved;
	public long groupId;
	public long userId;
	public long categoryId;
}