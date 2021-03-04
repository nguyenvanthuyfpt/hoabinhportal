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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VLegalType service. Represents a row in the &quot;VLegalType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gov.hoabinh.model.impl.VLegalTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gov.hoabinh.model.impl.VLegalTypeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalType
 * @see vn.gov.hoabinh.model.impl.VLegalTypeImpl
 * @see vn.gov.hoabinh.model.impl.VLegalTypeModelImpl
 * @generated
 */
@ProviderType
public interface VLegalTypeModel extends BaseModel<VLegalType>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a v legal type model instance should use the {@link VLegalType} interface instead.
	 */

	/**
	 * Returns the primary key of this v legal type.
	 *
	 * @return the primary key of this v legal type
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this v legal type.
	 *
	 * @param primaryKey the primary key of this v legal type
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the type ID of this v legal type.
	 *
	 * @return the type ID of this v legal type
	 */
	@AutoEscape
	public String getTypeId();

	/**
	 * Sets the type ID of this v legal type.
	 *
	 * @param typeId the type ID of this v legal type
	 */
	public void setTypeId(String typeId);

	/**
	 * Returns the group ID of this v legal type.
	 *
	 * @return the group ID of this v legal type
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this v legal type.
	 *
	 * @param groupId the group ID of this v legal type
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this v legal type.
	 *
	 * @return the company ID of this v legal type
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this v legal type.
	 *
	 * @param companyId the company ID of this v legal type
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this v legal type.
	 *
	 * @return the user ID of this v legal type
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this v legal type.
	 *
	 * @param userId the user ID of this v legal type
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this v legal type.
	 *
	 * @return the user uuid of this v legal type
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this v legal type.
	 *
	 * @param userUuid the user uuid of this v legal type
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the created date of this v legal type.
	 *
	 * @return the created date of this v legal type
	 */
	public Date getCreatedDate();

	/**
	 * Sets the created date of this v legal type.
	 *
	 * @param createdDate the created date of this v legal type
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Returns the modified date of this v legal type.
	 *
	 * @return the modified date of this v legal type
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this v legal type.
	 *
	 * @param modifiedDate the modified date of this v legal type
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the created by user of this v legal type.
	 *
	 * @return the created by user of this v legal type
	 */
	public long getCreatedByUser();

	/**
	 * Sets the created by user of this v legal type.
	 *
	 * @param createdByUser the created by user of this v legal type
	 */
	public void setCreatedByUser(long createdByUser);

	/**
	 * Returns the modified by user of this v legal type.
	 *
	 * @return the modified by user of this v legal type
	 */
	public long getModifiedByUser();

	/**
	 * Sets the modified by user of this v legal type.
	 *
	 * @param modifiedByUser the modified by user of this v legal type
	 */
	public void setModifiedByUser(long modifiedByUser);

	/**
	 * Returns the name of this v legal type.
	 *
	 * @return the name of this v legal type
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this v legal type.
	 *
	 * @param name the name of this v legal type
	 */
	public void setName(String name);

	/**
	 * Returns the description of this v legal type.
	 *
	 * @return the description of this v legal type
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this v legal type.
	 *
	 * @param description the description of this v legal type
	 */
	public void setDescription(String description);

	/**
	 * Returns the language of this v legal type.
	 *
	 * @return the language of this v legal type
	 */
	@AutoEscape
	public String getLanguage();

	/**
	 * Sets the language of this v legal type.
	 *
	 * @param language the language of this v legal type
	 */
	public void setLanguage(String language);

	/**
	 * Returns the status type of this v legal type.
	 *
	 * @return the status type of this v legal type
	 */
	public boolean getStatusType();

	/**
	 * Returns <code>true</code> if this v legal type is status type.
	 *
	 * @return <code>true</code> if this v legal type is status type; <code>false</code> otherwise
	 */
	public boolean isStatusType();

	/**
	 * Sets whether this v legal type is status type.
	 *
	 * @param statusType the status type of this v legal type
	 */
	public void setStatusType(boolean statusType);

	/**
	 * Returns the rssable of this v legal type.
	 *
	 * @return the rssable of this v legal type
	 */
	public boolean getRssable();

	/**
	 * Returns <code>true</code> if this v legal type is rssable.
	 *
	 * @return <code>true</code> if this v legal type is rssable; <code>false</code> otherwise
	 */
	public boolean isRssable();

	/**
	 * Sets whether this v legal type is rssable.
	 *
	 * @param rssable the rssable of this v legal type
	 */
	public void setRssable(boolean rssable);

	/**
	 * Returns the position of this v legal type.
	 *
	 * @return the position of this v legal type
	 */
	public int getPosition();

	/**
	 * Sets the position of this v legal type.
	 *
	 * @param position the position of this v legal type
	 */
	public void setPosition(int position);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(vn.gov.hoabinh.model.VLegalType vLegalType);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.gov.hoabinh.model.VLegalType> toCacheModel();

	@Override
	public vn.gov.hoabinh.model.VLegalType toEscapedModel();

	@Override
	public vn.gov.hoabinh.model.VLegalType toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}