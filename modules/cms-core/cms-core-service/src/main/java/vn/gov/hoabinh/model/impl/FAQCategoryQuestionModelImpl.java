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
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import vn.gov.hoabinh.model.FAQCategoryQuestion;
import vn.gov.hoabinh.model.FAQCategoryQuestionModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the FAQCategoryQuestion service. Represents a row in the &quot;FAQCategoryQuestion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link FAQCategoryQuestionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FAQCategoryQuestionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQCategoryQuestionImpl
 * @see FAQCategoryQuestion
 * @see FAQCategoryQuestionModel
 * @generated
 */
@ProviderType
public class FAQCategoryQuestionModelImpl extends BaseModelImpl<FAQCategoryQuestion>
	implements FAQCategoryQuestionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a f a q category question model instance should use the {@link FAQCategoryQuestion} interface instead.
	 */
	public static final String TABLE_NAME = "FAQCategoryQuestion";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "questionId", Types.BIGINT },
			{ "categoryId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("questionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("categoryId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table FAQCategoryQuestion (id_ LONG not null primary key,questionId LONG,categoryId LONG)";
	public static final String TABLE_SQL_DROP = "drop table FAQCategoryQuestion";
	public static final String ORDER_BY_JPQL = " ORDER BY faqCategoryQuestion.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY FAQCategoryQuestion.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.gov.hoabinh.model.FAQCategoryQuestion"),
			false);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.gov.hoabinh.model.FAQCategoryQuestion"),
			false);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(vn.gov.hoabinh.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.gov.hoabinh.model.FAQCategoryQuestion"),
			true);
	public static final long CATEGORYID_COLUMN_BITMASK = 1L;
	public static final long QUESTIONID_COLUMN_BITMASK = 2L;
	public static final long ID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(vn.gov.hoabinh.service.util.ServiceProps.get(
				"lock.expiration.time.vn.gov.hoabinh.model.FAQCategoryQuestion"));

	public FAQCategoryQuestionModelImpl() {
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
		return FAQCategoryQuestion.class;
	}

	@Override
	public String getModelClassName() {
		return FAQCategoryQuestion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("questionId", getQuestionId());
		attributes.put("categoryId", getCategoryId());

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

		Long questionId = (Long)attributes.get("questionId");

		if (questionId != null) {
			setQuestionId(questionId);
		}

		Long categoryId = (Long)attributes.get("categoryId");

		if (categoryId != null) {
			setCategoryId(categoryId);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public long getQuestionId() {
		return _questionId;
	}

	@Override
	public void setQuestionId(long questionId) {
		_columnBitmask |= QUESTIONID_COLUMN_BITMASK;

		if (!_setOriginalQuestionId) {
			_setOriginalQuestionId = true;

			_originalQuestionId = _questionId;
		}

		_questionId = questionId;
	}

	public long getOriginalQuestionId() {
		return _originalQuestionId;
	}

	@Override
	public long getCategoryId() {
		return _categoryId;
	}

	@Override
	public void setCategoryId(long categoryId) {
		_columnBitmask |= CATEGORYID_COLUMN_BITMASK;

		if (!_setOriginalCategoryId) {
			_setOriginalCategoryId = true;

			_originalCategoryId = _categoryId;
		}

		_categoryId = categoryId;
	}

	public long getOriginalCategoryId() {
		return _originalCategoryId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			FAQCategoryQuestion.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public FAQCategoryQuestion toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (FAQCategoryQuestion)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		FAQCategoryQuestionImpl faqCategoryQuestionImpl = new FAQCategoryQuestionImpl();

		faqCategoryQuestionImpl.setId(getId());
		faqCategoryQuestionImpl.setQuestionId(getQuestionId());
		faqCategoryQuestionImpl.setCategoryId(getCategoryId());

		faqCategoryQuestionImpl.resetOriginalValues();

		return faqCategoryQuestionImpl;
	}

	@Override
	public int compareTo(FAQCategoryQuestion faqCategoryQuestion) {
		long primaryKey = faqCategoryQuestion.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FAQCategoryQuestion)) {
			return false;
		}

		FAQCategoryQuestion faqCategoryQuestion = (FAQCategoryQuestion)obj;

		long primaryKey = faqCategoryQuestion.getPrimaryKey();

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
		FAQCategoryQuestionModelImpl faqCategoryQuestionModelImpl = this;

		faqCategoryQuestionModelImpl._originalQuestionId = faqCategoryQuestionModelImpl._questionId;

		faqCategoryQuestionModelImpl._setOriginalQuestionId = false;

		faqCategoryQuestionModelImpl._originalCategoryId = faqCategoryQuestionModelImpl._categoryId;

		faqCategoryQuestionModelImpl._setOriginalCategoryId = false;

		faqCategoryQuestionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<FAQCategoryQuestion> toCacheModel() {
		FAQCategoryQuestionCacheModel faqCategoryQuestionCacheModel = new FAQCategoryQuestionCacheModel();

		faqCategoryQuestionCacheModel.id = getId();

		faqCategoryQuestionCacheModel.questionId = getQuestionId();

		faqCategoryQuestionCacheModel.categoryId = getCategoryId();

		return faqCategoryQuestionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", questionId=");
		sb.append(getQuestionId());
		sb.append(", categoryId=");
		sb.append(getCategoryId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("vn.gov.hoabinh.model.FAQCategoryQuestion");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>questionId</column-name><column-value><![CDATA[");
		sb.append(getQuestionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>categoryId</column-name><column-value><![CDATA[");
		sb.append(getCategoryId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = FAQCategoryQuestion.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			FAQCategoryQuestion.class
		};
	private long _id;
	private long _questionId;
	private long _originalQuestionId;
	private boolean _setOriginalQuestionId;
	private long _categoryId;
	private long _originalCategoryId;
	private boolean _setOriginalCategoryId;
	private long _columnBitmask;
	private FAQCategoryQuestion _escapedModel;
}