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

import javax.portlet.ActionRequest;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.exception.NoSuchVcmsDiscussionException;
import vn.gov.hoabinh.model.VcmsDiscussion;
import vn.gov.hoabinh.service.base.VcmsDiscussionLocalServiceBaseImpl;

/**
 * The implementation of the vcms discussion local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VcmsDiscussionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VcmsDiscussionLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VcmsDiscussionLocalServiceUtil
 */
@ProviderType
public class VcmsDiscussionLocalServiceImpl extends VcmsDiscussionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VcmsDiscussionLocalServiceUtil} to access the vcms
	 * discussion local service.
	 */

	public VcmsDiscussion addDiscussion(String visitorName, String visitorEmail, String visitorPhone,
			long groupId, long companyId, String articleId, String title, String content, boolean hasAttachment,
			String language) throws PortalException, SystemException, RemoteException {

		String discussionId = Long.toString(CounterLocalServiceUtil.increment(VcmsDiscussion.class.getName()));
		VcmsDiscussion discussion = vcmsDiscussionPersistence.create(discussionId);
		discussion.setVisitorName(visitorName);
		discussion.setVisitorEmail(visitorEmail);
		discussion.setVisitorPhone(visitorPhone);

		discussion.setGroupId(groupId);
		discussion.setCompanyId(companyId);

		discussion.setArticleId(articleId);
		discussion.setTitle(title);
		discussion.setContent(content);
		discussion.setLanguage(language);

		discussion.setApproved(false);
		discussion.setApprovedByUser(null);
		discussion.setApprovedDate(null);

		discussion.setPostedDate(new Date());
		discussion.setHasAttachment(hasAttachment);

		vcmsDiscussionPersistence.update(discussion);

		return discussion;
	}

	public VcmsDiscussion updateDiscussion(String discussionId, String visitorName, String visitorEmail,
			String visitorPhone, long groupId, long companyId, String articleId, String title, String content,
			boolean hasAttachment, boolean approved, String language)
			throws PortalException, SystemException, RemoteException {

		VcmsDiscussion discussion = vcmsDiscussionPersistence.findByPrimaryKey(discussionId);
		Date now = new Date();
		discussion.setVisitorName(visitorName);
		discussion.setVisitorEmail(visitorEmail);
		discussion.setVisitorPhone(visitorPhone);
		discussion.setGroupId(groupId);
		discussion.setCompanyId(companyId);
		discussion.setArticleId(articleId);
		discussion.setTitle(title);
		discussion.setContent(content);
		discussion.setPostedDate(now);
		discussion.setHasAttachment(hasAttachment);
		discussion.setLanguage(language);

		vcmsDiscussionPersistence.update(discussion);

		return discussion;
	}

	public void deleteDiscussions(String articleId) throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(articleId)) {
			return;
		}

		vcmsDiscussionPersistence.removeByArticle(articleId);
	}

	public void deleteDiscussions(String articleId, boolean approved)
			throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(articleId)) {
			return;
		}

		vcmsDiscussionPersistence.removeByA_A(articleId, approved);
	}

	public VcmsDiscussion getDiscussion(String discussionId) throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(discussionId)) {
			throw new NoSuchVcmsDiscussionException();
		}

		return vcmsDiscussionPersistence.findByPrimaryKey(discussionId);
	}

	public List<VcmsDiscussion> getDiscussions(String articleId)
			throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(articleId)) {
			return new ArrayList();
		}

		return vcmsDiscussionPersistence.findByArticle(articleId);
	}

	public List<VcmsDiscussion> getDiscussions(String articleId, boolean approved)
			throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(articleId)) {
			return new ArrayList();
		}

		return vcmsDiscussionPersistence.findByA_A(articleId, approved);
	}

	public List<VcmsDiscussion> getDiscussionsByP_L(long groupId, String language)
			throws PortalException, SystemException, RemoteException {

		return vcmsDiscussionPersistence.findByP_L(groupId, language);
	}

	public List<VcmsDiscussion> getDiscussionsByP_L_A(long groupId, String language, boolean approved)
			throws PortalException, SystemException, RemoteException {

		return vcmsDiscussionPersistence.findByP_L_A(groupId, language, approved);
	}

	public List<VcmsDiscussion> getDiscussionsByA_P_L_A(String articleId, long groupId, String language,
			boolean approved) throws PortalException, SystemException, RemoteException {

		return vcmsDiscussionPersistence.findByA_P_L_A(articleId, groupId, language, approved);
	}

	public int countByApproval(long groupId, String language, boolean approved)
			throws PortalException, SystemException, RemoteException {

		return vcmsDiscussionPersistence.countByP_L_A(groupId, language, approved);
	}

}