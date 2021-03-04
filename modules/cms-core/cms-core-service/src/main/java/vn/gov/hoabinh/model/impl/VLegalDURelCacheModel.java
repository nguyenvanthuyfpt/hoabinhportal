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

import vn.gov.hoabinh.model.VLegalDURel;
import vn.gov.hoabinh.service.persistence.VLegalDURelPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VLegalDURel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDURel
 * @generated
 */
@ProviderType
public class VLegalDURelCacheModel implements CacheModel<VLegalDURel>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalDURelCacheModel)) {
			return false;
		}

		VLegalDURelCacheModel vLegalDURelCacheModel = (VLegalDURelCacheModel)obj;

		if (vLegalDURelPK.equals(vLegalDURelCacheModel.vLegalDURelPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vLegalDURelPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{departmentId=");
		sb.append(departmentId);
		sb.append(", userid=");
		sb.append(userid);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VLegalDURel toEntityModel() {
		VLegalDURelImpl vLegalDURelImpl = new VLegalDURelImpl();

		vLegalDURelImpl.setDepartmentId(departmentId);
		vLegalDURelImpl.setUserid(userid);

		vLegalDURelImpl.resetOriginalValues();

		return vLegalDURelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		departmentId = objectInput.readLong();

		userid = objectInput.readLong();

		vLegalDURelPK = new VLegalDURelPK(departmentId, userid);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(departmentId);

		objectOutput.writeLong(userid);
	}

	public long departmentId;
	public long userid;
	public transient VLegalDURelPK vLegalDURelPK;
}