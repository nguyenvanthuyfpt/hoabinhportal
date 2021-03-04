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

import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.LinkGroup;
import vn.gov.hoabinh.service.base.LinkGroupLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.LinkGroupUtil;

/**
 * The implementation of the link group local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.LinkGroupLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LinkGroupLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.LinkGroupLocalServiceUtil
 */
@ProviderType
public class LinkGroupLocalServiceImpl extends LinkGroupLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.LinkGroupLocalServiceUtil} to access the link
	 * group local service.
	 */

	public LinkGroup addLinkGroup(long groupId, long companyId, long plid, String name, String description,
			int position, long userId) throws PortalException, SystemException, RemoteException {

		long linkgroupId = CounterLocalServiceUtil.increment(LinkGroup.class.getName());

		LinkGroup linkGroup = LinkGroupUtil.create(linkgroupId);

		linkGroup.setCompanyId(companyId);
		linkGroup.setGroupId(groupId);

		linkGroup.setName(name);
		linkGroup.setDescription(description);
		linkGroup.setPosition(position);
		linkGroup.setCreatedDate(new Date());

		linkGroupPersistence.update(linkGroup);

		return linkGroup;
	}

	public LinkGroup updateLinkGroup(long linkgroupId, long groupId, long companyId, String name, String description,
			int position) throws PortalException, SystemException {

		LinkGroup linkGroup = LinkGroupUtil.findByPrimaryKey(linkgroupId);

		linkGroup.setCompanyId(companyId);
		linkGroup.setGroupId(groupId);

		linkGroup.setName(name);
		linkGroup.setDescription(description);
		linkGroup.setPosition(position);
		linkGroup.setModifiedDate(new Date());

		linkGroupPersistence.update(linkGroup);
		return linkGroup;
	}

	public List<LinkGroup> getByGroupId(long groupId) throws PortalException, SystemException {
		return linkGroupPersistence.findBygroupId(groupId);
	}

	public List<LinkGroup> getByGroupId(long groupId, int start, int end)
			throws PortalException, SystemException, RemoteException {
		return linkGroupPersistence.findBygroupId(groupId, start, end);
	}

	public int countByGroupId(long groupId) throws PortalException, SystemException, RemoteException {
		return linkGroupPersistence.countBygroupId(groupId);
	}
	
	public List<LinkGroup> getLinkGroupByIds(String[] linkGroupSel) {
		List<LinkGroup> retval = null;
		long[] linkgroupIds = new long[linkGroupSel.length];
		if (Validator.isNotNull(linkGroupSel)) {
			for (int i=0;i<linkGroupSel.length;i++) {
				linkgroupIds[i] = Long.parseLong(linkGroupSel[i]);
			}
			retval = linkGroupPersistence.findByMenu(linkgroupIds);
		}
		return retval;
	}
}