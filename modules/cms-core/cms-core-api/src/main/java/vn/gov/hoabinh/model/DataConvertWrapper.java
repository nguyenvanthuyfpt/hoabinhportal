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
 * This class is a wrapper for {@link DataConvert}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DataConvert
 * @generated
 */
@ProviderType
public class DataConvertWrapper implements DataConvert,
	ModelWrapper<DataConvert> {
	public DataConvertWrapper(DataConvert dataConvert) {
		_dataConvert = dataConvert;
	}

	@Override
	public Class<?> getModelClass() {
		return DataConvert.class;
	}

	@Override
	public String getModelClassName() {
		return DataConvert.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("folderId", getFolderId());
		attributes.put("dataId", getDataId());
		attributes.put("groupId", getGroupId());
		attributes.put("fileEntryId", getFileEntryId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("fileName", getFileName());
		attributes.put("url", getUrl());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long folderId = (Long)attributes.get("folderId");

		if (folderId != null) {
			setFolderId(folderId);
		}

		String dataId = (String)attributes.get("dataId");

		if (dataId != null) {
			setDataId(dataId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String fileName = (String)attributes.get("fileName");

		if (fileName != null) {
			setFileName(fileName);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _dataConvert.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _dataConvert.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _dataConvert.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dataConvert.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.DataConvert> toCacheModel() {
		return _dataConvert.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.DataConvert dataConvert) {
		return _dataConvert.compareTo(dataConvert);
	}

	@Override
	public int hashCode() {
		return _dataConvert.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dataConvert.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DataConvertWrapper((DataConvert)_dataConvert.clone());
	}

	/**
	* Returns the data ID of this data convert.
	*
	* @return the data ID of this data convert
	*/
	@Override
	public java.lang.String getDataId() {
		return _dataConvert.getDataId();
	}

	/**
	* Returns the file name of this data convert.
	*
	* @return the file name of this data convert
	*/
	@Override
	public java.lang.String getFileName() {
		return _dataConvert.getFileName();
	}

	/**
	* Returns the url of this data convert.
	*
	* @return the url of this data convert
	*/
	@Override
	public java.lang.String getUrl() {
		return _dataConvert.getUrl();
	}

	@Override
	public java.lang.String toString() {
		return _dataConvert.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _dataConvert.toXmlString();
	}

	/**
	* Returns the created date of this data convert.
	*
	* @return the created date of this data convert
	*/
	@Override
	public Date getCreatedDate() {
		return _dataConvert.getCreatedDate();
	}

	/**
	* Returns the file entry ID of this data convert.
	*
	* @return the file entry ID of this data convert
	*/
	@Override
	public long getFileEntryId() {
		return _dataConvert.getFileEntryId();
	}

	/**
	* Returns the folder ID of this data convert.
	*
	* @return the folder ID of this data convert
	*/
	@Override
	public long getFolderId() {
		return _dataConvert.getFolderId();
	}

	/**
	* Returns the group ID of this data convert.
	*
	* @return the group ID of this data convert
	*/
	@Override
	public long getGroupId() {
		return _dataConvert.getGroupId();
	}

	/**
	* Returns the ID of this data convert.
	*
	* @return the ID of this data convert
	*/
	@Override
	public long getId() {
		return _dataConvert.getId();
	}

	/**
	* Returns the primary key of this data convert.
	*
	* @return the primary key of this data convert
	*/
	@Override
	public long getPrimaryKey() {
		return _dataConvert.getPrimaryKey();
	}

	@Override
	public vn.gov.hoabinh.model.DataConvert toEscapedModel() {
		return new DataConvertWrapper(_dataConvert.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.DataConvert toUnescapedModel() {
		return new DataConvertWrapper(_dataConvert.toUnescapedModel());
	}

	@Override
	public void persist() {
		_dataConvert.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dataConvert.setCachedModel(cachedModel);
	}

	/**
	* Sets the created date of this data convert.
	*
	* @param createdDate the created date of this data convert
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_dataConvert.setCreatedDate(createdDate);
	}

	/**
	* Sets the data ID of this data convert.
	*
	* @param dataId the data ID of this data convert
	*/
	@Override
	public void setDataId(java.lang.String dataId) {
		_dataConvert.setDataId(dataId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dataConvert.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dataConvert.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dataConvert.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the file entry ID of this data convert.
	*
	* @param fileEntryId the file entry ID of this data convert
	*/
	@Override
	public void setFileEntryId(long fileEntryId) {
		_dataConvert.setFileEntryId(fileEntryId);
	}

	/**
	* Sets the file name of this data convert.
	*
	* @param fileName the file name of this data convert
	*/
	@Override
	public void setFileName(java.lang.String fileName) {
		_dataConvert.setFileName(fileName);
	}

	/**
	* Sets the folder ID of this data convert.
	*
	* @param folderId the folder ID of this data convert
	*/
	@Override
	public void setFolderId(long folderId) {
		_dataConvert.setFolderId(folderId);
	}

	/**
	* Sets the group ID of this data convert.
	*
	* @param groupId the group ID of this data convert
	*/
	@Override
	public void setGroupId(long groupId) {
		_dataConvert.setGroupId(groupId);
	}

	/**
	* Sets the ID of this data convert.
	*
	* @param id the ID of this data convert
	*/
	@Override
	public void setId(long id) {
		_dataConvert.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_dataConvert.setNew(n);
	}

	/**
	* Sets the primary key of this data convert.
	*
	* @param primaryKey the primary key of this data convert
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dataConvert.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dataConvert.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the url of this data convert.
	*
	* @param url the url of this data convert
	*/
	@Override
	public void setUrl(java.lang.String url) {
		_dataConvert.setUrl(url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DataConvertWrapper)) {
			return false;
		}

		DataConvertWrapper dataConvertWrapper = (DataConvertWrapper)obj;

		if (Objects.equals(_dataConvert, dataConvertWrapper._dataConvert)) {
			return true;
		}

		return false;
	}

	@Override
	public DataConvert getWrappedModel() {
		return _dataConvert;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dataConvert.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dataConvert.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dataConvert.resetOriginalValues();
	}

	private final DataConvert _dataConvert;
}