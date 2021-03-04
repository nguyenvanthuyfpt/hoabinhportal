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

package vn.gov.hoabinh.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import vn.gov.hoabinh.model.VLegalDFRel;
import vn.gov.hoabinh.service.VLegalDFRelLocalService;
import vn.gov.hoabinh.service.persistence.AdvItemPersistence;
import vn.gov.hoabinh.service.persistence.AdvTypePersistence;
import vn.gov.hoabinh.service.persistence.AttachmentPersistence;
import vn.gov.hoabinh.service.persistence.ClipPersistence;
import vn.gov.hoabinh.service.persistence.ClipTypePersistence;
import vn.gov.hoabinh.service.persistence.DataConvertPersistence;
import vn.gov.hoabinh.service.persistence.FAQAnswerPersistence;
import vn.gov.hoabinh.service.persistence.FAQCategoryPersistence;
import vn.gov.hoabinh.service.persistence.FAQCategoryQuestionPersistence;
import vn.gov.hoabinh.service.persistence.FAQCommentPersistence;
import vn.gov.hoabinh.service.persistence.FAQQuestionPersistence;
import vn.gov.hoabinh.service.persistence.LinkGroupPersistence;
import vn.gov.hoabinh.service.persistence.LinksPersistence;
import vn.gov.hoabinh.service.persistence.VContactPersistence;
import vn.gov.hoabinh.service.persistence.VLegalAttachedMessagePersistence;
import vn.gov.hoabinh.service.persistence.VLegalDDRelPersistence;
import vn.gov.hoabinh.service.persistence.VLegalDFRelPK;
import vn.gov.hoabinh.service.persistence.VLegalDFRelPersistence;
import vn.gov.hoabinh.service.persistence.VLegalDSRelPersistence;
import vn.gov.hoabinh.service.persistence.VLegalDURelPersistence;
import vn.gov.hoabinh.service.persistence.VLegalDocumentPersistence;
import vn.gov.hoabinh.service.persistence.VLegalDraftDocumentPersistence;
import vn.gov.hoabinh.service.persistence.VLegalFORelPersistence;
import vn.gov.hoabinh.service.persistence.VLegalFTRelPersistence;
import vn.gov.hoabinh.service.persistence.VLegalFieldPersistence;
import vn.gov.hoabinh.service.persistence.VLegalLoggerPersistence;
import vn.gov.hoabinh.service.persistence.VLegalOrgPersistence;
import vn.gov.hoabinh.service.persistence.VLegalSignerPersistence;
import vn.gov.hoabinh.service.persistence.VLegalSuggestDocumentPersistence;
import vn.gov.hoabinh.service.persistence.VLegalTDRelPersistence;
import vn.gov.hoabinh.service.persistence.VLegalTagsPersistence;
import vn.gov.hoabinh.service.persistence.VLegalTypePersistence;
import vn.gov.hoabinh.service.persistence.VcmsArticlePersistence;
import vn.gov.hoabinh.service.persistence.VcmsArticleRatingPersistence;
import vn.gov.hoabinh.service.persistence.VcmsArticleStatusPersistence;
import vn.gov.hoabinh.service.persistence.VcmsArticleTypePersistence;
import vn.gov.hoabinh.service.persistence.VcmsArticleVersionPersistence;
import vn.gov.hoabinh.service.persistence.VcmsAttachedMessagePersistence;
import vn.gov.hoabinh.service.persistence.VcmsCARelationPersistence;
import vn.gov.hoabinh.service.persistence.VcmsCURelationPersistence;
import vn.gov.hoabinh.service.persistence.VcmsCategoryPersistence;
import vn.gov.hoabinh.service.persistence.VcmsDiscussionPersistence;
import vn.gov.hoabinh.service.persistence.VcmsLoggerPersistence;
import vn.gov.hoabinh.service.persistence.VcmsPARelationPersistence;
import vn.gov.hoabinh.service.persistence.VcmsPortionPersistence;
import vn.gov.hoabinh.service.persistence.VcmsStatusPersistence;
import vn.gov.hoabinh.service.persistence.VcmsTARelationPersistence;
import vn.gov.hoabinh.service.persistence.VcmsThreadPersistence;
import vn.gov.hoabinh.service.persistence.VcmsTypePersistence;
import vn.gov.hoabinh.service.persistence.VisitorTrackerPersistence;
import vn.gov.hoabinh.service.persistence.vdocDORelPersistence;
import vn.gov.hoabinh.service.persistence.vdocDocumentPersistence;
import vn.gov.hoabinh.service.persistence.vdocFieldLevelRelPersistence;
import vn.gov.hoabinh.service.persistence.vdocFieldPersistence;
import vn.gov.hoabinh.service.persistence.vdocLevelPersistence;
import vn.gov.hoabinh.service.persistence.vdocLoggerPersistence;
import vn.gov.hoabinh.service.persistence.vdocOrgPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the v legal d f rel local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.gov.hoabinh.service.impl.VLegalDFRelLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.impl.VLegalDFRelLocalServiceImpl
 * @see vn.gov.hoabinh.service.VLegalDFRelLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class VLegalDFRelLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements VLegalDFRelLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.gov.hoabinh.service.VLegalDFRelLocalServiceUtil} to access the v legal d f rel local service.
	 */

	/**
	 * Adds the v legal d f rel to the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalDFRel the v legal d f rel
	 * @return the v legal d f rel that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public VLegalDFRel addVLegalDFRel(VLegalDFRel vLegalDFRel) {
		vLegalDFRel.setNew(true);

		return vLegalDFRelPersistence.update(vLegalDFRel);
	}

	/**
	 * Creates a new v legal d f rel with the primary key. Does not add the v legal d f rel to the database.
	 *
	 * @param vLegalDFRelPK the primary key for the new v legal d f rel
	 * @return the new v legal d f rel
	 */
	@Override
	public VLegalDFRel createVLegalDFRel(VLegalDFRelPK vLegalDFRelPK) {
		return vLegalDFRelPersistence.create(vLegalDFRelPK);
	}

	/**
	 * Deletes the v legal d f rel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalDFRelPK the primary key of the v legal d f rel
	 * @return the v legal d f rel that was removed
	 * @throws PortalException if a v legal d f rel with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public VLegalDFRel deleteVLegalDFRel(VLegalDFRelPK vLegalDFRelPK)
		throws PortalException {
		return vLegalDFRelPersistence.remove(vLegalDFRelPK);
	}

	/**
	 * Deletes the v legal d f rel from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalDFRel the v legal d f rel
	 * @return the v legal d f rel that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public VLegalDFRel deleteVLegalDFRel(VLegalDFRel vLegalDFRel) {
		return vLegalDFRelPersistence.remove(vLegalDFRel);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(VLegalDFRel.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return vLegalDFRelPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return vLegalDFRelPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return vLegalDFRelPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return vLegalDFRelPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return vLegalDFRelPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public VLegalDFRel fetchVLegalDFRel(VLegalDFRelPK vLegalDFRelPK) {
		return vLegalDFRelPersistence.fetchByPrimaryKey(vLegalDFRelPK);
	}

	/**
	 * Returns the v legal d f rel with the primary key.
	 *
	 * @param vLegalDFRelPK the primary key of the v legal d f rel
	 * @return the v legal d f rel
	 * @throws PortalException if a v legal d f rel with the primary key could not be found
	 */
	@Override
	public VLegalDFRel getVLegalDFRel(VLegalDFRelPK vLegalDFRelPK)
		throws PortalException {
		return vLegalDFRelPersistence.findByPrimaryKey(vLegalDFRelPK);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return vLegalDFRelLocalService.deleteVLegalDFRel((VLegalDFRel)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return vLegalDFRelPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the v legal d f rels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.VLegalDFRelModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of v legal d f rels
	 * @param end the upper bound of the range of v legal d f rels (not inclusive)
	 * @return the range of v legal d f rels
	 */
	@Override
	public List<VLegalDFRel> getVLegalDFRels(int start, int end) {
		return vLegalDFRelPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of v legal d f rels.
	 *
	 * @return the number of v legal d f rels
	 */
	@Override
	public int getVLegalDFRelsCount() {
		return vLegalDFRelPersistence.countAll();
	}

	/**
	 * Updates the v legal d f rel in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param vLegalDFRel the v legal d f rel
	 * @return the v legal d f rel that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public VLegalDFRel updateVLegalDFRel(VLegalDFRel vLegalDFRel) {
		return vLegalDFRelPersistence.update(vLegalDFRel);
	}

	/**
	 * Returns the adv item local service.
	 *
	 * @return the adv item local service
	 */
	public vn.gov.hoabinh.service.AdvItemLocalService getAdvItemLocalService() {
		return advItemLocalService;
	}

	/**
	 * Sets the adv item local service.
	 *
	 * @param advItemLocalService the adv item local service
	 */
	public void setAdvItemLocalService(
		vn.gov.hoabinh.service.AdvItemLocalService advItemLocalService) {
		this.advItemLocalService = advItemLocalService;
	}

	/**
	 * Returns the adv item persistence.
	 *
	 * @return the adv item persistence
	 */
	public AdvItemPersistence getAdvItemPersistence() {
		return advItemPersistence;
	}

	/**
	 * Sets the adv item persistence.
	 *
	 * @param advItemPersistence the adv item persistence
	 */
	public void setAdvItemPersistence(AdvItemPersistence advItemPersistence) {
		this.advItemPersistence = advItemPersistence;
	}

	/**
	 * Returns the adv type local service.
	 *
	 * @return the adv type local service
	 */
	public vn.gov.hoabinh.service.AdvTypeLocalService getAdvTypeLocalService() {
		return advTypeLocalService;
	}

	/**
	 * Sets the adv type local service.
	 *
	 * @param advTypeLocalService the adv type local service
	 */
	public void setAdvTypeLocalService(
		vn.gov.hoabinh.service.AdvTypeLocalService advTypeLocalService) {
		this.advTypeLocalService = advTypeLocalService;
	}

	/**
	 * Returns the adv type persistence.
	 *
	 * @return the adv type persistence
	 */
	public AdvTypePersistence getAdvTypePersistence() {
		return advTypePersistence;
	}

	/**
	 * Sets the adv type persistence.
	 *
	 * @param advTypePersistence the adv type persistence
	 */
	public void setAdvTypePersistence(AdvTypePersistence advTypePersistence) {
		this.advTypePersistence = advTypePersistence;
	}

	/**
	 * Returns the attachment local service.
	 *
	 * @return the attachment local service
	 */
	public vn.gov.hoabinh.service.AttachmentLocalService getAttachmentLocalService() {
		return attachmentLocalService;
	}

	/**
	 * Sets the attachment local service.
	 *
	 * @param attachmentLocalService the attachment local service
	 */
	public void setAttachmentLocalService(
		vn.gov.hoabinh.service.AttachmentLocalService attachmentLocalService) {
		this.attachmentLocalService = attachmentLocalService;
	}

	/**
	 * Returns the attachment persistence.
	 *
	 * @return the attachment persistence
	 */
	public AttachmentPersistence getAttachmentPersistence() {
		return attachmentPersistence;
	}

	/**
	 * Sets the attachment persistence.
	 *
	 * @param attachmentPersistence the attachment persistence
	 */
	public void setAttachmentPersistence(
		AttachmentPersistence attachmentPersistence) {
		this.attachmentPersistence = attachmentPersistence;
	}

	/**
	 * Returns the clip local service.
	 *
	 * @return the clip local service
	 */
	public vn.gov.hoabinh.service.ClipLocalService getClipLocalService() {
		return clipLocalService;
	}

	/**
	 * Sets the clip local service.
	 *
	 * @param clipLocalService the clip local service
	 */
	public void setClipLocalService(
		vn.gov.hoabinh.service.ClipLocalService clipLocalService) {
		this.clipLocalService = clipLocalService;
	}

	/**
	 * Returns the clip persistence.
	 *
	 * @return the clip persistence
	 */
	public ClipPersistence getClipPersistence() {
		return clipPersistence;
	}

	/**
	 * Sets the clip persistence.
	 *
	 * @param clipPersistence the clip persistence
	 */
	public void setClipPersistence(ClipPersistence clipPersistence) {
		this.clipPersistence = clipPersistence;
	}

	/**
	 * Returns the clip type local service.
	 *
	 * @return the clip type local service
	 */
	public vn.gov.hoabinh.service.ClipTypeLocalService getClipTypeLocalService() {
		return clipTypeLocalService;
	}

	/**
	 * Sets the clip type local service.
	 *
	 * @param clipTypeLocalService the clip type local service
	 */
	public void setClipTypeLocalService(
		vn.gov.hoabinh.service.ClipTypeLocalService clipTypeLocalService) {
		this.clipTypeLocalService = clipTypeLocalService;
	}

	/**
	 * Returns the clip type persistence.
	 *
	 * @return the clip type persistence
	 */
	public ClipTypePersistence getClipTypePersistence() {
		return clipTypePersistence;
	}

	/**
	 * Sets the clip type persistence.
	 *
	 * @param clipTypePersistence the clip type persistence
	 */
	public void setClipTypePersistence(ClipTypePersistence clipTypePersistence) {
		this.clipTypePersistence = clipTypePersistence;
	}

	/**
	 * Returns the data convert local service.
	 *
	 * @return the data convert local service
	 */
	public vn.gov.hoabinh.service.DataConvertLocalService getDataConvertLocalService() {
		return dataConvertLocalService;
	}

	/**
	 * Sets the data convert local service.
	 *
	 * @param dataConvertLocalService the data convert local service
	 */
	public void setDataConvertLocalService(
		vn.gov.hoabinh.service.DataConvertLocalService dataConvertLocalService) {
		this.dataConvertLocalService = dataConvertLocalService;
	}

	/**
	 * Returns the data convert persistence.
	 *
	 * @return the data convert persistence
	 */
	public DataConvertPersistence getDataConvertPersistence() {
		return dataConvertPersistence;
	}

	/**
	 * Sets the data convert persistence.
	 *
	 * @param dataConvertPersistence the data convert persistence
	 */
	public void setDataConvertPersistence(
		DataConvertPersistence dataConvertPersistence) {
		this.dataConvertPersistence = dataConvertPersistence;
	}

	/**
	 * Returns the f a q answer local service.
	 *
	 * @return the f a q answer local service
	 */
	public vn.gov.hoabinh.service.FAQAnswerLocalService getFAQAnswerLocalService() {
		return faqAnswerLocalService;
	}

	/**
	 * Sets the f a q answer local service.
	 *
	 * @param faqAnswerLocalService the f a q answer local service
	 */
	public void setFAQAnswerLocalService(
		vn.gov.hoabinh.service.FAQAnswerLocalService faqAnswerLocalService) {
		this.faqAnswerLocalService = faqAnswerLocalService;
	}

	/**
	 * Returns the f a q answer persistence.
	 *
	 * @return the f a q answer persistence
	 */
	public FAQAnswerPersistence getFAQAnswerPersistence() {
		return faqAnswerPersistence;
	}

	/**
	 * Sets the f a q answer persistence.
	 *
	 * @param faqAnswerPersistence the f a q answer persistence
	 */
	public void setFAQAnswerPersistence(
		FAQAnswerPersistence faqAnswerPersistence) {
		this.faqAnswerPersistence = faqAnswerPersistence;
	}

	/**
	 * Returns the f a q category local service.
	 *
	 * @return the f a q category local service
	 */
	public vn.gov.hoabinh.service.FAQCategoryLocalService getFAQCategoryLocalService() {
		return faqCategoryLocalService;
	}

	/**
	 * Sets the f a q category local service.
	 *
	 * @param faqCategoryLocalService the f a q category local service
	 */
	public void setFAQCategoryLocalService(
		vn.gov.hoabinh.service.FAQCategoryLocalService faqCategoryLocalService) {
		this.faqCategoryLocalService = faqCategoryLocalService;
	}

	/**
	 * Returns the f a q category persistence.
	 *
	 * @return the f a q category persistence
	 */
	public FAQCategoryPersistence getFAQCategoryPersistence() {
		return faqCategoryPersistence;
	}

	/**
	 * Sets the f a q category persistence.
	 *
	 * @param faqCategoryPersistence the f a q category persistence
	 */
	public void setFAQCategoryPersistence(
		FAQCategoryPersistence faqCategoryPersistence) {
		this.faqCategoryPersistence = faqCategoryPersistence;
	}

	/**
	 * Returns the f a q category question local service.
	 *
	 * @return the f a q category question local service
	 */
	public vn.gov.hoabinh.service.FAQCategoryQuestionLocalService getFAQCategoryQuestionLocalService() {
		return faqCategoryQuestionLocalService;
	}

	/**
	 * Sets the f a q category question local service.
	 *
	 * @param faqCategoryQuestionLocalService the f a q category question local service
	 */
	public void setFAQCategoryQuestionLocalService(
		vn.gov.hoabinh.service.FAQCategoryQuestionLocalService faqCategoryQuestionLocalService) {
		this.faqCategoryQuestionLocalService = faqCategoryQuestionLocalService;
	}

	/**
	 * Returns the f a q category question persistence.
	 *
	 * @return the f a q category question persistence
	 */
	public FAQCategoryQuestionPersistence getFAQCategoryQuestionPersistence() {
		return faqCategoryQuestionPersistence;
	}

	/**
	 * Sets the f a q category question persistence.
	 *
	 * @param faqCategoryQuestionPersistence the f a q category question persistence
	 */
	public void setFAQCategoryQuestionPersistence(
		FAQCategoryQuestionPersistence faqCategoryQuestionPersistence) {
		this.faqCategoryQuestionPersistence = faqCategoryQuestionPersistence;
	}

	/**
	 * Returns the f a q comment local service.
	 *
	 * @return the f a q comment local service
	 */
	public vn.gov.hoabinh.service.FAQCommentLocalService getFAQCommentLocalService() {
		return faqCommentLocalService;
	}

	/**
	 * Sets the f a q comment local service.
	 *
	 * @param faqCommentLocalService the f a q comment local service
	 */
	public void setFAQCommentLocalService(
		vn.gov.hoabinh.service.FAQCommentLocalService faqCommentLocalService) {
		this.faqCommentLocalService = faqCommentLocalService;
	}

	/**
	 * Returns the f a q comment persistence.
	 *
	 * @return the f a q comment persistence
	 */
	public FAQCommentPersistence getFAQCommentPersistence() {
		return faqCommentPersistence;
	}

	/**
	 * Sets the f a q comment persistence.
	 *
	 * @param faqCommentPersistence the f a q comment persistence
	 */
	public void setFAQCommentPersistence(
		FAQCommentPersistence faqCommentPersistence) {
		this.faqCommentPersistence = faqCommentPersistence;
	}

	/**
	 * Returns the f a q question local service.
	 *
	 * @return the f a q question local service
	 */
	public vn.gov.hoabinh.service.FAQQuestionLocalService getFAQQuestionLocalService() {
		return faqQuestionLocalService;
	}

	/**
	 * Sets the f a q question local service.
	 *
	 * @param faqQuestionLocalService the f a q question local service
	 */
	public void setFAQQuestionLocalService(
		vn.gov.hoabinh.service.FAQQuestionLocalService faqQuestionLocalService) {
		this.faqQuestionLocalService = faqQuestionLocalService;
	}

	/**
	 * Returns the f a q question persistence.
	 *
	 * @return the f a q question persistence
	 */
	public FAQQuestionPersistence getFAQQuestionPersistence() {
		return faqQuestionPersistence;
	}

	/**
	 * Sets the f a q question persistence.
	 *
	 * @param faqQuestionPersistence the f a q question persistence
	 */
	public void setFAQQuestionPersistence(
		FAQQuestionPersistence faqQuestionPersistence) {
		this.faqQuestionPersistence = faqQuestionPersistence;
	}

	/**
	 * Returns the link group local service.
	 *
	 * @return the link group local service
	 */
	public vn.gov.hoabinh.service.LinkGroupLocalService getLinkGroupLocalService() {
		return linkGroupLocalService;
	}

	/**
	 * Sets the link group local service.
	 *
	 * @param linkGroupLocalService the link group local service
	 */
	public void setLinkGroupLocalService(
		vn.gov.hoabinh.service.LinkGroupLocalService linkGroupLocalService) {
		this.linkGroupLocalService = linkGroupLocalService;
	}

	/**
	 * Returns the link group persistence.
	 *
	 * @return the link group persistence
	 */
	public LinkGroupPersistence getLinkGroupPersistence() {
		return linkGroupPersistence;
	}

	/**
	 * Sets the link group persistence.
	 *
	 * @param linkGroupPersistence the link group persistence
	 */
	public void setLinkGroupPersistence(
		LinkGroupPersistence linkGroupPersistence) {
		this.linkGroupPersistence = linkGroupPersistence;
	}

	/**
	 * Returns the links local service.
	 *
	 * @return the links local service
	 */
	public vn.gov.hoabinh.service.LinksLocalService getLinksLocalService() {
		return linksLocalService;
	}

	/**
	 * Sets the links local service.
	 *
	 * @param linksLocalService the links local service
	 */
	public void setLinksLocalService(
		vn.gov.hoabinh.service.LinksLocalService linksLocalService) {
		this.linksLocalService = linksLocalService;
	}

	/**
	 * Returns the links persistence.
	 *
	 * @return the links persistence
	 */
	public LinksPersistence getLinksPersistence() {
		return linksPersistence;
	}

	/**
	 * Sets the links persistence.
	 *
	 * @param linksPersistence the links persistence
	 */
	public void setLinksPersistence(LinksPersistence linksPersistence) {
		this.linksPersistence = linksPersistence;
	}

	/**
	 * Returns the vcms article local service.
	 *
	 * @return the vcms article local service
	 */
	public vn.gov.hoabinh.service.VcmsArticleLocalService getVcmsArticleLocalService() {
		return vcmsArticleLocalService;
	}

	/**
	 * Sets the vcms article local service.
	 *
	 * @param vcmsArticleLocalService the vcms article local service
	 */
	public void setVcmsArticleLocalService(
		vn.gov.hoabinh.service.VcmsArticleLocalService vcmsArticleLocalService) {
		this.vcmsArticleLocalService = vcmsArticleLocalService;
	}

	/**
	 * Returns the vcms article persistence.
	 *
	 * @return the vcms article persistence
	 */
	public VcmsArticlePersistence getVcmsArticlePersistence() {
		return vcmsArticlePersistence;
	}

	/**
	 * Sets the vcms article persistence.
	 *
	 * @param vcmsArticlePersistence the vcms article persistence
	 */
	public void setVcmsArticlePersistence(
		VcmsArticlePersistence vcmsArticlePersistence) {
		this.vcmsArticlePersistence = vcmsArticlePersistence;
	}

	/**
	 * Returns the vcms article rating local service.
	 *
	 * @return the vcms article rating local service
	 */
	public vn.gov.hoabinh.service.VcmsArticleRatingLocalService getVcmsArticleRatingLocalService() {
		return vcmsArticleRatingLocalService;
	}

	/**
	 * Sets the vcms article rating local service.
	 *
	 * @param vcmsArticleRatingLocalService the vcms article rating local service
	 */
	public void setVcmsArticleRatingLocalService(
		vn.gov.hoabinh.service.VcmsArticleRatingLocalService vcmsArticleRatingLocalService) {
		this.vcmsArticleRatingLocalService = vcmsArticleRatingLocalService;
	}

	/**
	 * Returns the vcms article rating persistence.
	 *
	 * @return the vcms article rating persistence
	 */
	public VcmsArticleRatingPersistence getVcmsArticleRatingPersistence() {
		return vcmsArticleRatingPersistence;
	}

	/**
	 * Sets the vcms article rating persistence.
	 *
	 * @param vcmsArticleRatingPersistence the vcms article rating persistence
	 */
	public void setVcmsArticleRatingPersistence(
		VcmsArticleRatingPersistence vcmsArticleRatingPersistence) {
		this.vcmsArticleRatingPersistence = vcmsArticleRatingPersistence;
	}

	/**
	 * Returns the vcms article status local service.
	 *
	 * @return the vcms article status local service
	 */
	public vn.gov.hoabinh.service.VcmsArticleStatusLocalService getVcmsArticleStatusLocalService() {
		return vcmsArticleStatusLocalService;
	}

	/**
	 * Sets the vcms article status local service.
	 *
	 * @param vcmsArticleStatusLocalService the vcms article status local service
	 */
	public void setVcmsArticleStatusLocalService(
		vn.gov.hoabinh.service.VcmsArticleStatusLocalService vcmsArticleStatusLocalService) {
		this.vcmsArticleStatusLocalService = vcmsArticleStatusLocalService;
	}

	/**
	 * Returns the vcms article status persistence.
	 *
	 * @return the vcms article status persistence
	 */
	public VcmsArticleStatusPersistence getVcmsArticleStatusPersistence() {
		return vcmsArticleStatusPersistence;
	}

	/**
	 * Sets the vcms article status persistence.
	 *
	 * @param vcmsArticleStatusPersistence the vcms article status persistence
	 */
	public void setVcmsArticleStatusPersistence(
		VcmsArticleStatusPersistence vcmsArticleStatusPersistence) {
		this.vcmsArticleStatusPersistence = vcmsArticleStatusPersistence;
	}

	/**
	 * Returns the vcms article type local service.
	 *
	 * @return the vcms article type local service
	 */
	public vn.gov.hoabinh.service.VcmsArticleTypeLocalService getVcmsArticleTypeLocalService() {
		return vcmsArticleTypeLocalService;
	}

	/**
	 * Sets the vcms article type local service.
	 *
	 * @param vcmsArticleTypeLocalService the vcms article type local service
	 */
	public void setVcmsArticleTypeLocalService(
		vn.gov.hoabinh.service.VcmsArticleTypeLocalService vcmsArticleTypeLocalService) {
		this.vcmsArticleTypeLocalService = vcmsArticleTypeLocalService;
	}

	/**
	 * Returns the vcms article type persistence.
	 *
	 * @return the vcms article type persistence
	 */
	public VcmsArticleTypePersistence getVcmsArticleTypePersistence() {
		return vcmsArticleTypePersistence;
	}

	/**
	 * Sets the vcms article type persistence.
	 *
	 * @param vcmsArticleTypePersistence the vcms article type persistence
	 */
	public void setVcmsArticleTypePersistence(
		VcmsArticleTypePersistence vcmsArticleTypePersistence) {
		this.vcmsArticleTypePersistence = vcmsArticleTypePersistence;
	}

	/**
	 * Returns the vcms article version local service.
	 *
	 * @return the vcms article version local service
	 */
	public vn.gov.hoabinh.service.VcmsArticleVersionLocalService getVcmsArticleVersionLocalService() {
		return vcmsArticleVersionLocalService;
	}

	/**
	 * Sets the vcms article version local service.
	 *
	 * @param vcmsArticleVersionLocalService the vcms article version local service
	 */
	public void setVcmsArticleVersionLocalService(
		vn.gov.hoabinh.service.VcmsArticleVersionLocalService vcmsArticleVersionLocalService) {
		this.vcmsArticleVersionLocalService = vcmsArticleVersionLocalService;
	}

	/**
	 * Returns the vcms article version persistence.
	 *
	 * @return the vcms article version persistence
	 */
	public VcmsArticleVersionPersistence getVcmsArticleVersionPersistence() {
		return vcmsArticleVersionPersistence;
	}

	/**
	 * Sets the vcms article version persistence.
	 *
	 * @param vcmsArticleVersionPersistence the vcms article version persistence
	 */
	public void setVcmsArticleVersionPersistence(
		VcmsArticleVersionPersistence vcmsArticleVersionPersistence) {
		this.vcmsArticleVersionPersistence = vcmsArticleVersionPersistence;
	}

	/**
	 * Returns the vcms attached message local service.
	 *
	 * @return the vcms attached message local service
	 */
	public vn.gov.hoabinh.service.VcmsAttachedMessageLocalService getVcmsAttachedMessageLocalService() {
		return vcmsAttachedMessageLocalService;
	}

	/**
	 * Sets the vcms attached message local service.
	 *
	 * @param vcmsAttachedMessageLocalService the vcms attached message local service
	 */
	public void setVcmsAttachedMessageLocalService(
		vn.gov.hoabinh.service.VcmsAttachedMessageLocalService vcmsAttachedMessageLocalService) {
		this.vcmsAttachedMessageLocalService = vcmsAttachedMessageLocalService;
	}

	/**
	 * Returns the vcms attached message persistence.
	 *
	 * @return the vcms attached message persistence
	 */
	public VcmsAttachedMessagePersistence getVcmsAttachedMessagePersistence() {
		return vcmsAttachedMessagePersistence;
	}

	/**
	 * Sets the vcms attached message persistence.
	 *
	 * @param vcmsAttachedMessagePersistence the vcms attached message persistence
	 */
	public void setVcmsAttachedMessagePersistence(
		VcmsAttachedMessagePersistence vcmsAttachedMessagePersistence) {
		this.vcmsAttachedMessagePersistence = vcmsAttachedMessagePersistence;
	}

	/**
	 * Returns the vcms c a relation local service.
	 *
	 * @return the vcms c a relation local service
	 */
	public vn.gov.hoabinh.service.VcmsCARelationLocalService getVcmsCARelationLocalService() {
		return vcmsCARelationLocalService;
	}

	/**
	 * Sets the vcms c a relation local service.
	 *
	 * @param vcmsCARelationLocalService the vcms c a relation local service
	 */
	public void setVcmsCARelationLocalService(
		vn.gov.hoabinh.service.VcmsCARelationLocalService vcmsCARelationLocalService) {
		this.vcmsCARelationLocalService = vcmsCARelationLocalService;
	}

	/**
	 * Returns the vcms c a relation persistence.
	 *
	 * @return the vcms c a relation persistence
	 */
	public VcmsCARelationPersistence getVcmsCARelationPersistence() {
		return vcmsCARelationPersistence;
	}

	/**
	 * Sets the vcms c a relation persistence.
	 *
	 * @param vcmsCARelationPersistence the vcms c a relation persistence
	 */
	public void setVcmsCARelationPersistence(
		VcmsCARelationPersistence vcmsCARelationPersistence) {
		this.vcmsCARelationPersistence = vcmsCARelationPersistence;
	}

	/**
	 * Returns the vcms category local service.
	 *
	 * @return the vcms category local service
	 */
	public vn.gov.hoabinh.service.VcmsCategoryLocalService getVcmsCategoryLocalService() {
		return vcmsCategoryLocalService;
	}

	/**
	 * Sets the vcms category local service.
	 *
	 * @param vcmsCategoryLocalService the vcms category local service
	 */
	public void setVcmsCategoryLocalService(
		vn.gov.hoabinh.service.VcmsCategoryLocalService vcmsCategoryLocalService) {
		this.vcmsCategoryLocalService = vcmsCategoryLocalService;
	}

	/**
	 * Returns the vcms category persistence.
	 *
	 * @return the vcms category persistence
	 */
	public VcmsCategoryPersistence getVcmsCategoryPersistence() {
		return vcmsCategoryPersistence;
	}

	/**
	 * Sets the vcms category persistence.
	 *
	 * @param vcmsCategoryPersistence the vcms category persistence
	 */
	public void setVcmsCategoryPersistence(
		VcmsCategoryPersistence vcmsCategoryPersistence) {
		this.vcmsCategoryPersistence = vcmsCategoryPersistence;
	}

	/**
	 * Returns the vcms c u relation local service.
	 *
	 * @return the vcms c u relation local service
	 */
	public vn.gov.hoabinh.service.VcmsCURelationLocalService getVcmsCURelationLocalService() {
		return vcmsCURelationLocalService;
	}

	/**
	 * Sets the vcms c u relation local service.
	 *
	 * @param vcmsCURelationLocalService the vcms c u relation local service
	 */
	public void setVcmsCURelationLocalService(
		vn.gov.hoabinh.service.VcmsCURelationLocalService vcmsCURelationLocalService) {
		this.vcmsCURelationLocalService = vcmsCURelationLocalService;
	}

	/**
	 * Returns the vcms c u relation persistence.
	 *
	 * @return the vcms c u relation persistence
	 */
	public VcmsCURelationPersistence getVcmsCURelationPersistence() {
		return vcmsCURelationPersistence;
	}

	/**
	 * Sets the vcms c u relation persistence.
	 *
	 * @param vcmsCURelationPersistence the vcms c u relation persistence
	 */
	public void setVcmsCURelationPersistence(
		VcmsCURelationPersistence vcmsCURelationPersistence) {
		this.vcmsCURelationPersistence = vcmsCURelationPersistence;
	}

	/**
	 * Returns the vcms discussion local service.
	 *
	 * @return the vcms discussion local service
	 */
	public vn.gov.hoabinh.service.VcmsDiscussionLocalService getVcmsDiscussionLocalService() {
		return vcmsDiscussionLocalService;
	}

	/**
	 * Sets the vcms discussion local service.
	 *
	 * @param vcmsDiscussionLocalService the vcms discussion local service
	 */
	public void setVcmsDiscussionLocalService(
		vn.gov.hoabinh.service.VcmsDiscussionLocalService vcmsDiscussionLocalService) {
		this.vcmsDiscussionLocalService = vcmsDiscussionLocalService;
	}

	/**
	 * Returns the vcms discussion persistence.
	 *
	 * @return the vcms discussion persistence
	 */
	public VcmsDiscussionPersistence getVcmsDiscussionPersistence() {
		return vcmsDiscussionPersistence;
	}

	/**
	 * Sets the vcms discussion persistence.
	 *
	 * @param vcmsDiscussionPersistence the vcms discussion persistence
	 */
	public void setVcmsDiscussionPersistence(
		VcmsDiscussionPersistence vcmsDiscussionPersistence) {
		this.vcmsDiscussionPersistence = vcmsDiscussionPersistence;
	}

	/**
	 * Returns the vcms logger local service.
	 *
	 * @return the vcms logger local service
	 */
	public vn.gov.hoabinh.service.VcmsLoggerLocalService getVcmsLoggerLocalService() {
		return vcmsLoggerLocalService;
	}

	/**
	 * Sets the vcms logger local service.
	 *
	 * @param vcmsLoggerLocalService the vcms logger local service
	 */
	public void setVcmsLoggerLocalService(
		vn.gov.hoabinh.service.VcmsLoggerLocalService vcmsLoggerLocalService) {
		this.vcmsLoggerLocalService = vcmsLoggerLocalService;
	}

	/**
	 * Returns the vcms logger persistence.
	 *
	 * @return the vcms logger persistence
	 */
	public VcmsLoggerPersistence getVcmsLoggerPersistence() {
		return vcmsLoggerPersistence;
	}

	/**
	 * Sets the vcms logger persistence.
	 *
	 * @param vcmsLoggerPersistence the vcms logger persistence
	 */
	public void setVcmsLoggerPersistence(
		VcmsLoggerPersistence vcmsLoggerPersistence) {
		this.vcmsLoggerPersistence = vcmsLoggerPersistence;
	}

	/**
	 * Returns the vcms p a relation local service.
	 *
	 * @return the vcms p a relation local service
	 */
	public vn.gov.hoabinh.service.VcmsPARelationLocalService getVcmsPARelationLocalService() {
		return vcmsPARelationLocalService;
	}

	/**
	 * Sets the vcms p a relation local service.
	 *
	 * @param vcmsPARelationLocalService the vcms p a relation local service
	 */
	public void setVcmsPARelationLocalService(
		vn.gov.hoabinh.service.VcmsPARelationLocalService vcmsPARelationLocalService) {
		this.vcmsPARelationLocalService = vcmsPARelationLocalService;
	}

	/**
	 * Returns the vcms p a relation persistence.
	 *
	 * @return the vcms p a relation persistence
	 */
	public VcmsPARelationPersistence getVcmsPARelationPersistence() {
		return vcmsPARelationPersistence;
	}

	/**
	 * Sets the vcms p a relation persistence.
	 *
	 * @param vcmsPARelationPersistence the vcms p a relation persistence
	 */
	public void setVcmsPARelationPersistence(
		VcmsPARelationPersistence vcmsPARelationPersistence) {
		this.vcmsPARelationPersistence = vcmsPARelationPersistence;
	}

	/**
	 * Returns the vcms portion local service.
	 *
	 * @return the vcms portion local service
	 */
	public vn.gov.hoabinh.service.VcmsPortionLocalService getVcmsPortionLocalService() {
		return vcmsPortionLocalService;
	}

	/**
	 * Sets the vcms portion local service.
	 *
	 * @param vcmsPortionLocalService the vcms portion local service
	 */
	public void setVcmsPortionLocalService(
		vn.gov.hoabinh.service.VcmsPortionLocalService vcmsPortionLocalService) {
		this.vcmsPortionLocalService = vcmsPortionLocalService;
	}

	/**
	 * Returns the vcms portion persistence.
	 *
	 * @return the vcms portion persistence
	 */
	public VcmsPortionPersistence getVcmsPortionPersistence() {
		return vcmsPortionPersistence;
	}

	/**
	 * Sets the vcms portion persistence.
	 *
	 * @param vcmsPortionPersistence the vcms portion persistence
	 */
	public void setVcmsPortionPersistence(
		VcmsPortionPersistence vcmsPortionPersistence) {
		this.vcmsPortionPersistence = vcmsPortionPersistence;
	}

	/**
	 * Returns the vcms status local service.
	 *
	 * @return the vcms status local service
	 */
	public vn.gov.hoabinh.service.VcmsStatusLocalService getVcmsStatusLocalService() {
		return vcmsStatusLocalService;
	}

	/**
	 * Sets the vcms status local service.
	 *
	 * @param vcmsStatusLocalService the vcms status local service
	 */
	public void setVcmsStatusLocalService(
		vn.gov.hoabinh.service.VcmsStatusLocalService vcmsStatusLocalService) {
		this.vcmsStatusLocalService = vcmsStatusLocalService;
	}

	/**
	 * Returns the vcms status persistence.
	 *
	 * @return the vcms status persistence
	 */
	public VcmsStatusPersistence getVcmsStatusPersistence() {
		return vcmsStatusPersistence;
	}

	/**
	 * Sets the vcms status persistence.
	 *
	 * @param vcmsStatusPersistence the vcms status persistence
	 */
	public void setVcmsStatusPersistence(
		VcmsStatusPersistence vcmsStatusPersistence) {
		this.vcmsStatusPersistence = vcmsStatusPersistence;
	}

	/**
	 * Returns the vcms t a relation local service.
	 *
	 * @return the vcms t a relation local service
	 */
	public vn.gov.hoabinh.service.VcmsTARelationLocalService getVcmsTARelationLocalService() {
		return vcmsTARelationLocalService;
	}

	/**
	 * Sets the vcms t a relation local service.
	 *
	 * @param vcmsTARelationLocalService the vcms t a relation local service
	 */
	public void setVcmsTARelationLocalService(
		vn.gov.hoabinh.service.VcmsTARelationLocalService vcmsTARelationLocalService) {
		this.vcmsTARelationLocalService = vcmsTARelationLocalService;
	}

	/**
	 * Returns the vcms t a relation persistence.
	 *
	 * @return the vcms t a relation persistence
	 */
	public VcmsTARelationPersistence getVcmsTARelationPersistence() {
		return vcmsTARelationPersistence;
	}

	/**
	 * Sets the vcms t a relation persistence.
	 *
	 * @param vcmsTARelationPersistence the vcms t a relation persistence
	 */
	public void setVcmsTARelationPersistence(
		VcmsTARelationPersistence vcmsTARelationPersistence) {
		this.vcmsTARelationPersistence = vcmsTARelationPersistence;
	}

	/**
	 * Returns the vcms thread local service.
	 *
	 * @return the vcms thread local service
	 */
	public vn.gov.hoabinh.service.VcmsThreadLocalService getVcmsThreadLocalService() {
		return vcmsThreadLocalService;
	}

	/**
	 * Sets the vcms thread local service.
	 *
	 * @param vcmsThreadLocalService the vcms thread local service
	 */
	public void setVcmsThreadLocalService(
		vn.gov.hoabinh.service.VcmsThreadLocalService vcmsThreadLocalService) {
		this.vcmsThreadLocalService = vcmsThreadLocalService;
	}

	/**
	 * Returns the vcms thread persistence.
	 *
	 * @return the vcms thread persistence
	 */
	public VcmsThreadPersistence getVcmsThreadPersistence() {
		return vcmsThreadPersistence;
	}

	/**
	 * Sets the vcms thread persistence.
	 *
	 * @param vcmsThreadPersistence the vcms thread persistence
	 */
	public void setVcmsThreadPersistence(
		VcmsThreadPersistence vcmsThreadPersistence) {
		this.vcmsThreadPersistence = vcmsThreadPersistence;
	}

	/**
	 * Returns the vcms type local service.
	 *
	 * @return the vcms type local service
	 */
	public vn.gov.hoabinh.service.VcmsTypeLocalService getVcmsTypeLocalService() {
		return vcmsTypeLocalService;
	}

	/**
	 * Sets the vcms type local service.
	 *
	 * @param vcmsTypeLocalService the vcms type local service
	 */
	public void setVcmsTypeLocalService(
		vn.gov.hoabinh.service.VcmsTypeLocalService vcmsTypeLocalService) {
		this.vcmsTypeLocalService = vcmsTypeLocalService;
	}

	/**
	 * Returns the vcms type persistence.
	 *
	 * @return the vcms type persistence
	 */
	public VcmsTypePersistence getVcmsTypePersistence() {
		return vcmsTypePersistence;
	}

	/**
	 * Sets the vcms type persistence.
	 *
	 * @param vcmsTypePersistence the vcms type persistence
	 */
	public void setVcmsTypePersistence(VcmsTypePersistence vcmsTypePersistence) {
		this.vcmsTypePersistence = vcmsTypePersistence;
	}

	/**
	 * Returns the v contact local service.
	 *
	 * @return the v contact local service
	 */
	public vn.gov.hoabinh.service.VContactLocalService getVContactLocalService() {
		return vContactLocalService;
	}

	/**
	 * Sets the v contact local service.
	 *
	 * @param vContactLocalService the v contact local service
	 */
	public void setVContactLocalService(
		vn.gov.hoabinh.service.VContactLocalService vContactLocalService) {
		this.vContactLocalService = vContactLocalService;
	}

	/**
	 * Returns the v contact persistence.
	 *
	 * @return the v contact persistence
	 */
	public VContactPersistence getVContactPersistence() {
		return vContactPersistence;
	}

	/**
	 * Sets the v contact persistence.
	 *
	 * @param vContactPersistence the v contact persistence
	 */
	public void setVContactPersistence(VContactPersistence vContactPersistence) {
		this.vContactPersistence = vContactPersistence;
	}

	/**
	 * Returns the vdoc document local service.
	 *
	 * @return the vdoc document local service
	 */
	public vn.gov.hoabinh.service.vdocDocumentLocalService getvdocDocumentLocalService() {
		return vdocDocumentLocalService;
	}

	/**
	 * Sets the vdoc document local service.
	 *
	 * @param vdocDocumentLocalService the vdoc document local service
	 */
	public void setvdocDocumentLocalService(
		vn.gov.hoabinh.service.vdocDocumentLocalService vdocDocumentLocalService) {
		this.vdocDocumentLocalService = vdocDocumentLocalService;
	}

	/**
	 * Returns the vdoc document persistence.
	 *
	 * @return the vdoc document persistence
	 */
	public vdocDocumentPersistence getvdocDocumentPersistence() {
		return vdocDocumentPersistence;
	}

	/**
	 * Sets the vdoc document persistence.
	 *
	 * @param vdocDocumentPersistence the vdoc document persistence
	 */
	public void setvdocDocumentPersistence(
		vdocDocumentPersistence vdocDocumentPersistence) {
		this.vdocDocumentPersistence = vdocDocumentPersistence;
	}

	/**
	 * Returns the vdoc d o rel local service.
	 *
	 * @return the vdoc d o rel local service
	 */
	public vn.gov.hoabinh.service.vdocDORelLocalService getvdocDORelLocalService() {
		return vdocDORelLocalService;
	}

	/**
	 * Sets the vdoc d o rel local service.
	 *
	 * @param vdocDORelLocalService the vdoc d o rel local service
	 */
	public void setvdocDORelLocalService(
		vn.gov.hoabinh.service.vdocDORelLocalService vdocDORelLocalService) {
		this.vdocDORelLocalService = vdocDORelLocalService;
	}

	/**
	 * Returns the vdoc d o rel persistence.
	 *
	 * @return the vdoc d o rel persistence
	 */
	public vdocDORelPersistence getvdocDORelPersistence() {
		return vdocDORelPersistence;
	}

	/**
	 * Sets the vdoc d o rel persistence.
	 *
	 * @param vdocDORelPersistence the vdoc d o rel persistence
	 */
	public void setvdocDORelPersistence(
		vdocDORelPersistence vdocDORelPersistence) {
		this.vdocDORelPersistence = vdocDORelPersistence;
	}

	/**
	 * Returns the vdoc field local service.
	 *
	 * @return the vdoc field local service
	 */
	public vn.gov.hoabinh.service.vdocFieldLocalService getvdocFieldLocalService() {
		return vdocFieldLocalService;
	}

	/**
	 * Sets the vdoc field local service.
	 *
	 * @param vdocFieldLocalService the vdoc field local service
	 */
	public void setvdocFieldLocalService(
		vn.gov.hoabinh.service.vdocFieldLocalService vdocFieldLocalService) {
		this.vdocFieldLocalService = vdocFieldLocalService;
	}

	/**
	 * Returns the vdoc field persistence.
	 *
	 * @return the vdoc field persistence
	 */
	public vdocFieldPersistence getvdocFieldPersistence() {
		return vdocFieldPersistence;
	}

	/**
	 * Sets the vdoc field persistence.
	 *
	 * @param vdocFieldPersistence the vdoc field persistence
	 */
	public void setvdocFieldPersistence(
		vdocFieldPersistence vdocFieldPersistence) {
		this.vdocFieldPersistence = vdocFieldPersistence;
	}

	/**
	 * Returns the vdoc field level rel local service.
	 *
	 * @return the vdoc field level rel local service
	 */
	public vn.gov.hoabinh.service.vdocFieldLevelRelLocalService getvdocFieldLevelRelLocalService() {
		return vdocFieldLevelRelLocalService;
	}

	/**
	 * Sets the vdoc field level rel local service.
	 *
	 * @param vdocFieldLevelRelLocalService the vdoc field level rel local service
	 */
	public void setvdocFieldLevelRelLocalService(
		vn.gov.hoabinh.service.vdocFieldLevelRelLocalService vdocFieldLevelRelLocalService) {
		this.vdocFieldLevelRelLocalService = vdocFieldLevelRelLocalService;
	}

	/**
	 * Returns the vdoc field level rel persistence.
	 *
	 * @return the vdoc field level rel persistence
	 */
	public vdocFieldLevelRelPersistence getvdocFieldLevelRelPersistence() {
		return vdocFieldLevelRelPersistence;
	}

	/**
	 * Sets the vdoc field level rel persistence.
	 *
	 * @param vdocFieldLevelRelPersistence the vdoc field level rel persistence
	 */
	public void setvdocFieldLevelRelPersistence(
		vdocFieldLevelRelPersistence vdocFieldLevelRelPersistence) {
		this.vdocFieldLevelRelPersistence = vdocFieldLevelRelPersistence;
	}

	/**
	 * Returns the vdoc level local service.
	 *
	 * @return the vdoc level local service
	 */
	public vn.gov.hoabinh.service.vdocLevelLocalService getvdocLevelLocalService() {
		return vdocLevelLocalService;
	}

	/**
	 * Sets the vdoc level local service.
	 *
	 * @param vdocLevelLocalService the vdoc level local service
	 */
	public void setvdocLevelLocalService(
		vn.gov.hoabinh.service.vdocLevelLocalService vdocLevelLocalService) {
		this.vdocLevelLocalService = vdocLevelLocalService;
	}

	/**
	 * Returns the vdoc level persistence.
	 *
	 * @return the vdoc level persistence
	 */
	public vdocLevelPersistence getvdocLevelPersistence() {
		return vdocLevelPersistence;
	}

	/**
	 * Sets the vdoc level persistence.
	 *
	 * @param vdocLevelPersistence the vdoc level persistence
	 */
	public void setvdocLevelPersistence(
		vdocLevelPersistence vdocLevelPersistence) {
		this.vdocLevelPersistence = vdocLevelPersistence;
	}

	/**
	 * Returns the vdoc logger local service.
	 *
	 * @return the vdoc logger local service
	 */
	public vn.gov.hoabinh.service.vdocLoggerLocalService getvdocLoggerLocalService() {
		return vdocLoggerLocalService;
	}

	/**
	 * Sets the vdoc logger local service.
	 *
	 * @param vdocLoggerLocalService the vdoc logger local service
	 */
	public void setvdocLoggerLocalService(
		vn.gov.hoabinh.service.vdocLoggerLocalService vdocLoggerLocalService) {
		this.vdocLoggerLocalService = vdocLoggerLocalService;
	}

	/**
	 * Returns the vdoc logger persistence.
	 *
	 * @return the vdoc logger persistence
	 */
	public vdocLoggerPersistence getvdocLoggerPersistence() {
		return vdocLoggerPersistence;
	}

	/**
	 * Sets the vdoc logger persistence.
	 *
	 * @param vdocLoggerPersistence the vdoc logger persistence
	 */
	public void setvdocLoggerPersistence(
		vdocLoggerPersistence vdocLoggerPersistence) {
		this.vdocLoggerPersistence = vdocLoggerPersistence;
	}

	/**
	 * Returns the vdoc org local service.
	 *
	 * @return the vdoc org local service
	 */
	public vn.gov.hoabinh.service.vdocOrgLocalService getvdocOrgLocalService() {
		return vdocOrgLocalService;
	}

	/**
	 * Sets the vdoc org local service.
	 *
	 * @param vdocOrgLocalService the vdoc org local service
	 */
	public void setvdocOrgLocalService(
		vn.gov.hoabinh.service.vdocOrgLocalService vdocOrgLocalService) {
		this.vdocOrgLocalService = vdocOrgLocalService;
	}

	/**
	 * Returns the vdoc org persistence.
	 *
	 * @return the vdoc org persistence
	 */
	public vdocOrgPersistence getvdocOrgPersistence() {
		return vdocOrgPersistence;
	}

	/**
	 * Sets the vdoc org persistence.
	 *
	 * @param vdocOrgPersistence the vdoc org persistence
	 */
	public void setvdocOrgPersistence(vdocOrgPersistence vdocOrgPersistence) {
		this.vdocOrgPersistence = vdocOrgPersistence;
	}

	/**
	 * Returns the visitor tracker local service.
	 *
	 * @return the visitor tracker local service
	 */
	public vn.gov.hoabinh.service.VisitorTrackerLocalService getVisitorTrackerLocalService() {
		return visitorTrackerLocalService;
	}

	/**
	 * Sets the visitor tracker local service.
	 *
	 * @param visitorTrackerLocalService the visitor tracker local service
	 */
	public void setVisitorTrackerLocalService(
		vn.gov.hoabinh.service.VisitorTrackerLocalService visitorTrackerLocalService) {
		this.visitorTrackerLocalService = visitorTrackerLocalService;
	}

	/**
	 * Returns the visitor tracker persistence.
	 *
	 * @return the visitor tracker persistence
	 */
	public VisitorTrackerPersistence getVisitorTrackerPersistence() {
		return visitorTrackerPersistence;
	}

	/**
	 * Sets the visitor tracker persistence.
	 *
	 * @param visitorTrackerPersistence the visitor tracker persistence
	 */
	public void setVisitorTrackerPersistence(
		VisitorTrackerPersistence visitorTrackerPersistence) {
		this.visitorTrackerPersistence = visitorTrackerPersistence;
	}

	/**
	 * Returns the v legal attached message local service.
	 *
	 * @return the v legal attached message local service
	 */
	public vn.gov.hoabinh.service.VLegalAttachedMessageLocalService getVLegalAttachedMessageLocalService() {
		return vLegalAttachedMessageLocalService;
	}

	/**
	 * Sets the v legal attached message local service.
	 *
	 * @param vLegalAttachedMessageLocalService the v legal attached message local service
	 */
	public void setVLegalAttachedMessageLocalService(
		vn.gov.hoabinh.service.VLegalAttachedMessageLocalService vLegalAttachedMessageLocalService) {
		this.vLegalAttachedMessageLocalService = vLegalAttachedMessageLocalService;
	}

	/**
	 * Returns the v legal attached message persistence.
	 *
	 * @return the v legal attached message persistence
	 */
	public VLegalAttachedMessagePersistence getVLegalAttachedMessagePersistence() {
		return vLegalAttachedMessagePersistence;
	}

	/**
	 * Sets the v legal attached message persistence.
	 *
	 * @param vLegalAttachedMessagePersistence the v legal attached message persistence
	 */
	public void setVLegalAttachedMessagePersistence(
		VLegalAttachedMessagePersistence vLegalAttachedMessagePersistence) {
		this.vLegalAttachedMessagePersistence = vLegalAttachedMessagePersistence;
	}

	/**
	 * Returns the v legal d d rel local service.
	 *
	 * @return the v legal d d rel local service
	 */
	public vn.gov.hoabinh.service.VLegalDDRelLocalService getVLegalDDRelLocalService() {
		return vLegalDDRelLocalService;
	}

	/**
	 * Sets the v legal d d rel local service.
	 *
	 * @param vLegalDDRelLocalService the v legal d d rel local service
	 */
	public void setVLegalDDRelLocalService(
		vn.gov.hoabinh.service.VLegalDDRelLocalService vLegalDDRelLocalService) {
		this.vLegalDDRelLocalService = vLegalDDRelLocalService;
	}

	/**
	 * Returns the v legal d d rel persistence.
	 *
	 * @return the v legal d d rel persistence
	 */
	public VLegalDDRelPersistence getVLegalDDRelPersistence() {
		return vLegalDDRelPersistence;
	}

	/**
	 * Sets the v legal d d rel persistence.
	 *
	 * @param vLegalDDRelPersistence the v legal d d rel persistence
	 */
	public void setVLegalDDRelPersistence(
		VLegalDDRelPersistence vLegalDDRelPersistence) {
		this.vLegalDDRelPersistence = vLegalDDRelPersistence;
	}

	/**
	 * Returns the v legal d f rel local service.
	 *
	 * @return the v legal d f rel local service
	 */
	public VLegalDFRelLocalService getVLegalDFRelLocalService() {
		return vLegalDFRelLocalService;
	}

	/**
	 * Sets the v legal d f rel local service.
	 *
	 * @param vLegalDFRelLocalService the v legal d f rel local service
	 */
	public void setVLegalDFRelLocalService(
		VLegalDFRelLocalService vLegalDFRelLocalService) {
		this.vLegalDFRelLocalService = vLegalDFRelLocalService;
	}

	/**
	 * Returns the v legal d f rel persistence.
	 *
	 * @return the v legal d f rel persistence
	 */
	public VLegalDFRelPersistence getVLegalDFRelPersistence() {
		return vLegalDFRelPersistence;
	}

	/**
	 * Sets the v legal d f rel persistence.
	 *
	 * @param vLegalDFRelPersistence the v legal d f rel persistence
	 */
	public void setVLegalDFRelPersistence(
		VLegalDFRelPersistence vLegalDFRelPersistence) {
		this.vLegalDFRelPersistence = vLegalDFRelPersistence;
	}

	/**
	 * Returns the v legal document local service.
	 *
	 * @return the v legal document local service
	 */
	public vn.gov.hoabinh.service.VLegalDocumentLocalService getVLegalDocumentLocalService() {
		return vLegalDocumentLocalService;
	}

	/**
	 * Sets the v legal document local service.
	 *
	 * @param vLegalDocumentLocalService the v legal document local service
	 */
	public void setVLegalDocumentLocalService(
		vn.gov.hoabinh.service.VLegalDocumentLocalService vLegalDocumentLocalService) {
		this.vLegalDocumentLocalService = vLegalDocumentLocalService;
	}

	/**
	 * Returns the v legal document persistence.
	 *
	 * @return the v legal document persistence
	 */
	public VLegalDocumentPersistence getVLegalDocumentPersistence() {
		return vLegalDocumentPersistence;
	}

	/**
	 * Sets the v legal document persistence.
	 *
	 * @param vLegalDocumentPersistence the v legal document persistence
	 */
	public void setVLegalDocumentPersistence(
		VLegalDocumentPersistence vLegalDocumentPersistence) {
		this.vLegalDocumentPersistence = vLegalDocumentPersistence;
	}

	/**
	 * Returns the v legal draft document local service.
	 *
	 * @return the v legal draft document local service
	 */
	public vn.gov.hoabinh.service.VLegalDraftDocumentLocalService getVLegalDraftDocumentLocalService() {
		return vLegalDraftDocumentLocalService;
	}

	/**
	 * Sets the v legal draft document local service.
	 *
	 * @param vLegalDraftDocumentLocalService the v legal draft document local service
	 */
	public void setVLegalDraftDocumentLocalService(
		vn.gov.hoabinh.service.VLegalDraftDocumentLocalService vLegalDraftDocumentLocalService) {
		this.vLegalDraftDocumentLocalService = vLegalDraftDocumentLocalService;
	}

	/**
	 * Returns the v legal draft document persistence.
	 *
	 * @return the v legal draft document persistence
	 */
	public VLegalDraftDocumentPersistence getVLegalDraftDocumentPersistence() {
		return vLegalDraftDocumentPersistence;
	}

	/**
	 * Sets the v legal draft document persistence.
	 *
	 * @param vLegalDraftDocumentPersistence the v legal draft document persistence
	 */
	public void setVLegalDraftDocumentPersistence(
		VLegalDraftDocumentPersistence vLegalDraftDocumentPersistence) {
		this.vLegalDraftDocumentPersistence = vLegalDraftDocumentPersistence;
	}

	/**
	 * Returns the v legal d s rel local service.
	 *
	 * @return the v legal d s rel local service
	 */
	public vn.gov.hoabinh.service.VLegalDSRelLocalService getVLegalDSRelLocalService() {
		return vLegalDSRelLocalService;
	}

	/**
	 * Sets the v legal d s rel local service.
	 *
	 * @param vLegalDSRelLocalService the v legal d s rel local service
	 */
	public void setVLegalDSRelLocalService(
		vn.gov.hoabinh.service.VLegalDSRelLocalService vLegalDSRelLocalService) {
		this.vLegalDSRelLocalService = vLegalDSRelLocalService;
	}

	/**
	 * Returns the v legal d s rel persistence.
	 *
	 * @return the v legal d s rel persistence
	 */
	public VLegalDSRelPersistence getVLegalDSRelPersistence() {
		return vLegalDSRelPersistence;
	}

	/**
	 * Sets the v legal d s rel persistence.
	 *
	 * @param vLegalDSRelPersistence the v legal d s rel persistence
	 */
	public void setVLegalDSRelPersistence(
		VLegalDSRelPersistence vLegalDSRelPersistence) {
		this.vLegalDSRelPersistence = vLegalDSRelPersistence;
	}

	/**
	 * Returns the v legal d u rel local service.
	 *
	 * @return the v legal d u rel local service
	 */
	public vn.gov.hoabinh.service.VLegalDURelLocalService getVLegalDURelLocalService() {
		return vLegalDURelLocalService;
	}

	/**
	 * Sets the v legal d u rel local service.
	 *
	 * @param vLegalDURelLocalService the v legal d u rel local service
	 */
	public void setVLegalDURelLocalService(
		vn.gov.hoabinh.service.VLegalDURelLocalService vLegalDURelLocalService) {
		this.vLegalDURelLocalService = vLegalDURelLocalService;
	}

	/**
	 * Returns the v legal d u rel persistence.
	 *
	 * @return the v legal d u rel persistence
	 */
	public VLegalDURelPersistence getVLegalDURelPersistence() {
		return vLegalDURelPersistence;
	}

	/**
	 * Sets the v legal d u rel persistence.
	 *
	 * @param vLegalDURelPersistence the v legal d u rel persistence
	 */
	public void setVLegalDURelPersistence(
		VLegalDURelPersistence vLegalDURelPersistence) {
		this.vLegalDURelPersistence = vLegalDURelPersistence;
	}

	/**
	 * Returns the v legal field local service.
	 *
	 * @return the v legal field local service
	 */
	public vn.gov.hoabinh.service.VLegalFieldLocalService getVLegalFieldLocalService() {
		return vLegalFieldLocalService;
	}

	/**
	 * Sets the v legal field local service.
	 *
	 * @param vLegalFieldLocalService the v legal field local service
	 */
	public void setVLegalFieldLocalService(
		vn.gov.hoabinh.service.VLegalFieldLocalService vLegalFieldLocalService) {
		this.vLegalFieldLocalService = vLegalFieldLocalService;
	}

	/**
	 * Returns the v legal field persistence.
	 *
	 * @return the v legal field persistence
	 */
	public VLegalFieldPersistence getVLegalFieldPersistence() {
		return vLegalFieldPersistence;
	}

	/**
	 * Sets the v legal field persistence.
	 *
	 * @param vLegalFieldPersistence the v legal field persistence
	 */
	public void setVLegalFieldPersistence(
		VLegalFieldPersistence vLegalFieldPersistence) {
		this.vLegalFieldPersistence = vLegalFieldPersistence;
	}

	/**
	 * Returns the v legal f o rel local service.
	 *
	 * @return the v legal f o rel local service
	 */
	public vn.gov.hoabinh.service.VLegalFORelLocalService getVLegalFORelLocalService() {
		return vLegalFORelLocalService;
	}

	/**
	 * Sets the v legal f o rel local service.
	 *
	 * @param vLegalFORelLocalService the v legal f o rel local service
	 */
	public void setVLegalFORelLocalService(
		vn.gov.hoabinh.service.VLegalFORelLocalService vLegalFORelLocalService) {
		this.vLegalFORelLocalService = vLegalFORelLocalService;
	}

	/**
	 * Returns the v legal f o rel persistence.
	 *
	 * @return the v legal f o rel persistence
	 */
	public VLegalFORelPersistence getVLegalFORelPersistence() {
		return vLegalFORelPersistence;
	}

	/**
	 * Sets the v legal f o rel persistence.
	 *
	 * @param vLegalFORelPersistence the v legal f o rel persistence
	 */
	public void setVLegalFORelPersistence(
		VLegalFORelPersistence vLegalFORelPersistence) {
		this.vLegalFORelPersistence = vLegalFORelPersistence;
	}

	/**
	 * Returns the v legal f t rel local service.
	 *
	 * @return the v legal f t rel local service
	 */
	public vn.gov.hoabinh.service.VLegalFTRelLocalService getVLegalFTRelLocalService() {
		return vLegalFTRelLocalService;
	}

	/**
	 * Sets the v legal f t rel local service.
	 *
	 * @param vLegalFTRelLocalService the v legal f t rel local service
	 */
	public void setVLegalFTRelLocalService(
		vn.gov.hoabinh.service.VLegalFTRelLocalService vLegalFTRelLocalService) {
		this.vLegalFTRelLocalService = vLegalFTRelLocalService;
	}

	/**
	 * Returns the v legal f t rel persistence.
	 *
	 * @return the v legal f t rel persistence
	 */
	public VLegalFTRelPersistence getVLegalFTRelPersistence() {
		return vLegalFTRelPersistence;
	}

	/**
	 * Sets the v legal f t rel persistence.
	 *
	 * @param vLegalFTRelPersistence the v legal f t rel persistence
	 */
	public void setVLegalFTRelPersistence(
		VLegalFTRelPersistence vLegalFTRelPersistence) {
		this.vLegalFTRelPersistence = vLegalFTRelPersistence;
	}

	/**
	 * Returns the v legal logger local service.
	 *
	 * @return the v legal logger local service
	 */
	public vn.gov.hoabinh.service.VLegalLoggerLocalService getVLegalLoggerLocalService() {
		return vLegalLoggerLocalService;
	}

	/**
	 * Sets the v legal logger local service.
	 *
	 * @param vLegalLoggerLocalService the v legal logger local service
	 */
	public void setVLegalLoggerLocalService(
		vn.gov.hoabinh.service.VLegalLoggerLocalService vLegalLoggerLocalService) {
		this.vLegalLoggerLocalService = vLegalLoggerLocalService;
	}

	/**
	 * Returns the v legal logger persistence.
	 *
	 * @return the v legal logger persistence
	 */
	public VLegalLoggerPersistence getVLegalLoggerPersistence() {
		return vLegalLoggerPersistence;
	}

	/**
	 * Sets the v legal logger persistence.
	 *
	 * @param vLegalLoggerPersistence the v legal logger persistence
	 */
	public void setVLegalLoggerPersistence(
		VLegalLoggerPersistence vLegalLoggerPersistence) {
		this.vLegalLoggerPersistence = vLegalLoggerPersistence;
	}

	/**
	 * Returns the v legal org local service.
	 *
	 * @return the v legal org local service
	 */
	public vn.gov.hoabinh.service.VLegalOrgLocalService getVLegalOrgLocalService() {
		return vLegalOrgLocalService;
	}

	/**
	 * Sets the v legal org local service.
	 *
	 * @param vLegalOrgLocalService the v legal org local service
	 */
	public void setVLegalOrgLocalService(
		vn.gov.hoabinh.service.VLegalOrgLocalService vLegalOrgLocalService) {
		this.vLegalOrgLocalService = vLegalOrgLocalService;
	}

	/**
	 * Returns the v legal org persistence.
	 *
	 * @return the v legal org persistence
	 */
	public VLegalOrgPersistence getVLegalOrgPersistence() {
		return vLegalOrgPersistence;
	}

	/**
	 * Sets the v legal org persistence.
	 *
	 * @param vLegalOrgPersistence the v legal org persistence
	 */
	public void setVLegalOrgPersistence(
		VLegalOrgPersistence vLegalOrgPersistence) {
		this.vLegalOrgPersistence = vLegalOrgPersistence;
	}

	/**
	 * Returns the v legal signer local service.
	 *
	 * @return the v legal signer local service
	 */
	public vn.gov.hoabinh.service.VLegalSignerLocalService getVLegalSignerLocalService() {
		return vLegalSignerLocalService;
	}

	/**
	 * Sets the v legal signer local service.
	 *
	 * @param vLegalSignerLocalService the v legal signer local service
	 */
	public void setVLegalSignerLocalService(
		vn.gov.hoabinh.service.VLegalSignerLocalService vLegalSignerLocalService) {
		this.vLegalSignerLocalService = vLegalSignerLocalService;
	}

	/**
	 * Returns the v legal signer persistence.
	 *
	 * @return the v legal signer persistence
	 */
	public VLegalSignerPersistence getVLegalSignerPersistence() {
		return vLegalSignerPersistence;
	}

	/**
	 * Sets the v legal signer persistence.
	 *
	 * @param vLegalSignerPersistence the v legal signer persistence
	 */
	public void setVLegalSignerPersistence(
		VLegalSignerPersistence vLegalSignerPersistence) {
		this.vLegalSignerPersistence = vLegalSignerPersistence;
	}

	/**
	 * Returns the v legal suggest document local service.
	 *
	 * @return the v legal suggest document local service
	 */
	public vn.gov.hoabinh.service.VLegalSuggestDocumentLocalService getVLegalSuggestDocumentLocalService() {
		return vLegalSuggestDocumentLocalService;
	}

	/**
	 * Sets the v legal suggest document local service.
	 *
	 * @param vLegalSuggestDocumentLocalService the v legal suggest document local service
	 */
	public void setVLegalSuggestDocumentLocalService(
		vn.gov.hoabinh.service.VLegalSuggestDocumentLocalService vLegalSuggestDocumentLocalService) {
		this.vLegalSuggestDocumentLocalService = vLegalSuggestDocumentLocalService;
	}

	/**
	 * Returns the v legal suggest document persistence.
	 *
	 * @return the v legal suggest document persistence
	 */
	public VLegalSuggestDocumentPersistence getVLegalSuggestDocumentPersistence() {
		return vLegalSuggestDocumentPersistence;
	}

	/**
	 * Sets the v legal suggest document persistence.
	 *
	 * @param vLegalSuggestDocumentPersistence the v legal suggest document persistence
	 */
	public void setVLegalSuggestDocumentPersistence(
		VLegalSuggestDocumentPersistence vLegalSuggestDocumentPersistence) {
		this.vLegalSuggestDocumentPersistence = vLegalSuggestDocumentPersistence;
	}

	/**
	 * Returns the v legal tags local service.
	 *
	 * @return the v legal tags local service
	 */
	public vn.gov.hoabinh.service.VLegalTagsLocalService getVLegalTagsLocalService() {
		return vLegalTagsLocalService;
	}

	/**
	 * Sets the v legal tags local service.
	 *
	 * @param vLegalTagsLocalService the v legal tags local service
	 */
	public void setVLegalTagsLocalService(
		vn.gov.hoabinh.service.VLegalTagsLocalService vLegalTagsLocalService) {
		this.vLegalTagsLocalService = vLegalTagsLocalService;
	}

	/**
	 * Returns the v legal tags persistence.
	 *
	 * @return the v legal tags persistence
	 */
	public VLegalTagsPersistence getVLegalTagsPersistence() {
		return vLegalTagsPersistence;
	}

	/**
	 * Sets the v legal tags persistence.
	 *
	 * @param vLegalTagsPersistence the v legal tags persistence
	 */
	public void setVLegalTagsPersistence(
		VLegalTagsPersistence vLegalTagsPersistence) {
		this.vLegalTagsPersistence = vLegalTagsPersistence;
	}

	/**
	 * Returns the v legal t d rel local service.
	 *
	 * @return the v legal t d rel local service
	 */
	public vn.gov.hoabinh.service.VLegalTDRelLocalService getVLegalTDRelLocalService() {
		return vLegalTDRelLocalService;
	}

	/**
	 * Sets the v legal t d rel local service.
	 *
	 * @param vLegalTDRelLocalService the v legal t d rel local service
	 */
	public void setVLegalTDRelLocalService(
		vn.gov.hoabinh.service.VLegalTDRelLocalService vLegalTDRelLocalService) {
		this.vLegalTDRelLocalService = vLegalTDRelLocalService;
	}

	/**
	 * Returns the v legal t d rel persistence.
	 *
	 * @return the v legal t d rel persistence
	 */
	public VLegalTDRelPersistence getVLegalTDRelPersistence() {
		return vLegalTDRelPersistence;
	}

	/**
	 * Sets the v legal t d rel persistence.
	 *
	 * @param vLegalTDRelPersistence the v legal t d rel persistence
	 */
	public void setVLegalTDRelPersistence(
		VLegalTDRelPersistence vLegalTDRelPersistence) {
		this.vLegalTDRelPersistence = vLegalTDRelPersistence;
	}

	/**
	 * Returns the v legal type local service.
	 *
	 * @return the v legal type local service
	 */
	public vn.gov.hoabinh.service.VLegalTypeLocalService getVLegalTypeLocalService() {
		return vLegalTypeLocalService;
	}

	/**
	 * Sets the v legal type local service.
	 *
	 * @param vLegalTypeLocalService the v legal type local service
	 */
	public void setVLegalTypeLocalService(
		vn.gov.hoabinh.service.VLegalTypeLocalService vLegalTypeLocalService) {
		this.vLegalTypeLocalService = vLegalTypeLocalService;
	}

	/**
	 * Returns the v legal type persistence.
	 *
	 * @return the v legal type persistence
	 */
	public VLegalTypePersistence getVLegalTypePersistence() {
		return vLegalTypePersistence;
	}

	/**
	 * Sets the v legal type persistence.
	 *
	 * @param vLegalTypePersistence the v legal type persistence
	 */
	public void setVLegalTypePersistence(
		VLegalTypePersistence vLegalTypePersistence) {
		this.vLegalTypePersistence = vLegalTypePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("vn.gov.hoabinh.model.VLegalDFRel",
			vLegalDFRelLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"vn.gov.hoabinh.model.VLegalDFRel");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return VLegalDFRelLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return VLegalDFRel.class;
	}

	protected String getModelClassName() {
		return VLegalDFRel.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = vLegalDFRelPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = vn.gov.hoabinh.service.AdvItemLocalService.class)
	protected vn.gov.hoabinh.service.AdvItemLocalService advItemLocalService;
	@BeanReference(type = AdvItemPersistence.class)
	protected AdvItemPersistence advItemPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.AdvTypeLocalService.class)
	protected vn.gov.hoabinh.service.AdvTypeLocalService advTypeLocalService;
	@BeanReference(type = AdvTypePersistence.class)
	protected AdvTypePersistence advTypePersistence;
	@BeanReference(type = vn.gov.hoabinh.service.AttachmentLocalService.class)
	protected vn.gov.hoabinh.service.AttachmentLocalService attachmentLocalService;
	@BeanReference(type = AttachmentPersistence.class)
	protected AttachmentPersistence attachmentPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.ClipLocalService.class)
	protected vn.gov.hoabinh.service.ClipLocalService clipLocalService;
	@BeanReference(type = ClipPersistence.class)
	protected ClipPersistence clipPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.ClipTypeLocalService.class)
	protected vn.gov.hoabinh.service.ClipTypeLocalService clipTypeLocalService;
	@BeanReference(type = ClipTypePersistence.class)
	protected ClipTypePersistence clipTypePersistence;
	@BeanReference(type = vn.gov.hoabinh.service.DataConvertLocalService.class)
	protected vn.gov.hoabinh.service.DataConvertLocalService dataConvertLocalService;
	@BeanReference(type = DataConvertPersistence.class)
	protected DataConvertPersistence dataConvertPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.FAQAnswerLocalService.class)
	protected vn.gov.hoabinh.service.FAQAnswerLocalService faqAnswerLocalService;
	@BeanReference(type = FAQAnswerPersistence.class)
	protected FAQAnswerPersistence faqAnswerPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.FAQCategoryLocalService.class)
	protected vn.gov.hoabinh.service.FAQCategoryLocalService faqCategoryLocalService;
	@BeanReference(type = FAQCategoryPersistence.class)
	protected FAQCategoryPersistence faqCategoryPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.FAQCategoryQuestionLocalService.class)
	protected vn.gov.hoabinh.service.FAQCategoryQuestionLocalService faqCategoryQuestionLocalService;
	@BeanReference(type = FAQCategoryQuestionPersistence.class)
	protected FAQCategoryQuestionPersistence faqCategoryQuestionPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.FAQCommentLocalService.class)
	protected vn.gov.hoabinh.service.FAQCommentLocalService faqCommentLocalService;
	@BeanReference(type = FAQCommentPersistence.class)
	protected FAQCommentPersistence faqCommentPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.FAQQuestionLocalService.class)
	protected vn.gov.hoabinh.service.FAQQuestionLocalService faqQuestionLocalService;
	@BeanReference(type = FAQQuestionPersistence.class)
	protected FAQQuestionPersistence faqQuestionPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.LinkGroupLocalService.class)
	protected vn.gov.hoabinh.service.LinkGroupLocalService linkGroupLocalService;
	@BeanReference(type = LinkGroupPersistence.class)
	protected LinkGroupPersistence linkGroupPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.LinksLocalService.class)
	protected vn.gov.hoabinh.service.LinksLocalService linksLocalService;
	@BeanReference(type = LinksPersistence.class)
	protected LinksPersistence linksPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsArticleLocalService.class)
	protected vn.gov.hoabinh.service.VcmsArticleLocalService vcmsArticleLocalService;
	@BeanReference(type = VcmsArticlePersistence.class)
	protected VcmsArticlePersistence vcmsArticlePersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsArticleRatingLocalService.class)
	protected vn.gov.hoabinh.service.VcmsArticleRatingLocalService vcmsArticleRatingLocalService;
	@BeanReference(type = VcmsArticleRatingPersistence.class)
	protected VcmsArticleRatingPersistence vcmsArticleRatingPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsArticleStatusLocalService.class)
	protected vn.gov.hoabinh.service.VcmsArticleStatusLocalService vcmsArticleStatusLocalService;
	@BeanReference(type = VcmsArticleStatusPersistence.class)
	protected VcmsArticleStatusPersistence vcmsArticleStatusPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsArticleTypeLocalService.class)
	protected vn.gov.hoabinh.service.VcmsArticleTypeLocalService vcmsArticleTypeLocalService;
	@BeanReference(type = VcmsArticleTypePersistence.class)
	protected VcmsArticleTypePersistence vcmsArticleTypePersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsArticleVersionLocalService.class)
	protected vn.gov.hoabinh.service.VcmsArticleVersionLocalService vcmsArticleVersionLocalService;
	@BeanReference(type = VcmsArticleVersionPersistence.class)
	protected VcmsArticleVersionPersistence vcmsArticleVersionPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsAttachedMessageLocalService.class)
	protected vn.gov.hoabinh.service.VcmsAttachedMessageLocalService vcmsAttachedMessageLocalService;
	@BeanReference(type = VcmsAttachedMessagePersistence.class)
	protected VcmsAttachedMessagePersistence vcmsAttachedMessagePersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsCARelationLocalService.class)
	protected vn.gov.hoabinh.service.VcmsCARelationLocalService vcmsCARelationLocalService;
	@BeanReference(type = VcmsCARelationPersistence.class)
	protected VcmsCARelationPersistence vcmsCARelationPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsCategoryLocalService.class)
	protected vn.gov.hoabinh.service.VcmsCategoryLocalService vcmsCategoryLocalService;
	@BeanReference(type = VcmsCategoryPersistence.class)
	protected VcmsCategoryPersistence vcmsCategoryPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsCURelationLocalService.class)
	protected vn.gov.hoabinh.service.VcmsCURelationLocalService vcmsCURelationLocalService;
	@BeanReference(type = VcmsCURelationPersistence.class)
	protected VcmsCURelationPersistence vcmsCURelationPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsDiscussionLocalService.class)
	protected vn.gov.hoabinh.service.VcmsDiscussionLocalService vcmsDiscussionLocalService;
	@BeanReference(type = VcmsDiscussionPersistence.class)
	protected VcmsDiscussionPersistence vcmsDiscussionPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsLoggerLocalService.class)
	protected vn.gov.hoabinh.service.VcmsLoggerLocalService vcmsLoggerLocalService;
	@BeanReference(type = VcmsLoggerPersistence.class)
	protected VcmsLoggerPersistence vcmsLoggerPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsPARelationLocalService.class)
	protected vn.gov.hoabinh.service.VcmsPARelationLocalService vcmsPARelationLocalService;
	@BeanReference(type = VcmsPARelationPersistence.class)
	protected VcmsPARelationPersistence vcmsPARelationPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsPortionLocalService.class)
	protected vn.gov.hoabinh.service.VcmsPortionLocalService vcmsPortionLocalService;
	@BeanReference(type = VcmsPortionPersistence.class)
	protected VcmsPortionPersistence vcmsPortionPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsStatusLocalService.class)
	protected vn.gov.hoabinh.service.VcmsStatusLocalService vcmsStatusLocalService;
	@BeanReference(type = VcmsStatusPersistence.class)
	protected VcmsStatusPersistence vcmsStatusPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsTARelationLocalService.class)
	protected vn.gov.hoabinh.service.VcmsTARelationLocalService vcmsTARelationLocalService;
	@BeanReference(type = VcmsTARelationPersistence.class)
	protected VcmsTARelationPersistence vcmsTARelationPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsThreadLocalService.class)
	protected vn.gov.hoabinh.service.VcmsThreadLocalService vcmsThreadLocalService;
	@BeanReference(type = VcmsThreadPersistence.class)
	protected VcmsThreadPersistence vcmsThreadPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VcmsTypeLocalService.class)
	protected vn.gov.hoabinh.service.VcmsTypeLocalService vcmsTypeLocalService;
	@BeanReference(type = VcmsTypePersistence.class)
	protected VcmsTypePersistence vcmsTypePersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VContactLocalService.class)
	protected vn.gov.hoabinh.service.VContactLocalService vContactLocalService;
	@BeanReference(type = VContactPersistence.class)
	protected VContactPersistence vContactPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.vdocDocumentLocalService.class)
	protected vn.gov.hoabinh.service.vdocDocumentLocalService vdocDocumentLocalService;
	@BeanReference(type = vdocDocumentPersistence.class)
	protected vdocDocumentPersistence vdocDocumentPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.vdocDORelLocalService.class)
	protected vn.gov.hoabinh.service.vdocDORelLocalService vdocDORelLocalService;
	@BeanReference(type = vdocDORelPersistence.class)
	protected vdocDORelPersistence vdocDORelPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.vdocFieldLocalService.class)
	protected vn.gov.hoabinh.service.vdocFieldLocalService vdocFieldLocalService;
	@BeanReference(type = vdocFieldPersistence.class)
	protected vdocFieldPersistence vdocFieldPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.vdocFieldLevelRelLocalService.class)
	protected vn.gov.hoabinh.service.vdocFieldLevelRelLocalService vdocFieldLevelRelLocalService;
	@BeanReference(type = vdocFieldLevelRelPersistence.class)
	protected vdocFieldLevelRelPersistence vdocFieldLevelRelPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.vdocLevelLocalService.class)
	protected vn.gov.hoabinh.service.vdocLevelLocalService vdocLevelLocalService;
	@BeanReference(type = vdocLevelPersistence.class)
	protected vdocLevelPersistence vdocLevelPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.vdocLoggerLocalService.class)
	protected vn.gov.hoabinh.service.vdocLoggerLocalService vdocLoggerLocalService;
	@BeanReference(type = vdocLoggerPersistence.class)
	protected vdocLoggerPersistence vdocLoggerPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.vdocOrgLocalService.class)
	protected vn.gov.hoabinh.service.vdocOrgLocalService vdocOrgLocalService;
	@BeanReference(type = vdocOrgPersistence.class)
	protected vdocOrgPersistence vdocOrgPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VisitorTrackerLocalService.class)
	protected vn.gov.hoabinh.service.VisitorTrackerLocalService visitorTrackerLocalService;
	@BeanReference(type = VisitorTrackerPersistence.class)
	protected VisitorTrackerPersistence visitorTrackerPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalAttachedMessageLocalService.class)
	protected vn.gov.hoabinh.service.VLegalAttachedMessageLocalService vLegalAttachedMessageLocalService;
	@BeanReference(type = VLegalAttachedMessagePersistence.class)
	protected VLegalAttachedMessagePersistence vLegalAttachedMessagePersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalDDRelLocalService.class)
	protected vn.gov.hoabinh.service.VLegalDDRelLocalService vLegalDDRelLocalService;
	@BeanReference(type = VLegalDDRelPersistence.class)
	protected VLegalDDRelPersistence vLegalDDRelPersistence;
	@BeanReference(type = VLegalDFRelLocalService.class)
	protected VLegalDFRelLocalService vLegalDFRelLocalService;
	@BeanReference(type = VLegalDFRelPersistence.class)
	protected VLegalDFRelPersistence vLegalDFRelPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalDocumentLocalService.class)
	protected vn.gov.hoabinh.service.VLegalDocumentLocalService vLegalDocumentLocalService;
	@BeanReference(type = VLegalDocumentPersistence.class)
	protected VLegalDocumentPersistence vLegalDocumentPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalDraftDocumentLocalService.class)
	protected vn.gov.hoabinh.service.VLegalDraftDocumentLocalService vLegalDraftDocumentLocalService;
	@BeanReference(type = VLegalDraftDocumentPersistence.class)
	protected VLegalDraftDocumentPersistence vLegalDraftDocumentPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalDSRelLocalService.class)
	protected vn.gov.hoabinh.service.VLegalDSRelLocalService vLegalDSRelLocalService;
	@BeanReference(type = VLegalDSRelPersistence.class)
	protected VLegalDSRelPersistence vLegalDSRelPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalDURelLocalService.class)
	protected vn.gov.hoabinh.service.VLegalDURelLocalService vLegalDURelLocalService;
	@BeanReference(type = VLegalDURelPersistence.class)
	protected VLegalDURelPersistence vLegalDURelPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalFieldLocalService.class)
	protected vn.gov.hoabinh.service.VLegalFieldLocalService vLegalFieldLocalService;
	@BeanReference(type = VLegalFieldPersistence.class)
	protected VLegalFieldPersistence vLegalFieldPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalFORelLocalService.class)
	protected vn.gov.hoabinh.service.VLegalFORelLocalService vLegalFORelLocalService;
	@BeanReference(type = VLegalFORelPersistence.class)
	protected VLegalFORelPersistence vLegalFORelPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalFTRelLocalService.class)
	protected vn.gov.hoabinh.service.VLegalFTRelLocalService vLegalFTRelLocalService;
	@BeanReference(type = VLegalFTRelPersistence.class)
	protected VLegalFTRelPersistence vLegalFTRelPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalLoggerLocalService.class)
	protected vn.gov.hoabinh.service.VLegalLoggerLocalService vLegalLoggerLocalService;
	@BeanReference(type = VLegalLoggerPersistence.class)
	protected VLegalLoggerPersistence vLegalLoggerPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalOrgLocalService.class)
	protected vn.gov.hoabinh.service.VLegalOrgLocalService vLegalOrgLocalService;
	@BeanReference(type = VLegalOrgPersistence.class)
	protected VLegalOrgPersistence vLegalOrgPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalSignerLocalService.class)
	protected vn.gov.hoabinh.service.VLegalSignerLocalService vLegalSignerLocalService;
	@BeanReference(type = VLegalSignerPersistence.class)
	protected VLegalSignerPersistence vLegalSignerPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalSuggestDocumentLocalService.class)
	protected vn.gov.hoabinh.service.VLegalSuggestDocumentLocalService vLegalSuggestDocumentLocalService;
	@BeanReference(type = VLegalSuggestDocumentPersistence.class)
	protected VLegalSuggestDocumentPersistence vLegalSuggestDocumentPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalTagsLocalService.class)
	protected vn.gov.hoabinh.service.VLegalTagsLocalService vLegalTagsLocalService;
	@BeanReference(type = VLegalTagsPersistence.class)
	protected VLegalTagsPersistence vLegalTagsPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalTDRelLocalService.class)
	protected vn.gov.hoabinh.service.VLegalTDRelLocalService vLegalTDRelLocalService;
	@BeanReference(type = VLegalTDRelPersistence.class)
	protected VLegalTDRelPersistence vLegalTDRelPersistence;
	@BeanReference(type = vn.gov.hoabinh.service.VLegalTypeLocalService.class)
	protected vn.gov.hoabinh.service.VLegalTypeLocalService vLegalTypeLocalService;
	@BeanReference(type = VLegalTypePersistence.class)
	protected VLegalTypePersistence vLegalTypePersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}