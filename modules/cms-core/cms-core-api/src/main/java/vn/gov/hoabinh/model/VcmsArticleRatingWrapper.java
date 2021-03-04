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
 * This class is a wrapper for {@link VcmsArticleRating}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleRating
 * @generated
 */
@ProviderType
public class VcmsArticleRatingWrapper implements VcmsArticleRating,
	ModelWrapper<VcmsArticleRating> {
	public VcmsArticleRatingWrapper(VcmsArticleRating vcmsArticleRating) {
		_vcmsArticleRating = vcmsArticleRating;
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsArticleRating.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsArticleRating.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("Id", getId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("articleId", getArticleId());
		attributes.put("rating", getRating());
		attributes.put("sessionId", getSessionId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long Id = (Long)attributes.get("Id");

		if (Id != null) {
			setId(Id);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Long articleId = (Long)attributes.get("articleId");

		if (articleId != null) {
			setArticleId(articleId);
		}

		Integer rating = (Integer)attributes.get("rating");

		if (rating != null) {
			setRating(rating);
		}

		String sessionId = (String)attributes.get("sessionId");

		if (sessionId != null) {
			setSessionId(sessionId);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _vcmsArticleRating.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vcmsArticleRating.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vcmsArticleRating.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vcmsArticleRating.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<vn.gov.hoabinh.model.VcmsArticleRating> toCacheModel() {
		return _vcmsArticleRating.toCacheModel();
	}

	@Override
	public int compareTo(
		vn.gov.hoabinh.model.VcmsArticleRating vcmsArticleRating) {
		return _vcmsArticleRating.compareTo(vcmsArticleRating);
	}

	/**
	* Returns the rating of this vcms article rating.
	*
	* @return the rating of this vcms article rating
	*/
	@Override
	public int getRating() {
		return _vcmsArticleRating.getRating();
	}

	@Override
	public int hashCode() {
		return _vcmsArticleRating.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vcmsArticleRating.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VcmsArticleRatingWrapper((VcmsArticleRating)_vcmsArticleRating.clone());
	}

	/**
	* Returns the session ID of this vcms article rating.
	*
	* @return the session ID of this vcms article rating
	*/
	@Override
	public java.lang.String getSessionId() {
		return _vcmsArticleRating.getSessionId();
	}

	@Override
	public java.lang.String toString() {
		return _vcmsArticleRating.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vcmsArticleRating.toXmlString();
	}

	/**
	* Returns the created date of this vcms article rating.
	*
	* @return the created date of this vcms article rating
	*/
	@Override
	public Date getCreatedDate() {
		return _vcmsArticleRating.getCreatedDate();
	}

	/**
	* Returns the article ID of this vcms article rating.
	*
	* @return the article ID of this vcms article rating
	*/
	@Override
	public long getArticleId() {
		return _vcmsArticleRating.getArticleId();
	}

	/**
	* Returns the ID of this vcms article rating.
	*
	* @return the ID of this vcms article rating
	*/
	@Override
	public long getId() {
		return _vcmsArticleRating.getId();
	}

	/**
	* Returns the primary key of this vcms article rating.
	*
	* @return the primary key of this vcms article rating
	*/
	@Override
	public long getPrimaryKey() {
		return _vcmsArticleRating.getPrimaryKey();
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleRating toEscapedModel() {
		return new VcmsArticleRatingWrapper(_vcmsArticleRating.toEscapedModel());
	}

	@Override
	public vn.gov.hoabinh.model.VcmsArticleRating toUnescapedModel() {
		return new VcmsArticleRatingWrapper(_vcmsArticleRating.toUnescapedModel());
	}

	@Override
	public void persist() {
		_vcmsArticleRating.persist();
	}

	/**
	* Sets the article ID of this vcms article rating.
	*
	* @param articleId the article ID of this vcms article rating
	*/
	@Override
	public void setArticleId(long articleId) {
		_vcmsArticleRating.setArticleId(articleId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vcmsArticleRating.setCachedModel(cachedModel);
	}

	/**
	* Sets the created date of this vcms article rating.
	*
	* @param createdDate the created date of this vcms article rating
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_vcmsArticleRating.setCreatedDate(createdDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vcmsArticleRating.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vcmsArticleRating.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vcmsArticleRating.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vcms article rating.
	*
	* @param Id the ID of this vcms article rating
	*/
	@Override
	public void setId(long Id) {
		_vcmsArticleRating.setId(Id);
	}

	@Override
	public void setNew(boolean n) {
		_vcmsArticleRating.setNew(n);
	}

	/**
	* Sets the primary key of this vcms article rating.
	*
	* @param primaryKey the primary key of this vcms article rating
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vcmsArticleRating.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vcmsArticleRating.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rating of this vcms article rating.
	*
	* @param rating the rating of this vcms article rating
	*/
	@Override
	public void setRating(int rating) {
		_vcmsArticleRating.setRating(rating);
	}

	/**
	* Sets the session ID of this vcms article rating.
	*
	* @param sessionId the session ID of this vcms article rating
	*/
	@Override
	public void setSessionId(java.lang.String sessionId) {
		_vcmsArticleRating.setSessionId(sessionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VcmsArticleRatingWrapper)) {
			return false;
		}

		VcmsArticleRatingWrapper vcmsArticleRatingWrapper = (VcmsArticleRatingWrapper)obj;

		if (Objects.equals(_vcmsArticleRating,
					vcmsArticleRatingWrapper._vcmsArticleRating)) {
			return true;
		}

		return false;
	}

	@Override
	public VcmsArticleRating getWrappedModel() {
		return _vcmsArticleRating;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vcmsArticleRating.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vcmsArticleRating.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vcmsArticleRating.resetOriginalValues();
	}

	private final VcmsArticleRating _vcmsArticleRating;
}