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
 * This class is a wrapper for {@link VLegalFTRel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFTRel
 * @generated
 */
@ProviderType
public class VLegalFTRelWrapper implements VLegalFTRel,
	ModelWrapper<VLegalFTRel> {
	public VLegalFTRelWrapper(VLegalFTRel vLegalFTRel) {
		_vLegalFTRel = vLegalFTRel;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalFTRel.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalFTRel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fieldId", getFieldId());
		attributes.put("typeId", getTypeId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String fieldId = (String)attributes.get("fieldId");

		if (fieldId != null) {
			setFieldId(fieldId);
		}

		String typeId = (String)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalFTRel.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalFTRel.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vLegalFTRel.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalFTRel.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalFTRel> toCacheModel() {
		return _vLegalFTRel.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VLegalFTRel vLegalFTRel) {
		return _vLegalFTRel.compareTo(vLegalFTRel);
	}

	@Override
	public int hashCode() {
		return _vLegalFTRel.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalFTRel.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalFTRelWrapper((VLegalFTRel)_vLegalFTRel.clone());
	}

	/**
	* Returns the field ID of this v legal f t rel.
	*
	* @return the field ID of this v legal f t rel
	*/
	@Override
	public java.lang.String getFieldId() {
		return _vLegalFTRel.getFieldId();
	}

	/**
	* Returns the type ID of this v legal f t rel.
	*
	* @return the type ID of this v legal f t rel
	*/
	@Override
	public java.lang.String getTypeId() {
		return _vLegalFTRel.getTypeId();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalFTRel.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalFTRel.toXmlString();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalFTRel toEscapedModel() {
		return new VLegalFTRelWrapper(_vLegalFTRel.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalFTRel toUnescapedModel() {
		return new VLegalFTRelWrapper(_vLegalFTRel.toUnescapedModel());
	}

	/**
	* Returns the primary key of this v legal f t rel.
	*
	* @return the primary key of this v legal f t rel
	*/
	@Override
	public vn.gov.hoabinh.service.persistence.VLegalFTRelPK getPrimaryKey() {
		return _vLegalFTRel.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vLegalFTRel.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalFTRel.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalFTRel.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalFTRel.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalFTRel.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field ID of this v legal f t rel.
	*
	* @param fieldId the field ID of this v legal f t rel
	*/
	@Override
	public void setFieldId(java.lang.String fieldId) {
		_vLegalFTRel.setFieldId(fieldId);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalFTRel.setNew(n);
	}

	/**
	* Sets the primary key of this v legal f t rel.
	*
	* @param primaryKey the primary key of this v legal f t rel
	*/
	@Override
	public void setPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalFTRelPK primaryKey) {
		_vLegalFTRel.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalFTRel.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the type ID of this v legal f t rel.
	*
	* @param typeId the type ID of this v legal f t rel
	*/
	@Override
	public void setTypeId(java.lang.String typeId) {
		_vLegalFTRel.setTypeId(typeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalFTRelWrapper)) {
			return false;
		}

		VLegalFTRelWrapper vLegalFTRelWrapper = (VLegalFTRelWrapper)obj;

		if (Objects.equals(_vLegalFTRel, vLegalFTRelWrapper._vLegalFTRel)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalFTRel getWrappedModel() {
		return _vLegalFTRel;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalFTRel.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalFTRel.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalFTRel.resetOriginalValues();
	}

	private final VLegalFTRel _vLegalFTRel;
}