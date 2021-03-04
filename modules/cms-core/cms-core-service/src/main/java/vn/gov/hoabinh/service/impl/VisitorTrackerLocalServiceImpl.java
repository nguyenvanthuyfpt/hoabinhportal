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

package vn.gov.hoabinh.service.impl;

import java.util.Date;

import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.VLegalDocument;
import vn.gov.hoabinh.model.VcmsArticle;
import vn.gov.hoabinh.model.VisitorTracker;
import vn.gov.hoabinh.service.base.VisitorTrackerLocalServiceBaseImpl;

/**
 * The implementation of the visitor tracker local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link vn.gov.hoabinh.service.VisitorTrackerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VisitorTrackerLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VisitorTrackerLocalServiceUtil
 */
@ProviderType
public class VisitorTrackerLocalServiceImpl
	extends VisitorTrackerLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link vn.gov.hoabinh.service.VisitorTrackerLocalServiceUtil} to access the visitor tracker local service.
	 */
	
	public VisitorTracker addVisitor(long companyId, long groupId) throws Exception {
		long visitorId = counterLocalService.increment(VisitorTracker.class.getName());
		VisitorTracker visitor = visitorTrackerPersistence.create(visitorId);
		visitor.setCompanyId(companyId);
		visitor.setGroupId(groupId);
		visitor.setCreatedDate(new Date());
		visitorTrackerPersistence.update(visitor);
		return visitor;
	}
	
	public int countVisitorByC_G(long companyId, long groupId) throws Exception {
		return visitorTrackerPersistence.countByC_G(companyId, groupId);
	}
	
	public int countVisitorByDate(long companyId, long groupId, Date startDate, Date endDate) throws Exception {
		DynamicQuery dynamicQuery = buildDynamicQuery(companyId, groupId, startDate, endDate);
		return (int) visitorTrackerLocalService.dynamicQueryCount(dynamicQuery);
	}
	
	public DynamicQuery buildDynamicQuery(long companyId, long groupId, Date startDate, Date endDate) {
		Junction junction = RestrictionsFactoryUtil.conjunction();

		junction.add(PropertyFactoryUtil.forName("companyId").eq(companyId));
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VisitorTracker.class, getClassLoader());
		dynamicQuery.add(PropertyFactoryUtil.forName("createdDate").between(startDate, endDate));

		return dynamicQuery.add(junction);
	}
}