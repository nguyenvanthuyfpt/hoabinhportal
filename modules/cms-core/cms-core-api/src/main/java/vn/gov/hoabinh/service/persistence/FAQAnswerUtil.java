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

import vn.gov.hoabinh.model.FAQAnswer;

import java.util.List;

/**
 * The persistence utility for the f a q answer service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.FAQAnswerPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQAnswerPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.FAQAnswerPersistenceImpl
 * @generated
 */
@ProviderType
public class FAQAnswerUtil {
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
	public static void clearCache(FAQAnswer faqAnswer) {
		getPersistence().clearCache(faqAnswer);
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
	public static List<FAQAnswer> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FAQAnswer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FAQAnswer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FAQAnswer> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FAQAnswer update(FAQAnswer faqAnswer) {
		return getPersistence().update(faqAnswer);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FAQAnswer update(FAQAnswer faqAnswer,
		ServiceContext serviceContext) {
		return getPersistence().update(faqAnswer, serviceContext);
	}

	/**
	* Returns all the f a q answers where language = &#63;.
	*
	* @param language the language
	* @return the matching f a q answers
	*/
	public static List<FAQAnswer> findByG_L(java.lang.String language) {
		return getPersistence().findByG_L(language);
	}

	/**
	* Returns a range of all the f a q answers where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param language the language
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @return the range of matching f a q answers
	*/
	public static List<FAQAnswer> findByG_L(java.lang.String language,
		int start, int end) {
		return getPersistence().findByG_L(language, start, end);
	}

	/**
	* Returns an ordered range of all the f a q answers where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param language the language
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q answers
	*/
	public static List<FAQAnswer> findByG_L(java.lang.String language,
		int start, int end, OrderByComparator<FAQAnswer> orderByComparator) {
		return getPersistence()
				   .findByG_L(language, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q answers where language = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param language the language
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q answers
	*/
	public static List<FAQAnswer> findByG_L(java.lang.String language,
		int start, int end, OrderByComparator<FAQAnswer> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_L(language, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first f a q answer in the ordered set where language = &#63;.
	*
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public static FAQAnswer findByG_L_First(java.lang.String language,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQAnswerException {
		return getPersistence().findByG_L_First(language, orderByComparator);
	}

	/**
	* Returns the first f a q answer in the ordered set where language = &#63;.
	*
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public static FAQAnswer fetchByG_L_First(java.lang.String language,
		OrderByComparator<FAQAnswer> orderByComparator) {
		return getPersistence().fetchByG_L_First(language, orderByComparator);
	}

	/**
	* Returns the last f a q answer in the ordered set where language = &#63;.
	*
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public static FAQAnswer findByG_L_Last(java.lang.String language,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQAnswerException {
		return getPersistence().findByG_L_Last(language, orderByComparator);
	}

	/**
	* Returns the last f a q answer in the ordered set where language = &#63;.
	*
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public static FAQAnswer fetchByG_L_Last(java.lang.String language,
		OrderByComparator<FAQAnswer> orderByComparator) {
		return getPersistence().fetchByG_L_Last(language, orderByComparator);
	}

	/**
	* Returns the f a q answers before and after the current f a q answer in the ordered set where language = &#63;.
	*
	* @param id the primary key of the current f a q answer
	* @param language the language
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q answer
	* @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	*/
	public static FAQAnswer[] findByG_L_PrevAndNext(long id,
		java.lang.String language,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQAnswerException {
		return getPersistence()
				   .findByG_L_PrevAndNext(id, language, orderByComparator);
	}

	/**
	* Removes all the f a q answers where language = &#63; from the database.
	*
	* @param language the language
	*/
	public static void removeByG_L(java.lang.String language) {
		getPersistence().removeByG_L(language);
	}

	/**
	* Returns the number of f a q answers where language = &#63;.
	*
	* @param language the language
	* @return the number of matching f a q answers
	*/
	public static int countByG_L(java.lang.String language) {
		return getPersistence().countByG_L(language);
	}

	/**
	* Returns all the f a q answers where approved = &#63;.
	*
	* @param approved the approved
	* @return the matching f a q answers
	*/
	public static List<FAQAnswer> findByApproved(boolean approved) {
		return getPersistence().findByApproved(approved);
	}

	/**
	* Returns a range of all the f a q answers where approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param approved the approved
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @return the range of matching f a q answers
	*/
	public static List<FAQAnswer> findByApproved(boolean approved, int start,
		int end) {
		return getPersistence().findByApproved(approved, start, end);
	}

	/**
	* Returns an ordered range of all the f a q answers where approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param approved the approved
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q answers
	*/
	public static List<FAQAnswer> findByApproved(boolean approved, int start,
		int end, OrderByComparator<FAQAnswer> orderByComparator) {
		return getPersistence()
				   .findByApproved(approved, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q answers where approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param approved the approved
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q answers
	*/
	public static List<FAQAnswer> findByApproved(boolean approved, int start,
		int end, OrderByComparator<FAQAnswer> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByApproved(approved, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first f a q answer in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public static FAQAnswer findByApproved_First(boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQAnswerException {
		return getPersistence().findByApproved_First(approved, orderByComparator);
	}

	/**
	* Returns the first f a q answer in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public static FAQAnswer fetchByApproved_First(boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator) {
		return getPersistence()
				   .fetchByApproved_First(approved, orderByComparator);
	}

	/**
	* Returns the last f a q answer in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public static FAQAnswer findByApproved_Last(boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQAnswerException {
		return getPersistence().findByApproved_Last(approved, orderByComparator);
	}

	/**
	* Returns the last f a q answer in the ordered set where approved = &#63;.
	*
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public static FAQAnswer fetchByApproved_Last(boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator) {
		return getPersistence().fetchByApproved_Last(approved, orderByComparator);
	}

	/**
	* Returns the f a q answers before and after the current f a q answer in the ordered set where approved = &#63;.
	*
	* @param id the primary key of the current f a q answer
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q answer
	* @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	*/
	public static FAQAnswer[] findByApproved_PrevAndNext(long id,
		boolean approved, OrderByComparator<FAQAnswer> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQAnswerException {
		return getPersistence()
				   .findByApproved_PrevAndNext(id, approved, orderByComparator);
	}

	/**
	* Removes all the f a q answers where approved = &#63; from the database.
	*
	* @param approved the approved
	*/
	public static void removeByApproved(boolean approved) {
		getPersistence().removeByApproved(approved);
	}

	/**
	* Returns the number of f a q answers where approved = &#63;.
	*
	* @param approved the approved
	* @return the number of matching f a q answers
	*/
	public static int countByApproved(boolean approved) {
		return getPersistence().countByApproved(approved);
	}

	/**
	* Returns all the f a q answers where questionid = &#63;.
	*
	* @param questionid the questionid
	* @return the matching f a q answers
	*/
	public static List<FAQAnswer> findByQuestionId(long questionid) {
		return getPersistence().findByQuestionId(questionid);
	}

	/**
	* Returns a range of all the f a q answers where questionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionid the questionid
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @return the range of matching f a q answers
	*/
	public static List<FAQAnswer> findByQuestionId(long questionid, int start,
		int end) {
		return getPersistence().findByQuestionId(questionid, start, end);
	}

	/**
	* Returns an ordered range of all the f a q answers where questionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionid the questionid
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q answers
	*/
	public static List<FAQAnswer> findByQuestionId(long questionid, int start,
		int end, OrderByComparator<FAQAnswer> orderByComparator) {
		return getPersistence()
				   .findByQuestionId(questionid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q answers where questionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionid the questionid
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q answers
	*/
	public static List<FAQAnswer> findByQuestionId(long questionid, int start,
		int end, OrderByComparator<FAQAnswer> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByQuestionId(questionid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first f a q answer in the ordered set where questionid = &#63;.
	*
	* @param questionid the questionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public static FAQAnswer findByQuestionId_First(long questionid,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQAnswerException {
		return getPersistence()
				   .findByQuestionId_First(questionid, orderByComparator);
	}

	/**
	* Returns the first f a q answer in the ordered set where questionid = &#63;.
	*
	* @param questionid the questionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public static FAQAnswer fetchByQuestionId_First(long questionid,
		OrderByComparator<FAQAnswer> orderByComparator) {
		return getPersistence()
				   .fetchByQuestionId_First(questionid, orderByComparator);
	}

	/**
	* Returns the last f a q answer in the ordered set where questionid = &#63;.
	*
	* @param questionid the questionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public static FAQAnswer findByQuestionId_Last(long questionid,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQAnswerException {
		return getPersistence()
				   .findByQuestionId_Last(questionid, orderByComparator);
	}

	/**
	* Returns the last f a q answer in the ordered set where questionid = &#63;.
	*
	* @param questionid the questionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public static FAQAnswer fetchByQuestionId_Last(long questionid,
		OrderByComparator<FAQAnswer> orderByComparator) {
		return getPersistence()
				   .fetchByQuestionId_Last(questionid, orderByComparator);
	}

	/**
	* Returns the f a q answers before and after the current f a q answer in the ordered set where questionid = &#63;.
	*
	* @param id the primary key of the current f a q answer
	* @param questionid the questionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q answer
	* @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	*/
	public static FAQAnswer[] findByQuestionId_PrevAndNext(long id,
		long questionid, OrderByComparator<FAQAnswer> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQAnswerException {
		return getPersistence()
				   .findByQuestionId_PrevAndNext(id, questionid,
			orderByComparator);
	}

	/**
	* Removes all the f a q answers where questionid = &#63; from the database.
	*
	* @param questionid the questionid
	*/
	public static void removeByQuestionId(long questionid) {
		getPersistence().removeByQuestionId(questionid);
	}

	/**
	* Returns the number of f a q answers where questionid = &#63;.
	*
	* @param questionid the questionid
	* @return the number of matching f a q answers
	*/
	public static int countByQuestionId(long questionid) {
		return getPersistence().countByQuestionId(questionid);
	}

	/**
	* Returns all the f a q answers where questionid = &#63; and approved = &#63;.
	*
	* @param questionid the questionid
	* @param approved the approved
	* @return the matching f a q answers
	*/
	public static List<FAQAnswer> findByQ_A(long questionid, boolean approved) {
		return getPersistence().findByQ_A(questionid, approved);
	}

	/**
	* Returns a range of all the f a q answers where questionid = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionid the questionid
	* @param approved the approved
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @return the range of matching f a q answers
	*/
	public static List<FAQAnswer> findByQ_A(long questionid, boolean approved,
		int start, int end) {
		return getPersistence().findByQ_A(questionid, approved, start, end);
	}

	/**
	* Returns an ordered range of all the f a q answers where questionid = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionid the questionid
	* @param approved the approved
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q answers
	*/
	public static List<FAQAnswer> findByQ_A(long questionid, boolean approved,
		int start, int end, OrderByComparator<FAQAnswer> orderByComparator) {
		return getPersistence()
				   .findByQ_A(questionid, approved, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q answers where questionid = &#63; and approved = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionid the questionid
	* @param approved the approved
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q answers
	*/
	public static List<FAQAnswer> findByQ_A(long questionid, boolean approved,
		int start, int end, OrderByComparator<FAQAnswer> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByQ_A(questionid, approved, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first f a q answer in the ordered set where questionid = &#63; and approved = &#63;.
	*
	* @param questionid the questionid
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public static FAQAnswer findByQ_A_First(long questionid, boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQAnswerException {
		return getPersistence()
				   .findByQ_A_First(questionid, approved, orderByComparator);
	}

	/**
	* Returns the first f a q answer in the ordered set where questionid = &#63; and approved = &#63;.
	*
	* @param questionid the questionid
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public static FAQAnswer fetchByQ_A_First(long questionid, boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator) {
		return getPersistence()
				   .fetchByQ_A_First(questionid, approved, orderByComparator);
	}

	/**
	* Returns the last f a q answer in the ordered set where questionid = &#63; and approved = &#63;.
	*
	* @param questionid the questionid
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer
	* @throws NoSuchFAQAnswerException if a matching f a q answer could not be found
	*/
	public static FAQAnswer findByQ_A_Last(long questionid, boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQAnswerException {
		return getPersistence()
				   .findByQ_A_Last(questionid, approved, orderByComparator);
	}

	/**
	* Returns the last f a q answer in the ordered set where questionid = &#63; and approved = &#63;.
	*
	* @param questionid the questionid
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q answer, or <code>null</code> if a matching f a q answer could not be found
	*/
	public static FAQAnswer fetchByQ_A_Last(long questionid, boolean approved,
		OrderByComparator<FAQAnswer> orderByComparator) {
		return getPersistence()
				   .fetchByQ_A_Last(questionid, approved, orderByComparator);
	}

	/**
	* Returns the f a q answers before and after the current f a q answer in the ordered set where questionid = &#63; and approved = &#63;.
	*
	* @param id the primary key of the current f a q answer
	* @param questionid the questionid
	* @param approved the approved
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q answer
	* @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	*/
	public static FAQAnswer[] findByQ_A_PrevAndNext(long id, long questionid,
		boolean approved, OrderByComparator<FAQAnswer> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQAnswerException {
		return getPersistence()
				   .findByQ_A_PrevAndNext(id, questionid, approved,
			orderByComparator);
	}

	/**
	* Removes all the f a q answers where questionid = &#63; and approved = &#63; from the database.
	*
	* @param questionid the questionid
	* @param approved the approved
	*/
	public static void removeByQ_A(long questionid, boolean approved) {
		getPersistence().removeByQ_A(questionid, approved);
	}

	/**
	* Returns the number of f a q answers where questionid = &#63; and approved = &#63;.
	*
	* @param questionid the questionid
	* @param approved the approved
	* @return the number of matching f a q answers
	*/
	public static int countByQ_A(long questionid, boolean approved) {
		return getPersistence().countByQ_A(questionid, approved);
	}

	/**
	* Caches the f a q answer in the entity cache if it is enabled.
	*
	* @param faqAnswer the f a q answer
	*/
	public static void cacheResult(FAQAnswer faqAnswer) {
		getPersistence().cacheResult(faqAnswer);
	}

	/**
	* Caches the f a q answers in the entity cache if it is enabled.
	*
	* @param faqAnswers the f a q answers
	*/
	public static void cacheResult(List<FAQAnswer> faqAnswers) {
		getPersistence().cacheResult(faqAnswers);
	}

	/**
	* Creates a new f a q answer with the primary key. Does not add the f a q answer to the database.
	*
	* @param id the primary key for the new f a q answer
	* @return the new f a q answer
	*/
	public static FAQAnswer create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the f a q answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q answer
	* @return the f a q answer that was removed
	* @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	*/
	public static FAQAnswer remove(long id)
		throws vn.gov.hoabinh.exception.NoSuchFAQAnswerException {
		return getPersistence().remove(id);
	}

	public static FAQAnswer updateImpl(FAQAnswer faqAnswer) {
		return getPersistence().updateImpl(faqAnswer);
	}

	/**
	* Returns the f a q answer with the primary key or throws a {@link NoSuchFAQAnswerException} if it could not be found.
	*
	* @param id the primary key of the f a q answer
	* @return the f a q answer
	* @throws NoSuchFAQAnswerException if a f a q answer with the primary key could not be found
	*/
	public static FAQAnswer findByPrimaryKey(long id)
		throws vn.gov.hoabinh.exception.NoSuchFAQAnswerException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the f a q answer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the f a q answer
	* @return the f a q answer, or <code>null</code> if a f a q answer with the primary key could not be found
	*/
	public static FAQAnswer fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, FAQAnswer> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the f a q answers.
	*
	* @return the f a q answers
	*/
	public static List<FAQAnswer> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the f a q answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @return the range of f a q answers
	*/
	public static List<FAQAnswer> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the f a q answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of f a q answers
	*/
	public static List<FAQAnswer> findAll(int start, int end,
		OrderByComparator<FAQAnswer> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQAnswerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q answers
	* @param end the upper bound of the range of f a q answers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of f a q answers
	*/
	public static List<FAQAnswer> findAll(int start, int end,
		OrderByComparator<FAQAnswer> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the f a q answers from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of f a q answers.
	*
	* @return the number of f a q answers
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static FAQAnswerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FAQAnswerPersistence, FAQAnswerPersistence> _serviceTracker =
		ServiceTrackerFactory.open(FAQAnswerPersistence.class);
}