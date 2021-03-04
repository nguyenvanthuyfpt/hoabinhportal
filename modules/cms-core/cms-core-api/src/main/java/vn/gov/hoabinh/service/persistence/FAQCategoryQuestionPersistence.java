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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import vn.gov.hoabinh.exception.NoSuchFAQCategoryQuestionException;
import vn.gov.hoabinh.model.FAQCategoryQuestion;

/**
 * The persistence interface for the f a q category question service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see vn.gov.hoabinh.service.persistence.impl.FAQCategoryQuestionPersistenceImpl
 * @see FAQCategoryQuestionUtil
 * @generated
 */
@ProviderType
public interface FAQCategoryQuestionPersistence extends BasePersistence<FAQCategoryQuestion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FAQCategoryQuestionUtil} to access the f a q category question persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the f a q category questions where questionId = &#63;.
	*
	* @param questionId the question ID
	* @return the matching f a q category questions
	*/
	public java.util.List<FAQCategoryQuestion> findByQuestionId(long questionId);

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
	public java.util.List<FAQCategoryQuestion> findByQuestionId(
		long questionId, int start, int end);

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
	public java.util.List<FAQCategoryQuestion> findByQuestionId(
		long questionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator);

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
	public java.util.List<FAQCategoryQuestion> findByQuestionId(
		long questionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q category question in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category question
	* @throws NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	*/
	public FAQCategoryQuestion findByQuestionId_First(long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws NoSuchFAQCategoryQuestionException;

	/**
	* Returns the first f a q category question in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category question, or <code>null</code> if a matching f a q category question could not be found
	*/
	public FAQCategoryQuestion fetchByQuestionId_First(long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator);

	/**
	* Returns the last f a q category question in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category question
	* @throws NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	*/
	public FAQCategoryQuestion findByQuestionId_Last(long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws NoSuchFAQCategoryQuestionException;

	/**
	* Returns the last f a q category question in the ordered set where questionId = &#63;.
	*
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category question, or <code>null</code> if a matching f a q category question could not be found
	*/
	public FAQCategoryQuestion fetchByQuestionId_Last(long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator);

	/**
	* Returns the f a q category questions before and after the current f a q category question in the ordered set where questionId = &#63;.
	*
	* @param id the primary key of the current f a q category question
	* @param questionId the question ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q category question
	* @throws NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	*/
	public FAQCategoryQuestion[] findByQuestionId_PrevAndNext(long id,
		long questionId,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws NoSuchFAQCategoryQuestionException;

	/**
	* Removes all the f a q category questions where questionId = &#63; from the database.
	*
	* @param questionId the question ID
	*/
	public void removeByQuestionId(long questionId);

	/**
	* Returns the number of f a q category questions where questionId = &#63;.
	*
	* @param questionId the question ID
	* @return the number of matching f a q category questions
	*/
	public int countByQuestionId(long questionId);

	/**
	* Returns all the f a q category questions where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the matching f a q category questions
	*/
	public java.util.List<FAQCategoryQuestion> findByCategoryId(long categoryId);

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
	public java.util.List<FAQCategoryQuestion> findByCategoryId(
		long categoryId, int start, int end);

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
	public java.util.List<FAQCategoryQuestion> findByCategoryId(
		long categoryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator);

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
	public java.util.List<FAQCategoryQuestion> findByCategoryId(
		long categoryId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first f a q category question in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category question
	* @throws NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	*/
	public FAQCategoryQuestion findByCategoryId_First(long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws NoSuchFAQCategoryQuestionException;

	/**
	* Returns the first f a q category question in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching f a q category question, or <code>null</code> if a matching f a q category question could not be found
	*/
	public FAQCategoryQuestion fetchByCategoryId_First(long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator);

	/**
	* Returns the last f a q category question in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category question
	* @throws NoSuchFAQCategoryQuestionException if a matching f a q category question could not be found
	*/
	public FAQCategoryQuestion findByCategoryId_Last(long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws NoSuchFAQCategoryQuestionException;

	/**
	* Returns the last f a q category question in the ordered set where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching f a q category question, or <code>null</code> if a matching f a q category question could not be found
	*/
	public FAQCategoryQuestion fetchByCategoryId_Last(long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator);

	/**
	* Returns the f a q category questions before and after the current f a q category question in the ordered set where categoryId = &#63;.
	*
	* @param id the primary key of the current f a q category question
	* @param categoryId the category ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next f a q category question
	* @throws NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	*/
	public FAQCategoryQuestion[] findByCategoryId_PrevAndNext(long id,
		long categoryId,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator)
		throws NoSuchFAQCategoryQuestionException;

	/**
	* Removes all the f a q category questions where categoryId = &#63; from the database.
	*
	* @param categoryId the category ID
	*/
	public void removeByCategoryId(long categoryId);

	/**
	* Returns the number of f a q category questions where categoryId = &#63;.
	*
	* @param categoryId the category ID
	* @return the number of matching f a q category questions
	*/
	public int countByCategoryId(long categoryId);

	/**
	* Caches the f a q category question in the entity cache if it is enabled.
	*
	* @param faqCategoryQuestion the f a q category question
	*/
	public void cacheResult(FAQCategoryQuestion faqCategoryQuestion);

	/**
	* Caches the f a q category questions in the entity cache if it is enabled.
	*
	* @param faqCategoryQuestions the f a q category questions
	*/
	public void cacheResult(
		java.util.List<FAQCategoryQuestion> faqCategoryQuestions);

	/**
	* Creates a new f a q category question with the primary key. Does not add the f a q category question to the database.
	*
	* @param id the primary key for the new f a q category question
	* @return the new f a q category question
	*/
	public FAQCategoryQuestion create(long id);

	/**
	* Removes the f a q category question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the f a q category question
	* @return the f a q category question that was removed
	* @throws NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	*/
	public FAQCategoryQuestion remove(long id)
		throws NoSuchFAQCategoryQuestionException;

	public FAQCategoryQuestion updateImpl(
		FAQCategoryQuestion faqCategoryQuestion);

	/**
	* Returns the f a q category question with the primary key or throws a {@link NoSuchFAQCategoryQuestionException} if it could not be found.
	*
	* @param id the primary key of the f a q category question
	* @return the f a q category question
	* @throws NoSuchFAQCategoryQuestionException if a f a q category question with the primary key could not be found
	*/
	public FAQCategoryQuestion findByPrimaryKey(long id)
		throws NoSuchFAQCategoryQuestionException;

	/**
	* Returns the f a q category question with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the f a q category question
	* @return the f a q category question, or <code>null</code> if a f a q category question with the primary key could not be found
	*/
	public FAQCategoryQuestion fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, FAQCategoryQuestion> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the f a q category questions.
	*
	* @return the f a q category questions
	*/
	public java.util.List<FAQCategoryQuestion> findAll();

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
	public java.util.List<FAQCategoryQuestion> findAll(int start, int end);

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
	public java.util.List<FAQCategoryQuestion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator);

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
	public java.util.List<FAQCategoryQuestion> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FAQCategoryQuestion> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the f a q category questions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of f a q category questions.
	*
	* @return the number of f a q category questions
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}