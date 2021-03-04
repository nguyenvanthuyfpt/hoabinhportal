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
 * This class is a wrapper for {@link vdocDocument}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocDocument
 * @generated
 */
@ProviderType
public class vdocDocumentWrapper implements vdocDocument,
	ModelWrapper<vdocDocument> {
	public vdocDocumentWrapper(vdocDocument vdocDocument) {
		_vdocDocument = vdocDocument;
	}

	@Override
	public Class<?> getModelClass() {
		return vdocDocument.class;
	}

	@Override
	public String getModelClassName() {
		return vdocDocument.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("docId", getDocId());
		attributes.put("groupId", getGroupId());
		attributes.put("language", getLanguage());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("approvedByUser", getApprovedByUser());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("publishedByUser", getPublishedByUser());
		attributes.put("publishedDate", getPublishedDate());
		attributes.put("promulDate", getPromulDate());
		attributes.put("effectivedDate", getEffectivedDate());
		attributes.put("expiredDate", getExpiredDate());
		attributes.put("replaceDoc", getReplaceDoc());
		attributes.put("title", getTitle());
		attributes.put("content", getContent());
		attributes.put("process", getProcess());
		attributes.put("base", getBase());
		attributes.put("timeProcess", getTimeProcess());
		attributes.put("cost", getCost());
		attributes.put("requireDoc", getRequireDoc());
		attributes.put("result", getResult());
		attributes.put("objects", getObjects());
		attributes.put("style", getStyle());
		attributes.put("position", getPosition());
		attributes.put("note", getNote());
		attributes.put("executeOrg", getExecuteOrg());
		attributes.put("userHit", getUserHit());
		attributes.put("statusDoc", getStatusDoc());
		attributes.put("typeDoc", getTypeDoc());
		attributes.put("hasService", getHasService());
		attributes.put("hasAttachment", getHasAttachment());
		attributes.put("fieldId", getFieldId());
		attributes.put("orgRels", getOrgRels());
		attributes.put("fieldRels", getFieldRels());
		attributes.put("levels", getLevels());

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

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
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

		Long publishedByUser = (Long)attributes.get("publishedByUser");

		if (publishedByUser != null) {
			setPublishedByUser(publishedByUser);
		}

		Date publishedDate = (Date)attributes.get("publishedDate");

		if (publishedDate != null) {
			setPublishedDate(publishedDate);
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

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		String process = (String)attributes.get("process");

		if (process != null) {
			setProcess(process);
		}

		String base = (String)attributes.get("base");

		if (base != null) {
			setBase(base);
		}

		String timeProcess = (String)attributes.get("timeProcess");

		if (timeProcess != null) {
			setTimeProcess(timeProcess);
		}

		String cost = (String)attributes.get("cost");

		if (cost != null) {
			setCost(cost);
		}

		String requireDoc = (String)attributes.get("requireDoc");

		if (requireDoc != null) {
			setRequireDoc(requireDoc);
		}

		String result = (String)attributes.get("result");

		if (result != null) {
			setResult(result);
		}

		String objects = (String)attributes.get("objects");

		if (objects != null) {
			setObjects(objects);
		}

		String style = (String)attributes.get("style");

		if (style != null) {
			setStyle(style);
		}

		Integer position = (Integer)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
		}

		String executeOrg = (String)attributes.get("executeOrg");

		if (executeOrg != null) {
			setExecuteOrg(executeOrg);
		}

		Integer userHit = (Integer)attributes.get("userHit");

		if (userHit != null) {
			setUserHit(userHit);
		}

		Integer statusDoc = (Integer)attributes.get("statusDoc");

		if (statusDoc != null) {
			setStatusDoc(statusDoc);
		}

		Integer typeDoc = (Integer)attributes.get("typeDoc");

		if (typeDoc != null) {
			setTypeDoc(typeDoc);
		}

		Boolean hasService = (Boolean)attributes.get("hasService");

		if (hasService != null) {
			setHasService(hasService);
		}

		Boolean hasAttachment = (Boolean)attributes.get("hasAttachment");

		if (hasAttachment != null) {
			setHasAttachment(hasAttachment);
		}

		String fieldId = (String)attributes.get("fieldId");

		if (fieldId != null) {
			setFieldId(fieldId);
		}

		String orgRels = (String)attributes.get("orgRels");

		if (orgRels != null) {
			setOrgRels(orgRels);
		}

		String fieldRels = (String)attributes.get("fieldRels");

		if (fieldRels != null) {
			setFieldRels(fieldRels);
		}

		String levels = (String)attributes.get("levels");

		if (levels != null) {
			setLevels(levels);
		}
	}

	/**
	* Returns the has attachment of this vdoc document.
	*
	* @return the has attachment of this vdoc document
	*/
	@Override
	public boolean getHasAttachment() {
		return _vdocDocument.getHasAttachment();
	}

	/**
	* Returns the has service of this vdoc document.
	*
	* @return the has service of this vdoc document
	*/
	@Override
	public boolean getHasService() {
		return _vdocDocument.getHasService();
	}

	@Override
	public boolean isCachedModel() {
		return _vdocDocument.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vdocDocument.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this vdoc document is has attachment.
	*
	* @return <code>true</code> if this vdoc document is has attachment; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasAttachment() {
		return _vdocDocument.isHasAttachment();
	}

	/**
	* Returns <code>true</code> if this vdoc document is has service.
	*
	* @return <code>true</code> if this vdoc document is has service; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasService() {
		return _vdocDocument.isHasService();
	}

	@Override
	public boolean isNew() {
		return _vdocDocument.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vdocDocument.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.vdocDocument> toCacheModel() {
		return _vdocDocument.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.vdocDocument vdocDocument) {
		return _vdocDocument.compareTo(vdocDocument);
	}

	/**
	* Returns the position of this vdoc document.
	*
	* @return the position of this vdoc document
	*/
	@Override
	public int getPosition() {
		return _vdocDocument.getPosition();
	}

	/**
	* Returns the status doc of this vdoc document.
	*
	* @return the status doc of this vdoc document
	*/
	@Override
	public int getStatusDoc() {
		return _vdocDocument.getStatusDoc();
	}

	/**
	* Returns the type doc of this vdoc document.
	*
	* @return the type doc of this vdoc document
	*/
	@Override
	public int getTypeDoc() {
		return _vdocDocument.getTypeDoc();
	}

	/**
	* Returns the user hit of this vdoc document.
	*
	* @return the user hit of this vdoc document
	*/
	@Override
	public int getUserHit() {
		return _vdocDocument.getUserHit();
	}

	@Override
	public int hashCode() {
		return _vdocDocument.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vdocDocument.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new vdocDocumentWrapper((vdocDocument)_vdocDocument.clone());
	}

	/**
	* Returns the base of this vdoc document.
	*
	* @return the base of this vdoc document
	*/
	@Override
	public java.lang.String getBase() {
		return _vdocDocument.getBase();
	}

	/**
	* Returns the content of this vdoc document.
	*
	* @return the content of this vdoc document
	*/
	@Override
	public java.lang.String getContent() {
		return _vdocDocument.getContent();
	}

	/**
	* Returns the cost of this vdoc document.
	*
	* @return the cost of this vdoc document
	*/
	@Override
	public java.lang.String getCost() {
		return _vdocDocument.getCost();
	}

	/**
	* Returns the doc ID of this vdoc document.
	*
	* @return the doc ID of this vdoc document
	*/
	@Override
	public java.lang.String getDocId() {
		return _vdocDocument.getDocId();
	}

	/**
	* Returns the execute org of this vdoc document.
	*
	* @return the execute org of this vdoc document
	*/
	@Override
	public java.lang.String getExecuteOrg() {
		return _vdocDocument.getExecuteOrg();
	}

	/**
	* Returns the field ID of this vdoc document.
	*
	* @return the field ID of this vdoc document
	*/
	@Override
	public java.lang.String getFieldId() {
		return _vdocDocument.getFieldId();
	}

	/**
	* Returns the field rels of this vdoc document.
	*
	* @return the field rels of this vdoc document
	*/
	@Override
	public java.lang.String getFieldRels() {
		return _vdocDocument.getFieldRels();
	}

	/**
	* Returns the language of this vdoc document.
	*
	* @return the language of this vdoc document
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vdocDocument.getLanguage();
	}

	/**
	* Returns the levels of this vdoc document.
	*
	* @return the levels of this vdoc document
	*/
	@Override
	public java.lang.String getLevels() {
		return _vdocDocument.getLevels();
	}

	/**
	* Returns the note of this vdoc document.
	*
	* @return the note of this vdoc document
	*/
	@Override
	public java.lang.String getNote() {
		return _vdocDocument.getNote();
	}

	/**
	* Returns the objects of this vdoc document.
	*
	* @return the objects of this vdoc document
	*/
	@Override
	public java.lang.String getObjects() {
		return _vdocDocument.getObjects();
	}

	/**
	* Returns the org rels of this vdoc document.
	*
	* @return the org rels of this vdoc document
	*/
	@Override
	public java.lang.String getOrgRels() {
		return _vdocDocument.getOrgRels();
	}

	/**
	* Returns the primary key of this vdoc document.
	*
	* @return the primary key of this vdoc document
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vdocDocument.getPrimaryKey();
	}

	/**
	* Returns the process of this vdoc document.
	*
	* @return the process of this vdoc document
	*/
	@Override
	public java.lang.String getProcess() {
		return _vdocDocument.getProcess();
	}

	/**
	* Returns the replace doc of this vdoc document.
	*
	* @return the replace doc of this vdoc document
	*/
	@Override
	public java.lang.String getReplaceDoc() {
		return _vdocDocument.getReplaceDoc();
	}

	/**
	* Returns the require doc of this vdoc document.
	*
	* @return the require doc of this vdoc document
	*/
	@Override
	public java.lang.String getRequireDoc() {
		return _vdocDocument.getRequireDoc();
	}

	/**
	* Returns the result of this vdoc document.
	*
	* @return the result of this vdoc document
	*/
	@Override
	public java.lang.String getResult() {
		return _vdocDocument.getResult();
	}

	/**
	* Returns the style of this vdoc document.
	*
	* @return the style of this vdoc document
	*/
	@Override
	public java.lang.String getStyle() {
		return _vdocDocument.getStyle();
	}

	/**
	* Returns the time process of this vdoc document.
	*
	* @return the time process of this vdoc document
	*/
	@Override
	public java.lang.String getTimeProcess() {
		return _vdocDocument.getTimeProcess();
	}

	/**
	* Returns the title of this vdoc document.
	*
	* @return the title of this vdoc document
	*/
	@Override
	public java.lang.String getTitle() {
		return _vdocDocument.getTitle();
	}

	/**
	* Returns the user uuid of this vdoc document.
	*
	* @return the user uuid of this vdoc document
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _vdocDocument.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _vdocDocument.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vdocDocument.toXmlString();
	}

	/**
	* Returns the approved date of this vdoc document.
	*
	* @return the approved date of this vdoc document
	*/
	@Override
	public Date getApprovedDate() {
		return _vdocDocument.getApprovedDate();
	}

	/**
	* Returns the created date of this vdoc document.
	*
	* @return the created date of this vdoc document
	*/
	@Override
	public Date getCreatedDate() {
		return _vdocDocument.getCreatedDate();
	}

	/**
	* Returns the effectived date of this vdoc document.
	*
	* @return the effectived date of this vdoc document
	*/
	@Override
	public Date getEffectivedDate() {
		return _vdocDocument.getEffectivedDate();
	}

	/**
	* Returns the expired date of this vdoc document.
	*
	* @return the expired date of this vdoc document
	*/
	@Override
	public Date getExpiredDate() {
		return _vdocDocument.getExpiredDate();
	}

	/**
	* Returns the modified date of this vdoc document.
	*
	* @return the modified date of this vdoc document
	*/
	@Override
	public Date getModifiedDate() {
		return _vdocDocument.getModifiedDate();
	}

	/**
	* Returns the promul date of this vdoc document.
	*
	* @return the promul date of this vdoc document
	*/
	@Override
	public Date getPromulDate() {
		return _vdocDocument.getPromulDate();
	}

	/**
	* Returns the published date of this vdoc document.
	*
	* @return the published date of this vdoc document
	*/
	@Override
	public Date getPublishedDate() {
		return _vdocDocument.getPublishedDate();
	}

	/**
	* Returns the approved by user of this vdoc document.
	*
	* @return the approved by user of this vdoc document
	*/
	@Override
	public long getApprovedByUser() {
		return _vdocDocument.getApprovedByUser();
	}

	/**
	* Returns the company ID of this vdoc document.
	*
	* @return the company ID of this vdoc document
	*/
	@Override
	public long getCompanyId() {
		return _vdocDocument.getCompanyId();
	}

	/**
	* Returns the created by user of this vdoc document.
	*
	* @return the created by user of this vdoc document
	*/
	@Override
	public long getCreatedByUser() {
		return _vdocDocument.getCreatedByUser();
	}

	/**
	* Returns the group ID of this vdoc document.
	*
	* @return the group ID of this vdoc document
	*/
	@Override
	public long getGroupId() {
		return _vdocDocument.getGroupId();
	}

	/**
	* Returns the modified by user of this vdoc document.
	*
	* @return the modified by user of this vdoc document
	*/
	@Override
	public long getModifiedByUser() {
		return _vdocDocument.getModifiedByUser();
	}

	/**
	* Returns the published by user of this vdoc document.
	*
	* @return the published by user of this vdoc document
	*/
	@Override
	public long getPublishedByUser() {
		return _vdocDocument.getPublishedByUser();
	}

	/**
	* Returns the user ID of this vdoc document.
	*
	* @return the user ID of this vdoc document
	*/
	@Override
	public long getUserId() {
		return _vdocDocument.getUserId();
	}

	@Override
	public vn.gov.hoabinh.model.vdocDocument toEscapedModel() {
		return new vdocDocumentWrapper(_vdocDocument.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.vdocDocument toUnescapedModel() {
		return new vdocDocumentWrapper(_vdocDocument.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vdocDocument.persist();
	}

	/**
	* Sets the approved by user of this vdoc document.
	*
	* @param approvedByUser the approved by user of this vdoc document
	*/
	@Override
	public void setApprovedByUser(long approvedByUser) {
		_vdocDocument.setApprovedByUser(approvedByUser);
	}

	/**
	* Sets the approved date of this vdoc document.
	*
	* @param approvedDate the approved date of this vdoc document
	*/
	@Override
	public void setApprovedDate(Date approvedDate) {
		_vdocDocument.setApprovedDate(approvedDate);
	}

	/**
	* Sets the base of this vdoc document.
	*
	* @param base the base of this vdoc document
	*/
	@Override
	public void setBase(java.lang.String base) {
		_vdocDocument.setBase(base);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vdocDocument.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this vdoc document.
	*
	* @param companyId the company ID of this vdoc document
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vdocDocument.setCompanyId(companyId);
	}

	/**
	* Sets the content of this vdoc document.
	*
	* @param content the content of this vdoc document
	*/
	@Override
	public void setContent(java.lang.String content) {
		_vdocDocument.setContent(content);
	}

	/**
	* Sets the cost of this vdoc document.
	*
	* @param cost the cost of this vdoc document
	*/
	@Override
	public void setCost(java.lang.String cost) {
		_vdocDocument.setCost(cost);
	}

	/**
	* Sets the created by user of this vdoc document.
	*
	* @param createdByUser the created by user of this vdoc document
	*/
	@Override
	public void setCreatedByUser(long createdByUser) {
		_vdocDocument.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this vdoc document.
	*
	* @param createdDate the created date of this vdoc document
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vdocDocument.setCreatedDate(createdDate);
	}

	/**
	* Sets the doc ID of this vdoc document.
	*
	* @param docId the doc ID of this vdoc document
	*/
	@Override
	public void setDocId(java.lang.String docId) {
		_vdocDocument.setDocId(docId);
	}

	/**
	* Sets the effectived date of this vdoc document.
	*
	* @param effectivedDate the effectived date of this vdoc document
	*/
	@Override
	public void setEffectivedDate(Date effectivedDate) {
		_vdocDocument.setEffectivedDate(effectivedDate);
	}

	/**
	* Sets the execute org of this vdoc document.
	*
	* @param executeOrg the execute org of this vdoc document
	*/
	@Override
	public void setExecuteOrg(java.lang.String executeOrg) {
		_vdocDocument.setExecuteOrg(executeOrg);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vdocDocument.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vdocDocument.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vdocDocument.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expired date of this vdoc document.
	*
	* @param expiredDate the expired date of this vdoc document
	*/
	@Override
	public void setExpiredDate(Date expiredDate) {
		_vdocDocument.setExpiredDate(expiredDate);
	}

	/**
	* Sets the field ID of this vdoc document.
	*
	* @param fieldId the field ID of this vdoc document
	*/
	@Override
	public void setFieldId(java.lang.String fieldId) {
		_vdocDocument.setFieldId(fieldId);
	}

	/**
	* Sets the field rels of this vdoc document.
	*
	* @param fieldRels the field rels of this vdoc document
	*/
	@Override
	public void setFieldRels(java.lang.String fieldRels) {
		_vdocDocument.setFieldRels(fieldRels);
	}

	/**
	* Sets the group ID of this vdoc document.
	*
	* @param groupId the group ID of this vdoc document
	*/
	@Override
	public void setGroupId(long groupId) {
		_vdocDocument.setGroupId(groupId);
	}

	/**
	* Sets whether this vdoc document is has attachment.
	*
	* @param hasAttachment the has attachment of this vdoc document
	*/
	@Override
	public void setHasAttachment(boolean hasAttachment) {
		_vdocDocument.setHasAttachment(hasAttachment);
	}

	/**
	* Sets whether this vdoc document is has service.
	*
	* @param hasService the has service of this vdoc document
	*/
	@Override
	public void setHasService(boolean hasService) {
		_vdocDocument.setHasService(hasService);
	}

	/**
	* Sets the language of this vdoc document.
	*
	* @param language the language of this vdoc document
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vdocDocument.setLanguage(language);
	}

	/**
	* Sets the levels of this vdoc document.
	*
	* @param levels the levels of this vdoc document
	*/
	@Override
	public void setLevels(java.lang.String levels) {
		_vdocDocument.setLevels(levels);
	}

	/**
	* Sets the modified by user of this vdoc document.
	*
	* @param modifiedByUser the modified by user of this vdoc document
	*/
	@Override
	public void setModifiedByUser(long modifiedByUser) {
		_vdocDocument.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this vdoc document.
	*
	* @param modifiedDate the modified date of this vdoc document
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vdocDocument.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_vdocDocument.setNew(n);
	}

	/**
	* Sets the note of this vdoc document.
	*
	* @param note the note of this vdoc document
	*/
	@Override
	public void setNote(java.lang.String note) {
		_vdocDocument.setNote(note);
	}

	/**
	* Sets the objects of this vdoc document.
	*
	* @param objects the objects of this vdoc document
	*/
	@Override
	public void setObjects(java.lang.String objects) {
		_vdocDocument.setObjects(objects);
	}

	/**
	* Sets the org rels of this vdoc document.
	*
	* @param orgRels the org rels of this vdoc document
	*/
	@Override
	public void setOrgRels(java.lang.String orgRels) {
		_vdocDocument.setOrgRels(orgRels);
	}

	/**
	* Sets the position of this vdoc document.
	*
	* @param position the position of this vdoc document
	*/
	@Override
	public void setPosition(int position) {
		_vdocDocument.setPosition(position);
	}

	/**
	* Sets the primary key of this vdoc document.
	*
	* @param primaryKey the primary key of this vdoc document
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vdocDocument.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vdocDocument.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the process of this vdoc document.
	*
	* @param process the process of this vdoc document
	*/
	@Override
	public void setProcess(java.lang.String process) {
		_vdocDocument.setProcess(process);
	}

	/**
	* Sets the promul date of this vdoc document.
	*
	* @param promulDate the promul date of this vdoc document
	*/
	@Override
	public void setPromulDate(Date promulDate) {
		_vdocDocument.setPromulDate(promulDate);
	}

	/**
	* Sets the published by user of this vdoc document.
	*
	* @param publishedByUser the published by user of this vdoc document
	*/
	@Override
	public void setPublishedByUser(long publishedByUser) {
		_vdocDocument.setPublishedByUser(publishedByUser);
	}

	/**
	* Sets the published date of this vdoc document.
	*
	* @param publishedDate the published date of this vdoc document
	*/
	@Override
	public void setPublishedDate(Date publishedDate) {
		_vdocDocument.setPublishedDate(publishedDate);
	}

	/**
	* Sets the replace doc of this vdoc document.
	*
	* @param replaceDoc the replace doc of this vdoc document
	*/
	@Override
	public void setReplaceDoc(java.lang.String replaceDoc) {
		_vdocDocument.setReplaceDoc(replaceDoc);
	}

	/**
	* Sets the require doc of this vdoc document.
	*
	* @param requireDoc the require doc of this vdoc document
	*/
	@Override
	public void setRequireDoc(java.lang.String requireDoc) {
		_vdocDocument.setRequireDoc(requireDoc);
	}

	/**
	* Sets the result of this vdoc document.
	*
	* @param result the result of this vdoc document
	*/
	@Override
	public void setResult(java.lang.String result) {
		_vdocDocument.setResult(result);
	}

	/**
	* Sets the status doc of this vdoc document.
	*
	* @param statusDoc the status doc of this vdoc document
	*/
	@Override
	public void setStatusDoc(int statusDoc) {
		_vdocDocument.setStatusDoc(statusDoc);
	}

	/**
	* Sets the style of this vdoc document.
	*
	* @param style the style of this vdoc document
	*/
	@Override
	public void setStyle(java.lang.String style) {
		_vdocDocument.setStyle(style);
	}

	/**
	* Sets the time process of this vdoc document.
	*
	* @param timeProcess the time process of this vdoc document
	*/
	@Override
	public void setTimeProcess(java.lang.String timeProcess) {
		_vdocDocument.setTimeProcess(timeProcess);
	}

	/**
	* Sets the title of this vdoc document.
	*
	* @param title the title of this vdoc document
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_vdocDocument.setTitle(title);
	}

	/**
	* Sets the type doc of this vdoc document.
	*
	* @param typeDoc the type doc of this vdoc document
	*/
	@Override
	public void setTypeDoc(int typeDoc) {
		_vdocDocument.setTypeDoc(typeDoc);
	}

	/**
	* Sets the user hit of this vdoc document.
	*
	* @param userHit the user hit of this vdoc document
	*/
	@Override
	public void setUserHit(int userHit) {
		_vdocDocument.setUserHit(userHit);
	}

	/**
	* Sets the user ID of this vdoc document.
	*
	* @param userId the user ID of this vdoc document
	*/
	@Override
	public void setUserId(long userId) {
		_vdocDocument.setUserId(userId);
	}

	/**
	* Sets the user uuid of this vdoc document.
	*
	* @param userUuid the user uuid of this vdoc document
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_vdocDocument.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof vdocDocumentWrapper)) {
			return false;
		}

		vdocDocumentWrapper vdocDocumentWrapper = (vdocDocumentWrapper)obj;

		if (Objects.equals(_vdocDocument, vdocDocumentWrapper._vdocDocument)) {
			return true;
		}

		return false;
	}

	@Override
	public vdocDocument getWrappedModel() {
		return _vdocDocument;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vdocDocument.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vdocDocument.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vdocDocument.resetOriginalValues();
	}

	private final vdocDocument _vdocDocument;
}