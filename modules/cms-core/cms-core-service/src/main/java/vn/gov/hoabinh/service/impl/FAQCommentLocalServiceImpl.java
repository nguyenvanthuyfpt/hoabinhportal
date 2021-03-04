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
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.FAQComment;
import vn.gov.hoabinh.service.base.FAQCommentLocalServiceBaseImpl;

/**
 * The implementation of the f a q comment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.FAQCommentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQCommentLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.FAQCommentLocalServiceUtil
 */
@ProviderType
public class FAQCommentLocalServiceImpl extends FAQCommentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.FAQCommentLocalServiceUtil} to access the f a q
	 * comment local service.
	 */

	public FAQComment addComment(long answerId, String content, String commName, String commEmail, boolean approved,
			String approveByUser, Date approvedDate, Date commDate, long userId)
			throws SystemException, PortalException {

		long id = counterLocalService.increment();
		FAQComment comment = faqCommentPersistence.create(id);
		comment.setAnswerid(answerId);
		comment.setContent(content);
		comment.setCommName(commName);
		comment.setCommEmail(commEmail);
		comment.setApproved(approved);
		comment.setApproveByUser(approveByUser);
		comment.setApprovedDate(approvedDate);
		comment.setCommDate(commDate);
		comment.setUserId(userId);

		faqCommentPersistence.update(comment);
		return comment;
	}

	public FAQComment updateComment(long commentId, String content, boolean approved, String approveByUser,
			Date approvedDate, long userId) throws SystemException, PortalException {
		FAQComment comment = faqCommentPersistence.findByPrimaryKey(commentId);
		comment.setContent(content);
		comment.setApproved(approved);
		comment.setApproveByUser(approveByUser);
		comment.setApprovedDate(approvedDate);
		comment.setUserId(userId);
		faqCommentPersistence.update(comment);

		return comment;

	}

	public FAQComment getComment(long commentid) throws SystemException, PortalException {
		return faqCommentPersistence.findByPrimaryKey(commentid);
	}

	public List<FAQComment> getAll() throws SystemException, PortalException {
		return faqCommentPersistence.findAll();
	}

	public void deleteComment(long commentId) throws PortalException, SystemException {
		// Get Comment
		FAQComment comment = faqCommentPersistence.findByPrimaryKey(commentId);

		// Delete Comment
		faqCommentPersistence.remove(commentId);
	}

	public FAQComment unapproved(long commentid) throws SystemException, PortalException {
		FAQComment comment = faqCommentPersistence.findByPrimaryKey(commentid);
		if (comment.isApproved()) {
			comment.setApproved(false);
			faqCommentPersistence.update(comment);
		}
		return comment;
	}

	public List<FAQComment> getByApproved(boolean approved) throws SystemException, PortalException {
		return faqCommentPersistence.findByApproved(approved);
	}

	public List<FAQComment> getByAnswer(long answerid) throws SystemException, PortalException {
		return faqCommentPersistence.findByAnswerid(answerid);
	}

}