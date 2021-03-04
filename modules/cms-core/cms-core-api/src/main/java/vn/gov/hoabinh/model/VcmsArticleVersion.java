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
 * The extended model interface for the VcmsArticleVersion service. Represents a row in the &quot;VcmsArticleVersion&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleVersionModel
 * @see vn.gov.hoabinh.model.impl.VcmsArticleVersionImpl
 * @see vn.gov.hoabinh.model.impl.VcmsArticleVersionModelImpl
 * @generated
 */
@ImplementationClassName("vn.gov.hoabinh.model.impl.VcmsArticleVersionImpl")
@ProviderType
public interface VcmsArticleVersion extends VcmsArticleVersionModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link vn.gov.hoabinh.model.impl.VcmsArticleVersionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VcmsArticleVersion, Long> ARTICLE_VERSION_ID_ACCESSOR =
		new Accessor<VcmsArticleVersion, Long>() {
			@Override
			public Long get(VcmsArticleVersion vcmsArticleVersion) {
				return vcmsArticleVersion.getArticleVersionId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<VcmsArticleVersion> getTypeClass() {
				return VcmsArticleVersion.class;
			}
		};
}