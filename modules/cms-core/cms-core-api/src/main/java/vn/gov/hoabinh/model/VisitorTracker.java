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
 * The extended model interface for the VisitorTracker service. Represents a row in the &quot;VisitorTracker&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see VisitorTrackerModel
 * @see vn.gov.hoabinh.model.impl.VisitorTrackerImpl
 * @see vn.gov.hoabinh.model.impl.VisitorTrackerModelImpl
 * @generated
 */
@ImplementationClassName("vn.gov.hoabinh.model.impl.VisitorTrackerImpl")
@ProviderType
public interface VisitorTracker extends VisitorTrackerModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link vn.gov.hoabinh.model.impl.VisitorTrackerImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<VisitorTracker, Long> VISITOR_ID_ACCESSOR = new Accessor<VisitorTracker, Long>() {
			@Override
			public Long get(VisitorTracker visitorTracker) {
				return visitorTracker.getVisitorId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<VisitorTracker> getTypeClass() {
				return VisitorTracker.class;
			}
		};
}