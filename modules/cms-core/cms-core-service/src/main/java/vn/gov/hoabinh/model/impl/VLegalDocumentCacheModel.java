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

import vn.gov.hoabinh.model.VLegalDocument;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VLegalDocument in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDocument
 * @generated
 */
@ProviderType
public class VLegalDocumentCacheModel implements CacheModel<VLegalDocument>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalDocumentCacheModel)) {
			return false;
		}

		VLegalDocumentCacheModel vLegalDocumentCacheModel = (VLegalDocumentCacheModel)obj;

		if (docId.equals(vLegalDocumentCacheModel.docId)) {
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
		StringBundler sb = new StringBundler(71);

		sb.append("{docId=");
		sb.append(docId);
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
		sb.append(", forwardedByUser=");
		sb.append(forwardedByUser);
		sb.append(", forwardedDate=");
		sb.append(forwardedDate);
		sb.append(", publishedByUser=");
		sb.append(publishedByUser);
		sb.append(", publishedDate=");
		sb.append(publishedDate);
		sb.append(", symbol=");
		sb.append(symbol);
		sb.append(", num=");
		sb.append(num);
		sb.append(", promulDate=");
		sb.append(promulDate);
		sb.append(", effectivedDate=");
		sb.append(effectivedDate);
		sb.append(", expiredDate=");
		sb.append(expiredDate);
		sb.append(", replaceDoc=");
		sb.append(replaceDoc);
		sb.append(", summary=");
		sb.append(summary);
		sb.append(", content=");
		sb.append(content);
		sb.append(", language=");
		sb.append(language);
		sb.append(", userHit=");
		sb.append(userHit);
		sb.append(", statusDoc=");
		sb.append(statusDoc);
		sb.append(", hasAttachment=");
		sb.append(hasAttachment);
		sb.append(", typeDocId=");
		sb.append(typeDocId);
		sb.append(", fieldId=");
		sb.append(fieldId);
		sb.append(", orgId=");
		sb.append(orgId);
		sb.append(", orgRels=");
		sb.append(orgRels);
		sb.append(", signerRels=");
		sb.append(signerRels);
		sb.append(", fieldRels=");
		sb.append(fieldRels);
		sb.append(", numRels=");
		sb.append(numRels);
		sb.append(", docCode=");
		sb.append(docCode);
		sb.append(", departmentRels=");
		sb.append(departmentRels);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VLegalDocument toEntityModel() {
		VLegalDocumentImpl vLegalDocumentImpl = new VLegalDocumentImpl();

		if (docId == null) {
			vLegalDocumentImpl.setDocId(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setDocId(docId);
		}

		vLegalDocumentImpl.setGroupId(groupId);
		vLegalDocumentImpl.setCompanyId(companyId);
		vLegalDocumentImpl.setUserId(userId);
		vLegalDocumentImpl.setCreatedByUser(createdByUser);

		if (createdDate == Long.MIN_VALUE) {
			vLegalDocumentImpl.setCreatedDate(null);
		}
		else {
			vLegalDocumentImpl.setCreatedDate(new Date(createdDate));
		}

		vLegalDocumentImpl.setModifiedByUser(modifiedByUser);

		if (modifiedDate == Long.MIN_VALUE) {
			vLegalDocumentImpl.setModifiedDate(null);
		}
		else {
			vLegalDocumentImpl.setModifiedDate(new Date(modifiedDate));
		}

		vLegalDocumentImpl.setApprovedByUser(approvedByUser);

		if (approvedDate == Long.MIN_VALUE) {
			vLegalDocumentImpl.setApprovedDate(null);
		}
		else {
			vLegalDocumentImpl.setApprovedDate(new Date(approvedDate));
		}

		vLegalDocumentImpl.setForwardedByUser(forwardedByUser);

		if (forwardedDate == Long.MIN_VALUE) {
			vLegalDocumentImpl.setForwardedDate(null);
		}
		else {
			vLegalDocumentImpl.setForwardedDate(new Date(forwardedDate));
		}

		vLegalDocumentImpl.setPublishedByUser(publishedByUser);

		if (publishedDate == Long.MIN_VALUE) {
			vLegalDocumentImpl.setPublishedDate(null);
		}
		else {
			vLegalDocumentImpl.setPublishedDate(new Date(publishedDate));
		}

		if (symbol == null) {
			vLegalDocumentImpl.setSymbol(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setSymbol(symbol);
		}

		if (num == null) {
			vLegalDocumentImpl.setNum(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setNum(num);
		}

		if (promulDate == Long.MIN_VALUE) {
			vLegalDocumentImpl.setPromulDate(null);
		}
		else {
			vLegalDocumentImpl.setPromulDate(new Date(promulDate));
		}

		if (effectivedDate == Long.MIN_VALUE) {
			vLegalDocumentImpl.setEffectivedDate(null);
		}
		else {
			vLegalDocumentImpl.setEffectivedDate(new Date(effectivedDate));
		}

		if (expiredDate == Long.MIN_VALUE) {
			vLegalDocumentImpl.setExpiredDate(null);
		}
		else {
			vLegalDocumentImpl.setExpiredDate(new Date(expiredDate));
		}

		if (replaceDoc == null) {
			vLegalDocumentImpl.setReplaceDoc(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setReplaceDoc(replaceDoc);
		}

		if (summary == null) {
			vLegalDocumentImpl.setSummary(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setSummary(summary);
		}

		if (content == null) {
			vLegalDocumentImpl.setContent(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setContent(content);
		}

		if (language == null) {
			vLegalDocumentImpl.setLanguage(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setLanguage(language);
		}

		vLegalDocumentImpl.setUserHit(userHit);
		vLegalDocumentImpl.setStatusDoc(statusDoc);
		vLegalDocumentImpl.setHasAttachment(hasAttachment);

		if (typeDocId == null) {
			vLegalDocumentImpl.setTypeDocId(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setTypeDocId(typeDocId);
		}

		if (fieldId == null) {
			vLegalDocumentImpl.setFieldId(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setFieldId(fieldId);
		}

		if (orgId == null) {
			vLegalDocumentImpl.setOrgId(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setOrgId(orgId);
		}

		if (orgRels == null) {
			vLegalDocumentImpl.setOrgRels(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setOrgRels(orgRels);
		}

		if (signerRels == null) {
			vLegalDocumentImpl.setSignerRels(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setSignerRels(signerRels);
		}

		if (fieldRels == null) {
			vLegalDocumentImpl.setFieldRels(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setFieldRels(fieldRels);
		}

		if (numRels == null) {
			vLegalDocumentImpl.setNumRels(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setNumRels(numRels);
		}

		if (docCode == null) {
			vLegalDocumentImpl.setDocCode(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setDocCode(docCode);
		}

		if (departmentRels == null) {
			vLegalDocumentImpl.setDepartmentRels(StringPool.BLANK);
		}
		else {
			vLegalDocumentImpl.setDepartmentRels(departmentRels);
		}

		vLegalDocumentImpl.resetOriginalValues();

		return vLegalDocumentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		docId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();

		createdByUser = objectInput.readLong();
		createdDate = objectInput.readLong();

		modifiedByUser = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		approvedByUser = objectInput.readLong();
		approvedDate = objectInput.readLong();

		forwardedByUser = objectInput.readLong();
		forwardedDate = objectInput.readLong();

		publishedByUser = objectInput.readLong();
		publishedDate = objectInput.readLong();
		symbol = objectInput.readUTF();
		num = objectInput.readUTF();
		promulDate = objectInput.readLong();
		effectivedDate = objectInput.readLong();
		expiredDate = objectInput.readLong();
		replaceDoc = objectInput.readUTF();
		summary = objectInput.readUTF();
		content = objectInput.readUTF();
		language = objectInput.readUTF();

		userHit = objectInput.readInt();

		statusDoc = objectInput.readInt();

		hasAttachment = objectInput.readBoolean();
		typeDocId = objectInput.readUTF();
		fieldId = objectInput.readUTF();
		orgId = objectInput.readUTF();
		orgRels = objectInput.readUTF();
		signerRels = objectInput.readUTF();
		fieldRels = objectInput.readUTF();
		numRels = objectInput.readUTF();
		docCode = objectInput.readUTF();
		departmentRels = objectInput.readUTF();
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

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		objectOutput.writeLong(createdByUser);
		objectOutput.writeLong(createdDate);

		objectOutput.writeLong(modifiedByUser);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(approvedByUser);
		objectOutput.writeLong(approvedDate);

		objectOutput.writeLong(forwardedByUser);
		objectOutput.writeLong(forwardedDate);

		objectOutput.writeLong(publishedByUser);
		objectOutput.writeLong(publishedDate);

		if (symbol == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(symbol);
		}

		if (num == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(num);
		}

		objectOutput.writeLong(promulDate);
		objectOutput.writeLong(effectivedDate);
		objectOutput.writeLong(expiredDate);

		if (replaceDoc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(replaceDoc);
		}

		if (summary == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(summary);
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

		objectOutput.writeInt(userHit);

		objectOutput.writeInt(statusDoc);

		objectOutput.writeBoolean(hasAttachment);

		if (typeDocId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(typeDocId);
		}

		if (fieldId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fieldId);
		}

		if (orgId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(orgId);
		}

		if (orgRels == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(orgRels);
		}

		if (signerRels == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signerRels);
		}

		if (fieldRels == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fieldRels);
		}

		if (numRels == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(numRels);
		}

		if (docCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(docCode);
		}

		if (departmentRels == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(departmentRels);
		}
	}

	public String docId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createdByUser;
	public long createdDate;
	public long modifiedByUser;
	public long modifiedDate;
	public long approvedByUser;
	public long approvedDate;
	public long forwardedByUser;
	public long forwardedDate;
	public long publishedByUser;
	public long publishedDate;
	public String symbol;
	public String num;
	public long promulDate;
	public long effectivedDate;
	public long expiredDate;
	public String replaceDoc;
	public String summary;
	public String content;
	public String language;
	public int userHit;
	public int statusDoc;
	public boolean hasAttachment;
	public String typeDocId;
	public String fieldId;
	public String orgId;
	public String orgRels;
	public String signerRels;
	public String fieldRels;
	public String numRels;
	public String docCode;
	public String departmentRels;
}