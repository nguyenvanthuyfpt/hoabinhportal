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
public class VLegalSuggestDocumentSoap implements Serializable {
	public static VLegalSuggestDocumentSoap toSoapModel(
		VLegalSuggestDocument model) {
		VLegalSuggestDocumentSoap soapModel = new VLegalSuggestDocumentSoap();

		soapModel.setSugId(model.getSugId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedByUser(model.getModifiedByUser());
		soapModel.setApproved(model.getApproved());
		soapModel.setApprovedByUser(model.getApprovedByUser());
		soapModel.setApprovedDate(model.getApprovedDate());
		soapModel.setTitle(model.getTitle());
		soapModel.setContent(model.getContent());
		soapModel.setLanguage(model.getLanguage());
		soapModel.setVisitorName(model.getVisitorName());
		soapModel.setVisitorEmail(model.getVisitorEmail());
		soapModel.setVisitorTel(model.getVisitorTel());
		soapModel.setVisitorAddress(model.getVisitorAddress());
		soapModel.setDraftId(model.getDraftId());
		soapModel.setHasAttachment(model.getHasAttachment());

		return soapModel;
	}

	public static VLegalSuggestDocumentSoap[] toSoapModels(
		VLegalSuggestDocument[] models) {
		VLegalSuggestDocumentSoap[] soapModels = new VLegalSuggestDocumentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VLegalSuggestDocumentSoap[][] toSoapModels(
		VLegalSuggestDocument[][] models) {
		VLegalSuggestDocumentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VLegalSuggestDocumentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VLegalSuggestDocumentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VLegalSuggestDocumentSoap[] toSoapModels(
		List<VLegalSuggestDocument> models) {
		List<VLegalSuggestDocumentSoap> soapModels = new ArrayList<VLegalSuggestDocumentSoap>(models.size());

		for (VLegalSuggestDocument model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VLegalSuggestDocumentSoap[soapModels.size()]);
	}

	public VLegalSuggestDocumentSoap() {
	}

	public String getPrimaryKey() {
		return _sugId;
	}

	public void setPrimaryKey(String pk) {
		setSugId(pk);
	}

	public String getSugId() {
		return _sugId;
	}

	public void setSugId(String sugId) {
		_sugId = sugId;
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

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getModifiedByUser() {
		return _modifiedByUser;
	}

	public void setModifiedByUser(long modifiedByUser) {
		_modifiedByUser = modifiedByUser;
	}

	public boolean getApproved() {
		return _approved;
	}

	public boolean isApproved() {
		return _approved;
	}

	public void setApproved(boolean approved) {
		_approved = approved;
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

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public String getLanguage() {
		return _language;
	}

	public void setLanguage(String language) {
		_language = language;
	}

	public String getVisitorName() {
		return _visitorName;
	}

	public void setVisitorName(String visitorName) {
		_visitorName = visitorName;
	}

	public String getVisitorEmail() {
		return _visitorEmail;
	}

	public void setVisitorEmail(String visitorEmail) {
		_visitorEmail = visitorEmail;
	}

	public String getVisitorTel() {
		return _visitorTel;
	}

	public void setVisitorTel(String visitorTel) {
		_visitorTel = visitorTel;
	}

	public String getVisitorAddress() {
		return _visitorAddress;
	}

	public void setVisitorAddress(String visitorAddress) {
		_visitorAddress = visitorAddress;
	}

	public String getDraftId() {
		return _draftId;
	}

	public void setDraftId(String draftId) {
		_draftId = draftId;
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

	private String _sugId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private Date _createdDate;
	private Date _modifiedDate;
	private long _modifiedByUser;
	private boolean _approved;
	private long _approvedByUser;
	private Date _approvedDate;
	private String _title;
	private String _content;
	private String _language;
	private String _visitorName;
	private String _visitorEmail;
	private String _visitorTel;
	private String _visitorAddress;
	private String _draftId;
	private boolean _hasAttachment;
}