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
 * The extended model interface for the VLegalDDRel service. Represents a row in the &quot;VLegalDDRel&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDDRelModel
 * @see vn.gov.hoabinh.model.impl.VLegalDDRelImpl
 * @see vn.gov.hoabinh.model.impl.VLegalDDRelModelImpl
 * @generated
 */
@ImplementationClassName("vn.gov.hoabinh.model.impl.VLegalDDRelImpl")
@ProviderType
public interface VLegalDDRel extends VLegalDDRelModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link vn.gov.hoabinh.model.impl.VLegalDDRelImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VLegalDDRel, Long> DEPARTMENT_ID_ACCESSOR = new Accessor<VLegalDDRel, Long>() {
			@Override
			public Long get(VLegalDDRel vLegalDDRel) {
				return vLegalDDRel.getDepartmentId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<VLegalDDRel> getTypeClass() {
				return VLegalDDRel.class;
			}
		};

	public static final Accessor<VLegalDDRel, String> DOC_ID_ACCESSOR = new Accessor<VLegalDDRel, String>() {
			@Override
			public String get(VLegalDDRel vLegalDDRel) {
				return vLegalDDRel.getDocId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<VLegalDDRel> getTypeClass() {
				return VLegalDDRel.class;
			}
		};
}