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

import vn.gov.hoabinh.service.persistence.VLegalDSRelPK;

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
public class VLegalDSRelSoap implements Serializable {
	public static VLegalDSRelSoap toSoapModel(VLegalDSRel model) {
		VLegalDSRelSoap soapModel = new VLegalDSRelSoap();

		soapModel.setSigId(model.getSigId());
		soapModel.setDocId(model.getDocId());

		return soapModel;
	}

	public static VLegalDSRelSoap[] toSoapModels(VLegalDSRel[] models) {
		VLegalDSRelSoap[] soapModels = new VLegalDSRelSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VLegalDSRelSoap[][] toSoapModels(VLegalDSRel[][] models) {
		VLegalDSRelSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VLegalDSRelSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VLegalDSRelSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VLegalDSRelSoap[] toSoapModels(List<VLegalDSRel> models) {
		List<VLegalDSRelSoap> soapModels = new ArrayList<VLegalDSRelSoap>(models.size());

		for (VLegalDSRel model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VLegalDSRelSoap[soapModels.size()]);
	}

	public VLegalDSRelSoap() {
	}

	public VLegalDSRelPK getPrimaryKey() {
		return new VLegalDSRelPK(_sigId, _docId);
	}

	public void setPrimaryKey(VLegalDSRelPK pk) {
		setSigId(pk.sigId);
		setDocId(pk.docId);
	}

	public String getSigId() {
		return _sigId;
	}

	public void setSigId(String sigId) {
		_sigId = sigId;
	}

	public String getDocId() {
		return _docId;
	}

	public void setDocId(String docId) {
		_docId = docId;
	}

	private String _sigId;
	private String _docId;
}