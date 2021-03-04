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

import vn.gov.hoabinh.model.VLegalDSRel;
import vn.gov.hoabinh.service.persistence.VLegalDSRelPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VLegalDSRel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDSRel
 * @generated
 */
@ProviderType
public class VLegalDSRelCacheModel implements CacheModel<VLegalDSRel>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalDSRelCacheModel)) {
			return false;
		}

		VLegalDSRelCacheModel vLegalDSRelCacheModel = (VLegalDSRelCacheModel)obj;

		if (vLegalDSRelPK.equals(vLegalDSRelCacheModel.vLegalDSRelPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vLegalDSRelPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{sigId=");
		sb.append(sigId);
		sb.append(", docId=");
		sb.append(docId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VLegalDSRel toEntityModel() {
		VLegalDSRelImpl vLegalDSRelImpl = new VLegalDSRelImpl();

		if (sigId == null) {
			vLegalDSRelImpl.setSigId(StringPool.BLANK);
		}
		else {
			vLegalDSRelImpl.setSigId(sigId);
		}

		if (docId == null) {
			vLegalDSRelImpl.setDocId(StringPool.BLANK);
		}
		else {
			vLegalDSRelImpl.setDocId(docId);
		}

		vLegalDSRelImpl.resetOriginalValues();

		return vLegalDSRelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		sigId = objectInput.readUTF();
		docId = objectInput.readUTF();

		vLegalDSRelPK = new VLegalDSRelPK(sigId, docId);
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

		if (docId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(docId);
		}
	}

	public String sigId;
	public String docId;
	public transient VLegalDSRelPK vLegalDSRelPK;
}