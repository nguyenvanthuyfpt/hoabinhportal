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
 * This class is a wrapper for {@link VcmsArticleVersion}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleVersion
 * @generated
 */
@ProviderType
public class VcmsArticleVersionWrapper implements VcmsArticleVersion,
	ModelWrapper<VcmsArticleVersion> {
	public VcmsArticleVersionWrapper(VcmsArticleVersion vcmsArticleVersion) {
		_vcmsArticleVersion = vcmsArticleVersion;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsArticleVersion.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsArticleVersion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("articleVersionId", getArticleVersionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("articleId", getArticleId());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("typeIds", getTypeIds());
		attributes.put("status", getStatus());
		attributes.put("versionName", getVersionName());
		attributes.put("title", getTitle());
		attributes.put("lead", getLead());
		attributes.put("content", getContent());
		attributes.put("hasImage", getHasImage());
		attributes.put("imageTitle", getImageTitle());
		attributes.put("image", getImage());
		attributes.put("language", getLanguage());
		attributes.put("userHit", getUserHit());
		attributes.put("author", getAuthor());
		attributes.put("source", getSource());
		attributes.put("discussible", getDiscussible());
		attributes.put("hasAttachment", getHasAttachment());
		attributes.put("hasPoll", getHasPoll());
		attributes.put("pollId", getPollId());
		attributes.put("publishedByUser", getPublishedByUser());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("publishedDate", getPublishedDate());
		attributes.put("effectiveDate", getEffectiveDate());
		attributes.put("expireDate", getExpireDate());
		attributes.put("stickyExpireDate", getStickyExpireDate());
		attributes.put("sticky", getSticky());
		attributes.put("stickyNeverExpired", getStickyNeverExpired());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long articleVersionId = (Long)attributes.get("articleVersionId");

		if (articleVersionId != null) {
			setArticleVersionId(articleVersionId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String articleId = (String)attributes.get("articleId");

		if (articleId != null) {
			setArticleId(articleId);
		}

		String createdByUser = (String)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String typeIds = (String)attributes.get("typeIds");

		if (typeIds != null) {
			setTypeIds(typeIds);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String versionName = (String)attributes.get("versionName");

		if (versionName != null) {
			setVersionName(versionName);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String lead = (String)attributes.get("lead");

		if (lead != null) {
			setLead(lead);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Boolean hasImage = (Boolean)attributes.get("hasImage");

		if (hasImage != null) {
			setHasImage(hasImage);
		}

		String imageTitle = (String)attributes.get("imageTitle");

		if (imageTitle != null) {
			setImageTitle(imageTitle);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Integer userHit = (Integer)attributes.get("userHit");

		if (userHit != null) {
			setUserHit(userHit);
		}

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		String source = (String)attributes.get("source");

		if (source != null) {
			setSource(source);
		}

		Boolean discussible = (Boolean)attributes.get("discussible");

		if (discussible != null) {
			setDiscussible(discussible);
		}

		Boolean hasAttachment = (Boolean)attributes.get("hasAttachment");

		if (hasAttachment != null) {
			setHasAttachment(hasAttachment);
		}

		Boolean hasPoll = (Boolean)attributes.get("hasPoll");

		if (hasPoll != null) {
			setHasPoll(hasPoll);
		}

		String pollId = (String)attributes.get("pollId");

		if (pollId != null) {
			setPollId(pollId);
		}

		String publishedByUser = (String)attributes.get("publishedByUser");

		if (publishedByUser != null) {
			setPublishedByUser(publishedByUser);
		}

		String modifiedByUser = (String)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date publishedDate = (Date)attributes.get("publishedDate");

		if (publishedDate != null) {
			setPublishedDate(publishedDate);
		}

		Date effectiveDate = (Date)attributes.get("effectiveDate");

		if (effectiveDate != null) {
			setEffectiveDate(effectiveDate);
		}

		Date expireDate = (Date)attributes.get("expireDate");

		if (expireDate != null) {
			setExpireDate(expireDate);
		}

		Date stickyExpireDate = (Date)attributes.get("stickyExpireDate");

		if (stickyExpireDate != null) {
			setStickyExpireDate(stickyExpireDate);
		}

		Boolean sticky = (Boolean)attributes.get("sticky");

		if (sticky != null) {
			setSticky(sticky);
		}

		Boolean stickyNeverExpired = (Boolean)attributes.get(
				"stickyNeverExpired");

		if (stickyNeverExpired != null) {
			setStickyNeverExpired(stickyNeverExpired);
		}
	}

	/**
	* Returns the discussible of this vcms article version.
	*
	* @return the discussible of this vcms article version
	*/
	@Override
	public boolean getDiscussible() {
		return _vcmsArticleVersion.getDiscussible();
	}

	/**
	* Returns the has attachment of this vcms article version.
	*
	* @return the has attachment of this vcms article version
	*/
	@Override
	public boolean getHasAttachment() {
		return _vcmsArticleVersion.getHasAttachment();
	}

	/**
	* Returns the has image of this vcms article version.
	*
	* @return the has image of this vcms article version
	*/
	@Override
	public boolean getHasImage() {
		return _vcmsArticleVersion.getHasImage();
	}

	/**
	* Returns the has poll of this vcms article version.
	*
	* @return the has poll of this vcms article version
	*/
	@Override
	public boolean getHasPoll() {
		return _vcmsArticleVersion.getHasPoll();
	}

	/**
	* Returns the sticky of this vcms article version.
	*
	* @return the sticky of this vcms article version
	*/
	@Override
	public boolean getSticky() {
		return _vcmsArticleVersion.getSticky();
	}

	/**
	* Returns the sticky never expired of this vcms article version.
	*
	* @return the sticky never expired of this vcms article version
	*/
	@Override
	public boolean getStickyNeverExpired() {
		return _vcmsArticleVersion.getStickyNeverExpired();
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsArticleVersion.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this vcms article version is discussible.
	*
	* @return <code>true</code> if this vcms article version is discussible; <code>false</code> otherwise
	*/
	@Override
	public boolean isDiscussible() {
		return _vcmsArticleVersion.isDiscussible();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsArticleVersion.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this vcms article version is has attachment.
	*
	* @return <code>true</code> if this vcms article version is has attachment; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasAttachment() {
		return _vcmsArticleVersion.isHasAttachment();
	}

	/**
	* Returns <code>true</code> if this vcms article version is has image.
	*
	* @return <code>true</code> if this vcms article version is has image; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasImage() {
		return _vcmsArticleVersion.isHasImage();
	}

	/**
	* Returns <code>true</code> if this vcms article version is has poll.
	*
	* @return <code>true</code> if this vcms article version is has poll; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasPoll() {
		return _vcmsArticleVersion.isHasPoll();
	}

	@Override
	public boolean isNew() {
		return _vcmsArticleVersion.isNew();
	}

	/**
	* Returns <code>true</code> if this vcms article version is sticky.
	*
	* @return <code>true</code> if this vcms article version is sticky; <code>false</code> otherwise
	*/
	@Override
	public boolean isSticky() {
		return _vcmsArticleVersion.isSticky();
	}

	/**
	* Returns <code>true</code> if this vcms article version is sticky never expired.
	*
	* @return <code>true</code> if this vcms article version is sticky never expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isStickyNeverExpired() {
		return _vcmsArticleVersion.isStickyNeverExpired();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsArticleVersion.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsArticleVersion> toCacheModel() {
		return _vcmsArticleVersion.toCacheModel();
	}

	@Override
	public int compareTo(
		vn.gov.hoabinh.model.VcmsArticleVersion vcmsArticleVersion) {
		return _vcmsArticleVersion.compareTo(vcmsArticleVersion);
	}

	/**
	* Returns the user hit of this vcms article version.
	*
	* @return the user hit of this vcms article version
	*/
	@Override
	public int getUserHit() {
		return _vcmsArticleVersion.getUserHit();
	}

	@Override
	public int hashCode() {
		return _vcmsArticleVersion.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsArticleVersion.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsArticleVersionWrapper((VcmsArticleVersion)_vcmsArticleVersion.clone());
	}

	/**
	* Returns the article ID of this vcms article version.
	*
	* @return the article ID of this vcms article version
	*/
	@Override
	public java.lang.String getArticleId() {
		return _vcmsArticleVersion.getArticleId();
	}

	/**
	* Returns the author of this vcms article version.
	*
	* @return the author of this vcms article version
	*/
	@Override
	public java.lang.String getAuthor() {
		return _vcmsArticleVersion.getAuthor();
	}

	/**
	* Returns the content of this vcms article version.
	*
	* @return the content of this vcms article version
	*/
	@Override
	public java.lang.String getContent() {
		return _vcmsArticleVersion.getContent();
	}

	/**
	* Returns the created by user of this vcms article version.
	*
	* @return the created by user of this vcms article version
	*/
	@Override
	public java.lang.String getCreatedByUser() {
		return _vcmsArticleVersion.getCreatedByUser();
	}

	/**
	* Returns the image of this vcms article version.
	*
	* @return the image of this vcms article version
	*/
	@Override
	public java.lang.String getImage() {
		return _vcmsArticleVersion.getImage();
	}

	/**
	* Returns the image title of this vcms article version.
	*
	* @return the image title of this vcms article version
	*/
	@Override
	public java.lang.String getImageTitle() {
		return _vcmsArticleVersion.getImageTitle();
	}

	/**
	* Returns the language of this vcms article version.
	*
	* @return the language of this vcms article version
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vcmsArticleVersion.getLanguage();
	}

	/**
	* Returns the lead of this vcms article version.
	*
	* @return the lead of this vcms article version
	*/
	@Override
	public java.lang.String getLead() {
		return _vcmsArticleVersion.getLead();
	}

	/**
	* Returns the modified by user of this vcms article version.
	*
	* @return the modified by user of this vcms article version
	*/
	@Override
	public java.lang.String getModifiedByUser() {
		return _vcmsArticleVersion.getModifiedByUser();
	}

	/**
	* Returns the poll ID of this vcms article version.
	*
	* @return the poll ID of this vcms article version
	*/
	@Override
	public java.lang.String getPollId() {
		return _vcmsArticleVersion.getPollId();
	}

	/**
	* Returns the published by user of this vcms article version.
	*
	* @return the published by user of this vcms article version
	*/
	@Override
	public java.lang.String getPublishedByUser() {
		return _vcmsArticleVersion.getPublishedByUser();
	}

	/**
	* Returns the source of this vcms article version.
	*
	* @return the source of this vcms article version
	*/
	@Override
	public java.lang.String getSource() {
		return _vcmsArticleVersion.getSource();
	}

	/**
	* Returns the title of this vcms article version.
	*
	* @return the title of this vcms article version
	*/
	@Override
	public java.lang.String getTitle() {
		return _vcmsArticleVersion.getTitle();
	}

	/**
	* Returns the type IDs of this vcms article version.
	*
	* @return the type IDs of this vcms article version
	*/
	@Override
	public java.lang.String getTypeIds() {
		return _vcmsArticleVersion.getTypeIds();
	}

	/**
	* Returns the version name of this vcms article version.
	*
	* @return the version name of this vcms article version
	*/
	@Override
	public java.lang.String getVersionName() {
		return _vcmsArticleVersion.getVersionName();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsArticleVersion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsArticleVersion.toXmlString();
	}

	/**
	* Returns the created date of this vcms article version.
	*
	* @return the created date of this vcms article version
	*/
	@Override
	public Date getCreatedDate() {
		return _vcmsArticleVersion.getCreatedDate();
	}

	/**
	* Returns the effective date of this vcms article version.
	*
	* @return the effective date of this vcms article version
	*/
	@Override
	public Date getEffectiveDate() {
		return _vcmsArticleVersion.getEffectiveDate();
	}

	/**
	* Returns the expire date of this vcms article version.
	*
	* @return the expire date of this vcms article version
	*/
	@Override
	public Date getExpireDate() {
		return _vcmsArticleVersion.getExpireDate();
	}

	/**
	* Returns the modified date of this vcms article version.
	*
	* @return the modified date of this vcms article version
	*/
	@Override
	public Date getModifiedDate() {
		return _vcmsArticleVersion.getModifiedDate();
	}

	/**
	* Returns the published date of this vcms article version.
	*
	* @return the published date of this vcms article version
	*/
	@Override
	public Date getPublishedDate() {
		return _vcmsArticleVersion.getPublishedDate();
	}

	/**
	* Returns the sticky expire date of this vcms article version.
	*
	* @return the sticky expire date of this vcms article version
	*/
	@Override
	public Date getStickyExpireDate() {
		return _vcmsArticleVersion.getStickyExpireDate();
	}

	/**
	* Returns the article version ID of this vcms article version.
	*
	* @return the article version ID of this vcms article version
	*/
	@Override
	public long getArticleVersionId() {
		return _vcmsArticleVersion.getArticleVersionId();
	}

	/**
	* Returns the company ID of this vcms article version.
	*
	* @return the company ID of this vcms article version
	*/
	@Override
	public long getCompanyId() {
		return _vcmsArticleVersion.getCompanyId();
	}

	/**
	* Returns the group ID of this vcms article version.
	*
	* @return the group ID of this vcms article version
	*/
	@Override
	public long getGroupId() {
		return _vcmsArticleVersion.getGroupId();
	}

	/**
	* Returns the primary key of this vcms article version.
	*
	* @return the primary key of this vcms article version
	*/
	@Override
	public long getPrimaryKey() {
		return _vcmsArticleVersion.getPrimaryKey();
	}

	/**
	* Returns the status of this vcms article version.
	*
	* @return the status of this vcms article version
	*/
	@Override
	public long getStatus() {
		return _vcmsArticleVersion.getStatus();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleVersion toEscapedModel() {
		return new VcmsArticleVersionWrapper(_vcmsArticleVersion.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleVersion toUnescapedModel() {
		return new VcmsArticleVersionWrapper(_vcmsArticleVersion.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vcmsArticleVersion.persist();
	}

	/**
	* Sets the article ID of this vcms article version.
	*
	* @param articleId the article ID of this vcms article version
	*/
	@Override
	public void setArticleId(java.lang.String articleId) {
		_vcmsArticleVersion.setArticleId(articleId);
	}

	/**
	* Sets the article version ID of this vcms article version.
	*
	* @param articleVersionId the article version ID of this vcms article version
	*/
	@Override
	public void setArticleVersionId(long articleVersionId) {
		_vcmsArticleVersion.setArticleVersionId(articleVersionId);
	}

	/**
	* Sets the author of this vcms article version.
	*
	* @param author the author of this vcms article version
	*/
	@Override
	public void setAuthor(java.lang.String author) {
		_vcmsArticleVersion.setAuthor(author);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsArticleVersion.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this vcms article version.
	*
	* @param companyId the company ID of this vcms article version
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vcmsArticleVersion.setCompanyId(companyId);
	}

	/**
	* Sets the content of this vcms article version.
	*
	* @param content the content of this vcms article version
	*/
	@Override
	public void setContent(java.lang.String content) {
		_vcmsArticleVersion.setContent(content);
	}

	/**
	* Sets the created by user of this vcms article version.
	*
	* @param createdByUser the created by user of this vcms article version
	*/
	@Override
	public void setCreatedByUser(java.lang.String createdByUser) {
		_vcmsArticleVersion.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this vcms article version.
	*
	* @param createdDate the created date of this vcms article version
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vcmsArticleVersion.setCreatedDate(createdDate);
	}

	/**
	* Sets whether this vcms article version is discussible.
	*
	* @param discussible the discussible of this vcms article version
	*/
	@Override
	public void setDiscussible(boolean discussible) {
		_vcmsArticleVersion.setDiscussible(discussible);
	}

	/**
	* Sets the effective date of this vcms article version.
	*
	* @param effectiveDate the effective date of this vcms article version
	*/
	@Override
	public void setEffectiveDate(Date effectiveDate) {
		_vcmsArticleVersion.setEffectiveDate(effectiveDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsArticleVersion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsArticleVersion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsArticleVersion.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expire date of this vcms article version.
	*
	* @param expireDate the expire date of this vcms article version
	*/
	@Override
	public void setExpireDate(Date expireDate) {
		_vcmsArticleVersion.setExpireDate(expireDate);
	}

	/**
	* Sets the group ID of this vcms article version.
	*
	* @param groupId the group ID of this vcms article version
	*/
	@Override
	public void setGroupId(long groupId) {
		_vcmsArticleVersion.setGroupId(groupId);
	}

	/**
	* Sets whether this vcms article version is has attachment.
	*
	* @param hasAttachment the has attachment of this vcms article version
	*/
	@Override
	public void setHasAttachment(boolean hasAttachment) {
		_vcmsArticleVersion.setHasAttachment(hasAttachment);
	}

	/**
	* Sets whether this vcms article version is has image.
	*
	* @param hasImage the has image of this vcms article version
	*/
	@Override
	public void setHasImage(boolean hasImage) {
		_vcmsArticleVersion.setHasImage(hasImage);
	}

	/**
	* Sets whether this vcms article version is has poll.
	*
	* @param hasPoll the has poll of this vcms article version
	*/
	@Override
	public void setHasPoll(boolean hasPoll) {
		_vcmsArticleVersion.setHasPoll(hasPoll);
	}

	/**
	* Sets the image of this vcms article version.
	*
	* @param image the image of this vcms article version
	*/
	@Override
	public void setImage(java.lang.String image) {
		_vcmsArticleVersion.setImage(image);
	}

	/**
	* Sets the image title of this vcms article version.
	*
	* @param imageTitle the image title of this vcms article version
	*/
	@Override
	public void setImageTitle(java.lang.String imageTitle) {
		_vcmsArticleVersion.setImageTitle(imageTitle);
	}

	/**
	* Sets the language of this vcms article version.
	*
	* @param language the language of this vcms article version
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vcmsArticleVersion.setLanguage(language);
	}

	/**
	* Sets the lead of this vcms article version.
	*
	* @param lead the lead of this vcms article version
	*/
	@Override
	public void setLead(java.lang.String lead) {
		_vcmsArticleVersion.setLead(lead);
	}

	/**
	* Sets the modified by user of this vcms article version.
	*
	* @param modifiedByUser the modified by user of this vcms article version
	*/
	@Override
	public void setModifiedByUser(java.lang.String modifiedByUser) {
		_vcmsArticleVersion.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this vcms article version.
	*
	* @param modifiedDate the modified date of this vcms article version
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vcmsArticleVersion.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsArticleVersion.setNew(n);
	}

	/**
	* Sets the poll ID of this vcms article version.
	*
	* @param pollId the poll ID of this vcms article version
	*/
	@Override
	public void setPollId(java.lang.String pollId) {
		_vcmsArticleVersion.setPollId(pollId);
	}

	/**
	* Sets the primary key of this vcms article version.
	*
	* @param primaryKey the primary key of this vcms article version
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vcmsArticleVersion.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsArticleVersion.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the published by user of this vcms article version.
	*
	* @param publishedByUser the published by user of this vcms article version
	*/
	@Override
	public void setPublishedByUser(java.lang.String publishedByUser) {
		_vcmsArticleVersion.setPublishedByUser(publishedByUser);
	}

	/**
	* Sets the published date of this vcms article version.
	*
	* @param publishedDate the published date of this vcms article version
	*/
	@Override
	public void setPublishedDate(Date publishedDate) {
		_vcmsArticleVersion.setPublishedDate(publishedDate);
	}

	/**
	* Sets the source of this vcms article version.
	*
	* @param source the source of this vcms article version
	*/
	@Override
	public void setSource(java.lang.String source) {
		_vcmsArticleVersion.setSource(source);
	}

	/**
	* Sets the status of this vcms article version.
	*
	* @param status the status of this vcms article version
	*/
	@Override
	public void setStatus(long status) {
		_vcmsArticleVersion.setStatus(status);
	}

	/**
	* Sets whether this vcms article version is sticky.
	*
	* @param sticky the sticky of this vcms article version
	*/
	@Override
	public void setSticky(boolean sticky) {
		_vcmsArticleVersion.setSticky(sticky);
	}

	/**
	* Sets the sticky expire date of this vcms article version.
	*
	* @param stickyExpireDate the sticky expire date of this vcms article version
	*/
	@Override
	public void setStickyExpireDate(Date stickyExpireDate) {
		_vcmsArticleVersion.setStickyExpireDate(stickyExpireDate);
	}

	/**
	* Sets whether this vcms article version is sticky never expired.
	*
	* @param stickyNeverExpired the sticky never expired of this vcms article version
	*/
	@Override
	public void setStickyNeverExpired(boolean stickyNeverExpired) {
		_vcmsArticleVersion.setStickyNeverExpired(stickyNeverExpired);
	}

	/**
	* Sets the title of this vcms article version.
	*
	* @param title the title of this vcms article version
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_vcmsArticleVersion.setTitle(title);
	}

	/**
	* Sets the type IDs of this vcms article version.
	*
	* @param typeIds the type IDs of this vcms article version
	*/
	@Override
	public void setTypeIds(java.lang.String typeIds) {
		_vcmsArticleVersion.setTypeIds(typeIds);
	}

	/**
	* Sets the user hit of this vcms article version.
	*
	* @param userHit the user hit of this vcms article version
	*/
	@Override
	public void setUserHit(int userHit) {
		_vcmsArticleVersion.setUserHit(userHit);
	}

	/**
	* Sets the version name of this vcms article version.
	*
	* @param versionName the version name of this vcms article version
	*/
	@Override
	public void setVersionName(java.lang.String versionName) {
		_vcmsArticleVersion.setVersionName(versionName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsArticleVersionWrapper)) {
			return false;
		}

		VcmsArticleVersionWrapper vcmsArticleVersionWrapper = (VcmsArticleVersionWrapper)obj;

		if (Objects.equals(_vcmsArticleVersion,
					vcmsArticleVersionWrapper._vcmsArticleVersion)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsArticleVersion getWrappedModel() {
		return _vcmsArticleVersion;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsArticleVersion.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsArticleVersion.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsArticleVersion.resetOriginalValues();
	}

	private final VcmsArticleVersion _vcmsArticleVersion;
}