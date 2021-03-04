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
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import vn.gov.hoabinh.model.VcmsArticleStatus;
import vn.gov.hoabinh.model.VcmsArticleStatusModel;
import vn.gov.hoabinh.service.persistence.VcmsArticleStatusPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VcmsArticleStatus service. Represents a row in the &quot;VcmsArticleStatus&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VcmsArticleStatusModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VcmsArticleStatusImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleStatusImpl
 * @see VcmsArticleStatus
 * @see VcmsArticleStatusModel
 * @generated
 */
@ProviderType
public class VcmsArticleStatusModelImpl extends BaseModelImpl<VcmsArticleStatus>
	implements VcmsArticleStatusModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vcms article status model instance should use the {@link VcmsArticleStatus} interface instead.
	 */
	public static final String TABLE_NAME = "VcmsArticleStatus";
	public static final Object[][] TABLE_COLUMNS = {
			{ "statusId", Types.BIGINT },
			{ "articleId", Types.VARCHAR },
			{ "categoryId", Types.VARCHAR },
			{ "createdDate", Types.TIMESTAMP },
			{ "createdByUser", Types.VARCHAR },
			{ "active_", Types.BOOLEAN },
			{ "articleVersionId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("statusId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("articleId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("categoryId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createdDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("createdByUser", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("active_", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("articleVersionId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table VcmsArticleStatus (statusId LONG not null,articleId VARCHAR(75) not null,categoryId VARCHAR(75) not null,createdDate DATE null,createdByUser VARCHAR(75) null,active_ BOOLEAN,articleVersionId LONG,primary key (statusId, articleId, categoryId))";
	public static final String TABLE_SQL_DROP = "drop table VcmsArticleStatus";
	public static final String ORDER_BY_JPQL = " ORDER BY vcmsArticleStatus.createdDate ASC";
	public static final String ORDER_BY_SQL = " ORDER BY VcmsArticleStatus.createdDate ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gov.hoabinh.model.VcmsArticleStatus"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gov.hoabinh.model.VcmsArticleStatus"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gov.hoabinh.model.VcmsArticleStatus"),
			true);
	public static final long ACTIVE_COLUMN_BITMASK = 1L;
	public static final long ARTICLEID_COLUMN_BITMASK = 2L;
	public static final long CREATEDBYUSER_COLUMN_BITMASK = 4L;
	public static final long CREATEDDATE_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(vn.gov.hoabinh.service.util.ServiceProps.get(
				"lock.expiration.time.vn.gov.hoabinh.model.VcmsArticleStatus"));

	public VcmsArticleStatusModelImpl() {
	}

	@Override
	public VcmsArticleStatusPK getPrimaryKey() {
		return new VcmsArticleStatusPK(_statusId, _articleId, _categoryId);
	}

	@Override
	public void setPrimaryKey(VcmsArticleStatusPK primaryKey) {
		setStatusId(primaryKey.statusId);
		setArticleId(primaryKey.articleId);
		setCategoryId(primaryKey.categoryId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new VcmsArticleStatusPK(_statusId, _articleId, _categoryId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((VcmsArticleStatusPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsArticleStatus.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsArticleStatus.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("statusId", getStatusId());
		attributes.put("articleId", getArticleId());
		attributes.put("categoryId", getCategoryId());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("createdByUser", getCreatedByUser());
		attributes.put("active", getActive());
		attributes.put("articleVersionId", getArticleVersionId());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long statusId = (Long)attributes.get("statusId");

		if (statusId != null) {
			setStatusId(statusId);
		}

		String articleId = (String)attributes.get("articleId");

		if (articleId != null) {
			setArticleId(articleId);
		}

		String categoryId = (String)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String createdByUser = (String)attributes.get("createdByUser");

		if (createdByUser != null) {
			setCreatedByUser(createdByUser);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}

		Long articleVersionId = (Long)attributes.get("articleVersionId");

		if (articleVersionId != null) {
			setArticleVersionId(articleVersionId);
		}
	}

	@Override
	public long getStatusId() {
		return _statusId;
	}

	@Override
	public void setStatusId(long statusId) {
		_statusId = statusId;
	}

	@Override
	public String getArticleId() {
		if (_articleId == null) {
			return StringPool.BLANK;
		}
		else {
			return _articleId;
		}
	}

	@Override
	public void setArticleId(String articleId) {
		_columnBitmask |= ARTICLEID_COLUMN_BITMASK;

		if (_originalArticleId == null) {
			_originalArticleId = _articleId;
		}

		_articleId = articleId;
	}

	public String getOriginalArticleId() {
		return GetterUtil.getString(_originalArticleId);
	}

	@Override
	public String getCategoryId() {
		if (_categoryId == null) {
			return StringPool.BLANK;
		}
		else {
			return _categoryId;
		}
	}

	@Override
	public void setCategoryId(String categoryId) {
		_categoryId = categoryId;
	}

	@Override
	public Date getCreatedDate() {
		return _createdDate;
	}

	@Override
	public void setCreatedDate(Date createdDate) {
		_columnBitmask = -1L;

		_createdDate = createdDate;
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
		_columnBitmask |= CREATEDBYUSER_COLUMN_BITMASK;

		if (_originalCreatedByUser == null) {
			_originalCreatedByUser = _createdByUser;
		}

		_createdByUser = createdByUser;
	}

	public String getOriginalCreatedByUser() {
		return GetterUtil.getString(_originalCreatedByUser);
	}

	@Override
	public boolean getActive() {
		return _active;
	}

	@Override
	public boolean isActive() {
		return _active;
	}

	@Override
	public void setActive(boolean active) {
		_columnBitmask |= ACTIVE_COLUMN_BITMASK;

		if (!_setOriginalActive) {
			_setOriginalActive = true;

			_originalActive = _active;
		}

		_active = active;
	}

	public boolean getOriginalActive() {
		return _originalActive;
	}

	@Override
	public long getArticleVersionId() {
		return _articleVersionId;
	}

	@Override
	public void setArticleVersionId(long articleVersionId) {
		_articleVersionId = articleVersionId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public VcmsArticleStatus toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VcmsArticleStatus)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VcmsArticleStatusImpl vcmsArticleStatusImpl = new VcmsArticleStatusImpl();

		vcmsArticleStatusImpl.setStatusId(getStatusId());
		vcmsArticleStatusImpl.setArticleId(getArticleId());
		vcmsArticleStatusImpl.setCategoryId(getCategoryId());
		vcmsArticleStatusImpl.setCreatedDate(getCreatedDate());
		vcmsArticleStatusImpl.setCreatedByUser(getCreatedByUser());
		vcmsArticleStatusImpl.setActive(getActive());
		vcmsArticleStatusImpl.setArticleVersionId(getArticleVersionId());

		vcmsArticleStatusImpl.resetOriginalValues();

		return vcmsArticleStatusImpl;
	}

	@Override
	public int compareTo(VcmsArticleStatus vcmsArticleStatus) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedDate(),
				vcmsArticleStatus.getCreatedDate());

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

		if (!(obj instanceof VcmsArticleStatus)) {
			return false;
		}

		VcmsArticleStatus vcmsArticleStatus = (VcmsArticleStatus)obj;

		VcmsArticleStatusPK primaryKey = vcmsArticleStatus.getPrimaryKey();

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
		VcmsArticleStatusModelImpl vcmsArticleStatusModelImpl = this;

		vcmsArticleStatusModelImpl._originalArticleId = vcmsArticleStatusModelImpl._articleId;

		vcmsArticleStatusModelImpl._originalCreatedByUser = vcmsArticleStatusModelImpl._createdByUser;

		vcmsArticleStatusModelImpl._originalActive = vcmsArticleStatusModelImpl._active;

		vcmsArticleStatusModelImpl._setOriginalActive = false;

		vcmsArticleStatusModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VcmsArticleStatus> toCacheModel() {
		VcmsArticleStatusCacheModel vcmsArticleStatusCacheModel = new VcmsArticleStatusCacheModel();

		vcmsArticleStatusCacheModel.vcmsArticleStatusPK = getPrimaryKey();

		vcmsArticleStatusCacheModel.statusId = getStatusId();

		vcmsArticleStatusCacheModel.articleId = getArticleId();

		String articleId = vcmsArticleStatusCacheModel.articleId;

		if ((articleId != null) && (articleId.length() == 0)) {
			vcmsArticleStatusCacheModel.articleId = null;
		}

		vcmsArticleStatusCacheModel.categoryId = getCategoryId();

		String categoryId = vcmsArticleStatusCacheModel.categoryId;

		if ((categoryId != null) && (categoryId.length() == 0)) {
			vcmsArticleStatusCacheModel.categoryId = null;
		}

		Date createdDate = getCreatedDate();

		if (createdDate != null) {
			vcmsArticleStatusCacheModel.createdDate = createdDate.getTime();
		}
		else {
			vcmsArticleStatusCacheModel.createdDate = Long.MIN_VALUE;
		}

		vcmsArticleStatusCacheModel.createdByUser = getCreatedByUser();

		String createdByUser = vcmsArticleStatusCacheModel.createdByUser;

		if ((createdByUser != null) && (createdByUser.length() == 0)) {
			vcmsArticleStatusCacheModel.createdByUser = null;
		}

		vcmsArticleStatusCacheModel.active = getActive();

		vcmsArticleStatusCacheModel.articleVersionId = getArticleVersionId();

		return vcmsArticleStatusCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{statusId=");
		sb.append(getStatusId());
		sb.append(", articleId=");
		sb.append(getArticleId());
		sb.append(", categoryId=");
		sb.append(getCategoryId());
		sb.append(", createdDate=");
		sb.append(getCreatedDate());
		sb.append(", createdByUser=");
		sb.append(getCreatedByUser());
		sb.append(", active=");
		sb.append(getActive());
		sb.append(", articleVersionId=");
		sb.append(getArticleVersionId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.gov.hoabinh.model.VcmsArticleStatus");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>statusId</column-name><column-value><![CDATA[");
		sb.append(getStatusId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>articleId</column-name><column-value><![CDATA[");
		sb.append(getArticleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryId</column-name><column-value><![CDATA[");
		sb.append(getCategoryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdDate</column-name><column-value><![CDATA[");
		sb.append(getCreatedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdByUser</column-name><column-value><![CDATA[");
		sb.append(getCreatedByUser());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append(getActive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>articleVersionId</column-name><column-value><![CDATA[");
		sb.append(getArticleVersionId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VcmsArticleStatus.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VcmsArticleStatus.class
		};
	private long _statusId;
	private String _articleId;
	private String _originalArticleId;
	private String _categoryId;
	private Date _createdDate;
	private String _createdByUser;
	private String _originalCreatedByUser;
	private boolean _active;
	private boolean _originalActive;
	private boolean _setOriginalActive;
	private long _articleVersionId;
	private long _columnBitmask;
	private VcmsArticleStatus _escapedModel;
}