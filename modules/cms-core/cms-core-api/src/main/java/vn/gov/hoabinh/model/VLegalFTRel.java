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
 * The extended model interface for the VLegalFTRel service. Represents a row in the &quot;VLegalFTRel&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalFTRelModel
 * @see vn.gov.hoabinh.model.impl.VLegalFTRelImpl
 * @see vn.gov.hoabinh.model.impl.VLegalFTRelModelImpl
 * @generated
 */
@ImplementationClassName("vn.gov.hoabinh.model.impl.VLegalFTRelImpl")
@ProviderType
public interface VLegalFTRel extends VLegalFTRelModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link vn.gov.hoabinh.model.impl.VLegalFTRelImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VLegalFTRel, String> FIELD_ID_ACCESSOR = new Accessor<VLegalFTRel, String>() {
			@Override
			public String get(VLegalFTRel vLegalFTRel) {
				return vLegalFTRel.getFieldId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<VLegalFTRel> getTypeClass() {
				return VLegalFTRel.class;
			}
		};

	public static final Accessor<VLegalFTRel, String> TYPE_ID_ACCESSOR = new Accessor<VLegalFTRel, String>() {
			@Override
			public String get(VLegalFTRel vLegalFTRel) {
				return vLegalFTRel.getTypeId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<VLegalFTRel> getTypeClass() {
				return VLegalFTRel.class;
			}
		};
}