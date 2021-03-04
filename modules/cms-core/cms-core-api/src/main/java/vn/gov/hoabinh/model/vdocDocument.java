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
 * The extended model interface for the vdocDocument service. Represents a row in the &quot;vdocDocument&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see vdocDocumentModel
 * @see vn.gov.hoabinh.model.impl.vdocDocumentImpl
 * @see vn.gov.hoabinh.model.impl.vdocDocumentModelImpl
 * @generated
 */
@ImplementationClassName("vn.gov.hoabinh.model.impl.vdocDocumentImpl")
@ProviderType
public interface vdocDocument extends vdocDocumentModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link vn.gov.hoabinh.model.impl.vdocDocumentImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<vdocDocument, String> DOC_ID_ACCESSOR = new Accessor<vdocDocument, String>() {
			@Override
			public String get(vdocDocument vdocDocument) {
				return vdocDocument.getDocId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<vdocDocument> getTypeClass() {
				return vdocDocument.class;
			}
		};
}