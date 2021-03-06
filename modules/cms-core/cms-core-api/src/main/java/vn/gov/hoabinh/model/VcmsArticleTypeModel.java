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
import com.liferay.portal.kernel.service.ServiceContext;

import vn.gov.hoabinh.service.persistence.VcmsArticleTypePK;

import java.io.Serializable;

/**
 * The base model interface for the VcmsArticleType service. Represents a row in the &quot;VcmsArticleType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gov.hoabinh.model.impl.VcmsArticleTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gov.hoabinh.model.impl.VcmsArticleTypeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleType
 * @see vn.gov.hoabinh.model.impl.VcmsArticleTypeImpl
 * @see vn.gov.hoabinh.model.impl.VcmsArticleTypeModelImpl
 * @generated
 */
@ProviderType
public interface VcmsArticleTypeModel extends BaseModel<VcmsArticleType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vcms article type model instance should use the {@link VcmsArticleType} interface instead.
	 */

	/**
	 * Returns the primary key of this vcms article type.
	 *
	 * @return the primary key of this vcms article type
	 */
	public VcmsArticleTypePK getPrimaryKey();

	/**
	 * Sets the primary key of this vcms article type.
	 *
	 * @param primaryKey the primary key of this vcms article type
	 */
	public void setPrimaryKey(VcmsArticleTypePK primaryKey);

	/**
	 * Returns the type ID of this vcms article type.
	 *
	 * @return the type ID of this vcms article type
	 */
	public long getTypeId();

	/**
	 * Sets the type ID of this vcms article type.
	 *
	 * @param typeId the type ID of this vcms article type
	 */
	public void setTypeId(long typeId);

	/**
	 * Returns the article ID of this vcms article type.
	 *
	 * @return the article ID of this vcms article type
	 */
	@AutoEscape
	public String getArticleId();

	/**
	 * Sets the article ID of this vcms article type.
	 *
	 * @param articleId the article ID of this vcms article type
	 */
	public void setArticleId(String articleId);

	/**
	 * Returns the position of this vcms article type.
	 *
	 * @return the position of this vcms article type
	 */
	public int getPosition();

	/**
	 * Sets the position of this vcms article type.
	 *
	 * @param position the position of this vcms article type
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
	public int compareTo(vn.gov.hoabinh.model.VcmsArticleType vcmsArticleType);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.gov.hoabinh.model.VcmsArticleType> toCacheModel();

	@Override
	public vn.gov.hoabinh.model.VcmsArticleType toEscapedModel();

	@Override
	public vn.gov.hoabinh.model.VcmsArticleType toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}