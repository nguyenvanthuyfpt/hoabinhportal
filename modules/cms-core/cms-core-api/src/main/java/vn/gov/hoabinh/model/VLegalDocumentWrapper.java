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
 * This class is a wrapper for {@link VLegalDocument}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDocument
 * @generated
 */
@ProviderType
public class VLegalDocumentWrapper implements VLegalDocument,
	ModelWrapper<VLegalDocument> {
	public VLegalDocumentWrapper(VLegalDocument vLegalDocument) {
		_vLegalDocument = vLegalDocument;
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalDocument.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalDocument.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("docId", getDocId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("approvedByUser", getApprovedByUser());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("forwardedByUser", getForwardedByUser());
		attributes.put("forwardedDate", getForwardedDate());
		attributes.put("publishedByUser", getPublishedByUser());
		attributes.put("publishedDate", getPublishedDate());
		attributes.put("symbol", getSymbol());
		attributes.put("num", getNum());
		attributes.put("promulDate", getPromulDate());
		attributes.put("effectivedDate", getEffectivedDate());
		attributes.put("expiredDate", getExpiredDate());
		attributes.put("replaceDoc", getReplaceDoc());
		attributes.put("summary", getSummary());
		attributes.put("content", getContent());
		attributes.put("language", getLanguage());
		attributes.put("userHit", getUserHit());
		attributes.put("statusDoc", getStatusDoc());
		attributes.put("hasAttachment", getHasAttachment());
		attributes.put("typeDocId", getTypeDocId());
		attributes.put("fieldId", getFieldId());
		attributes.put("orgId", getOrgId());
		attributes.put("orgRels", getOrgRels());
		attributes.put("signerRels", getSignerRels());
		attributes.put("fieldRels", getFieldRels());
		attributes.put("numRels", getNumRels());
		attributes.put("docCode", getDocCode());
		attributes.put("departmentRels", getDepartmentRels());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String docId = (String)attributes.get("docId");

		if (docId != null) {
			setDocId(docId);
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

		Long createdByUser = (Long)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long modifiedByUser = (Long)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long approvedByUser = (Long)attributes.get("approvedByUser");

		if (approvedByUser != null) {
			setApprovedByUser(approvedByUser);
		}

		Date approvedDate = (Date)attributes.get("approvedDate");

		if (approvedDate != null) {
			setApprovedDate(approvedDate);
		}

		Long forwardedByUser = (Long)attributes.get("forwardedByUser");

		if (forwardedByUser != null) {
			setForwardedByUser(forwardedByUser);
		}

		Date forwardedDate = (Date)attributes.get("forwardedDate");

		if (forwardedDate != null) {
			setForwardedDate(forwardedDate);
		}

		Long publishedByUser = (Long)attributes.get("publishedByUser");

		if (publishedByUser != null) {
			setPublishedByUser(publishedByUser);
		}

		Date publishedDate = (Date)attributes.get("publishedDate");

		if (publishedDate != null) {
			setPublishedDate(publishedDate);
		}

		String symbol = (String)attributes.get("symbol");

		if (symbol != null) {
			setSymbol(symbol);
		}

		String num = (String)attributes.get("num");

		if (num != null) {
			setNum(num);
		}

		Date promulDate = (Date)attributes.get("promulDate");

		if (promulDate != null) {
			setPromulDate(promulDate);
		}

		Date effectivedDate = (Date)attributes.get("effectivedDate");

		if (effectivedDate != null) {
			setEffectivedDate(effectivedDate);
		}

		Date expiredDate = (Date)attributes.get("expiredDate");

		if (expiredDate != null) {
			setExpiredDate(expiredDate);
		}

		String replaceDoc = (String)attributes.get("replaceDoc");

		if (replaceDoc != null) {
			setReplaceDoc(replaceDoc);
		}

		String summary = (String)attributes.get("summary");

		if (summary != null) {
			setSummary(summary);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Integer userHit = (Integer)attributes.get("userHit");

		if (userHit != null) {
			setUserHit(userHit);
		}

		Integer statusDoc = (Integer)attributes.get("statusDoc");

		if (statusDoc != null) {
			setStatusDoc(statusDoc);
		}

		Boolean hasAttachment = (Boolean)attributes.get("hasAttachment");

		if (hasAttachment != null) {
			setHasAttachment(hasAttachment);
		}

		String typeDocId = (String)attributes.get("typeDocId");

		if (typeDocId != null) {
			setTypeDocId(typeDocId);
		}

		String fieldId = (String)attributes.get("fieldId");

		if (fieldId != null) {
			setFieldId(fieldId);
		}

		String orgId = (String)attributes.get("orgId");

		if (orgId != null) {
			setOrgId(orgId);
		}

		String orgRels = (String)attributes.get("orgRels");

		if (orgRels != null) {
			setOrgRels(orgRels);
		}

		String signerRels = (String)attributes.get("signerRels");

		if (signerRels != null) {
			setSignerRels(signerRels);
		}

		String fieldRels = (String)attributes.get("fieldRels");

		if (fieldRels != null) {
			setFieldRels(fieldRels);
		}

		String numRels = (String)attributes.get("numRels");

		if (numRels != null) {
			setNumRels(numRels);
		}

		String docCode = (String)attributes.get("docCode");

		if (docCode != null) {
			setDocCode(docCode);
		}

		String departmentRels = (String)attributes.get("departmentRels");

		if (departmentRels != null) {
			setDepartmentRels(departmentRels);
		}
	}

	/**
	* Returns the has attachment of this v legal document.
	*
	* @return the has attachment of this v legal document
	*/
	@Override
	public boolean getHasAttachment() {
		return _vLegalDocument.getHasAttachment();
	}

	@Override
	public boolean isCachedModel() {
		return _vLegalDocument.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vLegalDocument.isEscapedModel();
	}

	@Override
	public boolean isExpired() {
		return _vLegalDocument.isExpired();
	}

	/**
	* Returns <code>true</code> if this v legal document is has attachment.
	*
	* @return <code>true</code> if this v legal document is has attachment; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasAttachment() {
		return _vLegalDocument.isHasAttachment();
	}

	@Override
	public boolean isNew() {
		return _vLegalDocument.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vLegalDocument.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VLegalDocument> toCacheModel() {
		return _vLegalDocument.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VLegalDocument vLegalDocument) {
		return _vLegalDocument.compareTo(vLegalDocument);
	}

	/**
	* Returns the status doc of this v legal document.
	*
	* @return the status doc of this v legal document
	*/
	@Override
	public int getStatusDoc() {
		return _vLegalDocument.getStatusDoc();
	}

	/**
	* Returns the user hit of this v legal document.
	*
	* @return the user hit of this v legal document
	*/
	@Override
	public int getUserHit() {
		return _vLegalDocument.getUserHit();
	}

	@Override
	public int hashCode() {
		return _vLegalDocument.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vLegalDocument.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VLegalDocumentWrapper((VLegalDocument)_vLegalDocument.clone());
	}

	/**
	* Returns the content of this v legal document.
	*
	* @return the content of this v legal document
	*/
	@Override
	public java.lang.String getContent() {
		return _vLegalDocument.getContent();
	}

	/**
	* Returns the department rels of this v legal document.
	*
	* @return the department rels of this v legal document
	*/
	@Override
	public java.lang.String getDepartmentRels() {
		return _vLegalDocument.getDepartmentRels();
	}

	/**
	* Returns the doc code of this v legal document.
	*
	* @return the doc code of this v legal document
	*/
	@Override
	public java.lang.String getDocCode() {
		return _vLegalDocument.getDocCode();
	}

	/**
	* Returns the doc ID of this v legal document.
	*
	* @return the doc ID of this v legal document
	*/
	@Override
	public java.lang.String getDocId() {
		return _vLegalDocument.getDocId();
	}

	/**
	* Returns the field ID of this v legal document.
	*
	* @return the field ID of this v legal document
	*/
	@Override
	public java.lang.String getFieldId() {
		return _vLegalDocument.getFieldId();
	}

	/**
	* Returns the field rels of this v legal document.
	*
	* @return the field rels of this v legal document
	*/
	@Override
	public java.lang.String getFieldRels() {
		return _vLegalDocument.getFieldRels();
	}

	/**
	* Returns the language of this v legal document.
	*
	* @return the language of this v legal document
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vLegalDocument.getLanguage();
	}

	/**
	* Returns the num of this v legal document.
	*
	* @return the num of this v legal document
	*/
	@Override
	public java.lang.String getNum() {
		return _vLegalDocument.getNum();
	}

	/**
	* Returns the num rels of this v legal document.
	*
	* @return the num rels of this v legal document
	*/
	@Override
	public java.lang.String getNumRels() {
		return _vLegalDocument.getNumRels();
	}

	/**
	* Returns the org ID of this v legal document.
	*
	* @return the org ID of this v legal document
	*/
	@Override
	public java.lang.String getOrgId() {
		return _vLegalDocument.getOrgId();
	}

	/**
	* Returns the org rels of this v legal document.
	*
	* @return the org rels of this v legal document
	*/
	@Override
	public java.lang.String getOrgRels() {
		return _vLegalDocument.getOrgRels();
	}

	/**
	* Returns the primary key of this v legal document.
	*
	* @return the primary key of this v legal document
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vLegalDocument.getPrimaryKey();
	}

	/**
	* Returns the replace doc of this v legal document.
	*
	* @return the replace doc of this v legal document
	*/
	@Override
	public java.lang.String getReplaceDoc() {
		return _vLegalDocument.getReplaceDoc();
	}

	/**
	* Returns the signer rels of this v legal document.
	*
	* @return the signer rels of this v legal document
	*/
	@Override
	public java.lang.String getSignerRels() {
		return _vLegalDocument.getSignerRels();
	}

	/**
	* Returns the summary of this v legal document.
	*
	* @return the summary of this v legal document
	*/
	@Override
	public java.lang.String getSummary() {
		return _vLegalDocument.getSummary();
	}

	/**
	* Returns the symbol of this v legal document.
	*
	* @return the symbol of this v legal document
	*/
	@Override
	public java.lang.String getSymbol() {
		return _vLegalDocument.getSymbol();
	}

	/**
	* Returns the type doc ID of this v legal document.
	*
	* @return the type doc ID of this v legal document
	*/
	@Override
	public java.lang.String getTypeDocId() {
		return _vLegalDocument.getTypeDocId();
	}

	/**
	* Returns the user uuid of this v legal document.
	*
	* @return the user uuid of this v legal document
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vLegalDocument.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vLegalDocument.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vLegalDocument.toXmlString();
	}

	/**
	* Returns the approved date of this v legal document.
	*
	* @return the approved date of this v legal document
	*/
	@Override
	public Date getApprovedDate() {
		return _vLegalDocument.getApprovedDate();
	}

	/**
	* Returns the created date of this v legal document.
	*
	* @return the created date of this v legal document
	*/
	@Override
	public Date getCreatedDate() {
		return _vLegalDocument.getCreatedDate();
	}

	/**
	* Returns the effectived date of this v legal document.
	*
	* @return the effectived date of this v legal document
	*/
	@Override
	public Date getEffectivedDate() {
		return _vLegalDocument.getEffectivedDate();
	}

	/**
	* Returns the expired date of this v legal document.
	*
	* @return the expired date of this v legal document
	*/
	@Override
	public Date getExpiredDate() {
		return _vLegalDocument.getExpiredDate();
	}

	/**
	* Returns the forwarded date of this v legal document.
	*
	* @return the forwarded date of this v legal document
	*/
	@Override
	public Date getForwardedDate() {
		return _vLegalDocument.getForwardedDate();
	}

	/**
	* Returns the modified date of this v legal document.
	*
	* @return the modified date of this v legal document
	*/
	@Override
	public Date getModifiedDate() {
		return _vLegalDocument.getModifiedDate();
	}

	/**
	* Returns the promul date of this v legal document.
	*
	* @return the promul date of this v legal document
	*/
	@Override
	public Date getPromulDate() {
		return _vLegalDocument.getPromulDate();
	}

	/**
	* Returns the published date of this v legal document.
	*
	* @return the published date of this v legal document
	*/
	@Override
	public Date getPublishedDate() {
		return _vLegalDocument.getPublishedDate();
	}

	/**
	* Returns the approved by user of this v legal document.
	*
	* @return the approved by user of this v legal document
	*/
	@Override
	public long getApprovedByUser() {
		return _vLegalDocument.getApprovedByUser();
	}

	/**
	* Returns the company ID of this v legal document.
	*
	* @return the company ID of this v legal document
	*/
	@Override
	public long getCompanyId() {
		return _vLegalDocument.getCompanyId();
	}

	/**
	* Returns the created by user of this v legal document.
	*
	* @return the created by user of this v legal document
	*/
	@Override
	public long getCreatedByUser() {
		return _vLegalDocument.getCreatedByUser();
	}

	/**
	* Returns the forwarded by user of this v legal document.
	*
	* @return the forwarded by user of this v legal document
	*/
	@Override
	public long getForwardedByUser() {
		return _vLegalDocument.getForwardedByUser();
	}

	/**
	* Returns the group ID of this v legal document.
	*
	* @return the group ID of this v legal document
	*/
	@Override
	public long getGroupId() {
		return _vLegalDocument.getGroupId();
	}

	/**
	* Returns the modified by user of this v legal document.
	*
	* @return the modified by user of this v legal document
	*/
	@Override
	public long getModifiedByUser() {
		return _vLegalDocument.getModifiedByUser();
	}

	/**
	* Returns the published by user of this v legal document.
	*
	* @return the published by user of this v legal document
	*/
	@Override
	public long getPublishedByUser() {
		return _vLegalDocument.getPublishedByUser();
	}

	/**
	* Returns the user ID of this v legal document.
	*
	* @return the user ID of this v legal document
	*/
	@Override
	public long getUserId() {
		return _vLegalDocument.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDocument toEscapedModel() {
		return new VLegalDocumentWrapper(_vLegalDocument.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VLegalDocument toUnescapedModel() {
		return new VLegalDocumentWrapper(_vLegalDocument.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vLegalDocument.persist();
	}

	/**
	* Sets the approved by user of this v legal document.
	*
	* @param approvedByUser the approved by user of this v legal document
	*/
	@Override
	public void setApprovedByUser(long approvedByUser) {
		_vLegalDocument.setApprovedByUser(approvedByUser);
	}

	/**
	* Sets the approved date of this v legal document.
	*
	* @param approvedDate the approved date of this v legal document
	*/
	@Override
	public void setApprovedDate(Date approvedDate) {
		_vLegalDocument.setApprovedDate(approvedDate);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vLegalDocument.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this v legal document.
	*
	* @param companyId the company ID of this v legal document
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vLegalDocument.setCompanyId(companyId);
	}

	/**
	* Sets the content of this v legal document.
	*
	* @param content the content of this v legal document
	*/
	@Override
	public void setContent(java.lang.String content) {
		_vLegalDocument.setContent(content);
	}

	/**
	* Sets the created by user of this v legal document.
	*
	* @param createdByUser the created by user of this v legal document
	*/
	@Override
	public void setCreatedByUser(long createdByUser) {
		_vLegalDocument.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this v legal document.
	*
	* @param createdDate the created date of this v legal document
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vLegalDocument.setCreatedDate(createdDate);
	}

	/**
	* Sets the department rels of this v legal document.
	*
	* @param departmentRels the department rels of this v legal document
	*/
	@Override
	public void setDepartmentRels(java.lang.String departmentRels) {
		_vLegalDocument.setDepartmentRels(departmentRels);
	}

	/**
	* Sets the doc code of this v legal document.
	*
	* @param docCode the doc code of this v legal document
	*/
	@Override
	public void setDocCode(java.lang.String docCode) {
		_vLegalDocument.setDocCode(docCode);
	}

	/**
	* Sets the doc ID of this v legal document.
	*
	* @param docId the doc ID of this v legal document
	*/
	@Override
	public void setDocId(java.lang.String docId) {
		_vLegalDocument.setDocId(docId);
	}

	/**
	* Sets the effectived date of this v legal document.
	*
	* @param effectivedDate the effectived date of this v legal document
	*/
	@Override
	public void setEffectivedDate(Date effectivedDate) {
		_vLegalDocument.setEffectivedDate(effectivedDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vLegalDocument.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vLegalDocument.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vLegalDocument.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expired date of this v legal document.
	*
	* @param expiredDate the expired date of this v legal document
	*/
	@Override
	public void setExpiredDate(Date expiredDate) {
		_vLegalDocument.setExpiredDate(expiredDate);
	}

	/**
	* Sets the field ID of this v legal document.
	*
	* @param fieldId the field ID of this v legal document
	*/
	@Override
	public void setFieldId(java.lang.String fieldId) {
		_vLegalDocument.setFieldId(fieldId);
	}

	/**
	* Sets the field rels of this v legal document.
	*
	* @param fieldRels the field rels of this v legal document
	*/
	@Override
	public void setFieldRels(java.lang.String fieldRels) {
		_vLegalDocument.setFieldRels(fieldRels);
	}

	/**
	* Sets the forwarded by user of this v legal document.
	*
	* @param forwardedByUser the forwarded by user of this v legal document
	*/
	@Override
	public void setForwardedByUser(long forwardedByUser) {
		_vLegalDocument.setForwardedByUser(forwardedByUser);
	}

	/**
	* Sets the forwarded date of this v legal document.
	*
	* @param forwardedDate the forwarded date of this v legal document
	*/
	@Override
	public void setForwardedDate(Date forwardedDate) {
		_vLegalDocument.setForwardedDate(forwardedDate);
	}

	/**
	* Sets the group ID of this v legal document.
	*
	* @param groupId the group ID of this v legal document
	*/
	@Override
	public void setGroupId(long groupId) {
		_vLegalDocument.setGroupId(groupId);
	}

	/**
	* Sets whether this v legal document is has attachment.
	*
	* @param hasAttachment the has attachment of this v legal document
	*/
	@Override
	public void setHasAttachment(boolean hasAttachment) {
		_vLegalDocument.setHasAttachment(hasAttachment);
	}

	/**
	* Sets the language of this v legal document.
	*
	* @param language the language of this v legal document
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vLegalDocument.setLanguage(language);
	}

	/**
	* Sets the modified by user of this v legal document.
	*
	* @param modifiedByUser the modified by user of this v legal document
	*/
	@Override
	public void setModifiedByUser(long modifiedByUser) {
		_vLegalDocument.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this v legal document.
	*
	* @param modifiedDate the modified date of this v legal document
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vLegalDocument.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_vLegalDocument.setNew(n);
	}

	/**
	* Sets the num of this v legal document.
	*
	* @param num the num of this v legal document
	*/
	@Override
	public void setNum(java.lang.String num) {
		_vLegalDocument.setNum(num);
	}

	/**
	* Sets the num rels of this v legal document.
	*
	* @param numRels the num rels of this v legal document
	*/
	@Override
	public void setNumRels(java.lang.String numRels) {
		_vLegalDocument.setNumRels(numRels);
	}

	/**
	* Sets the org ID of this v legal document.
	*
	* @param orgId the org ID of this v legal document
	*/
	@Override
	public void setOrgId(java.lang.String orgId) {
		_vLegalDocument.setOrgId(orgId);
	}

	/**
	* Sets the org rels of this v legal document.
	*
	* @param orgRels the org rels of this v legal document
	*/
	@Override
	public void setOrgRels(java.lang.String orgRels) {
		_vLegalDocument.setOrgRels(orgRels);
	}

	/**
	* Sets the primary key of this v legal document.
	*
	* @param primaryKey the primary key of this v legal document
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vLegalDocument.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vLegalDocument.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the promul date of this v legal document.
	*
	* @param promulDate the promul date of this v legal document
	*/
	@Override
	public void setPromulDate(Date promulDate) {
		_vLegalDocument.setPromulDate(promulDate);
	}

	/**
	* Sets the published by user of this v legal document.
	*
	* @param publishedByUser the published by user of this v legal document
	*/
	@Override
	public void setPublishedByUser(long publishedByUser) {
		_vLegalDocument.setPublishedByUser(publishedByUser);
	}

	/**
	* Sets the published date of this v legal document.
	*
	* @param publishedDate the published date of this v legal document
	*/
	@Override
	public void setPublishedDate(Date publishedDate) {
		_vLegalDocument.setPublishedDate(publishedDate);
	}

	/**
	* Sets the replace doc of this v legal document.
	*
	* @param replaceDoc the replace doc of this v legal document
	*/
	@Override
	public void setReplaceDoc(java.lang.String replaceDoc) {
		_vLegalDocument.setReplaceDoc(replaceDoc);
	}

	/**
	* Sets the signer rels of this v legal document.
	*
	* @param signerRels the signer rels of this v legal document
	*/
	@Override
	public void setSignerRels(java.lang.String signerRels) {
		_vLegalDocument.setSignerRels(signerRels);
	}

	/**
	* Sets the status doc of this v legal document.
	*
	* @param statusDoc the status doc of this v legal document
	*/
	@Override
	public void setStatusDoc(int statusDoc) {
		_vLegalDocument.setStatusDoc(statusDoc);
	}

	/**
	* Sets the summary of this v legal document.
	*
	* @param summary the summary of this v legal document
	*/
	@Override
	public void setSummary(java.lang.String summary) {
		_vLegalDocument.setSummary(summary);
	}

	/**
	* Sets the symbol of this v legal document.
	*
	* @param symbol the symbol of this v legal document
	*/
	@Override
	public void setSymbol(java.lang.String symbol) {
		_vLegalDocument.setSymbol(symbol);
	}

	/**
	* Sets the type doc ID of this v legal document.
	*
	* @param typeDocId the type doc ID of this v legal document
	*/
	@Override
	public void setTypeDocId(java.lang.String typeDocId) {
		_vLegalDocument.setTypeDocId(typeDocId);
	}

	/**
	* Sets the user hit of this v legal document.
	*
	* @param userHit the user hit of this v legal document
	*/
	@Override
	public void setUserHit(int userHit) {
		_vLegalDocument.setUserHit(userHit);
	}

	/**
	* Sets the user ID of this v legal document.
	*
	* @param userId the user ID of this v legal document
	*/
	@Override
	public void setUserId(long userId) {
		_vLegalDocument.setUserId(userId);
	}

	/**
	* Sets the user uuid of this v legal document.
	*
	* @param userUuid the user uuid of this v legal document
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vLegalDocument.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalDocumentWrapper)) {
			return false;
		}

		VLegalDocumentWrapper vLegalDocumentWrapper = (VLegalDocumentWrapper)obj;

		if (Objects.equals(_vLegalDocument,
					vLegalDocumentWrapper._vLegalDocument)) {
			return true;
		}

		return false;
	}

	@Override
	public VLegalDocument getWrappedModel() {
		return _vLegalDocument;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vLegalDocument.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vLegalDocument.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vLegalDocument.resetOriginalValues();
	}

	private final VLegalDocument _vLegalDocument;
}