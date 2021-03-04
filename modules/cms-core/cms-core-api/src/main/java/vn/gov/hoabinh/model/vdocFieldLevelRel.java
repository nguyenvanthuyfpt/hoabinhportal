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
 * The extended model interface for the vdocFieldLevelRel service. Represents a row in the &quot;vdocFieldLevelRel&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see vdocFieldLevelRelModel
 * @see vn.gov.hoabinh.model.impl.vdocFieldLevelRelImpl
 * @see vn.gov.hoabinh.model.impl.vdocFieldLevelRelModelImpl
 * @generated
 */
@ImplementationClassName("vn.gov.hoabinh.model.impl.vdocFieldLevelRelImpl")
@ProviderType
public interface vdocFieldLevelRel extends vdocFieldLevelRelModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link vn.gov.hoabinh.model.impl.vdocFieldLevelRelImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<vdocFieldLevelRel, String> FIELD_ID_ACCESSOR = new Accessor<vdocFieldLevelRel, String>() {
			@Override
			public String get(vdocFieldLevelRel vdocFieldLevelRel) {
				return vdocFieldLevelRel.getFieldId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<vdocFieldLevelRel> getTypeClass() {
				return vdocFieldLevelRel.class;
			}
		};

	public static final Accessor<vdocFieldLevelRel, String> LEVEL_ID_ACCESSOR = new Accessor<vdocFieldLevelRel, String>() {
			@Override
			public String get(vdocFieldLevelRel vdocFieldLevelRel) {
				return vdocFieldLevelRel.getLevelId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<vdocFieldLevelRel> getTypeClass() {
				return vdocFieldLevelRel.class;
			}
		};
}