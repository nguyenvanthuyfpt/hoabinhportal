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
 * This class is a wrapper for {@link FAQCategory}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQCategory
 * @generated
 */
@ProviderType
public class FAQCategoryWrapper implements FAQCategory,
	ModelWrapper<FAQCategory> {
	public FAQCategoryWrapper(FAQCategory faqCategory) {
		_faqCategory = faqCategory;
	}

	@Override
	public Class<?> getModelClass() {
		return FAQCategory.class;
	}

	@Override
	public String getModelClassName() {
		return FAQCategory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("language", getLanguage());
		attributes.put("parent", getParent());
		attributes.put("catorder", getCatorder());
		attributes.put("catlevel", getCatlevel());
		attributes.put("image", getImage());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Long parent = (Long)attributes.get("parent");

		if (parent != null) {
			setParent(parent);
		}

		Integer catorder = (Integer)attributes.get("catorder");

		if (catorder != null) {
			setCatorder(catorder);
		}

		Integer catlevel = (Integer)attributes.get("catlevel");

		if (catlevel != null) {
			setCatlevel(catlevel);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}

		String createdByUser = (String)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String modifiedByUser = (String)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _faqCategory.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _faqCategory.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _faqCategory.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _faqCategory.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.FAQCategory> toCacheModel() {
		return _faqCategory.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.FAQCategory faqCategory) {
		return _faqCategory.compareTo(faqCategory);
	}

	/**
	* Returns the catlevel of this f a q category.
	*
	* @return the catlevel of this f a q category
	*/
	@Override
	public int getCatlevel() {
		return _faqCategory.getCatlevel();
	}

	/**
	* Returns the catorder of this f a q category.
	*
	* @return the catorder of this f a q category
	*/
	@Override
	public int getCatorder() {
		return _faqCategory.getCatorder();
	}

	@Override
	public int hashCode() {
		return _faqCategory.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _faqCategory.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new FAQCategoryWrapper((FAQCategory)_faqCategory.clone());
	}

	/**
	* Returns the created by user of this f a q category.
	*
	* @return the created by user of this f a q category
	*/
	@Override
	public java.lang.String getCreatedByUser() {
		return _faqCategory.getCreatedByUser();
	}

	/**
	* Returns the description of this f a q category.
	*
	* @return the description of this f a q category
	*/
	@Override
	public java.lang.String getDescription() {
		return _faqCategory.getDescription();
	}

	/**
	* Returns the image of this f a q category.
	*
	* @return the image of this f a q category
	*/
	@Override
	public java.lang.String getImage() {
		return _faqCategory.getImage();
	}

	/**
	* Returns the language of this f a q category.
	*
	* @return the language of this f a q category
	*/
	@Override
	public java.lang.String getLanguage() {
		return _faqCategory.getLanguage();
	}

	/**
	* Returns the modified by user of this f a q category.
	*
	* @return the modified by user of this f a q category
	*/
	@Override
	public java.lang.String getModifiedByUser() {
		return _faqCategory.getModifiedByUser();
	}

	/**
	* Returns the name of this f a q category.
	*
	* @return the name of this f a q category
	*/
	@Override
	public java.lang.String getName() {
		return _faqCategory.getName();
	}

	/**
	* Returns the user uuid of this f a q category.
	*
	* @return the user uuid of this f a q category
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _faqCategory.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _faqCategory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _faqCategory.toXmlString();
	}

	/**
	* Returns the created date of this f a q category.
	*
	* @return the created date of this f a q category
	*/
	@Override
	public Date getCreatedDate() {
		return _faqCategory.getCreatedDate();
	}

	/**
	* Returns the modified date of this f a q category.
	*
	* @return the modified date of this f a q category
	*/
	@Override
	public Date getModifiedDate() {
		return _faqCategory.getModifiedDate();
	}

	/**
	* Returns the group ID of this f a q category.
	*
	* @return the group ID of this f a q category
	*/
	@Override
	public long getGroupId() {
		return _faqCategory.getGroupId();
	}

	/**
	* Returns the ID of this f a q category.
	*
	* @return the ID of this f a q category
	*/
	@Override
	public long getId() {
		return _faqCategory.getId();
	}

	/**
	* Returns the parent of this f a q category.
	*
	* @return the parent of this f a q category
	*/
	@Override
	public long getParent() {
		return _faqCategory.getParent();
	}

	/**
	* Returns the primary key of this f a q category.
	*
	* @return the primary key of this f a q category
	*/
	@Override
	public long getPrimaryKey() {
		return _faqCategory.getPrimaryKey();
	}

	/**
	* Returns the user ID of this f a q category.
	*
	* @return the user ID of this f a q category
	*/
	@Override
	public long getUserId() {
		return _faqCategory.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.FAQCategory toEscapedModel() {
		return new FAQCategoryWrapper(_faqCategory.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.FAQCategory toUnescapedModel() {
		return new FAQCategoryWrapper(_faqCategory.toUnescapedModel());
	}

	@Override
	public void persist() {
		_faqCategory.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_faqCategory.setCachedModel(cachedModel);
	}

	/**
	* Sets the catlevel of this f a q category.
	*
	* @param catlevel the catlevel of this f a q category
	*/
	@Override
	public void setCatlevel(int catlevel) {
		_faqCategory.setCatlevel(catlevel);
	}

	/**
	* Sets the catorder of this f a q category.
	*
	* @param catorder the catorder of this f a q category
	*/
	@Override
	public void setCatorder(int catorder) {
		_faqCategory.setCatorder(catorder);
	}

	/**
	* Sets the created by user of this f a q category.
	*
	* @param createdByUser the created by user of this f a q category
	*/
	@Override
	public void setCreatedByUser(java.lang.String createdByUser) {
		_faqCategory.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this f a q category.
	*
	* @param createdDate the created date of this f a q category
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_faqCategory.setCreatedDate(createdDate);
	}

	/**
	* Sets the description of this f a q category.
	*
	* @param description the description of this f a q category
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_faqCategory.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_faqCategory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_faqCategory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_faqCategory.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this f a q category.
	*
	* @param groupId the group ID of this f a q category
	*/
	@Override
	public void setGroupId(long groupId) {
		_faqCategory.setGroupId(groupId);
	}

	/**
	* Sets the ID of this f a q category.
	*
	* @param id the ID of this f a q category
	*/
	@Override
	public void setId(long id) {
		_faqCategory.setId(id);
	}

	/**
	* Sets the image of this f a q category.
	*
	* @param image the image of this f a q category
	*/
	@Override
	public void setImage(java.lang.String image) {
		_faqCategory.setImage(image);
	}

	/**
	* Sets the language of this f a q category.
	*
	* @param language the language of this f a q category
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_faqCategory.setLanguage(language);
	}

	/**
	* Sets the modified by user of this f a q category.
	*
	* @param modifiedByUser the modified by user of this f a q category
	*/
	@Override
	public void setModifiedByUser(java.lang.String modifiedByUser) {
		_faqCategory.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this f a q category.
	*
	* @param modifiedDate the modified date of this f a q category
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_faqCategory.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this f a q category.
	*
	* @param name the name of this f a q category
	*/
	@Override
	public void setName(java.lang.String name) {
		_faqCategory.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_faqCategory.setNew(n);
	}

	/**
	* Sets the parent of this f a q category.
	*
	* @param parent the parent of this f a q category
	*/
	@Override
	public void setParent(long parent) {
		_faqCategory.setParent(parent);
	}

	/**
	* Sets the primary key of this f a q category.
	*
	* @param primaryKey the primary key of this f a q category
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_faqCategory.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_faqCategory.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this f a q category.
	*
	* @param userId the user ID of this f a q category
	*/
	@Override
	public void setUserId(long userId) {
		_faqCategory.setUserId(userId);
	}

	/**
	* Sets the user uuid of this f a q category.
	*
	* @param userUuid the user uuid of this f a q category
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_faqCategory.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FAQCategoryWrapper)) {
			return false;
		}

		FAQCategoryWrapper faqCategoryWrapper = (FAQCategoryWrapper)obj;

		if (Objects.equals(_faqCategory, faqCategoryWrapper._faqCategory)) {
			return true;
		}

		return false;
	}

	@Override
	public FAQCategory getWrappedModel() {
		return _faqCategory;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _faqCategory.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _faqCategory.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_faqCategory.resetOriginalValues();
	}

	private final FAQCategory _faqCategory;
}