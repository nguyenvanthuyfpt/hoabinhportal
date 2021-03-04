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

import vn.gov.hoabinh.model.vdocFieldLevelRel;
import vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing vdocFieldLevelRel in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see vdocFieldLevelRel
 * @generated
 */
@ProviderType
public class vdocFieldLevelRelCacheModel implements CacheModel<vdocFieldLevelRel>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof vdocFieldLevelRelCacheModel)) {
			return false;
		}

		vdocFieldLevelRelCacheModel vdocFieldLevelRelCacheModel = (vdocFieldLevelRelCacheModel)obj;

		if (vdocFieldLevelRelPK.equals(
					vdocFieldLevelRelCacheModel.vdocFieldLevelRelPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vdocFieldLevelRelPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{fieldId=");
		sb.append(fieldId);
		sb.append(", levelId=");
		sb.append(levelId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public vdocFieldLevelRel toEntityModel() {
		vdocFieldLevelRelImpl vdocFieldLevelRelImpl = new vdocFieldLevelRelImpl();

		if (fieldId == null) {
			vdocFieldLevelRelImpl.setFieldId(StringPool.BLANK);
		}
		else {
			vdocFieldLevelRelImpl.setFieldId(fieldId);
		}

		if (levelId == null) {
			vdocFieldLevelRelImpl.setLevelId(StringPool.BLANK);
		}
		else {
			vdocFieldLevelRelImpl.setLevelId(levelId);
		}

		vdocFieldLevelRelImpl.resetOriginalValues();

		return vdocFieldLevelRelImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fieldId = objectInput.readUTF();
		levelId = objectInput.readUTF();

		vdocFieldLevelRelPK = new vdocFieldLevelRelPK(fieldId, levelId);
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

		if (levelId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(levelId);
		}
	}

	public String fieldId;
	public String levelId;
	public transient vdocFieldLevelRelPK vdocFieldLevelRelPK;
}