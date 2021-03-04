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
 * The extended model interface for the VLegalDraftDocument service. Represents a row in the &quot;VLegalDraftDocument&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDraftDocumentModel
 * @see vn.gov.hoabinh.model.impl.VLegalDraftDocumentImpl
 * @see vn.gov.hoabinh.model.impl.VLegalDraftDocumentModelImpl
 * @generated
 */
@ImplementationClassName("vn.gov.hoabinh.model.impl.VLegalDraftDocumentImpl")
@ProviderType
public interface VLegalDraftDocument extends VLegalDraftDocumentModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link vn.gov.hoabinh.model.impl.VLegalDraftDocumentImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VLegalDraftDocument, String> DRAFT_ID_ACCESSOR = new Accessor<VLegalDraftDocument, String>() {
			@Override
			public String get(VLegalDraftDocument vLegalDraftDocument) {
				return vLegalDraftDocument.getDraftId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<VLegalDraftDocument> getTypeClass() {
				return VLegalDraftDocument.class;
			}
		};

	public boolean isExpired();
}