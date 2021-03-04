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
 * This class is a wrapper for {@link VLegalDFRel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDFRel
 * @generated
 */
@ProviderType
public class VLegalDFRelWrapper implements VLegalDFRel,
	ModelWrapper<VLegalDFRel> {
	public VLegalDFRelWrapper(VLegalDFRel vLegalDFRel) {
		_vLegalDFRel = vLegalDFRel;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalDFRel.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalDFRel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fieldId", getFieldId());
		attributes.put("docId", getDocId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String fieldId = (String)attributes.get("fieldId");

		if (fieldId != null) {
			setFieldId(fieldId);
		}

		String docId = (String)attributes.get("docId");

		if (docId != null) {
			setDocId(docId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalDFRel.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalDFRel.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vLegalDFRel.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalDFRel.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalDFRel> toCacheModel() {
		return _vLegalDFRel.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VLegalDFRel vLegalDFRel) {
		return _vLegalDFRel.compareTo(vLegalDFRel);
	}

	@Override
	public int hashCode() {
		return _vLegalDFRel.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalDFRel.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalDFRelWrapper((VLegalDFRel)_vLegalDFRel.clone());
	}

	/**
	* Returns the doc ID of this v legal d f rel.
	*
	* @return the doc ID of this v legal d f rel
	*/
	@Override
	public java.lang.String getDocId() {
		return _vLegalDFRel.getDocId();
	}

	/**
	* Returns the field ID of this v legal d f rel.
	*
	* @return the field ID of this v legal d f rel
	*/
	@Override
	public java.lang.String getFieldId() {
		return _vLegalDFRel.getFieldId();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalDFRel.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalDFRel.toXmlString();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDFRel toEscapedModel() {
		return new VLegalDFRelWrapper(_vLegalDFRel.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDFRel toUnescapedModel() {
		return new VLegalDFRelWrapper(_vLegalDFRel.toUnescapedModel());
	}

	/**
	* Returns the primary key of this v legal d f rel.
	*
	* @return the primary key of this v legal d f rel
	*/
	@Override
	public vn.gov.hoabinh.service.persistence.VLegalDFRelPK getPrimaryKey() {
		return _vLegalDFRel.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vLegalDFRel.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalDFRel.setCachedModel(cachedModel);
	}

	/**
	* Sets the doc ID of this v legal d f rel.
	*
	* @param docId the doc ID of this v legal d f rel
	*/
	@Override
	public void setDocId(java.lang.String docId) {
		_vLegalDFRel.setDocId(docId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalDFRel.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalDFRel.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalDFRel.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field ID of this v legal d f rel.
	*
	* @param fieldId the field ID of this v legal d f rel
	*/
	@Override
	public void setFieldId(java.lang.String fieldId) {
		_vLegalDFRel.setFieldId(fieldId);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalDFRel.setNew(n);
	}

	/**
	* Sets the primary key of this v legal d f rel.
	*
	* @param primaryKey the primary key of this v legal d f rel
	*/
	@Override
	public void setPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDFRelPK primaryKey) {
		_vLegalDFRel.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalDFRel.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalDFRelWrapper)) {
			return false;
		}

		VLegalDFRelWrapper vLegalDFRelWrapper = (VLegalDFRelWrapper)obj;

		if (Objects.equals(_vLegalDFRel, vLegalDFRelWrapper._vLegalDFRel)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalDFRel getWrappedModel() {
		return _vLegalDFRel;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalDFRel.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalDFRel.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalDFRel.resetOriginalValues();
	}

	private final VLegalDFRel _vLegalDFRel;
}