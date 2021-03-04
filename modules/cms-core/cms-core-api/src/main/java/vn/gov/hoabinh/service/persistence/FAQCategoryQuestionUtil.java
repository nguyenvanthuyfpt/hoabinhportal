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

import vn.gov.hoabinh.model.FAQCategoryQuestion;

import java.util.List;

/**
 * The persistence utility for the f a q category question service. This utility wraps {@link vn.gov.hoabinh.service.persistence.impl.FAQCategoryQuestionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FAQCategoryQuestionPersistence
 * @see vn.gov.hoabinh.service.persistence.impl.FAQCategoryQuestionPersistenceImpl
 * @generated
 */
@ProviderType
public class FAQCategoryQuestionUtil {
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
	public static void clearCache(FAQCategoryQuestion faqCategoryQuestion) {
		getPersistence().clearCache(faqCategoryQuestion);
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
	public static List<FAQCategoryQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FAQCategoryQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FAQCategoryQuestion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FAQCategoryQuestion> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FAQCategoryQuestion update(
		FAQCategoryQuestion faqCategoryQuestion) {
		return getPersistence().update(faqCategoryQuestion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FAQCategoryQuestion update(
		FAQCategoryQuestion faqCategoryQuestion, ServiceContext serviceContext) {
		return getPersistence().update(faqCategoryQuestion, serviceContext);
	}

	/**
	* Returns all the f a q category questions where questionId = &#63;.
	*
	* @param questionId the question ID
	* @return the matching f a q category questions
	*/
	public static List<FAQCategoryQuestion> findByQuestionId(long questionId) {
		return getPersistence().findByQuestionId(questionId);
	}

	/**
	* Returns a range of all the f a q category questions where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionId the question ID
	* @param start the lower bound of the range of f a q category questions
	* @param end the upper bound of the range of f a q category questions (not inclusive)
	* @return the range of matching f a q category questions
	*/
	public static List<FAQCategoryQuestion> findByQuestionId(long questionId,
		int start, int end) {
		return getPersistence().findByQuestionId(questionId, start, end);
	}

	/**
	* Returns an ordered range of all the f a q category questions where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionId the question ID
	* @param start the lower bound of the range of f a q category questions
	* @param end the upper bound of the range of f a q category questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q category questions
	*/
	public static List<FAQCategoryQuestion> findByQuestionId(long questionId,
		int start, int end,
		OrderByComparator<FAQCategoryQuestion> orderByComparator) {
		return getPersistence()
				   .findByQuestionId(questionId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q category questions where questionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param questionId the question ID
	* @param start the lower bound of the range of f a q category questions
	* @param end the upper bound of the range of f a q category questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q category questions
	*/
	public static List<FAQCategoryQuestion> findByQuestionId(long questionId,
		int start, int end,
		OrderByComparator<FAQCategoryQuestion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByQuestionId(questionId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first f a q category question in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category question
	* @throws NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	*/
	public static FAQCategoryQuestion findByQuestionId_First(long questionId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryQuestionException {
		return getPersistence()
				   .findByQuestionId_First(questionId, orderByComparator);
	}

	/**
	* Returns the first f a q category question in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category question, or <code>null</code> if a matching f a q category question could not be found
	*/
	public static FAQCategoryQuestion fetchByQuestionId_First(long questionId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByQuestionId_First(questionId, orderByComparator);
	}

	/**
	* Returns the last f a q category question in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category question
	* @throws NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	*/
	public static FAQCategoryQuestion findByQuestionId_Last(long questionId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryQuestionException {
		return getPersistence()
				   .findByQuestionId_Last(questionId, orderByComparator);
	}

	/**
	* Returns the last f a q category question in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category question, or <code>null</code> if a matching f a q category question could not be found
	*/
	public static FAQCategoryQuestion fetchByQuestionId_Last(long questionId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByQuestionId_Last(questionId, orderByComparator);
	}

	/**
	* Returns the f a q category questions before and after the current f a q category question in the ordered set where questionId = &#63;.
	*
	* @param id the primary key of the current f a q category question
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q category question
	* @throws NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	*/
	public static FAQCategoryQuestion[] findByQuestionId_PrevAndNext(long id,
		long questionId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryQuestionException {
		return getPersistence()
				   .findByQuestionId_PrevAndNext(id, questionId,
			orderByComparator);
	}

	/**
	* Removes all the f a q category questions where questionId = &#63; from the database.
	*
	* @param questionId the question ID
	*/
	public static void removeByQuestionId(long questionId) {
		getPersistence().removeByQuestionId(questionId);
	}

	/**
	* Returns the number of f a q category questions where questionId = &#63;.
	*
	* @param questionId the question ID
	* @return the number of matching f a q category questions
	*/
	public static int countByQuestionId(long questionId) {
		return getPersistence().countByQuestionId(questionId);
	}

	/**
	* Returns all the f a q category questions where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the matching f a q category questions
	*/
	public static List<FAQCategoryQuestion> findByCategoryId(long categoryId) {
		return getPersistence().findByCategoryId(categoryId);
	}

	/**
	* Returns a range of all the f a q category questions where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of f a q category questions
	* @param end the upper bound of the range of f a q category questions (not inclusive)
	* @return the range of matching f a q category questions
	*/
	public static List<FAQCategoryQuestion> findByCategoryId(long categoryId,
		int start, int end) {
		return getPersistence().findByCategoryId(categoryId, start, end);
	}

	/**
	* Returns an ordered range of all the f a q category questions where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of f a q category questions
	* @param end the upper bound of the range of f a q category questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching f a q category questions
	*/
	public static List<FAQCategoryQuestion> findByCategoryId(long categoryId,
		int start, int end,
		OrderByComparator<FAQCategoryQuestion> orderByComparator) {
		return getPersistence()
				   .findByCategoryId(categoryId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q category questions where categoryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param categoryId the category ID
	* @param start the lower bound of the range of f a q category questions
	* @param end the upper bound of the range of f a q category questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching f a q category questions
	*/
	public static List<FAQCategoryQuestion> findByCategoryId(long categoryId,
		int start, int end,
		OrderByComparator<FAQCategoryQuestion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCategoryId(categoryId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first f a q category question in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category question
	* @throws NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	*/
	public static FAQCategoryQuestion findByCategoryId_First(long categoryId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryQuestionException {
		return getPersistence()
				   .findByCategoryId_First(categoryId, orderByComparator);
	}

	/**
	* Returns the first f a q category question in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category question, or <code>null</code> if a matching f a q category question could not be found
	*/
	public static FAQCategoryQuestion fetchByCategoryId_First(long categoryId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByCategoryId_First(categoryId, orderByComparator);
	}

	/**
	* Returns the last f a q category question in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category question
	* @throws NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	*/
	public static FAQCategoryQuestion findByCategoryId_Last(long categoryId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryQuestionException {
		return getPersistence()
				   .findByCategoryId_Last(categoryId, orderByComparator);
	}

	/**
	* Returns the last f a q category question in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category question, or <code>null</code> if a matching f a q category question could not be found
	*/
	public static FAQCategoryQuestion fetchByCategoryId_Last(long categoryId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator) {
		return getPersistence()
				   .fetchByCategoryId_Last(categoryId, orderByComparator);
	}

	/**
	* Returns the f a q category questions before and after the current f a q category question in the ordered set where categoryId = &#63;.
	*
	* @param id the primary key of the current f a q category question
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q category question
	* @throws NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	*/
	public static FAQCategoryQuestion[] findByCategoryId_PrevAndNext(long id,
		long categoryId,
		OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryQuestionException {
		return getPersistence()
				   .findByCategoryId_PrevAndNext(id, categoryId,
			orderByComparator);
	}

	/**
	* Removes all the f a q category questions where categoryId = &#63; from the database.
	*
	* @param categoryId the category ID
	*/
	public static void removeByCategoryId(long categoryId) {
		getPersistence().removeByCategoryId(categoryId);
	}

	/**
	* Returns the number of f a q category questions where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the number of matching f a q category questions
	*/
	public static int countByCategoryId(long categoryId) {
		return getPersistence().countByCategoryId(categoryId);
	}

	/**
	* Caches the f a q category question in the entity cache if it is enabled.
	*
	* @param faqCategoryQuestion the f a q category question
	*/
	public static void cacheResult(FAQCategoryQuestion faqCategoryQuestion) {
		getPersistence().cacheResult(faqCategoryQuestion);
	}

	/**
	* Caches the f a q category questions in the entity cache if it is enabled.
	*
	* @param faqCategoryQuestions the f a q category questions
	*/
	public static void cacheResult(
		List<FAQCategoryQuestion> faqCategoryQuestions) {
		getPersistence().cacheResult(faqCategoryQuestions);
	}

	/**
	* Creates a new f a q category question with the primary key. Does not add the f a q category question to the database.
	*
	* @param id the primary key for the new f a q category question
	* @return the new f a q category question
	*/
	public static FAQCategoryQuestion create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the f a q category question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q category question
	* @return the f a q category question that was removed
	* @throws NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	*/
	public static FAQCategoryQuestion remove(long id)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryQuestionException {
		return getPersistence().remove(id);
	}

	public static FAQCategoryQuestion updateImpl(
		FAQCategoryQuestion faqCategoryQuestion) {
		return getPersistence().updateImpl(faqCategoryQuestion);
	}

	/**
	* Returns the f a q category question with the primary key or throws a {@link NoSuchFAQCategoryQuestionException} if it could not be found.
	*
	* @param id the primary key of the f a q category question
	* @return the f a q category question
	* @throws NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	*/
	public static FAQCategoryQuestion findByPrimaryKey(long id)
		throws vn.gov.hoabinh.exception.NoSuchFAQCategoryQuestionException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the f a q category question with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the f a q category question
	* @return the f a q category question, or <code>null</code> if a f a q category question with the primary key could not be found
	*/
	public static FAQCategoryQuestion fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, FAQCategoryQuestion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the f a q category questions.
	*
	* @return the f a q category questions
	*/
	public static List<FAQCategoryQuestion> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the f a q category questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q category questions
	* @param end the upper bound of the range of f a q category questions (not inclusive)
	* @return the range of f a q category questions
	*/
	public static List<FAQCategoryQuestion> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the f a q category questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q category questions
	* @param end the upper bound of the range of f a q category questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of f a q category questions
	*/
	public static List<FAQCategoryQuestion> findAll(int start, int end,
		OrderByComparator<FAQCategoryQuestion> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the f a q category questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FAQCategoryQuestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of f a q category questions
	* @param end the upper bound of the range of f a q category questions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of f a q category questions
	*/
	public static List<FAQCategoryQuestion> findAll(int start, int end,
		OrderByComparator<FAQCategoryQuestion> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the f a q category questions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of f a q category questions.
	*
	* @return the number of f a q category questions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static FAQCategoryQuestionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FAQCategoryQuestionPersistence, FAQCategoryQuestionPersistence> _serviceTracker =
		ServiceTrackerFactory.open(FAQCategoryQuestionPersistence.class);
}