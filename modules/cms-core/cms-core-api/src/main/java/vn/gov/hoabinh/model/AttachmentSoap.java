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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class AttachmentSoap implements Serializable {
	public static AttachmentSoap toSoapModel(Attachment model) {
		AttachmentSoap soapModel = new AttachmentSoap();

		soapModel.setAttachmentId(model.getAttachmentId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setEntryId(model.getEntryId());
		soapModel.setEntryClass(model.getEntryClass());
		soapModel.setFileEntryId(model.getFileEntryId());
		soapModel.setFolderId(model.getFolderId());
		soapModel.setFileName(model.getFileName());
		soapModel.setImageId(model.getImageId());
		soapModel.setExtension(model.getExtension());

		return soapModel;
	}

	public static AttachmentSoap[] toSoapModels(Attachment[] models) {
		AttachmentSoap[] soapModels = new AttachmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AttachmentSoap[][] toSoapModels(Attachment[][] models) {
		AttachmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AttachmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AttachmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AttachmentSoap[] toSoapModels(List<Attachment> models) {
		List<AttachmentSoap> soapModels = new ArrayList<AttachmentSoap>(models.size());

		for (Attachment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AttachmentSoap[soapModels.size()]);
	}

	public AttachmentSoap() {
	}

	public long getPrimaryKey() {
		return _attachmentId;
	}

	public void setPrimaryKey(long pk) {
		setAttachmentId(pk);
	}

	public long getAttachmentId() {
		return _attachmentId;
	}

	public void setAttachmentId(long attachmentId) {
		_attachmentId = attachmentId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getEntryId() {
		return _entryId;
	}

	public void setEntryId(long entryId) {
		_entryId = entryId;
	}

	public String getEntryClass() {
		return _entryClass;
	}

	public void setEntryClass(String entryClass) {
		_entryClass = entryClass;
	}

	public long getFileEntryId() {
		return _fileEntryId;
	}

	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;
	}

	public long getFolderId() {
		return _folderId;
	}

	public void setFolderId(long folderId) {
		_folderId = folderId;
	}

	public String getFileName() {
		return _fileName;
	}

	public void setFileName(String fileName) {
		_fileName = fileName;
	}

	public long getImageId() {
		return _imageId;
	}

	public void setImageId(long imageId) {
		_imageId = imageId;
	}

	public String getExtension() {
		return _extension;
	}

	public void setExtension(String extension) {
		_extension = extension;
	}

	private long _attachmentId;
	private long _groupId;
	private long _companyId;
	private long _entryId;
	private String _entryClass;
	private long _fileEntryId;
	private long _folderId;
	private String _fileName;
	private long _imageId;
	private String _extension;
}