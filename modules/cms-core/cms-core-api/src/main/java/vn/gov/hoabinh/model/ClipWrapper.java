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
 * This class is a wrapper for {@link Clip}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Clip
 * @generated
 */
@ProviderType
public class ClipWrapper implements Clip, ModelWrapper<Clip> {
	public ClipWrapper(Clip clip) {
		_clip = clip;
	}

	@Override
	public Class<?> getModelClass() {
		return Clip.class;
	}

	@Override
	public String getModelClassName() {
		return Clip.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("clipTypeId", getClipTypeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("url", getUrl());
		attributes.put("name", getName());
		attributes.put("title", getTitle());
		attributes.put("image", getImage());
		attributes.put("description", getDescription());
		attributes.put("active", getActive());
		attributes.put("language", getLanguage());
		attributes.put("hitcount", getHitcount());
		attributes.put("hitcountview", getHitcountview());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String id = (String)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String clipTypeId = (String)attributes.get("clipTypeId");

		if (clipTypeId != null) {
			setClipTypeId(clipTypeId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Integer hitcount = (Integer)attributes.get("hitcount");

		if (hitcount != null) {
			setHitcount(hitcount);
		}

		Integer hitcountview = (Integer)attributes.get("hitcountview");

		if (hitcountview != null) {
			setHitcountview(hitcountview);
		}
	}

	/**
	* Returns the active of this clip.
	*
	* @return the active of this clip
	*/
	@Override
	public boolean getActive() {
		return _clip.getActive();
	}

	/**
	* Returns <code>true</code> if this clip is active.
	*
	* @return <code>true</code> if this clip is active; <code>false</code> otherwise
	*/
	@Override
	public boolean isActive() {
		return _clip.isActive();
	}

	@Override
	public boolean isCachedModel() {
		return _clip.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _clip.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _clip.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _clip.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.Clip> toCacheModel() {
		return _clip.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.Clip clip) {
		return _clip.compareTo(clip);
	}

	/**
	* Returns the hitcount of this clip.
	*
	* @return the hitcount of this clip
	*/
	@Override
	public int getHitcount() {
		return _clip.getHitcount();
	}

	/**
	* Returns the hitcountview of this clip.
	*
	* @return the hitcountview of this clip
	*/
	@Override
	public int getHitcountview() {
		return _clip.getHitcountview();
	}

	@Override
	public int hashCode() {
		return _clip.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _clip.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ClipWrapper((Clip)_clip.clone());
	}

	/**
	* Returns the clip type ID of this clip.
	*
	* @return the clip type ID of this clip
	*/
	@Override
	public java.lang.String getClipTypeId() {
		return _clip.getClipTypeId();
	}

	/**
	* Returns the description of this clip.
	*
	* @return the description of this clip
	*/
	@Override
	public java.lang.String getDescription() {
		return _clip.getDescription();
	}

	/**
	* Returns the ID of this clip.
	*
	* @return the ID of this clip
	*/
	@Override
	public java.lang.String getId() {
		return _clip.getId();
	}

	/**
	* Returns the image of this clip.
	*
	* @return the image of this clip
	*/
	@Override
	public java.lang.String getImage() {
		return _clip.getImage();
	}

	/**
	* Returns the language of this clip.
	*
	* @return the language of this clip
	*/
	@Override
	public java.lang.String getLanguage() {
		return _clip.getLanguage();
	}

	/**
	* Returns the name of this clip.
	*
	* @return the name of this clip
	*/
	@Override
	public java.lang.String getName() {
		return _clip.getName();
	}

	/**
	* Returns the primary key of this clip.
	*
	* @return the primary key of this clip
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _clip.getPrimaryKey();
	}

	/**
	* Returns the title of this clip.
	*
	* @return the title of this clip
	*/
	@Override
	public java.lang.String getTitle() {
		return _clip.getTitle();
	}

	/**
	* Returns the url of this clip.
	*
	* @return the url of this clip
	*/
	@Override
	public java.lang.String getUrl() {
		return _clip.getUrl();
	}

	/**
	* Returns the user uuid of this clip.
	*
	* @return the user uuid of this clip
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _clip.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _clip.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _clip.toXmlString();
	}

	/**
	* Returns the created date of this clip.
	*
	* @return the created date of this clip
	*/
	@Override
	public Date getCreatedDate() {
		return _clip.getCreatedDate();
	}

	/**
	* Returns the modified date of this clip.
	*
	* @return the modified date of this clip
	*/
	@Override
	public Date getModifiedDate() {
		return _clip.getModifiedDate();
	}

	/**
	* Returns the company ID of this clip.
	*
	* @return the company ID of this clip
	*/
	@Override
	public long getCompanyId() {
		return _clip.getCompanyId();
	}

	/**
	* Returns the group ID of this clip.
	*
	* @return the group ID of this clip
	*/
	@Override
	public long getGroupId() {
		return _clip.getGroupId();
	}

	/**
	* Returns the user ID of this clip.
	*
	* @return the user ID of this clip
	*/
	@Override
	public long getUserId() {
		return _clip.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.Clip toEscapedModel() {
		return new ClipWrapper(_clip.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.Clip toUnescapedModel() {
		return new ClipWrapper(_clip.toUnescapedModel());
	}

	@Override
	public void persist() {
		_clip.persist();
	}

	/**
	* Sets whether this clip is active.
	*
	* @param active the active of this clip
	*/
	@Override
	public void setActive(boolean active) {
		_clip.setActive(active);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_clip.setCachedModel(cachedModel);
	}

	/**
	* Sets the clip type ID of this clip.
	*
	* @param clipTypeId the clip type ID of this clip
	*/
	@Override
	public void setClipTypeId(java.lang.String clipTypeId) {
		_clip.setClipTypeId(clipTypeId);
	}

	/**
	* Sets the company ID of this clip.
	*
	* @param companyId the company ID of this clip
	*/
	@Override
	public void setCompanyId(long companyId) {
		_clip.setCompanyId(companyId);
	}

	/**
	* Sets the created date of this clip.
	*
	* @param createdDate the created date of this clip
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_clip.setCreatedDate(createdDate);
	}

	/**
	* Sets the description of this clip.
	*
	* @param description the description of this clip
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_clip.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_clip.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_clip.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_clip.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this clip.
	*
	* @param groupId the group ID of this clip
	*/
	@Override
	public void setGroupId(long groupId) {
		_clip.setGroupId(groupId);
	}

	/**
	* Sets the hitcount of this clip.
	*
	* @param hitcount the hitcount of this clip
	*/
	@Override
	public void setHitcount(int hitcount) {
		_clip.setHitcount(hitcount);
	}

	/**
	* Sets the hitcountview of this clip.
	*
	* @param hitcountview the hitcountview of this clip
	*/
	@Override
	public void setHitcountview(int hitcountview) {
		_clip.setHitcountview(hitcountview);
	}

	/**
	* Sets the ID of this clip.
	*
	* @param id the ID of this clip
	*/
	@Override
	public void setId(java.lang.String id) {
		_clip.setId(id);
	}

	/**
	* Sets the image of this clip.
	*
	* @param image the image of this clip
	*/
	@Override
	public void setImage(java.lang.String image) {
		_clip.setImage(image);
	}

	/**
	* Sets the language of this clip.
	*
	* @param language the language of this clip
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_clip.setLanguage(language);
	}

	/**
	* Sets the modified date of this clip.
	*
	* @param modifiedDate the modified date of this clip
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_clip.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this clip.
	*
	* @param name the name of this clip
	*/
	@Override
	public void setName(java.lang.String name) {
		_clip.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_clip.setNew(n);
	}

	/**
	* Sets the primary key of this clip.
	*
	* @param primaryKey the primary key of this clip
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_clip.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_clip.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the title of this clip.
	*
	* @param title the title of this clip
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_clip.setTitle(title);
	}

	/**
	* Sets the url of this clip.
	*
	* @param url the url of this clip
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_clip.setUrl(url);
	}

	/**
	* Sets the user ID of this clip.
	*
	* @param userId the user ID of this clip
	*/
	@Override
	public void setUserId(long userId) {
		_clip.setUserId(userId);
	}

	/**
	* Sets the user uuid of this clip.
	*
	* @param userUuid the user uuid of this clip
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_clip.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ClipWrapper)) {
			return false;
		}

		ClipWrapper clipWrapper = (ClipWrapper)obj;

		if (Objects.equals(_clip, clipWrapper._clip)) {
			return true;
		}

		return false;
	}

	@Override
	public Clip getWrappedModel() {
		return _clip;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _clip.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _clip.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_clip.resetOriginalValues();
	}

	private final Clip _clip;
}