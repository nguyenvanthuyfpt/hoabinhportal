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

import vn.gov.hoabinh.model.VcmsPARelation;
import vn.gov.hoabinh.service.persistence.VcmsPARelationPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VcmsPARelation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsPARelation
 * @generated
 */
@ProviderType
public class VcmsPARelationCacheModel implements CacheModel<VcmsPARelation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsPARelationCacheModel)) {
			return false;
		}

		VcmsPARelationCacheModel vcmsPARelationCacheModel = (VcmsPARelationCacheModel)obj;

		if (vcmsPARelationPK.equals(vcmsPARelationCacheModel.vcmsPARelationPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vcmsPARelationPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{portionId=");
		sb.append(portionId);
		sb.append(", articleId=");
		sb.append(articleId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VcmsPARelation toEntityModel() {
		VcmsPARelationImpl vcmsPARelationImpl = new VcmsPARelationImpl();

		if (portionId == null) {
			vcmsPARelationImpl.setPortionId(StringPool.BLANK);
		}
		else {
			vcmsPARelationImpl.setPortionId(portionId);
		}

		if (articleId == null) {
			vcmsPARelationImpl.setArticleId(StringPool.BLANK);
		}
		else {
			vcmsPARelationImpl.setArticleId(articleId);
		}

		vcmsPARelationImpl.resetOriginalValues();

		return vcmsPARelationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		portionId = objectInput.readUTF();
		articleId = objectInput.readUTF();

		vcmsPARelationPK = new VcmsPARelationPK(portionId, articleId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (portionId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portionId);
		}

		if (articleId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(articleId);
		}
	}

	public String portionId;
	public String articleId;
	public transient VcmsPARelationPK vcmsPARelationPK;
}