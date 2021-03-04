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
 * This class is a wrapper for {@link vdocFieldLevelRel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocFieldLevelRel
 * @generated
 */
@ProviderType
public class vdocFieldLevelRelWrapper implements vdocFieldLevelRel,
	ModelWrapper<vdocFieldLevelRel> {
	public vdocFieldLevelRelWrapper(vdocFieldLevelRel vdocFieldLevelRel) {
		_vdocFieldLevelRel = vdocFieldLevelRel;
	}

	@Override
	public Class<?> getModelClass() {
		return vdocFieldLevelRel.class;
	}

	@Override
	public String getModelClassName() {
		return vdocFieldLevelRel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fieldId", getFieldId());
		attributes.put("levelId", getLevelId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String fieldId = (String)attributes.get("fieldId");

		if (fieldId != null) {
			setFieldId(fieldId);
		}

		String levelId = (String)attributes.get("levelId");

		if (levelId != null) {
			setLevelId(levelId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vdocFieldLevelRel.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vdocFieldLevelRel.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vdocFieldLevelRel.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vdocFieldLevelRel.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.vdocFieldLevelRel> toCacheModel() {
		return _vdocFieldLevelRel.toCacheModel();
	}

	@Override
	public int compareTo(
		vn.gov.hoabinh.model.vdocFieldLevelRel vdocFieldLevelRel) {
		return _vdocFieldLevelRel.compareTo(vdocFieldLevelRel);
	}

	@Override
	public int hashCode() {
		return _vdocFieldLevelRel.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vdocFieldLevelRel.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new vdocFieldLevelRelWrapper((vdocFieldLevelRel)_vdocFieldLevelRel.clone());
	}

	/**
	* Returns the field ID of this vdoc field level rel.
	*
	* @return the field ID of this vdoc field level rel
	*/
	@Override
	public java.lang.String getFieldId() {
		return _vdocFieldLevelRel.getFieldId();
	}

	/**
	* Returns the level ID of this vdoc field level rel.
	*
	* @return the level ID of this vdoc field level rel
	*/
	@Override
	public java.lang.String getLevelId() {
		return _vdocFieldLevelRel.getLevelId();
	}

	@Override
	public java.lang.String toString() {
		return _vdocFieldLevelRel.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vdocFieldLevelRel.toXmlString();
	}

	@Override
	public vn.gov.hoabinh.model.vdocFieldLevelRel toEscapedModel() {
		return new vdocFieldLevelRelWrapper(_vdocFieldLevelRel.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.vdocFieldLevelRel toUnescapedModel() {
		return new vdocFieldLevelRelWrapper(_vdocFieldLevelRel.toUnescapedModel());
	}

	/**
	* Returns the primary key of this vdoc field level rel.
	*
	* @return the primary key of this vdoc field level rel
	*/
	@Override
	public vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK getPrimaryKey() {
		return _vdocFieldLevelRel.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vdocFieldLevelRel.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vdocFieldLevelRel.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vdocFieldLevelRel.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vdocFieldLevelRel.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vdocFieldLevelRel.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the field ID of this vdoc field level rel.
	*
	* @param fieldId the field ID of this vdoc field level rel
	*/
	@Override
	public void setFieldId(java.lang.String fieldId) {
		_vdocFieldLevelRel.setFieldId(fieldId);
	}

	/**
	* Sets the level ID of this vdoc field level rel.
	*
	* @param levelId the level ID of this vdoc field level rel
	*/
	@Override
	public void setLevelId(java.lang.String levelId) {
		_vdocFieldLevelRel.setLevelId(levelId);
	}

	@Override
	public void setNew(boolean n) {
		_vdocFieldLevelRel.setNew(n);
	}

	/**
	* Sets the primary key of this vdoc field level rel.
	*
	* @param primaryKey the primary key of this vdoc field level rel
	*/
	@Override
	public void setPrimaryKey(
		vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK primaryKey) {
		_vdocFieldLevelRel.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vdocFieldLevelRel.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof vdocFieldLevelRelWrapper)) {
			return false;
		}

		vdocFieldLevelRelWrapper vdocFieldLevelRelWrapper = (vdocFieldLevelRelWrapper)obj;

		if (Objects.equals(_vdocFieldLevelRel,
					vdocFieldLevelRelWrapper._vdocFieldLevelRel)) {
			return true;
		}

		return false;
	}

	@Override
	public vdocFieldLevelRel getWrappedModel() {
		return _vdocFieldLevelRel;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vdocFieldLevelRel.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vdocFieldLevelRel.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vdocFieldLevelRel.resetOriginalValues();
	}

	private final vdocFieldLevelRel _vdocFieldLevelRel;
}