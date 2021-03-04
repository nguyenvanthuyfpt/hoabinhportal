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

import vn.gov.hoabinh.model.VLegalFTRel;
import vn.gov.hoabinh.service.persistence.VLegalFTRelPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VLegalFTRel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFTRel
 * @generated
 */
@ProviderType
public class VLegalFTRelCacheModel implements CacheModel<VLegalFTRel>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalFTRelCacheModel)) {
			return false;
		}

		VLegalFTRelCacheModel vLegalFTRelCacheModel = (VLegalFTRelCacheModel)obj;

		if (vLegalFTRelPK.equals(vLegalFTRelCacheModel.vLegalFTRelPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vLegalFTRelPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{fieldId=");
		sb.append(fieldId);
		sb.append(", typeId=");
		sb.append(typeId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VLegalFTRel toEntityModel() {
		VLegalFTRelImpl vLegalFTRelImpl = new VLegalFTRelImpl();

		if (fieldId == null) {
			vLegalFTRelImpl.setFieldId(StringPool.BLANK);
		}
		else {
			vLegalFTRelImpl.setFieldId(fieldId);
		}

		if (typeId == null) {
			vLegalFTRelImpl.setTypeId(StringPool.BLANK);
		}
		else {
			vLegalFTRelImpl.setTypeId(typeId);
		}

		vLegalFTRelImpl.resetOriginalValues();

		return vLegalFTRelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fieldId = objectInput.readUTF();
		typeId = objectInput.readUTF();

		vLegalFTRelPK = new VLegalFTRelPK(fieldId, typeId);
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

		if (typeId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(typeId);
		}
	}

	public String fieldId;
	public String typeId;
	public transient VLegalFTRelPK vLegalFTRelPK;
}