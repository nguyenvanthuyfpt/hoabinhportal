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

import vn.gov.hoabinh.service.persistence.VLegalDSRelPK;

import java.io.Serializable;

/**
 * The base model interface for the VLegalDSRel service. Represents a row in the &quot;VLegalDSRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.gov.hoabinh.model.impl.VLegalDSRelModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.gov.hoabinh.model.impl.VLegalDSRelImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDSRel
 * @see vn.gov.hoabinh.model.impl.VLegalDSRelImpl
 * @see vn.gov.hoabinh.model.impl.VLegalDSRelModelImpl
 * @generated
 */
@ProviderType
public interface VLegalDSRelModel extends BaseModel<VLegalDSRel> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a v legal d s rel model instance should use the {@link VLegalDSRel} interface instead.
	 */

	/**
	 * Returns the primary key of this v legal d s rel.
	 *
	 * @return the primary key of this v legal d s rel
	 */
	public VLegalDSRelPK getPrimaryKey();

	/**
	 * Sets the primary key of this v legal d s rel.
	 *
	 * @param primaryKey the primary key of this v legal d s rel
	 */
	public void setPrimaryKey(VLegalDSRelPK primaryKey);

	/**
	 * Returns the sig ID of this v legal d s rel.
	 *
	 * @return the sig ID of this v legal d s rel
	 */
	@AutoEscape
	public String getSigId();

	/**
	 * Sets the sig ID of this v legal d s rel.
	 *
	 * @param sigId the sig ID of this v legal d s rel
	 */
	public void setSigId(String sigId);

	/**
	 * Returns the doc ID of this v legal d s rel.
	 *
	 * @return the doc ID of this v legal d s rel
	 */
	@AutoEscape
	public String getDocId();

	/**
	 * Sets the doc ID of this v legal d s rel.
	 *
	 * @param docId the doc ID of this v legal d s rel
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
	public int compareTo(vn.gov.hoabinh.model.VLegalDSRel vLegalDSRel);

	@Override
	public int hashCode();

	@Override
	public CacheModel<vn.gov.hoabinh.model.VLegalDSRel> toCacheModel();

	@Override
	public vn.gov.hoabinh.model.VLegalDSRel toEscapedModel();

	@Override
	public vn.gov.hoabinh.model.VLegalDSRel toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}