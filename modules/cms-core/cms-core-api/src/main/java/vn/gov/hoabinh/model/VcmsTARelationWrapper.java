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
 * This class is a wrapper for {@link VcmsTARelation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsTARelation
 * @generated
 */
@ProviderType
public class VcmsTARelationWrapper implements VcmsTARelation,
	ModelWrapper<VcmsTARelation> {
	public VcmsTARelationWrapper(VcmsTARelation vcmsTARelation) {
		_vcmsTARelation = vcmsTARelation;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsTARelation.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsTARelation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("threadId", getThreadId());
		attributes.put("articleId", getArticleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String threadId = (String)attributes.get("threadId");

		if (threadId != null) {
			setThreadId(threadId);
		}

		String articleId = (String)attributes.get("articleId");

		if (articleId != null) {
			setArticleId(articleId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsTARelation.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsTARelation.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vcmsTARelation.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsTARelation.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsTARelation> toCacheModel() {
		return _vcmsTARelation.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VcmsTARelation vcmsTARelation) {
		return _vcmsTARelation.compareTo(vcmsTARelation);
	}

	@Override
	public int hashCode() {
		return _vcmsTARelation.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsTARelation.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsTARelationWrapper((VcmsTARelation)_vcmsTARelation.clone());
	}

	/**
	* Returns the article ID of this vcms t a relation.
	*
	* @return the article ID of this vcms t a relation
	*/
	@Override
	public java.lang.String getArticleId() {
		return _vcmsTARelation.getArticleId();
	}

	/**
	* Returns the thread ID of this vcms t a relation.
	*
	* @return the thread ID of this vcms t a relation
	*/
	@Override
	public java.lang.String getThreadId() {
		return _vcmsTARelation.getThreadId();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsTARelation.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsTARelation.toXmlString();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsTARelation toEscapedModel() {
		return new VcmsTARelationWrapper(_vcmsTARelation.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsTARelation toUnescapedModel() {
		return new VcmsTARelationWrapper(_vcmsTARelation.toUnescapedModel());
	}

	/**
	* Returns the primary key of this vcms t a relation.
	*
	* @return the primary key of this vcms t a relation
	*/
	@Override
	public vn.gov.hoabinh.service.persistence.VcmsTARelationPK getPrimaryKey() {
		return _vcmsTARelation.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vcmsTARelation.persist();
	}

	/**
	* Sets the article ID of this vcms t a relation.
	*
	* @param articleId the article ID of this vcms t a relation
	*/
	@Override
	public void setArticleId(java.lang.String articleId) {
		_vcmsTARelation.setArticleId(articleId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsTARelation.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsTARelation.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsTARelation.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsTARelation.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsTARelation.setNew(n);
	}

	/**
	* Sets the primary key of this vcms t a relation.
	*
	* @param primaryKey the primary key of this vcms t a relation
	*/
	@Override
	public void setPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsTARelationPK primaryKey) {
		_vcmsTARelation.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsTARelation.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the thread ID of this vcms t a relation.
	*
	* @param threadId the thread ID of this vcms t a relation
	*/
	@Override
	public void setThreadId(java.lang.String threadId) {
		_vcmsTARelation.setThreadId(threadId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsTARelationWrapper)) {
			return false;
		}

		VcmsTARelationWrapper vcmsTARelationWrapper = (VcmsTARelationWrapper)obj;

		if (Objects.equals(_vcmsTARelation,
					vcmsTARelationWrapper._vcmsTARelation)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsTARelation getWrappedModel() {
		return _vcmsTARelation;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsTARelation.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsTARelation.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsTARelation.resetOriginalValues();
	}

	private final VcmsTARelation _vcmsTARelation;
}