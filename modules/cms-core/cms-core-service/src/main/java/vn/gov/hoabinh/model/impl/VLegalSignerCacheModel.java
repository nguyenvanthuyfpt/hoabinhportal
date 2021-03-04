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

import vn.gov.hoabinh.model.VLegalSigner;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VLegalSigner in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSigner
 * @generated
 */
@ProviderType
public class VLegalSignerCacheModel implements CacheModel<VLegalSigner>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalSignerCacheModel)) {
			return false;
		}

		VLegalSignerCacheModel vLegalSignerCacheModel = (VLegalSignerCacheModel)obj;

		if (sigId.equals(vLegalSignerCacheModel.sigId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sigId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{sigId=");
		sb.append(sigId);
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
		sb.append(", createdByUser=");
		sb.append(createdByUser);
		sb.append(", modifiedByUser=");
		sb.append(modifiedByUser);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", language=");
		sb.append(language);
		sb.append(", statusSigner=");
		sb.append(statusSigner);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VLegalSigner toEntityModel() {
		VLegalSignerImpl vLegalSignerImpl = new VLegalSignerImpl();

		if (sigId == null) {
			vLegalSignerImpl.setSigId(StringPool.BLANK);
		}
		else {
			vLegalSignerImpl.setSigId(sigId);
		}

		vLegalSignerImpl.setGroupId(groupId);
		vLegalSignerImpl.setCompanyId(companyId);
		vLegalSignerImpl.setUserId(userId);

		if (createdDate == Long.MIN_VALUE) {
			vLegalSignerImpl.setCreatedDate(null);
		}
		else {
			vLegalSignerImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vLegalSignerImpl.setModifiedDate(null);
		}
		else {
			vLegalSignerImpl.setModifiedDate(new Date(modifiedDate));
		}

		vLegalSignerImpl.setCreatedByUser(createdByUser);
		vLegalSignerImpl.setModifiedByUser(modifiedByUser);

		if (firstName == null) {
			vLegalSignerImpl.setFirstName(StringPool.BLANK);
		}
		else {
			vLegalSignerImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			vLegalSignerImpl.setLastName(StringPool.BLANK);
		}
		else {
			vLegalSignerImpl.setLastName(lastName);
		}

		if (language == null) {
			vLegalSignerImpl.setLanguage(StringPool.BLANK);
		}
		else {
			vLegalSignerImpl.setLanguage(language);
		}

		vLegalSignerImpl.setStatusSigner(statusSigner);

		vLegalSignerImpl.resetOriginalValues();

		return vLegalSignerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sigId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		createdDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		createdByUser = objectInput.readLong();

		modifiedByUser = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		language = objectInput.readUTF();

		statusSigner = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (sigId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sigId);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(createdByUser);

		objectOutput.writeLong(modifiedByUser);

		if (firstName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (language == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(language);
		}

		objectOutput.writeBoolean(statusSigner);
	}

	public String sigId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createdDate;
	public long modifiedDate;
	public long createdByUser;
	public long modifiedByUser;
	public String firstName;
	public String lastName;
	public String language;
	public boolean statusSigner;
}