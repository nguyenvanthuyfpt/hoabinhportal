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

import vn.gov.hoabinh.model.VLegalFORel;
import vn.gov.hoabinh.service.persistence.VLegalFORelPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VLegalFORel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFORel
 * @generated
 */
@ProviderType
public class VLegalFORelCacheModel implements CacheModel<VLegalFORel>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalFORelCacheModel)) {
			return false;
		}

		VLegalFORelCacheModel vLegalFORelCacheModel = (VLegalFORelCacheModel)obj;

		if (vLegalFORelPK.equals(vLegalFORelCacheModel.vLegalFORelPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vLegalFORelPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{fieldId=");
		sb.append(fieldId);
		sb.append(", orgId=");
		sb.append(orgId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VLegalFORel toEntityModel() {
		VLegalFORelImpl vLegalFORelImpl = new VLegalFORelImpl();

		if (fieldId == null) {
			vLegalFORelImpl.setFieldId(StringPool.BLANK);
		}
		else {
			vLegalFORelImpl.setFieldId(fieldId);
		}

		if (orgId == null) {
			vLegalFORelImpl.setOrgId(StringPool.BLANK);
		}
		else {
			vLegalFORelImpl.setOrgId(orgId);
		}

		vLegalFORelImpl.resetOriginalValues();

		return vLegalFORelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fieldId = objectInput.readUTF();
		orgId = objectInput.readUTF();

		vLegalFORelPK = new VLegalFORelPK(fieldId, orgId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
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
	}

	public String fieldId;
	public String orgId;
	public transient VLegalFORelPK vLegalFORelPK;
}