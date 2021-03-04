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
public class vdocLevelSoap implements Serializable {
	public static vdocLevelSoap toSoapModel(vdocLevel model) {
		vdocLevelSoap soapModel = new vdocLevelSoap();

		soapModel.setLevelId(model.getLevelId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setName(model.getName());
		soapModel.setDescription(model.getDescription());
		soapModel.setLanguage(model.getLanguage());
		soapModel.setPosition(model.getPosition());

		return soapModel;
	}

	public static vdocLevelSoap[] toSoapModels(vdocLevel[] models) {
		vdocLevelSoap[] soapModels = new vdocLevelSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static vdocLevelSoap[][] toSoapModels(vdocLevel[][] models) {
		vdocLevelSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new vdocLevelSoap[models.length][models[0].length];
		}
		else {
			soapModels = new vdocLevelSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static vdocLevelSoap[] toSoapModels(List<vdocLevel> models) {
		List<vdocLevelSoap> soapModels = new ArrayList<vdocLevelSoap>(models.size());

		for (vdocLevel model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new vdocLevelSoap[soapModels.size()]);
	}

	public vdocLevelSoap() {
	}

	public String getPrimaryKey() {
		return _levelId;
	}

	public void setPrimaryKey(String pk) {
		setLevelId(pk);
	}

	public String getLevelId() {
		return _levelId;
	}

	public void setLevelId(String levelId) {
		_levelId = levelId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getLanguage() {
		return _language;
	}

	public void setLanguage(String language) {
		_language = language;
	}

	public int getPosition() {
		return _position;
	}

	public void setPosition(int position) {
		_position = position;
	}

	private String _levelId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private Date _createdDate;
	private Date _modifiedDate;
	private String _name;
	private String _description;
	private String _language;
	private int _position;
}