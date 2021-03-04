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
public class VLegalAttachedMessageSoap implements Serializable {
	public static VLegalAttachedMessageSoap toSoapModel(
		VLegalAttachedMessage model) {
		VLegalAttachedMessageSoap soapModel = new VLegalAttachedMessageSoap();

		soapModel.setMessageId(model.getMessageId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setCreatedByUser(model.getCreatedByUser());
		soapModel.setArticleId(model.getArticleId());
		soapModel.setContent(model.getContent());
		soapModel.setReadMessage(model.getReadMessage());

		return soapModel;
	}

	public static VLegalAttachedMessageSoap[] toSoapModels(
		VLegalAttachedMessage[] models) {
		VLegalAttachedMessageSoap[] soapModels = new VLegalAttachedMessageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VLegalAttachedMessageSoap[][] toSoapModels(
		VLegalAttachedMessage[][] models) {
		VLegalAttachedMessageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VLegalAttachedMessageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VLegalAttachedMessageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VLegalAttachedMessageSoap[] toSoapModels(
		List<VLegalAttachedMessage> models) {
		List<VLegalAttachedMessageSoap> soapModels = new ArrayList<VLegalAttachedMessageSoap>(models.size());

		for (VLegalAttachedMessage model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VLegalAttachedMessageSoap[soapModels.size()]);
	}

	public VLegalAttachedMessageSoap() {
	}

	public String getPrimaryKey() {
		return _messageId;
	}

	public void setPrimaryKey(String pk) {
		setMessageId(pk);
	}

	public String getMessageId() {
		return _messageId;
	}

	public void setMessageId(String messageId) {
		_messageId = messageId;
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

	public long getCreatedByUser() {
		return _createdByUser;
	}

	public void setCreatedByUser(long createdByUser) {
		_createdByUser = createdByUser;
	}

	public String getArticleId() {
		return _articleId;
	}

	public void setArticleId(String articleId) {
		_articleId = articleId;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public boolean getReadMessage() {
		return _readMessage;
	}

	public boolean isReadMessage() {
		return _readMessage;
	}

	public void setReadMessage(boolean readMessage) {
		_readMessage = readMessage;
	}

	private String _messageId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private Date _createdDate;
	private long _createdByUser;
	private String _articleId;
	private String _content;
	private boolean _readMessage;
}