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

package vn.gov.hoabinh.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import vn.gov.hoabinh.model.FAQQuestion;

import java.util.List;

/**
 * The persistence utility for the f a q question service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.FAQQuestionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQQuestionPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.FAQQuestionPersistenceImpl
 * @generated
 */
@ProviderType
public class FAQQuestionUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(FAQQuestion faqQuestion) {
		getPersistence().clearCache(faqQuestion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FAQQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FAQQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FAQQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FAQQuestion update(FAQQuestion faqQuestion) {
		return getPersistence().update(faqQuestion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FAQQuestion update(FAQQuestion faqQuestion,
		ServiceContext serviceContext) {
		return getPersistence().update(faqQuestion, serviceContext);
	}

	/**
	* Returns all the f a q questions where groupId = &#63; and questionType = &#63;.
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @return the matching f a q questions
	*/
	public static List<FAQQuestion> findByG_T(long groupId,
		java.lang.String questionType) {
		return getPersistence().findByG_T(groupId, questionType);
	}

	/**
	* Returns a range of all the f a q questions where groupId = &#63; and questionType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_T(long groupId,
		java.lang.String questionType, int start, int end) {
		return getPersistence().findByG_T(groupId, questionType, start, end);
	}

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and questionType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_T(long groupId,
		java.lang.String questionType, int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .findByG_T(groupId, questionType, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and questionType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_T(long groupId,
		java.lang.String questionType, int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_T(groupId, questionType, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and questionType = &#63;.
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public static FAQQuestion findByG_T_First(long groupId,
		java.lang.String questionType,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_T_First(groupId, questionType, orderByComparator);
	}

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and questionType = &#63;.
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public static FAQQuestion fetchByG_T_First(long groupId,
		java.lang.String questionType,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByG_T_First(groupId, questionType, orderByComparator);
	}

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and questionType = &#63;.
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public static FAQQuestion findByG_T_Last(long groupId,
		java.lang.String questionType,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_T_Last(groupId, questionType, orderByComparator);
	}

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and questionType = &#63;.
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public static FAQQuestion fetchByG_T_Last(long groupId,
		java.lang.String questionType,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByG_T_Last(groupId, questionType, orderByComparator);
	}

	/**
	* Returns the f a q questions before and after the current f a q question in the ordered set where groupId = &#63; and questionType = &#63;.
	*
	* @param id the primary key of the current f a q question
	* @param groupId the group ID
	* @param questionType the question type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q question
	* @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	*/
	public static FAQQuestion[] findByG_T_PrevAndNext(long id, long groupId,
		java.lang.String questionType,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_T_PrevAndNext(id, groupId, questionType,
			orderByComparator);
	}

	/**
	* Removes all the f a q questions where groupId = &#63; and questionType = &#63; from the database.
	*
	* @param groupId the group ID
	* @param questionType the question type
	*/
	public static void removeByG_T(long groupId, java.lang.String questionType) {
		getPersistence().removeByG_T(groupId, questionType);
	}

	/**
	* Returns the number of f a q questions where groupId = &#63; and questionType = &#63;.
	*
	* @param groupId the group ID
	* @param questionType the question type
	* @return the number of matching f a q questions
	*/
	public static int countByG_T(long groupId, java.lang.String questionType) {
		return getPersistence().countByG_T(groupId, questionType);
	}

	/**
	* Returns all the f a q questions where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @return the matching f a q questions
	*/
	public static List<FAQQuestion> findByG_A(long groupId, boolean approved) {
		return getPersistence().findByG_A(groupId, approved);
	}

	/**
	* Returns a range of all the f a q questions where groupId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_A(long groupId, boolean approved,
		int start, int end) {
		return getPersistence().findByG_A(groupId, approved, start, end);
	}

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_A(long groupId, boolean approved,
		int start, int end, OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .findByG_A(groupId, approved, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_A(long groupId, boolean approved,
		int start, int end, OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_A(groupId, approved, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public static FAQQuestion findByG_A_First(long groupId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_A_First(groupId, approved, orderByComparator);
	}

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public static FAQQuestion fetchByG_A_First(long groupId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByG_A_First(groupId, approved, orderByComparator);
	}

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public static FAQQuestion findByG_A_Last(long groupId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_A_Last(groupId, approved, orderByComparator);
	}

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public static FAQQuestion fetchByG_A_Last(long groupId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByG_A_Last(groupId, approved, orderByComparator);
	}

	/**
	* Returns the f a q questions before and after the current f a q question in the ordered set where groupId = &#63; and approved = &#63;.
	*
	* @param id the primary key of the current f a q question
	* @param groupId the group ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q question
	* @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	*/
	public static FAQQuestion[] findByG_A_PrevAndNext(long id, long groupId,
		boolean approved, OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_A_PrevAndNext(id, groupId, approved,
			orderByComparator);
	}

	/**
	* Removes all the f a q questions where groupId = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group ID
	* @param approved the approved
	*/
	public static void removeByG_A(long groupId, boolean approved) {
		getPersistence().removeByG_A(groupId, approved);
	}

	/**
	* Returns the number of f a q questions where groupId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param approved the approved
	* @return the number of matching f a q questions
	*/
	public static int countByG_A(long groupId, boolean approved) {
		return getPersistence().countByG_A(groupId, approved);
	}

	/**
	* Returns all the f a q questions where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L(long groupId,
		java.lang.String language) {
		return getPersistence().findByG_L(groupId, language);
	}

	/**
	* Returns a range of all the f a q questions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L(long groupId,
		java.lang.String language, int start, int end) {
		return getPersistence().findByG_L(groupId, language, start, end);
	}

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L(long groupId,
		java.lang.String language, int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L(groupId, language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public static FAQQuestion findByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public static FAQQuestion fetchByG_L_First(long groupId,
		java.lang.String language,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_First(groupId, language, orderByComparator);
	}

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public static FAQQuestion findByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public static FAQQuestion fetchByG_L_Last(long groupId,
		java.lang.String language,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_Last(groupId, language, orderByComparator);
	}

	/**
	* Returns the f a q questions before and after the current f a q question in the ordered set where groupId = &#63; and language = &#63;.
	*
	* @param id the primary key of the current f a q question
	* @param groupId the group ID
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q question
	* @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	*/
	public static FAQQuestion[] findByG_L_PrevAndNext(long id, long groupId,
		java.lang.String language,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_L_PrevAndNext(id, groupId, language,
			orderByComparator);
	}

	/**
	* Removes all the f a q questions where groupId = &#63; and language = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	*/
	public static void removeByG_L(long groupId, java.lang.String language) {
		getPersistence().removeByG_L(groupId, language);
	}

	/**
	* Returns the number of f a q questions where groupId = &#63; and language = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @return the number of matching f a q questions
	*/
	public static int countByG_L(long groupId, java.lang.String language) {
		return getPersistence().countByG_L(groupId, language);
	}

	/**
	* Returns all the f a q questions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L_A(long groupId,
		java.lang.String language, boolean approved) {
		return getPersistence().findByG_L_A(groupId, language, approved);
	}

	/**
	* Returns a range of all the f a q questions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end) {
		return getPersistence()
				   .findByG_L_A(groupId, language, approved, start, end);
	}

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .findByG_L_A(groupId, language, approved, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L_A(long groupId,
		java.lang.String language, boolean approved, int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_A(groupId, language, approved, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public static FAQQuestion findByG_L_A_First(long groupId,
		java.lang.String language, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_L_A_First(groupId, language, approved,
			orderByComparator);
	}

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public static FAQQuestion fetchByG_L_A_First(long groupId,
		java.lang.String language, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_A_First(groupId, language, approved,
			orderByComparator);
	}

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public static FAQQuestion findByG_L_A_Last(long groupId,
		java.lang.String language, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_L_A_Last(groupId, language, approved,
			orderByComparator);
	}

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public static FAQQuestion fetchByG_L_A_Last(long groupId,
		java.lang.String language, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_A_Last(groupId, language, approved,
			orderByComparator);
	}

	/**
	* Returns the f a q questions before and after the current f a q question in the ordered set where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param id the primary key of the current f a q question
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q question
	* @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	*/
	public static FAQQuestion[] findByG_L_A_PrevAndNext(long id, long groupId,
		java.lang.String language, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_L_A_PrevAndNext(id, groupId, language, approved,
			orderByComparator);
	}

	/**
	* Removes all the f a q questions where groupId = &#63; and language = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	*/
	public static void removeByG_L_A(long groupId, java.lang.String language,
		boolean approved) {
		getPersistence().removeByG_L_A(groupId, language, approved);
	}

	/**
	* Returns the number of f a q questions where groupId = &#63; and language = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param approved the approved
	* @return the number of matching f a q questions
	*/
	public static int countByG_L_A(long groupId, java.lang.String language,
		boolean approved) {
		return getPersistence().countByG_L_A(groupId, language, approved);
	}

	/**
	* Returns all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @return the matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L_C_A(long groupId,
		java.lang.String language, long categoryId, boolean approved) {
		return getPersistence()
				   .findByG_L_C_A(groupId, language, categoryId, approved);
	}

	/**
	* Returns a range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L_C_A(long groupId,
		java.lang.String language, long categoryId, boolean approved,
		int start, int end) {
		return getPersistence()
				   .findByG_L_C_A(groupId, language, categoryId, approved,
			start, end);
	}

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L_C_A(long groupId,
		java.lang.String language, long categoryId, boolean approved,
		int start, int end, OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .findByG_L_C_A(groupId, language, categoryId, approved,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L_C_A(long groupId,
		java.lang.String language, long categoryId, boolean approved,
		int start, int end, OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_C_A(groupId, language, categoryId, approved,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public static FAQQuestion findByG_L_C_A_First(long groupId,
		java.lang.String language, long categoryId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_L_C_A_First(groupId, language, categoryId,
			approved, orderByComparator);
	}

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public static FAQQuestion fetchByG_L_C_A_First(long groupId,
		java.lang.String language, long categoryId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_C_A_First(groupId, language, categoryId,
			approved, orderByComparator);
	}

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public static FAQQuestion findByG_L_C_A_Last(long groupId,
		java.lang.String language, long categoryId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_L_C_A_Last(groupId, language, categoryId, approved,
			orderByComparator);
	}

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public static FAQQuestion fetchByG_L_C_A_Last(long groupId,
		java.lang.String language, long categoryId, boolean approved,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_C_A_Last(groupId, language, categoryId,
			approved, orderByComparator);
	}

	/**
	* Returns the f a q questions before and after the current f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* @param id the primary key of the current f a q question
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q question
	* @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	*/
	public static FAQQuestion[] findByG_L_C_A_PrevAndNext(long id,
		long groupId, java.lang.String language, long categoryId,
		boolean approved, OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_L_C_A_PrevAndNext(id, groupId, language,
			categoryId, approved, orderByComparator);
	}

	/**
	* Removes all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	*/
	public static void removeByG_L_C_A(long groupId, java.lang.String language,
		long categoryId, boolean approved) {
		getPersistence().removeByG_L_C_A(groupId, language, categoryId, approved);
	}

	/**
	* Returns the number of f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @return the number of matching f a q questions
	*/
	public static int countByG_L_C_A(long groupId, java.lang.String language,
		long categoryId, boolean approved) {
		return getPersistence()
				   .countByG_L_C_A(groupId, language, categoryId, approved);
	}

	/**
	* Returns all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @return the matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L_C_A_Q(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id) {
		return getPersistence()
				   .findByG_L_C_A_Q(groupId, language, categoryId, approved, id);
	}

	/**
	* Returns a range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L_C_A_Q(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id,
		int start, int end) {
		return getPersistence()
				   .findByG_L_C_A_Q(groupId, language, categoryId, approved,
			id, start, end);
	}

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L_C_A_Q(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id,
		int start, int end, OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .findByG_L_C_A_Q(groupId, language, categoryId, approved,
			id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q questions
	*/
	public static List<FAQQuestion> findByG_L_C_A_Q(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id,
		int start, int end, OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L_C_A_Q(groupId, language, categoryId, approved,
			id, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public static FAQQuestion findByG_L_C_A_Q_First(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_L_C_A_Q_First(groupId, language, categoryId,
			approved, id, orderByComparator);
	}

	/**
	* Returns the first f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public static FAQQuestion fetchByG_L_C_A_Q_First(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_C_A_Q_First(groupId, language, categoryId,
			approved, id, orderByComparator);
	}

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question
	* @throws NoSuchFAQQuestionException if a matching f a q question could not be found
	*/
	public static FAQQuestion findByG_L_C_A_Q_Last(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id,
		OrderByComparator<FAQQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence()
				   .findByG_L_C_A_Q_Last(groupId, language, categoryId,
			approved, id, orderByComparator);
	}

	/**
	* Returns the last f a q question in the ordered set where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q question, or <code>null</code> if a matching f a q question could not be found
	*/
	public static FAQQuestion fetchByG_L_C_A_Q_Last(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByG_L_C_A_Q_Last(groupId, language, categoryId,
			approved, id, orderByComparator);
	}

	/**
	* Removes all the f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63; from the database.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	*/
	public static void removeByG_L_C_A_Q(long groupId,
		java.lang.String language, long categoryId, boolean approved, long id) {
		getPersistence()
			.removeByG_L_C_A_Q(groupId, language, categoryId, approved, id);
	}

	/**
	* Returns the number of f a q questions where groupId = &#63; and language = &#63; and categoryId = &#63; and approved = &#63; and id &ne; &#63;.
	*
	* @param groupId the group ID
	* @param language the language
	* @param categoryId the category ID
	* @param approved the approved
	* @param id the ID
	* @return the number of matching f a q questions
	*/
	public static int countByG_L_C_A_Q(long groupId, java.lang.String language,
		long categoryId, boolean approved, long id) {
		return getPersistence()
				   .countByG_L_C_A_Q(groupId, language, categoryId, approved, id);
	}

	/**
	* Caches the f a q question in the entity cache if it is enabled.
	*
	* @param faqQuestion the f a q question
	*/
	public static void cacheResult(FAQQuestion faqQuestion) {
		getPersistence().cacheResult(faqQuestion);
	}

	/**
	* Caches the f a q questions in the entity cache if it is enabled.
	*
	* @param faqQuestions the f a q questions
	*/
	public static void cacheResult(List<FAQQuestion> faqQuestions) {
		getPersistence().cacheResult(faqQuestions);
	}

	/**
	* Creates a new f a q question with the primary key. Does not add the f a q question to the database.
	*
	* @param id the primary key for the new f a q question
	* @return the new f a q question
	*/
	public static FAQQuestion create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the f a q question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q question
	* @return the f a q question that was removed
	* @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	*/
	public static FAQQuestion remove(long id)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence().remove(id);
	}

	public static FAQQuestion updateImpl(FAQQuestion faqQuestion) {
		return getPersistence().updateImpl(faqQuestion);
	}

	/**
	* Returns the f a q question with the primary key or throws a {@link NoSuchFAQQuestionException} if it could not be found.
	*
	* @param id the primary key of the f a q question
	* @return the f a q question
	* @throws NoSuchFAQQuestionException if a f a q question with the primary key could not be found
	*/
	public static FAQQuestion findByPrimaryKey(long id)
		throws vn.gov.hoabinh.exception.NoSuchFAQQuestionException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the f a q question with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the f a q question
	* @return the f a q question, or <code>null</code> if a f a q question with the primary key could not be found
	*/
	public static FAQQuestion fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, FAQQuestion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the f a q questions.
	*
	* @return the f a q questions
	*/
	public static List<FAQQuestion> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the f a q questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @return the range of f a q questions
	*/
	public static List<FAQQuestion> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the f a q questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of f a q questions
	*/
	public static List<FAQQuestion> findAll(int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q questions
	* @param end the upper bound of the range of f a q questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of f a q questions
	*/
	public static List<FAQQuestion> findAll(int start, int end,
		OrderByComparator<FAQQuestion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the f a q questions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of f a q questions.
	*
	* @return the number of f a q questions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static FAQQuestionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FAQQuestionPersistence, FAQQuestionPersistence> _serviceTracker =
		ServiceTrackerFactory.open(FAQQuestionPersistence.class);
}