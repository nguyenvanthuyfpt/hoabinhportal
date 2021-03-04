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

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.AdvType;
import vn.gov.hoabinh.service.base.AdvTypeLocalServiceBaseImpl;

/**
 * The implementation of the adv type local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.AdvTypeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AdvTypeLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.AdvTypeLocalServiceUtil
 */
@ProviderType
public class AdvTypeLocalServiceImpl extends AdvTypeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.AdvTypeLocalServiceUtil} to access the adv type
	 * local service.
	 */

	public AdvType addType(long groupId, long companyId, long plid, String name, String description)
			throws PortalException, SystemException, RemoteException {

		long typeId = CounterLocalServiceUtil.increment(AdvType.class.getName());

		AdvType type = advTypePersistence.create(typeId);

		type.setCompanyId(companyId);
		type.setGroupId(groupId);
		type.setCreateDate(new Date());
		type.setModifiedDate(new Date());
		type.setName(name);
		type.setDescription(description);

		advTypePersistence.update(type);

		return type;
	}

	public AdvType updateType(long typeId, long groupId, long companyId, long plid, String name, String description)
			throws PortalException, SystemException, RemoteException {

		AdvType type = advTypePersistence.findByPrimaryKey(typeId);

		type.setCompanyId(companyId);
		type.setGroupId(groupId);
		type.setModifiedDate(new Date());
		type.setName(name);
		type.setDescription(description);
		advTypePersistence.update(type);
		return type;
	}

	public AdvType getType(long typeId) throws PortalException, SystemException, RemoteException {
		return advTypePersistence.findByPrimaryKey(typeId);
	}

	public int getItemCount(long typeId) throws PortalException, SystemException, RemoteException {
		return advTypePersistence.countAll();
	}

	public List<AdvType> getTypeByG(long groupId) throws PortalException, SystemException, RemoteException {
		return advTypePersistence.findByG(groupId);
	}

	public List<AdvType> getTypeByG(long groupId, int start, int end)
			throws PortalException, SystemException, RemoteException {
		return advTypePersistence.findByG(groupId, start, end);
	}

	public int countTypeByG(long groupId) throws PortalException, SystemException, RemoteException {
		return advTypePersistence.countByG(groupId);
	}

}