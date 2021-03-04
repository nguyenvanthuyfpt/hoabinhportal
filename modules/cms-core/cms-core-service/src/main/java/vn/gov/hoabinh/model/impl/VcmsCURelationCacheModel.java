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

import vn.gov.hoabinh.model.VcmsCURelation;
import vn.gov.hoabinh.service.persistence.VcmsCURelationPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VcmsCURelation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCURelation
 * @generated
 */
@ProviderType
public class VcmsCURelationCacheModel implements CacheModel<VcmsCURelation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsCURelationCacheModel)) {
			return false;
		}

		VcmsCURelationCacheModel vcmsCURelationCacheModel = (VcmsCURelationCacheModel)obj;

		if (vcmsCURelationPK.equals(vcmsCURelationCacheModel.vcmsCURelationPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vcmsCURelationPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{categoryId=");
		sb.append(categoryId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VcmsCURelation toEntityModel() {
		VcmsCURelationImpl vcmsCURelationImpl = new VcmsCURelationImpl();

		if (categoryId == null) {
			vcmsCURelationImpl.setCategoryId(StringPool.BLANK);
		}
		else {
			vcmsCURelationImpl.setCategoryId(categoryId);
		}

		if (userId == null) {
			vcmsCURelationImpl.setUserId(StringPool.BLANK);
		}
		else {
			vcmsCURelationImpl.setUserId(userId);
		}

		vcmsCURelationImpl.resetOriginalValues();

		return vcmsCURelationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		categoryId = objectInput.readUTF();
		userId = objectInput.readUTF();

		vcmsCURelationPK = new VcmsCURelationPK(categoryId, userId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (categoryId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(categoryId);
		}

		if (userId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userId);
		}
	}

	public String categoryId;
	public String userId;
	public transient VcmsCURelationPK vcmsCURelationPK;
}