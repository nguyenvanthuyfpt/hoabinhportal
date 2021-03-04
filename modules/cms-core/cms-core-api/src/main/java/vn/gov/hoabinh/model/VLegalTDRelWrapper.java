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
 * This class is a wrapper for {@link VLegalTDRel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTDRel
 * @generated
 */
@ProviderType
public class VLegalTDRelWrapper implements VLegalTDRel,
	ModelWrapper<VLegalTDRel> {
	public VLegalTDRelWrapper(VLegalTDRel vLegalTDRel) {
		_vLegalTDRel = vLegalTDRel;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalTDRel.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalTDRel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("docId", getDocId());
		attributes.put("tagId", getTagId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String docId = (String)attributes.get("docId");

		if (docId != null) {
			setDocId(docId);
		}

		String tagId = (String)attributes.get("tagId");

		if (tagId != null) {
			setTagId(tagId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalTDRel.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalTDRel.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vLegalTDRel.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalTDRel.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalTDRel> toCacheModel() {
		return _vLegalTDRel.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VLegalTDRel vLegalTDRel) {
		return _vLegalTDRel.compareTo(vLegalTDRel);
	}

	@Override
	public int hashCode() {
		return _vLegalTDRel.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalTDRel.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalTDRelWrapper((VLegalTDRel)_vLegalTDRel.clone());
	}

	/**
	* Returns the doc ID of this v legal t d rel.
	*
	* @return the doc ID of this v legal t d rel
	*/
	@Override
	public java.lang.String getDocId() {
		return _vLegalTDRel.getDocId();
	}

	/**
	* Returns the tag ID of this v legal t d rel.
	*
	* @return the tag ID of this v legal t d rel
	*/
	@Override
	public java.lang.String getTagId() {
		return _vLegalTDRel.getTagId();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalTDRel.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalTDRel.toXmlString();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalTDRel toEscapedModel() {
		return new VLegalTDRelWrapper(_vLegalTDRel.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalTDRel toUnescapedModel() {
		return new VLegalTDRelWrapper(_vLegalTDRel.toUnescapedModel());
	}

	/**
	* Returns the primary key of this v legal t d rel.
	*
	* @return the primary key of this v legal t d rel
	*/
	@Override
	public vn.gov.hoabinh.service.persistence.VLegalTDRelPK getPrimaryKey() {
		return _vLegalTDRel.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vLegalTDRel.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalTDRel.setCachedModel(cachedModel);
	}

	/**
	* Sets the doc ID of this v legal t d rel.
	*
	* @param docId the doc ID of this v legal t d rel
	*/
	@Override
	public void setDocId(java.lang.String docId) {
		_vLegalTDRel.setDocId(docId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalTDRel.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalTDRel.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalTDRel.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalTDRel.setNew(n);
	}

	/**
	* Sets the primary key of this v legal t d rel.
	*
	* @param primaryKey the primary key of this v legal t d rel
	*/
	@Override
	public void setPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalTDRelPK primaryKey) {
		_vLegalTDRel.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalTDRel.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tag ID of this v legal t d rel.
	*
	* @param tagId the tag ID of this v legal t d rel
	*/
	@Override
	public void setTagId(java.lang.String tagId) {
		_vLegalTDRel.setTagId(tagId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalTDRelWrapper)) {
			return false;
		}

		VLegalTDRelWrapper vLegalTDRelWrapper = (VLegalTDRelWrapper)obj;

		if (Objects.equals(_vLegalTDRel, vLegalTDRelWrapper._vLegalTDRel)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalTDRel getWrappedModel() {
		return _vLegalTDRel;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalTDRel.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalTDRel.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalTDRel.resetOriginalValues();
	}

	private final VLegalTDRel _vLegalTDRel;
}