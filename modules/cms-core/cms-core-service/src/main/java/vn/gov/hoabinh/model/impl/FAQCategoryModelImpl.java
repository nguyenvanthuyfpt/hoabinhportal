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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import vn.gov.hoabinh.model.FAQCategory;
import vn.gov.hoabinh.model.FAQCategoryModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the FAQCategory service. Represents a row in the &quot;FAQCategory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link FAQCategoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FAQCategoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQCategoryImpl
 * @see FAQCategory
 * @see FAQCategoryModel
 * @generated
 */
@ProviderType
public class FAQCategoryModelImpl extends BaseModelImpl<FAQCategory>
	implements FAQCategoryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a f a q category model instance should use the {@link FAQCategory} interface instead.
	 */
	public static final String TABLE_NAME = "FAQCategory";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "language", Types.VARCHAR },
			{ "parent", Types.BIGINT },
			{ "catorder", Types.INTEGER },
			{ "catlevel", Types.INTEGER },
			{ "image", Types.VARCHAR },
			{ "createdByUser", Types.VARCHAR },
			{ "createdDate", Types.TIMESTAMP },
			{ "modifiedByUser", Types.VARCHAR },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("language", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("parent", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("catorder", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("catlevel", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("image", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createdByUser", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createdDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedByUser", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table FAQCategory (id_ LONG not null primary key,name VARCHAR(75) null,description VARCHAR(75) null,language VARCHAR(75) null,parent LONG,catorder INTEGER,catlevel INTEGER,image VARCHAR(75) null,createdByUser VARCHAR(75) null,createdDate DATE null,modifiedByUser VARCHAR(75) null,modifiedDate DATE null,groupId LONG,userId LONG)";
	public static final String TABLE_SQL_DROP = "drop table FAQCategory";
	public static final String ORDER_BY_JPQL = " ORDER BY faqCategory.catlevel ASC";
	public static final String ORDER_BY_SQL = " ORDER BY FAQCategory.catlevel ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gov.hoabinh.model.FAQCategory"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gov.hoabinh.model.FAQCategory"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gov.hoabinh.model.FAQCategory"),
			true);
	public static final long GROUPID_COLUMN_BITMASK = 1L;
	public static final long ID_COLUMN_BITMASK = 2L;
	public static final long LANGUAGE_COLUMN_BITMASK = 4L;
	public static final long PARENT_COLUMN_BITMASK = 8L;
	public static final long CATLEVEL_COLUMN_BITMASK = 16L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(vn.gov.hoabinh.service.util.ServiceProps.get(
				"lock.expiration.time.vn.gov.hoabinh.model.FAQCategory"));

	public FAQCategoryModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return FAQCategory.class;
	}

	@Override
	public String getModelClassName() {
		return FAQCategory.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("language", getLanguage());
		attributes.put("parent", getParent());
		attributes.put("catorder", getCatorder());
		attributes.put("catlevel", getCatlevel());
		attributes.put("image", getImage());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("modifiedByUser", getModifiedByUser());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String language = (String)attributes.get("language");

		if (language != null) {
			setLanguage(language);
		}

		Long parent = (Long)attributes.get("parent");

		if (parent != null) {
			setParent(parent);
		}

		Integer catorder = (Integer)attributes.get("catorder");

		if (catorder != null) {
			setCatorder(catorder);
		}

		Integer catlevel = (Integer)attributes.get("catlevel");

		if (catlevel != null) {
			setCatlevel(catlevel);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}

		String createdByUser = (String)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String modifiedByUser = (String)attributes.get("modifiedByUser");

		if (modifiedByUser != null) {
			setModifiedByUser(modifiedByUser);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask |= ID_COLUMN_BITMASK;

		if (!_setOriginalId) {
			_setOriginalId = true;

			_originalId = _id;
		}

		_id = id;
	}

	public long getOriginalId() {
		return _originalId;
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
	public long getParent() {
		return _parent;
	}

	@Override
	public void setParent(long parent) {
		_columnBitmask |= PARENT_COLUMN_BITMASK;

		if (!_setOriginalParent) {
			_setOriginalParent = true;

			_originalParent = _parent;
		}

		_parent = parent;
	}

	public long getOriginalParent() {
		return _originalParent;
	}

	@Override
	public int getCatorder() {
		return _catorder;
	}

	@Override
	public void setCatorder(int catorder) {
		_catorder = catorder;
	}

	@Override
	public int getCatlevel() {
		return _catlevel;
	}

	@Override
	public void setCatlevel(int catlevel) {
		_columnBitmask = -1L;

		_catlevel = catlevel;
	}

	@Override
	public String getImage() {
		if (_image == null) {
			return StringPool.BLANK;
		}
		else {
			return _image;
		}
	}

	@Override
	public void setImage(String image) {
		_image = image;
	}

	@Override
	public String getCreatedByUser() {
		if (_createdByUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _createdByUser;
		}
	}

	@Override
	public void setCreatedByUser(String createdByUser) {
		_createdByUser = createdByUser;
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
	public String getModifiedByUser() {
		if (_modifiedByUser == null) {
			return StringPool.BLANK;
		}
		else {
			return _modifiedByUser;
		}
	}

	@Override
	public void setModifiedByUser(String modifiedByUser) {
		_modifiedByUser = modifiedByUser;
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

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			FAQCategory.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FAQCategory toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (FAQCategory)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		FAQCategoryImpl faqCategoryImpl = new FAQCategoryImpl();

		faqCategoryImpl.setId(getId());
		faqCategoryImpl.setName(getName());
		faqCategoryImpl.setDescription(getDescription());
		faqCategoryImpl.setLanguage(getLanguage());
		faqCategoryImpl.setParent(getParent());
		faqCategoryImpl.setCatorder(getCatorder());
		faqCategoryImpl.setCatlevel(getCatlevel());
		faqCategoryImpl.setImage(getImage());
		faqCategoryImpl.setCreatedByUser(getCreatedByUser());
		faqCategoryImpl.setCreatedDate(getCreatedDate());
		faqCategoryImpl.setModifiedByUser(getModifiedByUser());
		faqCategoryImpl.setModifiedDate(getModifiedDate());
		faqCategoryImpl.setGroupId(getGroupId());
		faqCategoryImpl.setUserId(getUserId());

		faqCategoryImpl.resetOriginalValues();

		return faqCategoryImpl;
	}

	@Override
	public int compareTo(FAQCategory faqCategory) {
		int value = 0;

		if (getCatlevel() < faqCategory.getCatlevel()) {
			value = -1;
		}
		else if (getCatlevel() > faqCategory.getCatlevel()) {
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

		if (!(obj instanceof FAQCategory)) {
			return false;
		}

		FAQCategory faqCategory = (FAQCategory)obj;

		long primaryKey = faqCategory.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
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
		FAQCategoryModelImpl faqCategoryModelImpl = this;

		faqCategoryModelImpl._originalId = faqCategoryModelImpl._id;

		faqCategoryModelImpl._setOriginalId = false;

		faqCategoryModelImpl._originalLanguage = faqCategoryModelImpl._language;

		faqCategoryModelImpl._originalParent = faqCategoryModelImpl._parent;

		faqCategoryModelImpl._setOriginalParent = false;

		faqCategoryModelImpl._originalGroupId = faqCategoryModelImpl._groupId;

		faqCategoryModelImpl._setOriginalGroupId = false;

		faqCategoryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<FAQCategory> toCacheModel() {
		FAQCategoryCacheModel faqCategoryCacheModel = new FAQCategoryCacheModel();

		faqCategoryCacheModel.id = getId();

		faqCategoryCacheModel.name = getName();

		String name = faqCategoryCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			faqCategoryCacheModel.name = null;
		}

		faqCategoryCacheModel.description = getDescription();

		String description = faqCategoryCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			faqCategoryCacheModel.description = null;
		}

		faqCategoryCacheModel.language = getLanguage();

		String language = faqCategoryCacheModel.language;

		if ((language != null) && (language.length() == 0)) {
			faqCategoryCacheModel.language = null;
		}

		faqCategoryCacheModel.parent = getParent();

		faqCategoryCacheModel.catorder = getCatorder();

		faqCategoryCacheModel.catlevel = getCatlevel();

		faqCategoryCacheModel.image = getImage();

		String image = faqCategoryCacheModel.image;

		if ((image != null) && (image.length() == 0)) {
			faqCategoryCacheModel.image = null;
		}

		faqCategoryCacheModel.createdByUser = getCreatedByUser();

		String createdByUser = faqCategoryCacheModel.createdByUser;

		if ((createdByUser != null) && (createdByUser.length() == 0)) {
			faqCategoryCacheModel.createdByUser = null;
		}

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			faqCategoryCacheModel.createdDate = createdDate.getTime();
		}
		else {
			faqCategoryCacheModel.createdDate = Long.MIN_VALUE;
		}

		faqCategoryCacheModel.modifiedByUser = getModifiedByUser();

		String modifiedByUser = faqCategoryCacheModel.modifiedByUser;

		if ((modifiedByUser != null) && (modifiedByUser.length() == 0)) {
			faqCategoryCacheModel.modifiedByUser = null;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			faqCategoryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			faqCategoryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		faqCategoryCacheModel.groupId = getGroupId();

		faqCategoryCacheModel.userId = getUserId();

		return faqCategoryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", language=");
		sb.append(getLanguage());
		sb.append(", parent=");
		sb.append(getParent());
		sb.append(", catorder=");
		sb.append(getCatorder());
		sb.append(", catlevel=");
		sb.append(getCatlevel());
		sb.append(", image=");
		sb.append(getImage());
		sb.append(", createdByUser=");
		sb.append(getCreatedByUser());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", modifiedByUser=");
		sb.append(getModifiedByUser());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(46);

		sb.append("<model><model-name>");
		sb.append("vn.gov.hoabinh.model.FAQCategory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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
			"<column><column-name>language</column-name><column-value><![CDATA[");
		sb.append(getLanguage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parent</column-name><column-value><![CDATA[");
		sb.append(getParent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>catorder</column-name><column-value><![CDATA[");
		sb.append(getCatorder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>catlevel</column-name><column-value><![CDATA[");
		sb.append(getCatlevel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>image</column-name><column-value><![CDATA[");
		sb.append(getImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdByUser</column-name><column-value><![CDATA[");
		sb.append(getCreatedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedByUser</column-name><column-value><![CDATA[");
		sb.append(getModifiedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = FAQCategory.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			FAQCategory.class
		};
	private long _id;
	private long _originalId;
	private boolean _setOriginalId;
	private String _name;
	private String _description;
	private String _language;
	private String _originalLanguage;
	private long _parent;
	private long _originalParent;
	private boolean _setOriginalParent;
	private int _catorder;
	private int _catlevel;
	private String _image;
	private String _createdByUser;
	private Date _createdDate;
	private String _modifiedByUser;
	private Date _modifiedDate;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private long _columnBitmask;
	private FAQCategory _escapedModel;
}