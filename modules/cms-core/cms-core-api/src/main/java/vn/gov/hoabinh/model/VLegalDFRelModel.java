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

import vn.gov.hoabinh.service.persistence.VLegalDFRelPK;

import java.io.Serializable;

/**
 * The base model interface for the VLegalDFRel service. Represents a row in the &quot;VLegalDFRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gov.hoabinh.model.impl.VLegalDFRelModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gov.hoabinh.model.impl.VLegalDFRelImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDFRel
 * @see vn.gov.hoabinh.model.impl.VLegalDFRelImpl
 * @see vn.gov.hoabinh.model.impl.VLegalDFRelModelImpl
 * @generated
 */
@ProviderType
public interface VLegalDFRelModel extends BaseModel<VLegalDFRel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a v legal d f rel model instance should use the {@link VLegalDFRel} interface instead.
	 */

	/**
	 * Returns the primary key of this v legal d f rel.
	 *
	 * @return the primary key of this v legal d f rel
	 */
	public VLegalDFRelPK getPrimaryKey();

	/**
	 * Sets the primary key of this v legal d f rel.
	 *
	 * @param primaryKey the primary key of this v legal d f rel
	 */
	public void setPrimaryKey(VLegalDFRelPK primaryKey);

	/**
	 * Returns the field ID of this v legal d f rel.
	 *
	 * @return the field ID of this v legal d f rel
	 */
	@AutoEscape
	public String getFieldId();

	/**
	 * Sets the field ID of this v legal d f rel.
	 *
	 * @param fieldId the field ID of this v legal d f rel
	 */
	public void setFieldId(String fieldId);

	/**
	 * Returns the doc ID of this v legal d f rel.
	 *
	 * @return the doc ID of this v legal d f rel
	 */
	@AutoEscape
	public String getDocId();

	/**
	 * Sets the doc ID of this v legal d f rel.
	 *
	 * @param docId the doc ID of this v legal d f rel
	 */
	public void setDocId(String docId);

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
	public int compareTo(vn.gov.hoabinh.model.VLegalDFRel vLegalDFRel);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.gov.hoabinh.model.VLegalDFRel> toCacheModel();

	@Override
	public vn.gov.hoabinh.model.VLegalDFRel toEscapedModel();

	@Override
	public vn.gov.hoabinh.model.VLegalDFRel toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}