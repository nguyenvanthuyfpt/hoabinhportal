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
public class VisitorTrackerSoap implements Serializable {
	public static VisitorTrackerSoap toSoapModel(VisitorTracker model) {
		VisitorTrackerSoap soapModel = new VisitorTrackerSoap();

		soapModel.setVisitorId(model.getVisitorId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setExpiredDate(model.getExpiredDate());

		return soapModel;
	}

	public static VisitorTrackerSoap[] toSoapModels(VisitorTracker[] models) {
		VisitorTrackerSoap[] soapModels = new VisitorTrackerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VisitorTrackerSoap[][] toSoapModels(VisitorTracker[][] models) {
		VisitorTrackerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VisitorTrackerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VisitorTrackerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VisitorTrackerSoap[] toSoapModels(List<VisitorTracker> models) {
		List<VisitorTrackerSoap> soapModels = new ArrayList<VisitorTrackerSoap>(models.size());

		for (VisitorTracker model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VisitorTrackerSoap[soapModels.size()]);
	}

	public VisitorTrackerSoap() {
	}

	public long getPrimaryKey() {
		return _visitorId;
	}

	public void setPrimaryKey(long pk) {
		setVisitorId(pk);
	}

	public long getVisitorId() {
		return _visitorId;
	}

	public void setVisitorId(long visitorId) {
		_visitorId = visitorId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public Date getExpiredDate() {
		return _expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		_expiredDate = expiredDate;
	}

	private long _visitorId;
	private long _companyId;
	private long _groupId;
	private Date _createdDate;
	private Date _expiredDate;
}