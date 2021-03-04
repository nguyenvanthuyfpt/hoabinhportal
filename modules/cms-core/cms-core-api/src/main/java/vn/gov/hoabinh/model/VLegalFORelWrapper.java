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
 * This class is a wrapper for {@link VLegalFORel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFORel
 * @generated
 */
@ProviderType
public class VLegalFORelWrapper implements VLegalFORel,
	ModelWrapper<VLegalFORel> {
	public VLegalFORelWrapper(VLegalFORel vLegalFORel) {
		_vLegalFORel = vLegalFORel;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalFORel.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalFORel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fieldId", getFieldId());
		attributes.put("orgId", getOrgId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String fieldId = (String)attributes.get("fieldId");

		if (fieldId != null) {
			setFieldId(fieldId);
		}

		String orgId = (String)attributes.get("orgId");

		if (orgId != null) {
			setOrgId(orgId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalFORel.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalFORel.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vLegalFORel.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalFORel.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalFORel> toCacheModel() {
		return _vLegalFORel.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VLegalFORel vLegalFORel) {
		return _vLegalFORel.compareTo(vLegalFORel);
	}

	@Override
	public int hashCode() {
		return _vLegalFORel.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalFORel.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalFORelWrapper((VLegalFORel)_vLegalFORel.clone());
	}

	/**
	* Returns the field ID of this v legal f o rel.
	*
	* @return the field ID of this v legal f o rel
	*/
	@Override
	public java.lang.String getFieldId() {
		return _vLegalFORel.getFieldId();
	}

	/**
	* Returns the org ID of this v legal f o rel.
	*
	* @return the org ID of this v legal f o rel
	*/
	@Override
	public java.lang.String getOrgId() {
		return _vLegalFORel.getOrgId();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalFORel.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalFORel.toXmlString();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalFORel toEscapedModel() {
		return new VLegalFORelWrapper(_vLegalFORel.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalFORel toUnescapedModel() {
		return new VLegalFORelWrapper(_vLegalFORel.toUnescapedModel());
	}

	/**
	* Returns the primary key of this v legal f o rel.
	*
	* @return the primary key of this v legal f o rel
	*/
	@Override
	public vn.gov.hoabinh.service.persistence.VLegalFORelPK getPrimaryKey() {
		return _vLegalFORel.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vLegalFORel.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalFORel.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalFORel.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalFORel.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalFORel.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field ID of this v legal f o rel.
	*
	* @param fieldId the field ID of this v legal f o rel
	*/
	@Override
	public void setFieldId(java.lang.String fieldId) {
		_vLegalFORel.setFieldId(fieldId);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalFORel.setNew(n);
	}

	/**
	* Sets the org ID of this v legal f o rel.
	*
	* @param orgId the org ID of this v legal f o rel
	*/
	@Override
	public void setOrgId(java.lang.String orgId) {
		_vLegalFORel.setOrgId(orgId);
	}

	/**
	* Sets the primary key of this v legal f o rel.
	*
	* @param primaryKey the primary key of this v legal f o rel
	*/
	@Override
	public void setPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalFORelPK primaryKey) {
		_vLegalFORel.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalFORel.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalFORelWrapper)) {
			return false;
		}

		VLegalFORelWrapper vLegalFORelWrapper = (VLegalFORelWrapper)obj;

		if (Objects.equals(_vLegalFORel, vLegalFORelWrapper._vLegalFORel)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalFORel getWrappedModel() {
		return _vLegalFORel;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalFORel.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalFORel.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalFORel.resetOriginalValues();
	}

	private final VLegalFORel _vLegalFORel;
}