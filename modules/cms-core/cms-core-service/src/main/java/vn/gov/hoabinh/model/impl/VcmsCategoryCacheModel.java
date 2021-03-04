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

import vn.gov.hoabinh.model.VcmsCategory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VcmsCategory in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCategory
 * @generated
 */
@ProviderType
public class VcmsCategoryCacheModel implements CacheModel<VcmsCategory>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsCategoryCacheModel)) {
			return false;
		}

		VcmsCategoryCacheModel vcmsCategoryCacheModel = (VcmsCategoryCacheModel)obj;

		if (categoryId.equals(vcmsCategoryCacheModel.categoryId)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, categoryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{categoryId=");
		sb.append(categoryId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", createdByUser=");
		sb.append(createdByUser);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", modifiedByUser=");
		sb.append(modifiedByUser);
		sb.append(", portionId=");
		sb.append(portionId);
		sb.append(", parentId=");
		sb.append(parentId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", anchored=");
		sb.append(anchored);
		sb.append(", href=");
		sb.append(href);
		sb.append(", language=");
		sb.append(language);
		sb.append(", hasImage=");
		sb.append(hasImage);
		sb.append(", image=");
		sb.append(image);
		sb.append(", position=");
		sb.append(position);
		sb.append(", userHit=");
		sb.append(userHit);
		sb.append(", rssable=");
		sb.append(rssable);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VcmsCategory toEntityModel() {
		VcmsCategoryImpl vcmsCategoryImpl = new VcmsCategoryImpl();

		if (categoryId == null) {
			vcmsCategoryImpl.setCategoryId(StringPool.BLANK);
		}
		else {
			vcmsCategoryImpl.setCategoryId(categoryId);
		}

		vcmsCategoryImpl.setGroupId(groupId);
		vcmsCategoryImpl.setCompanyId(companyId);

		if (createdDate == Long.MIN_VALUE) {
			vcmsCategoryImpl.setCreatedDate(null);
		}
		else {
			vcmsCategoryImpl.setCreatedDate(new Date(createdDate));
		}

		if (createdByUser == null) {
			vcmsCategoryImpl.setCreatedByUser(StringPool.BLANK);
		}
		else {
			vcmsCategoryImpl.setCreatedByUser(createdByUser);
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vcmsCategoryImpl.setModifiedDate(null);
		}
		else {
			vcmsCategoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (modifiedByUser == null) {
			vcmsCategoryImpl.setModifiedByUser(StringPool.BLANK);
		}
		else {
			vcmsCategoryImpl.setModifiedByUser(modifiedByUser);
		}

		if (portionId == null) {
			vcmsCategoryImpl.setPortionId(StringPool.BLANK);
		}
		else {
			vcmsCategoryImpl.setPortionId(portionId);
		}

		if (parentId == null) {
			vcmsCategoryImpl.setParentId(StringPool.BLANK);
		}
		else {
			vcmsCategoryImpl.setParentId(parentId);
		}

		if (name == null) {
			vcmsCategoryImpl.setName(StringPool.BLANK);
		}
		else {
			vcmsCategoryImpl.setName(name);
		}

		if (description == null) {
			vcmsCategoryImpl.setDescription(StringPool.BLANK);
		}
		else {
			vcmsCategoryImpl.setDescription(description);
		}

		vcmsCategoryImpl.setAnchored(anchored);

		if (href == null) {
			vcmsCategoryImpl.setHref(StringPool.BLANK);
		}
		else {
			vcmsCategoryImpl.setHref(href);
		}

		if (language == null) {
			vcmsCategoryImpl.setLanguage(StringPool.BLANK);
		}
		else {
			vcmsCategoryImpl.setLanguage(language);
		}

		vcmsCategoryImpl.setHasImage(hasImage);

		if (image == null) {
			vcmsCategoryImpl.setImage(StringPool.BLANK);
		}
		else {
			vcmsCategoryImpl.setImage(image);
		}

		vcmsCategoryImpl.setPosition(position);
		vcmsCategoryImpl.setUserHit(userHit);
		vcmsCategoryImpl.setRssable(rssable);

		vcmsCategoryImpl.resetOriginalValues();

		return vcmsCategoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		categoryId = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createdDate = objectInput.readLong();
		createdByUser = objectInput.readUTF();
		modifiedDate = objectInput.readLong();
		modifiedByUser = objectInput.readUTF();
		portionId = objectInput.readUTF();
		parentId = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();

		anchored = objectInput.readBoolean();
		href = objectInput.readUTF();
		language = objectInput.readUTF();

		hasImage = objectInput.readBoolean();
		image = objectInput.readUTF();

		position = objectInput.readInt();

		userHit = objectInput.readInt();

		rssable = objectInput.readBoolean();
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

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createdDate);

		if (createdByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(createdByUser);
		}

		objectOutput.writeLong(modifiedDate);

		if (modifiedByUser == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(modifiedByUser);
		}

		if (portionId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(portionId);
		}

		if (parentId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(parentId);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeBoolean(anchored);

		if (href == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(href);
		}

		if (language == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(language);
		}

		objectOutput.writeBoolean(hasImage);

		if (image == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(image);
		}

		objectOutput.writeInt(position);

		objectOutput.writeInt(userHit);

		objectOutput.writeBoolean(rssable);
	}

	public String categoryId;
	public long groupId;
	public long companyId;
	public long createdDate;
	public String createdByUser;
	public long modifiedDate;
	public String modifiedByUser;
	public String portionId;
	public String parentId;
	public String name;
	public String description;
	public boolean anchored;
	public String href;
	public String language;
	public boolean hasImage;
	public String image;
	public int position;
	public int userHit;
	public boolean rssable;
}