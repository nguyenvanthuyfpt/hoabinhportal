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
 * This class is a wrapper for {@link VcmsThread}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsThread
 * @generated
 */
@ProviderType
public class VcmsThreadWrapper implements VcmsThread, ModelWrapper<VcmsThread> {
	public VcmsThreadWrapper(VcmsThread vcmsThread) {
		_vcmsThread = vcmsThread;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsThread.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsThread.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("threadId", getThreadId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("hasImage", getHasImage());
		attributes.put("image", getImage());
		attributes.put("language", getLanguage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String threadId = (String)attributes.get("threadId");

		if (threadId != null) {
			setThreadId(threadId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String createdByUser = (String)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String modifiedByUser = (String)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Boolean hasImage = (Boolean)attributes.get("hasImage");

		if (hasImage != null) {
			setHasImage(hasImage);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}
	}

	/**
	* Returns the has image of this vcms thread.
	*
	* @return the has image of this vcms thread
	*/
	@Override
	public boolean getHasImage() {
		return _vcmsThread.getHasImage();
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsThread.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsThread.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this vcms thread is has image.
	*
	* @return <code>true</code> if this vcms thread is has image; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasImage() {
		return _vcmsThread.isHasImage();
	}

	@Override
	public boolean isNew() {
		return _vcmsThread.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsThread.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsThread> toCacheModel() {
		return _vcmsThread.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VcmsThread vcmsThread) {
		return _vcmsThread.compareTo(vcmsThread);
	}

	@Override
	public int hashCode() {
		return _vcmsThread.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsThread.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsThreadWrapper((VcmsThread)_vcmsThread.clone());
	}

	/**
	* Returns the created by user of this vcms thread.
	*
	* @return the created by user of this vcms thread
	*/
	@Override
	public java.lang.String getCreatedByUser() {
		return _vcmsThread.getCreatedByUser();
	}

	/**
	* Returns the description of this vcms thread.
	*
	* @return the description of this vcms thread
	*/
	@Override
	public java.lang.String getDescription() {
		return _vcmsThread.getDescription();
	}

	/**
	* Returns the image of this vcms thread.
	*
	* @return the image of this vcms thread
	*/
	@Override
	public java.lang.String getImage() {
		return _vcmsThread.getImage();
	}

	/**
	* Returns the language of this vcms thread.
	*
	* @return the language of this vcms thread
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vcmsThread.getLanguage();
	}

	/**
	* Returns the modified by user of this vcms thread.
	*
	* @return the modified by user of this vcms thread
	*/
	@Override
	public java.lang.String getModifiedByUser() {
		return _vcmsThread.getModifiedByUser();
	}

	/**
	* Returns the primary key of this vcms thread.
	*
	* @return the primary key of this vcms thread
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vcmsThread.getPrimaryKey();
	}

	/**
	* Returns the thread ID of this vcms thread.
	*
	* @return the thread ID of this vcms thread
	*/
	@Override
	public java.lang.String getThreadId() {
		return _vcmsThread.getThreadId();
	}

	/**
	* Returns the title of this vcms thread.
	*
	* @return the title of this vcms thread
	*/
	@Override
	public java.lang.String getTitle() {
		return _vcmsThread.getTitle();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsThread.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsThread.toXmlString();
	}

	/**
	* Returns the created date of this vcms thread.
	*
	* @return the created date of this vcms thread
	*/
	@Override
	public Date getCreatedDate() {
		return _vcmsThread.getCreatedDate();
	}

	/**
	* Returns the modified date of this vcms thread.
	*
	* @return the modified date of this vcms thread
	*/
	@Override
	public Date getModifiedDate() {
		return _vcmsThread.getModifiedDate();
	}

	/**
	* Returns the company ID of this vcms thread.
	*
	* @return the company ID of this vcms thread
	*/
	@Override
	public long getCompanyId() {
		return _vcmsThread.getCompanyId();
	}

	/**
	* Returns the group ID of this vcms thread.
	*
	* @return the group ID of this vcms thread
	*/
	@Override
	public long getGroupId() {
		return _vcmsThread.getGroupId();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsThread toEscapedModel() {
		return new VcmsThreadWrapper(_vcmsThread.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsThread toUnescapedModel() {
		return new VcmsThreadWrapper(_vcmsThread.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vcmsThread.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsThread.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this vcms thread.
	*
	* @param companyId the company ID of this vcms thread
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vcmsThread.setCompanyId(companyId);
	}

	/**
	* Sets the created by user of this vcms thread.
	*
	* @param createdByUser the created by user of this vcms thread
	*/
	@Override
	public void setCreatedByUser(java.lang.String createdByUser) {
		_vcmsThread.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this vcms thread.
	*
	* @param createdDate the created date of this vcms thread
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vcmsThread.setCreatedDate(createdDate);
	}

	/**
	* Sets the description of this vcms thread.
	*
	* @param description the description of this vcms thread
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_vcmsThread.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsThread.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsThread.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsThread.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this vcms thread.
	*
	* @param groupId the group ID of this vcms thread
	*/
	@Override
	public void setGroupId(long groupId) {
		_vcmsThread.setGroupId(groupId);
	}

	/**
	* Sets whether this vcms thread is has image.
	*
	* @param hasImage the has image of this vcms thread
	*/
	@Override
	public void setHasImage(boolean hasImage) {
		_vcmsThread.setHasImage(hasImage);
	}

	/**
	* Sets the image of this vcms thread.
	*
	* @param image the image of this vcms thread
	*/
	@Override
	public void setImage(java.lang.String image) {
		_vcmsThread.setImage(image);
	}

	/**
	* Sets the language of this vcms thread.
	*
	* @param language the language of this vcms thread
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vcmsThread.setLanguage(language);
	}

	/**
	* Sets the modified by user of this vcms thread.
	*
	* @param modifiedByUser the modified by user of this vcms thread
	*/
	@Override
	public void setModifiedByUser(java.lang.String modifiedByUser) {
		_vcmsThread.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this vcms thread.
	*
	* @param modifiedDate the modified date of this vcms thread
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vcmsThread.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsThread.setNew(n);
	}

	/**
	* Sets the primary key of this vcms thread.
	*
	* @param primaryKey the primary key of this vcms thread
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vcmsThread.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsThread.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the thread ID of this vcms thread.
	*
	* @param threadId the thread ID of this vcms thread
	*/
	@Override
	public void setThreadId(java.lang.String threadId) {
		_vcmsThread.setThreadId(threadId);
	}

	/**
	* Sets the title of this vcms thread.
	*
	* @param title the title of this vcms thread
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_vcmsThread.setTitle(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsThreadWrapper)) {
			return false;
		}

		VcmsThreadWrapper vcmsThreadWrapper = (VcmsThreadWrapper)obj;

		if (Objects.equals(_vcmsThread, vcmsThreadWrapper._vcmsThread)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsThread getWrappedModel() {
		return _vcmsThread;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsThread.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsThread.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsThread.resetOriginalValues();
	}

	private final VcmsThread _vcmsThread;
}