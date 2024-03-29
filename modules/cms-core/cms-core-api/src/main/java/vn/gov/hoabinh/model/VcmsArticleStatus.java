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
 * The extended model interface for the VcmsArticleStatus service. Represents a row in the &quot;VcmsArticleStatus&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see VcmsArticleStatusModel
 * @see vn.gov.hoabinh.model.impl.VcmsArticleStatusImpl
 * @see vn.gov.hoabinh.model.impl.VcmsArticleStatusModelImpl
 * @generated
 */
@ImplementationClassName("vn.gov.hoabinh.model.impl.VcmsArticleStatusImpl")
@ProviderType
public interface VcmsArticleStatus extends VcmsArticleStatusModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link vn.gov.hoabinh.model.impl.VcmsArticleStatusImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VcmsArticleStatus, Long> STATUS_ID_ACCESSOR = new Accessor<VcmsArticleStatus, Long>() {
			@Override
			public Long get(VcmsArticleStatus vcmsArticleStatus) {
				return vcmsArticleStatus.getStatusId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<VcmsArticleStatus> getTypeClass() {
				return VcmsArticleStatus.class;
			}
		};

	public static final Accessor<VcmsArticleStatus, String> ARTICLE_ID_ACCESSOR = new Accessor<VcmsArticleStatus, String>() {
			@Override
			public String get(VcmsArticleStatus vcmsArticleStatus) {
				return vcmsArticleStatus.getArticleId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<VcmsArticleStatus> getTypeClass() {
				return VcmsArticleStatus.class;
			}
		};

	public static final Accessor<VcmsArticleStatus, String> CATEGORY_ID_ACCESSOR =
		new Accessor<VcmsArticleStatus, String>() {
			@Override
			public String get(VcmsArticleStatus vcmsArticleStatus) {
				return vcmsArticleStatus.getCategoryId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<VcmsArticleStatus> getTypeClass() {
				return VcmsArticleStatus.class;
			}
		};
}