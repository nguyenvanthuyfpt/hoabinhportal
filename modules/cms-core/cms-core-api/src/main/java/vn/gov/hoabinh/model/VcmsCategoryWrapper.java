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
 * This class is a wrapper for {@link VcmsCategory}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCategory
 * @generated
 */
@ProviderType
public class VcmsCategoryWrapper implements VcmsCategory,
	ModelWrapper<VcmsCategory> {
	public VcmsCategoryWrapper(VcmsCategory vcmsCategory) {
		_vcmsCategory = vcmsCategory;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsCategory.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsCategory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("categoryId", getCategoryId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("portionId", getPortionId());
		attributes.put("parentId", getParentId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("anchored", getAnchored());
		attributes.put("href", getHref());
		attributes.put("language", getLanguage());
		attributes.put("hasImage", getHasImage());
		attributes.put("image", getImage());
		attributes.put("position", getPosition());
		attributes.put("userHit", getUserHit());
		attributes.put("rssable", getRssable());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String categoryId = (String)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
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

		String createdByUser = (String)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String modifiedByUser = (String)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		String portionId = (String)attributes.get("portionId");

		if (portionId != null) {
			setPortionId(portionId);
		}

		String parentId = (String)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Boolean anchored = (Boolean)attributes.get("anchored");

		if (anchored != null) {
			setAnchored(anchored);
		}

		String href = (String)attributes.get("href");

		if (href != null) {
			setHref(href);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Boolean hasImage = (Boolean)attributes.get("hasImage");

		if (hasImage != null) {
			setHasImage(hasImage);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}

		Integer position = (Integer)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		Integer userHit = (Integer)attributes.get("userHit");

		if (userHit != null) {
			setUserHit(userHit);
		}

		Boolean rssable = (Boolean)attributes.get("rssable");

		if (rssable != null) {
			setRssable(rssable);
		}
	}

	/**
	* Returns the anchored of this vcms category.
	*
	* @return the anchored of this vcms category
	*/
	@Override
	public boolean getAnchored() {
		return _vcmsCategory.getAnchored();
	}

	/**
	* Returns the has image of this vcms category.
	*
	* @return the has image of this vcms category
	*/
	@Override
	public boolean getHasImage() {
		return _vcmsCategory.getHasImage();
	}

	/**
	* Returns the rssable of this vcms category.
	*
	* @return the rssable of this vcms category
	*/
	@Override
	public boolean getRssable() {
		return _vcmsCategory.getRssable();
	}

	/**
	* Returns <code>true</code> if this vcms category is anchored.
	*
	* @return <code>true</code> if this vcms category is anchored; <code>false</code> otherwise
	*/
	@Override
	public boolean isAnchored() {
		return _vcmsCategory.isAnchored();
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsCategory.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsCategory.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this vcms category is has image.
	*
	* @return <code>true</code> if this vcms category is has image; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasImage() {
		return _vcmsCategory.isHasImage();
	}

	@Override
	public boolean isNew() {
		return _vcmsCategory.isNew();
	}

	/**
	* Returns <code>true</code> if this vcms category is rssable.
	*
	* @return <code>true</code> if this vcms category is rssable; <code>false</code> otherwise
	*/
	@Override
	public boolean isRssable() {
		return _vcmsCategory.isRssable();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsCategory.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsCategory> toCacheModel() {
		return _vcmsCategory.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VcmsCategory vcmsCategory) {
		return _vcmsCategory.compareTo(vcmsCategory);
	}

	/**
	* Returns the position of this vcms category.
	*
	* @return the position of this vcms category
	*/
	@Override
	public int getPosition() {
		return _vcmsCategory.getPosition();
	}

	/**
	* Returns the user hit of this vcms category.
	*
	* @return the user hit of this vcms category
	*/
	@Override
	public int getUserHit() {
		return _vcmsCategory.getUserHit();
	}

	@Override
	public int hashCode() {
		return _vcmsCategory.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsCategory.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsCategoryWrapper((VcmsCategory)_vcmsCategory.clone());
	}

	/**
	* Returns the category ID of this vcms category.
	*
	* @return the category ID of this vcms category
	*/
	@Override
	public java.lang.String getCategoryId() {
		return _vcmsCategory.getCategoryId();
	}

	/**
	* Returns the created by user of this vcms category.
	*
	* @return the created by user of this vcms category
	*/
	@Override
	public java.lang.String getCreatedByUser() {
		return _vcmsCategory.getCreatedByUser();
	}

	/**
	* Returns the description of this vcms category.
	*
	* @return the description of this vcms category
	*/
	@Override
	public java.lang.String getDescription() {
		return _vcmsCategory.getDescription();
	}

	/**
	* Returns the href of this vcms category.
	*
	* @return the href of this vcms category
	*/
	@Override
	public java.lang.String getHref() {
		return _vcmsCategory.getHref();
	}

	/**
	* Returns the image of this vcms category.
	*
	* @return the image of this vcms category
	*/
	@Override
	public java.lang.String getImage() {
		return _vcmsCategory.getImage();
	}

	/**
	* Returns the language of this vcms category.
	*
	* @return the language of this vcms category
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vcmsCategory.getLanguage();
	}

	/**
	* Returns the modified by user of this vcms category.
	*
	* @return the modified by user of this vcms category
	*/
	@Override
	public java.lang.String getModifiedByUser() {
		return _vcmsCategory.getModifiedByUser();
	}

	/**
	* Returns the name of this vcms category.
	*
	* @return the name of this vcms category
	*/
	@Override
	public java.lang.String getName() {
		return _vcmsCategory.getName();
	}

	/**
	* Returns the parent ID of this vcms category.
	*
	* @return the parent ID of this vcms category
	*/
	@Override
	public java.lang.String getParentId() {
		return _vcmsCategory.getParentId();
	}

	/**
	* Returns the portion ID of this vcms category.
	*
	* @return the portion ID of this vcms category
	*/
	@Override
	public java.lang.String getPortionId() {
		return _vcmsCategory.getPortionId();
	}

	/**
	* Returns the primary key of this vcms category.
	*
	* @return the primary key of this vcms category
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vcmsCategory.getPrimaryKey();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsCategory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsCategory.toXmlString();
	}

	/**
	* Returns the created date of this vcms category.
	*
	* @return the created date of this vcms category
	*/
	@Override
	public Date getCreatedDate() {
		return _vcmsCategory.getCreatedDate();
	}

	/**
	* Returns the modified date of this vcms category.
	*
	* @return the modified date of this vcms category
	*/
	@Override
	public Date getModifiedDate() {
		return _vcmsCategory.getModifiedDate();
	}

	/**
	* Returns the company ID of this vcms category.
	*
	* @return the company ID of this vcms category
	*/
	@Override
	public long getCompanyId() {
		return _vcmsCategory.getCompanyId();
	}

	/**
	* Returns the group ID of this vcms category.
	*
	* @return the group ID of this vcms category
	*/
	@Override
	public long getGroupId() {
		return _vcmsCategory.getGroupId();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsCategory toEscapedModel() {
		return new VcmsCategoryWrapper(_vcmsCategory.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsCategory toUnescapedModel() {
		return new VcmsCategoryWrapper(_vcmsCategory.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vcmsCategory.persist();
	}

	/**
	* Sets whether this vcms category is anchored.
	*
	* @param anchored the anchored of this vcms category
	*/
	@Override
	public void setAnchored(boolean anchored) {
		_vcmsCategory.setAnchored(anchored);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsCategory.setCachedModel(cachedModel);
	}

	/**
	* Sets the category ID of this vcms category.
	*
	* @param categoryId the category ID of this vcms category
	*/
	@Override
	public void setCategoryId(java.lang.String categoryId) {
		_vcmsCategory.setCategoryId(categoryId);
	}

	/**
	* Sets the company ID of this vcms category.
	*
	* @param companyId the company ID of this vcms category
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vcmsCategory.setCompanyId(companyId);
	}

	/**
	* Sets the created by user of this vcms category.
	*
	* @param createdByUser the created by user of this vcms category
	*/
	@Override
	public void setCreatedByUser(java.lang.String createdByUser) {
		_vcmsCategory.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this vcms category.
	*
	* @param createdDate the created date of this vcms category
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vcmsCategory.setCreatedDate(createdDate);
	}

	/**
	* Sets the description of this vcms category.
	*
	* @param description the description of this vcms category
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vcmsCategory.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsCategory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsCategory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsCategory.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this vcms category.
	*
	* @param groupId the group ID of this vcms category
	*/
	@Override
	public void setGroupId(long groupId) {
		_vcmsCategory.setGroupId(groupId);
	}

	/**
	* Sets whether this vcms category is has image.
	*
	* @param hasImage the has image of this vcms category
	*/
	@Override
	public void setHasImage(boolean hasImage) {
		_vcmsCategory.setHasImage(hasImage);
	}

	/**
	* Sets the href of this vcms category.
	*
	* @param href the href of this vcms category
	*/
	@Override
	public void setHref(java.lang.String href) {
		_vcmsCategory.setHref(href);
	}

	/**
	* Sets the image of this vcms category.
	*
	* @param image the image of this vcms category
	*/
	@Override
	public void setImage(java.lang.String image) {
		_vcmsCategory.setImage(image);
	}

	/**
	* Sets the language of this vcms category.
	*
	* @param language the language of this vcms category
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vcmsCategory.setLanguage(language);
	}

	/**
	* Sets the modified by user of this vcms category.
	*
	* @param modifiedByUser the modified by user of this vcms category
	*/
	@Override
	public void setModifiedByUser(java.lang.String modifiedByUser) {
		_vcmsCategory.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this vcms category.
	*
	* @param modifiedDate the modified date of this vcms category
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vcmsCategory.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this vcms category.
	*
	* @param name the name of this vcms category
	*/
	@Override
	public void setName(java.lang.String name) {
		_vcmsCategory.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsCategory.setNew(n);
	}

	/**
	* Sets the parent ID of this vcms category.
	*
	* @param parentId the parent ID of this vcms category
	*/
	@Override
	public void setParentId(java.lang.String parentId) {
		_vcmsCategory.setParentId(parentId);
	}

	/**
	* Sets the portion ID of this vcms category.
	*
	* @param portionId the portion ID of this vcms category
	*/
	@Override
	public void setPortionId(java.lang.String portionId) {
		_vcmsCategory.setPortionId(portionId);
	}

	/**
	* Sets the position of this vcms category.
	*
	* @param position the position of this vcms category
	*/
	@Override
	public void setPosition(int position) {
		_vcmsCategory.setPosition(position);
	}

	/**
	* Sets the primary key of this vcms category.
	*
	* @param primaryKey the primary key of this vcms category
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vcmsCategory.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsCategory.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this vcms category is rssable.
	*
	* @param rssable the rssable of this vcms category
	*/
	@Override
	public void setRssable(boolean rssable) {
		_vcmsCategory.setRssable(rssable);
	}

	/**
	* Sets the user hit of this vcms category.
	*
	* @param userHit the user hit of this vcms category
	*/
	@Override
	public void setUserHit(int userHit) {
		_vcmsCategory.setUserHit(userHit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsCategoryWrapper)) {
			return false;
		}

		VcmsCategoryWrapper vcmsCategoryWrapper = (VcmsCategoryWrapper)obj;

		if (Objects.equals(_vcmsCategory, vcmsCategoryWrapper._vcmsCategory)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsCategory getWrappedModel() {
		return _vcmsCategory;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsCategory.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsCategory.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsCategory.resetOriginalValues();
	}

	private final VcmsCategory _vcmsCategory;
}