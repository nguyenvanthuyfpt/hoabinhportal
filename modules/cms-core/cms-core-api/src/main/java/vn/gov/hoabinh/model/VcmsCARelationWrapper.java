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
 * This class is a wrapper for {@link VcmsCARelation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCARelation
 * @generated
 */
@ProviderType
public class VcmsCARelationWrapper implements VcmsCARelation,
	ModelWrapper<VcmsCARelation> {
	public VcmsCARelationWrapper(VcmsCARelation vcmsCARelation) {
		_vcmsCARelation = vcmsCARelation;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsCARelation.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsCARelation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("categoryId", getCategoryId());
		attributes.put("articleId", getArticleId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String categoryId = (String)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}

		String articleId = (String)attributes.get("articleId");

		if (articleId != null) {
			setArticleId(articleId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String createdByUser = (String)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsCARelation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsCARelation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vcmsCARelation.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsCARelation.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsCARelation> toCacheModel() {
		return _vcmsCARelation.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VcmsCARelation vcmsCARelation) {
		return _vcmsCARelation.compareTo(vcmsCARelation);
	}

	@Override
	public int hashCode() {
		return _vcmsCARelation.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsCARelation.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsCARelationWrapper((VcmsCARelation)_vcmsCARelation.clone());
	}

	/**
	* Returns the article ID of this vcms c a relation.
	*
	* @return the article ID of this vcms c a relation
	*/
	@Override
	public java.lang.String getArticleId() {
		return _vcmsCARelation.getArticleId();
	}

	/**
	* Returns the category ID of this vcms c a relation.
	*
	* @return the category ID of this vcms c a relation
	*/
	@Override
	public java.lang.String getCategoryId() {
		return _vcmsCARelation.getCategoryId();
	}

	/**
	* Returns the created by user of this vcms c a relation.
	*
	* @return the created by user of this vcms c a relation
	*/
	@Override
	public java.lang.String getCreatedByUser() {
		return _vcmsCARelation.getCreatedByUser();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsCARelation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsCARelation.toXmlString();
	}

	/**
	* Returns the created date of this vcms c a relation.
	*
	* @return the created date of this vcms c a relation
	*/
	@Override
	public Date getCreatedDate() {
		return _vcmsCARelation.getCreatedDate();
	}

	/**
	* Returns the status of this vcms c a relation.
	*
	* @return the status of this vcms c a relation
	*/
	@Override
	public long getStatus() {
		return _vcmsCARelation.getStatus();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsCARelation toEscapedModel() {
		return new VcmsCARelationWrapper(_vcmsCARelation.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsCARelation toUnescapedModel() {
		return new VcmsCARelationWrapper(_vcmsCARelation.toUnescapedModel());
	}

	/**
	* Returns the primary key of this vcms c a relation.
	*
	* @return the primary key of this vcms c a relation
	*/
	@Override
	public vn.gov.hoabinh.service.persistence.VcmsCARelationPK getPrimaryKey() {
		return _vcmsCARelation.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vcmsCARelation.persist();
	}

	/**
	* Sets the article ID of this vcms c a relation.
	*
	* @param articleId the article ID of this vcms c a relation
	*/
	@Override
	public void setArticleId(java.lang.String articleId) {
		_vcmsCARelation.setArticleId(articleId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsCARelation.setCachedModel(cachedModel);
	}

	/**
	* Sets the category ID of this vcms c a relation.
	*
	* @param categoryId the category ID of this vcms c a relation
	*/
	@Override
	public void setCategoryId(java.lang.String categoryId) {
		_vcmsCARelation.setCategoryId(categoryId);
	}

	/**
	* Sets the created by user of this vcms c a relation.
	*
	* @param createdByUser the created by user of this vcms c a relation
	*/
	@Override
	public void setCreatedByUser(java.lang.String createdByUser) {
		_vcmsCARelation.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this vcms c a relation.
	*
	* @param createdDate the created date of this vcms c a relation
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vcmsCARelation.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsCARelation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsCARelation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsCARelation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsCARelation.setNew(n);
	}

	/**
	* Sets the primary key of this vcms c a relation.
	*
	* @param primaryKey the primary key of this vcms c a relation
	*/
	@Override
	public void setPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsCARelationPK primaryKey) {
		_vcmsCARelation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsCARelation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this vcms c a relation.
	*
	* @param status the status of this vcms c a relation
	*/
	@Override
	public void setStatus(long status) {
		_vcmsCARelation.setStatus(status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsCARelationWrapper)) {
			return false;
		}

		VcmsCARelationWrapper vcmsCARelationWrapper = (VcmsCARelationWrapper)obj;

		if (Objects.equals(_vcmsCARelation,
					vcmsCARelationWrapper._vcmsCARelation)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsCARelation getWrappedModel() {
		return _vcmsCARelation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsCARelation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsCARelation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsCARelation.resetOriginalValues();
	}

	private final VcmsCARelation _vcmsCARelation;
}