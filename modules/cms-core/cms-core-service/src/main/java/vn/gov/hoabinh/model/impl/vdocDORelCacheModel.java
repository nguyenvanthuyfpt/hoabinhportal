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

import vn.gov.hoabinh.model.vdocDORel;
import vn.gov.hoabinh.service.persistence.vdocDORelPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing vdocDORel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see vdocDORel
 * @generated
 */
@ProviderType
public class vdocDORelCacheModel implements CacheModel<vdocDORel>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof vdocDORelCacheModel)) {
			return false;
		}

		vdocDORelCacheModel vdocDORelCacheModel = (vdocDORelCacheModel)obj;

		if (vdocDORelPK.equals(vdocDORelCacheModel.vdocDORelPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vdocDORelPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{docId=");
		sb.append(docId);
		sb.append(", orgId=");
		sb.append(orgId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public vdocDORel toEntityModel() {
		vdocDORelImpl vdocDORelImpl = new vdocDORelImpl();

		if (docId == null) {
			vdocDORelImpl.setDocId(StringPool.BLANK);
		}
		else {
			vdocDORelImpl.setDocId(docId);
		}

		if (orgId == null) {
			vdocDORelImpl.setOrgId(StringPool.BLANK);
		}
		else {
			vdocDORelImpl.setOrgId(orgId);
		}

		vdocDORelImpl.resetOriginalValues();

		return vdocDORelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		docId = objectInput.readUTF();
		orgId = objectInput.readUTF();

		vdocDORelPK = new vdocDORelPK(docId, orgId);
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

		if (orgId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(orgId);
		}
	}

	public String docId;
	public String orgId;
	public transient vdocDORelPK vdocDORelPK;
}