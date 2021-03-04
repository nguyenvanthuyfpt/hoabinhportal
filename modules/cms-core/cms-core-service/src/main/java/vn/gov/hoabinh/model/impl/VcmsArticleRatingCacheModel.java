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

import vn.gov.hoabinh.model.VcmsArticleRating;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VcmsArticleRating in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleRating
 * @generated
 */
@ProviderType
public class VcmsArticleRatingCacheModel implements CacheModel<VcmsArticleRating>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsArticleRatingCacheModel)) {
			return false;
		}

		VcmsArticleRatingCacheModel vcmsArticleRatingCacheModel = (VcmsArticleRatingCacheModel)obj;

		if (Id == vcmsArticleRatingCacheModel.Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", articleId=");
		sb.append(articleId);
		sb.append(", rating=");
		sb.append(rating);
		sb.append(", sessionId=");
		sb.append(sessionId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VcmsArticleRating toEntityModel() {
		VcmsArticleRatingImpl vcmsArticleRatingImpl = new VcmsArticleRatingImpl();

		vcmsArticleRatingImpl.setId(Id);

		if (createdDate == Long.MIN_VALUE) {
			vcmsArticleRatingImpl.setCreatedDate(null);
		}
		else {
			vcmsArticleRatingImpl.setCreatedDate(new Date(createdDate));
		}

		vcmsArticleRatingImpl.setArticleId(articleId);
		vcmsArticleRatingImpl.setRating(rating);

		if (sessionId == null) {
			vcmsArticleRatingImpl.setSessionId(StringPool.BLANK);
		}
		else {
			vcmsArticleRatingImpl.setSessionId(sessionId);
		}

		vcmsArticleRatingImpl.resetOriginalValues();

		return vcmsArticleRatingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		createdDate = objectInput.readLong();

		articleId = objectInput.readLong();

		rating = objectInput.readInt();
		sessionId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);
		objectOutput.writeLong(createdDate);

		objectOutput.writeLong(articleId);

		objectOutput.writeInt(rating);

		if (sessionId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sessionId);
		}
	}

	public long Id;
	public long createdDate;
	public long articleId;
	public int rating;
	public String sessionId;
}