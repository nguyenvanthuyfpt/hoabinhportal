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
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import vn.gov.hoabinh.model.VcmsPARelation;
import vn.gov.hoabinh.model.VcmsPARelationModel;
import vn.gov.hoabinh.service.persistence.VcmsPARelationPK;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VcmsPARelation service. Represents a row in the &quot;VcmsPARelation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VcmsPARelationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VcmsPARelationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsPARelationImpl
 * @see VcmsPARelation
 * @see VcmsPARelationModel
 * @generated
 */
@ProviderType
public class VcmsPARelationModelImpl extends BaseModelImpl<VcmsPARelation>
	implements VcmsPARelationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vcms p a relation model instance should use the {@link VcmsPARelation} interface instead.
	 */
	public static final String TABLE_NAME = "VcmsPARelation";
	public static final Object[][] TABLE_COLUMNS = {
			{ "portionId", Types.VARCHAR },
			{ "articleId", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("portionId", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("articleId", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table VcmsPARelation (portionId VARCHAR(75) not null,articleId VARCHAR(75) not null,primary key (portionId, articleId))";
	public static final String TABLE_SQL_DROP = "drop table VcmsPARelation";
	public static final String ORDER_BY_JPQL = " ORDER BY vcmsPARelation.id.articleId DESC, vcmsPARelation.id.portionId DESC";
	public static final String ORDER_BY_SQL = " ORDER BY VcmsPARelation.articleId DESC, VcmsPARelation.portionId DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gov.hoabinh.model.VcmsPARelation"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gov.hoabinh.model.VcmsPARelation"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gov.hoabinh.model.VcmsPARelation"),
			true);
	public static final long ARTICLEID_COLUMN_BITMASK = 1L;
	public static final long PORTIONID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(vn.gov.hoabinh.service.util.ServiceProps.get(
				"lock.expiration.time.vn.gov.hoabinh.model.VcmsPARelation"));

	public VcmsPARelationModelImpl() {
	}

	@Override
	public VcmsPARelationPK getPrimaryKey() {
		return new VcmsPARelationPK(_portionId, _articleId);
	}

	@Override
	public void setPrimaryKey(VcmsPARelationPK primaryKey) {
		setPortionId(primaryKey.portionId);
		setArticleId(primaryKey.articleId);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return new VcmsPARelationPK(_portionId, _articleId);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((VcmsPARelationPK)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return VcmsPARelation.class;
	}

	@Override
	public String getModelClassName() {
		return VcmsPARelation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("portionId", getPortionId());
		attributes.put("articleId", getArticleId());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String portionId = (String)attributes.get("portionId");

		if (portionId != null) {
			setPortionId(portionId);
		}

		String articleId = (String)attributes.get("articleId");

		if (articleId != null) {
			setArticleId(articleId);
		}
	}

	@Override
	public String getPortionId() {
		if (_portionId == null) {
			return StringPool.BLANK;
		}
		else {
			return _portionId;
		}
	}

	@Override
	public void setPortionId(String portionId) {
		_columnBitmask = -1L;

		if (_originalPortionId == null) {
			_originalPortionId = _portionId;
		}

		_portionId = portionId;
	}

	public String getOriginalPortionId() {
		return GetterUtil.getString(_originalPortionId);
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
		_columnBitmask = -1L;

		if (_originalArticleId == null) {
			_originalArticleId = _articleId;
		}

		_articleId = articleId;
	}

	public String getOriginalArticleId() {
		return GetterUtil.getString(_originalArticleId);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public VcmsPARelation toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VcmsPARelation)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VcmsPARelationImpl vcmsPARelationImpl = new VcmsPARelationImpl();

		vcmsPARelationImpl.setPortionId(getPortionId());
		vcmsPARelationImpl.setArticleId(getArticleId());

		vcmsPARelationImpl.resetOriginalValues();

		return vcmsPARelationImpl;
	}

	@Override
	public int compareTo(VcmsPARelation vcmsPARelation) {
		int value = 0;

		value = getArticleId().compareTo(vcmsPARelation.getArticleId());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		value = getPortionId().compareTo(vcmsPARelation.getPortionId());

		value = value * -1;

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

		if (!(obj instanceof VcmsPARelation)) {
			return false;
		}

		VcmsPARelation vcmsPARelation = (VcmsPARelation)obj;

		VcmsPARelationPK primaryKey = vcmsPARelation.getPrimaryKey();

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
		VcmsPARelationModelImpl vcmsPARelationModelImpl = this;

		vcmsPARelationModelImpl._originalPortionId = vcmsPARelationModelImpl._portionId;

		vcmsPARelationModelImpl._originalArticleId = vcmsPARelationModelImpl._articleId;

		vcmsPARelationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VcmsPARelation> toCacheModel() {
		VcmsPARelationCacheModel vcmsPARelationCacheModel = new VcmsPARelationCacheModel();

		vcmsPARelationCacheModel.vcmsPARelationPK = getPrimaryKey();

		vcmsPARelationCacheModel.portionId = getPortionId();

		String portionId = vcmsPARelationCacheModel.portionId;

		if ((portionId != null) && (portionId.length() == 0)) {
			vcmsPARelationCacheModel.portionId = null;
		}

		vcmsPARelationCacheModel.articleId = getArticleId();

		String articleId = vcmsPARelationCacheModel.articleId;

		if ((articleId != null) && (articleId.length() == 0)) {
			vcmsPARelationCacheModel.articleId = null;
		}

		return vcmsPARelationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{portionId=");
		sb.append(getPortionId());
		sb.append(", articleId=");
		sb.append(getArticleId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("vn.gov.hoabinh.model.VcmsPARelation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>portionId</column-name><column-value><![CDATA[");
		sb.append(getPortionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>articleId</column-name><column-value><![CDATA[");
		sb.append(getArticleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VcmsPARelation.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VcmsPARelation.class
		};
	private String _portionId;
	private String _originalPortionId;
	private String _articleId;
	private String _originalArticleId;
	private long _columnBitmask;
	private VcmsPARelation _escapedModel;
}