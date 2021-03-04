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
 * This class is a wrapper for {@link VLegalDDRel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDDRel
 * @generated
 */
@ProviderType
public class VLegalDDRelWrapper implements VLegalDDRel,
	ModelWrapper<VLegalDDRel> {
	public VLegalDDRelWrapper(VLegalDDRel vLegalDDRel) {
		_vLegalDDRel = vLegalDDRel;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalDDRel.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalDDRel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("departmentId", getDepartmentId());
		attributes.put("docId", getDocId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long departmentId = (Long)attributes.get("departmentId");

		if (departmentId != null) {
			setDepartmentId(departmentId);
		}

		String docId = (String)attributes.get("docId");

		if (docId != null) {
			setDocId(docId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalDDRel.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalDDRel.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vLegalDDRel.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalDDRel.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalDDRel> toCacheModel() {
		return _vLegalDDRel.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VLegalDDRel vLegalDDRel) {
		return _vLegalDDRel.compareTo(vLegalDDRel);
	}

	@Override
	public int hashCode() {
		return _vLegalDDRel.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalDDRel.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalDDRelWrapper((VLegalDDRel)_vLegalDDRel.clone());
	}

	/**
	* Returns the doc ID of this v legal d d rel.
	*
	* @return the doc ID of this v legal d d rel
	*/
	@Override
	public java.lang.String getDocId() {
		return _vLegalDDRel.getDocId();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalDDRel.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalDDRel.toXmlString();
	}

	/**
	* Returns the department ID of this v legal d d rel.
	*
	* @return the department ID of this v legal d d rel
	*/
	@Override
	public long getDepartmentId() {
		return _vLegalDDRel.getDepartmentId();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDDRel toEscapedModel() {
		return new VLegalDDRelWrapper(_vLegalDDRel.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDDRel toUnescapedModel() {
		return new VLegalDDRelWrapper(_vLegalDDRel.toUnescapedModel());
	}

	/**
	* Returns the primary key of this v legal d d rel.
	*
	* @return the primary key of this v legal d d rel
	*/
	@Override
	public vn.gov.hoabinh.service.persistence.VLegalDDRelPK getPrimaryKey() {
		return _vLegalDDRel.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vLegalDDRel.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalDDRel.setCachedModel(cachedModel);
	}

	/**
	* Sets the department ID of this v legal d d rel.
	*
	* @param departmentId the department ID of this v legal d d rel
	*/
	@Override
	public void setDepartmentId(long departmentId) {
		_vLegalDDRel.setDepartmentId(departmentId);
	}

	/**
	* Sets the doc ID of this v legal d d rel.
	*
	* @param docId the doc ID of this v legal d d rel
	*/
	@Override
	public void setDocId(java.lang.String docId) {
		_vLegalDDRel.setDocId(docId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalDDRel.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalDDRel.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalDDRel.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalDDRel.setNew(n);
	}

	/**
	* Sets the primary key of this v legal d d rel.
	*
	* @param primaryKey the primary key of this v legal d d rel
	*/
	@Override
	public void setPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDDRelPK primaryKey) {
		_vLegalDDRel.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalDDRel.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalDDRelWrapper)) {
			return false;
		}

		VLegalDDRelWrapper vLegalDDRelWrapper = (VLegalDDRelWrapper)obj;

		if (Objects.equals(_vLegalDDRel, vLegalDDRelWrapper._vLegalDDRel)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalDDRel getWrappedModel() {
		return _vLegalDDRel;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalDDRel.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalDDRel.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalDDRel.resetOriginalValues();
	}

	private final VLegalDDRel _vLegalDDRel;
}