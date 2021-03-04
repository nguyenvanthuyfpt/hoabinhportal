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
 * This class is a wrapper for {@link VcmsDiscussion}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsDiscussion
 * @generated
 */
@ProviderType
public class VcmsDiscussionWrapper implements VcmsDiscussion,
	ModelWrapper<VcmsDiscussion> {
	public VcmsDiscussionWrapper(VcmsDiscussion vcmsDiscussion) {
		_vcmsDiscussion = vcmsDiscussion;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsDiscussion.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsDiscussion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("discussionId", getDiscussionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("visitorName", getVisitorName());
		attributes.put("visitorEmail", getVisitorEmail());
		attributes.put("visitorPhone", getVisitorPhone());
		attributes.put("postedDate", getPostedDate());
		attributes.put("approved", getApproved());
		attributes.put("approvedByUser", getApprovedByUser());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("articleId", getArticleId());
		attributes.put("title", getTitle());
		attributes.put("content", getContent());
		attributes.put("language", getLanguage());
		attributes.put("hasAttachment", getHasAttachment());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String discussionId = (String)attributes.get("discussionId");

		if (discussionId != null) {
			setDiscussionId(discussionId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String visitorName = (String)attributes.get("visitorName");

		if (visitorName != null) {
			setVisitorName(visitorName);
		}

		String visitorEmail = (String)attributes.get("visitorEmail");

		if (visitorEmail != null) {
			setVisitorEmail(visitorEmail);
		}

		String visitorPhone = (String)attributes.get("visitorPhone");

		if (visitorPhone != null) {
			setVisitorPhone(visitorPhone);
		}

		Date postedDate = (Date)attributes.get("postedDate");

		if (postedDate != null) {
			setPostedDate(postedDate);
		}

		Boolean approved = (Boolean)attributes.get("approved");

		if (approved != null) {
			setApproved(approved);
		}

		String approvedByUser = (String)attributes.get("approvedByUser");

		if (approvedByUser != null) {
			setApprovedByUser(approvedByUser);
		}

		Date approvedDate = (Date)attributes.get("approvedDate");

		if (approvedDate != null) {
			setApprovedDate(approvedDate);
		}

		String articleId = (String)attributes.get("articleId");

		if (articleId != null) {
			setArticleId(articleId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Boolean hasAttachment = (Boolean)attributes.get("hasAttachment");

		if (hasAttachment != null) {
			setHasAttachment(hasAttachment);
		}
	}

	/**
	* Returns the approved of this vcms discussion.
	*
	* @return the approved of this vcms discussion
	*/
	@Override
	public boolean getApproved() {
		return _vcmsDiscussion.getApproved();
	}

	/**
	* Returns the has attachment of this vcms discussion.
	*
	* @return the has attachment of this vcms discussion
	*/
	@Override
	public boolean getHasAttachment() {
		return _vcmsDiscussion.getHasAttachment();
	}

	/**
	* Returns <code>true</code> if this vcms discussion is approved.
	*
	* @return <code>true</code> if this vcms discussion is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _vcmsDiscussion.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsDiscussion.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsDiscussion.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this vcms discussion is has attachment.
	*
	* @return <code>true</code> if this vcms discussion is has attachment; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasAttachment() {
		return _vcmsDiscussion.isHasAttachment();
	}

	@Override
	public boolean isNew() {
		return _vcmsDiscussion.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsDiscussion.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsDiscussion> toCacheModel() {
		return _vcmsDiscussion.toCacheModel();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VcmsDiscussion vcmsDiscussion) {
		return _vcmsDiscussion.compareTo(vcmsDiscussion);
	}

	@Override
	public int hashCode() {
		return _vcmsDiscussion.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsDiscussion.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsDiscussionWrapper((VcmsDiscussion)_vcmsDiscussion.clone());
	}

	/**
	* Returns the approved by user of this vcms discussion.
	*
	* @return the approved by user of this vcms discussion
	*/
	@Override
	public java.lang.String getApprovedByUser() {
		return _vcmsDiscussion.getApprovedByUser();
	}

	/**
	* Returns the article ID of this vcms discussion.
	*
	* @return the article ID of this vcms discussion
	*/
	@Override
	public java.lang.String getArticleId() {
		return _vcmsDiscussion.getArticleId();
	}

	/**
	* Returns the content of this vcms discussion.
	*
	* @return the content of this vcms discussion
	*/
	@Override
	public java.lang.String getContent() {
		return _vcmsDiscussion.getContent();
	}

	/**
	* Returns the discussion ID of this vcms discussion.
	*
	* @return the discussion ID of this vcms discussion
	*/
	@Override
	public java.lang.String getDiscussionId() {
		return _vcmsDiscussion.getDiscussionId();
	}

	/**
	* Returns the language of this vcms discussion.
	*
	* @return the language of this vcms discussion
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vcmsDiscussion.getLanguage();
	}

	/**
	* Returns the primary key of this vcms discussion.
	*
	* @return the primary key of this vcms discussion
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vcmsDiscussion.getPrimaryKey();
	}

	/**
	* Returns the title of this vcms discussion.
	*
	* @return the title of this vcms discussion
	*/
	@Override
	public java.lang.String getTitle() {
		return _vcmsDiscussion.getTitle();
	}

	/**
	* Returns the visitor email of this vcms discussion.
	*
	* @return the visitor email of this vcms discussion
	*/
	@Override
	public java.lang.String getVisitorEmail() {
		return _vcmsDiscussion.getVisitorEmail();
	}

	/**
	* Returns the visitor name of this vcms discussion.
	*
	* @return the visitor name of this vcms discussion
	*/
	@Override
	public java.lang.String getVisitorName() {
		return _vcmsDiscussion.getVisitorName();
	}

	/**
	* Returns the visitor phone of this vcms discussion.
	*
	* @return the visitor phone of this vcms discussion
	*/
	@Override
	public java.lang.String getVisitorPhone() {
		return _vcmsDiscussion.getVisitorPhone();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsDiscussion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsDiscussion.toXmlString();
	}

	/**
	* Returns the approved date of this vcms discussion.
	*
	* @return the approved date of this vcms discussion
	*/
	@Override
	public Date getApprovedDate() {
		return _vcmsDiscussion.getApprovedDate();
	}

	/**
	* Returns the posted date of this vcms discussion.
	*
	* @return the posted date of this vcms discussion
	*/
	@Override
	public Date getPostedDate() {
		return _vcmsDiscussion.getPostedDate();
	}

	/**
	* Returns the company ID of this vcms discussion.
	*
	* @return the company ID of this vcms discussion
	*/
	@Override
	public long getCompanyId() {
		return _vcmsDiscussion.getCompanyId();
	}

	/**
	* Returns the group ID of this vcms discussion.
	*
	* @return the group ID of this vcms discussion
	*/
	@Override
	public long getGroupId() {
		return _vcmsDiscussion.getGroupId();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsDiscussion toEscapedModel() {
		return new VcmsDiscussionWrapper(_vcmsDiscussion.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsDiscussion toUnescapedModel() {
		return new VcmsDiscussionWrapper(_vcmsDiscussion.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vcmsDiscussion.persist();
	}

	/**
	* Sets whether this vcms discussion is approved.
	*
	* @param approved the approved of this vcms discussion
	*/
	@Override
	public void setApproved(boolean approved) {
		_vcmsDiscussion.setApproved(approved);
	}

	/**
	* Sets the approved by user of this vcms discussion.
	*
	* @param approvedByUser the approved by user of this vcms discussion
	*/
	@Override
	public void setApprovedByUser(java.lang.String approvedByUser) {
		_vcmsDiscussion.setApprovedByUser(approvedByUser);
	}

	/**
	* Sets the approved date of this vcms discussion.
	*
	* @param approvedDate the approved date of this vcms discussion
	*/
	@Override
	public void setApprovedDate(Date approvedDate) {
		_vcmsDiscussion.setApprovedDate(approvedDate);
	}

	/**
	* Sets the article ID of this vcms discussion.
	*
	* @param articleId the article ID of this vcms discussion
	*/
	@Override
	public void setArticleId(java.lang.String articleId) {
		_vcmsDiscussion.setArticleId(articleId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsDiscussion.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this vcms discussion.
	*
	* @param companyId the company ID of this vcms discussion
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vcmsDiscussion.setCompanyId(companyId);
	}

	/**
	* Sets the content of this vcms discussion.
	*
	* @param content the content of this vcms discussion
	*/
	@Override
	public void setContent(java.lang.String content) {
		_vcmsDiscussion.setContent(content);
	}

	/**
	* Sets the discussion ID of this vcms discussion.
	*
	* @param discussionId the discussion ID of this vcms discussion
	*/
	@Override
	public void setDiscussionId(java.lang.String discussionId) {
		_vcmsDiscussion.setDiscussionId(discussionId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsDiscussion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsDiscussion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsDiscussion.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this vcms discussion.
	*
	* @param groupId the group ID of this vcms discussion
	*/
	@Override
	public void setGroupId(long groupId) {
		_vcmsDiscussion.setGroupId(groupId);
	}

	/**
	* Sets whether this vcms discussion is has attachment.
	*
	* @param hasAttachment the has attachment of this vcms discussion
	*/
	@Override
	public void setHasAttachment(boolean hasAttachment) {
		_vcmsDiscussion.setHasAttachment(hasAttachment);
	}

	/**
	* Sets the language of this vcms discussion.
	*
	* @param language the language of this vcms discussion
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vcmsDiscussion.setLanguage(language);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsDiscussion.setNew(n);
	}

	/**
	* Sets the posted date of this vcms discussion.
	*
	* @param postedDate the posted date of this vcms discussion
	*/
	@Override
	public void setPostedDate(Date postedDate) {
		_vcmsDiscussion.setPostedDate(postedDate);
	}

	/**
	* Sets the primary key of this vcms discussion.
	*
	* @param primaryKey the primary key of this vcms discussion
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vcmsDiscussion.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsDiscussion.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the title of this vcms discussion.
	*
	* @param title the title of this vcms discussion
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_vcmsDiscussion.setTitle(title);
	}

	/**
	* Sets the visitor email of this vcms discussion.
	*
	* @param visitorEmail the visitor email of this vcms discussion
	*/
	@Override
	public void setVisitorEmail(java.lang.String visitorEmail) {
		_vcmsDiscussion.setVisitorEmail(visitorEmail);
	}

	/**
	* Sets the visitor name of this vcms discussion.
	*
	* @param visitorName the visitor name of this vcms discussion
	*/
	@Override
	public void setVisitorName(java.lang.String visitorName) {
		_vcmsDiscussion.setVisitorName(visitorName);
	}

	/**
	* Sets the visitor phone of this vcms discussion.
	*
	* @param visitorPhone the visitor phone of this vcms discussion
	*/
	@Override
	public void setVisitorPhone(java.lang.String visitorPhone) {
		_vcmsDiscussion.setVisitorPhone(visitorPhone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsDiscussionWrapper)) {
			return false;
		}

		VcmsDiscussionWrapper vcmsDiscussionWrapper = (VcmsDiscussionWrapper)obj;

		if (Objects.equals(_vcmsDiscussion,
					vcmsDiscussionWrapper._vcmsDiscussion)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsDiscussion getWrappedModel() {
		return _vcmsDiscussion;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsDiscussion.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsDiscussion.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsDiscussion.resetOriginalValues();
	}

	private final VcmsDiscussion _vcmsDiscussion;
}