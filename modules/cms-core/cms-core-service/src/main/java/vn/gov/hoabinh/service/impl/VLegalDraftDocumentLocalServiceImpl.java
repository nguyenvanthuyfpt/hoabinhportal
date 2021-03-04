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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.VLegalDocument;
import vn.gov.hoabinh.model.VLegalDraftDocument;
import vn.gov.hoabinh.model.vdocDocument;
import vn.gov.hoabinh.service.base.VLegalDraftDocumentLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VLegalDraftDocumentUtil;
import vn.gov.hoabinh.service.persistence.VLegalSuggestDocumentUtil;
import vn.gov.hoabinh.util.PortalUtil;

/**
 * The implementation of the v legal draft document local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VLegalDraftDocumentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDraftDocumentLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VLegalDraftDocumentLocalServiceUtil
 */
@ProviderType
public class VLegalDraftDocumentLocalServiceImpl extends VLegalDraftDocumentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VLegalDraftDocumentLocalServiceUtil} to access the
	 * v legal draft document local service.
	 */

	public static final int APPROVAL_PENDING = 0;

	public static final int PUBLISH_PENDING = 1;

	public static final int PUBLISHED = 2;

	public VLegalDraftDocument addDraft(long companyId, long groupId, long userId, String title, String content,
			String language, String typeId, String fieldId, int highlevel, String docCode, Date expiredDate,
			boolean hasAttachment, ThemeDisplay themeDisplay) throws PortalException, SystemException, RemoteException {

		// _validate(title, content);

		long id = counterLocalService.increment();

		Date now = new Date();

		if (highlevel == 0) {
			highlevel = 1;
		}

		String draftId = String.valueOf(counterLocalService.increment());

		if (docCode == null) {
			docCode = VLegalDraftDocument.class.getName() + "_" + draftId;
		}

		VLegalDraftDocument draftEntry = vLegalDraftDocumentPersistence.create(draftId);

		draftEntry.setCreatedByUser(userId);
		draftEntry.setCreatedDate(now);
		draftEntry.setModifiedByUser(userId);
		draftEntry.setModifiedDate(now);
		draftEntry.setUserId(userId);

		draftEntry.setGroupId(groupId);
		draftEntry.setCompanyId(companyId);
		draftEntry.setTitle(title);
		draftEntry.setContent(content);
		draftEntry.setLanguage(language);
		draftEntry.setDocCode(docCode);

		draftEntry.setDraftLevel(highlevel);
		draftEntry.setTypeId(typeId);
		draftEntry.setFieldId(fieldId);
		draftEntry.setHasAttachment(hasAttachment);

		draftEntry.setApprovedByUser(0);
		draftEntry.setApprovedByUser(0);
		draftEntry.setPublishedByUser(0);
		draftEntry.setPublishedDate(null);

		draftEntry.setExpiredDate(expiredDate);
		draftEntry.setStatusDraft(APPROVAL_PENDING);

		vLegalDraftDocumentPersistence.update(draftEntry);
		return draftEntry;
	}

	public VLegalDraftDocument updateDraft(String draftId, long groupId, long userId, String title, String content,
			String language, String typeId, String fieldId, Date expiredDate, int status, boolean hasAttachment)
			throws PortalException, SystemException, RemoteException {

		Date now = new Date();

		VLegalDraftDocument draft = vLegalDraftDocumentPersistence.findByPrimaryKey(draftId);

		draft.setTitle(title);
		draft.setContent(content);
		draft.setLanguage(language);

		draft.setGroupId(groupId);
		draft.setTypeId(typeId);
		draft.setFieldId(fieldId);
		draft.setHasAttachment(hasAttachment);
		draft.setExpiredDate(expiredDate);

		draft.setModifiedByUser(userId);
		draft.setModifiedDate(now);

		int oldstatus = draft.getStatusDraft();

		if (oldstatus != status) {
			// This Draft is approved...but not published
			if (status == PUBLISH_PENDING) {

				draft.setApprovedByUser(userId);
				draft.setApprovedDate(now);

				draft.setPublishedDate(null);
				draft.setPublishedByUser(0);
			} else if (status == PUBLISHED) {

				draft.setPublishedDate(now);
				draft.setPublishedByUser(userId);

			} else if (status == APPROVAL_PENDING) {
				draft.setApprovedByUser(0);
				draft.setApprovedDate(null);

				draft.setPublishedDate(null);
				draft.setPublishedByUser(0);

				// Logging...
				/*
				 * VLegalLoggerServiceUtil .log(groupId,
				 * CalendarUtil.getTimestamp(now) + " -- " + ((oldstatus ==
				 * PUBLISHED) ? "CANCEL PUBLISHED" : "CANCEL APPROVED") +
				 * " [vlegal] -> draft [" + title + "] by " + userId);
				 */
			}

			// Set new status...
			draft.setStatusDraft(status);
		} else {

			// Logging...
			/*
			 * VLegalLoggerServiceUtil.log(groupId,
			 * CalendarUtil.getTimestamp(now) +
			 * " -- UPDATE: [vlegal] -> draft [" + title + "] by " + userId);
			 */
		}
		// draft.setDocCode(docCode);

		vLegalDraftDocumentPersistence.update(draft);

		return draft;
	}

	public VLegalDraftDocument updateDraft(VLegalDraftDocument draft)
			throws PortalException, SystemException, RemoteException {

		return updateDraft(draft.getDraftId(), draft.getGroupId(), draft.getUserId(), draft.getTitle(),
				draft.getContent(), draft.getLanguage(), draft.getTypeId(), draft.getFieldId(), draft.getExpiredDate(),
				draft.getStatusDraft(), draft.getHasAttachment());
	}

	public void deleteDraft(String draftId) throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(draftId) || Validator.equals(draftId, "")) {
			return;
		}

		Date now = new Date();
		long userId = Long.parseLong(PortalUtil.getUserId());

		VLegalDraftDocument ldraft = VLegalDraftDocumentUtil.findByPrimaryKey(draftId);

		// Remove draft by draftId
		vLegalDraftDocumentPersistence.remove(draftId);

		// Remove suggestion by draftId
		VLegalSuggestDocumentUtil.removeBySuggByDraftId(draftId);

		// Logging...
		/*
		 * VLegalLoggerServiceUtil.log(0, CalendarUtil.getTimestamp(now) +
		 * " -- DELETE DRAFT : [vlegal] -> draft [" + ldraft.getTitle() +
		 * "] by " + userPersistence.findByPrimaryKey(userId).getScreenName());
		 */
	}

	public void deleteDrafts(String[] draftIds) throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(draftIds) || draftIds.length < 0) {
			return;
		}

		for (int i = 0; i < draftIds.length; i++) {
			deleteDraft(draftIds[i]);
		}
	}

	public VLegalDraftDocument getDraft(String draftId) throws PortalException, SystemException, RemoteException {
		/*
		 * if (Validator.isNull(draftId) || Validator.equals(draftId, "")) {
		 * throw new NoSuchVlegalDraftDocumentException(); }
		 */

		return vLegalDraftDocumentPersistence.findByPrimaryKey(draftId);
	}

	public VLegalDraftDocument getDraft(long groupId, String draftId)
			throws PortalException, SystemException, RemoteException {
		/*
		 * if (Validator.isNull(draftId) || Validator.equals(draftId, "")) {
		 * throw new NoSuchVlegalDraftDocumentException(); }
		 */

		return vLegalDraftDocumentPersistence.findByG_D(groupId, draftId);
	}

	public List<VLegalDraftDocument> getDrafts(String[] draftIds)
			throws PortalException, SystemException, RemoteException {

		List<VLegalDraftDocument> listDraft = new ArrayList<VLegalDraftDocument>();

		for (int i = 0; i < draftIds.length; i++) {
			listDraft.add(getDraft(draftIds[i]));
		}

		return listDraft;
	}

	public List<VLegalDraftDocument> getDraftsByDocCode(String docCode)
			throws PortalException, SystemException, RemoteException {

		List<VLegalDraftDocument> listDraft = new ArrayList();
		if (Validator.isNull(docCode) || Validator.equals(docCode, "")) {
			return listDraft;
		}

		listDraft = vLegalDraftDocumentPersistence.findByDocCode(docCode);

		return listDraft;
	}

	public List<VLegalDraftDocument> getDraftsByP_L_S(long groupId, String language, int status)
			throws PortalException, SystemException, RemoteException {
		return vLegalDraftDocumentPersistence.findByP_S_L(groupId, status, language);
	}

	public List<VLegalDraftDocument> getDraftsByP_L_S(long groupId, String language, int status, int start, int end)
			throws PortalException, SystemException, RemoteException {
		return vLegalDraftDocumentPersistence.findByP_S_L(groupId, status, language, start, end);
	}

	public int countDraftsByP_L_S(long groupId, String language, int status)
			throws PortalException, SystemException, RemoteException {
		return vLegalDraftDocumentPersistence.countByP_S_L(groupId, status, language);
	}

	public List<VLegalDraftDocument> getDraftsByP_S_U_L(long groupId, int status, long createdByUser, String language)
			throws PortalException, SystemException, RemoteException {
		return vLegalDraftDocumentPersistence.findByP_S_U_L(groupId, status, createdByUser, language);
	}

	public List<VLegalDraftDocument> getDraftsByP_S_D(long groupId, int status, String docCode)
			throws PortalException, SystemException, RemoteException {

		return vLegalDraftDocumentPersistence.findByP_S_D(groupId, status, docCode);
	}

	public List<VLegalDraftDocument> getDraftsByP_S_F(long groupId, int status, String fieldId)
			throws PortalException, SystemException, RemoteException {

		return vLegalDraftDocumentPersistence.findByP_S_F(groupId, status, fieldId);
	}

	public List<VLegalDraftDocument> getDraftsByP_S_T(long groupId, int status, String typeId)
			throws PortalException, SystemException, RemoteException {

		return vLegalDraftDocumentPersistence.findByP_S_T(groupId, status, typeId);
	}

	public List<VLegalDraftDocument> getDraftsByG_L_F_S_D(long groupId, String language, String fieldId,
			int statusDraft, String draftId, int num) {
		return vLegalDraftDocumentPersistence.findByG_L_F_S_D(groupId, language, fieldId, statusDraft, draftId, 0, num);
	}

	public List<VLegalDraftDocument> getDraftsByG_L_T_S_D(long groupId, String language, String typeId, int statusDraft,
			String draftId, int num) {
		return vLegalDraftDocumentPersistence.findByG_L_T_S_D(groupId, language, typeId, statusDraft, draftId, 0, num);
	}

	public List<VLegalDraftDocument> getDratfsbyP_S(long groupId, String language)
			throws PortalException, SystemException, RemoteException {
		return vLegalDraftDocumentPersistence.findByP_L(groupId, language);
	}

	public int countByStatus(long groupId, String language, int status) throws SystemException {
		return vLegalDraftDocumentPersistence.countByP_S_L(groupId, status, language);
	}

	public List<VLegalDraftDocument> searchDraft(long groupId, String language, String keyword, String fieldId,
			String typeId, Date dateFrom, Date dateTo, int status, int start, int end) {
		DynamicQuery dynamicQuery = buildDQBackEnd(groupId, language, keyword, fieldId, typeId, dateFrom, dateTo,
				status, false);
		return vLegalDraftDocumentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	public int countDraft(long groupId, String language, String keyword, String fieldId, String typeId, Date dateFrom,
			Date dateTo, int status) {
		DynamicQuery dynamicQuery = buildDQBackEnd(groupId, language, keyword, fieldId, typeId, dateFrom, dateTo,
				status, true);
		return (int) vLegalDraftDocumentLocalService.dynamicQueryCount(dynamicQuery);
	}
	
	public int countDraftPublished(long groupId, String language, int status) {
		DynamicQuery dynamicQuery = buildDQFrontEnd(groupId, language, status, true);
		return (int) vLegalDraftDocumentLocalService.dynamicQueryCount(dynamicQuery);
	}

	public List<VLegalDraftDocument> getDraftPublished(long groupId, String language, int status, int start, int end) {
		DynamicQuery dynamicQuery = buildDQFrontEnd(groupId, language, status, false);
		return vLegalDraftDocumentLocalService.dynamicQuery(dynamicQuery, start, end);
	}
	
	public DynamicQuery buildDQBackEnd(long groupId, String language, String keyword, String fieldId, String typeId,
			Date dateFrom, Date dateTo, int status, boolean isCount) {
		Junction junction = null;
		junction = RestrictionsFactoryUtil.conjunction();
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));

		if (!"0".equals(fieldId) && !"".equals(fieldId)) {
			junction.add(PropertyFactoryUtil.forName("fieldId").eq(fieldId));
		}

		if (!"0".equals(typeId) && !"".equals(typeId)) {
			junction.add(PropertyFactoryUtil.forName("typeId").eq(typeId));
		}

		if (Validator.isNotNull(keyword)) {
			junction.add(PropertyFactoryUtil.forName("title").like("%" + keyword + "%"));
		}

		if (status > -1) {
			junction.add(PropertyFactoryUtil.forName("statusDraft").eq(status));
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VLegalDraftDocument.class, getClassLoader());

		if (!isCount) {
			if (status == 0) {
				dynamicQuery.addOrder(OrderFactoryUtil.desc("createdDate"));
			} else if (status == 1) {
				dynamicQuery.addOrder(OrderFactoryUtil.desc("approvedDate"));
			} else if (status == 2) {
				dynamicQuery.addOrder(OrderFactoryUtil.desc("publishedDate"));
			}
		}
		return dynamicQuery.add(junction);
	}
	
	public DynamicQuery buildDQFrontEnd(long groupId, String language, int status, boolean isCount) {
		Junction junction = null;
		junction = RestrictionsFactoryUtil.conjunction();
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));
		junction.add(PropertyFactoryUtil.forName("statusDraft").ge(status));

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VLegalDraftDocument.class, getClassLoader());

		if (!isCount) {
			dynamicQuery.addOrder(OrderFactoryUtil.desc("publishedDate"));
		}
		return dynamicQuery.add(junction);
	}
}