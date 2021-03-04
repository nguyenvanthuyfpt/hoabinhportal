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

import vn.gov.hoabinh.service.persistence.VLegalFORelPK;

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
public class VLegalFORelSoap implements Serializable {
	public static VLegalFORelSoap toSoapModel(VLegalFORel model) {
		VLegalFORelSoap soapModel = new VLegalFORelSoap();

		soapModel.setFieldId(model.getFieldId());
		soapModel.setOrgId(model.getOrgId());

		return soapModel;
	}

	public static VLegalFORelSoap[] toSoapModels(VLegalFORel[] models) {
		VLegalFORelSoap[] soapModels = new VLegalFORelSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VLegalFORelSoap[][] toSoapModels(VLegalFORel[][] models) {
		VLegalFORelSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VLegalFORelSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VLegalFORelSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VLegalFORelSoap[] toSoapModels(List<VLegalFORel> models) {
		List<VLegalFORelSoap> soapModels = new ArrayList<VLegalFORelSoap>(models.size());

		for (VLegalFORel model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VLegalFORelSoap[soapModels.size()]);
	}

	public VLegalFORelSoap() {
	}

	public VLegalFORelPK getPrimaryKey() {
		return new VLegalFORelPK(_fieldId, _orgId);
	}

	public void setPrimaryKey(VLegalFORelPK pk) {
		setFieldId(pk.fieldId);
		setOrgId(pk.orgId);
	}

	public String getFieldId() {
		return _fieldId;
	}

	public void setFieldId(String fieldId) {
		_fieldId = fieldId;
	}

	public String getOrgId() {
		return _orgId;
	}

	public void setOrgId(String orgId) {
		_orgId = orgId;
	}

	private String _fieldId;
	private String _orgId;
}