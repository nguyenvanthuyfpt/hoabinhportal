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

import vn.gov.hoabinh.model.VcmsArticleVersion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VcmsArticleVersion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleVersion
 * @generated
 */
@ProviderType
public class VcmsArticleVersionCacheModel implements CacheModel<VcmsArticleVersion>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsArticleVersionCacheModel)) {
			return false;
		}

		VcmsArticleVersionCacheModel vcmsArticleVersionCacheModel = (VcmsArticleVersionCacheModel)obj;

		if (articleVersionId == vcmsArticleVersionCacheModel.articleVersionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, articleVersionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(65);

		sb.append("{articleVersionId=");
		sb.append(articleVersionId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", articleId=");
		sb.append(articleId);
		sb.append(", createdByUser=");
		sb.append(createdByUser);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", typeIds=");
		sb.append(typeIds);
		sb.append(", status=");
		sb.append(status);
		sb.append(", versionName=");
		sb.append(versionName);
		sb.append(", title=");
		sb.append(title);
		sb.append(", lead=");
		sb.append(lead);
		sb.append(", content=");
		sb.append(content);
		sb.append(", hasImage=");
		sb.append(hasImage);
		sb.append(", imageTitle=");
		sb.append(imageTitle);
		sb.append(", image=");
		sb.append(image);
		sb.append(", language=");
		sb.append(language);
		sb.append(", userHit=");
		sb.append(userHit);
		sb.append(", author=");
		sb.append(author);
		sb.append(", source=");
		sb.append(source);
		sb.append(", discussible=");
		sb.append(discussible);
		sb.append(", hasAttachment=");
		sb.append(hasAttachment);
		sb.append(", hasPoll=");
		sb.append(hasPoll);
		sb.append(", pollId=");
		sb.append(pollId);
		sb.append(", publishedByUser=");
		sb.append(publishedByUser);
		sb.append(", modifiedByUser=");
		sb.append(modifiedByUser);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", publishedDate=");
		sb.append(publishedDate);
		sb.append(", effectiveDate=");
		sb.append(effectiveDate);
		sb.append(", expireDate=");
		sb.append(expireDate);
		sb.append(", stickyExpireDate=");
		sb.append(stickyExpireDate);
		sb.append(", sticky=");
		sb.append(sticky);
		sb.append(", stickyNeverExpired=");
		sb.append(stickyNeverExpired);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VcmsArticleVersion toEntityModel() {
		VcmsArticleVersionImpl vcmsArticleVersionImpl = new VcmsArticleVersionImpl();

		vcmsArticleVersionImpl.setArticleVersionId(articleVersionId);
		vcmsArticleVersionImpl.setGroupId(groupId);
		vcmsArticleVersionImpl.setCompanyId(companyId);

		if (articleId == null) {
			vcmsArticleVersionImpl.setArticleId(StringPool.BLANK);
		}
		else {
			vcmsArticleVersionImpl.setArticleId(articleId);
		}

		if (createdByUser == null) {
			vcmsArticleVersionImpl.setCreatedByUser(StringPool.BLANK);
		}
		else {
			vcmsArticleVersionImpl.setCreatedByUser(createdByUser);
		}

		if (createdDate == Long.MIN_VALUE) {
			vcmsArticleVersionImpl.setCreatedDate(null);
		}
		else {
			vcmsArticleVersionImpl.setCreatedDate(new Date(createdDate));
		}

		if (typeIds == null) {
			vcmsArticleVersionImpl.setTypeIds(StringPool.BLANK);
		}
		else {
			vcmsArticleVersionImpl.setTypeIds(typeIds);
		}

		vcmsArticleVersionImpl.setStatus(status);

		if (versionName == null) {
			vcmsArticleVersionImpl.setVersionName(StringPool.BLANK);
		}
		else {
			vcmsArticleVersionImpl.setVersionName(versionName);
		}

		if (title == null) {
			vcmsArticleVersionImpl.setTitle(StringPool.BLANK);
		}
		else {
			vcmsArticleVersionImpl.setTitle(title);
		}

		if (lead == null) {
			vcmsArticleVersionImpl.setLead(StringPool.BLANK);
		}
		else {
			vcmsArticleVersionImpl.setLead(lead);
		}

		if (content == null) {
			vcmsArticleVersionImpl.setContent(StringPool.BLANK);
		}
		else {
			vcmsArticleVersionImpl.setContent(content);
		}

		vcmsArticleVersionImpl.setHasImage(hasImage);

		if (imageTitle == null) {
			vcmsArticleVersionImpl.setImageTitle(StringPool.BLANK);
		}
		else {
			vcmsArticleVersionImpl.setImageTitle(imageTitle);
		}

		if (image == null) {
			vcmsArticleVersionImpl.setImage(StringPool.BLANK);
		}
		else {
			vcmsArticleVersionImpl.setImage(image);
		}

		if (language == null) {
			vcmsArticleVersionImpl.setLanguage(StringPool.BLANK);
		}
		else {
			vcmsArticleVersionImpl.setLanguage(language);
		}

		vcmsArticleVersionImpl.setUserHit(userHit);

		if (author == null) {
			vcmsArticleVersionImpl.setAuthor(StringPool.BLANK);
		}
		else {
			vcmsArticleVersionImpl.setAuthor(author);
		}

		if (source == null) {
			vcmsArticleVersionImpl.setSource(StringPool.BLANK);
		}
		else {
			vcmsArticleVersionImpl.setSource(source);
		}

		vcmsArticleVersionImpl.setDiscussible(discussible);
		vcmsArticleVersionImpl.setHasAttachment(hasAttachment);
		vcmsArticleVersionImpl.setHasPoll(hasPoll);

		if (pollId == null) {
			vcmsArticleVersionImpl.setPollId(StringPool.BLANK);
		}
		else {
			vcmsArticleVersionImpl.setPollId(pollId);
		}

		if (publishedByUser == null) {
			vcmsArticleVersionImpl.setPublishedByUser(StringPool.BLANK);
		}
		else {
			vcmsArticleVersionImpl.setPublishedByUser(publishedByUser);
		}

		if (modifiedByUser == null) {
			vcmsArticleVersionImpl.setModifiedByUser(StringPool.BLANK);
		}
		else {
			vcmsArticleVersionImpl.setModifiedByUser(modifiedByUser);
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vcmsArticleVersionImpl.setModifiedDate(null);
		}
		else {
			vcmsArticleVersionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (publishedDate == Long.MIN_VALUE) {
			vcmsArticleVersionImpl.setPublishedDate(null);
		}
		else {
			vcmsArticleVersionImpl.setPublishedDate(new Date(publishedDate));
		}

		if (effectiveDate == Long.MIN_VALUE) {
			vcmsArticleVersionImpl.setEffectiveDate(null);
		}
		else {
			vcmsArticleVersionImpl.setEffectiveDate(new Date(effectiveDate));
		}

		if (expireDate == Long.MIN_VALUE) {
			vcmsArticleVersionImpl.setExpireDate(null);
		}
		else {
			vcmsArticleVersionImpl.setExpireDate(new Date(expireDate));
		}

		if (stickyExpireDate == Long.MIN_VALUE) {
			vcmsArticleVersionImpl.setStickyExpireDate(null);
		}
		else {
			vcmsArticleVersionImpl.setStickyExpireDate(new Date(
					stickyExpireDate));
		}

		vcmsArticleVersionImpl.setSticky(sticky);
		vcmsArticleVersionImpl.setStickyNeverExpired(stickyNeverExpired);

		vcmsArticleVersionImpl.resetOriginalValues();

		return vcmsArticleVersionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		articleVersionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		articleId = objectInput.readUTF();
		createdByUser = objectInput.readUTF();
		createdDate = objectInput.readLong();
		typeIds = objectInput.readUTF();

		status = objectInput.readLong();
		versionName = objectInput.readUTF();
		title = objectInput.readUTF();
		lead = objectInput.readUTF();
		content = objectInput.readUTF();

		hasImage = objectInput.readBoolean();
		imageTitle = objectInput.readUTF();
		image = objectInput.readUTF();
		language = objectInput.readUTF();

		userHit = objectInput.readInt();
		author = objectInput.readUTF();
		source = objectInput.readUTF();

		discussible = objectInput.readBoolean();

		hasAttachment = objectInput.readBoolean();

		hasPoll = objectInput.readBoolean();
		pollId = objectInput.readUTF();
		publishedByUser = objectInput.readUTF();
		modifiedByUser = objectInput.readUTF();
		modifiedDate = objectInput.readLong();
		publishedDate = objectInput.readLong();
		effectiveDate = objectInput.readLong();
		expireDate = objectInput.readLong();
		stickyExpireDate = objectInput.readLong();

		sticky = objectInput.readBoolean();

		stickyNeverExpired = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(articleVersionId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		if (articleId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(articleId);
		}

		if (createdByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createdByUser);
		}

		objectOutput.writeLong(createdDate);

		if (typeIds == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(typeIds);
		}

		objectOutput.writeLong(status);

		if (versionName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(versionName);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (lead == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lead);
		}

		if (content == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(content);
		}

		objectOutput.writeBoolean(hasImage);

		if (imageTitle == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(imageTitle);
		}

		if (image == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(image);
		}

		if (language == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(language);
		}

		objectOutput.writeInt(userHit);

		if (author == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(author);
		}

		if (source == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(source);
		}

		objectOutput.writeBoolean(discussible);

		objectOutput.writeBoolean(hasAttachment);

		objectOutput.writeBoolean(hasPoll);

		if (pollId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(pollId);
		}

		if (publishedByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(publishedByUser);
		}

		if (modifiedByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(modifiedByUser);
		}

		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(publishedDate);
		objectOutput.writeLong(effectiveDate);
		objectOutput.writeLong(expireDate);
		objectOutput.writeLong(stickyExpireDate);

		objectOutput.writeBoolean(sticky);

		objectOutput.writeBoolean(stickyNeverExpired);
	}

	public long articleVersionId;
	public long groupId;
	public long companyId;
	public String articleId;
	public String createdByUser;
	public long createdDate;
	public String typeIds;
	public long status;
	public String versionName;
	public String title;
	public String lead;
	public String content;
	public boolean hasImage;
	public String imageTitle;
	public String image;
	public String language;
	public int userHit;
	public String author;
	public String source;
	public boolean discussible;
	public boolean hasAttachment;
	public boolean hasPoll;
	public String pollId;
	public String publishedByUser;
	public String modifiedByUser;
	public long modifiedDate;
	public long publishedDate;
	public long effectiveDate;
	public long expireDate;
	public long stickyExpireDate;
	public boolean sticky;
	public boolean stickyNeverExpired;
}