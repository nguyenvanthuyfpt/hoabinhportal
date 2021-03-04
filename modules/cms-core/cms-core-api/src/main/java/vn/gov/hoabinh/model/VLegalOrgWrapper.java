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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VLegalOrg}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalOrg
 * @generated
 */
@ProviderType
public class VLegalOrgWrapper implements VLegalOrg, ModelWrapper<VLegalOrg> {
	public VLegalOrgWrapper(VLegalOrg vLegalOrg) {
		_vLegalOrg = vLegalOrg;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalOrg.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalOrg.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("orgId", getOrgId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("parentId", getParentId());
		attributes.put("language", getLanguage());
		attributes.put("statusOrg", getStatusOrg());
		attributes.put("rssable", getRssable());
		attributes.put("position", getPosition());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String orgId = (String)attributes.get("orgId");

		if (orgId != null) {
			setOrgId(orgId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long createdByUser = (Long)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Long modifiedByUser = (Long)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String parentId = (String)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Boolean statusOrg = (Boolean)attributes.get("statusOrg");

		if (statusOrg != null) {
			setStatusOrg(statusOrg);
		}

		Boolean rssable = (Boolean)attributes.get("rssable");

		if (rssable != null) {
			setRssable(rssable);
		}

		Integer position = (Integer)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}
	}

	/**
	* Returns the rssable of this v legal org.
	*
	* @return the rssable of this v legal org
	*/
	@Override
	public boolean getRssable() {
		return _vLegalOrg.getRssable();
	}

	/**
	* Returns the status org of this v legal org.
	*
	* @return the status org of this v legal org
	*/
	@Override
	public boolean getStatusOrg() {
		return _vLegalOrg.getStatusOrg();
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalOrg.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalOrg.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vLegalOrg.isNew();
	}

	/**
	* Returns <code>true</code> if this v legal org is rssable.
	*
	* @return <code>true</code> if this v legal org is rssable; <code>false</code> otherwise
	*/
	@Override
	public boolean isRssable() {
		return _vLegalOrg.isRssable();
	}

	/**
	* Returns <code>true</code> if this v legal org is status org.
	*
	* @return <code>true</code> if this v legal org is status org; <code>false</code> otherwise
	*/
	@Override
	public boolean isStatusOrg() {
		return _vLegalOrg.isStatusOrg();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalOrg.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalOrg> toCacheModel() {
		return _vLegalOrg.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VLegalOrg vLegalOrg) {
		return _vLegalOrg.compareTo(vLegalOrg);
	}

	/**
	* Returns the position of this v legal org.
	*
	* @return the position of this v legal org
	*/
	@Override
	public int getPosition() {
		return _vLegalOrg.getPosition();
	}

	@Override
	public int hashCode() {
		return _vLegalOrg.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalOrg.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalOrgWrapper((VLegalOrg)_vLegalOrg.clone());
	}

	/**
	* Returns the description of this v legal org.
	*
	* @return the description of this v legal org
	*/
	@Override
	public java.lang.String getDescription() {
		return _vLegalOrg.getDescription();
	}

	/**
	* Returns the language of this v legal org.
	*
	* @return the language of this v legal org
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vLegalOrg.getLanguage();
	}

	/**
	* Returns the name of this v legal org.
	*
	* @return the name of this v legal org
	*/
	@Override
	public java.lang.String getName() {
		return _vLegalOrg.getName();
	}

	/**
	* Returns the org ID of this v legal org.
	*
	* @return the org ID of this v legal org
	*/
	@Override
	public java.lang.String getOrgId() {
		return _vLegalOrg.getOrgId();
	}

	/**
	* Returns the parent ID of this v legal org.
	*
	* @return the parent ID of this v legal org
	*/
	@Override
	public java.lang.String getParentId() {
		return _vLegalOrg.getParentId();
	}

	/**
	* Returns the primary key of this v legal org.
	*
	* @return the primary key of this v legal org
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vLegalOrg.getPrimaryKey();
	}

	/**
	* Returns the user uuid of this v legal org.
	*
	* @return the user uuid of this v legal org
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vLegalOrg.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalOrg.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalOrg.toXmlString();
	}

	/**
	* Returns the created date of this v legal org.
	*
	* @return the created date of this v legal org
	*/
	@Override
	public Date getCreatedDate() {
		return _vLegalOrg.getCreatedDate();
	}

	/**
	* Returns the modified date of this v legal org.
	*
	* @return the modified date of this v legal org
	*/
	@Override
	public Date getModifiedDate() {
		return _vLegalOrg.getModifiedDate();
	}

	/**
	* Returns the company ID of this v legal org.
	*
	* @return the company ID of this v legal org
	*/
	@Override
	public long getCompanyId() {
		return _vLegalOrg.getCompanyId();
	}

	/**
	* Returns the created by user of this v legal org.
	*
	* @return the created by user of this v legal org
	*/
	@Override
	public long getCreatedByUser() {
		return _vLegalOrg.getCreatedByUser();
	}

	/**
	* Returns the group ID of this v legal org.
	*
	* @return the group ID of this v legal org
	*/
	@Override
	public long getGroupId() {
		return _vLegalOrg.getGroupId();
	}

	/**
	* Returns the modified by user of this v legal org.
	*
	* @return the modified by user of this v legal org
	*/
	@Override
	public long getModifiedByUser() {
		return _vLegalOrg.getModifiedByUser();
	}

	/**
	* Returns the user ID of this v legal org.
	*
	* @return the user ID of this v legal org
	*/
	@Override
	public long getUserId() {
		return _vLegalOrg.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalOrg toEscapedModel() {
		return new VLegalOrgWrapper(_vLegalOrg.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalOrg toUnescapedModel() {
		return new VLegalOrgWrapper(_vLegalOrg.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vLegalOrg.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalOrg.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this v legal org.
	*
	* @param companyId the company ID of this v legal org
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vLegalOrg.setCompanyId(companyId);
	}

	/**
	* Sets the created by user of this v legal org.
	*
	* @param createdByUser the created by user of this v legal org
	*/
	@Override
	public void setCreatedByUser(long createdByUser) {
		_vLegalOrg.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this v legal org.
	*
	* @param createdDate the created date of this v legal org
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vLegalOrg.setCreatedDate(createdDate);
	}

	/**
	* Sets the description of this v legal org.
	*
	* @param description the description of this v legal org
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vLegalOrg.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalOrg.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalOrg.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalOrg.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this v legal org.
	*
	* @param groupId the group ID of this v legal org
	*/
	@Override
	public void setGroupId(long groupId) {
		_vLegalOrg.setGroupId(groupId);
	}

	/**
	* Sets the language of this v legal org.
	*
	* @param language the language of this v legal org
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vLegalOrg.setLanguage(language);
	}

	/**
	* Sets the modified by user of this v legal org.
	*
	* @param modifiedByUser the modified by user of this v legal org
	*/
	@Override
	public void setModifiedByUser(long modifiedByUser) {
		_vLegalOrg.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this v legal org.
	*
	* @param modifiedDate the modified date of this v legal org
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vLegalOrg.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this v legal org.
	*
	* @param name the name of this v legal org
	*/
	@Override
	public void setName(java.lang.String name) {
		_vLegalOrg.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalOrg.setNew(n);
	}

	/**
	* Sets the org ID of this v legal org.
	*
	* @param orgId the org ID of this v legal org
	*/
	@Override
	public void setOrgId(java.lang.String orgId) {
		_vLegalOrg.setOrgId(orgId);
	}

	/**
	* Sets the parent ID of this v legal org.
	*
	* @param parentId the parent ID of this v legal org
	*/
	@Override
	public void setParentId(java.lang.String parentId) {
		_vLegalOrg.setParentId(parentId);
	}

	/**
	* Sets the position of this v legal org.
	*
	* @param position the position of this v legal org
	*/
	@Override
	public void setPosition(int position) {
		_vLegalOrg.setPosition(position);
	}

	/**
	* Sets the primary key of this v legal org.
	*
	* @param primaryKey the primary key of this v legal org
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vLegalOrg.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalOrg.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this v legal org is rssable.
	*
	* @param rssable the rssable of this v legal org
	*/
	@Override
	public void setRssable(boolean rssable) {
		_vLegalOrg.setRssable(rssable);
	}

	/**
	* Sets whether this v legal org is status org.
	*
	* @param statusOrg the status org of this v legal org
	*/
	@Override
	public void setStatusOrg(boolean statusOrg) {
		_vLegalOrg.setStatusOrg(statusOrg);
	}

	/**
	* Sets the user ID of this v legal org.
	*
	* @param userId the user ID of this v legal org
	*/
	@Override
	public void setUserId(long userId) {
		_vLegalOrg.setUserId(userId);
	}

	/**
	* Sets the user uuid of this v legal org.
	*
	* @param userUuid the user uuid of this v legal org
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vLegalOrg.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalOrgWrapper)) {
			return false;
		}

		VLegalOrgWrapper vLegalOrgWrapper = (VLegalOrgWrapper)obj;

		if (Objects.equals(_vLegalOrg, vLegalOrgWrapper._vLegalOrg)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalOrg getWrappedModel() {
		return _vLegalOrg;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalOrg.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalOrg.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalOrg.resetOriginalValues();
	}

	private final VLegalOrg _vLegalOrg;
}