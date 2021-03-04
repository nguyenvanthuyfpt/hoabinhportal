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
 * This class is a wrapper for {@link VLegalDSRel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDSRel
 * @generated
 */
@ProviderType
public class VLegalDSRelWrapper implements VLegalDSRel,
	ModelWrapper<VLegalDSRel> {
	public VLegalDSRelWrapper(VLegalDSRel vLegalDSRel) {
		_vLegalDSRel = vLegalDSRel;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalDSRel.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalDSRel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sigId", getSigId());
		attributes.put("docId", getDocId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String sigId = (String)attributes.get("sigId");

		if (sigId != null) {
			setSigId(sigId);
		}

		String docId = (String)attributes.get("docId");

		if (docId != null) {
			setDocId(docId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalDSRel.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalDSRel.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vLegalDSRel.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalDSRel.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalDSRel> toCacheModel() {
		return _vLegalDSRel.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VLegalDSRel vLegalDSRel) {
		return _vLegalDSRel.compareTo(vLegalDSRel);
	}

	@Override
	public int hashCode() {
		return _vLegalDSRel.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalDSRel.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalDSRelWrapper((VLegalDSRel)_vLegalDSRel.clone());
	}

	/**
	* Returns the doc ID of this v legal d s rel.
	*
	* @return the doc ID of this v legal d s rel
	*/
	@Override
	public java.lang.String getDocId() {
		return _vLegalDSRel.getDocId();
	}

	/**
	* Returns the sig ID of this v legal d s rel.
	*
	* @return the sig ID of this v legal d s rel
	*/
	@Override
	public java.lang.String getSigId() {
		return _vLegalDSRel.getSigId();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalDSRel.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalDSRel.toXmlString();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDSRel toEscapedModel() {
		return new VLegalDSRelWrapper(_vLegalDSRel.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDSRel toUnescapedModel() {
		return new VLegalDSRelWrapper(_vLegalDSRel.toUnescapedModel());
	}

	/**
	* Returns the primary key of this v legal d s rel.
	*
	* @return the primary key of this v legal d s rel
	*/
	@Override
	public vn.gov.hoabinh.service.persistence.VLegalDSRelPK getPrimaryKey() {
		return _vLegalDSRel.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vLegalDSRel.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalDSRel.setCachedModel(cachedModel);
	}

	/**
	* Sets the doc ID of this v legal d s rel.
	*
	* @param docId the doc ID of this v legal d s rel
	*/
	@Override
	public void setDocId(java.lang.String docId) {
		_vLegalDSRel.setDocId(docId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalDSRel.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalDSRel.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalDSRel.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalDSRel.setNew(n);
	}

	/**
	* Sets the primary key of this v legal d s rel.
	*
	* @param primaryKey the primary key of this v legal d s rel
	*/
	@Override
	public void setPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDSRelPK primaryKey) {
		_vLegalDSRel.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalDSRel.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sig ID of this v legal d s rel.
	*
	* @param sigId the sig ID of this v legal d s rel
	*/
	@Override
	public void setSigId(java.lang.String sigId) {
		_vLegalDSRel.setSigId(sigId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalDSRelWrapper)) {
			return false;
		}

		VLegalDSRelWrapper vLegalDSRelWrapper = (VLegalDSRelWrapper)obj;

		if (Objects.equals(_vLegalDSRel, vLegalDSRelWrapper._vLegalDSRel)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalDSRel getWrappedModel() {
		return _vLegalDSRel;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalDSRel.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalDSRel.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalDSRel.resetOriginalValues();
	}

	private final VLegalDSRel _vLegalDSRel;
}