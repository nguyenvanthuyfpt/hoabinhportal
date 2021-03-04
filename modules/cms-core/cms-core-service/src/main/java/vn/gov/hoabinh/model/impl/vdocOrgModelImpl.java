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

import vn.gov.hoabinh.model.vdocOrg;
import vn.gov.hoabinh.model.vdocOrgModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the vdocOrg service. Represents a row in the &quot;vdocOrg&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vdocOrgModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vdocOrgImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocOrgImpl
 * @see vdocOrg
 * @see vdocOrgModel
 * @generated
 */
@ProviderType
public class vdocOrgModelImpl extends BaseModelImpl<vdocOrg>
	implements vdocOrgModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vdoc org model instance should use the {@link vdocOrg} interface instead.
	 */
	public static final String TABLE_NAME = "vdocOrg";
	public static final Object[][] TABLE_COLUMNS = {
			{ "orgId", Types.VARCHAR },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createdDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "createdByUser", Types.BIGINT },
			{ "modifiedByUser", Types.BIGINT },
			{ "parentId", Types.VARCHAR },
			{ "code_", Types.VARCHAR },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "address", Types.VARCHAR },
			{ "phone", Types.VARCHAR },
			{ "fax", Types.VARCHAR },
			{ "language", Types.VARCHAR },
			{ "statusOrg", Types.BOOLEAN },
			{ "position", Types.INTEGER },
			{ "listparent", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("orgId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createdDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("createdByUser", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("modifiedByUser", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("parentId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("code_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("phone", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fax", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("language", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("statusOrg", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("position", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("listparent", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table vdocOrg (orgId VARCHAR(75) not null primary key,groupId LONG,companyId LONG,userId LONG,createdDate DATE null,modifiedDate DATE null,createdByUser LONG,modifiedByUser LONG,parentId VARCHAR(75) null,code_ VARCHAR(75) null,name VARCHAR(75) null,description VARCHAR(75) null,address VARCHAR(75) null,phone VARCHAR(75) null,fax VARCHAR(75) null,language VARCHAR(75) null,statusOrg BOOLEAN,position INTEGER,listparent VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table vdocOrg";
	public static final String ORDER_BY_JPQL = " ORDER BY vdocOrg.position ASC";
	public static final String ORDER_BY_SQL = " ORDER BY vdocOrg.position ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gov.hoabinh.model.vdocOrg"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gov.hoabinh.model.vdocOrg"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gov.hoabinh.model.vdocOrg"),
			true);
	public static final long CODE_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long LANGUAGE_COLUMN_BITMASK = 4L;
	public static final long PARENTID_COLUMN_BITMASK = 8L;
	public static final long POSITION_COLUMN_BITMASK = 16L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(vn.gov.hoabinh.service.util.ServiceProps.get(
				"lock.expiration.time.vn.gov.hoabinh.model.vdocOrg"));

	public vdocOrgModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _orgId;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setOrgId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _orgId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return vdocOrg.class;
	}

	@Override
	public String getModelClassName() {
		return vdocOrg.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("orgId", getOrgId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("parentId", getParentId());
		attributes.put("code", getCode());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("address", getAddress());
		attributes.put("phone", getPhone());
		attributes.put("fax", getFax());
		attributes.put("language", getLanguage());
		attributes.put("statusOrg", getStatusOrg());
		attributes.put("position", getPosition());
		attributes.put("listparent", getListparent());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String orgId = (String)attributes.get("orgId");

		if (orgId != null) {
			setOrgId(orgId);
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

		Long createdByUser = (Long)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Long modifiedByUser = (Long)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		String parentId = (String)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Boolean statusOrg = (Boolean)attributes.get("statusOrg");

		if (statusOrg != null) {
			setStatusOrg(statusOrg);
		}

		Integer position = (Integer)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String listparent = (String)attributes.get("listparent");

		if (listparent != null) {
			setListparent(listparent);
		}
	}

	@Override
	public String getOrgId() {
		if (_orgId == null) {
			return StringPool.BLANK;
		}
		else {
			return _orgId;
		}
	}

	@Override
	public void setOrgId(String orgId) {
		_orgId = orgId;
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
	public long getCreatedByUser() {
		return _createdByUser;
	}

	@Override
	public void setCreatedByUser(long createdByUser) {
		_createdByUser = createdByUser;
	}

	@Override
	public long getModifiedByUser() {
		return _modifiedByUser;
	}

	@Override
	public void setModifiedByUser(long modifiedByUser) {
		_modifiedByUser = modifiedByUser;
	}

	@Override
	public String getParentId() {
		if (_parentId == null) {
			return StringPool.BLANK;
		}
		else {
			return _parentId;
		}
	}

	@Override
	public void setParentId(String parentId) {
		_columnBitmask |= PARENTID_COLUMN_BITMASK;

		if (_originalParentId == null) {
			_originalParentId = _parentId;
		}

		_parentId = parentId;
	}

	public String getOriginalParentId() {
		return GetterUtil.getString(_originalParentId);
	}

	@Override
	public String getCode() {
		if (_code == null) {
			return StringPool.BLANK;
		}
		else {
			return _code;
		}
	}

	@Override
	public void setCode(String code) {
		_columnBitmask |= CODE_COLUMN_BITMASK;

		if (_originalCode == null) {
			_originalCode = _code;
		}

		_code = code;
	}

	public String getOriginalCode() {
		return GetterUtil.getString(_originalCode);
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
		_name = name;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		_address = address;
	}

	@Override
	public String getPhone() {
		if (_phone == null) {
			return StringPool.BLANK;
		}
		else {
			return _phone;
		}
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;
	}

	@Override
	public String getFax() {
		if (_fax == null) {
			return StringPool.BLANK;
		}
		else {
			return _fax;
		}
	}

	@Override
	public void setFax(String fax) {
		_fax = fax;
	}

	@Override
	public String getLanguage() {
		if (_language == null) {
			return StringPool.BLANK;
		}
		else {
			return _language;
		}
	}

	@Override
	public void setLanguage(String language) {
		_columnBitmask |= LANGUAGE_COLUMN_BITMASK;

		if (_originalLanguage == null) {
			_originalLanguage = _language;
		}

		_language = language;
	}

	public String getOriginalLanguage() {
		return GetterUtil.getString(_originalLanguage);
	}

	@Override
	public boolean getStatusOrg() {
		return _statusOrg;
	}

	@Override
	public boolean isStatusOrg() {
		return _statusOrg;
	}

	@Override
	public void setStatusOrg(boolean statusOrg) {
		_statusOrg = statusOrg;
	}

	@Override
	public int getPosition() {
		return _position;
	}

	@Override
	public void setPosition(int position) {
		_columnBitmask = -1L;

		_position = position;
	}

	@Override
	public String getListparent() {
		if (_listparent == null) {
			return StringPool.BLANK;
		}
		else {
			return _listparent;
		}
	}

	@Override
	public void setListparent(String listparent) {
		_listparent = listparent;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public vdocOrg toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (vdocOrg)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		vdocOrgImpl vdocOrgImpl = new vdocOrgImpl();

		vdocOrgImpl.setOrgId(getOrgId());
		vdocOrgImpl.setGroupId(getGroupId());
		vdocOrgImpl.setCompanyId(getCompanyId());
		vdocOrgImpl.setUserId(getUserId());
		vdocOrgImpl.setCreatedDate(getCreatedDate());
		vdocOrgImpl.setModifiedDate(getModifiedDate());
		vdocOrgImpl.setCreatedByUser(getCreatedByUser());
		vdocOrgImpl.setModifiedByUser(getModifiedByUser());
		vdocOrgImpl.setParentId(getParentId());
		vdocOrgImpl.setCode(getCode());
		vdocOrgImpl.setName(getName());
		vdocOrgImpl.setDescription(getDescription());
		vdocOrgImpl.setAddress(getAddress());
		vdocOrgImpl.setPhone(getPhone());
		vdocOrgImpl.setFax(getFax());
		vdocOrgImpl.setLanguage(getLanguage());
		vdocOrgImpl.setStatusOrg(getStatusOrg());
		vdocOrgImpl.setPosition(getPosition());
		vdocOrgImpl.setListparent(getListparent());

		vdocOrgImpl.resetOriginalValues();

		return vdocOrgImpl;
	}

	@Override
	public int compareTo(vdocOrg vdocOrg) {
		int value = 0;

		if (getPosition() < vdocOrg.getPosition()) {
			value = -1;
		}
		else if (getPosition() > vdocOrg.getPosition()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof vdocOrg)) {
			return false;
		}

		vdocOrg vdocOrg = (vdocOrg)obj;

		String primaryKey = vdocOrg.getPrimaryKey();

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
		vdocOrgModelImpl vdocOrgModelImpl = this;

		vdocOrgModelImpl._originalGroupId = vdocOrgModelImpl._groupId;

		vdocOrgModelImpl._setOriginalGroupId = false;

		vdocOrgModelImpl._originalParentId = vdocOrgModelImpl._parentId;

		vdocOrgModelImpl._originalCode = vdocOrgModelImpl._code;

		vdocOrgModelImpl._originalLanguage = vdocOrgModelImpl._language;

		vdocOrgModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<vdocOrg> toCacheModel() {
		vdocOrgCacheModel vdocOrgCacheModel = new vdocOrgCacheModel();

		vdocOrgCacheModel.orgId = getOrgId();

		String orgId = vdocOrgCacheModel.orgId;

		if ((orgId != null) && (orgId.length() == 0)) {
			vdocOrgCacheModel.orgId = null;
		}

		vdocOrgCacheModel.groupId = getGroupId();

		vdocOrgCacheModel.companyId = getCompanyId();

		vdocOrgCacheModel.userId = getUserId();

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			vdocOrgCacheModel.createdDate = createdDate.getTime();
		}
		else {
			vdocOrgCacheModel.createdDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			vdocOrgCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			vdocOrgCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		vdocOrgCacheModel.createdByUser = getCreatedByUser();

		vdocOrgCacheModel.modifiedByUser = getModifiedByUser();

		vdocOrgCacheModel.parentId = getParentId();

		String parentId = vdocOrgCacheModel.parentId;

		if ((parentId != null) && (parentId.length() == 0)) {
			vdocOrgCacheModel.parentId = null;
		}

		vdocOrgCacheModel.code = getCode();

		String code = vdocOrgCacheModel.code;

		if ((code != null) && (code.length() == 0)) {
			vdocOrgCacheModel.code = null;
		}

		vdocOrgCacheModel.name = getName();

		String name = vdocOrgCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			vdocOrgCacheModel.name = null;
		}

		vdocOrgCacheModel.description = getDescription();

		String description = vdocOrgCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			vdocOrgCacheModel.description = null;
		}

		vdocOrgCacheModel.address = getAddress();

		String address = vdocOrgCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			vdocOrgCacheModel.address = null;
		}

		vdocOrgCacheModel.phone = getPhone();

		String phone = vdocOrgCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			vdocOrgCacheModel.phone = null;
		}

		vdocOrgCacheModel.fax = getFax();

		String fax = vdocOrgCacheModel.fax;

		if ((fax != null) && (fax.length() == 0)) {
			vdocOrgCacheModel.fax = null;
		}

		vdocOrgCacheModel.language = getLanguage();

		String language = vdocOrgCacheModel.language;

		if ((language != null) && (language.length() == 0)) {
			vdocOrgCacheModel.language = null;
		}

		vdocOrgCacheModel.statusOrg = getStatusOrg();

		vdocOrgCacheModel.position = getPosition();

		vdocOrgCacheModel.listparent = getListparent();

		String listparent = vdocOrgCacheModel.listparent;

		if ((listparent != null) && (listparent.length() == 0)) {
			vdocOrgCacheModel.listparent = null;
		}

		return vdocOrgCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{orgId=");
		sb.append(getOrgId());
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
		sb.append(", createdByUser=");
		sb.append(getCreatedByUser());
		sb.append(", modifiedByUser=");
		sb.append(getModifiedByUser());
		sb.append(", parentId=");
		sb.append(getParentId());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", fax=");
		sb.append(getFax());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", statusOrg=");
		sb.append(getStatusOrg());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append(", listparent=");
		sb.append(getListparent());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("vn.gov.hoabinh.model.vdocOrg");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>orgId</column-name><column-value><![CDATA[");
		sb.append(getOrgId());
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
			"<column><column-name>createdByUser</column-name><column-value><![CDATA[");
		sb.append(getCreatedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedByUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentId</column-name><column-value><![CDATA[");
		sb.append(getParentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fax</column-name><column-value><![CDATA[");
		sb.append(getFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusOrg</column-name><column-value><![CDATA[");
		sb.append(getStatusOrg());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>listparent</column-name><column-value><![CDATA[");
		sb.append(getListparent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = vdocOrg.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			vdocOrg.class
		};
	private String _orgId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _userId;
	private Date _createdDate;
	private Date _modifiedDate;
	private long _createdByUser;
	private long _modifiedByUser;
	private String _parentId;
	private String _originalParentId;
	private String _code;
	private String _originalCode;
	private String _name;
	private String _description;
	private String _address;
	private String _phone;
	private String _fax;
	private String _language;
	private String _originalLanguage;
	private boolean _statusOrg;
	private int _position;
	private String _listparent;
	private long _columnBitmask;
	private vdocOrg _escapedModel;
}