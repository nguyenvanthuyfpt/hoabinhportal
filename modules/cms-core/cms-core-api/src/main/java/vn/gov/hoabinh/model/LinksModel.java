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

package vn.gov.hoabinh.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Links service. Represents a row in the &quot;Links&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gov.hoabinh.model.impl.LinksModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gov.hoabinh.model.impl.LinksImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Links
 * @see vn.gov.hoabinh.model.impl.LinksImpl
 * @see vn.gov.hoabinh.model.impl.LinksModelImpl
 * @generated
 */
@ProviderType
public interface LinksModel extends BaseModel<Links>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a links model instance should use the {@link Links} interface instead.
	 */

	/**
	 * Returns the primary key of this links.
	 *
	 * @return the primary key of this links
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this links.
	 *
	 * @param primaryKey the primary key of this links
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the link ID of this links.
	 *
	 * @return the link ID of this links
	 */
	public long getLinkId();

	/**
	 * Sets the link ID of this links.
	 *
	 * @param linkId the link ID of this links
	 */
	public void setLinkId(long linkId);

	/**
	 * Returns the group ID of this links.
	 *
	 * @return the group ID of this links
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this links.
	 *
	 * @param groupId the group ID of this links
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this links.
	 *
	 * @return the company ID of this links
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this links.
	 *
	 * @param companyId the company ID of this links
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the created date of this links.
	 *
	 * @return the created date of this links
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this links.
	 *
	 * @param createdDate the created date of this links
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the modified date of this links.
	 *
	 * @return the modified date of this links
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this links.
	 *
	 * @param modifiedDate the modified date of this links
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the linkgroup ID of this links.
	 *
	 * @return the linkgroup ID of this links
	 */
	public long getLinkgroupId();

	/**
	 * Sets the linkgroup ID of this links.
	 *
	 * @param linkgroupId the linkgroup ID of this links
	 */
	public void setLinkgroupId(long linkgroupId);

	/**
	 * Returns the name of this links.
	 *
	 * @return the name of this links
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this links.
	 *
	 * @param name the name of this links
	 */
	public void setName(String name);

	/**
	 * Returns the description of this links.
	 *
	 * @return the description of this links
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this links.
	 *
	 * @param description the description of this links
	 */
	public void setDescription(String description);

	/**
	 * Returns the url of this links.
	 *
	 * @return the url of this links
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this links.
	 *
	 * @param url the url of this links
	 */
	public void setUrl(String url);

	/**
	 * Returns the position of this links.
	 *
	 * @return the position of this links
	 */
	public int getPosition();

	/**
	 * Sets the position of this links.
	 *
	 * @param position the position of this links
	 */
	public void setPosition(int position);

	/**
	 * Returns the image of this links.
	 *
	 * @return the image of this links
	 */
	@AutoEscape
	public String getImage();

	/**
	 * Sets the image of this links.
	 *
	 * @param image the image of this links
	 */
	public void setImage(String image);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(vn.gov.hoabinh.model.Links links);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.gov.hoabinh.model.Links> toCacheModel();

	@Override
	public vn.gov.hoabinh.model.Links toEscapedModel();

	@Override
	public vn.gov.hoabinh.model.Links toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}