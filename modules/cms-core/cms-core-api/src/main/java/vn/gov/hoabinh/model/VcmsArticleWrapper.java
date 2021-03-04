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
 * This class is a wrapper for {@link VcmsArticle}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticle
 * @generated
 */
@ProviderType
public class VcmsArticleWrapper implements VcmsArticle,
	ModelWrapper<VcmsArticle> {
	public VcmsArticleWrapper(VcmsArticle vcmsArticle) {
		_vcmsArticle = vcmsArticle;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsArticle.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsArticle.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("articleId", getArticleId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("approvedByUser", getApprovedByUser());
		attributes.put("approvedDate", getApprovedDate());
		attributes.put("publishedByUser", getPublishedByUser());
		attributes.put("publishedDate", getPublishedDate());
		attributes.put("status", getStatus());
		attributes.put("title", getTitle());
		attributes.put("lead", getLead());
		attributes.put("content", getContent());
		attributes.put("version", getVersion());
		attributes.put("hasImage", getHasImage());
		attributes.put("imageTitle", getImageTitle());
		attributes.put("image", getImage());
		attributes.put("author", getAuthor());
		attributes.put("source", getSource());
		attributes.put("language", getLanguage());
		attributes.put("userHit", getUserHit());
		attributes.put("discussible", getDiscussible());
		attributes.put("hasAttachment", getHasAttachment());
		attributes.put("hasPoll", getHasPoll());
		attributes.put("pollId", getPollId());
		attributes.put("effectiveDate", getEffectiveDate());
		attributes.put("expireDate", getExpireDate());
		attributes.put("sticky", getSticky());
		attributes.put("stickyNeverExpired", getStickyNeverExpired());
		attributes.put("stickyExpireDate", getStickyExpireDate());
		attributes.put("categoryId", getCategoryId());
		attributes.put("soundLink", getSoundLink());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String articleId = (String)attributes.get("articleId");

		if (articleId != null) {
			setArticleId(articleId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String createdByUser = (String)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String modifiedByUser = (String)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String approvedByUser = (String)attributes.get("approvedByUser");

		if (approvedByUser != null) {
			setApprovedByUser(approvedByUser);
		}

		Date approvedDate = (Date)attributes.get("approvedDate");

		if (approvedDate != null) {
			setApprovedDate(approvedDate);
		}

		String publishedByUser = (String)attributes.get("publishedByUser");

		if (publishedByUser != null) {
			setPublishedByUser(publishedByUser);
		}

		Date publishedDate = (Date)attributes.get("publishedDate");

		if (publishedDate != null) {
			setPublishedDate(publishedDate);
		}

		Long status = (Long)attributes.get("status");

		if (status != null) {
			setStatus(status);
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

		Double version = (Double)attributes.get("version");

		if (version != null) {
			setVersion(version);
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

		String author = (String)attributes.get("author");

		if (author != null) {
			setAuthor(author);
		}

		String source = (String)attributes.get("source");

		if (source != null) {
			setSource(source);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Integer userHit = (Integer)attributes.get("userHit");

		if (userHit != null) {
			setUserHit(userHit);
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

		Date effectiveDate = (Date)attributes.get("effectiveDate");

		if (effectiveDate != null) {
			setEffectiveDate(effectiveDate);
		}

		Date expireDate = (Date)attributes.get("expireDate");

		if (expireDate != null) {
			setExpireDate(expireDate);
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

		Date stickyExpireDate = (Date)attributes.get("stickyExpireDate");

		if (stickyExpireDate != null) {
			setStickyExpireDate(stickyExpireDate);
		}

		String categoryId = (String)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}

		String soundLink = (String)attributes.get("soundLink");

		if (soundLink != null) {
			setSoundLink(soundLink);
		}
	}

	/**
	* Returns the discussible of this vcms article.
	*
	* @return the discussible of this vcms article
	*/
	@Override
	public boolean getDiscussible() {
		return _vcmsArticle.getDiscussible();
	}

	/**
	* Returns the has attachment of this vcms article.
	*
	* @return the has attachment of this vcms article
	*/
	@Override
	public boolean getHasAttachment() {
		return _vcmsArticle.getHasAttachment();
	}

	/**
	* Returns the has image of this vcms article.
	*
	* @return the has image of this vcms article
	*/
	@Override
	public boolean getHasImage() {
		return _vcmsArticle.getHasImage();
	}

	/**
	* Returns the has poll of this vcms article.
	*
	* @return the has poll of this vcms article
	*/
	@Override
	public boolean getHasPoll() {
		return _vcmsArticle.getHasPoll();
	}

	/**
	* Returns the sticky of this vcms article.
	*
	* @return the sticky of this vcms article
	*/
	@Override
	public boolean getSticky() {
		return _vcmsArticle.getSticky();
	}

	/**
	* Returns the sticky never expired of this vcms article.
	*
	* @return the sticky never expired of this vcms article
	*/
	@Override
	public boolean getStickyNeverExpired() {
		return _vcmsArticle.getStickyNeverExpired();
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsArticle.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this vcms article is discussible.
	*
	* @return <code>true</code> if this vcms article is discussible; <code>false</code> otherwise
	*/
	@Override
	public boolean isDiscussible() {
		return _vcmsArticle.isDiscussible();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsArticle.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this vcms article is has attachment.
	*
	* @return <code>true</code> if this vcms article is has attachment; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasAttachment() {
		return _vcmsArticle.isHasAttachment();
	}

	/**
	* Returns <code>true</code> if this vcms article is has image.
	*
	* @return <code>true</code> if this vcms article is has image; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasImage() {
		return _vcmsArticle.isHasImage();
	}

	/**
	* Returns <code>true</code> if this vcms article is has poll.
	*
	* @return <code>true</code> if this vcms article is has poll; <code>false</code> otherwise
	*/
	@Override
	public boolean isHasPoll() {
		return _vcmsArticle.isHasPoll();
	}

	@Override
	public boolean isNew() {
		return _vcmsArticle.isNew();
	}

	/**
	* Returns <code>true</code> if this vcms article is sticky.
	*
	* @return <code>true</code> if this vcms article is sticky; <code>false</code> otherwise
	*/
	@Override
	public boolean isSticky() {
		return _vcmsArticle.isSticky();
	}

	/**
	* Returns <code>true</code> if this vcms article is sticky never expired.
	*
	* @return <code>true</code> if this vcms article is sticky never expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isStickyNeverExpired() {
		return _vcmsArticle.isStickyNeverExpired();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsArticle.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsArticle> toCacheModel() {
		return _vcmsArticle.toCacheModel();
	}

	/**
	* Returns the version of this vcms article.
	*
	* @return the version of this vcms article
	*/
	@Override
	public double getVersion() {
		return _vcmsArticle.getVersion();
	}

	@Override
	public int compareTo(vn.gov.hoabinh.model.VcmsArticle vcmsArticle) {
		return _vcmsArticle.compareTo(vcmsArticle);
	}

	/**
	* Returns the user hit of this vcms article.
	*
	* @return the user hit of this vcms article
	*/
	@Override
	public int getUserHit() {
		return _vcmsArticle.getUserHit();
	}

	@Override
	public int hashCode() {
		return _vcmsArticle.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsArticle.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsArticleWrapper((VcmsArticle)_vcmsArticle.clone());
	}

	/**
	* Returns the approved by user of this vcms article.
	*
	* @return the approved by user of this vcms article
	*/
	@Override
	public java.lang.String getApprovedByUser() {
		return _vcmsArticle.getApprovedByUser();
	}

	/**
	* Returns the article ID of this vcms article.
	*
	* @return the article ID of this vcms article
	*/
	@Override
	public java.lang.String getArticleId() {
		return _vcmsArticle.getArticleId();
	}

	/**
	* Returns the author of this vcms article.
	*
	* @return the author of this vcms article
	*/
	@Override
	public java.lang.String getAuthor() {
		return _vcmsArticle.getAuthor();
	}

	/**
	* Returns the category ID of this vcms article.
	*
	* @return the category ID of this vcms article
	*/
	@Override
	public java.lang.String getCategoryId() {
		return _vcmsArticle.getCategoryId();
	}

	/**
	* Returns the content of this vcms article.
	*
	* @return the content of this vcms article
	*/
	@Override
	public java.lang.String getContent() {
		return _vcmsArticle.getContent();
	}

	/**
	* Returns the created by user of this vcms article.
	*
	* @return the created by user of this vcms article
	*/
	@Override
	public java.lang.String getCreatedByUser() {
		return _vcmsArticle.getCreatedByUser();
	}

	/**
	* Returns the image of this vcms article.
	*
	* @return the image of this vcms article
	*/
	@Override
	public java.lang.String getImage() {
		return _vcmsArticle.getImage();
	}

	/**
	* Returns the image title of this vcms article.
	*
	* @return the image title of this vcms article
	*/
	@Override
	public java.lang.String getImageTitle() {
		return _vcmsArticle.getImageTitle();
	}

	/**
	* Returns the language of this vcms article.
	*
	* @return the language of this vcms article
	*/
	@Override
	public java.lang.String getLanguage() {
		return _vcmsArticle.getLanguage();
	}

	/**
	* Returns the lead of this vcms article.
	*
	* @return the lead of this vcms article
	*/
	@Override
	public java.lang.String getLead() {
		return _vcmsArticle.getLead();
	}

	/**
	* Returns the modified by user of this vcms article.
	*
	* @return the modified by user of this vcms article
	*/
	@Override
	public java.lang.String getModifiedByUser() {
		return _vcmsArticle.getModifiedByUser();
	}

	/**
	* Returns the poll ID of this vcms article.
	*
	* @return the poll ID of this vcms article
	*/
	@Override
	public java.lang.String getPollId() {
		return _vcmsArticle.getPollId();
	}

	/**
	* Returns the primary key of this vcms article.
	*
	* @return the primary key of this vcms article
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _vcmsArticle.getPrimaryKey();
	}

	/**
	* Returns the published by user of this vcms article.
	*
	* @return the published by user of this vcms article
	*/
	@Override
	public java.lang.String getPublishedByUser() {
		return _vcmsArticle.getPublishedByUser();
	}

	/**
	* Returns the sound link of this vcms article.
	*
	* @return the sound link of this vcms article
	*/
	@Override
	public java.lang.String getSoundLink() {
		return _vcmsArticle.getSoundLink();
	}

	/**
	* Returns the source of this vcms article.
	*
	* @return the source of this vcms article
	*/
	@Override
	public java.lang.String getSource() {
		return _vcmsArticle.getSource();
	}

	/**
	* Returns the title of this vcms article.
	*
	* @return the title of this vcms article
	*/
	@Override
	public java.lang.String getTitle() {
		return _vcmsArticle.getTitle();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsArticle.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsArticle.toXmlString();
	}

	/**
	* Returns the approved date of this vcms article.
	*
	* @return the approved date of this vcms article
	*/
	@Override
	public Date getApprovedDate() {
		return _vcmsArticle.getApprovedDate();
	}

	/**
	* Returns the created date of this vcms article.
	*
	* @return the created date of this vcms article
	*/
	@Override
	public Date getCreatedDate() {
		return _vcmsArticle.getCreatedDate();
	}

	/**
	* Returns the effective date of this vcms article.
	*
	* @return the effective date of this vcms article
	*/
	@Override
	public Date getEffectiveDate() {
		return _vcmsArticle.getEffectiveDate();
	}

	/**
	* Returns the expire date of this vcms article.
	*
	* @return the expire date of this vcms article
	*/
	@Override
	public Date getExpireDate() {
		return _vcmsArticle.getExpireDate();
	}

	/**
	* Returns the modified date of this vcms article.
	*
	* @return the modified date of this vcms article
	*/
	@Override
	public Date getModifiedDate() {
		return _vcmsArticle.getModifiedDate();
	}

	/**
	* Returns the published date of this vcms article.
	*
	* @return the published date of this vcms article
	*/
	@Override
	public Date getPublishedDate() {
		return _vcmsArticle.getPublishedDate();
	}

	/**
	* Returns the sticky expire date of this vcms article.
	*
	* @return the sticky expire date of this vcms article
	*/
	@Override
	public Date getStickyExpireDate() {
		return _vcmsArticle.getStickyExpireDate();
	}

	/**
	* Returns the company ID of this vcms article.
	*
	* @return the company ID of this vcms article
	*/
	@Override
	public long getCompanyId() {
		return _vcmsArticle.getCompanyId();
	}

	/**
	* Returns the group ID of this vcms article.
	*
	* @return the group ID of this vcms article
	*/
	@Override
	public long getGroupId() {
		return _vcmsArticle.getGroupId();
	}

	/**
	* Returns the status of this vcms article.
	*
	* @return the status of this vcms article
	*/
	@Override
	public long getStatus() {
		return _vcmsArticle.getStatus();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticle toEscapedModel() {
		return new VcmsArticleWrapper(_vcmsArticle.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticle toUnescapedModel() {
		return new VcmsArticleWrapper(_vcmsArticle.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vcmsArticle.persist();
	}

	/**
	* Sets the approved by user of this vcms article.
	*
	* @param approvedByUser the approved by user of this vcms article
	*/
	@Override
	public void setApprovedByUser(java.lang.String approvedByUser) {
		_vcmsArticle.setApprovedByUser(approvedByUser);
	}

	/**
	* Sets the approved date of this vcms article.
	*
	* @param approvedDate the approved date of this vcms article
	*/
	@Override
	public void setApprovedDate(Date approvedDate) {
		_vcmsArticle.setApprovedDate(approvedDate);
	}

	/**
	* Sets the article ID of this vcms article.
	*
	* @param articleId the article ID of this vcms article
	*/
	@Override
	public void setArticleId(java.lang.String articleId) {
		_vcmsArticle.setArticleId(articleId);
	}

	/**
	* Sets the author of this vcms article.
	*
	* @param author the author of this vcms article
	*/
	@Override
	public void setAuthor(java.lang.String author) {
		_vcmsArticle.setAuthor(author);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsArticle.setCachedModel(cachedModel);
	}

	/**
	* Sets the category ID of this vcms article.
	*
	* @param categoryId the category ID of this vcms article
	*/
	@Override
	public void setCategoryId(java.lang.String categoryId) {
		_vcmsArticle.setCategoryId(categoryId);
	}

	/**
	* Sets the company ID of this vcms article.
	*
	* @param companyId the company ID of this vcms article
	*/
	@Override
	public void setCompanyId(long companyId) {
		_vcmsArticle.setCompanyId(companyId);
	}

	/**
	* Sets the content of this vcms article.
	*
	* @param content the content of this vcms article
	*/
	@Override
	public void setContent(java.lang.String content) {
		_vcmsArticle.setContent(content);
	}

	/**
	* Sets the created by user of this vcms article.
	*
	* @param createdByUser the created by user of this vcms article
	*/
	@Override
	public void setCreatedByUser(java.lang.String createdByUser) {
		_vcmsArticle.setCreatedByUser(createdByUser);
	}

	/**
	* Sets the created date of this vcms article.
	*
	* @param createdDate the created date of this vcms article
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vcmsArticle.setCreatedDate(createdDate);
	}

	/**
	* Sets whether this vcms article is discussible.
	*
	* @param discussible the discussible of this vcms article
	*/
	@Override
	public void setDiscussible(boolean discussible) {
		_vcmsArticle.setDiscussible(discussible);
	}

	/**
	* Sets the effective date of this vcms article.
	*
	* @param effectiveDate the effective date of this vcms article
	*/
	@Override
	public void setEffectiveDate(Date effectiveDate) {
		_vcmsArticle.setEffectiveDate(effectiveDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsArticle.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsArticle.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsArticle.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expire date of this vcms article.
	*
	* @param expireDate the expire date of this vcms article
	*/
	@Override
	public void setExpireDate(Date expireDate) {
		_vcmsArticle.setExpireDate(expireDate);
	}

	/**
	* Sets the group ID of this vcms article.
	*
	* @param groupId the group ID of this vcms article
	*/
	@Override
	public void setGroupId(long groupId) {
		_vcmsArticle.setGroupId(groupId);
	}

	/**
	* Sets whether this vcms article is has attachment.
	*
	* @param hasAttachment the has attachment of this vcms article
	*/
	@Override
	public void setHasAttachment(boolean hasAttachment) {
		_vcmsArticle.setHasAttachment(hasAttachment);
	}

	/**
	* Sets whether this vcms article is has image.
	*
	* @param hasImage the has image of this vcms article
	*/
	@Override
	public void setHasImage(boolean hasImage) {
		_vcmsArticle.setHasImage(hasImage);
	}

	/**
	* Sets whether this vcms article is has poll.
	*
	* @param hasPoll the has poll of this vcms article
	*/
	@Override
	public void setHasPoll(boolean hasPoll) {
		_vcmsArticle.setHasPoll(hasPoll);
	}

	/**
	* Sets the image of this vcms article.
	*
	* @param image the image of this vcms article
	*/
	@Override
	public void setImage(java.lang.String image) {
		_vcmsArticle.setImage(image);
	}

	/**
	* Sets the image title of this vcms article.
	*
	* @param imageTitle the image title of this vcms article
	*/
	@Override
	public void setImageTitle(java.lang.String imageTitle) {
		_vcmsArticle.setImageTitle(imageTitle);
	}

	/**
	* Sets the language of this vcms article.
	*
	* @param language the language of this vcms article
	*/
	@Override
	public void setLanguage(java.lang.String language) {
		_vcmsArticle.setLanguage(language);
	}

	/**
	* Sets the lead of this vcms article.
	*
	* @param lead the lead of this vcms article
	*/
	@Override
	public void setLead(java.lang.String lead) {
		_vcmsArticle.setLead(lead);
	}

	/**
	* Sets the modified by user of this vcms article.
	*
	* @param modifiedByUser the modified by user of this vcms article
	*/
	@Override
	public void setModifiedByUser(java.lang.String modifiedByUser) {
		_vcmsArticle.setModifiedByUser(modifiedByUser);
	}

	/**
	* Sets the modified date of this vcms article.
	*
	* @param modifiedDate the modified date of this vcms article
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_vcmsArticle.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsArticle.setNew(n);
	}

	/**
	* Sets the poll ID of this vcms article.
	*
	* @param pollId the poll ID of this vcms article
	*/
	@Override
	public void setPollId(java.lang.String pollId) {
		_vcmsArticle.setPollId(pollId);
	}

	/**
	* Sets the primary key of this vcms article.
	*
	* @param primaryKey the primary key of this vcms article
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_vcmsArticle.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsArticle.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the published by user of this vcms article.
	*
	* @param publishedByUser the published by user of this vcms article
	*/
	@Override
	public void setPublishedByUser(java.lang.String publishedByUser) {
		_vcmsArticle.setPublishedByUser(publishedByUser);
	}

	/**
	* Sets the published date of this vcms article.
	*
	* @param publishedDate the published date of this vcms article
	*/
	@Override
	public void setPublishedDate(Date publishedDate) {
		_vcmsArticle.setPublishedDate(publishedDate);
	}

	/**
	* Sets the sound link of this vcms article.
	*
	* @param soundLink the sound link of this vcms article
	*/
	@Override
	public void setSoundLink(java.lang.String soundLink) {
		_vcmsArticle.setSoundLink(soundLink);
	}

	/**
	* Sets the source of this vcms article.
	*
	* @param source the source of this vcms article
	*/
	@Override
	public void setSource(java.lang.String source) {
		_vcmsArticle.setSource(source);
	}

	/**
	* Sets the status of this vcms article.
	*
	* @param status the status of this vcms article
	*/
	@Override
	public void setStatus(long status) {
		_vcmsArticle.setStatus(status);
	}

	/**
	* Sets whether this vcms article is sticky.
	*
	* @param sticky the sticky of this vcms article
	*/
	@Override
	public void setSticky(boolean sticky) {
		_vcmsArticle.setSticky(sticky);
	}

	/**
	* Sets the sticky expire date of this vcms article.
	*
	* @param stickyExpireDate the sticky expire date of this vcms article
	*/
	@Override
	public void setStickyExpireDate(Date stickyExpireDate) {
		_vcmsArticle.setStickyExpireDate(stickyExpireDate);
	}

	/**
	* Sets whether this vcms article is sticky never expired.
	*
	* @param stickyNeverExpired the sticky never expired of this vcms article
	*/
	@Override
	public void setStickyNeverExpired(boolean stickyNeverExpired) {
		_vcmsArticle.setStickyNeverExpired(stickyNeverExpired);
	}

	/**
	* Sets the title of this vcms article.
	*
	* @param title the title of this vcms article
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_vcmsArticle.setTitle(title);
	}

	/**
	* Sets the user hit of this vcms article.
	*
	* @param userHit the user hit of this vcms article
	*/
	@Override
	public void setUserHit(int userHit) {
		_vcmsArticle.setUserHit(userHit);
	}

	/**
	* Sets the version of this vcms article.
	*
	* @param version the version of this vcms article
	*/
	@Override
	public void setVersion(double version) {
		_vcmsArticle.setVersion(version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsArticleWrapper)) {
			return false;
		}

		VcmsArticleWrapper vcmsArticleWrapper = (VcmsArticleWrapper)obj;

		if (Objects.equals(_vcmsArticle, vcmsArticleWrapper._vcmsArticle)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsArticle getWrappedModel() {
		return _vcmsArticle;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsArticle.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsArticle.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsArticle.resetOriginalValues();
	}

	private final VcmsArticle _vcmsArticle;
}