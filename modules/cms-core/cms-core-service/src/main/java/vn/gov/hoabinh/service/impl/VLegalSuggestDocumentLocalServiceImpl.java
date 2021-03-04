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

import com.liferay.portal.kernel.dao.orm.Disjunction;
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
import vn.gov.hoabinh.model.VLegalDraftDocument;
import vn.gov.hoabinh.model.VLegalSuggestDocument;
import vn.gov.hoabinh.service.base.VLegalSuggestDocumentLocalServiceBaseImpl;
import vn.gov.hoabinh.service.persistence.VLegalSuggestDocumentUtil;
import vn.gov.hoabinh.util.PortalUtil;

/**
 * The implementation of the v legal suggest document local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link vn.gov.hoabinh.service.VLegalSuggestDocumentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VLegalSuggestDocumentLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.VLegalSuggestDocumentLocalServiceUtil
 */
@ProviderType
public class VLegalSuggestDocumentLocalServiceImpl extends VLegalSuggestDocumentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * vn.gov.hoabinh.service.VLegalSuggestDocumentLocalServiceUtil} to access
	 * the v legal suggest document local service.
	 */

	public VLegalSuggestDocument addSuggestion(String title, String content, String language, String visitorName,
			String visitorEmail, String visitorTel, String visitorAddress, long groupId, String draftId,
			boolean hasAttachment, long companyId, long userId)
			throws PortalException, SystemException, RemoteException {

		Date now = new Date();

		String suggestionId = String.valueOf(counterLocalService.increment());

		VLegalSuggestDocument lsuggestion = vLegalSuggestDocumentPersistence.create(suggestionId);

		lsuggestion.setCreatedDate(now);

		// Suggestion Information...
		lsuggestion.setTitle(title);
		lsuggestion.setContent(content);
		lsuggestion.setLanguage(language);

		// Visitor Information...
		lsuggestion.setVisitorName(visitorName);
		lsuggestion.setVisitorEmail(visitorEmail);
		lsuggestion.setVisitorAddress(visitorAddress);
		lsuggestion.setVisitorTel(visitorTel);

		lsuggestion.setGroupId(groupId);
		lsuggestion.setDraftId(draftId);

		lsuggestion.setHasAttachment(hasAttachment);
		lsuggestion.setCompanyId(companyId);
		lsuggestion.setUserId(userId);

		vLegalSuggestDocumentPersistence.update(lsuggestion);

		return lsuggestion;
	}

	// UPDATE SUGGESTION

	public VLegalSuggestDocument updateSuggestion(String suggestionId, String draftId, long groupId, String title,
			String content, String language, String visitorName, String visitorEmail, String visitorTel,
			String visitorAddress, boolean approved, boolean hasAttachment)
			throws PortalException, SystemException, RemoteException {

		VLegalSuggestDocument lsuggestion = vLegalSuggestDocumentPersistence.findByPrimaryKey(suggestionId);

		Date now = new Date();
		long userId = Long.parseLong(PortalUtil.getUserId());

		lsuggestion.setModifiedByUser(userId);
		lsuggestion.setModifiedDate(now);

		if (approved == true) {
			lsuggestion.setApproved(true);
			lsuggestion.setApprovedByUser(userId);
			lsuggestion.setApprovedDate(now);
		} else {
			lsuggestion.setApproved(false);
			lsuggestion.setApprovedByUser(0);
			lsuggestion.setApprovedDate(null);
		}

		// Update information of Suggestion...
		lsuggestion.setTitle(title);
		lsuggestion.setContent(content);
		lsuggestion.setDraftId(draftId);
		lsuggestion.setGroupId(groupId);
		lsuggestion.setHasAttachment(hasAttachment);

		// Update Visitor information...
		lsuggestion.setVisitorName(visitorName);
		lsuggestion.setVisitorAddress(visitorAddress);
		lsuggestion.setVisitorEmail(visitorEmail);
		lsuggestion.setVisitorTel(visitorTel);

		vLegalSuggestDocumentPersistence.update(lsuggestion);

		return lsuggestion;
	}

	public VLegalSuggestDocument updateSuggestion(VLegalSuggestDocument suggestion)
			throws PortalException, SystemException, RemoteException {

		return updateSuggestion(suggestion.getSugId(), suggestion.getDraftId(), suggestion.getGroupId(),
				suggestion.getTitle(), suggestion.getContent(), suggestion.getLanguage(), suggestion.getVisitorName(),
				suggestion.getVisitorEmail(), suggestion.getVisitorTel(), suggestion.getVisitorAddress(),
				suggestion.getApproved(), suggestion.getHasAttachment());
	}

	// DELETE SUGGESTION BY SUGGESSTION_ID
	public void deleteSuggestion(String suggestionId) throws PortalException, SystemException, RemoteException {

		if (Validator.isNull(suggestionId) || Validator.equals(suggestionId, "")) {
			return;
		}

		Date now = new Date();
		// User user = userPersistence.findByPrimaryKey(userId);
		VLegalSuggestDocument lsuggestion = VLegalSuggestDocumentUtil.findByPrimaryKey(suggestionId);
		String title = lsuggestion.getTitle();

		vLegalSuggestDocumentPersistence.remove(suggestionId);
	}

	// DELETE SUGGESTION BY SUGGESTIONID ARRAY
	public void deleteSuggestions(String[] suggestionIds) throws PortalException, SystemException, RemoteException {
		if (Validator.isNull(suggestionIds) || suggestionIds.length < 0) {
			return;
		}
		for (int i = 0; i < suggestionIds.length; i++) {
			deleteSuggestion(suggestionIds[i]);
		}
	}

	// DELETE SUGGESTION BY DRAFTID
	public void deleteSuggestions(String draftId) throws PortalException, SystemException, RemoteException {
		if (Validator.isNull(draftId)) {
			return;
		}

		vLegalSuggestDocumentPersistence.removeBySuggByDraftId(draftId);
	}

	// DELETE SUGGESTION BY DRAFTID AND APPROVED
	public void deleteSuggestions(String draftId, boolean approved)
			throws PortalException, SystemException, RemoteException {
		if (Validator.isNull(draftId)) {
			return;
		}

		vLegalSuggestDocumentPersistence.removeByA_D(approved, draftId);
	}

	public VLegalSuggestDocument getSuggestion(String suggestionId)
			throws PortalException, SystemException, RemoteException {
		/*
		 * if (Validator.isNull(suggestionId)) { throw new
		 * NoSuchVlegalSuggestionException(); }
		 */

		VLegalSuggestDocument lsuggestion = vLegalSuggestDocumentPersistence.findByPrimaryKey(suggestionId);

		return lsuggestion;
	}

	public VLegalSuggestDocument getSuggestion(long groupId, String suggestionId)
			throws PortalException, SystemException, RemoteException {
		VLegalSuggestDocument lsuggestion = VLegalSuggestDocumentUtil.findByG_S(groupId, suggestionId);
		return lsuggestion;
	}

	public List<VLegalSuggestDocument> getSuggestions(String draftId)
			throws PortalException, SystemException, RemoteException {
		List<VLegalSuggestDocument> listSuggestion = new ArrayList<VLegalSuggestDocument>();

		if (Validator.isNull(draftId)) {
			return listSuggestion;
		}

		listSuggestion = vLegalSuggestDocumentPersistence.findBySuggByDraftId(draftId);

		return listSuggestion;
	}

	public List<VLegalSuggestDocument> getSuggestions(boolean approved, String draftId)
			throws PortalException, SystemException, RemoteException {

		List<VLegalSuggestDocument> listSuggestion = new ArrayList<VLegalSuggestDocument>();

		if (Validator.isNull(draftId)) {
			return listSuggestion;
		}

		listSuggestion = vLegalSuggestDocumentPersistence.findByA_D(approved, draftId);

		return listSuggestion;
	}

	public List<VLegalSuggestDocument> getSuggestionsByP_L(long groupId, String language)
			throws PortalException, SystemException, RemoteException {

		return vLegalSuggestDocumentPersistence.findByP_L(groupId, language);
	}

	public List<VLegalSuggestDocument> getSuggestionsByP_L_A(long groupId, String language, boolean approved)
			throws PortalException, SystemException, RemoteException {

		return vLegalSuggestDocumentPersistence.findByP_L_A(groupId, language, approved);
	}

	public List<VLegalSuggestDocument> getSuggestionsByP_L_A(long groupId, String language, boolean approved, int begin,
			int end) throws PortalException, SystemException, RemoteException {

		return vLegalSuggestDocumentPersistence.findByP_L_A(groupId, language, approved, begin, end);
	}

	public int countSuggestionsByP_L_A(long groupId, String language, boolean approved)
			throws PortalException, SystemException, RemoteException {
		return vLegalSuggestDocumentPersistence.countByP_L_A(groupId, language, approved);
	}

	public List<VLegalSuggestDocument> getSuggestionsByP_L_A_D(long groupId, String language, boolean approved,
			String draftId) throws PortalException, SystemException, RemoteException {

		return vLegalSuggestDocumentPersistence.findByP_L_A_D(groupId, language, approved, draftId);
	}

	public List<VLegalSuggestDocument> getSuggestionsByP_L_A_D(long groupId, String language, boolean approved,
			String draftId, int begin, int end) throws PortalException, SystemException, RemoteException {

		return vLegalSuggestDocumentPersistence.findByP_L_A_D(groupId, language, approved, draftId, begin, end);
	}

	public int countSuggestionsByP_L_A_D(long groupId, String language, boolean approved, String draftId)
			throws PortalException, SystemException, RemoteException {
		return vLegalSuggestDocumentPersistence.countByP_L_A_D(groupId, language, approved, draftId);
	}

	public List<VLegalSuggestDocument> searchSugguest(long groupId, String language, String keyword, Date dateFrom,
			Date dateTo, int approved, int start, int end) {
		DynamicQuery dynamicQuery = buildDQBackEnd(groupId, language, keyword, dateFrom, dateTo, approved, true);
		return vLegalSuggestDocumentLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	public int countSugguest(long groupId, String language, String keyword, Date dateFrom, Date dateTo, int approved) {
		DynamicQuery dynamicQuery = buildDQBackEnd(groupId, language, keyword, dateFrom, dateTo, approved, true);
		return (int) vLegalSuggestDocumentLocalService.dynamicQueryCount(dynamicQuery);

	}

	public DynamicQuery buildDQBackEnd(long groupId, String language, String keyword, Date dateFrom, Date dateTo,
			int approved, boolean isCount) {
		Junction junction = null;
		junction = RestrictionsFactoryUtil.conjunction();
		junction.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
		junction.add(PropertyFactoryUtil.forName("language").eq(language));

		Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
		if (!"".equals(keyword)) {
			disjunction.add(PropertyFactoryUtil.forName("title").like("%" + keyword + "%"));
			disjunction.add(PropertyFactoryUtil.forName("visitorName").like("%" + keyword + "%"));
			disjunction.add(PropertyFactoryUtil.forName("visitorEmail").like("%" + keyword + "%"));
			disjunction.add(PropertyFactoryUtil.forName("visitorTel").like("%" + keyword + "%"));
		}

		junction.add(disjunction);

		if (approved > -1) {
			if (approved == 1) {
				junction.add(PropertyFactoryUtil.forName("approved").eq(true));
			} else {
				junction.add(PropertyFactoryUtil.forName("approved").eq(false));
			}
		}

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(VLegalSuggestDocument.class, getClassLoader());

		if (!isCount) {
			if (approved == 1) {
				dynamicQuery.addOrder(OrderFactoryUtil.desc("approvedDate"));
			} else {
				dynamicQuery.addOrder(OrderFactoryUtil.desc("createdDate"));
			}
		}
		return dynamicQuery.add(junction);
	}
}