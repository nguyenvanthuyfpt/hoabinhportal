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

import vn.gov.hoabinh.model.VcmsArticleStatus;
import vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VcmsArticleStatus in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleStatus
 * @generated
 */
@ProviderType
public class VcmsArticleStatusCacheModel implements CacheModel<VcmsArticleStatus>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsArticleStatusCacheModel)) {
			return false;
		}

		VcmsArticleStatusCacheModel vcmsArticleStatusCacheModel = (VcmsArticleStatusCacheModel)obj;

		if (vcmsArticleStatusPK.equals(
					vcmsArticleStatusCacheModel.vcmsArticleStatusPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vcmsArticleStatusPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{statusId=");
		sb.append(statusId);
		sb.append(", articleId=");
		sb.append(articleId);
		sb.append(", categoryId=");
		sb.append(categoryId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdByUser=");
		sb.append(createdByUser);
		sb.append(", active=");
		sb.append(active);
		sb.append(", articleVersionId=");
		sb.append(articleVersionId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VcmsArticleStatus toEntityModel() {
		VcmsArticleStatusImpl vcmsArticleStatusImpl = new VcmsArticleStatusImpl();

		vcmsArticleStatusImpl.setStatusId(statusId);

		if (articleId == null) {
			vcmsArticleStatusImpl.setArticleId(StringPool.BLANK);
		}
		else {
			vcmsArticleStatusImpl.setArticleId(articleId);
		}

		if (categoryId == null) {
			vcmsArticleStatusImpl.setCategoryId(StringPool.BLANK);
		}
		else {
			vcmsArticleStatusImpl.setCategoryId(categoryId);
		}

		if (createdDate == Long.MIN_VALUE) {
			vcmsArticleStatusImpl.setCreatedDate(null);
		}
		else {
			vcmsArticleStatusImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdByUser == null) {
			vcmsArticleStatusImpl.setCreatedByUser(StringPool.BLANK);
		}
		else {
			vcmsArticleStatusImpl.setCreatedByUser(createdByUser);
		}

		vcmsArticleStatusImpl.setActive(active);
		vcmsArticleStatusImpl.setArticleVersionId(articleVersionId);

		vcmsArticleStatusImpl.resetOriginalValues();

		return vcmsArticleStatusImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		statusId = objectInput.readLong();
		articleId = objectInput.readUTF();
		categoryId = objectInput.readUTF();
		createdDate = objectInput.readLong();
		createdByUser = objectInput.readUTF();

		active = objectInput.readBoolean();

		articleVersionId = objectInput.readLong();

		vcmsArticleStatusPK = new VcmsArticleStatusPK(statusId, articleId,
				categoryId);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(statusId);

		if (articleId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(articleId);
		}

		if (categoryId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(categoryId);
		}

		objectOutput.writeLong(createdDate);

		if (createdByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createdByUser);
		}

		objectOutput.writeBoolean(active);

		objectOutput.writeLong(articleVersionId);
	}

	public long statusId;
	public String articleId;
	public String categoryId;
	public long createdDate;
	public String createdByUser;
	public boolean active;
	public long articleVersionId;
	public transient VcmsArticleStatusPK vcmsArticleStatusPK;
}