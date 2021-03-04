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
 * This class is a wrapper for {@link Attachment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Attachment
 * @generated
 */
@ProviderType
public class AttachmentWrapper implements Attachment, ModelWrapper<Attachment> {
	public AttachmentWrapper(Attachment attachment) {
		_attachment = attachment;
	}

	@Override
	public Class<?> getModelClass() {
		return Attachment.class;
	}

	@Override
	public String getModelClassName() {
		return Attachment.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("attachmentId", getAttachmentId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("entryId", getEntryId());
		attributes.put("entryClass", getEntryClass());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("folderId", getFolderId());
		attributes.put("fileName", getFileName());
		attributes.put("imageId", getImageId());
		attributes.put("extension", getExtension());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attachmentId = (Long)attributes.get("attachmentId");

		if (attachmentId != null) {
			setAttachmentId(attachmentId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long entryId = (Long)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
		}

		String entryClass = (String)attributes.get("entryClass");

		if (entryClass != null) {
			setEntryClass(entryClass);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		Long folderId = (Long)attributes.get("folderId");

		if (folderId != null) {
			setFolderId(folderId);
		}

		String fileName = (String)attributes.get("fileName");

		if (fileName != null) {
			setFileName(fileName);
		}

		Long imageId = (Long)attributes.get("imageId");

		if (imageId != null) {
			setImageId(imageId);
		}

		String extension = (String)attributes.get("extension");

		if (extension != null) {
			setExtension(extension);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _attachment.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _attachment.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _attachment.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _attachment.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.Attachment> toCacheModel() {
		return _attachment.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.Attachment attachment) {
		return _attachment.compareTo(attachment);
	}

	@Override
	public int hashCode() {
		return _attachment.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _attachment.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AttachmentWrapper((Attachment)_attachment.clone());
	}

	/**
	* Returns the entry class of this attachment.
	*
	* @return the entry class of this attachment
	*/
	@Override
	public java.lang.String getEntryClass() {
		return _attachment.getEntryClass();
	}

	/**
	* Returns the extension of this attachment.
	*
	* @return the extension of this attachment
	*/
	@Override
	public java.lang.String getExtension() {
		return _attachment.getExtension();
	}

	/**
	* Returns the file name of this attachment.
	*
	* @return the file name of this attachment
	*/
	@Override
	public java.lang.String getFileName() {
		return _attachment.getFileName();
	}

	@Override
	public java.lang.String toString() {
		return _attachment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _attachment.toXmlString();
	}

	/**
	* Returns the attachment ID of this attachment.
	*
	* @return the attachment ID of this attachment
	*/
	@Override
	public long getAttachmentId() {
		return _attachment.getAttachmentId();
	}

	/**
	* Returns the company ID of this attachment.
	*
	* @return the company ID of this attachment
	*/
	@Override
	public long getCompanyId() {
		return _attachment.getCompanyId();
	}

	/**
	* Returns the entry ID of this attachment.
	*
	* @return the entry ID of this attachment
	*/
	@Override
	public long getEntryId() {
		return _attachment.getEntryId();
	}

	/**
	* Returns the file entry ID of this attachment.
	*
	* @return the file entry ID of this attachment
	*/
	@Override
	public long getFileEntryId() {
		return _attachment.getFileEntryId();
	}

	/**
	* Returns the folder ID of this attachment.
	*
	* @return the folder ID of this attachment
	*/
	@Override
	public long getFolderId() {
		return _attachment.getFolderId();
	}

	/**
	* Returns the group ID of this attachment.
	*
	* @return the group ID of this attachment
	*/
	@Override
	public long getGroupId() {
		return _attachment.getGroupId();
	}

	/**
	* Returns the image ID of this attachment.
	*
	* @return the image ID of this attachment
	*/
	@Override
	public long getImageId() {
		return _attachment.getImageId();
	}

	/**
	* Returns the primary key of this attachment.
	*
	* @return the primary key of this attachment
	*/
	@Override
	public long getPrimaryKey() {
		return _attachment.getPrimaryKey();
	}

	@Override
	public vn.gov.hoabinh.model.Attachment toEscapedModel() {
		return new AttachmentWrapper(_attachment.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.Attachment toUnescapedModel() {
		return new AttachmentWrapper(_attachment.toUnescapedModel());
	}

	@Override
	public void persist() {
		_attachment.persist();
	}

	/**
	* Sets the attachment ID of this attachment.
	*
	* @param attachmentId the attachment ID of this attachment
	*/
	@Override
	public void setAttachmentId(long attachmentId) {
		_attachment.setAttachmentId(attachmentId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_attachment.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this attachment.
	*
	* @param companyId the company ID of this attachment
	*/
	@Override
	public void setCompanyId(long companyId) {
		_attachment.setCompanyId(companyId);
	}

	/**
	* Sets the entry class of this attachment.
	*
	* @param entryClass the entry class of this attachment
	*/
	@Override
	public void setEntryClass(java.lang.String entryClass) {
		_attachment.setEntryClass(entryClass);
	}

	/**
	* Sets the entry ID of this attachment.
	*
	* @param entryId the entry ID of this attachment
	*/
	@Override
	public void setEntryId(long entryId) {
		_attachment.setEntryId(entryId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_attachment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_attachment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_attachment.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the extension of this attachment.
	*
	* @param extension the extension of this attachment
	*/
	@Override
	public void setExtension(java.lang.String extension) {
		_attachment.setExtension(extension);
	}

	/**
	* Sets the file entry ID of this attachment.
	*
	* @param fileEntryId the file entry ID of this attachment
	*/
	@Override
	public void setFileEntryId(long fileEntryId) {
		_attachment.setFileEntryId(fileEntryId);
	}

	/**
	* Sets the file name of this attachment.
	*
	* @param fileName the file name of this attachment
	*/
	@Override
	public void setFileName(java.lang.String fileName) {
		_attachment.setFileName(fileName);
	}

	/**
	* Sets the folder ID of this attachment.
	*
	* @param folderId the folder ID of this attachment
	*/
	@Override
	public void setFolderId(long folderId) {
		_attachment.setFolderId(folderId);
	}

	/**
	* Sets the group ID of this attachment.
	*
	* @param groupId the group ID of this attachment
	*/
	@Override
	public void setGroupId(long groupId) {
		_attachment.setGroupId(groupId);
	}

	/**
	* Sets the image ID of this attachment.
	*
	* @param imageId the image ID of this attachment
	*/
	@Override
	public void setImageId(long imageId) {
		_attachment.setImageId(imageId);
	}

	@Override
	public void setNew(boolean n) {
		_attachment.setNew(n);
	}

	/**
	* Sets the primary key of this attachment.
	*
	* @param primaryKey the primary key of this attachment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_attachment.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_attachment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AttachmentWrapper)) {
			return false;
		}

		AttachmentWrapper attachmentWrapper = (AttachmentWrapper)obj;

		if (Objects.equals(_attachment, attachmentWrapper._attachment)) {
			return true;
		}

		return false;
	}

	@Override
	public Attachment getWrappedModel() {
		return _attachment;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _attachment.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _attachment.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_attachment.resetOriginalValues();
	}

	private final Attachment _attachment;
}