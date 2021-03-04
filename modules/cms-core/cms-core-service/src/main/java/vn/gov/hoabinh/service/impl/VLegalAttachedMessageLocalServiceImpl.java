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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.VLegalAttachedMessage;
import vn.gov.hoabinh.service.base.VLegalAttachedMessageLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VLegalAttachedMessageUtil;
import vn.gov.hoabinh.util.PortalUtil;

/**
 * The implementation of the v legal attached message local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VLegalAttachedMessageLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalAttachedMessageLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VLegalAttachedMessageLocalServiceUtil
 */
@ProviderType
public class VLegalAttachedMessageLocalServiceImpl extends VLegalAttachedMessageLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VLegalAttachedMessageLocalServiceUtil} to access
	 * the v legal attached message local service.
	 */

	public VLegalAttachedMessage addMessage(long userId, long companyId, long groupId, String articleId, String content, boolean read)
			throws PortalException, SystemException, RemoteException {

		// Only save the message when its content is not null
		if (Validator.isNull(content)) {
			return null;
		}

		String messageId = String.valueOf(counterLocalService.increment());

		Date now = new Date();
		VLegalAttachedMessage message = vLegalAttachedMessagePersistence.create(messageId);
		message.setCompanyId(companyId);
		message.setGroupId(groupId);
		message.setArticleId(articleId);
		message.setContent(content);
		message.setReadMessage(read);

		message.setCreatedByUser(userId);
		message.setCreatedDate(now);
		message.setUserId(userId);

		vLegalAttachedMessagePersistence.update(message);

		return message;
	}

	public VLegalAttachedMessage updateMessage(String messageId, boolean read)
			throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(messageId)) {
			return null;
		}

		VLegalAttachedMessage message = vLegalAttachedMessagePersistence.findByPrimaryKey(messageId);

		message.setReadMessage(true);

		return vLegalAttachedMessagePersistence.update(message);
	}

	public VLegalAttachedMessage updateMessage(VLegalAttachedMessage message)
			throws PortalException, SystemException, RemoteException {

		return updateMessage(message.getMessageId(), message.getReadMessage());
	}

	public void deleteMessage(String messageId) throws PortalException, SystemException, RemoteException {

		/*
		 * if (Validator.isNull(messageId)) { throw new
		 * NoSuchVlegalDraftDocumentException(); }
		 */

		vLegalAttachedMessagePersistence.remove(messageId);

	}

	public void deleteMessages(String articleId) throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(articleId)) {
			return;
		}

		vLegalAttachedMessagePersistence.removeByArticle(articleId);
	}

	public List<VLegalAttachedMessage> getAllMessageByStatus(long groupId, boolean read) throws SystemException {
		return vLegalAttachedMessagePersistence.findByStatus(groupId, read);
	}

	public VLegalAttachedMessage getMessage(String messageId) throws PortalException, SystemException, RemoteException {

		/*
		 * if (Validator.isNull(messageId)) { throw new
		 * NoSuchVlegalDraftDocumentException(); }
		 */

		return vLegalAttachedMessagePersistence.findByPrimaryKey(messageId);
	}

	public List<VLegalAttachedMessage> getMessages(String[] messageIds) throws PortalException, SystemException, RemoteException {

		List<VLegalAttachedMessage> messages = new ArrayList<VLegalAttachedMessage>();

		if ((messageIds == null) || (messageIds.length <= 0)) {
			return messages;
		}

		for (int i = 0; i < messageIds.length; i++) {
			messages.add(getMessage(messageIds[i]));
		}

		return messages;
	}

	public List<VLegalAttachedMessage> getMessages(String articleId) throws PortalException, SystemException, RemoteException {

		List<VLegalAttachedMessage> messages = new ArrayList<VLegalAttachedMessage>();

		if (Validator.isNull(articleId)) {
			return messages;
		}

		messages = vLegalAttachedMessagePersistence.findByArticle(articleId);

		return messages;
	}

	public List<VLegalAttachedMessage> getMessages(String articleId, boolean read) throws PortalException, SystemException, RemoteException {

		List<VLegalAttachedMessage> messages = new ArrayList<VLegalAttachedMessage>();

		if (Validator.isNull(articleId)) {
			return messages;
		}

		messages = vLegalAttachedMessagePersistence.findByA_R(articleId, read);

		return messages;
	}

	public List<VLegalAttachedMessage> getMessagesByGroup(long groupId) throws PortalException, SystemException, RemoteException {
		return vLegalAttachedMessagePersistence.findByGroupId(groupId);
	}

	public int count(String articleId, boolean read) throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(articleId)) {
			return 0;
		}

		return vLegalAttachedMessagePersistence.countByA_R(articleId, read);
	}
}