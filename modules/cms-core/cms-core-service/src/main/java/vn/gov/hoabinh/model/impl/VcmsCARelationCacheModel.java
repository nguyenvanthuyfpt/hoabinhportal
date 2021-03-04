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

import vn.gov.hoabinh.model.VcmsCARelation;
import vn.gov.hoabinh.service.persistence.VcmsCARelationPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VcmsCARelation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCARelation
 * @generated
 */
@ProviderType
public class VcmsCARelationCacheModel implements CacheModel<VcmsCARelation>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsCARelationCacheModel)) {
			return false;
		}

		VcmsCARelationCacheModel vcmsCARelationCacheModel = (VcmsCARelationCacheModel)obj;

		if (vcmsCARelationPK.equals(vcmsCARelationCacheModel.vcmsCARelationPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vcmsCARelationPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{categoryId=");
		sb.append(categoryId);
		sb.append(", articleId=");
		sb.append(articleId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdByUser=");
		sb.append(createdByUser);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VcmsCARelation toEntityModel() {
		VcmsCARelationImpl vcmsCARelationImpl = new VcmsCARelationImpl();

		if (categoryId == null) {
			vcmsCARelationImpl.setCategoryId(StringPool.BLANK);
		}
		else {
			vcmsCARelationImpl.setCategoryId(categoryId);
		}

		if (articleId == null) {
			vcmsCARelationImpl.setArticleId(StringPool.BLANK);
		}
		else {
			vcmsCARelationImpl.setArticleId(articleId);
		}

		if (createdDate == Long.MIN_VALUE) {
			vcmsCARelationImpl.setCreatedDate(null);
		}
		else {
			vcmsCARelationImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdByUser == null) {
			vcmsCARelationImpl.setCreatedByUser(StringPool.BLANK);
		}
		else {
			vcmsCARelationImpl.setCreatedByUser(createdByUser);
		}

		vcmsCARelationImpl.setStatus(status);

		vcmsCARelationImpl.resetOriginalValues();

		return vcmsCARelationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		categoryId = objectInput.readUTF();
		articleId = objectInput.readUTF();
		createdDate = objectInput.readLong();
		createdByUser = objectInput.readUTF();

		status = objectInput.readLong();

		vcmsCARelationPK = new VcmsCARelationPK(categoryId, articleId);
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

		if (articleId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(articleId);
		}

		objectOutput.writeLong(createdDate);

		if (createdByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createdByUser);
		}

		objectOutput.writeLong(status);
	}

	public String categoryId;
	public String articleId;
	public long createdDate;
	public String createdByUser;
	public long status;
	public transient VcmsCARelationPK vcmsCARelationPK;
}