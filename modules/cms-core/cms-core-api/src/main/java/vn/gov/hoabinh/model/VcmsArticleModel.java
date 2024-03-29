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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VcmsArticle service. Represents a row in the &quot;VcmsArticle&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gov.hoabinh.model.impl.VcmsArticleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gov.hoabinh.model.impl.VcmsArticleImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticle
 * @see vn.gov.hoabinh.model.impl.VcmsArticleImpl
 * @see vn.gov.hoabinh.model.impl.VcmsArticleModelImpl
 * @generated
 */
@ProviderType
public interface VcmsArticleModel extends BaseModel<VcmsArticle>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vcms article model instance should use the {@link VcmsArticle} interface instead.
	 */

	/**
	 * Returns the primary key of this vcms article.
	 *
	 * @return the primary key of this vcms article
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this vcms article.
	 *
	 * @param primaryKey the primary key of this vcms article
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the article ID of this vcms article.
	 *
	 * @return the article ID of this vcms article
	 */
	@AutoEscape
	public String getArticleId();

	/**
	 * Sets the article ID of this vcms article.
	 *
	 * @param articleId the article ID of this vcms article
	 */
	public void setArticleId(String articleId);

	/**
	 * Returns the group ID of this vcms article.
	 *
	 * @return the group ID of this vcms article
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this vcms article.
	 *
	 * @param groupId the group ID of this vcms article
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this vcms article.
	 *
	 * @return the company ID of this vcms article
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this vcms article.
	 *
	 * @param companyId the company ID of this vcms article
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the created by user of this vcms article.
	 *
	 * @return the created by user of this vcms article
	 */
	@AutoEscape
	public String getCreatedByUser();

	/**
	 * Sets the created by user of this vcms article.
	 *
	 * @param createdByUser the created by user of this vcms article
	 */
	public void setCreatedByUser(String createdByUser);

	/**
	 * Returns the created date of this vcms article.
	 *
	 * @return the created date of this vcms article
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this vcms article.
	 *
	 * @param createdDate the created date of this vcms article
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the modified by user of this vcms article.
	 *
	 * @return the modified by user of this vcms article
	 */
	@AutoEscape
	public String getModifiedByUser();

	/**
	 * Sets the modified by user of this vcms article.
	 *
	 * @param modifiedByUser the modified by user of this vcms article
	 */
	public void setModifiedByUser(String modifiedByUser);

	/**
	 * Returns the modified date of this vcms article.
	 *
	 * @return the modified date of this vcms article
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this vcms article.
	 *
	 * @param modifiedDate the modified date of this vcms article
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the approved by user of this vcms article.
	 *
	 * @return the approved by user of this vcms article
	 */
	@AutoEscape
	public String getApprovedByUser();

	/**
	 * Sets the approved by user of this vcms article.
	 *
	 * @param approvedByUser the approved by user of this vcms article
	 */
	public void setApprovedByUser(String approvedByUser);

	/**
	 * Returns the approved date of this vcms article.
	 *
	 * @return the approved date of this vcms article
	 */
	public Date getApprovedDate();

	/**
	 * Sets the approved date of this vcms article.
	 *
	 * @param approvedDate the approved date of this vcms article
	 */
	public void setApprovedDate(Date approvedDate);

	/**
	 * Returns the published by user of this vcms article.
	 *
	 * @return the published by user of this vcms article
	 */
	@AutoEscape
	public String getPublishedByUser();

	/**
	 * Sets the published by user of this vcms article.
	 *
	 * @param publishedByUser the published by user of this vcms article
	 */
	public void setPublishedByUser(String publishedByUser);

	/**
	 * Returns the published date of this vcms article.
	 *
	 * @return the published date of this vcms article
	 */
	public Date getPublishedDate();

	/**
	 * Sets the published date of this vcms article.
	 *
	 * @param publishedDate the published date of this vcms article
	 */
	public void setPublishedDate(Date publishedDate);

	/**
	 * Returns the status of this vcms article.
	 *
	 * @return the status of this vcms article
	 */
	public long getStatus();

	/**
	 * Sets the status of this vcms article.
	 *
	 * @param status the status of this vcms article
	 */
	public void setStatus(long status);

	/**
	 * Returns the title of this vcms article.
	 *
	 * @return the title of this vcms article
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this vcms article.
	 *
	 * @param title the title of this vcms article
	 */
	public void setTitle(String title);

	/**
	 * Returns the lead of this vcms article.
	 *
	 * @return the lead of this vcms article
	 */
	@AutoEscape
	public String getLead();

	/**
	 * Sets the lead of this vcms article.
	 *
	 * @param lead the lead of this vcms article
	 */
	public void setLead(String lead);

	/**
	 * Returns the content of this vcms article.
	 *
	 * @return the content of this vcms article
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this vcms article.
	 *
	 * @param content the content of this vcms article
	 */
	public void setContent(String content);

	/**
	 * Returns the version of this vcms article.
	 *
	 * @return the version of this vcms article
	 */
	public double getVersion();

	/**
	 * Sets the version of this vcms article.
	 *
	 * @param version the version of this vcms article
	 */
	public void setVersion(double version);

	/**
	 * Returns the has image of this vcms article.
	 *
	 * @return the has image of this vcms article
	 */
	public boolean getHasImage();

	/**
	 * Returns <code>true</code> if this vcms article is has image.
	 *
	 * @return <code>true</code> if this vcms article is has image; <code>false</code> otherwise
	 */
	public boolean isHasImage();

	/**
	 * Sets whether this vcms article is has image.
	 *
	 * @param hasImage the has image of this vcms article
	 */
	public void setHasImage(boolean hasImage);

	/**
	 * Returns the image title of this vcms article.
	 *
	 * @return the image title of this vcms article
	 */
	@AutoEscape
	public String getImageTitle();

	/**
	 * Sets the image title of this vcms article.
	 *
	 * @param imageTitle the image title of this vcms article
	 */
	public void setImageTitle(String imageTitle);

	/**
	 * Returns the image of this vcms article.
	 *
	 * @return the image of this vcms article
	 */
	@AutoEscape
	public String getImage();

	/**
	 * Sets the image of this vcms article.
	 *
	 * @param image the image of this vcms article
	 */
	public void setImage(String image);

	/**
	 * Returns the author of this vcms article.
	 *
	 * @return the author of this vcms article
	 */
	@AutoEscape
	public String getAuthor();

	/**
	 * Sets the author of this vcms article.
	 *
	 * @param author the author of this vcms article
	 */
	public void setAuthor(String author);

	/**
	 * Returns the source of this vcms article.
	 *
	 * @return the source of this vcms article
	 */
	@AutoEscape
	public String getSource();

	/**
	 * Sets the source of this vcms article.
	 *
	 * @param source the source of this vcms article
	 */
	public void setSource(String source);

	/**
	 * Returns the language of this vcms article.
	 *
	 * @return the language of this vcms article
	 */
	@AutoEscape
	public String getLanguage();

	/**
	 * Sets the language of this vcms article.
	 *
	 * @param language the language of this vcms article
	 */
	public void setLanguage(String language);

	/**
	 * Returns the user hit of this vcms article.
	 *
	 * @return the user hit of this vcms article
	 */
	public int getUserHit();

	/**
	 * Sets the user hit of this vcms article.
	 *
	 * @param userHit the user hit of this vcms article
	 */
	public void setUserHit(int userHit);

	/**
	 * Returns the discussible of this vcms article.
	 *
	 * @return the discussible of this vcms article
	 */
	public boolean getDiscussible();

	/**
	 * Returns <code>true</code> if this vcms article is discussible.
	 *
	 * @return <code>true</code> if this vcms article is discussible; <code>false</code> otherwise
	 */
	public boolean isDiscussible();

	/**
	 * Sets whether this vcms article is discussible.
	 *
	 * @param discussible the discussible of this vcms article
	 */
	public void setDiscussible(boolean discussible);

	/**
	 * Returns the has attachment of this vcms article.
	 *
	 * @return the has attachment of this vcms article
	 */
	public boolean getHasAttachment();

	/**
	 * Returns <code>true</code> if this vcms article is has attachment.
	 *
	 * @return <code>true</code> if this vcms article is has attachment; <code>false</code> otherwise
	 */
	public boolean isHasAttachment();

	/**
	 * Sets whether this vcms article is has attachment.
	 *
	 * @param hasAttachment the has attachment of this vcms article
	 */
	public void setHasAttachment(boolean hasAttachment);

	/**
	 * Returns the has poll of this vcms article.
	 *
	 * @return the has poll of this vcms article
	 */
	public boolean getHasPoll();

	/**
	 * Returns <code>true</code> if this vcms article is has poll.
	 *
	 * @return <code>true</code> if this vcms article is has poll; <code>false</code> otherwise
	 */
	public boolean isHasPoll();

	/**
	 * Sets whether this vcms article is has poll.
	 *
	 * @param hasPoll the has poll of this vcms article
	 */
	public void setHasPoll(boolean hasPoll);

	/**
	 * Returns the poll ID of this vcms article.
	 *
	 * @return the poll ID of this vcms article
	 */
	@AutoEscape
	public String getPollId();

	/**
	 * Sets the poll ID of this vcms article.
	 *
	 * @param pollId the poll ID of this vcms article
	 */
	public void setPollId(String pollId);

	/**
	 * Returns the effective date of this vcms article.
	 *
	 * @return the effective date of this vcms article
	 */
	public Date getEffectiveDate();

	/**
	 * Sets the effective date of this vcms article.
	 *
	 * @param effectiveDate the effective date of this vcms article
	 */
	public void setEffectiveDate(Date effectiveDate);

	/**
	 * Returns the expire date of this vcms article.
	 *
	 * @return the expire date of this vcms article
	 */
	public Date getExpireDate();

	/**
	 * Sets the expire date of this vcms article.
	 *
	 * @param expireDate the expire date of this vcms article
	 */
	public void setExpireDate(Date expireDate);

	/**
	 * Returns the sticky of this vcms article.
	 *
	 * @return the sticky of this vcms article
	 */
	public boolean getSticky();

	/**
	 * Returns <code>true</code> if this vcms article is sticky.
	 *
	 * @return <code>true</code> if this vcms article is sticky; <code>false</code> otherwise
	 */
	public boolean isSticky();

	/**
	 * Sets whether this vcms article is sticky.
	 *
	 * @param sticky the sticky of this vcms article
	 */
	public void setSticky(boolean sticky);

	/**
	 * Returns the sticky never expired of this vcms article.
	 *
	 * @return the sticky never expired of this vcms article
	 */
	public boolean getStickyNeverExpired();

	/**
	 * Returns <code>true</code> if this vcms article is sticky never expired.
	 *
	 * @return <code>true</code> if this vcms article is sticky never expired; <code>false</code> otherwise
	 */
	public boolean isStickyNeverExpired();

	/**
	 * Sets whether this vcms article is sticky never expired.
	 *
	 * @param stickyNeverExpired the sticky never expired of this vcms article
	 */
	public void setStickyNeverExpired(boolean stickyNeverExpired);

	/**
	 * Returns the sticky expire date of this vcms article.
	 *
	 * @return the sticky expire date of this vcms article
	 */
	public Date getStickyExpireDate();

	/**
	 * Sets the sticky expire date of this vcms article.
	 *
	 * @param stickyExpireDate the sticky expire date of this vcms article
	 */
	public void setStickyExpireDate(Date stickyExpireDate);

	/**
	 * Returns the category ID of this vcms article.
	 *
	 * @return the category ID of this vcms article
	 */
	@AutoEscape
	public String getCategoryId();

	/**
	 * Sets the category ID of this vcms article.
	 *
	 * @param categoryId the category ID of this vcms article
	 */
	public void setCategoryId(String categoryId);

	/**
	 * Returns the sound link of this vcms article.
	 *
	 * @return the sound link of this vcms article
	 */
	@AutoEscape
	public String getSoundLink();

	/**
	 * Sets the sound link of this vcms article.
	 *
	 * @param soundLink the sound link of this vcms article
	 */
	public void setSoundLink(String soundLink);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(vn.gov.hoabinh.model.VcmsArticle vcmsArticle);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.gov.hoabinh.model.VcmsArticle> toCacheModel();

	@Override
	public vn.gov.hoabinh.model.VcmsArticle toEscapedModel();

	@Override
	public vn.gov.hoabinh.model.VcmsArticle toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}