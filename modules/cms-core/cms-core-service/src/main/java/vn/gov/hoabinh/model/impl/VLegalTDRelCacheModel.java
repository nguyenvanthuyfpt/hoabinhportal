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

import vn.gov.hoabinh.model.VLegalTDRel;
import vn.gov.hoabinh.service.persistence.VLegalTDRelPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VLegalTDRel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTDRel
 * @generated
 */
@ProviderType
public class VLegalTDRelCacheModel implements CacheModel<VLegalTDRel>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalTDRelCacheModel)) {
			return false;
		}

		VLegalTDRelCacheModel vLegalTDRelCacheModel = (VLegalTDRelCacheModel)obj;

		if (vLegalTDRelPK.equals(vLegalTDRelCacheModel.vLegalTDRelPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vLegalTDRelPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{docId=");
		sb.append(docId);
		sb.append(", tagId=");
		sb.append(tagId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VLegalTDRel toEntityModel() {
		VLegalTDRelImpl vLegalTDRelImpl = new VLegalTDRelImpl();

		if (docId == null) {
			vLegalTDRelImpl.setDocId(StringPool.BLANK);
		}
		else {
			vLegalTDRelImpl.setDocId(docId);
		}

		if (tagId == null) {
			vLegalTDRelImpl.setTagId(StringPool.BLANK);
		}
		else {
			vLegalTDRelImpl.setTagId(tagId);
		}

		vLegalTDRelImpl.resetOriginalValues();

		return vLegalTDRelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		docId = objectInput.readUTF();
		tagId = objectInput.readUTF();

		vLegalTDRelPK = new VLegalTDRelPK(docId, tagId);
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

		if (tagId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tagId);
		}
	}

	public String docId;
	public String tagId;
	public transient VLegalTDRelPK vLegalTDRelPK;
}