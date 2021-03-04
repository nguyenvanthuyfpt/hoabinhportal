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
 * This class is a wrapper for {@link VLegalDURel}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDURel
 * @generated
 */
@ProviderType
public class VLegalDURelWrapper implements VLegalDURel,
	ModelWrapper<VLegalDURel> {
	public VLegalDURelWrapper(VLegalDURel vLegalDURel) {
		_vLegalDURel = vLegalDURel;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalDURel.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalDURel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("departmentId", getDepartmentId());
		attributes.put("userid", getUserid());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long departmentId = (Long)attributes.get("departmentId");

		if (departmentId != null) {
			setDepartmentId(departmentId);
		}

		Long userid = (Long)attributes.get("userid");

		if (userid != null) {
			setUserid(userid);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalDURel.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalDURel.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vLegalDURel.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalDURel.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalDURel> toCacheModel() {
		return _vLegalDURel.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VLegalDURel vLegalDURel) {
		return _vLegalDURel.compareTo(vLegalDURel);
	}

	@Override
	public int hashCode() {
		return _vLegalDURel.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalDURel.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalDURelWrapper((VLegalDURel)_vLegalDURel.clone());
	}

	@Override
	public java.lang.String toString() {
		return _vLegalDURel.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalDURel.toXmlString();
	}

	/**
	* Returns the department ID of this v legal d u rel.
	*
	* @return the department ID of this v legal d u rel
	*/
	@Override
	public long getDepartmentId() {
		return _vLegalDURel.getDepartmentId();
	}

	/**
	* Returns the userid of this v legal d u rel.
	*
	* @return the userid of this v legal d u rel
	*/
	@Override
	public long getUserid() {
		return _vLegalDURel.getUserid();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDURel toEscapedModel() {
		return new VLegalDURelWrapper(_vLegalDURel.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDURel toUnescapedModel() {
		return new VLegalDURelWrapper(_vLegalDURel.toUnescapedModel());
	}

	/**
	* Returns the primary key of this v legal d u rel.
	*
	* @return the primary key of this v legal d u rel
	*/
	@Override
	public vn.gov.hoabinh.service.persistence.VLegalDURelPK getPrimaryKey() {
		return _vLegalDURel.getPrimaryKey();
	}

	@Override
	public void persist() {
		_vLegalDURel.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalDURel.setCachedModel(cachedModel);
	}

	/**
	* Sets the department ID of this v legal d u rel.
	*
	* @param departmentId the department ID of this v legal d u rel
	*/
	@Override
	public void setDepartmentId(long departmentId) {
		_vLegalDURel.setDepartmentId(departmentId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalDURel.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalDURel.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalDURel.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalDURel.setNew(n);
	}

	/**
	* Sets the primary key of this v legal d u rel.
	*
	* @param primaryKey the primary key of this v legal d u rel
	*/
	@Override
	public void setPrimaryKey(
		vn.gov.hoabinh.service.persistence.VLegalDURelPK primaryKey) {
		_vLegalDURel.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalDURel.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the userid of this v legal d u rel.
	*
	* @param userid the userid of this v legal d u rel
	*/
	@Override
	public void setUserid(long userid) {
		_vLegalDURel.setUserid(userid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalDURelWrapper)) {
			return false;
		}

		VLegalDURelWrapper vLegalDURelWrapper = (VLegalDURelWrapper)obj;

		if (Objects.equals(_vLegalDURel, vLegalDURelWrapper._vLegalDURel)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalDURel getWrappedModel() {
		return _vLegalDURel;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalDURel.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalDURel.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalDURel.resetOriginalValues();
	}

	private final VLegalDURel _vLegalDURel;
}