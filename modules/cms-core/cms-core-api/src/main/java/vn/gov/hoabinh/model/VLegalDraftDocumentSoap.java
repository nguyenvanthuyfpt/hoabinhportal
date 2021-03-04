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
public class VLegalDraftDocumentSoap implements Serializable {
	public static VLegalDraftDocumentSoap toSoapModel(VLegalDraftDocument model) {
		VLegalDraftDocumentSoap soapModel = new VLegalDraftDocumentSoap();

		soapModel.setDraftId(model.getDraftId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreatedByUser(model.getCreatedByUser());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedByUser(model.getModifiedByUser());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setApprovedByUser(model.getApprovedByUser());
		soapModel.setApprovedDate(model.getApprovedDate());
		soapModel.setPublishedByUser(model.getPublishedByUser());
		soapModel.setPublishedDate(model.getPublishedDate());
		soapModel.setTitle(model.getTitle());
		soapModel.setExpiredDate(model.getExpiredDate());
		soapModel.setLanguage(model.getLanguage());
		soapModel.setContent(model.getContent());
		soapModel.setTypeId(model.getTypeId());
		soapModel.setFieldId(model.getFieldId());
		soapModel.setHasAttachment(model.getHasAttachment());
		soapModel.setDraftLevel(model.getDraftLevel());
		soapModel.setDocCode(model.getDocCode());
		soapModel.setStatusDraft(model.getStatusDraft());

		return soapModel;
	}

	public static VLegalDraftDocumentSoap[] toSoapModels(
		VLegalDraftDocument[] models) {
		VLegalDraftDocumentSoap[] soapModels = new VLegalDraftDocumentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VLegalDraftDocumentSoap[][] toSoapModels(
		VLegalDraftDocument[][] models) {
		VLegalDraftDocumentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VLegalDraftDocumentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VLegalDraftDocumentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VLegalDraftDocumentSoap[] toSoapModels(
		List<VLegalDraftDocument> models) {
		List<VLegalDraftDocumentSoap> soapModels = new ArrayList<VLegalDraftDocumentSoap>(models.size());

		for (VLegalDraftDocument model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VLegalDraftDocumentSoap[soapModels.size()]);
	}

	public VLegalDraftDocumentSoap() {
	}

	public String getPrimaryKey() {
		return _draftId;
	}

	public void setPrimaryKey(String pk) {
		setDraftId(pk);
	}

	public String getDraftId() {
		return _draftId;
	}

	public void setDraftId(String draftId) {
		_draftId = draftId;
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

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getCreatedByUser() {
		return _createdByUser;
	}

	public void setCreatedByUser(long createdByUser) {
		_createdByUser = createdByUser;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public long getModifiedByUser() {
		return _modifiedByUser;
	}

	public void setModifiedByUser(long modifiedByUser) {
		_modifiedByUser = modifiedByUser;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getApprovedByUser() {
		return _approvedByUser;
	}

	public void setApprovedByUser(long approvedByUser) {
		_approvedByUser = approvedByUser;
	}

	public Date getApprovedDate() {
		return _approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		_approvedDate = approvedDate;
	}

	public long getPublishedByUser() {
		return _publishedByUser;
	}

	public void setPublishedByUser(long publishedByUser) {
		_publishedByUser = publishedByUser;
	}

	public Date getPublishedDate() {
		return _publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		_publishedDate = publishedDate;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public Date getExpiredDate() {
		return _expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		_expiredDate = expiredDate;
	}

	public String getLanguage() {
		return _language;
	}

	public void setLanguage(String language) {
		_language = language;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public String getTypeId() {
		return _typeId;
	}

	public void setTypeId(String typeId) {
		_typeId = typeId;
	}

	public String getFieldId() {
		return _fieldId;
	}

	public void setFieldId(String fieldId) {
		_fieldId = fieldId;
	}

	public boolean getHasAttachment() {
		return _hasAttachment;
	}

	public boolean isHasAttachment() {
		return _hasAttachment;
	}

	public void setHasAttachment(boolean hasAttachment) {
		_hasAttachment = hasAttachment;
	}

	public int getDraftLevel() {
		return _draftLevel;
	}

	public void setDraftLevel(int draftLevel) {
		_draftLevel = draftLevel;
	}

	public String getDocCode() {
		return _docCode;
	}

	public void setDocCode(String docCode) {
		_docCode = docCode;
	}

	public int getStatusDraft() {
		return _statusDraft;
	}

	public void setStatusDraft(int statusDraft) {
		_statusDraft = statusDraft;
	}

	private String _draftId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private long _createdByUser;
	private Date _createdDate;
	private long _modifiedByUser;
	private Date _modifiedDate;
	private long _approvedByUser;
	private Date _approvedDate;
	private long _publishedByUser;
	private Date _publishedDate;
	private String _title;
	private Date _expiredDate;
	private String _language;
	private String _content;
	private String _typeId;
	private String _fieldId;
	private boolean _hasAttachment;
	private int _draftLevel;
	private String _docCode;
	private int _statusDraft;
}