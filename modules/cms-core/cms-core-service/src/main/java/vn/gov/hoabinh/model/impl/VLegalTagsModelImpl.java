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

package vn.gov.hoabinh.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import vn.gov.hoabinh.model.VLegalTags;
import vn.gov.hoabinh.model.VLegalTagsModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VLegalTags service. Represents a row in the &quot;VLegalTags&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VLegalTagsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VLegalTagsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalTagsImpl
 * @see VLegalTags
 * @see VLegalTagsModel
 * @generated
 */
@ProviderType
public class VLegalTagsModelImpl extends BaseModelImpl<VLegalTags>
	implements VLegalTagsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a v legal tags model instance should use the {@link VLegalTags} interface instead.
	 */
	public static final String TABLE_NAME = "VLegalTags";
	public static final Object[][] TABLE_COLUMNS = {
			{ "tagId", Types.VARCHAR },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createdDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR },
			{ "statusTags", Types.BOOLEAN }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("tagId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createdDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("statusTags", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE = "create table VLegalTags (tagId VARCHAR(75) not null primary key,groupId LONG,companyId LONG,userId LONG,createdDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,statusTags BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table VLegalTags";
	public static final String ORDER_BY_JPQL = " ORDER BY vLegalTags.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY VLegalTags.name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gov.hoabinh.model.VLegalTags"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gov.hoabinh.model.VLegalTags"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gov.hoabinh.model.VLegalTags"),
			true);
	public static final long GROUPID_COLUMN_BITMASK = 1L;
	public static final long STATUSTAGS_COLUMN_BITMASK = 2L;
	public static final long NAME_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(vn.gov.hoabinh.service.util.ServiceProps.get(
				"lock.expiration.time.vn.gov.hoabinh.model.VLegalTags"));

	public VLegalTagsModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _tagId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setTagId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tagId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return VLegalTags.class;
	}

	@Override
	public String getModelClassName() {
		return VLegalTags.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tagId", getTagId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("statusTags", getStatusTags());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String tagId = (String)attributes.get("tagId");

		if (tagId != null) {
			setTagId(tagId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Boolean statusTags = (Boolean)attributes.get("statusTags");

		if (statusTags != null) {
			setStatusTags(statusTags);
		}
	}

	@Override
	public String getTagId() {
		if (_tagId == null) {
			return StringPool.BLANK;
		}
		else {
			return _tagId;
		}
	}

	@Override
	public void setTagId(String tagId) {
		_tagId = tagId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask = -1L;

		_name = name;
	}

	@Override
	public boolean getStatusTags() {
		return _statusTags;
	}

	@Override
	public boolean isStatusTags() {
		return _statusTags;
	}

	@Override
	public void setStatusTags(boolean statusTags) {
		_columnBitmask |= STATUSTAGS_COLUMN_BITMASK;

		if (!_setOriginalStatusTags) {
			_setOriginalStatusTags = true;

			_originalStatusTags = _statusTags;
		}

		_statusTags = statusTags;
	}

	public boolean getOriginalStatusTags() {
		return _originalStatusTags;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public VLegalTags toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VLegalTags)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VLegalTagsImpl vLegalTagsImpl = new VLegalTagsImpl();

		vLegalTagsImpl.setTagId(getTagId());
		vLegalTagsImpl.setGroupId(getGroupId());
		vLegalTagsImpl.setCompanyId(getCompanyId());
		vLegalTagsImpl.setUserId(getUserId());
		vLegalTagsImpl.setCreatedDate(getCreatedDate());
		vLegalTagsImpl.setModifiedDate(getModifiedDate());
		vLegalTagsImpl.setName(getName());
		vLegalTagsImpl.setStatusTags(getStatusTags());

		vLegalTagsImpl.resetOriginalValues();

		return vLegalTagsImpl;
	}

	@Override
	public int compareTo(VLegalTags vLegalTags) {
		int value = 0;

		value = getName().compareTo(vLegalTags.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VLegalTags)) {
			return false;
		}

		VLegalTags vLegalTags = (VLegalTags)obj;

		String primaryKey = vLegalTags.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		VLegalTagsModelImpl vLegalTagsModelImpl = this;

		vLegalTagsModelImpl._originalGroupId = vLegalTagsModelImpl._groupId;

		vLegalTagsModelImpl._setOriginalGroupId = false;

		vLegalTagsModelImpl._originalStatusTags = vLegalTagsModelImpl._statusTags;

		vLegalTagsModelImpl._setOriginalStatusTags = false;

		vLegalTagsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VLegalTags> toCacheModel() {
		VLegalTagsCacheModel vLegalTagsCacheModel = new VLegalTagsCacheModel();

		vLegalTagsCacheModel.tagId = getTagId();

		String tagId = vLegalTagsCacheModel.tagId;

		if ((tagId != null) && (tagId.length() == 0)) {
			vLegalTagsCacheModel.tagId = null;
		}

		vLegalTagsCacheModel.groupId = getGroupId();

		vLegalTagsCacheModel.companyId = getCompanyId();

		vLegalTagsCacheModel.userId = getUserId();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			vLegalTagsCacheModel.createdDate = createdDate.getTime();
		}
		else {
			vLegalTagsCacheModel.createdDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			vLegalTagsCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			vLegalTagsCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		vLegalTagsCacheModel.name = getName();

		String name = vLegalTagsCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			vLegalTagsCacheModel.name = null;
		}

		vLegalTagsCacheModel.statusTags = getStatusTags();

		return vLegalTagsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{tagId=");
		sb.append(getTagId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", statusTags=");
		sb.append(getStatusTags());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.gov.hoabinh.model.VLegalTags");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>tagId</column-name><column-value><![CDATA[");
		sb.append(getTagId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusTags</column-name><column-value><![CDATA[");
		sb.append(getStatusTags());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VLegalTags.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VLegalTags.class
		};
	private String _tagId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private Date _createdDate;
	private Date _modifiedDate;
	private String _name;
	private boolean _statusTags;
	private boolean _originalStatusTags;
	private boolean _setOriginalStatusTags;
	private long _columnBitmask;
	private VLegalTags _escapedModel;
}