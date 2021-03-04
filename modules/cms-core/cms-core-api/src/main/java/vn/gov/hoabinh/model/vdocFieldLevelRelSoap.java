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

import vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPK;

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
public class vdocFieldLevelRelSoap implements Serializable {
	public static vdocFieldLevelRelSoap toSoapModel(vdocFieldLevelRel model) {
		vdocFieldLevelRelSoap soapModel = new vdocFieldLevelRelSoap();

		soapModel.setFieldId(model.getFieldId());
		soapModel.setLevelId(model.getLevelId());

		return soapModel;
	}

	public static vdocFieldLevelRelSoap[] toSoapModels(
		vdocFieldLevelRel[] models) {
		vdocFieldLevelRelSoap[] soapModels = new vdocFieldLevelRelSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static vdocFieldLevelRelSoap[][] toSoapModels(
		vdocFieldLevelRel[][] models) {
		vdocFieldLevelRelSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new vdocFieldLevelRelSoap[models.length][models[0].length];
		}
		else {
			soapModels = new vdocFieldLevelRelSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static vdocFieldLevelRelSoap[] toSoapModels(
		List<vdocFieldLevelRel> models) {
		List<vdocFieldLevelRelSoap> soapModels = new ArrayList<vdocFieldLevelRelSoap>(models.size());

		for (vdocFieldLevelRel model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new vdocFieldLevelRelSoap[soapModels.size()]);
	}

	public vdocFieldLevelRelSoap() {
	}

	public vdocFieldLevelRelPK getPrimaryKey() {
		return new vdocFieldLevelRelPK(_fieldId, _levelId);
	}

	public void setPrimaryKey(vdocFieldLevelRelPK pk) {
		setFieldId(pk.fieldId);
		setLevelId(pk.levelId);
	}

	public String getFieldId() {
		return _fieldId;
	}

	public void setFieldId(String fieldId) {
		_fieldId = fieldId;
	}

	public String getLevelId() {
		return _levelId;
	}

	public void setLevelId(String levelId) {
		_levelId = levelId;
	}

	private String _fieldId;
	private String _levelId;
}