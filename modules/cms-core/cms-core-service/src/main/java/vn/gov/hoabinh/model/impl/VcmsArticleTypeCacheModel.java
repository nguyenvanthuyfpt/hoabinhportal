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

import vn.gov.hoabinh.model.VcmsArticleType;
import vn.gov.hoabinh.service.persistence.VcmsArticleTypePK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VcmsArticleType in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleType
 * @generated
 */
@ProviderType
public class VcmsArticleTypeCacheModel implements CacheModel<VcmsArticleType>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsArticleTypeCacheModel)) {
			return false;
		}

		VcmsArticleTypeCacheModel vcmsArticleTypeCacheModel = (VcmsArticleTypeCacheModel)obj;

		if (vcmsArticleTypePK.equals(
					vcmsArticleTypeCacheModel.vcmsArticleTypePK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vcmsArticleTypePK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{typeId=");
		sb.append(typeId);
		sb.append(", articleId=");
		sb.append(articleId);
		sb.append(", position=");
		sb.append(position);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VcmsArticleType toEntityModel() {
		VcmsArticleTypeImpl vcmsArticleTypeImpl = new VcmsArticleTypeImpl();

		vcmsArticleTypeImpl.setTypeId(typeId);

		if (articleId == null) {
			vcmsArticleTypeImpl.setArticleId(StringPool.BLANK);
		}
		else {
			vcmsArticleTypeImpl.setArticleId(articleId);
		}

		vcmsArticleTypeImpl.setPosition(position);

		vcmsArticleTypeImpl.resetOriginalValues();

		return vcmsArticleTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		typeId = objectInput.readLong();
		articleId = objectInput.readUTF();

		position = objectInput.readInt();

		vcmsArticleTypePK = new VcmsArticleTypePK(typeId, articleId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(typeId);

		if (articleId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(articleId);
		}

		objectOutput.writeInt(position);
	}

	public long typeId;
	public String articleId;
	public int position;
	public transient VcmsArticleTypePK vcmsArticleTypePK;
}