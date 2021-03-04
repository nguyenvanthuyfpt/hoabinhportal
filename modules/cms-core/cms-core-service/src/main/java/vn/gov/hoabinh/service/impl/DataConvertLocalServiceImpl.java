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

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.AdvItem;
import vn.gov.hoabinh.model.DataConvert;
import vn.gov.hoabinh.service.base.DataConvertLocalServiceBaseImpl;

/**
 * The implementation of the data convert local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.DataConvertLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DataConvertLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.DataConvertLocalServiceUtil
 */
@ProviderType
public class DataConvertLocalServiceImpl extends DataConvertLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.DataConvertLocalServiceUtil} to access the data
	 * convert local service.
	 */

	public DataConvert addData(String dataId, long folderId, long groupId, long fileEntryId, String fileName, String url) {
		long id = CounterLocalServiceUtil.increment(DataConvert.class.getName());
		DataConvert data = dataConvertPersistence.create(id);

		data.setDataId(dataId);
		data.setFolderId(folderId);
		data.setGroupId(groupId);
		data.setFileEntryId(fileEntryId);
		data.setCreatedDate(new Date());
		data.setFileName(fileName);
		data.setUrl(url);
		dataConvertPersistence.update(data);
		return data;
	}
}