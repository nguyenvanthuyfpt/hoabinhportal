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
 * This class is a wrapper for {@link VcmsArticleStatus}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleStatus
 * @generated
 */
@ProviderType
public class VcmsArticleStatusWrapper implements VcmsArticleStatus,
	ModelWrapper<VcmsArticleStatus> {
	public VcmsArticleStatusWrapper(VcmsArticleStatus vcmsArticleStatus) {
		_vcmsArticleStatus = vcmsArticleStatus;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsArticleStatus.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsArticleStatus.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("statusId", getStatusId());
		attributes.put("articleId", getArticleId());
		attributes.put("categoryId", getCategoryId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("active", getActive());
		attributes.put("articleVersionId", getArticleVersionId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long statusId = (Long)attributes.get("statusId");

		if (statusId != null) {
			setStatusId(statusId);
		}

		String articleId = (String)attributes.get("articleId");

		if (articleId != null) {
			setArticleId(articleId);
		}

		String categoryId = (String)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String createdByUser = (String)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Long articleVersionId = (Long)attributes.get("articleVersionId");

		if (articleVersionId != null) {
			setArticleVersionId(articleVersionId);
		}
	}

	/**
	* Returns the active of this vcms article status.
	*
	* @return the active of this vcms article status
	*/
	@Override
	public boolean getActive() {
		return _vcmsArticleStatus.getActive();
	}

	/**
	* Returns <code>true</code> if this vcms article status is active.
	*
	* @return <code>true</code> if this vcms article status is active; <code>false</code> otherwise
	*/
	@Override
	public boolean isActive() {
		return _vcmsArticleStatus.isActive();
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsArticleStatus.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsArticleStatus.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vcmsArticleStatus.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsArticleStatus.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsArticleStatus> toCacheModel() {
		return _vcmsArticleStatus.toCacheModel();
	}

	@Override
	public int compareTo(
		vn.gov.hoabinh.model.VcmsArticleStatus vcmsArticleStatus) {
		return _vcmsArticleStatus.compareTo(vcmsArticleStatus);
	}

	@Override
	public int hashCode() {
		return _vcmsArticleStatus.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsArticleStatus.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsArticleStatusWrapper((VcmsArticleStatus)_vcmsArticleStatus.clone());
	}

	/**
	* Returns the article ID of this vcms article status.
	*
	* @return the article ID of this vcms article status
	*/
	@Override
	public java.lang.String getArticleId() {
		return _vcmsArticleStatus.getArticleId();
	}

	/**
	* Returns the category ID of this vcms article status.
	*
	* @return the category ID of this vcms article status
	*/
	@Override
	public java.lang.String getCategoryId() {
		return _vcmsArticleStatus.getCategoryId();
	}

	/**
	* Returns the created by user of this vcms article status.
	*
	* @return the created by user of this vcms article status
	*/
	@Override
	public java.lang.String getCreatedByUser() {
		return _vcmsArticleStatus.getCreatedByUser();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsArticleStatus.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsArticleStatus.toXmlString();
	}

	/**
	* Returns the created date of this vcms article status.
	*
	* @return the created date of this vcms article status
	*/
	@Override
	public Date getCreatedDate() {
		return _vcmsArticleStatus.getCreatedDate();
	}

	/**
	* Returns the article version ID of this vcms article status.
	*
	* @return the article version ID of this vcms article status
	*/
	@Override
	public long getArticleVersionId() {
		return _vcmsArticleStatus.getArticleVersionId();
	}

	/**
	* Returns the status ID of this vcms article status.
	*
	* @return the status ID of this vcms article status
	*/
	@Override
	public long getStatusId() {
		return _vcmsArticleStatus.getStatusId();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleStatus toEscapedModel() {
		return new VcmsArticleStatusWrapper(_vcmsArticleStatus.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleStatus toUnescapedModel() {
		return new VcmsArticleStatusWrapper(_vcmsArticleStatus.toUnescapedModel());
	}

	/**
	* Returns the primary key of this vcms article status.
	*
	* @return the primary key of this vcms article status
	*/
	@Override
	public vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK getPrimaryKey() {
		return _vcmsArticleStatus.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vcmsArticleStatus.persist();
	}

	/**
	* Sets whether this vcms article status is active.
	*
	* @param active the active of this vcms article status
	*/
	@Override
	public void setActive(boolean active) {
		_vcmsArticleStatus.setActive(active);
	}

	/**
	* Sets the article ID of this vcms article status.
	*
	* @param articleId the article ID of this vcms article status
	*/
	@Override
	public void setArticleId(java.lang.String articleId) {
		_vcmsArticleStatus.setArticleId(articleId);
	}

	/**
	* Sets the article version ID of this vcms article status.
	*
	* @param articleVersionId the article version ID of this vcms article status
	*/
	@Override
	public void setArticleVersionId(long articleVersionId) {
		_vcmsArticleStatus.setArticleVersionId(articleVersionId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsArticleStatus.setCachedModel(cachedModel);
	}

	/**
	* Sets the category ID of this vcms article status.
	*
	* @param categoryId the category ID of this vcms article status
	*/
	@Override
	public void setCategoryId(java.lang.String categoryId) {
		_vcmsArticleStatus.setCategoryId(categoryId);
	}

	/**
	* Sets the created by user of this vcms article status.
	*
	* @param createdByUser the created by user of this vcms article status
	*/
	@Override
	public void setCreatedByUser(java.lang.String createdByUser) {
		_vcmsArticleStatus.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this vcms article status.
	*
	* @param createdDate the created date of this vcms article status
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vcmsArticleStatus.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsArticleStatus.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsArticleStatus.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsArticleStatus.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsArticleStatus.setNew(n);
	}

	/**
	* Sets the primary key of this vcms article status.
	*
	* @param primaryKey the primary key of this vcms article status
	*/
	@Override
	public void setPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK primaryKey) {
		_vcmsArticleStatus.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsArticleStatus.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status ID of this vcms article status.
	*
	* @param statusId the status ID of this vcms article status
	*/
	@Override
	public void setStatusId(long statusId) {
		_vcmsArticleStatus.setStatusId(statusId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsArticleStatusWrapper)) {
			return false;
		}

		VcmsArticleStatusWrapper vcmsArticleStatusWrapper = (VcmsArticleStatusWrapper)obj;

		if (Objects.equals(_vcmsArticleStatus,
					vcmsArticleStatusWrapper._vcmsArticleStatus)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsArticleStatus getWrappedModel() {
		return _vcmsArticleStatus;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsArticleStatus.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsArticleStatus.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsArticleStatus.resetOriginalValues();
	}

	private final VcmsArticleStatus _vcmsArticleStatus;
}