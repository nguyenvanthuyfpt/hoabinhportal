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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VcmsCURelation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsCURelation
 * @generated
 */
@ProviderType
public class VcmsCURelationWrapper implements VcmsCURelation,
	ModelWrapper<VcmsCURelation> {
	public VcmsCURelationWrapper(VcmsCURelation vcmsCURelation) {
		_vcmsCURelation = vcmsCURelation;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsCURelation.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsCURelation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("categoryId", getCategoryId());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String categoryId = (String)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}

		String userId = (String)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsCURelation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsCURelation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vcmsCURelation.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsCURelation.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsCURelation> toCacheModel() {
		return _vcmsCURelation.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VcmsCURelation vcmsCURelation) {
		return _vcmsCURelation.compareTo(vcmsCURelation);
	}

	@Override
	public int hashCode() {
		return _vcmsCURelation.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsCURelation.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsCURelationWrapper((VcmsCURelation)_vcmsCURelation.clone());
	}

	/**
	* Returns the category ID of this vcms c u relation.
	*
	* @return the category ID of this vcms c u relation
	*/
	@Override
	public java.lang.String getCategoryId() {
		return _vcmsCURelation.getCategoryId();
	}

	/**
	* Returns the user ID of this vcms c u relation.
	*
	* @return the user ID of this vcms c u relation
	*/
	@Override
	public java.lang.String getUserId() {
		return _vcmsCURelation.getUserId();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsCURelation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsCURelation.toXmlString();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsCURelation toEscapedModel() {
		return new VcmsCURelationWrapper(_vcmsCURelation.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsCURelation toUnescapedModel() {
		return new VcmsCURelationWrapper(_vcmsCURelation.toUnescapedModel());
	}

	/**
	* Returns the primary key of this vcms c u relation.
	*
	* @return the primary key of this vcms c u relation
	*/
	@Override
	public vn.gov.hoabinh.service.persistence.VcmsCURelationPK getPrimaryKey() {
		return _vcmsCURelation.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vcmsCURelation.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsCURelation.setCachedModel(cachedModel);
	}

	/**
	* Sets the category ID of this vcms c u relation.
	*
	* @param categoryId the category ID of this vcms c u relation
	*/
	@Override
	public void setCategoryId(java.lang.String categoryId) {
		_vcmsCURelation.setCategoryId(categoryId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsCURelation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsCURelation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsCURelation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsCURelation.setNew(n);
	}

	/**
	* Sets the primary key of this vcms c u relation.
	*
	* @param primaryKey the primary key of this vcms c u relation
	*/
	@Override
	public void setPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsCURelationPK primaryKey) {
		_vcmsCURelation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsCURelation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this vcms c u relation.
	*
	* @param userId the user ID of this vcms c u relation
	*/
	@Override
	public void setUserId(java.lang.String userId) {
		_vcmsCURelation.setUserId(userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsCURelationWrapper)) {
			return false;
		}

		VcmsCURelationWrapper vcmsCURelationWrapper = (VcmsCURelationWrapper)obj;

		if (Objects.equals(_vcmsCURelation,
					vcmsCURelationWrapper._vcmsCURelation)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsCURelation getWrappedModel() {
		return _vcmsCURelation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsCURelation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsCURelation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsCURelation.resetOriginalValues();
	}

	private final VcmsCURelation _vcmsCURelation;
}