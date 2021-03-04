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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.VLegalDocument;
import vn.gov.hoabinh.model.VLegalDraftDocument;
import vn.gov.hoabinh.model.vdocDocument;
import vn.gov.hoabinh.service.base.vdocDocumentLocalServiceBaseImpl;

/**
 * The implementation of the vdoc document local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.vdocDocumentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vdocDocumentLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.vdocDocumentLocalServiceUtil
 */
@ProviderType
public class vdocDocumentLocalServiceImpl extends vdocDocumentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.vdocDocumentLocalServiceUtil} to access the vdoc
	 * document local service.
	 */
	public static final int APPROVAL_PENDING = 0;

	public static final int PUBLISH_PENDING = 1;

	public static final int PUBLISHED = 2;

	public static final int SINGLE = 0;

	public static final int MULTI = 1;

	public vdocDocument addDocument(long groupId, long userId, long companyId, String language, String title, String content, String process,
			String base, String timeProcess, String cost, String result, String requireDoc, String objects,
			String style, String note, Date promulDate, Date effectivedDate, Date expiredDate, String fieldId,
			String orgRels, String fieldRels, boolean hasAttachment, boolean hasService, int typeDoc, String levels,
			String executeOrg) throws PortalException, SystemException, RemoteException {

		String documentId = String.valueOf(counterLocalService.increment());

		Date now = new Date();

		int userHit = 0;

		vdocDocument vDoc = vdocDocumentPersistence.create(documentId);
		vDoc.setCreatedDate(now);
		vDoc.setCreatedByUser(userId);
		vDoc.setGroupId(groupId);
		vDoc.setCompanyId(companyId);
		vDoc.setLanguage(language);

		vDoc.setFieldId(fieldId);
		vDoc.setFieldRels(fieldRels);
		vDoc.setOrgRels(orgRels);

		vDoc.setTitle(title);
		vDoc.setContent(content);
		vDoc.setProcess(process);
		vDoc.setBase(base);
		vDoc.setTimeProcess(timeProcess);
		vDoc.setCost(cost);
		vDoc.setResult(result);
		vDoc.setRequireDoc(requireDoc);
		vDoc.setObjects(objects);
		vDoc.setStyle(style);
		vDoc.setNote(note);
		vDoc.setUserHit(userHit);
		vDoc.setHasAttachment(hasAttachment);
		vDoc.setHasService(hasService);
		vDoc.setTypeDoc(typeDoc);
		vDoc.setLevels(levels);
		vDoc.setExecuteOrg(executeOrg);

		vDoc.setCreatedDate(now);
		vDoc.setCreatedByUser(userId);
		vDoc.setUserId(userId);

		vDoc.setApprovedDate(null);
		vDoc.setApprovedByUser(0);
		vDoc.setPublishedDate(null);
		vDoc.setPublishedByUser(0);
		int position = 1;
		vDoc.setPosition(position);
		vDoc.setStatusDoc(vdocDocumentLocalServiceImpl.APPROVAL_PENDING);
		vdocDocumentPersistence.update(vDoc);
		return vDoc;
	}

	public vdocDocument updateDoc(long userId, long companyId, String docId, long groupId, String language, int status, String title, String content,
			String process, String base, String timeProcess, String cost, String result, String requireDoc,
			String objects, String style, String note, Date promulDate, Date effectivedDate, Date expiredDate,
			String fieldId, String orgRels, String fieldRels, boolean hasAttachment, boolean hasService, int typeDoc,
			String levels, String executeOrg, ThemeDisplay themeDisplay)
			throws PortalException, SystemException, RemoteException {

		vdocDocument vDoc = vdocDocumentPersistence.findByPrimaryKey(docId);

		Date now = new Date();
		vDoc.setGroupId(groupId);
		vDoc.setLanguage(language);

		vDoc.setPromulDate(promulDate);
		vDoc.setEffectivedDate(effectivedDate);
		vDoc.setExpiredDate(expiredDate);
		vDoc.setModifiedByUser(userId);
		vDoc.setModifiedDate(now);

		vDoc.setTitle(title);
		vDoc.setContent(content);
		vDoc.setProcess(process);
		vDoc.setBase(base);
		vDoc.setTimeProcess(timeProcess);
		vDoc.setCost(cost);
		vDoc.setResult(result);
		vDoc.setRequireDoc(requireDoc);
		vDoc.setObjects(objects);
		vDoc.setStyle(style);
		vDoc.setNote(note);

		vDoc.setFieldId(fieldId);
		vDoc.setOrgRels(orgRels);
		vDoc.setFieldRels(fieldRels);

		vDoc.setHasAttachment(hasAttachment);
		vDoc.setHasService(hasService);
		vDoc.setTypeDoc(typeDoc);
		vDoc.setLevels(levels);
		vDoc.setExecuteOrg(executeOrg);
		vDoc.setModifiedDate(now);
		vDoc.setModifiedByUser(userId);

		if (vDoc.getStatusDoc() != status) {
			if (status == PUBLISH_PENDING) {
				vDoc.setApprovedDate(now);
				vDoc.setApprovedByUser(userId);
				vDoc.setPublishedDate(null);
				vDoc.setPublishedByUser(0);
			} else if (status == PUBLISHED) {
				vDoc.setPublishedDate(now);
				vDoc.setPublishedByUser(userId);
			} else if (status == APPROVAL_PENDING) {
				vDoc.setApprovedDate(null);
				vDoc.setApprovedByUser(0);
				vDoc.setPublishedDate(null);
				vDoc.setPublishedByUser(0);
			}
			vDoc.setStatusDoc(status);
		}
		vdocDocumentPersistence.update(vDoc);
		return vDoc;
	}

	public vdocDocument updateDocument(String docId, int position)
			throws PortalException, SystemException, RemoteException {
		vdocDocument vDoc = vdocDocumentPersistence.findByPrimaryKey(docId);
		vDoc.setPosition(position);
		return vdocDocumentPersistence.update(vDoc);
	}

	public vdocDocument updateDocument(vdocDocument vDoc, ThemeDisplay themeDisplay)
			throws PortalException, SystemException, RemoteException {

		return updateDoc(vDoc.getUserId(), vDoc.getCompanyId(), vDoc.getDocId(), vDoc.getGroupId(), vDoc.getLanguage(),
				vDoc.getStatusDoc(), vDoc.getTitle(), vDoc.getContent(), vDoc.getProcess(), vDoc.getBase(),
				vDoc.getTimeProcess(), vDoc.getCost(), vDoc.getResult(), vDoc.getReplaceDoc(), vDoc.getObjects(),
				vDoc.getStyle(), vDoc.getNote(), vDoc.getPromulDate(), vDoc.getEffectivedDate(), vDoc.getExpiredDate(),
				vDoc.getFieldId(), vDoc.getOrgRels(), vDoc.getFieldRels(), vDoc.getHasAttachment(),
				vDoc.getHasService(), vDoc.getTypeDoc(), vDoc.getLevels(), vDoc.getExecuteOrg(), themeDisplay);
	}

	public void deleteDocument(String documentId, ThemeDisplay themeDisplay)
			throws SystemException, PortalException, RemoteException {
		try {
			if (Validator.isNotNull(documentId)) {
				vdocDocument vDoc = vdocDocumentPersistence.findByPrimaryKey(documentId);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public vdocDocument getDocument(String docId) throws SystemException, PortalException {
		return vdocDocumentPersistence.findByPrimaryKey(docId);
	}

	public List<vdocDocument> getDocByG_L_S(long groupId, String language, int status)
			throws SystemException, PortalException {

		return vdocDocumentPersistence.findByG_L_S(groupId, language, status);
	}

	public List<vdocDocument> getDocByG_L_S(long groupId, String language, int status, int begin, int end)
			throws SystemException, PortalException {

		return vdocDocumentPersistence.findByG_L_S(groupId, language, status, begin, end);
	}

	public int countDocByG_L_S(long groupId, String language, int status) throws SystemException, PortalException {

		return vdocDocumentPersistence.countByG_L_S(groupId, language, status);
	}

	public List<vdocDocument> getDocByG_L_F(long groupId, String language, String fieldId)
			throws SystemException, PortalException {

		return vdocDocumentPersistence.findByG_L_F(groupId, language, fieldId);
	}

	public int countDocByG_L_F(long groupId, String language, String fieldId) throws SystemException, PortalException {

		return vdocDocumentPersistence.countByG_L_F(groupId, language, fieldId);
	}

	public int countDocByG_L_F_S(long groupId, String language, String fieldId, int status)
			throws SystemException, PortalException {

		return vdocDocumentPersistence.countByG_L_F_S(groupId, language, fieldId, status);
	}

	public List<vdocDocument> getDocByG_L_S_S(long groupId, String language, int status, boolean hasService)
			throws SystemException, PortalException {

		return vdocDocumentPersistence.findByG_L_S_S(groupId, language, status, hasService);
	}

	public List<vdocDocument> getDocByG_L_S_S(long groupId, String language, int status, boolean hasService, int begin,
			int end) throws SystemException, PortalException {

		return vdocDocumentPersistence.findByG_L_S_S(groupId, language, status, hasService, begin, end);
	}

	public int countDocByG_L_S_S(long groupId, String language, int status, boolean hasService)
			throws SystemException, PortalException {

		return vdocDocumentPersistence.countByG_L_S_S(groupId, language, status, hasService);
	}

	public List<vdocDocument> getDocByG_L_S_T(long groupId, String language, int status, int type)
			throws SystemException, PortalException {
		return vdocDocumentPersistence.findByG_L_S_T(groupId, language, status, type);
	}

	public List<vdocDocument> getDocByG_L_S_T(long groupId, String language, int status, int type, int start, int end)
			throws SystemException, PortalException {
		return vdocDocumentPersistence.findByG_L_S_T(groupId, language, status, type, start, end);
	}

	public int countDocByG_L_S_T(long groupId, String language, int status, int type)
			throws SystemException, PortalException {
		return vdocDocumentPersistence.countByG_L_S_T(groupId, language, status, type);
	}

	public List<vdocDocument> getDocByG_L_S_F_T(long groupId, String language, int status, String fieldId, int type)
			throws PortalException, SystemException, RemoteException {

		return vdocDocumentPersistence.findByG_L_S_F_T(groupId, language, status, fieldId, type);
	}

	public List<vdocDocument> getDocByG_L_S_F_T(long groupId, String language, int status, String fieldId, int type,
			int start, int end) throws PortalException, SystemException, RemoteException {

		return vdocDocumentPersistence.findByG_L_S_F_T(groupId, language, status, fieldId, type, start, end);
	}

	public int countDocByG_L_S_F_T(long groupId, String language, int status, String fieldId, int type)
			throws PortalException, SystemException, RemoteException {

		return vdocDocumentPersistence.countByG_L_S_F_T(groupId, language, status, fieldId, type);
	}

	public vdocDocument findByPosition(int position) throws SystemException {
		vdocDocument vdoc = null;
		List listPosition = vdocDocumentPersistence.findByPosition(position);
		if (listPosition.size() > 0) {
			vdoc = (vdocDocument) listPosition.get(0);
		}
		return vdoc;
	}
	
	public List<VLegalDocument> searchDocument(long groupId, String language, String keyword, String fieldId, String typeId,
			Date dateFrom, Date dateTo, int status, boolean isTitle, boolean isContent, int start, int end) {
		DynamicQuery dynamicQuery = buildDQBackEnd(groupId, language, keyword, fieldId, dateFrom, dateTo, status, false);
		return vdocDocumentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	public int countDocument(long groupId, String language, String keyword, String fieldId, String typeId,
			Date dateFrom, Date dateTo, int status, boolean isTitle, boolean isContent) {
		DynamicQuery dynamicQuery = buildDQBackEnd(groupId, language, keyword, fieldId, dateFrom, dateTo, status, true);
		return (int) vdocDocumentLocalService.dynamicQueryCount(dynamicQuery);
	}
	
	public DynamicQuery buildDQBackEnd(long groupId, String language, String keyword, 
			String fieldId, Date dateFrom, Date dateTo, 
			int status, boolean isCount) {
		Junction junction = null;
		junction = RestrictionsFactoryUtil.conjunction();
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));
		
		if (!"0".equals(fieldId)) {
			junction.add(PropertyFactoryUtil.forName("fieldId").eq(fieldId));
		}
		
		if (Validator.isNotNull(keyword)) {
			junction.add( PropertyFactoryUtil.forName("title").like("%"+keyword+"%"));
		}

		junction.add(PropertyFactoryUtil.forName("statusDoc").eq(status));

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(vdocDocument.class, getClassLoader());
		if (status==0) {
			dynamicQuery.add(RestrictionsFactoryUtil.between("createdDate", dateFrom, dateTo));
		}
		
		if (status==1) {
			dynamicQuery.add(RestrictionsFactoryUtil.between("approvedDate", dateFrom, dateTo));
		}
		
		if (status==2) {
			dynamicQuery.add(RestrictionsFactoryUtil.between("pubishedDate", dateFrom, dateTo));
		}
		
		if(!isCount) {
			if (status==0) {
				dynamicQuery.addOrder(OrderFactoryUtil.desc("createdDate"));
			} else if (status==1) {
				dynamicQuery.addOrder(OrderFactoryUtil.desc("approvedDate"));
			} else if (status==2) {
				dynamicQuery.addOrder(OrderFactoryUtil.desc("publisheddate"));	
			}
		}
		return dynamicQuery.add(junction);
	}
}