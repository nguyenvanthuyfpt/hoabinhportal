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
 * This class is a wrapper for {@link AdvItem}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvItem
 * @generated
 */
@ProviderType
public class AdvItemWrapper implements AdvItem, ModelWrapper<AdvItem> {
	public AdvItemWrapper(AdvItem advItem) {
		_advItem = advItem;
	}

	@Override
	public Class<?> getModelClass() {
		return AdvItem.class;
	}

	@Override
	public String getModelClassName() {
		return AdvItem.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemId", getItemId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("expriedDate", getExpriedDate());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("url", getUrl());
		attributes.put("isTargetBlank", getIsTargetBlank());
		attributes.put("txtMouseOver", getTxtMouseOver());
		attributes.put("folderId", getFolderId());
		attributes.put("status", getStatus());
		attributes.put("typeId", getTypeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemId = (Long)attributes.get("itemId");

		if (itemId != null) {
			setItemId(itemId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date expriedDate = (Date)attributes.get("expriedDate");

		if (expriedDate != null) {
			setExpriedDate(expriedDate);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
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

		Boolean isTargetBlank = (Boolean)attributes.get("isTargetBlank");

		if (isTargetBlank != null) {
			setIsTargetBlank(isTargetBlank);
		}

		String txtMouseOver = (String)attributes.get("txtMouseOver");

		if (txtMouseOver != null) {
			setTxtMouseOver(txtMouseOver);
		}

		Long folderId = (Long)attributes.get("folderId");

		if (folderId != null) {
			setFolderId(folderId);
		}

		Boolean status = (Boolean)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long typeId = (Long)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}
	}

	/**
	* Returns the is target blank of this adv item.
	*
	* @return the is target blank of this adv item
	*/
	@Override
	public boolean getIsTargetBlank() {
		return _advItem.getIsTargetBlank();
	}

	/**
	* Returns the status of this adv item.
	*
	* @return the status of this adv item
	*/
	@Override
	public boolean getStatus() {
		return _advItem.getStatus();
	}

	@Override
	public boolean isCachedModel() {
		return _advItem.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _advItem.isEscapedModel();
	}

	@Override
	public boolean isExpired() {
		return _advItem.isExpired();
	}

	/**
	* Returns <code>true</code> if this adv item is is target blank.
	*
	* @return <code>true</code> if this adv item is is target blank; <code>false</code> otherwise
	*/
	@Override
	public boolean isIsTargetBlank() {
		return _advItem.isIsTargetBlank();
	}

	@Override
	public boolean isNew() {
		return _advItem.isNew();
	}

	/**
	* Returns <code>true</code> if this adv item is status.
	*
	* @return <code>true</code> if this adv item is status; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatus() {
		return _advItem.isStatus();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _advItem.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.AdvItem> toCacheModel() {
		return _advItem.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.AdvItem advItem) {
		return _advItem.compareTo(advItem);
	}

	@Override
	public int hashCode() {
		return _advItem.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _advItem.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AdvItemWrapper((AdvItem)_advItem.clone());
	}

	/**
	* Returns the description of this adv item.
	*
	* @return the description of this adv item
	*/
	@Override
	public java.lang.String getDescription() {
		return _advItem.getDescription();
	}

	/**
	* Returns the name of this adv item.
	*
	* @return the name of this adv item
	*/
	@Override
	public java.lang.String getName() {
		return _advItem.getName();
	}

	/**
	* Returns the txt mouse over of this adv item.
	*
	* @return the txt mouse over of this adv item
	*/
	@Override
	public java.lang.String getTxtMouseOver() {
		return _advItem.getTxtMouseOver();
	}

	/**
	* Returns the url of this adv item.
	*
	* @return the url of this adv item
	*/
	@Override
	public java.lang.String getUrl() {
		return _advItem.getUrl();
	}

	@Override
	public java.lang.String toString() {
		return _advItem.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _advItem.toXmlString();
	}

	/**
	* Returns the create date of this adv item.
	*
	* @return the create date of this adv item
	*/
	@Override
	public Date getCreateDate() {
		return _advItem.getCreateDate();
	}

	/**
	* Returns the expried date of this adv item.
	*
	* @return the expried date of this adv item
	*/
	@Override
	public Date getExpriedDate() {
		return _advItem.getExpriedDate();
	}

	/**
	* Returns the modified date of this adv item.
	*
	* @return the modified date of this adv item
	*/
	@Override
	public Date getModifiedDate() {
		return _advItem.getModifiedDate();
	}

	/**
	* Returns the company ID of this adv item.
	*
	* @return the company ID of this adv item
	*/
	@Override
	public long getCompanyId() {
		return _advItem.getCompanyId();
	}

	/**
	* Returns the folder ID of this adv item.
	*
	* @return the folder ID of this adv item
	*/
	@Override
	public long getFolderId() {
		return _advItem.getFolderId();
	}

	/**
	* Returns the group ID of this adv item.
	*
	* @return the group ID of this adv item
	*/
	@Override
	public long getGroupId() {
		return _advItem.getGroupId();
	}

	/**
	* Returns the item ID of this adv item.
	*
	* @return the item ID of this adv item
	*/
	@Override
	public long getItemId() {
		return _advItem.getItemId();
	}

	/**
	* Returns the primary key of this adv item.
	*
	* @return the primary key of this adv item
	*/
	@Override
	public long getPrimaryKey() {
		return _advItem.getPrimaryKey();
	}

	/**
	* Returns the type ID of this adv item.
	*
	* @return the type ID of this adv item
	*/
	@Override
	public long getTypeId() {
		return _advItem.getTypeId();
	}

	@Override
	public vn.gov.hoabinh.model.AdvItem toEscapedModel() {
		return new AdvItemWrapper(_advItem.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.AdvItem toUnescapedModel() {
		return new AdvItemWrapper(_advItem.toUnescapedModel());
	}

	@Override
	public void persist() {
		_advItem.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_advItem.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this adv item.
	*
	* @param companyId the company ID of this adv item
	*/
	@Override
	public void setCompanyId(long companyId) {
		_advItem.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this adv item.
	*
	* @param createDate the create date of this adv item
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_advItem.setCreateDate(createDate);
	}

	/**
	* Sets the description of this adv item.
	*
	* @param description the description of this adv item
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_advItem.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_advItem.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_advItem.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_advItem.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expried date of this adv item.
	*
	* @param expriedDate the expried date of this adv item
	*/
	@Override
	public void setExpriedDate(Date expriedDate) {
		_advItem.setExpriedDate(expriedDate);
	}

	/**
	* Sets the folder ID of this adv item.
	*
	* @param folderId the folder ID of this adv item
	*/
	@Override
	public void setFolderId(long folderId) {
		_advItem.setFolderId(folderId);
	}

	/**
	* Sets the group ID of this adv item.
	*
	* @param groupId the group ID of this adv item
	*/
	@Override
	public void setGroupId(long groupId) {
		_advItem.setGroupId(groupId);
	}

	/**
	* Sets whether this adv item is is target blank.
	*
	* @param isTargetBlank the is target blank of this adv item
	*/
	@Override
	public void setIsTargetBlank(boolean isTargetBlank) {
		_advItem.setIsTargetBlank(isTargetBlank);
	}

	/**
	* Sets the item ID of this adv item.
	*
	* @param itemId the item ID of this adv item
	*/
	@Override
	public void setItemId(long itemId) {
		_advItem.setItemId(itemId);
	}

	/**
	* Sets the modified date of this adv item.
	*
	* @param modifiedDate the modified date of this adv item
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_advItem.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this adv item.
	*
	* @param name the name of this adv item
	*/
	@Override
	public void setName(java.lang.String name) {
		_advItem.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_advItem.setNew(n);
	}

	/**
	* Sets the primary key of this adv item.
	*
	* @param primaryKey the primary key of this adv item
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_advItem.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_advItem.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this adv item is status.
	*
	* @param status the status of this adv item
	*/
	@Override
	public void setStatus(boolean status) {
		_advItem.setStatus(status);
	}

	/**
	* Sets the txt mouse over of this adv item.
	*
	* @param txtMouseOver the txt mouse over of this adv item
	*/
	@Override
	public void setTxtMouseOver(java.lang.String txtMouseOver) {
		_advItem.setTxtMouseOver(txtMouseOver);
	}

	/**
	* Sets the type ID of this adv item.
	*
	* @param typeId the type ID of this adv item
	*/
	@Override
	public void setTypeId(long typeId) {
		_advItem.setTypeId(typeId);
	}

	/**
	* Sets the url of this adv item.
	*
	* @param url the url of this adv item
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_advItem.setUrl(url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AdvItemWrapper)) {
			return false;
		}

		AdvItemWrapper advItemWrapper = (AdvItemWrapper)obj;

		if (Objects.equals(_advItem, advItemWrapper._advItem)) {
			return true;
		}

		return false;
	}

	@Override
	public AdvItem getWrappedModel() {
		return _advItem;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _advItem.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _advItem.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_advItem.resetOriginalValues();
	}

	private final AdvItem _advItem;
}