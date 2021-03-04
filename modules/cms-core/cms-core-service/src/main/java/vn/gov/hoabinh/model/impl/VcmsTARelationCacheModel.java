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

import vn.gov.hoabinh.model.VcmsTARelation;
import vn.gov.hoabinh.service.persistence.VcmsTARelationPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing VcmsTARelation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsTARelation
 * @generated
 */
@ProviderType
public class VcmsTARelationCacheModel implements CacheModel<VcmsTARelation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsTARelationCacheModel)) {
			return false;
		}

		VcmsTARelationCacheModel vcmsTARelationCacheModel = (VcmsTARelationCacheModel)obj;

		if (vcmsTARelationPK.equals(vcmsTARelationCacheModel.vcmsTARelationPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vcmsTARelationPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{threadId=");
		sb.append(threadId);
		sb.append(", articleId=");
		sb.append(articleId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VcmsTARelation toEntityModel() {
		VcmsTARelationImpl vcmsTARelationImpl = new VcmsTARelationImpl();

		if (threadId == null) {
			vcmsTARelationImpl.setThreadId(StringPool.BLANK);
		}
		else {
			vcmsTARelationImpl.setThreadId(threadId);
		}

		if (articleId == null) {
			vcmsTARelationImpl.setArticleId(StringPool.BLANK);
		}
		else {
			vcmsTARelationImpl.setArticleId(articleId);
		}

		vcmsTARelationImpl.resetOriginalValues();

		return vcmsTARelationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		threadId = objectInput.readUTF();
		articleId = objectInput.readUTF();

		vcmsTARelationPK = new VcmsTARelationPK(threadId, articleId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (threadId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(threadId);
		}

		if (articleId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(articleId);
		}
	}

	public String threadId;
	public String articleId;
	public transient VcmsTARelationPK vcmsTARelationPK;
}