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

import vn.gov.hoabinh.service.persistence.VLegalDDRelPK;

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
public class VLegalDDRelSoap implements Serializable {
	public static VLegalDDRelSoap toSoapModel(VLegalDDRel model) {
		VLegalDDRelSoap soapModel = new VLegalDDRelSoap();

		soapModel.setDepartmentId(model.getDepartmentId());
		soapModel.setDocId(model.getDocId());

		return soapModel;
	}

	public static VLegalDDRelSoap[] toSoapModels(VLegalDDRel[] models) {
		VLegalDDRelSoap[] soapModels = new VLegalDDRelSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VLegalDDRelSoap[][] toSoapModels(VLegalDDRel[][] models) {
		VLegalDDRelSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VLegalDDRelSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VLegalDDRelSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VLegalDDRelSoap[] toSoapModels(List<VLegalDDRel> models) {
		List<VLegalDDRelSoap> soapModels = new ArrayList<VLegalDDRelSoap>(models.size());

		for (VLegalDDRel model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VLegalDDRelSoap[soapModels.size()]);
	}

	public VLegalDDRelSoap() {
	}

	public VLegalDDRelPK getPrimaryKey() {
		return new VLegalDDRelPK(_departmentId, _docId);
	}

	public void setPrimaryKey(VLegalDDRelPK pk) {
		setDepartmentId(pk.departmentId);
		setDocId(pk.docId);
	}

	public long getDepartmentId() {
		return _departmentId;
	}

	public void setDepartmentId(long departmentId) {
		_departmentId = departmentId;
	}

	public String getDocId() {
		return _docId;
	}

	public void setDocId(String docId) {
		_docId = docId;
	}

	private long _departmentId;
	private String _docId;
}