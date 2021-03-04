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
import vn.gov.hoabinh.model.VcmsAttachedMessage;
import vn.gov.hoabinh.service.base.VcmsAttachedMessageLocalServiceBaseImpl;

/**
 * The implementation of the vcms attached message local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VcmsAttachedMessageLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsAttachedMessageLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VcmsAttachedMessageLocalServiceUtil
 */
@ProviderType
public class VcmsAttachedMessageLocalServiceImpl extends VcmsAttachedMessageLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VcmsAttachedMessageLocalServiceUtil} to access the
	 * vcms attached message local service.
	 */
	public VcmsAttachedMessage addAttachedMessage(long groupId, String createdByUser, String articleId, String message)
			throws PortalException, SystemException, RemoteException {
		String messageId = Long.toString(CounterLocalServiceUtil.increment(VcmsAttachedMessage.class.getName()));
		Date now = new Date();
		VcmsAttachedMessage vcmsAttachedMessage = vcmsAttachedMessagePersistence.create(messageId);

		vcmsAttachedMessage.setArticleId(articleId);
		vcmsAttachedMessage.setGroupId(groupId);
		vcmsAttachedMessage.setCreatedDate(now);
		vcmsAttachedMessage.setCreatedByUser(createdByUser);
		vcmsAttachedMessage.setReadMessage(false);
		vcmsAttachedMessagePersistence.update(vcmsAttachedMessage, null);
		return vcmsAttachedMessage;
	}

	public VcmsAttachedMessage updateAttachedMessage(String messageId, boolean read)
			throws PortalException, SystemException, RemoteException {
		Date now = new Date();
		VcmsAttachedMessage vcmsAttachedMessage = vcmsAttachedMessagePersistence.findByPrimaryKey(messageId);
		vcmsAttachedMessage.setReadMessage(true);
		vcmsAttachedMessagePersistence.update(vcmsAttachedMessage, null);
		return vcmsAttachedMessage;
	}

	public List<VcmsAttachedMessage> getAttachedMessageByArticle(String articleId)
			throws PortalException, SystemException, RemoteException {
		return vcmsAttachedMessagePersistence.findByArticle(articleId);
	}

	public List<VcmsAttachedMessage> getAttachedMessageByG(long groupId)
			throws PortalException, SystemException, RemoteException {
		return vcmsAttachedMessagePersistence.findByG_R(groupId, false);
	}
}