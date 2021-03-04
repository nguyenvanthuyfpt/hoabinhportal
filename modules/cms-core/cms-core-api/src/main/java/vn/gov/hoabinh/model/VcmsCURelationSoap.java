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

import vn.gov.hoabinh.service.persistence.VcmsCURelationPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class VcmsCURelationSoap implements Serializable {
	public static VcmsCURelationSoap toSoapModel(VcmsCURelation model) {
		VcmsCURelationSoap soapModel = new VcmsCURelationSoap();

		soapModel.setCategoryId(model.getCategoryId());
		soapModel.setUserId(model.getUserId());

		return soapModel;
	}

	public static VcmsCURelationSoap[] toSoapModels(VcmsCURelation[] models) {
		VcmsCURelationSoap[] soapModels = new VcmsCURelationSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VcmsCURelationSoap[][] toSoapModels(VcmsCURelation[][] models) {
		VcmsCURelationSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VcmsCURelationSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VcmsCURelationSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VcmsCURelationSoap[] toSoapModels(List<VcmsCURelation> models) {
		List<VcmsCURelationSoap> soapModels = new ArrayList<VcmsCURelationSoap>(models.size());

		for (VcmsCURelation model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VcmsCURelationSoap[soapModels.size()]);
	}

	public VcmsCURelationSoap() {
	}

	public VcmsCURelationPK getPrimaryKey() {
		return new VcmsCURelationPK(_categoryId, _userId);
	}

	public void setPrimaryKey(VcmsCURelationPK pk) {
		setCategoryId(pk.categoryId);
		setUserId(pk.userId);
	}

	public String getCategoryId() {
		return _categoryId;
	}

	public void setCategoryId(String categoryId) {
		_categoryId = categoryId;
	}

	public String getUserId() {
		return _userId;
	}

	public void setUserId(String userId) {
		_userId = userId;
	}

	private String _categoryId;
	private String _userId;
}