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
 * This class is a wrapper for {@link VcmsPARelation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsPARelation
 * @generated
 */
@ProviderType
public class VcmsPARelationWrapper implements VcmsPARelation,
	ModelWrapper<VcmsPARelation> {
	public VcmsPARelationWrapper(VcmsPARelation vcmsPARelation) {
		_vcmsPARelation = vcmsPARelation;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsPARelation.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsPARelation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("portionId", getPortionId());
		attributes.put("articleId", getArticleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String portionId = (String)attributes.get("portionId");

		if (portionId != null) {
			setPortionId(portionId);
		}

		String articleId = (String)attributes.get("articleId");

		if (articleId != null) {
			setArticleId(articleId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsPARelation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsPARelation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vcmsPARelation.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsPARelation.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsPARelation> toCacheModel() {
		return _vcmsPARelation.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VcmsPARelation vcmsPARelation) {
		return _vcmsPARelation.compareTo(vcmsPARelation);
	}

	@Override
	public int hashCode() {
		return _vcmsPARelation.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsPARelation.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsPARelationWrapper((VcmsPARelation)_vcmsPARelation.clone());
	}

	/**
	* Returns the article ID of this vcms p a relation.
	*
	* @return the article ID of this vcms p a relation
	*/
	@Override
	public java.lang.String getArticleId() {
		return _vcmsPARelation.getArticleId();
	}

	/**
	* Returns the portion ID of this vcms p a relation.
	*
	* @return the portion ID of this vcms p a relation
	*/
	@Override
	public java.lang.String getPortionId() {
		return _vcmsPARelation.getPortionId();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsPARelation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsPARelation.toXmlString();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsPARelation toEscapedModel() {
		return new VcmsPARelationWrapper(_vcmsPARelation.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsPARelation toUnescapedModel() {
		return new VcmsPARelationWrapper(_vcmsPARelation.toUnescapedModel());
	}

	/**
	* Returns the primary key of this vcms p a relation.
	*
	* @return the primary key of this vcms p a relation
	*/
	@Override
	public vn.gov.hoabinh.service.persistence.VcmsPARelationPK getPrimaryKey() {
		return _vcmsPARelation.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vcmsPARelation.persist();
	}

	/**
	* Sets the article ID of this vcms p a relation.
	*
	* @param articleId the article ID of this vcms p a relation
	*/
	@Override
	public void setArticleId(java.lang.String articleId) {
		_vcmsPARelation.setArticleId(articleId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsPARelation.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsPARelation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsPARelation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsPARelation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsPARelation.setNew(n);
	}

	/**
	* Sets the portion ID of this vcms p a relation.
	*
	* @param portionId the portion ID of this vcms p a relation
	*/
	@Override
	public void setPortionId(java.lang.String portionId) {
		_vcmsPARelation.setPortionId(portionId);
	}

	/**
	* Sets the primary key of this vcms p a relation.
	*
	* @param primaryKey the primary key of this vcms p a relation
	*/
	@Override
	public void setPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsPARelationPK primaryKey) {
		_vcmsPARelation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsPARelation.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsPARelationWrapper)) {
			return false;
		}

		VcmsPARelationWrapper vcmsPARelationWrapper = (VcmsPARelationWrapper)obj;

		if (Objects.equals(_vcmsPARelation,
					vcmsPARelationWrapper._vcmsPARelation)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsPARelation getWrappedModel() {
		return _vcmsPARelation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsPARelation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsPARelation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsPARelation.resetOriginalValues();
	}

	private final VcmsPARelation _vcmsPARelation;
}