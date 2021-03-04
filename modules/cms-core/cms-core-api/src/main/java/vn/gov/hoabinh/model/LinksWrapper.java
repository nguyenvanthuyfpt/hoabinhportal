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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Links}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Links
 * @generated
 */
@ProviderType
public class LinksWrapper implements Links, ModelWrapper<Links> {
	public LinksWrapper(Links links) {
		_links = links;
	}

	@Override
	public Class<?> getModelClass() {
		return Links.class;
	}

	@Override
	public String getModelClassName() {
		return Links.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("linkId", getLinkId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("linkgroupId", getLinkgroupId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("url", getUrl());
		attributes.put("position", getPosition());
		attributes.put("image", getImage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long linkId = (Long)attributes.get("linkId");

		if (linkId != null) {
			setLinkId(linkId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long linkgroupId = (Long)attributes.get("linkgroupId");

		if (linkgroupId != null) {
			setLinkgroupId(linkgroupId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		Integer position = (Integer)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _links.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _links.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _links.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _links.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.Links> toCacheModel() {
		return _links.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.Links links) {
		return _links.compareTo(links);
	}

	/**
	* Returns the position of this links.
	*
	* @return the position of this links
	*/
	@Override
	public int getPosition() {
		return _links.getPosition();
	}

	@Override
	public int hashCode() {
		return _links.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _links.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new LinksWrapper((Links)_links.clone());
	}

	/**
	* Returns the description of this links.
	*
	* @return the description of this links
	*/
	@Override
	public java.lang.String getDescription() {
		return _links.getDescription();
	}

	/**
	* Returns the image of this links.
	*
	* @return the image of this links
	*/
	@Override
	public java.lang.String getImage() {
		return _links.getImage();
	}

	/**
	* Returns the name of this links.
	*
	* @return the name of this links
	*/
	@Override
	public java.lang.String getName() {
		return _links.getName();
	}

	/**
	* Returns the url of this links.
	*
	* @return the url of this links
	*/
	@Override
	public java.lang.String getUrl() {
		return _links.getUrl();
	}

	@Override
	public java.lang.String toString() {
		return _links.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _links.toXmlString();
	}

	/**
	* Returns the created date of this links.
	*
	* @return the created date of this links
	*/
	@Override
	public Date getCreatedDate() {
		return _links.getCreatedDate();
	}

	/**
	* Returns the modified date of this links.
	*
	* @return the modified date of this links
	*/
	@Override
	public Date getModifiedDate() {
		return _links.getModifiedDate();
	}

	/**
	* Returns the company ID of this links.
	*
	* @return the company ID of this links
	*/
	@Override
	public long getCompanyId() {
		return _links.getCompanyId();
	}

	/**
	* Returns the group ID of this links.
	*
	* @return the group ID of this links
	*/
	@Override
	public long getGroupId() {
		return _links.getGroupId();
	}

	/**
	* Returns the link ID of this links.
	*
	* @return the link ID of this links
	*/
	@Override
	public long getLinkId() {
		return _links.getLinkId();
	}

	/**
	* Returns the linkgroup ID of this links.
	*
	* @return the linkgroup ID of this links
	*/
	@Override
	public long getLinkgroupId() {
		return _links.getLinkgroupId();
	}

	/**
	* Returns the primary key of this links.
	*
	* @return the primary key of this links
	*/
	@Override
	public long getPrimaryKey() {
		return _links.getPrimaryKey();
	}

	@Override
	public vn.gov.hoabinh.model.Links toEscapedModel() {
		return new LinksWrapper(_links.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.Links toUnescapedModel() {
		return new LinksWrapper(_links.toUnescapedModel());
	}

	@Override
	public void persist() {
		_links.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_links.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this links.
	*
	* @param companyId the company ID of this links
	*/
	@Override
	public void setCompanyId(long companyId) {
		_links.setCompanyId(companyId);
	}

	/**
	* Sets the created date of this links.
	*
	* @param createdDate the created date of this links
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_links.setCreatedDate(createdDate);
	}

	/**
	* Sets the description of this links.
	*
	* @param description the description of this links
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_links.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_links.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_links.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_links.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this links.
	*
	* @param groupId the group ID of this links
	*/
	@Override
	public void setGroupId(long groupId) {
		_links.setGroupId(groupId);
	}

	/**
	* Sets the image of this links.
	*
	* @param image the image of this links
	*/
	@Override
	public void setImage(java.lang.String image) {
		_links.setImage(image);
	}

	/**
	* Sets the link ID of this links.
	*
	* @param linkId the link ID of this links
	*/
	@Override
	public void setLinkId(long linkId) {
		_links.setLinkId(linkId);
	}

	/**
	* Sets the linkgroup ID of this links.
	*
	* @param linkgroupId the linkgroup ID of this links
	*/
	@Override
	public void setLinkgroupId(long linkgroupId) {
		_links.setLinkgroupId(linkgroupId);
	}

	/**
	* Sets the modified date of this links.
	*
	* @param modifiedDate the modified date of this links
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_links.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this links.
	*
	* @param name the name of this links
	*/
	@Override
	public void setName(java.lang.String name) {
		_links.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_links.setNew(n);
	}

	/**
	* Sets the position of this links.
	*
	* @param position the position of this links
	*/
	@Override
	public void setPosition(int position) {
		_links.setPosition(position);
	}

	/**
	* Sets the primary key of this links.
	*
	* @param primaryKey the primary key of this links
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_links.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_links.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the url of this links.
	*
	* @param url the url of this links
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_links.setUrl(url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LinksWrapper)) {
			return false;
		}

		LinksWrapper linksWrapper = (LinksWrapper)obj;

		if (Objects.equals(_links, linksWrapper._links)) {
			return true;
		}

		return false;
	}

	@Override
	public Links getWrappedModel() {
		return _links;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _links.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _links.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_links.resetOriginalValues();
	}

	private final Links _links;
}