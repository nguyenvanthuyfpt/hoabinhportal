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

package vn.gov.hoabinh.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import vn.gov.hoabinh.model.FAQQuestion;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

/**
 * Provides the local service interface for FAQQuestion. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see FAQQuestionLocalServiceUtil
 * @see vn.gov.hoabinh.service.base.FAQQuestionLocalServiceBaseImpl
 * @see vn.gov.hoabinh.service.impl.FAQQuestionLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface FAQQuestionLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FAQQuestionLocalServiceUtil} to access the f a q question local service. Add custom service methods to {@link vn.gov.hoabinh.service.impl.FAQQuestionLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery buildQuestionDQ(long groupId,
		java.lang.String language, boolean approved, boolean isFromTo,
		long categoryId, java.lang.String title, java.lang.String sentbyuser,
		java.lang.String senderemail, Date fromDate, Date toDate,
		boolean andSearch, boolean isCount);

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	public int countApprovedQuestions(long groupId)
		throws PortalException, SystemException;

	public int countQuestion(long groupId, java.lang.String language,
		boolean approved, boolean isFromTo, long categoryId,
		java.lang.String title, java.lang.String sentbyuser,
		java.lang.String senderemail, Date fromDate, Date toDate,
		boolean andSearch);

	public int countQuestionByG_L(long groupId, java.lang.String language);

	public int countQuestionByG_L_A(long groupId, java.lang.String language,
		boolean approved);

	public int countQuestionByG_L_C_A(long groupId, java.lang.String language,
		long categoryId, boolean approved);

	/**
	* Returns the number of f a q questions.
	*
	* @return the number of f a q questions
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFAQQuestionsCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FAQQuestion> getApprovedQuestions(long groupId)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FAQQuestion> getApprovedQuestions(long groupId, int start,
		int end) throws PortalException, SystemException;

	/**
	* Returns a range of all the f a q questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.gov.hoabinh.model.impl.FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of f a q questions
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FAQQuestion> getFAQQuestions(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FAQQuestion> getListQuestionByG_L_C_A(long groupId,
		java.lang.String language, long categoryId, boolean approved);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FAQQuestion> getListQuestionByG_L_C_A(long groupId,
		java.lang.String language, long categoryId, boolean approved,
		int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FAQQuestion> getOtherQuestion(long groupId,
		java.lang.String language, boolean approved, int begin, int end)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FAQQuestion> getQuestionByG_L(long groupId,
		java.lang.String language);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FAQQuestion> getQuestionByG_L(long groupId,
		java.lang.String language, int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FAQQuestion> getQuestionByG_L_A(long groupId,
		java.lang.String language, boolean approved);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FAQQuestion> getQuestionByG_L_A(long groupId,
		java.lang.String language, boolean approved, int begin, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FAQQuestion> getQuestionByG_L_C_A_Q(long groupId,
		java.lang.String language, long categoryId, long questionId,
		int quantity);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FAQQuestion> getUnapprovedQuestions(long groupId)
		throws PortalException, SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<FAQQuestion> searchQuestion(long groupId,
		java.lang.String language, boolean approved, boolean isFromTo,
		long categoryId, java.lang.String title, java.lang.String sentbyuser,
		java.lang.String senderemail, Date fromDate, Date toDate,
		boolean andSearch, int start, int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	/**
	* Adds the f a q question to the database. Also notifies the appropriate model listeners.
	*
	* @param faqQuestion the f a q question
	* @return the f a q question that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public FAQQuestion addFAQQuestion(FAQQuestion faqQuestion);

	public FAQQuestion addQuestion(long groupId, java.lang.String language,
		java.lang.String title, java.lang.String content,
		java.lang.String sentByUser, java.lang.String senderEmail,
		java.lang.String questionType, long categoryId, int questionOrder,
		int hitCount, boolean isApproved, long userId)
		throws PortalException, SystemException;

	public FAQQuestion approveQuestion(long questionId, java.lang.String userId)
		throws PortalException, SystemException;

	/**
	* Creates a new f a q question with the primary key. Does not add the f a q question to the database.
	*
	* @param id the primary key for the new f a q question
	* @return the new f a q question
	*/
	public FAQQuestion createFAQQuestion(long id);

	/**
	* Deletes the f a q question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q question
	* @return the f a q question that was removed
	* @throws PortalException if a f a q question with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public FAQQuestion deleteFAQQuestion(long id) throws PortalException;

	/**
	* Deletes the f a q question from the database. Also notifies the appropriate model listeners.
	*
	* @param faqQuestion the f a q question
	* @return the f a q question that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public FAQQuestion deleteFAQQuestion(FAQQuestion faqQuestion);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FAQQuestion fetchFAQQuestion(long id);

	/**
	* Returns the f a q question with the primary key.
	*
	* @param id the primary key of the f a q question
	* @return the f a q question
	* @throws PortalException if a f a q question with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FAQQuestion getFAQQuestion(long id) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public FAQQuestion getQuestion(long questionId)
		throws PortalException, SystemException;

	public FAQQuestion increaseHitCount(long questionId)
		throws PortalException, SystemException;

	public FAQQuestion unapproveQuestion(long questionId,
		java.lang.String userId) throws PortalException, SystemException;

	/**
	* Updates the f a q question in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param faqQuestion the f a q question
	* @return the f a q question that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public FAQQuestion updateFAQQuestion(FAQQuestion faqQuestion);

	public FAQQuestion updateQuestion(long groupId, java.lang.String language,
		long questionId, java.lang.String title, java.lang.String content,
		java.lang.String sentByUser, java.lang.String senderEmail,
		java.lang.String questionType, long categoryId, int questionOrder,
		int hitCount, boolean isApproved, long userId)
		throws PortalException, SystemException;

	public FAQQuestion updateQuestion(long questionId, int hitCount)
		throws PortalException, SystemException;

	public void deleteQuestion(long questionId)
		throws PortalException, SystemException;
}