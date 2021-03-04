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
public class VcmsArticleRatingSoap implements Serializable {
	public static VcmsArticleRatingSoap toSoapModel(VcmsArticleRating model) {
		VcmsArticleRatingSoap soapModel = new VcmsArticleRatingSoap();

		soapModel.setId(model.getId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setArticleId(model.getArticleId());
		soapModel.setRating(model.getRating());
		soapModel.setSessionId(model.getSessionId());

		return soapModel;
	}

	public static VcmsArticleRatingSoap[] toSoapModels(
		VcmsArticleRating[] models) {
		VcmsArticleRatingSoap[] soapModels = new VcmsArticleRatingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VcmsArticleRatingSoap[][] toSoapModels(
		VcmsArticleRating[][] models) {
		VcmsArticleRatingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VcmsArticleRatingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VcmsArticleRatingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VcmsArticleRatingSoap[] toSoapModels(
		List<VcmsArticleRating> models) {
		List<VcmsArticleRatingSoap> soapModels = new ArrayList<VcmsArticleRatingSoap>(models.size());

		for (VcmsArticleRating model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VcmsArticleRatingSoap[soapModels.size()]);
	}

	public VcmsArticleRatingSoap() {
	}

	public long getPrimaryKey() {
		return _Id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _Id;
	}

	public void setId(long Id) {
		_Id = Id;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public long getArticleId() {
		return _articleId;
	}

	public void setArticleId(long articleId) {
		_articleId = articleId;
	}

	public int getRating() {
		return _rating;
	}

	public void setRating(int rating) {
		_rating = rating;
	}

	public String getSessionId() {
		return _sessionId;
	}

	public void setSessionId(String sessionId) {
		_sessionId = sessionId;
	}

	private long _Id;
	private Date _createdDate;
	private long _articleId;
	private int _rating;
	private String _sessionId;
}