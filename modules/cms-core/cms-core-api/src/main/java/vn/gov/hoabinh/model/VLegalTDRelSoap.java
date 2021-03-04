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

import vn.gov.hoabinh.service.persistence.VLegalTDRelPK;

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
public class VLegalTDRelSoap implements Serializable {
	public static VLegalTDRelSoap toSoapModel(VLegalTDRel model) {
		VLegalTDRelSoap soapModel = new VLegalTDRelSoap();

		soapModel.setDocId(model.getDocId());
		soapModel.setTagId(model.getTagId());

		return soapModel;
	}

	public static VLegalTDRelSoap[] toSoapModels(VLegalTDRel[] models) {
		VLegalTDRelSoap[] soapModels = new VLegalTDRelSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VLegalTDRelSoap[][] toSoapModels(VLegalTDRel[][] models) {
		VLegalTDRelSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VLegalTDRelSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VLegalTDRelSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VLegalTDRelSoap[] toSoapModels(List<VLegalTDRel> models) {
		List<VLegalTDRelSoap> soapModels = new ArrayList<VLegalTDRelSoap>(models.size());

		for (VLegalTDRel model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VLegalTDRelSoap[soapModels.size()]);
	}

	public VLegalTDRelSoap() {
	}

	public VLegalTDRelPK getPrimaryKey() {
		return new VLegalTDRelPK(_docId, _tagId);
	}

	public void setPrimaryKey(VLegalTDRelPK pk) {
		setDocId(pk.docId);
		setTagId(pk.tagId);
	}

	public String getDocId() {
		return _docId;
	}

	public void setDocId(String docId) {
		_docId = docId;
	}

	public String getTagId() {
		return _tagId;
	}

	public void setTagId(String tagId) {
		_tagId = tagId;
	}

	private String _docId;
	private String _tagId;
}