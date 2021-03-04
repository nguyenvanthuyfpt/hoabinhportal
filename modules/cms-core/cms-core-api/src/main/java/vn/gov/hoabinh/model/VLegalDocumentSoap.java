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
public class VLegalDocumentSoap implements Serializable {
	public static VLegalDocumentSoap toSoapModel(VLegalDocument model) {
		VLegalDocumentSoap soapModel = new VLegalDocumentSoap();

		soapModel.setDocId(model.getDocId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreatedByUser(model.getCreatedByUser());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedByUser(model.getModifiedByUser());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setApprovedByUser(model.getApprovedByUser());
		soapModel.setApprovedDate(model.getApprovedDate());
		soapModel.setForwardedByUser(model.getForwardedByUser());
		soapModel.setForwardedDate(model.getForwardedDate());
		soapModel.setPublishedByUser(model.getPublishedByUser());
		soapModel.setPublishedDate(model.getPublishedDate());
		soapModel.setSymbol(model.getSymbol());
		soapModel.setNum(model.getNum());
		soapModel.setPromulDate(model.getPromulDate());
		soapModel.setEffectivedDate(model.getEffectivedDate());
		soapModel.setExpiredDate(model.getExpiredDate());
		soapModel.setReplaceDoc(model.getReplaceDoc());
		soapModel.setSummary(model.getSummary());
		soapModel.setContent(model.getContent());
		soapModel.setLanguage(model.getLanguage());
		soapModel.setUserHit(model.getUserHit());
		soapModel.setStatusDoc(model.getStatusDoc());
		soapModel.setHasAttachment(model.getHasAttachment());
		soapModel.setTypeDocId(model.getTypeDocId());
		soapModel.setFieldId(model.getFieldId());
		soapModel.setOrgId(model.getOrgId());
		soapModel.setOrgRels(model.getOrgRels());
		soapModel.setSignerRels(model.getSignerRels());
		soapModel.setFieldRels(model.getFieldRels());
		soapModel.setNumRels(model.getNumRels());
		soapModel.setDocCode(model.getDocCode());
		soapModel.setDepartmentRels(model.getDepartmentRels());

		return soapModel;
	}

	public static VLegalDocumentSoap[] toSoapModels(VLegalDocument[] models) {
		VLegalDocumentSoap[] soapModels = new VLegalDocumentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VLegalDocumentSoap[][] toSoapModels(VLegalDocument[][] models) {
		VLegalDocumentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VLegalDocumentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VLegalDocumentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VLegalDocumentSoap[] toSoapModels(List<VLegalDocument> models) {
		List<VLegalDocumentSoap> soapModels = new ArrayList<VLegalDocumentSoap>(models.size());

		for (VLegalDocument model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VLegalDocumentSoap[soapModels.size()]);
	}

	public VLegalDocumentSoap() {
	}

	public String getPrimaryKey() {
		return _docId;
	}

	public void setPrimaryKey(String pk) {
		setDocId(pk);
	}

	public String getDocId() {
		return _docId;
	}

	public void setDocId(String docId) {
		_docId = docId;
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

	public long getForwardedByUser() {
		return _forwardedByUser;
	}

	public void setForwardedByUser(long forwardedByUser) {
		_forwardedByUser = forwardedByUser;
	}

	public Date getForwardedDate() {
		return _forwardedDate;
	}

	public void setForwardedDate(Date forwardedDate) {
		_forwardedDate = forwardedDate;
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

	public String getSymbol() {
		return _symbol;
	}

	public void setSymbol(String symbol) {
		_symbol = symbol;
	}

	public String getNum() {
		return _num;
	}

	public void setNum(String num) {
		_num = num;
	}

	public Date getPromulDate() {
		return _promulDate;
	}

	public void setPromulDate(Date promulDate) {
		_promulDate = promulDate;
	}

	public Date getEffectivedDate() {
		return _effectivedDate;
	}

	public void setEffectivedDate(Date effectivedDate) {
		_effectivedDate = effectivedDate;
	}

	public Date getExpiredDate() {
		return _expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		_expiredDate = expiredDate;
	}

	public String getReplaceDoc() {
		return _replaceDoc;
	}

	public void setReplaceDoc(String replaceDoc) {
		_replaceDoc = replaceDoc;
	}

	public String getSummary() {
		return _summary;
	}

	public void setSummary(String summary) {
		_summary = summary;
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

	public int getUserHit() {
		return _userHit;
	}

	public void setUserHit(int userHit) {
		_userHit = userHit;
	}

	public int getStatusDoc() {
		return _statusDoc;
	}

	public void setStatusDoc(int statusDoc) {
		_statusDoc = statusDoc;
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

	public String getTypeDocId() {
		return _typeDocId;
	}

	public void setTypeDocId(String typeDocId) {
		_typeDocId = typeDocId;
	}

	public String getFieldId() {
		return _fieldId;
	}

	public void setFieldId(String fieldId) {
		_fieldId = fieldId;
	}

	public String getOrgId() {
		return _orgId;
	}

	public void setOrgId(String orgId) {
		_orgId = orgId;
	}

	public String getOrgRels() {
		return _orgRels;
	}

	public void setOrgRels(String orgRels) {
		_orgRels = orgRels;
	}

	public String getSignerRels() {
		return _signerRels;
	}

	public void setSignerRels(String signerRels) {
		_signerRels = signerRels;
	}

	public String getFieldRels() {
		return _fieldRels;
	}

	public void setFieldRels(String fieldRels) {
		_fieldRels = fieldRels;
	}

	public String getNumRels() {
		return _numRels;
	}

	public void setNumRels(String numRels) {
		_numRels = numRels;
	}

	public String getDocCode() {
		return _docCode;
	}

	public void setDocCode(String docCode) {
		_docCode = docCode;
	}

	public String getDepartmentRels() {
		return _departmentRels;
	}

	public void setDepartmentRels(String departmentRels) {
		_departmentRels = departmentRels;
	}

	private String _docId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private long _createdByUser;
	private Date _createdDate;
	private long _modifiedByUser;
	private Date _modifiedDate;
	private long _approvedByUser;
	private Date _approvedDate;
	private long _forwardedByUser;
	private Date _forwardedDate;
	private long _publishedByUser;
	private Date _publishedDate;
	private String _symbol;
	private String _num;
	private Date _promulDate;
	private Date _effectivedDate;
	private Date _expiredDate;
	private String _replaceDoc;
	private String _summary;
	private String _content;
	private String _language;
	private int _userHit;
	private int _statusDoc;
	private boolean _hasAttachment;
	private String _typeDocId;
	private String _fieldId;
	private String _orgId;
	private String _orgRels;
	private String _signerRels;
	private String _fieldRels;
	private String _numRels;
	private String _docCode;
	private String _departmentRels;
}