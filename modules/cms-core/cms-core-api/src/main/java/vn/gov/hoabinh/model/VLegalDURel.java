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
 * The extended model interface for the VLegalDURel service. Represents a row in the &quot;VLegalDURel&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDURelModel
 * @see vn.gov.hoabinh.model.impl.VLegalDURelImpl
 * @see vn.gov.hoabinh.model.impl.VLegalDURelModelImpl
 * @generated
 */
@ImplementationClassName("vn.gov.hoabinh.model.impl.VLegalDURelImpl")
@ProviderType
public interface VLegalDURel extends VLegalDURelModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link vn.gov.hoabinh.model.impl.VLegalDURelImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VLegalDURel, Long> DEPARTMENT_ID_ACCESSOR = new Accessor<VLegalDURel, Long>() {
			@Override
			public Long get(VLegalDURel vLegalDURel) {
				return vLegalDURel.getDepartmentId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<VLegalDURel> getTypeClass() {
				return VLegalDURel.class;
			}
		};

	public static final Accessor<VLegalDURel, Long> USERID_ACCESSOR = new Accessor<VLegalDURel, Long>() {
			@Override
			public Long get(VLegalDURel vLegalDURel) {
				return vLegalDURel.getUserid();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<VLegalDURel> getTypeClass() {
				return VLegalDURel.class;
			}
		};
}