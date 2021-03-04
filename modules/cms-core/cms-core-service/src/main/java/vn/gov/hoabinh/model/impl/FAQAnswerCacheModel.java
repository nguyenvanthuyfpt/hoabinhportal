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

import vn.gov.hoabinh.model.FAQAnswer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing FAQAnswer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see FAQAnswer
 * @generated
 */
@ProviderType
public class FAQAnswerCacheModel implements CacheModel<FAQAnswer>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FAQAnswerCacheModel)) {
			return false;
		}

		FAQAnswerCacheModel faqAnswerCacheModel = (FAQAnswerCacheModel)obj;

		if (id == faqAnswerCacheModel.id) {
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
		StringBundler sb = new StringBundler(31);

		sb.append("{id=");
		sb.append(id);
		sb.append(", questionid=");
		sb.append(questionid);
		sb.append(", content=");
		sb.append(content);
		sb.append(", answerOrder=");
		sb.append(answerOrder);
		sb.append(", answeredByUser=");
		sb.append(answeredByUser);
		sb.append(", answeredDate=");
		sb.append(answeredDate);
		sb.append(", modifiedByUser=");
		sb.append(modifiedByUser);
		sb.append(", language=");
		sb.append(language);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", approved=");
		sb.append(approved);
		sb.append(", approvedByUser=");
		sb.append(approvedByUser);
		sb.append(", approvedDate=");
		sb.append(approvedDate);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", attachName=");
		sb.append(attachName);
		sb.append(", folderId=");
		sb.append(folderId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public FAQAnswer toEntityModel() {
		FAQAnswerImpl faqAnswerImpl = new FAQAnswerImpl();

		faqAnswerImpl.setId(id);
		faqAnswerImpl.setQuestionid(questionid);

		if (content == null) {
			faqAnswerImpl.setContent(StringPool.BLANK);
		}
		else {
			faqAnswerImpl.setContent(content);
		}

		faqAnswerImpl.setAnswerOrder(answerOrder);

		if (answeredByUser == null) {
			faqAnswerImpl.setAnsweredByUser(StringPool.BLANK);
		}
		else {
			faqAnswerImpl.setAnsweredByUser(answeredByUser);
		}

		if (answeredDate == Long.MIN_VALUE) {
			faqAnswerImpl.setAnsweredDate(null);
		}
		else {
			faqAnswerImpl.setAnsweredDate(new Date(answeredDate));
		}

		if (modifiedByUser == null) {
			faqAnswerImpl.setModifiedByUser(StringPool.BLANK);
		}
		else {
			faqAnswerImpl.setModifiedByUser(modifiedByUser);
		}

		if (language == null) {
			faqAnswerImpl.setLanguage(StringPool.BLANK);
		}
		else {
			faqAnswerImpl.setLanguage(language);
		}

		if (modifiedDate == Long.MIN_VALUE) {
			faqAnswerImpl.setModifiedDate(null);
		}
		else {
			faqAnswerImpl.setModifiedDate(new Date(modifiedDate));
		}

		faqAnswerImpl.setApproved(approved);

		if (approvedByUser == null) {
			faqAnswerImpl.setApprovedByUser(StringPool.BLANK);
		}
		else {
			faqAnswerImpl.setApprovedByUser(approvedByUser);
		}

		if (approvedDate == Long.MIN_VALUE) {
			faqAnswerImpl.setApprovedDate(null);
		}
		else {
			faqAnswerImpl.setApprovedDate(new Date(approvedDate));
		}

		faqAnswerImpl.setUserId(userId);

		if (attachName == null) {
			faqAnswerImpl.setAttachName(StringPool.BLANK);
		}
		else {
			faqAnswerImpl.setAttachName(attachName);
		}

		faqAnswerImpl.setFolderId(folderId);

		faqAnswerImpl.resetOriginalValues();

		return faqAnswerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		questionid = objectInput.readLong();
		content = objectInput.readUTF();

		answerOrder = objectInput.readInt();
		answeredByUser = objectInput.readUTF();
		answeredDate = objectInput.readLong();
		modifiedByUser = objectInput.readUTF();
		language = objectInput.readUTF();
		modifiedDate = objectInput.readLong();

		approved = objectInput.readBoolean();
		approvedByUser = objectInput.readUTF();
		approvedDate = objectInput.readLong();

		userId = objectInput.readLong();
		attachName = objectInput.readUTF();

		folderId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(questionid);

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		objectOutput.writeInt(answerOrder);

		if (answeredByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(answeredByUser);
		}

		objectOutput.writeLong(answeredDate);

		if (modifiedByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(modifiedByUser);
		}

		if (language == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(language);
		}

		objectOutput.writeLong(modifiedDate);

		objectOutput.writeBoolean(approved);

		if (approvedByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approvedByUser);
		}

		objectOutput.writeLong(approvedDate);

		objectOutput.writeLong(userId);

		if (attachName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(attachName);
		}

		objectOutput.writeLong(folderId);
	}

	public long id;
	public long questionid;
	public String content;
	public int answerOrder;
	public String answeredByUser;
	public long answeredDate;
	public String modifiedByUser;
	public String language;
	public long modifiedDate;
	public boolean approved;
	public String approvedByUser;
	public long approvedDate;
	public long userId;
	public String attachName;
	public long folderId;
}