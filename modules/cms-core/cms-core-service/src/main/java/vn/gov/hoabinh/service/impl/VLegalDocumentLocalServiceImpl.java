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

import java.io.IOException;
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
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;
import vn.gov.hoabinh.model.VLegalDocument;
import vn.gov.hoabinh.service.base.VLegalDocumentLocalServiceBaseImpl;

/**
 * The implementation of the v legal document local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VLegalDocumentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalDocumentLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VLegalDocumentLocalServiceUtil
 */
@ProviderType
public class VLegalDocumentLocalServiceImpl extends VLegalDocumentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VLegalDocumentLocalServiceUtil} to access the v
	 * legal document local service.
	 */
	public static final int APPROVAL_PENDING = 0;

	public static final int PUBLISH_PENDING = 1;

	public static final int PUBLISHED = 2;

	public static final int FORWARDED = 3;

	public VLegalDocument addDocument(long companyId, long groupId, long userId, String symbol, String num, String replaceDoc, String summary,
			String content, String language, Date promulDate, Date effectivedDate, Date expiredDate, String typeId,
			String fieldId, String orgId, String orgRels, String signerRels, String fieldRels, String numRels,
			String docCode, String departmentRels, boolean hasAttachment, ThemeDisplay themeDisplay)
			throws PortalException, SystemException, RemoteException {

		// _validate(symbol, num, summary, fieldId, orgId, typeId, signerRels);

		String docId = String.valueOf(counterLocalService.increment());
		Date now = new Date();
		VLegalDocument vDoc = vLegalDocumentPersistence.create(docId);

		int userHit = 0;

		vDoc.setGroupId(groupId);
		vDoc.setCompanyId(companyId);
		vDoc.setSymbol(symbol);
		vDoc.setNum(num);

		vDoc.setPromulDate(promulDate);
		vDoc.setEffectivedDate(effectivedDate);
		vDoc.setExpiredDate(expiredDate);

		vDoc.setReplaceDoc(replaceDoc);
		vDoc.setSummary(summary);
		vDoc.setContent(content);
		vDoc.setLanguage(language);
		vDoc.setUserHit(userHit);
		vDoc.setStatusDoc(APPROVAL_PENDING);

		vDoc.setFieldId(fieldId);
		vDoc.setTypeDocId(typeId);
		vDoc.setOrgRels(orgRels);
		vDoc.setSignerRels(signerRels);
		vDoc.setFieldRels(fieldRels);
		vDoc.setNumRels(numRels);
		vDoc.setOrgId(orgId);

		vDoc.setDocCode(docCode);
		vDoc.setDepartmentRels(departmentRels);
		vDoc.setHasAttachment(hasAttachment);

		vDoc.setCreatedDate(now);
		vDoc.setCreatedByUser(userId);
		vDoc.setModifiedDate(now);
		vDoc.setModifiedByUser(userId);
		vDoc.setUserId(userId);

		vDoc.setApprovedDate(null);
		vDoc.setApprovedByUser(0);
		vDoc.setPublishedDate(null);
		vDoc.setPublishedByUser(0);

		vLegalDocumentPersistence.update(vDoc);

		return vDoc;
	}

	public VLegalDocument updateDocument(String docId, long userId, long groupId, String symbol, String num, String replaceDoc,
			String summary, String content, String language, int status, Date promulDate, Date effectivedDate,
			Date expiredDate, String typeId, String fieldId, String orgId, String orgRels, String signerRels,
			String fieldRels, String numRels, String departmentRels, boolean hasAttachment)
			throws PortalException, SystemException, RemoteException, IOException {

		VLegalDocument vDoc = vLegalDocumentPersistence.findByPrimaryKey(docId);

		Date now = new Date();

		vDoc.setGroupId(groupId);
		vDoc.setSymbol(symbol);
		vDoc.setNum(num);

		vDoc.setPromulDate(promulDate);
		vDoc.setEffectivedDate(effectivedDate);
		vDoc.setExpiredDate(expiredDate);

		vDoc.setReplaceDoc(replaceDoc);
		vDoc.setSummary(summary);
		vDoc.setContent(content);
		vDoc.setLanguage(language);

		vDoc.setFieldId(fieldId);
		vDoc.setTypeDocId(typeId);
		vDoc.setOrgRels(orgRels);
		vDoc.setSignerRels(signerRels);
		vDoc.setFieldRels(fieldRels);
		vDoc.setNumRels(numRels);
		vDoc.setDepartmentRels(departmentRels);
		vDoc.setOrgId(orgId);

		vDoc.setDocCode(null);
		vDoc.setHasAttachment(hasAttachment);
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
			} else if (status == FORWARDED) {
				vDoc.setForwardedDate(now);
				vDoc.setForwardedByUser(userId);
			} else if (status == APPROVAL_PENDING) {
				vDoc.setApprovedDate(null);
				vDoc.setApprovedByUser(0);
				vDoc.setPublishedDate(null);
				vDoc.setPublishedByUser(0);
			}

			// Update status to the document
			vDoc.setStatusDoc(status);
		} else {

		}
		vLegalDocumentPersistence.update(vDoc);
		return vDoc;
	}

	public void updateDocument(String docId, String docCode) throws PortalException, SystemException, RemoteException {
		VLegalDocument vDoc = vLegalDocumentPersistence.findByPrimaryKey(docId);
		vDoc.setDocCode(docCode);
		vLegalDocumentPersistence.update(vDoc);
	}

	public VLegalDocument updateDocument(VLegalDocument vDoc)
			throws PortalException, SystemException, RemoteException, IOException {
		return updateDocument(vDoc.getDocId(), vDoc.getUserId(), vDoc.getGroupId(), vDoc.getSymbol(), vDoc.getNum(), vDoc.getReplaceDoc(),
				vDoc.getSummary(), vDoc.getContent(), vDoc.getLanguage(), vDoc.getStatusDoc(), vDoc.getPromulDate(),
				vDoc.getEffectivedDate(), vDoc.getExpiredDate(), vDoc.getTypeDocId(), vDoc.getFieldId(),
				vDoc.getOrgId(), vDoc.getOrgRels(), vDoc.getSignerRels(), vDoc.getFieldRels(), vDoc.getNumRels(),
				vDoc.getDepartmentRels(), vDoc.getHasAttachment());
	}

	public void deleteDocument(String docId, long companyId)
			throws PortalException, SystemException, RemoteException, IOException {
		vLegalDocumentPersistence.remove(docId);
	}

	public void deleteDocuments(String[] docIds, long companyId)
			throws SystemException, PortalException, RemoteException, IOException {

		if (Validator.isNull(docIds) || docIds.length <= 0) {
			return;
		}

		for (int i = 0; i < docIds.length; i++) {
			this.deleteDocument(docIds[i], companyId);
		}

	}

	public VLegalDocument getDocument(String docId) throws SystemException, PortalException {
		return vLegalDocumentPersistence.findByPrimaryKey(docId);
	}

	public VLegalDocument getDocument(long groupId, String docId) throws SystemException, PortalException {
		return vLegalDocumentPersistence.findByG_D(groupId, docId);
	}

	public List<VLegalDocument> getAllDocument() throws SystemException, PortalException {
		return vLegalDocumentPersistence.findAll();
	}

	public VLegalDocument getDocumentByNS(long groupId, String num, String symbol)
			throws SystemException, PortalException {
		return vLegalDocumentPersistence.findByP_N_S(groupId, num, symbol);
	}

	public List<VLegalDocument> getDocumentByG_L(long groupId, String language)
			throws SystemException, PortalException {
		return vLegalDocumentPersistence.findByG_L(groupId, language);
	}

	public List<VLegalDocument> getDocumentByP_L_S(long groupId, String language, int status)
			throws SystemException, PortalException {
		return vLegalDocumentPersistence.findByP_L_S(groupId, language, status);
	}

	public int countDocumentByP_L_S(long groupId, String language, int status) throws SystemException, PortalException {
		return vLegalDocumentPersistence.countByP_L_S(groupId, language, status);
	}

	public List<VLegalDocument> getDocumentByP_L_S(long groupId, String language, int status, int begin, int end)
			throws SystemException, PortalException {
		return vLegalDocumentPersistence.findByP_L_S(groupId, language, status, begin, end);
	}

	public List<VLegalDocument> getDocumentByP_U_S(long groupId, long createdByUser, int status, String language)
			throws SystemException, PortalException {
		int count = vLegalDocumentPersistence.countByP_U_S(groupId, createdByUser, language, status);
		return vLegalDocumentPersistence.findByP_U_S(groupId, createdByUser, language, status);
	}

	public List<VLegalDocument> getDocumentByG_O_T_L_S(long groupId, String orgId, String typeDocId, String language,
			int status) throws SystemException {
		return vLegalDocumentPersistence.findByDocsByG_O_T_L_S(groupId, orgId, typeDocId, language, status);
	}

	public List<VLegalDocument> getDocumentByStatus(long groupId, String language, long userId, int status)
			throws SystemException {
		return vLegalDocumentPersistence.findByG_L_U_S(groupId, language, userId, status);
	}

	public List<VLegalDocument> getAllDocumentByStatus(long groupId, String language, long userId, int status,
			int start, int end) throws SystemException {
		return vLegalDocumentPersistence.findByG_L_U_S(groupId, language, userId, status, start, end);
	}

	public int countDocumentByStatus(long groupId, String language, long userId, int status) throws SystemException {
		return vLegalDocumentPersistence.countByG_L_U_S(groupId, language, userId, status);
	}

	public List<VLegalDocument> getDocByStatus(long groupId, String language, long userId, int statusDoc)
			throws SystemException {
		return vLegalDocumentPersistence.findByG_L_U_S(groupId, language, userId, statusDoc);
	}

	// List Document by OrgId
	public List<VLegalDocument> getDocumentByG_L_O_S(long groupId, String language, String orgId, int status)
			throws SystemException {
		return vLegalDocumentPersistence.findByG_L_O_S(groupId, language, orgId, status);
	}

	public List<VLegalDocument> getDocumentByG_L_O_S(long groupId, String language, String orgId, int status, int start,
			int end) throws SystemException {
		return vLegalDocumentPersistence.findByG_L_O_S(groupId, language, orgId, status, start, end);
	}

	public int countDocumentByG_L_O_S(long groupId, String language, String orgId, int status) throws SystemException {
		return vLegalDocumentPersistence.countByG_L_O_S(groupId, language, orgId, status);
	}

	// List Document by TypeDocId
	public List<VLegalDocument> getDocumentByG_L_T_S(long groupId, String language, String typeDocId, int status)
			throws SystemException {
		return vLegalDocumentPersistence.findByG_L_T_S(groupId, language, typeDocId, status);
	}

	public List<VLegalDocument> getDocumentByG_L_T_S(long groupId, String language, String typeDocId, int status,
			int start, int end) throws SystemException {
		return vLegalDocumentPersistence.findByG_L_T_S(groupId, language, typeDocId, status, start, end);
	}

	public int countDocumentByG_L_T_S(long groupId, String language, String typeDocId, int status)
			throws SystemException {
		return vLegalDocumentPersistence.countByG_L_T_S(groupId, language, typeDocId, status);
	}

	// List Document by FieldId
	public List<VLegalDocument> getDocumentByG_L_F_S(long groupId, String language, String fieldId, int status)
			throws SystemException {
		return vLegalDocumentPersistence.findByG_L_F_S(groupId, language, fieldId, status);
	}

	public int countDocumentByG_L_F_S(long groupId, String language, String fieldId, int status)
			throws SystemException {
		return vLegalDocumentPersistence.countByG_L_F_S(groupId, language, fieldId, status);
	}

	public int countByStatus(long groupId, String language, int status) throws SystemException {
		return vLegalDocumentPersistence.countByP_L_S(groupId, language, status);
	}

	// List Document by TypeId, OrgId, FieldId
	public List<VLegalDocument> getDocumentByF_O_T(long groupId, String typeDocId, String orgId, String fieldId,
			String language, int begin, int end) throws SystemException, PortalException {
		return vLegalDocumentPersistence.findByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId, language,
				PUBLISH_PENDING, begin, end);
	}

	public int countDocumentByF_O_T(long groupId, String typeDocId, String orgId, String fieldId, String language)
			throws SystemException, PortalException {
		return vLegalDocumentPersistence.countByDocsByF_O_T_L_S(groupId, typeDocId, orgId, fieldId, language,
				PUBLISH_PENDING);
	}

	public List<VLegalDocument> getDocByG_L_F(long groupId, String language, String fieldId)
			throws PortalException, SystemException, RemoteException {
		return vLegalDocumentPersistence.findByG_L_F(groupId, language, fieldId);
	}

	public List<VLegalDocument> getDocByG_L_T(long groupId, String language, String typeId)
			throws PortalException, SystemException, RemoteException {
		return vLegalDocumentPersistence.findByG_L_T(groupId, language, typeId);
	}

	public List<VLegalDocument> getDocByG_L_O(long groupId, String language, String orgId)
			throws PortalException, SystemException, RemoteException {
		return vLegalDocumentPersistence.findByG_L_O(groupId, language, orgId);
	}

	public List<VLegalDocument> getDocumentByG_L_O_S_D(long groupId, String language, String orgId, String docId,
			int quantity) {
		return vLegalDocumentPersistence.findByG_L_O_S_D(groupId, language, orgId, PUBLISHED, docId, 0, quantity);
	}

	public List<VLegalDocument> getDocumentByG_L_F_S_D(long groupId, String language, String fieldId, String docId,
			int quantity) {
		return vLegalDocumentPersistence.findByG_L_F_S_D(groupId, language, fieldId, PUBLISHED, docId, 0, quantity);
	}

	public List<VLegalDocument> getDocumentByG_L_T_S_D(long groupId, String language, String typeId, String docId,
			int quantity) {
		return vLegalDocumentPersistence.findByG_L_T_S_D(groupId, language, typeId, PUBLISHED, docId, 0, quantity);
	}

	public List<VLegalDocument> searchDocument(long groupId, String language, String num, String symbol, String fieldId,
			String orgId, String typeId, Date promulDateFrom, Date promulDateTo, Date effectivedDateFrom,
			Date effectivedDateTo, Date expiredDateFrom, Date expiredDateTo, String summary, int status,
			boolean andSearch, int start, int end) {
		DynamicQuery dynamicQuery = buildDQFrontEnd(groupId, language, num, symbol, fieldId, orgId, typeId,
				promulDateFrom, promulDateTo, effectivedDateFrom, effectivedDateTo, expiredDateFrom, expiredDateTo,
				summary, status, andSearch, true);
		return vLegalDocumentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	public int countDocument(long groupId, String language, String num, String symbol, String fieldId, String orgId,
			String typeId, Date promulDateFrom, Date promulDateTo, Date effectivedDateFrom, Date effectivedDateTo,
			Date expiredDateFrom, Date expiredDateTo, String summary, int status, boolean andSearch) {
		DynamicQuery dynamicQuery = buildDQFrontEnd(groupId, language, num, symbol, fieldId, orgId, typeId,
				promulDateFrom, promulDateTo, effectivedDateFrom, effectivedDateTo, expiredDateFrom, expiredDateTo,
				summary, status, andSearch, true);
		return (int) vLegalDocumentLocalService.dynamicQueryCount(dynamicQuery);
	}

	public DynamicQuery buildDQFrontEnd(long groupId, String language, String num, String symbol, String fieldId,
			String orgId, String typeId, Date promulDateFrom, Date promulDateTo, Date effectivedDateFrom, Date effectivedDateTo, 
			Date expiredDateFrom, Date expiredDateTo, String summary, int status, boolean andSearch, boolean isCount) {
		Junction junction = null;
		if (andSearch) {
			junction = RestrictionsFactoryUtil.conjunction();
		} else {
			junction = RestrictionsFactoryUtil.disjunction();
		}

		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));
		
		if (!"0".equals(fieldId)) {
			junction.add(PropertyFactoryUtil.forName("fieldId").eq(fieldId));
		}
		
		if (!"0".equals(orgId)) {
			junction.add(PropertyFactoryUtil.forName("orgId").eq(orgId));
		}
		
		if (!"0".equals(typeId)) {
			junction.add(PropertyFactoryUtil.forName("typeDocId").eq(typeId));
		}
		
		if (Validator.isNotNull(num)) {
			junction.add( PropertyFactoryUtil.forName("num").like("%"+num+"%"));
		}

		if (Validator.isNotNull(symbol)) {
			junction.add(PropertyFactoryUtil.forName("symbol").like("%"+symbol+"%"));
		}

		if (Validator.isNotNull(summary)) {
			junction.add(PropertyFactoryUtil.forName("summary").like("%"+summary+"%"));
		}

		junction.add(PropertyFactoryUtil.forName("statusDoc").eq(status));

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VLegalDocument.class, getClassLoader());
		
		// Promul Date
		if (Validator.isNotNull(promulDateFrom)) {
			dynamicQuery.add(RestrictionsFactoryUtil.ge("promulDate", promulDateFrom));
		}
		
		if (Validator.isNotNull(promulDateTo)) {
			dynamicQuery.add(RestrictionsFactoryUtil.le("promulDate", promulDateTo));
		}
		
		// Effective Date
		if (Validator.isNotNull(effectivedDateFrom)) {
			dynamicQuery.add(RestrictionsFactoryUtil.ge("effectivedDate", effectivedDateFrom));
		}
		
		if (Validator.isNotNull(effectivedDateTo)) {
			dynamicQuery.add(RestrictionsFactoryUtil.le("effectivedDate", effectivedDateTo));
		}
		
		// Expire Date
		if (Validator.isNotNull(expiredDateFrom)) {
			dynamicQuery.add(RestrictionsFactoryUtil.ge("expiredDate", expiredDateFrom));
		}
		
		if (Validator.isNotNull(expiredDateTo)) {
			dynamicQuery.add(RestrictionsFactoryUtil.le("expiredDate", expiredDateTo));
		}
		
		if(!isCount) {
			dynamicQuery.addOrder(OrderFactoryUtil.desc("publisheddate"));
		}
		return dynamicQuery.add(junction);
	}
	
	public List<VLegalDocument> searchDoc(long groupId, String language, String keyword, String fieldId,
			String orgId, String typeId, 
			Date promulDateFrom, Date promulDateTo, 
			Date effectivedDateFrom, Date effectivedDateTo, 
			Date expireDateFrom, Date expireDateTo,
			int status, boolean isNum, boolean isSymbol, boolean isSummary, boolean isContent, 
			boolean andSearch, boolean isPromul, boolean isEffect, boolean isExprire, int start, int end) {
		DynamicQuery dynamicQuery = buildDQBackEnd(groupId, language, keyword, fieldId, orgId, typeId, promulDateFrom, promulDateTo, 
				effectivedDateFrom, effectivedDateTo, expireDateFrom, expireDateTo, status, 
				isNum, isSymbol, isSummary, isContent, andSearch, isPromul, isEffect, isExprire, true);
		return vLegalDocumentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	public int countDoc(long groupId, String language, String keyword, String fieldId,
			String orgId, String typeId, Date promulDateFrom, Date promulDateTo, 
			Date effectivedDateFrom, Date effectivedDateTo, Date expireDateFrom, Date expireDateTo,
			int status, boolean isNum, boolean isSymbol, boolean isSummary, boolean isContent, 
			boolean andSearch, boolean isPromul, boolean isEffect, boolean isExprire) {
		
		DynamicQuery dynamicQuery = buildDQBackEnd(groupId, language, keyword, fieldId, orgId, typeId, promulDateFrom, promulDateTo, 
				effectivedDateFrom, effectivedDateTo, expireDateFrom, expireDateTo, status, 
				isNum, isSymbol, isSummary, isContent, andSearch, isPromul, isEffect, isExprire, false);
		return (int) vLegalDocumentLocalService.dynamicQueryCount(dynamicQuery);
	}
	
	public DynamicQuery buildDQBackEnd(long groupId, String language, String keyword, String fieldId,
			String orgId, String typeId, 
			Date promulDateFrom, Date promulDateTo, 
			Date effectivedDateFrom, Date effectivedDateTo, 
			Date expireDateFrom, Date expireDateTo,
			int status, boolean isNum, boolean isSymbol, boolean isSummary, boolean isContent, 
			boolean andSearch, boolean isPromul, boolean isEffect, boolean isExprire, boolean isCount) {
		Junction junction = null;
		if (andSearch) {
			junction = RestrictionsFactoryUtil.conjunction();
		} else {
			junction = RestrictionsFactoryUtil.disjunction();
		}

		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));
		
		if (!"0".equals(fieldId)) {
			junction.add(PropertyFactoryUtil.forName("fieldId").eq(fieldId));
		}
		
		if (!"0".equals(orgId)) {
			junction.add(PropertyFactoryUtil.forName("orgId").eq(orgId));
		}
		
		if (!"0".equals(typeId)) {
			junction.add(PropertyFactoryUtil.forName("typeDocId").eq(typeId));
		}
		
		if (isNum) {
			junction.add( PropertyFactoryUtil.forName("num").like("%"+keyword+"%"));
		}

		if (isSymbol) {
			junction.add(PropertyFactoryUtil.forName("symbol").like("%"+keyword+"%"));
		}

		if (isSummary) {
			junction.add(PropertyFactoryUtil.forName("summary").like("%"+keyword+"%"));
		}
		
		if (isContent) {
			junction.add(PropertyFactoryUtil.forName("content").like("%"+keyword+"%"));
		}
		
		junction.add(PropertyFactoryUtil.forName("statusDoc").eq(status));

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VLegalDocument.class, getClassLoader());
		if (isPromul) {
			dynamicQuery.add(RestrictionsFactoryUtil.between("promulDate", promulDateFrom, promulDateTo));
		}
		
		if (isEffect) {
			dynamicQuery.add(RestrictionsFactoryUtil.between("effectivedDate", effectivedDateFrom, effectivedDateTo));
		}
		
		if (isExprire) {
			dynamicQuery.add(RestrictionsFactoryUtil.between("expiredDate", expireDateFrom, expireDateTo));
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