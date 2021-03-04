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

import vn.gov.hoabinh.model.VLegalDFRel;
import vn.gov.hoabinh.service.persistence.VLegalDFRelPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VLegalDFRel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDFRel
 * @generated
 */
@ProviderType
public class VLegalDFRelCacheModel implements CacheModel<VLegalDFRel>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalDFRelCacheModel)) {
			return false;
		}

		VLegalDFRelCacheModel vLegalDFRelCacheModel = (VLegalDFRelCacheModel)obj;

		if (vLegalDFRelPK.equals(vLegalDFRelCacheModel.vLegalDFRelPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vLegalDFRelPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{fieldId=");
		sb.append(fieldId);
		sb.append(", docId=");
		sb.append(docId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VLegalDFRel toEntityModel() {
		VLegalDFRelImpl vLegalDFRelImpl = new VLegalDFRelImpl();

		if (fieldId == null) {
			vLegalDFRelImpl.setFieldId(StringPool.BLANK);
		}
		else {
			vLegalDFRelImpl.setFieldId(fieldId);
		}

		if (docId == null) {
			vLegalDFRelImpl.setDocId(StringPool.BLANK);
		}
		else {
			vLegalDFRelImpl.setDocId(docId);
		}

		vLegalDFRelImpl.resetOriginalValues();

		return vLegalDFRelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fieldId = objectInput.readUTF();
		docId = objectInput.readUTF();

		vLegalDFRelPK = new VLegalDFRelPK(fieldId, docId);
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

		if (docId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(docId);
		}
	}

	public String fieldId;
	public String docId;
	public transient VLegalDFRelPK vLegalDFRelPK;
}