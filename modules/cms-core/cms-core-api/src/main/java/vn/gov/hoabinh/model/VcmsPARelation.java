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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the VcmsPARelation service. Represents a row in the &quot;VcmsPARelation&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsPARelationModel
 * @see vn.gov.hoabinh.model.impl.VcmsPARelationImpl
 * @see vn.gov.hoabinh.model.impl.VcmsPARelationModelImpl
 * @generated
 */
@ImplementationClassName("vn.gov.hoabinh.model.impl.VcmsPARelationImpl")
@ProviderType
public interface VcmsPARelation extends VcmsPARelationModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link vn.gov.hoabinh.model.impl.VcmsPARelationImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VcmsPARelation, String> PORTION_ID_ACCESSOR = new Accessor<VcmsPARelation, String>() {
			@Override
			public String get(VcmsPARelation vcmsPARelation) {
				return vcmsPARelation.getPortionId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<VcmsPARelation> getTypeClass() {
				return VcmsPARelation.class;
			}
		};

	public static final Accessor<VcmsPARelation, String> ARTICLE_ID_ACCESSOR = new Accessor<VcmsPARelation, String>() {
			@Override
			public String get(VcmsPARelation vcmsPARelation) {
				return vcmsPARelation.getArticleId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<VcmsPARelation> getTypeClass() {
				return VcmsPARelation.class;
			}
		};
}