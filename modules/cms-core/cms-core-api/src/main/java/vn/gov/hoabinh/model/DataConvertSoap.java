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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class DataConvertSoap implements Serializable {
	public static DataConvertSoap toSoapModel(DataConvert model) {
		DataConvertSoap soapModel = new DataConvertSoap();

		soapModel.setId(model.getId());
		soapModel.setFolderId(model.getFolderId());
		soapModel.setDataId(model.getDataId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setFileEntryId(model.getFileEntryId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setFileName(model.getFileName());
		soapModel.setUrl(model.getUrl());

		return soapModel;
	}

	public static DataConvertSoap[] toSoapModels(DataConvert[] models) {
		DataConvertSoap[] soapModels = new DataConvertSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DataConvertSoap[][] toSoapModels(DataConvert[][] models) {
		DataConvertSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DataConvertSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DataConvertSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DataConvertSoap[] toSoapModels(List<DataConvert> models) {
		List<DataConvertSoap> soapModels = new ArrayList<DataConvertSoap>(models.size());

		for (DataConvert model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DataConvertSoap[soapModels.size()]);
	}

	public DataConvertSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getFolderId() {
		return _folderId;
	}

	public void setFolderId(long folderId) {
		_folderId = folderId;
	}

	public String getDataId() {
		return _dataId;
	}

	public void setDataId(String dataId) {
		_dataId = dataId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getFileEntryId() {
		return _fileEntryId;
	}

	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public String getFileName() {
		return _fileName;
	}

	public void setFileName(String fileName) {
		_fileName = fileName;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	private long _id;
	private long _folderId;
	private String _dataId;
	private long _groupId;
	private long _fileEntryId;
	private Date _createdDate;
	private String _fileName;
	private String _url;
}