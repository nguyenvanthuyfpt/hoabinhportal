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
 * This class is a wrapper for {@link VcmsArticleType}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleType
 * @generated
 */
@ProviderType
public class VcmsArticleTypeWrapper implements VcmsArticleType,
	ModelWrapper<VcmsArticleType> {
	public VcmsArticleTypeWrapper(VcmsArticleType vcmsArticleType) {
		_vcmsArticleType = vcmsArticleType;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsArticleType.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsArticleType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("typeId", getTypeId());
		attributes.put("articleId", getArticleId());
		attributes.put("position", getPosition());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long typeId = (Long)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}

		String articleId = (String)attributes.get("articleId");

		if (articleId != null) {
			setArticleId(articleId);
		}

		Integer position = (Integer)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsArticleType.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsArticleType.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vcmsArticleType.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsArticleType.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsArticleType> toCacheModel() {
		return _vcmsArticleType.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VcmsArticleType vcmsArticleType) {
		return _vcmsArticleType.compareTo(vcmsArticleType);
	}

	/**
	* Returns the position of this vcms article type.
	*
	* @return the position of this vcms article type
	*/
	@Override
	public int getPosition() {
		return _vcmsArticleType.getPosition();
	}

	@Override
	public int hashCode() {
		return _vcmsArticleType.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsArticleType.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsArticleTypeWrapper((VcmsArticleType)_vcmsArticleType.clone());
	}

	/**
	* Returns the article ID of this vcms article type.
	*
	* @return the article ID of this vcms article type
	*/
	@Override
	public java.lang.String getArticleId() {
		return _vcmsArticleType.getArticleId();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsArticleType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsArticleType.toXmlString();
	}

	/**
	* Returns the type ID of this vcms article type.
	*
	* @return the type ID of this vcms article type
	*/
	@Override
	public long getTypeId() {
		return _vcmsArticleType.getTypeId();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleType toEscapedModel() {
		return new VcmsArticleTypeWrapper(_vcmsArticleType.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleType toUnescapedModel() {
		return new VcmsArticleTypeWrapper(_vcmsArticleType.toUnescapedModel());
	}

	/**
	* Returns the primary key of this vcms article type.
	*
	* @return the primary key of this vcms article type
	*/
	@Override
	public vn.gov.hoabinh.service.persistence.VcmsArticleTypePK getPrimaryKey() {
		return _vcmsArticleType.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vcmsArticleType.persist();
	}

	/**
	* Sets the article ID of this vcms article type.
	*
	* @param articleId the article ID of this vcms article type
	*/
	@Override
	public void setArticleId(java.lang.String articleId) {
		_vcmsArticleType.setArticleId(articleId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsArticleType.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsArticleType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsArticleType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsArticleType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsArticleType.setNew(n);
	}

	/**
	* Sets the position of this vcms article type.
	*
	* @param position the position of this vcms article type
	*/
	@Override
	public void setPosition(int position) {
		_vcmsArticleType.setPosition(position);
	}

	/**
	* Sets the primary key of this vcms article type.
	*
	* @param primaryKey the primary key of this vcms article type
	*/
	@Override
	public void setPrimaryKey(
		vn.gov.hoabinh.service.persistence.VcmsArticleTypePK primaryKey) {
		_vcmsArticleType.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsArticleType.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the type ID of this vcms article type.
	*
	* @param typeId the type ID of this vcms article type
	*/
	@Override
	public void setTypeId(long typeId) {
		_vcmsArticleType.setTypeId(typeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsArticleTypeWrapper)) {
			return false;
		}

		VcmsArticleTypeWrapper vcmsArticleTypeWrapper = (VcmsArticleTypeWrapper)obj;

		if (Objects.equals(_vcmsArticleType,
					vcmsArticleTypeWrapper._vcmsArticleType)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsArticleType getWrappedModel() {
		return _vcmsArticleType;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsArticleType.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsArticleType.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsArticleType.resetOriginalValues();
	}

	private final VcmsArticleType _vcmsArticleType;
}