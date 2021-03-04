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

import vn.gov.hoabinh.service.persistence.VLegalFTRelPK;

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
public class VLegalFTRelSoap implements Serializable {
	public static VLegalFTRelSoap toSoapModel(VLegalFTRel model) {
		VLegalFTRelSoap soapModel = new VLegalFTRelSoap();

		soapModel.setFieldId(model.getFieldId());
		soapModel.setTypeId(model.getTypeId());

		return soapModel;
	}

	public static VLegalFTRelSoap[] toSoapModels(VLegalFTRel[] models) {
		VLegalFTRelSoap[] soapModels = new VLegalFTRelSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VLegalFTRelSoap[][] toSoapModels(VLegalFTRel[][] models) {
		VLegalFTRelSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VLegalFTRelSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VLegalFTRelSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VLegalFTRelSoap[] toSoapModels(List<VLegalFTRel> models) {
		List<VLegalFTRelSoap> soapModels = new ArrayList<VLegalFTRelSoap>(models.size());

		for (VLegalFTRel model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VLegalFTRelSoap[soapModels.size()]);
	}

	public VLegalFTRelSoap() {
	}

	public VLegalFTRelPK getPrimaryKey() {
		return new VLegalFTRelPK(_fieldId, _typeId);
	}

	public void setPrimaryKey(VLegalFTRelPK pk) {
		setFieldId(pk.fieldId);
		setTypeId(pk.typeId);
	}

	public String getFieldId() {
		return _fieldId;
	}

	public void setFieldId(String fieldId) {
		_fieldId = fieldId;
	}

	public String getTypeId() {
		return _typeId;
	}

	public void setTypeId(String typeId) {
		_typeId = typeId;
	}

	private String _fieldId;
	private String _typeId;
}