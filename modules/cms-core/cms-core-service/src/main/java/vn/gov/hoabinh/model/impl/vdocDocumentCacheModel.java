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

import vn.gov.hoabinh.model.vdocDocument;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing vdocDocument in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see vdocDocument
 * @generated
 */
@ProviderType
public class vdocDocumentCacheModel implements CacheModel<vdocDocument>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof vdocDocumentCacheModel)) {
			return false;
		}

		vdocDocumentCacheModel vdocDocumentCacheModel = (vdocDocumentCacheModel)obj;

		if (docId.equals(vdocDocumentCacheModel.docId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, docId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(79);

		sb.append("{docId=");
		sb.append(docId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", language=");
		sb.append(language);
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
		sb.append(", promulDate=");
		sb.append(promulDate);
		sb.append(", effectivedDate=");
		sb.append(effectivedDate);
		sb.append(", expiredDate=");
		sb.append(expiredDate);
		sb.append(", replaceDoc=");
		sb.append(replaceDoc);
		sb.append(", title=");
		sb.append(title);
		sb.append(", content=");
		sb.append(content);
		sb.append(", process=");
		sb.append(process);
		sb.append(", base=");
		sb.append(base);
		sb.append(", timeProcess=");
		sb.append(timeProcess);
		sb.append(", cost=");
		sb.append(cost);
		sb.append(", requireDoc=");
		sb.append(requireDoc);
		sb.append(", result=");
		sb.append(result);
		sb.append(", objects=");
		sb.append(objects);
		sb.append(", style=");
		sb.append(style);
		sb.append(", position=");
		sb.append(position);
		sb.append(", note=");
		sb.append(note);
		sb.append(", executeOrg=");
		sb.append(executeOrg);
		sb.append(", userHit=");
		sb.append(userHit);
		sb.append(", statusDoc=");
		sb.append(statusDoc);
		sb.append(", typeDoc=");
		sb.append(typeDoc);
		sb.append(", hasService=");
		sb.append(hasService);
		sb.append(", hasAttachment=");
		sb.append(hasAttachment);
		sb.append(", fieldId=");
		sb.append(fieldId);
		sb.append(", orgRels=");
		sb.append(orgRels);
		sb.append(", fieldRels=");
		sb.append(fieldRels);
		sb.append(", levels=");
		sb.append(levels);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public vdocDocument toEntityModel() {
		vdocDocumentImpl vdocDocumentImpl = new vdocDocumentImpl();

		if (docId == null) {
			vdocDocumentImpl.setDocId(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setDocId(docId);
		}

		vdocDocumentImpl.setGroupId(groupId);

		if (language == null) {
			vdocDocumentImpl.setLanguage(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setLanguage(language);
		}

		vdocDocumentImpl.setCompanyId(companyId);
		vdocDocumentImpl.setUserId(userId);
		vdocDocumentImpl.setCreatedByUser(createdByUser);

		if (createdDate == Long.MIN_VALUE) {
			vdocDocumentImpl.setCreatedDate(null);
		}
		else {
			vdocDocumentImpl.setCreatedDate(new Date(createdDate));
		}

		vdocDocumentImpl.setModifiedByUser(modifiedByUser);

		if (modifiedDate == Long.MIN_VALUE) {
			vdocDocumentImpl.setModifiedDate(null);
		}
		else {
			vdocDocumentImpl.setModifiedDate(new Date(modifiedDate));
		}

		vdocDocumentImpl.setApprovedByUser(approvedByUser);

		if (approvedDate == Long.MIN_VALUE) {
			vdocDocumentImpl.setApprovedDate(null);
		}
		else {
			vdocDocumentImpl.setApprovedDate(new Date(approvedDate));
		}

		vdocDocumentImpl.setPublishedByUser(publishedByUser);

		if (publishedDate == Long.MIN_VALUE) {
			vdocDocumentImpl.setPublishedDate(null);
		}
		else {
			vdocDocumentImpl.setPublishedDate(new Date(publishedDate));
		}

		if (promulDate == Long.MIN_VALUE) {
			vdocDocumentImpl.setPromulDate(null);
		}
		else {
			vdocDocumentImpl.setPromulDate(new Date(promulDate));
		}

		if (effectivedDate == Long.MIN_VALUE) {
			vdocDocumentImpl.setEffectivedDate(null);
		}
		else {
			vdocDocumentImpl.setEffectivedDate(new Date(effectivedDate));
		}

		if (expiredDate == Long.MIN_VALUE) {
			vdocDocumentImpl.setExpiredDate(null);
		}
		else {
			vdocDocumentImpl.setExpiredDate(new Date(expiredDate));
		}

		if (replaceDoc == null) {
			vdocDocumentImpl.setReplaceDoc(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setReplaceDoc(replaceDoc);
		}

		if (title == null) {
			vdocDocumentImpl.setTitle(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setTitle(title);
		}

		if (content == null) {
			vdocDocumentImpl.setContent(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setContent(content);
		}

		if (process == null) {
			vdocDocumentImpl.setProcess(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setProcess(process);
		}

		if (base == null) {
			vdocDocumentImpl.setBase(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setBase(base);
		}

		if (timeProcess == null) {
			vdocDocumentImpl.setTimeProcess(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setTimeProcess(timeProcess);
		}

		if (cost == null) {
			vdocDocumentImpl.setCost(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setCost(cost);
		}

		if (requireDoc == null) {
			vdocDocumentImpl.setRequireDoc(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setRequireDoc(requireDoc);
		}

		if (result == null) {
			vdocDocumentImpl.setResult(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setResult(result);
		}

		if (objects == null) {
			vdocDocumentImpl.setObjects(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setObjects(objects);
		}

		if (style == null) {
			vdocDocumentImpl.setStyle(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setStyle(style);
		}

		vdocDocumentImpl.setPosition(position);

		if (note == null) {
			vdocDocumentImpl.setNote(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setNote(note);
		}

		if (executeOrg == null) {
			vdocDocumentImpl.setExecuteOrg(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setExecuteOrg(executeOrg);
		}

		vdocDocumentImpl.setUserHit(userHit);
		vdocDocumentImpl.setStatusDoc(statusDoc);
		vdocDocumentImpl.setTypeDoc(typeDoc);
		vdocDocumentImpl.setHasService(hasService);
		vdocDocumentImpl.setHasAttachment(hasAttachment);

		if (fieldId == null) {
			vdocDocumentImpl.setFieldId(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setFieldId(fieldId);
		}

		if (orgRels == null) {
			vdocDocumentImpl.setOrgRels(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setOrgRels(orgRels);
		}

		if (fieldRels == null) {
			vdocDocumentImpl.setFieldRels(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setFieldRels(fieldRels);
		}

		if (levels == null) {
			vdocDocumentImpl.setLevels(StringPool.BLANK);
		}
		else {
			vdocDocumentImpl.setLevels(levels);
		}

		vdocDocumentImpl.resetOriginalValues();

		return vdocDocumentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		docId = objectInput.readUTF();

		groupId = objectInput.readLong();
		language = objectInput.readUTF();

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
		promulDate = objectInput.readLong();
		effectivedDate = objectInput.readLong();
		expiredDate = objectInput.readLong();
		replaceDoc = objectInput.readUTF();
		title = objectInput.readUTF();
		content = objectInput.readUTF();
		process = objectInput.readUTF();
		base = objectInput.readUTF();
		timeProcess = objectInput.readUTF();
		cost = objectInput.readUTF();
		requireDoc = objectInput.readUTF();
		result = objectInput.readUTF();
		objects = objectInput.readUTF();
		style = objectInput.readUTF();

		position = objectInput.readInt();
		note = objectInput.readUTF();
		executeOrg = objectInput.readUTF();

		userHit = objectInput.readInt();

		statusDoc = objectInput.readInt();

		typeDoc = objectInput.readInt();

		hasService = objectInput.readBoolean();

		hasAttachment = objectInput.readBoolean();
		fieldId = objectInput.readUTF();
		orgRels = objectInput.readUTF();
		fieldRels = objectInput.readUTF();
		levels = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (docId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(docId);
		}

		objectOutput.writeLong(groupId);

		if (language == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(language);
		}

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
		objectOutput.writeLong(promulDate);
		objectOutput.writeLong(effectivedDate);
		objectOutput.writeLong(expiredDate);

		if (replaceDoc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(replaceDoc);
		}

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

		if (process == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(process);
		}

		if (base == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(base);
		}

		if (timeProcess == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(timeProcess);
		}

		if (cost == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cost);
		}

		if (requireDoc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requireDoc);
		}

		if (result == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(result);
		}

		if (objects == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(objects);
		}

		if (style == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(style);
		}

		objectOutput.writeInt(position);

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}

		if (executeOrg == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(executeOrg);
		}

		objectOutput.writeInt(userHit);

		objectOutput.writeInt(statusDoc);

		objectOutput.writeInt(typeDoc);

		objectOutput.writeBoolean(hasService);

		objectOutput.writeBoolean(hasAttachment);

		if (fieldId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fieldId);
		}

		if (orgRels == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(orgRels);
		}

		if (fieldRels == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fieldRels);
		}

		if (levels == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(levels);
		}
	}

	public String docId;
	public long groupId;
	public String language;
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
	public long promulDate;
	public long effectivedDate;
	public long expiredDate;
	public String replaceDoc;
	public String title;
	public String content;
	public String process;
	public String base;
	public String timeProcess;
	public String cost;
	public String requireDoc;
	public String result;
	public String objects;
	public String style;
	public int position;
	public String note;
	public String executeOrg;
	public int userHit;
	public int statusDoc;
	public int typeDoc;
	public boolean hasService;
	public boolean hasAttachment;
	public String fieldId;
	public String orgRels;
	public String fieldRels;
	public String levels;
}