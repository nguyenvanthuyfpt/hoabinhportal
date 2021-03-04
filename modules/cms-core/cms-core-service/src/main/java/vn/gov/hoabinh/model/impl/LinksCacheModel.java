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

import vn.gov.hoabinh.model.Links;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Links in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Links
 * @generated
 */
@ProviderType
public class LinksCacheModel implements CacheModel<Links>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LinksCacheModel)) {
			return false;
		}

		LinksCacheModel linksCacheModel = (LinksCacheModel)obj;

		if (linkId == linksCacheModel.linkId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, linkId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{linkId=");
		sb.append(linkId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", linkgroupId=");
		sb.append(linkgroupId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", url=");
		sb.append(url);
		sb.append(", position=");
		sb.append(position);
		sb.append(", image=");
		sb.append(image);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Links toEntityModel() {
		LinksImpl linksImpl = new LinksImpl();

		linksImpl.setLinkId(linkId);
		linksImpl.setGroupId(groupId);
		linksImpl.setCompanyId(companyId);

		if (createdDate == Long.MIN_VALUE) {
			linksImpl.setCreatedDate(null);
		}
		else {
			linksImpl.setCreatedDate(new Date(createdDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			linksImpl.setModifiedDate(null);
		}
		else {
			linksImpl.setModifiedDate(new Date(modifiedDate));
		}

		linksImpl.setLinkgroupId(linkgroupId);

		if (name == null) {
			linksImpl.setName(StringPool.BLANK);
		}
		else {
			linksImpl.setName(name);
		}

		if (description == null) {
			linksImpl.setDescription(StringPool.BLANK);
		}
		else {
			linksImpl.setDescription(description);
		}

		if (url == null) {
			linksImpl.setUrl(StringPool.BLANK);
		}
		else {
			linksImpl.setUrl(url);
		}

		linksImpl.setPosition(position);

		if (image == null) {
			linksImpl.setImage(StringPool.BLANK);
		}
		else {
			linksImpl.setImage(image);
		}

		linksImpl.resetOriginalValues();

		return linksImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		linkId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();
		createdDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		linkgroupId = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		url = objectInput.readUTF();

		position = objectInput.readInt();
		image = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(linkId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createdDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(linkgroupId);

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

		if (url == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(url);
		}

		objectOutput.writeInt(position);

		if (image == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(image);
		}
	}

	public long linkId;
	public long groupId;
	public long companyId;
	public long createdDate;
	public long modifiedDate;
	public long linkgroupId;
	public String name;
	public String description;
	public String url;
	public int position;
	public String image;
}