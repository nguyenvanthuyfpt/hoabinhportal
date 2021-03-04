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

import vn.gov.hoabinh.service.persistence.VLegalDURelPK;

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
public class VLegalDURelSoap implements Serializable {
	public static VLegalDURelSoap toSoapModel(VLegalDURel model) {
		VLegalDURelSoap soapModel = new VLegalDURelSoap();

		soapModel.setDepartmentId(model.getDepartmentId());
		soapModel.setUserid(model.getUserid());

		return soapModel;
	}

	public static VLegalDURelSoap[] toSoapModels(VLegalDURel[] models) {
		VLegalDURelSoap[] soapModels = new VLegalDURelSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VLegalDURelSoap[][] toSoapModels(VLegalDURel[][] models) {
		VLegalDURelSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VLegalDURelSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VLegalDURelSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VLegalDURelSoap[] toSoapModels(List<VLegalDURel> models) {
		List<VLegalDURelSoap> soapModels = new ArrayList<VLegalDURelSoap>(models.size());

		for (VLegalDURel model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VLegalDURelSoap[soapModels.size()]);
	}

	public VLegalDURelSoap() {
	}

	public VLegalDURelPK getPrimaryKey() {
		return new VLegalDURelPK(_departmentId, _userid);
	}

	public void setPrimaryKey(VLegalDURelPK pk) {
		setDepartmentId(pk.departmentId);
		setUserid(pk.userid);
	}

	public long getDepartmentId() {
		return _departmentId;
	}

	public void setDepartmentId(long departmentId) {
		_departmentId = departmentId;
	}

	public long getUserid() {
		return _userid;
	}

	public void setUserid(long userid) {
		_userid = userid;
	}

	private long _departmentId;
	private long _userid;
}