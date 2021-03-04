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
 * This class is a wrapper for {@link vdocDORel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocDORel
 * @generated
 */
@ProviderType
public class vdocDORelWrapper implements vdocDORel, ModelWrapper<vdocDORel> {
	public vdocDORelWrapper(vdocDORel vdocDORel) {
		_vdocDORel = vdocDORel;
	}

	@Override
	public Class<?> getModelClass() {
		return vdocDORel.class;
	}

	@Override
	public String getModelClassName() {
		return vdocDORel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("docId", getDocId());
		attributes.put("orgId", getOrgId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String docId = (String)attributes.get("docId");

		if (docId != null) {
			setDocId(docId);
		}

		String orgId = (String)attributes.get("orgId");

		if (orgId != null) {
			setOrgId(orgId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vdocDORel.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vdocDORel.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vdocDORel.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vdocDORel.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.vdocDORel> toCacheModel() {
		return _vdocDORel.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.vdocDORel vdocDORel) {
		return _vdocDORel.compareTo(vdocDORel);
	}

	@Override
	public int hashCode() {
		return _vdocDORel.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vdocDORel.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new vdocDORelWrapper((vdocDORel)_vdocDORel.clone());
	}

	/**
	* Returns the doc ID of this vdoc d o rel.
	*
	* @return the doc ID of this vdoc d o rel
	*/
	@Override
	public java.lang.String getDocId() {
		return _vdocDORel.getDocId();
	}

	/**
	* Returns the org ID of this vdoc d o rel.
	*
	* @return the org ID of this vdoc d o rel
	*/
	@Override
	public java.lang.String getOrgId() {
		return _vdocDORel.getOrgId();
	}

	@Override
	public java.lang.String toString() {
		return _vdocDORel.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vdocDORel.toXmlString();
	}

	@Override
	public vn.gov.hoabinh.model.vdocDORel toEscapedModel() {
		return new vdocDORelWrapper(_vdocDORel.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.vdocDORel toUnescapedModel() {
		return new vdocDORelWrapper(_vdocDORel.toUnescapedModel());
	}

	/**
	* Returns the primary key of this vdoc d o rel.
	*
	* @return the primary key of this vdoc d o rel
	*/
	@Override
	public vn.gov.hoabinh.service.persistence.vdocDORelPK getPrimaryKey() {
		return _vdocDORel.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vdocDORel.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vdocDORel.setCachedModel(cachedModel);
	}

	/**
	* Sets the doc ID of this vdoc d o rel.
	*
	* @param docId the doc ID of this vdoc d o rel
	*/
	@Override
	public void setDocId(java.lang.String docId) {
		_vdocDORel.setDocId(docId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vdocDORel.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vdocDORel.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vdocDORel.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_vdocDORel.setNew(n);
	}

	/**
	* Sets the org ID of this vdoc d o rel.
	*
	* @param orgId the org ID of this vdoc d o rel
	*/
	@Override
	public void setOrgId(java.lang.String orgId) {
		_vdocDORel.setOrgId(orgId);
	}

	/**
	* Sets the primary key of this vdoc d o rel.
	*
	* @param primaryKey the primary key of this vdoc d o rel
	*/
	@Override
	public void setPrimaryKey(
		vn.gov.hoabinh.service.persistence.vdocDORelPK primaryKey) {
		_vdocDORel.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vdocDORel.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof vdocDORelWrapper)) {
			return false;
		}

		vdocDORelWrapper vdocDORelWrapper = (vdocDORelWrapper)obj;

		if (Objects.equals(_vdocDORel, vdocDORelWrapper._vdocDORel)) {
			return true;
		}

		return false;
	}

	@Override
	public vdocDORel getWrappedModel() {
		return _vdocDORel;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vdocDORel.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vdocDORel.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vdocDORel.resetOriginalValues();
	}

	private final vdocDORel _vdocDORel;
}